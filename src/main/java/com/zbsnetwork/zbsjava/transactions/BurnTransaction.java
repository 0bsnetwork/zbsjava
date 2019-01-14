package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface BurnTransaction extends Transaction, Signable, WithId {
    static final byte BURN = 6;

    String getAssetId();

    long getAmount();
}
