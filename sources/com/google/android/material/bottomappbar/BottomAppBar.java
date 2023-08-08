package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0354l;
import androidx.annotation.C0355l0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18436z4;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31103k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C31432x;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31530k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C16976b {

    /* renamed from: J1 */
    public static final int f74691J1 = C31076a.C31090n.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: K1 */
    public static final long f74692K1 = 300;

    /* renamed from: L1 */
    public static final int f74693L1 = 0;

    /* renamed from: M1 */
    public static final int f74694M1 = 1;

    /* renamed from: N1 */
    public static final int f74695N1 = 0;

    /* renamed from: O1 */
    public static final int f74696O1 = 1;

    /* renamed from: P1 */
    public static final int f74697P1 = 0;
    @C0355l0

    /* renamed from: A1 */
    public int f74698A1;

    /* renamed from: B1 */
    public boolean f74699B1;

    /* renamed from: C1 */
    public boolean f74700C1;

    /* renamed from: D1 */
    public Behavior f74701D1;

    /* renamed from: E1 */
    public int f74702E1;

    /* renamed from: F1 */
    public int f74703F1;

    /* renamed from: G1 */
    public int f74704G1;
    @C0359n0

    /* renamed from: H1 */
    public AnimatorListenerAdapter f74705H1;
    @C0359n0

    /* renamed from: I1 */
    public C31103k<FloatingActionButton> f74706I1;
    @C0363p0

    /* renamed from: n1 */
    public Integer f74707n1;

    /* renamed from: o1 */
    public final int f74708o1;

    /* renamed from: p1 */
    public final C31525j f74709p1;
    @C0363p0

    /* renamed from: q1 */
    public Animator f74710q1;
    @C0363p0

    /* renamed from: r1 */
    public Animator f74711r1;

    /* renamed from: s1 */
    public int f74712s1;

    /* renamed from: t1 */
    public int f74713t1;

    /* renamed from: u1 */
    public boolean f74714u1;

    /* renamed from: v1 */
    public final boolean f74715v1;

    /* renamed from: w1 */
    public final boolean f74716w1;

    /* renamed from: x1 */
    public final boolean f74717x1;

    /* renamed from: y1 */
    public int f74718y1;

    /* renamed from: z1 */
    public ArrayList<C31158j> f74719z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31147a();

        /* renamed from: c */
        public int f74725c;

        /* renamed from: d */
        public boolean f74726d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public class C31147a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f74725c);
            parcel.writeInt(this.f74726d ? 1 : 0);
        }

        public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f74725c = parcel.readInt();
            this.f74726d = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C31148a extends AnimatorListenerAdapter {
        public C31148a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f74699B1) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo88308P0(bottomAppBar.f74712s1, BottomAppBar.this.f74700C1);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C31149b implements C31103k<FloatingActionButton> {
        public C31149b() {
        }

        /* renamed from: c */
        public void mo87876a(@C0359n0 FloatingActionButton floatingActionButton) {
            float f;
            C31525j t0 = BottomAppBar.this.f74709p1;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            } else {
                f = 0.0f;
            }
            t0.mo90780p0(f);
        }

        /* renamed from: d */
        public void mo87877b(@C0359n0 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().mo88371l() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().mo88377u(translationX);
                BottomAppBar.this.f74709p1.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().mo88366f() != max) {
                BottomAppBar.this.getTopEdgeTreatment().mo88372m(max);
                BottomAppBar.this.f74709p1.invalidateSelf();
            }
            C31525j t0 = BottomAppBar.this.f74709p1;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            t0.mo90780p0(f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C31150c implements C31432x.C31437e {
        public C31150c() {
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo88352a(View view, @C0359n0 C18436z4 z4Var, @C0359n0 C31432x.C31438f fVar) {
            boolean z;
            if (BottomAppBar.this.f74715v1) {
                int unused = BottomAppBar.this.f74702E1 = z4Var.mo53146o();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f74716w1) {
                if (BottomAppBar.this.f74704G1 != z4Var.mo53147p()) {
                    z = true;
                } else {
                    z = false;
                }
                int unused2 = BottomAppBar.this.f74704G1 = z4Var.mo53147p();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f74717x1) {
                if (BottomAppBar.this.f74703F1 == z4Var.mo53148q()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.f74703F1 = z4Var.mo53148q();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.mo88295C0();
                BottomAppBar.this.mo88318Z0();
                BottomAppBar.this.mo88317Y0();
            }
            return z4Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C31151d extends AnimatorListenerAdapter {
        public C31151d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.mo88299G0();
            Animator unused = BottomAppBar.this.f74710q1 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mo88300H0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C31152e extends FloatingActionButton.C31350b {

        /* renamed from: a */
        public final /* synthetic */ int f74731a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        public class C31153a extends FloatingActionButton.C31350b {
            public C31153a() {
            }

            /* renamed from: b */
            public void mo88356b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.mo88299G0();
            }
        }

        public C31152e(int i) {
            this.f74731a = i;
        }

        /* renamed from: a */
        public void mo88355a(@C0359n0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.mo88304L0(this.f74731a));
            floatingActionButton.mo89662A(new C31153a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public class C31154f extends AnimatorListenerAdapter {
        public C31154f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.mo88299G0();
            boolean unused = BottomAppBar.this.f74699B1 = false;
            Animator unused2 = BottomAppBar.this.f74711r1 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mo88300H0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public class C31155g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f74735a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f74736b;

        /* renamed from: c */
        public final /* synthetic */ int f74737c;

        /* renamed from: d */
        public final /* synthetic */ boolean f74738d;

        public C31155g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f74736b = actionMenuView;
            this.f74737c = i;
            this.f74738d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f74735a = true;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.f74735a) {
                if (BottomAppBar.this.f74698A1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo88316X0(bottomAppBar.f74698A1);
                BottomAppBar.this.mo88321c1(this.f74736b, this.f74737c, this.f74738d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    public class C31156h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f74740a;

        /* renamed from: b */
        public final /* synthetic */ int f74741b;

        /* renamed from: c */
        public final /* synthetic */ boolean f74742c;

        public C31156h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f74740a = actionMenuView;
            this.f74741b = i;
            this.f74742c = z;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f74740a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo88303K0(actionMenuView, this.f74741b, this.f74742c));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    public class C31157i extends AnimatorListenerAdapter {
        public C31157i() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f74705H1.onAnimationStart(animator);
            FloatingActionButton k0 = BottomAppBar.this.mo88301I0();
            if (k0 != null) {
                k0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    public interface C31158j {
        /* renamed from: a */
        void mo88363a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo88364b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$k */
    public @interface C31159k {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$l */
    public @interface C31160l {
    }

    public BottomAppBar(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0363p0
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f74702E1;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return mo88304L0(this.f74712s1);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo88366f();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f74704G1;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f74703F1;
    }

    /* access modifiers changed from: private */
    @C0359n0
    public C31161a getTopEdgeTreatment() {
        return (C31161a) this.f74709p1.getShapeAppearanceModel().mo90816p();
    }

    /* renamed from: A0 */
    public void mo88293A0(@C0359n0 C31158j jVar) {
        if (this.f74719z1 == null) {
            this.f74719z1 = new ArrayList<>();
        }
        this.f74719z1.add(jVar);
    }

    /* renamed from: B0 */
    public final void mo88294B0(@C0359n0 FloatingActionButton floatingActionButton) {
        floatingActionButton.mo89666f(this.f74705H1);
        floatingActionButton.mo89667g(new C31157i());
        floatingActionButton.mo89682h(this.f74706I1);
    }

    /* renamed from: C0 */
    public final void mo88295C0() {
        Animator animator = this.f74711r1;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f74710q1;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: D0 */
    public void mo88296D0(int i, List<Animator> list) {
        FloatingActionButton I0 = mo88301I0();
        if (I0 != null && !I0.mo89698q()) {
            mo88300H0();
            I0.mo89690o(new C31152e(i));
        }
    }

    /* renamed from: E0 */
    public final void mo88297E0(int i, @C0359n0 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo88301I0(), "translationX", new float[]{mo88304L0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: F0 */
    public final void mo88298F0(int i, boolean z, @C0359n0 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo88303K0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C31155g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: G0 */
    public final void mo88299G0() {
        ArrayList<C31158j> arrayList;
        int i = this.f74718y1 - 1;
        this.f74718y1 = i;
        if (i == 0 && (arrayList = this.f74719z1) != null) {
            Iterator<C31158j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo88363a(this);
            }
        }
    }

    /* renamed from: H0 */
    public final void mo88300H0() {
        ArrayList<C31158j> arrayList;
        int i = this.f74718y1;
        this.f74718y1 = i + 1;
        if (i == 0 && (arrayList = this.f74719z1) != null) {
            Iterator<C31158j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo88364b(this);
            }
        }
    }

    @C0363p0
    /* renamed from: I0 */
    public final FloatingActionButton mo88301I0() {
        View J0 = mo88302J0();
        if (J0 instanceof FloatingActionButton) {
            return (FloatingActionButton) J0;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    @androidx.annotation.C0363p0
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo88302J0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo51063x(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo88302J0():android.view.View");
    }

    /* renamed from: K0 */
    public int mo88303K0(@C0359n0 ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        if (i != 1 || !z) {
            return 0;
        }
        boolean k = C31432x.m127016k(this);
        if (k) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof Toolbar.C0680g) || (((Toolbar.C0680g) childAt.getLayoutParams()).f1107a & C18306m0.f46962d) != 8388611) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (k) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (k) {
            i3 = actionMenuView.getRight();
        } else {
            i3 = actionMenuView.getLeft();
        }
        if (k) {
            i4 = this.f74703F1;
        } else {
            i4 = -this.f74704G1;
        }
        return i2 - (i3 + i4);
    }

    /* renamed from: L0 */
    public final float mo88304L0(int i) {
        int i2;
        boolean k = C31432x.m127016k(this);
        int i3 = 1;
        if (i != 1) {
            return 0.0f;
        }
        if (k) {
            i2 = this.f74704G1;
        } else {
            i2 = this.f74703F1;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f74708o1 + i2);
        if (k) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    /* renamed from: M0 */
    public final boolean mo88305M0() {
        FloatingActionButton I0 = mo88301I0();
        if (I0 == null || !I0.mo89699r()) {
            return false;
        }
        return true;
    }

    /* renamed from: N0 */
    public boolean mo88306N0() {
        return getBehavior().mo88270I();
    }

    /* renamed from: O0 */
    public boolean mo88307O0() {
        return getBehavior().mo88271J();
    }

    /* renamed from: P0 */
    public final void mo88308P0(int i, boolean z) {
        if (!C18196h2.m82539U0(this)) {
            this.f74699B1 = false;
            mo88316X0(this.f74698A1);
            return;
        }
        Animator animator = this.f74711r1;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!mo88305M0()) {
            i = 0;
            z = false;
        }
        mo88298F0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f74711r1 = animatorSet;
        animatorSet.addListener(new C31154f());
        this.f74711r1.start();
    }

    /* renamed from: Q0 */
    public final void mo88309Q0(int i) {
        if (this.f74712s1 != i && C18196h2.m82539U0(this)) {
            Animator animator = this.f74710q1;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f74713t1 == 1) {
                mo88297E0(i, arrayList);
            } else {
                mo88296D0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f74710q1 = animatorSet;
            animatorSet.addListener(new C31151d());
            this.f74710q1.start();
        }
    }

    @C0363p0
    /* renamed from: R0 */
    public final Drawable mo88310R0(@C0363p0 Drawable drawable) {
        if (drawable == null || this.f74707n1 == null) {
            return drawable;
        }
        Drawable r = C17549d.m80456r(drawable.mutate());
        C17549d.m80452n(r, this.f74707n1.intValue());
        return r;
    }

    /* renamed from: S0 */
    public void mo88311S0() {
        mo88312T0(true);
    }

    /* renamed from: T0 */
    public void mo88312T0(boolean z) {
        getBehavior().mo88274M(this, z);
    }

    /* renamed from: U0 */
    public void mo88313U0() {
        mo88314V0(true);
    }

    /* renamed from: V0 */
    public void mo88314V0(boolean z) {
        getBehavior().mo88276O(this, z);
    }

    /* renamed from: W0 */
    public void mo88315W0(@C0359n0 C31158j jVar) {
        ArrayList<C31158j> arrayList = this.f74719z1;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    /* renamed from: X0 */
    public void mo88316X0(@C0355l0 int i) {
        if (i != 0) {
            this.f74698A1 = 0;
            getMenu().clear();
            mo3110A(i);
        }
    }

    /* renamed from: Y0 */
    public final void mo88317Y0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f74711r1 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo88305M0()) {
                mo88320b1(actionMenuView, 0, false);
            } else {
                mo88320b1(actionMenuView, this.f74712s1, this.f74700C1);
            }
        }
    }

    /* renamed from: Z0 */
    public final void mo88318Z0() {
        float f;
        getTopEdgeTreatment().mo88377u(getFabTranslationX());
        View J0 = mo88302J0();
        C31525j jVar = this.f74709p1;
        if (!this.f74700C1 || !mo88305M0()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        jVar.mo90780p0(f);
        if (J0 != null) {
            J0.setTranslationY(getFabTranslationY());
            J0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: a1 */
    public boolean mo88319a1(@C0372t0 int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo88370k()) {
            return false;
        }
        getTopEdgeTreatment().mo88376t(f);
        this.f74709p1.invalidateSelf();
        return true;
    }

    /* renamed from: b1 */
    public final void mo88320b1(@C0359n0 ActionMenuView actionMenuView, int i, boolean z) {
        mo88321c1(actionMenuView, i, z, false);
    }

    /* renamed from: c1 */
    public final void mo88321c1(@C0359n0 ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C31156h hVar = new C31156h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    @C0363p0
    public ColorStateList getBackgroundTint() {
        return this.f74709p1.mo90742R();
    }

    @C0366r
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo88366f();
    }

    public int getFabAlignmentMode() {
        return this.f74712s1;
    }

    public int getFabAnimationMode() {
        return this.f74713t1;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo88368i();
    }

    @C0366r
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo88369j();
    }

    public boolean getHideOnScroll() {
        return this.f74714u1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127555f(this, this.f74709p1);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo88295C0();
            mo88318Z0();
        }
        mo88317Y0();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        this.f74712s1 = savedState.f74725c;
        this.f74700C1 = savedState.f74726d;
    }

    @C0359n0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f74725c = this.f74712s1;
        savedState.f74726d = this.f74700C1;
        return savedState;
    }

    public void setBackgroundTint(@C0363p0 ColorStateList colorStateList) {
        C17549d.m80453o(this.f74709p1, colorStateList);
    }

    public void setCradleVerticalOffset(@C0366r float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo88372m(f);
            this.f74709p1.invalidateSelf();
            mo88318Z0();
        }
    }

    public void setElevation(float f) {
        this.f74709p1.mo90775n0(f);
        getBehavior().mo88272K(this, this.f74709p1.mo90730K() - this.f74709p1.mo90728J());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, @C0355l0 int i2) {
        this.f74698A1 = i2;
        this.f74699B1 = true;
        mo88308P0(i, this.f74700C1);
        mo88309Q0(i);
        this.f74712s1 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f74713t1 = i;
    }

    public void setFabCornerSize(@C0366r float f) {
        if (f != getTopEdgeTreatment().mo88367h()) {
            getTopEdgeTreatment().mo88373n(f);
            this.f74709p1.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@C0366r float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo88374o(f);
            this.f74709p1.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@C0366r float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo88375s(f);
            this.f74709p1.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f74714u1 = z;
    }

    public void setNavigationIcon(@C0363p0 Drawable drawable) {
        super.setNavigationIcon(mo88310R0(drawable));
    }

    public void setNavigationIconTint(@C0354l int i) {
        this.f74707n1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.bottomAppBarStyle);
    }

    @C0359n0
    public Behavior getBehavior() {
        if (this.f74701D1 == null) {
            this.f74701D1 = new Behavior();
        }
        return this.f74701D1;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @C0359n0

        /* renamed from: i */
        public final Rect f74720i = new Rect();

        /* renamed from: j */
        public WeakReference<BottomAppBar> f74721j;

        /* renamed from: k */
        public int f74722k;

        /* renamed from: l */
        public final View.OnLayoutChangeListener f74723l = new C31146a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C31146a implements View.OnLayoutChangeListener {
            public C31146a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f74721j.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo89687l(Behavior.this.f74720i);
                int height = Behavior.this.f74720i.height();
                bottomAppBar.mo88319a1(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mo90818r().mo90693a(new RectF(Behavior.this.f74720i)));
                CoordinatorLayout.C16981g gVar = (CoordinatorLayout.C16981g) view.getLayoutParams();
                if (Behavior.this.f74722k == 0) {
                    gVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C31076a.C31082f.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    gVar.leftMargin = bottomAppBar.getLeftInset();
                    gVar.rightMargin = bottomAppBar.getRightInset();
                    if (C31432x.m127016k(floatingActionButton)) {
                        gVar.leftMargin += bottomAppBar.f74708o1;
                    } else {
                        gVar.rightMargin += bottomAppBar.f74708o1;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: S */
        public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 BottomAppBar bottomAppBar, int i) {
            this.f74721j = new WeakReference<>(bottomAppBar);
            View r0 = bottomAppBar.mo88302J0();
            if (r0 != null && !C18196h2.m82539U0(r0)) {
                CoordinatorLayout.C16981g gVar = (CoordinatorLayout.C16981g) r0.getLayoutParams();
                gVar.f44898d = 49;
                this.f74722k = gVar.bottomMargin;
                if (r0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) r0;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C31076a.C31078b.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C31076a.C31078b.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f74723l);
                    bottomAppBar.mo88294B0(floatingActionButton);
                }
                bottomAppBar.mo88318Z0();
            }
            coordinatorLayout.mo51012N(bottomAppBar, i);
            return super.mo51089m(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: T */
        public boolean mo51074B(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 BottomAppBar bottomAppBar, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
            if (!bottomAppBar.getHideOnScroll() || !super.mo51074B(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return false;
            }
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(@androidx.annotation.C0359n0 android.content.Context r11, @androidx.annotation.C0363p0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f74691J1
            android.content.Context r11 = com.google.android.material.theme.overlay.C31683a.m128455c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.shape.j r11 = new com.google.android.material.shape.j
            r11.<init>()
            r10.f74709p1 = r11
            r7 = 0
            r10.f74718y1 = r7
            r10.f74698A1 = r7
            r10.f74699B1 = r7
            r0 = 1
            r10.f74700C1 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f74705H1 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f74706I1 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C31076a.C31091o.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.C31500c.m127363a(r8, r0, r1)
            int r2 = com.google.android.material.C31076a.C31091o.BottomAppBar_navigationIconTint
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x004e
            r3 = -1
            int r2 = r0.getColor(r2, r3)
            r10.setNavigationIconTint(r2)
        L_0x004e:
            int r2 = com.google.android.material.C31076a.C31091o.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = com.google.android.material.C31076a.C31091o.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = com.google.android.material.C31076a.C31091o.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = com.google.android.material.C31076a.C31091o.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = com.google.android.material.C31076a.C31091o.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.f74712s1 = r9
            int r9 = com.google.android.material.C31076a.C31091o.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.f74713t1 = r9
            int r9 = com.google.android.material.C31076a.C31091o.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f74714u1 = r9
            int r9 = com.google.android.material.C31076a.C31091o.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f74715v1 = r9
            int r9 = com.google.android.material.C31076a.C31091o.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f74716w1 = r9
            int r9 = com.google.android.material.C31076a.C31091o.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f74717x1 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = com.google.android.material.C31076a.C31082f.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f74708o1 = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.o$b r3 = com.google.android.material.shape.C31534o.m127561a()
            com.google.android.material.shape.o$b r0 = r3.mo90832G(r0)
            com.google.android.material.shape.o r0 = r0.mo90843m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.mo90796x0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.mo90784r0(r0)
            r11.mo90750Z(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            androidx.core.graphics.drawable.C17549d.m80453o(r11, r1)
            androidx.core.view.C18196h2.m82502I1(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.C31432x.m127008c(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
