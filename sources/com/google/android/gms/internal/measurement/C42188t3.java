package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
public final class C42188t3 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42188t3 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C42188t3 t3Var = new C42188t3();
        zza = t3Var;
        C42177s9.m170825w(C42188t3.class, t3Var);
    }

    /* renamed from: C */
    public static C42188t3 m170850C() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C42154r3.f106378a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C42188t3();
        } else {
            if (i2 == 4) {
                return new C42120p3((C41997i3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final String mo137292D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo137293E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final String mo137294F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo137295G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo137296H() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: I */
    public final boolean mo137297I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo137298J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo137299K() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: L */
    public final boolean mo137300L() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final int mo137301M() {
        int a = C42171s3.m170794a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
