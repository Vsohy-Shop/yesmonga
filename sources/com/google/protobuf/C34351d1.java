package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.d1 */
public final class C34351d1 extends C34337c<Long> implements C34471v0.C34481i, RandomAccess, C34510z1 {

    /* renamed from: e */
    public static final C34351d1 f83247e;

    /* renamed from: c */
    public long[] f83248c;

    /* renamed from: d */
    public int f83249d;

    static {
        C34351d1 d1Var = new C34351d1(new long[0], 0);
        f83247e = d1Var;
        d1Var.mo100970J();
    }

    public C34351d1() {
        this(new long[10], 0);
    }

    /* renamed from: q */
    public static C34351d1 m139142q() {
        return f83247e;
    }

    /* renamed from: A */
    public Long remove(int i) {
        mo100975e();
        mo101032r(i);
        long[] jArr = this.f83248c;
        long j = jArr[i];
        int i2 = this.f83249d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f83249d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: F */
    public long mo101022F(int i, long j) {
        mo100975e();
        mo101032r(i);
        long[] jArr = this.f83248c;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    /* renamed from: H */
    public Long set(int i, Long l) {
        return Long.valueOf(mo101022F(i, l.longValue()));
    }

    /* renamed from: Z */
    public void mo101024Z(long j) {
        mo100975e();
        int i = this.f83249d;
        long[] jArr = this.f83248c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f83248c = jArr2;
        }
        long[] jArr3 = this.f83248c;
        int i2 = this.f83249d;
        this.f83249d = i2 + 1;
        jArr3[i2] = j;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo100975e();
        C34471v0.m140573d(collection);
        if (!(collection instanceof C34351d1)) {
            return super.addAll(collection);
        }
        C34351d1 d1Var = (C34351d1) collection;
        int i = d1Var.f83249d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83249d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f83248c;
            if (i3 > jArr.length) {
                this.f83248c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(d1Var.f83248c, 0, this.f83248c, this.f83249d, d1Var.f83249d);
            this.f83249d = i3;
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
        if (!(obj instanceof C34351d1)) {
            return super.equals(obj);
        }
        C34351d1 d1Var = (C34351d1) obj;
        if (this.f83249d != d1Var.f83249d) {
            return false;
        }
        long[] jArr = d1Var.f83248c;
        for (int i = 0; i < this.f83249d; i++) {
            if (this.f83248c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i) {
        mo101032r(i);
        return this.f83248c[i];
    }

    /* renamed from: h */
    public void add(int i, Long l) {
        mo101031k(i, l.longValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83249d; i2++) {
            i = (i * 31) + C34471v0.m140588s(this.f83248c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Long l) {
        mo101024Z(l.longValue());
        return true;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f83248c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo101031k(int i, long j) {
        int i2;
        mo100975e();
        if (i < 0 || i > (i2 = this.f83249d)) {
            throw new IndexOutOfBoundsException(mo101036y(i));
        }
        long[] jArr = this.f83248c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f83248c, i, jArr2, i + 1, this.f83249d - i);
            this.f83248c = jArr2;
        }
        this.f83248c[i] = j;
        this.f83249d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo101032r(int i) {
        if (i < 0 || i >= this.f83249d) {
            throw new IndexOutOfBoundsException(mo101036y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo100975e();
        if (i2 >= i) {
            long[] jArr = this.f83248c;
            System.arraycopy(jArr, i2, jArr, i, this.f83249d - i2);
            this.f83249d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f83249d;
    }

    /* renamed from: w */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    /* renamed from: y */
    public final String mo101036y(int i) {
        return "Index:" + i + ", Size:" + this.f83249d;
    }

    public C34351d1(long[] jArr, int i) {
        this.f83248c = jArr;
        this.f83249d = i;
    }

    /* renamed from: c */
    public C34471v0.C34481i m139148c(int i) {
        if (i >= this.f83249d) {
            return new C34351d1(Arrays.copyOf(this.f83248c, i), this.f83249d);
        }
        throw new IllegalArgumentException();
    }
}
