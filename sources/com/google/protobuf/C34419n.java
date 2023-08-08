package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.n */
public final class C34419n extends C34337c<Boolean> implements C34471v0.C34472a, RandomAccess, C34510z1 {

    /* renamed from: e */
    public static final C34419n f83384e;

    /* renamed from: c */
    public boolean[] f83385c;

    /* renamed from: d */
    public int f83386d;

    static {
        C34419n nVar = new C34419n(new boolean[0], 0);
        f83384e = nVar;
        nVar.mo100970J();
    }

    public C34419n() {
        this(new boolean[10], 0);
    }

    /* renamed from: q */
    public static C34419n m139898q() {
        return f83384e;
    }

    /* renamed from: A */
    public Boolean remove(int i) {
        mo100975e();
        mo101372r(i);
        boolean[] zArr = this.f83385c;
        boolean z = zArr[i];
        int i2 = this.f83386d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f83386d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: C */
    public boolean mo101363C(int i) {
        mo101372r(i);
        return this.f83385c[i];
    }

    /* renamed from: H */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo101375u(i, bool.booleanValue()));
    }

    /* renamed from: N */
    public void mo101365N(boolean z) {
        mo100975e();
        int i = this.f83386d;
        boolean[] zArr = this.f83385c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f83385c = zArr2;
        }
        boolean[] zArr3 = this.f83385c;
        int i2 = this.f83386d;
        this.f83386d = i2 + 1;
        zArr3[i2] = z;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo100975e();
        C34471v0.m140573d(collection);
        if (!(collection instanceof C34419n)) {
            return super.addAll(collection);
        }
        C34419n nVar = (C34419n) collection;
        int i = nVar.f83386d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83386d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f83385c;
            if (i3 > zArr.length) {
                this.f83385c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(nVar.f83385c, 0, this.f83385c, this.f83386d, nVar.f83386d);
            this.f83386d = i3;
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
        if (!(obj instanceof C34419n)) {
            return super.equals(obj);
        }
        C34419n nVar = (C34419n) obj;
        if (this.f83386d != nVar.f83386d) {
            return false;
        }
        boolean[] zArr = nVar.f83385c;
        for (int i = 0; i < this.f83386d; i++) {
            if (this.f83385c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void add(int i, Boolean bool) {
        mo101371k(i, bool.booleanValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83386d; i2++) {
            i = (i * 31) + C34471v0.m140580k(this.f83385c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Boolean bool) {
        mo101365N(bool.booleanValue());
        return true;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f83385c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo101371k(int i, boolean z) {
        int i2;
        mo100975e();
        if (i < 0 || i > (i2 = this.f83386d)) {
            throw new IndexOutOfBoundsException(mo101377y(i));
        }
        boolean[] zArr = this.f83385c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f83385c, i, zArr2, i + 1, this.f83386d - i);
            this.f83385c = zArr2;
        }
        this.f83385c[i] = z;
        this.f83386d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo101372r(int i) {
        if (i < 0 || i >= this.f83386d) {
            throw new IndexOutOfBoundsException(mo101377y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo100975e();
        if (i2 >= i) {
            boolean[] zArr = this.f83385c;
            System.arraycopy(zArr, i2, zArr, i, this.f83386d - i2);
            this.f83386d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f83386d;
    }

    /* renamed from: u */
    public boolean mo101375u(int i, boolean z) {
        mo100975e();
        mo101372r(i);
        boolean[] zArr = this.f83385c;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    /* renamed from: w */
    public Boolean get(int i) {
        return Boolean.valueOf(mo101363C(i));
    }

    /* renamed from: y */
    public final String mo101377y(int i) {
        return "Index:" + i + ", Size:" + this.f83386d;
    }

    public C34419n(boolean[] zArr, int i) {
        this.f83385c = zArr;
        this.f83386d = i;
    }

    /* renamed from: c */
    public C34471v0.C34472a m139904c(int i) {
        if (i >= this.f83386d) {
            return new C34419n(Arrays.copyOf(this.f83385c, i), this.f83386d);
        }
        throw new IllegalArgumentException();
    }
}
