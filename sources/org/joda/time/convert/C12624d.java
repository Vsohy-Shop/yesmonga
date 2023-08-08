package org.joda.time.convert;

import org.joda.time.JodaTimePermission;

/* renamed from: org.joda.time.convert.d */
public final class C12624d {

    /* renamed from: f */
    public static C12624d f31101f;

    /* renamed from: a */
    public C12625e f31102a;

    /* renamed from: b */
    public C12625e f31103b;

    /* renamed from: c */
    public C12625e f31104c;

    /* renamed from: d */
    public C12625e f31105d;

    /* renamed from: e */
    public C12625e f31106e;

    public C12624d() {
        C12636o oVar = C12636o.f31115a;
        C12640s sVar = C12640s.f31119a;
        C12622b bVar = C12622b.f31100a;
        C12627f fVar = C12627f.f31111a;
        C12631j jVar = C12631j.f31112a;
        C12632k kVar = C12632k.f31113a;
        this.f31102a = new C12625e(new C12623c[]{oVar, sVar, bVar, fVar, jVar, kVar});
        this.f31103b = new C12625e(new C12623c[]{C12638q.f31117a, oVar, sVar, bVar, fVar, jVar, kVar});
        C12635n nVar = C12635n.f31114a;
        C12637p pVar = C12637p.f31116a;
        this.f31104c = new C12625e(new C12623c[]{nVar, pVar, sVar, jVar, kVar});
        this.f31105d = new C12625e(new C12623c[]{nVar, C12639r.f31118a, pVar, sVar, kVar});
        this.f31106e = new C12625e(new C12623c[]{pVar, sVar, kVar});
    }

    /* renamed from: m */
    public static C12624d m53287m() {
        if (f31101f == null) {
            f31101f = new C12624d();
        }
        return f31101f;
    }

    /* renamed from: a */
    public C12628g mo28993a(C12628g gVar) throws SecurityException {
        mo28998f();
        if (gVar == null) {
            return null;
        }
        C12628g[] gVarArr = new C12628g[1];
        this.f31104c = this.f31104c.mo29019a(gVar, gVarArr);
        return gVarArr[0];
    }

    /* renamed from: b */
    public C12629h mo28994b(C12629h hVar) throws SecurityException {
        mo28999g();
        if (hVar == null) {
            return null;
        }
        C12629h[] hVarArr = new C12629h[1];
        this.f31102a = this.f31102a.mo29019a(hVar, hVarArr);
        return hVarArr[0];
    }

    /* renamed from: c */
    public C12630i mo28995c(C12630i iVar) throws SecurityException {
        mo29000h();
        if (iVar == null) {
            return null;
        }
        C12630i[] iVarArr = new C12630i[1];
        this.f31106e = this.f31106e.mo29019a(iVar, iVarArr);
        return iVarArr[0];
    }

    /* renamed from: d */
    public C12633l mo28996d(C12633l lVar) throws SecurityException {
        mo29001i();
        if (lVar == null) {
            return null;
        }
        C12633l[] lVarArr = new C12633l[1];
        this.f31103b = this.f31103b.mo29019a(lVar, lVarArr);
        return lVarArr[0];
    }

    /* renamed from: e */
    public C12634m mo28997e(C12634m mVar) throws SecurityException {
        mo29002j();
        if (mVar == null) {
            return null;
        }
        C12634m[] mVarArr = new C12634m[1];
        this.f31105d = this.f31105d.mo29019a(mVar, mVarArr);
        return mVarArr[0];
    }

