package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12641d;
import org.joda.time.C12646e;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C12649b;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class GJChronology extends AssembledChronology {

    /* renamed from: Z0 */
    public static final Instant f30988Z0 = new Instant(-12219292800000L);

    /* renamed from: a1 */
    public static final ConcurrentHashMap<C12614h, GJChronology> f30989a1 = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    /* access modifiers changed from: private */
    public long iGapDuration;
    /* access modifiers changed from: private */
    public GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final C12604b iField;

        public LinkedDurationField(C12646e eVar, C12604b bVar) {
            super(eVar, eVar.mo29034W());
            this.iField = bVar;
        }

        /* renamed from: b */
        public long mo28909b(long j, int i) {
            return this.iField.mo28822a(j, i);
        }

        /* renamed from: g */
        public long mo28910g(long j, long j2) {
            return this.iField.mo28823b(j, j2);
        }

        /* renamed from: q */
        public int mo28911q(long j, long j2) {
            return this.iField.mo28839r(j, j2);
        }

        /* renamed from: r */
        public long mo28912r(long j, long j2) {
            return this.iField.mo28840s(j, j2);
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$a */
    public class C12603a extends C12649b {

        /* renamed from: w */
        public static final long f30990w = 3528501219481026402L;

        /* renamed from: b */
        public final C12599c f30991b;

        /* renamed from: c */
        public final C12599c f30992c;

        /* renamed from: d */
        public final long f30993d;

        /* renamed from: e */
        public final boolean f30994e;

        /* renamed from: f */
        public C12646e f30995f;

        /* renamed from: g */
        public C12646e f30996g;

        public C12603a(GJChronology gJChronology, C12599c cVar, C12599c cVar2, long j) {
            this(gJChronology, cVar, cVar2, j, false);
        }

        /* renamed from: A */
        public int mo28798A(C12714n nVar) {
            return mo28848z(GJChronology.m52859n0().mo28624J(nVar, 0));
        }

        /* renamed from: B */
        public int mo28799B(C12714n nVar, int[] iArr) {
            GJChronology n0 = GJChronology.m52859n0();
            int size = nVar.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C12599c F = nVar.mo28207t(i).mo27802F(n0);
                if (iArr[i] <= F.mo28848z(j)) {
                    j = F.mo28816S(j, iArr[i]);
                }
            }
            return mo28848z(j);
        }

        /* renamed from: C */
        public int mo28800C() {
            return this.f30991b.mo28800C();
        }

        /* renamed from: D */
        public int mo28801D(long j) {
            if (j < this.f30993d) {
                return this.f30991b.mo28801D(j);
            }
            int D = this.f30992c.mo28801D(j);
            long S = this.f30992c.mo28816S(j, D);
            long j2 = this.f30993d;
            if (S < j2) {
                return this.f30992c.mo28828g(j2);
            }
            return D;
        }

        /* renamed from: E */
        public int mo28802E(C12714n nVar) {
            return this.f30991b.mo28802E(nVar);
        }

        /* renamed from: F */
        public int mo28803F(C12714n nVar, int[] iArr) {
            return this.f30991b.mo28803F(nVar, iArr);
        }

        /* renamed from: H */
        public C12646e mo28805H() {
            return this.f30996g;
        }

        /* renamed from: J */
        public boolean mo28807J(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28807J(j);
            }
            return this.f30991b.mo28807J(j);
        }

        /* renamed from: K */
        public boolean mo28808K() {
            return false;
        }

        /* renamed from: N */
        public long mo28811N(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28811N(j);
            }
            long N = this.f30991b.mo28811N(j);
            if (N < this.f30993d || N - GJChronology.this.iGapDuration < this.f30993d) {
                return N;
            }
            return mo28914a0(N);
        }

        /* renamed from: O */
        public long mo28812O(long j) {
            if (j < this.f30993d) {
                return this.f30991b.mo28812O(j);
            }
            long O = this.f30992c.mo28812O(j);
            if (O >= this.f30993d || GJChronology.this.iGapDuration + O >= this.f30993d) {
                return O;
            }
            return mo28913Z(O);
        }

        /* renamed from: S */
        public long mo28816S(long j, int i) {
            long j2;
            if (j >= this.f30993d) {
                j2 = this.f30992c.mo28816S(j, i);
                if (j2 < this.f30993d) {
                    if (GJChronology.this.iGapDuration + j2 < this.f30993d) {
                        j2 = mo28913Z(j2);
                    }
                    if (mo28828g(j2) != i) {
                        throw new IllegalFieldValueException(this.f30992c.mo28806I(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            } else {
                j2 = this.f30991b.mo28816S(j, i);
                if (j2 >= this.f30993d) {
                    if (j2 - GJChronology.this.iGapDuration >= this.f30993d) {
                        j2 = mo28914a0(j2);
                    }
                    if (mo28828g(j2) != i) {
                        throw new IllegalFieldValueException(this.f30991b.mo28806I(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            }
            return j2;
        }

        /* renamed from: U */
        public long mo28818U(long j, String str, Locale locale) {
            if (j >= this.f30993d) {
                long U = this.f30992c.mo28818U(j, str, locale);
                if (U >= this.f30993d || GJChronology.this.iGapDuration + U >= this.f30993d) {
                    return U;
                }
                return mo28913Z(U);
            }
            long U2 = this.f30991b.mo28818U(j, str, locale);
            if (U2 < this.f30993d || U2 - GJChronology.this.iGapDuration < this.f30993d) {
                return U2;
            }
            return mo28914a0(U2);
        }

        /* renamed from: Z */
        public long mo28913Z(long j) {
            if (this.f30994e) {
                return GJChronology.this.mo28905p0(j);
            }
            return GJChronology.this.mo28906q0(j);
        }

        /* renamed from: a */
        public long mo28822a(long j, int i) {
            return this.f30992c.mo28822a(j, i);
        }

        /* renamed from: a0 */
        public long mo28914a0(long j) {
            if (this.f30994e) {
                return GJChronology.this.mo28907r0(j);
            }
            return GJChronology.this.mo28908s0(j);
        }

        /* renamed from: b */
        public long mo28823b(long j, long j2) {
            return this.f30992c.mo28823b(j, j2);
        }

        /* renamed from: c */
        public int[] mo28824c(C12714n nVar, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                return iArr;
            }
            if (!C12641d.m53381p(nVar)) {
                return super.mo28824c(nVar, i, iArr, i2);
            }
            int size = nVar.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j = nVar.mo28207t(i3).mo27802F(GJChronology.this).mo28816S(j, iArr[i3]);
            }
            return GJChronology.this.mo28647m(nVar, mo28822a(j, i2));
        }

        /* renamed from: g */
        public int mo28828g(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28828g(j);
            }
            return this.f30991b.mo28828g(j);
        }

        /* renamed from: h */
        public String mo28829h(int i, Locale locale) {
            return this.f30992c.mo28829h(i, locale);
        }

        /* renamed from: j */
        public String mo28831j(long j, Locale locale) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28831j(j, locale);
            }
            return this.f30991b.mo28831j(j, locale);
        }

        /* renamed from: m */
        public String mo28834m(int i, Locale locale) {
            return this.f30992c.mo28834m(i, locale);
        }

        /* renamed from: o */
        public String mo28836o(long j, Locale locale) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28836o(j, locale);
            }
            return this.f30991b.mo28836o(j, locale);
        }

        /* renamed from: r */
        public int mo28839r(long j, long j2) {
            return this.f30992c.mo28839r(j, j2);
        }

        /* renamed from: s */
        public long mo28840s(long j, long j2) {
            return this.f30992c.mo28840s(j, j2);
        }

        /* renamed from: t */
        public C12646e mo28841t() {
            return this.f30995f;
        }

        /* renamed from: u */
        public int mo28843u(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28843u(j);
            }
            return this.f30991b.mo28843u(j);
        }

        /* renamed from: v */
        public C12646e mo28844v() {
            return this.f30992c.mo28844v();
        }

        /* renamed from: w */
        public int mo28845w(Locale locale) {
            return Math.max(this.f30991b.mo28845w(locale), this.f30992c.mo28845w(locale));
        }

        /* renamed from: x */
        public int mo28846x(Locale locale) {
            return Math.max(this.f30991b.mo28846x(locale), this.f30992c.mo28846x(locale));
        }

        /* renamed from: y */
        public int mo28847y() {
            return this.f30992c.mo28847y();
        }

        /* renamed from: z */
        public int mo28848z(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28848z(j);
            }
            int z = this.f30991b.mo28848z(j);
            long S = this.f30991b.mo28816S(j, z);
            long j2 = this.f30993d;
            if (S < j2) {
                return z;
            }
            C12599c cVar = this.f30991b;
            return cVar.mo28828g(cVar.mo28822a(j2, -1));
        }

        public C12603a(GJChronology gJChronology, C12599c cVar, C12599c cVar2, long j, boolean z) {
            this(cVar, cVar2, (C12646e) null, j, z);
        }

        public C12603a(C12599c cVar, C12599c cVar2, C12646e eVar, long j, boolean z) {
            super(cVar2.mo28806I());
            this.f30991b = cVar;
            this.f30992c = cVar2;
            this.f30993d = j;
            this.f30994e = z;
            this.f30995f = cVar2.mo28841t();
            if (eVar == null && (eVar = cVar2.mo28805H()) == null) {
                eVar = cVar.mo28805H();
            }
            this.f30996g = eVar;
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$b */
    public final class C12604b extends C12603a {

        /* renamed from: y */
        public static final long f30998y = 3410248757173576441L;

        public C12604b(GJChronology gJChronology, C12599c cVar, C12599c cVar2, long j) {
            this(cVar, cVar2, (C12646e) null, j, false);
        }

        /* renamed from: D */
        public int mo28801D(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28801D(j);
            }
            return this.f30991b.mo28801D(j);
        }

        /* renamed from: a */
        public long mo28822a(long j, int i) {
            if (j >= this.f30993d) {
                long a = this.f30992c.mo28822a(j, i);
                if (a >= this.f30993d || GJChronology.this.iGapDuration + a >= this.f30993d) {
                    return a;
                }
                if (this.f30994e) {
                    if (GJChronology.this.iGregorianChronology.mo28628N().mo28828g(a) <= 0) {
                        a = GJChronology.this.iGregorianChronology.mo28628N().mo28822a(a, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.mo28631S().mo28828g(a) <= 0) {
                    a = GJChronology.this.iGregorianChronology.mo28631S().mo28822a(a, -1);
                }
                return mo28913Z(a);
            }
            long a2 = this.f30991b.mo28822a(j, i);
            if (a2 < this.f30993d || a2 - GJChronology.this.iGapDuration < this.f30993d) {
                return a2;
            }
            return mo28914a0(a2);
        }

        /* renamed from: b */
        public long mo28823b(long j, long j2) {
            if (j >= this.f30993d) {
                long b = this.f30992c.mo28823b(j, j2);
                if (b >= this.f30993d || GJChronology.this.iGapDuration + b >= this.f30993d) {
                    return b;
                }
                if (this.f30994e) {
                    if (GJChronology.this.iGregorianChronology.mo28628N().mo28828g(b) <= 0) {
                        b = GJChronology.this.iGregorianChronology.mo28628N().mo28822a(b, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.mo28631S().mo28828g(b) <= 0) {
                    b = GJChronology.this.iGregorianChronology.mo28631S().mo28822a(b, -1);
                }
                return mo28913Z(b);
            }
            long b2 = this.f30991b.mo28823b(j, j2);
            if (b2 < this.f30993d || b2 - GJChronology.this.iGapDuration < this.f30993d) {
                return b2;
            }
            return mo28914a0(b2);
        }

        /* renamed from: r */
        public int mo28839r(long j, long j2) {
            long j3 = this.f30993d;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.f30992c.mo28839r(j, j2);
                }
                return this.f30991b.mo28839r(mo28913Z(j), j2);
            } else if (j2 < j3) {
                return this.f30991b.mo28839r(j, j2);
            } else {
                return this.f30992c.mo28839r(mo28914a0(j), j2);
            }
        }

        /* renamed from: s */
        public long mo28840s(long j, long j2) {
            long j3 = this.f30993d;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.f30992c.mo28840s(j, j2);
                }
                return this.f30991b.mo28840s(mo28913Z(j), j2);
            } else if (j2 < j3) {
                return this.f30991b.mo28840s(j, j2);
            } else {
                return this.f30992c.mo28840s(mo28914a0(j), j2);
            }
        }

        /* renamed from: z */
        public int mo28848z(long j) {
            if (j >= this.f30993d) {
                return this.f30992c.mo28848z(j);
            }
            return this.f30991b.mo28848z(j);
        }

        public C12604b(GJChronology gJChronology, C12599c cVar, C12599c cVar2, C12646e eVar, long j) {
            this(cVar, cVar2, eVar, j, false);
        }

        public C12604b(GJChronology gJChronology, C12599c cVar, C12599c cVar2, C12646e eVar, C12646e eVar2, long j) {
            this(cVar, cVar2, eVar, j, false);
            this.f30996g = eVar2;
        }

        public C12604b(C12599c cVar, C12599c cVar2, C12646e eVar, long j, boolean z) {
            super(GJChronology.this, cVar, cVar2, j, z);
            this.f30995f = eVar == null ? new LinkedDurationField(this.f30995f, this) : eVar;
        }
    }

    public GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super((C12589a) null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    /* renamed from: c0 */
    public static long m52852c0(long j, C12589a aVar, C12589a aVar2) {
        return aVar2.mo28659z().mo28816S(aVar2.mo28642h().mo28816S(aVar2.mo28626L().mo28816S(aVar2.mo28628N().mo28816S(0, aVar.mo28628N().mo28828g(j)), aVar.mo28626L().mo28828g(j)), aVar.mo28642h().mo28828g(j)), aVar.mo28659z().mo28828g(j));
    }

    /* renamed from: d0 */
    public static long m52853d0(long j, C12589a aVar, C12589a aVar2) {
        return aVar2.mo28650p(aVar.mo28631S().mo28828g(j), aVar.mo28619E().mo28828g(j), aVar.mo28641g().mo28828g(j), aVar.mo28659z().mo28828g(j));
    }

    /* renamed from: f0 */
    public static GJChronology m52854f0() {
        return m52858m0(DateTimeZone.m51374n(), f30988Z0, 4);
    }

    /* renamed from: g0 */
    public static GJChronology m52855g0(DateTimeZone dateTimeZone) {
        return m52858m0(dateTimeZone, f30988Z0, 4);
    }

    /* renamed from: k0 */
    public static GJChronology m52856k0(DateTimeZone dateTimeZone, long j, int i) {
        Instant instant;
        if (j == f30988Z0.mo27912k()) {
            instant = null;
        } else {
            instant = new Instant(j);
        }
        return m52858m0(dateTimeZone, instant, i);
    }

    /* renamed from: l0 */
    public static GJChronology m52857l0(DateTimeZone dateTimeZone, C12712l lVar) {
        return m52858m0(dateTimeZone, lVar, 4);
    }

    /* renamed from: m0 */
    public static GJChronology m52858m0(DateTimeZone dateTimeZone, C12712l lVar, int i) {
        Instant instant;
        GJChronology gJChronology;
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        if (lVar == null) {
            instant = f30988Z0;
        } else {
            instant = lVar.mo27910O1();
            if (new LocalDate(instant.mo27912k(), (C12589a) GregorianChronology.m52915X0(o)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        C12614h hVar = new C12614h(o, instant, i);
        ConcurrentHashMap<C12614h, GJChronology> concurrentHashMap = f30989a1;
        GJChronology gJChronology2 = concurrentHashMap.get(hVar);
        if (gJChronology2 != null) {
            return gJChronology2;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.f30651a;
        if (o == dateTimeZone2) {
            gJChronology = new GJChronology(JulianChronology.m52974Z0(o, i), GregorianChronology.m52916Y0(o, i), instant);
        } else {
            GJChronology m0 = m52858m0(dateTimeZone2, instant, i);
            gJChronology = new GJChronology(ZonedChronology.m53047c0(m0, o), m0.iJulianChronology, m0.iGregorianChronology, m0.iCutoverInstant);
        }
        GJChronology putIfAbsent = concurrentHashMap.putIfAbsent(hVar, gJChronology);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return gJChronology;
    }

    /* renamed from: n0 */
    public static GJChronology m52859n0() {
        return m52858m0(DateTimeZone.f30651a, f30988Z0, 4);
    }

    private Object readResolve() {
        return m52858m0(mo27836s(), this.iCutoverInstant, mo28904o0());
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return mo27835R(DateTimeZone.f30651a);
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52858m0(dateTimeZone, this.iCutoverInstant, mo28904o0());
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        Object[] objArr = (Object[]) mo28851Y();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.mo27912k();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (mo28850X() == null) {
            if (julianChronology.mo28859F0() == gregorianChronology.mo28859F0()) {
                long j = this.iCutoverMillis;
                this.iGapDuration = j - mo28908s0(j);
                aVar.mo28853a(gregorianChronology);
                if (gregorianChronology.mo28659z().mo28828g(this.iCutoverMillis) == 0) {
                    aVar.f30925m = new C12603a(this, julianChronology.mo28615A(), aVar.f30925m, this.iCutoverMillis);
                    aVar.f30926n = new C12603a(this, julianChronology.mo28659z(), aVar.f30926n, this.iCutoverMillis);
                    aVar.f30927o = new C12603a(this, julianChronology.mo28622H(), aVar.f30927o, this.iCutoverMillis);
                    aVar.f30928p = new C12603a(this, julianChronology.mo28621G(), aVar.f30928p, this.iCutoverMillis);
                    aVar.f30929q = new C12603a(this, julianChronology.mo28617C(), aVar.f30929q, this.iCutoverMillis);
                    aVar.f30930r = new C12603a(this, julianChronology.mo28616B(), aVar.f30930r, this.iCutoverMillis);
                    aVar.f30931s = new C12603a(this, julianChronology.mo28655v(), aVar.f30931s, this.iCutoverMillis);
                    aVar.f30933u = new C12603a(this, julianChronology.mo28656w(), aVar.f30933u, this.iCutoverMillis);
                    aVar.f30932t = new C12603a(this, julianChronology.mo28639e(), aVar.f30932t, this.iCutoverMillis);
                    aVar.f30934v = new C12603a(this, julianChronology.mo28640f(), aVar.f30934v, this.iCutoverMillis);
                    aVar.f30935w = new C12603a(this, julianChronology.mo28653t(), aVar.f30935w, this.iCutoverMillis);
                }
                aVar.f30912I = new C12603a(this, julianChronology.mo28645k(), aVar.f30912I, this.iCutoverMillis);
                C12604b bVar = new C12604b(this, julianChronology.mo28631S(), aVar.f30908E, this.iCutoverMillis);
                aVar.f30908E = bVar;
                aVar.f30922j = bVar.mo28841t();
                aVar.f30909F = new C12604b(this, julianChronology.mo28633U(), aVar.f30909F, aVar.f30922j, this.iCutoverMillis);
                C12604b bVar2 = new C12604b(this, julianChronology.mo28638d(), aVar.f30911H, this.iCutoverMillis);
                aVar.f30911H = bVar2;
                aVar.f30923k = bVar2.mo28841t();
                aVar.f30910G = new C12604b(this, julianChronology.mo28632T(), aVar.f30910G, aVar.f30922j, aVar.f30923k, this.iCutoverMillis);
                C12604b bVar3 = new C12604b(this, julianChronology.mo28619E(), aVar.f30907D, (C12646e) null, aVar.f30922j, this.iCutoverMillis);
                aVar.f30907D = bVar3;
                aVar.f30921i = bVar3.mo28841t();
                C12604b bVar4 = new C12604b(julianChronology.mo28628N(), aVar.f30905B, (C12646e) null, this.iCutoverMillis, true);
                aVar.f30905B = bVar4;
                aVar.f30920h = bVar4.mo28841t();
                aVar.f30906C = new C12604b(this, julianChronology.mo28629O(), aVar.f30906C, aVar.f30920h, aVar.f30923k, this.iCutoverMillis);
                aVar.f30938z = new C12603a(julianChronology.mo28643i(), aVar.f30938z, aVar.f30922j, gregorianChronology.mo28631S().mo28811N(this.iCutoverMillis), false);
                aVar.f30904A = new C12603a(julianChronology.mo28626L(), aVar.f30904A, aVar.f30920h, gregorianChronology.mo28628N().mo28811N(this.iCutoverMillis), true);
                C12603a aVar2 = new C12603a(this, julianChronology.mo28641g(), aVar.f30937y, this.iCutoverMillis);
                aVar2.f30996g = aVar.f30921i;
                aVar.f30937y = aVar2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e0 */
    public Instant mo28901e0() {
        return this.iCutoverInstant;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        if (this.iCutoverMillis == gJChronology.iCutoverMillis && mo28904o0() == gJChronology.mo28904o0() && mo27836s().equals(gJChronology.mo27836s())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 25025 + mo27836s().hashCode() + mo28904o0() + this.iCutoverInstant.hashCode();
    }

    /* renamed from: o0 */
    public int mo28904o0() {
        return this.iGregorianChronology.mo28859F0();
    }

    /* renamed from: p */
    public long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C12589a X = mo28850X();
        if (X != null) {
            return X.mo28650p(i, i2, i3, i4);
        }
        long p = this.iGregorianChronology.mo28650p(i, i2, i3, i4);
        if (p < this.iCutoverMillis) {
            p = this.iJulianChronology.mo28650p(i, i2, i3, i4);
            if (p >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return p;
    }

    /* renamed from: p0 */
    public long mo28905p0(long j) {
        return m52852c0(j, this.iGregorianChronology, this.iJulianChronology);
    }

    /* renamed from: q */
    public long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long j;
        C12589a X = mo28850X();
        if (X != null) {
            return X.mo28651q(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            j = this.iGregorianChronology.mo28651q(i, i2, i3, i4, i5, i6, i7);
            int i8 = i2;
            int i9 = i3;
        } catch (IllegalFieldValueException e) {
            if (i2 == 2 && i3 == 29) {
                j = this.iGregorianChronology.mo28651q(i, i2, 28, i4, i5, i6, i7);
                if (j >= this.iCutoverMillis) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        if (j < this.iCutoverMillis) {
            j = this.iJulianChronology.mo28651q(i, i2, i3, i4, i5, i6, i7);
            if (j >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j;
    }

    /* renamed from: q0 */
    public long mo28906q0(long j) {
        return m52853d0(j, this.iGregorianChronology, this.iJulianChronology);
    }

    /* renamed from: r0 */
    public long mo28907r0(long j) {
        return m52852c0(j, this.iJulianChronology, this.iGregorianChronology);
    }

    /* renamed from: s */
    public DateTimeZone mo27836s() {
        C12589a X = mo28850X();
        if (X != null) {
            return X.mo27836s();
        }
        return DateTimeZone.f30651a;
    }

    /* renamed from: s0 */
    public long mo28908s0(long j) {
        return m52853d0(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public String toString() {
        C12674b bVar;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append(C12361b.f30260k);
        stringBuffer.append(mo27836s().mo27824q());
        if (this.iCutoverMillis != f30988Z0.mo27912k()) {
            stringBuffer.append(",cutover=");
            if (mo27834Q().mo28643i().mo28810M(this.iCutoverMillis) == 0) {
                bVar = C12683i.m54218p();
            } else {
                bVar = C12683i.m54172B();
            }
            bVar.mo29230N(mo27834Q()).mo29221E(stringBuffer, this.iCutoverMillis);
        }
        if (mo28904o0() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(mo28904o0());
        }
        stringBuffer.append(C12361b.f30261l);
        return stringBuffer.toString();
    }

    public GJChronology(C12589a aVar, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(aVar, new Object[]{julianChronology, gregorianChronology, instant});
    }
}
