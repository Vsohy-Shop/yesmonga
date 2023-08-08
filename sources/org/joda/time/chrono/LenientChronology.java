package org.joda.time.chrono;

import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.LenientDateTimeField;

public final class LenientChronology extends AssembledChronology {
    private static final long serialVersionUID = -3148237568046877177L;

    /* renamed from: Z0 */
    public transient C12589a f31038Z0;

    public LenientChronology(C12589a aVar) {
        super(aVar, (Object) null);
    }

    /* renamed from: b0 */
    public static LenientChronology m52992b0(C12589a aVar) {
        if (aVar != null) {
            return new LenientChronology(aVar);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        if (this.f31038Z0 == null) {
            if (mo27836s() == DateTimeZone.f30651a) {
                this.f31038Z0 = this;
            } else {
                this.f31038Z0 = m52992b0(mo28850X().mo27834Q());
            }
        }
        return this.f31038Z0;
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == DateTimeZone.f30651a) {
            return mo27834Q();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52992b0(mo28850X().mo27835R(dateTimeZone));
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        aVar.f30908E = mo28921a0(aVar.f30908E);
        aVar.f30909F = mo28921a0(aVar.f30909F);
        aVar.f30910G = mo28921a0(aVar.f30910G);
        aVar.f30911H = mo28921a0(aVar.f30911H);
        aVar.f30912I = mo28921a0(aVar.f30912I);
        aVar.f30936x = mo28921a0(aVar.f30936x);
        aVar.f30937y = mo28921a0(aVar.f30937y);
        aVar.f30938z = mo28921a0(aVar.f30938z);
        aVar.f30907D = mo28921a0(aVar.f30907D);
        aVar.f30904A = mo28921a0(aVar.f30904A);
        aVar.f30905B = mo28921a0(aVar.f30905B);
        aVar.f30906C = mo28921a0(aVar.f30906C);
        aVar.f30925m = mo28921a0(aVar.f30925m);
        aVar.f30926n = mo28921a0(aVar.f30926n);
        aVar.f30927o = mo28921a0(aVar.f30927o);
        aVar.f30928p = mo28921a0(aVar.f30928p);
        aVar.f30929q = mo28921a0(aVar.f30929q);
        aVar.f30930r = mo28921a0(aVar.f30930r);
        aVar.f30931s = mo28921a0(aVar.f30931s);
        aVar.f30933u = mo28921a0(aVar.f30933u);
        aVar.f30932t = mo28921a0(aVar.f30932t);
        aVar.f30934v = mo28921a0(aVar.f30934v);
        aVar.f30935w = mo28921a0(aVar.f30935w);
    }

    /* renamed from: a0 */
    public final C12599c mo28921a0(C12599c cVar) {
        return LenientDateTimeField.m53575Z(cVar, mo28850X());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LenientChronology)) {
            return false;
        }
        return mo28850X().equals(((LenientChronology) obj).mo28850X());
    }

    public int hashCode() {
        return (mo28850X().hashCode() * 7) + 236548278;
    }

    public String toString() {
        return "LenientChronology[" + mo28850X().toString() + C12361b.f30261l;
    }
}
