package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.C0329d0;
import androidx.annotation.C0337f0;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31422p;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31500c;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C31599b;
import com.google.android.material.theme.overlay.C31683a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: A */
    public static final int f76599A = 150;

    /* renamed from: B */
    public static final int f76600B = 75;

    /* renamed from: C */
    public static final float f76601C = 0.8f;
    @C0359n0

    /* renamed from: D */
    public static final Handler f76602D = new Handler(Looper.getMainLooper(), new C31580h());

    /* renamed from: E */
    public static final int f76603E = 0;

    /* renamed from: F */
    public static final int f76604F = 1;

    /* renamed from: G */
    public static final boolean f76605G = false;

    /* renamed from: H */
    public static final int[] f76606H = {C31076a.C31079c.snackbarStyle};

    /* renamed from: I */
    public static final String f76607I = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: t */
    public static final int f76608t = 0;

    /* renamed from: u */
    public static final int f76609u = 1;

    /* renamed from: v */
    public static final int f76610v = -2;

    /* renamed from: w */
    public static final int f76611w = -1;

    /* renamed from: x */
    public static final int f76612x = 0;

    /* renamed from: y */
    public static final int f76613y = 250;

    /* renamed from: z */
    public static final int f76614z = 180;
    @C0359n0

    /* renamed from: a */
    public final ViewGroup f76615a;

    /* renamed from: b */
    public final Context f76616b;
    @C0359n0

    /* renamed from: c */
    public final SnackbarBaseLayout f76617c;
    @C0359n0

    /* renamed from: d */
    public final C31598a f76618d;

    /* renamed from: e */
    public int f76619e;

    /* renamed from: f */
    public boolean f76620f;
    @C0363p0

    /* renamed from: g */
    public C31589q f76621g;

    /* renamed from: h */
    public boolean f76622h;
    @C0376v0(29)

    /* renamed from: i */
    public final Runnable f76623i;

    /* renamed from: j */
    public int f76624j;

    /* renamed from: k */
    public int f76625k;

    /* renamed from: l */
    public int f76626l;

    /* renamed from: m */
    public int f76627m;

    /* renamed from: n */
    public int f76628n;

    /* renamed from: o */
    public boolean f76629o;

    /* renamed from: p */
    public List<C31591s<B>> f76630p;

    /* renamed from: q */
    public Behavior f76631q;
    @C0363p0

    /* renamed from: r */
    public final AccessibilityManager f76632r;
    @C0359n0

    /* renamed from: s */
    public C31599b.C31601b f76633s;

    public static class Behavior extends SwipeDismissBehavior<View> {
        @C0359n0

        /* renamed from: t */
        public final C31593t f76634t = new C31593t(this);

        /* renamed from: G */
        public boolean mo88278G(View view) {
            return this.f76634t.mo91215a(view);
        }

        /* renamed from: V */
        public final void mo91170V(@C0359n0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f76634t.mo91217c(baseTransientBottomBar);
        }

        /* renamed from: l */
        public boolean mo51088l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
            this.f76634t.mo91216b(coordinatorLayout, view, motionEvent);
            return super.mo51088l(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: y */
        public static final View.OnTouchListener f76635y = new C31572a();
        @C0363p0

        /* renamed from: a */
        public BaseTransientBottomBar<?> f76636a;

        /* renamed from: b */
        public int f76637b;

        /* renamed from: c */
        public final float f76638c;

        /* renamed from: d */
        public final float f76639d;

        /* renamed from: e */
        public final int f76640e;

        /* renamed from: f */
        public final int f76641f;

        /* renamed from: g */
        public ColorStateList f76642g;

        /* renamed from: v */
        public PorterDuff.Mode f76643v;
        @C0363p0

        /* renamed from: w */
        public Rect f76644w;

        /* renamed from: x */
        public boolean f76645x;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        public class C31572a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@C0359n0 Context context) {
            this(context, (AttributeSet) null);
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f76636a = baseTransientBottomBar;
        }

        /* renamed from: c */
        public void mo91171c(ViewGroup viewGroup) {
            this.f76645x = true;
            viewGroup.addView(this);
            this.f76645x = false;
        }

        @C0359n0
        /* renamed from: d */
        public final Drawable mo91172d() {
            float dimension = getResources().getDimension(C31076a.C31082f.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C31266s.m125964o(this, C31076a.C31079c.colorSurface, C31076a.C31079c.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f76642g == null) {
                return C17549d.m80456r(gradientDrawable);
            }
            Drawable r = C17549d.m80456r(gradientDrawable);
            C17549d.m80453o(r, this.f76642g);
            return r;
        }

        /* renamed from: e */
        public final void mo91173e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f76644w = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f76639d;
        }

        public int getAnimationMode() {
            return this.f76637b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f76638c;
        }

        public int getMaxInlineActionWidth() {
            return this.f76641f;
        }

        public int getMaxWidth() {
            return this.f76640e;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f76636a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo91134P();
            }
            C18196h2.m82642v1(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f76636a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo91135Q();
            }
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f76636a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo91136R();
            }
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.f76640e > 0 && getMeasuredWidth() > (i3 = this.f76640e)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setAnimationMode(int i) {
            this.f76637b = i;
        }

        public void setBackground(@C0363p0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
            if (!(drawable == null || this.f76642g == null)) {
                drawable = C17549d.m80456r(drawable.mutate());
                C17549d.m80453o(drawable, this.f76642g);
                C17549d.m80454p(drawable, this.f76643v);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
            this.f76642g = colorStateList;
            if (getBackground() != null) {
                Drawable r = C17549d.m80456r(getBackground().mutate());
                C17549d.m80453o(r, colorStateList);
                C17549d.m80454p(r, this.f76643v);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
            this.f76643v = mode;
            if (getBackground() != null) {
                Drawable r = C17549d.m80456r(getBackground().mutate());
                C17549d.m80454p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f76645x && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                mo91173e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f76636a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.mo91158n0();
                }
            }
        }

        public void setOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f76635y;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(@C0359n0 Context context, AttributeSet attributeSet) {
            super(C31683a.m128455c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C31076a.C31091o.SnackbarLayout);
            int i = C31076a.C31091o.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                C18196h2.m82519N1(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f76637b = obtainStyledAttributes.getInt(C31076a.C31091o.SnackbarLayout_animationMode, 0);
            this.f76638c = obtainStyledAttributes.getFloat(C31076a.C31091o.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C31500c.m127363a(context2, obtainStyledAttributes, C31076a.C31091o.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C31432x.m127017l(obtainStyledAttributes.getInt(C31076a.C31091o.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f76639d = obtainStyledAttributes.getFloat(C31076a.C31091o.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f76640e = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.SnackbarLayout_android_maxWidth, -1);
            this.f76641f = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f76635y);
            setFocusable(true);
            if (getBackground() == null) {
                C18196h2.m82502I1(this, mo91172d());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C31573a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f76646a;

        public C31573a(int i) {
            this.f76646a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo91137S(this.f76646a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C31574b implements ValueAnimator.AnimatorUpdateListener {
        public C31574b() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f76617c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C31575c implements ValueAnimator.AnimatorUpdateListener {
        public C31575c() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f76617c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f76617c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C31576d extends AnimatorListenerAdapter {
        public C31576d() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo91138T();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f76618d.mo91240d(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public class C31577e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f76651a;

        /* renamed from: b */
        public final /* synthetic */ int f76652b;

        public C31577e(int i) {
            this.f76652b = i;
            this.f76651a = i;
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f76605G) {
                C18196h2.m82578f1(BaseTransientBottomBar.this.f76617c, intValue - this.f76651a);
            } else {
                BaseTransientBottomBar.this.f76617c.setTranslationY((float) intValue);
            }
            this.f76651a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C31578f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f76654a;

        public C31578f(int i) {
            this.f76654a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo91137S(this.f76654a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f76618d.mo91241f(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C31579g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f76656a = 0;

        public C31579g() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f76605G) {
                C18196h2.m82578f1(BaseTransientBottomBar.this.f76617c, intValue - this.f76656a);
            } else {
                BaseTransientBottomBar.this.f76617c.setTranslationY((float) intValue);
            }
            this.f76656a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C31580h implements Handler.Callback {
        public boolean handleMessage(@C0359n0 Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo91152h0();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo91128J(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    public class C31581i implements Runnable {
        public C31581i() {
        }

        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f76617c != null && baseTransientBottomBar.f76616b != null && (b = (BaseTransientBottomBar.this.mo91122D() - BaseTransientBottomBar.this.mo91126H()) + ((int) BaseTransientBottomBar.this.f76617c.getTranslationY())) < BaseTransientBottomBar.this.f76627m) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f76617c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    String unused = BaseTransientBottomBar.f76607I;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f76627m - b;
                BaseTransientBottomBar.this.f76617c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    public class C31582j implements C18414x1 {
        public C31582j() {
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo1193a(View view, @C0359n0 C18436z4 z4Var) {
            int unused = BaseTransientBottomBar.this.f76624j = z4Var.mo53146o();
            int unused2 = BaseTransientBottomBar.this.f76625k = z4Var.mo53147p();
            int unused3 = BaseTransientBottomBar.this.f76626l = z4Var.mo53148q();
            BaseTransientBottomBar.this.mo91158n0();
            return z4Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    public class C31583k extends C18019a {
        public C31583k() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52594a(1048576);
            l0Var.mo52617g1(true);
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo19939j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo91163t();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    public class C31584l implements C31599b.C31601b {
        public C31584l() {
        }

        /* renamed from: a */
        public void mo91202a() {
            Handler handler = BaseTransientBottomBar.f76602D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public void mo91203b(int i) {
            Handler handler = BaseTransientBottomBar.f76602D;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    public class C31585m implements Runnable {
        public C31585m() {
        }

        public void run() {
            BaseTransientBottomBar.this.mo91137S(3);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    public class C31586n implements SwipeDismissBehavior.C31144c {
        public C31586n() {
        }

        /* renamed from: a */
        public void mo88290a(int i) {
            if (i == 0) {
                C31599b.m128000c().mo91257l(BaseTransientBottomBar.this.f76633s);
            } else if (i == 1 || i == 2) {
                C31599b.m128000c().mo91256k(BaseTransientBottomBar.this.f76633s);
            }
        }

        /* renamed from: b */
        public void mo88291b(@C0359n0 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.mo91164u(0);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    public class C31587o implements Runnable {
        public C31587o() {
        }

        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f76617c;
            if (snackbarBaseLayout != null) {
                if (snackbarBaseLayout.getParent() != null) {
                    BaseTransientBottomBar.this.f76617c.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f76617c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.mo91154j0();
                } else {
                    BaseTransientBottomBar.this.mo91156l0();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    public class C31588p extends AnimatorListenerAdapter {
        public C31588p() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo91138T();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public static class C31589q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @C0359n0

        /* renamed from: a */
        public final WeakReference<BaseTransientBottomBar> f76666a;
        @C0359n0

        /* renamed from: b */
        public final WeakReference<View> f76667b;

        public C31589q(@C0359n0 BaseTransientBottomBar baseTransientBottomBar, @C0359n0 View view) {
            this.f76666a = new WeakReference<>(baseTransientBottomBar);
            this.f76667b = new WeakReference<>(view);
        }

        /* renamed from: a */
        public static C31589q m127952a(@C0359n0 BaseTransientBottomBar baseTransientBottomBar, @C0359n0 View view) {
            C31589q qVar = new C31589q(baseTransientBottomBar, view);
            if (C18196h2.m82521O0(view)) {
                C31432x.m127006a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        @C0363p0
        /* renamed from: b */
        public View mo91207b() {
            return this.f76667b.get();
        }

        /* renamed from: c */
        public void mo91208c() {
            if (this.f76667b.get() != null) {
                this.f76667b.get().removeOnAttachStateChangeListener(this);
                C31432x.m127018m(this.f76667b.get(), this);
            }
            this.f76667b.clear();
            this.f76666a.clear();
        }

        /* renamed from: d */
        public final boolean mo91209d() {
            if (this.f76666a.get() != null) {
                return false;
            }
            mo91208c();
            return true;
        }

        public void onGlobalLayout() {
            if (!mo91209d() && this.f76666a.get().f76622h) {
                this.f76666a.get().mo91139U();
            }
        }

        public void onViewAttachedToWindow(View view) {
            if (!mo91209d()) {
                C31432x.m127006a(view, this);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (!mo91209d()) {
                C31432x.m127018m(view, this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public @interface C31590r {
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static abstract class C31591s<B> {

        /* renamed from: a */
        public static final int f76668a = 0;

        /* renamed from: b */
        public static final int f76669b = 1;

        /* renamed from: c */
        public static final int f76670c = 2;

        /* renamed from: d */
        public static final int f76671d = 3;

        /* renamed from: e */
        public static final int f76672e = 4;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s$a */
        public @interface C31592a {
        }

        /* renamed from: a */
        public void mo91213a(B b, int i) {
        }

        /* renamed from: b */
        public void mo91214b(B b) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    public static class C31593t {

        /* renamed from: a */
        public C31599b.C31601b f76673a;

        public C31593t(@C0359n0 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo88286R(0.1f);
            swipeDismissBehavior.mo88283O(0.6f);
            swipeDismissBehavior.mo88287S(0);
        }

        /* renamed from: a */
        public boolean mo91215a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: b */
        public void mo91216b(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C31599b.m128000c().mo91257l(this.f76673a);
                }
            } else if (coordinatorLayout.mo51005G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C31599b.m128000c().mo91256k(this.f76673a);
            }
        }

        /* renamed from: c */
        public void mo91217c(@C0359n0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f76673a = baseTransientBottomBar.f76633s;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    public interface C31594u extends C31598a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0337f0(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    public @interface C31595v {
    }

    public BaseTransientBottomBar(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 C31598a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    /* renamed from: A */
    public int mo91119A() {
        return this.f76619e;
    }

    @C0359n0
    /* renamed from: B */
    public SwipeDismissBehavior<? extends View> mo91120B() {
        return new Behavior();
    }

    /* renamed from: C */
    public final ValueAnimator mo91121C(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C31093a.f74428d);
        ofFloat.addUpdateListener(new C31575c());
        return ofFloat;
    }

    @C0376v0(17)
    /* renamed from: D */
    public final int mo91122D() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f76616b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @C0347i0
    /* renamed from: E */
    public int mo91123E() {
        return mo91127I() ? C31076a.C31087k.mtrl_layout_snackbar : C31076a.C31087k.design_layout_snackbar;
    }

    /* renamed from: F */
    public final int mo91124F() {
        int height = this.f76617c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f76617c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    @C0359n0
    /* renamed from: G */
    public View mo91125G() {
        return this.f76617c;
    }

    /* renamed from: H */
    public final int mo91126H() {
        int[] iArr = new int[2];
        this.f76617c.getLocationOnScreen(iArr);
        return iArr[1] + this.f76617c.getHeight();
    }

    /* renamed from: I */
    public boolean mo91127I() {
        TypedArray obtainStyledAttributes = this.f76616b.obtainStyledAttributes(f76606H);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void mo91128J(int i) {
        if (!mo91149e0() || this.f76617c.getVisibility() != 0) {
            mo91137S(i);
        } else {
            mo91161r(i);
        }
    }

    /* renamed from: K */
    public boolean mo91129K() {
        return this.f76622h;
    }

    /* renamed from: L */
    public boolean mo91130L() {
        return this.f76620f;
    }

    /* renamed from: M */
    public boolean mo91131M() {
        return C31599b.m128000c().mo91250e(this.f76633s);
    }

    /* renamed from: N */
    public boolean mo91132N() {
        return C31599b.m128000c().mo91251f(this.f76633s);
    }

    /* renamed from: O */
    public final boolean mo91133O() {
        ViewGroup.LayoutParams layoutParams = this.f76617c.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C16981g) || !(((CoordinatorLayout.C16981g) layoutParams).mo51111f() instanceof SwipeDismissBehavior)) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public void mo91134P() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f76617c.getRootWindowInsets()) != null) {
            this.f76627m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            mo91158n0();
        }
    }

    /* renamed from: Q */
    public void mo91135Q() {
        if (mo91132N()) {
            f76602D.post(new C31585m());
        }
    }

    /* renamed from: R */
    public void mo91136R() {
        if (this.f76629o) {
            mo91153i0();
            this.f76629o = false;
        }
    }

    /* renamed from: S */
    public void mo91137S(int i) {
        C31599b.m128000c().mo91254i(this.f76633s);
        List<C31591s<B>> list = this.f76630p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f76630p.get(size).mo91213a(this, i);
            }
        }
        ViewParent parent = this.f76617c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f76617c);
        }
    }

    /* renamed from: T */
    public void mo91138T() {
        C31599b.m128000c().mo91255j(this.f76633s);
        List<C31591s<B>> list = this.f76630p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f76630p.get(size).mo91214b(this);
            }
        }
    }

    /* renamed from: U */
    public final void mo91139U() {
        this.f76628n = mo91162s();
        mo91158n0();
    }

    @C0359n0
    /* renamed from: V */
    public B mo91140V(@C0363p0 C31591s<B> sVar) {
        List<C31591s<B>> list;
        if (sVar == null || (list = this.f76630p) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public B mo91141W(@C0329d0 int i) {
        View findViewById = this.f76615a.findViewById(i);
        if (findViewById != null) {
            return mo91142X(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i);
    }

    @C0359n0
    /* renamed from: X */
    public B mo91142X(@C0363p0 View view) {
        C31589q qVar;
        C31589q qVar2 = this.f76621g;
        if (qVar2 != null) {
            qVar2.mo91208c();
        }
        if (view == null) {
            qVar = null;
        } else {
            qVar = C31589q.m127952a(this, view);
        }
        this.f76621g = qVar;
        return this;
    }

    /* renamed from: Y */
    public void mo91143Y(boolean z) {
        this.f76622h = z;
    }

    @C0359n0
    /* renamed from: Z */
    public B mo91144Z(int i) {
        this.f76617c.setAnimationMode(i);
        return this;
    }

    @C0359n0
    /* renamed from: a0 */
    public B mo91145a0(Behavior behavior) {
        this.f76631q = behavior;
        return this;
    }

    @C0359n0
    /* renamed from: b0 */
    public B mo91146b0(int i) {
        this.f76619e = i;
        return this;
    }

    @C0359n0
    /* renamed from: c0 */
    public B mo91147c0(boolean z) {
        this.f76620f = z;
        return this;
    }

    /* renamed from: d0 */
    public final void mo91148d0(CoordinatorLayout.C16981g gVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f76631q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo91120B();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).mo91170V(this);
        }
        swipeDismissBehavior.mo88284P(new C31586n());
        gVar.mo51122q(swipeDismissBehavior);
        if (mo91166w() == null) {
            gVar.f44901g = 80;
        }
    }

    /* renamed from: e0 */
    public boolean mo91149e0() {
        AccessibilityManager accessibilityManager = this.f76632r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final boolean mo91150f0() {
        return this.f76627m > 0 && !this.f76620f && mo91133O();
    }

    /* renamed from: g0 */
    public void mo91151g0() {
        C31599b.m128000c().mo91259n(mo91119A(), this.f76633s);
    }

    /* renamed from: h0 */
    public final void mo91152h0() {
        if (this.f76617c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f76617c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C16981g) {
                mo91148d0((CoordinatorLayout.C16981g) layoutParams);
            }
            this.f76617c.mo91171c(this.f76615a);
            mo91139U();
            this.f76617c.setVisibility(4);
        }
        if (C18196h2.m82539U0(this.f76617c)) {
            mo91153i0();
        } else {
            this.f76629o = true;
        }
    }

    /* renamed from: i0 */
    public final void mo91153i0() {
        if (mo91149e0()) {
            mo91160q();
            return;
        }
        if (this.f76617c.getParent() != null) {
            this.f76617c.setVisibility(0);
        }
        mo91138T();
    }

    /* renamed from: j0 */
    public final void mo91154j0() {
        ValueAnimator v = mo91165v(0.0f, 1.0f);
        ValueAnimator C = mo91121C(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{v, C});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C31588p());
        animatorSet.start();
    }

    /* renamed from: k0 */
    public final void mo91155k0(int i) {
        ValueAnimator v = mo91165v(1.0f, 0.0f);
        v.setDuration(75);
        v.addListener(new C31573a(i));
        v.start();
    }

    /* renamed from: l0 */
    public final void mo91156l0() {
        int F = mo91124F();
        if (f76605G) {
            C18196h2.m82578f1(this.f76617c, F);
        } else {
            this.f76617c.setTranslationY((float) F);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{F, 0});
        valueAnimator.setInterpolator(C31093a.f74426b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C31576d());
        valueAnimator.addUpdateListener(new C31577e(F));
        valueAnimator.start();
    }

    /* renamed from: m0 */
    public final void mo91157m0(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, mo91124F()});
        valueAnimator.setInterpolator(C31093a.f74426b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C31578f(i));
        valueAnimator.addUpdateListener(new C31579g());
        valueAnimator.start();
    }

    /* renamed from: n0 */
    public final void mo91158n0() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.f76617c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f76617c.f76644w != null && this.f76617c.getParent() != null) {
            if (mo91166w() != null) {
                i = this.f76628n;
            } else {
                i = this.f76624j;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f76617c.f76644w.bottom + i;
            marginLayoutParams.leftMargin = this.f76617c.f76644w.left + this.f76625k;
            marginLayoutParams.rightMargin = this.f76617c.f76644w.right + this.f76626l;
            marginLayoutParams.topMargin = this.f76617c.f76644w.top;
            this.f76617c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && mo91150f0()) {
                this.f76617c.removeCallbacks(this.f76623i);
                this.f76617c.post(this.f76623i);
            }
        }
    }

    @C0359n0
    /* renamed from: p */
    public B mo91159p(@C0363p0 C31591s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f76630p == null) {
            this.f76630p = new ArrayList();
        }
        this.f76630p.add(sVar);
        return this;
    }

    /* renamed from: q */
    public void mo91160q() {
        this.f76617c.post(new C31587o());
    }

    /* renamed from: r */
    public final void mo91161r(int i) {
        if (this.f76617c.getAnimationMode() == 1) {
            mo91155k0(i);
        } else {
            mo91157m0(i);
        }
    }

    /* renamed from: s */
    public final int mo91162s() {
        if (mo91166w() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        mo91166w().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f76615a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f76615a.getHeight()) - i;
    }

    /* renamed from: t */
    public void mo91163t() {
        mo91164u(3);
    }

    /* renamed from: u */
    public void mo91164u(int i) {
        C31599b.m128000c().mo91248b(this.f76633s, i);
    }

    /* renamed from: v */
    public final ValueAnimator mo91165v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C31093a.f74425a);
        ofFloat.addUpdateListener(new C31574b());
        return ofFloat;
    }

    @C0363p0
    /* renamed from: w */
    public View mo91166w() {
        C31589q qVar = this.f76621g;
        if (qVar == null) {
            return null;
        }
        return qVar.mo91207b();
    }

    /* renamed from: x */
    public int mo91167x() {
        return this.f76617c.getAnimationMode();
    }

    /* renamed from: y */
    public Behavior mo91168y() {
        return this.f76631q;
    }

    @C0359n0
    /* renamed from: z */
    public Context mo91169z() {
        return this.f76616b;
    }

    public BaseTransientBottomBar(@C0359n0 Context context, @C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 C31598a aVar) {
        this.f76622h = false;
        this.f76623i = new C31581i();
        this.f76633s = new C31584l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f76615a = viewGroup;
            this.f76618d = aVar;
            this.f76616b = context;
            C31422p.m126961a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(mo91123E(), viewGroup, false);
            this.f76617c = snackbarBaseLayout;
            snackbarBaseLayout.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.mo91238a(snackbarBaseLayout.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            }
            snackbarBaseLayout.addView(view);
            C18196h2.m82482D1(snackbarBaseLayout, 1);
            C18196h2.m82531R1(snackbarBaseLayout, 1);
            C18196h2.m82522O1(snackbarBaseLayout, true);
            C18196h2.m82559a2(snackbarBaseLayout, new C31582j());
            C18196h2.m82474B1(snackbarBaseLayout, new C31583k());
            this.f76632r = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }
}
