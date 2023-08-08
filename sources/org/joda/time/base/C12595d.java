package org.joda.time.base;

import org.joda.time.C12641d;
import org.joda.time.C12712l;
import org.joda.time.C12713m;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

/* renamed from: org.joda.time.base.d */
public abstract class C12595d implements C12713m {
    /* renamed from: A */
    public Interval mo27920A() {
        return new Interval(mo28676v(), mo28673K(), mo28675m());
    }

    /* renamed from: B */
    public boolean mo28758B(C12713m mVar) {
        long j;
        if (mVar == null) {
            j = C12641d.m53368c();
        } else {
            j = mVar.mo28673K();
        }
        if (mo28676v() >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean mo28759F(C12713m mVar) {
        if (mVar == null) {
            return mo28765O();
        }
        long v = mVar.mo28676v();
        long K = mVar.mo28673K();
        long v2 = mo28676v();
        long K2 = mo28673K();
        if (v2 > v || v >= K2 || K > K2) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public Duration mo28760G() {
        long e = mo28772e();
        if (e == 0) {
            return Duration.f30671a;
        }
        return new Duration(e);
    }

    /* renamed from: I */
    public boolean mo28761I(C12712l lVar) {
        if (lVar == null) {
            return mo28767R();
        }
        return mo28766P(lVar.mo27912k());
    }

    /* renamed from: J */
    public boolean mo28762J(C12713m mVar) {
        long v = mo28676v();
        long K = mo28673K();
        if (mVar == null) {
            long c = C12641d.m53368c();
            if (v >= c || c >= K) {
                return false;
            }
            return true;
        }
        long v2 = mVar.mo28676v();
        if (v >= mVar.mo28673K() || v2 >= K) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public void mo28763L(long j, long j2) {
        if (j2 < j) {
            throw new IllegalArgumentException("The end instant must be greater than the start instant");
        }
    }

    /* renamed from: N */
    public boolean mo28764N(long j) {
        long v = mo28676v();
        long K = mo28673K();
        if (j < v || j >= K) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public boolean mo28765O() {
        return mo28764N(C12641d.m53368c());
    }

    /* renamed from: P */
    public boolean mo28766P(long j) {
        return mo28676v() > j;
    }

    /* renamed from: R */
    public boolean mo28767R() {
        return mo28766P(C12641d.m53368c());
    }

    /* renamed from: S */
    public boolean mo28768S(long j) {
        return mo28673K() <= j;
    }

    /* renamed from: T */
    public boolean mo28769T() {
        return mo28768S(C12641d.m53368c());
    }

    /* renamed from: U */
    public boolean mo28770U(C12713m mVar) {
        if (mo28676v() == mVar.mo28676v() && mo28673K() == mVar.mo28673K()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public MutableInterval mo28771b() {
        return new MutableInterval(mo28676v(), mo28673K(), mo28675m());
    }

    /* renamed from: e */
    public long mo28772e() {
        return C12652e.m53803m(mo28673K(), mo28676v());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12713m)) {
            return false;
        }
        C12713m mVar = (C12713m) obj;
        if (mo28676v() == mVar.mo28676v() && mo28673K() == mVar.mo28673K() && C12652e.m53791a(mo28675m(), mVar.mo28675m())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo28774f(C12713m mVar) {
        if (mVar == null) {
            return mo28769T();
        }
        return mo28768S(mVar.mo28676v());
    }

    public DateTime getEnd() {
        return new DateTime(mo28673K(), mo28675m());
    }

    public DateTime getStart() {
        return new DateTime(mo28676v(), mo28675m());
    }

    public int hashCode() {
        long v = mo28676v();
        long K = mo28673K();
        return ((((3007 + ((int) (v ^ (v >>> 32)))) * 31) + ((int) (K ^ (K >>> 32)))) * 31) + mo28675m().hashCode();
    }

    /* renamed from: k */
    public Period mo28778k(PeriodType periodType) {
        return new Period(mo28676v(), mo28673K(), periodType, mo28675m());
    }

    /* renamed from: l */
    public Period mo28779l() {
        return new Period(mo28676v(), mo28673K(), mo28675m());
    }

    /* renamed from: n */
    public boolean mo28780n(C12712l lVar) {
        if (lVar == null) {
            return mo28769T();
        }
        return mo28768S(lVar.mo27912k());
    }

    public String toString() {
        C12674b N = C12683i.m54172B().mo29230N(mo28675m());
        StringBuffer stringBuffer = new StringBuffer(48);
        N.mo29221E(stringBuffer, mo28676v());
        stringBuffer.append('/');
        N.mo29221E(stringBuffer, mo28673K());
        return stringBuffer.toString();
    }

    /* renamed from: x */
    public boolean mo28782x(C12712l lVar) {
        if (lVar == null) {
            return mo28765O();
        }
        return mo28764N(lVar.mo27912k());
    }
}
