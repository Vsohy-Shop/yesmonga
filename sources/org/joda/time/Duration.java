package org.joda.time;

import com.urbanairship.AirshipConfigOptions;
import java.io.Serializable;
import java.math.RoundingMode;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.C12652e;

public final class Duration extends BaseDuration implements C12711k, Serializable {

    /* renamed from: a */
    public static final Duration f30671a = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j) {
        super(j);
    }

    @FromString
    /* renamed from: F0 */
    public static Duration m51428F0(String str) {
        return new Duration((Object) str);
    }

    /* renamed from: L0 */
    public static Duration m51429L0(long j) {
        if (j == 0) {
            return f30671a;
        }
        return new Duration(C12652e.m53799i(j, 86400000));
    }

    /* renamed from: N0 */
    public static Duration m51430N0(long j) {
        if (j == 0) {
            return f30671a;
        }
        return new Duration(C12652e.m53799i(j, 3600000));
    }

    /* renamed from: O0 */
    public static Duration m51431O0(long j) {
        if (j == 0) {
            return f30671a;
        }
        return new Duration(C12652e.m53799i(j, 60000));
    }

    /* renamed from: R0 */
    public static Duration m51432R0(long j) {
        if (j == 0) {
            return f30671a;
        }
        return new Duration(C12652e.m53799i(j, 1000));
    }

    /* renamed from: p0 */
    public static Duration m51433p0(long j) {
        if (j == 0) {
            return f30671a;
        }
        return new Duration(j);
    }

    /* renamed from: A0 */
    public Duration mo27856A0(long j) {
        return j == 1 ? this : new Duration(C12652e.m53800j(mo28667k(), j));
    }

    /* renamed from: C0 */
    public Duration mo27857C0() {
        if (mo28667k() != Long.MIN_VALUE) {
            return new Duration(-mo28667k());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    /* renamed from: G */
    public Duration mo27858G() {
        return this;
    }

    /* renamed from: H0 */
    public Duration mo27859H0(long j) {
        return mo27871n1(j, 1);
    }

    /* renamed from: K0 */
    public Duration mo27860K0(C12711k kVar) {
        return kVar == null ? this : mo27871n1(kVar.mo28667k(), 1);
    }

    /* renamed from: U0 */
    public Days mo27861U0() {
        return Days.m51406Q(C12652e.m53804n(mo27866f0()));
    }

    /* renamed from: X */
    public Duration mo27862X() {
        if (mo28667k() < 0) {
            return mo27857C0();
        }
        return this;
    }

    /* renamed from: Z */
    public Duration mo27863Z(long j) {
        return j == 1 ? this : new Duration(C12652e.m53796f(mo28667k(), j));
    }

    /* renamed from: c1 */
    public Hours mo27864c1() {
        return Hours.m51472X(C12652e.m53804n(mo27869m0()));
    }

    /* renamed from: e0 */
    public Duration mo27865e0(long j, RoundingMode roundingMode) {
        return j == 1 ? this : new Duration(C12652e.m53797g(mo28667k(), j, roundingMode));
    }

    /* renamed from: f0 */
    public long mo27866f0() {
        return mo28667k() / 86400000;
    }

    /* renamed from: j1 */
    public Minutes mo27867j1() {
        return Minutes.m51824p0(C12652e.m53804n(mo27870n0()));
    }

    /* renamed from: k1 */
    public Seconds mo27868k1() {
        return Seconds.m52179N0(C12652e.m53804n(mo27872o0()));
    }

    /* renamed from: m0 */
    public long mo27869m0() {
        return mo28667k() / 3600000;
    }

    /* renamed from: n0 */
    public long mo27870n0() {
        return mo28667k() / AirshipConfigOptions.f87111Y;
    }

    /* renamed from: n1 */
    public Duration mo27871n1(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return new Duration(C12652e.m53795e(mo28667k(), C12652e.m53799i(j, i)));
    }

    /* renamed from: o0 */
    public long mo27872o0() {
        return mo28667k() / 1000;
    }

    /* renamed from: q1 */
    public Duration mo27873q1(C12711k kVar, int i) {
        return (kVar == null || i == 0) ? this : mo27871n1(kVar.mo28667k(), i);
    }

    /* renamed from: t0 */
    public Duration mo27874t0(long j) {
        return mo27871n1(j, -1);
    }

    /* renamed from: u0 */
    public Duration mo27875u0(C12711k kVar) {
        return kVar == null ? this : mo27871n1(kVar.mo28667k(), -1);
    }

    /* renamed from: w1 */
    public Duration mo27876w1(long j) {
        if (j == mo28667k()) {
            return this;
        }
        return new Duration(j);
    }

    public Duration(long j, long j2) {
        super(j, j2);
    }

    public Duration(C12712l lVar, C12712l lVar2) {
        super(lVar, lVar2);
    }

    public Duration(Object obj) {
        super(obj);
    }
}
