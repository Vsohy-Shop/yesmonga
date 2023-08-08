package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u4 */
public final class C42206u4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42206u4 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C42206u4 u4Var = new C42206u4();
        zza = u4Var;
        C42177s9.m170825w(C42206u4.class, u4Var);
    }

    /* renamed from: D */
    public static C42189t4 m170892D() {
        return (C42189t4) zza.mo137277j();
    }

    /* renamed from: F */
    public static /* synthetic */ void m170894F(C42206u4 u4Var, int i) {
        u4Var.zzd |= 1;
        u4Var.zze = i;
    }

    /* renamed from: G */
    public static /* synthetic */ void m170895G(C42206u4 u4Var, long j) {
        u4Var.zzd |= 2;
        u4Var.zzf = j;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C42206u4();
        } else {
            if (i2 == 4) {
                return new C42189t4((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137337B() {
        return this.zze;
    }

    /* renamed from: C */
    public final long mo137338C() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo137339H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo137340I() {
        return (this.zzd & 1) != 0;
    }
}
