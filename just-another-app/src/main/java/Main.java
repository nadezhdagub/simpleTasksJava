import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    static char[] buf = new char[256];
    static String s1 = null;
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws ParseException {
        try (FileReader reader = new FileReader("src/main/java/log.txt")) {
            int c = 0;
            int cc = 2;

            String ss;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);

                }

                while (cc < buf.length) {
                    ss = Character.toString(buf[cc]);
                    s1 = s1 + ss;
                    cc++;
                }
                cc = 0;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int i = 8;
        int ii = 0;
        int succ = 0;
        int fail = 0;
        String[] q = s1.split("\\s+");
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");

        String time;
        String[] podTime1;
        int[] podTimeItS1 = new int[4];
        int[] podTimeItF1 = new int[4];

        String[] podTime2;
        int[] podTimeIt2 = new int[4];

        String[] podTime3;
        int[] podTimeIt3 = new int[4];

        int[] itogS = new int[4];
        int[] itogF = new int[4];

        int flagS = 0;
        int flagF = 0;

        while (i < q.length) {

            ii = 0;
            if (q[i].equals("started.")) {
                if (q[i + 53].equals("finished.")) {
                    time = q[i - 7];
                    //System.out.println(time);
                    podTime1 = time.split("\\:");
                    while (ii < podTime1.length - 1) {

                        podTimeItS1[ii] = podTimeItS1[ii] + Integer.parseInt(podTime1[ii]);
                        ii++;
                    }
                    time = podTime1[2];
                    podTime1 = time.split("\\.");
                    //System.out.println();
                    podTimeItS1[2] = podTimeItS1[2] + Integer.parseInt(podTime1[0]);
                    podTimeItS1[3] = podTimeItS1[3] + Integer.parseInt(podTime1[1]);
                    flagS++;
                } else {
                    time = q[i - 7];
                    //System.out.println(time);
                    podTime1 = time.split("\\:");
                    while (ii < podTime1.length - 1) {

                        podTimeItF1[ii] = podTimeItF1[ii] + Integer.parseInt(podTime1[ii]);
                        ii++;
                    }
                    time = podTime1[2];
                    podTime1 = time.split("\\.");
                    podTimeItF1[2] = podTimeItF1[2] + Integer.parseInt(podTime1[0]);
                    podTimeItF1[3] = podTimeItF1[3] + Integer.parseInt(podTime1[1]);
                    flagF++;
                }

                i = i + 53;

            }

            ii = 0;
            if (q[i].equals("finished.")) {
                succ++;
                time = q[i - 7];
                // System.out.println(time);
                podTime2 = time.split("\\:");
                while (ii < podTime2.length - 1) {
                    podTimeIt2[ii] = podTimeIt2[ii] + Integer.parseInt(podTime2[ii]);
                    ii++;
                }
                time = podTime2[2];
                podTime2 = time.split("\\.");
                podTimeIt2[2] = podTimeIt2[2] + Integer.parseInt(podTime2[0]);
                podTimeIt2[3] = podTimeIt2[3] + Integer.parseInt(podTime2[1]);
                //System.out.println(time);
                i = i + 9;
                //System.out.println(time2-time1);
            }

            ii = 0;
            if (q[i].equals("failed.")) {
                fail++;
                time = q[i - 7];
                //System.out.println(time);
                podTime3 = time.split("\\:");
                while (ii < podTime3.length - 1) {
                    podTimeIt3[ii] = podTimeIt3[ii] + Integer.parseInt(podTime3[ii]);
                    ii++;
                }
                time = podTime3[2];
                podTime3 = time.split("\\.");
                podTimeIt3[2] = podTimeIt3[2] + Integer.parseInt(podTime3[0]);
                podTimeIt3[3] = podTimeIt3[3] + Integer.parseInt(podTime3[1]);
                i = i + 9;
            }

        }
