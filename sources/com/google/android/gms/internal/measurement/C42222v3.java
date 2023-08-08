package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
public final class C42222v3 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42222v3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C42103o3 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C42222v3 v3Var = new C42222v3();
        zza = v3Var;
        C42177s9.m170825w(C42222v3.class, v3Var);
    }

    /* renamed from: D */
    public static C42205u3 m170918D() {
        return (C42205u3) zza.mo137277j();
    }

    /* renamed from: G */
    public static /* synthetic */ void m170920G(C42222v3 v3Var, String str) {
        v3Var.zzd |= 2;
        v3Var.zzf = str;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C42222v3();
        } else {
            if (i2 == 4) {
                return new C42205u3((C41997i3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137346B() {
        return this.zze;
    }

    /* renamed from: C */
    public final C42103o3 mo137347C() {
        C42103o3 o3Var = this.zzg;
        return o3Var == null ? C42103o3.m170631C() : o3Var;
    }

    /* renamed from: F */
    public final String mo137348F() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo137349H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo137350I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean mo137351J() {
        return this.zzj;
    }

    /* renamed from: K */
    public final boolean mo137352K() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: L */
    public final boolean mo137353L() {
        return (this.zzd & 32) != 0;
    }
}
