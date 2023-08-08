package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.b2 */
public final class C34335b2<E> extends C34337c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C34335b2<Object> f83210e;

    /* renamed from: c */
    public E[] f83211c;

    /* renamed from: d */
    public int f83212d;

    static {
        C34335b2<Object> b2Var = new C34335b2<>(new Object[0], 0);
        f83210e = b2Var;
        b2Var.mo100970J();
    }

    public C34335b2() {
        this(new Object[10], 0);
    }

    /* renamed from: h */
    public static <E> E[] m138926h(int i) {
        return new Object[i];
    }

    /* renamed from: i */
    public static <E> C34335b2<E> m138927i() {
        return f83210e;
    }

    public boolean add(E e) {
        mo100975e();
        int i = this.f83212d;
        E[] eArr = this.f83211c;
        if (i == eArr.length) {
            this.f83211c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f83211c;
        int i2 = this.f83212d;
        this.f83212d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        mo100964k(i);
        return this.f83211c[i];
    }

    /* renamed from: k */
    public final void mo100964k(int i) {
        if (i < 0 || i >= this.f83212d) {
            throw new IndexOutOfBoundsException(mo100965q(i));
        }
    }

    /* renamed from: q */
    public final String mo100965q(int i) {
        return "Index:" + i + ", Size:" + this.f83212d;
    }

    /* renamed from: r */
    public C34335b2<E> mo100962c(int i) {
        if (i >= this.f83212d) {
            return new C34335b2<>(Arrays.copyOf(this.f83211c, i), this.f83212d);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo100975e();
        mo100964k(i);
        E[] eArr = this.f83211c;
        E e = eArr[i];
        int i2 = this.f83212d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f83212d--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo100975e();
        mo100964k(i);
        E[] eArr = this.f83211c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f83212d;
    }

    public C34335b2(E[] eArr, int i) {
        this.f83211c = eArr;
        this.f83212d = i;
    }

    public void add(int i, E e) {
        int i2;
        mo100975e();
        if (i < 0 || i > (i2 = this.f83212d)) {
            throw new IndexOutOfBoundsException(mo100965q(i));
        }
        E[] eArr = this.f83211c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] h = m138926h(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f83211c, 0, h, 0, i);
            System.arraycopy(this.f83211c, i, h, i + 1, this.f83212d - i);
            this.f83211c = h;
        }
        this.f83211c[i] = e;
        this.f83212d++;
        this.modCount++;
    }
}
