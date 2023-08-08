package com.google.firebase.perf.metrics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.C33316f;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.validator.C33388e;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.perf.metrics.h */
public class C33380h implements C33316f {

    /* renamed from: f */
    public static final C33363a f81108f = C33363a.m134449e();

    /* renamed from: a */
    public final C33381i f81109a;

    /* renamed from: b */
    public final Timer f81110b;

    /* renamed from: c */
    public final Map<String, String> f81111c;

    /* renamed from: d */
    public boolean f81112d;

    /* renamed from: e */
    public boolean f81113e;

    public C33380h(String str, String str2, C33424k kVar, Timer timer) {
        this.f81112d = false;
        this.f81113e = false;
        this.f81111c = new ConcurrentHashMap();
        this.f81110b = timer;
        C33381i n = C33381i.m134544c(kVar).mo96556z(str).mo96544n(str2);
        this.f81109a = n;
        n.mo96546p();
        if (!C33307a.m134328h().mo96352M()) {
            f81108f.mo96434g("HttpMetric feature is disabled. URL %s", str);
            this.f81113e = true;
        }
    }

    /* renamed from: a */
    public final void mo96524a(@C0359n0 String str, @C0359n0 String str2) {
        if (this.f81112d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        } else if (this.f81111c.containsKey(str) || this.f81111c.size() < 5) {
            C33388e.m134602d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    /* renamed from: b */
    public void mo96525b() {
        this.f81109a.mo96553w(this.f81110b.mo96891c());
    }

    /* renamed from: c */
    public void mo96526c() {
        this.f81109a.mo96555y(this.f81110b.mo96891c());
    }

    /* renamed from: d */
    public void mo96527d(int i) {
        this.f81109a.mo96545o(i);
    }

    /* renamed from: e */
    public void mo96528e(long j) {
        this.f81109a.mo96549s(j);
    }

    /* renamed from: f */
    public void mo96529f(@C0363p0 String str) {
        this.f81109a.mo96551u(str);
    }

    /* renamed from: g */
    public void mo96530g(long j) {
        this.f81109a.mo96552v(j);
    }

    @C0363p0
    public String getAttribute(@C0359n0 String str) {
        return this.f81111c.get(str);
    }

    @C0359n0
    public Map<String, String> getAttributes() {
        return new HashMap(this.f81111c);
    }

    /* renamed from: h */
    public void mo96531h() {
        this.f81110b.mo96895g();
        this.f81109a.mo96550t(this.f81110b.mo96894e());
    }

    /* renamed from: i */
    public void mo96532i() {
        if (!this.f81113e) {
            this.f81109a.mo96554x(this.f81110b.mo96891c()).mo96543m(this.f81111c).mo96534b();
            this.f81112d = true;
        }
    }

    public void putAttribute(@C0359n0 String str, @C0359n0 String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo96524a(str, str2);
            f81108f.mo96430b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f81109a.mo96538g());
            z = true;
        } catch (Exception e) {
            f81108f.mo96432d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f81111c.put(str, str2);
        }
    }

    public void removeAttribute(@C0359n0 String str) {
        if (this.f81112d) {
            f81108f.mo96431c("Can't remove a attribute from a HttpMetric that's stopped.");
        } else {
            this.f81111c.remove(str);
        }
    }

    public C33380h(URL url, String str, C33424k kVar, Timer timer) {
        this(url.toString(), str, kVar, timer);
    }
}
