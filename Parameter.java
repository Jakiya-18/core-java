public class Parameter{
    public static void main(String [] args){

        googleColor("BLUE");

        chemicalsName("Copper", "Sulphate");
        chemicalsName("Sodium", "hydroxide");

        patientdetail("JAKIYA", 21 , 9972652838l);
        patientdetail("KEERTHI", 21, 6361002977l);
        patientdetail("VANITHA", 22, 8197029445l);

        userName("jakiya", 'F', 37.04d, 200000000l);
        
    }
    public static void googleColor(String name){                                                  //ONE PARAMETER

        System.out.println(name + " : Represents Trust, professionalism, Authority, Power and Loyality");
    
    }

    public static void chemicalsName(String elementOne ,String elementTwo){                         //TWO PARAMETER

        System.out.println(elementOne + " " + elementTwo);                    

    }

    public static void patientdetail(String name, int age , long phno){                             //THREE PARAMETER

        System.out.println("NAME :" + name +", " + "AGE :" + age + ", "+ "PHONE NUMBER :" +phno);

    }

    public static void userName(String user, char gender, double value , long number){               //FOUR PARAMETER
  
        System.out.println("NAME : " + user + "," +  "Gender : " + gender + "," + "Percentage :" + value + "," + "Users in Karnataka : " + number);
    }
    
}