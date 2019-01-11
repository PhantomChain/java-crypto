package org.phantomchain.crypto.transactions.builder;

import org.phantomchain.crypto.enums.Types;

public class DelegateRegistration extends AbstractTransaction {
    public DelegateRegistration username(String username) {
        this.transaction.asset.delegate.username = username;

        return this;
    }

    public Types getType() {
        return Types.DELEGATE_REGISTRATION;
    }

}
