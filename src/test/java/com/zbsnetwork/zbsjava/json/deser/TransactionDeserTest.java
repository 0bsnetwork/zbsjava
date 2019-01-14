package com.zbsnetwork.zbsjava.json.deser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.json.ZbsJsonMapper;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TransactionDeserTest {
    ObjectMapper mapper = new ZbsJsonMapper((byte) 'T');

    protected void deserializationTest(String json, Transaction tx, Class<?> txClass) throws IOException {
        Transaction deserialized = (Transaction) mapper.readValue(json, txClass);
        assertEquals(deserialized, tx);
        assertEquals(deserialized.getId(), tx.getId());
    }
}
