package _exemplos.senha.hash;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Examplo1 {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        String algorithm;
        algorithm = "SHA-1";
//        algorithm = "SHA-256";
//        algorithm = "SHA-512";
//        algorithm = "MD5";
        
        String s1 = "1234";
        String s2 = "Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga de Bragança e Habsburgo";
        
        MessageDigest md = MessageDigest.getInstance( algorithm );
        
        String h1 = new BigInteger( 1, md.digest( s1.getBytes("UTF-8") ) ).toString(16);
        String h2 = new BigInteger( 1, md.digest( s2.getBytes("UTF-8") ) ).toString(16);
        
        System.out.println( s1 + " | " + h1 + " | " + h1.length() );
        System.out.println( s2 + " | " + h2 + " | " + h2.length() );
        
    }
}