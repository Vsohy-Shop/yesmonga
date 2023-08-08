package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.C12594c;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C12624d;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class Instant extends C12594c implements C12712l, Serializable {

    /* renamed from: a */
    public static final Instant f30708a = new Instant(0);
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant() {
        this.iMillis = C12641d.m53368c();
    }

    /* renamed from: H1 */
    public static Instant m51507H1() {
        return new Instant();
    }

    /* renamed from: T1 */
    public static Instant m51508T1(long j) {
        return new Instant(j);
    }

    /* renamed from: i2 */
    public static Instant m51509i2(long j) {
        return new Instant(C12652e.m53799i(j, 1000));
    }

    @FromString
    /* renamed from: j2 */
    public static Instant m51510j2(String str) {
        return m51511k2(str, C12683i.m54174D());
    }

    /* renamed from: k2 */
    public static Instant m51511k2(String str, C12674b bVar) {
        return bVar.mo29251n(str).mo27910O1();
    }

    /* renamed from: B1 */
    public Instant mo27908B1(long j) {
        return mo27916p2(j, -1);
    }

    /* renamed from: F1 */
    public Instant mo27909F1(C12711k kVar) {
        return mo27917q2(kVar, -1);
    }

    /* renamed from: O1 */
    public Instant mo27910O1() {
        return this;
    }

    /* renamed from: P0 */
    public MutableDateTime mo27911P0() {
        return new MutableDateTime(mo27912k(), (C12589a) ISOChronology.m52933a0());
    }

    /* renamed from: V */
    public DateTime mo27732V() {
        return new DateTime(mo27912k(), (C12589a) ISOChronology.m52933a0());
    }

    @Deprecated
    /* renamed from: c1 */
    public DateTime mo27745c1() {
        return mo27732V();
    }

    /* renamed from: k */
    public long mo27912k() {
        return this.iMillis;
    }

    /* renamed from: m */
    public C12589a mo27913m() {
        return ISOChronology.m52935c0();
    }

    /* renamed from: n2 */
    public Instant mo27914n2(long j) {
        return mo27916p2(j, 1);
    }

    /* renamed from: o2 */
    public Instant mo27915o2(C12711k kVar) {
        return mo27917q2(kVar, 1);
    }

    /* renamed from: p2 */
    public Instant mo27916p2(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return mo27918r2(mo27913m().mo28635a(mo27912k(), j, i));
    }

    /* renamed from: q2 */
    public Instant mo27917q2(C12711k kVar, int i) {
        return (kVar == null || i == 0) ? this : mo27916p2(kVar.mo28667k(), i);
    }

    /* renamed from: r2 */
    public Instant mo27918r2(long j) {
        return j == this.iMillis ? this : new Instant(j);
    }

    @Deprecated
    /* renamed from: w1 */
    public MutableDateTime mo27919w1() {
        return mo27911P0();
    }

    public Instant(long j) {
        this.iMillis = j;
    }

    public Instant(Object obj) {
        this.iMillis = C12624d.m53287m().mo29005n(obj).mo28989h(obj, ISOChronology.m52935c0());
    }
}
