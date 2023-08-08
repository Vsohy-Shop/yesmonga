package p073j$.time.chrono;

import androidx.exifinterface.media.C19135a;
import com.onetrust.otpublishers.headless.Public.OTCCPAGeolocationConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import p073j$.time.C42586c;
import p073j$.time.DayOfWeek;
import p073j$.time.format.C42624C;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42673l;
import p073j$.time.temporal.C42674m;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.a */
public abstract class C42593a implements Chronology {

    /* renamed from: a */
    private static final ConcurrentHashMap f107757a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ConcurrentHashMap f107758b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Locale f107759c = new Locale("ja", "JP", "JP");

    protected C42593a() {
    }

    /* renamed from: n */
    static void m172061n(Map map, C42662a aVar, long j) {
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.get(aVar);
        if (l == null || l.longValue() == j) {
            hashMap.put(aVar, Long.valueOf(j));
            return;
        }
        throw new C42586c("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    /* renamed from: o */
    static Chronology m172062o(C42593a aVar, String str) {
        String V;
        Chronology chronology = (Chronology) f107757a.putIfAbsent(str, aVar);
        if (chronology == null && (V = aVar.mo138035V()) != null) {
            f107758b.putIfAbsent(V, aVar);
        }
        return chronology;
    }

    static Chronology ofLocale(Locale locale) {
        boolean z;
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType(OTCCPAGeolocationConstants.f85214CA);
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(f107759c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return C42608p.f107789d;
        }
        do {
            Chronology chronology = (Chronology) f107758b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
            if (f107757a.get(C19135a.f49037r2) == null) {
                C42604l lVar = C42604l.f107770o;
                m172062o(lVar, lVar.mo138038s());
                C42611s sVar = C42611s.f107793d;
                m172062o(sVar, sVar.mo138038s());
                C42616x xVar = C42616x.f107805d;
                m172062o(xVar, xVar.mo138038s());
                C42589C c = C42589C.f107752d;
                m172062o(c, c.mo138038s());
                Iterator<S> it = ServiceLoader.load(C42593a.class, (ClassLoader) null).iterator();
                while (it.hasNext()) {
                    C42593a aVar = (C42593a) it.next();
                    if (!aVar.mo138038s().equals(C19135a.f49037r2)) {
                        m172062o(aVar, aVar.mo138038s());
                    }
                }
                C42608p pVar = C42608p.f107789d;
                m172062o(pVar, pVar.mo138038s());
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
        } while (z);
        Iterator<S> it2 = ServiceLoader.load(Chronology.class).iterator();
        while (it2.hasNext()) {
            Chronology chronology2 = (Chronology) it2.next();
            if (unicodeLocaleType.equals(chronology2.mo138035V())) {
                return chronology2;
            }
        }
        throw new C42586c("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    /* renamed from: q */
    static C42594b m172063q(C42594b bVar, long j, long j2, long j3) {
        long j4;
        C42594b b = bVar.mo137905b(j, ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C42594b b2 = b.mo137905b(j2, chronoUnit);
        if (j3 > 7) {
            j4 = j3 - 1;
            b2 = b2.mo137905b(j4 / 7, chronoUnit);
        } else {
            if (j3 < 1) {
                b2 = b2.mo137905b(Math.subtractExact(j3, 7) / 7, chronoUnit);
                j4 = j3 + 6;
            }
            return b2.mo137941k(new C42673l(DayOfWeek.m171780n((int) j3).getValue()));
        }
        j3 = (j4 % 7) + 1;
        return b2.mo137941k(new C42673l(DayOfWeek.m171780n((int) j3).getValue()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo138057E(Map map, C42624C c) {
        C42662a aVar = C42662a.PROLEPTIC_MONTH;
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.remove(aVar);
        if (l != null) {
            if (c != C42624C.LENIENT) {
                aVar.mo138215b0(l.longValue());
            }
            C42594b a = mo138032O().mo137902a(1, C42662a.DAY_OF_MONTH).mo137902a(l.longValue(), aVar);
            C42662a aVar2 = C42662a.MONTH_OF_YEAR;
            m172061n(hashMap, aVar2, (long) a.mo137890j(aVar2));
            C42662a aVar3 = C42662a.YEAR;
            m172061n(hashMap, aVar3, (long) a.mo137890j(aVar3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C42594b mo138058K(Map map, C42624C c) {
        C42662a aVar = C42662a.YEAR;
        HashMap hashMap = (HashMap) map;
        int a = mo138036W(aVar).mo138226a(((Long) hashMap.remove(aVar)).longValue(), aVar);
        if (c == C42624C.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) hashMap.remove(C42662a.MONTH_OF_YEAR)).longValue(), 1);
            return mo138031I(a, 1, 1).mo137905b(subtractExact, ChronoUnit.MONTHS).mo137905b(Math.subtractExact(((Long) hashMap.remove(C42662a.DAY_OF_MONTH)).longValue(), 1), ChronoUnit.DAYS);
        }
        C42662a aVar2 = C42662a.MONTH_OF_YEAR;
        int a2 = mo138036W(aVar2).mo138226a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
        C42662a aVar3 = C42662a.DAY_OF_MONTH;
        int a3 = mo138036W(aVar3).mo138226a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
        if (c != C42624C.SMART) {
            return mo138031I(a, a2, a3);
        }
        try {
            return mo138031I(a, a2, a3);
        } catch (C42586c unused) {
            return mo138031I(a, a2, 1).mo137941k(new C42674m(0));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C42594b mo138059L(Map map, C42624C c) {
        long j;
        C42602j jVar;
        C42662a aVar = C42662a.YEAR_OF_ERA;
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.remove(aVar);
        if (l != null) {
            C42662a aVar2 = C42662a.ERA;
            Long l2 = (Long) hashMap.remove(aVar2);
            int a = c != C42624C.LENIENT ? mo138036W(aVar).mo138226a(l.longValue(), aVar) : Math.toIntExact(l.longValue());
            if (l2 != null) {
                m172061n(hashMap, C42662a.YEAR, (long) mo138040x(mo138033Q(mo138036W(aVar2).mo138226a(l2.longValue(), aVar2)), a));
                return null;
            }
            C42662a aVar3 = C42662a.YEAR;
            if (hashMap.containsKey(aVar3)) {
                jVar = mo138028B(mo138036W(aVar3).mo138226a(((Long) hashMap.get(aVar3)).longValue(), aVar3), 1).mo137947u();
            } else if (c == C42624C.STRICT) {
                hashMap.put(aVar, l);
                return null;
            } else {
                List F = mo138029F();
                if (F.isEmpty()) {
                    j = (long) a;
                    m172061n(hashMap, aVar3, j);
                    return null;
                }
                jVar = (C42602j) F.get(F.size() - 1);
            }
            j = (long) mo138040x(jVar, a);
            m172061n(hashMap, aVar3, j);
            return null;
        }
        C42662a aVar4 = C42662a.ERA;
        if (!hashMap.containsKey(aVar4)) {
            return null;
        }
        mo138036W(aVar4).mo138227b(((Long) hashMap.get(aVar4)).longValue(), aVar4);
        return null;
    }

    /* renamed from: T */
    public C42594b mo138034T(Map map, C42624C c) {
        C42624C c2 = c;
        C42662a aVar = C42662a.EPOCH_DAY;
        HashMap hashMap = (HashMap) map;
        if (hashMap.containsKey(aVar)) {
            return mo138037p(((Long) hashMap.remove(aVar)).longValue());
        }
        mo138057E(hashMap, c2);
        C42594b L = mo138059L(hashMap, c2);
        if (L != null) {
            return L;
        }
        C42662a aVar2 = C42662a.YEAR;
        if (!hashMap.containsKey(aVar2)) {
            return null;
        }
        C42662a aVar3 = C42662a.MONTH_OF_YEAR;
        if (hashMap.containsKey(aVar3)) {
            if (hashMap.containsKey(C42662a.DAY_OF_MONTH)) {
                return mo138058K(hashMap, c2);
            }
            C42662a aVar4 = C42662a.ALIGNED_WEEK_OF_MONTH;
            if (hashMap.containsKey(aVar4)) {
                C42662a aVar5 = C42662a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (hashMap.containsKey(aVar5)) {
                    int a = mo138036W(aVar2).mo138226a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                    if (c2 == C42624C.LENIENT) {
                        long subtractExact = Math.subtractExact(((Long) hashMap.remove(aVar3)).longValue(), 1);
                        long subtractExact2 = Math.subtractExact(((Long) hashMap.remove(aVar4)).longValue(), 1);
                        return mo138031I(a, 1, 1).mo137905b(subtractExact, ChronoUnit.MONTHS).mo137905b(subtractExact2, ChronoUnit.WEEKS).mo137905b(Math.subtractExact(((Long) hashMap.remove(aVar5)).longValue(), 1), ChronoUnit.DAYS);
                    }
                    int a2 = mo138036W(aVar3).mo138226a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    int a3 = mo138036W(aVar4).mo138226a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                    C42594b b = mo138031I(a, a2, 1).mo137905b((long) ((mo138036W(aVar5).mo138226a(((Long) hashMap.remove(aVar5)).longValue(), aVar5) - 1) + ((a3 - 1) * 7)), ChronoUnit.DAYS);
                    if (c2 != C42624C.STRICT || b.mo137890j(aVar3) == a2) {
                        return b;
                    }
                    throw new C42586c("Strict mode rejected resolved date as it is in a different month");
                }
                C42662a aVar6 = C42662a.DAY_OF_WEEK;
                if (hashMap.containsKey(aVar6)) {
                    int a4 = mo138036W(aVar2).mo138226a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                    if (c2 == C42624C.LENIENT) {
                        return m172063q(mo138031I(a4, 1, 1), Math.subtractExact(((Long) hashMap.remove(aVar3)).longValue(), 1), Math.subtractExact(((Long) hashMap.remove(aVar4)).longValue(), 1), Math.subtractExact(((Long) hashMap.remove(aVar6)).longValue(), 1));
                    }
                    int a5 = mo138036W(aVar3).mo138226a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    C42594b k = mo138031I(a4, a5, 1).mo137905b((long) ((mo138036W(aVar4).mo138226a(((Long) hashMap.remove(aVar4)).longValue(), aVar4) - 1) * 7), ChronoUnit.DAYS).mo137941k(new C42673l(DayOfWeek.m171780n(mo138036W(aVar6).mo138226a(((Long) hashMap.remove(aVar6)).longValue(), aVar6)).getValue()));
                    if (c2 != C42624C.STRICT || k.mo137890j(aVar3) == a5) {
                        return k;
                    }
                    throw new C42586c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        C42662a aVar7 = C42662a.DAY_OF_YEAR;
        if (hashMap.containsKey(aVar7)) {
            int a6 = mo138036W(aVar2).mo138226a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
            if (c2 != C42624C.LENIENT) {
                return mo138028B(a6, mo138036W(aVar7).mo138226a(((Long) hashMap.remove(aVar7)).longValue(), aVar7));
            }
            return mo138028B(a6, 1).mo137905b(Math.subtractExact(((Long) hashMap.remove(aVar7)).longValue(), 1), ChronoUnit.DAYS);
        }
        C42662a aVar8 = C42662a.ALIGNED_WEEK_OF_YEAR;
        if (!hashMap.containsKey(aVar8)) {
            return null;
        }
        C42662a aVar9 = C42662a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (hashMap.containsKey(aVar9)) {
            int a7 = mo138036W(aVar2).mo138226a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
            if (c2 == C42624C.LENIENT) {
                long subtractExact3 = Math.subtractExact(((Long) hashMap.remove(aVar8)).longValue(), 1);
                return mo138028B(a7, 1).mo137905b(subtractExact3, ChronoUnit.WEEKS).mo137905b(Math.subtractExact(((Long) hashMap.remove(aVar9)).longValue(), 1), ChronoUnit.DAYS);
            }
            int a8 = mo138036W(aVar8).mo138226a(((Long) hashMap.remove(aVar8)).longValue(), aVar8);
            C42594b b2 = mo138028B(a7, 1).mo137905b((long) ((mo138036W(aVar9).mo138226a(((Long) hashMap.remove(aVar9)).longValue(), aVar9) - 1) + ((a8 - 1) * 7)), ChronoUnit.DAYS);
            if (c2 != C42624C.STRICT || b2.mo137890j(aVar2) == a7) {
                return b2;
            }
            throw new C42586c("Strict mode rejected resolved date as it is in a different year");
        }
        C42662a aVar10 = C42662a.DAY_OF_WEEK;
        if (!hashMap.containsKey(aVar10)) {
            return null;
        }
        int a9 = mo138036W(aVar2).mo138226a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
        if (c2 == C42624C.LENIENT) {
            return m172063q(mo138028B(a9, 1), 0, Math.subtractExact(((Long) hashMap.remove(aVar8)).longValue(), 1), Math.subtractExact(((Long) hashMap.remove(aVar10)).longValue(), 1));
        }
        C42594b k2 = mo138028B(a9, 1).mo137905b((long) ((mo138036W(aVar8).mo138226a(((Long) hashMap.remove(aVar8)).longValue(), aVar8) - 1) * 7), ChronoUnit.DAYS).mo137941k(new C42673l(DayOfWeek.m171780n(mo138036W(aVar10).mo138226a(((Long) hashMap.remove(aVar10)).longValue(), aVar10)).getValue()));
        if (c2 != C42624C.STRICT || k2.mo137890j(aVar2) == a9) {
            return k2;
        }
        throw new C42586c("Strict mode rejected resolved date as it is in a different year");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42593a) {
            return compareTo((C42593a) obj) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ mo138038s().hashCode();
    }

    /* renamed from: r */
    public final int compareTo(Chronology chronology) {
        return mo138038s().compareTo(chronology.mo138038s());
    }

    public final String toString() {
        return mo138038s();
    }
}
