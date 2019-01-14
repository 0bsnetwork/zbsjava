package com.zbsnetwork.zbsjava;

public abstract class Asset {
    /**
     * Constant used to represent ZBS token in asset transactions.
     */
    public static final String ZBS = "ZBS";

    public static final long TOKEN = 100000000L;

    public static final long MILLI = 100000L;

    static public String normalize(String assetId) {
        return assetId == null || assetId.isEmpty() ? Asset.ZBS : assetId;
    }

    static public boolean isZbs(String assetId) {
        return ZBS.equals(normalize(assetId));
    }

    static public String toJsonObject(String assetId) {
        return isZbs(assetId) ? null : assetId;
    }
}
