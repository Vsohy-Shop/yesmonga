package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.j7 */
public final class C14444j7 extends C14240c3<Boolean> implements C14566o3.C14567a, RandomAccess, C14548n9 {

    /* renamed from: d */
    public static final C14444j7 f35684d;

    /* renamed from: b */
    public boolean[] f35685b;

    /* renamed from: c */
    public int f35686c;

    static {
        C14444j7 j7Var = new C14444j7(new boolean[0], 0);
        f35684d = j7Var;
        j7Var.mo34819c();
    }

    public C14444j7() {
        this(new boolean[10], 0);
    }

    /* renamed from: A */
    public Boolean get(int i) {
        return Boolean.valueOf(mo35621H(i));
    }

    /* renamed from: H */
    public boolean mo35621H(int i) {
        mo35638y(i);
        return this.f35685b[i];
    }

    /* renamed from: M */
    public final String mo35622M(int i) {
        return "Index:" + i + ", Size:" + this.f35686c;
    }

    /* renamed from: Q */
    public C14566o3.C14567a mo34508b(int i) {
        if (i >= this.f35686c) {
            return new C14444j7(Arrays.copyOf(this.f35685b, i), this.f35686c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: W */
    public Boolean remove(int i) {
        mo34821e();
        mo35638y(i);
        boolean[] zArr = this.f35685b;
        boolean z = zArr[i];
        int i2 = this.f35686c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f35686c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo34821e();
        C14566o3.m62804f(collection);
        if (!(collection instanceof C14444j7)) {
            return super.addAll(collection);
        }
        C14444j7 j7Var = (C14444j7) collection;
        int i = j7Var.f35686c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35686c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f35685b;
            if (i3 > zArr.length) {
                this.f35685b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(j7Var.f35685b, 0, this.f35685b, this.f35686c, j7Var.f35686c);
            this.f35686c = i3;
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
        if (!(obj instanceof C14444j7)) {
            return super.equals(obj);
        }
        C14444j7 j7Var = (C14444j7) obj;
        if (this.f35686c != j7Var.f35686c) {
            return false;
        }
        boolean[] zArr = j7Var.f35685b;
        for (int i = 0; i < this.f35686c; i++) {
            if (this.f35685b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void add(int i, Boolean bool) {
        mo35629i(i, bool.booleanValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35686c; i2++) {
            i = (i * 31) + C14566o3.m62801c(this.f35685b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo35629i(int i, boolean z) {
        int i2;
        mo34821e();
        if (i < 0 || i > (i2 = this.f35686c)) {
            throw new IndexOutOfBoundsException(mo35622M(i));
        }
        boolean[] zArr = this.f35685b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f35685b, i, zArr2, i + 1, this.f35686c - i);
            this.f35685b = zArr2;
        }
        this.f35685b[i] = z;
        this.f35686c++;
        this.modCount++;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f35685b[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void mo35631k(boolean z) {
        mo34821e();
        int i = this.f35686c;
        boolean[] zArr = this.f35685b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f35685b = zArr2;
        }
        boolean[] zArr3 = this.f35685b;
        int i2 = this.f35686c;
        this.f35686c = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: q */
    public boolean add(Boolean bool) {
        mo35631k(bool.booleanValue());
        return true;
    }

    /* renamed from: r */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo35637w(i, bool.booleanValue()));
    }

    public void removeRange(int i, int i2) {
        mo34821e();
        if (i2 >= i) {
            boolean[] zArr = this.f35685b;
            System.arraycopy(zArr, i2, zArr, i, this.f35686c - i2);
            this.f35686c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f35686c;
    }

    /* renamed from: w */
    public boolean mo35637w(int i, boolean z) {
        mo34821e();
        mo35638y(i);
        boolean[] zArr = this.f35685b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    /* renamed from: y */
    public final void mo35638y(int i) {
        if (i < 0 || i >= this.f35686c) {
            throw new IndexOutOfBoundsException(mo35622M(i));
        }
    }

    public C14444j7(boolean[] zArr, int i) {
        this.f35685b = zArr;
        this.f35686c = i;
    }
}
