public class Main {
    static final int N = 8;
    static double[][] matrix1 = {
            {2.0,  1.0, 3.0,  2.0,  1.0, 6.0, 0.0, 4.0},
            {3.0,  2.0, 3.0,  2.0,  3.0, 3.0, 3.0, 0.0},
            {2.0,  1.0, 2.0,  1.0,  2.0, 3.0, 4.0, 4.0},
            {1.0, -1.0, 2.0,  1.0, -1.0, 0.0, 5.0, 0.0},
            {1.0, -1.0, 2.0, -2.0,  2.0, 3.0, 6.0, 5.0},
            {0.0,  1.0, 3.0,  1.0,  0.0, 5.0, 7.0, 0.0},
            {0.0,  2.0, 2.0,  3.0,  4.0, 4.0, 5.0, 8.0},
            {3.0,  4.0, 2.0,  4.0,  2.0, 5.0, 6.0, 5.0}
    };
    static double[][] matrix2 = {
            {2.0,  1.0, 3.0,  2.0,  1.0, 6.0, 0.0, 4.0},
            {3.0,  2.0, 3.0,  2.0,  3.0, 3.0, 3.0, 0.0},
            {2.0,  1.0, 2.0,  1.0,  2.0, 9.0, 4.0, 4.0},
            {1.0, -1.0, 2.0,  1.0, -1.0, 0.0, 5.0, 0.0},
            {1.0, -1.0, 2.0, -2.0,  2.0, 3.0, 6.0, 5.0},
            {0.0,  1.0, 3.0,  1.0,  0.0, 5.0, 7.0, 0.0},
            {0.0,  2.0, 2.0,  3.0,  4.0, 4.0, 5.0, 8.0},
            {3.0,  4.0, 2.0,  4.0,  2.0, 5.0, 6.0, 5.0}
    };
    static double[][] matrix3 = {
            {2.0,  1.0, 3.0,  2.0,  1.0, 6.0, 0.0, 4.0},
            {3.0,  2.0, 3.0,  2.0,  3.0, 3.0, 3.0, 0.0},
            {2.0,  1.0, 2.0,  1.0,  2.0, 3.0, 4.0, 4.0},
            {1.0, -1.0, 2.0,  1.0, -1.0, 0.0, 5.0, 0.0},
            {1.0, -1.0, 2.0, -2.0,  2.0, 3.0, 6.0, 5.0},
            {0.0,  9.0, 3.0,  1.0,  0.0, 5.0, 7.0, 0.0},
            {0.0,  2.0, 2.0,  3.0,  4.0, 4.0, 5.0, 8.0},
            {3.0,  4.0, 2.0,  4.0,  2.0, 5.0, 6.0, 5.0}
    };
    static double[][] filter = {
            {1.098, -0.098, -0.097, 0.098, -0.097, 0.098, 0.097, -0.098},
            {0.5, 0.497, -0.501, 0.503, -0.5, 0.503, 0.501, -0.503},
            {0.305, -0.306, 0.694, 0.306, -0.301, 0.306, 0.308, -0.306},
            {-0.204, 0.206, 0.204, 0.794, 0.206, -0.206, -0.203, 0.206},
            {-0.575, 0.582, 0.58, -0.582, 1.578, -0.582, -0.581, 0.582},
            {-0.824, 0.832, 0.827, -0.832, 0.827, 0.168, -0.829, 0.832},
            {0.161, -0.162, -0.164, 0.162, -0.161, 0.162, 1.162, -0.162},
            {0.02, -0.019, -0.019, 0.019, -0.02, 0.019, 0.019, 0.981},
    };

    static double[] adamarFour(double[] line) {
        double[] newline = {line[0], line[4], line[2], line[6], line[1],
                line[5], line[3], line[7]};
        double[] result = new double[N];
        int delta = 4;
        for (int i = 0; i < 4; i++) {
            result[i] = newline[i] + newline[i + delta];
        }
        for (int i = 4; i < 8; i++) {
            result[i] = -newline[i] + newline[i - delta];
        }
        newline = result.clone();
        delta = 2;
        for (int i = 0; i < 2; i++) {
            result[i] = newline[i] + newline[i + delta];
        }
        for (int i = 2; i < 4; i++) {
            result[i] = -newline[i] + newline[i - delta];
        }
        for (int i = 4; i < 6; i++) {
            result[i] = newline[i] - newline[i + delta];
        }
        for (int i = 6; i < 8; i++) {
            result[i] = newline[i] + newline[i - delta];
        }
        newline = result.clone();
        result[0] = newline[0] + newline[1];
        result[1] = newline[0] - newline[1];
        result[2] = newline[2] - newline[3];
        result[3] = newline[2] + newline[3];
        result[4] = newline[4] + newline[5];
        result[5] = newline[4] - newline[5];
        result[6] = newline[6] - newline[7];
        result[7] = newline[6] + newline[7];
        return result;
    }

