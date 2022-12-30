package src.macro.seqitems;

import src.macro.Mode;
import src.macro.SequenceItem;

import java.awt.event.KeyEvent;

public class KeyItem extends SequenceItem {
    private final int keyNum;
    private final Mode mode;
    public KeyItem(int keyNum, Mode mode) {
        this.keyNum = keyNum;
        this.mode = mode;
    }

    public String toString() {
        return (mode == Mode.UP ? "KeyUp: " : "KeyDown: ") + KeyEvent.getKeyText(keyNum);
    }

    public int getValue() {
        return keyNum;
    }

    public String toExport() {
        return (mode == Mode.UP ? "KeyUp: " : "KeyDown: ") + keyNum;
    }
}
