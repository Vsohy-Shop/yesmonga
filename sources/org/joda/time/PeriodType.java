package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.field.C12652e;

public class PeriodType implements Serializable {

    /* renamed from: E0 */
    public static PeriodType f30765E0 = null;

    /* renamed from: F0 */
    public static PeriodType f30766F0 = null;

    /* renamed from: G0 */
    public static PeriodType f30767G0 = null;

    /* renamed from: H0 */
    public static PeriodType f30768H0 = null;

    /* renamed from: I0 */
    public static PeriodType f30769I0 = null;

    /* renamed from: J0 */
    public static PeriodType f30770J0 = null;

    /* renamed from: K0 */
    public static PeriodType f30771K0 = null;

    /* renamed from: L0 */
    public static PeriodType f30772L0 = null;

    /* renamed from: M0 */
    public static PeriodType f30773M0 = null;

    /* renamed from: N0 */
    public static PeriodType f30774N0 = null;

    /* renamed from: O0 */
    public static PeriodType f30775O0 = null;

    /* renamed from: X */
    public static PeriodType f30776X = null;

    /* renamed from: Y */
    public static PeriodType f30777Y = null;

    /* renamed from: Z */
    public static PeriodType f30778Z = null;

    /* renamed from: a */
    public static final Map<PeriodType, Object> f30779a = new HashMap(32);

    /* renamed from: b */
    public static int f30780b = 0;

    /* renamed from: c */
    public static int f30781c = 1;

    /* renamed from: d */
    public static int f30782d = 2;

    /* renamed from: e */
    public static int f30783e = 3;

    /* renamed from: f */
    public static int f30784f = 4;

    /* renamed from: g */
    public static int f30785g = 5;
    private static final long serialVersionUID = 2274324892792009998L;

    /* renamed from: v */
    public static int f30786v = 6;

    /* renamed from: w */
    public static int f30787w = 7;

    /* renamed from: x */
    public static PeriodType f30788x;

    /* renamed from: y */
    public static PeriodType f30789y;

    /* renamed from: z */
    public static PeriodType f30790z;
    private final int[] iIndices;
    private final String iName;
    private final DurationFieldType[] iTypes;

    public PeriodType(String str, DurationFieldType[] durationFieldTypeArr, int[] iArr) {
        this.iName = str;
        this.iTypes = durationFieldTypeArr;
        this.iIndices = iArr;
    }

    /* renamed from: C */
    public static PeriodType m52141C() {
        PeriodType periodType = f30765E0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearDay", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51456b()}, new int[]{0, -1, -1, 1, -1, -1, -1, -1});
        f30765E0 = periodType2;
        return periodType2;
    }

    /* renamed from: D */
    public static PeriodType m52142D() {
        PeriodType periodType = f30778Z;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearDayTime", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51456b(), DurationFieldType.m51459g(), DurationFieldType.m51461j(), DurationFieldType.m51463l(), DurationFieldType.m51460i()}, new int[]{0, -1, -1, 1, 2, 3, 4, 5});
        f30778Z = periodType2;
        return periodType2;
    }

    /* renamed from: E */
    public static PeriodType m52143E() {
        PeriodType periodType = f30790z;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearMonthDay", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51462k(), DurationFieldType.m51456b()}, new int[]{0, 1, -1, 2, -1, -1, -1, -1});
        f30790z = periodType2;
        return periodType2;
    }

    /* renamed from: F */
    public static PeriodType m52144F() {
        PeriodType periodType = f30789y;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearMonthDayTime", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51462k(), DurationFieldType.m51456b(), DurationFieldType.m51459g(), DurationFieldType.m51461j(), DurationFieldType.m51463l(), DurationFieldType.m51460i()}, new int[]{0, 1, -1, 2, 3, 4, 5, 6});
        f30789y = periodType2;
        return periodType2;
    }

    /* renamed from: G */
    public static PeriodType m52145G() {
        PeriodType periodType = f30777Y;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearWeekDay", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51464m(), DurationFieldType.m51456b()}, new int[]{0, -1, 1, 2, -1, -1, -1, -1});
        f30777Y = periodType2;
        return periodType2;
    }

    /* renamed from: H */
    public static PeriodType m52146H() {
        PeriodType periodType = f30776X;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearWeekDayTime", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51464m(), DurationFieldType.m51456b(), DurationFieldType.m51459g(), DurationFieldType.m51461j(), DurationFieldType.m51463l(), DurationFieldType.m51460i()}, new int[]{0, -1, 1, 2, 3, 4, 5, 6});
        f30776X = periodType2;
        return periodType2;
    }

    /* renamed from: I */
    public static PeriodType m52147I() {
        PeriodType periodType = f30768H0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Years", new DurationFieldType[]{DurationFieldType.m51466o()}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
        f30768H0 = periodType2;
        return periodType2;
    }

    /* renamed from: b */
    public static PeriodType m52148b() {
        PeriodType periodType = f30766F0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("DayTime", new DurationFieldType[]{DurationFieldType.m51456b(), DurationFieldType.m51459g(), DurationFieldType.m51461j(), DurationFieldType.m51463l(), DurationFieldType.m51460i()}, new int[]{-1, -1, -1, 0, 1, 2, 3, 4});
        f30766F0 = periodType2;
        return periodType2;
    }

