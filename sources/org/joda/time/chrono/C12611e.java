package org.joda.time.chrono;

import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12655h;

/* renamed from: org.joda.time.chrono.e */
public final class C12611e extends C12655h {

    /* renamed from: f */
    public static final long f31065f = -1587436826395135328L;

    /* renamed from: e */
    public final BasicChronology f31066e;

    public C12611e(BasicChronology basicChronology, C12646e eVar) {
        super(DateTimeFieldType.m51319T(), eVar);
        this.f31066e = basicChronology;
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        if (!nVar.mo27949K(DateTimeFieldType.m51320U())) {
            return 53;
        }
        return this.f31066e.mo28865L0(nVar.mo27959T(DateTimeFieldType.m51320U()));
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            if (nVar.mo28207t(i) == DateTimeFieldType.m51320U()) {
                return this.f31066e.mo28865L0(iArr[i]);
            }
        }
        return 53;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31066e.mo28630P();
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return super.mo28810M(j + 259200000);
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        return super.mo28811N(j + 259200000) - 259200000;
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return super.mo28812O(j + 259200000) - 259200000;
    }

    /* renamed from: Z */
    public int mo28954Z(long j, int i) {
        if (i > 52) {
            return mo28848z(j);
        }
        return 52;
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31066e.mo28863J0(j);
    }

    public final Object readResolve() {
        return this.f31066e.mo28626L();
    }

    /* renamed from: y */
    public int mo28847y() {
        return 53;
    }

    /* renamed from: z */
    public int mo28848z(long j) {
        return this.f31066e.mo28865L0(this.f31066e.mo28866M0(j));
    }
}
