package org.jsoup.safety;

import androidx.core.net.C17767c;
import com.carrefour.fid.android.design.components.widgets.C37254k1;
import com.google.firebase.installations.C33124s;
import com.journeyapps.barcodescanner.camera.C34932q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12757d;
import org.jsoup.nodes.C12766a;
import org.jsoup.nodes.C12767b;
import org.jsoup.nodes.Element;

/* renamed from: org.jsoup.safety.b */
public class C12904b {

    /* renamed from: a */
    public Set<C12908d> f31922a;

    /* renamed from: b */
    public Map<C12908d, Set<C12905a>> f31923b;

    /* renamed from: c */
    public Map<C12908d, Map<C12905a, C12906b>> f31924c;

    /* renamed from: d */
    public Map<C12908d, Map<C12905a, Set<C12907c>>> f31925d;

    /* renamed from: e */
    public boolean f31926e;

    /* renamed from: org.jsoup.safety.b$a */
    public static class C12905a extends C12909e {
        public C12905a(String str) {
            super(str);
        }

        /* renamed from: a */
        public static C12905a m56084a(String str) {
            return new C12905a(str);
        }
    }

    /* renamed from: org.jsoup.safety.b$b */
    public static class C12906b extends C12909e {
        public C12906b(String str) {
            super(str);
        }

        /* renamed from: a */
        public static C12906b m56085a(String str) {
            return new C12906b(str);
        }
    }

    /* renamed from: org.jsoup.safety.b$c */
    public static class C12907c extends C12909e {
        public C12907c(String str) {
            super(str);
        }

        /* renamed from: a */
        public static C12907c m56086a(String str) {
            return new C12907c(str);
        }
    }

    /* renamed from: org.jsoup.safety.b$d */
    public static class C12908d extends C12909e {
        public C12908d(String str) {
            super(str);
        }

        /* renamed from: a */
        public static C12908d m56087a(String str) {
            return new C12908d(str);
        }
    }

    /* renamed from: org.jsoup.safety.b$e */
    public static abstract class C12909e {

        /* renamed from: a */
        public String f31927a;

        public C12909e(String str) {
            C12750d.m55073j(str);
            this.f31927a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C12909e eVar = (C12909e) obj;
            String str = this.f31927a;
            if (str != null) {
                return str.equals(eVar.f31927a);
            }
            if (eVar.f31927a == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f31927a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f31927a;
        }
    }

    public C12904b() {
        this.f31922a = new HashSet();
        this.f31923b = new HashMap();
        this.f31924c = new HashMap();
        this.f31925d = new HashMap();
        this.f31926e = false;
    }

    /* renamed from: e */
    public static C12904b m56065e() {
        return new C12904b().mo30289d("a", "b", "blockquote", "br", "cite", "code", C37254k1.f93426c, "dl", "dt", "em", "i", "li", "ol", "p", "pre", C34932q.f84985b, "small", "span", "strike", "strong", "sub", "sup", "u", "ul").mo30286a("a", "href").mo30286a("blockquote", "cite").mo30286a(C34932q.f84985b, "cite").mo30288c("a", "href", "ftp", "http", "https", C17767c.f46168c).mo30288c("blockquote", "cite", "http", "https").mo30288c("cite", "cite", "http", "https").mo30287b("a", "rel", "nofollow");
    }

    /* renamed from: f */
    public static C12904b m56066f() {
        return m56065e().mo30289d("img").mo30286a("img", "align", "alt", "height", "src", "title", "width").mo30288c("img", "src", "http", "https");
    }

    /* renamed from: k */
    public static C12904b m56067k() {
        return new C12904b();
    }

