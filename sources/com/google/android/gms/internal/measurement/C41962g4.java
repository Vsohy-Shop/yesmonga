package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g4 */
public final class C41962g4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41962g4 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C41962g4 g4Var = new C41962g4();
        zza = g4Var;
        C42177s9.m170825w(C41962g4.class, g4Var);
    }

    /* renamed from: E */
    public static /* synthetic */ void m169914E(C41962g4 g4Var, String str) {
        str.getClass();
        g4Var.zzd |= 1;
        g4Var.zze = str;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C41962g4();
        } else {
            if (i2 == 4) {
                return new C41944f4((C41872b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo136791B() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String mo136792D() {
        return this.zze;
    }

    /* renamed from: F */
    public final boolean mo136793F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo136794G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo136795H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo136796I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo136797J() {
        return (this.zzd & 8) != 0;
    }
}
