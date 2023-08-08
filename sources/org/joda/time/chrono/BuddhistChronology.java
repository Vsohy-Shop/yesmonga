package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12710j;
import org.joda.time.C12712l;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C12651d;
import org.joda.time.field.C12653f;
import org.joda.time.field.C12656i;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public final class BuddhistChronology extends AssembledChronology {

    /* renamed from: Z0 */
    public static final int f30971Z0 = 1;

    /* renamed from: a1 */
    public static final C12599c f30972a1 = new C12610d("BE");

    /* renamed from: b1 */
    public static final int f30973b1 = 543;

    /* renamed from: c1 */
    public static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> f30974c1 = new ConcurrentHashMap<>();

    /* renamed from: d1 */
    public static final BuddhistChronology f30975d1 = m52813b0(DateTimeZone.f30651a);
    private static final long serialVersionUID = -3474595157769370126L;

    public BuddhistChronology(C12589a aVar, Object obj) {
        super(aVar, obj);
    }

    /* renamed from: a0 */
    public static BuddhistChronology m52812a0() {
        return m52813b0(DateTimeZone.m51374n());
    }

    /* renamed from: b0 */
    public static BuddhistChronology m52813b0(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        ConcurrentHashMap<DateTimeZone, BuddhistChronology> concurrentHashMap = f30974c1;
        BuddhistChronology buddhistChronology = concurrentHashMap.get(dateTimeZone);
        if (buddhistChronology != null) {
            return buddhistChronology;
        }
        BuddhistChronology buddhistChronology2 = new BuddhistChronology(GJChronology.m52857l0(dateTimeZone, (C12712l) null), (Object) null);
        BuddhistChronology buddhistChronology3 = new BuddhistChronology(LimitChronology.m52997d0(buddhistChronology2, new DateTime(1, 1, 1, 0, 0, 0, 0, (C12589a) buddhistChronology2), (C12710j) null), "");
        BuddhistChronology putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, buddhistChronology3);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return buddhistChronology3;
    }

    /* renamed from: c0 */
    public static BuddhistChronology m52814c0() {
        return f30975d1;
    }

    private Object readResolve() {
        C12589a X = mo28850X();
        if (X == null) {
            return m52814c0();
        }
        return m52813b0(X.mo27836s());
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return f30975d1;
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52813b0(dateTimeZone);
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        if (mo28851Y() == null) {
            aVar.f30924l = UnsupportedDurationField.m53678A0(DurationFieldType.m51457c());
            C12653f fVar = new C12653f(new SkipUndoDateTimeField(this, aVar.f30908E), f30973b1);
            aVar.f30908E = fVar;
            aVar.f30909F = new DelegatedDateTimeField(fVar, aVar.f30924l, DateTimeFieldType.m51324Y());
            aVar.f30905B = new C12653f(new SkipUndoDateTimeField(this, aVar.f30905B), f30973b1);
            C12651d dVar = new C12651d(new C12653f(aVar.f30909F, 99), aVar.f30924l, DateTimeFieldType.m51348x(), 100);
            aVar.f30911H = dVar;
            aVar.f30923k = dVar.mo28841t();
            aVar.f30910G = new C12653f(new C12656i((C12651d) aVar.f30911H), DateTimeFieldType.m51323X(), 1);
            aVar.f30906C = new C12653f(new C12656i(aVar.f30905B, aVar.f30923k, DateTimeFieldType.m51321V(), 100), DateTimeFieldType.m51321V(), 1);
            aVar.f30912I = f30972a1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuddhistChronology) {
            return mo27836s().equals(((BuddhistChronology) obj).mo27836s());
        }
        return false;
    }

    public int hashCode() {
        return 499287079 + mo27836s().hashCode();
    }

    public String toString() {
        DateTimeZone s = mo27836s();
        if (s == null) {
            return "BuddhistChronology";
        }
        return "BuddhistChronology" + C12361b.f30260k + s.mo27824q() + C12361b.f30261l;
    }
}
