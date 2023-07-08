import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
       	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());

        System.out.println("1번 라인에 입력 받은 값 - 1: "+st.nextToken());
        System.out.println("1번 라인에 입력 받은 값 - 2: "+st.nextToken());

        st=new StringTokenizer(br.readLine());

        System.out.println("2번 라인에 입력 받은 값 - 1: "+st.nextToken());
        System.out.println("2번 라인에 입력 받은 값 - 2: "+st.nextToken());
    }
}