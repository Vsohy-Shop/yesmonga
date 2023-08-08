package org.joda.time.field;

import org.joda.time.C12589a;
import org.joda.time.C12599c;

public class LenientDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 8714085824173290599L;
    private final C12589a iBase;

    public LenientDateTimeField(C12599c cVar, C12589a aVar) {
        super(cVar);
        this.iBase = aVar;
    }

    /* renamed from: Z */
    public static C12599c m53575Z(C12599c cVar, C12589a aVar) {
        if (cVar == null) {
            return null;
        }
        if (cVar instanceof StrictDateTimeField) {
            cVar = ((StrictDateTimeField) cVar).mo29074Y();
        }
        if (cVar.mo28808K()) {
            return cVar;
        }
        return new LenientDateTimeField(cVar, aVar);
    }

    /* renamed from: K */
    public final boolean mo28808K() {
        return true;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        return this.iBase.mo27836s().mo27820c(mo28806I().mo27802F(this.iBase.mo27834Q()).mo28823b(this.iBase.mo27836s().mo27821e(j), C12652e.m53803m((long) i, (long) mo28828g(j))), false, j);
    }
}
