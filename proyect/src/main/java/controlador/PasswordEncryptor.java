package controlador;

import pila.Pila;

import java.util.HashMap;
import java.util.Map;

public class PasswordEncryptor {
    
    private static final Map<Character, Character> encryptionKey = new HashMap<>(Map.of(
        'a', '#',
        'e', '*',
        'i', '$',
        'o', '%',
        'u', '¡'
    ));

    public static String encrypt(String password) {
        Pila pila = new Pila();
        for (char c : password.toCharArray()) {
            char encryptedChar = encryptionKey.getOrDefault(c, c);
            pila.push(encryptedChar);
        }
        return pilaToString(pila);
    }

    public static String decrypt(String encryptedPassword) {
        Map<Character, Character> decryptionKey = new HashMap<>();
        encryptionKey.forEach((key, value) -> decryptionKey.put(value, key));
        
        Pila pila = new Pila();
        for (char c : encryptedPassword.toCharArray()) {
            char decryptedChar = decryptionKey.getOrDefault(c, c);
            pila.push(decryptedChar);
        }
        return pilaToString(pila);
    }

    private static String pilaToString(Pila pila) {
        StringBuilder sb = new StringBuilder();
        while (!pila.isEmpty()) {
            sb.append(pila.pop());
        }
        return sb.toString();
    }
}
