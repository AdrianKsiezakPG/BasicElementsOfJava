package pl.ksiezak.adrian.java.recap.jdbc;

import java.sql.*;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static java.util.Optional.empty;

public class AnimalDao {

    Scanner scanner = new Scanner(System.in);

    public List<Test> listTryWithResources() {
        //schetamt korzystania z JDBC
        //1) Connection
        //2) Statement/PreparedStatement
        //3) ResultSet
//        Connection connection = null;
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST;");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//            if(connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            }
//        }
        return null;
    }

    public void list() {
        //schetamt korzystania z JDBC
        //1) Connection
        //2) Statement/PreparedStatement
        //3) ResultSet
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST ORDER BY ID;");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public void create(Element element) {

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO TEST (ID,NAME) VALUES (?,?);");){
                 preparedStatement.setInt(1,element.getNumer());
                 preparedStatement.setString(2,element.getName());
                 preparedStatement.execute();

//             PreparedStatement statement = (PreparedStatement) connection.createStatement();) {
//            System.out.println("Give me number: ");
//            int a = scanner.nextInt();
//            System.out.println("Give me name: ");
//            String b = scanner.nextLine();
//            ResultSet resultSetMain = statement.executeQuery("INSERT INTO TEST (ID,NAME) VALUES (a,b);");
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST;");
//            while (resultSet.next()) {
//                int id = resultSet.getInt("ID");
//                String name = resultSet.getString("NAME");
//                System.out.println("ID: " + id);
//                System.out.println("NAME: " + name);
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Test read(int readId) {

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT NAME FROM TEST WHERE ID = ?;");){
            preparedStatement.setInt(1,readId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                Test readTest = new Test(id,name);
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
                return readTest;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
//        return Optional.empty();
    }

    public void update(int id, String name) {

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE TEST SET ID = ?  WHERE NAME = ?;");){
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(int id) {

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM TEST WHERE ID =?;");){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery("SELECT * FROM TEST;");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
// TODO: 20/04/2022 Na podstawie poprawionej metody create uzupelnij metode read update oraz delete
// metoda create przyjmuje classe/obiekt zamiast dwoch parametrow

// TODO: 27/04/2022 zaimplementuj metode  listTryWithResources tak aby zwracala List<Test>