package org.phantomchain.crypto.transactions.serializers;

import org.phantomchain.crypto.encoding.Hex;
import org.phantomchain.crypto.transactions.Transaction;

import java.nio.ByteBuffer;

public class SecondSignatureRegistration extends AbstractSerializer {
    public SecondSignatureRegistration(ByteBuffer buffer, Transaction transaction) {
        super(buffer, transaction);
    }

    public void serialize() {
        this.buffer.put(Hex.decode(this.transaction.asset.signature.publicKey));
    }

}
