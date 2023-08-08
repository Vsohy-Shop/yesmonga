package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12710j;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12629h;

public abstract class BaseDateTime extends C12592a implements C12710j, Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile C12589a iChronology;
    private volatile long iMillis;

    public BaseDateTime() {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52933a0());
    }

    /* renamed from: H */
    public void mo28239H(C12589a aVar) {
        this.iChronology = mo28661T1(aVar);
    }

    /* renamed from: H1 */
    public final void mo28660H1() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.mo27834Q();
        }
    }

    /* renamed from: Q0 */
    public void mo28255Q0(long j) {
        this.iMillis = mo27657i2(j, this.iChronology);
    }

    /* renamed from: T1 */
    public C12589a mo28661T1(C12589a aVar) {
        return C12641d.m53370e(aVar);
    }

    /* renamed from: i2 */
    public long mo27657i2(long j, C12589a aVar) {
        return j;
    }

    /* renamed from: k */
    public long mo27912k() {
        return this.iMillis;
    }

    /* renamed from: m */
    public C12589a mo27913m() {
        return this.iChronology;
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public BaseDateTime(C12589a aVar) {
        this(C12641d.m53368c(), aVar);
    }

    public BaseDateTime(long j) {
        this(j, (C12589a) ISOChronology.m52933a0());
    }

    public BaseDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public BaseDateTime(long j, C12589a aVar) {
        this.iChronology = mo28661T1(aVar);
        this.iMillis = mo27657i2(j, this.iChronology);
        mo28660H1();
    }

    public BaseDateTime(Object obj, DateTimeZone dateTimeZone) {
        C12629h n = C12624d.m53287m().mo29005n(obj);
        C12589a T1 = mo28661T1(n.mo28985b(obj, dateTimeZone));
        this.iChronology = T1;
        this.iMillis = mo27657i2(n.mo28989h(obj, T1), T1);
        mo28660H1();
    }

    public BaseDateTime(Object obj, C12589a aVar) {
        C12629h n = C12624d.m53287m().mo29005n(obj);
        this.iChronology = mo28661T1(n.mo28984a(obj, aVar));
        this.iMillis = mo27657i2(n.mo28989h(obj, aVar), this.iChronology);
        mo28660H1();
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, (C12589a) ISOChronology.m52933a0());
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        this(i, i2, i3, i4, i5, i6, i7, (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C12589a aVar) {
        this.iChronology = mo28661T1(aVar);
        this.iMillis = mo27657i2(this.iChronology.mo28651q(i, i2, i3, i4, i5, i6, i7), this.iChronology);
        mo28660H1();
    }
}
