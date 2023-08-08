package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C18065l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: m1 */
    public static final boolean f51309m1 = false;

    /* renamed from: n1 */
    public static final String f51310n1 = "GridLayoutManager";

    /* renamed from: o1 */
    public static final int f51311o1 = -1;

    /* renamed from: d1 */
    public boolean f51312d1 = false;

    /* renamed from: e1 */
    public int f51313e1 = -1;

    /* renamed from: f1 */
    public int[] f51314f1;

    /* renamed from: g1 */
    public View[] f51315g1;

    /* renamed from: h1 */
    public final SparseIntArray f51316h1 = new SparseIntArray();

    /* renamed from: i1 */
    public final SparseIntArray f51317i1 = new SparseIntArray();

    /* renamed from: j1 */
    public C20044c f51318j1 = new C20042a();

    /* renamed from: k1 */
    public final Rect f51319k1 = new Rect();

    /* renamed from: l1 */
    public boolean f51320l1;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C20042a extends C20044c {
        /* renamed from: e */
        public int mo59351e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo59352f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C20044c {

        /* renamed from: a */
        public final SparseIntArray f51324a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f51325b = new SparseIntArray();

        /* renamed from: c */
        public boolean f51326c = false;

        /* renamed from: d */
        public boolean f51327d = false;

        /* renamed from: a */
        public static int m93129a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        public int mo59355b(int i, int i2) {
            if (!this.f51327d) {
                return mo59357d(i, i2);
            }
            int i3 = this.f51325b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo59357d(i, i2);
            this.f51325b.put(i, d);
            return d;
        }

        /* renamed from: c */
        public int mo59356c(int i, int i2) {
            if (!this.f51326c) {
                return mo59351e(i, i2);
            }
            int i3 = this.f51324a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo59351e(i, i2);
            this.f51324a.put(i, e);
            return e;
        }

        /* renamed from: d */
        public int mo59357d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.f51327d || (a = m93129a(this.f51325b, i)) == -1) {
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                i5 = this.f51325b.get(a);
                i4 = a + 1;
                i3 = mo59356c(a, i2) + mo59352f(a);
                if (i3 == i2) {
                    i5++;
                    i3 = 0;
                }
            }
            int f = mo59352f(i);
            while (i4 < i) {
                int f2 = mo59352f(i4);
                int i6 = i3 + f2;
                if (i6 == i2) {
                    i5++;
                    i6 = 0;
                } else if (i6 > i2) {
                    i5++;
                    i6 = f2;
                }
                i4++;
            }
            if (i3 + f > i2) {
                return i5 + 1;
            }
            return i5;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo59351e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo59352f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f51326c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f51324a
                int r2 = m93129a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f51324a
                int r3 = r3.get(r2)
                int r4 = r5.mo59352f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = r1
                r3 = r2
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.mo59352f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = r1
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C20044c.mo59351e(int, int):int");
        }

        /* renamed from: f */
        public abstract int mo59352f(int i);

        /* renamed from: g */
        public void mo59358g() {
            this.f51325b.clear();
        }

        /* renamed from: h */
        public void mo59359h() {
            this.f51324a.clear();
        }

        /* renamed from: i */
        public boolean mo59360i() {
            return this.f51327d;
        }

        /* renamed from: j */
        public boolean mo59361j() {
            return this.f51326c;
        }

        /* renamed from: k */
        public void mo59362k(boolean z) {
            if (!z) {
                this.f51325b.clear();
            }
            this.f51327d = z;
        }

        /* renamed from: l */
        public void mo59363l(boolean z) {
            if (!z) {
                this.f51325b.clear();
            }
            this.f51326c = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo59318M3(RecyclerView.C20076o.m93539v0(context, attributeSet, i, i2).f51591b);
    }

    /* renamed from: w3 */
    public static int[] m93074w3(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: A3 */
    public final void mo59301A3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, LinearLayoutManager.C20046a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int F3 = mo59310F3(wVar, b0Var, aVar.f51354b);
        if (z) {
            while (F3 > 0) {
                int i2 = aVar.f51354b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f51354b = i3;
                    F3 = mo59310F3(wVar, b0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int d = b0Var.mo59729d() - 1;
        int i4 = aVar.f51354b;
        while (i4 < d) {
            int i5 = i4 + 1;
            int F32 = mo59310F3(wVar, b0Var, i5);
            if (F32 <= F3) {
                break;
            }
            i4 = i5;
            F3 = F32;
        }
        aVar.f51354b = i4;
    }

    /* renamed from: B3 */
    public final void mo59302B3() {
        View[] viewArr = this.f51315g1;
        if (viewArr == null || viewArr.length != this.f51313e1) {
            this.f51315g1 = new View[this.f51313e1];
        }
    }

    /* renamed from: C */
    public int mo59303C(RecyclerView.C20055b0 b0Var) {
        if (this.f51320l1) {
            return mo59349y3(b0Var);
        }
        return super.mo59303C(b0Var);
    }

    /* renamed from: C3 */
    public int mo59304C3(int i, int i2) {
        if (this.f51334H0 != 1 || !mo59383Q2()) {
            int[] iArr = this.f51314f1;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f51314f1;
        int i3 = this.f51313e1;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: D */
    public int mo59305D(RecyclerView.C20055b0 b0Var) {
        if (this.f51320l1) {
            return mo59350z3(b0Var);
        }
        return super.mo59305D(b0Var);
    }

    /* renamed from: D3 */
    public int mo59306D3() {
        return this.f51313e1;
    }

    /* renamed from: E3 */
    public final int mo59307E3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, int i) {
        if (!b0Var.mo59735j()) {
            return this.f51318j1.mo59355b(i, this.f51313e1);
        }
        int g = wVar.mo60040g(i);
        if (g != -1) {
            return this.f51318j1.mo59355b(g, this.f51313e1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        return 0;
    }

    /* renamed from: F */
    public int mo59308F(RecyclerView.C20055b0 b0Var) {
        if (this.f51320l1) {
            return mo59349y3(b0Var);
        }
        return super.mo59308F(b0Var);
    }

    /* renamed from: F2 */
    public View mo59309F2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int Y = mo59922Y();
        int i3 = 1;
        if (z2) {
            i2 = mo59922Y() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = Y;
            i2 = 0;
        }
        int d = b0Var.mo59729d();
        mo59422r2();
        int n = this.f51336J0.mo60705n();
        int i4 = this.f51336J0.mo60700i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View X = mo59919X(i2);
            int u0 = mo59978u0(X);
            if (u0 >= 0 && u0 < d && mo59310F3(wVar, b0Var, u0) == 0) {
                if (((RecyclerView.C20081p) X.getLayoutParams()).mo59998g()) {
                    if (view2 == null) {
                        view2 = X;
                    }
                } else if (this.f51336J0.mo60698g(X) < i4 && this.f51336J0.mo60695d(X) >= n) {
                    return X;
                } else {
                    if (view == null) {
                        view = X;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: F3 */
    public final int mo59310F3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, int i) {
        if (!b0Var.mo59735j()) {
            return this.f51318j1.mo59356c(i, this.f51313e1);
        }
        int i2 = this.f51317i1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.mo60040g(i);
        if (g != -1) {
            return this.f51318j1.mo59356c(g, this.f51313e1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 0;
    }

    /* renamed from: G */
    public int mo59311G(RecyclerView.C20055b0 b0Var) {
        if (this.f51320l1) {
            return mo59350z3(b0Var);
        }
        return super.mo59311G(b0Var);
    }

    /* renamed from: G3 */
    public final int mo59312G3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, int i) {
        if (!b0Var.mo59735j()) {
            return this.f51318j1.mo59352f(i);
        }
        int i2 = this.f51316h1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.mo60040g(i);
        if (g != -1) {
            return this.f51318j1.mo59352f(g);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 1;
    }

    /* renamed from: H3 */
    public C20044c mo59313H3() {
        return this.f51318j1;
    }

    /* renamed from: I3 */
    public final void mo59314I3(float f, int i) {
        mo59345v3(Math.max(Math.round(f * ((float) this.f51313e1)), i));
    }

    /* renamed from: J3 */
    public boolean mo59315J3() {
        return this.f51320l1;
    }

    /* renamed from: K3 */
    public final void mo59316K3(View view, int i, boolean z) {
        int i2;
        int i3;
        C20043b bVar = (C20043b) view.getLayoutParams();
        Rect rect = bVar.f51595b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int C3 = mo59304C3(bVar.f51322e, bVar.f51323f);
        if (this.f51334H0 == 1) {
            i2 = RecyclerView.C20076o.m93537Z(C3, i, i5, bVar.width, false);
            i3 = RecyclerView.C20076o.m93537Z(this.f51336J0.mo60706o(), mo59960n0(), i4, bVar.height, true);
        } else {
            int Z = RecyclerView.C20076o.m93537Z(C3, i, i4, bVar.height, false);
            int Z2 = RecyclerView.C20076o.m93537Z(this.f51336J0.mo60706o(), mo59870C0(), i5, bVar.width, true);
            i3 = Z;
            i2 = Z2;
        }
        mo59317L3(view, i2, i3, z);
    }

    /* renamed from: L3 */
    public final void mo59317L3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
        if (z) {
            z2 = mo59936e2(view, i, i2, pVar);
        } else {
            z2 = mo59933c2(view, i, i2, pVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: M3 */
    public void mo59318M3(int i) {
        if (i != this.f51313e1) {
            this.f51312d1 = true;
            if (i >= 1) {
                this.f51313e1 = i;
                this.f51318j1.mo59359h();
                mo59898N1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: N3 */
    public void mo59319N3(C20044c cVar) {
        this.f51318j1 = cVar;
    }

    /* renamed from: O3 */
    public void mo59320O3(boolean z) {
        this.f51320l1 = z;
    }

    /* renamed from: P3 */
    public final void mo59321P3() {
        int i;
        int i2;
        if (mo59379M2() == 1) {
            i2 = mo59868B0() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = mo59958m0() - getPaddingBottom();
            i = getPaddingTop();
        }
        mo59345v3(i2 - i);
    }

    /* renamed from: Q1 */
    public int mo59322Q1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        mo59321P3();
        mo59302B3();
        return super.mo59322Q1(i, wVar, b0Var);
    }

    /* renamed from: S */
    public RecyclerView.C20081p mo59323S() {
        if (this.f51334H0 == 0) {
            return new C20043b(-2, -1);
        }
        return new C20043b(-1, -2);
    }

    /* renamed from: S1 */
    public int mo59324S1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        mo59321P3();
        mo59302B3();
        return super.mo59324S1(i, wVar, b0Var);
    }

    /* renamed from: S2 */
    public void mo59325S2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, LinearLayoutManager.C20048c cVar, LinearLayoutManager.C20047b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View e;
        RecyclerView.C20089w wVar2 = wVar;
        RecyclerView.C20055b0 b0Var2 = b0Var;
        LinearLayoutManager.C20048c cVar2 = cVar;
        LinearLayoutManager.C20047b bVar2 = bVar;
        int m = this.f51336J0.mo60704m();
        if (m != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mo59922Y() > 0) {
            i = this.f51314f1[this.f51313e1];
        } else {
            i = 0;
        }
        if (z) {
            mo59321P3();
        }
        if (cVar2.f51373e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i15 = this.f51313e1;
        if (!z2) {
            i15 = mo59310F3(wVar2, b0Var2, cVar2.f51372d) + mo59312G3(wVar2, b0Var2, cVar2.f51372d);
        }
        int i16 = 0;
        while (i16 < this.f51313e1 && cVar2.mo59455c(b0Var2) && i15 > 0) {
            int i17 = cVar2.f51372d;
            int G3 = mo59312G3(wVar2, b0Var2, i17);
            if (G3 <= this.f51313e1) {
                i15 -= G3;
                if (i15 < 0 || (e = cVar2.mo59457e(wVar2)) == null) {
                    break;
                }
                this.f51315g1[i16] = e;
                i16++;
            } else {
                throw new IllegalArgumentException("Item at position " + i17 + " requires " + G3 + " spans but GridLayoutManager has only " + this.f51313e1 + " spans.");
            }
        }
        if (i16 == 0) {
            bVar2.f51359b = true;
            return;
        }
        mo59343t3(wVar2, b0Var2, i16, z2);
        float f = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            View view = this.f51315g1[i19];
            if (cVar2.f51380l == null) {
                if (z2) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z2) {
                mo59957m(view);
            } else {
                mo59959n(view, 0);
            }
            mo59977u(view, this.f51319k1);
            mo59316K3(view, m, false);
            int e2 = this.f51336J0.mo60696e(view);
            if (e2 > i18) {
                i18 = e2;
            }
            float f2 = (((float) this.f51336J0.mo60697f(view)) * 1.0f) / ((float) ((C20043b) view.getLayoutParams()).f51323f);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            mo59314I3(f, i);
            i18 = 0;
            for (int i20 = 0; i20 < i16; i20++) {
                View view2 = this.f51315g1[i20];
                mo59316K3(view2, 1073741824, true);
                int e3 = this.f51336J0.mo60696e(view2);
                if (e3 > i18) {
                    i18 = e3;
                }
            }
        }
        for (int i21 = 0; i21 < i16; i21++) {
            View view3 = this.f51315g1[i21];
            if (this.f51336J0.mo60696e(view3) != i18) {
                C20043b bVar3 = (C20043b) view3.getLayoutParams();
                Rect rect = bVar3.f51595b;
                int i22 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i23 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int C3 = mo59304C3(bVar3.f51322e, bVar3.f51323f);
                if (this.f51334H0 == 1) {
                    i14 = RecyclerView.C20076o.m93537Z(C3, 1073741824, i23, bVar3.width, false);
                    i13 = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    i13 = RecyclerView.C20076o.m93537Z(C3, 1073741824, i22, bVar3.height, false);
                    i14 = makeMeasureSpec;
                }
                mo59317L3(view3, i14, i13, true);
            }
        }
        bVar2.f51358a = i18;
        if (this.f51334H0 == 1) {
            if (cVar2.f51374f == -1) {
                i5 = cVar2.f51370b;
                i12 = i5 - i18;
            } else {
                i12 = cVar2.f51370b;
                i5 = i12 + i18;
            }
            i2 = i12;
            i4 = 0;
            i3 = 0;
        } else {
            if (cVar2.f51374f == -1) {
                i11 = cVar2.f51370b;
                i10 = i11 - i18;
            } else {
                i10 = cVar2.f51370b;
                i11 = i10 + i18;
            }
            i3 = i10;
            i2 = 0;
            i4 = i11;
            i5 = 0;
        }
        int i24 = 0;
        while (i24 < i16) {
            View view4 = this.f51315g1[i24];
            C20043b bVar4 = (C20043b) view4.getLayoutParams();
            if (this.f51334H0 == 1) {
                if (mo59383Q2()) {
                    int paddingLeft = getPaddingLeft() + this.f51314f1[this.f51313e1 - bVar4.f51322e];
                    i9 = i5;
                    i8 = paddingLeft;
                    i7 = paddingLeft - this.f51336J0.mo60697f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f51314f1[bVar4.f51322e];
                    i9 = i5;
                    i7 = paddingLeft2;
                    i8 = this.f51336J0.mo60697f(view4) + paddingLeft2;
                }
                i6 = i2;
            } else {
                int paddingTop = getPaddingTop() + this.f51314f1[bVar4.f51322e];
                i6 = paddingTop;
                i8 = i4;
                i7 = i3;
                i9 = this.f51336J0.mo60697f(view4) + paddingTop;
            }
            mo59907R0(view4, i7, i6, i8, i9);
            if (bVar4.mo59998g() || bVar4.mo59997f()) {
                bVar2.f51360c = true;
            }
            bVar2.f51361d |= view4.hasFocusable();
            i24++;
            i5 = i9;
            i4 = i8;
            i3 = i7;
            i2 = i6;
        }
        Arrays.fill(this.f51315g1, (Object) null);
    }

    /* renamed from: T */
    public RecyclerView.C20081p mo59326T(Context context, AttributeSet attributeSet) {
        return new C20043b(context, attributeSet);
    }

    /* renamed from: U */
    public RecyclerView.C20081p mo59327U(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C20043b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C20043b(layoutParams);
    }

    /* renamed from: V2 */
    public void mo59328V2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, LinearLayoutManager.C20046a aVar, int i) {
        super.mo59328V2(wVar, b0Var, aVar, i);
        mo59321P3();
        if (b0Var.mo59729d() > 0 && !b0Var.mo59735j()) {
            mo59301A3(wVar, b0Var, aVar, i);
        }
        mo59302B3();
    }

    /* renamed from: Y1 */
    public void mo59329Y1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f51314f1 == null) {
            super.mo59329Y1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f51334H0 == 1) {
            i4 = RecyclerView.C20076o.m93540y(i2, rect.height() + paddingTop, mo59972s0());
            int[] iArr = this.f51314f1;
            i3 = RecyclerView.C20076o.m93540y(i, iArr[iArr.length - 1] + paddingLeft, mo59975t0());
        } else {
            i3 = RecyclerView.C20076o.m93540y(i, rect.width() + paddingLeft, mo59975t0());
            int[] iArr2 = this.f51314f1;
            i4 = RecyclerView.C20076o.m93540y(i2, iArr2[iArr2.length - 1] + paddingTop, mo59972s0());
        }
        mo59921X1(i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == r7) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo59330c1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C20089w r26, androidx.recyclerview.widget.RecyclerView.C20055b0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo59905Q(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C20043b) r5
            int r6 = r5.f51322e
            int r5 = r5.f51323f
            int r5 = r5 + r6
            android.view.View r7 = super.mo59330c1(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo59417p2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f51339M0
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo59922Y()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo59922Y()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f51334H0
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo59383Q2()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo59307E3(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.mo59307E3(r1, r2, r10)
            android.view.View r1 = r0.mo59919X(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C20043b) r9
            int r2 = r9.f51322e
            r18 = r3
            int r3 = r9.f51323f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo59903P0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f51322e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f51322e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo59330c1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    /* renamed from: d0 */
    public int mo59331d0(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (this.f51334H0 == 1) {
            return this.f51313e1;
        }
        if (b0Var.mo59729d() < 1) {
            return 0;
        }
        return mo59307E3(wVar, b0Var, b0Var.mo59729d() - 1) + 1;
    }

    /* renamed from: i1 */
    public void mo59332i1(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, View view, C18065l0 l0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C20043b)) {
            super.mo59949h1(view, l0Var);
            return;
        }
        C20043b bVar = (C20043b) layoutParams;
        int E3 = mo59307E3(wVar, b0Var, bVar.mo59995d());
        if (this.f51334H0 == 0) {
            l0Var.mo52604c1(C18065l0.C18069d.m82106h(bVar.mo59353j(), bVar.mo59354k(), E3, 1, false, false));
            return;
        }
        l0Var.mo52604c1(C18065l0.C18069d.m82106h(E3, 1, bVar.mo59353j(), bVar.mo59354k(), false, false));
    }

    /* renamed from: j2 */
    public boolean mo59333j2() {
        return this.f51345S0 == null && !this.f51312d1;
    }

    /* renamed from: j3 */
    public void mo59334j3(boolean z) {
        if (!z) {
            super.mo59334j3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: k1 */
    public void mo59335k1(RecyclerView recyclerView, int i, int i2) {
        this.f51318j1.mo59359h();
        this.f51318j1.mo59358g();
    }

    /* renamed from: l1 */
    public void mo59336l1(RecyclerView recyclerView) {
        this.f51318j1.mo59359h();
        this.f51318j1.mo59358g();
    }

    /* renamed from: l2 */
    public void mo59337l2(RecyclerView.C20055b0 b0Var, LinearLayoutManager.C20048c cVar, RecyclerView.C20076o.C20079c cVar2) {
        int i = this.f51313e1;
        for (int i2 = 0; i2 < this.f51313e1 && cVar.mo59455c(b0Var) && i > 0; i2++) {
            int i3 = cVar.f51372d;
            cVar2.mo59991a(i3, Math.max(0, cVar.f51375g));
            i -= this.f51318j1.mo59352f(i3);
            cVar.f51372d += cVar.f51373e;
        }
    }

    /* renamed from: m1 */
    public void mo59338m1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f51318j1.mo59359h();
        this.f51318j1.mo59358g();
    }

    /* renamed from: n1 */
    public void mo59339n1(RecyclerView recyclerView, int i, int i2) {
        this.f51318j1.mo59359h();
        this.f51318j1.mo59358g();
    }

    /* renamed from: p1 */
    public void mo59340p1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f51318j1.mo59359h();
        this.f51318j1.mo59358g();
    }

    /* renamed from: q1 */
    public void mo59341q1(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (b0Var.mo59735j()) {
            mo59344u3();
        }
        super.mo59341q1(wVar, b0Var);
        mo59348x3();
    }

    /* renamed from: r1 */
    public void mo59342r1(RecyclerView.C20055b0 b0Var) {
        super.mo59342r1(b0Var);
        this.f51312d1 = false;
    }

    /* renamed from: t3 */
    public final void mo59343t3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i2 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
            i4 = -1;
        }
        while (i3 != i2) {
            View view = this.f51315g1[i3];
            C20043b bVar = (C20043b) view.getLayoutParams();
            int G3 = mo59312G3(wVar, b0Var, mo59978u0(view));
            bVar.f51323f = G3;
            bVar.f51322e = i5;
            i5 += G3;
            i3 += i4;
        }
    }

    /* renamed from: u3 */
    public final void mo59344u3() {
        int Y = mo59922Y();
        for (int i = 0; i < Y; i++) {
            C20043b bVar = (C20043b) mo59919X(i).getLayoutParams();
            int d = bVar.mo59995d();
            this.f51316h1.put(d, bVar.mo59354k());
            this.f51317i1.put(d, bVar.mo59353j());
        }
    }

    /* renamed from: v3 */
    public final void mo59345v3(int i) {
        this.f51314f1 = m93074w3(this.f51314f1, this.f51313e1, i);
    }

    /* renamed from: x */
    public boolean mo59346x(RecyclerView.C20081p pVar) {
        return pVar instanceof C20043b;
    }

    /* renamed from: x0 */
    public int mo59347x0(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (this.f51334H0 == 0) {
            return this.f51313e1;
        }
        if (b0Var.mo59729d() < 1) {
            return 0;
        }
        return mo59307E3(wVar, b0Var, b0Var.mo59729d() - 1) + 1;
    }

    /* renamed from: x3 */
    public final void mo59348x3() {
        this.f51316h1.clear();
        this.f51317i1.clear();
    }

    /* renamed from: y3 */
    public final int mo59349y3(RecyclerView.C20055b0 b0Var) {
        int i;
        if (!(mo59922Y() == 0 || b0Var.mo59729d() == 0)) {
            mo59422r2();
            boolean R2 = mo59386R2();
            View w2 = mo59433w2(!R2, true);
            View v2 = mo59430v2(!R2, true);
            if (!(w2 == null || v2 == null)) {
                int b = this.f51318j1.mo59355b(mo59978u0(w2), this.f51313e1);
                int b2 = this.f51318j1.mo59355b(mo59978u0(v2), this.f51313e1);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f51318j1.mo59355b(b0Var.mo59729d() - 1, this.f51313e1) + 1;
                if (this.f51339M0) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!R2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f51336J0.mo60695d(v2) - this.f51336J0.mo60698g(w2))) / ((float) ((this.f51318j1.mo59355b(mo59978u0(v2), this.f51313e1) - this.f51318j1.mo59355b(mo59978u0(w2), this.f51313e1)) + 1)))) + ((float) (this.f51336J0.mo60705n() - this.f51336J0.mo60698g(w2))));
            }
        }
        return 0;
    }

    /* renamed from: z3 */
    public final int mo59350z3(RecyclerView.C20055b0 b0Var) {
        if (!(mo59922Y() == 0 || b0Var.mo59729d() == 0)) {
            mo59422r2();
            View w2 = mo59433w2(!mo59386R2(), true);
            View v2 = mo59430v2(!mo59386R2(), true);
            if (!(w2 == null || v2 == null)) {
                if (!mo59386R2()) {
                    return this.f51318j1.mo59355b(b0Var.mo59729d() - 1, this.f51313e1) + 1;
                }
                int d = this.f51336J0.mo60695d(v2) - this.f51336J0.mo60698g(w2);
                int b = this.f51318j1.mo59355b(mo59978u0(w2), this.f51313e1);
                return (int) ((((float) d) / ((float) ((this.f51318j1.mo59355b(mo59978u0(v2), this.f51313e1) - b) + 1))) * ((float) (this.f51318j1.mo59355b(b0Var.mo59729d() - 1, this.f51313e1) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C20043b extends RecyclerView.C20081p {

        /* renamed from: g */
        public static final int f51321g = -1;

        /* renamed from: e */
        public int f51322e = -1;

        /* renamed from: f */
        public int f51323f = 0;

        public C20043b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: j */
        public int mo59353j() {
            return this.f51322e;
        }

        /* renamed from: k */
        public int mo59354k() {
            return this.f51323f;
        }

        public C20043b(int i, int i2) {
            super(i, i2);
        }

        public C20043b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C20043b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C20043b(RecyclerView.C20081p pVar) {
            super(pVar);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo59318M3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo59318M3(i);
    }
}
