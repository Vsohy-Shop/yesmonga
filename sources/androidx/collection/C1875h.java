package androidx.collection;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.collection.h */
public class C1875h<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f5123e = new Object();

    /* renamed from: a */
    public boolean f5124a;

    /* renamed from: b */
    public long[] f5125b;

    /* renamed from: c */
    public Object[] f5126c;

    /* renamed from: d */
    public int f5127d;

    public C1875h() {
        this(10);
    }

    /* renamed from: A */
    public boolean mo6208A(long j, Object obj) {
        int m = mo6225m(j);
        if (m < 0) {
            return false;
        }
        Object G = mo6214G(m);
        if (obj != G && (obj == null || !obj.equals(G))) {
            return false;
        }
        mo6209B(m);
        return true;
    }

    /* renamed from: B */
    public void mo6209B(int i) {
        Object[] objArr = this.f5126c;
        Object obj = objArr[i];
        Object obj2 = f5123e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f5124a = true;
        }
    }

    @C0363p0
    /* renamed from: C */
    public E mo6210C(long j, E e) {
        int m = mo6225m(j);
        if (m < 0) {
            return null;
        }
        E[] eArr = this.f5126c;
        E e2 = eArr[m];
        eArr[m] = e;
        return e2;
    }

    /* renamed from: D */
    public boolean mo6211D(long j, E e, E e2) {
        int m = mo6225m(j);
        if (m < 0) {
            return false;
        }
        E e3 = this.f5126c[m];
        if (e3 != e && (e == null || !e.equals(e3))) {
            return false;
        }
        this.f5126c[m] = e2;
        return true;
    }

    /* renamed from: E */
    public void mo6212E(int i, E e) {
        if (this.f5124a) {
            mo6222j();
        }
        this.f5126c[i] = e;
    }

    /* renamed from: F */
    public int mo6213F() {
        if (this.f5124a) {
            mo6222j();
        }
        return this.f5127d;
    }

    /* renamed from: G */
    public E mo6214G(int i) {
        if (this.f5124a) {
            mo6222j();
        }
        return this.f5126c[i];
    }

    /* renamed from: b */
    public void mo6215b(long j, E e) {
        int i = this.f5127d;
        if (i == 0 || j > this.f5125b[i - 1]) {
            if (this.f5124a && i >= this.f5125b.length) {
                mo6222j();
            }
            int i2 = this.f5127d;
            if (i2 >= this.f5125b.length) {
                int f = C1874g.m7498f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f5125b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f5126c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5125b = jArr;
                this.f5126c = objArr;
            }
            this.f5125b[i2] = j;
            this.f5126c[i2] = e;
            this.f5127d = i2 + 1;
            return;
        }
        mo6229t(j, e);
    }

    /* renamed from: c */
    public void mo6216c() {
        int i = this.f5127d;
        Object[] objArr = this.f5126c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5127d = 0;
        this.f5124a = false;
    }

    /* renamed from: e */
    public C1875h<E> clone() {
        try {
            C1875h<E> hVar = (C1875h) super.clone();
            hVar.f5125b = (long[]) this.f5125b.clone();
            hVar.f5126c = (Object[]) this.f5126c.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean mo6219f(long j) {
        return mo6225m(j) >= 0;
    }

    /* renamed from: h */
    public boolean mo6220h(E e) {
        return mo6226n(e) >= 0;
    }

    @Deprecated
    /* renamed from: i */
    public void mo6221i(long j) {
        mo6233x(j);
    }

    /* renamed from: j */
    public final void mo6222j() {
        int i = this.f5127d;
        long[] jArr = this.f5125b;
        Object[] objArr = this.f5126c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5123e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5124a = false;
        this.f5127d = i2;
    }

    @C0363p0
    /* renamed from: k */
    public E mo6223k(long j) {
        return mo6224l(j, (Object) null);
    }

    /* renamed from: l */
    public E mo6224l(long j, E e) {
        E e2;
        int b = C1874g.m7494b(this.f5125b, this.f5127d, j);
        if (b < 0 || (e2 = this.f5126c[b]) == f5123e) {
            return e;
        }
        return e2;
    }

    /* renamed from: m */
    public int mo6225m(long j) {
        if (this.f5124a) {
            mo6222j();
        }
        return C1874g.m7494b(this.f5125b, this.f5127d, j);
    }

    /* renamed from: n */
    public int mo6226n(E e) {
        if (this.f5124a) {
            mo6222j();
        }
        for (int i = 0; i < this.f5127d; i++) {
            if (this.f5126c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public boolean mo6227o() {
        return mo6213F() == 0;
    }

    /* renamed from: s */
    public long mo6228s(int i) {
        if (this.f5124a) {
            mo6222j();
        }
        return this.f5125b[i];
    }

    /* renamed from: t */
    public void mo6229t(long j, E e) {
        int b = C1874g.m7494b(this.f5125b, this.f5127d, j);
        if (b >= 0) {
            this.f5126c[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f5127d;
        if (i < i2) {
            Object[] objArr = this.f5126c;
            if (objArr[i] == f5123e) {
                this.f5125b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f5124a && i2 >= this.f5125b.length) {
            mo6222j();
            i = ~C1874g.m7494b(this.f5125b, this.f5127d, j);
        }
        int i3 = this.f5127d;
        if (i3 >= this.f5125b.length) {
            int f = C1874g.m7498f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f5125b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5126c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5125b = jArr;
            this.f5126c = objArr2;
        }
        int i4 = this.f5127d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f5125b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f5126c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f5127d - i);
        }
        this.f5125b[i] = j;
        this.f5126c[i] = e;
        this.f5127d++;
    }

    public String toString() {
        if (mo6213F() <= 0) {
            return C28819e.f70617a;
        }
        StringBuilder sb = new StringBuilder(this.f5127d * 28);
        sb.append(C12361b.f30258i);
        for (int i = 0; i < this.f5127d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6228s(i));
            sb.append('=');
            Object G = mo6214G(i);
            if (G != this) {
                sb.append(G);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C12361b.f30259j);
        return sb.toString();
    }

    /* renamed from: u */
    public void mo6231u(@C0359n0 C1875h<? extends E> hVar) {
        int F = hVar.mo6213F();
        for (int i = 0; i < F; i++) {
            mo6229t(hVar.mo6228s(i), hVar.mo6214G(i));
        }
    }

    @C0363p0
    /* renamed from: v */
    public E mo6232v(long j, E e) {
        E k = mo6223k(j);
        if (k == null) {
            mo6229t(j, e);
        }
        return k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f5126c;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6233x(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f5125b
            int r1 = r2.f5127d
            int r3 = androidx.collection.C1874g.m7494b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f5126c
            r0 = r4[r3]
            java.lang.Object r1 = f5123e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f5124a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1875h.mo6233x(long):void");
    }

    public C1875h(int i) {
        this.f5124a = false;
        if (i == 0) {
            this.f5125b = C1874g.f5121b;
            this.f5126c = C1874g.f5122c;
            return;
        }
        int f = C1874g.m7498f(i);
        this.f5125b = new long[f];
        this.f5126c = new Object[f];
    }
}
