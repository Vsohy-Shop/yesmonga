package androidx.recyclerview.widget;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.e0 */
public class C20123e0<T> {

    /* renamed from: j */
    public static final int f51776j = -1;

    /* renamed from: k */
    public static final int f51777k = 10;

    /* renamed from: l */
    public static final int f51778l = 10;

    /* renamed from: m */
    public static final int f51779m = 1;

    /* renamed from: n */
    public static final int f51780n = 2;

    /* renamed from: o */
    public static final int f51781o = 4;

    /* renamed from: a */
    public T[] f51782a;

    /* renamed from: b */
    public T[] f51783b;

    /* renamed from: c */
    public int f51784c;

    /* renamed from: d */
    public int f51785d;

    /* renamed from: e */
    public int f51786e;

    /* renamed from: f */
    public C20125b f51787f;

    /* renamed from: g */
    public C20124a f51788g;

    /* renamed from: h */
    public int f51789h;

    /* renamed from: i */
    public final Class<T> f51790i;

    /* renamed from: androidx.recyclerview.widget.e0$a */
    public static class C20124a<T2> extends C20125b<T2> {

        /* renamed from: a */
        public final C20125b<T2> f51791a;

        /* renamed from: b */
        public final C20126f f51792b;

        public C20124a(C20125b<T2> bVar) {
            this.f51791a = bVar;
            this.f51792b = new C20126f(bVar);
        }

        /* renamed from: a */
        public void mo60230a(int i, int i2) {
            this.f51792b.mo60230a(i, i2);
        }

        /* renamed from: b */
        public void mo60231b(int i, int i2) {
            this.f51792b.mo60231b(i, i2);
        }

        /* renamed from: c */
        public void mo60232c(int i, int i2, Object obj) {
            this.f51792b.mo60232c(i, i2, obj);
        }

        public int compare(T2 t2, T2 t22) {
            return this.f51791a.compare(t2, t22);
        }

        /* renamed from: d */
        public void mo60233d(int i, int i2) {
            this.f51792b.mo60233d(i, i2);
        }

        /* renamed from: e */
        public boolean mo60351e(T2 t2, T2 t22) {
            return this.f51791a.mo60351e(t2, t22);
        }

        /* renamed from: f */
        public boolean mo60352f(T2 t2, T2 t22) {
            return this.f51791a.mo60352f(t2, t22);
        }

        @C0363p0
        /* renamed from: g */
        public Object mo60353g(T2 t2, T2 t22) {
            return this.f51791a.mo60353g(t2, t22);
        }

        /* renamed from: h */
        public void mo60354h(int i, int i2) {
            this.f51792b.mo60232c(i, i2, (Object) null);
        }

