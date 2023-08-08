package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.x2 */
public final class C14846x2 extends C14240c3<Integer> implements C14566o3.C14573g, RandomAccess, C14548n9 {

    /* renamed from: d */
    public static final C14846x2 f36822d;

    /* renamed from: b */
    public int[] f36823b;

    /* renamed from: c */
    public int f36824c;

    static {
        C14846x2 x2Var = new C14846x2(new int[0], 0);
        f36822d = x2Var;
        x2Var.mo34819c();
    }

    public C14846x2() {
        this(new int[10], 0);
    }

    /* renamed from: M */
    public static C14846x2 m63967M() {
        return f36822d;
    }

    /* renamed from: A */
    public Integer get(int i) {
        return Integer.valueOf(mo36787H(i));
    }

    /* renamed from: H */
    public int mo36787H(int i) {
        mo36803y(i);
        return this.f36823b[i];
    }

    /* renamed from: Q */
    public final String mo36788Q(int i) {
        return "Index:" + i + ", Size:" + this.f36824c;
    }

    /* renamed from: W */
    public Integer remove(int i) {
        mo34821e();
        mo36803y(i);
        int[] iArr = this.f36823b;
        int i2 = iArr[i];
        int i3 = this.f36824c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f36824c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo34821e();
        C14566o3.m62804f(collection);
        if (!(collection instanceof C14846x2)) {
            return super.addAll(collection);
        }
        C14846x2 x2Var = (C14846x2) collection;
        int i = x2Var.f36824c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36824c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f36823b;
            if (i3 > iArr.length) {
                this.f36823b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(x2Var.f36823b, 0, this.f36823b, this.f36824c, x2Var.f36824c);
            this.f36824c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C14566o3.C14573g m63973b(int i) {
        if (i >= this.f36824c) {
            return new C14846x2(Arrays.copyOf(this.f36823b, i), this.f36824c);
        }
        throw new IllegalArgumentException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14846x2)) {
            return super.equals(obj);
        }
        C14846x2 x2Var = (C14846x2) obj;
        if (this.f36824c != x2Var.f36824c) {
            return false;
        }
        int[] iArr = x2Var.f36823b;
        for (int i = 0; i < this.f36824c; i++) {
            if (this.f36823b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void mo36793h(int i, int i2) {
        int i3;
        mo34821e();
        if (i < 0 || i > (i3 = this.f36824c)) {
            throw new IndexOutOfBoundsException(mo36788Q(i));
        }
        int[] iArr = this.f36823b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f36823b, i, iArr2, i + 1, this.f36824c - i);
            this.f36823b = iArr2;
        }
        this.f36823b[i] = i2;
        this.f36824c++;
        this.modCount++;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36824c; i2++) {
            i = (i * 31) + this.f36823b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public void add(int i, Integer num) {
        mo36793h(i, num.intValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f36823b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public boolean add(Integer num) {
        mo36802w(num.intValue());
        return true;
    }

    /* renamed from: q */
    public int mo36797q(int i, int i2) {
        mo34821e();
        mo36803y(i);
        int[] iArr = this.f36823b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* renamed from: r */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo36797q(i, num.intValue()));
    }

    public void removeRange(int i, int i2) {
        mo34821e();
        if (i2 >= i) {
            int[] iArr = this.f36823b;
            System.arraycopy(iArr, i2, iArr, i, this.f36824c - i2);
            this.f36824c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f36824c;
    }

    /* renamed from: w */
    public void mo36802w(int i) {
        mo34821e();
        int i2 = this.f36824c;
        int[] iArr = this.f36823b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f36823b = iArr2;
        }
        int[] iArr3 = this.f36823b;
        int i3 = this.f36824c;
        this.f36824c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: y */
    public final void mo36803y(int i) {
        if (i < 0 || i >= this.f36824c) {
            throw new IndexOutOfBoundsException(mo36788Q(i));
        }
    }

    public C14846x2(int[] iArr, int i) {
        this.f36823b = iArr;
        this.f36824c = i;
    }
}
