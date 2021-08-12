public class GetLargestNumber {


    public  static void main(String[] args) {

        int largestFromFirst = getLargestElement(new int [] {1 , 2, 3, 4, 5});
        int largestFromSecond = getLargestElement(new int [] {300, 240, 550, 129});
        System.out.println( largestFromFirst);
        System.out.println( largestFromSecond);
        boolean isLargestFromSecondIsEven = isLargestElementEven(new int [] {300, 240, 550, 129});
        System.out.println(isLargestFromSecondIsEven);


    }


    public static int getLargestElement( int [] arrayOfNumbers){
        int largestElement  = 0;
        for(int i = 0; i < arrayOfNumbers.length; i++){
            if(arrayOfNumbers[i] > largestElement) {
            largestElement = arrayOfNumbers[i];
            }
        }
        return largestElement;
    }

    public static boolean isLargestElementEven(int [] arrayOfNumbers){
        return getLargestElement(arrayOfNumbers) % 2 == 0;
    }
}
