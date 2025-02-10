import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for (Integer integer : L) {
            sum += integer;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evenL = new ArrayList<Integer>();
        int length = L.size();
        for(int i = 1; i < length; i+=2){
//            if(L.get(i)/2 == (L.get(i)+1)/2)
//                evenL.add(L.get(i));
            evenL.add(L.get(i));
        }
        return evenL;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function
        List <Integer> output = new ArrayList<Integer>();
        for (Integer integer : L1) {
            if (L2.contains(integer))
                output.add(integer);
        }
        return output;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function
        int count = 0;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c)
                    count++;
            }
        }
        return count;
    }
}
