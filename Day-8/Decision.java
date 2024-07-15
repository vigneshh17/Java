class Decision {
    public static void main(String[] args){
        int age =20;
        String gender ="Male";
        String martialStatus ="Unmarried";
        if (age > 18){
           if (gender.equals("Male")) {
               if (martialStatus.equals("Unmarried")) {
                   System.out.println("Register");
               } else {
                   System.out.println("Already married");
               }
           } else {
               System.out.println("RegisteronlyforMale");
           }
        }
        else {
            System.out.println("minor");
        }

    }
}
