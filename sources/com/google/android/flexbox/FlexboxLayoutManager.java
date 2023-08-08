package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.C20207r;
import androidx.recyclerview.widget.C20224y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C40344h;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

public class FlexboxLayoutManager extends RecyclerView.C20076o implements C40340d, RecyclerView.C20051a0.C20053b {

    /* renamed from: h1 */
    public static final String f102734h1 = "FlexboxLayoutManager";

    /* renamed from: i1 */
    public static final Rect f102735i1 = new Rect();

    /* renamed from: j1 */
    public static final boolean f102736j1 = false;

    /* renamed from: k1 */
    public static final /* synthetic */ boolean f102737k1 = false;

    /* renamed from: H0 */
    public int f102738H0;

    /* renamed from: I0 */
    public int f102739I0;

    /* renamed from: J0 */
    public int f102740J0;

    /* renamed from: K0 */
    public int f102741K0;

    /* renamed from: L0 */
    public int f102742L0;

    /* renamed from: M0 */
    public boolean f102743M0;

    /* renamed from: N0 */
    public boolean f102744N0;

    /* renamed from: O0 */
    public List<C40342f> f102745O0;

    /* renamed from: P0 */
    public final C40344h f102746P0;

    /* renamed from: Q0 */
    public RecyclerView.C20089w f102747Q0;

    /* renamed from: R0 */
    public RecyclerView.C20055b0 f102748R0;

    /* renamed from: S0 */
    public C40336c f102749S0;

    /* renamed from: T0 */
    public C40335b f102750T0;

    /* renamed from: U0 */
    public C20224y f102751U0;

    /* renamed from: V0 */
    public C20224y f102752V0;

    /* renamed from: W0 */
    public SavedState f102753W0;

    /* renamed from: X0 */
    public int f102754X0;

    /* renamed from: Y0 */
    public int f102755Y0;

    /* renamed from: Z0 */
    public int f102756Z0;

    /* renamed from: a1 */
    public int f102757a1;

    /* renamed from: b1 */
    public boolean f102758b1;

    /* renamed from: c1 */
    public SparseArray<View> f102759c1;

    /* renamed from: d1 */
    public final Context f102760d1;

    /* renamed from: e1 */
    public View f102761e1;

    /* renamed from: f1 */
    public int f102762f1;

