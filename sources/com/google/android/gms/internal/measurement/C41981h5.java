package com.google.android.gms.internal.measurement;

import com.urbanairship.util.C9647e0;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h5 */
public final class C41981h5 extends C42177s9 implements C42263xa {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C41981h5 zzd;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    /* access modifiers changed from: private */
    public C42296z9 zzG = C42177s9.m170821q();
    private String zzH = "";
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL = "";
    private long zzM;
    private long zzN;
    private String zzO = "";
    private String zzP = "";
    private int zzQ;
    private String zzR = "";
    private C42035k5 zzS;
    private C42262x9 zzT = C42177s9.m170818n();
    private long zzU;
    private long zzV;
    private String zzW = "";
    private String zzX = "";
    private int zzY;
    private boolean zzZ;
    private String zzaa = "";
    private boolean zzab;
    private C41891c5 zzac;
    private String zzad = "";
    private C42296z9 zzae = C42177s9.m170821q();
    private String zzaf = "";
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public C42296z9 zzh = C42177s9.m170821q();
    private C42296z9 zzi = C42177s9.m170821q();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        C41981h5 h5Var = new C41981h5();
        zzd = h5Var;
        C42177s9.m170825w(C41981h5.class, h5Var);
    }

    /* renamed from: C0 */
    public static /* synthetic */ void m170087C0(C41981h5 h5Var, Iterable iterable) {
        h5Var.mo136982e1();
        C41948f8.m169878d(iterable, h5Var.zzh);
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m170088D0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zzf |= 8192;
        h5Var.zzad = str;
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m170089E0(C41981h5 h5Var) {
        h5Var.zzf &= -8193;
        h5Var.zzad = zzd.zzad;
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m170090F0(C41981h5 h5Var, Iterable iterable) {
        C42296z9 z9Var = h5Var.zzae;
        if (!z9Var.mo136871d()) {
            h5Var.zzae = C42177s9.m170822r(z9Var);
        }
        C41948f8.m169878d(iterable, h5Var.zzae);
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m170092H0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zzf |= 16384;
        h5Var.zzaf = str;
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m170093I0(C41981h5 h5Var, long j) {
        h5Var.zzf |= 32768;
        h5Var.zzag = j;
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m170094J0(C41981h5 h5Var, int i) {
        h5Var.mo136982e1();
        h5Var.zzh.remove(i);
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m170095K0(C41981h5 h5Var, int i, C42139q5 q5Var) {
        q5Var.getClass();
        h5Var.mo136983f1();
        h5Var.zzi.set(i, q5Var);
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m170096L0(C41981h5 h5Var, C42139q5 q5Var) {
        q5Var.getClass();
        h5Var.mo136983f1();
        h5Var.zzi.add(q5Var);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m170097M0(C41981h5 h5Var, Iterable iterable) {
        h5Var.mo136983f1();
        C41948f8.m169878d(iterable, h5Var.zzi);
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m170098O0(C41981h5 h5Var, int i) {
        h5Var.mo136983f1();
        h5Var.zzi.remove(i);
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m170099P0(C41981h5 h5Var, long j) {
        h5Var.zze |= 2;
        h5Var.zzj = j;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m170100Q0(C41981h5 h5Var, long j) {
        h5Var.zze |= 4;
        h5Var.zzk = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m170101R(C41981h5 h5Var) {
        h5Var.zze &= Integer.MAX_VALUE;
        h5Var.zzO = zzd.zzO;
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m170102R0(C41981h5 h5Var, long j) {
        h5Var.zze |= 8;
        h5Var.zzl = j;
    }

    /* renamed from: S */
    public static /* synthetic */ void m170103S(C41981h5 h5Var, int i) {
        h5Var.zzf |= 2;
        h5Var.zzQ = i;
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m170104S0(C41981h5 h5Var, long j) {
        h5Var.zze |= 16;
        h5Var.zzm = j;
    }

    /* renamed from: S1 */
    public static C41963g5 m170105S1() {
        return (C41963g5) zzd.mo137277j();
    }

    /* renamed from: T */
    public static /* synthetic */ void m170106T(C41981h5 h5Var, int i, C42240w4 w4Var) {
        w4Var.getClass();
        h5Var.mo136982e1();
        h5Var.zzh.set(i, w4Var);
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m170107T0(C41981h5 h5Var) {
        h5Var.zze &= -17;
        h5Var.zzm = 0;
    }

    /* renamed from: U */
    public static /* synthetic */ void m170109U(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zzf |= 4;
        h5Var.zzR = str;
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m170110U0(C41981h5 h5Var, long j) {
        h5Var.zze |= 32;
        h5Var.zzn = j;
    }

    /* renamed from: V */
    public static /* synthetic */ void m170111V(C41981h5 h5Var, C42035k5 k5Var) {
        k5Var.getClass();
        h5Var.zzS = k5Var;
        h5Var.zzf |= 8;
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m170112V0(C41981h5 h5Var) {
        h5Var.zze &= -33;
        h5Var.zzn = 0;
    }

    /* renamed from: W */
    public static /* synthetic */ void m170113W(C41981h5 h5Var, Iterable iterable) {
        int i;
        C42262x9 x9Var = h5Var.zzT;
        if (!x9Var.mo136871d()) {
            int size = x9Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            h5Var.zzT = x9Var.mo137322v(i);
        }
        C41948f8.m169878d(iterable, h5Var.zzT);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m170114W0(C41981h5 h5Var, String str) {
        h5Var.zze |= 64;
        h5Var.zzo = "android";
    }

    /* renamed from: X */
    public static /* synthetic */ void m170115X(C41981h5 h5Var, C42240w4 w4Var) {
        w4Var.getClass();
        h5Var.mo136982e1();
        h5Var.zzh.add(w4Var);
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m170116X0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 128;
        h5Var.zzp = str;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m170117Y(C41981h5 h5Var, long j) {
        h5Var.zzf |= 16;
        h5Var.zzU = j;
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m170118Y0(C41981h5 h5Var) {
        h5Var.zze &= -129;
        h5Var.zzp = zzd.zzp;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m170119Z(C41981h5 h5Var, long j) {
        h5Var.zzf |= 32;
        h5Var.zzV = j;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m170120Z0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 256;
        h5Var.zzq = str;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m170121a0(C41981h5 h5Var, String str) {
        h5Var.zzf |= 128;
        h5Var.zzX = str;
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m170122a1(C41981h5 h5Var) {
        h5Var.zze &= -257;
        h5Var.zzq = zzd.zzq;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m170123b1(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 512;
        h5Var.zzr = str;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m170124c0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 2048;
        h5Var.zzt = str;
    }

    /* renamed from: c1 */
    public static /* synthetic */ void m170125c1(C41981h5 h5Var, int i) {
        h5Var.zze |= 1024;
        h5Var.zzs = i;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m170126d0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 4096;
        h5Var.zzu = str;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m170127e0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 8192;
        h5Var.zzv = str;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m170128f0(C41981h5 h5Var, long j) {
        h5Var.zze |= 16384;
        h5Var.zzw = j;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m170129g0(C41981h5 h5Var, long j) {
        h5Var.zze |= 32768;
        h5Var.zzx = 76003;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m170130h0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 65536;
        h5Var.zzy = str;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m170131i0(C41981h5 h5Var) {
        h5Var.zze &= -65537;
        h5Var.zzy = zzd.zzy;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m170132j0(C41981h5 h5Var, boolean z) {
        h5Var.zze |= 131072;
        h5Var.zzz = z;
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m170133k0(C41981h5 h5Var) {
        h5Var.zze &= -131073;
        h5Var.zzz = false;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m170134l0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 262144;
        h5Var.zzA = str;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m170135m0(C41981h5 h5Var) {
        h5Var.zze &= -262145;
        h5Var.zzA = zzd.zzA;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m170136n0(C41981h5 h5Var, long j) {
        h5Var.zze |= 524288;
        h5Var.zzB = j;
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m170137o0(C41981h5 h5Var, int i) {
        h5Var.zze |= 1048576;
        h5Var.zzC = i;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m170138p0(C41981h5 h5Var, String str) {
        h5Var.zze |= 2097152;
        h5Var.zzD = str;
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m170139q0(C41981h5 h5Var) {
        h5Var.zze &= -2097153;
        h5Var.zzD = zzd.zzD;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m170140r0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 4194304;
        h5Var.zzE = str;
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m170141s0(C41981h5 h5Var, boolean z) {
        h5Var.zze |= 8388608;
        h5Var.zzF = z;
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m170142t0(C41981h5 h5Var, Iterable iterable) {
        C42296z9 z9Var = h5Var.zzG;
        if (!z9Var.mo136871d()) {
            h5Var.zzG = C42177s9.m170822r(z9Var);
        }
        C41948f8.m169878d(iterable, h5Var.zzG);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m170144v0(C41981h5 h5Var, String str) {
        str.getClass();
        h5Var.zze |= 16777216;
        h5Var.zzH = str;
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m170145w0(C41981h5 h5Var, int i) {
        h5Var.zze |= C9647e0.f26435a;
        h5Var.zzI = i;
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m170146x0(C41981h5 h5Var, int i) {
        h5Var.zze |= 1;
        h5Var.zzg = 1;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m170147y0(C41981h5 h5Var) {
        h5Var.zze &= -268435457;
        h5Var.zzL = zzd.zzL;
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m170148z0(C41981h5 h5Var, long j) {
        h5Var.zze |= 536870912;
        h5Var.zzM = j;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", C42240w4.class, "zzi", C42139q5.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C42172s4.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", C42104o4.f106321a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i2 == 3) {
            return new C41981h5();
        } else {
            if (i2 == 4) {
                return new C41963g5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    /* renamed from: A0 */
    public final boolean mo136941A0() {
        return this.zzz;
    }

    /* renamed from: A1 */
    public final int mo136942A1() {
        return this.zzh.size();
    }

    /* renamed from: B */
    public final String mo136943B() {
        return this.zzt;
    }

    /* renamed from: B0 */
    public final boolean mo136944B0() {
        return this.zzF;
    }

    /* renamed from: B1 */
    public final int mo136945B1() {
        return this.zzg;
    }

    /* renamed from: C */
    public final String mo136946C() {
        return this.zzv;
    }

    /* renamed from: C1 */
    public final int mo136947C1() {
        return this.zzQ;
    }

    /* renamed from: D */
    public final String mo136948D() {
        return this.zzX;
    }

    /* renamed from: D1 */
    public final int mo136949D1() {
        return this.zzs;
    }

    /* renamed from: E */
    public final String mo136950E() {
        return this.zzq;
    }

    /* renamed from: E1 */
    public final int mo136951E1() {
        return this.zzi.size();
    }

    /* renamed from: F */
    public final String mo136952F() {
        return this.zzO;
    }

    /* renamed from: F1 */
    public final long mo136953F1() {
        return this.zzM;
    }

    /* renamed from: G */
    public final String mo136954G() {
        return this.zzH;
    }

    /* renamed from: G1 */
    public final long mo136955G1() {
        return this.zzB;
    }

    /* renamed from: H */
    public final String mo136956H() {
        return this.zzE;
    }

    /* renamed from: H1 */
    public final long mo136957H1() {
        return this.zzU;
    }

    /* renamed from: I */
    public final String mo136958I() {
        return this.zzD;
    }

    /* renamed from: I1 */
    public final long mo136959I1() {
        return this.zzl;
    }

    /* renamed from: J */
    public final String mo136960J() {
        return this.zzp;
    }

    /* renamed from: J1 */
    public final long mo136961J1() {
        return this.zzw;
    }

    /* renamed from: K */
    public final String mo136962K() {
        return this.zzo;
    }

    /* renamed from: K1 */
    public final long mo136963K1() {
        return this.zzn;
    }

    /* renamed from: L */
    public final String mo136964L() {
        return this.zzy;
    }

    /* renamed from: M */
    public final String mo136965M() {
        return this.zzad;
    }

    /* renamed from: M1 */
    public final long mo136966M1() {
        return this.zzm;
    }

    /* renamed from: N */
    public final String mo136967N() {
        return this.zzr;
    }

    /* renamed from: N1 */
    public final long mo136968N1() {
        return this.zzk;
    }

    /* renamed from: O */
    public final List mo136969O() {
        return this.zzG;
    }

    /* renamed from: O1 */
    public final long mo136970O1() {
        return this.zzag;
    }

    /* renamed from: P */
    public final List mo136971P() {
        return this.zzh;
    }

    /* renamed from: P1 */
    public final long mo136972P1() {
        return this.zzj;
    }

    /* renamed from: Q */
    public final List mo136973Q() {
        return this.zzi;
    }

    /* renamed from: Q1 */
    public final long mo136974Q1() {
        return this.zzx;
    }

    /* renamed from: R1 */
    public final C42240w4 mo136975R1(int i) {
        return (C42240w4) this.zzh.get(i);
    }

    /* renamed from: U1 */
    public final C42139q5 mo136976U1(int i) {
        return (C42139q5) this.zzi.get(i);
    }

    /* renamed from: V1 */
    public final String mo136977V1() {
        return this.zzR;
    }

    /* renamed from: W1 */
    public final String mo136978W1() {
        return this.zzu;
    }

    /* renamed from: X1 */
    public final String mo136979X1() {
        return this.zzA;
    }

    /* renamed from: b0 */
    public final int mo136980b0() {
        return this.zzI;
    }

    /* renamed from: d1 */
    public final int mo136981d1() {
        return this.zzC;
    }

    /* renamed from: e1 */
    public final void mo136982e1() {
        C42296z9 z9Var = this.zzh;
        if (!z9Var.mo136871d()) {
            this.zzh = C42177s9.m170822r(z9Var);
        }
    }

    /* renamed from: f1 */
    public final void mo136983f1() {
        C42296z9 z9Var = this.zzi;
        if (!z9Var.mo136871d()) {
            this.zzi = C42177s9.m170822r(z9Var);
        }
    }

    /* renamed from: g1 */
    public final boolean mo136984g1() {
        return (this.zze & C9647e0.f26435a) != 0;
    }

    /* renamed from: h1 */
    public final boolean mo136985h1() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: i1 */
    public final boolean mo136986i1() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo136987j1() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo136988k1() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo136989l1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo136990m1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo136991n1() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo136992o1() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo136993p1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: q1 */
    public final boolean mo136994q1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: r1 */
    public final boolean mo136995r1() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: s1 */
    public final boolean mo136996s1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: t1 */
    public final boolean mo136997t1() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo136998u1() {
        return (this.zzf & 8192) != 0;
    }

    /* renamed from: v1 */
    public final boolean mo136999v1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: w1 */
    public final boolean mo137000w1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: x1 */
    public final boolean mo137001x1() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: y1 */
    public final boolean mo137002y1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: z1 */
    public final boolean mo137003z1() {
        return (this.zze & 32768) != 0;
    }
}
