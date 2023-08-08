package org.joda.time.field;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.j */
public final class C12657j extends C12650c {

    /* renamed from: d */
    public static final long f31156d = 961749798233026866L;

    public C12657j(C12599c cVar, DateTimeFieldType dateTimeFieldType) {
        super(cVar, dateTimeFieldType);
        if (cVar.mo28800C() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        return mo29116Z().mo28798A(nVar) + 1;
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        return mo29116Z().mo28799B(nVar, iArr) + 1;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: D */
    public int mo28801D(long j) {
        return 1;
    }

    /* renamed from: E */
    public int mo28802E(C12714n nVar) {
        return 1;
    }

    /* renamed from: F */
    public int mo28803F(C12714n nVar, int[] iArr) {
        return 1;
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
        int y = mo28847y();
        C12652e.m53806p(this, i, 1, y);
        if (i == y) {
            i = 0;
        }
        return mo29116Z().mo28816S(j, i);
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        return mo29116Z().mo28822a(j, i);
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return mo29116Z().mo28823b(j, j2);
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo29116Z().mo28825d(j, i);
    }

    /* renamed from: e */
    public int[] mo28826e(C12714n nVar, int i, int[] iArr, int i2) {
        return mo29116Z().mo28826e(nVar, i, iArr, i2);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        int g = mo29116Z().mo28828g(j);
        if (g == 0) {
            return mo28847y();
        }
        return g;
    }

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return mo29116Z().mo28839r(j, j2);
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        return mo29116Z().mo28840s(j, j2);
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
        return mo29116Z().mo28847y() + 1;
    }

    /* renamed from: z */
    public int mo28848z(long j) {
        return mo29116Z().mo28848z(j) + 1;
    }
}
