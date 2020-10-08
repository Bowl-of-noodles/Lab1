 class Lab1 {
    private static final float max = 13.0f;
    private static final float min = -3.0f;
    private static int[] intArray;
    private static float[] floatArray;

    public static void main(String[] args) {
    intArray = createOddArray();
    floatArray = createFloatArray();
    double[][] doubleArray = createTwoDimenArrayDouble();

    for(int i = 0; i < doubleArray.length; i++) {
        for (int j = 0; j < doubleArray[i].length; j++) {
            System.out.printf("%.5f", doubleArray[i][j]);
            System.out.print("\t");
         }
        System.out.println();
      }
    }

    private static int[] createOddArray(){
        int[] g = new int[8];
        int firstNumber = 5;
        for(int i = 0; i < g.length; i++){
            g[i] = i*2 + firstNumber;
        }
        return g;
    }

    private static float[] createFloatArray(){
        float[] x = new float[16];
        for(int j = 0 ; j < x.length; j++){
            x[j] = (float)(Math.random()*(max - min) + min);
        }
        return x;
    }

    private static double[][] createTwoDimenArrayDouble(){
        double [][] c = new double[8][16];
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                switch(intArray[i]){
                    case 19:
                        c[i][j] = math1(floatArray[j]);
                        break;
                    case 7:
                    case 11:
                    case 13:
                    case 15:
                        c[i][j] = math2(floatArray[j]);
                        break;
                    default:
                        c[i][j] = math3(floatArray[j]);
                        break;
                }
            }
        }
        return c;
    }

    private static double math1(float j){
        return Math.sin(Math.tan(j / Math.PI));
    }

    private static double math2(float j){
        return Math.asin(Math.pow((0.25*(j + 5)/16), 2));
    }

    private static double math3(float j){
        return Math.atan(Math.cos(Math.tan(Math.pow((
                Math.atan((j + 5)/16)* (Math.tan(j) + 1)), 2))));
    }
}
