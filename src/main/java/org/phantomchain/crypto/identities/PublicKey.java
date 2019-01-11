package org.phantomchain.crypto.identities;

public class PublicKey {
    public static String fromPassphrase(String passphrase) {
        return PrivateKey.fromPassphrase(passphrase).getPublicKeyAsHex();
    }

}
