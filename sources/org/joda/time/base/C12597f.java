package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.C12715o;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

/* renamed from: org.joda.time.base.f */
public abstract class C12597f implements C12715o {
    /* renamed from: B1 */
    public int mo28694B1(DurationFieldType durationFieldType) {
        int h = mo28796h(durationFieldType);
        if (h == -1) {
            return 0;
        }
        return getValue(h);
    }

    /* renamed from: H0 */
    public boolean mo28695H0(DurationFieldType durationFieldType) {
        return mo27841F1().mo28458j(durationFieldType);
    }

    /* renamed from: O0 */
    public MutablePeriod mo28696O0() {
        return new MutablePeriod((Object) this);
    }

    /* renamed from: e */
    public DurationFieldType[] mo28794e() {
        int size = size();
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size];
        for (int i = 0; i < size; i++) {
            durationFieldTypeArr[i] = mo28702t(i);
        }
        return durationFieldTypeArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12715o)) {
            return false;
        }
        C12715o oVar = (C12715o) obj;
        if (size() != oVar.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != oVar.getValue(i) || mo28702t(i) != oVar.mo28702t(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public int[] mo28795f() {
        int size = size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    /* renamed from: h */
    public int mo28796h(DurationFieldType durationFieldType) {
        return mo27841F1().mo28457i(durationFieldType);
    }

    public int hashCode() {
        int size = size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 27) + getValue(i2)) * 27) + mo28702t(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public String mo28797i(C12692p pVar) {
        if (pVar == null) {
            return toString();
        }
        return pVar.mo29323m(this);
    }

    /* renamed from: l */
    public Period mo28431l() {
        return new Period((Object) this);
    }

    public int size() {
        return mo27841F1().mo28460p();
    }

    /* renamed from: t */
    public DurationFieldType mo28702t(int i) {
        return mo27841F1().mo28452e(i);
    }

    @ToString
    public String toString() {
        return C12685j.m54341e().mo29323m(this);
    }
}
