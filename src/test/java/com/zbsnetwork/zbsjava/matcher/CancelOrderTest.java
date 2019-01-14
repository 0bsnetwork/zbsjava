package com.zbsnetwork.zbsjava.matcher;

import com.zbsnetwork.zbsjava.AssetPair;
import com.zbsnetwork.zbsjava.Base58;
import com.zbsnetwork.zbsjava.PrivateKeyAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CancelOrderTest {
    CancelOrder cancelOrder = new CancelOrder(PrivateKeyAccount.fromPrivateKey("CrppxhgtZZNd5wcVMwsudWJ78ZKLqETR8AmhtjeKDFZU", (byte) 'T'), new AssetPair("PHCN", "Aqy7PRU"), "H93RaJ6D9YxEWNJiiMsej23NVHLrxu6kMyFb7CgX2DZW");

    @Test
    public void bytesTest() {
        assertEquals("4W1eSfcBttw6kiyZhhe52DamKjdcQgqGapg1VFVp5pNqgyomPVMi6NRAr6cLiCi1dAQoUni7eQETMBsjMu1fNLbn", Base58.encode(cancelOrder.getBytes()));
    }
}
