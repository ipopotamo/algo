package main;

import static java.lang.Float.NaN;

public class calcu {


    public static float[] juan(float a, float b, float c) {
        float b2 = b * b;
        float cuentaR = b2 - (4 * a * c);
        float raiz = (float) Math.sqrt(cuentaR);

        float veri = raiz;
        if (veri % 2 == 0) {
            float vp = ((-b) + raiz) / a * 2;
            float vm = ((-b) - raiz) / a * 2;
            float[] result = {vp, vm};

            return result;
        }
        return new float[0];
    }




    public static int sumar(int num, int num1){
        return num + num1;
    }
    public static int resstar(int num, int num2){
        return num - num2;
    }
    public static float div(float num, float num2){
        if(num2 != 0){
        return num / num2;
        }
        return NaN;
     }
    public static int por(int num, int num2){
        return  num * num2;
    }


}
