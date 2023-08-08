package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
public final class C41892c6 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41892c6 zza;
    private int zzd;
    private int zze;
    private C42296z9 zzf = C42177s9.m170821q();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C41892c6 c6Var = new C41892c6();
        zza = c6Var;
        C42177s9.m170825w(C41892c6.class, c6Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C41856a6.f105991a, "zzf", C41892c6.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C41892c6();
        } else {
            if (i2 == 4) {
                return new C42275y5((C42156r5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo136649B() {
        return this.zzj;
    }

    /* renamed from: D */
    public final String mo136650D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo136651E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final List mo136652F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo136653G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean mo136654H() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: I */
    public final boolean mo136655I() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: J */
    public final boolean mo136656J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final int mo136657K() {
        int a = C41874b6.m169709a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
