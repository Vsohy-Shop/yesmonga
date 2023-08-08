package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Interval extends BaseInterval implements C12713m, Serializable {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval(long j, long j2) {
        super(j, j2, (C12589a) null);
    }

    /* renamed from: b0 */
    public static Interval m51526b0(String str) {
        return new Interval(str);
    }

    /* renamed from: c0 */
    public static Interval m51527c0(String str) {
        DateTime dateTime;
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            if (substring.length() > 0) {
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    C12674b Q = C12683i.m54174D().mo29233Q();
                    C12692p e = C12685j.m54341e();
                    char charAt = substring.charAt(0);
                    Period period = null;
                    if (charAt == 'P' || charAt == 'p') {
                        period = e.mo29327q(PeriodType.m52156q()).mo29322l(substring);
                        dateTime = null;
                    } else {
                        dateTime = Q.mo29251n(substring);
                    }
                    char charAt2 = substring2.charAt(0);
                    if (charAt2 != 'P' && charAt2 != 'p') {
                        DateTime n = Q.mo29251n(substring2);
                        if (period != null) {
                            return new Interval((C12715o) period, (C12712l) n);
                        }
                        return new Interval((C12712l) dateTime, (C12712l) n);
                    } else if (period == null) {
                        return new Interval((C12712l) dateTime, (C12715o) e.mo29327q(PeriodType.m52156q()).mo29322l(substring2));
                    } else {
                        throw new IllegalArgumentException("Interval composed of two durations: " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Format invalid: " + str);
                }
            } else {
                throw new IllegalArgumentException("Format invalid: " + str);
            }
        } else {
            throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }
    }

    /* renamed from: A */
    public Interval mo27920A() {
        return this;
    }

    /* renamed from: Y */
    public boolean mo27921Y(C12713m mVar) {
        if (mVar == null) {
            long c = C12641d.m53368c();
            if (mo28676v() == c || mo28673K() == c) {
                return true;
            }
            return false;
        } else if (mVar.mo28673K() == mo28676v() || mo28673K() == mVar.mo28676v()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: Z */
    public Interval mo27922Z(C12713m mVar) {
        C12713m n = C12641d.m53379n(mVar);
        long v = n.mo28676v();
        long K = n.mo28673K();
        long v2 = mo28676v();
        long K2 = mo28673K();
        if (v2 > K) {
            return new Interval(K, v2, mo28675m());
        }
        if (v > K2) {
            return new Interval(K2, v, mo28675m());
        }
        return null;
    }

    /* renamed from: a0 */
    public Interval mo27923a0(C12713m mVar) {
        C12713m n = C12641d.m53379n(mVar);
        if (!mo28762J(n)) {
            return null;
        }
        return new Interval(Math.max(mo28676v(), n.mo28676v()), Math.min(mo28673K(), n.mo28673K()), mo28675m());
    }

    /* renamed from: d0 */
    public Interval mo27924d0(C12589a aVar) {
        if (mo28675m() == aVar) {
            return this;
        }
        return new Interval(mo28676v(), mo28673K(), aVar);
    }

    /* renamed from: g0 */
    public Interval mo27925g0(C12711k kVar) {
        long h = C12641d.m53373h(kVar);
        if (h == mo28772e()) {
            return this;
        }
        C12589a m = mo28675m();
        long v = mo28676v();
        return new Interval(v, m.mo28635a(v, h, 1), m);
    }

    /* renamed from: k0 */
    public Interval mo27926k0(C12711k kVar) {
        long h = C12641d.m53373h(kVar);
        if (h == mo28772e()) {
            return this;
        }
        C12589a m = mo28675m();
        long K = mo28673K();
        return new Interval(m.mo28635a(K, h, -1), K, m);
    }

    /* renamed from: l0 */
    public Interval mo27927l0(C12712l lVar) {
        return mo27928m0(C12641d.m53375j(lVar));
    }

    /* renamed from: m0 */
    public Interval mo27928m0(long j) {
        if (j == mo28673K()) {
            return this;
        }
        return new Interval(mo28676v(), j, mo28675m());
    }

    /* renamed from: o0 */
    public Interval mo27929o0(C12715o oVar) {
        if (oVar == null) {
            return mo27925g0((C12711k) null);
        }
        C12589a m = mo28675m();
        long v = mo28676v();
        return new Interval(v, m.mo28636b(oVar, v, 1), m);
    }

    /* renamed from: q0 */
    public Interval mo27930q0(C12715o oVar) {
        if (oVar == null) {
            return mo27926k0((C12711k) null);
        }
        C12589a m = mo28675m();
        long K = mo28673K();
        return new Interval(m.mo28636b(oVar, K, -1), K, m);
    }

    /* renamed from: r0 */
    public Interval mo27931r0(C12712l lVar) {
        return mo27932s0(C12641d.m53375j(lVar));
    }

    /* renamed from: s0 */
    public Interval mo27932s0(long j) {
        if (j == mo28676v()) {
            return this;
        }
        return new Interval(j, mo28673K(), mo28675m());
    }

    public Interval(long j, long j2, DateTimeZone dateTimeZone) {
        super(j, j2, ISOChronology.m52934b0(dateTimeZone));
    }

    public Interval(long j, long j2, C12589a aVar) {
        super(j, j2, aVar);
    }

    public Interval(C12712l lVar, C12712l lVar2) {
        super(lVar, lVar2);
    }

    public Interval(C12712l lVar, C12711k kVar) {
        super(lVar, kVar);
    }

    public Interval(C12711k kVar, C12712l lVar) {
        super(kVar, lVar);
    }

    public Interval(C12712l lVar, C12715o oVar) {
        super(lVar, oVar);
    }

    public Interval(C12715o oVar, C12712l lVar) {
        super(oVar, lVar);
    }

    public Interval(Object obj) {
        super(obj, (C12589a) null);
    }

    public Interval(Object obj, C12589a aVar) {
        super(obj, aVar);
    }
}
