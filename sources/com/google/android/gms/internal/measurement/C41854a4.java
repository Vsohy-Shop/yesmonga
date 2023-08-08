package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a4 */
public final class C41854a4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41854a4 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private C42296z9 zzh = C42177s9.m170821q();

    static {
        C41854a4 a4Var = new C41854a4();
        zza = a4Var;
        C42177s9.m170825w(C41854a4.class, a4Var);
    }

    /* renamed from: D */
    public static C41854a4 m169591D() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C42273y3.f106553a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C41854a4();
        } else {
            if (i2 == 4) {
                return new C42239w3((C41997i3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo136502B() {
        return this.zzh.size();
    }

    /* renamed from: E */
    public final String mo136503E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final List mo136504F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo136505G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo136506H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo136507I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo136508J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: K */
    public final int mo136509K() {
        int a = C42290z3.m171195a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
