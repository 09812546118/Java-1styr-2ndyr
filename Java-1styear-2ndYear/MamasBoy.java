import java.util.*;
public class MamasBoy {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int size = 0;
        
        System.out.print("Enter the number of moms and children: ");
        size = Integer.parseInt(in.nextLine());
        int[] inputArray = new int[size];
        
        String input = in.nextLine();
        String[] inputSplit = input.split(" ");
        
        for (int index = 0; index < inputSplit.length; index++)
            inputArray[index] = Integer.parseInt(inputSplit[index]);

        int[] resultArray = new int[size];
        int childIndex = 0, momIndex = 1, index = 0;

        while (index < inputArray.length) {
            if (index % 2 == 0) {
                resultArray[index] = inputArray[childIndex];
                childIndex++;
            } else {
                resultArray[index] = inputArray[inputArray.length - momIndex];
                momIndex++;
            }
            index++;
        }
        
        System.out.println("Arranged moms and children: ");
        for (int current: resultArray) {
            System.out.print(current + " ");
        }
    }
}