public class ReturnType{
    public static void main(String [] args){

        System.out.println(myName("name"));

        int result = compareNumber(5 , 10);
        System.out.println("The greatest number in x and y is : " + result);

        instagramId("JAKIYA", 21 , 'F', 38.99d);

    }

    public static String myName(String name){
        
        return ("jakiya banu");
    }
    
    public static int compareNumber(int x, int y){
        
        if(x > y)
        return x;
        else 
        return y;

    }

    public static boolean instagramId(String name, int age, char gender, double value){
        if (name!= null){
            if (age > 18){
                 System.out.println("NAME :" +name+ "," + "AGE :" +age+ "," + "GENDER :" +gender+ "," + "USER'S IN KARNATAKA :" +value);
                 return true;
            }
            System.out.println("Age is invalid");
            return false;
        }
        System.out.println("Plz enter the name");
        return false;
    }
}