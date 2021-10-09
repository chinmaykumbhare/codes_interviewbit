/**
 * You're given a read only array of n integers. 
 * Find out if any integer occurs more than n/3 times i
 * n the array in linear time and constant additional 
 * space.
 * If so, return the integer. If not, return -1.
 * If there are multiple solutions, return any one.
 * Example:
 * Input: [1 2 3 1 1]
 * Output: 1 
 * 1 occurs 3 times which is more than 5/3 times.
 */

import java.io.*;
import java.util.*;

class RepeatNumber {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of elements:");

        int length = 0;

        try {

            length = Integer.parseInt(br.readLine());

        } catch (IOException e) {

            e.printStackTrace();

        }
        
        int[] arr = new int[length];
        int[] satisfy = new int[length];

        System.out.println("Enter the array elements seperated by a space:");

        StringTokenizer st = new StringTokenizer("");

        try {

            st = new StringTokenizer(br.readLine());

        } catch (IOException e) {

            e.printStackTrace();
        }


        for(int loop = 0; loop < arr.length; loop++) {

            arr[loop] = Integer.parseInt(st.nextToken());

        }

        int count = (length / 3);

        System.out.println("Eligible elements:");

        int cnt = 0;

        for(int outer = 0; outer < arr.length; outer++) {

            int flag = 0;

            for(int inner = 0; inner < arr.length; inner++) {

                if(arr[outer] == arr[inner]) flag++;

            }

            if((count == 1) ? flag >= count+1 : flag >= count) {

                satisfy[cnt] = arr[outer];

                cnt++;

            }

        }

        //remove duplicates

        LinkedHashSet<Integer> solution = new LinkedHashSet<>();

        for(int loop = 0; loop < cnt; loop++) {

            solution.add(satisfy[loop]);

        }

        System.out.println(solution);

    }

}