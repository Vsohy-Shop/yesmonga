package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12711k;
import org.joda.time.C12712l;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.convert.C12624d;
import org.joda.time.field.C12652e;

public abstract class BaseDuration extends C12593b implements C12711k, Serializable {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long iMillis;

    public BaseDuration(long j) {
        this.iMillis = j;
    }

    /* renamed from: M */
    public Period mo28662M(C12712l lVar, PeriodType periodType) {
        return new Period(lVar, (C12711k) this, periodType);
    }

    /* renamed from: Q */
    public Period mo28663Q(C12712l lVar) {
        return new Period((C12711k) this, lVar);
    }

    /* renamed from: Q0 */
    public void mo28664Q0(long j) {
        this.iMillis = j;
    }

    /* renamed from: W */
    public Period mo28665W(C12712l lVar, PeriodType periodType) {
        return new Period((C12711k) this, lVar, periodType);
    }

    /* renamed from: g */
    public Interval mo28666g(C12712l lVar) {
        return new Interval(lVar, (C12711k) this);
    }

    /* renamed from: k */
    public long mo28667k() {
        return this.iMillis;
    }

    /* renamed from: q */
    public Interval mo28668q(C12712l lVar) {
        return new Interval((C12711k) this, lVar);
    }

    /* renamed from: r */
    public Period mo28669r(C12589a aVar) {
        return new Period(mo28667k(), aVar);
    }

    /* renamed from: w */
    public Period mo28670w(PeriodType periodType) {
        return new Period(mo28667k(), periodType);
    }

    /* renamed from: y */
    public Period mo28671y(PeriodType periodType, C12589a aVar) {
        return new Period(mo28667k(), periodType, aVar);
    }

    /* renamed from: z */
    public Period mo28672z(C12712l lVar) {
        return new Period(lVar, (C12711k) this);
    }

    public BaseDuration(long j, long j2) {
        this.iMillis = C12652e.m53803m(j2, j);
    }

    public BaseDuration(C12712l lVar, C12712l lVar2) {
        if (lVar == lVar2) {
            this.iMillis = 0;
            return;
        }
        this.iMillis = C12652e.m53803m(C12641d.m53375j(lVar2), C12641d.m53375j(lVar));
    }

    public BaseDuration(Object obj) {
        this.iMillis = C12624d.m53287m().mo29003k(obj).mo29025c(obj);
    }
}
