package org.phantomchain.crypto.transactions.serializers;

import com.google.gson.internal.LinkedTreeMap;
import org.phantomchain.crypto.encoding.Hex;
import org.phantomchain.crypto.transactions.Deserializer;
import org.phantomchain.crypto.transactions.FixtureLoader;
import org.phantomchain.crypto.transactions.Serializer;
import org.phantomchain.crypto.transactions.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiSignatureRegistrationTest {

    @Test
    void passphrase() {
        LinkedTreeMap<String, Object> fixture = FixtureLoader.load("transactions/multi_signature_registration/passphrase");

        Transaction transaction = new Deserializer().deserialize(fixture.get("serialized").toString());
        String actual = Hex.encode(new Serializer().serialize(transaction));

        assertEquals(fixture.get("serialized").toString(), actual);
    }

}
