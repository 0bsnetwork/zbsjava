package com.zbsnetwork.zbsjava.json.ser;

import com.zbsnetwork.zbsjava.Asset;
import com.zbsnetwork.zbsjava.ByteString;
import com.zbsnetwork.zbsjava.PublicKeyAccount;
import com.zbsnetwork.zbsjava.transactions.TransferTransactionV1;
import com.zbsnetwork.zbsjava.transactions.TransferTransactionV2;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class TransferTransactionSerTest extends TransactionSerTest {
    TransferTransactionV1 txV1 = new TransferTransactionV1(new PublicKeyAccount("FM5ojNqW7e9cZ9zhPYGkpSP1Pcd8Z3e3MNKYVS5pGJ8Z", (byte) 'T'), "3My3KZgFQ3CrVHgz6vGRt8687sH4oAA1qp8", 1900000, Asset.ZBS, 100000, Asset.ZBS, new ByteString("4t2Xazb2SX"), 1526552510868L, new ByteString("eaV1i3hEiXyYQd6DQY7EnPg9XzpAvB9VA3bnpin2qJe4G36GZXaGnYKCgSf9xiQ61DcAwcBFzjSXh6FwCgazzFz"));
    TransferTransactionV2 txV2 = new TransferTransactionV2(new PublicKeyAccount("FM5ojNqW7e9cZ9zhPYGkpSP1Pcd8Z3e3MNKYVS5pGJ8Z", (byte) 'T'), "3My3KZgFQ3CrVHgz6vGRt8687sH4oAA1qp8", 100000000, Asset.ZBS, 100000000, Asset.ZBS, new ByteString("4t2Xazb2SX"), 1526641218066L, Collections.singletonList(new ByteString("4bfDaqBcnK3hT8ywFEFndxtS1DTSYfncUqd4s5Vyaa66PZHawtC73rDswUur6QZu5RpqM7L9NFgBHT1vhCoox4vi")));

    @Test
    public void V1SerializeTest() throws IOException {
        serializationRoadtripTest(txV1, TransferTransactionV1.class);
    }

    @Test
    public void V2SerializeTest() throws IOException {
        serializationRoadtripTest(txV2, TransferTransactionV2.class);
    }
}
