public class ArrayLoops{
    
    public static void main(String[] args){

        int [] marks = {125, 85, 88, 80, 66, 92, 72, 69, 54, 67};

        System.out.println("------RIGHT TO LEFT------");
        for (int i = 0; i<9; i++){
            System.out.println(marks[i]);
        }
        
        System.out.println("------LEFT TO RIGHT------");

        for (int i = 9; i >= 0; i--){
            System.out.println(marks[i]);
        }

        System.out.println("------MIDDLE TO LEFT------");
        for (int i = 4; i >= 0; i--){
            System.out.println(marks[i]);
        }

        System.out.println("------LEFT TO MIDDLE------");
        for (int i = 0; i<4; i++){
            System.out.println(marks[i]);
        }

        System.out.println("------SKIPPING ONE ELEMENT------");
        for (int i = 0; i<9; i = i+2){
            System.out.println(marks[i]);
        }


        System.out.println("---------------------------------");

        char [] sections = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        for (int i = 0; i<7; i++){
            System.out.println(sections[i]);               //RIGHT TO LEFT
        }
        for (int i = 7; i>=0; i--){
            System.out.println(sections[i]);               //LEFT TO RIGHT
        }
        for (int i = 4; i>=0; i--){
            System.out.println(sections[i]);               //MIDDLE TO LEFT
        }
        for (int i = 0; i<4; i++){
            System.out.println(sections[i]);               //LEFT TO MIDDLE
        }
        for (int i = 0; i<7; i= i+2){
            System.out.println(sections[i]);               //SKIPPING ONE ELEMENT
        }

        System.out.println("---------------------------------");

        long [] otp = {452155l, 246974l, 795466l, 784512l, 326598l, 159357l, 456321l, 658932l};

        for (int i = 0; i<7; i++){
            System.out.println(otp[i]);               //RIGHT TO LEFT
        }
        for (int i = 7; i>=0; i--){
            System.out.println(otp[i]);               //LEFT TO RIGHT
        }
        for (int i = 4; i>=0; i--){
            System.out.println(otp[i]);               //MIDDLE TO LEFT
        }
        for (int i = 0; i<4; i++){
            System.out.println(otp[i]);               //LEFT TO MIDDLE
        }
        for (int i = 0; i<7; i= i+2){
            System.out.println(otp[i]);               //SKIPPING ONE ELEMENT
        }

        System.out.println("---------------------------------");

        float [] temperature = {94.5f, 95f, 95.1f, 96.9f, 97f, 98.6f, 100.4f, 103.9f};

        for (int i = 0; i<7; i++){
            System.out.println(temperature[i]);               //RIGHT TO LEFT
        }
        for (int i = 7; i>=0; i--){
            System.out.println(temperature[i]);               //LEFT TO RIGHT
        }
        for (int i = 4; i>=0; i--){
            System.out.println(temperature[i]);               //MIDDLE TO LEFT
        }
        for (int i = 0; i<4; i++){
            System.out.println(temperature[i]);               //LEFT TO MIDDLE
        }
        for (int i = 0; i<7; i= i+2){
            System.out.println(temperature[i]);               //SKIPPING ONE ELEMENT
        }

        System.out.println("---------------------------------");

        short [] genZYears = {2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007};

        for (int i = 0; i<7; i++){
            System.out.println(genZYears[i]);               //RIGHT TO LEFT
        }
        for (int i = 7; i>=0; i--){
            System.out.println(genZYears[i]);               //LEFT TO RIGHT
        }
        for (int i = 4; i>=0; i--){
            System.out.println(genZYears[i]);               //MIDDLE TO LEFT
        }
        for (int i = 0; i<4; i++){
            System.out.println(genZYears[i]);               //LEFT TO MIDDLE
        }
        for (int i = 0; i<7; i= i+2){
            System.out.println(genZYears[i]);               //SKIPPING ONE ELEMENT
        }

        System.out.println("---------------------------------");

    
    }
}