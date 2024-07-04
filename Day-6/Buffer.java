class Buffer {
    public static void main(String[] args){
        StringBuffer br=new StringBuffer();
        System.out.println(br);
        System.out.println(br.hashCode());
        System.out.println(br.capacity());
        br.append("user");
        System.out.println(br);
        br.append("user u user u user u user u user u user u user u user u ");
        System.out.println(br);
        System.out.println(br.hashCode());
        System.out.println(br.capacity());
        br.append(3.40);
        System.out.println(br);
        br.append("uuuuussssssuuuuuussssuuu");
        System.out.println(br);
        System.out.println(br.length());
        br.replace(0,3,"vignesh");
        System.out.println(br);
        br.insert(3,"5");
        System.out.println(br);
        System.out.println(br.reverse());
        br.delete(2,4);
        System.out.println(br);
        br.charAt('8');
        System.out.println(br);
        br.setLength(0);
        System.out.println(br);



    }

}