    static double[] adamarFourRev(double[] line) {
        double[] newline = line.clone();
        double[] result = new double[N];
        int delta = 4;
        for (int i = 0; i < 4; i++) {
            result[i] = newline[i] + newline[i + delta];
        }
        for (int i = 4; i < 8; i++) {
            result[i] = -newline[i] + newline[i - delta];
        }
        newline = result.clone();
        delta = 2;
        for (int i = 0; i < 2; i++) {
            result[i] = newline[i] + newline[i + delta];
        }
        for (int i = 2; i < 4; i++) {
            result[i] = -newline[i] + newline[i - delta];
        }
        for (int i = 4; i < 6; i++) {
            result[i] = newline[i] - newline[i + delta];
        }
        for (int i = 6; i < 8; i++) {
            result[i] = newline[i] + newline[i - delta];
        }
        newline = result.clone();
        result[0] = newline[0] + newline[1];
        result[1] = newline[0] - newline[1];
        result[2] = newline[2] - newline[3];
        result[3] = newline[2] + newline[3];
        result[4] = newline[4] + newline[5];
        result[5] = newline[4] - newline[5];
        result[6] = newline[6] - newline[7];
        result[7] = newline[6] + newline[7];
        return new double[]{result[0], result[7], result[4], result[3],
                result[2], result[5], result[6], result[1]};
    }
    static String printArray(double[][] matrix) {
        StringBuilder s = new StringBuilder();
        s.append("[").append("\n");
        for (int i = 0; i < N; i++) {
            s.append("[");
            for (int j = 0; j < N; j++) {
                double temp_m=matrix[i][j];
                temp_m*=1000;
                temp_m=Math.round(temp_m);
                temp_m/=1000;
                s.append(temp_m).append(", ");
            }
            s.deleteCharAt(s.length() - 1);
            s.deleteCharAt(s.length() - 1);
            s.append("],").append("\n");
        }
        s.deleteCharAt(s.length() - 1);
        s.deleteCharAt(s.length() - 1);
        s.append("\n").append("]");
        return s.toString();
    }
    static double[][] adamarMatrix(double[][] m) {
        double[][] matrix = m.clone();
        for (int i = 0; i < N; i++) {
            matrix[i] = adamarFour(matrix[i]);
        }
        for (int i = 0; i < N; i++) {
            double[] result = adamarFour(new double[]{matrix[0][i],
                    matrix[1][i], matrix[2][i], matrix[3][i],
                    matrix[4][i], matrix[5][i], matrix[6][i],
                    matrix[7][i]});
            for (int j = 0; j < N; j++) {
                matrix[j][i] = result[j];
            }
        }
        return matrix;
    }
    static double[][] reverseAdamarMatrix(double[][] m) {
        double[][] matrix = m.clone();
        for (int i = 0; i < N; i++) {
            matrix[i] = adamarFourRev(matrix[i]);
        }
        for (int i = 0; i < N; i++) {
            double[] result = adamarFourRev(new double[]{matrix[0][i],
                    matrix[1][i], matrix[2][i], matrix[3][i],
                    matrix[4][i], matrix[5][i], matrix[6][i],
                    matrix[7][i]});
            for (int j = 0; j < N; j++) {
                matrix[j][i] = result[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Math.round(matrix[i][j]);
            }
        }
        return matrix;
    }
    static public double[][] sss(double[][] m) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                m[i][j] /= N;
                m[i][j] /= N;
            }
        }
        return m;
    }
    static double[][] mult(double[][] a, double[][] b){
        int m = a.length;
        int n = b[0].length;
        int o = b.length;
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        double[][] adamar1 = adamarMatrix(matrix1);
        double[][] adamar2 = adamarMatrix(matrix2);
        double[][] adamar3 = adamarMatrix(matrix3);

        adamar1 = sss(adamar1);
        adamar2 = sss(adamar2);
        adamar3 = sss(adamar3);

        System.out.println(printArray(adamar1));
        System.out.println(printArray(adamar2));
        System.out.println(printArray(adamar3));

        double[][] adamar21 = mult(adamar2,filter);
        double[][] adamar31 = mult(adamar3,filter);

        System.out.println(printArray(adamar21));
        System.out.println(printArray(adamar31));

        System.out.println(printArray(reverseAdamarMatrix(adamar21)));
        System.out.println(printArray(reverseAdamarMatrix(adamar31)));
    }

}
