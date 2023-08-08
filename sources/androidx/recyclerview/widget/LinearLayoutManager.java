package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.C19234h0;
import androidx.recyclerview.widget.C20190n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

public class LinearLayoutManager extends RecyclerView.C20076o implements C20190n.C20203j, RecyclerView.C20051a0.C20053b {

    /* renamed from: X0 */
    public static final String f51328X0 = "LinearLayoutManager";

    /* renamed from: Y0 */
    public static final boolean f51329Y0 = false;

    /* renamed from: Z0 */
    public static final int f51330Z0 = 0;

    /* renamed from: a1 */
    public static final int f51331a1 = 1;

    /* renamed from: b1 */
    public static final int f51332b1 = Integer.MIN_VALUE;

    /* renamed from: c1 */
    public static final float f51333c1 = 0.33333334f;

    /* renamed from: H0 */
    public int f51334H0;

    /* renamed from: I0 */
    public C20048c f51335I0;

    /* renamed from: J0 */
    public C20224y f51336J0;

    /* renamed from: K0 */
    public boolean f51337K0;

    /* renamed from: L0 */
    public boolean f51338L0;

    /* renamed from: M0 */
    public boolean f51339M0;

    /* renamed from: N0 */
    public boolean f51340N0;

    /* renamed from: O0 */
    public boolean f51341O0;

    /* renamed from: P0 */
    public int f51342P0;

    /* renamed from: Q0 */
    public int f51343Q0;

    /* renamed from: R0 */
    public boolean f51344R0;

    /* renamed from: S0 */
    public SavedState f51345S0;

    /* renamed from: T0 */
    public final C20046a f51346T0;

    /* renamed from: U0 */
    public final C20047b f51347U0;

    /* renamed from: V0 */
    public int f51348V0;

    /* renamed from: W0 */
    public int[] f51349W0;

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20045a();

        /* renamed from: a */
        public int f51350a;

        /* renamed from: b */
        public int f51351b;

        /* renamed from: c */
        public boolean f51352c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C20045a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        public boolean mo59438a() {
            return this.f51350a >= 0;
        }

