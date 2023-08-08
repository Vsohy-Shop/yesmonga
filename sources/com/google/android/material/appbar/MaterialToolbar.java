package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31423q;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31530k;

public class MaterialToolbar extends Toolbar {

    /* renamed from: s1 */
    public static final int f74563s1 = C31076a.C31090n.Widget_MaterialComponents_Toolbar;

    /* renamed from: t1 */
    public static final ImageView.ScaleType[] f74564t1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    @C0363p0

    /* renamed from: n1 */
    public Integer f74565n1;

    /* renamed from: o1 */
    public boolean f74566o1;

    /* renamed from: p1 */
    public boolean f74567p1;
    @C0363p0

    /* renamed from: q1 */
    public ImageView.ScaleType f74568q1;
    @C0363p0

    /* renamed from: r1 */
    public Boolean f74569r1;

    public MaterialToolbar(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: T */
    public final Pair<Integer, Integer> mo88115T(@C0363p0 TextView textView, @C0363p0 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: U */
    public final void mo88116U(Context context) {
        int i;
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C31525j jVar = new C31525j();
            if (background != null) {
                i = ((ColorDrawable) background).getColor();
            } else {
                i = 0;
            }
            jVar.mo90777o0(ColorStateList.valueOf(i));
            jVar.mo90750Z(context);
            jVar.mo90775n0(C18196h2.m82529R(this));
            C18196h2.m82502I1(this, jVar);
        }
    }

    /* renamed from: V */
    public boolean mo88117V() {
        Boolean bool = this.f74569r1;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: W */
    public boolean mo88118W() {
        return this.f74567p1;
    }

    /* renamed from: X */
    public boolean mo88119X() {
        return this.f74566o1;
    }

    /* renamed from: Y */
    public final void mo88120Y(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: Z */
    public final void mo88121Z() {
        if (this.f74566o1 || this.f74567p1) {
            TextView i = C31423q.m126980i(this);
            TextView g = C31423q.m126978g(this);
            if (i != null || g != null) {
                Pair<Integer, Integer> T = mo88115T(i, g);
                if (this.f74566o1 && i != null) {
                    mo88120Y(i, T);
                }
                if (this.f74567p1 && g != null) {
                    mo88120Y(g, T);
                }
            }
        }
    }

    @C0363p0
    /* renamed from: a0 */
    public final Drawable mo88122a0(@C0363p0 Drawable drawable) {
        if (drawable == null || this.f74565n1 == null) {
            return drawable;
        }
        Drawable r = C17549d.m80456r(drawable.mutate());
        C17549d.m80452n(r, this.f74565n1.intValue());
        return r;
    }

    /* renamed from: b0 */
    public final void mo88123b0() {
        ImageView d = C31423q.m126975d(this);
        if (d != null) {
            Boolean bool = this.f74569r1;
            if (bool != null) {
                d.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f74568q1;
            if (scaleType != null) {
                d.setScaleType(scaleType);
            }
        }
    }

    @C0363p0
    public ImageView.ScaleType getLogoScaleType() {
        return this.f74568q1;
    }

    @C0363p0
    @C0354l
    public Integer getNavigationIconTint() {
        return this.f74565n1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127554e(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo88121Z();
        mo88123b0();
    }

    @C0376v0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C31530k.m127553d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f74569r1;
        if (bool == null || bool.booleanValue() != z) {
            this.f74569r1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@C0359n0 ImageView.ScaleType scaleType) {
        if (this.f74568q1 != scaleType) {
            this.f74568q1 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(@C0363p0 Drawable drawable) {
        super.setNavigationIcon(mo88122a0(drawable));
    }

    public void setNavigationIconTint(@C0354l int i) {
        this.f74565n1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f74567p1 != z) {
            this.f74567p1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f74566o1 != z) {
            this.f74566o1 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(@androidx.annotation.C0359n0 android.content.Context r8, @androidx.annotation.C0363p0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f74563s1
            android.content.Context r8 = com.google.android.material.theme.overlay.C31683a.m128455c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C31076a.C31091o.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = com.google.android.material.C31076a.C31091o.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f74566o1 = r10
            int r10 = com.google.android.material.C31076a.C31091o.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f74567p1 = r10
            int r10 = com.google.android.material.C31076a.C31091o.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f74564t1
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f74568q1 = r10
        L_0x004a:
            int r10 = com.google.android.material.C31076a.C31091o.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f74569r1 = r10
        L_0x005c:
            r9.recycle()
            r7.mo88116U(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