//////////////////////////////////////////

        int[] podTimeItAuthenS1 = new int[4];
        int[] podTimeItAuthenS2 = new int[4];

        int[] podTimeItAthorS1 = new int[4];
        int[] podTimeItAthorS2 = new int[4];

        int[] podTimeItBalaS1 = new int[4];
        int[] podTimeItBalaS2 = new int[4];

        int[] podTimeItAuthenF1 = new int[4];
        int[] podTimeItAuthenF2 = new int[4];

        int[] podTimeItAthorF1 = new int[4];
        int[] podTimeItAthorF2 = new int[4];

        int[] podTimeItBalaF1 = new int[4];
        int[] podTimeItBalaF2 = new int[4];

        int[] itogAuthenS = new int[4];
        int[] itogAuthenF = new int[4];

        int[] itogAthorS = new int[4];
        int[] itogAthorF = new int[4];

        int[] itogBalaS = new int[4];
        int[] itogBalaF = new int[4];

        int flagAuthenS = 0;
        int flagAthorS = 0;
        int flagBalaS = 0;

        int flagAuthenF = 0;
        int flagAthorF = 0;
        int flagBalaF = 0;


        boolean flag = false;

        i = 15;
        while (i < q.length) {
//////////////////////////////////////////1
            flag = false;
            ii = 0;
            if (q[i].equals("started.")) {

                if (q[i + 46].equals("finished.")) {
                    time = q[i - 5];
                    // System.out.println(time);
                    podTime1 = time.split("\\:");
                    while (ii < podTime1.length - 1) {

                        podTimeItAuthenS1[ii] = podTimeItAuthenS1[ii] + Integer.parseInt(podTime1[ii]);
                        ii++;
                    }
                    time = podTime1[2];
                    podTime1 = time.split("\\.");
                    //System.out.println();
                    podTimeItAuthenS1[2] = podTimeItAuthenS1[2] + Integer.parseInt(podTime1[0]);
                    podTimeItAuthenS1[3] = podTimeItAuthenS1[3] + Integer.parseInt(podTime1[1]);
                    flagAuthenS++;
                    flag = true;
                } else {
                    time = q[i - 5];
                    // System.out.println(time);
                    podTime1 = time.split("\\:");
                    while (ii < podTime1.length - 1) {

                        podTimeItAuthenF1[ii] = podTimeItAuthenF1[ii] + Integer.parseInt(podTime1[ii]);
                        ii++;
                    }
                    time = podTime1[2];
                    podTime1 = time.split("\\.");
                    //System.out.println();
                    podTimeItAuthenF1[2] = podTimeItAuthenF1[2] + Integer.parseInt(podTime1[0]);
                    podTimeItAuthenF1[3] = podTimeItAuthenF1[3] + Integer.parseInt(podTime1[1]);
                    flagAuthenF++;
                }
                i = i + 7;

            }

            ii = 0;
            if (q[i].equals("finished.")) {

                if (flag) {
                    time = q[i - 5];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItAuthenS2[ii] = podTimeItAuthenS2[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItAuthenS2[2] = podTimeItAuthenS2[2] + Integer.parseInt(podTime2[0]);
                    podTimeItAuthenS2[3] = podTimeItAuthenS2[3] + Integer.parseInt(podTime2[1]);
                } else {
                    time = q[i - 5];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItAuthenF2[ii] = podTimeItAuthenF2[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItAuthenF2[2] = podTimeItAuthenF2[2] + Integer.parseInt(podTime2[0]);
                    podTimeItAuthenF2[3] = podTimeItAuthenF2[3] + Integer.parseInt(podTime2[1]);
                }

                i = i + 7;


            }
/////////////////////////////2
            flag = false;
            ii = 0;
            if (q[i].equals("started.")) {


                if (q[i + 32].equals("finished.")) {
                    time = q[i - 5];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItAthorS1[ii] = podTimeItAthorS1[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItAthorS1[2] = podTimeItAthorS1[2] + Integer.parseInt(podTime2[0]);
                    podTimeItAthorS1[3] = podTimeItAthorS1[3] + Integer.parseInt(podTime2[1]);
                    flagAthorS++;
                    flag = true;
                } else {
                    time = q[i - 5];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItAthorF1[ii] = podTimeItAthorF1[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItAthorF1[2] = podTimeItAthorF1[2] + Integer.parseInt(podTime2[0]);
                    podTimeItAthorF1[3] = podTimeItAthorF1[3] + Integer.parseInt(podTime2[1]);
                    flagAthorF++;
                }

                i = i + 7;

            }

            if (q[i].equals("finished.")) {

                if (flag) {
                    time = q[i - 5];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItAthorS2[ii] = podTimeItAthorS2[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItAthorS2[2] = podTimeItAthorS2[2] + Integer.parseInt(podTime2[0]);
                    podTimeItAthorS2[3] = podTimeItAthorS2[3] + Integer.parseInt(podTime2[1]);
                } else {
                    time = q[i - 5];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItAthorF2[ii] = podTimeItAthorF2[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItAthorF2[2] = podTimeItAthorF2[2] + Integer.parseInt(podTime2[0]);
                    podTimeItAthorF2[3] = podTimeItAthorF2[3] + Integer.parseInt(podTime2[1]);
                }

                i = i + 8;

            }
///////////////////////////////////////3
            flag = false;
            ii = 0;
            if (q[i].equals("started.")) {

                if (q[i + 17].equals("finished.")) {
                    time = q[i - 6];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItBalaS1[ii] = podTimeItBalaS1[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItBalaS1[2] = podTimeItBalaS1[2] + Integer.parseInt(podTime2[0]);
                    podTimeItBalaS1[3] = podTimeItBalaS1[3] + Integer.parseInt(podTime2[1]);
                    flagBalaS++;
                    flag = true;
                } else {
                    time = q[i - 6];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItBalaF1[ii] = podTimeItBalaF1[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItBalaF1[2] = podTimeItBalaF1[2] + Integer.parseInt(podTime2[0]);
                    podTimeItBalaF1[3] = podTimeItBalaF1[3] + Integer.parseInt(podTime2[1]);
                    flagBalaF++;
                }

                i = i + 8;

            }

            if (q[i].equals("finished.")) {

                if (flag) {
                    time = q[i - 6];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItBalaS2[ii] = podTimeItBalaS2[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItBalaS2[2] = podTimeItBalaS2[2] + Integer.parseInt(podTime2[0]);
                    podTimeItBalaS2[3] = podTimeItBalaS2[3] + Integer.parseInt(podTime2[1]);
                } else {
                    time = q[i - 6];
                    //System.out.println(time);
                    podTime2 = time.split("\\:");
                    while (ii < podTime2.length - 1) {
                        podTimeItBalaF2[ii] = podTimeItBalaF2[ii] + Integer.parseInt(podTime2[ii]);
                        ii++;
                    }
                    time = podTime2[2];
                    podTime2 = time.split("\\.");
                    podTimeItBalaF2[2] = podTimeItBalaF2[2] + Integer.parseInt(podTime2[0]);
                    podTimeItBalaF2[3] = podTimeItBalaF2[3] + Integer.parseInt(podTime2[1]);
                }

                i = i + 25;

            }

        }

        ii = 0;
        while (ii < podTimeItAuthenS1.length) {
            itogAuthenS[ii] = podTimeItAuthenS2[ii] - podTimeItAuthenS1[ii];
            ii++;
        }
        itogAuthenS[3] = (itogAuthenS[3] + itogAuthenS[2] * 1000) / flagAuthenS;
        ii = 0;
        while (ii < itogAthorS.length) {
            itogAthorS[ii] = podTimeItAthorS2[ii] - podTimeItAthorS1[ii];
            ii++;
        }
        itogAthorS[3] = (itogAthorS[3] + itogAthorS[2] * 1000) / flagAthorS;
        ii = 0;
        while (ii < itogBalaS.length) {
            itogBalaS[ii] = podTimeItBalaS2[ii] - podTimeItBalaS1[ii];
            ii++;
        }
        itogBalaS[3] = (itogBalaS[3] + itogBalaS[2] * 1000) / flagBalaS;


        /////////////////////////////////////////////////////////////////
        ii = 0;
        while (ii < podTimeItAuthenF1.length) {
            itogAuthenF[ii] = podTimeItAuthenF2[ii] - podTimeItAuthenF1[ii];
            ii++;
        }
        itogAuthenF[3] = (itogAuthenF[3] + itogAuthenF[2] * 1000) / flagAuthenF;
        ii = 0;
        while (ii < itogAthorF.length) {
            itogAthorF[ii] = podTimeItAthorF2[ii] - podTimeItAthorF1[ii];
            ii++;
        }
        itogAthorF[3] = (itogAthorF[3] + itogAthorF[2] * 1000) / flagAthorF;
        ii = 0;
        while (ii < itogBalaF.length) {
            itogBalaF[ii] = podTimeItBalaF2[ii] - podTimeItBalaF1[ii];
            ii++;
        }
        itogBalaF[3] = (itogBalaF[3] + itogBalaF[2] * 1000) / flagBalaF;


////////////////////////////////////////////////////
        ii = 0;
        while (ii < podTimeItS1.length) {
            itogS[ii] = podTimeIt2[ii] - podTimeItS1[ii];
            ii++;
        }

        ii = 0;
        while (ii < podTimeItF1.length) {
            itogF[ii] = podTimeIt3[ii] - podTimeItF1[ii];
            ii++;
        }

        itogS[3] = (itogS[3] + itogS[2] * 1000) / flagS;
        itogF[3] = (itogF[3] + itogF[2] * 1000) / flagF;


        System.out.println("Successful operation count:" + succ);
        System.out.println("Average operation successful processing time:" + itogS[3]);
        System.out.println("\n");

        System.out.println("Failed operation count:" + fail);
        System.out.println("Average operation failed processing time:" + itogF[3]);
        System.out.println("\n");

        System.out.println("Average Authentication time (for successful operations):" + itogAuthenS[3]);
        System.out.println("Average Authentication time (for failed operations):" + itogAuthenF[3]);
        System.out.println("\n");

        System.out.println("Average Authorization time (for successful operations):" + itogAthorS[3]);
        System.out.println("Average Authorization time (for failed operations):" + itogAthorF[3]);
        System.out.println("\n");

        System.out.println("Average Balance modification time (for successful operations):" + itogBalaS[3]);
        System.out.println("Average Balance modification time (for failed operations):" + itogBalaF[3]);
    }
}
