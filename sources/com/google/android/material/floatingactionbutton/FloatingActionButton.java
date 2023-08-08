package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0322b;
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0716g;
import androidx.appcompat.widget.C0732k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.util.C18001r;
import androidx.core.view.C18164e2;
import androidx.core.view.C18196h2;
import androidx.core.widget.C18475d0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31100h;
import com.google.android.material.animation.C31103k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.C31334a;
import com.google.android.material.expandable.C31336c;
import com.google.android.material.floatingactionbutton.C31360d;
import com.google.android.material.internal.C31392d;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.C31514c;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements C18164e2, C18475d0, C31334a, C31553s, CoordinatorLayout.C16976b {

    /* renamed from: J0 */
    public static final String f75585J0 = "FloatingActionButton";

    /* renamed from: K0 */
    public static final String f75586K0 = "expandableWidgetHelper";

    /* renamed from: L0 */
    public static final int f75587L0 = C31076a.C31090n.Widget_Design_FloatingActionButton;

    /* renamed from: M0 */
    public static final int f75588M0 = 1;

    /* renamed from: N0 */
    public static final int f75589N0 = 0;

    /* renamed from: O0 */
    public static final int f75590O0 = -1;

    /* renamed from: P0 */
    public static final int f75591P0 = 0;

    /* renamed from: Q0 */
    public static final int f75592Q0 = 470;

    /* renamed from: E0 */
    public final Rect f75593E0;

    /* renamed from: F0 */
    public final Rect f75594F0;
    @C0359n0

    /* renamed from: G0 */
    public final C0732k f75595G0;
    @C0359n0

    /* renamed from: H0 */
    public final C31336c f75596H0;

    /* renamed from: I0 */
    public C31360d f75597I0;
    @C0363p0

    /* renamed from: b */
    public ColorStateList f75598b;
    @C0363p0

    /* renamed from: c */
    public PorterDuff.Mode f75599c;
    @C0363p0

    /* renamed from: d */
    public ColorStateList f75600d;
    @C0363p0

    /* renamed from: e */
    public PorterDuff.Mode f75601e;
    @C0363p0

    /* renamed from: f */
    public ColorStateList f75602f;

    /* renamed from: g */
    public int f75603g;

    /* renamed from: v */
    public int f75604v;

    /* renamed from: w */
    public int f75605w;

    /* renamed from: x */
    public int f75606x;

    /* renamed from: y */
    public int f75607y;

    /* renamed from: z */
    public boolean f75608z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo89739G(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton, @C0359n0 Rect rect) {
            return super.mo51079b(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo89740H() {
            return super.mo89740H();
        }

        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean mo89742K(CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton, View view) {
            return super.mo51085i(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean mo89743L(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton, int i) {
            return super.mo51089m(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ void mo89744M(boolean z) {
            super.mo89744M(z);
        }

        @C0344h1
        /* renamed from: N */
        public /* bridge */ /* synthetic */ void mo89745N(C31350b bVar) {
            super.mo89745N(bVar);
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo51084h(@C0359n0 CoordinatorLayout.C16981g gVar) {
            super.mo51084h(gVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C31349a implements C31360d.C31371k {

        /* renamed from: a */
        public final /* synthetic */ C31350b f75613a;

        public C31349a(C31350b bVar) {
            this.f75613a = bVar;
        }

        /* renamed from: a */
        public void mo89749a() {
            this.f75613a.mo88356b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo89750b() {
            this.f75613a.mo88355a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C31350b {
        /* renamed from: a */
        public void mo88355a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo88356b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C31351c implements C31514c {
        public C31351c() {
        }

        /* renamed from: a */
        public void mo89751a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f75593E0.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f75606x, i2 + FloatingActionButton.this.f75606x, i3 + FloatingActionButton.this.f75606x, i4 + FloatingActionButton.this.f75606x);
        }

        /* renamed from: b */
        public void mo89752b(@C0363p0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: c */
        public boolean mo89753c() {
            return FloatingActionButton.this.f75608z;
        }

        /* renamed from: d */
        public float mo89754d() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public @interface C31352d {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$e */
    public class C31353e<T extends FloatingActionButton> implements C31360d.C31370j {
        @C0359n0

        /* renamed from: a */
        public final C31103k<T> f75616a;

        public C31353e(@C0359n0 C31103k<T> kVar) {
            this.f75616a = kVar;
        }

        /* renamed from: a */
        public void mo89755a() {
            this.f75616a.mo87877b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo89756b() {
            this.f75616a.mo87876a(FloatingActionButton.this);
        }

        public boolean equals(@C0363p0 Object obj) {
            if (!(obj instanceof C31353e) || !((C31353e) obj).f75616a.equals(this.f75616a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f75616a.hashCode();
        }
    }

    public FloatingActionButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private C31360d getImpl() {
        if (this.f75597I0 == null) {
            this.f75597I0 = mo89684j();
        }
        return this.f75597I0;
    }

    /* renamed from: x */
    public static int m126504x(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: A */
    public void mo89662A(@C0363p0 C31350b bVar) {
        mo89663B(bVar, true);
    }

    /* renamed from: B */
    public void mo89663B(@C0363p0 C31350b bVar, boolean z) {
        getImpl().mo89825f0(mo89664C(bVar), z);
    }

    @C0363p0
    /* renamed from: C */
    public final C31360d.C31371k mo89664C(@C0363p0 C31350b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C31349a(bVar);
    }

    /* renamed from: a */
    public boolean mo89560a(boolean z) {
        return this.f75596H0.mo89567f(z);
    }

    /* renamed from: b */
    public boolean mo89561b() {
        return this.f75596H0.mo89564c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo89796E(getDrawableState());
    }

    /* renamed from: f */
    public void mo89666f(@C0359n0 Animator.AnimatorListener animatorListener) {
        getImpl().mo89822e(animatorListener);
    }

    /* renamed from: g */
    public void mo89667g(@C0359n0 Animator.AnimatorListener animatorListener) {
        getImpl().mo89824f(animatorListener);
    }

    @C0363p0
    public ColorStateList getBackgroundTintList() {
        return this.f75598b;
    }

    @C0363p0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f75599c;
    }

    @C0359n0
    public CoordinatorLayout.C16977c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo89838n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo89841q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo89844t();
    }

    @C0363p0
    public Drawable getContentBackground() {
        return getImpl().mo89837m();
    }

    @C0372t0
    public int getCustomSize() {
        return this.f75605w;
    }

    public int getExpandedComponentIdHint() {
        return this.f75596H0.mo89563b();
    }

    @C0363p0
    public C31100h getHideMotionSpec() {
        return getImpl().mo89840p();
    }

    @C0354l
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f75602f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @C0363p0
    public ColorStateList getRippleColorStateList() {
        return this.f75602f;
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        return (C31534o) C18001r.m81775l(getImpl().mo89845u());
    }

    @C0363p0
    public C31100h getShowMotionSpec() {
        return getImpl().mo89846v();
    }

    public int getSize() {
        return this.f75604v;
    }

    public int getSizeDimension() {
        return mo89688m(this.f75604v);
    }

    @C0363p0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @C0363p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @C0363p0
    public ColorStateList getSupportImageTintList() {
        return this.f75600d;
    }

    @C0363p0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f75601e;
    }

    public boolean getUseCompatPadding() {
        return this.f75608z;
    }

    /* renamed from: h */
    public void mo89682h(@C0359n0 C31103k<? extends FloatingActionButton> kVar) {
        getImpl().mo89826g(new C31353e(kVar));
    }

    /* renamed from: i */
    public void mo89683i() {
        setCustomSize(0);
    }

    @C0359n0
    /* renamed from: j */
    public final C31360d mo89684j() {
        return new C31374e(this, new C31351c());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo89792A();
    }

    @Deprecated
    /* renamed from: k */
    public boolean mo89686k(@C0359n0 Rect rect) {
        if (!C18196h2.m82539U0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        mo89700s(rect);
        return true;
    }

    /* renamed from: l */
    public void mo89687l(@C0359n0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        mo89700s(rect);
    }

    /* renamed from: m */
    public final int mo89688m(int i) {
        int i2 = this.f75605w;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C31076a.C31082f.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C31076a.C31082f.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return mo89688m(1);
        } else {
            return mo89688m(0);
        }
    }

    /* renamed from: n */
    public void mo89689n() {
        mo89690o((C31350b) null);
    }

    /* renamed from: o */
    public void mo89690o(@C0363p0 C31350b bVar) {
        mo89697p(bVar, true);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo89793B();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo89795D();
    }

    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f75606x = (sizeDimension - this.f75607y) / 2;
        getImpl().mo89831i0();
        int min = Math.min(m126504x(sizeDimension, i), m126504x(sizeDimension, i2));
        Rect rect = this.f75593E0;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo53419a());
        this.f75596H0.mo89565d((Bundle) C18001r.m81775l(extendableSavedState.f76701c.get(f75586K0)));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f76701c.put(f75586K0, this.f75596H0.mo89566e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(@C0359n0 MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo89686k(this.f75594F0) || this.f75594F0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public void mo89697p(@C0363p0 C31350b bVar, boolean z) {
        getImpl().mo89847w(mo89664C(bVar), z);
    }

    /* renamed from: q */
    public boolean mo89698q() {
        return getImpl().mo89849y();
    }

    /* renamed from: r */
    public boolean mo89699r() {
        return getImpl().mo89850z();
    }

    /* renamed from: s */
    public final void mo89700s(@C0359n0 Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f75593E0;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        if (this.f75598b != colorStateList) {
            this.f75598b = colorStateList;
            getImpl().mo89806O(colorStateList);
        }
    }

    public void setBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        if (this.f75599c != mode) {
            this.f75599c = mode;
            getImpl().mo89807P(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo89808Q(f);
    }

    public void setCompatElevationResource(@C0364q int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo89811T(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@C0364q int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo89815X(f);
    }

    public void setCompatPressedTranslationZResource(@C0364q int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@C0372t0 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f75605w) {
            this.f75605w = i;
            requestLayout();
        }
    }

    @C0376v0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo89833j0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo89839o()) {
            getImpl().mo89809R(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@C0329d0 int i) {
        this.f75596H0.mo89568g(i);
    }

    public void setHideMotionSpec(@C0363p0 C31100h hVar) {
        getImpl().mo89810S(hVar);
    }

    public void setHideMotionSpecResource(@C0322b int i) {
        setHideMotionSpec(C31100h.m124662d(getContext(), i));
    }

    public void setImageDrawable(@C0363p0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo89829h0();
            if (this.f75600d != null) {
                mo89733t();
            }
        }
    }

    public void setImageResource(@C0375v int i) {
        this.f75595G0.mo3501i(i);
        mo89733t();
    }

    public void setMaxImageSize(int i) {
        this.f75607y = i;
        getImpl().mo89813V(i);
    }

    public void setRippleColor(@C0354l int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo89800I();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo89800I();
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo89817Z(z);
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        getImpl().mo89818a0(oVar);
    }

    public void setShowMotionSpec(@C0363p0 C31100h hVar) {
        getImpl().mo89819b0(hVar);
    }

    public void setShowMotionSpecResource(@C0322b int i) {
        setShowMotionSpec(C31100h.m124662d(getContext(), i));
    }

    public void setSize(int i) {
        this.f75605w = 0;
        if (i != this.f75604v) {
            this.f75604v = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@C0363p0 ColorStateList colorStateList) {
        if (this.f75600d != colorStateList) {
            this.f75600d = colorStateList;
            mo89733t();
        }
    }

    public void setSupportImageTintMode(@C0363p0 PorterDuff.Mode mode) {
        if (this.f75601e != mode) {
            this.f75601e = mode;
            mo89733t();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo89801J();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo89801J();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo89801J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f75608z != z) {
            this.f75608z = z;
            getImpl().mo89794C();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public final void mo89733t() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f75600d;
            if (colorStateList == null) {
                C17549d.m80441c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f75601e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0716g.m3507e(colorForState, mode));
        }
    }

    /* renamed from: u */
    public void mo89734u(@C0359n0 Animator.AnimatorListener animatorListener) {
        getImpl().mo89802K(animatorListener);
    }

    /* renamed from: v */
    public void mo89735v(@C0359n0 Animator.AnimatorListener animatorListener) {
        getImpl().mo89803L(animatorListener);
    }

    /* renamed from: w */
    public void mo89736w(@C0359n0 C31103k<? extends FloatingActionButton> kVar) {
        getImpl().mo89804M(new C31353e(kVar));
    }

    /* renamed from: y */
    public boolean mo89737y() {
        return getImpl().mo89839o();
    }

    /* renamed from: z */
    public void mo89738z() {
        mo89662A((C31350b) null);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C16977c<T> {

        /* renamed from: d */
        public static final boolean f75609d = true;

        /* renamed from: a */
        public Rect f75610a;

        /* renamed from: b */
        public C31350b f75611b;

        /* renamed from: c */
        public boolean f75612c;

        public BaseBehavior() {
            this.f75612c = true;
        }

        /* renamed from: I */
        public static boolean m126530I(@C0359n0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C16981g) {
                return ((CoordinatorLayout.C16981g) layoutParams).mo51111f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        public boolean mo51079b(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton, @C0359n0 Rect rect) {
            Rect rect2 = floatingActionButton.f75593E0;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo89740H() {
            return this.f75612c;
        }

        /* renamed from: J */
        public final void mo89741J(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f75593E0;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C16981g gVar = (CoordinatorLayout.C16981g) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - gVar.rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= gVar.leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - gVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= gVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C18196h2.m82578f1(floatingActionButton, i2);
                }
                if (i != 0) {
                    C18196h2.m82574e1(floatingActionButton, i);
                }
            }
        }

        /* renamed from: K */
        public boolean mo51085i(CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                mo89747P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m126530I(view)) {
                return false;
            } else {
                mo89748Q(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: L */
        public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 FloatingActionButton floatingActionButton, int i) {
            List<View> w = coordinatorLayout.mo51062w(floatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m126530I(view) && mo89748Q(view, floatingActionButton)) {
                        break;
                    }
                } else if (mo89747P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo51012N(floatingActionButton, i);
            mo89741J(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: M */
        public void mo89744M(boolean z) {
            this.f75612c = z;
        }

        @C0344h1
        /* renamed from: N */
        public void mo89745N(C31350b bVar) {
            this.f75611b = bVar;
        }

        /* renamed from: O */
        public final boolean mo89746O(@C0359n0 View view, @C0359n0 FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C16981g gVar = (CoordinatorLayout.C16981g) floatingActionButton.getLayoutParams();
            if (this.f75612c && gVar.mo51110e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: P */
        public final boolean mo89747P(CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 FloatingActionButton floatingActionButton) {
            if (!mo89746O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f75610a == null) {
                this.f75610a = new Rect();
            }
            Rect rect = this.f75610a;
            C31392d.m126855a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo89697p(this.f75611b, false);
                return true;
            }
            floatingActionButton.mo89663B(this.f75611b, false);
            return true;
        }

        /* renamed from: Q */
        public final boolean mo89748Q(@C0359n0 View view, @C0359n0 FloatingActionButton floatingActionButton) {
            if (!mo89746O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C16981g) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo89697p(this.f75611b, false);
                return true;
            }
            floatingActionButton.mo89663B(this.f75611b, false);
            return true;
        }

        /* renamed from: h */
        public void mo51084h(@C0359n0 CoordinatorLayout.C16981g gVar) {
            if (gVar.f44902h == 0) {
                gVar.f44902h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.FloatingActionButton_Behavior_Layout);
            this.f75612c = obtainStyledAttributes.getBoolean(C31076a.C31091o.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.floatingActionButtonStyle);
    }

    public void setRippleColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f75602f != colorStateList) {
            this.f75602f = colorStateList;
            getImpl().mo89816Y(this.f75602f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(@androidx.annotation.C0359n0 android.content.Context r11, @androidx.annotation.C0363p0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f75587L0
            android.content.Context r11 = com.google.android.material.theme.overlay.C31683a.m128455c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f75593E0 = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f75594F0 = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.C31500c.m127363a(r11, r0, r1)
            r10.f75598b = r1
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C31432x.m127017l(r1, r3)
            r10.f75599c = r1
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.C31500c.m127363a(r11, r0, r1)
            r10.f75602f = r1
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f75604v = r1
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f75605w = r1
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f75603g = r1
            int r1 = com.google.android.material.C31076a.C31091o.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = com.google.android.material.C31076a.C31091o.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = com.google.android.material.C31076a.C31091o.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = com.google.android.material.C31076a.C31091o.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f75608z = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = com.google.android.material.C31076a.C31082f.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = com.google.android.material.C31076a.C31091o.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = com.google.android.material.C31076a.C31091o.FloatingActionButton_showMotionSpec
            com.google.android.material.animation.h r5 = com.google.android.material.animation.C31100h.m124661c(r11, r0, r5)
            int r8 = com.google.android.material.C31076a.C31091o.FloatingActionButton_hideMotionSpec
            com.google.android.material.animation.h r8 = com.google.android.material.animation.C31100h.m124661c(r11, r0, r8)
            com.google.android.material.shape.d r9 = com.google.android.material.shape.C31534o.f76418m
            com.google.android.material.shape.o$b r11 = com.google.android.material.shape.C31534o.m127567g(r11, r12, r13, r6, r9)
            com.google.android.material.shape.o r11 = r11.mo90843m()
            int r6 = com.google.android.material.C31076a.C31091o.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = com.google.android.material.C31076a.C31091o.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.k r0 = new androidx.appcompat.widget.k
            r0.<init>(r10)
            r10.f75595G0 = r0
            r0.mo3499g(r12, r13)
            com.google.android.material.expandable.c r12 = new com.google.android.material.expandable.c
            r12.<init>(r10)
            r10.f75596H0 = r12
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.mo89818a0(r11)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f75598b
            android.graphics.PorterDuff$Mode r13 = r10.f75599c
            android.content.res.ColorStateList r0 = r10.f75602f
            int r7 = r10.f75603g
            r11.mo89848x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89814W(r4)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89808Q(r1)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89811T(r3)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89815X(r2)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89819b0(r5)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89810S(r8)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo89809R(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
