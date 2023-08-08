package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0372t0;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31500c;

/* renamed from: com.google.android.material.divider.a */
public class C31331a extends RecyclerView.C20075n {

    /* renamed from: i */
    public static final int f75515i = 0;

    /* renamed from: j */
    public static final int f75516j = 1;

    /* renamed from: k */
    public static final int f75517k = C31076a.C31090n.Widget_MaterialComponents_MaterialDivider;
    @C0359n0

    /* renamed from: a */
    public Drawable f75518a;

    /* renamed from: b */
    public int f75519b;
    @C0354l

    /* renamed from: c */
    public int f75520c;

    /* renamed from: d */
    public int f75521d;

    /* renamed from: e */
    public int f75522e;

    /* renamed from: f */
    public int f75523f;

    /* renamed from: g */
    public boolean f75524g;

    /* renamed from: h */
    public final Rect f75525h;

    public C31331a(@C0359n0 Context context, int i) {
        this(context, (AttributeSet) null, i);
    }

    /* renamed from: A */
    public void mo89526A(@C0359n0 Context context, @C0364q int i) {
        mo89543z(context.getResources().getDimensionPixelSize(i));
    }

    /* renamed from: B */
    public void mo89527B(boolean z) {
        this.f75524g = z;
    }

    /* renamed from: C */
    public void mo89528C(int i) {
        if (i == 0 || i == 1) {
            this.f75521d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: g */
    public void mo59102g(@C0359n0 Rect rect, @C0359n0 View view, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
        rect.set(0, 0, 0, 0);
        if (this.f75521d == 1) {
            rect.bottom = this.f75518a.getIntrinsicHeight() + this.f75519b;
        } else {
            rect.right = this.f75518a.getIntrinsicWidth() + this.f75519b;
        }
    }

    /* renamed from: i */
    public void mo59864i(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
        if (recyclerView.getLayoutManager() != null) {
            if (this.f75521d == 1) {
                mo89530m(canvas, recyclerView);
            } else {
                mo89529l(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public final void mo89529l(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int i3 = i2 + this.f75522e;
        int i4 = i - this.f75523f;
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getLayoutManager().mo59937f0(childAt, this.f75525h);
            int round = this.f75525h.right + Math.round(childAt.getTranslationX());
            this.f75518a.setBounds((round - this.f75518a.getIntrinsicWidth()) - this.f75519b, i3, round, i4);
            this.f75518a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo89530m(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        boolean z = true;
        if (C18196h2.m82553Z(recyclerView) != 1) {
            z = false;
        }
        if (z) {
            i3 = this.f75523f;
        } else {
            i3 = this.f75522e;
        }
        int i5 = i2 + i3;
        if (z) {
            i4 = this.f75522e;
        } else {
            i4 = this.f75523f;
        }
        int i6 = i - i4;
        int childCount = recyclerView.getChildCount();
        if (!this.f75524g) {
            childCount--;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.mo59653v0(childAt, this.f75525h);
            int round = this.f75525h.bottom + Math.round(childAt.getTranslationY());
            this.f75518a.setBounds(i5, (round - this.f75518a.getIntrinsicHeight()) - this.f75519b, i6, round);
            this.f75518a.draw(canvas);
        }
        canvas.restore();
    }

    @C0354l
    /* renamed from: n */
    public int mo89531n() {
        return this.f75520c;
    }

    @C0372t0
    /* renamed from: o */
    public int mo89532o() {
        return this.f75523f;
    }

    @C0372t0
    /* renamed from: p */
    public int mo89533p() {
        return this.f75522e;
    }

    @C0372t0
    /* renamed from: q */
    public int mo89534q() {
        return this.f75519b;
    }

    /* renamed from: r */
    public int mo89535r() {
        return this.f75521d;
    }

    /* renamed from: s */
    public boolean mo89536s() {
        return this.f75524g;
    }

    /* renamed from: t */
    public void mo89537t(@C0354l int i) {
        this.f75520c = i;
        Drawable r = C17549d.m80456r(this.f75518a);
        this.f75518a = r;
        C17549d.m80452n(r, i);
    }

    /* renamed from: u */
    public void mo89538u(@C0359n0 Context context, @C0358n int i) {
        mo89537t(C17318d.m79723f(context, i));
    }

    /* renamed from: v */
    public void mo89539v(@C0372t0 int i) {
        this.f75523f = i;
    }

    /* renamed from: w */
    public void mo89540w(@C0359n0 Context context, @C0364q int i) {
        mo89539v(context.getResources().getDimensionPixelOffset(i));
    }

    /* renamed from: x */
    public void mo89541x(@C0372t0 int i) {
        this.f75522e = i;
    }

    /* renamed from: y */
    public void mo89542y(@C0359n0 Context context, @C0364q int i) {
        mo89541x(context.getResources().getDimensionPixelOffset(i));
    }

    /* renamed from: z */
    public void mo89543z(@C0372t0 int i) {
        this.f75519b = i;
    }

    public C31331a(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, C31076a.C31079c.materialDividerStyle, i);
    }

    public C31331a(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        this.f75525h = new Rect();
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.MaterialDivider, i, f75517k, new int[0]);
        this.f75520c = C31500c.m127363a(context, j, C31076a.C31091o.MaterialDivider_dividerColor).getDefaultColor();
        this.f75519b = j.getDimensionPixelSize(C31076a.C31091o.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C31076a.C31082f.material_divider_thickness));
        this.f75522e = j.getDimensionPixelOffset(C31076a.C31091o.MaterialDivider_dividerInsetStart, 0);
        this.f75523f = j.getDimensionPixelOffset(C31076a.C31091o.MaterialDivider_dividerInsetEnd, 0);
        this.f75524g = j.getBoolean(C31076a.C31091o.MaterialDivider_lastItemDecorated, true);
        j.recycle();
        this.f75518a = new ShapeDrawable();
        mo89537t(this.f75520c);
        mo89528C(i2);
    }
}
