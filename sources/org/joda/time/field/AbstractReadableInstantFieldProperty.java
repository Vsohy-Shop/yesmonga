package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12641d;
import org.joda.time.C12646e;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Interval;

public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    /* renamed from: A */
    public long mo29043A() {
        return mo27695m().mo28810M(mo27696u());
    }

    /* renamed from: B */
    public Interval mo29044B() {
        C12599c m = mo27695m();
        long O = m.mo28812O(mo27696u());
        return new Interval(O, m.mo28822a(O, 1), mo27694i());
    }

    /* renamed from: a */
    public int mo29045a(C12712l lVar) {
        if (lVar != null) {
            int c = mo29047c();
            int T = lVar.mo28711T(mo29058n());
            if (c < T) {
                return -1;
            }
            if (c > T) {
                return 1;
            }
            return 0;
        }
        throw new IllegalArgumentException("The instant must not be null");
    }

    /* renamed from: b */
    public int mo29046b(C12714n nVar) {
        if (nVar != null) {
            int c = mo29047c();
            int T = nVar.mo27959T(mo29058n());
            if (c < T) {
                return -1;
            }
            if (c > T) {
                return 1;
            }
            return 0;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    /* renamed from: c */
    public int mo29047c() {
        return mo27695m().mo28828g(mo27696u());
    }

    /* renamed from: d */
    public String mo29048d() {
        return mo29049e((Locale) null);
    }

    /* renamed from: e */
    public String mo29049e(Locale locale) {
        return mo27695m().mo28831j(mo27696u(), locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        if (mo29047c() != abstractReadableInstantFieldProperty.mo29047c() || !mo29058n().equals(abstractReadableInstantFieldProperty.mo29058n()) || !C12652e.m53791a(mo27694i(), abstractReadableInstantFieldProperty.mo27694i())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo29051f() {
        return Integer.toString(mo29047c());
    }

    /* renamed from: g */
    public String mo29052g() {
        return mo29053h((Locale) null);
    }

    /* renamed from: h */
    public String mo29053h(Locale locale) {
        return mo27695m().mo28836o(mo27696u(), locale);
    }

    public int hashCode() {
        return (mo29047c() * 17) + mo29058n().hashCode() + mo27694i().hashCode();
    }

    /* renamed from: i */
    public C12589a mo27694i() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    /* renamed from: j */
    public int mo29055j(C12712l lVar) {
        if (lVar == null) {
            return mo27695m().mo28839r(mo27696u(), C12641d.m53368c());
        }
        return mo27695m().mo28839r(mo27696u(), lVar.mo27912k());
    }

    /* renamed from: k */
    public long mo29056k(C12712l lVar) {
        if (lVar == null) {
            return mo27695m().mo28840s(mo27696u(), C12641d.m53368c());
        }
        return mo27695m().mo28840s(mo27696u(), lVar.mo27912k());
    }

    /* renamed from: l */
    public C12646e mo29057l() {
        return mo27695m().mo28841t();
    }

    /* renamed from: m */
    public abstract C12599c mo27695m();

    /* renamed from: n */
    public DateTimeFieldType mo29058n() {
        return mo27695m().mo28806I();
    }

    /* renamed from: o */
    public int mo29059o() {
        return mo27695m().mo28843u(mo27696u());
    }

    /* renamed from: p */
    public C12646e mo29060p() {
        return mo27695m().mo28844v();
    }

    /* renamed from: q */
    public int mo29061q(Locale locale) {
        return mo27695m().mo28845w(locale);
    }

    /* renamed from: r */
    public int mo29062r(Locale locale) {
        return mo27695m().mo28846x(locale);
    }

    /* renamed from: s */
    public int mo29063s() {
        return mo27695m().mo28848z(mo27696u());
    }

    /* renamed from: t */
    public int mo29064t() {
        return mo27695m().mo28847y();
    }

    public String toString() {
        return "Property[" + mo29068x() + "]";
    }

    /* renamed from: u */
    public abstract long mo27696u();

    /* renamed from: v */
    public int mo29066v() {
        return mo27695m().mo28801D(mo27696u());
    }

    /* renamed from: w */
    public int mo29067w() {
        return mo27695m().mo28800C();
    }

    /* renamed from: x */
    public String mo29068x() {
        return mo27695m().mo28804G();
    }

    /* renamed from: y */
    public C12646e mo29069y() {
        return mo27695m().mo28805H();
    }

    /* renamed from: z */
    public boolean mo29070z() {
        return mo27695m().mo28807J(mo27696u());
    }
}
