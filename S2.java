


public class S2 
{
         

      private static Boolean binarySearch(int [] arr, int low, int high , int key )

      {

            // calculating the mid value 

            int mid =(low+high)/2;

            // the base case 

            if(low>high)
            {
              return false;
            }

            // checking the mid side 

            if (arr[mid]==key)
            {
              return  true;
            }

            // checking on the left side 

            if (key<arr[mid])
            {
            
              return binarySearch (arr,low,mid-1,key);
            }

            else
            {

                   return binarySearch(arr,mid+1,high,key);
            }




            

      }


      public static void main(String[] args)
       {
       

              int[]arr={2,5,56,34,56,30};

              if (binarySearch(arr, 0,(arr.length-1), 30))
              {
                     System.out.println("Element Found");
              }
              else
              {
                     System.out.println("Element not found ");
              }

              
      }

}