    /* renamed from: m */
    public static C12904b m56068m() {
        return new C12904b().mo30289d("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", C37254k1.f93426c, "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", C34932q.f84985b, "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").mo30286a("a", "href", "title").mo30286a("blockquote", "cite").mo30286a("col", "span", "width").mo30286a("colgroup", "span", "width").mo30286a("img", "align", "alt", "height", "src", "title", "width").mo30286a("ol", "start", "type").mo30286a(C34932q.f84985b, "cite").mo30286a("table", "summary", "width").mo30286a("td", "abbr", "axis", "colspan", "rowspan", "width").mo30286a("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").mo30286a("ul", "type").mo30288c("a", "href", "ftp", "http", "https", C17767c.f46168c).mo30288c("blockquote", "cite", "http", "https").mo30288c("cite", "cite", "http", "https").mo30288c("img", "src", "http", "https").mo30288c(C34932q.f84985b, "cite", "http", "https");
    }

    /* renamed from: r */
    public static C12904b m56069r() {
        return new C12904b().mo30289d("b", "em", "i", "strong", "u");
    }

    /* renamed from: a */
    public C12904b mo30286a(String str, String... strArr) {
        boolean z;
        C12750d.m55071h(str);
        C12750d.m55073j(strArr);
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55068e(z, "No attribute names supplied.");
        C12908d a = C12908d.m56087a(str);
        this.f31922a.add(a);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C12750d.m55071h(str2);
            hashSet.add(C12905a.m56084a(str2));
        }
        if (this.f31923b.containsKey(a)) {
            this.f31923b.get(a).addAll(hashSet);
        } else {
            this.f31923b.put(a, hashSet);
        }
        return this;
    }

    /* renamed from: b */
    public C12904b mo30287b(String str, String str2, String str3) {
        C12750d.m55071h(str);
        C12750d.m55071h(str2);
        C12750d.m55071h(str3);
        C12908d a = C12908d.m56087a(str);
        this.f31922a.add(a);
        C12905a a2 = C12905a.m56084a(str2);
        C12906b a3 = C12906b.m56085a(str3);
        if (this.f31924c.containsKey(a)) {
            this.f31924c.get(a).put(a2, a3);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(a2, a3);
            this.f31924c.put(a, hashMap);
        }
        return this;
    }

