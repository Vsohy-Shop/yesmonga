package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public enum zzhp {
    DOUBLE(zzhq.DOUBLE, 1),
    FLOAT(zzhq.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzhq.BOOLEAN, 0),
    STRING(zzhq.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzhq.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzhq.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzhq zzt;

    /* access modifiers changed from: public */
    zzhp(zzhq zzhq, int i) {
        this.zzt = zzhq;
    }

    /* renamed from: g */
    public final zzhq mo123221g() {
        return this.zzt;
    }
}
