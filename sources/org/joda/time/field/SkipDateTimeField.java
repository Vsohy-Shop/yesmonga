package org.joda.time.field;

import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;

    /* renamed from: a */
    public transient int f31129a;
    private final C12589a iChronology;
    private final int iSkip;

    public SkipDateTimeField(C12589a aVar, C12599c cVar) {
        this(aVar, cVar, 0);
    }

    private Object readResolve() {
        return mo28806I().mo27802F(this.iChronology);
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31129a;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, this.f31129a, mo28847y());
        int i2 = this.iSkip;
        if (i <= i2) {
            if (i != i2) {
                i++;
            } else {
                throw new IllegalFieldValueException(DateTimeFieldType.m51322W(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
            }
        }
        return super.mo28816S(j, i);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        int g = super.mo28828g(j);
        if (g <= this.iSkip) {
            return g - 1;
        }
        return g;
    }

    public SkipDateTimeField(C12589a aVar, C12599c cVar, int i) {
        super(cVar);
        this.iChronology = aVar;
        int C = super.mo28800C();
        if (C < i) {
            this.f31129a = C - 1;
        } else if (C == i) {
            this.f31129a = i + 1;
        } else {
            this.f31129a = C;
        }
        this.iSkip = i;
    }
}
