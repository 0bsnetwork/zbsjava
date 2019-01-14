package com.zbsnetwork.zbsjava;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Signable {
    @JsonIgnore
    byte[] getBytes();

    PublicKeyAccount getSenderPublicKey();
}