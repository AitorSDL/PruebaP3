public class Main {
    public static void main (String[] args){
        int[] vector = {1,23,3,4,5,6,6,5,4,3,3,5,6,767,8,8,7654,6,8,565,3250};
        int l = 0;
        int r = 21;
        int a[] = {34,23,45,56,30,31,57,33,55,10};
        int result = ordena(vector, l, r);
        System.out.print(result);
    }
    private static int ordena(int[] vector, int l, int r){
        /**
         * Dividir vector en trozos
         * analizar cual es el mas grande de cada pareja
         * abstraer hasta conseguir el mayor elemento
         */
        if (r-l==1)  return vector[l];
        int m=(l+r)/2;
        int u=ordena(vector,l,m);
        int v=ordena(vector,m,r);
        return u>v?u:v;
    }
}
