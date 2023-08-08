package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.math.C17760a;
import androidx.core.util.C17992m;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18355r1;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18098w0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31530k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C16976b {

    /* renamed from: L0 */
    public static final int f74449L0 = 0;

    /* renamed from: M0 */
    public static final int f74450M0 = 1;

    /* renamed from: N0 */
    public static final int f74451N0 = 2;

    /* renamed from: O0 */
    public static final int f74452O0 = 4;

    /* renamed from: P0 */
    public static final int f74453P0 = 8;

    /* renamed from: Q0 */
    public static final int f74454Q0 = C31076a.C31090n.Widget_Design_AppBarLayout;

    /* renamed from: R0 */
    public static final int f74455R0 = -1;
    @C0329d0

    /* renamed from: E0 */
    public int f74456E0;
    @C0363p0

    /* renamed from: F0 */
    public WeakReference<View> f74457F0;
    @C0363p0

    /* renamed from: G0 */
    public ValueAnimator f74458G0;

    /* renamed from: H0 */
    public final List<C31118g> f74459H0;

    /* renamed from: I0 */
    public int[] f74460I0;
    @C0363p0

    /* renamed from: J0 */
    public Drawable f74461J0;

    /* renamed from: K0 */
    public Behavior f74462K0;

    /* renamed from: a */
    public int f74463a;

    /* renamed from: b */
    public int f74464b;

    /* renamed from: c */
    public int f74465c;

    /* renamed from: d */
    public int f74466d;

    /* renamed from: e */
    public boolean f74467e;

    /* renamed from: f */
    public int f74468f;
    @C0363p0

    /* renamed from: g */
    public C18436z4 f74469g;

    /* renamed from: v */
    public List<C31113c> f74470v;

    /* renamed from: w */
    public boolean f74471w;

    /* renamed from: x */
    public boolean f74472x;

    /* renamed from: y */
    public boolean f74473y;

    /* renamed from: z */
    public boolean f74474z;

    public static class BaseBehavior<T extends AppBarLayout> extends C31125a<T> {

        /* renamed from: s */
        public static final int f74475s = 600;

        /* renamed from: l */
        public int f74476l;

        /* renamed from: m */
        public int f74477m;

        /* renamed from: n */
        public ValueAnimator f74478n;

        /* renamed from: o */
        public SavedState f74479o;
        @C0363p0

        /* renamed from: p */
        public WeakReference<View> f74480p;

        /* renamed from: q */
        public C31109e f74481q;

        /* renamed from: r */
        public boolean f74482r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C31105a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f74488a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f74489b;

            public C31105a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f74488a = coordinatorLayout;
                this.f74489b = appBarLayout;
            }

            public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
                BaseBehavior.this.mo88135X(this.f74488a, this.f74489b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public class C31106b extends C18019a {
            public C31106b() {
            }

            /* renamed from: g */
            public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
                super.mo19938g(view, l0Var);
                l0Var.mo52542I1(BaseBehavior.this.f74482r);
                l0Var.mo52592Z0(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        public class C31107c implements C18098w0 {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f74492a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f74493b;

            /* renamed from: c */
            public final /* synthetic */ View f74494c;

            /* renamed from: d */
            public final /* synthetic */ int f74495d;

            public C31107c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f74492a = coordinatorLayout;
                this.f74493b = appBarLayout;
                this.f74494c = view;
                this.f74495d = i;
            }

            /* renamed from: a */
            public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
                BaseBehavior.this.mo51094r(this.f74492a, this.f74493b, this.f74494c, 0, this.f74495d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public class C31108d implements C18098w0 {

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f74497a;

            /* renamed from: b */
            public final /* synthetic */ boolean f74498b;

            public C31108d(AppBarLayout appBarLayout, boolean z) {
                this.f74497a = appBarLayout;
                this.f74498b = z;
            }

            /* renamed from: a */
            public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
                this.f74497a.setExpanded(this.f74498b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        public static abstract class C31109e<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo87989a(@C0359n0 T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: i0 */
        public static boolean m124719i0(int i, int i2) {
            return (i & i2) == i2;
        }

        @C0363p0
        /* renamed from: l0 */
        public static View m124720l0(@C0359n0 AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: A0 */
        public void mo51076D(CoordinatorLayout coordinatorLayout, @C0359n0 T t, View view, int i) {
            if (this.f74477m == 0 || i == 1) {
                mo87950G0(coordinatorLayout, t);
                if (t.mo87920p()) {
                    t.mo87879B(t.mo87882E(view));
                }
            }
            this.f74480p = new WeakReference<>(view);
        }

        /* renamed from: B0 */
        public void mo87945B0(@C0363p0 SavedState savedState, boolean z) {
            if (this.f74479o == null || z) {
                this.f74479o = savedState;
            }
        }

        @C0363p0
        /* renamed from: C0 */
        public SavedState mo87946C0(@C0363p0 Parcelable parcelable, @C0359n0 T t) {
            boolean z;
            boolean z2;
            int H = mo87991H();
            int childCount = t.getChildCount();
            boolean z3 = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + H;
                if (childAt.getTop() + H > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f47317b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (H == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.f74484d = z;
                    if (z || (-H) < t.getTotalScrollRange()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    savedState.f74483c = z2;
                    savedState.f74485e = i;
                    if (bottom == C18196h2.m82573e0(childAt) + t.getTopInset()) {
                        z3 = true;
                    }
                    savedState.f74487g = z3;
                    savedState.f74486f = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return null;
        }

        /* renamed from: D0 */
        public void mo87947D0(@C0363p0 C31109e eVar) {
            this.f74481q = eVar;
        }

        /* renamed from: E0 */
        public int mo87958Y(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, int i, int i2, int i3) {
            int i4;
            int U = mo87956U();
            int i5 = 0;
            if (i2 == 0 || U < i2 || U > i3) {
                this.f74476l = 0;
            } else {
                int e = C17760a.m81102e(i, i2, i3);
                if (U != e) {
                    if (t.mo87911l()) {
                        i4 = mo87972q0(t, e);
                    } else {
                        i4 = e;
                    }
                    boolean N = mo87996N(i4);
                    int i6 = U - e;
                    this.f74476l = e - i4;
                    int i7 = 1;
                    if (N) {
                        while (i5 < t.getChildCount()) {
                            C31116f fVar = (C31116f) t.getChildAt(i5).getLayoutParams();
                            C31114d b = fVar.mo88007b();
                            if (!(b == null || (fVar.mo88008c() & 1) == 0)) {
                                b.mo88005a(t, t.getChildAt(i5), (float) mo87991H());
                            }
                            i5++;
                        }
                    }
                    if (!N && t.mo87911l()) {
                        coordinatorLayout.mo51037j(t);
                    }
                    t.mo87922r(mo87991H());
                    if (e < U) {
                        i7 = -1;
                    }
                    mo87952I0(coordinatorLayout, t, e, i7, false);
                    i5 = i6;
                }
            }
            mo87951H0(coordinatorLayout, t);
            return i5;
        }

        /* renamed from: F0 */
        public final boolean mo87949F0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t) {
            List<View> x = coordinatorLayout.mo51063x(t);
            int size = x.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) x.get(i).getLayoutParams()).mo51111f();
                if (!(f instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f).mo88139S() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: G0 */
        public final void mo87950G0(CoordinatorLayout coordinatorLayout, @C0359n0 T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int U = mo87956U() - topInset;
            int m0 = mo87968m0(t, U);
            if (m0 >= 0) {
                View childAt = t.getChildAt(m0);
                C31116f fVar = (C31116f) childAt.getLayoutParams();
                int c = fVar.mo88008c();
                if ((c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m0 == 0 && C18196h2.m82538U(t) && C18196h2.m82538U(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (m124719i0(c, 2)) {
                        i2 += C18196h2.m82573e0(childAt);
                    } else if (m124719i0(c, 5)) {
                        int e0 = C18196h2.m82573e0(childAt) + i2;
                        if (U < e0) {
                            i = e0;
                        } else {
                            i2 = e0;
                        }
                    }
                    if (m124719i0(c, 32)) {
                        i += fVar.topMargin;
                        i2 -= fVar.bottomMargin;
                    }
                    mo87961d0(coordinatorLayout, t, C17760a.m81102e(mo87963f0(U, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: H0 */
        public final void mo87951H0(CoordinatorLayout coordinatorLayout, @C0359n0 T t) {
            View n0;
            C18196h2.m82626r1(coordinatorLayout, C18065l0.C18066a.f46681r.mo52676b());
            C18196h2.m82626r1(coordinatorLayout, C18065l0.C18066a.f46682s.mo52676b());
            if (t.getTotalScrollRange() != 0 && (n0 = mo87969n0(coordinatorLayout)) != null && mo87966j0(t)) {
                if (!C18196h2.m82493G0(coordinatorLayout)) {
                    C18196h2.m82474B1(coordinatorLayout, new C31106b());
                }
                this.f74482r = mo87959b0(coordinatorLayout, t, n0);
            }
        }

        /* renamed from: I0 */
        public final void mo87952I0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, int i, int i2, boolean z) {
            View l0 = m124720l0(t, i);
            boolean z2 = false;
            if (l0 != null) {
                int c = ((C31116f) l0.getLayoutParams()).mo88008c();
                if ((c & 1) != 0) {
                    int e0 = C18196h2.m82573e0(l0);
                    if (i2 <= 0 || (c & 12) == 0 ? !((c & 2) == 0 || (-i) < (l0.getBottom() - e0) - t.getTopInset()) : (-i) >= (l0.getBottom() - e0) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.mo87920p()) {
                z2 = t.mo87882E(mo87967k0(coordinatorLayout));
            }
            boolean B = t.mo87879B(z2);
            if (z || (B && mo87949F0(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        /* renamed from: U */
        public int mo87956U() {
            return mo87991H() + this.f74476l;
        }

        /* renamed from: b0 */
        public final boolean mo87959b0(CoordinatorLayout coordinatorLayout, @C0359n0 T t, @C0359n0 View view) {
            boolean z = false;
            if (mo87956U() != (-t.getTotalScrollRange())) {
                mo87960c0(coordinatorLayout, t, C18065l0.C18066a.f46681r, false);
                z = true;
            }
            if (mo87956U() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C18196h2.m82638u1(coordinatorLayout, C18065l0.C18066a.f46682s, (CharSequence) null, new C31107c(coordinatorLayout, t, view, i));
                        return true;
                    }
                } else {
                    mo87960c0(coordinatorLayout, t, C18065l0.C18066a.f46682s, true);
                    return true;
                }
            }
            return z;
        }

        /* renamed from: c0 */
        public final void mo87960c0(CoordinatorLayout coordinatorLayout, @C0359n0 T t, @C0359n0 C18065l0.C18066a aVar, boolean z) {
            C18196h2.m82638u1(coordinatorLayout, aVar, (CharSequence) null, new C31108d(t, z));
        }

        /* renamed from: d0 */
        public final void mo87961d0(CoordinatorLayout coordinatorLayout, @C0359n0 T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo87956U() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            mo87962e0(coordinatorLayout, t, i, i2);
        }

        /* renamed from: e0 */
        public final void mo87962e0(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int U = mo87956U();
            if (U == i) {
                ValueAnimator valueAnimator = this.f74478n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f74478n.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f74478n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f74478n = valueAnimator3;
                valueAnimator3.setInterpolator(C31093a.f74429e);
                this.f74478n.addUpdateListener(new C31105a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f74478n.setDuration((long) Math.min(i2, 600));
            this.f74478n.setIntValues(new int[]{U, i});
            this.f74478n.start();
        }

        /* renamed from: f0 */
        public final int mo87963f0(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        /* renamed from: g0 */
        public boolean mo87953P(T t) {
            C31109e eVar = this.f74481q;
            if (eVar != null) {
                return eVar.mo87989a(t);
            }
            WeakReference<View> weakReference = this.f74480p;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: h0 */
        public final boolean mo87965h0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, @C0359n0 View view) {
            if (!t.mo87913n() || coordinatorLayout.getHeight() - view.getHeight() > t.getHeight()) {
                return false;
            }
            return true;
        }

        /* renamed from: j0 */
        public final boolean mo87966j0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((C31116f) appBarLayout.getChildAt(i).getLayoutParams()).f74518a != 0) {
                    return true;
                }
            }
            return false;
        }

        @C0363p0
        /* renamed from: k0 */
        public final View mo87967k0(@C0359n0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C18355r1) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: m0 */
        public final int mo87968m0(@C0359n0 T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C31116f fVar = (C31116f) childAt.getLayoutParams();
                if (m124719i0(fVar.mo88008c(), 32)) {
                    top -= fVar.topMargin;
                    bottom += fVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        @C0363p0
        /* renamed from: n0 */
        public final View mo87969n0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C16981g) childAt.getLayoutParams()).mo51111f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: o0 */
        public int mo87954S(@C0359n0 T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: p0 */
        public int mo87955T(@C0359n0 T t) {
            return t.getTotalScrollRange();
        }

        /* renamed from: q0 */
        public final int mo87972q0(@C0359n0 T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C31116f fVar = (C31116f) childAt.getLayoutParams();
                Interpolator d = fVar.mo88009d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c = fVar.mo88008c();
                    if ((c & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + fVar.topMargin + fVar.bottomMargin;
                        if ((c & 2) != 0) {
                            i2 -= C18196h2.m82573e0(childAt);
                        }
                    }
                    if (C18196h2.m82538U(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        @C0344h1
        /* renamed from: r0 */
        public boolean mo87973r0() {
            ValueAnimator valueAnimator = this.f74478n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* renamed from: s0 */
        public void mo87957V(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t) {
            mo87950G0(coordinatorLayout, t);
            if (t.mo87920p()) {
                t.mo87879B(t.mo87882E(mo87967k0(coordinatorLayout)));
            }
        }

        /* renamed from: t0 */
        public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, int i) {
            boolean z;
            int i2;
            boolean m = super.mo51089m(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.f74479o;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    if ((pendingAction & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((pendingAction & 2) != 0) {
                        int i3 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            mo87961d0(coordinatorLayout, t, i3, 0.0f);
                        } else {
                            mo88135X(coordinatorLayout, t, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            mo87961d0(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            mo88135X(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.f74483c) {
                mo88135X(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (savedState.f74484d) {
                mo88135X(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(savedState.f74485e);
                int i4 = -childAt.getBottom();
                if (this.f74479o.f74487g) {
                    i2 = C18196h2.m82573e0(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f74479o.f74486f);
                }
                mo88135X(coordinatorLayout, t, i4 + i2);
            }
            t.mo87940w();
            this.f74479o = null;
            mo87996N(C17760a.m81102e(mo87991H(), -t.getTotalScrollRange(), 0));
            mo87952I0(coordinatorLayout, t, mo87991H(), 0, true);
            t.mo87922r(mo87991H());
            mo87951H0(coordinatorLayout, t);
            return m;
        }

        /* renamed from: u0 */
        public boolean mo51090n(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C16981g) t.getLayoutParams()).height != -2) {
                return super.mo51090n(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo51013O(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: v0 */
        public void mo51094r(CoordinatorLayout coordinatorLayout, @C0359n0 T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i5 = -t.getTotalScrollRange();
                    i4 = t.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                int i6 = i5;
                int i7 = i4;
                if (i6 != i7) {
                    iArr[1] = mo88134W(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.mo87920p()) {
                t.mo87879B(t.mo87882E(view));
            }
        }

        /* renamed from: w0 */
        public void mo51097u(CoordinatorLayout coordinatorLayout, @C0359n0 T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo88134W(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                mo87951H0(coordinatorLayout, t);
            }
        }

        /* renamed from: x0 */
        public void mo51101y(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                mo87945B0((SavedState) parcelable, true);
                super.mo51101y(coordinatorLayout, t, this.f74479o.mo53419a());
                return;
            }
            super.mo51101y(coordinatorLayout, t, parcelable);
            this.f74479o = null;
        }

        /* renamed from: y0 */
        public Parcelable mo51102z(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t) {
            Parcelable z = super.mo51102z(coordinatorLayout, t);
            SavedState C0 = mo87946C0(z, t);
            if (C0 == null) {
                return z;
            }
            return C0;
        }

        /* renamed from: z0 */
        public boolean mo51074B(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 T t, @C0359n0 View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) == 0 || (!t.mo87920p() && !mo87965h0(coordinatorLayout, t, view))) {
                z = false;
            } else {
                z = true;
            }
            if (z && (valueAnimator = this.f74478n) != null) {
                valueAnimator.cancel();
            }
            this.f74480p = null;
            this.f74477m = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C31104a();

            /* renamed from: c */
            public boolean f74483c;

            /* renamed from: d */
            public boolean f74484d;

            /* renamed from: e */
            public int f74485e;

            /* renamed from: f */
            public float f74486f;

            /* renamed from: g */
            public boolean f74487g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public class C31104a implements Parcelable.ClassLoaderCreator<SavedState> {
                @C0363p0
                /* renamed from: a */
                public SavedState createFromParcel(@C0359n0 Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }

                @C0359n0
                /* renamed from: b */
                public SavedState createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @C0359n0
                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f74483c = parcel.readByte() != 0;
                this.f74484d = parcel.readByte() != 0;
                this.f74485e = parcel.readInt();
                this.f74486f = parcel.readFloat();
                this.f74487g = parcel.readByte() == 0 ? false : z;
            }

            public void writeToParcel(@C0359n0 Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f74483c ? (byte) 1 : 0);
                parcel.writeByte(this.f74484d ? (byte) 1 : 0);
                parcel.writeInt(this.f74485e);
                parcel.writeFloat(this.f74486f);
                parcel.writeByte(this.f74487g ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$a */
        public static abstract class C31110a extends BaseBehavior.C31109e<AppBarLayout> {
        }

        public Behavior() {
        }

        /* renamed from: A0 */
        public /* bridge */ /* synthetic */ void mo87944A0(CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, View view, int i) {
            super.mo51076D(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: D0 */
        public /* bridge */ /* synthetic */ void mo87947D0(@C0363p0 BaseBehavior.C31109e eVar) {
            super.mo87947D0(eVar);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo51077E(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
            return super.mo51077E(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ int mo87990G() {
            return super.mo87990G();
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ int mo87991H() {
            return super.mo87991H();
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo87992I() {
            return super.mo87992I();
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ boolean mo87993J() {
            return super.mo87993J();
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ void mo87994L(boolean z) {
            super.mo87994L(z);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo87995M(int i) {
            return super.mo87995M(i);
        }

        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo87996N(int i) {
            return super.mo87996N(i);
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ void mo87997O(boolean z) {
            super.mo87997O(z);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo51088l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
            return super.mo51088l(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ boolean mo87975t0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, int i) {
            return super.mo51089m(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean mo87976u0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo51090n(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void mo87977v0(CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo51094r(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void mo87978w0(CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo51097u(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: x0 */
        public /* bridge */ /* synthetic */ void mo87979x0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo51101y(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: y0 */
        public /* bridge */ /* synthetic */ Parcelable mo87980y0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout) {
            return super.mo51102z(coordinatorLayout, appBarLayout);
        }

        /* renamed from: z0 */
        public /* bridge */ /* synthetic */ boolean mo87981z0(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 View view, View view2, int i, int i2) {
            return super.mo51074B(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C31127b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: Z */
        public static int m124793Z(@C0359n0 AppBarLayout appBarLayout) {
            CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) appBarLayout.getLayoutParams()).mo51111f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo87956U();
            }
            return 0;
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ int mo87990G() {
            return super.mo87990G();
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ int mo87991H() {
            return super.mo87991H();
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo87992I() {
            return super.mo87992I();
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ boolean mo87993J() {
            return super.mo87993J();
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ void mo87994L(boolean z) {
            super.mo87994L(z);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo87995M(int i) {
            return super.mo87995M(i);
        }

        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo87996N(int i) {
            return super.mo87996N(i);
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ void mo87997O(boolean z) {
            super.mo87997O(z);
        }

        /* renamed from: R */
        public float mo87999R(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int Z = m124793Z(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + Z > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) Z) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: T */
        public int mo88000T(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo88000T(view);
        }

        @C0363p0
        /* renamed from: Y */
        public AppBarLayout mo87998P(@C0359n0 List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        public final void mo88002a0(@C0359n0 View view, @C0359n0 View view2) {
            CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) view2.getLayoutParams()).mo51111f();
            if (f instanceof BaseBehavior) {
                C18196h2.m82578f1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f74476l) + mo88140U()) - mo88138Q(view2));
            }
        }

        /* renamed from: b0 */
        public final void mo88003b0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo87920p()) {
                    appBarLayout.mo87879B(appBarLayout.mo87882E(view));
                }
            }
        }

        /* renamed from: f */
        public boolean mo51082f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: i */
        public boolean mo51085i(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 View view2) {
            mo88002a0(view, view2);
            mo88003b0(view, view2);
            return false;
        }

        /* renamed from: j */
        public void mo51086j(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 View view2) {
            if (view2 instanceof AppBarLayout) {
                C18196h2.m82626r1(coordinatorLayout, C18065l0.C18066a.f46681r.mo52676b());
                C18196h2.m82626r1(coordinatorLayout, C18065l0.C18066a.f46682s.mo52676b());
                C18196h2.m82474B1(coordinatorLayout, (C18019a) null);
            }
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, int i) {
            return super.mo51089m(coordinatorLayout, view, i);
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ boolean mo51090n(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, int i, int i2, int i3, int i4) {
            return super.mo51090n(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: x */
        public boolean mo51100x(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 Rect rect, boolean z) {
            AppBarLayout Y = mo87998P(coordinatorLayout.mo51062w(view));
            if (Y != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f74581d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Y.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.ScrollingViewBehavior_Layout);
            mo88141W(obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C31111a implements C18414x1 {
        public C31111a() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            return AppBarLayout.this.mo87923s(z4Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public class C31112b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C31525j f74501a;

        public C31112b(C31525j jVar) {
            this.f74501a = jVar;
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f74501a.mo90775n0(floatValue);
            if (AppBarLayout.this.f74461J0 instanceof C31525j) {
                ((C31525j) AppBarLayout.this.f74461J0).mo90775n0(floatValue);
            }
            for (C31118g a : AppBarLayout.this.f74459H0) {
                a.mo88014a(floatValue, this.f74501a.mo90716D());
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C31113c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo83757a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static abstract class C31114d {
        /* renamed from: a */
        public abstract void mo88005a(@C0359n0 AppBarLayout appBarLayout, @C0359n0 View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public static class C31115e extends C31114d {

        /* renamed from: c */
        public static final float f74503c = 0.3f;

        /* renamed from: a */
        public final Rect f74504a = new Rect();

        /* renamed from: b */
        public final Rect f74505b = new Rect();

        /* renamed from: b */
        public static void m124817b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        /* renamed from: a */
        public void mo88005a(@C0359n0 AppBarLayout appBarLayout, @C0359n0 View view, float f) {
            m124817b(this.f74504a, appBarLayout, view);
            float abs = ((float) this.f74504a.top) - Math.abs(f);
            if (abs <= 0.0f) {
                float d = 1.0f - C17760a.m81101d(Math.abs(abs / ((float) this.f74504a.height())), 0.0f, 1.0f);
                float height = (-abs) - ((((float) this.f74504a.height()) * 0.3f) * (1.0f - (d * d)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f74505b);
                this.f74505b.offset(0, (int) (-height));
                C18196h2.m82516M1(view, this.f74505b);
                return;
            }
            C18196h2.m82516M1(view, (Rect) null);
            view.setTranslationY(0.0f);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    public interface C31118g {
        /* renamed from: a */
        void mo88014a(@C0366r float f, @C0354l int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$h */
    public interface C31119h extends C31113c<AppBarLayout> {
        /* renamed from: a */
        void mo83757a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public boolean mo87878A(boolean z) {
        return mo87880C(z, true);
    }

    /* renamed from: B */
    public boolean mo87879B(boolean z) {
        return mo87880C(z, !this.f74471w);
    }

    /* renamed from: C */
    public boolean mo87880C(boolean z, boolean z2) {
        if (!z2 || this.f74473y == z) {
            return false;
        }
        this.f74473y = z;
        refreshDrawableState();
        if (!this.f74474z || !(getBackground() instanceof C31525j)) {
            return true;
        }
        mo87884G((C31525j) getBackground(), z);
        return true;
    }

    /* renamed from: D */
    public final boolean mo87881D() {
        return this.f74461J0 != null && getTopInset() > 0;
    }

    /* renamed from: E */
    public boolean mo87882E(@C0363p0 View view) {
        View h = mo87907h(view);
        if (h != null) {
            view = h;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo87883F() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C18196h2.m82538U(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final void mo87884G(@C0359n0 C31525j jVar, boolean z) {
        float f;
        float dimension = getResources().getDimension(C31076a.C31082f.design_appbar_elevation);
        if (z) {
            f = 0.0f;
        } else {
            f = dimension;
        }
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f74458G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f74458G0 = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C31076a.C31085i.app_bar_elevation_anim_duration));
        this.f74458G0.setInterpolator(C31093a.f74425a);
        this.f74458G0.addUpdateListener(new C31112b(jVar));
        this.f74458G0.start();
    }

    /* renamed from: H */
    public final void mo87885H() {
        setWillNotDraw(!mo87881D());
    }

    /* renamed from: c */
    public void mo87886c(@C0359n0 C31118g gVar) {
        this.f74459H0.add(gVar);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C31116f;
    }

    /* renamed from: d */
    public void mo87888d(@C0363p0 C31113c cVar) {
        if (this.f74470v == null) {
            this.f74470v = new ArrayList();
        }
        if (cVar != null && !this.f74470v.contains(cVar)) {
            this.f74470v.add(cVar);
        }
    }

    public void draw(@C0359n0 Canvas canvas) {
        super.draw(canvas);
        if (mo87881D()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f74463a));
            this.f74461J0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f74461J0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public void mo87891e(C31119h hVar) {
        mo87888d(hVar);
    }

    /* renamed from: f */
    public void mo87892f() {
        this.f74459H0.clear();
    }

    /* renamed from: g */
    public final void mo87893g() {
        WeakReference<View> weakReference = this.f74457F0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f74457F0 = null;
    }

    @C0359n0
    public CoordinatorLayout.C16977c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f74462K0 = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int e0;
        int i2 = this.f74465c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C31116f fVar = (C31116f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.f74518a;
            if ((i4 & 5) == 5) {
                int i5 = fVar.topMargin + fVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    e0 = C18196h2.m82573e0(childAt);
                } else if ((i4 & 2) != 0) {
                    e0 = measuredHeight - C18196h2.m82573e0(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C18196h2.m82538U(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + e0;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f74465c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f74466d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C31116f fVar = (C31116f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + fVar.topMargin + fVar.bottomMargin;
            int i4 = fVar.f74518a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C18196h2.m82573e0(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f74466d = max;
        return max;
    }

    @C0329d0
    public int getLiftOnScrollTargetViewId() {
        return this.f74456E0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int e0 = C18196h2.m82573e0(this);
        if (e0 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                e0 = C18196h2.m82573e0(getChildAt(childCount - 1));
            } else {
                e0 = 0;
            }
            if (e0 == 0) {
                return getHeight() / 3;
            }
        }
        return (e0 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f74468f;
    }

    @C0363p0
    public Drawable getStatusBarForeground() {
        return this.f74461J0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @C0344h1
    public final int getTopInset() {
        C18436z4 z4Var = this.f74469g;
        if (z4Var != null) {
            return z4Var.mo53149r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f74464b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C31116f fVar = (C31116f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.f74518a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + fVar.topMargin + fVar.bottomMargin;
            if (i2 == 0 && C18196h2.m82538U(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C18196h2.m82573e0(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f74464b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @C0363p0
    /* renamed from: h */
    public final View mo87907h(@C0363p0 View view) {
        int i;
        View view2;
        if (this.f74457F0 == null && (i = this.f74456E0) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f74456E0);
            }
            if (view2 != null) {
                this.f74457F0 = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f74457F0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public C31116f generateDefaultLayoutParams() {
        return new C31116f(-1, -2);
    }

    /* renamed from: j */
    public C31116f generateLayoutParams(AttributeSet attributeSet) {
        return new C31116f(getContext(), attributeSet);
    }

    /* renamed from: k */
    public C31116f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C31116f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C31116f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C31116f(layoutParams);
    }

    /* renamed from: l */
    public boolean mo87911l() {
        return this.f74467e;
    }

    /* renamed from: m */
    public final boolean mo87912m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C31116f) getChildAt(i).getLayoutParams()).mo88010e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo87913n() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: o */
    public final void mo87914o() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.f74462K0;
        if (behavior == null || this.f74464b == -1 || this.f74468f != 0) {
            savedState = null;
        } else {
            savedState = behavior.mo87946C0(AbsSavedState.f47317b, this);
        }
        this.f74464b = -1;
        this.f74465c = -1;
        this.f74466d = -1;
        if (savedState != null) {
            this.f74462K0.mo87945B0(savedState, false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127554e(this);
    }

    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f74460I0 == null) {
            this.f74460I0 = new int[4];
        }
        int[] iArr = this.f74460I0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f74472x;
        int i4 = C31076a.C31079c.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (!z || !this.f74473y) {
            i2 = -C31076a.C31079c.state_lifted;
        } else {
            i2 = C31076a.C31079c.state_lifted;
        }
        iArr[1] = i2;
        int i5 = C31076a.C31079c.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (!z || !this.f74473y) {
            i3 = -C31076a.C31079c.state_collapsed;
        } else {
            i3 = C31076a.C31079c.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo87893g();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C18196h2.m82538U(this) && mo87883F()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C18196h2.m82578f1(getChildAt(childCount), topInset);
            }
        }
        mo87914o();
        this.f74467e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C31116f) getChildAt(i5).getLayoutParams()).mo88009d() != null) {
                this.f74467e = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f74461J0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f74471w) {
            if (!this.f74474z && !mo87912m()) {
                z2 = false;
            }
            mo87943z(z2);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C18196h2.m82538U(this) && mo87883F()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C17760a.m81102e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        mo87914o();
    }

    /* renamed from: p */
    public boolean mo87920p() {
        return this.f74474z;
    }

    /* renamed from: q */
    public boolean mo87921q() {
        return this.f74473y;
    }

    /* renamed from: r */
    public void mo87922r(int i) {
        this.f74463a = i;
        if (!willNotDraw()) {
            C18196h2.m82610n1(this);
        }
        List<C31113c> list = this.f74470v;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C31113c cVar = this.f74470v.get(i2);
                if (cVar != null) {
                    cVar.mo83757a(this, i);
                }
            }
        }
    }

    /* renamed from: s */
    public C18436z4 mo87923s(C18436z4 z4Var) {
        C18436z4 z4Var2;
        if (C18196h2.m82538U(this)) {
            z4Var2 = z4Var;
        } else {
            z4Var2 = null;
        }
        if (!C17992m.m81740a(this.f74469g, z4Var2)) {
            this.f74469g = z4Var2;
            mo87885H();
            requestLayout();
        }
        return z4Var;
    }

    @C0376v0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C31530k.m127553d(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, C18196h2.m82539U0(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f74474z = z;
    }

    public void setLiftOnScrollTargetViewId(@C0329d0 int i) {
        this.f74456E0 = i;
        mo87893g();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f74471w = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@C0363p0 Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f74461J0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f74461J0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f74461J0.setState(getDrawableState());
                }
                C17549d.m80451m(this.f74461J0, C18196h2.m82553Z(this));
                Drawable drawable4 = this.f74461J0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f74461J0.setCallback(this);
            }
            mo87885H();
            C18196h2.m82610n1(this);
        }
    }

    public void setStatusBarForegroundColor(@C0354l int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@C0375v int i) {
        setStatusBarForeground(C0507a.m2346b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C31130e.m124916b(this, f);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f74461J0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public boolean mo87936t(@C0359n0 C31118g gVar) {
        return this.f74459H0.remove(gVar);
    }

    /* renamed from: u */
    public void mo87937u(@C0363p0 C31113c cVar) {
        List<C31113c> list = this.f74470v;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* renamed from: v */
    public void mo87938v(C31119h hVar) {
        mo87937u(hVar);
    }

    public boolean verifyDrawable(@C0359n0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f74461J0;
    }

    /* renamed from: w */
    public void mo87940w() {
        this.f74468f = 0;
    }

    /* renamed from: x */
    public final void mo87941x(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f74468f = i4 | i3;
        requestLayout();
    }

    /* renamed from: y */
    public boolean mo87942y(boolean z) {
        this.f74471w = true;
        return mo87943z(z);
    }

    /* renamed from: z */
    public final boolean mo87943z(boolean z) {
        if (this.f74472x == z) {
            return false;
        }
        this.f74472x = z;
        refreshDrawableState();
        return true;
    }

    public AppBarLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        mo87941x(z, z2, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(@androidx.annotation.C0359n0 android.content.Context r10, @androidx.annotation.C0363p0 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f74454Q0
            android.content.Context r10 = com.google.android.material.theme.overlay.C31683a.m128455c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f74464b = r10
            r9.f74465c = r10
            r9.f74466d = r10
            r6 = 0
            r9.f74468f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f74459H0 = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.google.android.material.appbar.C31130e.m124915a(r9)
        L_0x002f:
            com.google.android.material.appbar.C31130e.m124917c(r9, r11, r12, r4)
            int[] r2 = com.google.android.material.C31076a.C31091o.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.C18196h2.m82502I1(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            com.google.android.material.shape.j r0 = new com.google.android.material.shape.j
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.mo90777o0(r12)
            r0.mo90750Z(r7)
            androidx.core.view.C18196h2.m82502I1(r9, r0)
        L_0x006a:
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0079
            boolean r12 = r11.getBoolean(r12, r6)
            r9.mo87941x(r12, r6, r6)
        L_0x0079:
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0089
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.C31130e.m124916b(r9, r12)
        L_0x0089:
            r12 = 26
            if (r8 < r12) goto L_0x00ab
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x009c:
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00ab:
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f74474z = r12
            int r12 = com.google.android.material.C31076a.C31091o.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.f74456E0 = r10
            int r10 = com.google.android.material.C31076a.C31091o.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.C18196h2.m82559a2(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    public static class C31116f extends LinearLayout.LayoutParams {

        /* renamed from: d */
        public static final int f74506d = 0;

        /* renamed from: e */
        public static final int f74507e = 1;

        /* renamed from: f */
        public static final int f74508f = 2;

        /* renamed from: g */
        public static final int f74509g = 4;

        /* renamed from: h */
        public static final int f74510h = 8;

        /* renamed from: i */
        public static final int f74511i = 16;

        /* renamed from: j */
        public static final int f74512j = 32;

        /* renamed from: k */
        public static final int f74513k = 5;

        /* renamed from: l */
        public static final int f74514l = 17;

        /* renamed from: m */
        public static final int f74515m = 10;

        /* renamed from: n */
        public static final int f74516n = 0;

        /* renamed from: o */
        public static final int f74517o = 1;

        /* renamed from: a */
        public int f74518a = 1;

        /* renamed from: b */
        public C31114d f74519b;

        /* renamed from: c */
        public Interpolator f74520c;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.material.appbar.AppBarLayout$f$a */
        public @interface C31117a {
        }

        public C31116f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.AppBarLayout_Layout);
            this.f74518a = obtainStyledAttributes.getInt(C31076a.C31091o.AppBarLayout_Layout_layout_scrollFlags, 0);
            mo88011f(mo88006a(obtainStyledAttributes.getInt(C31076a.C31091o.AppBarLayout_Layout_layout_scrollEffect, 0)));
            int i = C31076a.C31091o.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f74520c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @C0363p0
        /* renamed from: a */
        public final C31114d mo88006a(int i) {
            if (i != 1) {
                return null;
            }
            return new C31115e();
        }

        @C0363p0
        /* renamed from: b */
        public C31114d mo88007b() {
            return this.f74519b;
        }

        /* renamed from: c */
        public int mo88008c() {
            return this.f74518a;
        }

        /* renamed from: d */
        public Interpolator mo88009d() {
            return this.f74520c;
        }

        /* renamed from: e */
        public boolean mo88010e() {
            int i = this.f74518a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void mo88011f(@C0363p0 C31114d dVar) {
            this.f74519b = dVar;
        }

        /* renamed from: g */
        public void mo88012g(int i) {
            this.f74518a = i;
        }

        /* renamed from: h */
        public void mo88013h(Interpolator interpolator) {
            this.f74520c = interpolator;
        }

        public C31116f(int i, int i2) {
            super(i, i2);
        }

        public C31116f(int i, int i2, float f) {
            super(i, i2, f);
        }

        public C31116f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C31116f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @C0376v0(19)
        public C31116f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @C0376v0(19)
        public C31116f(@C0359n0 C31116f fVar) {
            super(fVar);
            this.f74518a = fVar.f74518a;
            this.f74520c = fVar.f74520c;
        }
    }
}
