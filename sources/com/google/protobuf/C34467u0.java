package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u0 */
public final class C34467u0 extends C34337c<Integer> implements C34471v0.C34478g, RandomAccess, C34510z1 {

    /* renamed from: e */
    public static final C34467u0 f83523e;

    /* renamed from: c */
    public int[] f83524c;

    /* renamed from: d */
    public int f83525d;

    static {
        C34467u0 u0Var = new C34467u0(new int[0], 0);
        f83523e = u0Var;
        u0Var.mo100970J();
    }

    public C34467u0() {
        this(new int[10], 0);
    }

    /* renamed from: q */
    public static C34467u0 m140542q() {
        return f83523e;
    }

    /* renamed from: A */
    public Integer remove(int i) {
        mo100975e();
        mo101614r(i);
        int[] iArr = this.f83524c;
        int i2 = iArr[i];
        int i3 = this.f83525d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f83525d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: H */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo101613o(i, num.intValue()));
    }

    /* renamed from: V */
    public void mo101605V(int i) {
        mo100975e();
        int i2 = this.f83525d;
        int[] iArr = this.f83524c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f83524c = iArr2;
        }
        int[] iArr3 = this.f83524c;
        int i3 = this.f83525d;
        this.f83525d = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo100975e();
        C34471v0.m140573d(collection);
        if (!(collection instanceof C34467u0)) {
            return super.addAll(collection);
        }
        C34467u0 u0Var = (C34467u0) collection;
        int i = u0Var.f83525d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83525d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f83524c;
            if (i3 > iArr.length) {
                this.f83524c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(u0Var.f83524c, 0, this.f83524c, this.f83525d, u0Var.f83525d);
            this.f83525d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34467u0)) {
            return super.equals(obj);
        }
        C34467u0 u0Var = (C34467u0) obj;
        if (this.f83525d != u0Var.f83525d) {
            return false;
        }
        int[] iArr = u0Var.f83524c;
        for (int i = 0; i < this.f83525d; i++) {
            if (this.f83524c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i) {
        mo101614r(i);
        return this.f83524c[i];
    }

    /* renamed from: h */
    public void add(int i, Integer num) {
        mo101612k(i, num.intValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83525d; i2++) {
            i = (i * 31) + this.f83524c[i2];
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Integer num) {
        mo101605V(num.intValue());
        return true;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f83524c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo101612k(int i, int i2) {
        int i3;
        mo100975e();
        if (i < 0 || i > (i3 = this.f83525d)) {
            throw new IndexOutOfBoundsException(mo101618y(i));
        }
        int[] iArr = this.f83524c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f83524c, i, iArr2, i + 1, this.f83525d - i);
            this.f83524c = iArr2;
        }
        this.f83524c[i] = i2;
        this.f83525d++;
        this.modCount++;
    }

    /* renamed from: o */
    public int mo101613o(int i, int i2) {
        mo100975e();
        mo101614r(i);
        int[] iArr = this.f83524c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* renamed from: r */
    public final void mo101614r(int i) {
        if (i < 0 || i >= this.f83525d) {
            throw new IndexOutOfBoundsException(mo101618y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo100975e();
        if (i2 >= i) {
            int[] iArr = this.f83524c;
            System.arraycopy(iArr, i2, iArr, i, this.f83525d - i2);
            this.f83525d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f83525d;
    }

    /* renamed from: w */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    /* renamed from: y */
    public final String mo101618y(int i) {
        return "Index:" + i + ", Size:" + this.f83525d;
    }

    public C34467u0(int[] iArr, int i) {
        this.f83524c = iArr;
        this.f83525d = i;
    }

    /* renamed from: c */
    public C34471v0.C34478g m140547c(int i) {
        if (i >= this.f83525d) {
            return new C34467u0(Arrays.copyOf(this.f83524c, i), this.f83525d);
        }
        throw new IllegalArgumentException();
    }
}
