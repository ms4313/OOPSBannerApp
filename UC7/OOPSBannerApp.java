public class OOPSBannerApp{

    public static class CharacterPattern {

        char letter;       
        String[] pattern;     

        CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        CharacterPattern[] letters = { O, O, P, S };

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : letters) {
                line.append(cp.pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}