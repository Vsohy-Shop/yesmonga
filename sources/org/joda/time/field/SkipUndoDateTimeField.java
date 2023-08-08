package org.joda.time.field;

import org.joda.time.C12589a;
import org.joda.time.C12599c;

public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;

    /* renamed from: a */
    public transient int f31130a;
    private final C12589a iChronology;
    private final int iSkip;

    public SkipUndoDateTimeField(C12589a aVar, C12599c cVar) {
        this(aVar, cVar, 0);
    }

    private Object readResolve() {
        return mo28806I().mo27802F(this.iChronology);
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31130a;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, this.f31130a, mo28847y());
        if (i <= this.iSkip) {
            i--;
        }
        return super.mo28816S(j, i);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        int g = super.mo28828g(j);
        if (g < this.iSkip) {
            return g + 1;
        }
        return g;
    }

    public SkipUndoDateTimeField(C12589a aVar, C12599c cVar, int i) {
        super(cVar);
        this.iChronology = aVar;
        int C = super.mo28800C();
        if (C < i) {
            this.f31130a = C + 1;
        } else if (C == i + 1) {
            this.f31130a = i;
        } else {
            this.f31130a = C;
        }
        this.iSkip = i;
    }
}
