package org.joda.time.field;

import java.util.Locale;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.a */
public abstract class C12648a {
    /* renamed from: a */
    public int mo29096a(C12712l lVar) {
        if (lVar != null) {
            int c = mo28213c();
            int T = lVar.mo28711T(mo29106k());
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
    public int mo29097b(C12714n nVar) {
        if (nVar != null) {
            int c = mo28213c();
            int T = nVar.mo27959T(mo29106k());
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

    /* renamed from: c */
    public abstract int mo28213c();

    /* renamed from: d */
    public String mo29098d() {
        return mo29099e((Locale) null);
    }

    /* renamed from: e */
    public String mo29099e(Locale locale) {
        return mo28214j().mo28832k(mo28215t(), mo28213c(), locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12648a)) {
            return false;
        }
        C12648a aVar = (C12648a) obj;
        if (mo28213c() == aVar.mo28213c() && mo29106k() == aVar.mo29106k() && C12652e.m53791a(mo28215t().mo27982m(), aVar.mo28215t().mo27982m())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo29101f() {
        return Integer.toString(mo28213c());
    }

    /* renamed from: g */
    public String mo29102g() {
        return mo29103h((Locale) null);
    }

    /* renamed from: h */
    public String mo29103h(Locale locale) {
        return mo28214j().mo28837p(mo28215t(), mo28213c(), locale);
    }

    public int hashCode() {
        return ((((247 + mo28213c()) * 13) + mo29106k().hashCode()) * 13) + mo28215t().mo27982m().hashCode();
    }

    /* renamed from: i */
    public C12646e mo29105i() {
        return mo28214j().mo28841t();
    }

    /* renamed from: j */
    public abstract C12599c mo28214j();

    /* renamed from: k */
    public DateTimeFieldType mo29106k() {
        return mo28214j().mo28806I();
    }

    /* renamed from: l */
    public int mo29107l(Locale locale) {
        return mo28214j().mo28845w(locale);
    }

    /* renamed from: m */
    public int mo29108m(Locale locale) {
        return mo28214j().mo28846x(locale);
    }

    /* renamed from: n */
    public int mo29109n() {
        return mo28214j().mo28798A(mo28215t());
    }

    /* renamed from: o */
    public int mo29110o() {
        return mo28214j().mo28847y();
    }

    /* renamed from: p */
    public int mo29111p() {
        return mo28214j().mo28802E(mo28215t());
    }

    /* renamed from: q */
    public int mo29112q() {
        return mo28214j().mo28800C();
    }

    /* renamed from: r */
    public String mo29113r() {
        return mo28214j().mo28804G();
    }

    /* renamed from: s */
    public C12646e mo29114s() {
        return mo28214j().mo28805H();
    }

    /* renamed from: t */
    public abstract C12714n mo28215t();

    public String toString() {
        return "Property[" + mo29113r() + "]";
    }
}