    /* renamed from: f */
    public final void mo28998f() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }

    /* renamed from: g */
    public final void mo28999g() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }

    /* renamed from: h */
    public final void mo29000h() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }

    /* renamed from: i */
    public final void mo29001i() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }

    /* renamed from: j */
    public final void mo29002j() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }

    /* renamed from: k */
    public C12628g mo29003k(Object obj) {
        Class<?> cls;
        String str;
        C12625e eVar = this.f31104c;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        C12628g gVar = (C12628g) eVar.mo29023e(cls);
        if (gVar != null) {
            return gVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No duration converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public C12628g[] mo29004l() {
        C12625e eVar = this.f31104c;
        C12628g[] gVarArr = new C12628g[eVar.mo29024g()];
        eVar.mo29020b(gVarArr);
        return gVarArr;
    }

    /* renamed from: n */
    public C12629h mo29005n(Object obj) {
        Class<?> cls;
        String str;
        C12625e eVar = this.f31102a;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        C12629h hVar = (C12629h) eVar.mo29023e(cls);
        if (hVar != null) {
            return hVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No instant converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o */
    public C12629h[] mo29006o() {
        C12625e eVar = this.f31102a;
        C12629h[] hVarArr = new C12629h[eVar.mo29024g()];
        eVar.mo29020b(hVarArr);
        return hVarArr;
    }

    /* renamed from: p */
    public C12630i mo29007p(Object obj) {
        Class<?> cls;
        String str;
        C12625e eVar = this.f31106e;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        C12630i iVar = (C12630i) eVar.mo29023e(cls);
        if (iVar != null) {
            return iVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No interval converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: q */
    public C12630i[] mo29008q() {
        C12625e eVar = this.f31106e;
        C12630i[] iVarArr = new C12630i[eVar.mo29024g()];
        eVar.mo29020b(iVarArr);
        return iVarArr;
    }

    /* renamed from: r */
    public C12633l mo29009r(Object obj) {
        Class<?> cls;
        String str;
        C12625e eVar = this.f31103b;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        C12633l lVar = (C12633l) eVar.mo29023e(cls);
        if (lVar != null) {
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No partial converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: s */
    public C12633l[] mo29010s() {
        C12625e eVar = this.f31103b;
        C12633l[] lVarArr = new C12633l[eVar.mo29024g()];
        eVar.mo29020b(lVarArr);
        return lVarArr;
    }

    /* renamed from: t */
    public C12634m mo29011t(Object obj) {
        Class<?> cls;
        String str;
        C12625e eVar = this.f31105d;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        C12634m mVar = (C12634m) eVar.mo29023e(cls);
        if (mVar != null) {
            return mVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No period converter found for type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        return "ConverterManager[" + this.f31102a.mo29024g() + " instant," + this.f31103b.mo29024g() + " partial," + this.f31104c.mo29024g() + " duration," + this.f31105d.mo29024g() + " period," + this.f31106e.mo29024g() + " interval]";
    }

    /* renamed from: u */
    public C12634m[] mo29013u() {
        C12625e eVar = this.f31105d;
        C12634m[] mVarArr = new C12634m[eVar.mo29024g()];
        eVar.mo29020b(mVarArr);
        return mVarArr;
    }

    /* renamed from: v */
    public C12628g mo29014v(C12628g gVar) throws SecurityException {
        mo28998f();
        if (gVar == null) {
            return null;
        }
        C12628g[] gVarArr = new C12628g[1];
        this.f31104c = this.f31104c.mo29022d(gVar, gVarArr);
        return gVarArr[0];
    }

    /* renamed from: w */
    public C12629h mo29015w(C12629h hVar) throws SecurityException {
        mo28999g();
        if (hVar == null) {
            return null;
        }
        C12629h[] hVarArr = new C12629h[1];
        this.f31102a = this.f31102a.mo29022d(hVar, hVarArr);
        return hVarArr[0];
    }

    /* renamed from: x */
    public C12630i mo29016x(C12630i iVar) throws SecurityException {
        mo29000h();
        if (iVar == null) {
            return null;
        }
        C12630i[] iVarArr = new C12630i[1];
        this.f31106e = this.f31106e.mo29022d(iVar, iVarArr);
        return iVarArr[0];
    }

    /* renamed from: y */
    public C12633l mo29017y(C12633l lVar) throws SecurityException {
        mo29001i();
        if (lVar == null) {
            return null;
        }
        C12633l[] lVarArr = new C12633l[1];
        this.f31103b = this.f31103b.mo29022d(lVar, lVarArr);
        return lVarArr[0];
    }

    /* renamed from: z */
    public C12634m mo29018z(C12634m mVar) throws SecurityException {
        mo29002j();
        if (mVar == null) {
            return null;
        }
        C12634m[] mVarArr = new C12634m[1];
        this.f31105d = this.f31105d.mo29022d(mVar, mVarArr);
        return mVarArr[0];
    }
}
