package com.zbsnetwork.zbsjava.matcher;

import com.zbsnetwork.zbsjava.AssetPair;
import com.zbsnetwork.zbsjava.Base58;
import com.zbsnetwork.zbsjava.PrivateKeyAccount;
import com.zbsnetwork.zbsjava.PublicKeyAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    Order ord1 = new Order(Order.Type.BUY, new AssetPair("PHCN", "Aqy7PRU"), 1583290045643L, 3411800000000L, 1534932075909L, 1536178324108L, 4272607605316276L, PrivateKeyAccount.fromPrivateKey("CrppxhgtZZNd5wcVMwsudWJ78ZKLqETR8AmhtjeKDFZU", (byte)'T'), new PublicKeyAccount("G67KDhqHdjNNb2tnHRgNbDppQEM9ySXdiBip577n2Xoj", (byte)'T'));

    @Test
    public void bytesTest() {
        assertEquals("qjMXAJL38hGRZxmn9Rrf9EdspTdHegtWXBDQy7FzZJePFmzQ2qoYZW6TAppssXXpbQPzpsiPFEJvkUzJ6BBhv6tg21o8QZ4JQB3P7MuUFB9v43ofpZmnZbJ2oX8q99YhDij33zvk5XWHCYceqAJKXtXn9SWh9", Base58.encode(ord1.getBytes()));
    }

    @Test
    public void idTest() {
        assertEquals("H93RaJ6D9YxEWNJiiMsej23NVHLrxu6kMyFb7CgX2DZW", ord1.getId().getBase58String());
    }
}
