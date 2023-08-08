package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.r1 */
public final class C18852r1 extends C18695c<Long> implements C18753i1.C18763i, RandomAccess, C18846q2 {

    /* renamed from: e */
    public static final C18852r1 f47988e;

    /* renamed from: c */
    public long[] f47989c;

    /* renamed from: d */
    public int f47990d;

    static {
        C18852r1 r1Var = new C18852r1(new long[0], 0);
        f47988e = r1Var;
        r1Var.mo54404J();
    }

    public C18852r1() {
        this(new long[10], 0);
    }

    /* renamed from: q */
    public static C18852r1 m87348q() {
        return f47988e;
    }

    /* renamed from: A */
    public Long remove(int i) {
        mo54411e();
        mo55361r(i);
        long[] jArr = this.f47989c;
        long j = jArr[i];
        int i2 = this.f47990d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f47990d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: F */
    public long mo54834F(int i, long j) {
        mo54411e();
        mo55361r(i);
        long[] jArr = this.f47989c;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    /* renamed from: H */
    public Long set(int i, Long l) {
        return Long.valueOf(mo54834F(i, l.longValue()));
    }

    /* renamed from: Z */
    public void mo54835Z(long j) {
        mo54411e();
        int i = this.f47990d;
        long[] jArr = this.f47989c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f47989c = jArr2;
        }
        long[] jArr3 = this.f47989c;
        int i2 = this.f47990d;
        this.f47990d = i2 + 1;
        jArr3[i2] = j;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo54411e();
        C18753i1.m86340d(collection);
        if (!(collection instanceof C18852r1)) {
            return super.addAll(collection);
        }
        C18852r1 r1Var = (C18852r1) collection;
        int i = r1Var.f47990d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f47990d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f47989c;
            if (i3 > jArr.length) {
                this.f47989c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(r1Var.f47989c, 0, this.f47989c, this.f47990d, r1Var.f47990d);
            this.f47990d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18852r1)) {
            return super.equals(obj);
        }
        C18852r1 r1Var = (C18852r1) obj;
        if (this.f47990d != r1Var.f47990d) {
            return false;
        }
        long[] jArr = r1Var.f47989c;
        for (int i = 0; i < this.f47990d; i++) {
            if (this.f47989c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i) {
        mo55361r(i);
        return this.f47989c[i];
    }

    /* renamed from: h */
    public void add(int i, Long l) {
        mo55360k(i, l.longValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47990d; i2++) {
            i = (i * 31) + C18753i1.m86355s(this.f47989c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Long l) {
        mo54835Z(l.longValue());
        return true;
    }

    /* renamed from: k */
    public final void mo55360k(int i, long j) {
        int i2;
        mo54411e();
        if (i < 0 || i > (i2 = this.f47990d)) {
            throw new IndexOutOfBoundsException(mo55365y(i));
        }
        long[] jArr = this.f47989c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f47989c, i, jArr2, i + 1, this.f47990d - i);
            this.f47989c = jArr2;
        }
        this.f47989c[i] = j;
        this.f47990d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo55361r(int i) {
        if (i < 0 || i >= this.f47990d) {
            throw new IndexOutOfBoundsException(mo55365y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo54411e();
        if (i2 >= i) {
            long[] jArr = this.f47989c;
            System.arraycopy(jArr, i2, jArr, i, this.f47990d - i2);
            this.f47990d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f47990d;
    }

    /* renamed from: w */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    /* renamed from: y */
    public final String mo55365y(int i) {
        return "Index:" + i + ", Size:" + this.f47990d;
    }

    public C18852r1(long[] jArr, int i) {
        this.f47989c = jArr;
        this.f47990d = i;
    }

    /* renamed from: c */
    public C18753i1.C18763i m87354c(int i) {
        if (i >= this.f47990d) {
            return new C18852r1(Arrays.copyOf(this.f47989c, i), this.f47990d);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo54411e();
        for (int i = 0; i < this.f47990d; i++) {
            if (obj.equals(Long.valueOf(this.f47989c[i]))) {
                long[] jArr = this.f47989c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f47990d - i) - 1);
                this.f47990d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
