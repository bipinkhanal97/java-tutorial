package console;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * This class prints the calendar in BS format
 * The output looks like
 * 3	31	32				1
 * 2	3	4	5	6	7	8
 * 9	1	11	12	13	14	15
 * 16	17	18	19	2	21	22
 * 23	24	25	26	27	28	29
 * Here we use the value 0 for gaps
 *
 * @author Bipin Khanal
 * @since 1.0
 */
public class PrintCustomCalendar {

    public static void main(String args[]) {
        int days = 32;
        int gap = 6;
        int[][] calendar = getCalendar(days, gap);
        System.out.println("2075 Baisakh");
        Stream.of(calendar).forEach(PrintCustomCalendar::printWeek);
    }

    private static void printWeek(int[] week) {
        Arrays.stream(week)
                .forEach(a -> System.out.print(String.valueOf(a + "\t").replace("0", "")));
        System.out.println();
    }

    private static int[][] getCalendar(int days, int gap) {
        int[][] weeks = new int[5][7];
        int count = 1;
        for (int i = 0; i < 7; i++) {
            if (i < gap) {
                //For first gap
                weeks[0][i] = 0;
            } else {
                //First Week
                weeks[0][i] = count;
                count++;
            }
        }
        for (int i = 0; i < 7; i++) {
            //Second Week
            weeks[1][i] = count;
            count++;
        }
        for (int i = 0; i < 7; i++) {
            //Third Week
            weeks[2][i] = count;
            count++;
        }
        for (int i = 0; i < 7; i++) {
            //Fourth Week
            weeks[3][i] = count;
            count++;
        }
        for (int i = 0; i < 7; i++) {
            //Fifth Week
            if (count <= days) {
                weeks[4][i] = count;
                count++;
            } else {
                //Print gaps
                weeks[4][i] = 0;
            }
        }
        for (int i = 0; i < 7; i++) {
            if (days >= count) {
                //Add days to first week
                weeks[0][i] = count;
                count++;
            }
        }
        return weeks;
    }


}
