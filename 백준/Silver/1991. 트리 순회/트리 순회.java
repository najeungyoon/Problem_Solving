import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int[] left;
    static int[] right;


    static void preOrder(int root){
        if(root+'A'=='.'){
            return;
        }

        char node = (char) (root+'A');
        System.out.print(node);
        preOrder(left[root]);
        preOrder(right[root]);
    }

    static void inOrder(int root){
        if(root+'A'=='.'){
            return;
        }

        char node = (char) (root+'A');
        inOrder(left[root]);
        System.out.print(node);
        inOrder(right[root]);
    }

    static void postOrder(int root){
        if(root+'A'=='.'){
            return;
        }

        char node = (char) (root+'A');
        postOrder(left[root]);
        postOrder(right[root]);
        System.out.print(node);
    }

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        left = new int[n];
        right = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int node = st.nextToken().charAt(0)-'A';
            int l_child = st.nextToken().charAt(0)-'A';
            int r_child = st.nextToken().charAt(0)-'A';

            left[node] = l_child;
            right[node] = r_child;
        }


        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
    }
}