package org.joda.time.chrono;

import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12655h;

/* renamed from: org.joda.time.chrono.b */
public final class C12608b extends C12655h {

    /* renamed from: f */
    public static final long f31056f = -6821236822336841037L;

    /* renamed from: e */
    public final BasicChronology f31057e;

    public C12608b(BasicChronology basicChronology, C12646e eVar) {
        super(DateTimeFieldType.m51307C(), eVar);
        this.f31057e = basicChronology;
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        if (!nVar.mo27949K(DateTimeFieldType.m51322W())) {
            return this.f31057e.mo28896x0();
        }
        return this.f31057e.mo28895w0(nVar.mo27959T(DateTimeFieldType.m51322W()));
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            if (nVar.mo28207t(i) == DateTimeFieldType.m51322W()) {
                return this.f31057e.mo28895w0(iArr[i]);
            }
        }
        return this.f31057e.mo28896x0();
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31057e.mo28634V();
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        return this.f31057e.mo28873T0(j);
    }

    /* renamed from: Z */
    public int mo28954Z(long j, int i) {
        int x0 = this.f31057e.mo28896x0() - 1;
        if (i > x0 || i < 1) {
            return mo28848z(j);
        }
        return x0;
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31057e.mo28889q0(j);
    }

    public final Object readResolve() {
        return this.f31057e.mo28643i();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31057e.mo28896x0();
    }

    /* renamed from: z */
    public int mo28848z(long j) {
        return this.f31057e.mo28895w0(this.f31057e.mo28867N0(j));
    }
}
