public class SummativeSums {
    public static void main(String[] args) {
        arrayCalc(); //call the array calculating method



    }
    public static void arrayCalc(){
        int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 }; // Create 3 arrays to store
        int [] array2 = { 999, -60, -77, 14, 160, 301 };
        int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        //3 tracking variables for all 3 arrays
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        //Loop through each array and add the numbers
        for(int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
        for(int j = 0; j < array2.length; j++) {
            sum1 += array2[j];
        }
        for(int k = 0; k < array3.length; k++){
            sum2 += array3[k];
        }

        //print the totals
        System.out.println("Array 1 has a total of: " + sum);
        System.out.println("Array 1 has a total of: " + sum1);
        System.out.println("Array 1 has a total of: " + sum2);
        //Time Complexity O(N^3) :(
    }
}
