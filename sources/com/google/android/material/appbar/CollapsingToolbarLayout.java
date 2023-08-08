package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.C0327c1;
import androidx.annotation.C0337f0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.math.C17760a;
import androidx.core.util.C17992m;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.elevation.C31333a;
import com.google.android.material.internal.C31388b;
import com.google.android.material.internal.C31392d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: V0 */
    public static final int f74521V0 = C31076a.C31090n.Widget_Design_CollapsingToolbar;

    /* renamed from: W0 */
    public static final int f74522W0 = 600;

    /* renamed from: X0 */
    public static final int f74523X0 = 0;

    /* renamed from: Y0 */
    public static final int f74524Y0 = 1;

    /* renamed from: E0 */
    public boolean f74525E0;

    /* renamed from: F0 */
    public boolean f74526F0;
    @C0363p0

    /* renamed from: G0 */
    public Drawable f74527G0;
    @C0363p0

    /* renamed from: H0 */
    public Drawable f74528H0;

    /* renamed from: I0 */
    public int f74529I0;

    /* renamed from: J0 */
    public boolean f74530J0;

    /* renamed from: K0 */
    public ValueAnimator f74531K0;

    /* renamed from: L0 */
    public long f74532L0;

    /* renamed from: M0 */
    public int f74533M0;

    /* renamed from: N0 */
    public AppBarLayout.C31119h f74534N0;

    /* renamed from: O0 */
    public int f74535O0;

    /* renamed from: P0 */
    public int f74536P0;
    @C0363p0

    /* renamed from: Q0 */
    public C18436z4 f74537Q0;

    /* renamed from: R0 */
    public int f74538R0;

    /* renamed from: S0 */
    public boolean f74539S0;

    /* renamed from: T0 */
    public int f74540T0;

    /* renamed from: U0 */
    public boolean f74541U0;

    /* renamed from: a */
    public boolean f74542a;

    /* renamed from: b */
    public int f74543b;
    @C0363p0

    /* renamed from: c */
    public ViewGroup f74544c;
    @C0363p0

    /* renamed from: d */
    public View f74545d;

    /* renamed from: e */
    public View f74546e;

    /* renamed from: f */
    public int f74547f;

    /* renamed from: g */
    public int f74548g;

    /* renamed from: v */
    public int f74549v;

    /* renamed from: w */
    public int f74550w;

    /* renamed from: x */
    public final Rect f74551x;
    @C0359n0

    /* renamed from: y */
    public final C31388b f74552y;
    @C0359n0

    /* renamed from: z */
    public final C31333a f74553z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C31120a implements C18414x1 {
        public C31120a() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, @C0359n0 C18436z4 z4Var) {
            return CollapsingToolbarLayout.this.mo88062r(z4Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C31121b implements ValueAnimator.AnimatorUpdateListener {
        public C31121b() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    public class C31123d implements AppBarLayout.C31119h {
        public C31123d() {
        }

        /* renamed from: a */
        public void mo83757a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f74535O0 = i;
            C18436z4 z4Var = collapsingToolbarLayout.f74537Q0;
            if (z4Var != null) {
                i2 = z4Var.mo53149r();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                C31122c cVar = (C31122c) childAt.getLayoutParams();
                C31129d j = CollapsingToolbarLayout.m124831j(childAt);
                int i4 = cVar.f74560a;
                if (i4 == 1) {
                    j.mo88153k(C17760a.m81102e(-i, 0, CollapsingToolbarLayout.this.mo88049h(childAt)));
                } else if (i4 == 2) {
                    j.mo88153k(Math.round(((float) (-i)) * cVar.f74561b));
                }
            }
            CollapsingToolbarLayout.this.mo88107x();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f74528H0 != null && i2 > 0) {
                C18196h2.m82610n1(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int e0 = (height - C18196h2.m82573e0(CollapsingToolbarLayout.this)) - i2;
            float f = (float) e0;
            CollapsingToolbarLayout.this.f74552y.mo90011B0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f74552y.mo90073o0(collapsingToolbarLayout3.f74535O0 + e0);
            CollapsingToolbarLayout.this.f74552y.mo90095z0(((float) Math.abs(i)) / f);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$e */
    public @interface C31124e {
    }

    public CollapsingToolbarLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public static int m124829g(@C0359n0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: i */
    public static CharSequence m124830i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @C0359n0
    /* renamed from: j */
    public static C31129d m124831j(@C0359n0 View view) {
        int i = C31076a.C31084h.view_offset_helper;
        C31129d dVar = (C31129d) view.getTag(i);
        if (dVar != null) {
            return dVar;
        }
        C31129d dVar2 = new C31129d(view);
        view.setTag(i, dVar2);
        return dVar2;
    }

    /* renamed from: p */
    public static boolean m124832p(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* renamed from: a */
    public final void mo88015a(int i) {
        TimeInterpolator timeInterpolator;
        mo88017c();
        ValueAnimator valueAnimator = this.f74531K0;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f74531K0 = valueAnimator2;
            if (i > this.f74529I0) {
                timeInterpolator = C31093a.f74427c;
            } else {
                timeInterpolator = C31093a.f74428d;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f74531K0.addUpdateListener(new C31121b());
        } else if (valueAnimator.isRunning()) {
            this.f74531K0.cancel();
        }
        this.f74531K0.setDuration(this.f74532L0);
        this.f74531K0.setIntValues(new int[]{this.f74529I0, i});
        this.f74531K0.start();
    }

    /* renamed from: b */
    public final void mo88016b(AppBarLayout appBarLayout) {
        if (mo88053n()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88017c() {
        /*
            r6 = this;
            boolean r0 = r6.f74542a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f74544c = r0
            r6.f74545d = r0
            int r1 = r6.f74543b
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f74544c = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.mo88019d(r1)
            r6.f74545d = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f74544c
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m124832p(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f74544c = r0
        L_0x003e:
            r6.mo88106w()
            r6.f74542a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.mo88017c():void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C31122c;
    }

    @C0359n0
    /* renamed from: d */
    public final View mo88019d(@C0359n0 View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    public void draw(@C0359n0 Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        mo88017c();
        if (this.f74544c == null && (drawable = this.f74527G0) != null && this.f74529I0 > 0) {
            drawable.mutate().setAlpha(this.f74529I0);
            this.f74527G0.draw(canvas);
        }
        if (this.f74525E0 && this.f74526F0) {
            if (this.f74544c == null || this.f74527G0 == null || this.f74529I0 <= 0 || !mo88053n() || this.f74552y.mo90020G() >= this.f74552y.mo90022H()) {
                this.f74552y.mo90066l(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f74527G0.getBounds(), Region.Op.DIFFERENCE);
                this.f74552y.mo90066l(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f74528H0 != null && this.f74529I0 > 0) {
            C18436z4 z4Var = this.f74537Q0;
            if (z4Var != null) {
                i = z4Var.mo53149r();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f74528H0.setBounds(0, -this.f74535O0, getWidth(), i - this.f74535O0);
                this.f74528H0.mutate().setAlpha(this.f74529I0);
                this.f74528H0.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f74527G0 == null || this.f74529I0 <= 0 || !mo88061q(view)) {
            z = false;
        } else {
            mo88104v(this.f74527G0, view, getWidth(), getHeight());
            this.f74527G0.mutate().setAlpha(this.f74529I0);
            this.f74527G0.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f74528H0;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f74527G0;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C31388b bVar = this.f74552y;
        if (bVar != null) {
            z |= bVar.mo90027J0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public C31122c generateDefaultLayoutParams() {
        return new C31122c(-1, -1);
    }

    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C31122c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f74552y.mo90076q();
    }

    @C0359n0
    public Typeface getCollapsedTitleTypeface() {
        return this.f74552y.mo90086v();
    }

    @C0363p0
    public Drawable getContentScrim() {
        return this.f74527G0;
    }

    public int getExpandedTitleGravity() {
        return this.f74552y.mo90012C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f74550w;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f74549v;
    }

    public int getExpandedTitleMarginStart() {
        return this.f74547f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f74548g;
    }

    @C0359n0
    public Typeface getExpandedTitleTypeface() {
        return this.f74552y.mo90018F();
    }

    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f74552y.mo90024I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f74552y.mo90026J();
    }

    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f74552y.mo90028K();
    }

    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f74552y.mo90030L();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f74552y.mo90032M();
    }

    public int getScrimAlpha() {
        return this.f74529I0;
    }

    public long getScrimAnimationDuration() {
        return this.f74532L0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f74533M0;
        if (i2 >= 0) {
            return i2 + this.f74538R0 + this.f74540T0;
        }
        C18436z4 z4Var = this.f74537Q0;
        if (z4Var != null) {
            i = z4Var.mo53149r();
        } else {
            i = 0;
        }
        int e0 = C18196h2.m82573e0(this);
        if (e0 > 0) {
            return Math.min((e0 * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    @C0363p0
    public Drawable getStatusBarScrim() {
        return this.f74528H0;
    }

    @C0363p0
    public CharSequence getTitle() {
        if (this.f74525E0) {
            return this.f74552y.mo90037P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f74536P0;
    }

    @C0363p0
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f74552y.mo90036O();
    }

    /* renamed from: h */
    public final int mo88049h(@C0359n0 View view) {
        return ((getHeight() - m124831j(view).mo88145c()) - view.getHeight()) - ((C31122c) view.getLayoutParams()).bottomMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public boolean mo88050k() {
        return this.f74541U0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public boolean mo88051l() {
        return this.f74539S0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m */
    public boolean mo88052m() {
        return this.f74552y.mo90042V();
    }

    /* renamed from: n */
    public final boolean mo88053n() {
        return this.f74536P0 == 1;
    }

    /* renamed from: o */
    public boolean mo88054o() {
        return this.f74525E0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            mo88016b(appBarLayout);
            C18196h2.m82522O1(this, C18196h2.m82538U(appBarLayout));
            if (this.f74534N0 == null) {
                this.f74534N0 = new C31123d();
            }
            appBarLayout.mo87891e(this.f74534N0);
            C18196h2.m82642v1(this);
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f74552y.mo90045Z(configuration);
    }

    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C31119h hVar = this.f74534N0;
        if (hVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo87938v(hVar);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C18436z4 z4Var = this.f74537Q0;
        if (z4Var != null) {
            int r = z4Var.mo53149r();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C18196h2.m82538U(childAt) && childAt.getTop() < r) {
                    C18196h2.m82578f1(childAt, r);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m124831j(getChildAt(i6)).mo88150h();
        }
        mo88108y(i, i2, i3, i4, false);
        mo88109z();
        mo88107x();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m124831j(getChildAt(i7)).mo88143a();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        mo88017c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C18436z4 z4Var = this.f74537Q0;
        if (z4Var != null) {
            i3 = z4Var.mo53149r();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f74539S0) && i3 > 0) {
            this.f74538R0 = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f74541U0 && this.f74552y.mo90032M() > 1) {
            mo88109z();
            mo88108y(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z = this.f74552y.mo90094z();
            if (z > 1) {
                this.f74540T0 = Math.round(this.f74552y.mo90010B()) * (z - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f74540T0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f74544c;
        if (viewGroup != null) {
            View view = this.f74545d;
            if (view == null || view == this) {
                setMinimumHeight(m124829g(viewGroup));
            } else {
                setMinimumHeight(m124829g(view));
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f74527G0;
        if (drawable != null) {
            mo88103u(drawable, i, i2);
        }
    }

    /* renamed from: q */
    public final boolean mo88061q(View view) {
        View view2 = this.f74545d;
        if (view2 == null || view2 == this) {
            if (view == this.f74544c) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public C18436z4 mo88062r(@C0359n0 C18436z4 z4Var) {
        C18436z4 z4Var2;
        if (C18196h2.m82538U(this)) {
            z4Var2 = z4Var;
        } else {
            z4Var2 = null;
        }
        if (!C17992m.m81740a(this.f74537Q0, z4Var2)) {
            this.f74537Q0 = z4Var2;
            requestLayout();
        }
        return z4Var.mo53132c();
    }

    /* renamed from: s */
    public final void mo88063s(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view = this.f74545d;
        if (view == null) {
            view = this.f74544c;
        }
        int h = mo88049h(view);
        C31392d.m126855a(this, this.f74546e, this.f74551x);
        ViewGroup viewGroup = this.f74544c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i3 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i4 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i3 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i4 = toolbar2.getTitleMarginBottom();
        } else {
            i3 = 0;
            i4 = 0;
            i2 = 0;
            i = 0;
        }
        C31388b bVar = this.f74552y;
        Rect rect = this.f74551x;
        int i6 = rect.left;
        if (z) {
            i5 = i2;
        } else {
            i5 = i3;
        }
        int i7 = i6 + i5;
        int i8 = rect.top + h + i;
        int i9 = rect.right;
        if (!z) {
            i3 = i2;
        }
        bVar.mo90055f0(i7, i8, i9 - i3, (rect.bottom + h) - i4);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f74552y.mo90065k0(i);
    }

    public void setCollapsedTitleTextAppearance(@C0327c1 int i) {
        this.f74552y.mo90059h0(i);
    }

    public void setCollapsedTitleTextColor(@C0354l int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@C0363p0 Typeface typeface) {
        this.f74552y.mo90069m0(typeface);
    }

    public void setContentScrim(@C0363p0 Drawable drawable) {
        Drawable drawable2 = this.f74527G0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f74527G0 = drawable3;
            if (drawable3 != null) {
                mo88103u(drawable3, getWidth(), getHeight());
                this.f74527G0.setCallback(this);
                this.f74527G0.setAlpha(this.f74529I0);
            }
            C18196h2.m82610n1(this);
        }
    }

    public void setContentScrimColor(@C0354l int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@C0375v int i) {
        setContentScrim(C17318d.m79726i(getContext(), i));
    }

    public void setExpandedTitleColor(@C0354l int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f74552y.mo90087v0(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f74547f = i;
        this.f74548g = i2;
        this.f74549v = i3;
        this.f74550w = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f74550w = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f74549v = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f74547f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f74548g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@C0327c1 int i) {
        this.f74552y.mo90081s0(i);
    }

    public void setExpandedTitleTextColor(@C0359n0 ColorStateList colorStateList) {
        this.f74552y.mo90085u0(colorStateList);
    }

    public void setExpandedTitleTypeface(@C0363p0 Typeface typeface) {
        this.f74552y.mo90091x0(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f74541U0 = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f74539S0 = z;
    }

    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f74552y.mo90013C0(i);
    }

    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f74552y.mo90017E0(f);
    }

    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@C0379x(from = 0.0d) float f) {
        this.f74552y.mo90019F0(f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.f74552y.mo90021G0(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f74552y.mo90025I0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f74529I0) {
            if (!(this.f74527G0 == null || (viewGroup = this.f74544c) == null)) {
                C18196h2.m82610n1(viewGroup);
            }
            this.f74529I0 = i;
            C18196h2.m82610n1(this);
        }
    }

    public void setScrimAnimationDuration(@C0337f0(from = 0) long j) {
        this.f74532L0 = j;
    }

    public void setScrimVisibleHeightTrigger(@C0337f0(from = 0) int i) {
        if (this.f74533M0 != i) {
            this.f74533M0 = i;
            mo88107x();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, C18196h2.m82539U0(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@C0363p0 Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f74528H0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f74528H0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f74528H0.setState(getDrawableState());
                }
                C17549d.m80451m(this.f74528H0, C18196h2.m82553Z(this));
                Drawable drawable4 = this.f74528H0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f74528H0.setCallback(this);
                this.f74528H0.setAlpha(this.f74529I0);
            }
            C18196h2.m82610n1(this);
        }
    }

    public void setStatusBarScrimColor(@C0354l int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@C0375v int i) {
        setStatusBarScrim(C17318d.m79726i(getContext(), i));
    }

    public void setTitle(@C0363p0 CharSequence charSequence) {
        this.f74552y.mo90029K0(charSequence);
        mo88102t();
    }

    public void setTitleCollapseMode(int i) {
        this.f74536P0 = i;
        boolean n = mo88053n();
        this.f74552y.mo90009A0(n);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            mo88016b((AppBarLayout) parent);
        }
        if (n && this.f74527G0 == null) {
            setContentScrimColor(this.f74553z.mo89551g(getResources().getDimension(C31076a.C31082f.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f74525E0) {
            this.f74525E0 = z;
            mo88102t();
            mo88106w();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@C0363p0 TimeInterpolator timeInterpolator) {
        this.f74552y.mo90023H0(timeInterpolator);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f74528H0;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f74528H0.setVisible(z, false);
        }
        Drawable drawable2 = this.f74527G0;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f74527G0.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void mo88102t() {
        setContentDescription(getTitle());
    }

    /* renamed from: u */
    public final void mo88103u(@C0359n0 Drawable drawable, int i, int i2) {
        mo88104v(drawable, this.f74544c, i, i2);
    }

    /* renamed from: v */
    public final void mo88104v(@C0359n0 Drawable drawable, @C0363p0 View view, int i, int i2) {
        if (mo88053n() && view != null && this.f74525E0) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    public boolean verifyDrawable(@C0359n0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f74527G0 || drawable == this.f74528H0;
    }

    /* renamed from: w */
    public final void mo88106w() {
        View view;
        if (!this.f74525E0 && (view = this.f74546e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f74546e);
            }
        }
        if (this.f74525E0 && this.f74544c != null) {
            if (this.f74546e == null) {
                this.f74546e = new View(getContext());
            }
            if (this.f74546e.getParent() == null) {
                this.f74544c.addView(this.f74546e, -1, -1);
            }
        }
    }

    /* renamed from: x */
    public final void mo88107x() {
        boolean z;
        if (this.f74527G0 != null || this.f74528H0 != null) {
            if (getHeight() + this.f74535O0 < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    /* renamed from: y */
    public final void mo88108y(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.f74525E0 && (view = this.f74546e) != null) {
            boolean z3 = false;
            if (!C18196h2.m82521O0(view) || this.f74546e.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f74526F0 = z2;
            if (z2 || z) {
                if (C18196h2.m82553Z(this) == 1) {
                    z3 = true;
                }
                mo88063s(z3);
                C31388b bVar = this.f74552y;
                if (z3) {
                    i5 = this.f74549v;
                } else {
                    i5 = this.f74547f;
                }
                int i7 = this.f74551x.top + this.f74548g;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f74547f;
                } else {
                    i6 = this.f74549v;
                }
                bVar.mo90075p0(i5, i7, i8 - i6, (i4 - i2) - this.f74550w);
                this.f74552y.mo90052d0(z);
            }
        }
    }

    /* renamed from: z */
    public final void mo88109z() {
        if (this.f74544c != null && this.f74525E0 && TextUtils.isEmpty(this.f74552y.mo90037P())) {
            setTitle(m124830i(this.f74544c));
        }
    }

    public CollapsingToolbarLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(@C0359n0 ColorStateList colorStateList) {
        this.f74552y.mo90063j0(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f74530J0 != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                mo88015a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f74530J0 = z;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(@androidx.annotation.C0359n0 android.content.Context r11, @androidx.annotation.C0363p0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f74521V0
            android.content.Context r11 = com.google.android.material.theme.overlay.C31683a.m128455c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.f74542a = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f74551x = r0
            r6 = -1
            r10.f74533M0 = r6
            r7 = 0
            r10.f74538R0 = r7
            r10.f74540T0 = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.b r9 = new com.google.android.material.internal.b
            r9.<init>(r10)
            r10.f74552y = r9
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.C31093a.f74429e
            r9.mo90031L0(r0)
            r9.mo90025I0(r7)
            com.google.android.material.elevation.a r0 = new com.google.android.material.elevation.a
            r0.<init>(r8)
            r10.f74553z = r0
            int[] r2 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo90087v0(r13)
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo90065k0(r13)
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleMargin
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f74550w = r13
            r10.f74549v = r13
            r10.f74548g = r13
            r10.f74547f = r13
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0074
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f74547f = r13
        L_0x0074:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0082
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f74549v = r13
        L_0x0082:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0090
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f74548g = r13
        L_0x0090:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x009e
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f74550w = r13
        L_0x009e:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_titleEnabled
            boolean r13 = r12.getBoolean(r13, r11)
            r10.f74525E0 = r13
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_title
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = com.google.android.material.C31076a.C31090n.TextAppearance_Design_CollapsingToolbar_Expanded
            r9.mo90081s0(r13)
            int r13 = androidx.appcompat.C0387a.C0399l.TextAppearance_AppCompat_Widget_ActionBar_Title
            r9.mo90059h0(r13)
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00c8
            int r13 = r12.getResourceId(r13, r7)
            r9.mo90081s0(r13)
        L_0x00c8:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00d7
            int r13 = r12.getResourceId(r13, r7)
            r9.mo90059h0(r13)
        L_0x00d7:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00e6
            android.content.res.ColorStateList r13 = com.google.android.material.resources.C31500c.m127363a(r8, r12, r13)
            r9.mo90085u0(r13)
        L_0x00e6:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00f5
            android.content.res.ColorStateList r13 = com.google.android.material.resources.C31500c.m127363a(r8, r12, r13)
            r9.mo90063j0(r13)
        L_0x00f5:
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.f74533M0 = r13
            int r13 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_maxLines
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x010c
            int r11 = r12.getInt(r13, r11)
            r9.mo90021G0(r11)
        L_0x010c:
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x011f
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.mo90023H0(r11)
        L_0x011f:
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_scrimAnimationDuration
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.f74532L0 = r0
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_titleCollapseMode
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_toolbarId
            int r11 = r12.getResourceId(r11, r6)
            r10.f74543b = r11
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f74539S0 = r11
            int r11 = com.google.android.material.C31076a.C31091o.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f74541U0 = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r11.<init>()
            androidx.core.view.C18196h2.m82559a2(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C31122c(getContext(), attributeSet);
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public static class C31122c extends FrameLayout.LayoutParams {

        /* renamed from: c */
        public static final float f74556c = 0.5f;

        /* renamed from: d */
        public static final int f74557d = 0;

        /* renamed from: e */
        public static final int f74558e = 1;

        /* renamed from: f */
        public static final int f74559f = 2;

        /* renamed from: a */
        public int f74560a = 0;

        /* renamed from: b */
        public float f74561b = 0.5f;

        public C31122c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.CollapsingToolbarLayout_Layout);
            this.f74560a = obtainStyledAttributes.getInt(C31076a.C31091o.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo88114d(obtainStyledAttributes.getFloat(C31076a.C31091o.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo88111a() {
            return this.f74560a;
        }

        /* renamed from: b */
        public float mo88112b() {
            return this.f74561b;
        }

        /* renamed from: c */
        public void mo88113c(int i) {
            this.f74560a = i;
        }

        /* renamed from: d */
        public void mo88114d(float f) {
            this.f74561b = f;
        }

        public C31122c(int i, int i2) {
            super(i, i2);
        }

        public C31122c(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public C31122c(@C0359n0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C31122c(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @C0376v0(19)
        public C31122c(@C0359n0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
