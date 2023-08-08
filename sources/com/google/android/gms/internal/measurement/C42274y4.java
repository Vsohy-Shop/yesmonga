package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
public final class C42274y4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42274y4 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C42274y4 y4Var = new C42274y4();
        zza = y4Var;
        C42177s9.m170825w(C42274y4.class, y4Var);
    }

    /* renamed from: B */
    public static C42257x4 m171164B() {
        return (C42257x4) zza.mo137277j();
    }

    /* renamed from: D */
    public static /* synthetic */ void m171166D(C42274y4 y4Var, String str) {
        str.getClass();
        y4Var.zzd |= 1;
        y4Var.zze = str;
    }

    /* renamed from: E */
    public static /* synthetic */ void m171167E(C42274y4 y4Var, long j) {
        y4Var.zzd |= 2;
        y4Var.zzf = j;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C42274y4();
        } else {
            if (i2 == 4) {
                return new C42257x4((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
