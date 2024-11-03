public class ReturnType{
    public static void main(String [] args){

        System.out.println(myName("name"));

        int result = compareNumber(5 , 10);
        System.out.println("The greatest number in x and y is : " + result);

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
}