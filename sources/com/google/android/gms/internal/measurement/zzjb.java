package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzjb extends zziw implements Set {
    @CheckForNull

    /* renamed from: b */
    public transient zzja f106696b;

    @SafeVarargs
    /* renamed from: A */
    public static zzjb m171327A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return m171328M(15, objArr2);
    }

    /* renamed from: M */
    public static zzjb m171328M(int i, Object... objArr) {
        if (i == 0) {
            return zzjf.f106701w;
        }
        if (i != 1) {
            int r = m171329r(i);
            Object[] objArr2 = new Object[r];
            int i2 = r - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                C41876b8.m169711a(obj, i5);
                int hashCode = obj.hashCode();
                int a = C42209u7.m170902a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzjg(obj3);
            }
            if (m171329r(i4) < r / 2) {
                return m171328M(i4, objArr);
            }
            if (i4 < 10) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new zzjf(objArr, i3, objArr2, i2, i4);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new zzjg(obj4);
    }

    /* renamed from: r */
    public static int m171329r(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* renamed from: H */
    public boolean mo137580H() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && mo137580H() && ((zzjb) obj).mo137580H() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        for (Object next : this) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: k */
    public abstract C41894c8 iterator();

    /* renamed from: w */
    public final zzja mo137583w() {
        zzja zzja = this.f106696b;
        if (zzja != null) {
            return zzja;
        }
        zzja y = mo137584y();
        this.f106696b = y;
        return y;
    }

    /* renamed from: y */
    public zzja mo137584y() {
        Object[] array = toArray();
        int i = zzja.f106695c;
        return zzja.m171321w(array, array.length);
    }
}
