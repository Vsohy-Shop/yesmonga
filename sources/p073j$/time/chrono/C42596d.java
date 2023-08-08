package p073j$.time.chrono;

import java.io.Serializable;
import p073j$.time.C42619d;
import p073j$.time.C42658l;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.d */
abstract class C42596d implements C42594b, C42671j, C42672k, Serializable {
    C42596d() {
    }

    /* renamed from: n */
    static C42594b m172084n(Chronology chronology, C42671j jVar) {
        C42594b bVar = (C42594b) jVar;
        if (chronology.equals(bVar.mo137937h())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.mo138038s() + ", actual: " + bVar.mo137937h().mo138038s());
    }

    /* renamed from: D */
    public C42594b mo137914D(C42658l lVar) {
        return m172084n(mo137937h(), lVar.mo138191a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract C42594b mo138053E(long j);

    /* renamed from: a */
    public C42594b mo137902a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return m172084n(mo137937h(), nVar.mo138217o(this, j));
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* renamed from: b */
    public C42594b mo137905b(long j, C42677p pVar) {
        boolean z = pVar instanceof ChronoUnit;
        if (z) {
            switch (C42595c.f107760a[((ChronoUnit) pVar).ordinal()]) {
                case 1:
                    return mo138055o(j);
                case 2:
                    return mo138055o(Math.multiplyExact(j, 7));
                case 3:
                    return mo138056q(j);
                case 4:
                    return mo138053E(j);
                case 5:
                    return mo138053E(Math.multiplyExact(j, 10));
                case 6:
                    return mo138053E(Math.multiplyExact(j, 100));
                case 7:
                    return mo138053E(Math.multiplyExact(j, 1000));
                case 8:
                    C42662a aVar = C42662a.ERA;
                    return mo137902a(Math.addExact(mo137886g(aVar), j), aVar);
                default:
                    throw new C42678q("Unsupported unit: " + pVar);
            }
        } else if (!z) {
            return m172084n(mo137937h(), pVar.mo138199o(this, j));
        } else {
            throw new C42678q("Unsupported unit: " + pVar);
        }
    }

    /* renamed from: k */
    public C42594b mo137941k(C42672k kVar) {
        return m172084n(mo137937h(), kVar.mo137884d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract C42594b mo138055o(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract C42594b mo138056q(long j);

    public String toString() {
        long g = mo137886g(C42662a.YEAR_OF_ERA);
        long g2 = mo137886g(C42662a.MONTH_OF_YEAR);
        long g3 = mo137886g(C42662a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(mo137937h().toString());
        sb.append(" ");
        sb.append(mo137947u());
        sb.append(" ");
        sb.append(g);
        String str = "-0";
        sb.append(g2 < 10 ? str : "-");
        sb.append(g2);
        if (g3 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(g3);
        return sb.toString();
    }

    /* renamed from: v */
    public C42594b mo137948v(long j, ChronoUnit chronoUnit) {
        return m172084n(mo137937h(), j == Long.MIN_VALUE ? mo137905b(Long.MAX_VALUE, chronoUnit).mo137905b(1, chronoUnit) : mo137905b(-j, chronoUnit));
    }
}
