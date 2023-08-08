package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public enum zbaay {
    DOUBLE(zbaaz.DOUBLE, 1),
    FLOAT(zbaaz.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zbaaz.BOOLEAN, 0),
    STRING(zbaaz.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zbaaz.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zbaaz.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zbaaz zbt;
    private final int zbu;

    /* access modifiers changed from: public */
    zbaay(zbaaz zbaaz, int i) {
        this.zbt = zbaaz;
        this.zbu = i;
    }

    /* renamed from: g */
    public final zbaaz mo84924g() {
        return this.zbt;
    }

    /* renamed from: i */
    public final int mo84925i() {
        return this.zbu;
    }
}
