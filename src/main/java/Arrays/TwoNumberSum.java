package Arrays;

public class TwoNumberSum {

    public static void main(String[] args){

        System.out.println(twoNumSum(new int[] {3, 5, -4, 8, 11, -1, 6}, 10));
    }

    public static int[] twoNumSum(int[] array, int targetSum){
        for (int i = 0; i < array.length - 1; i++){
            int firstVal = array[i];
            for (int j = i + 1; j < array.length; j++){
                int secondVal = array[j];
                if (firstVal + secondVal == targetSum){
                    return new int[] {firstVal, secondVal};
                }
            }
        }
        return new int[0];
    }

}
