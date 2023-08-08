package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.k */
public final class C41365k extends C41313hj<C41365k, C41390l> implements C41651vk {
    private static final C41578sj<Integer, zzao> zze = new C41366a();
    /* access modifiers changed from: private */
    public static final C41365k zzf;
    private int zzg;
    private int zzh = 1;
    private String zzi = "";
    /* access modifiers changed from: private */
    public C41626uj<C41365k> zzj = C41410lj.m168019t();
    /* access modifiers changed from: private */
    public C41626uj<C41365k> zzk = C41410lj.m168019t();
    /* access modifiers changed from: private */
    public C41626uj<C41365k> zzl = C41410lj.m168019t();
    private String zzm = "";
    private String zzn = "";
    private long zzo;
    private boolean zzp;
    /* access modifiers changed from: private */
    public C41626uj<C41365k> zzq = C41410lj.m168019t();
    /* access modifiers changed from: private */
    public C41554rj zzr = C41410lj.m168018s();
    private boolean zzs;
    private byte zzt = 2;

    /* renamed from: com.google.android.gms.internal.gtm.k$a */
    public class C41366a implements C41578sj<Integer, zzao> {
        /* renamed from: b */
        public zzao mo135549a(Integer num) {
            zzao b = zzao.m168957b(num.intValue());
            return b == null ? zzao.ESCAPE_HTML : b;
        }
    }

    static {
        C41365k kVar = new C41365k();
        zzf = kVar;
        C41410lj.m168023z(C41365k.class, kVar);
    }

