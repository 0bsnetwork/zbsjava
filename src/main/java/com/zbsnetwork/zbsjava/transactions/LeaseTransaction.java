package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface LeaseTransaction extends Transaction, Signable, WithId {
    static final byte LEASE = 8;

    String getRecipient();

    long getAmount();

    long getFee();

    long getTimestamp();
}
