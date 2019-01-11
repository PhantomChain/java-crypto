package org.phantomchain.crypto.transactions.builder;

import org.phantomchain.crypto.encoding.Hex;
import org.phantomchain.crypto.enums.Types;
import org.phantomchain.crypto.identities.PublicKey;

public class SecondSignatureRegistration extends AbstractTransaction {

    public SecondSignatureRegistration signature(String signature) {
        this.transaction.asset.signature.publicKey = Hex.encode(PublicKey.fromPassphrase(signature).getBytes());

        return this;
    }

    public Types getType() {
        return Types.SECOND_SIGNATURE_REGISTRATION;
    }

}