    /* renamed from: G */
    public static /* synthetic */ void m167857G(C41365k kVar, String str) {
        str.getClass();
        kVar.zzg |= 4;
        kVar.zzm = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m167858H(C41365k kVar, String str) {
        str.getClass();
        kVar.zzg |= 8;
        kVar.zzn = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m167859I(C41365k kVar, String str) {
        str.getClass();
        kVar.zzg |= 2;
        kVar.zzi = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m167860J(C41365k kVar, long j) {
        kVar.zzg |= 16;
        kVar.zzo = j;
    }

    /* renamed from: K */
    public static /* synthetic */ void m167861K(C41365k kVar, boolean z) {
        kVar.zzg |= 32;
        kVar.zzp = z;
    }

    /* renamed from: L */
    public static /* synthetic */ void m167862L(C41365k kVar, C41365k kVar2) {
        kVar2.getClass();
        C41626uj<C41365k> ujVar = kVar.zzq;
        if (!ujVar.mo135928d()) {
            kVar.zzq = C41410lj.m168020u(ujVar);
        }
        kVar.zzq.add(kVar2);
    }

    /* renamed from: N */
    public static /* synthetic */ void m167864N(C41365k kVar, Iterable iterable) {
        int i;
        C41554rj rjVar = kVar.zzr;
        if (!rjVar.mo135928d()) {
            int size = rjVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            kVar.zzr = rjVar.mo135674v(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kVar.zzr.mo135665U(((zzao) it.next()).zza());
        }
    }

    /* renamed from: P */
    public static /* synthetic */ void m167866P(C41365k kVar, boolean z) {
        kVar.zzg |= 64;
        kVar.zzs = z;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m167867Q(C41365k kVar, C41365k kVar2) {
        kVar2.getClass();
        kVar.mo135532X();
        kVar.zzj.add(kVar2);
    }

    /* renamed from: R */
    public static /* synthetic */ void m167868R(C41365k kVar, Iterable iterable) {
        kVar.mo135532X();
        C41695xg.m168717g(iterable, kVar.zzj);
    }

    /* renamed from: V */
    public static /* synthetic */ void m167869V(C41365k kVar, int i) {
        kVar.zzh = i;
        kVar.zzg |= 1;
    }

    /* renamed from: e0 */
    public static C41390l m167870e0() {
        return (C41390l) zzf.mo135630l();
    }

    /* renamed from: g0 */
    public static C41365k m167872g0() {
        return zzf;
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m167874s0(C41365k kVar, C41365k kVar2) {
        kVar2.getClass();
        kVar.mo135533Y();
        kVar.zzk.add(kVar2);
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m167875t0(C41365k kVar, Iterable iterable) {
        kVar.mo135533Y();
        C41695xg.m168717g(iterable, kVar.zzk);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m167877v0(C41365k kVar, C41365k kVar2) {
        kVar2.getClass();
        kVar.mo135534Z();
        kVar.zzl.add(kVar2);
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m167878w0(C41365k kVar, Iterable iterable) {
        kVar.mo135534Z();
        C41695xg.m168717g(iterable, kVar.zzl);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C41365k> cls = C41365k.class;
            return C41410lj.m168022x(zzf, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0005\u0001ᔌ\u0000\u0002ဈ\u0001\u0003Л\u0004Л\u0005Л\u0006ဈ\u0002\u0007ဈ\u0003\bဂ\u0004\tဇ\u0006\n\u001e\u000bЛ\fဇ\u0005", new Object[]{"zzg", "zzh", C41486p.f104849a, "zzi", "zzj", cls, "zzk", cls, "zzl", cls, "zzm", "zzn", "zzo", "zzs", "zzr", zzao.m168958g(), "zzq", cls, "zzp"});
        } else if (i2 == 3) {
            return new C41365k();
        } else {
            if (i2 == 4) {
                return new C41390l((C41341j) null);
            }
            if (i2 == 5) {
                return zzf;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzt = b;
            return null;
        }
    }

    /* renamed from: S */
    public final boolean mo135528S() {
        return this.zzp;
    }

    /* renamed from: T */
    public final boolean mo135529T() {
        return this.zzs;
    }

    /* renamed from: U */
    public final int mo135530U() {
        int a = C41510q.m168199a(this.zzh);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: W */
    public final int mo135531W() {
        return this.zzj.size();
    }

    /* renamed from: X */
    public final void mo135532X() {
        C41626uj<C41365k> ujVar = this.zzj;
        if (!ujVar.mo135928d()) {
            this.zzj = C41410lj.m168020u(ujVar);
        }
    }

    /* renamed from: Y */
    public final void mo135533Y() {
        C41626uj<C41365k> ujVar = this.zzk;
        if (!ujVar.mo135928d()) {
            this.zzk = C41410lj.m168020u(ujVar);
        }
    }

    /* renamed from: Z */
    public final void mo135534Z() {
        C41626uj<C41365k> ujVar = this.zzl;
        if (!ujVar.mo135928d()) {
            this.zzl = C41410lj.m168020u(ujVar);
        }
    }

    /* renamed from: a0 */
    public final int mo135535a0() {
        return this.zzk.size();
    }

    /* renamed from: b0 */
    public final int mo135536b0() {
        return this.zzl.size();
    }

    /* renamed from: c0 */
    public final int mo135537c0() {
        return this.zzq.size();
    }

    /* renamed from: d0 */
    public final long mo135538d0() {
        return this.zzo;
    }

    /* renamed from: h0 */
    public final C41365k mo135539h0(int i) {
        return this.zzj.get(i);
    }

    /* renamed from: i0 */
    public final C41365k mo135540i0(int i) {
        return this.zzk.get(i);
    }

    /* renamed from: j0 */
    public final C41365k mo135541j0(int i) {
        return this.zzl.get(i);
    }

    /* renamed from: k0 */
    public final C41365k mo135542k0(int i) {
        return this.zzq.get(i);
    }

    /* renamed from: l0 */
    public final String mo135543l0() {
        return this.zzn;
    }

    /* renamed from: m0 */
    public final String mo135544m0() {
        return this.zzm;
    }

    /* renamed from: n0 */
    public final String mo135545n0() {
        return this.zzi;
    }

    /* renamed from: o0 */
    public final List<zzao> mo135546o0() {
        return new C41602tj(this.zzr, zze);
    }

    /* renamed from: p0 */
    public final List<C41365k> mo135547p0() {
        return this.zzj;
    }

    /* renamed from: q0 */
    public final List<C41365k> mo135548q0() {
        return this.zzq;
    }
}
