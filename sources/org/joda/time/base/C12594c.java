package org.joda.time.base;

import java.util.Date;
import org.joda.convert.ToString;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12641d;
import org.joda.time.C12712l;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

/* renamed from: org.joda.time.base.c */
public abstract class C12594c implements C12712l {
    /* renamed from: F0 */
    public boolean mo28738F0() {
        return mo28756u0(C12641d.m53368c());
    }

    /* renamed from: H0 */
    public boolean mo28739H0(long j) {
        return mo27912k() == j;
    }

    /* renamed from: I */
    public boolean mo28740I(C12712l lVar) {
        return mo28751m0(C12641d.m53375j(lVar));
    }

    /* renamed from: K */
    public boolean mo28741K(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.mo27802F(mo27913m()).mo28809L();
    }

    /* renamed from: K1 */
    public DateTimeZone mo28742K1() {
        return mo27913m().mo27836s();
    }

    /* renamed from: L0 */
    public boolean mo28743L0() {
        return mo28739H0(C12641d.m53368c());
    }

    /* renamed from: O0 */
    public Date mo28744O0() {
        return new Date(mo27912k());
    }

    /* renamed from: O1 */
    public Instant mo27910O1() {
        return new Instant(mo27912k());
    }

    /* renamed from: P0 */
    public MutableDateTime mo27911P0() {
        return new MutableDateTime(mo27912k(), mo28742K1());
    }

    /* renamed from: R0 */
    public DateTime mo27723R0(C12589a aVar) {
        return new DateTime(mo27912k(), aVar);
    }

    /* renamed from: T */
    public int mo28711T(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.mo27802F(mo27913m()).mo28828g(mo27912k());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: U0 */
    public DateTime mo27729U0(DateTimeZone dateTimeZone) {
        return new DateTime(mo27912k(), C12641d.m53370e(mo27913m()).mo27835R(dateTimeZone));
    }

    /* renamed from: V */
    public DateTime mo27732V() {
        return new DateTime(mo27912k(), mo28742K1());
    }

    /* renamed from: Z */
    public int mo28745Z(C12599c cVar) {
        if (cVar != null) {
            return cVar.mo28828g(mo27912k());
        }
        throw new IllegalArgumentException("The DateTimeField must not be null");
    }

    /* renamed from: b */
    public int compareTo(C12712l lVar) {
        int i;
        if (this == lVar || mo27912k() == lVar.mo27912k()) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b1 */
    public boolean mo28747b1(C12712l lVar) {
        return mo28739H0(C12641d.m53375j(lVar));
    }

    /* renamed from: c1 */
    public DateTime mo27745c1() {
        return new DateTime(mo27912k(), (C12589a) ISOChronology.m52934b0(mo28742K1()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12712l)) {
            return false;
        }
        C12712l lVar = (C12712l) obj;
        if (mo27912k() != lVar.mo27912k() || !C12652e.m53791a(mo27913m(), lVar.mo27913m())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((int) (mo27912k() ^ (mo27912k() >>> 32))) + mo27913m().hashCode();
    }

    /* renamed from: m0 */
    public boolean mo28751m0(long j) {
        return mo27912k() > j;
    }

    /* renamed from: n */
    public boolean mo28752n(C12712l lVar) {
        return mo28756u0(C12641d.m53375j(lVar));
    }

    /* renamed from: n1 */
    public MutableDateTime mo28753n1(C12589a aVar) {
        return new MutableDateTime(mo27912k(), aVar);
    }

    /* renamed from: o0 */
    public boolean mo28754o0() {
        return mo28751m0(C12641d.m53368c());
    }

    /* renamed from: q1 */
    public MutableDateTime mo28755q1(DateTimeZone dateTimeZone) {
        return new MutableDateTime(mo27912k(), C12641d.m53370e(mo27913m()).mo27835R(dateTimeZone));
    }

    @ToString
    public String toString() {
        return C12683i.m54172B().mo29259v(this);
    }

    /* renamed from: u0 */
    public boolean mo28756u0(long j) {
        return mo27912k() < j;
    }

    /* renamed from: w1 */
    public MutableDateTime mo27919w1() {
        return new MutableDateTime(mo27912k(), (C12589a) ISOChronology.m52934b0(mo28742K1()));
    }

    /* renamed from: z1 */
    public String mo28757z1(C12674b bVar) {
        if (bVar == null) {
            return toString();
        }
        return bVar.mo29259v(this);
    }
}
