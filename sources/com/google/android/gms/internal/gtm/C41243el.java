package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.el */
public final class C41243el<E> extends C41743zg<E> implements RandomAccess {

    /* renamed from: d */
    public static final C41243el<Object> f104572d;

    /* renamed from: b */
    public E[] f104573b;

    /* renamed from: c */
    public int f104574c;

    static {
        C41243el<Object> elVar = new C41243el<>(new Object[0], 0);
        f104572d = elVar;
        elVar.zzb();
    }

    public C41243el() {
        this(new Object[10], 0);
    }

    /* renamed from: h */
    public static <E> C41243el<E> m167469h() {
        return f104572d;
    }

    public final void add(int i, E e) {
        int i2;
        mo136121e();
        if (i < 0 || i > (i2 = this.f104574c)) {
            throw new IndexOutOfBoundsException(mo135351i(i));
        }
        E[] eArr = this.f104573b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f104573b, i, eArr2, i + 1, this.f104574c - i);
            this.f104573b = eArr2;
        }
        this.f104573b[i] = e;
        this.f104574c++;
        this.modCount++;
    }

    public final E get(int i) {
        mo135352k(i);
        return this.f104573b[i];
    }

    /* renamed from: i */
    public final String mo135351i(int i) {
        int i2 = this.f104574c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    public final void mo135352k(int i) {
        if (i < 0 || i >= this.f104574c) {
            throw new IndexOutOfBoundsException(mo135351i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C41626uj mo135130n(int i) {
        if (i >= this.f104574c) {
            return new C41243el(Arrays.copyOf(this.f104573b, i), this.f104574c);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo136121e();
        mo135352k(i);
        E[] eArr = this.f104573b;
        E e = eArr[i];
        int i2 = this.f104574c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f104574c--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo136121e();
        mo135352k(i);
        E[] eArr = this.f104573b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f104574c;
    }

    public C41243el(E[] eArr, int i) {
        this.f104573b = eArr;
        this.f104574c = i;
    }

    public final boolean add(E e) {
        mo136121e();
        int i = this.f104574c;
        E[] eArr = this.f104573b;
        if (i == eArr.length) {
            this.f104573b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f104573b;
        int i2 = this.f104574c;
        this.f104574c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
