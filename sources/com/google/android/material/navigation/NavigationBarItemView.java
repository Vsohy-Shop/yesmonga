package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.C0757o1;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18124b2;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.widget.C18496q;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.badge.C31132a;
import com.google.android.material.badge.C31135b;
import com.google.android.material.motion.C31441a;
import com.google.android.material.resources.C31500c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements C0587o.C0588a {

    /* renamed from: U0 */
    public static final int f75990U0 = -1;

    /* renamed from: V0 */
    public static final int[] f75991V0 = {16842912};

    /* renamed from: W0 */
    public static final C31445d f75992W0 = new C31445d((C31442a) null);

    /* renamed from: X0 */
    public static final C31445d f75993X0 = new C31446e((C31442a) null);

    /* renamed from: E0 */
    public final TextView f75994E0;

    /* renamed from: F0 */
    public final TextView f75995F0;

    /* renamed from: G0 */
    public int f75996G0 = -1;
    @C0363p0

    /* renamed from: H0 */
    public C0573j f75997H0;
    @C0363p0

    /* renamed from: I0 */
    public ColorStateList f75998I0;
    @C0363p0

    /* renamed from: J0 */
    public Drawable f75999J0;
    @C0363p0

    /* renamed from: K0 */
    public Drawable f76000K0;

    /* renamed from: L0 */
    public ValueAnimator f76001L0;

    /* renamed from: M0 */
    public C31445d f76002M0 = f75992W0;

    /* renamed from: N0 */
    public float f76003N0 = 0.0f;

    /* renamed from: O0 */
    public boolean f76004O0 = false;

    /* renamed from: P0 */
    public int f76005P0 = 0;

    /* renamed from: Q0 */
    public int f76006Q0 = 0;

    /* renamed from: R0 */
    public boolean f76007R0 = false;

    /* renamed from: S0 */
    public int f76008S0 = 0;
    @C0363p0

    /* renamed from: T0 */
    public C31132a f76009T0;

    /* renamed from: a */
    public boolean f76010a = false;

    /* renamed from: b */
    public int f76011b;

    /* renamed from: c */
    public int f76012c;

    /* renamed from: d */
    public float f76013d;

    /* renamed from: e */
    public float f76014e;

    /* renamed from: f */
    public float f76015f;

    /* renamed from: g */
    public int f76016g;

    /* renamed from: v */
    public boolean f76017v;
    @C0363p0

    /* renamed from: w */
    public final FrameLayout f76018w;
    @C0363p0

    /* renamed from: x */
    public final View f76019x;

    /* renamed from: y */
    public final ImageView f76020y;

    /* renamed from: z */
    public final ViewGroup f76021z;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    public class C31442a implements View.OnLayoutChangeListener {
        public C31442a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f76020y.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.mo90239v(navigationBarItemView.f76020y);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$b */
    public class C31443b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f76023a;

        public C31443b(int i) {
            this.f76023a = i;
        }

        public void run() {
            NavigationBarItemView.this.mo90240w(this.f76023a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$c */
    public class C31444c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f76025a;

        public C31444c(float f) {
            this.f76025a = f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.mo90217p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f76025a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$d */
    public static class C31445d {

        /* renamed from: a */
        public static final float f76027a = 0.4f;

        /* renamed from: b */
        public static final float f76028b = 1.0f;

        /* renamed from: c */
        public static final float f76029c = 0.2f;

        public C31445d() {
        }

        /* renamed from: a */
        public float mo90245a(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            return C31093a.m124648b(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        /* renamed from: b */
        public float mo90246b(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
            return C31093a.m124647a(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        public float mo90247c(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void mo90248d(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0359n0 View view) {
            view.setScaleX(mo90246b(f, f2));
            view.setScaleY(mo90247c(f, f2));
            view.setAlpha(mo90245a(f, f2));
        }

        public /* synthetic */ C31445d(C31442a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$e */
    public static class C31446e extends C31445d {
        public C31446e() {
            super((C31442a) null);
        }

        /* renamed from: c */
        public float mo90247c(float f, float f2) {
            return mo90246b(f, f2);
        }

        public /* synthetic */ C31446e(C31442a aVar) {
            this();
        }
    }

    public NavigationBarItemView(@C0359n0 Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f76018w = (FrameLayout) findViewById(C31076a.C31084h.navigation_bar_item_icon_container);
        this.f76019x = findViewById(C31076a.C31084h.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C31076a.C31084h.navigation_bar_item_icon_view);
        this.f76020y = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C31076a.C31084h.navigation_bar_item_labels_group);
        this.f76021z = viewGroup;
        TextView textView = (TextView) findViewById(C31076a.C31084h.navigation_bar_item_small_label_view);
        this.f75994E0 = textView;
        TextView textView2 = (TextView) findViewById(C31076a.C31084h.navigation_bar_item_large_label_view);
        this.f75995F0 = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f76011b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f76012c = viewGroup.getPaddingBottom();
        C18196h2.m82531R1(textView, 2);
        C18196h2.m82531R1(textView2, 2);
        setFocusable(true);
        mo90206h(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C31442a());
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f76018w;
        return frameLayout != null ? frameLayout : this.f76020y;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        C31132a aVar = this.f76009T0;
        if (aVar != null) {
            i = aVar.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f76020y.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int i;
        C31132a aVar = this.f76009T0;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.getMinimumWidth() - this.f76009T0.mo88255q();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(i, layoutParams.leftMargin) + this.f76020y.getMeasuredWidth() + Math.max(i, layoutParams.rightMargin);
    }

    /* renamed from: q */
    public static void m127042q(TextView textView, @C0327c1 int i) {
        C18496q.m83723E(textView, i);
        int h = C31500c.m127370h(textView.getContext(), i, 0);
        if (h != 0) {
            textView.setTextSize(0, (float) h);
        }
    }

    /* renamed from: r */
    public static void m127043r(@C0359n0 View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: s */
    public static void m127044s(@C0359n0 View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: y */
    public static void m127045y(@C0359n0 View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: d */
    public void mo1832d(@C0359n0 C0573j jVar, int i) {
        CharSequence charSequence;
        int i2;
        this.f75997H0 = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(jVar.getTooltipText())) {
            charSequence = jVar.getTooltipText();
        } else {
            charSequence = jVar.getTitle();
        }
        C0757o1.m3709a(this, charSequence);
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.f76010a = true;
    }

    /* renamed from: e */
    public boolean mo1833e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1834f() {
        return true;
    }

    @C0363p0
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f76019x;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @C0363p0
    public C31132a getBadge() {
        return this.f76009T0;
    }

    @C0375v
    public int getItemBackgroundResId() {
        return C31076a.C31083g.mtrl_navigation_bar_item_background;
    }

    @C0363p0
    public C0573j getItemData() {
        return this.f75997H0;
    }

    @C0364q
    public int getItemDefaultMarginResId() {
        return C31076a.C31082f.mtrl_navigation_bar_item_default_margin;
    }

    @C0347i0
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f75996G0;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f76021z.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f76021z.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f76021z.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f76021z.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* renamed from: h */
    public final void mo90206h(float f, float f2) {
        this.f76013d = f - f2;
        this.f76014e = (f2 * 1.0f) / f;
        this.f76015f = (f * 1.0f) / f2;
    }

    /* renamed from: i */
    public void mo90207i() {
        mo90213o();
        this.f75997H0 = null;
        this.f76003N0 = 0.0f;
        this.f76010a = false;
    }

    @C0363p0
    /* renamed from: j */
    public final FrameLayout mo90208j(View view) {
        ImageView imageView = this.f76020y;
        if (view != imageView || !C31135b.f74647a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: k */
    public final boolean mo90209k() {
        return this.f76009T0 != null;
    }

    /* renamed from: l */
    public final boolean mo90210l() {
        return this.f76007R0 && this.f76016g == 2;
    }

    /* renamed from: m */
    public final void mo90211m(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        if (!this.f76004O0 || !this.f76010a || !C18196h2.m82521O0(this)) {
            mo90217p(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.f76001L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f76001L0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f76003N0, f});
        this.f76001L0 = ofFloat;
        ofFloat.addUpdateListener(new C31444c(f));
        this.f76001L0.setInterpolator(C31441a.m127037e(getContext(), C31076a.C31079c.motionEasingStandard, C31093a.f74426b));
        this.f76001L0.setDuration((long) C31441a.m127036d(getContext(), C31076a.C31079c.motionDurationLong1, getResources().getInteger(C31076a.C31085i.material_motion_duration_long_1)));
        this.f76001L0.start();
    }

    /* renamed from: n */
    public final void mo90212n() {
        C0573j jVar = this.f75997H0;
        if (jVar != null) {
            setChecked(jVar.isChecked());
        }
    }

    /* renamed from: o */
    public void mo90213o() {
        mo90238u(this.f76020y);
    }

    @C0359n0
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0573j jVar = this.f75997H0;
        if (jVar != null && jVar.isCheckable() && this.f75997H0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f75991V0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C31132a aVar = this.f76009T0;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f75997H0.getTitle();
            if (!TextUtils.isEmpty(this.f75997H0.getContentDescription())) {
                title = this.f75997H0.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f76009T0.mo88252o());
        }
        C18065l0 c2 = C18065l0.m81936c2(accessibilityNodeInfo);
        c2.mo52604c1(C18065l0.C18069d.m82106h(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            c2.mo52596a1(false);
            c2.mo52556N0(C18065l0.C18066a.f46673j);
        }
        c2.mo52538G1(getResources().getString(C31076a.C31089m.item_view_role_description));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C31443b(i));
    }

    /* renamed from: p */
    public final void mo90217p(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, float f2) {
        View view = this.f76019x;
        if (view != null) {
            this.f76002M0.mo90248d(f, f2, view);
        }
        this.f76003N0 = f;
    }

    public void setActiveIndicatorDrawable(@C0363p0 Drawable drawable) {
        View view = this.f76019x;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.f76004O0 = z;
        View view = this.f76019x;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f76006Q0 = i;
        mo90240w(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@C0372t0 int i) {
        this.f76008S0 = i;
        mo90240w(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f76007R0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f76005P0 = i;
        mo90240w(getWidth());
    }

    public void setBadge(@C0359n0 C31132a aVar) {
        if (this.f76009T0 != aVar) {
            if (mo90209k() && this.f76020y != null) {
                mo90238u(this.f76020y);
            }
            this.f76009T0 = aVar;
            ImageView imageView = this.f76020y;
            if (imageView != null) {
                mo90237t(imageView);
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        float f;
        TextView textView = this.f75995F0;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f75995F0;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f75994E0;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f75994E0;
        textView4.setPivotY((float) textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        mo90211m(f);
        int i = this.f76016g;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m127044s(getIconOrContainer(), this.f76011b, 49);
                    m127045y(this.f76021z, this.f76012c);
                    this.f75995F0.setVisibility(0);
                } else {
                    m127044s(getIconOrContainer(), this.f76011b, 17);
                    m127045y(this.f76021z, 0);
                    this.f75995F0.setVisibility(4);
                }
                this.f75994E0.setVisibility(4);
            } else if (i == 1) {
                m127045y(this.f76021z, this.f76012c);
                if (z) {
                    m127044s(getIconOrContainer(), (int) (((float) this.f76011b) + this.f76013d), 49);
                    m127043r(this.f75995F0, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f75994E0;
                    float f2 = this.f76014e;
                    m127043r(textView5, f2, f2, 4);
                } else {
                    m127044s(getIconOrContainer(), this.f76011b, 49);
                    TextView textView6 = this.f75995F0;
                    float f3 = this.f76015f;
                    m127043r(textView6, f3, f3, 4);
                    m127043r(this.f75994E0, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m127044s(getIconOrContainer(), this.f76011b, 17);
                this.f75995F0.setVisibility(8);
                this.f75994E0.setVisibility(8);
            }
        } else if (this.f76017v) {
            if (z) {
                m127044s(getIconOrContainer(), this.f76011b, 49);
                m127045y(this.f76021z, this.f76012c);
                this.f75995F0.setVisibility(0);
            } else {
                m127044s(getIconOrContainer(), this.f76011b, 17);
                m127045y(this.f76021z, 0);
                this.f75995F0.setVisibility(4);
            }
            this.f75994E0.setVisibility(4);
        } else {
            m127045y(this.f76021z, this.f76012c);
            if (z) {
                m127044s(getIconOrContainer(), (int) (((float) this.f76011b) + this.f76013d), 49);
                m127043r(this.f75995F0, 1.0f, 1.0f, 0);
                TextView textView7 = this.f75994E0;
                float f4 = this.f76014e;
                m127043r(textView7, f4, f4, 4);
            } else {
                m127044s(getIconOrContainer(), this.f76011b, 49);
                TextView textView8 = this.f75995F0;
                float f5 = this.f76015f;
                m127043r(textView8, f5, f5, 4);
                m127043r(this.f75994E0, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f75994E0.setEnabled(z);
        this.f75995F0.setEnabled(z);
        this.f76020y.setEnabled(z);
        if (z) {
            C18196h2.m82583g2(this, C18124b2.m82287c(getContext(), 1002));
        } else {
            C18196h2.m82583g2(this, (C18124b2) null);
        }
    }

    public void setIcon(@C0363p0 Drawable drawable) {
        if (drawable != this.f75999J0) {
            this.f75999J0 = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C17549d.m80456r(drawable).mutate();
                this.f76000K0 = drawable;
                ColorStateList colorStateList = this.f75998I0;
                if (colorStateList != null) {
                    C17549d.m80453o(drawable, colorStateList);
                }
            }
            this.f76020y.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f76020y.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f76020y.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@C0363p0 ColorStateList colorStateList) {
        Drawable drawable;
        this.f75998I0 = colorStateList;
        if (this.f75997H0 != null && (drawable = this.f76000K0) != null) {
            C17549d.m80453o(drawable, colorStateList);
            this.f76000K0.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C17318d.m79726i(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f76012c != i) {
            this.f76012c = i;
            mo90212n();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f76011b != i) {
            this.f76011b = i;
            mo90212n();
        }
    }

    public void setItemPosition(int i) {
        this.f75996G0 = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f76016g != i) {
            this.f76016g = i;
            mo90241x();
            mo90240w(getWidth());
            mo90212n();
        }
    }

    public void setShifting(boolean z) {
        if (this.f76017v != z) {
            this.f76017v = z;
            mo90212n();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@C0327c1 int i) {
        m127042q(this.f75995F0, i);
        mo90206h(this.f75994E0.getTextSize(), this.f75995F0.getTextSize());
    }

    public void setTextAppearanceInactive(@C0327c1 int i) {
        m127042q(this.f75994E0, i);
        mo90206h(this.f75994E0.getTextSize(), this.f75995F0.getTextSize());
    }

    public void setTextColor(@C0363p0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f75994E0.setTextColor(colorStateList);
            this.f75995F0.setTextColor(colorStateList);
        }
    }

    public void setTitle(@C0363p0 CharSequence charSequence) {
        this.f75994E0.setText(charSequence);
        this.f75995F0.setText(charSequence);
        C0573j jVar = this.f75997H0;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0573j jVar2 = this.f75997H0;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.f75997H0.getTooltipText();
        }
        C0757o1.m3709a(this, charSequence);
    }

    /* renamed from: t */
    public final void mo90237t(@C0363p0 View view) {
        if (mo90209k() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C31135b.m125061d(this.f76009T0, view, mo90208j(view));
        }
    }

    /* renamed from: u */
    public final void mo90238u(@C0363p0 View view) {
        if (mo90209k()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C31135b.m125067j(this.f76009T0, view);
            }
            this.f76009T0 = null;
        }
    }

    /* renamed from: v */
    public final void mo90239v(View view) {
        if (mo90209k()) {
            C31135b.m125070m(this.f76009T0, view, mo90208j(view));
        }
    }

    /* renamed from: w */
    public final void mo90240w(int i) {
        int i2;
        if (this.f76019x != null) {
            int min = Math.min(this.f76005P0, i - (this.f76008S0 * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f76019x.getLayoutParams();
            if (mo90210l()) {
                i2 = min;
            } else {
                i2 = this.f76006Q0;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            this.f76019x.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: x */
    public final void mo90241x() {
        if (mo90210l()) {
            this.f76002M0 = f75993X0;
        } else {
            this.f76002M0 = f75992W0;
        }
    }

    public void setItemBackground(@C0363p0 Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C18196h2.m82502I1(this, drawable);
    }
}
