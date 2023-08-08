package com.google.android.gms.internal.measurement;

public enum zzob {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzka.f106708a),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    /* access modifiers changed from: public */
    zzob(Object obj) {
        this.zzk = obj;
    }
}
