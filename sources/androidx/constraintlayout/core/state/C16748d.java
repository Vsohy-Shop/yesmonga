package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* renamed from: androidx.constraintlayout.core.state.d */
public class C16748d {

    /* renamed from: b */
    public static final C16748d f42544b = new C16748d();

    /* renamed from: a */
    public HashMap<String, C16749e> f42545a = new HashMap<>();

    /* renamed from: c */
    public static C16748d m76610c() {
        return f42544b;
    }

    /* renamed from: a */
    public String mo49333a(String str) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            return eVar.mo48607g();
        }
        return null;
    }

    /* renamed from: b */
    public String mo49334b(String str) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            return eVar.mo48608h();
        }
        return null;
    }

    /* renamed from: d */
    public long mo49335d(String str) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            return eVar.mo48605e();
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: e */
    public Set<String> mo49336e() {
        return this.f42545a.keySet();
    }

    /* renamed from: f */
    public void mo49337f(String str, C16749e eVar) {
        this.f42545a.put(str, eVar);
    }

    /* renamed from: g */
    public void mo49338g(String str, int i) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            eVar.mo48601a(i);
        }
    }

    /* renamed from: h */
    public void mo49339h(String str, int i) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            eVar.mo48602b(i);
        }
    }

    /* renamed from: i */
    public void mo49340i(String str, C16749e eVar) {
        this.f42545a.remove(str);
    }

    /* renamed from: j */
    public void mo49341j(String str, String str2) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            eVar.mo48606f(str2);
        }
    }

    /* renamed from: k */
    public void mo49342k(String str, int i, int i2) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            eVar.mo48604d(i, i2);
        }
    }

    /* renamed from: l */
    public void mo49343l(String str, float f) {
        C16749e eVar = this.f42545a.get(str);
        if (eVar != null) {
            eVar.mo48603c(f);
        }
    }
}
