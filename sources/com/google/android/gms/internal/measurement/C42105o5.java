package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o5 */
public final class C42105o5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42105o5 zza;
    private int zzd;
    private int zze;
    private C42279y9 zzf = C42177s9.m170819o();

    static {
        C42105o5 o5Var = new C42105o5();
        zza = o5Var;
        C42177s9.m170825w(C42105o5.class, o5Var);
    }

    /* renamed from: E */
    public static C42088n5 m170643E() {
        return (C42088n5) zza.mo137277j();
    }

    /* renamed from: H */
    public static /* synthetic */ void m170645H(C42105o5 o5Var, int i) {
        o5Var.zzd |= 1;
        o5Var.zze = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m170646I(C42105o5 o5Var, Iterable iterable) {
        C42279y9 y9Var = o5Var.zzf;
        if (!y9Var.mo136871d()) {
            o5Var.zzf = C42177s9.m170820p(y9Var);
        }
        C41948f8.m169878d(iterable, o5Var.zzf);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C42105o5();
        } else {
            if (i2 == 4) {
                return new C42088n5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137196B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int mo137197C() {
        return this.zze;
    }

    /* renamed from: D */
    public final long mo137198D(int i) {
        return this.zzf.mo137116l(i);
    }

    /* renamed from: G */
    public final List mo137199G() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo137200J() {
        return (this.zzd & 1) != 0;
    }
}
