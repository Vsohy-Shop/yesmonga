package org.joda.time;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

final class UTCDateTimeZone extends DateTimeZone {

    /* renamed from: g */
    public static final DateTimeZone f30804g = new UTCDateTimeZone();
    private static final long serialVersionUID = -3513011772763289092L;

    public UTCDateTimeZone() {
        super("UTC");
    }

    /* renamed from: C */
    public int mo27811C(long j) {
        return 0;
    }

    /* renamed from: D */
    public boolean mo27812D() {
        return true;
    }

    /* renamed from: G */
    public long mo27815G(long j) {
        return j;
    }

    /* renamed from: I */
    public long mo27816I(long j) {
        return j;
    }

    /* renamed from: N */
    public TimeZone mo27817N() {
        return new SimpleTimeZone(0, mo27824q());
    }

    public boolean equals(Object obj) {
        return obj instanceof UTCDateTimeZone;
    }

    public int hashCode() {
        return mo27824q().hashCode();
    }

    /* renamed from: u */
    public String mo27829u(long j) {
        return "UTC";
    }

    /* renamed from: w */
    public int mo27830w(long j) {
        return 0;
    }

    /* renamed from: y */
    public int mo27833y(long j) {
        return 0;
    }
}
