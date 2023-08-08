package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.field.C12652e;

public class MutableInterval extends BaseInterval implements C12708h, Cloneable, Serializable {
    private static final long serialVersionUID = -5982824024992428470L;

    public MutableInterval() {
        super(0, 0, (C12589a) null);
    }

    /* renamed from: Z */
    public static MutableInterval m51985Z(String str) {
        return new MutableInterval(str);
    }

    /* renamed from: C */
    public void mo28311C(C12712l lVar, C12712l lVar2) {
        if (lVar == null && lVar2 == null) {
            long c = C12641d.m53368c();
            mo28323o(c, c);
            return;
        }
        super.mo28674V(C12641d.m53375j(lVar), C12641d.m53375j(lVar2), C12641d.m53374i(lVar));
    }

    /* renamed from: D */
    public void mo28312D(long j) {
        super.mo28674V(j, mo28673K(), mo28675m());
    }

    /* renamed from: E */
    public void mo28313E(C12712l lVar) {
        super.mo28674V(C12641d.m53375j(lVar), mo28673K(), mo28675m());
    }

    /* renamed from: H */
    public void mo28314H(C12589a aVar) {
        super.mo28674V(mo28676v(), mo28673K(), aVar);
    }

    /* renamed from: Y */
    public MutableInterval mo28315Y() {
        return (MutableInterval) clone();
    }

    /* renamed from: a0 */
    public void mo28316a0(long j) {
        mo28324s(C12652e.m53795e(mo28676v(), j));
    }

    /* renamed from: b0 */
    public void mo28317b0(long j) {
        mo28312D(C12652e.m53795e(mo28673K(), -j));
    }

    /* renamed from: c */
    public void mo28318c(C12715o oVar) {
        if (oVar == null) {
            mo28324s(mo28676v());
        } else {
            mo28324s(mo28675m().mo28636b(oVar, mo28676v(), 1));
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    /* renamed from: h */
    public void mo28320h(C12713m mVar) {
        if (mVar != null) {
            super.mo28674V(mVar.mo28676v(), mVar.mo28673K(), mVar.mo28675m());
            return;
        }
        throw new IllegalArgumentException("Interval must not be null");
    }

    /* renamed from: i */
    public void mo28321i(C12715o oVar) {
        if (oVar == null) {
            mo28312D(mo28673K());
        } else {
            mo28312D(mo28675m().mo28636b(oVar, mo28673K(), -1));
        }
    }

    /* renamed from: j */
    public void mo28322j(C12712l lVar) {
        super.mo28674V(mo28676v(), C12641d.m53375j(lVar), mo28675m());
    }

    /* renamed from: o */
    public void mo28323o(long j, long j2) {
        super.mo28674V(j, j2, mo28675m());
    }

    /* renamed from: s */
    public void mo28324s(long j) {
        super.mo28674V(mo28676v(), j, mo28675m());
    }

    /* renamed from: t */
    public void mo28325t(C12711k kVar) {
        mo28312D(C12652e.m53795e(mo28673K(), -C12641d.m53373h(kVar)));
    }

    /* renamed from: u */
    public void mo28326u(C12711k kVar) {
        mo28324s(C12652e.m53795e(mo28676v(), C12641d.m53373h(kVar)));
    }

    public MutableInterval(long j, long j2) {
        super(j, j2, (C12589a) null);
    }

    public MutableInterval(long j, long j2, C12589a aVar) {
        super(j, j2, aVar);
    }

    public MutableInterval(C12712l lVar, C12712l lVar2) {
        super(lVar, lVar2);
    }

    public MutableInterval(C12712l lVar, C12711k kVar) {
        super(lVar, kVar);
    }

    public MutableInterval(C12711k kVar, C12712l lVar) {
        super(kVar, lVar);
    }

    public MutableInterval(C12712l lVar, C12715o oVar) {
        super(lVar, oVar);
    }

    public MutableInterval(C12715o oVar, C12712l lVar) {
        super(oVar, lVar);
    }

    public MutableInterval(Object obj) {
        super(obj, (C12589a) null);
    }

    public MutableInterval(Object obj, C12589a aVar) {
        super(obj, aVar);
    }
}
