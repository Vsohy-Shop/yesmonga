package com.google.firebase.perf.config;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.C33278a;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.util.C33435d;
import com.google.firebase.perf.util.C33436e;
import com.google.firebase.perf.util.C33443k;

/* renamed from: com.google.firebase.perf.config.a */
public class C33307a {

    /* renamed from: d */
    public static final C33363a f80965d = C33363a.m134449e();

    /* renamed from: e */
    public static volatile C33307a f80966e;

    /* renamed from: a */
    public final RemoteConfigManager f80967a;

    /* renamed from: b */
    public C33435d f80968b;

    /* renamed from: c */
    public C33310d f80969c;

    @C0344h1
    public C33307a(@C0363p0 RemoteConfigManager remoteConfigManager, @C0363p0 C33435d dVar, @C0363p0 C33310d dVar2) {
        this.f80967a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f80968b = dVar == null ? new C33435d() : dVar;
        this.f80969c = dVar2 == null ? C33310d.m134380h() : dVar2;
    }

    @C0344h1
    /* renamed from: a */
    public static void m134327a() {
        f80966e = null;
    }

    /* renamed from: h */
    public static synchronized C33307a m134328h() {
        C33307a aVar;
        synchronized (C33307a.class) {
            if (f80966e == null) {
                f80966e = new C33307a((RemoteConfigManager) null, (C33435d) null, (C33310d) null);
            }
            aVar = f80966e;
        }
        return aVar;
    }

