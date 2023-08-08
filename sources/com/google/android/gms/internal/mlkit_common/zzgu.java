package com.google.android.gms.internal.mlkit_common;

public enum zzgu implements C42523u {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    /* access modifiers changed from: public */
    zzgu(int i) {
        this.zzd = i;
    }

    /* renamed from: b */
    public static zzgu m171779b(int i) {
        for (zzgu zzgu : values()) {
            if (zzgu.zzd == i) {
                return zzgu;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzd;
    }
}
