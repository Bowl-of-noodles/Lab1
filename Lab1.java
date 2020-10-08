package edu.itmo;

public class Main {
    private static final float max = 13.0f;
    private static final float min = -3.0f;
    private static int[] d = new int[8];
    private static float[] x = new float[16];

    public static void main(String[] args) {

        double [][] d = new double[8][16];
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d[i].length; j++){
                switch(oddArray(i)){
                    case 19:
                        d[i][j] = Math.sin(Math.tan(floatArray(j) / Math.PI));
                        break;
                    case 7:
                    case 11:
                    case 13:
                    case 15:
                        d[i][j] = Math.asin(Math.pow((0.25*(floatArray(j)+5)/16), 2));
                        break;
                    default:
                        d[i][j] = Math.atan(Math.cos(Math.tan(Math.pow(
                                  Math.atan((floatArray(j)+5)/16)* (Math.tan(floatArray(j)+1)), 2))));
                }
                System.out.printf("%.5f", d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }


    }

    private static int oddArray(int i){
        int firstNumber = 5;
        for( ; i < d.length; ){
            d[i] = i*2 + firstNumber;
            break;
        }
        return d[i];
    }

    private static double floatArray(int j){
        for( ; j < x.length; ){
            x[j] = (float)(Math.random()*(max - min) + min);
            break;
        }
        return x[j];
    }
}