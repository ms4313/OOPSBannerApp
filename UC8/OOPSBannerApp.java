import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp{

    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder row = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    row.append(pattern[i]).append("  ");
                }
            }

            System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createCharacterPatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}