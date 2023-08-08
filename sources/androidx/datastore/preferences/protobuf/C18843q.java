package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.q */
public final class C18843q extends C18695c<Boolean> implements C18753i1.C18754a, RandomAccess, C18846q2 {

    /* renamed from: e */
    public static final C18843q f47983e;

    /* renamed from: c */
    public boolean[] f47984c;

    /* renamed from: d */
    public int f47985d;

    static {
        C18843q qVar = new C18843q(new boolean[0], 0);
        f47983e = qVar;
        qVar.mo54404J();
    }

    public C18843q() {
        this(new boolean[10], 0);
    }

    /* renamed from: q */
    public static C18843q m87306q() {
        return f47983e;
    }

    /* renamed from: A */
    public Boolean remove(int i) {
        mo54411e();
        mo55337r(i);
        boolean[] zArr = this.f47984c;
        boolean z = zArr[i];
        int i2 = this.f47985d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f47985d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: C */
    public boolean mo54822C(int i) {
        mo55337r(i);
        return this.f47984c[i];
    }

    /* renamed from: H */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo54824u(i, bool.booleanValue()));
    }

    /* renamed from: N */
    public void mo54823N(boolean z) {
        mo54411e();
        int i = this.f47985d;
        boolean[] zArr = this.f47984c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f47984c = zArr2;
        }
        boolean[] zArr3 = this.f47984c;
        int i2 = this.f47985d;
        this.f47985d = i2 + 1;
        zArr3[i2] = z;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo54411e();
        C18753i1.m86340d(collection);
        if (!(collection instanceof C18843q)) {
            return super.addAll(collection);
        }
        C18843q qVar = (C18843q) collection;
        int i = qVar.f47985d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f47985d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f47984c;
            if (i3 > zArr.length) {
                this.f47984c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(qVar.f47984c, 0, this.f47984c, this.f47985d, qVar.f47985d);
            this.f47985d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18843q)) {
            return super.equals(obj);
        }
        C18843q qVar = (C18843q) obj;
        if (this.f47985d != qVar.f47985d) {
            return false;
        }
        boolean[] zArr = qVar.f47984c;
        for (int i = 0; i < this.f47985d; i++) {
            if (this.f47984c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void add(int i, Boolean bool) {
        mo55336k(i, bool.booleanValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47985d; i2++) {
            i = (i * 31) + C18753i1.m86347k(this.f47984c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Boolean bool) {
        mo54823N(bool.booleanValue());
        return true;
    }

    /* renamed from: k */
    public final void mo55336k(int i, boolean z) {
        int i2;
        mo54411e();
        if (i < 0 || i > (i2 = this.f47985d)) {
            throw new IndexOutOfBoundsException(mo55341y(i));
        }
        boolean[] zArr = this.f47984c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f47984c, i, zArr2, i + 1, this.f47985d - i);
            this.f47984c = zArr2;
        }
        this.f47984c[i] = z;
        this.f47985d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo55337r(int i) {
        if (i < 0 || i >= this.f47985d) {
            throw new IndexOutOfBoundsException(mo55341y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo54411e();
        if (i2 >= i) {
            boolean[] zArr = this.f47984c;
            System.arraycopy(zArr, i2, zArr, i, this.f47985d - i2);
            this.f47985d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f47985d;
    }

    /* renamed from: u */
    public boolean mo54824u(int i, boolean z) {
        mo54411e();
        mo55337r(i);
        boolean[] zArr = this.f47984c;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    /* renamed from: w */
    public Boolean get(int i) {
        return Boolean.valueOf(mo54822C(i));
    }

    /* renamed from: y */
    public final String mo55341y(int i) {
        return "Index:" + i + ", Size:" + this.f47985d;
    }

    public C18843q(boolean[] zArr, int i) {
        this.f47984c = zArr;
        this.f47985d = i;
    }

    /* renamed from: c */
    public C18753i1.C18754a m87312c(int i) {
        if (i >= this.f47985d) {
            return new C18843q(Arrays.copyOf(this.f47984c, i), this.f47985d);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo54411e();
        for (int i = 0; i < this.f47985d; i++) {
            if (obj.equals(Boolean.valueOf(this.f47984c[i]))) {
                boolean[] zArr = this.f47984c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f47985d - i) - 1);
                this.f47985d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