    /* renamed from: c */
    public static PeriodType m52149c() {
        PeriodType periodType = f30771K0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Days", new DurationFieldType[]{DurationFieldType.m51456b()}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
        f30771K0 = periodType2;
        return periodType2;
    }

    /* renamed from: d */
    public static synchronized PeriodType m52150d(DurationFieldType[] durationFieldTypeArr) {
        synchronized (PeriodType.class) {
            if (durationFieldTypeArr != null) {
                if (durationFieldTypeArr.length != 0) {
                    int i = 0;
                    while (i < durationFieldTypeArr.length) {
                        if (durationFieldTypeArr[i] != null) {
                            i++;
                        } else {
                            throw new IllegalArgumentException("Types array must not contain null");
                        }
                    }
                    Map<PeriodType, Object> map = f30779a;
                    if (map.isEmpty()) {
                        map.put(m52156q(), m52156q());
                        map.put(m52144F(), m52144F());
                        map.put(m52143E(), m52143E());
                        map.put(m52146H(), m52146H());
                        map.put(m52145G(), m52145G());
                        map.put(m52142D(), m52142D());
                        map.put(m52141C(), m52141C());
                        map.put(m52148b(), m52148b());
                        map.put(m52157r(), m52157r());
                        map.put(m52147I(), m52147I());
                        map.put(m52154m(), m52154m());
                        map.put(m52158s(), m52158s());
                        map.put(m52149c(), m52149c());
                        map.put(m52151h(), m52151h());
                        map.put(m52153l(), m52153l());
                        map.put(m52155n(), m52155n());
                        map.put(m52152k(), m52152k());
                    }
                    PeriodType periodType = new PeriodType((String) null, durationFieldTypeArr, (int[]) null);
                    Object obj = map.get(periodType);
                    if (obj instanceof PeriodType) {
                        PeriodType periodType2 = (PeriodType) obj;
                        return periodType2;
                    } else if (obj == null) {
                        PeriodType q = m52156q();
                        ArrayList arrayList = new ArrayList(Arrays.asList(durationFieldTypeArr));
                        if (!arrayList.remove(DurationFieldType.m51466o())) {
                            q = q.mo28450B();
                        }
                        if (!arrayList.remove(DurationFieldType.m51462k())) {
                            q = q.mo28467y();
                        }
                        if (!arrayList.remove(DurationFieldType.m51464m())) {
                            q = q.mo28449A();
                        }
                        if (!arrayList.remove(DurationFieldType.m51456b())) {
                            q = q.mo28461t();
                        }
                        if (!arrayList.remove(DurationFieldType.m51459g())) {
                            q = q.mo28464v();
                        }
                        if (!arrayList.remove(DurationFieldType.m51461j())) {
                            q = q.mo28466x();
                        }
                        if (!arrayList.remove(DurationFieldType.m51463l())) {
                            q = q.mo28468z();
                        }
                        if (!arrayList.remove(DurationFieldType.m51460i())) {
                            q = q.mo28465w();
                        }
                        if (arrayList.size() <= 0) {
                            PeriodType periodType3 = new PeriodType((String) null, q.iTypes, (int[]) null);
                            PeriodType periodType4 = (PeriodType) map.get(periodType3);
                            if (periodType4 != null) {
                                map.put(periodType3, periodType4);
                                return periodType4;
                            }
                            map.put(periodType3, q);
                            return q;
                        }
                        map.put(periodType, arrayList);
                        throw new IllegalArgumentException("PeriodType does not support fields: " + arrayList);
                    } else {
                        throw new IllegalArgumentException("PeriodType does not support fields: " + obj);
                    }
                }
            }
            throw new IllegalArgumentException("Types array must not be null or empty");
        }
    }

    /* renamed from: h */
    public static PeriodType m52151h() {
        PeriodType periodType = f30772L0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Hours", new DurationFieldType[]{DurationFieldType.m51459g()}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
        f30772L0 = periodType2;
        return periodType2;
    }

    /* renamed from: k */
    public static PeriodType m52152k() {
        PeriodType periodType = f30775O0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Millis", new DurationFieldType[]{DurationFieldType.m51460i()}, new int[]{-1, -1, -1, -1, -1, -1, -1, 0});
        f30775O0 = periodType2;
        return periodType2;
    }

    /* renamed from: l */
    public static PeriodType m52153l() {
        PeriodType periodType = f30773M0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Minutes", new DurationFieldType[]{DurationFieldType.m51461j()}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
        f30773M0 = periodType2;
        return periodType2;
    }

    /* renamed from: m */
    public static PeriodType m52154m() {
        PeriodType periodType = f30769I0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Months", new DurationFieldType[]{DurationFieldType.m51462k()}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
        f30769I0 = periodType2;
        return periodType2;
    }

    /* renamed from: n */
    public static PeriodType m52155n() {
        PeriodType periodType = f30774N0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Seconds", new DurationFieldType[]{DurationFieldType.m51463l()}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
        f30774N0 = periodType2;
        return periodType2;
    }