        /* renamed from: b */
        public void mo59439b() {
            this.f51350a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f51350a);
            parcel.writeInt(this.f51351b);
            parcel.writeInt(this.f51352c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f51350a = parcel.readInt();
            this.f51351b = parcel.readInt();
            this.f51352c = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f51350a = savedState.f51350a;
            this.f51351b = savedState.f51351b;
            this.f51352c = savedState.f51352c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C20046a {

        /* renamed from: a */
        public C20224y f51353a;

        /* renamed from: b */
        public int f51354b;

        /* renamed from: c */
        public int f51355c;

        /* renamed from: d */
        public boolean f51356d;

        /* renamed from: e */
        public boolean f51357e;

        public C20046a() {
            mo59450e();
        }

        /* renamed from: a */
        public void mo59446a() {
            int i;
            if (this.f51356d) {
                i = this.f51353a.mo60700i();
            } else {
                i = this.f51353a.mo60705n();
            }
            this.f51355c = i;
        }

        /* renamed from: b */
        public void mo59447b(View view, int i) {
            if (this.f51356d) {
                this.f51355c = this.f51353a.mo60695d(view) + this.f51353a.mo60707p();
            } else {
                this.f51355c = this.f51353a.mo60698g(view);
            }
            this.f51354b = i;
        }

        /* renamed from: c */
        public void mo59448c(View view, int i) {
            int p = this.f51353a.mo60707p();
            if (p >= 0) {
                mo59447b(view, i);
                return;
            }
            this.f51354b = i;
            if (this.f51356d) {
                int i2 = (this.f51353a.mo60700i() - p) - this.f51353a.mo60695d(view);
                this.f51355c = this.f51353a.mo60700i() - i2;
                if (i2 > 0) {
                    int e = this.f51355c - this.f51353a.mo60696e(view);
                    int n = this.f51353a.mo60705n();
                    int min = e - (n + Math.min(this.f51353a.mo60698g(view) - n, 0));
                    if (min < 0) {
                        this.f51355c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f51353a.mo60698g(view);
            int n2 = g - this.f51353a.mo60705n();
            this.f51355c = g;
            if (n2 > 0) {
                int i3 = (this.f51353a.mo60700i() - Math.min(0, (this.f51353a.mo60700i() - p) - this.f51353a.mo60695d(view))) - (g + this.f51353a.mo60696e(view));
                if (i3 < 0) {
                    this.f51355c -= Math.min(n2, -i3);
                }
            }
        }

        /* renamed from: d */
        public boolean mo59449d(View view, RecyclerView.C20055b0 b0Var) {
            RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
            if (pVar.mo59998g() || pVar.mo59995d() < 0 || pVar.mo59995d() >= b0Var.mo59729d()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public void mo59450e() {
            this.f51354b = -1;
            this.f51355c = Integer.MIN_VALUE;
            this.f51356d = false;
            this.f51357e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f51354b + ", mCoordinate=" + this.f51355c + ", mLayoutFromEnd=" + this.f51356d + ", mValid=" + this.f51357e + C12361b.f30259j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C20047b {

        /* renamed from: a */
        public int f51358a;

        /* renamed from: b */
        public boolean f51359b;

        /* renamed from: c */
        public boolean f51360c;

        /* renamed from: d */
        public boolean f51361d;

        /* renamed from: a */
        public void mo59452a() {
            this.f51358a = 0;
            this.f51359b = false;
            this.f51360c = false;
            this.f51361d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C20048c {

        /* renamed from: n */
        public static final String f51362n = "LLM#LayoutState";

        /* renamed from: o */
        public static final int f51363o = -1;

        /* renamed from: p */
        public static final int f51364p = 1;

        /* renamed from: q */
        public static final int f51365q = Integer.MIN_VALUE;

        /* renamed from: r */
        public static final int f51366r = -1;

        /* renamed from: s */
        public static final int f51367s = 1;

        /* renamed from: t */
        public static final int f51368t = Integer.MIN_VALUE;

        /* renamed from: a */
        public boolean f51369a = true;

        /* renamed from: b */
        public int f51370b;

        /* renamed from: c */
        public int f51371c;

        /* renamed from: d */
        public int f51372d;

        /* renamed from: e */
        public int f51373e;

        /* renamed from: f */
        public int f51374f;

        /* renamed from: g */
        public int f51375g;

        /* renamed from: h */
        public int f51376h = 0;

        /* renamed from: i */
        public int f51377i = 0;

        /* renamed from: j */
        public boolean f51378j = false;

        /* renamed from: k */
        public int f51379k;

        /* renamed from: l */
        public List<RecyclerView.C20061e0> f51380l = null;

        /* renamed from: m */
        public boolean f51381m;

        /* renamed from: a */
        public void mo59453a() {
            mo59454b((View) null);
        }

        /* renamed from: b */
        public void mo59454b(View view) {
            View g = mo59459g(view);
            if (g == null) {
                this.f51372d = -1;
            } else {
                this.f51372d = ((RecyclerView.C20081p) g.getLayoutParams()).mo59995d();
            }
        }

        /* renamed from: c */
        public boolean mo59455c(RecyclerView.C20055b0 b0Var) {
            int i = this.f51372d;
            return i >= 0 && i < b0Var.mo59729d();
        }

        /* renamed from: d */
        public void mo59456d() {
            StringBuilder sb = new StringBuilder();
            sb.append("avail:");
            sb.append(this.f51371c);
            sb.append(", ind:");
            sb.append(this.f51372d);
            sb.append(", dir:");
            sb.append(this.f51373e);
            sb.append(", offset:");
            sb.append(this.f51370b);
            sb.append(", layoutDir:");
            sb.append(this.f51374f);
        }

        /* renamed from: e */
        public View mo59457e(RecyclerView.C20089w wVar) {
            if (this.f51380l != null) {
                return mo59458f();
            }
            View p = wVar.mo60049p(this.f51372d);
            this.f51372d += this.f51373e;
            return p;
        }

        /* renamed from: f */
        public final View mo59458f() {
            int size = this.f51380l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f51380l.get(i).itemView;
                RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
                if (!pVar.mo59998g() && this.f51372d == pVar.mo59995d()) {
                    mo59454b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: g */
        public View mo59459g(View view) {
            int d;
            int size = this.f51380l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f51380l.get(i2).itemView;
                RecyclerView.C20081p pVar = (RecyclerView.C20081p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo59998g() && (d = (pVar.mo59995d() - this.f51372d) * this.f51373e) >= 0 && d < i) {
                    view2 = view3;
                    if (d == 0) {
                        break;
                    }
                    i = d;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: A */
    public void mo59364A(int i, RecyclerView.C20076o.C20079c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f51345S0;
        int i3 = -1;
        if (savedState == null || !savedState.mo59438a()) {
            mo59396b3();
            z = this.f51339M0;
            i2 = this.f51342P0;
            if (i2 == -1) {
                if (z) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            SavedState savedState2 = this.f51345S0;
            z = savedState2.f51352c;
            i2 = savedState2.f51350a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f51348V0 && i2 >= 0 && i2 < i; i4++) {
            cVar.mo59991a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: A2 */
    public int mo59365A2() {
        View C2 = mo59368C2(mo59922Y() - 1, -1, false, true);
        if (C2 == null) {
            return -1;
        }
        return mo59978u0(C2);
    }

    /* renamed from: B */
    public int mo59366B(RecyclerView.C20055b0 b0Var) {
        return mo59411m2(b0Var);
    }

    /* renamed from: B2 */
    public View mo59367B2(int i, int i2) {
        char c;
        int i3;
        int i4;
        mo59422r2();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return mo59919X(i);
        }
        if (this.f51336J0.mo60698g(mo59919X(i)) < this.f51336J0.mo60705n()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = C19234h0.f49479I;
        }
        if (this.f51334H0 == 0) {
            return this.f51580e.mo60486a(i, i2, i4, i3);
        }
        return this.f51581f.mo60486a(i, i2, i4, i3);
    }

    /* renamed from: C */
    public int mo59303C(RecyclerView.C20055b0 b0Var) {
        return mo59413n2(b0Var);
    }

    /* renamed from: C2 */
    public View mo59368C2(int i, int i2, boolean z, boolean z2) {
        int i3;
        mo59422r2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f51334H0 == 0) {
            return this.f51580e.mo60486a(i, i2, i3, i4);
        }
        return this.f51581f.mo60486a(i, i2, i3, i4);
    }

    /* renamed from: D */
    public int mo59305D(RecyclerView.C20055b0 b0Var) {
        return mo59415o2(b0Var);
    }

    /* renamed from: D2 */
    public final View mo59369D2() {
        if (this.f51339M0) {
            return mo59427u2();
        }
        return mo59437z2();
    }

    /* renamed from: E */
    public int mo59370E(RecyclerView.C20055b0 b0Var) {
        return mo59411m2(b0Var);
    }

    /* renamed from: E2 */
    public final View mo59371E2() {
        if (this.f51339M0) {
            return mo59437z2();
        }
        return mo59427u2();
    }

    /* renamed from: F */
    public int mo59308F(RecyclerView.C20055b0 b0Var) {
        return mo59413n2(b0Var);
    }

    /* renamed from: F2 */
    public View mo59309F2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        mo59422r2();
        int Y = mo59922Y();
        if (z2) {
            i3 = mo59922Y() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = Y;
            i3 = 0;
            i = 1;
        }
        int d = b0Var.mo59729d();
        int n = this.f51336J0.mo60705n();
        int i4 = this.f51336J0.mo60700i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View X = mo59919X(i3);
            int u0 = mo59978u0(X);
            int g = this.f51336J0.mo60698g(X);
            int d2 = this.f51336J0.mo60695d(X);
            if (u0 >= 0 && u0 < d) {
                if (!((RecyclerView.C20081p) X.getLayoutParams()).mo59998g()) {
                    if (d2 > n || g >= n) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (g < i4 || d2 <= i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z3 && !z4) {
                        return X;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = X;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = X;
                    }
                    view2 = X;
                } else if (view3 == null) {
                    view3 = X;
                }
            }
            i3 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    /* renamed from: G */
    public int mo59311G(RecyclerView.C20055b0 b0Var) {
        return mo59415o2(b0Var);
    }

    /* renamed from: G2 */
    public final int mo59372G2(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z) {
        int i2;
        int i3 = this.f51336J0.mo60700i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo59397c3(-i3, wVar, b0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f51336J0.mo60700i() - i5) <= 0) {
            return i4;
        }
        this.f51336J0.mo60711t(i2);
        return i2 + i4;
    }

    /* renamed from: H0 */
    public boolean mo59373H0() {
        return true;
    }

    /* renamed from: H2 */
    public final int mo59374H2(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z) {
        int n;
        int n2 = i - this.f51336J0.mo60705n();
        if (n2 <= 0) {
            return 0;
        }
        int i2 = -mo59397c3(n2, wVar, b0Var);
        int i3 = i + i2;
        if (!z || (n = i3 - this.f51336J0.mo60705n()) <= 0) {
            return i2;
        }
        this.f51336J0.mo60711t(-n);
        return i2 - n;
    }

    /* renamed from: I2 */
    public final View mo59375I2() {
        return mo59919X(this.f51339M0 ? 0 : mo59922Y() - 1);
    }

    /* renamed from: J2 */
    public final View mo59376J2() {
        return mo59919X(this.f51339M0 ? mo59922Y() - 1 : 0);
    }

    @Deprecated
    /* renamed from: K2 */
    public int mo59377K2(RecyclerView.C20055b0 b0Var) {
        if (b0Var.mo59733h()) {
            return this.f51336J0.mo60706o();
        }
        return 0;
    }

    /* renamed from: L2 */
    public int mo59378L2() {
        return this.f51348V0;
    }

    /* renamed from: M2 */
    public int mo59379M2() {
        return this.f51334H0;
    }

    /* renamed from: N2 */
    public boolean mo59380N2() {
        return this.f51344R0;
    }

    /* renamed from: O2 */
    public boolean mo59381O2() {
        return this.f51338L0;
    }

    /* renamed from: P2 */
    public boolean mo59382P2() {
        return this.f51340N0;
    }

    /* renamed from: Q1 */
    public int mo59322Q1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (this.f51334H0 == 1) {
            return 0;
        }
        return mo59397c3(i, wVar, b0Var);
    }

    /* renamed from: Q2 */
    public boolean mo59383Q2() {
        return mo59966q0() == 1;
    }

    /* renamed from: R */
    public View mo59384R(int i) {
        int Y = mo59922Y();
        if (Y == 0) {
            return null;
        }
        int u0 = i - mo59978u0(mo59919X(0));
        if (u0 >= 0 && u0 < Y) {
            View X = mo59919X(u0);
            if (mo59978u0(X) == i) {
                return X;
            }
        }
        return super.mo59384R(i);
    }

    /* renamed from: R1 */
    public void mo59385R1(int i) {
        this.f51342P0 = i;
        this.f51343Q0 = Integer.MIN_VALUE;
        SavedState savedState = this.f51345S0;
        if (savedState != null) {
            savedState.mo59439b();
        }
        mo59898N1();
    }

    /* renamed from: R2 */
    public boolean mo59386R2() {
        return this.f51341O0;
    }

    /* renamed from: S */
    public RecyclerView.C20081p mo59323S() {
        return new RecyclerView.C20081p(-2, -2);
    }

    /* renamed from: S1 */
    public int mo59324S1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (this.f51334H0 == 0) {
            return 0;
        }
        return mo59397c3(i, wVar, b0Var);
    }

    /* renamed from: S2 */
    public void mo59325S2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, C20048c cVar, C20047b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View e = cVar.mo59457e(wVar);
        if (e == null) {
            bVar.f51359b = true;
            return;
        }
        RecyclerView.C20081p pVar = (RecyclerView.C20081p) e.getLayoutParams();
        if (cVar.f51380l == null) {
            boolean z3 = this.f51339M0;
            if (cVar.f51374f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(e);
            } else {
                addView(e, 0);
            }
        } else {
            boolean z4 = this.f51339M0;
            if (cVar.f51374f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                mo59957m(e);
            } else {
                mo59959n(e, 0);
            }
        }
        mo59909T0(e, 0, 0);
        bVar.f51358a = this.f51336J0.mo60696e(e);
        if (this.f51334H0 == 1) {
            if (mo59383Q2()) {
                i5 = mo59868B0() - getPaddingRight();
                i4 = i5 - this.f51336J0.mo60697f(e);
            } else {
                i4 = getPaddingLeft();
                i5 = this.f51336J0.mo60697f(e) + i4;
            }
            if (cVar.f51374f == -1) {
                int i6 = cVar.f51370b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f51358a;
            } else {
                int i7 = cVar.f51370b;
                i3 = i7;
                i2 = i5;
                i = bVar.f51358a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.f51336J0.mo60697f(e) + paddingTop;
            if (cVar.f51374f == -1) {
                int i8 = cVar.f51370b;
                i2 = i8;
                i3 = paddingTop;
                i = f;
                i4 = i8 - bVar.f51358a;
            } else {
                int i9 = cVar.f51370b;
                i3 = paddingTop;
                i2 = bVar.f51358a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo59907R0(e, i4, i3, i2, i);
        if (pVar.mo59998g() || pVar.mo59997f()) {
            bVar.f51360c = true;
        }
        bVar.f51361d = e.hasFocusable();
    }

    /* renamed from: T2 */
    public final void mo59387T2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, int i, int i2) {
        boolean z;
        RecyclerView.C20089w wVar2 = wVar;
        RecyclerView.C20055b0 b0Var2 = b0Var;
        if (b0Var.mo59739n() && mo59922Y() != 0 && !b0Var.mo59735j() && mo59333j2()) {
            List<RecyclerView.C20061e0> l = wVar.mo60045l();
            int size = l.size();
            int u0 = mo59978u0(mo59919X(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C20061e0 e0Var = l.get(i5);
                if (!e0Var.isRemoved()) {
                    boolean z2 = true;
                    if (e0Var.getLayoutPosition() < u0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f51339M0) {
                        z2 = true;
                    }
                    if (z2) {
                        i3 += this.f51336J0.mo60696e(e0Var.itemView);
                    } else {
                        i4 += this.f51336J0.mo60696e(e0Var.itemView);
                    }
                }
            }
            this.f51335I0.f51380l = l;
            if (i3 > 0) {
                mo59421q3(mo59978u0(mo59376J2()), i);
                C20048c cVar = this.f51335I0;
                cVar.f51376h = i3;
                cVar.f51371c = 0;
                cVar.mo59453a();
                mo59424s2(wVar2, this.f51335I0, b0Var2, false);
            }
            if (i4 > 0) {
                mo59416o3(mo59978u0(mo59375I2()), i2);
                C20048c cVar2 = this.f51335I0;
                cVar2.f51376h = i4;
                cVar2.f51371c = 0;
                cVar2.mo59453a();
                mo59424s2(wVar2, this.f51335I0, b0Var2, false);
            }
            this.f51335I0.f51380l = null;
        }
    }

    /* renamed from: U2 */
    public final void mo59388U2() {
        for (int i = 0; i < mo59922Y(); i++) {
            View X = mo59919X(i);
            StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(mo59978u0(X));
            sb.append(", coord:");
            sb.append(this.f51336J0.mo60698g(X));
        }
    }

    /* renamed from: V2 */
    public void mo59328V2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, C20046a aVar, int i) {
    }

    /* renamed from: W2 */
    public final void mo59389W2(RecyclerView.C20089w wVar, C20048c cVar) {
        if (cVar.f51369a && !cVar.f51381m) {
            int i = cVar.f51375g;
            int i2 = cVar.f51377i;
            if (cVar.f51374f == -1) {
                mo59391Y2(wVar, i, i2);
            } else {
                mo59392Z2(wVar, i, i2);
            }
        }
    }

    /* renamed from: X2 */
    public final void mo59390X2(RecyclerView.C20089w wVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo59881H1(i3, wVar);
                }
                return;
            }
            while (i > i2) {
                mo59881H1(i, wVar);
                i--;
            }
        }
    }

    /* renamed from: Y2 */
    public final void mo59391Y2(RecyclerView.C20089w wVar, int i, int i2) {
        int Y = mo59922Y();
        if (i >= 0) {
            int h = (this.f51336J0.mo60699h() - i) + i2;
            if (this.f51339M0) {
                for (int i3 = 0; i3 < Y; i3++) {
                    View X = mo59919X(i3);
                    if (this.f51336J0.mo60698g(X) < h || this.f51336J0.mo60709r(X) < h) {
                        mo59390X2(wVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = Y - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View X2 = mo59919X(i5);
                if (this.f51336J0.mo60698g(X2) < h || this.f51336J0.mo60709r(X2) < h) {
                    mo59390X2(wVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: Z2 */
    public final void mo59392Z2(RecyclerView.C20089w wVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int Y = mo59922Y();
            if (this.f51339M0) {
                int i4 = Y - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View X = mo59919X(i5);
                    if (this.f51336J0.mo60695d(X) > i3 || this.f51336J0.mo60708q(X) > i3) {
                        mo59390X2(wVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < Y; i6++) {
                View X2 = mo59919X(i6);
                if (this.f51336J0.mo60695d(X2) > i3 || this.f51336J0.mo60708q(X2) > i3) {
                    mo59390X2(wVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public PointF mo59393a(int i) {
        if (mo59922Y() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo59978u0(mo59919X(0))) {
            z = true;
        }
        if (z != this.f51339M0) {
            i2 = -1;
        }
        if (this.f51334H0 == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: a3 */
    public boolean mo59394a3() {
        if (this.f51336J0.mo60703l() == 0 && this.f51336J0.mo60699h() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b1 */
    public void mo59395b1(RecyclerView recyclerView, RecyclerView.C20089w wVar) {
        super.mo59395b1(recyclerView, wVar);
        if (this.f51344R0) {
            mo59875E1(wVar);
            wVar.mo60037d();
        }
    }

    /* renamed from: b3 */
    public final void mo59396b3() {
        if (this.f51334H0 == 1 || !mo59383Q2()) {
            this.f51339M0 = this.f51338L0;
        } else {
            this.f51339M0 = !this.f51338L0;
        }
    }

    /* renamed from: c1 */
    public View mo59330c1(View view, int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        int p2;
        View view2;
        View view3;
        mo59396b3();
        if (mo59922Y() == 0 || (p2 = mo59417p2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo59422r2();
        mo59414n3(p2, (int) (((float) this.f51336J0.mo60706o()) * 0.33333334f), false, b0Var);
        C20048c cVar = this.f51335I0;
        cVar.f51375g = Integer.MIN_VALUE;
        cVar.f51369a = false;
        mo59424s2(wVar, cVar, b0Var, true);
        if (p2 == -1) {
            view2 = mo59371E2();
        } else {
            view2 = mo59369D2();
        }
        if (p2 == -1) {
            view3 = mo59376J2();
        } else {
            view3 = mo59375I2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: c3 */
    public int mo59397c3(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        int i2;
        if (mo59922Y() == 0 || i == 0) {
            return 0;
        }
        mo59422r2();
        this.f51335I0.f51369a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        mo59414n3(i2, abs, true, b0Var);
        C20048c cVar = this.f51335I0;
        int s2 = cVar.f51375g + mo59424s2(wVar, cVar, b0Var, false);
        if (s2 < 0) {
            return 0;
        }
        if (abs > s2) {
            i = i2 * s2;
        }
        this.f51336J0.mo60711t(-i);
        this.f51335I0.f51379k = i;
        return i;
    }

    /* renamed from: d */
    public void mo59398d(@C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        boolean z;
        mo59419q("Cannot drop a view during a scroll or layout calculation");
        mo59422r2();
        mo59396b3();
        int u0 = mo59978u0(view);
        int u02 = mo59978u0(view2);
        if (u0 < u02) {
            z = true;
        } else {
            z = true;
        }
        if (this.f51339M0) {
            if (z) {
                mo59401d3(u02, this.f51336J0.mo60700i() - (this.f51336J0.mo60698g(view2) + this.f51336J0.mo60696e(view)));
            } else {
                mo59401d3(u02, this.f51336J0.mo60700i() - this.f51336J0.mo60695d(view2));
            }
        } else if (z) {
            mo59401d3(u02, this.f51336J0.mo60698g(view2));
        } else {
            mo59401d3(u02, this.f51336J0.mo60695d(view2) - this.f51336J0.mo60696e(view));
        }
    }

    /* renamed from: d1 */
    public void mo59399d1(AccessibilityEvent accessibilityEvent) {
        super.mo59399d1(accessibilityEvent);
        if (mo59922Y() > 0) {
            accessibilityEvent.setFromIndex(mo59434x2());
            accessibilityEvent.setToIndex(mo59365A2());
        }
    }

    /* renamed from: d2 */
    public boolean mo59400d2() {
        if (mo59960n0() == 1073741824 || mo59870C0() == 1073741824 || !mo59872D0()) {
            return false;
        }
        return true;
    }

    /* renamed from: d3 */
    public void mo59401d3(int i, int i2) {
        this.f51342P0 = i;
        this.f51343Q0 = i2;
        SavedState savedState = this.f51345S0;
        if (savedState != null) {
            savedState.mo59439b();
        }
        mo59898N1();
    }

    /* renamed from: e3 */
    public void mo59402e3(int i) {
        this.f51348V0 = i;
    }

    /* renamed from: f2 */
    public void mo59403f2(RecyclerView recyclerView, RecyclerView.C20055b0 b0Var, int i) {
        C20207r rVar = new C20207r(recyclerView.getContext());
        rVar.mo59709q(i);
        mo59941g2(rVar);
    }

    /* renamed from: f3 */
    public void mo59404f3(int i) {
        if (i == 0 || i == 1) {
            mo59419q((String) null);
            if (i != this.f51334H0 || this.f51336J0 == null) {
                C20224y b = C20224y.m94589b(this, i);
                this.f51336J0 = b;
                this.f51346T0.f51353a = b;
                this.f51334H0 = i;
                mo59898N1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: g3 */
    public void mo59405g3(boolean z) {
        this.f51344R0 = z;
    }

    /* renamed from: h3 */
    public void mo59406h3(boolean z) {
        mo59419q((String) null);
        if (z != this.f51338L0) {
            this.f51338L0 = z;
            mo59898N1();
        }
    }

    /* renamed from: i3 */
    public void mo59407i3(boolean z) {
        this.f51341O0 = z;
    }

    /* renamed from: j2 */
    public boolean mo59333j2() {
        return this.f51345S0 == null && this.f51337K0 == this.f51340N0;
    }

    /* renamed from: j3 */
    public void mo59334j3(boolean z) {
        mo59419q((String) null);
        if (this.f51340N0 != z) {
            this.f51340N0 = z;
            mo59898N1();
        }
    }

    /* renamed from: k2 */
    public void mo59408k2(@C0359n0 RecyclerView.C20055b0 b0Var, @C0359n0 int[] iArr) {
        int i;
        int K2 = mo59377K2(b0Var);
        if (this.f51335I0.f51374f == -1) {
            i = 0;
        } else {
            i = K2;
            K2 = 0;
        }
        iArr[0] = K2;
        iArr[1] = i;
    }

    /* renamed from: k3 */
    public final boolean mo59409k3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, C20046a aVar) {
        View F2;
        boolean z;
        boolean z2 = false;
        if (mo59922Y() == 0) {
            return false;
        }
        View l0 = mo59956l0();
        if (l0 == null || !aVar.mo59449d(l0, b0Var)) {
            boolean z3 = this.f51337K0;
            boolean z4 = this.f51340N0;
            if (z3 != z4 || (F2 = mo59309F2(wVar, b0Var, aVar.f51356d, z4)) == null) {
                return false;
            }
            aVar.mo59447b(F2, mo59978u0(F2));
            if (!b0Var.mo59735j() && mo59333j2()) {
                int g = this.f51336J0.mo60698g(F2);
                int d = this.f51336J0.mo60695d(F2);
                int n = this.f51336J0.mo60705n();
                int i = this.f51336J0.mo60700i();
                if (d > n || g >= n) {
                    z = false;
                } else {
                    z = true;
                }
                if (g >= i && d > i) {
                    z2 = true;
                }
                if (z || z2) {
                    if (aVar.f51356d) {
                        n = i;
                    }
                    aVar.f51355c = n;
                }
            }
            return true;
        }
        aVar.mo59448c(l0, mo59978u0(l0));
        return true;
    }

    /* renamed from: l2 */
    public void mo59337l2(RecyclerView.C20055b0 b0Var, C20048c cVar, RecyclerView.C20076o.C20079c cVar2) {
        int i = cVar.f51372d;
        if (i >= 0 && i < b0Var.mo59729d()) {
            cVar2.mo59991a(i, Math.max(0, cVar.f51375g));
        }
    }

    /* renamed from: l3 */
    public final boolean mo59410l3(RecyclerView.C20055b0 b0Var, C20046a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!b0Var.mo59735j() && (i = this.f51342P0) != -1) {
            if (i < 0 || i >= b0Var.mo59729d()) {
                this.f51342P0 = -1;
                this.f51343Q0 = Integer.MIN_VALUE;
            } else {
                aVar.f51354b = this.f51342P0;
                SavedState savedState = this.f51345S0;
                if (savedState != null && savedState.mo59438a()) {
                    boolean z3 = this.f51345S0.f51352c;
                    aVar.f51356d = z3;
                    if (z3) {
                        aVar.f51355c = this.f51336J0.mo60700i() - this.f51345S0.f51351b;
                    } else {
                        aVar.f51355c = this.f51336J0.mo60705n() + this.f51345S0.f51351b;
                    }
                    return true;
                } else if (this.f51343Q0 == Integer.MIN_VALUE) {
                    View R = mo59384R(this.f51342P0);
                    if (R == null) {
                        if (mo59922Y() > 0) {
                            if (this.f51342P0 < mo59978u0(mo59919X(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f51339M0) {
                                z2 = true;
                            }
                            aVar.f51356d = z2;
                        }
                        aVar.mo59446a();
                    } else if (this.f51336J0.mo60696e(R) > this.f51336J0.mo60706o()) {
                        aVar.mo59446a();
                        return true;
                    } else if (this.f51336J0.mo60698g(R) - this.f51336J0.mo60705n() < 0) {
                        aVar.f51355c = this.f51336J0.mo60705n();
                        aVar.f51356d = false;
                        return true;
                    } else if (this.f51336J0.mo60700i() - this.f51336J0.mo60695d(R) < 0) {
                        aVar.f51355c = this.f51336J0.mo60700i();
                        aVar.f51356d = true;
                        return true;
                    } else {
                        if (aVar.f51356d) {
                            i2 = this.f51336J0.mo60695d(R) + this.f51336J0.mo60707p();
                        } else {
                            i2 = this.f51336J0.mo60698g(R);
                        }
                        aVar.f51355c = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.f51339M0;
                    aVar.f51356d = z4;
                    if (z4) {
                        aVar.f51355c = this.f51336J0.mo60700i() - this.f51343Q0;
                    } else {
                        aVar.f51355c = this.f51336J0.mo60705n() + this.f51343Q0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m2 */
    public final int mo59411m2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        mo59422r2();
        C20224y yVar = this.f51336J0;
        View w2 = mo59433w2(!this.f51341O0, true);
        return C20105b0.m94002a(b0Var, yVar, w2, mo59430v2(!this.f51341O0, true), this, this.f51341O0);
    }

    /* renamed from: m3 */
    public final void mo59412m3(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, C20046a aVar) {
        int i;
        if (!mo59410l3(b0Var, aVar) && !mo59409k3(wVar, b0Var, aVar)) {
            aVar.mo59446a();
            if (this.f51340N0) {
                i = b0Var.mo59729d() - 1;
            } else {
                i = 0;
            }
            aVar.f51354b = i;
        }
    }

    /* renamed from: n2 */
    public final int mo59413n2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        mo59422r2();
        C20224y yVar = this.f51336J0;
        View w2 = mo59433w2(!this.f51341O0, true);
        return C20105b0.m94003b(b0Var, yVar, w2, mo59430v2(!this.f51341O0, true), this, this.f51341O0, this.f51339M0);
    }

    /* renamed from: n3 */
    public final void mo59414n3(int i, int i2, boolean z, RecyclerView.C20055b0 b0Var) {
        int i3;
        int i4;
        this.f51335I0.f51381m = mo59394a3();
        this.f51335I0.f51374f = i;
        int[] iArr = this.f51349W0;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        mo59408k2(b0Var, iArr);
        int max = Math.max(0, this.f51349W0[0]);
        int max2 = Math.max(0, this.f51349W0[1]);
        if (i == 1) {
            z2 = true;
        }
        C20048c cVar = this.f51335I0;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f51376h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.f51377i = max;
        if (z2) {
            cVar.f51376h = i3 + this.f51336J0.mo60701j();
            View I2 = mo59375I2();
            C20048c cVar2 = this.f51335I0;
            if (this.f51339M0) {
                i5 = -1;
            }
            cVar2.f51373e = i5;
            int u0 = mo59978u0(I2);
            C20048c cVar3 = this.f51335I0;
            cVar2.f51372d = u0 + cVar3.f51373e;
            cVar3.f51370b = this.f51336J0.mo60695d(I2);
            i4 = this.f51336J0.mo60695d(I2) - this.f51336J0.mo60700i();
        } else {
            View J2 = mo59376J2();
            this.f51335I0.f51376h += this.f51336J0.mo60705n();
            C20048c cVar4 = this.f51335I0;
            if (!this.f51339M0) {
                i5 = -1;
            }
            cVar4.f51373e = i5;
            int u02 = mo59978u0(J2);
            C20048c cVar5 = this.f51335I0;
            cVar4.f51372d = u02 + cVar5.f51373e;
            cVar5.f51370b = this.f51336J0.mo60698g(J2);
            i4 = (-this.f51336J0.mo60698g(J2)) + this.f51336J0.mo60705n();
        }
        C20048c cVar6 = this.f51335I0;
        cVar6.f51371c = i2;
        if (z) {
            cVar6.f51371c = i2 - i4;
        }
        cVar6.f51375g = i4;
    }

    /* renamed from: o2 */
    public final int mo59415o2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        mo59422r2();
        C20224y yVar = this.f51336J0;
        View w2 = mo59433w2(!this.f51341O0, true);
        return C20105b0.m94004c(b0Var, yVar, w2, mo59430v2(!this.f51341O0, true), this, this.f51341O0);
    }

    /* renamed from: o3 */
    public final void mo59416o3(int i, int i2) {
        int i3;
        this.f51335I0.f51371c = this.f51336J0.mo60700i() - i2;
        C20048c cVar = this.f51335I0;
        if (this.f51339M0) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f51373e = i3;
        cVar.f51372d = i;
        cVar.f51374f = 1;
        cVar.f51370b = i2;
        cVar.f51375g = Integer.MIN_VALUE;
    }

    /* renamed from: p2 */
    public int mo59417p2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f51334H0 == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f51334H0 == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f51334H0 == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f51334H0 == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f51334H0 != 1 && mo59383Q2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f51334H0 != 1 && mo59383Q2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: p3 */
    public final void mo59418p3(C20046a aVar) {
        mo59416o3(aVar.f51354b, aVar.f51355c);
    }

    /* renamed from: q */
    public void mo59419q(String str) {
        if (this.f51345S0 == null) {
            super.mo59419q(str);
        }
    }

    /* renamed from: q1 */
    public void mo59341q1(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View R;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f51345S0 == null && this.f51342P0 == -1) && b0Var.mo59729d() == 0) {
            mo59875E1(wVar);
            return;
        }
        SavedState savedState = this.f51345S0;
        if (savedState != null && savedState.mo59438a()) {
            this.f51342P0 = this.f51345S0.f51350a;
        }
        mo59422r2();
        this.f51335I0.f51369a = false;
        mo59396b3();
        View l0 = mo59956l0();
        C20046a aVar = this.f51346T0;
        if (!aVar.f51357e || this.f51342P0 != -1 || this.f51345S0 != null) {
            aVar.mo59450e();
            C20046a aVar2 = this.f51346T0;
            aVar2.f51356d = this.f51339M0 ^ this.f51340N0;
            mo59412m3(wVar, b0Var, aVar2);
            this.f51346T0.f51357e = true;
        } else if (l0 != null && (this.f51336J0.mo60698g(l0) >= this.f51336J0.mo60700i() || this.f51336J0.mo60695d(l0) <= this.f51336J0.mo60705n())) {
            this.f51346T0.mo59448c(l0, mo59978u0(l0));
        }
        C20048c cVar = this.f51335I0;
        if (cVar.f51379k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f51374f = i;
        int[] iArr = this.f51349W0;
        iArr[0] = 0;
        iArr[1] = 0;
        mo59408k2(b0Var, iArr);
        int max = Math.max(0, this.f51349W0[0]) + this.f51336J0.mo60705n();
        int max2 = Math.max(0, this.f51349W0[1]) + this.f51336J0.mo60701j();
        if (!(!b0Var.mo59735j() || (i7 = this.f51342P0) == -1 || this.f51343Q0 == Integer.MIN_VALUE || (R = mo59384R(i7)) == null)) {
            if (this.f51339M0) {
                i8 = this.f51336J0.mo60700i() - this.f51336J0.mo60695d(R);
                i9 = this.f51343Q0;
            } else {
                i9 = this.f51336J0.mo60698g(R) - this.f51336J0.mo60705n();
                i8 = this.f51343Q0;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        C20046a aVar3 = this.f51346T0;
        if (!aVar3.f51356d ? !this.f51339M0 : this.f51339M0) {
            i10 = 1;
        }
        mo59328V2(wVar, b0Var, aVar3, i10);
        mo59880H(wVar);
        this.f51335I0.f51381m = mo59394a3();
        this.f51335I0.f51378j = b0Var.mo59735j();
        this.f51335I0.f51377i = 0;
        C20046a aVar4 = this.f51346T0;
        if (aVar4.f51356d) {
            mo59423r3(aVar4);
            C20048c cVar2 = this.f51335I0;
            cVar2.f51376h = max;
            mo59424s2(wVar, cVar2, b0Var, false);
            C20048c cVar3 = this.f51335I0;
            i3 = cVar3.f51370b;
            int i12 = cVar3.f51372d;
            int i13 = cVar3.f51371c;
            if (i13 > 0) {
                max2 += i13;
            }
            mo59418p3(this.f51346T0);
            C20048c cVar4 = this.f51335I0;
            cVar4.f51376h = max2;
            cVar4.f51372d += cVar4.f51373e;
            mo59424s2(wVar, cVar4, b0Var, false);
            C20048c cVar5 = this.f51335I0;
            i2 = cVar5.f51370b;
            int i14 = cVar5.f51371c;
            if (i14 > 0) {
                mo59421q3(i12, i3);
                C20048c cVar6 = this.f51335I0;
                cVar6.f51376h = i14;
                mo59424s2(wVar, cVar6, b0Var, false);
                i3 = this.f51335I0.f51370b;
            }
        } else {
            mo59418p3(aVar4);
            C20048c cVar7 = this.f51335I0;
            cVar7.f51376h = max2;
            mo59424s2(wVar, cVar7, b0Var, false);
            C20048c cVar8 = this.f51335I0;
            i2 = cVar8.f51370b;
            int i15 = cVar8.f51372d;
            int i16 = cVar8.f51371c;
            if (i16 > 0) {
                max += i16;
            }
            mo59423r3(this.f51346T0);
            C20048c cVar9 = this.f51335I0;
            cVar9.f51376h = max;
            cVar9.f51372d += cVar9.f51373e;
            mo59424s2(wVar, cVar9, b0Var, false);
            C20048c cVar10 = this.f51335I0;
            i3 = cVar10.f51370b;
            int i17 = cVar10.f51371c;
            if (i17 > 0) {
                mo59416o3(i15, i2);
                C20048c cVar11 = this.f51335I0;
                cVar11.f51376h = i17;
                mo59424s2(wVar, cVar11, b0Var, false);
                i2 = this.f51335I0.f51370b;
            }
        }
        if (mo59922Y() > 0) {
            if (this.f51339M0 ^ this.f51340N0) {
                int G2 = mo59372G2(i2, wVar, b0Var, true);
                i5 = i3 + G2;
                i4 = i2 + G2;
                i6 = mo59374H2(i5, wVar, b0Var, false);
            } else {
                int H2 = mo59374H2(i3, wVar, b0Var, true);
                i5 = i3 + H2;
                i4 = i2 + H2;
                i6 = mo59372G2(i4, wVar, b0Var, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        mo59387T2(wVar, b0Var, i3, i2);
        if (!b0Var.mo59735j()) {
            this.f51336J0.mo60712u();
        } else {
            this.f51346T0.mo59450e();
        }
        this.f51337K0 = this.f51340N0;
    }

    /* renamed from: q2 */
    public C20048c mo59420q2() {
        return new C20048c();
    }

    /* renamed from: q3 */
    public final void mo59421q3(int i, int i2) {
        int i3;
        this.f51335I0.f51371c = i2 - this.f51336J0.mo60705n();
        C20048c cVar = this.f51335I0;
        cVar.f51372d = i;
        if (this.f51339M0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f51373e = i3;
        cVar.f51374f = -1;
        cVar.f51370b = i2;
        cVar.f51375g = Integer.MIN_VALUE;
    }

    /* renamed from: r1 */
    public void mo59342r1(RecyclerView.C20055b0 b0Var) {
        super.mo59342r1(b0Var);
        this.f51345S0 = null;
        this.f51342P0 = -1;
        this.f51343Q0 = Integer.MIN_VALUE;
        this.f51346T0.mo59450e();
    }

    /* renamed from: r2 */
    public void mo59422r2() {
        if (this.f51335I0 == null) {
            this.f51335I0 = mo59420q2();
        }
    }

    /* renamed from: r3 */
    public final void mo59423r3(C20046a aVar) {
        mo59421q3(aVar.f51354b, aVar.f51355c);
    }

    /* renamed from: s2 */
    public int mo59424s2(RecyclerView.C20089w wVar, C20048c cVar, RecyclerView.C20055b0 b0Var, boolean z) {
        int i = cVar.f51371c;
        int i2 = cVar.f51375g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f51375g = i2 + i;
            }
            mo59389W2(wVar, cVar);
        }
        int i3 = cVar.f51371c + cVar.f51376h;
        C20047b bVar = this.f51347U0;
        while (true) {
            if ((!cVar.f51381m && i3 <= 0) || !cVar.mo59455c(b0Var)) {
                break;
            }
            bVar.mo59452a();
            mo59325S2(wVar, b0Var, cVar, bVar);
            if (!bVar.f51359b) {
                cVar.f51370b += bVar.f51358a * cVar.f51374f;
                if (!bVar.f51360c || cVar.f51380l != null || !b0Var.mo59735j()) {
                    int i4 = cVar.f51371c;
                    int i5 = bVar.f51358a;
                    cVar.f51371c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f51375g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f51358a;
                    cVar.f51375g = i7;
                    int i8 = cVar.f51371c;
                    if (i8 < 0) {
                        cVar.f51375g = i7 + i8;
                    }
                    mo59389W2(wVar, cVar);
                }
                if (z && bVar.f51361d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f51371c;
    }

    /* renamed from: s3 */
    public void mo59425s3() {
        StringBuilder sb = new StringBuilder();
        sb.append("validating child count ");
        sb.append(mo59922Y());
        boolean z = true;
        if (mo59922Y() >= 1) {
            int u0 = mo59978u0(mo59919X(0));
            int g = this.f51336J0.mo60698g(mo59919X(0));
            if (this.f51339M0) {
                int i = 1;
                while (i < mo59922Y()) {
                    View X = mo59919X(i);
                    int u02 = mo59978u0(X);
                    int g2 = this.f51336J0.mo60698g(X);
                    if (u02 < u0) {
                        mo59388U2();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("detected invalid position. loc invalid? ");
                        if (g2 >= g) {
                            z = false;
                        }
                        sb2.append(z);
                        throw new RuntimeException(sb2.toString());
                    } else if (g2 <= g) {
                        i++;
                    } else {
                        mo59388U2();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < mo59922Y()) {
                View X2 = mo59919X(i2);
                int u03 = mo59978u0(X2);
                int g3 = this.f51336J0.mo60698g(X2);
                if (u03 < u0) {
                    mo59388U2();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("detected invalid position. loc invalid? ");
                    if (g3 >= g) {
                        z = false;
                    }
                    sb3.append(z);
                    throw new RuntimeException(sb3.toString());
                } else if (g3 >= g) {
                    i2++;
                } else {
                    mo59388U2();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    /* renamed from: t2 */
    public int mo59426t2() {
        View C2 = mo59368C2(0, mo59922Y(), true, false);
        if (C2 == null) {
            return -1;
        }
        return mo59978u0(C2);
    }

    /* renamed from: u2 */
    public final View mo59427u2() {
        return mo59367B2(0, mo59922Y());
    }

    /* renamed from: v */
    public boolean mo59428v() {
        return this.f51334H0 == 0;
    }

    /* renamed from: v1 */
    public void mo59429v1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f51345S0 = savedState;
            if (this.f51342P0 != -1) {
                savedState.mo59439b();
            }
            mo59898N1();
        }
    }

    /* renamed from: v2 */
    public View mo59430v2(boolean z, boolean z2) {
        if (this.f51339M0) {
            return mo59368C2(0, mo59922Y(), z, z2);
        }
        return mo59368C2(mo59922Y() - 1, -1, z, z2);
    }

    /* renamed from: w */
    public boolean mo59431w() {
        return this.f51334H0 == 1;
    }

    /* renamed from: w1 */
    public Parcelable mo59432w1() {
        if (this.f51345S0 != null) {
            return new SavedState(this.f51345S0);
        }
        SavedState savedState = new SavedState();
        if (mo59922Y() > 0) {
            mo59422r2();
            boolean z = this.f51337K0 ^ this.f51339M0;
            savedState.f51352c = z;
            if (z) {
                View I2 = mo59375I2();
                savedState.f51351b = this.f51336J0.mo60700i() - this.f51336J0.mo60695d(I2);
                savedState.f51350a = mo59978u0(I2);
            } else {
                View J2 = mo59376J2();
                savedState.f51350a = mo59978u0(J2);
                savedState.f51351b = this.f51336J0.mo60698g(J2) - this.f51336J0.mo60705n();
            }
        } else {
            savedState.mo59439b();
        }
        return savedState;
    }

    /* renamed from: w2 */
    public View mo59433w2(boolean z, boolean z2) {
        if (this.f51339M0) {
            return mo59368C2(mo59922Y() - 1, -1, z, z2);
        }
        return mo59368C2(0, mo59922Y(), z, z2);
    }

    /* renamed from: x2 */
    public int mo59434x2() {
        View C2 = mo59368C2(0, mo59922Y(), false, true);
        if (C2 == null) {
            return -1;
        }
        return mo59978u0(C2);
    }

    /* renamed from: y2 */
    public int mo59435y2() {
        View C2 = mo59368C2(mo59922Y() - 1, -1, true, false);
        if (C2 == null) {
            return -1;
        }
        return mo59978u0(C2);
    }

    /* renamed from: z */
    public void mo59436z(int i, int i2, RecyclerView.C20055b0 b0Var, RecyclerView.C20076o.C20079c cVar) {
        int i3;
        if (this.f51334H0 != 0) {
            i = i2;
        }
        if (mo59922Y() != 0 && i != 0) {
            mo59422r2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            mo59414n3(i3, Math.abs(i), true, b0Var);
            mo59337l2(b0Var, this.f51335I0, cVar);
        }
    }

    /* renamed from: z2 */
    public final View mo59437z2() {
        return mo59367B2(mo59922Y() - 1, -1);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f51334H0 = 1;
        this.f51338L0 = false;
        this.f51339M0 = false;
        this.f51340N0 = false;
        this.f51341O0 = true;
        this.f51342P0 = -1;
        this.f51343Q0 = Integer.MIN_VALUE;
        this.f51345S0 = null;
        this.f51346T0 = new C20046a();
        this.f51347U0 = new C20047b();
        this.f51348V0 = 2;
        this.f51349W0 = new int[2];
        mo59404f3(i);
        mo59406h3(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f51334H0 = 1;
        this.f51338L0 = false;
        this.f51339M0 = false;
        this.f51340N0 = false;
        this.f51341O0 = true;
        this.f51342P0 = -1;
        this.f51343Q0 = Integer.MIN_VALUE;
        this.f51345S0 = null;
        this.f51346T0 = new C20046a();
        this.f51347U0 = new C20047b();
        this.f51348V0 = 2;
        this.f51349W0 = new int[2];
        RecyclerView.C20076o.C20080d v0 = RecyclerView.C20076o.m93539v0(context, attributeSet, i, i2);
        mo59404f3(v0.f51590a);
        mo59406h3(v0.f51592c);
        mo59334j3(v0.f51593d);
    }
}
