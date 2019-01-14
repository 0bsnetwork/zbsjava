package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface LeaseCancelTransaction extends Transaction, Signable, WithId {
    public static final byte LEASE_CANCEL = 9;

    public String getLeaseId();
}
