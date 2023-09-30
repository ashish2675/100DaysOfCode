//Right to left
//class leadersInArray
//{
//    void printLeaders(int arr[], int size)
//    {
//        for (int i = 0; i < size; i++)
//        {
//            int j;
//            for (j = i + 1; j < size; j++)
//            {
//                if (arr[i] <=arr[j])
//                    break;
//            }
//            if (j == size)
//                System.out.print(arr[i] + " ");
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        leadersInArray lead = new leadersInArray();
//        int arr[] = new int[]{10, 4, 5, 9, 1};
//        int n = arr.length;
//        lead.printLeaders(arr, n);
//    }
//}
//


// Left to right
class leadersInArray
{

    void printLeaders(int arr[], int size)
    {
        int max_from_right = arr[size-1];


        System.out.print(max_from_right + " ");

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        leadersInArray lead = new leadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}

