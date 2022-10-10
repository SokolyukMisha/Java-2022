public class Lab1 {
        public static int Calculation(int a, int b, int n, int m){

            if(a <=2){
                System.out.println("Dividing by zero error");
                return 0;
            }
            if(n < a || m < b) {
                System.out.println("Invalid argument");
                return 0;
            }

            int sum = 0;
            for(short i = (short) a; i <= n; i++){
                for(short j = (short)b; j<= m; j++){
                    sum += (i+j)/(i-2);
                }
            }
            return sum;
        }

        public static void main(String[] arg){
            int result = Calculation(2, 3, 5, 6);
            System.out.println(result);
        }
}