    /* renamed from: A */
    public long mo96340A() {
        ConfigurationConstants.C33298k f = ConfigurationConstants.C33298k.m134272f();
        C33436e<Long> q = mo96375q(f);
        if (q.mo96912d() && mo96351L(q.mo96911c().longValue())) {
            return q.mo96911c().longValue();
        }
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96351L(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96351L(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: B */
    public long mo96341B() {
        ConfigurationConstants.C33299l f = ConfigurationConstants.C33299l.m134278f();
        C33436e<Long> q = mo96375q(f);
        if (q.mo96912d() && mo96351L(q.mo96911c().longValue())) {
            return q.mo96911c().longValue();
        }
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96351L(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96351L(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: C */
    public long mo96342C() {
        ConfigurationConstants.C33300m f = ConfigurationConstants.C33300m.m134284f();
        C33436e<Long> q = mo96375q(f);
        if (q.mo96912d() && mo96354O(q.mo96911c().longValue())) {
            return q.mo96911c().longValue();
        }
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96354O(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96354O(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: D */
    public long mo96343D() {
        ConfigurationConstants.C33301n f = ConfigurationConstants.C33301n.m134290f();
        C33436e<Long> q = mo96375q(f);
        if (q.mo96912d() && mo96351L(q.mo96911c().longValue())) {
            return q.mo96911c().longValue();
        }
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96351L(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96351L(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: E */
    public long mo96344E() {
        ConfigurationConstants.C33302o f = ConfigurationConstants.C33302o.m134296f();
        C33436e<Long> q = mo96375q(f);
        if (q.mo96912d() && mo96351L(q.mo96911c().longValue())) {
            return q.mo96911c().longValue();
        }
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96351L(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96351L(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: F */
    public float mo96345F() {
        ConfigurationConstants.C33303p f = ConfigurationConstants.C33303p.m134302f();
        C33436e<Float> p = mo96374p(f);
        if (p.mo96912d()) {
            float floatValue = p.mo96911c().floatValue() / 100.0f;
            if (mo96353N(floatValue)) {
                return floatValue;
            }
        }
        C33436e<Float> w = mo96381w(f);
        if (!w.mo96912d() || !mo96353N(w.mo96911c().floatValue())) {
            C33436e<Float> d = mo96363d(f);
            if (!d.mo96912d() || !mo96353N(d.mo96911c().floatValue())) {
                return f.mo96306a().floatValue();
            }
            return d.mo96911c().floatValue();
        }
        this.f80969c.mo96394m(f.mo96307b(), w.mo96911c().floatValue());
        return w.mo96911c().floatValue();
    }

    /* renamed from: G */
    public long mo96346G() {
        ConfigurationConstants.C33304q f = ConfigurationConstants.C33304q.m134308f();
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96349J(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96349J(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: H */
    public long mo96347H() {
        ConfigurationConstants.C33305r f = ConfigurationConstants.C33305r.m134313f();
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96349J(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96349J(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: I */
    public float mo96348I() {
        ConfigurationConstants.C33306s f = ConfigurationConstants.C33306s.m134318f();
        C33436e<Float> w = mo96381w(f);
        if (!w.mo96912d() || !mo96353N(w.mo96911c().floatValue())) {
            C33436e<Float> d = mo96363d(f);
            if (!d.mo96912d() || !mo96353N(d.mo96911c().floatValue())) {
                return f.mo96306a().floatValue();
            }
            return d.mo96911c().floatValue();
        }
        this.f80969c.mo96394m(f.mo96307b(), w.mo96911c().floatValue());
        return w.mo96911c().floatValue();
    }

    /* renamed from: J */
    public final boolean mo96349J(long j) {
        return j >= 0;
    }

    /* renamed from: K */
    public final boolean mo96350K(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(C33278a.f80910e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final boolean mo96351L(long j) {
        return j >= 0;
    }

    /* renamed from: M */
    public boolean mo96352M() {
        Boolean k = mo96369k();
        if ((k == null || k.booleanValue()) && mo96372n()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean mo96353N(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    /* renamed from: O */
    public final boolean mo96354O(long j) {
        return j > 0;
    }

    /* renamed from: P */
    public final boolean mo96355P(long j) {
        return j > 0;
    }

    /* renamed from: Q */
    public void mo96356Q(Context context) {
        f80965d.mo96436i(C33443k.m134837c(context));
        this.f80969c.mo96393l(context);
    }

    /* renamed from: R */
    public void mo96357R(Context context) {
        mo96356Q(context.getApplicationContext());
    }

    @C0344h1
    /* renamed from: S */
    public void mo96358S(C33310d dVar) {
        this.f80969c = dVar;
    }

    /* renamed from: T */
    public void mo96359T(Boolean bool) {
        String b;
        if (mo96368j().booleanValue() || (b = ConfigurationConstants.C33289b.m134225f().mo96307b()) == null) {
            return;
        }
        if (bool != null) {
            this.f80969c.mo96397p(b, Boolean.TRUE.equals(bool));
        } else {
            this.f80969c.mo96386b(b);
        }
    }

    /* renamed from: U */
    public void mo96360U(C33435d dVar) {
        this.f80968b = dVar;
    }

    /* renamed from: b */
    public String mo96361b() {
        String g;
        ConfigurationConstants.LogSourceName f = ConfigurationConstants.LogSourceName.m134214f();
        if (C33278a.f80909d.booleanValue()) {
            return f.mo96306a();
        }
        String d = f.mo96308d();
        long j = -1;
        if (d != null) {
            j = ((Long) this.f80967a.getRemoteConfigValueOrDefault(d, -1L)).longValue();
        }
        String b = f.mo96307b();
        if (!ConfigurationConstants.LogSourceName.m134216h(j) || (g = ConfigurationConstants.LogSourceName.m134215g(j)) == null) {
            C33436e<String> f2 = mo96365f(f);
            if (f2.mo96912d()) {
                return f2.mo96911c();
            }
            return f.mo96306a();
        }
        this.f80969c.mo96396o(b, g);
        return g;
    }

    /* renamed from: c */
    public final C33436e<Boolean> mo96362c(C33308b<Boolean> bVar) {
        return this.f80969c.mo96388e(bVar.mo96307b());
    }

    /* renamed from: d */
    public final C33436e<Float> mo96363d(C33308b<Float> bVar) {
        return this.f80969c.mo96390g(bVar.mo96307b());
    }

    /* renamed from: e */
    public final C33436e<Long> mo96364e(C33308b<Long> bVar) {
        return this.f80969c.mo96391i(bVar.mo96307b());
    }

    /* renamed from: f */
    public final C33436e<String> mo96365f(C33308b<String> bVar) {
        return this.f80969c.mo96392j(bVar.mo96307b());
    }

    /* renamed from: g */
    public float mo96366g() {
        ConfigurationConstants.C33291d f = ConfigurationConstants.C33291d.m134236f();
        C33436e<Float> p = mo96374p(f);
        if (p.mo96912d()) {
            float floatValue = p.mo96911c().floatValue() / 100.0f;
            if (mo96353N(floatValue)) {
                return floatValue;
            }
        }
        C33436e<Float> w = mo96381w(f);
        if (!w.mo96912d() || !mo96353N(w.mo96911c().floatValue())) {
            C33436e<Float> d = mo96363d(f);
            if (!d.mo96912d() || !mo96353N(d.mo96911c().floatValue())) {
                return f.mo96306a().floatValue();
            }
            return d.mo96911c().floatValue();
        }
        this.f80969c.mo96394m(f.mo96307b(), w.mo96911c().floatValue());
        return w.mo96911c().floatValue();
    }

    /* renamed from: i */
    public boolean mo96367i() {
        ConfigurationConstants.C33290c f = ConfigurationConstants.C33290c.m134230f();
        C33436e<Boolean> o = mo96373o(f);
        if (o.mo96912d()) {
            return o.mo96911c().booleanValue();
        }
        C33436e<Boolean> v = mo96380v(f);
        if (v.mo96912d()) {
            this.f80969c.mo96397p(f.mo96307b(), v.mo96911c().booleanValue());
            return v.mo96911c().booleanValue();
        }
        C33436e<Boolean> c = mo96362c(f);
        if (c.mo96912d()) {
            return c.mo96911c().booleanValue();
        }
        return f.mo96306a().booleanValue();
    }

    @C0363p0
    /* renamed from: j */
    public Boolean mo96368j() {
        ConfigurationConstants.C33288a f = ConfigurationConstants.C33288a.m134221f();
        C33436e<Boolean> o = mo96373o(f);
        if (o.mo96912d()) {
            return o.mo96911c();
        }
        return f.mo96306a();
    }

    @C0363p0
    /* renamed from: k */
    public Boolean mo96369k() {
        if (mo96368j().booleanValue()) {
            return Boolean.FALSE;
        }
        ConfigurationConstants.C33289b f = ConfigurationConstants.C33289b.m134225f();
        C33436e<Boolean> c = mo96362c(f);
        if (c.mo96912d()) {
            return c.mo96911c();
        }
        C33436e<Boolean> o = mo96373o(f);
        if (o.mo96912d()) {
            return o.mo96911c();
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo96370l() {
        ConfigurationConstants.C33297j f = ConfigurationConstants.C33297j.m134267f();
        C33436e<Boolean> v = mo96380v(f);
        if (!v.mo96912d()) {
            C33436e<Boolean> c = mo96362c(f);
            if (c.mo96912d()) {
                return c.mo96911c().booleanValue();
            }
            return f.mo96306a().booleanValue();
        } else if (this.f80967a.isLastFetchFailed()) {
            return false;
        } else {
            this.f80969c.mo96397p(f.mo96307b(), v.mo96911c().booleanValue());
            return v.mo96911c().booleanValue();
        }
    }

    /* renamed from: m */
    public final boolean mo96371m() {
        ConfigurationConstants.C33296i f = ConfigurationConstants.C33296i.m134262f();
        C33436e<String> y = mo96383y(f);
        if (y.mo96912d()) {
            this.f80969c.mo96396o(f.mo96307b(), y.mo96911c());
            return mo96350K(y.mo96911c());
        }
        C33436e<String> f2 = mo96365f(f);
        if (f2.mo96912d()) {
            return mo96350K(f2.mo96911c());
        }
        return mo96350K(f.mo96306a());
    }

    /* renamed from: n */
    public boolean mo96372n() {
        return mo96370l() && !mo96371m();
    }

    /* renamed from: o */
    public final C33436e<Boolean> mo96373o(C33308b<Boolean> bVar) {
        return this.f80968b.mo96907b(bVar.mo96310c());
    }

    /* renamed from: p */
    public final C33436e<Float> mo96374p(C33308b<Float> bVar) {
        return this.f80968b.mo96908c(bVar.mo96310c());
    }

    /* renamed from: q */
    public final C33436e<Long> mo96375q(C33308b<Long> bVar) {
        return this.f80968b.mo96910e(bVar.mo96310c());
    }

    /* renamed from: r */
    public long mo96376r() {
        ConfigurationConstants.C33292e f = ConfigurationConstants.C33292e.m134242f();
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96349J(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96349J(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: s */
    public long mo96377s() {
        ConfigurationConstants.C33293f f = ConfigurationConstants.C33293f.m134247f();
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96349J(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96349J(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: t */
    public float mo96378t() {
        ConfigurationConstants.C33294g f = ConfigurationConstants.C33294g.m134252f();
        C33436e<Float> w = mo96381w(f);
        if (!w.mo96912d() || !mo96353N(w.mo96911c().floatValue())) {
            C33436e<Float> d = mo96363d(f);
            if (!d.mo96912d() || !mo96353N(d.mo96911c().floatValue())) {
                return f.mo96306a().floatValue();
            }
            return d.mo96911c().floatValue();
        }
        this.f80969c.mo96394m(f.mo96307b(), w.mo96911c().floatValue());
        return w.mo96911c().floatValue();
    }

    /* renamed from: u */
    public long mo96379u() {
        ConfigurationConstants.C33295h f = ConfigurationConstants.C33295h.m134257f();
        C33436e<Long> x = mo96382x(f);
        if (!x.mo96912d() || !mo96355P(x.mo96911c().longValue())) {
            C33436e<Long> e = mo96364e(f);
            if (!e.mo96912d() || !mo96355P(e.mo96911c().longValue())) {
                return f.mo96306a().longValue();
            }
            return e.mo96911c().longValue();
        }
        this.f80969c.mo96395n(f.mo96307b(), x.mo96911c().longValue());
        return x.mo96911c().longValue();
    }

    /* renamed from: v */
    public final C33436e<Boolean> mo96380v(C33308b<Boolean> bVar) {
        return this.f80967a.getBoolean(bVar.mo96308d());
    }

    /* renamed from: w */
    public final C33436e<Float> mo96381w(C33308b<Float> bVar) {
        return this.f80967a.getFloat(bVar.mo96308d());
    }

    /* renamed from: x */
    public final C33436e<Long> mo96382x(C33308b<Long> bVar) {
        return this.f80967a.getLong(bVar.mo96308d());
    }

    /* renamed from: y */
    public final C33436e<String> mo96383y(C33308b<String> bVar) {
        return this.f80967a.getString(bVar.mo96308d());
    }

    /* renamed from: z */
    public final Long mo96384z(C33308b<Long> bVar) {
        String d = bVar.mo96308d();
        if (d == null) {
            return bVar.mo96306a();
        }
        return (Long) this.f80967a.getRemoteConfigValueOrDefault(d, bVar.mo96306a());
    }
}
