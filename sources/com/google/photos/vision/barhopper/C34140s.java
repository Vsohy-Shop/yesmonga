package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39057u2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39073w0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;
import java.util.List;

/* renamed from: com.google.photos.vision.barhopper.s */
public final class C34140s extends C39003o2<C34140s, C34139r> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34140s zza;
    private byte zzA = 2;
    private int zze;
    private int zzf;
    private zzdc zzg;
    private String zzh;
    private int zzi;
    private C34121h0 zzj;
    private C34135o0 zzk;
    private C39073w0 zzl;
    private C34122i zzm;
    private C34138q zzn;
    private C34128l zzo;
    private C34114e zzp;
    private C34117f0 zzq;
    private C34125j0 zzr;
    private C34109b0 zzs;
    private C39075w2<C34118g> zzt;
    private C39057u2 zzu;
    private String zzv;
    private C39075w2<C34118g> zzw;
    private boolean zzx;
    private double zzy;
    private zzdc zzz;

    static {
        C34140s sVar = new C34140s();
        zza = sVar;
        C39003o2.m160640w(C34140s.class, sVar);
    }

    public C34140s() {
        zzdc zzdc = zzdc.f99077a;
        this.zzg = zzdc;
        this.zzh = "";
        this.zzt = C39003o2.m160636s();
        this.zzu = C39003o2.m160635p();
        this.zzv = "";
        this.zzw = C39003o2.m160636s();
        this.zzx = true;
        this.zzz = zzdc;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m137165Q(C34140s sVar, int i, C34118g gVar) {
        gVar.getClass();
        C39075w2<C34118g> w2Var = sVar.zzt;
        if (!w2Var.mo122767d()) {
            sVar.zzt = C39003o2.m160637t(w2Var);
        }
        sVar.zzt.set(i, gVar);
    }

    /* renamed from: B */
    public final int mo99120B() {
        int a = C34146y.m137194a(this.zzi);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: C */
    public final int mo99121C() {
        return this.zzt.size();
    }

    /* renamed from: D */
    public final C39073w0 mo99122D() {
        C39073w0 w0Var = this.zzl;
        if (w0Var == null) {
            return C39073w0.m160941C();
        }
        return w0Var;
    }

    /* renamed from: F */
    public final C34117f0 mo99123F() {
        C34117f0 f0Var = this.zzq;
        if (f0Var == null) {
            return C34117f0.m137092E();
        }
        return f0Var;
    }

    /* renamed from: G */
    public final C34121h0 mo99124G() {
        C34121h0 h0Var = this.zzj;
        if (h0Var == null) {
            return C34121h0.m137109D();
        }
        return h0Var;
    }

    /* renamed from: H */
    public final C34125j0 mo99125H() {
        C34125j0 j0Var = this.zzr;
        if (j0Var == null) {
            return C34125j0.m137125C();
        }
        return j0Var;
    }

    /* renamed from: I */
    public final C34135o0 mo99126I() {
        C34135o0 o0Var = this.zzk;
        if (o0Var == null) {
            return C34135o0.m137150C();
        }
        return o0Var;
    }

    /* renamed from: J */
    public final C34114e mo99127J() {
        C34114e eVar = this.zzp;
        if (eVar == null) {
            return C34114e.m137085E();
        }
        return eVar;
    }

    /* renamed from: K */
    public final C34122i mo99128K() {
        C34122i iVar = this.zzm;
        if (iVar == null) {
            return C34122i.m137119C();
        }
        return iVar;
    }

    /* renamed from: L */
    public final C34128l mo99129L() {
        C34128l lVar = this.zzo;
        if (lVar == null) {
            return C34128l.m137142C();
        }
        return lVar;
    }

    /* renamed from: M */
    public final C34138q mo99130M() {
        C34138q qVar = this.zzn;
        if (qVar == null) {
            return C34138q.m137158C();
        }
        return qVar;
    }

    /* renamed from: N */
    public final zzdc mo99131N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final String mo99132O() {
        return this.zzh;
    }

    /* renamed from: P */
    public final List<C34118g> mo99133P() {
        return this.zzt;
    }

    /* renamed from: R */
    public final boolean mo99134R() {
        return (this.zze & 2048) != 0;
    }

    /* renamed from: S */
    public final boolean mo99135S() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: T */
    public final boolean mo99136T() {
        return (this.zze & 4096) != 0;
    }

    /* renamed from: U */
    public final boolean mo99137U() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: V */
    public final boolean mo99138V() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: W */
    public final boolean mo99139W() {
        return (this.zze & 64) != 0;
    }

    /* renamed from: X */
    public final boolean mo99140X() {
        return (this.zze & 128) != 0;
    }

    /* renamed from: Y */
    public final boolean mo99141Y() {
        return (this.zze & 512) != 0;
    }

    /* renamed from: Z */
    public final boolean mo99142Z() {
        return (this.zze & 256) != 0;
    }

    /* renamed from: a0 */
    public final int mo99143a0() {
        int a = C34143v.m137192a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C34118g> cls = C34118g.class;
            return C39003o2.m160639v(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᔌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᔌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zze", "zzf", C34142u.f82775a, "zzg", "zzh", "zzi", C34145x.f82777a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", cls, "zzv", "zzw", cls, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy"});
        } else if (i2 == 3) {
            return new C34140s();
        } else {
            if (i2 == 4) {
                return new C34139r((C34108b) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzA = b;
            return null;
        }
    }
}
