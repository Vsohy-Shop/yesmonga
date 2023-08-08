package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C18306m0;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {
    @C0363p0

    /* renamed from: T0 */
    public Drawable f75755T0;

    /* renamed from: U0 */
    public final Rect f75756U0;

    /* renamed from: V0 */
    public final Rect f75757V0;

    /* renamed from: W0 */
    public int f75758W0;

    /* renamed from: X0 */
    public boolean f75759X0;

    /* renamed from: Y0 */
    public boolean f75760Y0;

    public ForegroundLinearLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public void draw(@C0359n0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f75755T0;
        if (drawable != null) {
            if (this.f75760Y0) {
                this.f75760Y0 = false;
                Rect rect = this.f75756U0;
                Rect rect2 = this.f75757V0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f75759X0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f75758W0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    @C0376v0(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f75755T0;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f75755T0;
        if (drawable != null && drawable.isStateful()) {
            this.f75755T0.setState(getDrawableState());
        }
    }

    @C0363p0
    public Drawable getForeground() {
        return this.f75755T0;
    }

    public int getForegroundGravity() {
        return this.f75758W0;
    }

    @C0376v0(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f75755T0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f75760Y0 = z | this.f75760Y0;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f75760Y0 = true;
    }

    public void setForeground(@C0363p0 Drawable drawable) {
        Drawable drawable2 = this.f75755T0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f75755T0);
            }
            this.f75755T0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f75758W0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f75758W0 != i) {
            if ((8388615 & i) == 0) {
                i |= C18306m0.f46960b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f75758W0 = i;
            if (i == 119 && this.f75755T0 != null) {
                this.f75755T0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f75755T0;
    }

    public ForegroundLinearLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75756U0 = new Rect();
        this.f75757V0 = new Rect();
        this.f75758W0 = 119;
        this.f75759X0 = true;
        this.f75760Y0 = false;
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.ForegroundLinearLayout, i, 0, new int[0]);
        this.f75758W0 = j.getInt(C31076a.C31091o.ForegroundLinearLayout_android_foregroundGravity, this.f75758W0);
        Drawable drawable = j.getDrawable(C31076a.C31091o.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f75759X0 = j.getBoolean(C31076a.C31091o.ForegroundLinearLayout_foregroundInsidePadding, true);
        j.recycle();
    }
}
