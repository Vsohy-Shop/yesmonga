package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g4 */
public final class C38927g4<E> extends C38864a1<E> implements RandomAccess {

    /* renamed from: d */
    public static final C38927g4<Object> f98853d;

    /* renamed from: b */
    public E[] f98854b;

    /* renamed from: c */
    public int f98855c;

    static {
        C38927g4<Object> g4Var = new C38927g4<>(new Object[0], 0);
        f98853d = g4Var;
        g4Var.zzb();
    }

    public C38927g4() {
        this(new Object[10], 0);
    }

    /* renamed from: h */
    public static <E> C38927g4<E> m160516h() {
        return f98853d;
    }

    public final void add(int i, E e) {
        int i2;
        mo122768e();
        if (i < 0 || i > (i2 = this.f98855c)) {
            throw new IndexOutOfBoundsException(mo122903i(i));
        }
        E[] eArr = this.f98854b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f98854b, i, eArr2, i + 1, this.f98855c - i);
            this.f98854b = eArr2;
        }
        this.f98854b[i] = e;
        this.f98855c++;
        this.modCount++;
    }

    public final E get(int i) {
        mo122904k(i);
        return this.f98854b[i];
    }

    /* renamed from: i */
    public final String mo122903i(int i) {
        int i2 = this.f98855c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    public final void mo122904k(int i) {
        if (i < 0 || i >= this.f98855c) {
            throw new IndexOutOfBoundsException(mo122903i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C39075w2 mo122844n(int i) {
        if (i >= this.f98855c) {
            return new C38927g4(Arrays.copyOf(this.f98854b, i), this.f98855c);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo122768e();
        mo122904k(i);
        E[] eArr = this.f98854b;
        E e = eArr[i];
        int i2 = this.f98855c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f98855c--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo122768e();
        mo122904k(i);
        E[] eArr = this.f98854b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f98855c;
    }

    public C38927g4(E[] eArr, int i) {
        this.f98854b = eArr;
        this.f98855c = i;
    }

    public final boolean add(E e) {
        mo122768e();
        int i = this.f98855c;
        E[] eArr = this.f98854b;
        if (i == eArr.length) {
            this.f98854b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f98854b;
        int i2 = this.f98855c;
        this.f98855c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
