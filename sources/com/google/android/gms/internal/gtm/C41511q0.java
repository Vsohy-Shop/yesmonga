package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.analytics.C40379e;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40979g;

/* renamed from: com.google.android.gms.internal.gtm.q0 */
public class C41511q0 {

    /* renamed from: a */
    public final C41607u0 f104891a;

    public C41511q0(C41607u0 u0Var) {
        C40843u.m166202l(u0Var);
        this.f104891a = u0Var;
    }

    /* renamed from: D */
    public static final boolean m168200D() {
        return Log.isLoggable(C41634v3.f105118d.mo135909b(), 2);
    }

    /* renamed from: E */
    public static String m168201E(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return C13758b.f33436b;
            }
            return C13758b.f33438c;
        } else if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        } else {
            return obj.toString();
        }
    }

    /* renamed from: k */
    public static String m168202k(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String E = m168201E(obj);
        String E2 = m168201E(obj2);
        String E3 = m168201E(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(E)) {
            sb.append(str2);
            sb.append(E);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(E2)) {
            sb.append(str2);
            sb.append(E2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(E3)) {
            sb.append(str3);
            sb.append(E3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    public final void mo135731B(String str, @C0363p0 Object obj, @C0363p0 Object obj2) {
        mo135733F(5, str, obj, obj2, (Object) null);
    }

    /* renamed from: C */
    public final void mo135732C(String str, @C0363p0 Object obj, @C0363p0 Object obj2, @C0363p0 Object obj3) {
        mo135733F(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    /* renamed from: F */
    public final void mo135733F(int i, String str, Object obj, Object obj2, Object obj3) {
        C41202d4 d4Var;
        C41607u0 u0Var = this.f104891a;
        if (u0Var != null) {
            d4Var = u0Var.mo135903n();
        } else {
            d4Var = null;
        }
        C41202d4 d4Var2 = d4Var;
        if (d4Var2 != null) {
            String b = C41634v3.f105118d.mo135909b();
            if (Log.isLoggable(b, i)) {
                Log.println(i, b, m168202k(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                d4Var2.mo135213b0(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String b2 = C41634v3.f105118d.mo135909b();
        if (Log.isLoggable(b2, i)) {
            Log.println(i, b2, m168202k(str, obj, obj2, obj3));
        }
    }

    /* renamed from: G */
    public final Context mo135734G() {
        return this.f104891a.mo135891a();
    }

    /* renamed from: I */
    public final C40379e mo135735I() {
        return this.f104891a.mo135893c();
    }

    /* renamed from: J */
    public final C40372a0 mo135736J() {
        return this.f104891a.mo135894d();
    }

    /* renamed from: K */
    public final C41294h0 mo135737K() {
        return this.f104891a.mo135895e();
    }

    /* renamed from: L */
    public final C41487p0 mo135738L() {
        return this.f104891a.mo135896f();
    }

    /* renamed from: M */
    public final C41607u0 mo135739M() {
        return this.f104891a;
    }

    /* renamed from: N */
    public final C41247f1 mo135740N() {
        return this.f104891a.mo135897h();
    }

    /* renamed from: O */
    public final C41440n1 mo135741O() {
        return this.f104891a.mo135898i();
    }

    /* renamed from: P */
    public final C41560s1 mo135742P() {
        return this.f104891a.mo135899j();
    }

    /* renamed from: Q */
    public final C41656w1 mo135743Q() {
        return this.f104891a.mo135900k();
    }

    /* renamed from: R */
    public final C41680x1 mo135744R() {
        return this.f104891a.mo135901l();
    }

    /* renamed from: S */
    public final C41202d4 mo135745S() {
        return this.f104891a.mo135902m();
    }

    /* renamed from: g */
    public final C41346j4 mo135746g() {
        return this.f104891a.mo135904o();
    }

    /* renamed from: i */
    public final C41635v4 mo135747i() {
        return this.f104891a.mo135906q();
    }

    /* renamed from: j */
    public final C40979g mo135748j() {
        return this.f104891a.mo135907r();
    }

    /* renamed from: l */
    public final void mo135749l() {
        this.f104891a.mo135899j();
    }

    /* renamed from: m */
    public final void mo135750m(String str) {
        mo135733F(3, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: n */
    public final void mo135751n(String str, @C0363p0 Object obj) {
        mo135733F(3, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: o */
    public final void mo135752o(String str, Object obj, Object obj2) {
        mo135733F(3, str, obj, obj2, (Object) null);
    }

    /* renamed from: p */
    public final void mo135753p(String str, Object obj, Object obj2, Object obj3) {
        mo135733F(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    /* renamed from: q */
    public final void mo135754q(String str) {
        mo135733F(6, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: r */
    public final void mo135755r(String str, @C0363p0 Object obj) {
        mo135733F(6, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: s */
    public final void mo135756s(String str, @C0363p0 Object obj, @C0363p0 Object obj2) {
        mo135733F(6, str, obj, obj2, (Object) null);
    }

    /* renamed from: t */
    public final void mo135757t(String str) {
        mo135733F(4, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: u */
    public final void mo135758u(String str, @C0363p0 Object obj) {
        mo135733F(4, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: v */
    public final void mo135759v(String str) {
        mo135733F(2, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: w */
    public final void mo135760w(String str, @C0363p0 Object obj) {
        mo135733F(2, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: x */
    public final void mo135761x(String str, @C0363p0 Object obj, @C0363p0 Object obj2) {
        mo135733F(2, str, obj, obj2, (Object) null);
    }

    /* renamed from: y */
    public final void mo135762y(String str) {
        mo135733F(5, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: z */
    public final void mo135763z(String str, @C0363p0 Object obj) {
        mo135733F(5, str, obj, (Object) null, (Object) null);
    }
}
