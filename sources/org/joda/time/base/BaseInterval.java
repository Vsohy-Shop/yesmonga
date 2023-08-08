package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12708h;
import org.joda.time.C12711k;
import org.joda.time.C12712l;
import org.joda.time.C12713m;
import org.joda.time.C12715o;
import org.joda.time.MutableInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12630i;
import org.joda.time.field.C12652e;

public abstract class BaseInterval extends C12595d implements C12713m, Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile C12589a iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    public BaseInterval(long j, long j2, C12589a aVar) {
        this.iChronology = C12641d.m53370e(aVar);
        mo28763L(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
    }

    /* renamed from: K */
    public long mo28673K() {
        return this.iEndMillis;
    }

    /* renamed from: V */
    public void mo28674V(long j, long j2, C12589a aVar) {
        mo28763L(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
        this.iChronology = C12641d.m53370e(aVar);
    }

    /* renamed from: m */
    public C12589a mo28675m() {
        return this.iChronology;
    }

    /* renamed from: v */
    public long mo28676v() {
        return this.iStartMillis;
    }

    public BaseInterval(C12712l lVar, C12712l lVar2) {
        if (lVar == null && lVar2 == null) {
            long c = C12641d.m53368c();
            this.iEndMillis = c;
            this.iStartMillis = c;
            this.iChronology = ISOChronology.m52933a0();
            return;
        }
        this.iChronology = C12641d.m53374i(lVar);
        this.iStartMillis = C12641d.m53375j(lVar);
        this.iEndMillis = C12641d.m53375j(lVar2);
        mo28763L(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(C12712l lVar, C12711k kVar) {
        this.iChronology = C12641d.m53374i(lVar);
        this.iStartMillis = C12641d.m53375j(lVar);
        this.iEndMillis = C12652e.m53795e(this.iStartMillis, C12641d.m53373h(kVar));
        mo28763L(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(C12711k kVar, C12712l lVar) {
        this.iChronology = C12641d.m53374i(lVar);
        this.iEndMillis = C12641d.m53375j(lVar);
        this.iStartMillis = C12652e.m53795e(this.iEndMillis, -C12641d.m53373h(kVar));
        mo28763L(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(C12712l lVar, C12715o oVar) {
        C12589a i = C12641d.m53374i(lVar);
        this.iChronology = i;
        this.iStartMillis = C12641d.m53375j(lVar);
        if (oVar == null) {
            this.iEndMillis = this.iStartMillis;
        } else {
            this.iEndMillis = i.mo28636b(oVar, this.iStartMillis, 1);
        }
        mo28763L(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(C12715o oVar, C12712l lVar) {
        C12589a i = C12641d.m53374i(lVar);
        this.iChronology = i;
        this.iEndMillis = C12641d.m53375j(lVar);
        if (oVar == null) {
            this.iStartMillis = this.iEndMillis;
        } else {
            this.iStartMillis = i.mo28636b(oVar, this.iEndMillis, -1);
        }
        mo28763L(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(Object obj, C12589a aVar) {
        C12630i p = C12624d.m53287m().mo29007p(obj);
        if (p.mo29027g(obj, aVar)) {
            C12713m mVar = (C12713m) obj;
            this.iChronology = aVar == null ? mVar.mo28675m() : aVar;
            this.iStartMillis = mVar.mo28676v();
            this.iEndMillis = mVar.mo28673K();
        } else if (this instanceof C12708h) {
            p.mo29026f((C12708h) this, obj, aVar);
        } else {
            MutableInterval mutableInterval = new MutableInterval();
            p.mo29026f(mutableInterval, obj, aVar);
            this.iChronology = mutableInterval.mo28675m();
            this.iStartMillis = mutableInterval.mo28676v();
            this.iEndMillis = mutableInterval.mo28673K();
        }
        mo28763L(this.iStartMillis, this.iEndMillis);
    }
}
