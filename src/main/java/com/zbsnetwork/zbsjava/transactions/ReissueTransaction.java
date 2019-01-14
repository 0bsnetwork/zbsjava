package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface ReissueTransaction extends Transaction, Signable, WithId {
    public static final byte REISSUE = 5;

    String getAssetId();

    long getQuantity();

    boolean isReissuable();
}
