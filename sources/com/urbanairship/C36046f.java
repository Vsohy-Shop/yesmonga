package com.urbanairship;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.urbanairship.C36075v;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36035g;
import com.urbanairship.app.C36039i;

@Deprecated
/* renamed from: com.urbanairship.f */
public class C36046f extends C36040b {

    /* renamed from: j */
    public static final String f89053j = "com.urbanairship.application.metrics.LAST_OPEN";

    /* renamed from: k */
    public static final String f89054k = "com.urbanairship.application.metrics.APP_VERSION";

    /* renamed from: f */
    public final C36031c f89055f;

    /* renamed from: g */
    public final C36030b f89056g;

    /* renamed from: h */
    public final C36075v f89057h;

    /* renamed from: i */
    public boolean f89058i;

    /* renamed from: com.urbanairship.f$a */
    public class C36047a extends C36039i {

        /* renamed from: a */
        public final /* synthetic */ C36075v f89059a;

        public C36047a(C36075v vVar) {
            this.f89059a = vVar;
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            if (this.f89059a.mo107872f(16, 1)) {
                C36046f.this.mo107786p().mo107853r(C36046f.f89053j, j);
            }
        }
    }

    /* renamed from: com.urbanairship.f$b */
    public class C36048b implements C36075v.C36077b {
        public C36048b() {
        }

        /* renamed from: a */
        public void mo17533a() {
            C36046f.this.mo107795G();
        }
    }

    public C36046f(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar) {
        this(context, uVar, vVar, C36035g.m148341t(context));
    }

    /* renamed from: A */
    public void mo17591A() {
        this.f89056g.mo18481b(this.f89055f);
    }

    /* renamed from: C */
    public boolean mo107791C() {
        return this.f89058i;
    }

    /* renamed from: D */
    public long mo107792D() {
        return UAirship.m146199k();
    }

    /* renamed from: E */
    public final long mo107793E() {
        return mo107786p().mo107846i(f89054k, -1);
    }

    @Deprecated
    /* renamed from: F */
    public long mo107794F() {
        return mo107786p().mo107846i(f89053j, -1);
    }

    /* renamed from: G */
    public final void mo107795G() {
        if (this.f89057h.mo107872f(1, 16)) {
            long k = UAirship.m146199k();
            long E = mo107793E();
            if (E > -1 && k > E) {
                this.f89058i = true;
            }
            mo107786p().mo107853r(f89054k, k);
            return;
        }
        mo107786p().mo107859x(f89054k);
        mo107786p().mo107859x(f89053j);
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        mo107795G();
        this.f89057h.mo107868a(new C36048b());
        this.f89056g.mo18485f(this.f89055f);
    }

    public C36046f(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C36030b bVar) {
        super(context, uVar);
        this.f89056g = bVar;
        this.f89057h = vVar;
        this.f89055f = new C36047a(vVar);
        this.f89058i = false;
    }
}
