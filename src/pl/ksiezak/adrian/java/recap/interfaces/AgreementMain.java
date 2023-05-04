package pl.ksiezak.adrian.java.recap.interfaces;

public class AgreementMain {
    public static void main(String[] args) {
        Agreement agreement = new Agreement() {
            @Override
            public void read() {

            }
        };
        Agreement plusAgreement = new PlusAgreement();
        plusAgreement.read();
    }
}
