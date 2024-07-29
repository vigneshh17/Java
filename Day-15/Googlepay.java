class Googlepay implements UPI {

    @Override
    public void sendmoney() {
    System.out.println("Sending money using Gpay");
    }

    @Override
    public void receivemoney() {
    System.out.println("receive money using Phonepay");
    }
}
