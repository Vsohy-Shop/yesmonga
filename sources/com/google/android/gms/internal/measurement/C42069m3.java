package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m3 */
public final class C42069m3 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42069m3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C42296z9 zzg = C42177s9.m170821q();
    private boolean zzh;
    private C42188t3 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C42069m3 m3Var = new C42069m3();
        zza = m3Var;
        C42177s9.m170825w(C42069m3.class, m3Var);
    }

    /* renamed from: D */
    public static C42051l3 m170517D() {
        return (C42051l3) zza.mo137277j();
    }

    /* renamed from: J */
    public static /* synthetic */ void m170519J(C42069m3 m3Var, String str) {
        m3Var.zzd |= 2;
        m3Var.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m170520K(C42069m3 m3Var, int i, C42103o3 o3Var) {
        o3Var.getClass();
        C42296z9 z9Var = m3Var.zzg;
        if (!z9Var.mo136871d()) {
            m3Var.zzg = C42177s9.m170822r(z9Var);
        }
        m3Var.zzg.set(i, o3Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C42103o3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C42069m3();
        } else {
            if (i2 == 4) {
                return new C42051l3((C41997i3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137129B() {
        return this.zzg.size();
    }

    /* renamed from: C */
    public final int mo137130C() {
        return this.zze;
    }

    /* renamed from: F */
    public final C42103o3 mo137131F(int i) {
        return (C42103o3) this.zzg.get(i);
    }

    /* renamed from: G */
    public final C42188t3 mo137132G() {
        C42188t3 t3Var = this.zzi;
        return t3Var == null ? C42188t3.m170850C() : t3Var;
    }

    /* renamed from: H */
    public final String mo137133H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List mo137134I() {
        return this.zzg;
    }

    /* renamed from: L */
    public final boolean mo137135L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final boolean mo137136M() {
        return this.zzk;
    }

    /* renamed from: N */
    public final boolean mo137137N() {
        return this.zzl;
    }

    /* renamed from: O */
    public final boolean mo137138O() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: P */
    public final boolean mo137139P() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Q */
    public final boolean mo137140Q() {
        return (this.zzd & 64) != 0;
    }
}
