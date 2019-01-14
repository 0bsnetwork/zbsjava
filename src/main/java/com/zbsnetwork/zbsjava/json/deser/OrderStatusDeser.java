package com.zbsnetwork.zbsjava.json.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.zbsnetwork.zbsjava.matcher.Order;

import java.io.IOException;

public class OrderStatusDeser extends JsonDeserializer<Order.Status> {
    @Override
    public Order.Status deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return Order.Status.fromString(jsonParser.getValueAsString());
    }
}
