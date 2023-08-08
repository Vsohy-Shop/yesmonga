package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.C0341g1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.C20141h0;
import androidx.recyclerview.widget.C20155i0;

/* renamed from: androidx.recyclerview.widget.e */
public class C20118e<T> {

    /* renamed from: s */
    public static final String f51745s = "AsyncListUtil";

    /* renamed from: t */
    public static final boolean f51746t = false;

    /* renamed from: a */
    public final Class<T> f51747a;

    /* renamed from: b */
    public final int f51748b;

    /* renamed from: c */
    public final C20121c<T> f51749c;

    /* renamed from: d */
    public final C20122d f51750d;

    /* renamed from: e */
    public final C20155i0<T> f51751e;

    /* renamed from: f */
    public final C20141h0.C20143b<T> f51752f;

    /* renamed from: g */
    public final C20141h0.C20142a<T> f51753g;

    /* renamed from: h */
    public final int[] f51754h = new int[2];

    /* renamed from: i */
    public final int[] f51755i = new int[2];

    /* renamed from: j */
    public final int[] f51756j = new int[2];

    /* renamed from: k */
    public boolean f51757k;

    /* renamed from: l */
    public int f51758l = 0;

    /* renamed from: m */
    public int f51759m = 0;

    /* renamed from: n */
    public int f51760n = 0;

    /* renamed from: o */
    public int f51761o = 0;

    /* renamed from: p */
    public final SparseIntArray f51762p = new SparseIntArray();

    /* renamed from: q */
    public final C20141h0.C20143b<T> f51763q;

    /* renamed from: r */
    public final C20141h0.C20142a<T> f51764r;

    /* renamed from: androidx.recyclerview.widget.e$a */
    public class C20119a implements C20141h0.C20143b<T> {
        public C20119a() {
        }

        /* renamed from: a */
        public void mo60293a(int i, int i2) {
            if (mo60296d(i)) {
                C20155i0.C20156a<T> e = C20118e.this.f51751e.mo60457e(i2);
                if (e == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("tile not found @");
                    sb.append(i2);
                    return;
                }
                C20118e.this.f51753g.mo60301d(e);
            }
        }

        /* renamed from: b */
        public void mo60294b(int i, C20155i0.C20156a<T> aVar) {
            if (!mo60296d(i)) {
                C20118e.this.f51753g.mo60301d(aVar);
                return;
            }
            C20155i0.C20156a<T> a = C20118e.this.f51751e.mo60453a(aVar);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("duplicate tile @");
                sb.append(a.f51886b);
                C20118e.this.f51753g.mo60301d(a);
            }
            int i2 = aVar.f51886b + aVar.f51887c;
            int i3 = 0;
            while (i3 < C20118e.this.f51762p.size()) {
                int keyAt = C20118e.this.f51762p.keyAt(i3);
                if (aVar.f51886b > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    C20118e.this.f51762p.removeAt(i3);
                    C20118e.this.f51750d.mo60317d(keyAt);
                }
            }
        }

        /* renamed from: c */
        public void mo60295c(int i, int i2) {
            if (mo60296d(i)) {
                C20118e eVar = C20118e.this;
                eVar.f51759m = i2;
                eVar.f51750d.mo60316c();
                C20118e eVar2 = C20118e.this;
                eVar2.f51760n = eVar2.f51761o;
                mo60297e();
                C20118e eVar3 = C20118e.this;
                eVar3.f51757k = false;
                eVar3.mo60292g();
            }
        }

        /* renamed from: d */
        public final boolean mo60296d(int i) {
            return i == C20118e.this.f51761o;
        }

