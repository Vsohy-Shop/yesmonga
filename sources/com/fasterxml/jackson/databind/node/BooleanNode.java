package com.fasterxml.jackson.databind.node;

import com.carrefour.fid.android.airship.util.C13758b;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class BooleanNode extends ValueNode {
    public static final BooleanNode FALSE = new BooleanNode(false);
    public static final BooleanNode TRUE = new BooleanNode(true);
    private static final long serialVersionUID = 2;
    private final boolean _value;

    public BooleanNode(boolean z) {
        this._value = z;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    public static BooleanNode valueOf(boolean z) {
        return z ? TRUE : FALSE;
    }

    public boolean asBoolean() {
        return this._value;
    }

    public double asDouble(double d) {
        return this._value ? 1.0d : 0.0d;
    }

    public int asInt(int i) {
        return this._value ? 1 : 0;
    }

    public long asLong(long j) {
        return this._value ? 1 : 0;
    }

    public String asText() {
        return this._value ? C13758b.f33436b : C13758b.f33438c;
    }

    public JsonToken asToken() {
        return this._value ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    public boolean booleanValue() {
        return this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BooleanNode)) {
            return false;
        }
        if (this._value == ((BooleanNode) obj)._value) {
            return true;
        }
        return false;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    public int hashCode() {
        return this._value ? 3 : 1;
    }

    public Object readResolve() {
        return this._value ? TRUE : FALSE;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(this._value);
    }

    public boolean asBoolean(boolean z) {
        return this._value;
    }
}
