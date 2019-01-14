package com.zbsnetwork.zbsjava.transactions;

import com.zbsnetwork.zbsjava.Alias;
import com.zbsnetwork.zbsjava.Signable;
import com.zbsnetwork.zbsjava.Transaction;
import com.zbsnetwork.zbsjava.WithId;

public interface AliasTransaction extends Transaction, Signable, WithId {
    static final byte ALIAS = 10;

    Alias getAlias();
}
