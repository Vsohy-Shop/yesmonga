package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.RandomAccess;

public final class h10<E> extends C29722sx<E> implements RandomAccess {

    /* renamed from: d */
    public static final h10<Object> f71271d;

    /* renamed from: b */
    public E[] f71272b;

    /* renamed from: c */
    public int f71273c;

    static {
        h10<Object> h10 = new h10<>(new Object[0], 0);
        f71271d = h10;
        h10.mo84834I();
    }

    public h10() {
        this(new Object[10], 0);
    }

    /* renamed from: h */
    public static <E> h10<E> m120454h() {
        return f71271d;
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= this.f71273c) {
            return new h10(Arrays.copyOf(this.f71272b, i), this.f71273c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        int i2;
        mo84835e();
        if (i < 0 || i > (i2 = this.f71273c)) {
            throw new IndexOutOfBoundsException(mo84661i(i));
        }
        E[] eArr = this.f71272b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f71272b, i, eArr2, i + 1, this.f71273c - i);
            this.f71272b = eArr2;
        }
        this.f71272b[i] = e;
        this.f71273c++;
        this.modCount++;
    }

    public final E get(int i) {
        mo84662k(i);
        return this.f71272b[i];
    }

    /* renamed from: i */
    public final String mo84661i(int i) {
        int i2 = this.f71273c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    public final void mo84662k(int i) {
        if (i < 0 || i >= this.f71273c) {
            throw new IndexOutOfBoundsException(mo84661i(i));
        }
    }

    public final E remove(int i) {
        mo84835e();
        mo84662k(i);
        E[] eArr = this.f71272b;
        E e = eArr[i];
        int i2 = this.f71273c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f71273c--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo84835e();
        mo84662k(i);
        E[] eArr = this.f71272b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f71273c;
    }

    public h10(E[] eArr, int i) {
        this.f71272b = eArr;
        this.f71273c = i;
    }

    public final boolean add(E e) {
        mo84835e();
        int i = this.f71273c;
        E[] eArr = this.f71272b;
        if (i == eArr.length) {
            this.f71272b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f71272b;
        int i2 = this.f71273c;
        this.f71273c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
