package u4;

public class U4 {

    public static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public Character getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }

        // Create all character-pattern mappings
        public static CharacterPatternMap[] createCharacterPatternMaps() {
            return new CharacterPatternMap[] {
                    new CharacterPatternMap('O', new String[] {
                            " ***** ",
                            "*     *",
                            "*     *",
                            "*     *",
                            " ***** "
                    }),
                    new CharacterPatternMap('P', new String[] {
                            "***** ",
                            "*    *",
                            "***** ",
                            "*     ",
                            "*     "
                    }),
                    new CharacterPatternMap('S', new String[] {
                            " *****",
                            "*     ",
                            " *****",
                            "     *",
                            "***** "
                    }),
                    new CharacterPatternMap(' ', new String[] {
                            "       ",
                            "       ",
                            "       ",
                            "       ",
                            "       "
                    })
            };
        }

        // Retrieve pattern for a given character
        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
            for (CharacterPatternMap map : charMaps) {
                if (map.getCharacter() == ch) {
                    return map.getPattern();
                }
            }
            // fallback to space if character not found
            return getCharacterPattern(' ', charMaps);
        }

        // Print message as ASCII banner
        public static void printMessage(String message, CharacterPatternMap[] charMaps) {

            int rows = charMaps[0].getPattern().length;

            for (int row = 0; row < rows; row++) {
                for (char ch : message.toCharArray()) {
                    String[] pattern = getCharacterPattern(ch, charMaps);
                    System.out.print(pattern[row] + "  ");
                }
                System.out.println();
            }
        }

        // Entry point for UC4
        public static  void printOops() {
            CharacterPatternMap[] charMaps = createCharacterPatternMaps();
            String message = "OOPS";
            printMessage(message, charMaps);
        }
    }
}
