import java.util.Random;

public class Lab2 {


    public static void main(String[] args) {
        byte[][] matrix1 = new byte[4][2];
        byte[][] matrix2 = new byte[2][4];
        generateRandomMatrix(matrix1);
        System.out.println();
        generateRandomMatrix(matrix2);
        System.out.println();
        byte[][] matrix3 = straightAmount(matrix1, matrix2);
        System.out.println();
        matrixAction(matrix3);

    }
    public static byte[][] straightAmount(byte[][] matrix1, byte[][] matrix2){
        int width = matrix1.length + matrix2.length;
        int height =matrix1[0].length + matrix2[0].length;
        byte[][] neededMatrix = new byte[width][height];

        for(int i = 0; i < width; i++){
            for(int j = 0; j< height; j++){
                if(i < matrix1.length && j<matrix1[0].length){
                    neededMatrix[i][j] = matrix1[i][j];
                }
                else if(i >= matrix1.length && j>=matrix1[0].length){
                    neededMatrix[i][j] = matrix2[i-matrix1.length][j-matrix1[0].length];
                }
                else{
                    neededMatrix[i][j] = 0;
                }
                System.out.format("%3d",neededMatrix[i][j]);
            }
            System.out.println();
        }
        return neededMatrix;
    }
    public static void matrixAction(byte[][] matrix){
        byte maxInOddRows[] = new byte[matrix.length];
        byte maxInEvenRows[] = new byte[matrix.length];

        byte sumInOddRows = 0;
        byte sumInEvenRows = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i % 2 == 0){
                    maxInEvenRows[i] = (byte)Math.max(maxInEvenRows[i], matrix[i][j]);
                }
                else{
                    maxInOddRows[i] = (byte)Math.max(maxInOddRows[i], matrix[i][j]);
                }
            }
        }
        sumInOddRows = sum(maxInOddRows);
        sumInEvenRows = sum(maxInEvenRows);
        System.out.println("Sum of max elements in odd rows: " + sumInOddRows);
        System.out.println("Sum of max elements in even rows: " + sumInEvenRows);
    }

    public static byte sum(byte[] array){
        byte sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void generateRandomMatrix(byte[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (byte)(random.nextInt(10));
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}