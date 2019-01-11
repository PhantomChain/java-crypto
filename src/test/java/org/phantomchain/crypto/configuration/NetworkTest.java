package org.phantomchain.crypto.configuration;

import org.phantomchain.crypto.networks.INetwork;
import org.phantomchain.crypto.networks.Mainnet;
import org.phantomchain.crypto.networks.Testnet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkTest {

    @Test
    public void get() {
        Network.set(new Mainnet());
        INetwork network = Network.get();
        assertEquals(new Mainnet().version(), network.version());
    }

    @Test
    public void set() {
        Network.set(new Testnet());
        assertEquals(new Testnet().version(), Network.get().version());
        Network.set(new Mainnet());
        assertEquals(new Mainnet().version(), Network.get().version());
    }
}
