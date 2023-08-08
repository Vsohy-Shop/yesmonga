package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
public final class C42190t5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42190t5 zza;
    private C42296z9 zzd = C42177s9.m170821q();

    static {
        C42190t5 t5Var = new C42190t5();
        zza = t5Var;
        C42177s9.m170825w(C42190t5.class, t5Var);
    }

    /* renamed from: D */
    public static C42190t5 m170865D() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C42224v5.class});
        } else if (i2 == 3) {
            return new C42190t5();
        } else {
            if (i2 == 4) {
                return new C42173s5((C42156r5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137304B() {
        return this.zzd.size();
    }

    /* renamed from: E */
    public final List mo137305E() {
        return this.zzd;
    }
}
