public class BOJ_5522 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for(int i=0; i<5; i++) {
            String num = br.readLine();
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
        br.close();
    }
}