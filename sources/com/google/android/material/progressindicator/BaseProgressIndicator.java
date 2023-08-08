package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31422p;
import com.google.android.material.progressindicator.C31471b;
import com.google.android.material.theme.overlay.C31683a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public abstract class BaseProgressIndicator<S extends C31471b> extends ProgressBar {

    /* renamed from: G0 */
    public static final int f76116G0 = 0;

    /* renamed from: H0 */
    public static final int f76117H0 = 1;

    /* renamed from: I0 */
    public static final int f76118I0 = 2;

    /* renamed from: J0 */
    public static final int f76119J0 = 0;

    /* renamed from: K0 */
    public static final int f76120K0 = 1;

    /* renamed from: L0 */
    public static final int f76121L0 = 2;

    /* renamed from: M0 */
    public static final int f76122M0 = C31076a.C31090n.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: N0 */
    public static final float f76123N0 = 0.2f;

    /* renamed from: O0 */
    public static final int f76124O0 = 255;

    /* renamed from: P0 */
    public static final int f76125P0 = 1000;

    /* renamed from: E0 */
    public final C20715b.C20716a f76126E0 = new C31463c();

    /* renamed from: F0 */
    public final C20715b.C20716a f76127F0 = new C31464d();

    /* renamed from: a */
    public S f76128a;

    /* renamed from: b */
    public int f76129b;

    /* renamed from: c */
    public boolean f76130c;

    /* renamed from: d */
    public boolean f76131d;

    /* renamed from: e */
    public final int f76132e;

    /* renamed from: f */
    public final int f76133f;

    /* renamed from: g */
    public long f76134g = -1;

    /* renamed from: v */
    public C31470a f76135v;

    /* renamed from: w */
    public boolean f76136w = false;

    /* renamed from: x */
    public int f76137x = 4;

    /* renamed from: y */
    public final Runnable f76138y = new C31461a();

    /* renamed from: z */
    public final Runnable f76139z = new C31462b();

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    public class C31461a implements Runnable {
        public C31461a() {
        }

        public void run() {
            BaseProgressIndicator.this.mo90479l();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    public class C31462b implements Runnable {
        public C31462b() {
        }

        public void run() {
            BaseProgressIndicator.this.mo90478k();
            long unused = BaseProgressIndicator.this.f76134g = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    public class C31463c extends C20715b.C20716a {
        public C31463c() {
        }

        /* renamed from: b */
        public void mo61953b(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f76129b, BaseProgressIndicator.this.f76130c);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    public class C31464d extends C20715b.C20716a {
        public C31464d() {
        }

        /* renamed from: b */
        public void mo61953b(Drawable drawable) {
            super.mo61953b(drawable);
            if (!BaseProgressIndicator.this.f76136w) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f76137x);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$e */
    public @interface C31465e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$f */
    public @interface C31466f {
    }

    public BaseProgressIndicator(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(C31683a.m128455c(context, attributeSet, i, f76122M0), attributeSet, i);
        Context context2 = getContext();
        this.f76128a = mo90475i(context2, attributeSet);
        TypedArray j = C31422p.m126970j(context2, attributeSet, C31076a.C31091o.BaseProgressIndicator, i, i2, new int[0]);
        this.f76132e = j.getInt(C31076a.C31091o.BaseProgressIndicator_showDelay, -1);
        this.f76133f = Math.min(j.getInt(C31076a.C31091o.BaseProgressIndicator_minHideDelay, -1), 1000);
        j.recycle();
        this.f76135v = new C31470a();
        this.f76131d = true;
    }

    @C0363p0
    private C31485h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo90609A();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo90560C();
        }
    }

    @C0363p0
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f76128a.f76160f;
    }

    @C0359n0
    public int[] getIndicatorColor() {
        return this.f76128a.f76157c;
    }

    public int getShowAnimationBehavior() {
        return this.f76128a.f76159e;
    }

    @C0354l
    public int getTrackColor() {
        return this.f76128a.f76158d;
    }

    @C0372t0
    public int getTrackCornerRadius() {
        return this.f76128a.f76156b;
    }

    @C0372t0
    public int getTrackThickness() {
        return this.f76128a.f76155a;
    }

    /* renamed from: h */
    public void mo90474h(boolean z) {
        if (this.f76131d) {
            ((C31481g) getCurrentDrawable()).mo90582v(mo90491r(), false, z);
        }
    }

    /* renamed from: i */
    public abstract S mo90475i(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: j */
    public void mo90477j() {
        boolean z;
        if (getVisibility() != 0) {
            removeCallbacks(this.f76138y);
            return;
        }
        removeCallbacks(this.f76139z);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f76134g;
        int i = this.f76133f;
        if (uptimeMillis >= ((long) i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f76139z.run();
        } else {
            postDelayed(this.f76139z, ((long) i) - uptimeMillis);
        }
    }

    /* renamed from: k */
    public final void mo90478k() {
        ((C31481g) getCurrentDrawable()).mo90582v(false, false, true);
        if (mo90481n()) {
            setVisibility(4);
        }
    }

    /* renamed from: l */
    public final void mo90479l() {
        if (this.f76133f > 0) {
            this.f76134g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    public boolean mo90480m() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo90481n() {
        if ((getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible())) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo90482o() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo90615z().mo90538d(this.f76126E0);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo61949b(this.f76127F0);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo61949b(this.f76127F0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo90482o();
        if (mo90491r()) {
            mo90479l();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f76139z);
        removeCallbacks(this.f76138y);
        ((C31481g) getCurrentDrawable()).mo90573l();
        mo90490q();
        super.onDetachedFromWindow();
    }

    public synchronized void onDraw(@C0359n0 Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C31485h currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo90533e();
            int d = currentDrawingDelegate.mo90532d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public void onVisibilityChanged(@C0359n0 View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo90474h(z);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo90474h(false);
    }

    /* renamed from: p */
    public void mo90489p() {
        if (this.f76132e > 0) {
            removeCallbacks(this.f76138y);
            postDelayed(this.f76138y, (long) this.f76132e);
            return;
        }
        this.f76138y.run();
    }

    /* renamed from: q */
    public final void mo90490q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo61951d(this.f76127F0);
            getIndeterminateDrawable().mo90615z().mo90541h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo61951d(this.f76127F0);
        }
    }

    /* renamed from: r */
    public boolean mo90491r() {
        if (!C18196h2.m82521O0(this) || getWindowVisibility() != 0 || !mo90480m()) {
            return false;
        }
        return true;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAnimatorDurationScaleProvider(@C0359n0 C31470a aVar) {
        this.f76135v = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f76207c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f76207c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f76128a.f76160f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            C31481g gVar = (C31481g) getCurrentDrawable();
            if (gVar != null) {
                gVar.mo90573l();
            }
            super.setIndeterminate(z);
            C31481g gVar2 = (C31481g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.mo90582v(mo90491r(), false, false);
            }
            if ((gVar2 instanceof C31487j) && mo90491r()) {
                ((C31487j) gVar2).mo90615z().mo90540g();
            }
            this.f76136w = false;
        }
    }

    public void setIndeterminateDrawable(@C0363p0 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof C31487j) {
            ((C31481g) drawable).mo90573l();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@C0354l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C31266s.m125951b(getContext(), C31076a.C31079c.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f76128a.f76157c = iArr;
            getIndeterminateDrawable().mo90615z().mo90537c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            setProgressCompat(i, false);
        }
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f76129b = i;
            this.f76130c = z;
            this.f76136w = true;
            if (!getIndeterminateDrawable().isVisible() || this.f76135v.mo90523a(getContext().getContentResolver()) == 0.0f) {
                this.f76126E0.mo61953b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo90615z().mo90539f();
            }
        }
    }

    public void setProgressDrawable(@C0363p0 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof C31479f) {
            C31479f fVar = (C31479f) drawable;
            fVar.mo90573l();
            super.setProgressDrawable(fVar);
            fVar.mo90565H(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f76128a.f76159e = i;
        invalidate();
    }

    public void setTrackColor(@C0354l int i) {
        S s = this.f76128a;
        if (s.f76158d != i) {
            s.f76158d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@C0372t0 int i) {
        S s = this.f76128a;
        if (s.f76156b != i) {
            s.f76156b = Math.min(i, s.f76155a / 2);
        }
    }

    public void setTrackThickness(@C0372t0 int i) {
        S s = this.f76128a;
        if (s.f76155a != i) {
            s.f76155a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f76137x = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    @C0363p0
    public C31487j<S> getIndeterminateDrawable() {
        return (C31487j) super.getIndeterminateDrawable();
    }

    @C0363p0
    public C31479f<S> getProgressDrawable() {
        return (C31479f) super.getProgressDrawable();
    }
}
