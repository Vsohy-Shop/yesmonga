package p073j$.time.temporal;

import java.util.Map;
import p073j$.time.C42586c;
import p073j$.time.chrono.C42594b;
import p073j$.time.chrono.Chronology;
import p073j$.time.format.C42624C;

/* renamed from: j$.time.temporal.s */
final class C42680s implements C42675n {

    /* renamed from: f */
    private static final C42679r f107974f = C42679r.m172526j(1, 7);

    /* renamed from: g */
    private static final C42679r f107975g = C42679r.m172527k(0, 4, 6);

    /* renamed from: h */
    private static final C42679r f107976h = C42679r.m172527k(0, 52, 54);

    /* renamed from: i */
    private static final C42679r f107977i = C42679r.m172528l(52, 53);

    /* renamed from: a */
    private final String f107978a;

    /* renamed from: b */
    private final WeekFields f107979b;

    /* renamed from: c */
    private final C42677p f107980c;

    /* renamed from: d */
    private final C42677p f107981d;

    /* renamed from: e */
    private final C42679r f107982e;

    private C42680s(String str, WeekFields weekFields, C42677p pVar, C42677p pVar2, C42679r rVar) {
        this.f107978a = str;
        this.f107979b = weekFields;
        this.f107980c = pVar;
        this.f107981d = pVar2;
        this.f107982e = rVar;
    }

