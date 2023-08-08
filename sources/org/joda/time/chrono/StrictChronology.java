package org.joda.time.chrono;

import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.StrictDateTimeField;

public final class StrictChronology extends AssembledChronology {
    private static final long serialVersionUID = 6633006628097111960L;

    /* renamed from: Z0 */
    public transient C12589a f31045Z0;

    public StrictChronology(C12589a aVar) {
        super(aVar, (Object) null);
    }

    /* renamed from: a0 */
    public static final C12599c m53042a0(C12599c cVar) {
        return StrictDateTimeField.m53624Z(cVar);
    }

    /* renamed from: b0 */
    public static StrictChronology m53043b0(C12589a aVar) {
        if (aVar != null) {
            return new StrictChronology(aVar);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        if (this.f31045Z0 == null) {
            if (mo27836s() == DateTimeZone.f30651a) {
                this.f31045Z0 = this;
            } else {
                this.f31045Z0 = m53043b0(mo28850X().mo27834Q());
            }
        }
        return this.f31045Z0;
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
        return m53043b0(mo28850X().mo27835R(dateTimeZone));
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        aVar.f30908E = m53042a0(aVar.f30908E);
        aVar.f30909F = m53042a0(aVar.f30909F);
        aVar.f30910G = m53042a0(aVar.f30910G);
        aVar.f30911H = m53042a0(aVar.f30911H);
        aVar.f30912I = m53042a0(aVar.f30912I);
        aVar.f30936x = m53042a0(aVar.f30936x);
        aVar.f30937y = m53042a0(aVar.f30937y);
        aVar.f30938z = m53042a0(aVar.f30938z);
        aVar.f30907D = m53042a0(aVar.f30907D);
        aVar.f30904A = m53042a0(aVar.f30904A);
        aVar.f30905B = m53042a0(aVar.f30905B);
        aVar.f30906C = m53042a0(aVar.f30906C);
        aVar.f30925m = m53042a0(aVar.f30925m);
        aVar.f30926n = m53042a0(aVar.f30926n);
        aVar.f30927o = m53042a0(aVar.f30927o);
        aVar.f30928p = m53042a0(aVar.f30928p);
        aVar.f30929q = m53042a0(aVar.f30929q);
        aVar.f30930r = m53042a0(aVar.f30930r);
        aVar.f30931s = m53042a0(aVar.f30931s);
        aVar.f30933u = m53042a0(aVar.f30933u);
        aVar.f30932t = m53042a0(aVar.f30932t);
        aVar.f30934v = m53042a0(aVar.f30934v);
        aVar.f30935w = m53042a0(aVar.f30935w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrictChronology)) {
            return false;
        }
        return mo28850X().equals(((StrictChronology) obj).mo28850X());
    }

    public int hashCode() {
        return (mo28850X().hashCode() * 7) + 352831696;
    }

    public String toString() {
        return "StrictChronology[" + mo28850X().toString() + C12361b.f30261l;
    }
}
