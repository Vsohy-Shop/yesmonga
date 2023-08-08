package com.fasterxml.jackson.core;

import com.carrefour.fid.android.airship.util.C13758b;
import com.google.firebase.installations.local.C33093b;

public enum JsonToken {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT(C33093b.f80281i, 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE(C13758b.f33436b, 9),
    VALUE_FALSE(C13758b.f33438c, 10),
    VALUE_NULL("null", 11);
    
    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    private JsonToken(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this._serializedBytes[i2] = (byte) this._serializedChars[i2];
            }
        }
        this._id = i;
        if (i == 10 || i == 9) {
            z = true;
        } else {
            z = false;
        }
        this._isBoolean = z;
        if (i == 7 || i == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        this._isNumber = z2;
        if (i == 1 || i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        this._isStructStart = z3;
        if (i == 2 || i == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        this._isStructEnd = z4;
        if (!z3 && !z4 && i != 5 && i != -1) {
            z5 = true;
        }
        this._isScalar = z5;
    }

    public final byte[] asByteArray() {
        return this._serializedBytes;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    /* renamed from: id */
    public final int mo37695id() {
        return this._id;
    }

    public final boolean isBoolean() {
        return this._isBoolean;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
