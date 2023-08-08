package org.jsoup.nodes;

import java.io.IOException;
import kotlin.text.C11626x;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;

/* renamed from: org.jsoup.nodes.f */
public class C12775f extends C12778i {

    /* renamed from: f */
    public static final String f31615f = "PUBLIC";

    /* renamed from: g */
    public static final String f31616g = "SYSTEM";

    /* renamed from: v */
    public static final String f31617v = "name";

    /* renamed from: w */
    public static final String f31618w = "pubSysKey";

    /* renamed from: x */
    public static final String f31619x = "publicId";

    /* renamed from: y */
    public static final String f31620y = "systemId";

    public C12775f(String str, String str2, String str3) {
        C12750d.m55073j(str);
        C12750d.m55073j(str2);
        C12750d.m55073j(str3);
        mo29782k("name", str);
        mo29782k(f31619x, str2);
        mo29782k(f31620y, str3);
        mo29906M0();
    }

    /* renamed from: F */
    public /* bridge */ /* synthetic */ C12779j mo29699F() {
        return super.mo29699F();
    }

    /* renamed from: G0 */
    public final boolean mo29901G0(String str) {
        return !C12759f.m55107g(mo29896j(str));
    }

    /* renamed from: H0 */
    public String mo29902H0() {
        return mo29896j("name");
    }

    /* renamed from: I0 */
    public String mo29903I0() {
        return mo29896j(f31619x);
    }

    /* renamed from: J */
    public /* bridge */ /* synthetic */ boolean mo29892J(String str) {
        return super.mo29892J(str);
    }

    /* renamed from: J0 */
    public void mo29904J0(String str) {
        if (str != null) {
            mo29782k(f31618w, str);
        }
    }

    /* renamed from: L0 */
    public String mo29905L0() {
        return mo29896j(f31620y);
    }

    /* renamed from: M0 */
    public final void mo29906M0() {
        if (mo29901G0(f31619x)) {
            mo29782k(f31618w, f31615f);
        } else if (mo29901G0(f31620y)) {
            mo29782k(f31618w, f31616g);
        }
    }

    /* renamed from: S */
    public String mo29651S() {
        return "#doctype";
    }

    /* renamed from: Y */
    public void mo29751Y(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.mo29687u() != Document.OutputSettings.Syntax.html || mo29901G0(f31619x) || mo29901G0(f31620y)) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (mo29901G0("name")) {
            appendable.append(" ").append(mo29896j("name"));
        }
        if (mo29901G0(f31618w)) {
            appendable.append(" ").append(mo29896j(f31618w));
        }
        if (mo29901G0(f31619x)) {
            appendable.append(" \"").append(mo29896j(f31619x)).append('\"');
        }
        if (mo29901G0(f31620y)) {
            appendable.append(" \"").append(mo29896j(f31620y)).append('\"');
        }
        appendable.append(C11626x.f28915f);
    }

    /* renamed from: Z */
    public void mo29753Z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo29895b(String str) {
        return super.mo29895b(str);
    }

    /* renamed from: i0 */
    public /* bridge */ /* synthetic */ C12779j mo29778i0(String str) {
        return super.mo29778i0(str);
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ String mo29896j(String str) {
        return super.mo29896j(str);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ C12779j mo29782k(String str, String str2) {
        return super.mo29782k(str, str2);
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ String mo29787n() {
        return super.mo29787n();
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ int mo29805u() {
        return super.mo29805u();
    }
}
