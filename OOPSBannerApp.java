/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 * Properly aligned OOPS banner with correct S shape
 * @author Developer
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[7];

        lines[0] = " *****   *****   ******   ****** ";
        lines[1] = "*     * *     *  *     * *      ";
        lines[2] = "*     * *     *  *     * *      ";
        lines[3] = "*     * *     *  ******   ***** ";
        lines[4] = "*     * *     *  *            * ";
        lines[5] = "*     * *     *  *            * ";
        lines[6] = " *****   *****   *       ****** ";

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
