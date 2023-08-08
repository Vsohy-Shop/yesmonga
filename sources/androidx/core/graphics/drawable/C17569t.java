package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.graphics.drawable.t */
public class C17569t extends Drawable implements Drawable.Callback, C17568s, C17567r {

    /* renamed from: g */
    public static final PorterDuff.Mode f45921g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f45922a;

    /* renamed from: b */
    public PorterDuff.Mode f45923b;

    /* renamed from: c */
    public boolean f45924c;

    /* renamed from: d */
    public C17571v f45925d;

    /* renamed from: e */
    public boolean f45926e;

    /* renamed from: f */
    public Drawable f45927f;

    public C17569t(@C0359n0 C17571v vVar, @C0363p0 Resources resources) {
        this.f45925d = vVar;
        mo51988e(resources);
    }

    /* renamed from: a */
    public final Drawable mo51983a() {
        return this.f45927f;
    }

    /* renamed from: b */
    public final void mo51984b(Drawable drawable) {
        Drawable drawable2 = this.f45927f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f45927f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C17571v vVar = this.f45925d;
            if (vVar != null) {
                vVar.f45931b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo51985c() {
        return true;
    }

    @C0359n0
    /* renamed from: d */
    public final C17571v mo51986d() {
        return new C17571v(this.f45925d);
    }

    public void draw(@C0359n0 Canvas canvas) {
        this.f45927f.draw(canvas);
    }

    /* renamed from: e */
    public final void mo51988e(@C0363p0 Resources resources) {
        Drawable.ConstantState constantState;
        C17571v vVar = this.f45925d;
        if (vVar != null && (constantState = vVar.f45931b) != null) {
            mo51984b(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    public final boolean mo51989f(int[] iArr) {
        if (!mo51985c()) {
            return false;
        }
        C17571v vVar = this.f45925d;
        ColorStateList colorStateList = vVar.f45932c;
        PorterDuff.Mode mode = vVar.f45933d;
        if (colorStateList == null || mode == null) {
            this.f45924c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f45924c && colorForState == this.f45922a && mode == this.f45923b)) {
                setColorFilter(colorForState, mode);
                this.f45922a = colorForState;
                this.f45923b = mode;
                this.f45924c = true;
                return true;
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C17571v vVar = this.f45925d;
        if (vVar != null) {
            i = vVar.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f45927f.getChangingConfigurations();
    }

    @C0363p0
    public Drawable.ConstantState getConstantState() {
        C17571v vVar = this.f45925d;
        if (vVar == null || !vVar.mo52026a()) {
            return null;
        }
        this.f45925d.f45930a = getChangingConfigurations();
        return this.f45925d;
    }

    @C0359n0
    public Drawable getCurrent() {
        return this.f45927f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f45927f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f45927f.getIntrinsicWidth();
    }

    @C0376v0(23)
    public int getLayoutDirection() {
        return C17549d.m80444f(this.f45927f);
    }

    public int getMinimumHeight() {
        return this.f45927f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f45927f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f45927f.getOpacity();
    }

    public boolean getPadding(@C0359n0 Rect rect) {
        return this.f45927f.getPadding(rect);
    }

    @C0359n0
    public int[] getState() {
        return this.f45927f.getState();
    }

    public Region getTransparentRegion() {
        return this.f45927f.getTransparentRegion();
    }

    public void invalidateDrawable(@C0359n0 Drawable drawable) {
        invalidateSelf();
    }

    @C0376v0(19)
    public boolean isAutoMirrored() {
        return C17549d.m80446h(this.f45927f);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        C17571v vVar;
        if (!mo51985c() || (vVar = this.f45925d) == null) {
            colorStateList = null;
        } else {
            colorStateList = vVar.f45932c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f45927f.isStateful()) {
            return false;
        }
        return true;
    }

    public void jumpToCurrentState() {
        this.f45927f.jumpToCurrentState();
    }

    @C0359n0
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f45926e && super.mutate() == this) {
            this.f45925d = mo51986d();
            Drawable drawable = this.f45927f;
            if (drawable != null) {
                drawable.mutate();
            }
            C17571v vVar = this.f45925d;
            if (vVar != null) {
                Drawable drawable2 = this.f45927f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                vVar.f45931b = constantState;
            }
            this.f45926e = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45927f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @C0376v0(23)
    public boolean onLayoutDirectionChanged(int i) {
        return C17549d.m80451m(this.f45927f, i);
    }

    public boolean onLevelChange(int i) {
        return this.f45927f.setLevel(i);
    }

    public void scheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f45927f.setAlpha(i);
    }

    @C0376v0(19)
    public void setAutoMirrored(boolean z) {
        C17549d.m80448j(this.f45927f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f45927f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f45927f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f45927f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f45927f.setFilterBitmap(z);
    }

    public boolean setState(@C0359n0 int[] iArr) {
        boolean state = this.f45927f.setState(iArr);
        if (mo51989f(iArr) || state) {
            return true;
        }
        return false;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f45925d.f45932c = colorStateList;
        mo51989f(getState());
    }

    public void setTintMode(@C0359n0 PorterDuff.Mode mode) {
        this.f45925d.f45933d = mode;
        mo51989f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f45927f.setVisible(z, z2);
    }

    public void unscheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C17569t(@C0363p0 Drawable drawable) {
        this.f45925d = mo51986d();
        mo51984b(drawable);
    }
}
