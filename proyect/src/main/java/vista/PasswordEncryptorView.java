package vista;

import controlador.PasswordEncryptor;

public class PasswordEncryptorView {

    public static void main(String[] args) {
        String password = "lafldsmdfr";

        System.out.println("contraseña:" + password);
        String encryptedPassword = PasswordEncryptor.encrypt(password);
        System.out.println("Contraseña encriptada: " + encryptedPassword);

        String decryptedPassword = PasswordEncryptor.decrypt(encryptedPassword);
        System.out.println("Contraseña desencriptada: " + decryptedPassword);
    }
}
