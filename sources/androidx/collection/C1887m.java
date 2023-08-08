package androidx.collection;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.collection.m */
public class C1887m<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f5167e = new Object();

    /* renamed from: a */
    public boolean f5168a;

    /* renamed from: b */
    public int[] f5169b;

    /* renamed from: c */
    public Object[] f5170c;

    /* renamed from: d */
    public int f5171d;

    public C1887m() {
        this(10);
    }

    /* renamed from: A */
    public boolean mo6347A(int i, Object obj) {
        int m = mo6365m(i);
        if (m < 0) {
            return false;
        }
        Object H = mo6354H(m);
        if (obj != H && (obj == null || !obj.equals(H))) {
            return false;
        }
        mo6348B(m);
        return true;
    }

    /* renamed from: B */
    public void mo6348B(int i) {
        Object[] objArr = this.f5170c;
        Object obj = objArr[i];
        Object obj2 = f5167e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f5168a = true;
        }
    }

    /* renamed from: C */
    public void mo6349C(int i, int i2) {
        int min = Math.min(this.f5171d, i2 + i);
        while (i < min) {
            mo6348B(i);
            i++;
        }
    }

    @C0363p0
    /* renamed from: D */
    public E mo6350D(int i, E e) {
        int m = mo6365m(i);
        if (m < 0) {
            return null;
        }
        E[] eArr = this.f5170c;
        E e2 = eArr[m];
        eArr[m] = e;
        return e2;
    }

    /* renamed from: E */
    public boolean mo6351E(int i, E e, E e2) {
        int m = mo6365m(i);
        if (m < 0) {
            return false;
        }
        E e3 = this.f5170c[m];
        if (e3 != e && (e == null || !e.equals(e3))) {
            return false;
        }
        this.f5170c[m] = e2;
        return true;
    }

    /* renamed from: F */
    public void mo6352F(int i, E e) {
        if (this.f5168a) {
            mo6362j();
        }
        this.f5170c[i] = e;
    }

    /* renamed from: G */
    public int mo6353G() {
        if (this.f5168a) {
            mo6362j();
        }
        return this.f5171d;
    }

    /* renamed from: H */
    public E mo6354H(int i) {
        if (this.f5168a) {
            mo6362j();
        }
        return this.f5170c[i];
    }

    /* renamed from: b */
    public void mo6355b(int i, E e) {
        int i2 = this.f5171d;
        if (i2 == 0 || i > this.f5169b[i2 - 1]) {
            if (this.f5168a && i2 >= this.f5169b.length) {
                mo6362j();
            }
            int i3 = this.f5171d;
            if (i3 >= this.f5169b.length) {
                int e2 = C1874g.m7497e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f5169b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f5170c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5169b = iArr;
                this.f5170c = objArr;
            }
            this.f5169b[i3] = i;
            this.f5170c[i3] = e;
            this.f5171d = i3 + 1;
            return;
        }
        mo6369t(i, e);
    }

    /* renamed from: c */
    public void mo6356c() {
        int i = this.f5171d;
        Object[] objArr = this.f5170c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5171d = 0;
        this.f5168a = false;
    }

    /* renamed from: e */
    public C1887m<E> clone() {
        try {
            C1887m<E> mVar = (C1887m) super.clone();
            mVar.f5169b = (int[]) this.f5169b.clone();
            mVar.f5170c = (Object[]) this.f5170c.clone();
            return mVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean mo6359f(int i) {
        return mo6365m(i) >= 0;
    }

    /* renamed from: h */
    public boolean mo6360h(E e) {
        return mo6366n(e) >= 0;
    }

    @Deprecated
    /* renamed from: i */
    public void mo6361i(int i) {
        mo6373x(i);
    }

    /* renamed from: j */
    public final void mo6362j() {
        int i = this.f5171d;
        int[] iArr = this.f5169b;
        Object[] objArr = this.f5170c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5167e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5168a = false;
        this.f5171d = i2;
    }

    @C0363p0
    /* renamed from: k */
    public E mo6363k(int i) {
        return mo6364l(i, (Object) null);
    }

    /* renamed from: l */
    public E mo6364l(int i, E e) {
        E e2;
        int a = C1874g.m7493a(this.f5169b, this.f5171d, i);
        if (a < 0 || (e2 = this.f5170c[a]) == f5167e) {
            return e;
        }
        return e2;
    }

    /* renamed from: m */
    public int mo6365m(int i) {
        if (this.f5168a) {
            mo6362j();
        }
        return C1874g.m7493a(this.f5169b, this.f5171d, i);
    }

    /* renamed from: n */
    public int mo6366n(E e) {
        if (this.f5168a) {
            mo6362j();
        }
        for (int i = 0; i < this.f5171d; i++) {
            if (this.f5170c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public boolean mo6367o() {
        return mo6353G() == 0;
    }

    /* renamed from: s */
    public int mo6368s(int i) {
        if (this.f5168a) {
            mo6362j();
        }
        return this.f5169b[i];
    }

    /* renamed from: t */
    public void mo6369t(int i, E e) {
        int a = C1874g.m7493a(this.f5169b, this.f5171d, i);
        if (a >= 0) {
            this.f5170c[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f5171d;
        if (i2 < i3) {
            Object[] objArr = this.f5170c;
            if (objArr[i2] == f5167e) {
                this.f5169b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f5168a && i3 >= this.f5169b.length) {
            mo6362j();
            i2 = ~C1874g.m7493a(this.f5169b, this.f5171d, i);
        }
        int i4 = this.f5171d;
        if (i4 >= this.f5169b.length) {
            int e2 = C1874g.m7497e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f5169b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5170c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5169b = iArr;
            this.f5170c = objArr2;
        }
        int i5 = this.f5171d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f5169b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f5170c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f5171d - i2);
        }
        this.f5169b[i2] = i;
        this.f5170c[i2] = e;
        this.f5171d++;
    }

    public String toString() {
        if (mo6353G() <= 0) {
            return C28819e.f70617a;
        }
        StringBuilder sb = new StringBuilder(this.f5171d * 28);
        sb.append(C12361b.f30258i);
        for (int i = 0; i < this.f5171d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6368s(i));
            sb.append('=');
            Object H = mo6354H(i);
            if (H != this) {
                sb.append(H);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C12361b.f30259j);
        return sb.toString();
    }

    /* renamed from: u */
    public void mo6371u(@C0359n0 C1887m<? extends E> mVar) {
        int G = mVar.mo6353G();
        for (int i = 0; i < G; i++) {
            mo6369t(mVar.mo6368s(i), mVar.mo6354H(i));
        }
    }

    @C0363p0
    /* renamed from: v */
    public E mo6372v(int i, E e) {
        E k = mo6363k(i);
        if (k == null) {
            mo6369t(i, e);
        }
        return k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f5170c;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6373x(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f5169b
            int r1 = r3.f5171d
            int r4 = androidx.collection.C1874g.m7493a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f5170c
            r1 = r0[r4]
            java.lang.Object r2 = f5167e
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f5168a = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1887m.mo6373x(int):void");
    }

    public C1887m(int i) {
        this.f5168a = false;
        if (i == 0) {
            this.f5169b = C1874g.f5120a;
            this.f5170c = C1874g.f5122c;
            return;
        }
        int e = C1874g.m7497e(i);
        this.f5169b = new int[e];
        this.f5170c = new Object[e];
    }
}
