package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.C12649b;
import org.joda.time.field.C12652e;
import org.joda.time.field.UnsupportedDurationField;

/* renamed from: org.joda.time.chrono.d */
public final class C12610d extends C12649b {

    /* renamed from: c */
    public static final int f31063c = 1;

    /* renamed from: b */
    public final String f31064b;

    public C12610d(String str) {
        super(DateTimeFieldType.m51308D());
        this.f31064b = str;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return null;
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return false;
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        return Long.MAX_VALUE;
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: P */
    public long mo28813P(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, 1, 1);
        return j;
    }

    /* renamed from: U */
    public long mo28818U(long j, String str, Locale locale) {
        if (this.f31064b.equals(str) || "1".equals(str)) {
            return j;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m51308D(), str);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return 1;
    }

    /* renamed from: m */
    public String mo28834m(int i, Locale locale) {
        return this.f31064b;
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51457c());
    }

    /* renamed from: x */
    public int mo28846x(Locale locale) {
        return this.f31064b.length();
    }

    /* renamed from: y */
    public int mo28847y() {
        return 1;
    }
}
