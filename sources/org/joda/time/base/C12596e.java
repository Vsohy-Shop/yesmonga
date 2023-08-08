package org.joda.time.base;

import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12641d;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;

/* renamed from: org.joda.time.base.e */
public abstract class C12596e implements C12714n, Comparable<C12714n> {
    /* renamed from: K */
    public boolean mo27949K(DateTimeFieldType dateTimeFieldType) {
        return mo28792y(dateTimeFieldType) != -1;
    }

    /* renamed from: M */
    public int mo28783M(DateTimeFieldType dateTimeFieldType) {
        int y = mo28792y(dateTimeFieldType);
        if (y != -1) {
            return y;
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    /* renamed from: Q */
    public int mo28784Q(DurationFieldType durationFieldType) {
        int z = mo28793z(durationFieldType);
        if (z != -1) {
            return z;
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    /* renamed from: T */
    public int mo27959T(DateTimeFieldType dateTimeFieldType) {
        return getValue(mo28783M(dateTimeFieldType));
    }

    /* renamed from: W */
    public boolean mo28785W(C12714n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Partial cannot be null");
        } else if (compareTo(nVar) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: X */
    public boolean mo28786X(C12714n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Partial cannot be null");
        } else if (compareTo(nVar) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: Z */
    public boolean mo28787Z(C12714n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Partial cannot be null");
        } else if (compareTo(nVar) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a1 */
    public DateTime mo28788a1(C12712l lVar) {
        C12589a i = C12641d.m53374i(lVar);
        return new DateTime(i.mo28624J(this, C12641d.m53375j(lVar)), i);
    }

    /* renamed from: b */
    public int compareTo(C12714n nVar) {
        if (this == nVar) {
            return 0;
        }
        if (size() == nVar.size()) {
            int size = size();
            int i = 0;
            while (i < size) {
                if (mo28207t(i) == nVar.mo28207t(i)) {
                    i++;
                } else {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            int size2 = size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (getValue(i2) > nVar.getValue(i2)) {
                    return 1;
                }
                if (getValue(i2) < nVar.getValue(i2)) {
                    return -1;
                }
            }
            return 0;
        }
        throw new ClassCastException("ReadablePartial objects must have matching field types");
    }

    /* renamed from: e0 */
    public String mo28789e0(C12674b bVar) {
        if (bVar == null) {
            return toString();
        }
        return bVar.mo29260w(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12714n)) {
            return false;
        }
        C12714n nVar = (C12714n) obj;
        if (size() != nVar.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != nVar.getValue(i) || mo28207t(i) != nVar.mo28207t(i)) {
                return false;
            }
        }
        return C12652e.m53791a(mo27982m(), nVar.mo27982m());
    }

    /* renamed from: g */
    public abstract C12599c mo27972g(int i, C12589a aVar);

    public C12599c getField(int i) {
        return mo27972g(i, mo27982m());
    }

    public int hashCode() {
        int size = size();
        int i = 157;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 23) + getValue(i2)) * 23) + mo28207t(i2).hashCode();
        }
        return i + mo27982m().hashCode();
    }

    /* renamed from: q */
    public DateTimeFieldType[] mo28205q() {
        int size = size();
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        for (int i = 0; i < size; i++) {
            dateTimeFieldTypeArr[i] = mo28207t(i);
        }
        return dateTimeFieldTypeArr;
    }

    /* renamed from: r */
    public C12599c[] mo28791r() {
        int size = size();
        C12599c[] cVarArr = new C12599c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = getField(i);
        }
        return cVarArr;
    }

    /* renamed from: t */
    public DateTimeFieldType mo28207t(int i) {
        return mo27972g(i, mo27982m()).mo28806I();
    }

    /* renamed from: w */
    public int[] mo28389w() {
        int size = size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    /* renamed from: y */
    public int mo28792y(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (mo28207t(i) == dateTimeFieldType) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public int mo28793z(DurationFieldType durationFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (mo28207t(i).mo27801E() == durationFieldType) {
                return i;
            }
        }
        return -1;
    }
}
