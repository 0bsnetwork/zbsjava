package com.zbsnetwork.zbsjava.json.ser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.json.ZbsJsonMapper;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public abstract class TransactionSerTest {
    ObjectMapper mapper = new ZbsJsonMapper((byte) 'T');

    protected void serializationRoadtripTest(Transaction tx, Class<?> txClass) throws IOException {
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, tx);
        Transaction deserialized = (Transaction) mapper.readValue(sw.toString(), txClass);
        assertEquals(deserialized, tx);
        assertEquals(deserialized.getId(), tx.getId());
    }
}