    /* renamed from: a */
    private static int m172537a(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    /* renamed from: b */
    private int m172538b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.mo137890j(C42662a.DAY_OF_WEEK) - this.f107979b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    /* renamed from: c */
    private int m172539c(TemporalAccessor temporalAccessor) {
        int b = m172538b(temporalAccessor);
        int j = temporalAccessor.mo137890j(C42662a.YEAR);
        C42662a aVar = C42662a.DAY_OF_YEAR;
        int j2 = temporalAccessor.mo137890j(aVar);
        int p = m172550p(j2, b);
        int a = m172537a(p, j2);
        if (a == 0) {
            return j - 1;
        }
        return a >= m172537a(p, this.f107979b.mo138202e() + ((int) temporalAccessor.mo137889i(aVar).mo138228d())) ? j + 1 : j;
    }

    /* renamed from: d */
    private long m172540d(TemporalAccessor temporalAccessor) {
        int b = m172538b(temporalAccessor);
        int j = temporalAccessor.mo137890j(C42662a.DAY_OF_MONTH);
        return (long) m172537a(m172550p(j, b), j);
    }

    /* renamed from: e */
    private int m172541e(TemporalAccessor temporalAccessor) {
        int b = m172538b(temporalAccessor);
        C42662a aVar = C42662a.DAY_OF_YEAR;
        int j = temporalAccessor.mo137890j(aVar);
        int p = m172550p(j, b);
        int a = m172537a(p, j);
        if (a == 0) {
            return m172541e(Chronology.m172024H(temporalAccessor).mo138039t(temporalAccessor).mo137948v((long) j, ChronoUnit.DAYS));
        }
        if (a <= 50) {
            return a;
        }
        int a2 = m172537a(p, this.f107979b.mo138202e() + ((int) temporalAccessor.mo137889i(aVar).mo138228d()));
        return a >= a2 ? (a - a2) + 1 : a;
    }

    /* renamed from: f */
    private long m172542f(TemporalAccessor temporalAccessor) {
        int b = m172538b(temporalAccessor);
        int j = temporalAccessor.mo137890j(C42662a.DAY_OF_YEAR);
        return (long) m172537a(m172550p(j, b), j);
    }

    /* renamed from: g */
    static C42680s m172543g(WeekFields weekFields) {
        return new C42680s("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f107974f);
    }

    /* renamed from: h */
    private C42594b m172544h(Chronology chronology, int i, int i2, int i3) {
        C42594b I = chronology.mo138031I(i, 1, 1);
        int p = m172550p(1, m172538b(I));
        int i4 = i3 - 1;
        return I.mo137905b((long) (((Math.min(i2, m172537a(p, this.f107979b.mo138202e() + I.mo137917M()) - 1) - 1) * 7) + i4 + (-p)), ChronoUnit.DAYS);
    }

    /* renamed from: i */
    static C42680s m172545i(WeekFields weekFields) {
        return new C42680s("WeekBasedYear", weekFields, C42670i.f107960d, ChronoUnit.FOREVER, C42662a.YEAR.mo138210E());
    }

    /* renamed from: j */
    static C42680s m172546j(WeekFields weekFields) {
        return new C42680s("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f107975g);
    }

    /* renamed from: k */
    static C42680s m172547k(WeekFields weekFields) {
        return new C42680s("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, C42670i.f107960d, f107977i);
    }

    /* renamed from: l */
    private C42679r m172548l(TemporalAccessor temporalAccessor, C42662a aVar) {
        int p = m172550p(temporalAccessor.mo137890j(aVar), m172538b(temporalAccessor));
        C42679r i = temporalAccessor.mo137889i(aVar);
        return C42679r.m172526j((long) m172537a(p, (int) i.mo138229e()), (long) m172537a(p, (int) i.mo138228d()));
    }

    /* renamed from: m */
    private C42679r m172549m(TemporalAccessor temporalAccessor) {
        C42662a aVar = C42662a.DAY_OF_YEAR;
        if (!temporalAccessor.mo137885f(aVar)) {
            return f107976h;
        }
        int b = m172538b(temporalAccessor);
        int j = temporalAccessor.mo137890j(aVar);
        int p = m172550p(j, b);
        int a = m172537a(p, j);
        if (a == 0) {
            return m172549m(Chronology.m172024H(temporalAccessor).mo138039t(temporalAccessor).mo137948v((long) (j + 7), ChronoUnit.DAYS));
        }
        int d = (int) temporalAccessor.mo137889i(aVar).mo138228d();
        int a2 = m172537a(p, this.f107979b.mo138202e() + d);
        return a >= a2 ? m172549m(Chronology.m172024H(temporalAccessor).mo138039t(temporalAccessor).mo137905b((long) ((d - j) + 1 + 7), ChronoUnit.DAYS)) : C42679r.m172526j(1, (long) (a2 - 1));
    }

    /* renamed from: p */
    private int m172550p(int i, int i2) {
        int floorMod = Math.floorMod(i - i2, 7);
        return floorMod + 1 > this.f107979b.mo138202e() ? 7 - floorMod : -floorMod;
    }

    /* renamed from: E */
    public final C42679r mo138210E() {
        return this.f107982e;
    }

    /* renamed from: K */
    public final boolean mo138211K() {
        return false;
    }

    /* renamed from: L */
    public final C42679r mo138212L(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C42677p pVar = this.f107981d;
        if (pVar == chronoUnit) {
            return this.f107982e;
        }
        if (pVar == ChronoUnit.MONTHS) {
            return m172548l(temporalAccessor, C42662a.DAY_OF_MONTH);
        }
        if (pVar == ChronoUnit.YEARS) {
            return m172548l(temporalAccessor, C42662a.DAY_OF_YEAR);
        }
        if (pVar == WeekFields.f107942h) {
            return m172549m(temporalAccessor);
        }
        if (pVar == ChronoUnit.FOREVER) {
            return C42662a.YEAR.mo138210E();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + pVar + ", this: " + this);
    }

    /* renamed from: R */
    public final TemporalAccessor mo138220R(Map map, TemporalAccessor temporalAccessor, C42624C c) {
        C42594b bVar;
        C42594b bVar2;
        C42594b bVar3;
        Map map2 = map;
        C42624C c2 = c;
        long longValue = ((Long) map2.get(this)).longValue();
        int intExact = Math.toIntExact(longValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C42679r rVar = this.f107982e;
        WeekFields weekFields = this.f107979b;
        C42677p pVar = this.f107981d;
        if (pVar == chronoUnit) {
            map2.remove(this);
            map2.put(C42662a.DAY_OF_WEEK, Long.valueOf((long) (Math.floorMod((rVar.mo138226a(longValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1)));
        } else {
            C42662a aVar = C42662a.DAY_OF_WEEK;
            if (map2.containsKey(aVar)) {
                int floorMod = Math.floorMod(aVar.mo138214a0(((Long) map2.get(aVar)).longValue()) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
                Chronology H = Chronology.m172024H(temporalAccessor);
                C42662a aVar2 = C42662a.YEAR;
                if (map2.containsKey(aVar2)) {
                    int a0 = aVar2.mo138214a0(((Long) map2.get(aVar2)).longValue());
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    C42679r rVar2 = rVar;
                    if (pVar == chronoUnit2) {
                        C42662a aVar3 = C42662a.MONTH_OF_YEAR;
                        if (map2.containsKey(aVar3)) {
                            long longValue2 = ((Long) map2.get(aVar3)).longValue();
                            C42662a aVar4 = aVar2;
                            long j = (long) intExact;
                            if (c2 == C42624C.LENIENT) {
                                C42594b b = H.mo138031I(a0, 1, 1).mo137905b(Math.subtractExact(longValue2, 1), chronoUnit2);
                                bVar3 = b.mo137905b(Math.addExact(Math.multiplyExact(Math.subtractExact(j, m172540d(b)), 7), (long) (floorMod - m172538b(b))), ChronoUnit.DAYS);
                            } else {
                                C42594b I = H.mo138031I(a0, aVar3.mo138214a0(longValue2), 1);
                                C42594b b2 = I.mo137905b((long) ((((int) (((long) rVar2.mo138226a(j, this)) - m172540d(I))) * 7) + (floorMod - m172538b(I))), ChronoUnit.DAYS);
                                if (c2 != C42624C.STRICT || b2.mo137886g(aVar3) == longValue2) {
                                    bVar3 = b2;
                                } else {
                                    throw new C42586c("Strict mode rejected resolved date as it is in a different month");
                                }
                            }
                            map2.remove(this);
                            map2.remove(aVar4);
                            map2.remove(aVar3);
                            map2.remove(aVar);
                            return bVar3;
                        }
                    }
                    C42662a aVar5 = aVar2;
                    if (pVar == ChronoUnit.YEARS) {
                        long j2 = (long) intExact;
                        C42594b I2 = H.mo138031I(a0, 1, 1);
                        if (c2 == C42624C.LENIENT) {
                            bVar2 = I2.mo137905b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, m172542f(I2)), 7), (long) (floorMod - m172538b(I2))), ChronoUnit.DAYS);
                        } else {
                            C42594b b3 = I2.mo137905b((long) ((((int) (((long) rVar2.mo138226a(j2, this)) - m172542f(I2))) * 7) + (floorMod - m172538b(I2))), ChronoUnit.DAYS);
                            if (c2 != C42624C.STRICT || b3.mo137886g(aVar5) == ((long) a0)) {
                                bVar2 = b3;
                            } else {
                                throw new C42586c("Strict mode rejected resolved date as it is in a different year");
                            }
                        }
                        map2.remove(this);
                        map2.remove(aVar5);
                        map2.remove(aVar);
                        return bVar2;
                    }
                } else if ((pVar == WeekFields.f107942h || pVar == ChronoUnit.FOREVER) && map2.containsKey(weekFields.f107948f) && map2.containsKey(weekFields.f107947e)) {
                    int a = ((C42680s) weekFields.f107948f).f107982e.mo138226a(((Long) map2.get(weekFields.f107948f)).longValue(), weekFields.f107948f);
                    if (c2 == C42624C.LENIENT) {
                        bVar = m172544h(H, a, 1, floorMod).mo137905b(Math.subtractExact(((Long) map2.get(weekFields.f107947e)).longValue(), 1), chronoUnit);
                    } else {
                        C42594b h = m172544h(H, a, ((C42680s) weekFields.f107947e).f107982e.mo138226a(((Long) map2.get(weekFields.f107947e)).longValue(), weekFields.f107947e), floorMod);
                        if (c2 != C42624C.STRICT || m172539c(h) == a) {
                            bVar = h;
                        } else {
                            throw new C42586c("Strict mode rejected resolved date as it is in a different week-based-year");
                        }
                    }
                    map2.remove(this);
                    map2.remove(weekFields.f107948f);
                    map2.remove(weekFields.f107947e);
                    map2.remove(aVar);
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: Y */
    public final boolean mo138213Y(TemporalAccessor temporalAccessor) {
        C42662a aVar;
        if (!temporalAccessor.mo137885f(C42662a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C42677p pVar = this.f107981d;
        if (pVar == chronoUnit) {
            return true;
        }
        if (pVar == ChronoUnit.MONTHS) {
            aVar = C42662a.DAY_OF_MONTH;
        } else if (pVar == ChronoUnit.YEARS || pVar == WeekFields.f107942h) {
            aVar = C42662a.DAY_OF_YEAR;
        } else if (pVar != ChronoUnit.FOREVER) {
            return false;
        } else {
            aVar = C42662a.YEAR;
        }
        return temporalAccessor.mo137885f(aVar);
    }

    /* renamed from: n */
    public final boolean mo138216n() {
        return true;
    }

    /* renamed from: o */
    public final C42671j mo138217o(C42671j jVar, long j) {
        int a = this.f107982e.mo138226a(j, this);
        int j2 = jVar.mo137890j(this);
        if (a == j2) {
            return jVar;
        }
        if (this.f107981d != ChronoUnit.FOREVER) {
            return jVar.mo137905b((long) (a - j2), this.f107980c);
        }
        WeekFields weekFields = this.f107979b;
        int j3 = jVar.mo137890j(weekFields.f107945c);
        return m172544h(Chronology.m172024H(jVar), (int) j, jVar.mo137890j(weekFields.f107947e), j3);
    }

    /* renamed from: q */
    public final long mo138218q(TemporalAccessor temporalAccessor) {
        int c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C42677p pVar = this.f107981d;
        if (pVar == chronoUnit) {
            c = m172538b(temporalAccessor);
        } else if (pVar == ChronoUnit.MONTHS) {
            return m172540d(temporalAccessor);
        } else {
            if (pVar == ChronoUnit.YEARS) {
                return m172542f(temporalAccessor);
            }
            if (pVar == WeekFields.f107942h) {
                c = m172541e(temporalAccessor);
            } else if (pVar == ChronoUnit.FOREVER) {
                c = m172539c(temporalAccessor);
            } else {
                throw new IllegalStateException("unreachable, rangeUnit: " + pVar + ", this: " + this);
            }
        }
        return (long) c;
    }

    public final String toString() {
        return this.f107978a + "[" + this.f107979b.toString() + "]";
    }
}
