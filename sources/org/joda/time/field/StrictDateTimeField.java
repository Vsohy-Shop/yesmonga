package org.joda.time.field;

import org.joda.time.C12599c;

public class StrictDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 3154803964207950910L;

    public StrictDateTimeField(C12599c cVar) {
        super(cVar);
    }

    /* renamed from: Z */
    public static C12599c m53624Z(C12599c cVar) {
        if (cVar == null) {
            return null;
        }
        if (cVar instanceof LenientDateTimeField) {
            cVar = ((LenientDateTimeField) cVar).mo29074Y();
        }
        if (!cVar.mo28808K()) {
            return cVar;
        }
        return new StrictDateTimeField(cVar);
    }

    /* renamed from: K */
    public final boolean mo28808K() {
        return false;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, mo28801D(j), mo28848z(j));
        return super.mo28816S(j, i);
    }
}
