package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.C18353r0;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    public int f75751a;

    /* renamed from: b */
    public int f75752b;

    /* renamed from: c */
    public boolean f75753c;

    /* renamed from: d */
    public int f75754d;

    public FlowLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static int m126702a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: b */
    public int mo89918b(@C0359n0 View view) {
        Object tag = view.getTag(C31076a.C31084h.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo88917c() {
        return this.f75753c;
    }

    /* renamed from: d */
    public final void mo89919d(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C31076a.C31091o.FlowLayout, 0, 0);
        this.f75751a = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.FlowLayout_lineSpacing, 0);
        this.f75752b = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f75752b;
    }

    public int getLineSpacing() {
        return this.f75751a;
    }

    public int getRowCount() {
        return this.f75754d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() == 0) {
            this.f75754d = 0;
            return;
        }
        this.f75754d = 1;
        if (C18196h2.m82553Z(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (z2) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i9 = (i3 - i) - i6;
        int i10 = i5;
        int i11 = paddingTop;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C31076a.C31084h.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = C18353r0.m83082c(marginLayoutParams);
                    i8 = C18353r0.m83081b(marginLayoutParams);
                } else {
                    i8 = 0;
                    i7 = 0;
                }
                int measuredWidth = i10 + i7 + childAt.getMeasuredWidth();
                if (!this.f75753c && measuredWidth > i9) {
                    i11 = this.f75751a + paddingTop;
                    this.f75754d++;
                    i10 = i5;
                }
                childAt.setTag(C31076a.C31084h.row_index_key, Integer.valueOf(this.f75754d - 1));
                int i13 = i10 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (z2) {
                    childAt.layout(i9 - measuredWidth2, i11, (i9 - i10) - i7, measuredHeight);
                } else {
                    childAt.layout(i13, i11, measuredWidth2, measuredHeight);
                }
                i10 += i7 + i8 + childAt.getMeasuredWidth() + this.f75752b;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i5 + childAt.getMeasuredWidth() <= paddingRight || mo88917c()) {
                    i6 = i12;
                } else {
                    i6 = getPaddingLeft();
                    i7 = this.f75751a + paddingTop;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.f75752b;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m126702a(size, mode, i8 + getPaddingRight()), m126702a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f75752b = i;
    }

    public void setLineSpacing(int i) {
        this.f75751a = i;
    }

    public void setSingleLine(boolean z) {
        this.f75753c = z;
    }

    public FlowLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75753c = false;
        mo89919d(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f75753c = false;
        mo89919d(context, attributeSet);
    }
}
