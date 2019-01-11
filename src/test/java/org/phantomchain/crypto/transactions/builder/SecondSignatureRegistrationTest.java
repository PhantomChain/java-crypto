package org.phantomchain.crypto.transactions.builder;

import org.phantomchain.crypto.transactions.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecondSignatureRegistrationTest {

    @Test
    void build() {
        Transaction actual = new SecondSignatureRegistration()
            .signature("this is a top secret second passphrase'")
            .sign("this is a top secret passphrase")
            .transaction;

        assertTrue(actual.verify());
    }

}
