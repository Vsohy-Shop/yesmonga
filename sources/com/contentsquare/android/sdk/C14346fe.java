package com.contentsquare.android.sdk;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.fe */
public final class C14346fe<E> extends C14240c3<E> implements RandomAccess {

    /* renamed from: d */
    public static final C14346fe<Object> f35439d;

    /* renamed from: b */
    public E[] f35440b;

    /* renamed from: c */
    public int f35441c;

    static {
        C14346fe<Object> feVar = new C14346fe<>(new Object[0], 0);
        f35439d = feVar;
        feVar.mo34819c();
    }

    public C14346fe(E[] eArr, int i) {
        this.f35440b = eArr;
        this.f35441c = i;
    }

    /* renamed from: h */
    public static <E> E[] m61720h(int i) {
        return new Object[i];
    }

    /* renamed from: q */
    public static <E> C14346fe<E> m61721q() {
        return f35439d;
    }

    public void add(int i, E e) {
        int i2;
        mo34821e();
        if (i < 0 || i > (i2 = this.f35441c)) {
            throw new IndexOutOfBoundsException(mo35244k(i));
        }
        E[] eArr = this.f35440b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] h = m61720h(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f35440b, 0, h, 0, i);
            System.arraycopy(this.f35440b, i, h, i + 1, this.f35441c - i);
            this.f35440b = h;
        }
        this.f35440b[i] = e;
        this.f35441c++;
        this.modCount++;
    }

    public E get(int i) {
        mo35243i(i);
        return this.f35440b[i];
    }

    /* renamed from: i */
    public final void mo35243i(int i) {
        if (i < 0 || i >= this.f35441c) {
            throw new IndexOutOfBoundsException(mo35244k(i));
        }
    }

    /* renamed from: k */
    public final String mo35244k(int i) {
        return "Index:" + i + ", Size:" + this.f35441c;
    }

    /* renamed from: r */
    public C14346fe<E> mo34508b(int i) {
        if (i >= this.f35441c) {
            return new C14346fe<>(Arrays.copyOf(this.f35440b, i), this.f35441c);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo34821e();
        mo35243i(i);
        E[] eArr = this.f35440b;
        E e = eArr[i];
        int i2 = this.f35441c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f35441c--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo34821e();
        mo35243i(i);
        E[] eArr = this.f35440b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f35441c;
    }

    public boolean add(E e) {
        mo34821e();
        int i = this.f35441c;
        E[] eArr = this.f35440b;
        if (i == eArr.length) {
            this.f35440b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f35440b;
        int i2 = this.f35441c;
        this.f35441c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
