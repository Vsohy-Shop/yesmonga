package com.google.android.gms.internal.gtm;

public enum zzye {
    DOUBLE(zzyf.DOUBLE, 1),
    FLOAT(zzyf.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzyf.BOOLEAN, 0),
    STRING(zzyf.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzyf.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzyf.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzyf zzt;

    /* access modifiers changed from: public */
    zzye(zzyf zzyf, int i) {
        this.zzt = zzyf;
    }

    /* renamed from: g */
    public final zzyf mo136175g() {
        return this.zzt;
    }
}
