package org.phantomchain.crypto.transactions.builder;

import org.phantomchain.crypto.configuration.Fee;
import org.phantomchain.crypto.configuration.Network;
import org.phantomchain.crypto.enums.Types;
import org.phantomchain.crypto.transactions.Transaction;
import org.phantomchain.crypto.utils.Slot;

public abstract class AbstractTransaction {
    public Transaction transaction;

    public AbstractTransaction() {
        this.transaction = new Transaction();
        this.transaction.type = this.getType();
        this.transaction.fee = Fee.get(this.getType());
        this.transaction.timestamp = Slot.time();
        this.transaction.version = 1;
        this.transaction.network = Network.get().version();
    }

    public AbstractTransaction sign(String passphrase) {
        this.transaction.sign(passphrase);
        this.transaction.id = this.transaction.computeId();

        return this;
    }

    public AbstractTransaction secondSign(String passphrase) {
        this.transaction.secondSign(passphrase);
        this.transaction.id = this.transaction.computeId();

        return this;
    }

    abstract Types getType();

}