        /* renamed from: e */
        public final void mo60297e() {
            for (int i = 0; i < C20118e.this.f51751e.mo60458f(); i++) {
                C20118e eVar = C20118e.this;
                eVar.f51753g.mo60301d(eVar.f51751e.mo60455c(i));
            }
            C20118e.this.f51751e.mo60454b();
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public class C20120b implements C20141h0.C20142a<T> {

        /* renamed from: a */
        public C20155i0.C20156a<T> f51766a;

        /* renamed from: b */
        public final SparseBooleanArray f51767b = new SparseBooleanArray();

        /* renamed from: c */
        public int f51768c;

        /* renamed from: d */
        public int f51769d;

        /* renamed from: e */
        public int f51770e;

        /* renamed from: f */
        public int f51771f;

        public C20120b() {
        }

        /* renamed from: a */
        public void mo60298a(int i, int i2, int i3, int i4, int i5) {
            if (i <= i2) {
                int h = mo60305h(i);
                int h2 = mo60305h(i2);
                this.f51770e = mo60305h(i3);
                int h3 = mo60305h(i4);
                this.f51771f = h3;
                if (i5 == 1) {
                    mo60309l(this.f51770e, h2, i5, true);
                    mo60309l(h2 + C20118e.this.f51748b, this.f51771f, i5, false);
                    return;
                }
                mo60309l(h, h3, i5, false);
                mo60309l(this.f51770e, h - C20118e.this.f51748b, i5, true);
            }
        }

        /* renamed from: b */
        public void mo60299b(int i, int i2) {
            if (!mo60306i(i)) {
                C20155i0.C20156a e = mo60302e();
                e.f51886b = i;
                int min = Math.min(C20118e.this.f51748b, this.f51769d - i);
                e.f51887c = min;
                C20118e.this.f51749c.mo60310a(e.f51885a, e.f51886b, min);
                mo60304g(i2);
                mo60303f(e);
            }
        }

        /* renamed from: c */
        public void mo60300c(int i) {
            this.f51768c = i;
            this.f51767b.clear();
            int d = C20118e.this.f51749c.mo60313d();
            this.f51769d = d;
            C20118e.this.f51752f.mo60295c(this.f51768c, d);
        }

        /* renamed from: d */
        public void mo60301d(C20155i0.C20156a<T> aVar) {
            C20118e.this.f51749c.mo60312c(aVar.f51885a, aVar.f51887c);
            aVar.f51888d = this.f51766a;
            this.f51766a = aVar;
        }

        /* renamed from: e */
        public final C20155i0.C20156a<T> mo60302e() {
            C20155i0.C20156a<T> aVar = this.f51766a;
            if (aVar != null) {
                this.f51766a = aVar.f51888d;
                return aVar;
            }
            C20118e eVar = C20118e.this;
            return new C20155i0.C20156a<>(eVar.f51747a, eVar.f51748b);
        }

        /* renamed from: f */
        public final void mo60303f(C20155i0.C20156a<T> aVar) {
            this.f51767b.put(aVar.f51886b, true);
            C20118e.this.f51752f.mo60294b(this.f51768c, aVar);
        }

        /* renamed from: g */
        public final void mo60304g(int i) {
            int b = C20118e.this.f51749c.mo60311b();
            while (this.f51767b.size() >= b) {
                int keyAt = this.f51767b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f51767b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f51770e - keyAt;
                int i3 = keyAt2 - this.f51771f;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    mo60308k(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 < i3 || i == 1) {
                        mo60308k(keyAt2);
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public final int mo60305h(int i) {
            return i - (i % C20118e.this.f51748b);
        }

        /* renamed from: i */
        public final boolean mo60306i(int i) {
            return this.f51767b.get(i);
        }

        /* renamed from: j */
        public final void mo60307j(String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("[BKGR] ");
            sb.append(String.format(str, objArr));
        }

        /* renamed from: k */
        public final void mo60308k(int i) {
            this.f51767b.delete(i);
            C20118e.this.f51752f.mo60293a(this.f51768c, i);
        }

        /* renamed from: l */
        public final void mo60309l(int i, int i2, int i3, boolean z) {
            int i4;
            int i5 = i;
            while (i5 <= i2) {
                if (z) {
                    i4 = (i2 + i) - i5;
                } else {
                    i4 = i5;
                }
                C20118e.this.f51753g.mo60299b(i4, i3);
                i5 += C20118e.this.f51748b;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    public static abstract class C20121c<T> {
        @C0348i1
        /* renamed from: a */
        public abstract void mo60310a(@C0359n0 T[] tArr, int i, int i2);

        @C0348i1
        /* renamed from: b */
        public int mo60311b() {
            return 10;
        }

        @C0348i1
        /* renamed from: c */
        public void mo60312c(@C0359n0 T[] tArr, int i) {
        }

        @C0348i1
        /* renamed from: d */
        public abstract int mo60313d();
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    public static abstract class C20122d {

        /* renamed from: a */
        public static final int f51773a = 0;

        /* renamed from: b */
        public static final int f51774b = 1;

        /* renamed from: c */
        public static final int f51775c = 2;

        @C0341g1
        /* renamed from: a */
        public void mo60314a(@C0359n0 int[] iArr, @C0359n0 int[] iArr2, int i) {
            int i2;
            int i3 = iArr[1];
            int i4 = iArr[0];
            int i5 = (i3 - i4) + 1;
            int i6 = i5 / 2;
            if (i == 1) {
                i2 = i5;
            } else {
                i2 = i6;
            }
            iArr2[0] = i4 - i2;
            if (i != 2) {
                i5 = i6;
            }
            iArr2[1] = i3 + i5;
        }

        @C0341g1
        /* renamed from: b */
        public abstract void mo60315b(@C0359n0 int[] iArr);

        @C0341g1
        /* renamed from: c */
        public abstract void mo60316c();

        @C0341g1
        /* renamed from: d */
        public abstract void mo60317d(int i);
    }

    public C20118e(@C0359n0 Class<T> cls, int i, @C0359n0 C20121c<T> cVar, @C0359n0 C20122d dVar) {
        C20119a aVar = new C20119a();
        this.f51763q = aVar;
        C20120b bVar = new C20120b();
        this.f51764r = bVar;
        this.f51747a = cls;
        this.f51748b = i;
        this.f51749c = cVar;
        this.f51750d = dVar;
        this.f51751e = new C20155i0<>(i);
        C20212v vVar = new C20212v();
        this.f51752f = vVar.mo60426b(aVar);
        this.f51753g = vVar.mo60425a(bVar);
        mo60291f();
    }

    @C0363p0
    /* renamed from: a */
    public T mo60286a(int i) {
        if (i < 0 || i >= this.f51759m) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f51759m);
        }
        T d = this.f51751e.mo60456d(i);
        if (d == null && !mo60288c()) {
            this.f51762p.put(i, 0);
        }
        return d;
    }

    /* renamed from: b */
    public int mo60287b() {
        return this.f51759m;
    }

    /* renamed from: c */
    public final boolean mo60288c() {
        return this.f51761o != this.f51760n;
    }

    /* renamed from: d */
    public void mo60289d(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[MAIN] ");
        sb.append(String.format(str, objArr));
    }

    /* renamed from: e */
    public void mo60290e() {
        if (!mo60288c()) {
            mo60292g();
            this.f51757k = true;
        }
    }

    /* renamed from: f */
    public void mo60291f() {
        this.f51762p.clear();
        C20141h0.C20142a<T> aVar = this.f51753g;
        int i = this.f51761o + 1;
        this.f51761o = i;
        aVar.mo60300c(i);
    }

    /* renamed from: g */
    public void mo60292g() {
        int i;
        this.f51750d.mo60315b(this.f51754h);
        int[] iArr = this.f51754h;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 <= i3 && i2 >= 0 && i3 < this.f51759m) {
            if (!this.f51757k) {
                this.f51758l = 0;
            } else {
                int[] iArr2 = this.f51755i;
                if (i2 > iArr2[1] || (i = iArr2[0]) > i3) {
                    this.f51758l = 0;
                } else if (i2 < i) {
                    this.f51758l = 1;
                } else if (i2 > i) {
                    this.f51758l = 2;
                }
            }
            int[] iArr3 = this.f51755i;
            iArr3[0] = i2;
            iArr3[1] = i3;
            this.f51750d.mo60314a(iArr, this.f51756j, this.f51758l);
            int[] iArr4 = this.f51756j;
            iArr4[0] = Math.min(this.f51754h[0], Math.max(iArr4[0], 0));
            int[] iArr5 = this.f51756j;
            iArr5[1] = Math.max(this.f51754h[1], Math.min(iArr5[1], this.f51759m - 1));
            C20141h0.C20142a<T> aVar = this.f51753g;
            int[] iArr6 = this.f51754h;
            int i4 = iArr6[0];
            int i5 = iArr6[1];
            int[] iArr7 = this.f51756j;
            aVar.mo60298a(i4, i5, iArr7[0], iArr7[1], this.f51758l);
        }
    }
}
