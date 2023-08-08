package com.google.firebase.remoteconfig.internal;

import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40973d;
import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.C33568o;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: com.google.firebase.remoteconfig.internal.m */
public class C33537m {
    @C0344h1(otherwise = 3)

    /* renamed from: e */
    public static final Charset f81616e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final Pattern f81617f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    public static final Pattern f81618g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    public final Set<C40973d<String, C33526f>> f81619a = new HashSet();

    /* renamed from: b */
    public final Executor f81620b;

    /* renamed from: c */
    public final C33523e f81621c;

    /* renamed from: d */
    public final C33523e f81622d;

    public C33537m(Executor executor, C33523e eVar, C33523e eVar2) {
        this.f81620b = executor;
        this.f81621c = eVar;
        this.f81622d = eVar2;
    }

    @C0363p0
    /* renamed from: g */
    public static C33526f m135187g(C33523e eVar) {
        return eVar.mo97293g();
    }

    @C0363p0
    /* renamed from: i */
    public static Double m135188i(C33523e eVar, String str) {
        C33526f g = m135187g(eVar);
        if (g == null) {
            return null;
        }
        try {
            return Double.valueOf(g.mo97302d().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Set<String> m135189j(C33523e eVar) {
        HashSet hashSet = new HashSet();
        C33526f g = m135187g(eVar);
        if (g == null) {
            return hashSet;
        }
        Iterator<String> keys = g.mo97302d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: l */
    public static TreeSet<String> m135190l(String str, C33526f fVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = fVar.mo97302d().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @C0363p0
    /* renamed from: n */
    public static Long m135191n(C33523e eVar, String str) {
        C33526f g = m135187g(eVar);
        if (g == null) {
            return null;
        }
        try {
            return Long.valueOf(g.mo97302d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: p */
    public static String m135192p(C33523e eVar, String str) {
        C33526f g = m135187g(eVar);
        if (g == null) {
            return null;
        }
        try {
            return g.mo97302d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static void m135194s(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str});
    }

    /* renamed from: b */
    public void mo97337b(C40973d<String, C33526f> dVar) {
        synchronized (this.f81619a) {
            this.f81619a.add(dVar);
        }
    }

    /* renamed from: c */
    public final void mo97338c(String str, C33526f fVar) {
        if (fVar != null) {
            synchronized (this.f81619a) {
                for (C40973d<String, C33526f> lVar : this.f81619a) {
                    this.f81620b.execute(new C33536l(lVar, str, fVar));
                }
            }
        }
    }

    /* renamed from: d */
    public Map<String, C33568o> mo97339d() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(m135189j(this.f81621c));
        hashSet.addAll(m135189j(this.f81622d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, mo97346q(str));
        }
        return hashMap;
    }

    /* renamed from: e */
    public boolean mo97340e(String str) {
        String p = m135192p(this.f81621c, str);
        if (p != null) {
            if (f81617f.matcher(p).matches()) {
                mo97338c(str, m135187g(this.f81621c));
                return true;
            } else if (f81618g.matcher(p).matches()) {
                mo97338c(str, m135187g(this.f81621c));
                return false;
            }
        }
        String p2 = m135192p(this.f81622d, str);
        if (p2 != null) {
            if (f81617f.matcher(p2).matches()) {
                return true;
            }
            if (f81618g.matcher(p2).matches()) {
                return false;
            }
        }
        m135194s(str, "Boolean");
        return false;
    }

    /* renamed from: f */
    public byte[] mo97341f(String str) {
        String p = m135192p(this.f81621c, str);
        if (p != null) {
            mo97338c(str, m135187g(this.f81621c));
            return p.getBytes(f81616e);
        }
        String p2 = m135192p(this.f81622d, str);
        if (p2 != null) {
            return p2.getBytes(f81616e);
        }
        m135194s(str, "ByteArray");
        return C33563l.f81684p;
    }

    /* renamed from: h */
    public double mo97342h(String str) {
        Double i = m135188i(this.f81621c, str);
        if (i != null) {
            mo97338c(str, m135187g(this.f81621c));
            return i.doubleValue();
        }
        Double i2 = m135188i(this.f81622d, str);
        if (i2 != null) {
            return i2.doubleValue();
        }
        m135194s(str, "Double");
        return 0.0d;
    }

    /* renamed from: k */
    public Set<String> mo97343k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        C33526f g = m135187g(this.f81621c);
        if (g != null) {
            treeSet.addAll(m135190l(str, g));
        }
        C33526f g2 = m135187g(this.f81622d);
        if (g2 != null) {
            treeSet.addAll(m135190l(str, g2));
        }
        return treeSet;
    }

    /* renamed from: m */
    public long mo97344m(String str) {
        Long n = m135191n(this.f81621c, str);
        if (n != null) {
            mo97338c(str, m135187g(this.f81621c));
            return n.longValue();
        }
        Long n2 = m135191n(this.f81622d, str);
        if (n2 != null) {
            return n2.longValue();
        }
        m135194s(str, "Long");
        return 0;
    }

    /* renamed from: o */
    public String mo97345o(String str) {
        String p = m135192p(this.f81621c, str);
        if (p != null) {
            mo97338c(str, m135187g(this.f81621c));
            return p;
        }
        String p2 = m135192p(this.f81622d, str);
        if (p2 != null) {
            return p2;
        }
        m135194s(str, "String");
        return "";
    }

    /* renamed from: q */
    public C33568o mo97346q(String str) {
        String p = m135192p(this.f81621c, str);
        if (p != null) {
            mo97338c(str, m135187g(this.f81621c));
            return new C33545r(p, 2);
        }
        String p2 = m135192p(this.f81622d, str);
        if (p2 != null) {
            return new C33545r(p2, 1);
        }
        m135194s(str, "FirebaseRemoteConfigValue");
        return new C33545r("", 0);
    }
}
