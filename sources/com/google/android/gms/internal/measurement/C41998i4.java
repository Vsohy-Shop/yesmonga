package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i4 */
public final class C41998i4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41998i4 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private C42296z9 zzh = C42177s9.m170821q();
    private C42296z9 zzi = C42177s9.m170821q();
    /* access modifiers changed from: private */
    public C42296z9 zzj = C42177s9.m170821q();
    private String zzk = "";
    private boolean zzl;
    private C42296z9 zzm = C42177s9.m170821q();
    private C42296z9 zzn = C42177s9.m170821q();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    static {
        C41998i4 i4Var = new C41998i4();
        zza = i4Var;
        C42177s9.m170825w(C41998i4.class, i4Var);
    }

    /* renamed from: F */
    public static C41980h4 m170256F() {
        return (C41980h4) zza.mo137277j();
    }

    /* renamed from: H */
    public static C41998i4 m170258H() {
        return zza;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m170259Q(C41998i4 i4Var, int i, C41962g4 g4Var) {
        g4Var.getClass();
        C42296z9 z9Var = i4Var.zzi;
        if (!z9Var.mo136871d()) {
            i4Var.zzi = C42177s9.m170822r(z9Var);
        }
        i4Var.zzi.set(i, g4Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C42070m4.class, "zzi", C41962g4.class, "zzj", C42033k3.class, "zzk", "zzl", "zzm", C42258x5.class, "zzn", C41926e4.class, "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new C41998i4();
        } else {
            if (i2 == 4) {
                return new C41980h4((C41872b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137015B() {
        return this.zzm.size();
    }

    /* renamed from: C */
    public final int mo137016C() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final long mo137017D() {
        return this.zze;
    }

    /* renamed from: E */
    public final C41962g4 mo137018E(int i) {
        return (C41962g4) this.zzi.get(i);
    }

    /* renamed from: I */
    public final String mo137019I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo137020J() {
        return this.zzq;
    }

    /* renamed from: K */
    public final String mo137021K() {
        return this.zzp;
    }

    /* renamed from: L */
    public final String mo137022L() {
        return this.zzo;
    }

    /* renamed from: M */
    public final List mo137023M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final List mo137024N() {
        return this.zzn;
    }

    /* renamed from: O */
    public final List mo137025O() {
        return this.zzm;
    }

    /* renamed from: P */
    public final List mo137026P() {
        return this.zzh;
    }

    /* renamed from: S */
    public final boolean mo137027S() {
        return this.zzl;
    }

    /* renamed from: T */
    public final boolean mo137028T() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: U */
    public final boolean mo137029U() {
        return (this.zzd & 1) != 0;
    }
}
