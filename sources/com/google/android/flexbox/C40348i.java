package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.google.android.flexbox.i */
public class C40348i extends RecyclerView.C20075n {

    /* renamed from: c */
    public static final int f102853c = 1;

    /* renamed from: d */
    public static final int f102854d = 2;

    /* renamed from: e */
    public static final int f102855e = 3;

    /* renamed from: f */
    public static final int[] f102856f = {16843284};

    /* renamed from: a */
    public Drawable f102857a;

    /* renamed from: b */
    public int f102858b;

    public C40348i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f102856f);
        this.f102857a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        mo133241t(3);
    }

    /* renamed from: g */
    public void mo59102g(@C0359n0 Rect rect, @C0359n0 View view, RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
        int p0 = recyclerView.mo59608p0(view);
        if (p0 != 0) {
            if (mo133236o() || mo133237p()) {
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
                List<C40342f> flexLines = flexboxLayoutManager.getFlexLines();
                mo133240s(rect, p0, flexboxLayoutManager, flexLines, flexboxLayoutManager.getFlexDirection());
                mo133239r(rect, p0, flexboxLayoutManager, flexLines);
                return;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: i */
    public void mo59864i(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
        mo133233l(canvas, recyclerView);
        mo133234m(canvas, recyclerView);
    }

    /* renamed from: l */
    public final void mo133233l(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (mo133236o()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = recyclerView.getChildAt(i8);
                RecyclerView.C20081p pVar = (RecyclerView.C20081p) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    i2 = childAt.getBottom() + pVar.bottomMargin;
                    i = this.f102857a.getIntrinsicHeight() + i2;
                } else {
                    i = childAt.getTop() - pVar.topMargin;
                    i2 = i - this.f102857a.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.mo133051l()) {
                    i5 = childAt.getLeft() - pVar.leftMargin;
                    i7 = childAt.getRight();
                    i6 = pVar.rightMargin;
                } else if (flexboxLayoutManager.mo133109V2()) {
                    i3 = Math.min(childAt.getRight() + pVar.rightMargin + this.f102857a.getIntrinsicWidth(), right);
                    i4 = childAt.getLeft() - pVar.leftMargin;
                    this.f102857a.setBounds(i4, i2, i3, i);
                    this.f102857a.draw(canvas);
                } else {
                    i5 = Math.max((childAt.getLeft() - pVar.leftMargin) - this.f102857a.getIntrinsicWidth(), left);
                    i7 = childAt.getRight();
                    i6 = pVar.rightMargin;
                }
                int i9 = i5;
                i3 = i7 + i6;
                i4 = i9;
                this.f102857a.setBounds(i4, i2, i3, i);
                this.f102857a.draw(canvas);
            }
        }
    }

    /* renamed from: m */
    public final void mo133234m(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        int bottom;
        int i5;
        if (mo133237p()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = recyclerView.getChildAt(i6);
                RecyclerView.C20081p pVar = (RecyclerView.C20081p) childAt.getLayoutParams();
                if (flexboxLayoutManager.mo133109V2()) {
                    i2 = childAt.getRight() + pVar.rightMargin;
                    i = this.f102857a.getIntrinsicWidth() + i2;
                } else {
                    i = childAt.getLeft() - pVar.leftMargin;
                    i2 = i - this.f102857a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.mo133051l()) {
                    i3 = childAt.getTop() - pVar.topMargin;
                    bottom = childAt.getBottom();
                    i5 = pVar.bottomMargin;
                } else if (flexDirection == 3) {
                    int min = Math.min(childAt.getBottom() + pVar.bottomMargin + this.f102857a.getIntrinsicHeight(), bottom2);
                    i3 = childAt.getTop() - pVar.topMargin;
                    i4 = min;
                    this.f102857a.setBounds(i2, i3, i, i4);
                    this.f102857a.draw(canvas);
                } else {
                    i3 = Math.max((childAt.getTop() - pVar.topMargin) - this.f102857a.getIntrinsicHeight(), top);
                    bottom = childAt.getBottom();
                    i5 = pVar.bottomMargin;
                }
                i4 = bottom + i5;
                this.f102857a.setBounds(i2, i3, i, i4);
                this.f102857a.draw(canvas);
            }
        }
    }

    /* renamed from: n */
    public final boolean mo133235n(int i, List<C40342f> list, FlexboxLayoutManager flexboxLayoutManager) {
        int R2 = flexboxLayoutManager.mo133105R2(i);
        if ((R2 != -1 && R2 < flexboxLayoutManager.getFlexLinesInternal().size() && flexboxLayoutManager.getFlexLinesInternal().get(R2).f102834o == i) || i == 0) {
            return true;
        }
        if (list.size() == 0) {
            return false;
        }
        if (list.get(list.size() - 1).f102835p == i - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo133236o() {
        return (this.f102858b & 1) > 0;
    }

    /* renamed from: p */
    public final boolean mo133237p() {
        return (this.f102858b & 2) > 0;
    }

    /* renamed from: q */
    public void mo133238q(Drawable drawable) {
        if (drawable != null) {
            this.f102857a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: r */
    public final void mo133239r(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C40342f> list) {
        if (list.size() != 0 && flexboxLayoutManager.mo133105R2(i) != 0) {
            if (flexboxLayoutManager.mo133051l()) {
                if (!mo133236o()) {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
                rect.top = this.f102857a.getIntrinsicHeight();
                rect.bottom = 0;
            } else if (mo133237p()) {
                if (flexboxLayoutManager.mo133109V2()) {
                    rect.right = this.f102857a.getIntrinsicWidth();
                    rect.left = 0;
                    return;
                }
                rect.left = this.f102857a.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    /* renamed from: s */
    public final void mo133240s(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C40342f> list, int i2) {
        if (!mo133235n(i, list, flexboxLayoutManager)) {
            if (flexboxLayoutManager.mo133051l()) {
                if (!mo133237p()) {
                    rect.left = 0;
                    rect.right = 0;
                } else if (flexboxLayoutManager.mo133109V2()) {
                    rect.right = this.f102857a.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.f102857a.getIntrinsicWidth();
                    rect.right = 0;
                }
            } else if (!mo133236o()) {
                rect.top = 0;
                rect.bottom = 0;
            } else if (i2 == 3) {
                rect.bottom = this.f102857a.getIntrinsicHeight();
                rect.top = 0;
            } else {
                rect.top = this.f102857a.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
    }

    /* renamed from: t */
    public void mo133241t(int i) {
        this.f102858b = i;
    }
}
