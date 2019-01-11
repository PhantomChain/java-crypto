package org.phantomchain.crypto.configuration;

import org.phantomchain.crypto.networks.INetwork;
import org.phantomchain.crypto.networks.Mainnet;

public class Network {
    private static INetwork network = new Mainnet();

    public static INetwork get() {
        return network;
    }

    public static void set(INetwork network) {
        Network.network = network;
    }
}
