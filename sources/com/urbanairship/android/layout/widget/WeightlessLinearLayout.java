package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import com.urbanairship.android.layout.C35625g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WeightlessLinearLayout extends ViewGroup {

    /* renamed from: d */
    public static final int f88981d = 0;

    /* renamed from: e */
    public static final int f88982e = 1;

    /* renamed from: f */
    public static final String f88983f = "com.urbanairship.android.layout.widget.WeightlessLinearLayout";

    /* renamed from: a */
    public int f88984a;

    /* renamed from: b */
    public int f88985b;

    /* renamed from: c */
    public int f88986c;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.android.layout.widget.WeightlessLinearLayout$b */
    public @interface C36000b {
    }

    public WeightlessLinearLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public final void mo107672c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C35999a aVar = (C35999a) childAt.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = childAt.getMeasuredWidth();
                    measureChildWithMargins(childAt, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C35999a;
    }

    /* renamed from: d */
    public final void mo107674d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C35999a aVar = (C35999a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: e */
    public C35999a generateDefaultLayoutParams() {
        int i = this.f88984a;
        if (i == 0) {
            return new C35999a(-2, -1);
        }
        if (i == 1) {
            return new C35999a(-1, -2);
        }
        return null;
    }

    /* renamed from: f */
    public C35999a generateLayoutParams(AttributeSet attributeSet) {
        return new C35999a(getContext(), attributeSet);
    }

    /* renamed from: g */
    public C35999a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C35999a(layoutParams);
    }

    public int getGravity() {
        return this.f88985b;
    }

    public int getOrientation() {
        return this.f88984a;
    }

    /* renamed from: j */
    public final void mo107683j(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        WeightlessLinearLayout weightlessLinearLayout = this;
        int i11 = 1;
        if (C18196h2.m82553Z(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int paddingTop = getPaddingTop();
        int i12 = i4 - i2;
        int paddingBottom = i12 - getPaddingBottom();
        int paddingBottom2 = (i12 - paddingTop) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = weightlessLinearLayout.f88985b;
        int i14 = i13 & 112;
        int d = C18306m0.m82991d(8388615 & i13, C18196h2.m82553Z(this));
        if (d == 1) {
            i5 = getPaddingLeft() + (((i3 - i) - weightlessLinearLayout.f88986c) / 2);
        } else if (d != 5) {
            i5 = getPaddingLeft();
        } else {
            i5 = ((getPaddingLeft() + i3) - i) - weightlessLinearLayout.f88986c;
        }
        if (z) {
            i11 = -1;
            i6 = childCount - 1;
        } else {
            i6 = 0;
        }
        int i15 = i11;
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = weightlessLinearLayout.getChildAt((i15 * i16) + i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C35999a aVar = (C35999a) childAt.getLayoutParams();
                int i17 = aVar.f88989c;
                if (i17 < 0) {
                    i17 = i14;
                }
                int i18 = i17 & 112;
                if (i18 == 16) {
                    i10 = ((paddingBottom2 - measuredHeight) / 2) + paddingTop + aVar.topMargin;
                    i9 = aVar.bottomMargin;
                } else if (i18 == 48) {
                    i8 = aVar.topMargin + paddingTop;
                    i7 = i8;
                    int i19 = i5 + aVar.leftMargin;
                    mo107687n(childAt, i19, i7, measuredWidth, measuredHeight);
                    i5 = i19 + measuredWidth + aVar.rightMargin;
                } else if (i18 != 80) {
                    i7 = paddingTop;
                    int i192 = i5 + aVar.leftMargin;
                    mo107687n(childAt, i192, i7, measuredWidth, measuredHeight);
                    i5 = i192 + measuredWidth + aVar.rightMargin;
                } else {
                    i10 = paddingBottom - measuredHeight;
                    i9 = aVar.bottomMargin;
                }
                i8 = i10 - i9;
                i7 = i8;
                int i1922 = i5 + aVar.leftMargin;
                mo107687n(childAt, i1922, i7, measuredWidth, measuredHeight);
                i5 = i1922 + measuredWidth + aVar.rightMargin;
            }
            i16++;
            weightlessLinearLayout = this;
        }
    }

    /* renamed from: k */
    public final void mo107684k(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int childCount = getChildCount();
        int i10 = this.f88985b;
        int i11 = i10 & 112;
        int i12 = i10 & C18306m0.f46962d;
        if (i11 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f88986c) / 2);
        } else if (i11 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f88986c;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C35999a aVar = (C35999a) childAt.getLayoutParams();
                int i14 = aVar.f88989c;
                if (i14 < 0) {
                    i14 = i12;
                }
                int d = C18306m0.m82991d(i14, C18196h2.m82553Z(this)) & 7;
                if (d == 1) {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i7 = aVar.rightMargin;
                } else if (d != 5) {
                    i6 = aVar.leftMargin + paddingLeft;
                    int i15 = i5 + aVar.topMargin;
                    mo107687n(childAt, i6, i15, measuredWidth, measuredHeight);
                    i5 = i15 + measuredHeight + aVar.bottomMargin;
                } else {
                    i8 = paddingRight - measuredWidth;
                    i7 = aVar.rightMargin;
                }
                i6 = i8 - i7;
                int i152 = i5 + aVar.topMargin;
                mo107687n(childAt, i6, i152, measuredWidth, measuredHeight);
                i5 = i152 + measuredHeight + aVar.bottomMargin;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107685l(int r30, int r31) {
        /*
            r29 = this;
            r6 = r29
            r7 = r30
            r8 = 0
            r6.f88986c = r8
            int r9 = r29.getChildCount()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = android.view.View.MeasureSpec.getMode(r30)
            int r12 = android.view.View.MeasureSpec.getMode(r31)
            int r13 = android.view.View.MeasureSpec.getSize(r31)
            r2 = r8
            r3 = r2
            r4 = r3
            r5 = r4
            r15 = r5
            r16 = r15
            r18 = r16
            r17 = 1
        L_0x0027:
            r1 = 8
            r8 = 1073741824(0x40000000, float:2.0)
            r20 = 0
            if (r15 >= r9) goto L_0x0176
            android.view.View r14 = r6.getChildAt(r15)
            if (r14 == 0) goto L_0x0155
            int r0 = r14.getVisibility()
            if (r0 != r1) goto L_0x003d
            goto L_0x0155
        L_0x003d:
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            r1 = r0
            com.urbanairship.android.layout.widget.WeightlessLinearLayout$a r1 = (com.urbanairship.android.layout.widget.WeightlessLinearLayout.C35999a) r1
            float r0 = r1.f88987a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            r10.add(r14)
        L_0x004d:
            if (r11 != r8) goto L_0x0083
            int r0 = r1.width
            if (r0 != 0) goto L_0x0083
            float r0 = r1.f88987a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0083
            int r0 = r6.f88986c
            int r16 = r1.getMarginStart()
            int r16 = r0 + r16
            int r21 = r1.getMarginEnd()
            int r8 = r16 + r21
            int r0 = java.lang.Math.max(r0, r8)
            r6.f88986c = r0
            r7 = r3
            r27 = r5
            r24 = r9
            r23 = r10
            r26 = r11
            r25 = r13
            r22 = r15
            r0 = 1073741824(0x40000000, float:2.0)
            r16 = 1
            r13 = r1
            r11 = r2
            r15 = r4
            goto L_0x0108
        L_0x0083:
            int r0 = r1.width
            if (r0 != 0) goto L_0x0092
            float r0 = r1.f88987a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            r0 = -2
            r1.width = r0
            r0 = 0
            goto L_0x0094
        L_0x0092:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0094:
            int r8 = r1.topMargin
            r22 = r0
            int r0 = r1.bottomMargin
            int r8 = r8 + r0
            int r0 = r1.height
            if (r0 != 0) goto L_0x00af
            float r0 = r1.f88988b
            int r23 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x00af
            r23 = r2
            float r2 = (float) r13
            float r2 = r2 * r0
            int r0 = (int) r2
            int r0 = r0 - r8
            r1.height = r0
            r2 = 0
            goto L_0x00b3
        L_0x00af:
            r23 = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b3:
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x00c2
            int r0 = r6.f88986c
            r24 = r9
            r9 = r22
            r22 = r0
            goto L_0x00c8
        L_0x00c2:
            r24 = r9
            r9 = r22
            r22 = 0
        L_0x00c8:
            r0 = r29
            r25 = r13
            r13 = r1
            r1 = r14
            r26 = r11
            r11 = r23
            r23 = r10
            r10 = r2
            r2 = r30
            r7 = r3
            r3 = r22
            r22 = r15
            r15 = r4
            r4 = r31
            r27 = r5
            r5 = r8
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x00eb
            r13.width = r9
        L_0x00eb:
            if (r10 == r0) goto L_0x00ef
            r13.height = r10
        L_0x00ef:
            int r0 = r14.getMeasuredWidth()
            int r1 = r6.f88986c
            int r0 = r0 + r1
            int r2 = r13.getMarginStart()
            int r0 = r0 + r2
            int r2 = r13.getMarginEnd()
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            r6.f88986c = r0
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0108:
            if (r12 == r0) goto L_0x0113
            int r0 = r13.height
            r1 = -1
            if (r0 != r1) goto L_0x0113
            r0 = 1
            r18 = 1
            goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            int r1 = r13.topMargin
            int r2 = r13.bottomMargin
            int r1 = r1 + r2
            int r2 = r14.getMeasuredHeight()
            int r2 = r2 + r1
            int r3 = java.lang.Math.max(r7, r2)
            int r4 = r14.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r11, r4)
            if (r17 == 0) goto L_0x0134
            int r5 = r13.height
            r7 = -1
            if (r5 != r7) goto L_0x0134
            r17 = 1
            goto L_0x0136
        L_0x0134:
            r17 = 0
        L_0x0136:
            float r5 = r13.f88987a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0149
            if (r0 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r1 = r2
        L_0x0140:
            int r0 = java.lang.Math.max(r15, r1)
            r2 = r4
            r5 = r27
            r4 = r0
            goto L_0x0167
        L_0x0149:
            if (r0 == 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r1 = r2
        L_0x014d:
            r8 = r27
            int r5 = java.lang.Math.max(r8, r1)
            r2 = r4
            goto L_0x0166
        L_0x0155:
            r7 = r3
            r8 = r5
            r24 = r9
            r23 = r10
            r26 = r11
            r25 = r13
            r22 = r15
            r11 = r2
            r15 = r4
            r3 = r7
            r5 = r8
            r2 = r11
        L_0x0166:
            r4 = r15
        L_0x0167:
            int r15 = r22 + 1
            r7 = r30
            r10 = r23
            r9 = r24
            r13 = r25
            r11 = r26
            r8 = 0
            goto L_0x0027
        L_0x0176:
            r7 = r3
            r15 = r4
            r8 = r5
            r24 = r9
            r23 = r10
            r26 = r11
            r25 = r13
            r11 = r2
            int r0 = r6.f88986c
            int r2 = r29.getPaddingStart()
            int r3 = r29.getPaddingEnd()
            int r2 = r2 + r3
            int r0 = r0 + r2
            r6.f88986c = r0
            int r2 = r29.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = r30
            r3 = r7
            r4 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            int r5 = r6.f88986c
            int r5 = r4 - r5
            if (r16 != 0) goto L_0x01bc
            if (r5 == 0) goto L_0x01b3
            int r7 = r23.size()
            if (r7 <= 0) goto L_0x01b3
            goto L_0x01bc
        L_0x01b3:
            int r1 = java.lang.Math.max(r8, r15)
            r5 = r1
            r1 = r24
            goto L_0x02ff
        L_0x01bc:
            com.urbanairship.android.layout.widget.o r7 = new com.urbanairship.android.layout.widget.o
            r7.<init>()
            r9 = r23
            java.util.Collections.sort(r9, r7)
            int r7 = r9.size()
            int r10 = r7 + -1
            r13 = r5
            r5 = 0
        L_0x01ce:
            if (r5 >= r7) goto L_0x0284
            java.lang.Object r14 = r9.get(r5)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            com.urbanairship.android.layout.widget.WeightlessLinearLayout$a r15 = (com.urbanairship.android.layout.widget.WeightlessLinearLayout.C35999a) r15
            if (r26 == 0) goto L_0x026e
            float r1 = (float) r13
            r22 = r3
            float r3 = (float) r4
            r23 = r4
            float r4 = r15.f88987a
            float r27 = r3 * r4
            r28 = r4
            int r4 = r7 - r5
            float r4 = (float) r4
            float r27 = r27 * r4
            int r4 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r4 < 0) goto L_0x01f6
            r4 = r28
            goto L_0x01ff
        L_0x01f6:
            int r4 = r9.size()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r1 = r1 / r4
            float r4 = r1 / r3
        L_0x01ff:
            float r4 = r4 * r3
            int r1 = (int) r4
            int r3 = r15.getMarginStart()
            int r1 = r1 + r3
            int r3 = r15.getMarginEnd()
            int r1 = r1 + r3
            if (r5 != r10) goto L_0x0211
            int r1 = java.lang.Math.min(r1, r13)
        L_0x0211:
            int r13 = r13 - r1
            int r3 = r15.height
            if (r3 != 0) goto L_0x0240
            float r3 = r15.f88988b
            int r4 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0240
            if (r25 != 0) goto L_0x022b
            if (r12 != 0) goto L_0x022b
            r19 = r7
            r4 = 0
            r7 = -2
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r4 = r25
            goto L_0x0259
        L_0x022b:
            r19 = r7
            r4 = 0
            r4 = r25
            float r7 = (float) r4
            float r7 = r7 * r3
            int r3 = (int) r7
            int r7 = r15.topMargin
            int r15 = r15.bottomMargin
            int r7 = r7 + r15
            int r3 = r3 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            goto L_0x0259
        L_0x0240:
            r19 = r7
            r4 = r25
            int r3 = r29.getPaddingTop()
            int r7 = r29.getPaddingBottom()
            int r3 = r3 + r7
            int r7 = r15.topMargin
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            int r7 = r15.height
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r7)
        L_0x0259:
            r7 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r14.measure(r1, r3)
            int r1 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r3
            int r11 = android.view.View.combineMeasuredStates(r11, r1)
            goto L_0x0276
        L_0x026e:
            r22 = r3
            r23 = r4
            r19 = r7
            r4 = r25
        L_0x0276:
            int r5 = r5 + 1
            r25 = r4
            r7 = r19
            r3 = r22
            r4 = r23
            r1 = 8
            goto L_0x01ce
        L_0x0284:
            r22 = r3
            r5 = r8
            r1 = r24
            r4 = 0
        L_0x028a:
            if (r4 >= r1) goto L_0x02f1
            android.view.View r7 = r6.getChildAt(r4)
            if (r7 == 0) goto L_0x02e9
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x029b
            goto L_0x02e9
        L_0x029b:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.urbanairship.android.layout.widget.WeightlessLinearLayout$a r8 = (com.urbanairship.android.layout.widget.WeightlessLinearLayout.C35999a) r8
            int r10 = r8.topMargin
            int r13 = r8.bottomMargin
            int r10 = r10 + r13
            int r13 = r7.getMeasuredHeight()
            int r13 = r13 + r10
            int r3 = java.lang.Math.max(r3, r13)
            r14 = r26
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 == r15) goto L_0x02bc
            int r15 = r8.height
            r9 = -1
            if (r15 != r9) goto L_0x02bd
            r15 = 1
            goto L_0x02be
        L_0x02bc:
            r9 = -1
        L_0x02bd:
            r15 = 0
        L_0x02be:
            if (r15 == 0) goto L_0x02c1
            goto L_0x02c2
        L_0x02c1:
            r10 = r13
        L_0x02c2:
            int r5 = java.lang.Math.max(r5, r10)
            if (r17 == 0) goto L_0x02ce
            int r10 = r8.height
            if (r10 != r9) goto L_0x02ce
            r10 = 1
            goto L_0x02cf
        L_0x02ce:
            r10 = 0
        L_0x02cf:
            int r13 = r6.f88986c
            int r7 = r7.getMeasuredWidth()
            int r7 = r7 + r13
            int r15 = r8.getMarginStart()
            int r7 = r7 + r15
            int r8 = r8.getMarginEnd()
            int r7 = r7 + r8
            int r7 = java.lang.Math.max(r13, r7)
            r6.f88986c = r7
            r17 = r10
            goto L_0x02ec
        L_0x02e9:
            r14 = r26
            r9 = -1
        L_0x02ec:
            int r4 = r4 + 1
            r26 = r14
            goto L_0x028a
        L_0x02f1:
            int r4 = r6.f88986c
            int r7 = r29.getPaddingStart()
            int r8 = r29.getPaddingEnd()
            int r7 = r7 + r8
            int r4 = r4 + r7
            r6.f88986c = r4
        L_0x02ff:
            if (r17 != 0) goto L_0x0306
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x0306
            goto L_0x0307
        L_0x0306:
            r5 = r3
        L_0x0307:
            int r3 = r29.getPaddingTop()
            int r4 = r29.getPaddingBottom()
            int r3 = r3 + r4
            int r5 = r5 + r3
            int r3 = r29.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r5, r3)
            r4 = r31
            int r3 = android.view.View.resolveSizeAndState(r3, r4, r11)
            r6.setMeasuredDimension(r0, r3)
            if (r18 == 0) goto L_0x0327
            r6.mo107672c(r1, r2)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.widget.WeightlessLinearLayout.mo107685l(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107686m(int r30, int r31) {
        /*
            r29 = this;
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = 0
            r6.f88986c = r9
            int r10 = r29.getChildCount()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = android.view.View.MeasureSpec.getMode(r30)
            int r13 = android.view.View.MeasureSpec.getSize(r30)
            int r14 = android.view.View.MeasureSpec.getMode(r31)
            r1 = r9
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r16 = r5
            r18 = r16
            r17 = 1
        L_0x0029:
            r15 = 8
            r20 = 0
            if (r5 >= r10) goto L_0x0179
            android.view.View r0 = r6.getChildAt(r5)
            if (r0 == 0) goto L_0x0158
            int r9 = r0.getVisibility()
            if (r9 != r15) goto L_0x003d
            goto L_0x0158
        L_0x003d:
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            com.urbanairship.android.layout.widget.WeightlessLinearLayout$a r9 = (com.urbanairship.android.layout.widget.WeightlessLinearLayout.C35999a) r9
            float r15 = r9.f88988b
            int r15 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r15 <= 0) goto L_0x004c
            r11.add(r0)
        L_0x004c:
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 != r15) goto L_0x0083
            int r15 = r9.height
            if (r15 != 0) goto L_0x0083
            float r15 = r9.f88988b
            int r15 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r15 <= 0) goto L_0x0083
            int r15 = r6.f88986c
            r22 = r0
            int r0 = r9.topMargin
            int r0 = r0 + r15
            r23 = r1
            int r1 = r9.bottomMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r15, r0)
            r6.f88986c = r0
            r21 = r5
            r26 = r10
            r28 = r11
            r27 = r14
            r25 = r22
            r10 = r23
            r0 = 1073741824(0x40000000, float:2.0)
            r16 = 1
            r14 = r3
            r11 = r4
            r23 = r13
            r13 = r2
            goto L_0x0106
        L_0x0083:
            r22 = r0
            r23 = r1
            int r0 = r9.height
            if (r0 != 0) goto L_0x0096
            float r0 = r9.f88988b
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            r0 = -2
            r9.height = r0
            r1 = 0
            goto L_0x0098
        L_0x0096:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0098:
            int r0 = r9.getMarginStart()
            int r21 = r9.getMarginEnd()
            int r21 = r0 + r21
            int r0 = r9.width
            if (r0 != 0) goto L_0x00b5
            float r0 = r9.f88987a
            int r24 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r24 <= 0) goto L_0x00b5
            float r15 = (float) r13
            float r15 = r15 * r0
            int r0 = (int) r15
            int r0 = r0 - r21
            r9.width = r0
            r15 = 0
            goto L_0x00b7
        L_0x00b5:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b7:
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00c4
            int r0 = r6.f88986c
            r25 = r22
            r22 = r0
            goto L_0x00c8
        L_0x00c4:
            r25 = r22
            r22 = 0
        L_0x00c8:
            r0 = r29
            r7 = r1
            r26 = r10
            r10 = r23
            r1 = r25
            r23 = r13
            r13 = r2
            r2 = r30
            r27 = r14
            r14 = r3
            r3 = r21
            r28 = r11
            r11 = r4
            r4 = r31
            r21 = r5
            r5 = r22
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L_0x00ed
            r9.height = r7
        L_0x00ed:
            if (r15 == r0) goto L_0x00f1
            r9.width = r15
        L_0x00f1:
            int r0 = r25.getMeasuredHeight()
            int r1 = r6.f88986c
            int r0 = r0 + r1
            int r2 = r9.topMargin
            int r0 = r0 + r2
            int r2 = r9.bottomMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            r6.f88986c = r0
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0106:
            if (r12 == r0) goto L_0x0111
            int r0 = r9.width
            r1 = -1
            if (r0 != r1) goto L_0x0111
            r0 = 1
            r18 = 1
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            int r1 = r9.getMarginStart()
            int r2 = r9.getMarginEnd()
            int r1 = r1 + r2
            int r2 = r25.getMeasuredWidth()
            int r2 = r2 + r1
            int r3 = java.lang.Math.max(r13, r2)
            int r4 = r25.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r10, r4)
            if (r17 == 0) goto L_0x0136
            int r5 = r9.width
            r7 = -1
            if (r5 != r7) goto L_0x0136
            r17 = 1
            goto L_0x0138
        L_0x0136:
            r17 = 0
        L_0x0138:
            float r5 = r9.f88988b
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x014b
            if (r0 == 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r1 = r2
        L_0x0142:
            int r0 = java.lang.Math.max(r14, r1)
            r2 = r3
            r1 = r4
            r4 = r11
            r3 = r0
            goto L_0x016a
        L_0x014b:
            if (r0 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r1 = r2
        L_0x014f:
            int r0 = java.lang.Math.max(r11, r1)
            r2 = r3
            r1 = r4
            r3 = r14
            r4 = r0
            goto L_0x016a
        L_0x0158:
            r21 = r5
            r26 = r10
            r28 = r11
            r23 = r13
            r27 = r14
            r10 = r1
            r13 = r2
            r14 = r3
            r11 = r4
            r1 = r10
            r4 = r11
            r2 = r13
            r3 = r14
        L_0x016a:
            int r5 = r21 + 1
            r7 = r30
            r13 = r23
            r10 = r26
            r14 = r27
            r11 = r28
            r9 = 0
            goto L_0x0029
        L_0x0179:
            r26 = r10
            r28 = r11
            r23 = r13
            r27 = r14
            r10 = r1
            r13 = r2
            r14 = r3
            r11 = r4
            int r0 = r6.f88986c
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r6.f88986c = r0
            int r1 = r29.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r1)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r6.f88986c
            int r2 = r1 - r2
            if (r16 != 0) goto L_0x01be
            if (r2 == 0) goto L_0x01b3
            int r3 = r28.size()
            if (r3 <= 0) goto L_0x01b3
            goto L_0x01be
        L_0x01b3:
            int r1 = java.lang.Math.max(r11, r14)
            r15 = r30
            r2 = r13
            r3 = r26
            goto L_0x0309
        L_0x01be:
            com.urbanairship.android.layout.widget.p r3 = new com.urbanairship.android.layout.widget.p
            r3.<init>()
            r4 = r28
            java.util.Collections.sort(r4, r3)
            int r3 = r4.size()
            int r5 = r3 + -1
            r7 = r2
            r2 = 0
        L_0x01d0:
            if (r2 >= r3) goto L_0x028f
            java.lang.Object r9 = r4.get(r2)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r14 = r9.getLayoutParams()
            com.urbanairship.android.layout.widget.WeightlessLinearLayout$a r14 = (com.urbanairship.android.layout.widget.WeightlessLinearLayout.C35999a) r14
            if (r27 == 0) goto L_0x0277
            float r15 = (float) r7
            r22 = r11
            float r11 = (float) r1
            r24 = r1
            float r1 = r14.f88988b
            float r25 = r11 * r1
            r28 = r1
            int r1 = r3 - r2
            float r1 = (float) r1
            float r25 = r25 * r1
            int r1 = (r15 > r25 ? 1 : (r15 == r25 ? 0 : -1))
            if (r1 < 0) goto L_0x01f8
            r1 = r28
            goto L_0x0201
        L_0x01f8:
            int r1 = r4.size()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r15 = r15 / r1
            float r1 = r15 / r11
        L_0x0201:
            float r1 = r1 * r11
            int r1 = (int) r1
            int r11 = r14.topMargin
            int r1 = r1 + r11
            int r11 = r14.bottomMargin
            int r1 = r1 + r11
            if (r2 != r5) goto L_0x020f
            int r1 = java.lang.Math.min(r1, r7)
        L_0x020f:
            int r7 = r7 - r1
            int r11 = r14.width
            if (r11 != 0) goto L_0x0244
            float r11 = r14.f88987a
            int r15 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r15 <= 0) goto L_0x0244
            if (r23 != 0) goto L_0x0229
            if (r12 != 0) goto L_0x0229
            r19 = r3
            r3 = -2
            r15 = 0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r15)
            r3 = r23
            goto L_0x0241
        L_0x0229:
            r19 = r3
            r15 = 0
            r3 = r23
            float r15 = (float) r3
            float r15 = r15 * r11
            int r11 = (int) r15
            int r15 = r14.getMarginStart()
            int r14 = r14.getMarginEnd()
            int r15 = r15 + r14
            int r11 = r11 - r15
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r14)
        L_0x0241:
            r15 = r30
            goto L_0x0263
        L_0x0244:
            r19 = r3
            r3 = r23
            int r11 = r29.getPaddingStart()
            int r15 = r29.getPaddingEnd()
            int r11 = r11 + r15
            int r15 = r14.getMarginStart()
            int r11 = r11 + r15
            int r15 = r14.getMarginEnd()
            int r11 = r11 + r15
            int r14 = r14.width
            r15 = r30
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r15, r11, r14)
        L_0x0263:
            r14 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r9.measure(r11, r1)
            int r1 = r9.getMeasuredState()
            r1 = r1 & -256(0xffffffffffffff00, float:NaN)
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            goto L_0x0281
        L_0x0277:
            r15 = r30
            r24 = r1
            r19 = r3
            r22 = r11
            r3 = r23
        L_0x0281:
            int r2 = r2 + 1
            r23 = r3
            r3 = r19
            r11 = r22
            r1 = r24
            r15 = 8
            goto L_0x01d0
        L_0x028f:
            r15 = r30
            r22 = r11
            r2 = r13
            r4 = r22
            r3 = r26
            r1 = 0
        L_0x0299:
            if (r1 >= r3) goto L_0x02fa
            android.view.View r5 = r6.getChildAt(r1)
            if (r5 == 0) goto L_0x02f6
            int r7 = r5.getVisibility()
            r9 = 8
            if (r7 != r9) goto L_0x02aa
            goto L_0x02f6
        L_0x02aa:
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            com.urbanairship.android.layout.widget.WeightlessLinearLayout$a r7 = (com.urbanairship.android.layout.widget.WeightlessLinearLayout.C35999a) r7
            int r11 = r7.getMarginStart()
            int r13 = r7.getMarginEnd()
            int r11 = r11 + r13
            int r13 = r5.getMeasuredWidth()
            int r13 = r13 + r11
            int r2 = java.lang.Math.max(r2, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r12 == r14) goto L_0x02cd
            int r14 = r7.width
            r9 = -1
            if (r14 != r9) goto L_0x02ce
            r14 = 1
            goto L_0x02cf
        L_0x02cd:
            r9 = -1
        L_0x02ce:
            r14 = 0
        L_0x02cf:
            if (r14 == 0) goto L_0x02d2
            goto L_0x02d3
        L_0x02d2:
            r11 = r13
        L_0x02d3:
            int r4 = java.lang.Math.max(r4, r11)
            if (r17 == 0) goto L_0x02df
            int r11 = r7.width
            if (r11 != r9) goto L_0x02df
            r11 = 1
            goto L_0x02e0
        L_0x02df:
            r11 = 0
        L_0x02e0:
            int r13 = r6.f88986c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r13
            int r14 = r7.topMargin
            int r5 = r5 + r14
            int r7 = r7.bottomMargin
            int r5 = r5 + r7
            int r5 = java.lang.Math.max(r13, r5)
            r6.f88986c = r5
            r17 = r11
            goto L_0x02f7
        L_0x02f6:
            r9 = -1
        L_0x02f7:
            int r1 = r1 + 1
            goto L_0x0299
        L_0x02fa:
            int r1 = r6.f88986c
            int r5 = r29.getPaddingTop()
            int r7 = r29.getPaddingBottom()
            int r5 = r5 + r7
            int r1 = r1 + r5
            r6.f88986c = r1
            r1 = r4
        L_0x0309:
            if (r17 != 0) goto L_0x0310
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x0310
            goto L_0x0311
        L_0x0310:
            r1 = r2
        L_0x0311:
            int r2 = r29.getPaddingStart()
            int r4 = r29.getPaddingEnd()
            int r2 = r2 + r4
            int r1 = r1 + r2
            int r2 = r29.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = android.view.View.resolveSizeAndState(r1, r15, r10)
            r6.setMeasuredDimension(r1, r0)
            if (r18 == 0) goto L_0x032f
            r6.mo107674d(r3, r8)
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.widget.WeightlessLinearLayout.mo107686m(int, int):void");
    }

    /* renamed from: n */
    public final void mo107687n(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f88983f);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f88983f);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f88984a == 1) {
            mo107684k(i, i2, i3, i4);
        } else {
            mo107683j(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f88984a == 1) {
            mo107686m(i, i2);
        } else {
            mo107685l(i, i2);
        }
    }

    public void setGravity(int i) {
        if (this.f88985b != i) {
            if ((8388615 & i) == 0) {
                i |= C18306m0.f46960b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f88985b = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & C18306m0.f46962d;
        int i3 = this.f88985b;
        if ((8388615 & i3) != i2) {
            this.f88985b = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.f88984a != i) {
            this.f88984a = i;
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f88985b;
        if ((i3 & 112) != i2) {
            this.f88985b = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public WeightlessLinearLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WeightlessLinearLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f88985b = 8388659;
        int[] iArr = C35625g.C35641p.WeightlessLinearLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C18196h2.m82658z1(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(C35625g.C35641p.WeightlessLinearLayout_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(C35625g.C35641p.WeightlessLinearLayout_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: com.urbanairship.android.layout.widget.WeightlessLinearLayout$a */
    public static class C35999a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f88987a;

        /* renamed from: b */
        public float f88988b;

        /* renamed from: c */
        public int f88989c;

        public C35999a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f88987a = 0.0f;
            this.f88988b = 0.0f;
            this.f88989c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35625g.C35641p.WeightlessLinearLayout_Layout);
            this.f88987a = obtainStyledAttributes.getFloat(C35625g.C35641p.WeightlessLinearLayout_Layout_maxPercentWidth, 0.0f);
            this.f88988b = obtainStyledAttributes.getFloat(C35625g.C35641p.WeightlessLinearLayout_Layout_maxPercentHeight, 0.0f);
            this.f88989c = obtainStyledAttributes.getInt(C35625g.C35641p.WeightlessLinearLayout_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        @C0359n0
        public String toString() {
            return String.format("LayoutParams{ width = %d, height = %d, maxWidth = %.2f, maxHeight = %.2f", new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height), Float.valueOf(this.f88987a), Float.valueOf(this.f88988b)});
        }

        public C35999a(int i, int i2) {
            super(i, i2);
            this.f88987a = 0.0f;
            this.f88988b = 0.0f;
            this.f88989c = -1;
        }

        public C35999a(int i, int i2, float f, float f2) {
            super(i, i2);
            this.f88989c = -1;
            this.f88987a = f;
            this.f88988b = f2;
        }

        public C35999a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f88987a = 0.0f;
            this.f88988b = 0.0f;
            this.f88989c = -1;
        }

        public C35999a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f88987a = 0.0f;
            this.f88988b = 0.0f;
            this.f88989c = -1;
        }
    }
}
