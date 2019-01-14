package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.ByteString;
import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface TransferTransaction extends Transaction, Signable, WithId {
    static final byte TRANSFER = 4;

    String getRecipient();

    long getAmount();

    String getAssetId();

    String getFeeAssetId();

    ByteString getAttachment();
}
