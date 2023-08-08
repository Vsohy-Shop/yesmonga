package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.y */
public final class C14871y extends C14240c3<Long> implements C14566o3.C14574h, RandomAccess, C14548n9 {

    /* renamed from: d */
    public static final C14871y f36894d;

    /* renamed from: b */
    public long[] f36895b;

    /* renamed from: c */
    public int f36896c;

    static {
        C14871y yVar = new C14871y(new long[0], 0);
        f36894d = yVar;
        yVar.mo34819c();
    }

    public C14871y() {
        this(new long[10], 0);
    }

    /* renamed from: M */
    public static C14871y m64070M() {
        return f36894d;
    }

    /* renamed from: A */
    public Long get(int i) {
        return Long.valueOf(mo36867H(i));
    }

    /* renamed from: H */
    public long mo36867H(int i) {
        mo36883y(i);
        return this.f36895b[i];
    }

    /* renamed from: Q */
    public final String mo36868Q(int i) {
        return "Index:" + i + ", Size:" + this.f36896c;
    }

    /* renamed from: W */
    public Long remove(int i) {
        mo34821e();
        mo36883y(i);
        long[] jArr = this.f36895b;
        long j = jArr[i];
        int i2 = this.f36896c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f36896c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo34821e();
        C14566o3.m62804f(collection);
        if (!(collection instanceof C14871y)) {
            return super.addAll(collection);
        }
        C14871y yVar = (C14871y) collection;
        int i = yVar.f36896c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36896c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f36895b;
            if (i3 > jArr.length) {
                this.f36895b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(yVar.f36895b, 0, this.f36895b, this.f36896c, yVar.f36896c);
            this.f36896c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C14566o3.C14574h m64076b(int i) {
        if (i >= this.f36896c) {
            return new C14871y(Arrays.copyOf(this.f36895b, i), this.f36896c);
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
        if (!(obj instanceof C14871y)) {
            return super.equals(obj);
        }
        C14871y yVar = (C14871y) obj;
        if (this.f36896c != yVar.f36896c) {
            return false;
        }
        long[] jArr = yVar.f36895b;
        for (int i = 0; i < this.f36896c; i++) {
            if (this.f36895b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void mo36873h(int i, long j) {
        int i2;
        mo34821e();
        if (i < 0 || i > (i2 = this.f36896c)) {
            throw new IndexOutOfBoundsException(mo36868Q(i));
        }
        long[] jArr = this.f36895b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f36895b, i, jArr2, i + 1, this.f36896c - i);
            this.f36895b = jArr2;
        }
        this.f36895b[i] = j;
        this.f36896c++;
        this.modCount++;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36896c; i2++) {
            i = (i * 31) + C14566o3.m62800b(this.f36895b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public void add(int i, Long l) {
        mo36873h(i, l.longValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f36895b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void mo36876k(long j) {
        mo34821e();
        int i = this.f36896c;
        long[] jArr = this.f36895b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f36895b = jArr2;
        }
        long[] jArr3 = this.f36895b;
        int i2 = this.f36896c;
        this.f36896c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: q */
    public boolean add(Long l) {
        mo36876k(l.longValue());
        return true;
    }

    /* renamed from: r */
    public long mo36878r(int i, long j) {
        mo34821e();
        mo36883y(i);
        long[] jArr = this.f36895b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public void removeRange(int i, int i2) {
        mo34821e();
        if (i2 >= i) {
            long[] jArr = this.f36895b;
            System.arraycopy(jArr, i2, jArr, i, this.f36896c - i2);
            this.f36896c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f36896c;
    }

    /* renamed from: w */
    public Long set(int i, Long l) {
        return Long.valueOf(mo36878r(i, l.longValue()));
    }

    /* renamed from: y */
    public final void mo36883y(int i) {
        if (i < 0 || i >= this.f36896c) {
            throw new IndexOutOfBoundsException(mo36868Q(i));
        }
    }

    public C14871y(long[] jArr, int i) {
        this.f36895b = jArr;
        this.f36896c = i;
    }
}
