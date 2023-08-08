package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
public final class C30693d6 {

    /* renamed from: A */
    public long f73297A;

    /* renamed from: B */
    public long f73298B;

    /* renamed from: C */
    public long f73299C;
    @C0363p0

    /* renamed from: D */
    public String f73300D;

    /* renamed from: E */
    public boolean f73301E;

    /* renamed from: F */
    public long f73302F;

    /* renamed from: G */
    public long f73303G;

    /* renamed from: a */
    public final C30731g5 f73304a;

    /* renamed from: b */
    public final String f73305b;
    @C0363p0

    /* renamed from: c */
    public String f73306c;
    @C0363p0

    /* renamed from: d */
    public String f73307d;
    @C0363p0

    /* renamed from: e */
    public String f73308e;
    @C0363p0

    /* renamed from: f */
    public String f73309f;

    /* renamed from: g */
    public long f73310g;

    /* renamed from: h */
    public long f73311h;

    /* renamed from: i */
    public long f73312i;
    @C0363p0

    /* renamed from: j */
    public String f73313j;

    /* renamed from: k */
    public long f73314k;
    @C0363p0

    /* renamed from: l */
    public String f73315l;

    /* renamed from: m */
    public long f73316m;

    /* renamed from: n */
    public long f73317n;

    /* renamed from: o */
    public boolean f73318o;

    /* renamed from: p */
    public boolean f73319p;
    @C0363p0

    /* renamed from: q */
    public String f73320q;
    @C0363p0

    /* renamed from: r */
    public Boolean f73321r;

    /* renamed from: s */
    public long f73322s;
    @C0363p0

    /* renamed from: t */
    public List f73323t;
    @C0363p0

    /* renamed from: u */
    public String f73324u;

    /* renamed from: v */
    public boolean f73325v;

    /* renamed from: w */
    public long f73326w;

    /* renamed from: x */
    public long f73327x;

    /* renamed from: y */
    public long f73328y;

    /* renamed from: z */
    public long f73329z;

    @C0348i1
    public C30693d6(C30731g5 g5Var, String str) {
        C40843u.m166202l(g5Var);
        C40843u.m166198h(str);
        this.f73304a = g5Var;
        this.f73305b = str;
        g5Var.mo86904f().mo86866h();
    }

    @C0348i1
    /* renamed from: A */
    public final long mo86951A() {
        this.f73304a.mo86904f().mo86866h();
        return 0;
    }

    @C0348i1
    /* renamed from: B */
    public final void mo86952B(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73312i != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73312i = j;
    }

    @C0348i1
    /* renamed from: C */
    public final void mo86953C(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        this.f73304a.mo86904f().mo86866h();
        boolean z3 = this.f73301E;
        if (this.f73310g == j) {
            z2 = false;
        }
        this.f73301E = z3 | z2;
        this.f73310g = j;
    }

    @C0348i1
    /* renamed from: D */
    public final void mo86954D(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73311h != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73311h = j;
    }

