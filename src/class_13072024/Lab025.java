package class_13072024;

public class Lab025 {
    public static void main(String[] args) {
        // Concatination.

        byte a =10;
        byte b=15;

        System.out.println(a+b);

        String s1="Harshal";
        String s2="Attarde";
        System.out.println(s1+s2);//This will concate each other appeand each other op will be harshalAttarde

        String s3="Parth";
        int x=99;
        int  y=100;

        System.out.println(x+y);//199

        System.out.println(x+s3);//99Parth
        System.out.println(s3+y);//Parth100
        System.out.println(x+y+s3);
        System.out.println(s3+x+y);
        System.out.println(x+s3+y);
        System.out.println(x+y+s3+y+s3+x+y);//199+parth100+99+100
    }
}
