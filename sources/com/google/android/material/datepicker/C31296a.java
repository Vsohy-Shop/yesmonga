package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.resources.C31500c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;

/* renamed from: com.google.android.material.datepicker.a */
public final class C31296a {
    @C0359n0

    /* renamed from: a */
    public final Rect f75377a;

    /* renamed from: b */
    public final ColorStateList f75378b;

    /* renamed from: c */
    public final ColorStateList f75379c;

    /* renamed from: d */
    public final ColorStateList f75380d;

    /* renamed from: e */
    public final int f75381e;

    /* renamed from: f */
    public final C31534o f75382f;

    public C31296a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C31534o oVar, @C0359n0 Rect rect) {
        C18001r.m81772i(rect.left);
        C18001r.m81772i(rect.top);
        C18001r.m81772i(rect.right);
        C18001r.m81772i(rect.bottom);
        this.f75377a = rect;
        this.f75378b = colorStateList2;
        this.f75379c = colorStateList;
        this.f75380d = colorStateList3;
        this.f75381e = i;
        this.f75382f = oVar;
    }

    @C0359n0
    /* renamed from: a */
    public static C31296a m126131a(@C0359n0 Context context, @C0327c1 int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81765b(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C31076a.C31091o.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C31076a.C31091o.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C31076a.C31091o.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C31076a.C31091o.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C31076a.C31091o.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.MaterialCalendarItem_itemStrokeWidth, 0);
        C31534o m = C31534o.m127562b(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo90843m();
        obtainStyledAttributes.recycle();
        return new C31296a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* renamed from: b */
    public int mo89379b() {
        return this.f75377a.bottom;
    }

    /* renamed from: c */
    public int mo89380c() {
        return this.f75377a.left;
    }

    /* renamed from: d */
    public int mo89381d() {
        return this.f75377a.right;
    }

    /* renamed from: e */
    public int mo89382e() {
        return this.f75377a.top;
    }

    /* renamed from: f */
    public void mo89383f(@C0359n0 TextView textView) {
        C31525j jVar = new C31525j();
        C31525j jVar2 = new C31525j();
        jVar.setShapeAppearanceModel(this.f75382f);
        jVar2.setShapeAppearanceModel(this.f75382f);
        jVar.mo90777o0(this.f75379c);
        jVar.mo90719E0((float) this.f75381e, this.f75380d);
        textView.setTextColor(this.f75378b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f75378b.withAlpha(30), jVar, jVar2);
        Rect rect = this.f75377a;
        C18196h2.m82502I1(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
