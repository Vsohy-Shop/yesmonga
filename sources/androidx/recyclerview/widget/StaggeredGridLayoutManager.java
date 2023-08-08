package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

public class StaggeredGridLayoutManager extends RecyclerView.C20076o implements RecyclerView.C20051a0.C20053b {

    /* renamed from: f1 */
    public static final String f51616f1 = "StaggeredGridLManager";

    /* renamed from: g1 */
    public static final boolean f51617g1 = false;

    /* renamed from: h1 */
    public static final int f51618h1 = 0;

    /* renamed from: i1 */
    public static final int f51619i1 = 1;

    /* renamed from: j1 */
    public static final int f51620j1 = 0;
    @Deprecated

    /* renamed from: k1 */
    public static final int f51621k1 = 1;

    /* renamed from: l1 */
    public static final int f51622l1 = 2;

    /* renamed from: m1 */
    public static final int f51623m1 = Integer.MIN_VALUE;

    /* renamed from: n1 */
    public static final float f51624n1 = 0.33333334f;

    /* renamed from: H0 */
    public int f51625H0 = -1;

    /* renamed from: I0 */
    public C20098d[] f51626I0;
    @C0359n0

    /* renamed from: J0 */
    public C20224y f51627J0;
    @C0359n0

    /* renamed from: K0 */
    public C20224y f51628K0;

    /* renamed from: L0 */
    public int f51629L0;

    /* renamed from: M0 */
    public int f51630M0;
    @C0359n0

    /* renamed from: N0 */
    public final C20206q f51631N0;

    /* renamed from: O0 */
    public boolean f51632O0 = false;

    /* renamed from: P0 */
    public boolean f51633P0 = false;

    /* renamed from: Q0 */
    public BitSet f51634Q0;

    /* renamed from: R0 */
    public int f51635R0 = -1;

    /* renamed from: S0 */
    public int f51636S0 = Integer.MIN_VALUE;

    /* renamed from: T0 */
    public LazySpanLookup f51637T0 = new LazySpanLookup();

    /* renamed from: U0 */
    public int f51638U0 = 2;

    /* renamed from: V0 */
    public boolean f51639V0;

    /* renamed from: W0 */
    public boolean f51640W0;

    /* renamed from: X0 */
    public SavedState f51641X0;

    /* renamed from: Y0 */
    public int f51642Y0;

    /* renamed from: Z0 */
    public final Rect f51643Z0 = new Rect();

    /* renamed from: a1 */
    public final C20096b f51644a1 = new C20096b();

    /* renamed from: b1 */
    public boolean f51645b1 = false;

    /* renamed from: c1 */
    public boolean f51646c1 = true;

    /* renamed from: d1 */
    public int[] f51647d1;

    /* renamed from: e1 */
    public final Runnable f51648e1 = new C20095a();

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20094a();

        /* renamed from: a */
        public int f51656a;

        /* renamed from: b */
        public int f51657b;

        /* renamed from: c */
        public int f51658c;

        /* renamed from: d */
        public int[] f51659d;

        /* renamed from: e */
        public int f51660e;

        /* renamed from: f */
        public int[] f51661f;

        /* renamed from: g */
        public List<LazySpanLookup.FullSpanItem> f51662g;

        /* renamed from: v */
        public boolean f51663v;

        /* renamed from: w */
        public boolean f51664w;

        /* renamed from: x */
        public boolean f51665x;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C20094a implements Parcelable.Creator<SavedState> {
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
        public void mo60153a() {
            this.f51659d = null;
            this.f51658c = 0;
            this.f51656a = -1;
            this.f51657b = -1;
        }

        /* renamed from: b */
        public void mo60154b() {
            this.f51659d = null;
            this.f51658c = 0;
            this.f51660e = 0;
            this.f51661f = null;
            this.f51662g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f51656a);
            parcel.writeInt(this.f51657b);
            parcel.writeInt(this.f51658c);
            if (this.f51658c > 0) {
                parcel.writeIntArray(this.f51659d);
            }
            parcel.writeInt(this.f51660e);
            if (this.f51660e > 0) {
                parcel.writeIntArray(this.f51661f);
            }
            parcel.writeInt(this.f51663v ? 1 : 0);
            parcel.writeInt(this.f51664w ? 1 : 0);
            parcel.writeInt(this.f51665x ? 1 : 0);
            parcel.writeList(this.f51662g);
        }