    /* renamed from: g1 */
    public C40344h.C40346b f102763g1;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public class C40335b {

        /* renamed from: i */
        public static final /* synthetic */ boolean f102775i = false;

        /* renamed from: a */
        public int f102776a;

        /* renamed from: b */
        public int f102777b;

        /* renamed from: c */
        public int f102778c;

        /* renamed from: d */
        public int f102779d;

        /* renamed from: e */
        public boolean f102780e;

        /* renamed from: f */
        public boolean f102781f;

        /* renamed from: g */
        public boolean f102782g;

        public C40335b() {
            this.f102779d = 0;
        }

        /* renamed from: l */
        public static /* synthetic */ int m164074l(C40335b bVar, int i) {
            int i2 = bVar.f102779d + i;
            bVar.f102779d = i2;
            return i2;
        }

        /* renamed from: r */
        public final void mo133153r() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo133051l() || !FlexboxLayoutManager.this.f102743M0) {
                if (this.f102780e) {
                    i = FlexboxLayoutManager.this.f102751U0.mo60700i();
                } else {
                    i = FlexboxLayoutManager.this.f102751U0.mo60705n();
                }
                this.f102778c = i;
                return;
            }
            if (this.f102780e) {
                i2 = FlexboxLayoutManager.this.f102751U0.mo60700i();
            } else {
                i2 = FlexboxLayoutManager.this.mo59868B0() - FlexboxLayoutManager.this.f102751U0.mo60705n();
            }
            this.f102778c = i2;
        }

        /* renamed from: s */
        public final void mo133154s(View view) {
            C20224y yVar;
            if (FlexboxLayoutManager.this.f102739I0 == 0) {
                yVar = FlexboxLayoutManager.this.f102752V0;
            } else {
                yVar = FlexboxLayoutManager.this.f102751U0;
            }
            if (FlexboxLayoutManager.this.mo133051l() || !FlexboxLayoutManager.this.f102743M0) {
                if (this.f102780e) {
                    this.f102778c = yVar.mo60695d(view) + yVar.mo60707p();
                } else {
                    this.f102778c = yVar.mo60698g(view);
                }
            } else if (this.f102780e) {
                this.f102778c = yVar.mo60698g(view) + yVar.mo60707p();
            } else {
                this.f102778c = yVar.mo60695d(view);
            }
            this.f102776a = FlexboxLayoutManager.this.mo59978u0(view);
            int i = 0;
            this.f102782g = false;
            int[] iArr = FlexboxLayoutManager.this.f102746P0.f102846c;
            int i2 = this.f102776a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f102777b = i;
            if (FlexboxLayoutManager.this.f102745O0.size() > this.f102777b) {
                this.f102776a = ((C40342f) FlexboxLayoutManager.this.f102745O0.get(this.f102777b)).f102834o;
            }
        }

        /* renamed from: t */
        public final void mo133155t() {
            this.f102776a = -1;
            this.f102777b = -1;
            this.f102778c = Integer.MIN_VALUE;
            boolean z = false;
            this.f102781f = false;
            this.f102782g = false;
            if (FlexboxLayoutManager.this.mo133051l()) {
                if (FlexboxLayoutManager.this.f102739I0 == 0) {
                    if (FlexboxLayoutManager.this.f102738H0 == 1) {
                        z = true;
                    }
                    this.f102780e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f102739I0 == 2) {
                    z = true;
                }
                this.f102780e = z;
            } else if (FlexboxLayoutManager.this.f102739I0 == 0) {
                if (FlexboxLayoutManager.this.f102738H0 == 3) {
                    z = true;
                }
                this.f102780e = z;
            } else {
                if (FlexboxLayoutManager.this.f102739I0 == 2) {
                    z = true;
                }
                this.f102780e = z;
            }
        }

        @C0359n0
        public String toString() {
            return "AnchorInfo{mPosition=" + this.f102776a + ", mFlexLinePosition=" + this.f102777b + ", mCoordinate=" + this.f102778c + ", mPerpendicularCoordinate=" + this.f102779d + ", mLayoutFromEnd=" + this.f102780e + ", mValid=" + this.f102781f + ", mAssignedFromSavedState=" + this.f102782g + C12361b.f30259j;
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    public static class C40336c {

        /* renamed from: k */
        public static final int f102784k = Integer.MIN_VALUE;

        /* renamed from: l */
        public static final int f102785l = -1;

        /* renamed from: m */
        public static final int f102786m = 1;

        /* renamed from: n */
        public static final int f102787n = 1;

        /* renamed from: a */
        public int f102788a;

        /* renamed from: b */
        public boolean f102789b;

        /* renamed from: c */
        public int f102790c;

        /* renamed from: d */
        public int f102791d;

        /* renamed from: e */
        public int f102792e;

        /* renamed from: f */
        public int f102793f;

        /* renamed from: g */
        public int f102794g;

        /* renamed from: h */
        public int f102795h;

        /* renamed from: i */
        public int f102796i;

        /* renamed from: j */
        public boolean f102797j;

        public C40336c() {
            this.f102795h = 1;
            this.f102796i = 1;
        }

        /* renamed from: c */
        public static /* synthetic */ int m164088c(C40336c cVar, int i) {
            int i2 = cVar.f102792e + i;
            cVar.f102792e = i2;
            return i2;
        }

        /* renamed from: d */
        public static /* synthetic */ int m164089d(C40336c cVar, int i) {
            int i2 = cVar.f102792e - i;
            cVar.f102792e = i2;
            return i2;
        }

        /* renamed from: i */
        public static /* synthetic */ int m164094i(C40336c cVar, int i) {
            int i2 = cVar.f102788a - i;
            cVar.f102788a = i2;
            return i2;
        }

        /* renamed from: l */
        public static /* synthetic */ int m164097l(C40336c cVar) {
            int i = cVar.f102790c;
            cVar.f102790c = i + 1;
            return i;
        }

        /* renamed from: m */
        public static /* synthetic */ int m164098m(C40336c cVar) {
            int i = cVar.f102790c;
            cVar.f102790c = i - 1;
            return i;
        }

        /* renamed from: n */
        public static /* synthetic */ int m164099n(C40336c cVar, int i) {
            int i2 = cVar.f102790c + i;
            cVar.f102790c = i2;
            return i2;
        }

        /* renamed from: q */
        public static /* synthetic */ int m164102q(C40336c cVar, int i) {
            int i2 = cVar.f102793f + i;
            cVar.f102793f = i2;
            return i2;
        }

        /* renamed from: u */
        public static /* synthetic */ int m164106u(C40336c cVar, int i) {
            int i2 = cVar.f102791d + i;
            cVar.f102791d = i2;
            return i2;
        }

        /* renamed from: v */
        public static /* synthetic */ int m164107v(C40336c cVar, int i) {
            int i2 = cVar.f102791d - i;
            cVar.f102791d = i2;
            return i2;
        }

        /* renamed from: D */
        public final boolean mo133157D(RecyclerView.C20055b0 b0Var, List<C40342f> list) {
            int i;
            int i2 = this.f102791d;
            if (i2 < 0 || i2 >= b0Var.mo59729d() || (i = this.f102790c) < 0 || i >= list.size()) {
                return false;
            }
            return true;
        }

        @C0359n0
        public String toString() {
            return "LayoutState{mAvailable=" + this.f102788a + ", mFlexLinePosition=" + this.f102790c + ", mPosition=" + this.f102791d + ", mOffset=" + this.f102792e + ", mScrollingOffset=" + this.f102793f + ", mLastScrollDelta=" + this.f102794g + ", mItemDirection=" + this.f102795h + ", mLayoutDirection=" + this.f102796i + C12361b.f30259j;
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: N0 */
    public static boolean m163928N0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c2 */
    private boolean m163929c2(View view, int i, int i2, RecyclerView.C20081p pVar) {
        if (view.isLayoutRequested() || !mo59895M0() || !m163928N0(view.getWidth(), i, pVar.width) || !m163928N0(view.getHeight(), i2, pVar.height)) {
            return true;
        }
        return false;
    }

    /* renamed from: A2 */
    public int mo133088A2() {
        View I2 = mo133096I2(0, mo59922Y(), true);
        if (I2 == null) {
            return -1;
        }
        return mo59978u0(I2);
    }

    /* renamed from: B */
    public int mo59366B(@C0359n0 RecyclerView.C20055b0 b0Var) {
        return mo133132u2(b0Var);
    }

    /* renamed from: B2 */
    public final View mo133089B2(int i) {
        int i2;
        View J2 = mo133097J2(0, mo59922Y(), i);
        if (J2 == null || (i2 = this.f102746P0.f102846c[mo59978u0(J2)]) == -1) {
            return null;
        }
        return mo133090C2(J2, this.f102745O0.get(i2));
    }

    /* renamed from: C */
    public int mo59303C(@C0359n0 RecyclerView.C20055b0 b0Var) {
        return mo133133v2(b0Var);
    }

    /* renamed from: C2 */
    public final View mo133090C2(View view, C40342f fVar) {
        boolean l = mo133051l();
        int i = fVar.f102827h;
        for (int i2 = 1; i2 < i; i2++) {
            View X = mo59919X(i2);
            if (!(X == null || X.getVisibility() == 8)) {
                if (!this.f102743M0 || l) {
                    if (this.f102751U0.mo60698g(view) <= this.f102751U0.mo60698g(X)) {
                    }
                } else if (this.f102751U0.mo60695d(view) >= this.f102751U0.mo60695d(X)) {
                }
                view = X;
            }
        }
        return view;
    }

    /* renamed from: D */
    public int mo59305D(@C0359n0 RecyclerView.C20055b0 b0Var) {
        return mo133134w2(b0Var);
    }

    /* renamed from: D2 */
    public int mo133091D2() {
        View I2 = mo133096I2(0, mo59922Y(), false);
        if (I2 == null) {
            return -1;
        }
        return mo59978u0(I2);
    }

    /* renamed from: E */
    public int mo59370E(@C0359n0 RecyclerView.C20055b0 b0Var) {
        return mo133132u2(b0Var);
    }

    /* renamed from: E2 */
    public int mo133092E2() {
        View I2 = mo133096I2(mo59922Y() - 1, -1, true);
        if (I2 == null) {
            return -1;
        }
        return mo59978u0(I2);
    }

    /* renamed from: F */
    public int mo59308F(@C0359n0 RecyclerView.C20055b0 b0Var) {
        return mo133133v2(b0Var);
    }

    /* renamed from: F2 */
    public final View mo133093F2(int i) {
        View J2 = mo133097J2(mo59922Y() - 1, -1, i);
        if (J2 == null) {
            return null;
        }
        return mo133094G2(J2, this.f102745O0.get(this.f102746P0.f102846c[mo59978u0(J2)]));
    }

    /* renamed from: G */
    public int mo59311G(@C0359n0 RecyclerView.C20055b0 b0Var) {
        return mo133134w2(b0Var);
    }

    /* renamed from: G2 */
    public final View mo133094G2(View view, C40342f fVar) {
        boolean l = mo133051l();
        int Y = (mo59922Y() - fVar.f102827h) - 1;
        for (int Y2 = mo59922Y() - 2; Y2 > Y; Y2--) {
            View X = mo59919X(Y2);
            if (!(X == null || X.getVisibility() == 8)) {
                if (!this.f102743M0 || l) {
                    if (this.f102751U0.mo60695d(view) >= this.f102751U0.mo60695d(X)) {
                    }
                } else if (this.f102751U0.mo60698g(view) <= this.f102751U0.mo60698g(X)) {
                }
                view = X;
            }
        }
        return view;
    }

    /* renamed from: H0 */
    public boolean mo59373H0() {
        return true;
    }

    /* renamed from: H2 */
    public int mo133095H2() {
        View I2 = mo133096I2(mo59922Y() - 1, -1, false);
        if (I2 == null) {
            return -1;
        }
        return mo59978u0(I2);
    }

    /* renamed from: I2 */
    public final View mo133096I2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View X = mo59919X(i);
            if (mo133110W2(X, z)) {
                return X;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: J2 */
    public final View mo133097J2(int i, int i2, int i3) {
        int i4;
        int u0;
        mo133136y2();
        mo133135x2();
        int n = this.f102751U0.mo60705n();
        int i5 = this.f102751U0.mo60700i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View X = mo59919X(i);
            if (X != null && (u0 = mo59978u0(X)) >= 0 && u0 < i3) {
                if (((RecyclerView.C20081p) X.getLayoutParams()).mo59998g()) {
                    if (view2 == null) {
                        view2 = X;
                    }
                } else if (this.f102751U0.mo60698g(X) >= n && this.f102751U0.mo60695d(X) <= i5) {
                    return X;
                } else {
                    if (view == null) {
                        view = X;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: K2 */
    public final int mo133098K2(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (mo133051l() || !this.f102743M0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int n = i - this.f102751U0.mo60705n();
            if (n <= 0) {
                return 0;
            }
            i2 = mo133107T2(n, wVar, b0Var);
        } else {
            int i4 = this.f102751U0.mo60700i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -mo133107T2(-i4, wVar, b0Var);
        }
        int i5 = i + i2;
        if (!z || (i3 = this.f102751U0.mo60700i() - i5) <= 0) {
            return i2;
        }
        this.f102751U0.mo60711t(i3);
        return i3 + i2;
    }

    /* renamed from: L2 */
    public final int mo133099L2(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z) {
        int i2;
        int n;
        if (mo133051l() || !this.f102743M0) {
            int n2 = i - this.f102751U0.mo60705n();
            if (n2 <= 0) {
                return 0;
            }
            i2 = -mo133107T2(n2, wVar, b0Var);
        } else {
            int i3 = this.f102751U0.mo60700i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = mo133107T2(-i3, wVar, b0Var);
        }
        int i4 = i + i2;
        if (!z || (n = i4 - this.f102751U0.mo60705n()) <= 0) {
            return i2;
        }
        this.f102751U0.mo60711t(-n);
        return i2 - n;
    }

    /* renamed from: M2 */
    public final int mo133100M2(View view) {
        return mo59934e0(view) + ((RecyclerView.C20081p) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: N2 */
    public final View mo133101N2() {
        return mo59919X(0);
    }

    /* renamed from: O2 */
    public final int mo133102O2(View view) {
        return mo59939g0(view) - ((RecyclerView.C20081p) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: P2 */
    public final int mo133103P2(View view) {
        return mo59953j0(view) + ((RecyclerView.C20081p) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: Q1 */
    public int mo59322Q1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (!mo133051l() || this.f102739I0 == 0) {
            int T2 = mo133107T2(i, wVar, b0Var);
            this.f102759c1.clear();
            return T2;
        }
        int U2 = mo133108U2(i);
        C40335b.m164074l(this.f102750T0, U2);
        this.f102752V0.mo60711t(-U2);
        return U2;
    }

    /* renamed from: Q2 */
    public final int mo133104Q2(View view) {
        return mo59955k0(view) - ((RecyclerView.C20081p) view.getLayoutParams()).topMargin;
    }

    /* renamed from: R1 */
    public void mo59385R1(int i) {
        this.f102754X0 = i;
        this.f102755Y0 = Integer.MIN_VALUE;
        SavedState savedState = this.f102753W0;
        if (savedState != null) {
            savedState.mo133146h();
        }
        mo59898N1();
    }

    /* renamed from: R2 */
    public int mo133105R2(int i) {
        return this.f102746P0.f102846c[i];
    }

    /* renamed from: S */
    public RecyclerView.C20081p mo59323S() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: S1 */
    public int mo59324S1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (mo133051l() || (this.f102739I0 == 0 && !mo133051l())) {
            int T2 = mo133107T2(i, wVar, b0Var);
            this.f102759c1.clear();
            return T2;
        }
        int U2 = mo133108U2(i);
        C40335b.m164074l(this.f102750T0, U2);
        this.f102752V0.mo60711t(-U2);
        return U2;
    }

    /* renamed from: S2 */
    public boolean mo133106S2() {
        return this.f102758b1;
    }

    /* renamed from: T */
    public RecyclerView.C20081p mo59326T(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: T2 */
    public final int mo133107T2(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        boolean z;
        if (mo59922Y() == 0 || i == 0) {
            return 0;
        }
        mo133136y2();
        int i2 = 1;
        boolean unused = this.f102749S0.f102797j = true;
        if (mo133051l() || !this.f102743M0) {
            z = false;
        } else {
            z = true;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        mo133126m3(i2, abs);
        int o = this.f102749S0.f102793f + mo133137z2(wVar, b0Var, this.f102749S0);
        if (o < 0) {
            return 0;
        }
        if (z) {
            if (abs > o) {
                i = (-i2) * o;
            }
        } else if (abs > o) {
            i = i2 * o;
        }
        this.f102751U0.mo60711t(-i);
        int unused2 = this.f102749S0.f102794g = i;
        return i;
    }

    /* renamed from: U2 */
    public final int mo133108U2(int i) {
        int i2;
        int i3;
        int j;
        boolean z = false;
        if (mo59922Y() == 0 || i == 0) {
            return 0;
        }
        mo133136y2();
        boolean l = mo133051l();
        View view = this.f102761e1;
        if (l) {
            i2 = view.getWidth();
        } else {
            i2 = view.getHeight();
        }
        if (l) {
            i3 = mo59868B0();
        } else {
            i3 = mo59958m0();
        }
        if (mo59966q0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                j = Math.min((i3 + this.f102750T0.f102779d) - i2, abs);
            } else if (this.f102750T0.f102779d + i <= 0) {
                return i;
            } else {
                j = this.f102750T0.f102779d;
            }
        } else if (i > 0) {
            return Math.min((i3 - this.f102750T0.f102779d) - i2, i);
        } else {
            if (this.f102750T0.f102779d + i >= 0) {
                return i;
            }
            j = this.f102750T0.f102779d;
        }
        return -j;
    }

    /* renamed from: V2 */
    public boolean mo133109V2() {
        return this.f102743M0;
    }

    /* renamed from: W2 */
    public final boolean mo133110W2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int B0 = mo59868B0() - getPaddingRight();
        int m0 = mo59958m0() - getPaddingBottom();
        int O2 = mo133102O2(view);
        int Q2 = mo133104Q2(view);
        int P2 = mo133103P2(view);
        int M2 = mo133100M2(view);
        if (paddingLeft > O2 || B0 < P2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (O2 >= B0 || P2 >= paddingLeft) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (paddingTop > Q2 || m0 < M2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (Q2 >= m0 || M2 >= paddingTop) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return true;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: X0 */
    public void mo59920X0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    /* renamed from: X2 */
    public final int mo133111X2(C40342f fVar, C40336c cVar) {
        if (mo133051l()) {
            return mo133112Y2(fVar, cVar);
        }
        return mo133113Z2(fVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* renamed from: Y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo133112Y2(com.google.android.flexbox.C40342f r22, com.google.android.flexbox.FlexboxLayoutManager.C40336c r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.mo59868B0()
            int r4 = r23.f102792e
            int r5 = r23.f102796i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.f102826g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.f102791d
            int r4 = r0.f102740J0
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00ac
            if (r4 == r11) goto L_0x009e
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x008e
            r6 = 3
            if (r4 == r6) goto L_0x007b
            r6 = 4
            if (r4 == r6) goto L_0x0066
            r6 = 5
            if (r4 != r6) goto L_0x004d
            int r4 = r8.f102827h
            if (r4 == 0) goto L_0x0046
            int r6 = r8.f102824e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b0
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f102740J0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0066:
            int r4 = r8.f102827h
            if (r4 == 0) goto L_0x0072
            int r6 = r8.f102824e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0073
        L_0x0072:
            r6 = r5
        L_0x0073:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b0
        L_0x007b:
            float r1 = (float) r1
            int r4 = r8.f102827h
            if (r4 == r11) goto L_0x0083
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0085
        L_0x0083:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0085:
            int r6 = r8.f102824e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b0
        L_0x008e:
            float r1 = (float) r1
            int r4 = r8.f102824e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00af
        L_0x009e:
            int r4 = r8.f102824e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b0
        L_0x00ac:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00af:
            r6 = r5
        L_0x00b0:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f102750T0
            int r3 = r3.f102779d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f102750T0
            int r3 = r3.f102779d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r6, r5)
            int r13 = r22.mo133171c()
            r3 = 0
            r14 = r10
        L_0x00ca:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x0197
            android.view.View r15 = r0.mo133027e(r14)
            if (r15 != 0) goto L_0x00d6
            goto L_0x0192
        L_0x00d6:
            int r4 = r23.f102796i
            if (r4 != r11) goto L_0x00e5
            android.graphics.Rect r4 = f102735i1
            r0.mo59977u(r15, r4)
            r0.addView(r15)
            goto L_0x00ef
        L_0x00e5:
            android.graphics.Rect r4 = f102735i1
            r0.mo59977u(r15, r4)
            r0.addView(r15, r3)
            int r3 = r3 + 1
        L_0x00ef:
            r16 = r3
            com.google.android.flexbox.h r3 = r0.f102746P0
            long[] r4 = r3.f102847d
            r5 = r4[r14]
            int r3 = r3.mo133227y(r5)
            com.google.android.flexbox.h r4 = r0.f102746P0
            int r4 = r4.mo133226x(r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r7
            boolean r5 = r0.m163929c2(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x0111
            r15.measure(r3, r4)
        L_0x0111:
            int r3 = r7.leftMargin
            int r4 = r0.mo59968r0(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.mo59980w0(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.mo59984z0(r15)
            int r5 = r9 + r1
            boolean r1 = r0.f102743M0
            if (r1 == 0) goto L_0x014f
            com.google.android.flexbox.h r1 = r0.f102746P0
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            r1.mo133193Q(r2, r3, r4, r5, r6, r7)
            goto L_0x016c
        L_0x014f:
            r11 = r7
            com.google.android.flexbox.h r1 = r0.f102746P0
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
            r1.mo133193Q(r2, r3, r4, r5, r6, r7)
        L_0x016c:
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.mo59980w0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.mo59968r0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x0192:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00ca
        L_0x0197:
            com.google.android.flexbox.FlexboxLayoutManager$c r1 = r0.f102749S0
            int r1 = r1.f102796i
            r2 = r23
            com.google.android.flexbox.FlexboxLayoutManager.C40336c.m164099n(r2, r1)
            int r1 = r22.mo133169a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo133112Y2(com.google.android.flexbox.f, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* renamed from: Z0 */
    public void mo59924Z0(RecyclerView recyclerView) {
        super.mo59924Z0(recyclerView);
        this.f102761e1 = (View) recyclerView.getParent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* renamed from: Z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo133113Z2(com.google.android.flexbox.C40342f r26, com.google.android.flexbox.FlexboxLayoutManager.C40336c r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.mo59958m0()
            int r4 = r27.f102792e
            int r5 = r27.f102792e
            int r6 = r27.f102796i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.f102826g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.f102791d
            int r4 = r0.f102740J0
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b2
            if (r4 == r13) goto L_0x00a4
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0094
            r6 = 3
            if (r4 == r6) goto L_0x0081
            r6 = 4
            if (r4 == r6) goto L_0x006c
            r6 = 5
            if (r4 != r6) goto L_0x0053
            int r4 = r9.f102827h
            if (r4 == 0) goto L_0x004c
            int r6 = r9.f102824e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x004d
        L_0x004c:
            r6 = r5
        L_0x004d:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b6
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f102740J0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006c:
            int r4 = r9.f102827h
            if (r4 == 0) goto L_0x0078
            int r6 = r9.f102824e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0079
        L_0x0078:
            r6 = r5
        L_0x0079:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b6
        L_0x0081:
            float r1 = (float) r1
            int r4 = r9.f102827h
            if (r4 == r13) goto L_0x0089
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008b
        L_0x0089:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008b:
            int r6 = r9.f102824e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b6
        L_0x0094:
            float r1 = (float) r1
            int r4 = r9.f102824e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00b5
        L_0x00a4:
            int r4 = r9.f102824e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b6
        L_0x00b2:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00b5:
            r6 = r5
        L_0x00b6:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f102750T0
            int r3 = r3.f102779d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f102750T0
            int r3 = r3.f102779d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r6, r5)
            int r15 = r26.mo133171c()
            r3 = 0
            r8 = r12
        L_0x00d0:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x020d
            android.view.View r7 = r0.mo133027e(r8)
            if (r7 != 0) goto L_0x00e2
            r23 = r8
            r22 = r13
            r17 = r14
            goto L_0x0205
        L_0x00e2:
            com.google.android.flexbox.h r4 = r0.f102746P0
            long[] r5 = r4.f102847d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.mo133227y(r13)
            com.google.android.flexbox.h r5 = r0.f102746P0
            int r5 = r5.mo133226x(r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r13 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r13
            boolean r6 = r0.m163929c2(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0104
            r7.measure(r4, r5)
        L_0x0104:
            int r4 = r13.topMargin
            int r5 = r0.mo59984z0(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.mo59916W(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.f102796i
            r6 = 1
            if (r1 != r6) goto L_0x0128
            android.graphics.Rect r1 = f102735i1
            r0.mo59977u(r7, r1)
            r0.addView(r7)
            goto L_0x0132
        L_0x0128:
            android.graphics.Rect r1 = f102735i1
            r0.mo59977u(r7, r1)
            r0.addView(r7, r3)
            int r3 = r3 + 1
        L_0x0132:
            r16 = r3
            int r1 = r0.mo59968r0(r7)
            int r5 = r10 + r1
            int r1 = r0.mo59980w0(r7)
            int r19 = r11 - r1
            boolean r4 = r0.f102743M0
            if (r4 == 0) goto L_0x0198
            boolean r1 = r0.f102744N0
            if (r1 == 0) goto L_0x0172
            com.google.android.flexbox.h r1 = r0.f102746P0
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = r6
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            r1.mo133194R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x0172:
            r22 = r6
            r20 = r7
            r23 = r8
            com.google.android.flexbox.h r1 = r0.f102746P0
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            r1.mo133194R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x0198:
            r22 = r6
            r20 = r7
            r23 = r8
            boolean r1 = r0.f102744N0
            if (r1 == 0) goto L_0x01c0
            com.google.android.flexbox.h r1 = r0.f102746P0
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            r2 = r20
            r3 = r26
            r1.mo133194R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x01c0:
            com.google.android.flexbox.h r1 = r0.f102746P0
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r1.mo133194R(r2, r3, r4, r5, r6, r7, r8)
        L_0x01dd:
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.mo59916W(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.mo59984z0(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x0205:
            int r8 = r23 + 1
            r14 = r17
            r13 = r22
            goto L_0x00d0
        L_0x020d:
            com.google.android.flexbox.FlexboxLayoutManager$c r1 = r0.f102749S0
            int r1 = r1.f102796i
            r2 = r27
            com.google.android.flexbox.FlexboxLayoutManager.C40336c.m164099n(r2, r1)
            int r1 = r26.mo133169a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo133113Z2(com.google.android.flexbox.f, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* renamed from: a */
    public PointF mo59393a(int i) {
        View X;
        int i2;
        if (mo59922Y() == 0 || (X = mo59919X(0)) == null) {
            return null;
        }
        if (i < mo59978u0(X)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo133051l()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    /* renamed from: a3 */
    public final void mo133114a3(RecyclerView.C20089w wVar, C40336c cVar) {
        if (cVar.f102797j) {
            if (cVar.f102796i == -1) {
                mo133116c3(wVar, cVar);
            } else {
                mo133117d3(wVar, cVar);
            }
        }
    }

    /* renamed from: b */
    public void mo133023b(View view, int i, int i2, C40342f fVar) {
        mo59977u(view, f102735i1);
        if (mo133051l()) {
            int r0 = mo59968r0(view) + mo59980w0(view);
            fVar.f102824e += r0;
            fVar.f102825f += r0;
            return;
        }
        int z0 = mo59984z0(view) + mo59916W(view);
        fVar.f102824e += z0;
        fVar.f102825f += z0;
    }

    /* renamed from: b1 */
    public void mo59395b1(RecyclerView recyclerView, RecyclerView.C20089w wVar) {
        super.mo59395b1(recyclerView, wVar);
        if (this.f102758b1) {
            mo59875E1(wVar);
            wVar.mo60037d();
        }
    }

    /* renamed from: b3 */
    public final void mo133115b3(RecyclerView.C20089w wVar, int i, int i2) {
        while (i2 >= i) {
            mo59881H1(i2, wVar);
            i2--;
        }
    }

    /* renamed from: c */
    public int mo133024c(int i, int i2, int i3) {
        return RecyclerView.C20076o.m93537Z(mo59868B0(), mo59870C0(), i2, i3, mo59428v());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = r0 - 1;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133116c3(androidx.recyclerview.widget.RecyclerView.C20089w r8, com.google.android.flexbox.FlexboxLayoutManager.C40336c r9) {
        /*
            r7 = this;
            int r0 = r9.f102793f
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.mo59922Y()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r1 = r0 + -1
            android.view.View r2 = r7.mo59919X(r1)
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            com.google.android.flexbox.h r3 = r7.f102746P0
            int[] r3 = r3.f102846c
            int r2 = r7.mo59978u0(r2)
            r2 = r3[r2]
            r3 = -1
            if (r2 != r3) goto L_0x0025
            return
        L_0x0025:
            java.util.List<com.google.android.flexbox.f> r3 = r7.f102745O0
            java.lang.Object r3 = r3.get(r2)
            com.google.android.flexbox.f r3 = (com.google.android.flexbox.C40342f) r3
            r4 = r1
        L_0x002e:
            if (r4 < 0) goto L_0x005f
            android.view.View r5 = r7.mo59919X(r4)
            if (r5 != 0) goto L_0x0037
            goto L_0x005c
        L_0x0037:
            int r6 = r9.f102793f
            boolean r6 = r7.mo133129r2(r5, r6)
            if (r6 == 0) goto L_0x005f
            int r6 = r3.f102834o
            int r5 = r7.mo59978u0(r5)
            if (r6 != r5) goto L_0x005c
            if (r2 > 0) goto L_0x004d
            r0 = r4
            goto L_0x005f
        L_0x004d:
            int r0 = r9.f102796i
            int r2 = r2 + r0
            java.util.List<com.google.android.flexbox.f> r0 = r7.f102745O0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.flexbox.f r0 = (com.google.android.flexbox.C40342f) r0
            r3 = r0
            r0 = r4
        L_0x005c:
            int r4 = r4 + -1
            goto L_0x002e
        L_0x005f:
            r7.mo133115b3(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo133116c3(androidx.recyclerview.widget.RecyclerView$w, com.google.android.flexbox.FlexboxLayoutManager$c):void");
    }

    /* renamed from: d3 */
    public final void mo133117d3(RecyclerView.C20089w wVar, C40336c cVar) {
        int Y;
        View X;
        if (cVar.f102793f >= 0 && (Y = mo59922Y()) != 0 && (X = mo59919X(0)) != null) {
            int i = this.f102746P0.f102846c[mo59978u0(X)];
            int i2 = -1;
            if (i != -1) {
                C40342f fVar = this.f102745O0.get(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= Y) {
                        break;
                    }
                    View X2 = mo59919X(i3);
                    if (X2 != null) {
                        if (!mo133130s2(X2, cVar.f102793f)) {
                            break;
                        } else if (fVar.f102835p != mo59978u0(X2)) {
                            continue;
                        } else if (i >= this.f102745O0.size() - 1) {
                            i2 = i3;
                            break;
                        } else {
                            i += cVar.f102796i;
                            fVar = this.f102745O0.get(i);
                            i2 = i3;
                        }
                    }
                    i3++;
                }
                mo133115b3(wVar, 0, i2);
            }
        }
    }

    /* renamed from: e */
    public View mo133027e(int i) {
        View view = this.f102759c1.get(i);
        if (view != null) {
            return view;
        }
        return this.f102747Q0.mo60049p(i);
    }

    /* renamed from: e3 */
    public final void mo133118e3() {
        int i;
        boolean z;
        if (mo133051l()) {
            i = mo59960n0();
        } else {
            i = mo59870C0();
        }
        C40336c cVar = this.f102749S0;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        boolean unused = cVar.f102789b = z;
    }

    /* renamed from: f */
    public int mo133028f(int i, int i2, int i3) {
        return RecyclerView.C20076o.m93537Z(mo59958m0(), mo59960n0(), i2, i3, mo59431w());
    }

    /* renamed from: f2 */
    public void mo59403f2(RecyclerView recyclerView, RecyclerView.C20055b0 b0Var, int i) {
        C20207r rVar = new C20207r(recyclerView.getContext());
        rVar.mo59709q(i);
        mo59941g2(rVar);
    }

    /* renamed from: f3 */
    public final void mo133119f3() {
        boolean z;
        boolean z2;
        boolean z3;
        int q0 = mo59966q0();
        int i = this.f102738H0;
        boolean z4 = false;
        if (i == 0) {
            if (q0 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f102743M0 = z;
            if (this.f102739I0 == 2) {
                z4 = true;
            }
            this.f102744N0 = z4;
        } else if (i == 1) {
            if (q0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f102743M0 = z2;
            if (this.f102739I0 == 2) {
                z4 = true;
            }
            this.f102744N0 = z4;
        } else if (i == 2) {
            if (q0 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f102743M0 = z3;
            if (this.f102739I0 == 2) {
                this.f102743M0 = !z3;
            }
            this.f102744N0 = false;
        } else if (i != 3) {
            this.f102743M0 = false;
            this.f102744N0 = false;
        } else {
            if (q0 == 1) {
                z4 = true;
            }
            this.f102743M0 = z4;
            if (this.f102739I0 == 2) {
                this.f102743M0 = !z4;
            }
            this.f102744N0 = true;
        }
    }

    /* renamed from: g */
    public int mo133029g(View view) {
        int r0;
        int w0;
        if (mo133051l()) {
            r0 = mo59984z0(view);
            w0 = mo59916W(view);
        } else {
            r0 = mo59968r0(view);
            w0 = mo59980w0(view);
        }
        return r0 + w0;
    }

    /* renamed from: g3 */
    public void mo133120g3(boolean z) {
        this.f102758b1 = z;
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.f102741K0;
    }

    public int getFlexDirection() {
        return this.f102738H0;
    }

    public int getFlexItemCount() {
        return this.f102748R0.mo59729d();
    }

    @C0359n0
    public List<C40342f> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f102745O0.size());
        int size = this.f102745O0.size();
        for (int i = 0; i < size; i++) {
            C40342f fVar = this.f102745O0.get(i);
            if (fVar.mo133171c() != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public List<C40342f> getFlexLinesInternal() {
        return this.f102745O0;
    }

    public int getFlexWrap() {
        return this.f102739I0;
    }

    public int getJustifyContent() {
        return this.f102740J0;
    }

    public int getLargestMainSize() {
        if (this.f102745O0.size() == 0) {
            return 0;
        }
        int size = this.f102745O0.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f102745O0.get(i2).f102824e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f102742L0;
    }

    public int getSumOfCrossSize() {
        int size = this.f102745O0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f102745O0.get(i2).f102826g;
        }
        return i;
    }

    /* renamed from: h */
    public void mo133047h(C40342f fVar) {
    }

    /* renamed from: h3 */
    public final boolean mo133121h3(RecyclerView.C20055b0 b0Var, C40335b bVar) {
        View view;
        int i;
        boolean z = false;
        if (mo59922Y() == 0) {
            return false;
        }
        if (bVar.f102780e) {
            view = mo133093F2(b0Var.mo59729d());
        } else {
            view = mo133089B2(b0Var.mo59729d());
        }
        if (view == null) {
            return false;
        }
        bVar.mo133154s(view);
        if (!b0Var.mo59735j() && mo59333j2()) {
            if (this.f102751U0.mo60698g(view) >= this.f102751U0.mo60700i() || this.f102751U0.mo60695d(view) < this.f102751U0.mo60705n()) {
                z = true;
            }
            if (z) {
                if (bVar.f102780e) {
                    i = this.f102751U0.mo60700i();
                } else {
                    i = this.f102751U0.mo60705n();
                }
                int unused = bVar.f102778c = i;
            }
        }
        return true;
    }

    /* renamed from: i */
    public View mo133048i(int i) {
        return mo133027e(i);
    }

    /* renamed from: i3 */
    public final boolean mo133122i3(RecyclerView.C20055b0 b0Var, C40335b bVar, SavedState savedState) {
        int i;
        View X;
        int i2;
        boolean z = false;
        if (!b0Var.mo59735j() && (i = this.f102754X0) != -1) {
            if (i < 0 || i >= b0Var.mo59729d()) {
                this.f102754X0 = -1;
                this.f102755Y0 = Integer.MIN_VALUE;
            } else {
                int unused = bVar.f102776a = this.f102754X0;
                int unused2 = bVar.f102777b = this.f102746P0.f102846c[bVar.f102776a];
                SavedState savedState2 = this.f102753W0;
                if (savedState2 != null && savedState2.mo133145g(b0Var.mo59729d())) {
                    int unused3 = bVar.f102778c = this.f102751U0.mo60705n() + savedState.f102774b;
                    boolean unused4 = bVar.f102782g = true;
                    int unused5 = bVar.f102777b = -1;
                    return true;
                } else if (this.f102755Y0 == Integer.MIN_VALUE) {
                    View R = mo59384R(this.f102754X0);
                    if (R == null) {
                        if (mo59922Y() > 0 && (X = mo59919X(0)) != null) {
                            if (this.f102754X0 < mo59978u0(X)) {
                                z = true;
                            }
                            boolean unused6 = bVar.f102780e = z;
                        }
                        bVar.mo133153r();
                    } else if (this.f102751U0.mo60696e(R) > this.f102751U0.mo60706o()) {
                        bVar.mo133153r();
                        return true;
                    } else if (this.f102751U0.mo60698g(R) - this.f102751U0.mo60705n() < 0) {
                        int unused7 = bVar.f102778c = this.f102751U0.mo60705n();
                        boolean unused8 = bVar.f102780e = false;
                        return true;
                    } else if (this.f102751U0.mo60700i() - this.f102751U0.mo60695d(R) < 0) {
                        int unused9 = bVar.f102778c = this.f102751U0.mo60700i();
                        boolean unused10 = bVar.f102780e = true;
                        return true;
                    } else {
                        if (bVar.f102780e) {
                            i2 = this.f102751U0.mo60695d(R) + this.f102751U0.mo60707p();
                        } else {
                            i2 = this.f102751U0.mo60698g(R);
                        }
                        int unused11 = bVar.f102778c = i2;
                    }
                    return true;
                } else {
                    if (mo133051l() || !this.f102743M0) {
                        int unused12 = bVar.f102778c = this.f102751U0.mo60705n() + this.f102755Y0;
                    } else {
                        int unused13 = bVar.f102778c = this.f102755Y0 - this.f102751U0.mo60701j();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo133049j(int i, View view) {
        this.f102759c1.put(i, view);
    }

    /* renamed from: j3 */
    public final void mo133123j3(RecyclerView.C20055b0 b0Var, C40335b bVar) {
        if (!mo133122i3(b0Var, bVar, this.f102753W0) && !mo133121h3(b0Var, bVar)) {
            bVar.mo133153r();
            int unused = bVar.f102776a = 0;
            int unused2 = bVar.f102777b = 0;
        }
    }

    /* renamed from: k */
    public int mo133050k(View view, int i, int i2) {
        int z0;
        int W;
        if (mo133051l()) {
            z0 = mo59968r0(view);
            W = mo59980w0(view);
        } else {
            z0 = mo59984z0(view);
            W = mo59916W(view);
        }
        return z0 + W;
    }

    /* renamed from: k1 */
    public void mo59335k1(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        super.mo59335k1(recyclerView, i, i2);
        mo133124k3(i);
    }

    /* renamed from: k3 */
    public final void mo133124k3(int i) {
        if (i < mo133095H2()) {
            int Y = mo59922Y();
            this.f102746P0.mo133222t(Y);
            this.f102746P0.mo133223u(Y);
            this.f102746P0.mo133221s(Y);
            if (i < this.f102746P0.f102846c.length) {
                this.f102762f1 = i;
                View N2 = mo133101N2();
                if (N2 != null) {
                    this.f102754X0 = mo59978u0(N2);
                    if (mo133051l() || !this.f102743M0) {
                        this.f102755Y0 = this.f102751U0.mo60698g(N2) - this.f102751U0.mo60705n();
                    } else {
                        this.f102755Y0 = this.f102751U0.mo60695d(N2) + this.f102751U0.mo60701j();
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public boolean mo133051l() {
        int i = this.f102738H0;
        return i == 0 || i == 1;
    }

    /* renamed from: l3 */
    public final void mo133125l3(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo59868B0(), mo59870C0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo59958m0(), mo59960n0());
        int B0 = mo59868B0();
        int m0 = mo59958m0();
        boolean z = true;
        if (mo133051l()) {
            int i4 = this.f102756Z0;
            if (i4 == Integer.MIN_VALUE || i4 == B0) {
                z = false;
            }
            if (this.f102749S0.f102789b) {
                i2 = this.f102760d1.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f102749S0.f102788a;
            }
        } else {
            int i5 = this.f102757a1;
            if (i5 == Integer.MIN_VALUE || i5 == m0) {
                z = false;
            }
            if (this.f102749S0.f102789b) {
                i2 = this.f102760d1.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f102749S0.f102788a;
            }
        }
        int i6 = i2;
        this.f102756Z0 = B0;
        this.f102757a1 = m0;
        int i7 = this.f102762f1;
        if (i7 != -1 || (this.f102754X0 == -1 && !z)) {
            if (i7 != -1) {
                i3 = Math.min(i7, this.f102750T0.f102776a);
            } else {
                i3 = this.f102750T0.f102776a;
            }
            int i8 = i3;
            this.f102763g1.mo133229a();
            if (mo133051l()) {
                if (this.f102745O0.size() > 0) {
                    this.f102746P0.mo133212j(this.f102745O0, i8);
                    this.f102746P0.mo133204b(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.f102750T0.f102776a, this.f102745O0);
                } else {
                    this.f102746P0.mo133221s(i);
                    this.f102746P0.mo133206d(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f102745O0);
                }
            } else if (this.f102745O0.size() > 0) {
                this.f102746P0.mo133212j(this.f102745O0, i8);
                this.f102746P0.mo133204b(this.f102763g1, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.f102750T0.f102776a, this.f102745O0);
            } else {
                this.f102746P0.mo133221s(i);
                this.f102746P0.mo133209g(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f102745O0);
            }
            this.f102745O0 = this.f102763g1.f102849a;
            this.f102746P0.mo133219q(makeMeasureSpec, makeMeasureSpec2, i8);
            this.f102746P0.mo133201Y(i8);
        } else if (!this.f102750T0.f102780e) {
            this.f102745O0.clear();
            this.f102763g1.mo133229a();
            if (mo133051l()) {
                this.f102746P0.mo133207e(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, i6, this.f102750T0.f102776a, this.f102745O0);
            } else {
                this.f102746P0.mo133210h(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, i6, this.f102750T0.f102776a, this.f102745O0);
            }
            this.f102745O0 = this.f102763g1.f102849a;
            this.f102746P0.mo133218p(makeMeasureSpec, makeMeasureSpec2);
            this.f102746P0.mo133200X();
            C40335b bVar = this.f102750T0;
            int unused = bVar.f102777b = this.f102746P0.f102846c[bVar.f102776a];
            int unused2 = this.f102749S0.f102790c = this.f102750T0.f102777b;
        }
    }

    /* renamed from: m1 */
    public void mo59338m1(@C0359n0 RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo59338m1(recyclerView, i, i2, i3);
        mo133124k3(Math.min(i, i2));
    }

    /* renamed from: m3 */
    public final void mo133126m3(int i, int i2) {
        boolean z;
        int i3;
        int unused = this.f102749S0.f102796i = i;
        boolean l = mo133051l();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo59868B0(), mo59870C0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo59958m0(), mo59960n0());
        if (l || !this.f102743M0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 1) {
            View X = mo59919X(mo59922Y() - 1);
            if (X != null) {
                int unused2 = this.f102749S0.f102792e = this.f102751U0.mo60695d(X);
                int u0 = mo59978u0(X);
                View G2 = mo133094G2(X, this.f102745O0.get(this.f102746P0.f102846c[u0]));
                int unused3 = this.f102749S0.f102795h = 1;
                C40336c cVar = this.f102749S0;
                int unused4 = cVar.f102791d = u0 + cVar.f102795h;
                if (this.f102746P0.f102846c.length <= this.f102749S0.f102791d) {
                    int unused5 = this.f102749S0.f102790c = -1;
                } else {
                    C40336c cVar2 = this.f102749S0;
                    int unused6 = cVar2.f102790c = this.f102746P0.f102846c[cVar2.f102791d];
                }
                if (z) {
                    int unused7 = this.f102749S0.f102792e = this.f102751U0.mo60698g(G2);
                    int unused8 = this.f102749S0.f102793f = (-this.f102751U0.mo60698g(G2)) + this.f102751U0.mo60705n();
                    C40336c cVar3 = this.f102749S0;
                    int unused9 = cVar3.f102793f = Math.max(cVar3.f102793f, 0);
                } else {
                    int unused10 = this.f102749S0.f102792e = this.f102751U0.mo60695d(G2);
                    int unused11 = this.f102749S0.f102793f = this.f102751U0.mo60695d(G2) - this.f102751U0.mo60700i();
                }
                if ((this.f102749S0.f102790c == -1 || this.f102749S0.f102790c > this.f102745O0.size() - 1) && this.f102749S0.f102791d <= getFlexItemCount()) {
                    int o = i2 - this.f102749S0.f102793f;
                    this.f102763g1.mo133229a();
                    if (o > 0) {
                        if (l) {
                            this.f102746P0.mo133206d(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, o, this.f102749S0.f102791d, this.f102745O0);
                        } else {
                            this.f102746P0.mo133209g(this.f102763g1, makeMeasureSpec, makeMeasureSpec2, o, this.f102749S0.f102791d, this.f102745O0);
                        }
                        this.f102746P0.mo133219q(makeMeasureSpec, makeMeasureSpec2, this.f102749S0.f102791d);
                        this.f102746P0.mo133201Y(this.f102749S0.f102791d);
                    }
                }
            } else {
                return;
            }
        } else {
            View X2 = mo59919X(0);
            if (X2 != null) {
                int unused12 = this.f102749S0.f102792e = this.f102751U0.mo60698g(X2);
                int u02 = mo59978u0(X2);
                View C2 = mo133090C2(X2, this.f102745O0.get(this.f102746P0.f102846c[u02]));
                int unused13 = this.f102749S0.f102795h = 1;
                int i4 = this.f102746P0.f102846c[u02];
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i4 > 0) {
                    int unused14 = this.f102749S0.f102791d = u02 - this.f102745O0.get(i4 - 1).mo133171c();
                } else {
                    int unused15 = this.f102749S0.f102791d = -1;
                }
                C40336c cVar4 = this.f102749S0;
                if (i4 > 0) {
                    i3 = i4 - 1;
                } else {
                    i3 = 0;
                }
                int unused16 = cVar4.f102790c = i3;
                if (z) {
                    int unused17 = this.f102749S0.f102792e = this.f102751U0.mo60695d(C2);
                    int unused18 = this.f102749S0.f102793f = this.f102751U0.mo60695d(C2) - this.f102751U0.mo60700i();
                    C40336c cVar5 = this.f102749S0;
                    int unused19 = cVar5.f102793f = Math.max(cVar5.f102793f, 0);
                } else {
                    int unused20 = this.f102749S0.f102792e = this.f102751U0.mo60698g(C2);
                    int unused21 = this.f102749S0.f102793f = (-this.f102751U0.mo60698g(C2)) + this.f102751U0.mo60705n();
                }
            } else {
                return;
            }
        }
        C40336c cVar6 = this.f102749S0;
        int unused22 = cVar6.f102788a = i2 - cVar6.f102793f;
    }

    /* renamed from: n1 */
    public void mo59339n1(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        super.mo59339n1(recyclerView, i, i2);
        mo133124k3(i);
    }

    /* renamed from: n3 */
    public final void mo133127n3(C40335b bVar, boolean z, boolean z2) {
        if (z2) {
            mo133118e3();
        } else {
            boolean unused = this.f102749S0.f102789b = false;
        }
        if (mo133051l() || !this.f102743M0) {
            int unused2 = this.f102749S0.f102788a = this.f102751U0.mo60700i() - bVar.f102778c;
        } else {
            int unused3 = this.f102749S0.f102788a = bVar.f102778c - getPaddingRight();
        }
        int unused4 = this.f102749S0.f102791d = bVar.f102776a;
        int unused5 = this.f102749S0.f102795h = 1;
        int unused6 = this.f102749S0.f102796i = 1;
        int unused7 = this.f102749S0.f102792e = bVar.f102778c;
        int unused8 = this.f102749S0.f102793f = Integer.MIN_VALUE;
        int unused9 = this.f102749S0.f102790c = bVar.f102777b;
        if (z && this.f102745O0.size() > 1 && bVar.f102777b >= 0 && bVar.f102777b < this.f102745O0.size() - 1) {
            C40336c.m164097l(this.f102749S0);
            C40336c.m164106u(this.f102749S0, this.f102745O0.get(bVar.f102777b).mo133171c());
        }
    }

    /* renamed from: o1 */
    public void mo59963o1(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        super.mo59963o1(recyclerView, i, i2);
        mo133124k3(i);
    }

    /* renamed from: o3 */
    public final void mo133128o3(C40335b bVar, boolean z, boolean z2) {
        if (z2) {
            mo133118e3();
        } else {
            boolean unused = this.f102749S0.f102789b = false;
        }
        if (mo133051l() || !this.f102743M0) {
            int unused2 = this.f102749S0.f102788a = bVar.f102778c - this.f102751U0.mo60705n();
        } else {
            int unused3 = this.f102749S0.f102788a = (this.f102761e1.getWidth() - bVar.f102778c) - this.f102751U0.mo60705n();
        }
        int unused4 = this.f102749S0.f102791d = bVar.f102776a;
        int unused5 = this.f102749S0.f102795h = 1;
        int unused6 = this.f102749S0.f102796i = -1;
        int unused7 = this.f102749S0.f102792e = bVar.f102778c;
        int unused8 = this.f102749S0.f102793f = Integer.MIN_VALUE;
        int unused9 = this.f102749S0.f102790c = bVar.f102777b;
        if (z && bVar.f102777b > 0 && this.f102745O0.size() > bVar.f102777b) {
            C40336c.m164098m(this.f102749S0);
            C40336c.m164107v(this.f102749S0, this.f102745O0.get(bVar.f102777b).mo133171c());
        }
    }

    /* renamed from: p1 */
    public void mo59340p1(@C0359n0 RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo59340p1(recyclerView, i, i2, obj);
        mo133124k3(i);
    }

    /* renamed from: q1 */
    public void mo59341q1(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        int i;
        int i2;
        this.f102747Q0 = wVar;
        this.f102748R0 = b0Var;
        int d = b0Var.mo59729d();
        if (d != 0 || !b0Var.mo59735j()) {
            mo133119f3();
            mo133136y2();
            mo133135x2();
            this.f102746P0.mo133222t(d);
            this.f102746P0.mo133223u(d);
            this.f102746P0.mo133221s(d);
            boolean unused = this.f102749S0.f102797j = false;
            SavedState savedState = this.f102753W0;
            if (savedState != null && savedState.mo133145g(d)) {
                this.f102754X0 = this.f102753W0.f102773a;
            }
            if (!(this.f102750T0.f102781f && this.f102754X0 == -1 && this.f102753W0 == null)) {
                this.f102750T0.mo133155t();
                mo133123j3(b0Var, this.f102750T0);
                boolean unused2 = this.f102750T0.f102781f = true;
            }
            mo59880H(wVar);
            if (this.f102750T0.f102780e) {
                mo133128o3(this.f102750T0, false, true);
            } else {
                mo133127n3(this.f102750T0, false, true);
            }
            mo133125l3(d);
            mo133137z2(wVar, b0Var, this.f102749S0);
            if (this.f102750T0.f102780e) {
                i2 = this.f102749S0.f102792e;
                mo133127n3(this.f102750T0, true, false);
                mo133137z2(wVar, b0Var, this.f102749S0);
                i = this.f102749S0.f102792e;
            } else {
                i = this.f102749S0.f102792e;
                mo133128o3(this.f102750T0, true, false);
                mo133137z2(wVar, b0Var, this.f102749S0);
                i2 = this.f102749S0.f102792e;
            }
            if (mo59922Y() <= 0) {
                return;
            }
            if (this.f102750T0.f102780e) {
                mo133099L2(i2 + mo133098K2(i, wVar, b0Var, true), wVar, b0Var, false);
            } else {
                mo133098K2(i + mo133099L2(i2, wVar, b0Var, true), wVar, b0Var, false);
            }
        }
    }

    /* renamed from: r1 */
    public void mo59342r1(RecyclerView.C20055b0 b0Var) {
        super.mo59342r1(b0Var);
        this.f102753W0 = null;
        this.f102754X0 = -1;
        this.f102755Y0 = Integer.MIN_VALUE;
        this.f102762f1 = -1;
        this.f102750T0.mo133155t();
        this.f102759c1.clear();
    }

    /* renamed from: r2 */
    public final boolean mo133129r2(View view, int i) {
        if (mo133051l() || !this.f102743M0) {
            if (this.f102751U0.mo60698g(view) >= this.f102751U0.mo60699h() - i) {
                return true;
            }
            return false;
        } else if (this.f102751U0.mo60695d(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: s2 */
    public final boolean mo133130s2(View view, int i) {
        if (mo133051l() || !this.f102743M0) {
            if (this.f102751U0.mo60695d(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f102751U0.mo60699h() - this.f102751U0.mo60698g(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    public void setAlignContent(int i) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    public void setAlignItems(int i) {
        int i2 = this.f102741K0;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                mo133131t2();
            }
            this.f102741K0 = i;
            mo59898N1();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f102738H0 != i) {
            removeAllViews();
            this.f102738H0 = i;
            this.f102751U0 = null;
            this.f102752V0 = null;
            mo133131t2();
            mo59898N1();
        }
    }

    public void setFlexLines(List<C40342f> list) {
        this.f102745O0 = list;
    }

    public void setFlexWrap(int i) {
        if (i != 2) {
            int i2 = this.f102739I0;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    removeAllViews();
                    mo133131t2();
                }
                this.f102739I0 = i;
                this.f102751U0 = null;
                this.f102752V0 = null;
                mo59898N1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public void setJustifyContent(int i) {
        if (this.f102740J0 != i) {
            this.f102740J0 = i;
            mo59898N1();
        }
    }

    public void setMaxLine(int i) {
        if (this.f102742L0 != i) {
            this.f102742L0 = i;
            mo59898N1();
        }
    }

    /* renamed from: t2 */
    public final void mo133131t2() {
        this.f102745O0.clear();
        this.f102750T0.mo133155t();
        int unused = this.f102750T0.f102779d = 0;
    }

    /* renamed from: u2 */
    public final int mo133132u2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        int d = b0Var.mo59729d();
        mo133136y2();
        View B2 = mo133089B2(d);
        View F2 = mo133093F2(d);
        if (b0Var.mo59729d() == 0 || B2 == null || F2 == null) {
            return 0;
        }
        return Math.min(this.f102751U0.mo60706o(), this.f102751U0.mo60695d(F2) - this.f102751U0.mo60698g(B2));
    }

    /* renamed from: v */
    public boolean mo59428v() {
        int i;
        if (this.f102739I0 == 0) {
            return mo133051l();
        }
        if (mo133051l()) {
            int B0 = mo59868B0();
            View view = this.f102761e1;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (B0 > i) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: v1 */
    public void mo59429v1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f102753W0 = (SavedState) parcelable;
            mo59898N1();
        }
    }

    /* renamed from: v2 */
    public final int mo133133v2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        int d = b0Var.mo59729d();
        View B2 = mo133089B2(d);
        View F2 = mo133093F2(d);
        if (!(b0Var.mo59729d() == 0 || B2 == null || F2 == null)) {
            int u0 = mo59978u0(B2);
            int u02 = mo59978u0(F2);
            int abs = Math.abs(this.f102751U0.mo60695d(F2) - this.f102751U0.mo60698g(B2));
            int[] iArr = this.f102746P0.f102846c;
            int i = iArr[u0];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[u02] - i) + 1)))) + ((float) (this.f102751U0.mo60705n() - this.f102751U0.mo60698g(B2))));
            }
        }
        return 0;
    }

    /* renamed from: w */
    public boolean mo59431w() {
        int i;
        if (this.f102739I0 == 0) {
            return !mo133051l();
        }
        if (mo133051l()) {
            return true;
        }
        int m0 = mo59958m0();
        View view = this.f102761e1;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (m0 > i) {
            return true;
        }
        return false;
    }

    /* renamed from: w1 */
    public Parcelable mo59432w1() {
        if (this.f102753W0 != null) {
            return new SavedState(this.f102753W0);
        }
        SavedState savedState = new SavedState();
        if (mo59922Y() > 0) {
            View N2 = mo133101N2();
            int unused = savedState.f102773a = mo59978u0(N2);
            int unused2 = savedState.f102774b = this.f102751U0.mo60698g(N2) - this.f102751U0.mo60705n();
        } else {
            savedState.mo133146h();
        }
        return savedState;
    }

    /* renamed from: w2 */
    public final int mo133134w2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        int d = b0Var.mo59729d();
        View B2 = mo133089B2(d);
        View F2 = mo133093F2(d);
        if (b0Var.mo59729d() == 0 || B2 == null || F2 == null) {
            return 0;
        }
        int D2 = mo133091D2();
        return (int) ((((float) Math.abs(this.f102751U0.mo60695d(F2) - this.f102751U0.mo60698g(B2))) / ((float) ((mo133095H2() - D2) + 1))) * ((float) b0Var.mo59729d()));
    }

    /* renamed from: x */
    public boolean mo59346x(RecyclerView.C20081p pVar) {
        return pVar instanceof LayoutParams;
    }

    /* renamed from: x2 */
    public final void mo133135x2() {
        if (this.f102749S0 == null) {
            this.f102749S0 = new C40336c();
        }
    }

    /* renamed from: y2 */
    public final void mo133136y2() {
        if (this.f102751U0 == null) {
            if (mo133051l()) {
                if (this.f102739I0 == 0) {
                    this.f102751U0 = C20224y.m94588a(this);
                    this.f102752V0 = C20224y.m94590c(this);
                    return;
                }
                this.f102751U0 = C20224y.m94590c(this);
                this.f102752V0 = C20224y.m94588a(this);
            } else if (this.f102739I0 == 0) {
                this.f102751U0 = C20224y.m94590c(this);
                this.f102752V0 = C20224y.m94588a(this);
            } else {
                this.f102751U0 = C20224y.m94588a(this);
                this.f102752V0 = C20224y.m94590c(this);
            }
        }
    }

    /* renamed from: z2 */
    public final int mo133137z2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, C40336c cVar) {
        if (cVar.f102793f != Integer.MIN_VALUE) {
            if (cVar.f102788a < 0) {
                C40336c.m164102q(cVar, cVar.f102788a);
            }
            mo133114a3(wVar, cVar);
        }
        int g = cVar.f102788a;
        int g2 = cVar.f102788a;
        boolean l = mo133051l();
        int i = 0;
        while (true) {
            if ((g2 > 0 || this.f102749S0.f102789b) && cVar.mo133157D(b0Var, this.f102745O0)) {
                C40342f fVar = this.f102745O0.get(cVar.f102790c);
                int unused = cVar.f102791d = fVar.f102834o;
                i += mo133111X2(fVar, cVar);
                if (l || !this.f102743M0) {
                    C40336c.m164088c(cVar, fVar.mo133169a() * cVar.f102796i);
                } else {
                    C40336c.m164089d(cVar, fVar.mo133169a() * cVar.f102796i);
                }
                g2 -= fVar.mo133169a();
            }
        }
        C40336c.m164094i(cVar, i);
        if (cVar.f102793f != Integer.MIN_VALUE) {
            C40336c.m164102q(cVar, i);
            if (cVar.f102788a < 0) {
                C40336c.m164102q(cVar, cVar.f102788a);
            }
            mo133114a3(wVar, cVar);
        }
        return g - cVar.f102788a;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C40333a();

        /* renamed from: a */
        public int f102773a;

        /* renamed from: b */
        public int f102774b;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        public class C40333a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public final boolean mo133145g(int i) {
            int i2 = this.f102773a;
            return i2 >= 0 && i2 < i;
        }

        /* renamed from: h */
        public final void mo133146h() {
            this.f102773a = -1;
        }

        @C0359n0
        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f102773a + ", mAnchorOffset=" + this.f102774b + C12361b.f30259j;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f102773a);
            parcel.writeInt(this.f102774b);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f102773a = parcel.readInt();
            this.f102774b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f102773a = savedState.f102773a;
            this.f102774b = savedState.f102774b;
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f102742L0 = -1;
        this.f102745O0 = new ArrayList();
        this.f102746P0 = new C40344h(this);
        this.f102750T0 = new C40335b();
        this.f102754X0 = -1;
        this.f102755Y0 = Integer.MIN_VALUE;
        this.f102756Z0 = Integer.MIN_VALUE;
        this.f102757a1 = Integer.MIN_VALUE;
        this.f102759c1 = new SparseArray<>();
        this.f102762f1 = -1;
        this.f102763g1 = new C40344h.C40346b();
        setFlexDirection(i);
        setFlexWrap(i2);
        setAlignItems(4);
        this.f102760d1 = context;
    }

    public static class LayoutParams extends RecyclerView.C20081p implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C40332a();

        /* renamed from: X */
        public boolean f102764X;

        /* renamed from: e */
        public float f102765e = 0.0f;

        /* renamed from: f */
        public float f102766f = 1.0f;

        /* renamed from: g */
        public int f102767g = -1;

        /* renamed from: v */
        public float f102768v = -1.0f;

        /* renamed from: w */
        public int f102769w;

        /* renamed from: x */
        public int f102770x;

        /* renamed from: y */
        public int f102771y = 16777215;

        /* renamed from: z */
        public int f102772z = 16777215;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        public class C40332a implements Parcelable.Creator<LayoutParams> {
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: F0 */
        public void mo132990F0(int i) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        /* renamed from: F3 */
        public int mo132991F3() {
            return this.rightMargin;
        }

        /* renamed from: H0 */
        public int mo132992H0() {
            return this.f102767g;
        }

        /* renamed from: H1 */
        public float mo132993H1() {
            return this.f102768v;
        }

        /* renamed from: I3 */
        public int mo132994I3() {
            return this.f102770x;
        }

        /* renamed from: L0 */
        public float mo132995L0() {
            return this.f102766f;
        }

        /* renamed from: O0 */
        public void mo132996O0(int i) {
            this.f102771y = i;
        }

        /* renamed from: P3 */
        public int mo132997P3() {
            return this.f102772z;
        }

        /* renamed from: R0 */
        public void mo132998R0(boolean z) {
            this.f102764X = z;
        }

        /* renamed from: R2 */
        public void mo132999R2(float f) {
            this.f102766f = f;
        }

        /* renamed from: T1 */
        public boolean mo133000T1() {
            return this.f102764X;
        }

        /* renamed from: U0 */
        public int mo133001U0() {
            return this.f102769w;
        }

        /* renamed from: V3 */
        public void mo133002V3(int i) {
            this.f102767g = i;
        }

        /* renamed from: W2 */
        public void mo133003W2(int i) {
            this.f102769w = i;
        }

        /* renamed from: X2 */
        public int mo133004X2() {
            return this.bottomMargin;
        }

        /* renamed from: b3 */
        public int mo133005b3() {
            return this.leftMargin;
        }

        /* renamed from: c1 */
        public void mo133006c1(int i) {
            this.f102772z = i;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: k2 */
        public int mo133012k2() {
            return this.f102771y;
        }

        /* renamed from: p3 */
        public void mo133013p3(int i) {
            this.height = i;
        }

        /* renamed from: q1 */
        public int mo133014q1() {
            return this.topMargin;
        }

        /* renamed from: s2 */
        public void mo133015s2(float f) {
            this.f102765e = f;
        }

        /* renamed from: w1 */
        public void mo133016w1(int i) {
            this.f102770x = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f102765e);
            parcel.writeFloat(this.f102766f);
            parcel.writeInt(this.f102767g);
            parcel.writeFloat(this.f102768v);
            parcel.writeInt(this.f102769w);
            parcel.writeInt(this.f102770x);
            parcel.writeInt(this.f102771y);
            parcel.writeInt(this.f102772z);
            parcel.writeByte(this.f102764X ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: x2 */
        public void mo133017x2(float f) {
            this.f102768v = f;
        }

        /* renamed from: x3 */
        public void mo133018x3(int i) {
            this.width = i;
        }

        /* renamed from: z1 */
        public float mo133019z1() {
            return this.f102765e;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.C20081p pVar) {
            super(pVar);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.C20081p) layoutParams);
            this.f102765e = layoutParams.f102765e;
            this.f102766f = layoutParams.f102766f;
            this.f102767g = layoutParams.f102767g;
            this.f102768v = layoutParams.f102768v;
            this.f102769w = layoutParams.f102769w;
            this.f102770x = layoutParams.f102770x;
            this.f102771y = layoutParams.f102771y;
            this.f102772z = layoutParams.f102772z;
            this.f102764X = layoutParams.f102764X;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f102765e = parcel.readFloat();
            this.f102766f = parcel.readFloat();
            this.f102767g = parcel.readInt();
            this.f102768v = parcel.readFloat();
            this.f102769w = parcel.readInt();
            this.f102770x = parcel.readInt();
            this.f102771y = parcel.readInt();
            this.f102772z = parcel.readInt();
            this.f102764X = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f102742L0 = -1;
        this.f102745O0 = new ArrayList();
        this.f102746P0 = new C40344h(this);
        this.f102750T0 = new C40335b();
        this.f102754X0 = -1;
        this.f102755Y0 = Integer.MIN_VALUE;
        this.f102756Z0 = Integer.MIN_VALUE;
        this.f102757a1 = Integer.MIN_VALUE;
        this.f102759c1 = new SparseArray<>();
        this.f102762f1 = -1;
        this.f102763g1 = new C40344h.C40346b();
        RecyclerView.C20076o.C20080d v0 = RecyclerView.C20076o.m93539v0(context, attributeSet, i, i2);
        int i3 = v0.f51590a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (v0.f51592c) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (v0.f51592c) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        this.f102760d1 = context;
    }
}
