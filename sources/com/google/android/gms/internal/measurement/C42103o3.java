package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
public final class C42103o3 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42103o3 zza;
    private int zzd;
    private C41854a4 zze;
    private C42188t3 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C42103o3 o3Var = new C42103o3();
        zza = o3Var;
        C42177s9.m170825w(C42103o3.class, o3Var);
    }

    /* renamed from: C */
    public static C42103o3 m170631C() {
        return zza;
    }

    /* renamed from: G */
    public static /* synthetic */ void m170632G(C42103o3 o3Var, String str) {
        o3Var.zzd |= 8;
        o3Var.zzh = str;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C42103o3();
        } else {
            if (i2 == 4) {
                return new C42086n3((C41997i3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final C42188t3 mo137188D() {
        C42188t3 t3Var = this.zzf;
        return t3Var == null ? C42188t3.m170850C() : t3Var;
    }

    /* renamed from: E */
    public final C41854a4 mo137189E() {
        C41854a4 a4Var = this.zze;
        return a4Var == null ? C41854a4.m169591D() : a4Var;
    }

    /* renamed from: F */
    public final String mo137190F() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo137191H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo137192I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo137193J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo137194K() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: L */
    public final boolean mo137195L() {
        return (this.zzd & 1) != 0;
    }
}
