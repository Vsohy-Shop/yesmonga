package org.joda.time.field;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.c */
public abstract class C12650c extends C12649b {

    /* renamed from: c */
    public static final long f31134c = 203115783733757597L;

    /* renamed from: b */
    public final C12599c f31135b;

    public C12650c(C12599c cVar, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (cVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (cVar.mo28809L()) {
            this.f31135b = cVar;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31135b.mo28800C();
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31135b.mo28805H();
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return this.f31135b.mo28808K();
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return this.f31135b.mo28812O(j);
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        return this.f31135b.mo28816S(j, i);
    }

    /* renamed from: Z */
    public final C12599c mo29116Z() {
        return this.f31135b;
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31135b.mo28828g(j);
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return this.f31135b.mo28841t();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31135b.mo28847y();
    }
}
