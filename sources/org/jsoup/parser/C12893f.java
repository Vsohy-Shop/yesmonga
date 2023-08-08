package org.jsoup.parser;

import androidx.appcompat.view.C0543g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.design.components.widgets.C37254k1;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23948c;
import com.carrefour.fid.android.shared.constant.C28549i0;
import com.journeyapps.barcodescanner.camera.C34932q;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.C9166d;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.events.C9175a;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12757d;

/* renamed from: org.jsoup.parser.f */
public class C12893f implements Cloneable {

    /* renamed from: E0 */
    public static final String[] f31860E0 = {C9175a.f24945j0, "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: F0 */
    public static final String[] f31861F0 = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: X */
    public static final String[] f31862X = {"meta", "link", "base", C16717v.C16718a.f42148L, "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: Y */
    public static final String[] f31863Y = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", C34935s.f84988a};

    /* renamed from: Z */
    public static final String[] f31864Z = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: x */
    public static final Map<String, C12893f> f31865x = new HashMap();

    /* renamed from: y */
    public static final String[] f31866y;

    /* renamed from: z */
    public static final String[] f31867z = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", C34932q.f84985b, "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", C9175a.f24945j0, "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", C34935s.f84988a, "strike", "nobr"};

    /* renamed from: a */
    public String f31868a;

    /* renamed from: b */
    public String f31869b;

    /* renamed from: c */
    public boolean f31870c = true;

    /* renamed from: d */
    public boolean f31871d = true;

    /* renamed from: e */
    public boolean f31872e = false;

    /* renamed from: f */
    public boolean f31873f = false;

    /* renamed from: g */
    public boolean f31874g = false;

    /* renamed from: v */
    public boolean f31875v = false;

    /* renamed from: w */
    public boolean f31876w = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", C16717v.C16718a.f42148L, "noframes", "section", "nav", "aside", "hgroup", C28549i0.f69374H, C9166d.f24877r0, "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", C37254k1.f93426c, "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", C9127a0.f24710e, "audio", "canvas", C23948c.f60118a, C0543g.f1415f, "plaintext", C9166d.f24876q0, "article", "main", "svg", "math", C9168d0.f24881F0, C9166d.f24876q0, "dir", "applet", "marquee", "listing"};
        f31866y = strArr;
        for (String fVar : strArr) {
            m55948t(new C12893f(fVar));
        }
        for (String fVar2 : f31867z) {
            C12893f fVar3 = new C12893f(fVar2);
            fVar3.f31870c = false;
            fVar3.f31871d = false;
            m55948t(fVar3);
        }
        for (String str : f31862X) {
            C12893f fVar4 = f31865x.get(str);
            C12750d.m55073j(fVar4);
            fVar4.f31872e = true;
        }
        for (String str2 : f31863Y) {
            C12893f fVar5 = f31865x.get(str2);
            C12750d.m55073j(fVar5);
            fVar5.f31871d = false;
        }
        for (String str3 : f31864Z) {
            C12893f fVar6 = f31865x.get(str3);
            C12750d.m55073j(fVar6);
            fVar6.f31874g = true;
        }
        for (String str4 : f31860E0) {
            C12893f fVar7 = f31865x.get(str4);
            C12750d.m55073j(fVar7);
            fVar7.f31875v = true;
        }
        for (String str5 : f31861F0) {
            C12893f fVar8 = f31865x.get(str5);
            C12750d.m55073j(fVar8);
            fVar8.f31876w = true;
        }
    }

    public C12893f(String str) {
        this.f31868a = str;
        this.f31869b = C12757d.m55098a(str);
    }

    /* renamed from: m */
    public static boolean m55947m(String str) {
        return f31865x.containsKey(str);
    }

    /* renamed from: t */
    public static void m55948t(C12893f fVar) {
        f31865x.put(fVar.f31868a, fVar);
    }

    /* renamed from: v */
    public static C12893f m55949v(String str) {
        return m55950x(str, C12891d.f31854d);
    }

    /* renamed from: x */
    public static C12893f m55950x(String str, C12891d dVar) {
        C12750d.m55073j(str);
        Map<String, C12893f> map = f31865x;
        C12893f fVar = map.get(str);
        if (fVar != null) {
            return fVar;
        }
        String d = dVar.mo30171d(str);
        C12750d.m55071h(d);
        String a = C12757d.m55098a(d);
        C12893f fVar2 = map.get(a);
        if (fVar2 == null) {
            C12893f fVar3 = new C12893f(d);
            fVar3.f31870c = false;
            return fVar3;
        } else if (!dVar.mo30173f() || d.equals(a)) {
            return fVar2;
        } else {
            C12893f b = fVar2.clone();
            b.f31868a = d;
            return b;
        }
    }

    /* renamed from: b */
    public C12893f clone() {
        try {
            return (C12893f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public boolean mo30187c() {
        return this.f31871d;
    }

    /* renamed from: e */
    public String mo30189e() {
        return this.f31868a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12893f)) {
            return false;
        }
        C12893f fVar = (C12893f) obj;
        if (!this.f31868a.equals(fVar.f31868a) || this.f31872e != fVar.f31872e || this.f31871d != fVar.f31871d || this.f31870c != fVar.f31870c || this.f31874g != fVar.f31874g || this.f31873f != fVar.f31873f || this.f31875v != fVar.f31875v) {
            return false;
        }
        if (this.f31876w == fVar.f31876w) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo30191f() {
        return this.f31870c;
    }

    /* renamed from: h */
    public boolean mo30192h() {
        return this.f31872e;
    }

    public int hashCode() {
        return (((((((((((((this.f31868a.hashCode() * 31) + (this.f31870c ? 1 : 0)) * 31) + (this.f31871d ? 1 : 0)) * 31) + (this.f31872e ? 1 : 0)) * 31) + (this.f31873f ? 1 : 0)) * 31) + (this.f31874g ? 1 : 0)) * 31) + (this.f31875v ? 1 : 0)) * 31) + (this.f31876w ? 1 : 0);
    }

    /* renamed from: i */
    public boolean mo30194i() {
        return this.f31875v;
    }

    /* renamed from: j */
    public boolean mo30195j() {
        return this.f31876w;
    }

    /* renamed from: k */
    public boolean mo30196k() {
        return !this.f31870c;
    }

    /* renamed from: l */
    public boolean mo30197l() {
        return f31865x.containsKey(this.f31868a);
    }

    /* renamed from: n */
    public boolean mo30198n() {
        return this.f31872e || this.f31873f;
    }

    /* renamed from: o */
    public String mo30199o() {
        return this.f31869b;
    }

    /* renamed from: s */
    public boolean mo30200s() {
        return this.f31874g;
    }

    public String toString() {
        return this.f31868a;
    }

    /* renamed from: u */
    public C12893f mo30202u() {
        this.f31873f = true;
        return this;
    }
}
