package androidx.collection;

/* renamed from: androidx.collection.e */
public final class C1872e<E> {

    /* renamed from: a */
    public E[] f5112a;

    /* renamed from: b */
    public int f5113b;

    /* renamed from: c */
    public int f5114c;

    /* renamed from: d */
    public int f5115d;

    public C1872e() {
        this(8);
    }

    /* renamed from: a */
    public void mo6182a(E e) {
        int i = (this.f5113b - 1) & this.f5115d;
        this.f5113b = i;
        this.f5112a[i] = e;
        if (i == this.f5114c) {
            mo6185d();
        }
    }

    /* renamed from: b */
    public void mo6183b(E e) {
        E[] eArr = this.f5112a;
        int i = this.f5114c;
        eArr[i] = e;
        int i2 = this.f5115d & (i + 1);
        this.f5114c = i2;
        if (i2 == this.f5113b) {
            mo6185d();
        }
    }

    /* renamed from: c */
    public void mo6184c() {
        mo6193l(mo6194m());
    }

    /* renamed from: d */
    public final void mo6185d() {
        E[] eArr = this.f5112a;
        int length = eArr.length;
        int i = this.f5113b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.f5112a, 0, eArr2, i2, this.f5113b);
            this.f5112a = eArr2;
            this.f5113b = 0;
            this.f5114c = length;
            this.f5115d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: e */
    public E mo6186e(int i) {
        if (i < 0 || i >= mo6194m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f5112a[this.f5115d & (this.f5113b + i)];
    }

    /* renamed from: f */
    public E mo6187f() {
        int i = this.f5113b;
        if (i != this.f5114c) {
            return this.f5112a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public E mo6188g() {
        int i = this.f5113b;
        int i2 = this.f5114c;
        if (i != i2) {
            return this.f5112a[(i2 - 1) & this.f5115d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: h */
    public boolean mo6189h() {
        return this.f5113b == this.f5114c;
    }

    /* renamed from: i */
    public E mo6190i() {
        int i = this.f5113b;
        if (i != this.f5114c) {
            E[] eArr = this.f5112a;
            E e = eArr[i];
            eArr[i] = null;
            this.f5113b = (i + 1) & this.f5115d;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: j */
    public E mo6191j() {
        int i = this.f5113b;
        int i2 = this.f5114c;
        if (i != i2) {
            int i3 = this.f5115d & (i2 - 1);
            E[] eArr = this.f5112a;
            E e = eArr[i3];
            eArr[i3] = null;
            this.f5114c = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: k */
    public void mo6192k(int i) {
        int i2;
        int i3;
        if (i > 0) {
            if (i <= mo6194m()) {
                int i4 = this.f5114c;
                if (i < i4) {
                    i2 = i4 - i;
                } else {
                    i2 = 0;
                }
                int i5 = i2;
                while (true) {
                    i3 = this.f5114c;
                    if (i5 >= i3) {
                        break;
                    }
                    this.f5112a[i5] = null;
                    i5++;
                }
                int i6 = i3 - i2;
                int i7 = i - i6;
                this.f5114c = i3 - i6;
                if (i7 > 0) {
                    int length = this.f5112a.length;
                    this.f5114c = length;
                    int i8 = length - i7;
                    for (int i9 = i8; i9 < this.f5114c; i9++) {
                        this.f5112a[i9] = null;
                    }
                    this.f5114c = i8;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: l */
    public void mo6193l(int i) {
        if (i > 0) {
            if (i <= mo6194m()) {
                int length = this.f5112a.length;
                int i2 = this.f5113b;
                if (i < length - i2) {
                    length = i2 + i;
                }
                while (i2 < length) {
                    this.f5112a[i2] = null;
                    i2++;
                }
                int i3 = this.f5113b;
                int i4 = length - i3;
                int i5 = i - i4;
                this.f5113b = this.f5115d & (i3 + i4);
                if (i5 > 0) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        this.f5112a[i6] = null;
                    }
                    this.f5113b = i5;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public int mo6194m() {
        return (this.f5114c - this.f5113b) & this.f5115d;
    }

    public C1872e(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f5115d = i - 1;
            this.f5112a = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }
}
