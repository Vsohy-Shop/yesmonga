package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.h1 */
public final class C18744h1 extends C18695c<Integer> implements C18753i1.C18760g, RandomAccess, C18846q2 {

    /* renamed from: e */
    public static final C18744h1 f47855e;

    /* renamed from: c */
    public int[] f47856c;

    /* renamed from: d */
    public int f47857d;

    static {
        C18744h1 h1Var = new C18744h1(new int[0], 0);
        f47855e = h1Var;
        h1Var.mo54404J();
    }

    public C18744h1() {
        this(new int[10], 0);
    }

    /* renamed from: q */
    public static C18744h1 m86068q() {
        return f47855e;
    }

    /* renamed from: A */
    public Integer remove(int i) {
        mo54411e();
        mo54637r(i);
        int[] iArr = this.f47856c;
        int i2 = iArr[i];
        int i3 = this.f47857d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f47857d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: H */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo54636o(i, num.intValue()));
    }

    /* renamed from: V */
    public void mo54629V(int i) {
        mo54411e();
        int i2 = this.f47857d;
        int[] iArr = this.f47856c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f47856c = iArr2;
        }
        int[] iArr3 = this.f47856c;
        int i3 = this.f47857d;
        this.f47857d = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo54411e();
        C18753i1.m86340d(collection);
        if (!(collection instanceof C18744h1)) {
            return super.addAll(collection);
        }
        C18744h1 h1Var = (C18744h1) collection;
        int i = h1Var.f47857d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f47857d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f47856c;
            if (i3 > iArr.length) {
                this.f47856c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(h1Var.f47856c, 0, this.f47856c, this.f47857d, h1Var.f47857d);
            this.f47857d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18744h1)) {
            return super.equals(obj);
        }
        C18744h1 h1Var = (C18744h1) obj;
        if (this.f47857d != h1Var.f47857d) {
            return false;
        }
        int[] iArr = h1Var.f47856c;
        for (int i = 0; i < this.f47857d; i++) {
            if (this.f47856c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i) {
        mo54637r(i);
        return this.f47856c[i];
    }

    /* renamed from: h */
    public void add(int i, Integer num) {
        mo54635k(i, num.intValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47857d; i2++) {
            i = (i * 31) + this.f47856c[i2];
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Integer num) {
        mo54629V(num.intValue());
        return true;
    }

    /* renamed from: k */
    public final void mo54635k(int i, int i2) {
        int i3;
        mo54411e();
        if (i < 0 || i > (i3 = this.f47857d)) {
            throw new IndexOutOfBoundsException(mo54641y(i));
        }
        int[] iArr = this.f47856c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f47856c, i, iArr2, i + 1, this.f47857d - i);
            this.f47856c = iArr2;
        }
        this.f47856c[i] = i2;
        this.f47857d++;
        this.modCount++;
    }

    /* renamed from: o */
    public int mo54636o(int i, int i2) {
        mo54411e();
        mo54637r(i);
        int[] iArr = this.f47856c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* renamed from: r */
    public final void mo54637r(int i) {
        if (i < 0 || i >= this.f47857d) {
            throw new IndexOutOfBoundsException(mo54641y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo54411e();
        if (i2 >= i) {
            int[] iArr = this.f47856c;
            System.arraycopy(iArr, i2, iArr, i, this.f47857d - i2);
            this.f47857d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f47857d;
    }

    /* renamed from: w */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    /* renamed from: y */
    public final String mo54641y(int i) {
        return "Index:" + i + ", Size:" + this.f47857d;
    }

    public C18744h1(int[] iArr, int i) {
        this.f47856c = iArr;
        this.f47857d = i;
    }

    /* renamed from: c */
    public C18753i1.C18760g m86073c(int i) {
        if (i >= this.f47857d) {
            return new C18744h1(Arrays.copyOf(this.f47856c, i), this.f47857d);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo54411e();
        for (int i = 0; i < this.f47857d; i++) {
            if (obj.equals(Integer.valueOf(this.f47856c[i]))) {
                int[] iArr = this.f47856c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f47857d - i) - 1);
                this.f47857d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
