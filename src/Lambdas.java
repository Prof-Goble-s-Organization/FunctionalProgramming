import java.util.ArrayList;
import java.util.stream.IntStream;

public class Lambdas {
    public static void main(String[] args) {
        printSquares(0, 100);
        printEvenIntegers(0,100);
		squareOfIntegers(0,10);
		sumOfCubes(0,10);
		System.out.println(factors(12));
		factorsParallelStream(12);
    }

    /**
     * Complete the function below so that it prints the 
     * squares of integers between start and end.  
     * 
     * @param start
     * @param end
     */
    public static void printSquares(int start, int end) {
        IntStream.range(start, end)
                .map( /* fill this in */ )
                .forEach(/* fill this in */);
    }

    /**
     * Write the code to find all even integers between start and end (inclusive) 
     * using a Stream, filter, and a lambda function. 
     * Your function should print out the results.  
     * 
     * @param start
     * @param end
     */
    public static void printEvenIntegers(int start, int end) {
		
	}
	
    /**
     * Write the code to compute the squares of all integers between start and 
     * end (inclusive) using a Stream, map, and a lambda function.   
     * Your function should print out the results.  
     * @param start
     * @param end
     */
	public static void squareOfIntegers(int start, int end) {
		
	}
	
    /**
     * Write the code to find the sum of cubes from start to end 
     * using map and reduce. 
     * @param start
     * @param end
     */
	public static void sumOfCubes(int start, int end) {
		
	}
	
	
    /**
     * Write a function to find all divisors of an input number and return 
     * the results as an ArrayList.  You can assume that the input is an 
     * integer greater than 0. 
     * @param i
     * @return
     */
	public static ArrayList<Integer> factors(int i){
		
		return null;

	}
	
    /**
     * This should be a copy of factors but uses ParallelStream instead of Stream
     * @param i
     */
	public static void factorsParallelStream(int i){
		
	}
}
