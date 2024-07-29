class PaymentApps {
    public static void main (String[] Args){
    Googlepay gpay= new Googlepay();
    gpay.sendmoney();
    gpay.receivemoney();
    Phonepay phonepay= new Phonepay();
    phonepay.sendmoney();
    phonepay.receivemoney();
    }
}
