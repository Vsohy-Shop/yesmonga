package org.joda.time.field;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.f */
public class C12653f extends C12650c {

    /* renamed from: g */
    public static final long f31142g = 3145790132623583142L;

    /* renamed from: d */
    public final int f31143d;

    /* renamed from: e */
    public final int f31144e;

    /* renamed from: f */
    public final int f31145f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12653f(C12599c cVar, int i) {
        this(cVar, cVar == null ? null : cVar.mo28806I(), i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31144e;
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        return mo29116Z().mo28807J(j);
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return mo29116Z().mo28810M(j);
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        return mo29116Z().mo28811N(j);
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return mo29116Z().mo28812O(j);
    }

    /* renamed from: P */
    public long mo28813P(long j) {
        return mo29116Z().mo28813P(j);
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        return mo29116Z().mo28814Q(j);
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        return mo29116Z().mo28815R(j);
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, this.f31144e, this.f31145f);
        return super.mo28816S(j, i - this.f31143d);
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        long a = super.mo28822a(j, i);
        C12652e.m53806p(this, mo28828g(a), this.f31144e, this.f31145f);
        return a;
    }

    /* renamed from: a0 */
    public int mo29119a0() {
        return this.f31143d;
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        long b = super.mo28823b(j, j2);
        C12652e.m53806p(this, mo28828g(b), this.f31144e, this.f31145f);
        return b;
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo28816S(j, C12652e.m53793c(mo28828g(j), i, this.f31144e, this.f31145f));
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return super.mo28828g(j) + this.f31143d;
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        return mo29116Z().mo28843u(j);
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return mo29116Z().mo28844v();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31145f;
    }

    public C12653f(C12599c cVar, DateTimeFieldType dateTimeFieldType, int i) {
        this(cVar, dateTimeFieldType, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public C12653f(C12599c cVar, DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        super(cVar, dateTimeFieldType);
        if (i != 0) {
            this.f31143d = i;
            if (i2 < cVar.mo28800C() + i) {
                this.f31144e = cVar.mo28800C() + i;
            } else {
                this.f31144e = i2;
            }
            if (i3 > cVar.mo28847y() + i) {
                this.f31145f = cVar.mo28847y() + i;
            } else {
                this.f31145f = i3;
            }
        } else {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
    }
}
