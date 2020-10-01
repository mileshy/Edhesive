import java.util.Scanner;
import java.util.Math;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int length;
        do
        {
            System.out.println("Enter an array length (must be 10 or greater):");
            length = scan.nextInt();
            System.out.println();
        } while(length < 10);
        
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        
        System.out.print("First Array:");
        for(int i = 0; i < length; i++)
        {
            arr1[i] = (int)(Math.random() * 100) + 1;
            System.out.print(" " + arr1[i]);
        }
        
        System.out.print("\n\nSecond Array:");
        for(int i = 0; i < length; i++)
        {
            arr2[i] = (int)(Math.random() * 100) + 1;
            System.out.print(" " + arr2[i]);
        }
        
        int[] merged = new int[2 * length + 1];
        for(int i = 0, j = 0; i < 2 * length; i++)
        {
            if(i % 2 == 0)
            {
                if(!contains(merged, arr1[i / 2]))
                {
                    merged[j] = arr1[i / 2];
                    j++;
                }
            }
            else
            {
                if(!contains(merged, arr2[i / 2]))
                {
                    merged[j] = arr2[i / 2];
                    j++;
                }
            }
        }
        
        System.out.print("\n\nMerged Array:");
        for(int i = 0; merged[i] != 0; i++)
        {
            System.out.print(" " + merged[i]);
        }
    }
    
    static boolean contains(int[] arr, int elem)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == elem) return true;
        }
        return false;
    }
}