    /* renamed from: q */
    public static PeriodType m52156q() {
        PeriodType periodType = f30788x;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Standard", new DurationFieldType[]{DurationFieldType.m51466o(), DurationFieldType.m51462k(), DurationFieldType.m51464m(), DurationFieldType.m51456b(), DurationFieldType.m51459g(), DurationFieldType.m51461j(), DurationFieldType.m51463l(), DurationFieldType.m51460i()}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        f30788x = periodType2;
        return periodType2;
    }

    /* renamed from: r */
    public static PeriodType m52157r() {
        PeriodType periodType = f30767G0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Time", new DurationFieldType[]{DurationFieldType.m51459g(), DurationFieldType.m51461j(), DurationFieldType.m51463l(), DurationFieldType.m51460i()}, new int[]{-1, -1, -1, -1, 0, 1, 2, 3});
        f30767G0 = periodType2;
        return periodType2;
    }

    /* renamed from: s */
    public static PeriodType m52158s() {
        PeriodType periodType = f30770J0;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Weeks", new DurationFieldType[]{DurationFieldType.m51464m()}, new int[]{-1, -1, 0, -1, -1, -1, -1, -1});
        f30770J0 = periodType2;
        return periodType2;
    }

    /* renamed from: A */
    public PeriodType mo28449A() {
        return mo28463u(2, "NoWeeks");
    }

    /* renamed from: B */
    public PeriodType mo28450B() {
        return mo28463u(0, "NoYears");
    }

    /* renamed from: a */
    public boolean mo28451a(C12715o oVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return false;
        }
        int i3 = this.iIndices[i];
        if (i3 != -1) {
            iArr[i3] = C12652e.m53794d(iArr[i3], i2);
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    /* renamed from: e */
    public DurationFieldType mo28452e(int i) {
        return this.iTypes[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodType)) {
            return false;
        }
        return Arrays.equals(this.iTypes, ((PeriodType) obj).iTypes);
    }

    /* renamed from: f */
    public int mo28454f(C12715o oVar, int i) {
        int i2 = this.iIndices[i];
        if (i2 == -1) {
            return 0;
        }
        return oVar.getValue(i2);
    }

    /* renamed from: g */
    public String mo28455g() {
        return this.iName;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr = this.iTypes;
            if (i >= durationFieldTypeArr.length) {
                return i2;
            }
            i2 += durationFieldTypeArr[i].hashCode();
            i++;
        }
    }

    /* renamed from: i */
    public int mo28457i(DurationFieldType durationFieldType) {
        int p = mo28460p();
        for (int i = 0; i < p; i++) {
            if (this.iTypes[i] == durationFieldType) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean mo28458j(DurationFieldType durationFieldType) {
        return mo28457i(durationFieldType) >= 0;
    }

    /* renamed from: o */
    public boolean mo28459o(C12715o oVar, int i, int[] iArr, int i2) {
        int i3 = this.iIndices[i];
        if (i3 != -1) {
            iArr[i3] = i2;
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    /* renamed from: p */
    public int mo28460p() {
        return this.iTypes.length;
    }

    /* renamed from: t */
    public PeriodType mo28461t() {
        return mo28463u(3, "NoDays");
    }

    public String toString() {
        return "PeriodType[" + mo28455g() + "]";
    }

    /* renamed from: u */
    public final PeriodType mo28463u(int i, String str) {
        int i2;
        int i3 = this.iIndices[i];
        if (i3 == -1) {
            return this;
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[(mo28460p() - 1)];
        int i4 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr2 = this.iTypes;
            if (i4 >= durationFieldTypeArr2.length) {
                break;
            }
            if (i4 < i3) {
                durationFieldTypeArr[i4] = durationFieldTypeArr2[i4];
            } else if (i4 > i3) {
                durationFieldTypeArr[i4 - 1] = durationFieldTypeArr2[i4];
            }
            i4++;
        }
        int[] iArr = new int[8];
        for (int i5 = 0; i5 < 8; i5++) {
            if (i5 < i) {
                iArr[i5] = this.iIndices[i5];
            } else if (i5 > i) {
                int i6 = this.iIndices[i5];
                if (i6 == -1) {
                    i2 = -1;
                } else {
                    i2 = i6 - 1;
                }
                iArr[i5] = i2;
            } else {
                iArr[i5] = -1;
            }
        }
        return new PeriodType(mo28455g() + str, durationFieldTypeArr, iArr);
    }

    /* renamed from: v */
    public PeriodType mo28464v() {
        return mo28463u(4, "NoHours");
    }

    /* renamed from: w */
    public PeriodType mo28465w() {
        return mo28463u(7, "NoMillis");
    }

    /* renamed from: x */
    public PeriodType mo28466x() {
        return mo28463u(5, "NoMinutes");
    }

    /* renamed from: y */
    public PeriodType mo28467y() {
        return mo28463u(1, "NoMonths");
    }

    /* renamed from: z */
    public PeriodType mo28468z() {
        return mo28463u(6, "NoSeconds");
    }
}
