import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class ArrayRefresher
{
    public static void main(String[] args)
    {

    }

    /**
     * Swap two integers without using a placeholder variable
     * 
     * @param a first integer
     * @param b second integer
     */
    public static void swapWithoutPlaceholder(int a, int b)
    {
        System.out.printf("Values before swap: a = %d | b = %d\n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("Values after swap: a = %d | b = %d", a, b);
    }

    /**
     * Find the missing number in an array from 1 to 100 (assume sorted)
     * 
     * @param arr an array from 1 to 100
     * @return the missing number or -1
     */
    public static int findMissingNumber(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                return i + 1;
            }
        }

        return -1;
    }

    /**
     * Finds the duplicate element in an array
     * 
     * @param arr an array of ints
     * @return the value of the duplicate element, or -1 if no duplicates
     */
    public static int findDuplicate(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                return arr[i];
            }
            
            map.put(arr[i], arr[i]);
        }

        return -1;
    }

    /**
     * Finds the duplicate element(s) in an array
     * 
     * @param arr an array of ints
     * @return an array containing the value of the duplicate element(s), or [-1] if no duplicates
     */
    public static List<Integer> findDuplicates(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                list.add(arr[i]);
            }
            else
            {
                map.put(arr[i], arr[i]);
            }
        }

        if (list.isEmpty())
        {
            return list;
        }

        return list;
    }

    /**
     * Finds the minimum and maximum values in an array
     * 
     * @param arr an array of ints
     * @return a two element array ([<min>, <max>]) or [<min>] if min == max
     */
    public static int[] findMinMax(int[] arr)
    {
        int min = arr[0];
        int max = min;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            else if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        if (min == max)
        {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    /**
     * Find all pairs of array elements that equal a specified sum
     * 
     * @param sum the sum that pairs should equal
     * @param arr an array of ints
     * @return a List of int arrays in the form [pairIndex1, pairIndex2]
     *         or an empty List if no pairs were found
     */
    public static List<int[]> findPairs(int sum, int[] arr)
    {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (i == j)
                {
                    continue;
                }

                if (arr[i] + arr[j] == sum)
                {
                    list.add(new int[]{i, j});
                }
            }
        }

        return list;
    }

    /**
     * Reverses an array in-place (no other data structure needed)
     * 
     * @param arr an array of ints
     * @return the reversed array
     */
    public static int[] reverseInPlace(int[] arr)
    {
        int high = arr.length - 1;
        int temp = 0;

        boolean even = (arr.length % 2 == 0) ? true : false;

        for (int i = 0; i < arr.length; i++)
        {
            temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;

            if (even)
            {
                if (i == (arr.length / 2) - 1)
                {
                    break;
                }
                
                --high;
                continue;
            }
            else if (i == Math.floor(arr.length / 2))
            {
                break;
            }

            --high;
        }

        return arr;
    }
}