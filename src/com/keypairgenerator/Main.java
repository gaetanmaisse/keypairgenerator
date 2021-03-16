package com.keypairgenerator;

import java.security.*;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        long startTime = System.nanoTime();
        KeyPairGenerator gen = KeyPairGenerator.getInstance("RSA");
        SecureRandom random = new SecureRandom();
        gen.initialize(4096, random);
        KeyPair keyPair = gen.generateKeyPair();
        PublicKey pubk = keyPair.getPublic();
        PrivateKey prvk =   keyPair.getPrivate();

        long endTime = System.nanoTime();

        Double durationInS = (endTime - startTime) / 1000000000d;

        System.out.println("It took "+ durationInS + "s");
        System.out.println(pubk);
        System.out.println(prvk);
    }
}
