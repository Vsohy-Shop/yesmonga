package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0322b;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31100h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C31392d;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C16976b {

    /* renamed from: g1 */
    public static final int f75544g1 = C31076a.C31090n.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: h1 */
    public static final int f75545h1 = 0;

    /* renamed from: i1 */
    public static final int f75546i1 = 1;

    /* renamed from: j1 */
    public static final int f75547j1 = 2;

    /* renamed from: k1 */
    public static final Property<View, Float> f75548k1;

    /* renamed from: l1 */
    public static final Property<View, Float> f75549l1;

    /* renamed from: m1 */
    public static final Property<View, Float> f75550m1;

    /* renamed from: n1 */
    public static final Property<View, Float> f75551n1;

    /* renamed from: S0 */
    public int f75552S0;

    /* renamed from: T0 */
    public final C31354a f75553T0;
    @C0359n0

    /* renamed from: U0 */
    public final C31376f f75554U0;
    @C0359n0

    /* renamed from: V0 */
    public final C31376f f75555V0;

    /* renamed from: W0 */
    public final C31376f f75556W0;

    /* renamed from: X0 */
    public final C31376f f75557X0;

    /* renamed from: Y0 */
    public final int f75558Y0;

    /* renamed from: Z0 */
    public int f75559Z0;

    /* renamed from: a1 */
    public int f75560a1;
    @C0359n0

    /* renamed from: b1 */
    public final CoordinatorLayout.C16977c<ExtendedFloatingActionButton> f75561b1;

    /* renamed from: c1 */
    public boolean f75562c1;

    /* renamed from: d1 */
    public boolean f75563d1;

    /* renamed from: e1 */
    public boolean f75564e1;
    @C0359n0

    /* renamed from: f1 */
    public ColorStateList f75565f1;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C31337a implements C31348l {
        public C31337a() {
        }

        /* renamed from: a */
        public ViewGroup.LayoutParams mo89626a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f75560a1;
        }

        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f75559Z0;
        }

        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f75559Z0 + ExtendedFloatingActionButton.this.f75560a1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C31338b implements C31348l {
        public C31338b() {
        }

        /* renamed from: a */
        public ViewGroup.LayoutParams mo89626a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C31339c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f75575a;

        /* renamed from: b */
        public final /* synthetic */ C31376f f75576b;

        /* renamed from: c */
        public final /* synthetic */ C31346j f75577c;

        public C31339c(C31376f fVar, C31346j jVar) {
            this.f75576b = fVar;
            this.f75577c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f75575a = true;
            this.f75576b.mo89657f();
        }

        public void onAnimationEnd(Animator animator) {
            this.f75576b.mo89653i();
            if (!this.f75575a) {
                this.f75576b.mo89655m(this.f75577c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f75576b.onAnimationStart(animator);
            this.f75575a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C31340d extends Property<View, Float> {
        public C31340d(Class cls, String str) {
            super(cls, str);
        }

        @C0359n0
        /* renamed from: a */
        public Float get(@C0359n0 View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(@C0359n0 View view, @C0359n0 Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public class C31341e extends Property<View, Float> {
        public C31341e(Class cls, String str) {
            super(cls, str);
        }

        @C0359n0
        /* renamed from: a */
        public Float get(@C0359n0 View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(@C0359n0 View view, @C0359n0 Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public class C31342f extends Property<View, Float> {
        public C31342f(Class cls, String str) {
            super(cls, str);
        }

        @C0359n0
        /* renamed from: a */
        public Float get(@C0359n0 View view) {
            return Float.valueOf((float) C18196h2.m82597k0(view));
        }

        /* renamed from: b */
        public void set(@C0359n0 View view, @C0359n0 Float f) {
            C18196h2.m82571d2(view, f.intValue(), view.getPaddingTop(), C18196h2.m82593j0(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public class C31343g extends Property<View, Float> {
        public C31343g(Class cls, String str) {
            super(cls, str);
        }

        @C0359n0
        /* renamed from: a */
        public Float get(@C0359n0 View view) {
            return Float.valueOf((float) C18196h2.m82593j0(view));
        }

        /* renamed from: b */
        public void set(@C0359n0 View view, @C0359n0 Float f) {
            C18196h2.m82571d2(view, C18196h2.m82597k0(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C31344h extends C31355b {

        /* renamed from: g */
        public final C31348l f75579g;

        /* renamed from: h */
        public final boolean f75580h;

        public C31344h(C31354a aVar, C31348l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f75579g = lVar;
            this.f75580h = z;
        }

        /* renamed from: b */
        public void mo89650b() {
            boolean unused = ExtendedFloatingActionButton.this.f75562c1 = this.f75580h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f75579g.mo89626a().width;
                layoutParams.height = this.f75579g.mo89626a().height;
                C18196h2.m82571d2(ExtendedFloatingActionButton.this, this.f75579g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f75579g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: d */
        public boolean mo89651d() {
            return this.f75580h == ExtendedFloatingActionButton.this.f75562c1 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: g */
        public int mo89652g() {
            if (this.f75580h) {
                return C31076a.C31078b.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return C31076a.C31078b.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: i */
        public void mo89653i() {
            super.mo89653i();
            boolean unused = ExtendedFloatingActionButton.this.f75563d1 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f75579g.mo89626a().width;
                layoutParams.height = this.f75579g.mo89626a().height;
            }
        }

        @C0359n0
        /* renamed from: k */
        public AnimatorSet mo89654k() {
            float f;
            C31100h a = mo89762a();
            if (a.mo87862j("width")) {
                PropertyValuesHolder[] g = a.mo87858g("width");
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f75579g.getWidth()});
                a.mo87864l("width", g);
            }
            if (a.mo87862j("height")) {
                PropertyValuesHolder[] g2 = a.mo87858g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f75579g.getHeight()});
                a.mo87864l("height", g2);
            }
            if (a.mo87862j("paddingStart")) {
                PropertyValuesHolder[] g3 = a.mo87858g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) C18196h2.m82597k0(ExtendedFloatingActionButton.this), (float) this.f75579g.getPaddingStart()});
                a.mo87864l("paddingStart", g3);
            }
            if (a.mo87862j("paddingEnd")) {
                PropertyValuesHolder[] g4 = a.mo87858g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) C18196h2.m82593j0(ExtendedFloatingActionButton.this), (float) this.f75579g.getPaddingEnd()});
                a.mo87864l("paddingEnd", g4);
            }
            if (a.mo87862j("labelOpacity")) {
                PropertyValuesHolder[] g5 = a.mo87858g("labelOpacity");
                boolean z = this.f75580h;
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (z) {
                    f2 = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f, f2});
                a.mo87864l("labelOpacity", g5);
            }
            return super.mo89768o(a);
        }

        /* renamed from: m */
        public void mo89655m(@C0363p0 C31346j jVar) {
            if (jVar != null) {
                if (this.f75580h) {
                    jVar.mo89658a(ExtendedFloatingActionButton.this);
                } else {
                    jVar.mo89661d(ExtendedFloatingActionButton.this);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f75562c1 = this.f75580h;
            boolean unused2 = ExtendedFloatingActionButton.this.f75563d1 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public class C31345i extends C31355b {

        /* renamed from: g */
        public boolean f75582g;

        public C31345i(C31354a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: b */
        public void mo89650b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: d */
        public boolean mo89651d() {
            return ExtendedFloatingActionButton.this.mo89578K();
        }

        /* renamed from: f */
        public void mo89657f() {
            super.mo89657f();
            this.f75582g = true;
        }

        /* renamed from: g */
        public int mo89652g() {
            return C31076a.C31078b.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: i */
        public void mo89653i() {
            super.mo89653i();
            int unused = ExtendedFloatingActionButton.this.f75552S0 = 0;
            if (!this.f75582g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: m */
        public void mo89655m(@C0363p0 C31346j jVar) {
            if (jVar != null) {
                jVar.mo89659b(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f75582g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f75552S0 = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C31346j {
        /* renamed from: a */
        public void mo89658a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: b */
        public void mo89659b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: c */
        public void mo89660c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: d */
        public void mo89661d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    public class C31347k extends C31355b {
        public C31347k(C31354a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: b */
        public void mo89650b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: d */
        public boolean mo89651d() {
            return ExtendedFloatingActionButton.this.mo89579L();
        }

        /* renamed from: g */
        public int mo89652g() {
            return C31076a.C31078b.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: i */
        public void mo89653i() {
            super.mo89653i();
            int unused = ExtendedFloatingActionButton.this.f75552S0 = 0;
        }

        /* renamed from: m */
        public void mo89655m(@C0363p0 C31346j jVar) {
            if (jVar != null) {
                jVar.mo89660c(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f75552S0 = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    public interface C31348l {
        /* renamed from: a */
        ViewGroup.LayoutParams mo89626a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f75548k1 = new C31340d(cls, "width");
        f75549l1 = new C31341e(cls, "height");
        f75550m1 = new C31342f(cls, "paddingStart");
        f75551n1 = new C31343g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    public void mo89569B(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75555V0.mo89765h(animatorListener);
    }

    /* renamed from: C */
    public void mo89570C(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75557X0.mo89765h(animatorListener);
    }

    /* renamed from: D */
    public void mo89571D(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75556W0.mo89765h(animatorListener);
    }

    /* renamed from: E */
    public void mo89572E(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75554U0.mo89765h(animatorListener);
    }

    /* renamed from: F */
    public void mo89573F() {
        mo89580M(this.f75555V0, (C31346j) null);
    }

    /* renamed from: G */
    public void mo89574G(@C0359n0 C31346j jVar) {
        mo89580M(this.f75555V0, jVar);
    }

    /* renamed from: H */
    public void mo89575H() {
        mo89580M(this.f75557X0, (C31346j) null);
    }

    /* renamed from: I */
    public void mo89576I(@C0359n0 C31346j jVar) {
        mo89580M(this.f75557X0, jVar);
    }

    /* renamed from: J */
    public final boolean mo89577J() {
        return this.f75562c1;
    }

    /* renamed from: K */
    public final boolean mo89578K() {
        if (getVisibility() == 0) {
            if (this.f75552S0 == 1) {
                return true;
            }
            return false;
        } else if (this.f75552S0 != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: L */
    public final boolean mo89579L() {
        if (getVisibility() != 0) {
            if (this.f75552S0 == 2) {
                return true;
            }
            return false;
        } else if (this.f75552S0 != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: M */
    public final void mo89580M(@C0359n0 C31376f fVar, @C0363p0 C31346j jVar) {
        if (!fVar.mo89651d()) {
            if (!mo89586S()) {
                fVar.mo89650b();
                fVar.mo89655m(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet k = fVar.mo89654k();
            k.addListener(new C31339c(fVar, jVar));
            for (Animator.AnimatorListener addListener : fVar.mo89767l()) {
                k.addListener(addListener);
            }
            k.start();
        }
    }

    /* renamed from: N */
    public void mo89581N(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75555V0.mo89764e(animatorListener);
    }

    /* renamed from: O */
    public void mo89582O(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75557X0.mo89764e(animatorListener);
    }

    /* renamed from: P */
    public void mo89583P(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75556W0.mo89764e(animatorListener);
    }

    /* renamed from: Q */
    public void mo89584Q(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75554U0.mo89764e(animatorListener);
    }

    /* renamed from: R */
    public final void mo89585R() {
        this.f75565f1 = getTextColors();
    }

    /* renamed from: S */
    public final boolean mo89586S() {
        if ((C18196h2.m82539U0(this) || (!mo89579L() && this.f75564e1)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void mo89587T() {
        mo89580M(this.f75556W0, (C31346j) null);
    }

    /* renamed from: U */
    public void mo89588U(@C0359n0 C31346j jVar) {
        mo89580M(this.f75556W0, jVar);
    }

    /* renamed from: V */
    public void mo89589V() {
        mo89580M(this.f75554U0, (C31346j) null);
    }

    /* renamed from: W */
    public void mo89590W(@C0359n0 C31346j jVar) {
        mo89580M(this.f75554U0, jVar);
    }

    /* renamed from: X */
    public void mo89591X(@C0359n0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @C0359n0
    public CoordinatorLayout.C16977c<ExtendedFloatingActionButton> getBehavior() {
        return this.f75561b1;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @C0344h1
    public int getCollapsedSize() {
        int i = this.f75558Y0;
        if (i < 0) {
            return (Math.min(C18196h2.m82597k0(this), C18196h2.m82593j0(this)) * 2) + getIconSize();
        }
        return i;
    }

    @C0363p0
    public C31100h getExtendMotionSpec() {
        return this.f75555V0.mo89763c();
    }

    @C0363p0
    public C31100h getHideMotionSpec() {
        return this.f75557X0.mo89763c();
    }

    @C0363p0
    public C31100h getShowMotionSpec() {
        return this.f75556W0.mo89763c();
    }

    @C0363p0
    public C31100h getShrinkMotionSpec() {
        return this.f75554U0.mo89763c();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f75562c1 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f75562c1 = false;
            this.f75554U0.mo89650b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f75564e1 = z;
    }

    public void setExtendMotionSpec(@C0363p0 C31100h hVar) {
        this.f75555V0.mo89766j(hVar);
    }

    public void setExtendMotionSpecResource(@C0322b int i) {
        setExtendMotionSpec(C31100h.m124662d(getContext(), i));
    }

    public void setExtended(boolean z) {
        C31376f fVar;
        if (this.f75562c1 != z) {
            if (z) {
                fVar = this.f75555V0;
            } else {
                fVar = this.f75554U0;
            }
            if (!fVar.mo89651d()) {
                fVar.mo89650b();
            }
        }
    }

    public void setHideMotionSpec(@C0363p0 C31100h hVar) {
        this.f75557X0.mo89766j(hVar);
    }

    public void setHideMotionSpecResource(@C0322b int i) {
        setHideMotionSpec(C31100h.m124662d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f75562c1 && !this.f75563d1) {
            this.f75559Z0 = C18196h2.m82597k0(this);
            this.f75560a1 = C18196h2.m82593j0(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f75562c1 && !this.f75563d1) {
            this.f75559Z0 = i;
            this.f75560a1 = i3;
        }
    }

    public void setShowMotionSpec(@C0363p0 C31100h hVar) {
        this.f75556W0.mo89766j(hVar);
    }

    public void setShowMotionSpecResource(@C0322b int i) {
        setShowMotionSpec(C31100h.m124662d(getContext(), i));
    }

    public void setShrinkMotionSpec(@C0363p0 C31100h hVar) {
        this.f75554U0.mo89766j(hVar);
    }

    public void setShrinkMotionSpecResource(@C0322b int i) {
        setShrinkMotionSpec(C31100h.m124662d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        mo89585R();
    }

    public ExtendedFloatingActionButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C16977c<T> {

        /* renamed from: f */
        public static final boolean f75566f = false;

        /* renamed from: g */
        public static final boolean f75567g = true;

        /* renamed from: a */
        public Rect f75568a;
        @C0363p0

        /* renamed from: b */
        public C31346j f75569b;
        @C0363p0

        /* renamed from: c */
        public C31346j f75570c;

        /* renamed from: d */
        public boolean f75571d;

        /* renamed from: e */
        public boolean f75572e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f75571d = false;
            this.f75572e = true;
        }

        /* renamed from: K */
        public static boolean m126451K(@C0359n0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C16981g) {
                return ((CoordinatorLayout.C16981g) layoutParams).mo51111f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        public void mo89612G(@C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            C31346j jVar;
            C31376f fVar;
            boolean z = this.f75572e;
            if (z) {
                jVar = this.f75570c;
            } else {
                jVar = this.f75569b;
            }
            if (z) {
                fVar = extendedFloatingActionButton.f75555V0;
            } else {
                fVar = extendedFloatingActionButton.f75556W0;
            }
            extendedFloatingActionButton.mo89580M(fVar, jVar);
        }

        /* renamed from: H */
        public boolean mo51079b(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton, @C0359n0 Rect rect) {
            return super.mo51079b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: I */
        public boolean mo89614I() {
            return this.f75571d;
        }

        /* renamed from: J */
        public boolean mo89615J() {
            return this.f75572e;
        }

        /* renamed from: L */
        public boolean mo51085i(CoordinatorLayout coordinatorLayout, @C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                mo89624T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m126451K(view)) {
                return false;
            } else {
                mo89625U(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: M */
        public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> w = coordinatorLayout.mo51062w(extendedFloatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m126451K(view) && mo89625U(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo89624T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo51012N(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: N */
        public void mo89618N(boolean z) {
            this.f75571d = z;
        }

        /* renamed from: O */
        public void mo89619O(boolean z) {
            this.f75572e = z;
        }

        @C0344h1
        /* renamed from: P */
        public void mo89620P(@C0363p0 C31346j jVar) {
            this.f75569b = jVar;
        }

        @C0344h1
        /* renamed from: Q */
        public void mo89621Q(@C0363p0 C31346j jVar) {
            this.f75570c = jVar;
        }

        /* renamed from: R */
        public final boolean mo89622R(@C0359n0 View view, @C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C16981g gVar = (CoordinatorLayout.C16981g) extendedFloatingActionButton.getLayoutParams();
            if ((this.f75571d || this.f75572e) && gVar.mo51110e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: S */
        public void mo89623S(@C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            C31346j jVar;
            C31376f fVar;
            boolean z = this.f75572e;
            if (z) {
                jVar = this.f75570c;
            } else {
                jVar = this.f75569b;
            }
            if (z) {
                fVar = extendedFloatingActionButton.f75554U0;
            } else {
                fVar = extendedFloatingActionButton.f75557X0;
            }
            extendedFloatingActionButton.mo89580M(fVar, jVar);
        }

        /* renamed from: T */
        public final boolean mo89624T(CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo89622R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f75568a == null) {
                this.f75568a = new Rect();
            }
            Rect rect = this.f75568a;
            C31392d.m126855a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo89623S(extendedFloatingActionButton);
                return true;
            }
            mo89612G(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: U */
        public final boolean mo89625U(@C0359n0 View view, @C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo89622R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C16981g) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo89623S(extendedFloatingActionButton);
                return true;
            }
            mo89612G(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: h */
        public void mo51084h(@C0359n0 CoordinatorLayout.C16981g gVar) {
            if (gVar.f44902h == 0) {
                gVar.f44902h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.ExtendedFloatingActionButton_Behavior_Layout);
            this.f75571d = obtainStyledAttributes.getBoolean(C31076a.C31091o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f75572e = obtainStyledAttributes.getBoolean(C31076a.C31091o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(@androidx.annotation.C0359n0 android.content.Context r17, @androidx.annotation.C0363p0 android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f75544g1
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.C31683a.m128455c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f75552S0 = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f75553T0 = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f75556W0 = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f75557X0 = r12
            r13 = 1
            r0.f75562c1 = r13
            r0.f75563d1 = r10
            r0.f75564e1 = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f75561b1 = r1
            int[] r3 = com.google.android.material.C31076a.C31091o.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C31422p.m126970j(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C31076a.C31091o.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.h r2 = com.google.android.material.animation.C31100h.m124661c(r14, r1, r2)
            int r3 = com.google.android.material.C31076a.C31091o.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.h r3 = com.google.android.material.animation.C31100h.m124661c(r14, r1, r3)
            int r4 = com.google.android.material.C31076a.C31091o.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.h r4 = com.google.android.material.animation.C31100h.m124661c(r14, r1, r4)
            int r5 = com.google.android.material.C31076a.C31091o.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.h r5 = com.google.android.material.animation.C31100h.m124661c(r14, r1, r5)
            int r6 = com.google.android.material.C31076a.C31091o.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f75558Y0 = r6
            int r6 = androidx.core.view.C18196h2.m82597k0(r16)
            r0.f75559Z0 = r6
            int r6 = androidx.core.view.C18196h2.m82593j0(r16)
            r0.f75560a1 = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f75555V0 = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f75554U0 = r10
            r11.mo89766j(r2)
            r12.mo89766j(r3)
            r15.mo89766j(r4)
            r10.mo89766j(r5)
            r1.recycle()
            com.google.android.material.shape.d r1 = com.google.android.material.shape.C31534o.f76418m
            r2 = r18
            com.google.android.material.shape.o$b r1 = com.google.android.material.shape.C31534o.m127567g(r14, r2, r8, r9, r1)
            com.google.android.material.shape.o r1 = r1.mo90843m()
            r0.setShapeAppearanceModel(r1)
            r16.mo89585R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setTextColor(@C0359n0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        mo89585R();
    }
}
