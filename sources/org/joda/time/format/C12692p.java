package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C12709i;
import org.joda.time.C12715o;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/* renamed from: org.joda.time.format.p */
public class C12692p {

    /* renamed from: a */
    public final C12706s f31315a;

    /* renamed from: b */
    public final C12705r f31316b;

    /* renamed from: c */
    public final Locale f31317c;

    /* renamed from: d */
    public final PeriodType f31318d;

    public C12692p(C12706s sVar, C12705r rVar) {
        this.f31315a = sVar;
        this.f31316b = rVar;
        this.f31317c = null;
        this.f31318d = null;
    }

    /* renamed from: a */
    public final void mo29311a() {
        if (this.f31316b == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
    }

    /* renamed from: b */
    public final void mo29312b(C12715o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("Period must not be null");
        }
    }

    /* renamed from: c */
    public final void mo29313c() {
        if (this.f31315a == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
    }

    /* renamed from: d */
    public Locale mo29314d() {
        return this.f31317c;
    }

    /* renamed from: e */
    public PeriodType mo29315e() {
        return this.f31318d;
    }

    /* renamed from: f */
    public C12705r mo29316f() {
        return this.f31316b;
    }

    /* renamed from: g */
    public C12706s mo29317g() {
        return this.f31315a;
    }

    /* renamed from: h */
    public boolean mo29318h() {
        return this.f31316b != null;
    }

    /* renamed from: i */
    public boolean mo29319i() {
        return this.f31315a != null;
    }

    /* renamed from: j */
    public int mo29320j(C12709i iVar, String str, int i) {
        mo29311a();
        mo29312b(iVar);
        return mo29316f().mo29305b(iVar, str, i, this.f31317c);
    }

    /* renamed from: k */
    public MutablePeriod mo29321k(String str) {
        mo29311a();
        MutablePeriod mutablePeriod = new MutablePeriod(0, this.f31318d);
        int b = mo29316f().mo29305b(mutablePeriod, str, 0, this.f31317c);
        if (b < 0) {
            b = ~b;
        } else if (b >= str.length()) {
            return mutablePeriod;
        }
        throw new IllegalArgumentException(C12682h.m54165j(str, b));
    }

    /* renamed from: l */
    public Period mo29322l(String str) {
        mo29311a();
        return mo29321k(str).mo28431l();
    }

    /* renamed from: m */
    public String mo29323m(C12715o oVar) {
        mo29313c();
        mo29312b(oVar);
        C12706s g = mo29317g();
        StringBuffer stringBuffer = new StringBuffer(g.mo29308e(oVar, this.f31317c));
        g.mo29307d(stringBuffer, oVar, this.f31317c);
        return stringBuffer.toString();
    }

    /* renamed from: n */
    public void mo29324n(Writer writer, C12715o oVar) throws IOException {
        mo29313c();
        mo29312b(oVar);
        mo29317g().mo29304a(writer, oVar, this.f31317c);
    }

    /* renamed from: o */
    public void mo29325o(StringBuffer stringBuffer, C12715o oVar) {
        mo29313c();
        mo29312b(oVar);
        mo29317g().mo29307d(stringBuffer, oVar, this.f31317c);
    }

    /* renamed from: p */
    public C12692p mo29326p(Locale locale) {
        if (locale == mo29314d() || (locale != null && locale.equals(mo29314d()))) {
            return this;
        }
        return new C12692p(this.f31315a, this.f31316b, locale, this.f31318d);
    }

    /* renamed from: q */
    public C12692p mo29327q(PeriodType periodType) {
        if (periodType == this.f31318d) {
            return this;
        }
        return new C12692p(this.f31315a, this.f31316b, this.f31317c, periodType);
    }

    public C12692p(C12706s sVar, C12705r rVar, Locale locale, PeriodType periodType) {
        this.f31315a = sVar;
        this.f31316b = rVar;
        this.f31317c = locale;
        this.f31318d = periodType;
    }
}
