package org.joda.time.chrono;

import com.carrefour.fid.android.core.extension.C36306e;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12710j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C12650c;
import org.joda.time.field.C12652e;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;

    /* renamed from: Z0 */
    public transient LimitChronology f31039Z0;
    final DateTime iLowerLimit;
    final DateTime iUpperLimit;

    public class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        public LimitDurationField(C12646e eVar) {
            super(eVar, eVar.mo29034W());
        }

        /* renamed from: M */
        public long mo28931M(long j, long j2) {
            LimitChronology.this.mo28924a0(j2, (String) null);
            return mo29073A0().mo28931M(j, j2);
        }

        /* renamed from: b */
        public long mo28909b(long j, int i) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long b = mo29073A0().mo28909b(j, i);
            LimitChronology.this.mo28924a0(b, "resulting");
            return b;
        }

        /* renamed from: e0 */
        public int mo28932e0(long j, long j2) {
            LimitChronology.this.mo28924a0(j2, (String) null);
            return mo29073A0().mo28932e0(j, j2);
        }

        /* renamed from: g */
        public long mo28910g(long j, long j2) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long g = mo29073A0().mo28910g(j, j2);
            LimitChronology.this.mo28924a0(g, "resulting");
            return g;
        }

        /* renamed from: m0 */
        public long mo28933m0(long j, long j2) {
            LimitChronology.this.mo28924a0(j2, (String) null);
            return mo29073A0().mo28933m0(j, j2);
        }

        /* renamed from: q */
        public int mo28911q(long j, long j2) {
            LimitChronology.this.mo28924a0(j, "minuend");
            LimitChronology.this.mo28924a0(j2, "subtrahend");
            return mo29073A0().mo28911q(j, j2);
        }

        /* renamed from: r */
        public long mo28912r(long j, long j2) {
            LimitChronology.this.mo28924a0(j, "minuend");
            LimitChronology.this.mo28924a0(j2, "subtrahend");
            return mo29073A0().mo28912r(j, j2);
        }

        /* renamed from: y */
        public long mo28934y(int i, long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29073A0().mo28934y(i, j);
        }
    }

    public class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;
        private final boolean iIsLow;

        public LimitException(String str, boolean z) {
            super(str);
            this.iIsLow = z;
        }

        public String getMessage() {
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            C12674b N = C12683i.m54172B().mo29230N(LimitChronology.this.mo28850X());
            if (this.iIsLow) {
                stringBuffer.append("below the supported minimum of ");
                N.mo29221E(stringBuffer, LimitChronology.this.mo28927e0().mo27912k());
            } else {
                stringBuffer.append("above the supported maximum of ");
                N.mo29221E(stringBuffer, LimitChronology.this.mo28929f0().mo27912k());
            }
            stringBuffer.append(C36306e.f89637a);
            stringBuffer.append(LimitChronology.this.mo28850X());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        public String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    /* renamed from: org.joda.time.chrono.LimitChronology$a */
    public class C12605a extends C12650c {

        /* renamed from: v */
        public static final long f31040v = -2435306746995699312L;

        /* renamed from: d */
        public final C12646e f31041d;

        /* renamed from: e */
        public final C12646e f31042e;

        /* renamed from: f */
        public final C12646e f31043f;

        public C12605a(C12599c cVar, C12646e eVar, C12646e eVar2, C12646e eVar3) {
            super(cVar, cVar.mo28806I());
            this.f31041d = eVar;
            this.f31042e = eVar2;
            this.f31043f = eVar3;
        }

        /* renamed from: D */
        public int mo28801D(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28801D(j);
        }

        /* renamed from: H */
        public final C12646e mo28805H() {
            return this.f31042e;
        }

        /* renamed from: J */
        public boolean mo28807J(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28807J(j);
        }

        /* renamed from: M */
        public long mo28810M(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long M = mo29116Z().mo28810M(j);
            LimitChronology.this.mo28924a0(M, "resulting");
            return M;
        }

        /* renamed from: N */
        public long mo28811N(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long N = mo29116Z().mo28811N(j);
            LimitChronology.this.mo28924a0(N, "resulting");
            return N;
        }

        /* renamed from: O */
        public long mo28812O(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long O = mo29116Z().mo28812O(j);
            LimitChronology.this.mo28924a0(O, "resulting");
            return O;
        }

        /* renamed from: P */
        public long mo28813P(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long P = mo29116Z().mo28813P(j);
            LimitChronology.this.mo28924a0(P, "resulting");
            return P;
        }

        /* renamed from: Q */
        public long mo28814Q(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long Q = mo29116Z().mo28814Q(j);
            LimitChronology.this.mo28924a0(Q, "resulting");
            return Q;
        }

        /* renamed from: R */
        public long mo28815R(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long R = mo29116Z().mo28815R(j);
            LimitChronology.this.mo28924a0(R, "resulting");
            return R;
        }

        /* renamed from: S */
        public long mo28816S(long j, int i) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long S = mo29116Z().mo28816S(j, i);
            LimitChronology.this.mo28924a0(S, "resulting");
            return S;
        }

        /* renamed from: U */
        public long mo28818U(long j, String str, Locale locale) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long U = mo29116Z().mo28818U(j, str, locale);
            LimitChronology.this.mo28924a0(U, "resulting");
            return U;
        }

        /* renamed from: a */
        public long mo28822a(long j, int i) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long a = mo29116Z().mo28822a(j, i);
            LimitChronology.this.mo28924a0(a, "resulting");
            return a;
        }

        /* renamed from: b */
        public long mo28823b(long j, long j2) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long b = mo29116Z().mo28823b(j, j2);
            LimitChronology.this.mo28924a0(b, "resulting");
            return b;
        }

        /* renamed from: d */
        public long mo28825d(long j, int i) {
            LimitChronology.this.mo28924a0(j, (String) null);
            long d = mo29116Z().mo28825d(j, i);
            LimitChronology.this.mo28924a0(d, "resulting");
            return d;
        }

        /* renamed from: g */
        public int mo28828g(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28828g(j);
        }

        /* renamed from: j */
        public String mo28831j(long j, Locale locale) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28831j(j, locale);
        }

        /* renamed from: o */
        public String mo28836o(long j, Locale locale) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28836o(j, locale);
        }

        /* renamed from: r */
        public int mo28839r(long j, long j2) {
            LimitChronology.this.mo28924a0(j, "minuend");
            LimitChronology.this.mo28924a0(j2, "subtrahend");
            return mo29116Z().mo28839r(j, j2);
        }

        /* renamed from: s */
        public long mo28840s(long j, long j2) {
            LimitChronology.this.mo28924a0(j, "minuend");
            LimitChronology.this.mo28924a0(j2, "subtrahend");
            return mo29116Z().mo28840s(j, j2);
        }

        /* renamed from: t */
        public final C12646e mo28841t() {
            return this.f31041d;
        }

        /* renamed from: u */
        public int mo28843u(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28843u(j);
        }

        /* renamed from: v */
        public final C12646e mo28844v() {
            return this.f31043f;
        }

        /* renamed from: w */
        public int mo28845w(Locale locale) {
            return mo29116Z().mo28845w(locale);
        }

        /* renamed from: x */
        public int mo28846x(Locale locale) {
            return mo29116Z().mo28846x(locale);
        }

        /* renamed from: z */
        public int mo28848z(long j) {
            LimitChronology.this.mo28924a0(j, (String) null);
            return mo29116Z().mo28848z(j);
        }
    }

    public LimitChronology(C12589a aVar, DateTime dateTime, DateTime dateTime2) {
        super(aVar, (Object) null);
        this.iLowerLimit = dateTime;
        this.iUpperLimit = dateTime2;
    }

    /* renamed from: d0 */
    public static LimitChronology m52997d0(C12589a aVar, C12710j jVar, C12710j jVar2) {
        DateTime dateTime;
        if (aVar != null) {
            DateTime dateTime2 = null;
            if (jVar == null) {
                dateTime = null;
            } else {
                dateTime = jVar.mo27732V();
            }
            if (jVar2 != null) {
                dateTime2 = jVar2.mo27732V();
            }
            if (dateTime == null || dateTime2 == null || dateTime.mo28752n(dateTime2)) {
                return new LimitChronology(aVar, dateTime, dateTime2);
            }
            throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return mo27835R(DateTimeZone.f30651a);
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        LimitChronology limitChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.f30651a;
        if (dateTimeZone == dateTimeZone2 && (limitChronology = this.f31039Z0) != null) {
            return limitChronology;
        }
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null) {
            MutableDateTime P0 = dateTime.mo27911P0();
            P0.mo28285s1(dateTimeZone);
            dateTime = P0.mo27732V();
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null) {
            MutableDateTime P02 = dateTime2.mo27911P0();
            P02.mo28285s1(dateTimeZone);
            dateTime2 = P02.mo27732V();
        }
        LimitChronology d0 = m52997d0(mo28850X().mo27835R(dateTimeZone), dateTime, dateTime2);
        if (dateTimeZone == dateTimeZone2) {
            this.f31039Z0 = d0;
        }
        return d0;
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        HashMap hashMap = new HashMap();
        aVar.f30924l = mo28926c0(aVar.f30924l, hashMap);
        aVar.f30923k = mo28926c0(aVar.f30923k, hashMap);
        aVar.f30922j = mo28926c0(aVar.f30922j, hashMap);
        aVar.f30921i = mo28926c0(aVar.f30921i, hashMap);
        aVar.f30920h = mo28926c0(aVar.f30920h, hashMap);
        aVar.f30919g = mo28926c0(aVar.f30919g, hashMap);
        aVar.f30918f = mo28926c0(aVar.f30918f, hashMap);
        aVar.f30917e = mo28926c0(aVar.f30917e, hashMap);
        aVar.f30916d = mo28926c0(aVar.f30916d, hashMap);
        aVar.f30915c = mo28926c0(aVar.f30915c, hashMap);
        aVar.f30914b = mo28926c0(aVar.f30914b, hashMap);
        aVar.f30913a = mo28926c0(aVar.f30913a, hashMap);
        aVar.f30908E = mo28925b0(aVar.f30908E, hashMap);
        aVar.f30909F = mo28925b0(aVar.f30909F, hashMap);
        aVar.f30910G = mo28925b0(aVar.f30910G, hashMap);
        aVar.f30911H = mo28925b0(aVar.f30911H, hashMap);
        aVar.f30912I = mo28925b0(aVar.f30912I, hashMap);
        aVar.f30936x = mo28925b0(aVar.f30936x, hashMap);
        aVar.f30937y = mo28925b0(aVar.f30937y, hashMap);
        aVar.f30938z = mo28925b0(aVar.f30938z, hashMap);
        aVar.f30907D = mo28925b0(aVar.f30907D, hashMap);
        aVar.f30904A = mo28925b0(aVar.f30904A, hashMap);
        aVar.f30905B = mo28925b0(aVar.f30905B, hashMap);
        aVar.f30906C = mo28925b0(aVar.f30906C, hashMap);
        aVar.f30925m = mo28925b0(aVar.f30925m, hashMap);
        aVar.f30926n = mo28925b0(aVar.f30926n, hashMap);
        aVar.f30927o = mo28925b0(aVar.f30927o, hashMap);
        aVar.f30928p = mo28925b0(aVar.f30928p, hashMap);
        aVar.f30929q = mo28925b0(aVar.f30929q, hashMap);
        aVar.f30930r = mo28925b0(aVar.f30930r, hashMap);
        aVar.f30931s = mo28925b0(aVar.f30931s, hashMap);
        aVar.f30933u = mo28925b0(aVar.f30933u, hashMap);
        aVar.f30932t = mo28925b0(aVar.f30932t, hashMap);
        aVar.f30934v = mo28925b0(aVar.f30934v, hashMap);
        aVar.f30935w = mo28925b0(aVar.f30935w, hashMap);
    }

    /* renamed from: a0 */
    public void mo28924a0(long j, String str) {
        DateTime dateTime = this.iLowerLimit;
        if (dateTime == null || j >= dateTime.mo27912k()) {
            DateTime dateTime2 = this.iUpperLimit;
            if (dateTime2 != null && j >= dateTime2.mo27912k()) {
                throw new LimitException(str, false);
            }
            return;
        }
        throw new LimitException(str, true);
    }

    /* renamed from: b0 */
    public final C12599c mo28925b0(C12599c cVar, HashMap<Object, Object> hashMap) {
        if (cVar == null || !cVar.mo28809L()) {
            return cVar;
        }
        if (hashMap.containsKey(cVar)) {
            return (C12599c) hashMap.get(cVar);
        }
        C12605a aVar = new C12605a(cVar, mo28926c0(cVar.mo28841t(), hashMap), mo28926c0(cVar.mo28805H(), hashMap), mo28926c0(cVar.mo28844v(), hashMap));
        hashMap.put(cVar, aVar);
        return aVar;
    }

    /* renamed from: c0 */
    public final C12646e mo28926c0(C12646e eVar, HashMap<Object, Object> hashMap) {
        if (eVar == null || !eVar.mo29037o0()) {
            return eVar;
        }
        if (hashMap.containsKey(eVar)) {
            return (C12646e) hashMap.get(eVar);
        }
        LimitDurationField limitDurationField = new LimitDurationField(eVar);
        hashMap.put(eVar, limitDurationField);
        return limitDurationField;
    }

    /* renamed from: e0 */
    public DateTime mo28927e0() {
        return this.iLowerLimit;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        if (!mo28850X().equals(limitChronology.mo28850X()) || !C12652e.m53791a(mo28927e0(), limitChronology.mo28927e0()) || !C12652e.m53791a(mo28929f0(), limitChronology.mo28929f0())) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public DateTime mo28929f0() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (mo28927e0() != null) {
            i = mo28927e0().hashCode();
        } else {
            i = 0;
        }
        int i3 = i + 317351877;
        if (mo28929f0() != null) {
            i2 = mo28929f0().hashCode();
        }
        return i3 + i2 + (mo28850X().hashCode() * 7);
    }

    /* renamed from: p */
    public long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        long p = mo28850X().mo28650p(i, i2, i3, i4);
        mo28924a0(p, "resulting");
        return p;
    }

    /* renamed from: q */
    public long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long q = mo28850X().mo28651q(i, i2, i3, i4, i5, i6, i7);
        mo28924a0(q, "resulting");
        return q;
    }

    /* renamed from: r */
    public long mo28652r(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        mo28924a0(j, (String) null);
        long r = mo28850X().mo28652r(j, i, i2, i3, i4);
        mo28924a0(r, "resulting");
        return r;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LimitChronology[");
        sb.append(mo28850X().toString());
        sb.append(", ");
        String str2 = "NoLimit";
        if (mo28927e0() == null) {
            str = str2;
        } else {
            str = mo28927e0().toString();
        }
        sb.append(str);
        sb.append(", ");
        if (mo28929f0() != null) {
            str2 = mo28929f0().toString();
        }
        sb.append(str2);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }
}
