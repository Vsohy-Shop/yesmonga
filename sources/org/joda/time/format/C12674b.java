package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12707g;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;

/* renamed from: org.joda.time.format.b */
public class C12674b {

    /* renamed from: a */
    public final C12688m f31213a;

    /* renamed from: b */
    public final C12686k f31214b;

    /* renamed from: c */
    public final Locale f31215c;

    /* renamed from: d */
    public final boolean f31216d;

    /* renamed from: e */
    public final C12589a f31217e;

    /* renamed from: f */
    public final DateTimeZone f31218f;

    /* renamed from: g */
    public final Integer f31219g;

    /* renamed from: h */
    public final int f31220h;

    public C12674b(C12680f fVar, C12675c cVar) {
        this(C12681g.m54151b(fVar), C12679e.m54142c(cVar));
    }

    /* renamed from: A */
    public void mo29217A(Appendable appendable, long j) throws IOException {
        mo29218B(appendable, j, (C12589a) null);
    }

    /* renamed from: B */
    public final void mo29218B(Appendable appendable, long j, C12589a aVar) throws IOException {
        long j2 = j;
        C12688m L = mo29228L();
        C12589a M = mo29229M(aVar);
        DateTimeZone s = M.mo27836s();
        int w = s.mo27830w(j2);
        long j3 = (long) w;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j3 ^ j2) >= 0) {
            s = DateTimeZone.f30651a;
            w = 0;
            j4 = j2;
        }
        C12688m mVar = L;
        Appendable appendable2 = appendable;
        long j5 = j4;
        mVar.mo29200y(appendable2, j5, M.mo27834Q(), w, s, this.f31215c);
    }

    /* renamed from: C */
    public void mo29219C(Appendable appendable, C12712l lVar) throws IOException {
        mo29218B(appendable, C12641d.m53375j(lVar), C12641d.m53374i(lVar));
    }

    /* renamed from: D */
    public void mo29220D(Appendable appendable, C12714n nVar) throws IOException {
        C12688m L = mo29228L();
        if (nVar != null) {
            L.mo29199w(appendable, nVar, this.f31215c);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    /* renamed from: E */
    public void mo29221E(StringBuffer stringBuffer, long j) {
        try {
            mo29217A(stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    /* renamed from: F */
    public void mo29222F(StringBuffer stringBuffer, C12712l lVar) {
        try {
            mo29219C(stringBuffer, lVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: G */
    public void mo29223G(StringBuffer stringBuffer, C12714n nVar) {
        try {
            mo29220D(stringBuffer, nVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: H */
    public void mo29224H(StringBuilder sb, long j) {
        try {
            mo29217A(sb, j);
        } catch (IOException unused) {
        }
    }

    /* renamed from: I */
    public void mo29225I(StringBuilder sb, C12712l lVar) {
        try {
            mo29219C(sb, lVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: J */
    public void mo29226J(StringBuilder sb, C12714n nVar) {
        try {
            mo29220D(sb, nVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: K */
    public final C12686k mo29227K() {
        C12686k kVar = this.f31214b;
        if (kVar != null) {
            return kVar;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: L */
    public final C12688m mo29228L() {
        C12688m mVar = this.f31213a;
        if (mVar != null) {
            return mVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* renamed from: M */
    public final C12589a mo29229M(C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        C12589a aVar2 = this.f31217e;
        if (aVar2 != null) {
            e = aVar2;
        }
        DateTimeZone dateTimeZone = this.f31218f;
        if (dateTimeZone != null) {
            return e.mo27835R(dateTimeZone);
        }
        return e;
    }

    /* renamed from: N */
    public C12674b mo29230N(C12589a aVar) {
        if (this.f31217e == aVar) {
            return this;
        }
        return new C12674b(this.f31213a, this.f31214b, this.f31215c, this.f31216d, aVar, this.f31218f, this.f31219g, this.f31220h);
    }

    /* renamed from: O */
    public C12674b mo29231O(int i) {
        return new C12674b(this.f31213a, this.f31214b, this.f31215c, this.f31216d, this.f31217e, this.f31218f, this.f31219g, i);
    }

    /* renamed from: P */
    public C12674b mo29232P(Locale locale) {
        if (locale == mo29241d() || (locale != null && locale.equals(mo29241d()))) {
            return this;
        }
        return new C12674b(this.f31213a, this.f31214b, locale, this.f31216d, this.f31217e, this.f31218f, this.f31219g, this.f31220h);
    }

    /* renamed from: Q */
    public C12674b mo29233Q() {
        if (this.f31216d) {
            return this;
        }
        return new C12674b(this.f31213a, this.f31214b, this.f31215c, true, this.f31217e, (DateTimeZone) null, this.f31219g, this.f31220h);
    }

    /* renamed from: R */
    public C12674b mo29234R(int i) {
        return mo29235S(Integer.valueOf(i));
    }

    /* renamed from: S */
    public C12674b mo29235S(Integer num) {
        Integer num2 = this.f31219g;
        if (num2 == num || (num2 != null && num2.equals(num))) {
            return this;
        }
        return new C12674b(this.f31213a, this.f31214b, this.f31215c, this.f31216d, this.f31217e, this.f31218f, num, this.f31220h);
    }

    /* renamed from: T */
    public C12674b mo29236T(DateTimeZone dateTimeZone) {
        if (this.f31218f == dateTimeZone) {
            return this;
        }
        return new C12674b(this.f31213a, this.f31214b, this.f31215c, false, this.f31217e, dateTimeZone, this.f31219g, this.f31220h);
    }

    /* renamed from: U */
    public C12674b mo29237U() {
        return mo29236T(DateTimeZone.f30651a);
    }

    @Deprecated
    /* renamed from: a */
    public C12589a mo29238a() {
        return this.f31217e;
    }

    /* renamed from: b */
    public C12589a mo29239b() {
        return this.f31217e;
    }

    /* renamed from: c */
    public int mo29240c() {
        return this.f31220h;
    }

    /* renamed from: d */
    public Locale mo29241d() {
        return this.f31215c;
    }

    /* renamed from: e */
    public C12675c mo29242e() {
        return C12687l.m54344a(this.f31214b);
    }

    /* renamed from: f */
    public C12686k mo29243f() {
        return this.f31214b;
    }

    /* renamed from: g */
    public Integer mo29244g() {
        return this.f31219g;
    }

    /* renamed from: h */
    public C12680f mo29245h() {
        return C12689n.m54351a(this.f31213a);
    }

    /* renamed from: i */
    public C12688m mo29246i() {
        return this.f31213a;
    }

    /* renamed from: j */
    public DateTimeZone mo29247j() {
        return this.f31218f;
    }

    /* renamed from: k */
    public boolean mo29248k() {
        return this.f31216d;
    }

    /* renamed from: l */
    public boolean mo29249l() {
        return this.f31214b != null;
    }

    /* renamed from: m */
    public boolean mo29250m() {
        return this.f31213a != null;
    }

    /* renamed from: n */
    public DateTime mo29251n(String str) {
        C12686k K = mo29227K();
        C12589a M = mo29229M((C12589a) null);
        C12676d dVar = new C12676d(0, M, this.f31215c, this.f31219g, this.f31220h);
        int b = K.mo29196b(dVar, str, 0);
        if (b < 0) {
            b = ~b;
        } else if (b >= str.length()) {
            long n = dVar.mo29276n(true, str);
            if (this.f31216d && dVar.mo29281s() != null) {
                M = M.mo27835R(DateTimeZone.m51370j(dVar.mo29281s().intValue()));
            } else if (dVar.mo29283u() != null) {
                M = M.mo27835R(dVar.mo29283u());
            }
            DateTime dateTime = new DateTime(n, M);
            DateTimeZone dateTimeZone = this.f31218f;
            if (dateTimeZone != null) {
                return dateTime.mo27734V3(dateTimeZone);
            }
            return dateTime;
        }
        throw new IllegalArgumentException(C12682h.m54165j(str, b));
    }

    /* renamed from: o */
    public int mo29252o(C12707g gVar, String str, int i) {
        C12686k K = mo29227K();
        if (gVar != null) {
            long k = gVar.mo27912k();
            C12589a m = gVar.mo27913m();
            int g = C12641d.m53370e(m).mo28631S().mo28828g(k);
            long w = k + ((long) m.mo27836s().mo27830w(k));
            C12589a M = mo29229M(m);
            C12676d dVar = new C12676d(w, M, this.f31215c, this.f31219g, g);
            int b = K.mo29196b(dVar, str, i);
            gVar.mo28255Q0(dVar.mo29276n(false, str));
            if (this.f31216d && dVar.mo29281s() != null) {
                M = M.mo27835R(DateTimeZone.m51370j(dVar.mo29281s().intValue()));
            } else if (dVar.mo29283u() != null) {
                M = M.mo27835R(dVar.mo29283u());
            }
            gVar.mo28239H(M);
            DateTimeZone dateTimeZone = this.f31218f;
            if (dateTimeZone != null) {
                gVar.mo28270c0(dateTimeZone);
            }
            return b;
        }
        throw new IllegalArgumentException("Instant must not be null");
    }

    /* renamed from: p */
    public LocalDate mo29253p(String str) {
        return mo29254q(str).mo28095r2();
    }

    /* renamed from: q */
    public LocalDateTime mo29254q(String str) {
        C12686k K = mo29227K();
        C12589a Q = mo29229M((C12589a) null).mo27834Q();
        C12676d dVar = new C12676d(0, Q, this.f31215c, this.f31219g, this.f31220h);
        int b = K.mo29196b(dVar, str, 0);
        if (b < 0) {
            b = ~b;
        } else if (b >= str.length()) {
            long n = dVar.mo29276n(true, str);
            if (dVar.mo29281s() != null) {
                Q = Q.mo27835R(DateTimeZone.m51370j(dVar.mo29281s().intValue()));
            } else if (dVar.mo29283u() != null) {
                Q = Q.mo27835R(dVar.mo29283u());
            }
            return new LocalDateTime(n, Q);
        }
        throw new IllegalArgumentException(C12682h.m54165j(str, b));
    }

    /* renamed from: r */
    public LocalTime mo29255r(String str) {
        return mo29254q(str).mo28097s2();
    }

    /* renamed from: s */
    public long mo29256s(String str) {
        return new C12676d(0, mo29229M(this.f31217e), this.f31215c, this.f31219g, this.f31220h).mo29277o(mo29227K(), str);
    }

    /* renamed from: t */
    public MutableDateTime mo29257t(String str) {
        C12686k K = mo29227K();
        C12589a M = mo29229M((C12589a) null);
        C12676d dVar = new C12676d(0, M, this.f31215c, this.f31219g, this.f31220h);
        int b = K.mo29196b(dVar, str, 0);
        if (b < 0) {
            b = ~b;
        } else if (b >= str.length()) {
            long n = dVar.mo29276n(true, str);
            if (this.f31216d && dVar.mo29281s() != null) {
                M = M.mo27835R(DateTimeZone.m51370j(dVar.mo29281s().intValue()));
            } else if (dVar.mo29283u() != null) {
                M = M.mo27835R(dVar.mo29283u());
            }
            MutableDateTime mutableDateTime = new MutableDateTime(n, M);
            DateTimeZone dateTimeZone = this.f31218f;
            if (dateTimeZone != null) {
                mutableDateTime.mo28270c0(dateTimeZone);
            }
            return mutableDateTime;
        }
        throw new IllegalArgumentException(C12682h.m54165j(str, b));
    }

    /* renamed from: u */
    public String mo29258u(long j) {
        StringBuilder sb = new StringBuilder(mo29228L().mo29198q());
        try {
            mo29217A(sb, j);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: v */
    public String mo29259v(C12712l lVar) {
        StringBuilder sb = new StringBuilder(mo29228L().mo29198q());
        try {
            mo29219C(sb, lVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: w */
    public String mo29260w(C12714n nVar) {
        StringBuilder sb = new StringBuilder(mo29228L().mo29198q());
        try {
            mo29220D(sb, nVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: x */
    public void mo29261x(Writer writer, long j) throws IOException {
        mo29217A(writer, j);
    }

    /* renamed from: y */
    public void mo29262y(Writer writer, C12712l lVar) throws IOException {
        mo29219C(writer, lVar);
    }

    /* renamed from: z */
    public void mo29263z(Writer writer, C12714n nVar) throws IOException {
        mo29220D(writer, nVar);
    }

    public C12674b(C12688m mVar, C12686k kVar) {
        this.f31213a = mVar;
        this.f31214b = kVar;
        this.f31215c = null;
        this.f31216d = false;
        this.f31217e = null;
        this.f31218f = null;
        this.f31219g = null;
        this.f31220h = 2000;
    }

    public C12674b(C12688m mVar, C12686k kVar, Locale locale, boolean z, C12589a aVar, DateTimeZone dateTimeZone, Integer num, int i) {
        this.f31213a = mVar;
        this.f31214b = kVar;
        this.f31215c = locale;
        this.f31216d = z;
        this.f31217e = aVar;
        this.f31218f = dateTimeZone;
        this.f31219g = num;
        this.f31220h = i;
    }
}
