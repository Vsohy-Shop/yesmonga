package androidx.compose.runtime.snapshots;

import kotlin.collections.C10956m;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.snapshots.k */
public final class C8658k {

    /* renamed from: a */
    public int f23212a;
    @C12579k

    /* renamed from: b */
    public int[] f23213b = new int[16];
    @C12579k

    /* renamed from: c */
    public int[] f23214c = new int[16];
    @C12579k

    /* renamed from: d */
    public int[] f23215d;

    /* renamed from: e */
    public int f23216e;

    public C8658k() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f23215d = iArr;
    }

    /* renamed from: g */
    public static /* synthetic */ int m31787g(C8658k kVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return kVar.mo16646f(i);
    }

    /* renamed from: a */
    public final int mo16641a(int i) {
        mo16643c(this.f23212a + 1);
        int i2 = this.f23212a;
        this.f23212a = i2 + 1;
        int b = mo16642b();
        this.f23213b[i2] = i;
        this.f23214c[i2] = b;
        this.f23215d[b] = i2;
        mo16649j(i2);
        return b;
    }

    /* renamed from: b */
    public final int mo16642b() {
        int length = this.f23215d.length;
        if (this.f23216e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            C10956m.m41225j1(this.f23215d, iArr, 0, 0, 0, 14, (Object) null);
            this.f23215d = iArr;
        }
        int i4 = this.f23216e;
        this.f23216e = this.f23215d[i4];
        return i4;
    }

    /* renamed from: c */
    public final void mo16643c(int i) {
        int[] iArr = this.f23213b;
        int length = iArr.length;
        if (i > length) {
            int i2 = length * 2;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            C10956m.m41225j1(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            C10956m.m41225j1(this.f23214c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f23213b = iArr2;
            this.f23214c = iArr3;
        }
    }

    /* renamed from: d */
    public final void mo16644d(int i) {
        this.f23215d[i] = this.f23216e;
        this.f23216e = i;
    }

    /* renamed from: e */
    public final int mo16645e() {
        return this.f23212a;
    }

    /* renamed from: f */
    public final int mo16646f(int i) {
        return this.f23212a > 0 ? this.f23213b[0] : i;
    }

    /* renamed from: h */
    public final void mo16647h(int i) {
        int i2 = this.f23215d[i];
        mo16650k(i2, this.f23212a - 1);
        this.f23212a--;
        mo16649j(i2);
        mo16648i(i2);
        mo16644d(i);
    }

    /* renamed from: i */
    public final void mo16648i(int i) {
        int i2;
        int[] iArr = this.f23213b;
        int i3 = this.f23212a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.f23212a || (i2 = iArr[i4]) >= iArr[i5]) {
                if (iArr[i5] < iArr[i]) {
                    mo16650k(i5, i);
                    i = i5;
                } else {
                    return;
                }
            } else if (i2 < iArr[i]) {
                mo16650k(i4, i);
                i = i4;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo16649j(int i) {
        int[] iArr = this.f23213b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] > i2) {
                mo16650k(i3, i);
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo16650k(int i, int i2) {
        int[] iArr = this.f23213b;
        int[] iArr2 = this.f23214c;
        int[] iArr3 = this.f23215d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    /* renamed from: l */
    public final void mo16651l() {
        int i = this.f23212a;
        int i2 = 1;
        while (i2 < i) {
            int i3 = i2 + 1;
            int[] iArr = this.f23213b;
            if (iArr[(i3 >> 1) - 1] <= iArr[i2]) {
                i2 = i3;
            } else {
                throw new IllegalStateException(("Index " + i2 + " is out of place").toString());
            }
        }
    }

    /* renamed from: m */
    public final void mo16652m(int i, int i2) {
        int i3 = this.f23215d[i];
        if (this.f23214c[i3] != i) {
            throw new IllegalStateException(("Index for handle " + i + " is corrupted").toString());
        } else if (this.f23213b[i3] != i2) {
            throw new IllegalStateException(("Value for handle " + i + " was " + this.f23213b[i3] + " but was supposed to be " + i2).toString());
        }
    }
}
