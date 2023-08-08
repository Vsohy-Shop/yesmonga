package com.google.android.gms.internal.measurement;

public enum zzoa {
    DOUBLE(zzob.DOUBLE, 1),
    FLOAT(zzob.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzob.BOOLEAN, 0),
    STRING(zzob.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzob.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzob.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzob zzt;

    /* access modifiers changed from: public */
    zzoa(zzob zzob, int i) {
        this.zzt = zzob;
    }

    /* renamed from: g */
    public final zzob mo137619g() {
        return this.zzt;
    }
}
