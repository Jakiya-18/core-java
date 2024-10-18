public class Method{
    public static void main (String []args){
        collectMoney();
        collectMoney();

        multiplication();

        sayhellow();

        sub();
    }
    public static void collectMoney(){
        System.out.println("money collected");
        System.out.println("money has been credited");
    }
    public static void multiplication(){
        int value1 = 50;
        int value2 = 20;
        System.out.println(value1*value2);
    }
    public static void sayhellow(){
        System.out.println("hellow jakiya");
    }
    public static void sub(){
        int value1 = 50;
        int value2 = 20;
        System.out.println(value1-value2);
    }
}