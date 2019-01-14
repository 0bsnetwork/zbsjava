package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.ByteString;
import com.zbsnetwork.zbsjava.Transaction;

import static com.zbsnetwork.zbsjava.ByteUtils.hash;

public abstract class TransactionWithBytesHashId implements Transaction {
    public ByteString getId() {
        return new ByteString(hash(getBytes()));
    }
}
