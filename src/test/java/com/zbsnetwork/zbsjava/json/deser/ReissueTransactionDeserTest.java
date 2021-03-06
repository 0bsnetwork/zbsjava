package com.zbsnetwork.zbsjava.json.deser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zbsnetwork.zbsjava.ByteString;
import com.zbsnetwork.zbsjava.PublicKeyAccount;
import com.zbsnetwork.zbsjava.json.ZbsJsonMapper;
import com.zbsnetwork.zbsjava.transactions.ReissueTransactionV1;
import com.zbsnetwork.zbsjava.transactions.ReissueTransactionV2;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class ReissueTransactionDeserTest extends TransactionDeserTest {
    ObjectMapper mapper = new ZbsJsonMapper((byte) 'T');

    ReissueTransactionV1 txV1 = new ReissueTransactionV1(new PublicKeyAccount("FM5ojNqW7e9cZ9zhPYGkpSP1Pcd8Z3e3MNKYVS5pGJ8Z", (byte) 'T'), "9ekQuYn92natMnMq8KqeGK3Nn7cpKd3BvPEGgD6fFyyz", 100000000L, true, 100000000L, 1526287561757L, new ByteString("3LnRMrjkk7RoV35PTwcdB4yW2rqUqXaKAh8DnPk5tNWABvhVQ9oqdTk3zM8b9AbGtry7WEcQZtevfK92DCFaa6hA"));
    ReissueTransactionV2 txV2 = new ReissueTransactionV2(new PublicKeyAccount("FM5ojNqW7e9cZ9zhPYGkpSP1Pcd8Z3e3MNKYVS5pGJ8Z", (byte) 'T'), (byte) 'T', "9ekQuYn92natMnMq8KqeGK3Nn7cpKd3BvPEGgD6fFyyz", 100000000L, true, 100000000L, 1526287561757L, Collections.singletonList(new ByteString("4DFEtUwJ9gjMQMuEXipv2qK7rnhhWEBqzpC3ZQesW1Kh8D822t62e3cRGWNU3N21r7huWnaty95wj2tZxYSvCfro")));

    @Test
    public void V1DeserializeTest() throws IOException {
        deserializationTest("{\"type\":5,\"id\":\"2y8pNQteNQnY5JWtrZGLUv3tD6GFT6DDzBWttVTwBa2t\",\"sender\":\"3N5GRqzDBhjVXnCn44baHcz2GoZy5qLxtTh\",\"senderPublicKey\":\"FM5ojNqW7e9cZ9zhPYGkpSP1Pcd8Z3e3MNKYVS5pGJ8Z\",\"fee\":100000000,\"timestamp\":1526287561757,\"signature\":\"3LnRMrjkk7RoV35PTwcdB4yW2rqUqXaKAh8DnPk5tNWABvhVQ9oqdTk3zM8b9AbGtry7WEcQZtevfK92DCFaa6hA\",\"version\":1,\"chainId\":null,\"assetId\":\"9ekQuYn92natMnMq8KqeGK3Nn7cpKd3BvPEGgD6fFyyz\",\"quantity\":100000000,\"reissuable\":true}", txV1, ReissueTransactionV1.class);
    }

    @Test
    public void V2DeserializeTest() throws IOException {
        deserializationTest("{\"type\":5,\"id\":\"HbQ7gMoDyRxSU6LbLLBVNTbxASaR8rm4Zck6eYvWVUkB\",\"sender\":\"3N5GRqzDBhjVXnCn44baHcz2GoZy5qLxtTh\",\"senderPublicKey\":\"FM5ojNqW7e9cZ9zhPYGkpSP1Pcd8Z3e3MNKYVS5pGJ8Z\",\"fee\":100000000,\"timestamp\":1526287561757,\"proofs\":[\"4DFEtUwJ9gjMQMuEXipv2qK7rnhhWEBqzpC3ZQesW1Kh8D822t62e3cRGWNU3N21r7huWnaty95wj2tZxYSvCfro\"],\"version\":2,\"chainId\":84,\"assetId\":\"9ekQuYn92natMnMq8KqeGK3Nn7cpKd3BvPEGgD6fFyyz\",\"quantity\":100000000,\"reissuable\":true}", txV2, ReissueTransactionV2.class);
    }
}
