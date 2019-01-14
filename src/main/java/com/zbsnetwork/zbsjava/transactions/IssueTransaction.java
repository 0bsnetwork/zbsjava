package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface IssueTransaction extends Transaction, Signable, WithId {
    static final byte ISSUE = 3;

    String getName();

    String getDescription();

    long getQuantity();

    byte getDecimals();

    boolean isReissuable();
}
