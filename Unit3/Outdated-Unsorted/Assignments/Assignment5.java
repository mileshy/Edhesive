class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How long do you want the array?");
        int length = scan.nextInt();
        
        if(length <= 0)
        {
            System.out.println("Not a valid length!");
            return;
        }
        double[] arr = new double[length];
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter a number");
            arr[i] = scan.nextDouble();
        }
        
        System.out.print("Your array is {");
        for(int i = 0; i < length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "}");
        
        double sum = 0;
        for(int i = 0; i < length; i++)
        {
            sum += arr[i];
        }
        System.out.println("The average is " + (sum / length));
        
        double min = arr[0];
        double max = arr[0];
        for(int i = 1; i < length; i++)
        {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("The range is " + (max - min));
        
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0; i < length - 1; i++)
        {
            if(arr[i] > arr[i + 1]) increasing = false;
            if(arr[i] < arr[i + 1]) decreasing = false;
        }
        System.out.println("The array is " + (increasing ? "sorted in increasing order" : (decreasing ? "sorted in decreasing order" : "unsorted")));
    }
}