        /* renamed from: i */
        public void mo60355i() {
            this.f51792b.mo60356e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.e0$b */
    public static abstract class C20125b<T2> implements Comparator<T2>, C20211u {
        /* renamed from: c */
        public void mo60232c(int i, int i2, Object obj) {
            mo60354h(i, i2);
        }

        public abstract int compare(T2 t2, T2 t22);

        /* renamed from: e */
        public abstract boolean mo60351e(T2 t2, T2 t22);

        /* renamed from: f */
        public abstract boolean mo60352f(T2 t2, T2 t22);

        @C0363p0
        /* renamed from: g */
        public Object mo60353g(T2 t2, T2 t22) {
            return null;
        }

        /* renamed from: h */
        public abstract void mo60354h(int i, int i2);
    }

    public C20123e0(@C0359n0 Class<T> cls, @C0359n0 C20125b<T> bVar) {
        this(cls, bVar, 10);
    }

    /* renamed from: A */
    public final void mo60318A(@C0359n0 T[] tArr) {
        boolean z = !(this.f51787f instanceof C20124a);
        if (z) {
            mo60331h();
        }
        this.f51784c = 0;
        this.f51785d = this.f51789h;
        this.f51783b = this.f51782a;
        this.f51786e = 0;
        int D = mo60321D(tArr);
        this.f51782a = (Object[]) Array.newInstance(this.f51790i, D);
        while (true) {
            int i = this.f51786e;
            if (i >= D && this.f51784c >= this.f51785d) {
                break;
            }
            int i2 = this.f51784c;
            int i3 = this.f51785d;
            if (i2 >= i3) {
                int i4 = D - i;
                System.arraycopy(tArr, i, this.f51782a, i, i4);
                this.f51786e += i4;
                this.f51789h += i4;
                this.f51787f.mo60230a(i, i4);
                break;
            } else if (i >= D) {
                int i5 = i3 - i2;
                this.f51789h -= i5;
                this.f51787f.mo60231b(i, i5);
                break;
            } else {
                T t = this.f51783b[i2];
                T t2 = tArr[i];
                int compare = this.f51787f.compare(t, t2);
                if (compare < 0) {
                    mo60319B();
                } else if (compare > 0) {
                    mo60349z(t2);
                } else if (!this.f51787f.mo60352f(t, t2)) {
                    mo60319B();
                    mo60349z(t2);
                } else {
                    T[] tArr2 = this.f51782a;
                    int i6 = this.f51786e;
                    tArr2[i6] = t2;
                    this.f51784c++;
                    this.f51786e = i6 + 1;
                    if (!this.f51787f.mo60351e(t, t2)) {
                        C20125b bVar = this.f51787f;
                        bVar.mo60232c(this.f51786e - 1, 1, bVar.mo60353g(t, t2));
                    }
                }
            }
        }
        this.f51783b = null;
        if (z) {
            mo60334k();
        }
    }

    /* renamed from: B */
    public final void mo60319B() {
        this.f51789h--;
        this.f51784c++;
        this.f51787f.mo60231b(this.f51786e, 1);
    }

    /* renamed from: C */
    public int mo60320C() {
        return this.f51789h;
    }

    /* renamed from: D */
    public final int mo60321D(@C0359n0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f51787f);
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f51787f.compare(tArr[i], t) == 0) {
                int m = mo60336m(t, tArr, i, i2);
                if (m != -1) {
                    tArr[m] = t;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = t;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = t;
                }
                i = i2;
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: E */
    public final void mo60322E() {
        if (this.f51783b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    /* renamed from: F */
    public void mo60323F(int i, T t) {
        boolean z;
        mo60322E();
        T n = mo60337n(i);
        if (n == t || !this.f51787f.mo60351e(n, t)) {
            z = true;
        } else {
            z = false;
        }
        if (n == t || this.f51787f.compare(n, t) != 0) {
            if (z) {
                C20125b bVar = this.f51787f;
                bVar.mo60232c(i, 1, bVar.mo60353g(n, t));
            }
            mo60345v(i, false);
            int b = mo60325b(t, false);
            if (i != b) {
                this.f51787f.mo60233d(i, b);
                return;
            }
            return;
        }
        this.f51782a[i] = t;
        if (z) {
            C20125b bVar2 = this.f51787f;
            bVar2.mo60232c(i, 1, bVar2.mo60353g(n, t));
        }
    }

    /* renamed from: a */
    public int mo60324a(T t) {
        mo60322E();
        return mo60325b(t, true);
    }

    /* renamed from: b */
    public final int mo60325b(T t, boolean z) {
        int l = mo60335l(t, this.f51782a, 0, this.f51789h, 1);
        if (l == -1) {
            l = 0;
        } else if (l < this.f51789h) {
            T t2 = this.f51782a[l];
            if (this.f51787f.mo60352f(t2, t)) {
                if (this.f51787f.mo60351e(t2, t)) {
                    this.f51782a[l] = t;
                    return l;
                }
                this.f51782a[l] = t;
                C20125b bVar = this.f51787f;
                bVar.mo60232c(l, 1, bVar.mo60353g(t2, t));
                return l;
            }
        }
        mo60330g(l, t);
        if (z) {
            this.f51787f.mo60230a(l, 1);
        }
        return l;
    }

    /* renamed from: c */
    public void mo60326c(@C0359n0 Collection<T> collection) {
        mo60328e(collection.toArray((Object[]) Array.newInstance(this.f51790i, collection.size())), true);
    }

    /* renamed from: d */
    public void mo60327d(@C0359n0 T... tArr) {
        mo60328e(tArr, false);
    }

    /* renamed from: e */
    public void mo60328e(@C0359n0 T[] tArr, boolean z) {
        mo60322E();
        if (tArr.length != 0) {
            if (z) {
                mo60329f(tArr);
            } else {
                mo60329f(mo60333j(tArr));
            }
        }
    }

    /* renamed from: f */
    public final void mo60329f(T[] tArr) {
        if (tArr.length >= 1) {
            int D = mo60321D(tArr);
            if (this.f51789h == 0) {
                this.f51782a = tArr;
                this.f51789h = D;
                this.f51787f.mo60230a(0, D);
                return;
            }
            mo60340q(tArr, D);
        }
    }

    /* renamed from: g */
    public final void mo60330g(int i, T t) {
        int i2 = this.f51789h;
        if (i <= i2) {
            T[] tArr = this.f51782a;
            if (i2 == tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(this.f51790i, tArr.length + 10);
                System.arraycopy(this.f51782a, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.f51782a, i, tArr2, i + 1, this.f51789h - i);
                this.f51782a = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.f51782a[i] = t;
            }
            this.f51789h++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f51789h);
    }

    /* renamed from: h */
    public void mo60331h() {
        mo60322E();
        C20125b bVar = this.f51787f;
        if (!(bVar instanceof C20124a)) {
            if (this.f51788g == null) {
                this.f51788g = new C20124a(bVar);
            }
            this.f51787f = this.f51788g;
        }
    }

    /* renamed from: i */
    public void mo60332i() {
        mo60322E();
        int i = this.f51789h;
        if (i != 0) {
            Arrays.fill(this.f51782a, 0, i, (Object) null);
            this.f51789h = 0;
            this.f51787f.mo60231b(0, i);
        }
    }

    /* renamed from: j */
    public final T[] mo60333j(T[] tArr) {
        T[] tArr2 = (Object[]) Array.newInstance(this.f51790i, tArr.length);
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    /* renamed from: k */
    public void mo60334k() {
        mo60322E();
        C20125b bVar = this.f51787f;
        if (bVar instanceof C20124a) {
            ((C20124a) bVar).mo60355i();
        }
        C20125b bVar2 = this.f51787f;
        C20124a aVar = this.f51788g;
        if (bVar2 == aVar) {
            this.f51787f = aVar.f51791a;
        }
    }

    /* renamed from: l */
    public final int mo60335l(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f51787f.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare != 0) {
                i2 = i4;
            } else if (this.f51787f.mo60352f(t2, t)) {
                return i4;
            } else {
                int p = mo60339p(t, i4, i, i2);
                if (i3 != 1) {
                    return p;
                }
                if (p == -1) {
                    return i4;
                }
                return p;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    /* renamed from: m */
    public final int mo60336m(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f51787f.mo60352f(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: n */
    public T mo60337n(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i >= this.f51789h || i < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f51789h);
        }
        T[] tArr = this.f51783b;
        if (tArr == null || i < (i2 = this.f51786e)) {
            return this.f51782a[i];
        }
        return tArr[(i - i2) + this.f51784c];
    }

    /* renamed from: o */
    public int mo60338o(T t) {
        if (this.f51783b != null) {
            int l = mo60335l(t, this.f51782a, 0, this.f51786e, 4);
            if (l != -1) {
                return l;
            }
            int l2 = mo60335l(t, this.f51783b, this.f51784c, this.f51785d, 4);
            if (l2 != -1) {
                return (l2 - this.f51784c) + this.f51786e;
            }
            return -1;
        }
        return mo60335l(t, this.f51782a, 0, this.f51789h, 4);
    }

    /* renamed from: p */
    public final int mo60339p(T t, int i, int i2, int i3) {
        T t2;
        int i4 = i - 1;
        while (i4 >= i2) {
            T t3 = this.f51782a[i4];
            if (this.f51787f.compare(t3, t) != 0) {
                break;
            } else if (this.f51787f.mo60352f(t3, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.f51782a[i];
            if (this.f51787f.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.f51787f.mo60352f(t2, t));
        return i;
    }

    /* renamed from: q */
    public final void mo60340q(T[] tArr, int i) {
        boolean z = !(this.f51787f instanceof C20124a);
        if (z) {
            mo60331h();
        }
        this.f51783b = this.f51782a;
        int i2 = 0;
        this.f51784c = 0;
        int i3 = this.f51789h;
        this.f51785d = i3;
        this.f51782a = (Object[]) Array.newInstance(this.f51790i, i3 + i + 10);
        this.f51786e = 0;
        while (true) {
            int i4 = this.f51784c;
            int i5 = this.f51785d;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.f51782a, this.f51786e, i6);
                int i7 = this.f51786e + i6;
                this.f51786e = i7;
                this.f51789h += i6;
                this.f51787f.mo60230a(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f51783b, i4, this.f51782a, this.f51786e, i8);
                this.f51786e += i8;
                break;
            } else {
                T t = this.f51783b[i4];
                T t2 = tArr[i2];
                int compare = this.f51787f.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.f51782a;
                    int i9 = this.f51786e;
                    int i10 = i9 + 1;
                    this.f51786e = i10;
                    tArr2[i9] = t2;
                    this.f51789h++;
                    i2++;
                    this.f51787f.mo60230a(i10 - 1, 1);
                } else if (compare != 0 || !this.f51787f.mo60352f(t, t2)) {
                    T[] tArr3 = this.f51782a;
                    int i11 = this.f51786e;
                    this.f51786e = i11 + 1;
                    tArr3[i11] = t;
                    this.f51784c++;
                } else {
                    T[] tArr4 = this.f51782a;
                    int i12 = this.f51786e;
                    this.f51786e = i12 + 1;
                    tArr4[i12] = t2;
                    i2++;
                    this.f51784c++;
                    if (!this.f51787f.mo60351e(t, t2)) {
                        C20125b bVar = this.f51787f;
                        bVar.mo60232c(this.f51786e - 1, 1, bVar.mo60353g(t, t2));
                    }
                }
            }
        }
        this.f51783b = null;
        if (z) {
            mo60334k();
        }
    }

    /* renamed from: r */
    public void mo60341r(int i) {
        mo60322E();
        Object n = mo60337n(i);
        mo60345v(i, false);
        int b = mo60325b(n, false);
        if (i != b) {
            this.f51787f.mo60233d(i, b);
        }
    }

    /* renamed from: s */
    public boolean mo60342s(T t) {
        mo60322E();
        return mo60343t(t, true);
    }

    /* renamed from: t */
    public final boolean mo60343t(T t, boolean z) {
        int l = mo60335l(t, this.f51782a, 0, this.f51789h, 2);
        if (l == -1) {
            return false;
        }
        mo60345v(l, z);
        return true;
    }

    /* renamed from: u */
    public T mo60344u(int i) {
        mo60322E();
        T n = mo60337n(i);
        mo60345v(i, true);
        return n;
    }

    /* renamed from: v */
    public final void mo60345v(int i, boolean z) {
        T[] tArr = this.f51782a;
        System.arraycopy(tArr, i + 1, tArr, i, (this.f51789h - i) - 1);
        int i2 = this.f51789h - 1;
        this.f51789h = i2;
        this.f51782a[i2] = null;
        if (z) {
            this.f51787f.mo60231b(i, 1);
        }
    }

    /* renamed from: w */
    public void mo60346w(@C0359n0 Collection<T> collection) {
        mo60348y(collection.toArray((Object[]) Array.newInstance(this.f51790i, collection.size())), true);
    }

    /* renamed from: x */
    public void mo60347x(@C0359n0 T... tArr) {
        mo60348y(tArr, false);
    }

    /* renamed from: y */
    public void mo60348y(@C0359n0 T[] tArr, boolean z) {
        mo60322E();
        if (z) {
            mo60318A(tArr);
        } else {
            mo60318A(mo60333j(tArr));
        }
    }

    /* renamed from: z */
    public final void mo60349z(T t) {
        T[] tArr = this.f51782a;
        int i = this.f51786e;
        tArr[i] = t;
        int i2 = i + 1;
        this.f51786e = i2;
        this.f51789h++;
        this.f51787f.mo60230a(i2 - 1, 1);
    }

    public C20123e0(@C0359n0 Class<T> cls, @C0359n0 C20125b<T> bVar, int i) {
        this.f51790i = cls;
        this.f51782a = (Object[]) Array.newInstance(cls, i);
        this.f51787f = bVar;
        this.f51789h = 0;
    }
}
