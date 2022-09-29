package Learning;

public class Big_O {

    public static void log(int[] numbers, String [] names){
//        O(1) Means constant time
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
        // O(n) means size of input. Grows Liner
//        System.out.println();//O(1)
        //O(n+m) || O(n)
        for(int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);//O(n)
        }
            for (int i = 0; i < names.length; i++)  //O(m)
                System.out.println(names[i]);
            System.out.println();//O(1)

//
        //O(n^2) Quadratic. Runs slower then linear with larger input

        //O(n + n^2) || O(n^2)
        for (int number : numbers) //O(n)
            System.out.println(number);

        for(int first: numbers)//O(n)
            for(int second :numbers)//O(n)
                System.out.println(first +","+ second);
// O(n ^3) Slower then O(n^2)
        for(int first: numbers)//O(n)
            for(int second :numbers)//O(n)
                for(int third:numbers)//O(n)
                System.out.println(first +","+ second);

        //Logarithmic curve slows down at some point. Logarithimic is more efficient
    //scalable then linear and quadratic O(log n)

        //Binary search start from the middle of the array. Compares the value looked
        //and eliminates half the results then starts again from the half way point


        //exponential growth  is not scaleable. Is the opposite and grows faster than
        //Logarithmic curves. Very slow O(2^n)


    }
    public void greet(String [] names){
        //O(n) Space
        String[] copy = new String[names.length];
        //O(1) Space
        for(int i=1; i< names.length; i++){//O(n)
            System.out.println("Hi"+ names[i]);
        }
    }
}
