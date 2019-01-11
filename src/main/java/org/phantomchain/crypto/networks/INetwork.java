package org.phantomchain.crypto.networks;

public interface INetwork {

    int version();

    int wif();

    String epoch();

}
