package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
public final class C41945f5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41945f5 zza;
    private C42296z9 zzd = C42177s9.m170821q();

    static {
        C41945f5 f5Var = new C41945f5();
        zza = f5Var;
        C42177s9.m170825w(C41945f5.class, f5Var);
    }

    /* renamed from: B */
    public static C41927e5 m169867B() {
        return (C41927e5) zza.mo137277j();
    }

    /* renamed from: F */
    public static /* synthetic */ void m169869F(C41945f5 f5Var, C41981h5 h5Var) {
        h5Var.getClass();
        C42296z9 z9Var = f5Var.zzd;
        if (!z9Var.mo136871d()) {
            f5Var.zzd = C42177s9.m170822r(z9Var);
        }
        f5Var.zzd.add(h5Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C41981h5.class});
        } else if (i2 == 3) {
            return new C41945f5();
        } else {
            if (i2 == 4) {
                return new C41927e5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final C41981h5 mo136759D(int i) {
        return (C41981h5) this.zzd.get(0);
    }

    /* renamed from: E */
    public final List mo136760E() {
        return this.zzd;
    }
}
