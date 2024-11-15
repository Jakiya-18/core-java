public class Problems{
    public static void main(String [] args){

        int [] marks = {77,73,72,79,79,96,92,79,72,65,25};

        int value = findOcuurance(marks, 79);
        System.out.println("Count is :" + value);

        int [] number = {77,73,72,79,79,96,92,79,72,65,25};
         sumOfNumber(number);
    }

    public static int findOcuurance(int[] array, int input){
        
        int count = 0;

        for(int i =0; i< array.length; i++){

            if (array[i] == input){
                count++;
            }
        }
       return count;
    }

    public static int sumOfNumber(int[] array){
        int total = 0;
        for (int i =0; i<array.length; i++){
            total = total + array[i];

        }
        System.out.println("Sum of array :" + total);
        return total;
    }
}