        public SavedState(Parcel parcel) {
            this.f51656a = parcel.readInt();
            this.f51657b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f51658c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f51659d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f51660e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f51661f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f51663v = parcel.readInt() == 1;
            this.f51664w = parcel.readInt() == 1;
            this.f51665x = parcel.readInt() == 1 ? true : z;
            this.f51662g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f51658c = savedState.f51658c;
            this.f51656a = savedState.f51656a;
            this.f51657b = savedState.f51657b;
            this.f51659d = savedState.f51659d;
            this.f51660e = savedState.f51660e;
            this.f51661f = savedState.f51661f;
            this.f51663v = savedState.f51663v;
            this.f51664w = savedState.f51664w;
            this.f51665x = savedState.f51665x;
            this.f51662g = savedState.f51662g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C20095a implements Runnable {
        public C20095a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo60110q2();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C20096b {

        /* renamed from: a */
        public int f51667a;

        /* renamed from: b */
        public int f51668b;

        /* renamed from: c */
        public boolean f51669c;

        /* renamed from: d */
        public boolean f51670d;

        /* renamed from: e */
        public boolean f51671e;

        /* renamed from: f */
        public int[] f51672f;

        public C20096b() {
            mo60164c();
        }

        /* renamed from: a */
        public void mo60162a() {
            int i;
            if (this.f51669c) {
                i = StaggeredGridLayoutManager.this.f51627J0.mo60700i();
            } else {
                i = StaggeredGridLayoutManager.this.f51627J0.mo60705n();
            }
            this.f51668b = i;
        }

        /* renamed from: b */
        public void mo60163b(int i) {
            if (this.f51669c) {
                this.f51668b = StaggeredGridLayoutManager.this.f51627J0.mo60700i() - i;
            } else {
                this.f51668b = StaggeredGridLayoutManager.this.f51627J0.mo60705n() + i;
            }
        }

        /* renamed from: c */
        public void mo60164c() {
            this.f51667a = -1;
            this.f51668b = Integer.MIN_VALUE;
            this.f51669c = false;
            this.f51670d = false;
            this.f51671e = false;
            int[] iArr = this.f51672f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void mo60165d(C20098d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f51672f;
            if (iArr == null || iArr.length < length) {
                this.f51672f = new int[StaggeredGridLayoutManager.this.f51626I0.length];
            }
            for (int i = 0; i < length; i++) {
                this.f51672f[i] = dVarArr[i].mo60190u(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C20097c extends RecyclerView.C20081p {

        /* renamed from: g */
        public static final int f51674g = -1;

        /* renamed from: e */
        public C20098d f51675e;

        /* renamed from: f */
        public boolean f51676f;

        public C20097c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: j */
        public final int mo60166j() {
            C20098d dVar = this.f51675e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f51682e;
        }

        /* renamed from: k */
        public boolean mo60167k() {
            return this.f51676f;
        }

        /* renamed from: l */
        public void mo60168l(boolean z) {
            this.f51676f = z;
        }

        public C20097c(int i, int i2) {
            super(i, i2);
        }

        public C20097c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C20097c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C20097c(RecyclerView.C20081p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public class C20098d {

        /* renamed from: g */
        public static final int f51677g = Integer.MIN_VALUE;

        /* renamed from: a */
        public ArrayList<View> f51678a = new ArrayList<>();

        /* renamed from: b */
        public int f51679b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f51680c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f51681d = 0;

        /* renamed from: e */
        public final int f51682e;

        public C20098d(int i) {
            this.f51682e = i;
        }

        /* renamed from: A */
        public void mo60169A(int i) {
            this.f51679b = i;
            this.f51680c = i;
        }

        /* renamed from: a */
        public void mo60170a(View view) {
            C20097c s = mo60188s(view);
            s.f51675e = this;
            this.f51678a.add(view);
            this.f51680c = Integer.MIN_VALUE;
            if (this.f51678a.size() == 1) {
                this.f51679b = Integer.MIN_VALUE;
            }
            if (s.mo59998g() || s.mo59997f()) {
                this.f51681d += StaggeredGridLayoutManager.this.f51627J0.mo60696e(view);
            }
        }

        /* renamed from: b */
        public void mo60171b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo60186q(Integer.MIN_VALUE);
            } else {
                i2 = mo60190u(Integer.MIN_VALUE);
            }
            mo60174e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f51627J0.mo60700i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f51627J0.mo60705n()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f51680c = i2;
                    this.f51679b = i2;
                }
            }
        }

        /* renamed from: c */
        public void mo60172c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.f51678a;
            View view = arrayList.get(arrayList.size() - 1);
            C20097c s = mo60188s(view);
            this.f51680c = StaggeredGridLayoutManager.this.f51627J0.mo60695d(view);
            if (s.f51676f && (f = StaggeredGridLayoutManager.this.f51637T0.mo60135f(s.mo59995d())) != null && f.f51653b == 1) {
                this.f51680c += f.mo60145a(this.f51682e);
            }
        }

        /* renamed from: d */
        public void mo60173d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.f51678a.get(0);
            C20097c s = mo60188s(view);
            this.f51679b = StaggeredGridLayoutManager.this.f51627J0.mo60698g(view);
            if (s.f51676f && (f = StaggeredGridLayoutManager.this.f51637T0.mo60135f(s.mo59995d())) != null && f.f51653b == -1) {
                this.f51679b -= f.mo60145a(this.f51682e);
            }
        }

        /* renamed from: e */
        public void mo60174e() {
            this.f51678a.clear();
            mo60191v();
            this.f51681d = 0;
        }

        /* renamed from: f */
        public int mo60175f() {
            if (StaggeredGridLayoutManager.this.f51632O0) {
                return mo60183n(this.f51678a.size() - 1, -1, true);
            }
            return mo60183n(0, this.f51678a.size(), true);
        }

        /* renamed from: g */
        public int mo60176g() {
            if (StaggeredGridLayoutManager.this.f51632O0) {
                return mo60182m(this.f51678a.size() - 1, -1, true);
            }
            return mo60182m(0, this.f51678a.size(), true);
        }

        /* renamed from: h */
        public int mo60177h() {
            if (StaggeredGridLayoutManager.this.f51632O0) {
                return mo60183n(this.f51678a.size() - 1, -1, false);
            }
            return mo60183n(0, this.f51678a.size(), false);
        }

        /* renamed from: i */
        public int mo60178i() {
            if (StaggeredGridLayoutManager.this.f51632O0) {
                return mo60183n(0, this.f51678a.size(), true);
            }
            return mo60183n(this.f51678a.size() - 1, -1, true);
        }

        /* renamed from: j */
        public int mo60179j() {
            if (StaggeredGridLayoutManager.this.f51632O0) {
                return mo60182m(0, this.f51678a.size(), true);
            }
            return mo60182m(this.f51678a.size() - 1, -1, true);
        }

        /* renamed from: k */
        public int mo60180k() {
            if (StaggeredGridLayoutManager.this.f51632O0) {
                return mo60183n(0, this.f51678a.size(), false);
            }
            return mo60183n(this.f51678a.size() - 1, -1, false);
        }

        /* renamed from: l */
        public int mo60181l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int n = StaggeredGridLayoutManager.this.f51627J0.mo60705n();
            int i4 = StaggeredGridLayoutManager.this.f51627J0.mo60700i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f51678a.get(i);
                int g = StaggeredGridLayoutManager.this.f51627J0.mo60698g(view);
                int d = StaggeredGridLayoutManager.this.f51627J0.mo60695d(view);
                boolean z5 = false;
                if (!z3 ? g >= i4 : g > i4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? d > n : d >= n) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo59978u0(view);
                        }
                        if (g < n || d > i4) {
                            return StaggeredGridLayoutManager.this.mo59978u0(view);
                        }
                    } else if (g >= n && d <= i4) {
                        return StaggeredGridLayoutManager.this.mo59978u0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: m */
        public int mo60182m(int i, int i2, boolean z) {
            return mo60181l(i, i2, false, false, z);
        }

        /* renamed from: n */
        public int mo60183n(int i, int i2, boolean z) {
            return mo60181l(i, i2, z, true, false);
        }

        /* renamed from: o */
        public int mo60184o() {
            return this.f51681d;
        }

        /* renamed from: p */
        public int mo60185p() {
            int i = this.f51680c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo60172c();
            return this.f51680c;
        }

        /* renamed from: q */
        public int mo60186q(int i) {
            int i2 = this.f51680c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f51678a.size() == 0) {
                return i;
            }
            mo60172c();
            return this.f51680c;
        }

        /* renamed from: r */
        public View mo60187r(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f51678a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f51678a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f51632O0 && staggeredGridLayoutManager.mo59978u0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f51632O0 && staggeredGridLayoutManager2.mo59978u0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f51678a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f51678a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f51632O0 && staggeredGridLayoutManager3.mo59978u0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f51632O0 && staggeredGridLayoutManager4.mo59978u0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: s */
        public C20097c mo60188s(View view) {
            return (C20097c) view.getLayoutParams();
        }

        /* renamed from: t */
        public int mo60189t() {
            int i = this.f51679b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo60173d();
            return this.f51679b;
        }

        /* renamed from: u */
        public int mo60190u(int i) {
            int i2 = this.f51679b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f51678a.size() == 0) {
                return i;
            }
            mo60173d();
            return this.f51679b;
        }

        /* renamed from: v */
        public void mo60191v() {
            this.f51679b = Integer.MIN_VALUE;
            this.f51680c = Integer.MIN_VALUE;
        }

        /* renamed from: w */
        public void mo60192w(int i) {
            int i2 = this.f51679b;
            if (i2 != Integer.MIN_VALUE) {
                this.f51679b = i2 + i;
            }
            int i3 = this.f51680c;
            if (i3 != Integer.MIN_VALUE) {
                this.f51680c = i3 + i;
            }
        }

        /* renamed from: x */
        public void mo60193x() {
            int size = this.f51678a.size();
            View remove = this.f51678a.remove(size - 1);
            C20097c s = mo60188s(remove);
            s.f51675e = null;
            if (s.mo59998g() || s.mo59997f()) {
                this.f51681d -= StaggeredGridLayoutManager.this.f51627J0.mo60696e(remove);
            }
            if (size == 1) {
                this.f51679b = Integer.MIN_VALUE;
            }
            this.f51680c = Integer.MIN_VALUE;
        }

        /* renamed from: y */
        public void mo60194y() {
            View remove = this.f51678a.remove(0);
            C20097c s = mo60188s(remove);
            s.f51675e = null;
            if (this.f51678a.size() == 0) {
                this.f51680c = Integer.MIN_VALUE;
            }
            if (s.mo59998g() || s.mo59997f()) {
                this.f51681d -= StaggeredGridLayoutManager.this.f51627J0.mo60696e(remove);
            }
            this.f51679b = Integer.MIN_VALUE;
        }

        /* renamed from: z */
        public void mo60195z(View view) {
            C20097c s = mo60188s(view);
            s.f51675e = this;
            this.f51678a.add(0, view);
            this.f51679b = Integer.MIN_VALUE;
            if (this.f51678a.size() == 1) {
                this.f51680c = Integer.MIN_VALUE;
            }
            if (s.mo59998g() || s.mo59997f()) {
                this.f51681d += StaggeredGridLayoutManager.this.f51627J0.mo60696e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C20076o.C20080d v0 = RecyclerView.C20076o.m93539v0(context, attributeSet, i, i2);
        mo60109p3(v0.f51590a);
        mo60113r3(v0.f51591b);
        mo60111q3(v0.f51592c);
        this.f51631N0 = new C20206q();
        mo60126y2();
    }

    /* renamed from: A2 */
    public int[] mo60062A2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f51625H0];
        } else if (iArr.length < this.f51625H0) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f51625H0 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f51625H0; i++) {
            iArr[i] = this.f51626I0[i].mo60175f();
        }
        return iArr;
    }

    /* renamed from: B */
    public int mo59366B(RecyclerView.C20055b0 b0Var) {
        return mo60114s2(b0Var);
    }

    /* renamed from: B2 */
    public final int mo60063B2(int i) {
        int Y = mo59922Y();
        for (int i2 = 0; i2 < Y; i2++) {
            int u0 = mo59978u0(mo59919X(i2));
            if (u0 >= 0 && u0 < i) {
                return u0;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public int mo59303C(RecyclerView.C20055b0 b0Var) {
        return mo60116t2(b0Var);
    }

    /* renamed from: C2 */
    public View mo60064C2(boolean z) {
        int n = this.f51627J0.mo60705n();
        int i = this.f51627J0.mo60700i();
        View view = null;
        for (int Y = mo59922Y() - 1; Y >= 0; Y--) {
            View X = mo59919X(Y);
            int g = this.f51627J0.mo60698g(X);
            int d = this.f51627J0.mo60695d(X);
            if (d > n && g < i) {
                if (d <= i || !z) {
                    return X;
                }
                if (view == null) {
                    view = X;
                }
            }
        }
        return view;
    }

    /* renamed from: D */
    public int mo59305D(RecyclerView.C20055b0 b0Var) {
        return mo60118u2(b0Var);
    }

    /* renamed from: D2 */
    public View mo60065D2(boolean z) {
        int n = this.f51627J0.mo60705n();
        int i = this.f51627J0.mo60700i();
        int Y = mo59922Y();
        View view = null;
        for (int i2 = 0; i2 < Y; i2++) {
            View X = mo59919X(i2);
            int g = this.f51627J0.mo60698g(X);
            if (this.f51627J0.mo60695d(X) > n && g < i) {
                if (g >= n || !z) {
                    return X;
                }
                if (view == null) {
                    view = X;
                }
            }
        }
        return view;
    }

    /* renamed from: E */
    public int mo59370E(RecyclerView.C20055b0 b0Var) {
        return mo60114s2(b0Var);
    }

    /* renamed from: E2 */
    public int mo60066E2() {
        View view;
        if (this.f51633P0) {
            view = mo60064C2(true);
        } else {
            view = mo60065D2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo59978u0(view);
    }

    /* renamed from: F */
    public int mo59308F(RecyclerView.C20055b0 b0Var) {
        return mo60116t2(b0Var);
    }

    /* renamed from: F2 */
    public int[] mo60067F2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f51625H0];
        } else if (iArr.length < this.f51625H0) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f51625H0 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f51625H0; i++) {
            iArr[i] = this.f51626I0[i].mo60177h();
        }
        return iArr;
    }

    /* renamed from: G */
    public int mo59311G(RecyclerView.C20055b0 b0Var) {
        return mo60118u2(b0Var);
    }

    /* renamed from: G2 */
    public int[] mo60068G2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f51625H0];
        } else if (iArr.length < this.f51625H0) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f51625H0 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f51625H0; i++) {
            iArr[i] = this.f51626I0[i].mo60178i();
        }
        return iArr;
    }

    /* renamed from: H0 */
    public boolean mo59373H0() {
        return this.f51638U0 != 0;
    }

    /* renamed from: H2 */
    public final int mo60069H2(int i) {
        for (int Y = mo59922Y() - 1; Y >= 0; Y--) {
            int u0 = mo59978u0(mo59919X(Y));
            if (u0 >= 0 && u0 < i) {
                return u0;
            }
        }
        return 0;
    }

    /* renamed from: I2 */
    public int[] mo60070I2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f51625H0];
        } else if (iArr.length < this.f51625H0) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f51625H0 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f51625H0; i++) {
            iArr[i] = this.f51626I0[i].mo60180k();
        }
        return iArr;
    }

    /* renamed from: J2 */
    public final void mo60071J2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z) {
        int i;
        int O2 = mo60076O2(Integer.MIN_VALUE);
        if (O2 != Integer.MIN_VALUE && (i = this.f51627J0.mo60700i() - O2) > 0) {
            int i2 = i - (-mo60101l3(-i, wVar, b0Var));
            if (z && i2 > 0) {
                this.f51627J0.mo60711t(i2);
            }
        }
    }

    /* renamed from: K2 */
    public final void mo60072K2(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var, boolean z) {
        int n;
        int R2 = mo60079R2(Integer.MAX_VALUE);
        if (R2 != Integer.MAX_VALUE && (n = R2 - this.f51627J0.mo60705n()) > 0) {
            int l3 = n - mo60101l3(n, wVar, b0Var);
            if (z && l3 > 0) {
                this.f51627J0.mo60711t(-l3);
            }
        }
    }

    /* renamed from: L2 */
    public int mo60073L2() {
        if (mo59922Y() == 0) {
            return 0;
        }
        return mo59978u0(mo59919X(0));
    }

    /* renamed from: M2 */
    public int mo60074M2() {
        return this.f51638U0;
    }

    /* renamed from: N2 */
    public int mo60075N2() {
        int Y = mo59922Y();
        if (Y == 0) {
            return 0;
        }
        return mo59978u0(mo59919X(Y - 1));
    }

    /* renamed from: O2 */
    public final int mo60076O2(int i) {
        int q = this.f51626I0[0].mo60186q(i);
        for (int i2 = 1; i2 < this.f51625H0; i2++) {
            int q2 = this.f51626I0[i2].mo60186q(i);
            if (q2 > q) {
                q = q2;
            }
        }
        return q;
    }

    /* renamed from: P2 */
    public final int mo60077P2(int i) {
        int u = this.f51626I0[0].mo60190u(i);
        for (int i2 = 1; i2 < this.f51625H0; i2++) {
            int u2 = this.f51626I0[i2].mo60190u(i);
            if (u2 > u) {
                u = u2;
            }
        }
        return u;
    }

    /* renamed from: Q1 */
    public int mo59322Q1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        return mo60101l3(i, wVar, b0Var);
    }

    /* renamed from: Q2 */
    public final int mo60078Q2(int i) {
        int q = this.f51626I0[0].mo60186q(i);
        for (int i2 = 1; i2 < this.f51625H0; i2++) {
            int q2 = this.f51626I0[i2].mo60186q(i);
            if (q2 < q) {
                q = q2;
            }
        }
        return q;
    }

    /* renamed from: R1 */
    public void mo59385R1(int i) {
        SavedState savedState = this.f51641X0;
        if (!(savedState == null || savedState.f51656a == i)) {
            savedState.mo60153a();
        }
        this.f51635R0 = i;
        this.f51636S0 = Integer.MIN_VALUE;
        mo59898N1();
    }

    /* renamed from: R2 */
    public final int mo60079R2(int i) {
        int u = this.f51626I0[0].mo60190u(i);
        for (int i2 = 1; i2 < this.f51625H0; i2++) {
            int u2 = this.f51626I0[i2].mo60190u(i);
            if (u2 < u) {
                u = u2;
            }
        }
        return u;
    }

    /* renamed from: S */
    public RecyclerView.C20081p mo59323S() {
        if (this.f51629L0 == 0) {
            return new C20097c(-2, -1);
        }
        return new C20097c(-1, -2);
    }

    /* renamed from: S1 */
    public int mo59324S1(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        return mo60101l3(i, wVar, b0Var);
    }

    /* renamed from: S2 */
    public final C20098d mo60080S2(C20206q qVar) {
        int i;
        int i2;
        int i3;
        if (mo60091d3(qVar.f52141e)) {
            i3 = this.f51625H0 - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = this.f51625H0;
            i3 = 0;
            i = 1;
        }
        C20098d dVar = null;
        if (qVar.f52141e == 1) {
            int n = this.f51627J0.mo60705n();
            int i4 = Integer.MAX_VALUE;
            while (i3 != i2) {
                C20098d dVar2 = this.f51626I0[i3];
                int q = dVar2.mo60186q(n);
                if (q < i4) {
                    dVar = dVar2;
                    i4 = q;
                }
                i3 += i;
            }
            return dVar;
        }
        int i5 = this.f51627J0.mo60700i();
        int i6 = Integer.MIN_VALUE;
        while (i3 != i2) {
            C20098d dVar3 = this.f51626I0[i3];
            int u = dVar3.mo60190u(i5);
            if (u > i6) {
                dVar = dVar3;
                i6 = u;
            }
            i3 += i;
        }
        return dVar;
    }

    /* renamed from: T */
    public RecyclerView.C20081p mo59326T(Context context, AttributeSet attributeSet) {
        return new C20097c(context, attributeSet);
    }

    /* renamed from: T2 */
    public int mo60081T2() {
        return this.f51629L0;
    }

    /* renamed from: U */
    public RecyclerView.C20081p mo59327U(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C20097c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C20097c(layoutParams);
    }

    /* renamed from: U2 */
    public boolean mo60082U2() {
        return this.f51632O0;
    }

    /* renamed from: V0 */
    public void mo59914V0(int i) {
        super.mo59914V0(i);
        for (int i2 = 0; i2 < this.f51625H0; i2++) {
            this.f51626I0[i2].mo60192w(i);
        }
    }

    /* renamed from: V2 */
    public int mo60083V2() {
        return this.f51625H0;
    }

    /* renamed from: W0 */
    public void mo59917W0(int i) {
        super.mo59917W0(i);
        for (int i2 = 0; i2 < this.f51625H0; i2++) {
            this.f51626I0[i2].mo60192w(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: W2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60084W2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f51633P0
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo60075N2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo60073L2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f51637T0
            r4.mo60137h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f51637T0
            r9.mo60140k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f51637T0
            r7.mo60139j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f51637T0
            r9.mo60140k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f51637T0
            r9.mo60139j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f51633P0
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo60073L2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo60075N2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo59898N1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo60084W2(int, int, int):void");
    }

    /* renamed from: X0 */
    public void mo59920X0(@C0363p0 RecyclerView.Adapter adapter, @C0363p0 RecyclerView.Adapter adapter2) {
        this.f51637T0.mo60131b();
        for (int i = 0; i < this.f51625H0; i++) {
            this.f51626I0[i].mo60174e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: X2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo60085X2() {
        /*
            r12 = this;
            int r0 = r12.mo59922Y()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f51625H0
            r2.<init>(r3)
            int r3 = r12.f51625H0
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f51629L0
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo60087Z2()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f51633P0
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo59919X(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C20097c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f51675e
            int r9 = r9.f51682e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f51675e
            boolean r9 = r12.mo60112r2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f51675e
            int r9 = r9.f51682e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f51676f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo59919X(r9)
            boolean r10 = r12.f51633P0
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.y r10 = r12.f51627J0
            int r10 = r10.mo60695d(r7)
            androidx.recyclerview.widget.y r11 = r12.f51627J0
            int r11 = r11.mo60695d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.y r10 = r12.f51627J0
            int r10 = r10.mo60698g(r7)
            androidx.recyclerview.widget.y r11 = r12.f51627J0
            int r11 = r11.mo60698g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C20097c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f51675e
            int r8 = r8.f51682e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f51675e
            int r9 = r9.f51682e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo60085X2():android.view.View");
    }

    /* renamed from: Y1 */
    public void mo59329Y1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f51629L0 == 1) {
            i4 = RecyclerView.C20076o.m93540y(i2, rect.height() + paddingTop, mo59972s0());
            i3 = RecyclerView.C20076o.m93540y(i, (this.f51630M0 * this.f51625H0) + paddingLeft, mo59975t0());
        } else {
            i3 = RecyclerView.C20076o.m93540y(i, rect.width() + paddingLeft, mo59975t0());
            i4 = RecyclerView.C20076o.m93540y(i2, (this.f51630M0 * this.f51625H0) + paddingTop, mo59972s0());
        }
        mo59921X1(i3, i4);
    }

    /* renamed from: Y2 */
    public void mo60086Y2() {
        this.f51637T0.mo60131b();
        mo59898N1();
    }

    /* renamed from: Z2 */
    public boolean mo60087Z2() {
        return mo59966q0() == 1;
    }

    /* renamed from: a */
    public PointF mo59393a(int i) {
        int p2 = mo60108p2(i);
        PointF pointF = new PointF();
        if (p2 == 0) {
            return null;
        }
        if (this.f51629L0 == 0) {
            pointF.x = (float) p2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) p2;
        }
        return pointF;
    }

    /* renamed from: a3 */
    public final void mo60088a3(View view, int i, int i2, boolean z) {
        boolean z2;
        mo59977u(view, this.f51643Z0);
        C20097c cVar = (C20097c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f51643Z0;
        int z3 = mo60129z3(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f51643Z0;
        int z32 = mo60129z3(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo59936e2(view, z3, z32, cVar);
        } else {
            z2 = mo59933c2(view, z3, z32, cVar);
        }
        if (z2) {
            view.measure(z3, z32);
        }
    }

    /* renamed from: b1 */
    public void mo59395b1(RecyclerView recyclerView, RecyclerView.C20089w wVar) {
        super.mo59395b1(recyclerView, wVar);
        mo59884I1(this.f51648e1);
        for (int i = 0; i < this.f51625H0; i++) {
            this.f51626I0[i].mo60174e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: b3 */
    public final void mo60089b3(View view, C20097c cVar, boolean z) {
        if (cVar.f51676f) {
            if (this.f51629L0 == 1) {
                mo60088a3(view, this.f51642Y0, RecyclerView.C20076o.m93537Z(mo59958m0(), mo59960n0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z);
            } else {
                mo60088a3(view, RecyclerView.C20076o.m93537Z(mo59868B0(), mo59870C0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), this.f51642Y0, z);
            }
        } else if (this.f51629L0 == 1) {
            mo60088a3(view, RecyclerView.C20076o.m93537Z(this.f51630M0, mo59870C0(), 0, cVar.width, false), RecyclerView.C20076o.m93537Z(mo59958m0(), mo59960n0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z);
        } else {
            mo60088a3(view, RecyclerView.C20076o.m93537Z(mo59868B0(), mo59870C0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), RecyclerView.C20076o.m93537Z(this.f51630M0, mo59960n0(), 0, cVar.height, false), z);
        }
    }

    @C0363p0
    /* renamed from: c1 */
    public View mo59330c1(View view, int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        View Q;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        View r;
        if (mo59922Y() == 0 || (Q = mo59905Q(view)) == null) {
            return null;
        }
        mo60099k3();
        int v2 = mo60120v2(i);
        if (v2 == Integer.MIN_VALUE) {
            return null;
        }
        C20097c cVar = (C20097c) Q.getLayoutParams();
        boolean z3 = cVar.f51676f;
        C20098d dVar = cVar.f51675e;
        if (v2 == 1) {
            i2 = mo60075N2();
        } else {
            i2 = mo60073L2();
        }
        mo60123w3(i2, b0Var);
        mo60107o3(v2);
        C20206q qVar = this.f51631N0;
        qVar.f52139c = qVar.f52140d + i2;
        qVar.f52138b = (int) (((float) this.f51627J0.mo60706o()) * 0.33333334f);
        C20206q qVar2 = this.f51631N0;
        qVar2.f52144h = true;
        qVar2.f52137a = false;
        mo60128z2(wVar, qVar2, b0Var);
        this.f51639V0 = this.f51633P0;
        if (!z3 && (r = dVar.mo60187r(i2, v2)) != null && r != Q) {
            return r;
        }
        if (mo60091d3(v2)) {
            for (int i6 = this.f51625H0 - 1; i6 >= 0; i6--) {
                View r2 = this.f51626I0[i6].mo60187r(i2, v2);
                if (r2 != null && r2 != Q) {
                    return r2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f51625H0; i7++) {
                View r3 = this.f51626I0[i7].mo60187r(i2, v2);
                if (r3 != null && r3 != Q) {
                    return r3;
                }
            }
        }
        boolean z4 = !this.f51632O0;
        if (v2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                i5 = dVar.mo60176g();
            } else {
                i5 = dVar.mo60179j();
            }
            View R = mo59384R(i5);
            if (!(R == null || R == Q)) {
                return R;
            }
        }
        if (mo60091d3(v2)) {
            for (int i8 = this.f51625H0 - 1; i8 >= 0; i8--) {
                if (i8 != dVar.f51682e) {
                    if (z2) {
                        i4 = this.f51626I0[i8].mo60176g();
                    } else {
                        i4 = this.f51626I0[i8].mo60179j();
                    }
                    View R2 = mo59384R(i4);
                    if (!(R2 == null || R2 == Q)) {
                        return R2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f51625H0; i9++) {
                if (z2) {
                    i3 = this.f51626I0[i9].mo60176g();
                } else {
                    i3 = this.f51626I0[i9].mo60179j();
                }
                View R3 = mo59384R(i3);
                if (R3 != null && R3 != Q) {
                    return R3;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo60110q2() != false) goto L_0x015b;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60090c3(androidx.recyclerview.widget.RecyclerView.C20089w r9, androidx.recyclerview.widget.RecyclerView.C20055b0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f51644a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f51641X0
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f51635R0
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo59729d()
            if (r1 != 0) goto L_0x0018
            r8.mo59875E1(r9)
            r0.mo60164c()
            return
        L_0x0018:
            boolean r1 = r0.f51671e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f51635R0
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f51641X0
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo60164c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f51641X0
            if (r5 == 0) goto L_0x0037
            r8.mo60100l2(r0)
            goto L_0x003e
        L_0x0037:
            r8.mo60099k3()
            boolean r5 = r8.f51633P0
            r0.f51669c = r5
        L_0x003e:
            r8.mo60121v3(r10, r0)
            r0.f51671e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f51641X0
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f51635R0
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f51669c
            boolean r6 = r8.f51639V0
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo60087Z2()
            boolean r6 = r8.f51640W0
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f51637T0
            r5.mo60131b()
            r0.f51670d = r4
        L_0x0060:
            int r5 = r8.mo59922Y()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f51641X0
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f51658c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f51670d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f51625H0
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f51626I0
            r5 = r5[r1]
            r5.mo60174e()
            int r5 = r0.f51668b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.f51626I0
            r6 = r6[r1]
            r6.mo60169A(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f51644a1
            int[] r1 = r1.f51672f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f51625H0
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f51626I0
            r5 = r5[r1]
            r5.mo60174e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f51644a1
            int[] r6 = r6.f51672f
            r6 = r6[r1]
            r5.mo60169A(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f51625H0
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f51626I0
            r5 = r5[r1]
            boolean r6 = r8.f51633P0
            int r7 = r0.f51668b
            r5.mo60171b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f51644a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f51626I0
            r1.mo60165d(r5)
        L_0x00c9:
            r8.mo59880H(r9)
            androidx.recyclerview.widget.q r1 = r8.f51631N0
            r1.f52137a = r3
            r8.f51645b1 = r3
            androidx.recyclerview.widget.y r1 = r8.f51628K0
            int r1 = r1.mo60706o()
            r8.mo60125x3(r1)
            int r1 = r0.f51667a
            r8.mo60123w3(r1, r10)
            boolean r1 = r0.f51669c
            if (r1 == 0) goto L_0x00fc
            r8.mo60107o3(r2)
            androidx.recyclerview.widget.q r1 = r8.f51631N0
            r8.mo60128z2(r9, r1, r10)
            r8.mo60107o3(r4)
            androidx.recyclerview.widget.q r1 = r8.f51631N0
            int r2 = r0.f51667a
            int r5 = r1.f52140d
            int r2 = r2 + r5
            r1.f52139c = r2
            r8.mo60128z2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.mo60107o3(r4)
            androidx.recyclerview.widget.q r1 = r8.f51631N0
            r8.mo60128z2(r9, r1, r10)
            r8.mo60107o3(r2)
            androidx.recyclerview.widget.q r1 = r8.f51631N0
            int r2 = r0.f51667a
            int r5 = r1.f52140d
            int r2 = r2 + r5
            r1.f52139c = r2
            r8.mo60128z2(r9, r1, r10)
        L_0x0113:
            r8.mo60097j3()
            int r1 = r8.mo59922Y()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f51633P0
            if (r1 == 0) goto L_0x0127
            r8.mo60071J2(r9, r10, r4)
            r8.mo60072K2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.mo60072K2(r9, r10, r4)
            r8.mo60071J2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo59735j()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f51638U0
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo59922Y()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f51645b1
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo60085X2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = r4
            goto L_0x014c
        L_0x014b:
            r11 = r3
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f51648e1
            r8.mo59884I1(r11)
            boolean r11 = r8.mo60110q2()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = r3
        L_0x015b:
            boolean r11 = r10.mo59735j()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f51644a1
            r11.mo60164c()
        L_0x0166:
            boolean r11 = r0.f51669c
            r8.f51639V0 = r11
            boolean r11 = r8.mo60087Z2()
            r8.f51640W0 = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f51644a1
            r11.mo60164c()
            r8.mo60090c3(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo60090c3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    /* renamed from: d1 */
    public void mo59399d1(AccessibilityEvent accessibilityEvent) {
        super.mo59399d1(accessibilityEvent);
        if (mo59922Y() > 0) {
            View D2 = mo60065D2(false);
            View C2 = mo60064C2(false);
            if (D2 != null && C2 != null) {
                int u0 = mo59978u0(D2);
                int u02 = mo59978u0(C2);
                if (u0 < u02) {
                    accessibilityEvent.setFromIndex(u0);
                    accessibilityEvent.setToIndex(u02);
                    return;
                }
                accessibilityEvent.setFromIndex(u02);
                accessibilityEvent.setToIndex(u0);
            }
        }
    }

    /* renamed from: d3 */
    public final boolean mo60091d3(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f51629L0 == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f51633P0) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f51633P0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == mo60087Z2()) {
            return true;
        }
        return false;
    }

    /* renamed from: e3 */
    public void mo60092e3(int i, RecyclerView.C20055b0 b0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo60075N2();
            i2 = 1;
        } else {
            i3 = mo60073L2();
            i2 = -1;
        }
        this.f51631N0.f52137a = true;
        mo60123w3(i3, b0Var);
        mo60107o3(i2);
        C20206q qVar = this.f51631N0;
        qVar.f52139c = i3 + qVar.f52140d;
        qVar.f52138b = Math.abs(i);
    }

    /* renamed from: f2 */
    public void mo59403f2(RecyclerView recyclerView, RecyclerView.C20055b0 b0Var, int i) {
        C20207r rVar = new C20207r(recyclerView.getContext());
        rVar.mo59709q(i);
        mo59941g2(rVar);
    }

    /* renamed from: f3 */
    public final void mo60093f3(View view) {
        for (int i = this.f51625H0 - 1; i >= 0; i--) {
            this.f51626I0[i].mo60195z(view);
        }
    }

    /* renamed from: g3 */
    public final void mo60094g3(RecyclerView.C20089w wVar, C20206q qVar) {
        int i;
        int i2;
        if (qVar.f52137a && !qVar.f52145i) {
            if (qVar.f52138b == 0) {
                if (qVar.f52141e == -1) {
                    mo60095h3(wVar, qVar.f52143g);
                } else {
                    mo60096i3(wVar, qVar.f52142f);
                }
            } else if (qVar.f52141e == -1) {
                int i3 = qVar.f52142f;
                int P2 = i3 - mo60077P2(i3);
                if (P2 < 0) {
                    i2 = qVar.f52143g;
                } else {
                    i2 = qVar.f52143g - Math.min(P2, qVar.f52138b);
                }
                mo60095h3(wVar, i2);
            } else {
                int Q2 = mo60078Q2(qVar.f52143g) - qVar.f52143g;
                if (Q2 < 0) {
                    i = qVar.f52142f;
                } else {
                    i = Math.min(Q2, qVar.f52138b) + qVar.f52142f;
                }
                mo60096i3(wVar, i);
            }
        }
    }

    /* renamed from: h3 */
    public final void mo60095h3(RecyclerView.C20089w wVar, int i) {
        int Y = mo59922Y() - 1;
        while (Y >= 0) {
            View X = mo59919X(Y);
            if (this.f51627J0.mo60698g(X) >= i && this.f51627J0.mo60709r(X) >= i) {
                C20097c cVar = (C20097c) X.getLayoutParams();
                if (cVar.f51676f) {
                    int i2 = 0;
                    while (i2 < this.f51625H0) {
                        if (this.f51626I0[i2].f51678a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f51625H0; i3++) {
                        this.f51626I0[i3].mo60193x();
                    }
                } else if (cVar.f51675e.f51678a.size() != 1) {
                    cVar.f51675e.mo60193x();
                } else {
                    return;
                }
                mo59879G1(X, wVar);
                Y--;
            } else {
                return;
            }
        }
    }

    /* renamed from: i3 */
    public final void mo60096i3(RecyclerView.C20089w wVar, int i) {
        while (mo59922Y() > 0) {
            View X = mo59919X(0);
            if (this.f51627J0.mo60695d(X) <= i && this.f51627J0.mo60708q(X) <= i) {
                C20097c cVar = (C20097c) X.getLayoutParams();
                if (cVar.f51676f) {
                    int i2 = 0;
                    while (i2 < this.f51625H0) {
                        if (this.f51626I0[i2].f51678a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f51625H0; i3++) {
                        this.f51626I0[i3].mo60194y();
                    }
                } else if (cVar.f51675e.f51678a.size() != 1) {
                    cVar.f51675e.mo60194y();
                } else {
                    return;
                }
                mo59879G1(X, wVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: j2 */
    public boolean mo59333j2() {
        return this.f51641X0 == null;
    }

    /* renamed from: j3 */
    public final void mo60097j3() {
        if (this.f51628K0.mo60703l() != 1073741824) {
            int Y = mo59922Y();
            float f = 0.0f;
            for (int i = 0; i < Y; i++) {
                View X = mo59919X(i);
                float e = (float) this.f51628K0.mo60696e(X);
                if (e >= f) {
                    if (((C20097c) X.getLayoutParams()).mo60167k()) {
                        e = (e * 1.0f) / ((float) this.f51625H0);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f51630M0;
            int round = Math.round(f * ((float) this.f51625H0));
            if (this.f51628K0.mo60703l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f51628K0.mo60706o());
            }
            mo60125x3(round);
            if (this.f51630M0 != i2) {
                for (int i3 = 0; i3 < Y; i3++) {
                    View X2 = mo59919X(i3);
                    C20097c cVar = (C20097c) X2.getLayoutParams();
                    if (!cVar.f51676f) {
                        if (!mo60087Z2() || this.f51629L0 != 1) {
                            int i4 = cVar.f51675e.f51682e;
                            int i5 = this.f51630M0 * i4;
                            int i6 = i4 * i2;
                            if (this.f51629L0 == 1) {
                                X2.offsetLeftAndRight(i5 - i6);
                            } else {
                                X2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f51625H0;
                            int i8 = cVar.f51675e.f51682e;
                            X2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f51630M0) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k1 */
    public void mo59335k1(RecyclerView recyclerView, int i, int i2) {
        mo60084W2(i, i2, 1);
    }

    /* renamed from: k2 */
    public final void mo60098k2(View view) {
        for (int i = this.f51625H0 - 1; i >= 0; i--) {
            this.f51626I0[i].mo60170a(view);
        }
    }

    /* renamed from: k3 */
    public final void mo60099k3() {
        if (this.f51629L0 == 1 || !mo60087Z2()) {
            this.f51633P0 = this.f51632O0;
        } else {
            this.f51633P0 = !this.f51632O0;
        }
    }

    /* renamed from: l1 */
    public void mo59336l1(RecyclerView recyclerView) {
        this.f51637T0.mo60131b();
        mo59898N1();
    }

    /* renamed from: l2 */
    public final void mo60100l2(C20096b bVar) {
        int i;
        SavedState savedState = this.f51641X0;
        int i2 = savedState.f51658c;
        if (i2 > 0) {
            if (i2 == this.f51625H0) {
                for (int i3 = 0; i3 < this.f51625H0; i3++) {
                    this.f51626I0[i3].mo60174e();
                    SavedState savedState2 = this.f51641X0;
                    int i4 = savedState2.f51659d[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f51664w) {
                            i = this.f51627J0.mo60700i();
                        } else {
                            i = this.f51627J0.mo60705n();
                        }
                        i4 += i;
                    }
                    this.f51626I0[i3].mo60169A(i4);
                }
            } else {
                savedState.mo60154b();
                SavedState savedState3 = this.f51641X0;
                savedState3.f51656a = savedState3.f51657b;
            }
        }
        SavedState savedState4 = this.f51641X0;
        this.f51640W0 = savedState4.f51665x;
        mo60111q3(savedState4.f51663v);
        mo60099k3();
        SavedState savedState5 = this.f51641X0;
        int i5 = savedState5.f51656a;
        if (i5 != -1) {
            this.f51635R0 = i5;
            bVar.f51669c = savedState5.f51664w;
        } else {
            bVar.f51669c = this.f51633P0;
        }
        if (savedState5.f51660e > 1) {
            LazySpanLookup lazySpanLookup = this.f51637T0;
            lazySpanLookup.f51650a = savedState5.f51661f;
            lazySpanLookup.f51651b = savedState5.f51662g;
        }
    }

    /* renamed from: l3 */
    public int mo60101l3(int i, RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0 || i == 0) {
            return 0;
        }
        mo60092e3(i, b0Var);
        int z2 = mo60128z2(wVar, this.f51631N0, b0Var);
        if (this.f51631N0.f52138b >= z2) {
            if (i < 0) {
                i = -z2;
            } else {
                i = z2;
            }
        }
        this.f51627J0.mo60711t(-i);
        this.f51639V0 = this.f51633P0;
        C20206q qVar = this.f51631N0;
        qVar.f52138b = 0;
        mo60094g3(wVar, qVar);
        return i;
    }

    /* renamed from: m1 */
    public void mo59338m1(RecyclerView recyclerView, int i, int i2, int i3) {
        mo60084W2(i, i2, 8);
    }

    /* renamed from: m2 */
    public boolean mo60102m2() {
        int q = this.f51626I0[0].mo60186q(Integer.MIN_VALUE);
        for (int i = 1; i < this.f51625H0; i++) {
            if (this.f51626I0[i].mo60186q(Integer.MIN_VALUE) != q) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m3 */
    public void mo60103m3(int i, int i2) {
        SavedState savedState = this.f51641X0;
        if (savedState != null) {
            savedState.mo60153a();
        }
        this.f51635R0 = i;
        this.f51636S0 = i2;
        mo59898N1();
    }

    /* renamed from: n1 */
    public void mo59339n1(RecyclerView recyclerView, int i, int i2) {
        mo60084W2(i, i2, 2);
    }

    /* renamed from: n2 */
    public boolean mo60104n2() {
        int u = this.f51626I0[0].mo60190u(Integer.MIN_VALUE);
        for (int i = 1; i < this.f51625H0; i++) {
            if (this.f51626I0[i].mo60190u(Integer.MIN_VALUE) != u) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n3 */
    public void mo60105n3(int i) {
        mo59419q((String) null);
        if (i != this.f51638U0) {
            if (i == 0 || i == 2) {
                this.f51638U0 = i;
                mo59898N1();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    /* renamed from: o2 */
    public final void mo60106o2(View view, C20097c cVar, C20206q qVar) {
        if (qVar.f52141e == 1) {
            if (cVar.f51676f) {
                mo60098k2(view);
            } else {
                cVar.f51675e.mo60170a(view);
            }
        } else if (cVar.f51676f) {
            mo60093f3(view);
        } else {
            cVar.f51675e.mo60195z(view);
        }
    }

    /* renamed from: o3 */
    public final void mo60107o3(int i) {
        boolean z;
        C20206q qVar = this.f51631N0;
        qVar.f52141e = i;
        boolean z2 = this.f51633P0;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        qVar.f52140d = i2;
    }

    /* renamed from: p1 */
    public void mo59340p1(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo60084W2(i, i2, 4);
    }

    /* renamed from: p2 */
    public final int mo60108p2(int i) {
        boolean z;
        if (mo59922Y() != 0) {
            if (i < mo60073L2()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f51633P0) {
                return -1;
            }
            return 1;
        } else if (this.f51633P0) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: p3 */
    public void mo60109p3(int i) {
        if (i == 0 || i == 1) {
            mo59419q((String) null);
            if (i != this.f51629L0) {
                this.f51629L0 = i;
                C20224y yVar = this.f51627J0;
                this.f51627J0 = this.f51628K0;
                this.f51628K0 = yVar;
                mo59898N1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: q */
    public void mo59419q(String str) {
        if (this.f51641X0 == null) {
            super.mo59419q(str);
        }
    }

    /* renamed from: q1 */
    public void mo59341q1(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
        mo60090c3(wVar, b0Var, true);
    }

    /* renamed from: q2 */
    public boolean mo60110q2() {
        int i;
        int i2;
        int i3;
        if (mo59922Y() == 0 || this.f51638U0 == 0 || !mo59878G0()) {
            return false;
        }
        if (this.f51633P0) {
            i2 = mo60075N2();
            i = mo60073L2();
        } else {
            i2 = mo60073L2();
            i = mo60075N2();
        }
        if (i2 == 0 && mo60085X2() != null) {
            this.f51637T0.mo60131b();
            mo59901O1();
            mo59898N1();
            return true;
        } else if (!this.f51645b1) {
            return false;
        } else {
            if (this.f51633P0) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e = this.f51637T0.mo60134e(i2, i4, i3, true);
            if (e == null) {
                this.f51645b1 = false;
                this.f51637T0.mo60133d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.f51637T0.mo60134e(i2, e.f51652a, i3 * -1, true);
            if (e2 == null) {
                this.f51637T0.mo60133d(e.f51652a);
            } else {
                this.f51637T0.mo60133d(e2.f51652a + 1);
            }
            mo59901O1();
            mo59898N1();
            return true;
        }
    }

    /* renamed from: q3 */
    public void mo60111q3(boolean z) {
        mo59419q((String) null);
        SavedState savedState = this.f51641X0;
        if (!(savedState == null || savedState.f51663v == z)) {
            savedState.f51663v = z;
        }
        this.f51632O0 = z;
        mo59898N1();
    }

    /* renamed from: r1 */
    public void mo59342r1(RecyclerView.C20055b0 b0Var) {
        super.mo59342r1(b0Var);
        this.f51635R0 = -1;
        this.f51636S0 = Integer.MIN_VALUE;
        this.f51641X0 = null;
        this.f51644a1.mo60164c();
    }

    /* renamed from: r2 */
    public final boolean mo60112r2(C20098d dVar) {
        if (this.f51633P0) {
            if (dVar.mo60185p() < this.f51627J0.mo60700i()) {
                ArrayList<View> arrayList = dVar.f51678a;
                return !dVar.mo60188s(arrayList.get(arrayList.size() - 1)).f51676f;
            }
        } else if (dVar.mo60189t() > this.f51627J0.mo60705n()) {
            return !dVar.mo60188s(dVar.f51678a.get(0)).f51676f;
        }
        return false;
    }

    /* renamed from: r3 */
    public void mo60113r3(int i) {
        mo59419q((String) null);
        if (i != this.f51625H0) {
            mo60086Y2();
            this.f51625H0 = i;
            this.f51634Q0 = new BitSet(this.f51625H0);
            this.f51626I0 = new C20098d[this.f51625H0];
            for (int i2 = 0; i2 < this.f51625H0; i2++) {
                this.f51626I0[i2] = new C20098d(i2);
            }
            mo59898N1();
        }
    }

    /* renamed from: s2 */
    public final int mo60114s2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        return C20105b0.m94002a(b0Var, this.f51627J0, mo60065D2(!this.f51646c1), mo60064C2(!this.f51646c1), this, this.f51646c1);
    }

    /* renamed from: s3 */
    public final void mo60115s3(int i, int i2) {
        for (int i3 = 0; i3 < this.f51625H0; i3++) {
            if (!this.f51626I0[i3].f51678a.isEmpty()) {
                mo60127y3(this.f51626I0[i3], i, i2);
            }
        }
    }

    /* renamed from: t2 */
    public final int mo60116t2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        return C20105b0.m94003b(b0Var, this.f51627J0, mo60065D2(!this.f51646c1), mo60064C2(!this.f51646c1), this, this.f51646c1, this.f51633P0);
    }

    /* renamed from: t3 */
    public final boolean mo60117t3(RecyclerView.C20055b0 b0Var, C20096b bVar) {
        int i;
        if (this.f51639V0) {
            i = mo60069H2(b0Var.mo59729d());
        } else {
            i = mo60063B2(b0Var.mo59729d());
        }
        bVar.f51667a = i;
        bVar.f51668b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: u2 */
    public final int mo60118u2(RecyclerView.C20055b0 b0Var) {
        if (mo59922Y() == 0) {
            return 0;
        }
        return C20105b0.m94004c(b0Var, this.f51627J0, mo60065D2(!this.f51646c1), mo60064C2(!this.f51646c1), this, this.f51646c1);
    }

    /* renamed from: u3 */
    public boolean mo60119u3(RecyclerView.C20055b0 b0Var, C20096b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!b0Var.mo59735j() && (i = this.f51635R0) != -1) {
            if (i < 0 || i >= b0Var.mo59729d()) {
                this.f51635R0 = -1;
                this.f51636S0 = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f51641X0;
                if (savedState == null || savedState.f51656a == -1 || savedState.f51658c < 1) {
                    View R = mo59384R(this.f51635R0);
                    if (R != null) {
                        if (this.f51633P0) {
                            i2 = mo60075N2();
                        } else {
                            i2 = mo60073L2();
                        }
                        bVar.f51667a = i2;
                        if (this.f51636S0 != Integer.MIN_VALUE) {
                            if (bVar.f51669c) {
                                bVar.f51668b = (this.f51627J0.mo60700i() - this.f51636S0) - this.f51627J0.mo60695d(R);
                            } else {
                                bVar.f51668b = (this.f51627J0.mo60705n() + this.f51636S0) - this.f51627J0.mo60698g(R);
                            }
                            return true;
                        } else if (this.f51627J0.mo60696e(R) > this.f51627J0.mo60706o()) {
                            if (bVar.f51669c) {
                                i3 = this.f51627J0.mo60700i();
                            } else {
                                i3 = this.f51627J0.mo60705n();
                            }
                            bVar.f51668b = i3;
                            return true;
                        } else {
                            int g = this.f51627J0.mo60698g(R) - this.f51627J0.mo60705n();
                            if (g < 0) {
                                bVar.f51668b = -g;
                                return true;
                            }
                            int i4 = this.f51627J0.mo60700i() - this.f51627J0.mo60695d(R);
                            if (i4 < 0) {
                                bVar.f51668b = i4;
                                return true;
                            }
                            bVar.f51668b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f51635R0;
                        bVar.f51667a = i5;
                        int i6 = this.f51636S0;
                        if (i6 == Integer.MIN_VALUE) {
                            if (mo60108p2(i5) == 1) {
                                z = true;
                            }
                            bVar.f51669c = z;
                            bVar.mo60162a();
                        } else {
                            bVar.mo60163b(i6);
                        }
                        bVar.f51670d = true;
                    }
                } else {
                    bVar.f51668b = Integer.MIN_VALUE;
                    bVar.f51667a = this.f51635R0;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo59428v() {
        return this.f51629L0 == 0;
    }

    /* renamed from: v1 */
    public void mo59429v1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f51641X0 = savedState;
            if (this.f51635R0 != -1) {
                savedState.mo60153a();
                this.f51641X0.mo60154b();
            }
            mo59898N1();
        }
    }

    /* renamed from: v2 */
    public final int mo60120v2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f51629L0 == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f51629L0 == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f51629L0 == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f51629L0 == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f51629L0 != 1 && mo60087Z2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f51629L0 != 1 && mo60087Z2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: v3 */
    public void mo60121v3(RecyclerView.C20055b0 b0Var, C20096b bVar) {
        if (!mo60119u3(b0Var, bVar) && !mo60117t3(b0Var, bVar)) {
            bVar.mo60162a();
            bVar.f51667a = 0;
        }
    }

    /* renamed from: w */
    public boolean mo59431w() {
        return this.f51629L0 == 1;
    }

    /* renamed from: w1 */
    public Parcelable mo59432w1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f51641X0 != null) {
            return new SavedState(this.f51641X0);
        }
        SavedState savedState = new SavedState();
        savedState.f51663v = this.f51632O0;
        savedState.f51664w = this.f51639V0;
        savedState.f51665x = this.f51640W0;
        LazySpanLookup lazySpanLookup = this.f51637T0;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f51650a) == null) {
            savedState.f51660e = 0;
        } else {
            savedState.f51661f = iArr;
            savedState.f51660e = iArr.length;
            savedState.f51662g = lazySpanLookup.f51651b;
        }
        if (mo59922Y() > 0) {
            if (this.f51639V0) {
                i = mo60075N2();
            } else {
                i = mo60073L2();
            }
            savedState.f51656a = i;
            savedState.f51657b = mo60066E2();
            int i4 = this.f51625H0;
            savedState.f51658c = i4;
            savedState.f51659d = new int[i4];
            for (int i5 = 0; i5 < this.f51625H0; i5++) {
                if (this.f51639V0) {
                    i2 = this.f51626I0[i5].mo60186q(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f51627J0.mo60700i();
                    } else {
                        savedState.f51659d[i5] = i2;
                    }
                } else {
                    i2 = this.f51626I0[i5].mo60190u(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f51627J0.mo60705n();
                    } else {
                        savedState.f51659d[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f51659d[i5] = i2;
            }
        } else {
            savedState.f51656a = -1;
            savedState.f51657b = -1;
            savedState.f51658c = 0;
        }
        return savedState;
    }

    /* renamed from: w2 */
    public final LazySpanLookup.FullSpanItem mo60122w2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f51654c = new int[this.f51625H0];
        for (int i2 = 0; i2 < this.f51625H0; i2++) {
            fullSpanItem.f51654c[i2] = i - this.f51626I0[i2].mo60186q(i);
        }
        return fullSpanItem;
    }

    /* renamed from: w3 */
    public final void mo60123w3(int i, RecyclerView.C20055b0 b0Var) {
        int i2;
        int i3;
        int g;
        boolean z;
        C20206q qVar = this.f51631N0;
        boolean z2 = false;
        qVar.f52138b = 0;
        qVar.f52139c = i;
        if (!mo59900O0() || (g = b0Var.mo59732g()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            boolean z3 = this.f51633P0;
            if (g < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i3 = this.f51627J0.mo60706o();
                i2 = 0;
            } else {
                i2 = this.f51627J0.mo60706o();
                i3 = 0;
            }
        }
        if (mo59932c0()) {
            this.f51631N0.f52142f = this.f51627J0.mo60705n() - i2;
            this.f51631N0.f52143g = this.f51627J0.mo60700i() + i3;
        } else {
            this.f51631N0.f52143g = this.f51627J0.mo60699h() + i3;
            this.f51631N0.f52142f = -i2;
        }
        C20206q qVar2 = this.f51631N0;
        qVar2.f52144h = false;
        qVar2.f52137a = true;
        if (this.f51627J0.mo60703l() == 0 && this.f51627J0.mo60699h() == 0) {
            z2 = true;
        }
        qVar2.f52145i = z2;
    }

    /* renamed from: x */
    public boolean mo59346x(RecyclerView.C20081p pVar) {
        return pVar instanceof C20097c;
    }

    /* renamed from: x1 */
    public void mo59981x1(int i) {
        if (i == 0) {
            mo60110q2();
        }
    }

    /* renamed from: x2 */
    public final LazySpanLookup.FullSpanItem mo60124x2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f51654c = new int[this.f51625H0];
        for (int i2 = 0; i2 < this.f51625H0; i2++) {
            fullSpanItem.f51654c[i2] = this.f51626I0[i2].mo60190u(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: x3 */
    public void mo60125x3(int i) {
        this.f51630M0 = i / this.f51625H0;
        this.f51642Y0 = View.MeasureSpec.makeMeasureSpec(i, this.f51628K0.mo60703l());
    }

    /* renamed from: y2 */
    public final void mo60126y2() {
        this.f51627J0 = C20224y.m94589b(this, this.f51629L0);
        this.f51628K0 = C20224y.m94589b(this, 1 - this.f51629L0);
    }

    /* renamed from: y3 */
    public final void mo60127y3(C20098d dVar, int i, int i2) {
        int o = dVar.mo60184o();
        if (i == -1) {
            if (dVar.mo60189t() + o <= i2) {
                this.f51634Q0.set(dVar.f51682e, false);
            }
        } else if (dVar.mo60185p() - o >= i2) {
            this.f51634Q0.set(dVar.f51682e, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: z */
    public void mo59436z(int i, int i2, RecyclerView.C20055b0 b0Var, RecyclerView.C20076o.C20079c cVar) {
        int i3;
        int i4;
        if (this.f51629L0 != 0) {
            i = i2;
        }
        if (mo59922Y() != 0 && i != 0) {
            mo60092e3(i, b0Var);
            int[] iArr = this.f51647d1;
            if (iArr == null || iArr.length < this.f51625H0) {
                this.f51647d1 = new int[this.f51625H0];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f51625H0; i6++) {
                C20206q qVar = this.f51631N0;
                if (qVar.f52140d == -1) {
                    i4 = qVar.f52142f;
                    i3 = this.f51626I0[i6].mo60190u(i4);
                } else {
                    i4 = this.f51626I0[i6].mo60186q(qVar.f52143g);
                    i3 = this.f51631N0.f52143g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f51647d1[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f51647d1, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f51631N0.mo60648a(b0Var); i8++) {
                cVar.mo59991a(this.f51631N0.f52139c, this.f51647d1[i8]);
                C20206q qVar2 = this.f51631N0;
                qVar2.f52139c += qVar2.f52140d;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: z2 */
    public final int mo60128z2(RecyclerView.C20089w wVar, C20206q qVar, RecyclerView.C20055b0 b0Var) {
        int i;
        int i2;
        int i3;
        boolean z;
        C20098d dVar;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        RecyclerView.C20089w wVar2 = wVar;
        C20206q qVar2 = qVar;
        ? r9 = 0;
        this.f51634Q0.set(0, this.f51625H0, true);
        if (this.f51631N0.f52145i) {
            if (qVar2.f52141e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (qVar2.f52141e == 1) {
            i = qVar2.f52143g + qVar2.f52138b;
        } else {
            i = qVar2.f52142f - qVar2.f52138b;
        }
        int i12 = i;
        mo60115s3(qVar2.f52141e, i12);
        if (this.f51633P0) {
            i2 = this.f51627J0.mo60700i();
        } else {
            i2 = this.f51627J0.mo60705n();
        }
        int i13 = i2;
        boolean z4 = false;
        while (qVar.mo60648a(b0Var) && (this.f51631N0.f52145i || !this.f51634Q0.isEmpty())) {
            View b = qVar2.mo60649b(wVar2);
            C20097c cVar = (C20097c) b.getLayoutParams();
            int d = cVar.mo59995d();
            int g = this.f51637T0.mo60136g(d);
            if (g == -1) {
                z = true;
            } else {
                z = r9;
            }
            if (z) {
                if (cVar.f51676f) {
                    dVar = this.f51626I0[r9];
                } else {
                    dVar = mo60080S2(qVar2);
                }
                this.f51637T0.mo60143n(d, dVar);
            } else {
                dVar = this.f51626I0[g];
            }
            C20098d dVar2 = dVar;
            cVar.f51675e = dVar2;
            if (qVar2.f52141e == 1) {
                addView(b);
            } else {
                addView(b, r9);
            }
            mo60089b3(b, cVar, r9);
            if (qVar2.f52141e == 1) {
                if (cVar.f51676f) {
                    i11 = mo60076O2(i13);
                } else {
                    i11 = dVar2.mo60186q(i13);
                }
                int e = this.f51627J0.mo60696e(b) + i11;
                if (z && cVar.f51676f) {
                    LazySpanLookup.FullSpanItem w2 = mo60122w2(i11);
                    w2.f51653b = -1;
                    w2.f51652a = d;
                    this.f51637T0.mo60130a(w2);
                }
                i4 = e;
                i5 = i11;
            } else {
                if (cVar.f51676f) {
                    i10 = mo60079R2(i13);
                } else {
                    i10 = dVar2.mo60190u(i13);
                }
                i5 = i10 - this.f51627J0.mo60696e(b);
                if (z && cVar.f51676f) {
                    LazySpanLookup.FullSpanItem x2 = mo60124x2(i10);
                    x2.f51653b = 1;
                    x2.f51652a = d;
                    this.f51637T0.mo60130a(x2);
                }
                i4 = i10;
            }
            if (cVar.f51676f && qVar2.f52140d == -1) {
                if (z) {
                    this.f51645b1 = true;
                } else {
                    if (qVar2.f52141e == 1) {
                        z3 = mo60102m2();
                    } else {
                        z3 = mo60104n2();
                    }
                    if (!z3) {
                        LazySpanLookup.FullSpanItem f = this.f51637T0.mo60135f(d);
                        if (f != null) {
                            f.f51655d = true;
                        }
                        this.f51645b1 = true;
                    }
                }
            }
            mo60106o2(b, cVar, qVar2);
            if (!mo60087Z2() || this.f51629L0 != 1) {
                if (cVar.f51676f) {
                    i8 = this.f51628K0.mo60705n();
                } else {
                    i8 = (dVar2.f51682e * this.f51630M0) + this.f51628K0.mo60705n();
                }
                i7 = i8;
                i6 = this.f51628K0.mo60696e(b) + i8;
            } else {
                if (cVar.f51676f) {
                    i9 = this.f51628K0.mo60700i();
                } else {
                    i9 = this.f51628K0.mo60700i() - (((this.f51625H0 - 1) - dVar2.f51682e) * this.f51630M0);
                }
                i6 = i9;
                i7 = i9 - this.f51628K0.mo60696e(b);
            }
            if (this.f51629L0 == 1) {
                mo59907R0(b, i7, i5, i6, i4);
            } else {
                mo59907R0(b, i5, i7, i4, i6);
            }
            if (cVar.f51676f) {
                mo60115s3(this.f51631N0.f52141e, i12);
            } else {
                mo60127y3(dVar2, this.f51631N0.f52141e, i12);
            }
            mo60094g3(wVar2, this.f51631N0);
            if (this.f51631N0.f52144h && b.hasFocusable()) {
                if (cVar.f51676f) {
                    this.f51634Q0.clear();
                } else {
                    z2 = false;
                    this.f51634Q0.set(dVar2.f51682e, false);
                    r9 = z2;
                    z4 = true;
                }
            }
            z2 = false;
            r9 = z2;
            z4 = true;
        }
        int i14 = r9;
        if (!z4) {
            mo60094g3(wVar2, this.f51631N0);
        }
        if (this.f51631N0.f52141e == -1) {
            i3 = this.f51627J0.mo60705n() - mo60079R2(this.f51627J0.mo60705n());
        } else {
            i3 = mo60076O2(this.f51627J0.mo60700i()) - this.f51627J0.mo60700i();
        }
        if (i3 > 0) {
            return Math.min(qVar2.f52138b, i3);
        }
        return i14;
    }

    /* renamed from: z3 */
    public final int mo60129z3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public static class LazySpanLookup {

        /* renamed from: c */
        public static final int f51649c = 10;

        /* renamed from: a */
        public int[] f51650a;

        /* renamed from: b */
        public List<FullSpanItem> f51651b;

        /* renamed from: a */
        public void mo60130a(FullSpanItem fullSpanItem) {
            if (this.f51651b == null) {
                this.f51651b = new ArrayList();
            }
            int size = this.f51651b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f51651b.get(i);
                if (fullSpanItem2.f51652a == fullSpanItem.f51652a) {
                    this.f51651b.remove(i);
                }
                if (fullSpanItem2.f51652a >= fullSpanItem.f51652a) {
                    this.f51651b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f51651b.add(fullSpanItem);
        }

        /* renamed from: b */
        public void mo60131b() {
            int[] iArr = this.f51650a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f51651b = null;
        }

        /* renamed from: c */
        public void mo60132c(int i) {
            int[] iArr = this.f51650a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f51650a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo60144o(i)];
                this.f51650a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f51650a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int mo60133d(int i) {
            List<FullSpanItem> list = this.f51651b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f51651b.get(size).f51652a >= i) {
                        this.f51651b.remove(size);
                    }
                }
            }
            return mo60137h(i);
        }

        /* renamed from: e */
        public FullSpanItem mo60134e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f51651b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f51651b.get(i4);
                int i5 = fullSpanItem.f51652a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f51653b == i3 || (z && fullSpanItem.f51655d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem mo60135f(int i) {
            List<FullSpanItem> list = this.f51651b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f51651b.get(size);
                if (fullSpanItem.f51652a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int mo60136g(int i) {
            int[] iArr = this.f51650a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        public int mo60137h(int i) {
            int[] iArr = this.f51650a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = mo60138i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f51650a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f51650a.length;
            }
            int min = Math.min(i2 + 1, this.f51650a.length);
            Arrays.fill(this.f51650a, i, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int mo60138i(int i) {
            if (this.f51651b == null) {
                return -1;
            }
            FullSpanItem f = mo60135f(i);
            if (f != null) {
                this.f51651b.remove(f);
            }
            int size = this.f51651b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f51651b.get(i2).f51652a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f51651b.remove(i2);
            return this.f51651b.get(i2).f51652a;
        }

        /* renamed from: j */
        public void mo60139j(int i, int i2) {
            int[] iArr = this.f51650a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo60132c(i3);
                int[] iArr2 = this.f51650a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f51650a, i, i3, -1);
                mo60141l(i, i2);
            }
        }

        /* renamed from: k */
        public void mo60140k(int i, int i2) {
            int[] iArr = this.f51650a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo60132c(i3);
                int[] iArr2 = this.f51650a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f51650a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                mo60142m(i, i2);
            }
        }

        /* renamed from: l */
        public final void mo60141l(int i, int i2) {
            List<FullSpanItem> list = this.f51651b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f51651b.get(size);
                    int i3 = fullSpanItem.f51652a;
                    if (i3 >= i) {
                        fullSpanItem.f51652a = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        public final void mo60142m(int i, int i2) {
            List<FullSpanItem> list = this.f51651b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f51651b.get(size);
                    int i4 = fullSpanItem.f51652a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f51651b.remove(size);
                        } else {
                            fullSpanItem.f51652a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: n */
        public void mo60143n(int i, C20098d dVar) {
            mo60132c(i);
            this.f51650a[i] = dVar.f51682e;
        }

        /* renamed from: o */
        public int mo60144o(int i) {
            int length = this.f51650a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C20093a();

            /* renamed from: a */
            public int f51652a;

            /* renamed from: b */
            public int f51653b;

            /* renamed from: c */
            public int[] f51654c;

            /* renamed from: d */
            public boolean f51655d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C20093a implements Parcelable.Creator<FullSpanItem> {
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f51652a = parcel.readInt();
                this.f51653b = parcel.readInt();
                this.f51655d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f51654c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int mo60145a(int i) {
                int[] iArr = this.f51654c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f51652a + ", mGapDir=" + this.f51653b + ", mHasUnwantedGapAfter=" + this.f51655d + ", mGapPerSpan=" + Arrays.toString(this.f51654c) + C12361b.f30259j;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f51652a);
                parcel.writeInt(this.f51653b);
                parcel.writeInt(this.f51655d ? 1 : 0);
                int[] iArr = this.f51654c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f51654c);
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f51629L0 = i2;
        mo60113r3(i);
        this.f51631N0 = new C20206q();
        mo60126y2();
    }
}
