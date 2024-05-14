package modelo;

import java.util.HashMap;
import java.util.Map;

public class EncryptionKey {
 static Map<Character, Character> encryptionKey = new HashMap<>(Map.ofEntries(
        Map.entry('a', '#'),
        Map.entry('e', '*'),
        Map.entry('i', '$'),
        Map.entry('o', '%'),
        Map.entry('u', '¡')
    ));

    public static Map<Character, Character> getEncryptionKey() {
        return encryptionKey;
    }
}