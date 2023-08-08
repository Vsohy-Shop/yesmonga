package org.joda.time.base;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12714n;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12633l;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12674b;

public abstract class BasePartial extends C12596e implements C12714n, Serializable {
    private static final long serialVersionUID = 2353678632973660L;
    private final C12589a iChronology;
    private final int[] iValues;

    public BasePartial() {
        this(C12641d.m53368c(), (C12589a) null);
    }

    /* renamed from: S1 */
    public String mo28198S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29260w(this);
    }

    /* renamed from: f0 */
    public void mo28677f0(int i, int i2) {
        int[] V = getField(i).mo28819V(this, i, this.iValues, i2);
        int[] iArr = this.iValues;
        System.arraycopy(V, 0, iArr, 0, iArr.length);
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    /* renamed from: m */
    public C12589a mo27982m() {
        return this.iChronology;
    }

    /* renamed from: m0 */
    public void mo28678m0(int[] iArr) {
        mo27982m().mo28625K(this, iArr);
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    /* renamed from: w */
    public int[] mo28389w() {
        return (int[]) this.iValues.clone();
    }

    /* renamed from: w0 */
    public String mo28210w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    public BasePartial(C12589a aVar) {
        this(C12641d.m53368c(), aVar);
    }

    public BasePartial(long j) {
        this(j, (C12589a) null);
    }

    public BasePartial(long j, C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        this.iChronology = e.mo27834Q();
        this.iValues = e.mo28647m(this, j);
    }

    public BasePartial(Object obj, C12589a aVar) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28984a(obj, aVar));
        this.iChronology = e.mo27834Q();
        this.iValues = r.mo29029e(this, obj, e);
    }

    public BasePartial(Object obj, C12589a aVar, C12674b bVar) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28984a(obj, aVar));
        this.iChronology = e.mo27834Q();
        this.iValues = r.mo29030k(this, obj, e, bVar);
    }

    public BasePartial(int[] iArr, C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        this.iChronology = e.mo27834Q();
        e.mo28625K(this, iArr);
        this.iValues = iArr;
    }

    public BasePartial(BasePartial basePartial, int[] iArr) {
        this.iChronology = basePartial.iChronology;
        this.iValues = iArr;
    }

    public BasePartial(BasePartial basePartial, C12589a aVar) {
        this.iChronology = aVar.mo27834Q();
        this.iValues = basePartial.iValues;
    }
}