    @C0348i1
    /* renamed from: E */
    public final void mo86955E(boolean z) {
        boolean z2;
        this.f73304a.mo86904f().mo86866h();
        boolean z3 = this.f73301E;
        if (this.f73318o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f73301E = z3 | z2;
        this.f73318o = z;
    }

    @C0348i1
    /* renamed from: F */
    public final void mo86956F(@C0363p0 Boolean bool) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73321r, bool);
        this.f73321r = bool;
    }

    @C0348i1
    /* renamed from: G */
    public final void mo86957G(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73308e, str);
        this.f73308e = str;
    }

    @C0348i1
    /* renamed from: H */
    public final void mo86958H(@C0363p0 List list) {
        ArrayList arrayList;
        this.f73304a.mo86904f().mo86866h();
        if (!C30679c5.m123532a(this.f73323t, list)) {
            this.f73301E = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f73323t = arrayList;
        }
    }

    @C0348i1
    /* renamed from: I */
    public final void mo86959I(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73324u, str);
        this.f73324u = str;
    }

    @C0348i1
    /* renamed from: J */
    public final void mo86960J(boolean z) {
        boolean z2;
        this.f73304a.mo86904f().mo86866h();
        boolean z3 = this.f73301E;
        if (this.f73325v != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f73301E = z3 | z2;
        this.f73325v = z;
    }

    @C0348i1
    /* renamed from: K */
    public final void mo86961K(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73326w != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73326w = j;
    }

    @C0348i1
    /* renamed from: L */
    public final boolean mo86962L() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73319p;
    }

    @C0348i1
    /* renamed from: M */
    public final boolean mo86963M() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73318o;
    }

    @C0348i1
    /* renamed from: N */
    public final boolean mo86964N() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73301E;
    }

    @C0348i1
    /* renamed from: O */
    public final boolean mo86965O() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73325v;
    }

    @C0348i1
    /* renamed from: P */
    public final long mo86966P() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73314k;
    }

    @C0348i1
    /* renamed from: Q */
    public final long mo86967Q() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73302F;
    }

    @C0348i1
    /* renamed from: R */
    public final long mo86968R() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73297A;
    }

    @C0348i1
    /* renamed from: S */
    public final long mo86969S() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73298B;
    }

    @C0348i1
    /* renamed from: T */
    public final long mo86970T() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73329z;
    }

    @C0348i1
    /* renamed from: U */
    public final long mo86971U() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73328y;
    }

    @C0348i1
    /* renamed from: V */
    public final long mo86972V() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73299C;
    }

    @C0348i1
    /* renamed from: W */
    public final long mo86973W() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73327x;
    }

    @C0348i1
    /* renamed from: X */
    public final long mo86974X() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73317n;
    }

    @C0348i1
    /* renamed from: Y */
    public final long mo86975Y() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73322s;
    }

    @C0348i1
    /* renamed from: Z */
    public final long mo86976Z() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73303G;
    }

    @C0348i1
    @C0363p0
    /* renamed from: a */
    public final String mo86977a() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73300D;
    }

    @C0348i1
    /* renamed from: a0 */
    public final long mo86978a0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73316m;
    }

    @C0348i1
    @C0363p0
    /* renamed from: b */
    public final String mo86979b() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73308e;
    }

    @C0348i1
    /* renamed from: b0 */
    public final long mo86980b0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73312i;
    }

    @C0348i1
    @C0363p0
    /* renamed from: c */
    public final String mo86981c() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73324u;
    }

    @C0348i1
    /* renamed from: c0 */
    public final long mo86982c0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73310g;
    }

    @C0348i1
    @C0363p0
    /* renamed from: d */
    public final List mo86983d() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73323t;
    }

    @C0348i1
    /* renamed from: d0 */
    public final long mo86984d0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73311h;
    }

    @C0348i1
    /* renamed from: e */
    public final void mo86985e() {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E = false;
    }

    @C0348i1
    /* renamed from: e0 */
    public final long mo86986e0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73326w;
    }

    @C0348i1
    /* renamed from: f */
    public final void mo86987f() {
        this.f73304a.mo86904f().mo86866h();
        long j = this.f73310g + 1;
        if (j > 2147483647L) {
            this.f73304a.mo86903d().mo87494w().mo87464b("Bundle index overflow. appId", C30899u3.m124186z(this.f73305b));
            j = 0;
        }
        this.f73301E = true;
        this.f73310g = j;
    }

    @C0348i1
    @C0363p0
    /* renamed from: f0 */
    public final Boolean mo86988f0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73321r;
    }

    @C0348i1
    /* renamed from: g */
    public final void mo86989g(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f73301E |= true ^ C30679c5.m123532a(this.f73320q, str);
        this.f73320q = str;
    }

    @C0348i1
    @C0363p0
    /* renamed from: g0 */
    public final String mo86990g0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73320q;
    }

    @C0348i1
    /* renamed from: h */
    public final void mo86991h(boolean z) {
        boolean z2;
        this.f73304a.mo86904f().mo86866h();
        boolean z3 = this.f73301E;
        if (this.f73319p != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f73301E = z3 | z2;
        this.f73319p = z;
    }

    @C0348i1
    @C0363p0
    /* renamed from: h0 */
    public final String mo86992h0() {
        this.f73304a.mo86904f().mo86866h();
        String str = this.f73300D;
        mo87016z((String) null);
        return str;
    }

    @C0348i1
    /* renamed from: i */
    public final void mo86993i(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73306c, str);
        this.f73306c = str;
    }

    @C0348i1
    /* renamed from: i0 */
    public final String mo86994i0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73305b;
    }

    @C0348i1
    /* renamed from: j */
    public final void mo86995j(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73315l, str);
        this.f73315l = str;
    }

    @C0348i1
    @C0363p0
    /* renamed from: j0 */
    public final String mo86996j0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73306c;
    }

    @C0348i1
    /* renamed from: k */
    public final void mo86997k(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73313j, str);
        this.f73313j = str;
    }

    @C0348i1
    @C0363p0
    /* renamed from: k0 */
    public final String mo86998k0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73315l;
    }

    @C0348i1
    /* renamed from: l */
    public final void mo86999l(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73314k != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73314k = j;
    }

    @C0348i1
    @C0363p0
    /* renamed from: l0 */
    public final String mo87000l0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73313j;
    }

    @C0348i1
    /* renamed from: m */
    public final void mo87001m(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73302F != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73302F = j;
    }

    @C0348i1
    @C0363p0
    /* renamed from: m0 */
    public final String mo87002m0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73309f;
    }

    @C0348i1
    /* renamed from: n */
    public final void mo87003n(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73297A != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73297A = j;
    }

    @C0348i1
    @C0363p0
    /* renamed from: n0 */
    public final String mo87004n0() {
        this.f73304a.mo86904f().mo86866h();
        return this.f73307d;
    }

    @C0348i1
    /* renamed from: o */
    public final void mo87005o(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73298B != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73298B = j;
    }

    @C0348i1
    /* renamed from: p */
    public final void mo87006p(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73329z != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73329z = j;
    }

    @C0348i1
    /* renamed from: q */
    public final void mo87007q(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73328y != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73328y = j;
    }

    @C0348i1
    /* renamed from: r */
    public final void mo87008r(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73299C != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73299C = j;
    }

    @C0348i1
    /* renamed from: s */
    public final void mo87009s(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73327x != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73327x = j;
    }

    @C0348i1
    /* renamed from: t */
    public final void mo87010t(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73317n != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73317n = j;
    }

    @C0348i1
    /* renamed from: u */
    public final void mo87011u(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73322s != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73322s = j;
    }

    @C0348i1
    /* renamed from: v */
    public final void mo87012v(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73303G != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73303G = j;
    }

    @C0348i1
    /* renamed from: w */
    public final void mo87013w(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73309f, str);
        this.f73309f = str;
    }

    @C0348i1
    /* renamed from: x */
    public final void mo87014x(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f73301E |= true ^ C30679c5.m123532a(this.f73307d, str);
        this.f73307d = str;
    }

    @C0348i1
    /* renamed from: y */
    public final void mo87015y(long j) {
        boolean z;
        this.f73304a.mo86904f().mo86866h();
        boolean z2 = this.f73301E;
        if (this.f73316m != j) {
            z = true;
        } else {
            z = false;
        }
        this.f73301E = z2 | z;
        this.f73316m = j;
    }

    @C0348i1
    /* renamed from: z */
    public final void mo87016z(@C0363p0 String str) {
        this.f73304a.mo86904f().mo86866h();
        this.f73301E |= !C30679c5.m123532a(this.f73300D, str);
        this.f73300D = str;
    }
}
