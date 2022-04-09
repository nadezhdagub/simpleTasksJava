public class MaxMinArv {
    public static void main(String[] args) {
        
        int n = 30;
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        
        double max = arr[0];
        double min = arr[0];
        double agv = 0.0;
        double s = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            s += arr[i];
        }
        
        agv = s / arr.length;
        System.out.println(max + min + agv);
    }

}
