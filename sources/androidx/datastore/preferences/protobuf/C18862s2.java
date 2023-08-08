package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.s2 */
public final class C18862s2<E> extends C18695c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C18862s2<Object> f48006e;

    /* renamed from: c */
    public E[] f48007c;

    /* renamed from: d */
    public int f48008d;

    static {
        C18862s2<Object> s2Var = new C18862s2<>(new Object[0], 0);
        f48006e = s2Var;
        s2Var.mo54404J();
    }

    public C18862s2() {
        this(new Object[10], 0);
    }

    /* renamed from: h */
    public static <E> E[] m87418h(int i) {
        return new Object[i];
    }

    /* renamed from: i */
    public static <E> C18862s2<E> m87419i() {
        return f48006e;
    }

    public boolean add(E e) {
        mo54411e();
        int i = this.f48008d;
        E[] eArr = this.f48007c;
        if (i == eArr.length) {
            this.f48007c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f48007c;
        int i2 = this.f48008d;
        this.f48008d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        mo55383k(i);
        return this.f48007c[i];
    }

    /* renamed from: k */
    public final void mo55383k(int i) {
        if (i < 0 || i >= this.f48008d) {
            throw new IndexOutOfBoundsException(mo55384q(i));
        }
    }

    /* renamed from: q */
    public final String mo55384q(int i) {
        return "Index:" + i + ", Size:" + this.f48008d;
    }

    /* renamed from: r */
    public C18862s2<E> mo54630c(int i) {
        if (i >= this.f48008d) {
            return new C18862s2<>(Arrays.copyOf(this.f48007c, i), this.f48008d);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo54411e();
        mo55383k(i);
        E[] eArr = this.f48007c;
        E e = eArr[i];
        int i2 = this.f48008d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f48008d--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo54411e();
        mo55383k(i);
        E[] eArr = this.f48007c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f48008d;
    }

    public C18862s2(E[] eArr, int i) {
        this.f48007c = eArr;
        this.f48008d = i;
    }

    public void add(int i, E e) {
        int i2;
        mo54411e();
        if (i < 0 || i > (i2 = this.f48008d)) {
            throw new IndexOutOfBoundsException(mo55384q(i));
        }
        E[] eArr = this.f48007c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] h = m87418h(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f48007c, 0, h, 0, i);
            System.arraycopy(this.f48007c, i, h, i + 1, this.f48008d - i);
            this.f48007c = h;
        }
        this.f48007c[i] = e;
        this.f48008d++;
        this.modCount++;
    }
}
