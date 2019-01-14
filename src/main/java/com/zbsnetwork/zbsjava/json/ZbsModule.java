package com.zbsnetwork.zbsjava.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.zbsnetwork.zbsjava.*;
import com.zbsnetwork.zbsjava.json.deser.*;
import com.zbsnetwork.zbsjava.json.ser.*;
import com.zbsnetwork.zbsjava.matcher.Order;

public class ZbsModule extends SimpleModule {
    public ZbsModule(byte chainId, ObjectMapper objectMapper) {
        addDeserializer(PublicKeyAccount.class, new PublicKeyAccountDeser(chainId));
        addDeserializer(ByteString.class, new ByteStringDeser());
        addDeserializer(Alias.class, new AliasDeser(chainId));
        addDeserializer(Order.Status.class, new OrderStatusDeser());
        addDeserializer(Transaction.class, new TransactionDeserializer(objectMapper));

        addSerializer(PublicKeyAccount.class, new PublicKeyAccountSer());
        addSerializer(ByteString.class, new ByteStringSer());
        addSerializer(Alias.class, new AliasSer());
        addSerializer(AssetPair.class, new AssetPairSer());
        addSerializer(Order.Type.class, new OrderTypeSer());
    }
}
