import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] array;
    public static void main(String[] args) throws Exception {
       	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());

		System.out.println((double)Integer.parseInt(st.nextToken())/(double)Integer.parseInt(st.nextToken()));
    }
}