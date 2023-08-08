package org.joda.time.chrono;

import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12655h;

/* renamed from: org.joda.time.chrono.a */
public final class C12607a extends C12655h {

    /* renamed from: f */
    public static final long f31054f = -4677223814028011723L;

    /* renamed from: e */
    public final BasicChronology f31055e;

    public C12607a(BasicChronology basicChronology, C12646e eVar) {
        super(DateTimeFieldType.m51305A(), eVar);
        this.f31055e = basicChronology;
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        if (!nVar.mo27949K(DateTimeFieldType.m51316Q())) {
            return mo28847y();
        }
        int T = nVar.mo27959T(DateTimeFieldType.m51316Q());
        if (!nVar.mo27949K(DateTimeFieldType.m51322W())) {
            return this.f31055e.mo28892t0(T);
        }
        return this.f31055e.mo28897y0(nVar.mo27959T(DateTimeFieldType.m51322W()), T);
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            if (nVar.mo28207t(i) == DateTimeFieldType.m51316Q()) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < size; i3++) {
                    if (nVar.mo28207t(i3) == DateTimeFieldType.m51322W()) {
                        return this.f31055e.mo28897y0(iArr[i3], i2);
                    }
                }
                return this.f31055e.mo28892t0(i2);
            }
        }
        return mo28847y();
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31055e.mo28620F();
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        return this.f31055e.mo28873T0(j);
    }

    /* renamed from: Z */
    public int mo28954Z(long j, int i) {
        return this.f31055e.mo28894v0(j, i);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31055e.mo28885m0(j);
    }

    public final Object readResolve() {
        return this.f31055e.mo28641g();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31055e.mo28891s0();
    }

    /* renamed from: z */
    public int mo28848z(long j) {
        return this.f31055e.mo28893u0(j);
    }
}