    /* renamed from: c */
    public C12904b mo30288c(String str, String str2, String... strArr) {
        Map map;
        Set set;
        C12750d.m55071h(str);
        C12750d.m55071h(str2);
        C12750d.m55073j(strArr);
        C12908d a = C12908d.m56087a(str);
        C12905a a2 = C12905a.m56084a(str2);
        if (this.f31925d.containsKey(a)) {
            map = this.f31925d.get(a);
        } else {
            HashMap hashMap = new HashMap();
            this.f31925d.put(a, hashMap);
            map = hashMap;
        }
        if (map.containsKey(a2)) {
            set = (Set) map.get(a2);
        } else {
            HashSet hashSet = new HashSet();
            map.put(a2, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C12750d.m55071h(str3);
            set.add(C12907c.m56086a(str3));
        }
        return this;
    }

    /* renamed from: d */
    public C12904b mo30289d(String... strArr) {
        C12750d.m55073j(strArr);
        for (String str : strArr) {
            C12750d.m55071h(str);
            this.f31922a.add(C12908d.m56087a(str));
        }
        return this;
    }

    /* renamed from: g */
    public C12767b mo30290g(String str) {
        C12767b bVar = new C12767b();
        C12908d a = C12908d.m56087a(str);
        if (this.f31924c.containsKey(a)) {
            for (Map.Entry entry : this.f31924c.get(a).entrySet()) {
                bVar.mo29846J0(((C12905a) entry.getKey()).toString(), ((C12906b) entry.getValue()).toString());
            }
        }
        return bVar;
    }

    /* renamed from: h */
    public boolean mo30291h(String str, Element element, C12766a aVar) {
        C12908d a = C12908d.m56087a(str);
        C12905a a2 = C12905a.m56084a(aVar.getKey());
        Set set = this.f31923b.get(a);
        if (set == null || !set.contains(a2)) {
            if (this.f31924c.get(a) != null) {
                C12767b g = mo30290g(str);
                String e = aVar.getKey();
                if (g.mo29870w0(e)) {
                    return g.mo29864r0(e).equals(aVar.getValue());
                }
            }
            if (str.equals(":all") || !mo30291h(":all", element, aVar)) {
                return false;
            }
            return true;
        } else if (!this.f31925d.containsKey(a)) {
            return true;
        } else {
            Map map = this.f31925d.get(a);
            if (!map.containsKey(a2) || mo30299s(element, aVar, (Set) map.get(a2))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo30292i(String str) {
        return this.f31922a.contains(C12908d.m56087a(str));
    }

    /* renamed from: j */
    public final boolean mo30293j(String str) {
        if (!str.startsWith("#") || str.matches(".*\\s.*")) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public C12904b mo30294l(boolean z) {
        this.f31926e = z;
        return this;
    }

    /* renamed from: n */
    public C12904b mo30295n(String str, String... strArr) {
        boolean z;
        C12750d.m55071h(str);
        C12750d.m55073j(strArr);
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55068e(z, "No attribute names supplied.");
        C12908d a = C12908d.m56087a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C12750d.m55071h(str2);
            hashSet.add(C12905a.m56084a(str2));
        }
        if (this.f31922a.contains(a) && this.f31923b.containsKey(a)) {
            Set set = this.f31923b.get(a);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.f31923b.remove(a);
            }
        }
        if (str.equals(":all")) {
            for (C12908d next : this.f31923b.keySet()) {
                Set set2 = this.f31923b.get(next);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    this.f31923b.remove(next);
                }
            }
        }
        return this;
    }

    /* renamed from: o */
    public C12904b mo30296o(String str, String str2) {
        C12750d.m55071h(str);
        C12750d.m55071h(str2);
        C12908d a = C12908d.m56087a(str);
        if (this.f31922a.contains(a) && this.f31924c.containsKey(a)) {
            C12905a a2 = C12905a.m56084a(str2);
            Map map = this.f31924c.get(a);
            map.remove(a2);
            if (map.isEmpty()) {
                this.f31924c.remove(a);
            }
        }
        return this;
    }

    /* renamed from: p */
    public C12904b mo30297p(String str, String str2, String... strArr) {
        C12750d.m55071h(str);
        C12750d.m55071h(str2);
        C12750d.m55073j(strArr);
        C12908d a = C12908d.m56087a(str);
        C12905a a2 = C12905a.m56084a(str2);
        C12750d.m55068e(this.f31925d.containsKey(a), "Cannot remove a protocol that is not set.");
        Map map = this.f31925d.get(a);
        C12750d.m55068e(map.containsKey(a2), "Cannot remove a protocol that is not set.");
        Set set = (Set) map.get(a2);
        for (String str3 : strArr) {
            C12750d.m55071h(str3);
            set.remove(C12907c.m56086a(str3));
        }
        if (set.isEmpty()) {
            map.remove(a2);
            if (map.isEmpty()) {
                this.f31925d.remove(a);
            }
        }
        return this;
    }

    /* renamed from: q */
    public C12904b mo30298q(String... strArr) {
        C12750d.m55073j(strArr);
        for (String str : strArr) {
            C12750d.m55071h(str);
            C12908d a = C12908d.m56087a(str);
            if (this.f31922a.remove(a)) {
                this.f31923b.remove(a);
                this.f31924c.remove(a);
                this.f31925d.remove(a);
            }
        }
        return this;
    }

    /* renamed from: s */
    public final boolean mo30299s(Element element, C12766a aVar, Set<C12907c> set) {
        String b = element.mo29895b(aVar.getKey());
        if (b.length() == 0) {
            b = aVar.getValue();
        }
        if (!this.f31926e) {
            aVar.setValue(b);
        }
        for (C12907c eVar : set) {
            String eVar2 = eVar.toString();
            if (!eVar2.equals("#")) {
                if (C12757d.m55098a(b).startsWith(eVar2 + C33124s.f80355c)) {
                    return true;
                }
            } else if (mo30293j(b)) {
                return true;
            }
        }
        return false;
    }

    public C12904b(C12904b bVar) {
        this();
        this.f31922a.addAll(bVar.f31922a);
        this.f31923b.putAll(bVar.f31923b);
        this.f31924c.putAll(bVar.f31924c);
        this.f31925d.putAll(bVar.f31925d);
        this.f31926e = bVar.f31926e;
    }
}
