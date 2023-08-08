package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.analytics.C40379e;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.google.android.gms.internal.gtm.u0 */
public final class C41607u0 {

    /* renamed from: p */
    public static volatile C41607u0 f105028p;

    /* renamed from: a */
    public final Context f105029a;

    /* renamed from: b */
    public final Context f105030b;

    /* renamed from: c */
    public final C40979g f105031c = C40985k.m166636d();

    /* renamed from: d */
    public final C41560s1 f105032d = new C41560s1(this);

    /* renamed from: e */
    public final C41202d4 f105033e;

    /* renamed from: f */
    public final C40372a0 f105034f;

    /* renamed from: g */
    public final C41487p0 f105035g;

    /* renamed from: h */
    public final C41680x1 f105036h;

    /* renamed from: i */
    public final C41635v4 f105037i;

    /* renamed from: j */
    public final C41346j4 f105038j;

    /* renamed from: k */
    public final C40379e f105039k;

    /* renamed from: l */
    public final C41440n1 f105040l;

    /* renamed from: m */
    public final C41294h0 f105041m;

    /* renamed from: n */
    public final C41247f1 f105042n;

    /* renamed from: o */
    public final C41656w1 f105043o;

    public C41607u0(C41631v0 v0Var) {
        Context a = v0Var.mo135952a();
        C40843u.m166203m(a, "Application context can't be null");
        Context b = v0Var.mo135953b();
        C40843u.m166202l(b);
        this.f105029a = a;
        this.f105030b = b;
        C41202d4 d4Var = new C41202d4(this);
        d4Var.mo135795U();
        this.f105033e = d4Var;
        C41202d4 m = mo135902m();
        String str = C41559s0.f104933a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        m.mo135757t(sb.toString());
        C41346j4 j4Var = new C41346j4(this);
        j4Var.mo135795U();
        this.f105038j = j4Var;
        C41635v4 v4Var = new C41635v4(this);
        v4Var.mo135795U();
        this.f105037i = v4Var;
        C41487p0 p0Var = new C41487p0(this, v0Var);
        C41440n1 n1Var = new C41440n1(this);
        C41294h0 h0Var = new C41294h0(this);
        C41247f1 f1Var = new C41247f1(this);
        C41656w1 w1Var = new C41656w1(this);
        C40372a0 b2 = C40372a0.m164212b(a);
        b2.mo133263j(new C41583t0(this));
        this.f105034f = b2;
        C40379e eVar = new C40379e(this);
        n1Var.mo135795U();
        this.f105040l = n1Var;
        h0Var.mo135795U();
        this.f105041m = h0Var;
        f1Var.mo135795U();
        this.f105042n = f1Var;
        w1Var.mo135795U();
        this.f105043o = w1Var;
        C41680x1 x1Var = new C41680x1(this);
        x1Var.mo135795U();
        this.f105036h = x1Var;
        p0Var.mo135795U();
        this.f105035g = p0Var;
        eVar.mo133290w();
        this.f105039k = eVar;
        p0Var.mo135700q0();
    }

    /* renamed from: g */
    public static C41607u0 m168444g(Context context) {
        C40843u.m166202l(context);
        if (f105028p == null) {
            synchronized (C41607u0.class) {
                if (f105028p == null) {
                    C40979g d = C40985k.m166636d();
                    long c = d.mo134770c();
                    C41607u0 u0Var = new C41607u0(new C41631v0(context));
                    f105028p = u0Var;
                    C40379e.m164229v();
                    long c2 = d.mo134770c() - c;
                    long longValue = C41634v3.f105113R.mo135909b().longValue();
                    if (c2 > longValue) {
                        u0Var.mo135902m().mo135731B("Slow initialization (ms)", Long.valueOf(c2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f105028p;
    }

    /* renamed from: s */
    public static final void m168445s(C41535r0 r0Var) {
        C40843u.m166203m(r0Var, "Analytics service not created/initialized");
        C40843u.m166192b(r0Var.mo135796V(), "Analytics service not initialized");
    }

    /* renamed from: a */
    public final Context mo135891a() {
        return this.f105029a;
    }

    /* renamed from: b */
    public final Context mo135892b() {
        return this.f105030b;
    }

    /* renamed from: c */
    public final C40379e mo135893c() {
        C40843u.m166202l(this.f105039k);
        C40843u.m166192b(this.f105039k.mo133293z(), "Analytics instance not initialized");
        return this.f105039k;
    }

    /* renamed from: d */
    public final C40372a0 mo135894d() {
        C40843u.m166202l(this.f105034f);
        return this.f105034f;
    }

    /* renamed from: e */
    public final C41294h0 mo135895e() {
        m168445s(this.f105041m);
        return this.f105041m;
    }

    /* renamed from: f */
    public final C41487p0 mo135896f() {
        m168445s(this.f105035g);
        return this.f105035g;
    }

    /* renamed from: h */
    public final C41247f1 mo135897h() {
        m168445s(this.f105042n);
        return this.f105042n;
    }

    /* renamed from: i */
    public final C41440n1 mo135898i() {
        m168445s(this.f105040l);
        return this.f105040l;
    }

    /* renamed from: j */
    public final C41560s1 mo135899j() {
        return this.f105032d;
    }

    /* renamed from: k */
    public final C41656w1 mo135900k() {
        return this.f105043o;
    }

    /* renamed from: l */
    public final C41680x1 mo135901l() {
        m168445s(this.f105036h);
        return this.f105036h;
    }

    /* renamed from: m */
    public final C41202d4 mo135902m() {
        m168445s(this.f105033e);
        return this.f105033e;
    }

    /* renamed from: n */
    public final C41202d4 mo135903n() {
        return this.f105033e;
    }

    /* renamed from: o */
    public final C41346j4 mo135904o() {
        m168445s(this.f105038j);
        return this.f105038j;
    }

    /* renamed from: p */
    public final C41346j4 mo135905p() {
        C41346j4 j4Var = this.f105038j;
        if (j4Var == null || !j4Var.mo135796V()) {
            return null;
        }
        return this.f105038j;
    }

    /* renamed from: q */
    public final C41635v4 mo135906q() {
        m168445s(this.f105037i);
        return this.f105037i;
    }

    /* renamed from: r */
    public final C40979g mo135907r() {
        return this.f105031c;
    }
}
