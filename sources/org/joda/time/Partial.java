package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.base.C12596e;
import org.joda.time.field.C12648a;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class Partial extends C12596e implements C12714n, Serializable {
    private static final long serialVersionUID = 12324121189002L;

    /* renamed from: a */
    public transient C12674b[] f30763a;
    private final C12589a iChronology;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public static class Property extends C12648a implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Property(Partial partial, int i) {
            this.iPartial = partial;
            this.iFieldIndex = i;
        }

        /* renamed from: A */
        public Partial mo28391A() {
            return mo28396x(mo29109n());
        }

        /* renamed from: B */
        public Partial mo28392B() {
            return mo28396x(mo29111p());
        }

        /* renamed from: c */
        public int mo28213c() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        /* renamed from: j */
        public C12599c mo28214j() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        /* renamed from: t */
        public C12714n mo28215t() {
            return this.iPartial;
        }

        /* renamed from: u */
        public Partial mo28393u(int i) {
            return new Partial(this.iPartial, mo28214j().mo28824c(this.iPartial, this.iFieldIndex, this.iPartial.mo28389w(), i));
        }

        /* renamed from: v */
        public Partial mo28394v(int i) {
            return new Partial(this.iPartial, mo28214j().mo28826e(this.iPartial, this.iFieldIndex, this.iPartial.mo28389w(), i));
        }

        /* renamed from: w */
        public Partial mo28395w() {
            return this.iPartial;
        }

        /* renamed from: x */
        public Partial mo28396x(int i) {
            return new Partial(this.iPartial, mo28214j().mo28819V(this.iPartial, this.iFieldIndex, this.iPartial.mo28389w(), i));
        }

        /* renamed from: y */
        public Partial mo28397y(String str) {
            return mo28398z(str, (Locale) null);
        }

        /* renamed from: z */
        public Partial mo28398z(String str, Locale locale) {
            return new Partial(this.iPartial, mo28214j().mo28820W(this.iPartial, this.iFieldIndex, this.iPartial.mo28389w(), str, locale));
        }
    }

    public Partial() {
        this((C12589a) null);
    }

    /* renamed from: A0 */
    public Partial mo28374A0(DateTimeFieldType dateTimeFieldType, int i) {
        int i2;
        int compareTo;
        if (dateTimeFieldType != null) {
            int y = mo28792y(dateTimeFieldType);
            if (y == -1) {
                int length = this.iTypes.length + 1;
                DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
                int[] iArr = new int[length];
                C12646e d = dateTimeFieldType.mo27801E().mo27877d(this.iChronology);
                if (d.mo29037o0()) {
                    i2 = 0;
                    while (true) {
                        DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                        if (i2 >= dateTimeFieldTypeArr2.length) {
                            break;
                        }
                        DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i2];
                        C12646e d2 = dateTimeFieldType2.mo27801E().mo27877d(this.iChronology);
                        if (d2.mo29037o0() && ((compareTo = d.compareTo(d2)) > 0 || (compareTo == 0 && (dateTimeFieldType.mo27804H() == null || (dateTimeFieldType2.mo27804H() != null && dateTimeFieldType.mo27804H().mo27877d(this.iChronology).compareTo(dateTimeFieldType2.mo27804H().mo27877d(this.iChronology)) > 0))))) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i2);
                System.arraycopy(this.iValues, 0, iArr, 0, i2);
                dateTimeFieldTypeArr[i2] = dateTimeFieldType;
                iArr[i2] = i;
                int i3 = i2 + 1;
                int i4 = (length - i2) - 1;
                System.arraycopy(this.iTypes, i2, dateTimeFieldTypeArr, i3, i4);
                System.arraycopy(this.iValues, i2, iArr, i3, i4);
                Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
                this.iChronology.mo28625K(partial, iArr);
                return partial;
            } else if (i == getValue(y)) {
                return this;
            } else {
                return new Partial(this, getField(y).mo28819V(this, y, mo28389w(), i));
            }
        } else {
            throw new IllegalArgumentException("The field type must not be null");
        }
    }

    /* renamed from: C0 */
    public Partial mo28375C0(C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        if (Q == mo27982m()) {
            return this;
        }
        Partial partial = new Partial(Q, this.iTypes, this.iValues);
        Q.mo28625K(partial, this.iValues);
        return partial;
    }

    /* renamed from: F0 */
    public Partial mo28376F0(DateTimeFieldType dateTimeFieldType, int i) {
        int M = mo28783M(dateTimeFieldType);
        if (i == getValue(M)) {
            return this;
        }
        return new Partial(this, getField(M).mo28819V(this, M, mo28389w(), i));
    }

    /* renamed from: H0 */
    public Partial mo28377H0(DurationFieldType durationFieldType, int i) {
        int Q = mo28784Q(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(Q).mo28827f(this, Q, mo28389w(), i));
    }

    /* renamed from: K0 */
    public Partial mo28378K0(DurationFieldType durationFieldType, int i) {
        int Q = mo28784Q(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(Q).mo28824c(this, Q, mo28389w(), i));
    }

    /* renamed from: L0 */
    public Partial mo28379L0(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        int[] w = mo28389w();
        for (int i2 = 0; i2 < oVar.size(); i2++) {
            int z = mo28793z(oVar.mo28702t(i2));
            if (z >= 0) {
                w = getField(z).mo28824c(this, z, w, C12652e.m53798h(oVar.getValue(i2), i));
            }
        }
        return new Partial(this, w);
    }

    /* renamed from: N0 */
    public Partial mo28380N0(DateTimeFieldType dateTimeFieldType) {
        int y = mo28792y(dateTimeFieldType);
        if (y == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, y);
        int i = y + 1;
        System.arraycopy(this.iTypes, i, dateTimeFieldTypeArr, y, size - y);
        System.arraycopy(this.iValues, 0, iArr, 0, y);
        System.arraycopy(this.iValues, i, iArr, y, size2 - y);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.mo28625K(partial, iArr);
        return partial;
    }

    /* renamed from: S1 */
    public String mo28381S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29260w(this);
    }

    /* renamed from: f0 */
    public C12674b mo28382f0() {
        C12674b[] bVarArr = this.f30763a;
        if (bVarArr == null) {
            if (size() == 0) {
                return null;
            }
            bVarArr = new C12674b[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                bVarArr[0] = C12683i.m54175E(arrayList, true, false);
                if (arrayList.size() == 0) {
                    bVarArr[1] = bVarArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.f30763a = bVarArr;
        }
        return bVarArr[0];
    }

    /* renamed from: g */
    public C12599c mo27972g(int i, C12589a aVar) {
        return this.iTypes[i].mo27802F(aVar);
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    /* renamed from: m */
    public C12589a mo27982m() {
        return this.iChronology;
    }

    /* renamed from: m0 */
    public boolean mo28383m0(C12712l lVar) {
        long j = C12641d.m53375j(lVar);
        C12589a i = C12641d.m53374i(lVar);
        int i2 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i2 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i2].mo27802F(i).mo28828g(j) != this.iValues[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: n0 */
    public boolean mo28384n0(C12714n nVar) {
        if (nVar != null) {
            int i = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
                if (i >= dateTimeFieldTypeArr.length) {
                    return true;
                }
                if (nVar.mo27959T(dateTimeFieldTypeArr[i]) != this.iValues[i]) {
                    return false;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("The partial must not be null");
        }
    }

    /* renamed from: o0 */
    public Partial mo28385o0(C12715o oVar) {
        return mo28379L0(oVar, -1);
    }

    /* renamed from: p0 */
    public Partial mo28386p0(C12715o oVar) {
        return mo28379L0(oVar, 1);
    }

    /* renamed from: q */
    public DateTimeFieldType[] mo28205q() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public int size() {
        return this.iTypes.length;
    }

    /* renamed from: t */
    public DateTimeFieldType mo28207t(int i) {
        return this.iTypes[i];
    }

    /* renamed from: t0 */
    public Property mo28387t0(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, mo28783M(dateTimeFieldType));
    }

    public String toString() {
        C12674b[] bVarArr = this.f30763a;
        if (bVarArr == null) {
            mo28382f0();
            bVarArr = this.f30763a;
            if (bVarArr == null) {
                return mo28388u0();
            }
        }
        C12674b bVar = bVarArr[1];
        if (bVar == null) {
            return mo28388u0();
        }
        return bVar.mo29260w(this);
    }

    /* renamed from: u0 */
    public String mo28388u0() {
        int size = size();
        StringBuilder sb = new StringBuilder(size * 20);
        sb.append(C12361b.f30260k);
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(this.iTypes[i].mo27803G());
            sb.append('=');
            sb.append(this.iValues[i]);
        }
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    /* renamed from: w */
    public int[] mo28389w() {
        return (int[]) this.iValues.clone();
    }

    /* renamed from: w0 */
    public String mo28390w0(String str, Locale locale) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    public Partial(C12589a aVar) {
        this.iChronology = C12641d.m53370e(aVar).mo27834Q();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeFieldType, i, (C12589a) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i, C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        this.iChronology = Q;
        if (dateTimeFieldType != null) {
            this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
            int[] iArr = {i};
            this.iValues = iArr;
            Q.mo28625K(this, iArr);
            return;
        }
        throw new IllegalArgumentException("The field type must not be null");
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (C12589a) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        this.iChronology = Q;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        } else if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        } else if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        } else if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
        } else {
            int i = 0;
            int i2 = 0;
            while (i2 < dateTimeFieldTypeArr.length) {
                if (dateTimeFieldTypeArr[i2] != null) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Types array must not contain null: index " + i2);
                }
            }
            C12646e eVar = null;
            while (i < dateTimeFieldTypeArr.length) {
                DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i];
                C12646e d = dateTimeFieldType.mo27801E().mo27877d(this.iChronology);
                if (i > 0) {
                    if (d.mo29037o0()) {
                        int compareTo = eVar.compareTo(d);
                        if (compareTo < 0) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i - 1].mo27803G() + " < " + dateTimeFieldType.mo27803G());
                        } else if (compareTo != 0) {
                            continue;
                        } else if (eVar.equals(d)) {
                            int i3 = i - 1;
                            DurationFieldType H = dateTimeFieldTypeArr[i3].mo27804H();
                            DurationFieldType H2 = dateTimeFieldType.mo27804H();
                            if (H == null) {
                                if (H2 == null) {
                                    throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i3].mo27803G() + " and " + dateTimeFieldType.mo27803G());
                                }
                            } else if (H2 != null) {
                                C12646e d2 = H.mo27877d(this.iChronology);
                                C12646e d3 = H2.mo27877d(this.iChronology);
                                if (d2.compareTo(d3) < 0) {
                                    throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i3].mo27803G() + " < " + dateTimeFieldType.mo27803G());
                                } else if (d2.compareTo(d3) == 0) {
                                    throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i3].mo27803G() + " and " + dateTimeFieldType.mo27803G());
                                }
                            } else {
                                throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i3].mo27803G() + " < " + dateTimeFieldType.mo27803G());
                            }
                        } else if (eVar.mo29037o0() && eVar.mo29034W() != DurationFieldType.f30672E0) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: " + dateTimeFieldTypeArr[i - 1].mo27803G() + " < " + dateTimeFieldType.mo27803G());
                        }
                    } else if (eVar.mo29037o0()) {
                        throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i - 1].mo27803G() + " < " + dateTimeFieldType.mo27803G());
                    } else {
                        throw new IllegalArgumentException("Types array must not contain duplicate unsupported: " + dateTimeFieldTypeArr[i - 1].mo27803G() + " and " + dateTimeFieldType.mo27803G());
                    }
                }
                i++;
                eVar = d;
            }
            this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
            Q.mo28625K(this, iArr);
            this.iValues = (int[]) iArr.clone();
        }
    }

    public Partial(C12714n nVar) {
        if (nVar != null) {
            this.iChronology = C12641d.m53370e(nVar.mo27982m()).mo27834Q();
            this.iTypes = new DateTimeFieldType[nVar.size()];
            this.iValues = new int[nVar.size()];
            for (int i = 0; i < nVar.size(); i++) {
                this.iTypes[i] = nVar.mo28207t(i);
                this.iValues[i] = nVar.getValue(i);
            }
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    public Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(C12589a aVar, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = aVar;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }
}
