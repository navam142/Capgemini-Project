package printer;

import java.util.List;

public abstract class AbstractCharacterPrinter implements  CharacterPrinter{
    protected List<String> pattern;
    public List<String> getPattern() {
        return this.pattern;
    }
}
