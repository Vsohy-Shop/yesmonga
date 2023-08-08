package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import com.google.android.flexbox.C40344h;
import com.google.android.flexbox.C40350k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements C40340d {

    /* renamed from: J0 */
    public static final int f102703J0 = 0;

    /* renamed from: K0 */
    public static final int f102704K0 = 1;

    /* renamed from: L0 */
    public static final int f102705L0 = 2;

    /* renamed from: M0 */
    public static final int f102706M0 = 4;

    /* renamed from: E0 */
    public int[] f102707E0;

    /* renamed from: F0 */
    public SparseIntArray f102708F0;

    /* renamed from: G0 */
    public C40344h f102709G0;

    /* renamed from: H0 */
    public List<C40342f> f102710H0;

    /* renamed from: I0 */
    public C40344h.C40346b f102711I0;

    /* renamed from: a */
    public int f102712a;

    /* renamed from: b */
    public int f102713b;

    /* renamed from: c */
    public int f102714c;

    /* renamed from: d */
    public int f102715d;

    /* renamed from: e */
    public int f102716e;

    /* renamed from: f */
    public int f102717f;
    @C0363p0

    /* renamed from: g */
    public Drawable f102718g;
    @C0363p0

    /* renamed from: v */
    public Drawable f102719v;

    /* renamed from: w */
    public int f102720w;

    /* renamed from: x */
    public int f102721x;

    /* renamed from: y */
    public int f102722y;

    /* renamed from: z */
    public int f102723z;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.flexbox.FlexboxLayout$a */
    public @interface C40331a {
    }

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final void mo133020A() {
        if (this.f102718g == null && this.f102719v == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    public final boolean mo133021a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f102710H0.get(i2).mo133172d() > 0) {
                return false;
            }
        }
        return true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f102708F0 == null) {
            this.f102708F0 = new SparseIntArray(getChildCount());
        }
        this.f102707E0 = this.f102709G0.mo133216n(view, i, layoutParams, this.f102708F0);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo133023b(View view, int i, int i2, C40342f fVar) {
        if (!mo133061s(i, i2)) {
            return;
        }
        if (mo133051l()) {
            int i3 = fVar.f102824e;
            int i4 = this.f102723z;
            fVar.f102824e = i3 + i4;
            fVar.f102825f += i4;
            return;
        }
        int i5 = fVar.f102824e;
        int i6 = this.f102722y;
        fVar.f102824e = i5 + i6;
        fVar.f102825f += i6;
    }

    /* renamed from: c */
    public int mo133024c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final boolean mo133026d(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View r = mo133060r(i - i3);
            if (r != null && r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public View mo133027e(int i) {
        return getChildAt(i);
    }

    /* renamed from: f */
    public int mo133028f(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: g */
    public int mo133029g(View view) {
        return 0;
    }

    public int getAlignContent() {
        return this.f102716e;
    }

    public int getAlignItems() {
        return this.f102715d;
    }

    @C0363p0
    public Drawable getDividerDrawableHorizontal() {
        return this.f102718g;
    }

    @C0363p0
    public Drawable getDividerDrawableVertical() {
        return this.f102719v;
    }

    public int getFlexDirection() {
        return this.f102712a;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C40342f> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f102710H0.size());
        for (C40342f next : this.f102710H0) {
            if (next.mo133172d() != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<C40342f> getFlexLinesInternal() {
        return this.f102710H0;
    }

    public int getFlexWrap() {
        return this.f102713b;
    }

    public int getJustifyContent() {
        return this.f102714c;
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C40342f fVar : this.f102710H0) {
            i = Math.max(i, fVar.f102824e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f102717f;
    }

    public int getShowDividerHorizontal() {
        return this.f102720w;
    }

    public int getShowDividerVertical() {
        return this.f102721x;
    }

    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f102710H0.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C40342f fVar = this.f102710H0.get(i4);
            if (mo133075t(i4)) {
                if (mo133051l()) {
                    i2 = this.f102722y;
                } else {
                    i2 = this.f102723z;
                }
                i3 += i2;
            }
            if (mo133076u(i4)) {
                if (mo133051l()) {
                    i = this.f102722y;
                } else {
                    i = this.f102723z;
                }
                i3 += i;
            }
            i3 += fVar.f102826g;
        }
        return i3;
    }

    /* renamed from: h */
    public void mo133047h(C40342f fVar) {
        if (mo133051l()) {
            if ((this.f102721x & 4) > 0) {
                int i = fVar.f102824e;
                int i2 = this.f102723z;
                fVar.f102824e = i + i2;
                fVar.f102825f += i2;
            }
        } else if ((this.f102720w & 4) > 0) {
            int i3 = fVar.f102824e;
            int i4 = this.f102722y;
            fVar.f102824e = i3 + i4;
            fVar.f102825f += i4;
        }
    }

    /* renamed from: i */
    public View mo133048i(int i) {
        return mo133060r(i);
    }

    /* renamed from: j */
    public void mo133049j(int i, View view) {
    }

    /* renamed from: k */
    public int mo133050k(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo133051l()) {
            if (mo133061s(i, i2)) {
                i4 = 0 + this.f102723z;
            }
            if ((this.f102721x & 4) <= 0) {
                return i4;
            }
            i3 = this.f102723z;
        } else {
            if (mo133061s(i, i2)) {
                i4 = 0 + this.f102722y;
            }
            if ((this.f102720w & 4) <= 0) {
                return i4;
            }
            i3 = this.f102722y;
        }
        return i4 + i3;
    }

    /* renamed from: l */
    public boolean mo133051l() {
        int i = this.f102712a;
        return i == 0 || i == 1;
    }

    /* renamed from: m */
    public final void mo133052m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f102710H0.size();
        for (int i5 = 0; i5 < size; i5++) {
            C40342f fVar = this.f102710H0.get(i5);
            for (int i6 = 0; i6 < fVar.f102827h; i6++) {
                int i7 = fVar.f102834o + i6;
                View r = mo133060r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (mo133061s(i7, i6)) {
                        if (z) {
                            i4 = r.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (r.getLeft() - layoutParams.leftMargin) - this.f102723z;
                        }
                        mo133058p(canvas, i4, fVar.f102821b, fVar.f102826g);
                    }
                    if (i6 == fVar.f102827h - 1 && (this.f102721x & 4) > 0) {
                        if (z) {
                            i3 = (r.getLeft() - layoutParams.leftMargin) - this.f102723z;
                        } else {
                            i3 = r.getRight() + layoutParams.rightMargin;
                        }
                        mo133058p(canvas, i3, fVar.f102821b, fVar.f102826g);
                    }
                }
            }
            if (mo133075t(i5)) {
                if (z2) {
                    i2 = fVar.f102823d;
                } else {
                    i2 = fVar.f102821b - this.f102722y;
                }
                mo133054o(canvas, paddingLeft, i2, max);
            }
            if (mo133076u(i5) && (this.f102720w & 4) > 0) {
                if (z2) {
                    i = fVar.f102821b - this.f102722y;
                } else {
                    i = fVar.f102823d;
                }
                mo133054o(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: n */
    public final void mo133053n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f102710H0.size();
        for (int i5 = 0; i5 < size; i5++) {
            C40342f fVar = this.f102710H0.get(i5);
            for (int i6 = 0; i6 < fVar.f102827h; i6++) {
                int i7 = fVar.f102834o + i6;
                View r = mo133060r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (mo133061s(i7, i6)) {
                        if (z2) {
                            i4 = r.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (r.getTop() - layoutParams.topMargin) - this.f102722y;
                        }
                        mo133054o(canvas, fVar.f102820a, i4, fVar.f102826g);
                    }
                    if (i6 == fVar.f102827h - 1 && (this.f102720w & 4) > 0) {
                        if (z2) {
                            i3 = (r.getTop() - layoutParams.topMargin) - this.f102722y;
                        } else {
                            i3 = r.getBottom() + layoutParams.bottomMargin;
                        }
                        mo133054o(canvas, fVar.f102820a, i3, fVar.f102826g);
                    }
                }
            }
            if (mo133075t(i5)) {
                if (z) {
                    i2 = fVar.f102822c;
                } else {
                    i2 = fVar.f102820a - this.f102723z;
                }
                mo133058p(canvas, i2, paddingTop, max);
            }
            if (mo133076u(i5) && (this.f102721x & 4) > 0) {
                if (z) {
                    i = fVar.f102820a - this.f102723z;
                } else {
                    i = fVar.f102822c;
                }
                mo133058p(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: o */
    public final void mo133054o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f102718g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f102722y + i2);
            this.f102718g.draw(canvas);
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f102719v != null || this.f102718g != null) {
            if (this.f102720w != 0 || this.f102721x != 0) {
                int Z = C18196h2.m82553Z(this);
                int i = this.f102712a;
                boolean z3 = false;
                boolean z4 = true;
                if (i == 0) {
                    if (Z == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f102713b == 2) {
                        z3 = true;
                    }
                    mo133052m(canvas, z, z3);
                } else if (i == 1) {
                    if (Z != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f102713b == 2) {
                        z3 = true;
                    }
                    mo133052m(canvas, z2, z3);
                } else if (i == 2) {
                    if (Z != 1) {
                        z4 = false;
                    }
                    if (this.f102713b == 2) {
                        z4 = !z4;
                    }
                    mo133053n(canvas, z4, false);
                } else if (i == 3) {
                    if (Z == 1) {
                        z3 = true;
                    }
                    if (this.f102713b == 2) {
                        z3 = !z3;
                    }
                    mo133053n(canvas, z3, true);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int Z = C18196h2.m82553Z(this);
        int i5 = this.f102712a;
        boolean z6 = false;
        if (i5 == 0) {
            if (Z == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo133077v(z2, i, i2, i3, i4);
        } else if (i5 == 1) {
            if (Z != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            mo133077v(z3, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (Z == 1) {
                z6 = true;
            }
            if (this.f102713b == 2) {
                z4 = !z6;
            } else {
                z4 = z6;
            }
            mo133078w(z4, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (Z == 1) {
                z6 = true;
            }
            if (this.f102713b == 2) {
                z5 = !z6;
            } else {
                z5 = z6;
            }
            mo133078w(z5, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f102712a);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f102708F0 == null) {
            this.f102708F0 = new SparseIntArray(getChildCount());
        }
        if (this.f102709G0.mo133191O(this.f102708F0)) {
            this.f102707E0 = this.f102709G0.mo133215m(this.f102708F0);
        }
        int i3 = this.f102712a;
        if (i3 == 0 || i3 == 1) {
            mo133079x(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            mo133080y(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f102712a);
        }
    }

    /* renamed from: p */
    public final void mo133058p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f102719v;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f102723z + i, i3 + i2);
            this.f102719v.draw(canvas);
        }
    }

    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: r */
    public View mo133060r(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f102707E0;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* renamed from: s */
    public final boolean mo133061s(int i, int i2) {
        if (mo133026d(i, i2)) {
            if (mo133051l()) {
                if ((this.f102721x & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f102720w & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo133051l()) {
            if ((this.f102721x & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f102720w & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setAlignContent(int i) {
        if (this.f102716e != i) {
            this.f102716e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f102715d != i) {
            this.f102715d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@C0363p0 Drawable drawable) {
        if (drawable != this.f102718g) {
            this.f102718g = drawable;
            if (drawable != null) {
                this.f102722y = drawable.getIntrinsicHeight();
            } else {
                this.f102722y = 0;
            }
            mo133020A();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(@C0363p0 Drawable drawable) {
        if (drawable != this.f102719v) {
            this.f102719v = drawable;
            if (drawable != null) {
                this.f102723z = drawable.getIntrinsicWidth();
            } else {
                this.f102723z = 0;
            }
            mo133020A();
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f102712a != i) {
            this.f102712a = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<C40342f> list) {
        this.f102710H0 = list;
    }

    public void setFlexWrap(int i) {
        if (this.f102713b != i) {
            this.f102713b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f102714c != i) {
            this.f102714c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f102717f != i) {
            this.f102717f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f102720w) {
            this.f102720w = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f102721x) {
            this.f102721x = i;
            requestLayout();
        }
    }

    /* renamed from: t */
    public final boolean mo133075t(int i) {
        if (i < 0 || i >= this.f102710H0.size()) {
            return false;
        }
        if (mo133021a(i)) {
            if (mo133051l()) {
                if ((this.f102720w & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f102721x & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo133051l()) {
            if ((this.f102720w & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f102721x & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: u */
    public final boolean mo133076u(int i) {
        if (i < 0 || i >= this.f102710H0.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f102710H0.size(); i2++) {
            if (this.f102710H0.get(i2).mo133172d() > 0) {
                return false;
            }
        }
        if (mo133051l()) {
            if ((this.f102720w & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f102721x & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133077v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<com.google.android.flexbox.f> r6 = r0.f102710H0
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x022c
            java.util.List<com.google.android.flexbox.f> r9 = r0.f102710H0
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.f r9 = (com.google.android.flexbox.C40342f) r9
            boolean r10 = r0.mo133075t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f102722y
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f102714c
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c7
            if (r10 == r13) goto L_0x00bd
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ab
            r7 = 3
            if (r10 == r7) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r7 = 5
            if (r10 != r7) goto L_0x0061
            int r7 = r9.mo133172d()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.f102824e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = r11
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cc
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f102714c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r7 = r9.mo133172d()
            if (r7 == 0) goto L_0x0088
            int r10 = r9.f102824e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0089
        L_0x0088:
            r10 = r11
        L_0x0089:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00cc
        L_0x0093:
            float r7 = (float) r1
            int r10 = r9.mo133172d()
            if (r10 == r13) goto L_0x009e
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009e:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f102824e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00cc
        L_0x00ab:
            float r7 = (float) r1
            int r10 = r9.f102824e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
            goto L_0x00cb
        L_0x00bd:
            int r7 = r9.f102824e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00cb
        L_0x00c7:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
        L_0x00cb:
            r10 = r11
        L_0x00cc:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d1:
            int r10 = r9.f102827h
            if (r14 >= r10) goto L_0x0220
            int r10 = r9.f102834o
            int r10 = r10 + r14
            android.view.View r18 = r0.mo133060r(r10)
            if (r18 == 0) goto L_0x020c
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00f2
            r23 = r1
            r26 = r13
            r22 = r14
            r25 = 2
            r27 = 4
            goto L_0x0216
        L_0x00f2:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.mo133061s(r10, r14)
            if (r10 == 0) goto L_0x0111
            int r10 = r0.f102723z
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x0115
        L_0x0111:
            r19 = r12
            r20 = 0
        L_0x0115:
            int r10 = r9.f102827h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0127
            int r10 = r0.f102721x
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0129
            int r10 = r0.f102723z
            r21 = r10
            goto L_0x012b
        L_0x0127:
            r16 = 4
        L_0x0129:
            r21 = 0
        L_0x012b:
            int r10 = r0.f102713b
            r12 = 2
            if (r10 != r12) goto L_0x018d
            if (r29 == 0) goto L_0x0163
            com.google.android.flexbox.h r10 = r0.f102709G0
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r13
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = r16
            r15 = r24
            r16 = r3
            r10.mo133193Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x0163:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            com.google.android.flexbox.h r10 = r0.f102709G0
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r3
            r10.mo133193Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x018d:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            if (r29 == 0) goto L_0x01b8
            com.google.android.flexbox.h r10 = r0.f102709G0
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo133193Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x01b8:
            com.google.android.flexbox.h r10 = r0.f102709G0
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo133193Q(r11, r12, r13, r14, r15, r16)
        L_0x01d5:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01fd
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.mo133176h(r11, r12, r13, r14, r15)
            goto L_0x0209
        L_0x01fd:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.mo133176h(r11, r12, r13, r14, r15)
        L_0x0209:
            r12 = r19
            goto L_0x0216
        L_0x020c:
            r23 = r1
            r26 = r13
            r22 = r14
            r27 = r15
            r25 = 2
        L_0x0216:
            int r14 = r22 + 1
            r1 = r23
            r13 = r26
            r15 = r27
            goto L_0x00d1
        L_0x0220:
            r23 = r1
            int r1 = r9.f102826g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo133077v(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133078w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.f> r3 = r0.f102710H0
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x021c
            java.util.List<com.google.android.flexbox.f> r9 = r0.f102710H0
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.f r9 = (com.google.android.flexbox.C40342f) r9
            boolean r10 = r0.mo133075t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f102723z
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.f102714c
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c5
            if (r10 == r14) goto L_0x00bd
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00aa
            r12 = 3
            if (r10 == r12) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r12 = 5
            if (r10 != r12) goto L_0x0061
            int r10 = r9.mo133172d()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.f102824e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = r11
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00ca
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f102714c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r10 = r9.mo133172d()
            if (r10 == 0) goto L_0x0088
            int r12 = r9.f102824e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0089
        L_0x0088:
            r12 = r11
        L_0x0089:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00ca
        L_0x0093:
            float r10 = (float) r1
            int r7 = r9.mo133172d()
            if (r7 == r14) goto L_0x009e
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a0
        L_0x009e:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f102824e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00ca
        L_0x00aa:
            float r7 = (float) r1
            int r10 = r9.f102824e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 + r12
            int r12 = r6 - r2
            float r12 = (float) r12
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r12 - r10
            r10 = r7
            goto L_0x00c9
        L_0x00bd:
            int r7 = r9.f102824e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            goto L_0x00c8
        L_0x00c5:
            float r10 = (float) r1
            int r7 = r6 - r2
        L_0x00c8:
            float r13 = (float) r7
        L_0x00c9:
            r12 = r11
        L_0x00ca:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00cf:
            int r11 = r9.f102827h
            if (r12 >= r11) goto L_0x0214
            int r11 = r9.f102834o
            int r11 = r11 + r12
            android.view.View r18 = r0.mo133060r(r11)
            if (r18 == 0) goto L_0x0206
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00ec
            r25 = r12
            r26 = 1
            r28 = 4
            goto L_0x020c
        L_0x00ec:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.mo133061s(r11, r12)
            if (r11 == 0) goto L_0x010d
            int r11 = r0.f102722y
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x0113
        L_0x010d:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x0113:
            int r10 = r9.f102827h
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x0126
            int r10 = r0.f102720w
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0128
            int r10 = r0.f102722y
            r22 = r10
            goto L_0x012a
        L_0x0126:
            r16 = 4
        L_0x0128:
            r22 = 0
        L_0x012a:
            if (r30 == 0) goto L_0x0185
            if (r31 == 0) goto L_0x015d
            com.google.android.flexbox.h r10 = r0.f102709G0
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r23 = r18.getMeasuredHeight()
            int r23 = r11 - r23
            int r24 = java.lang.Math.round(r20)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r14
            r14 = r17
            r27 = r15
            r28 = r16
            r15 = r23
            r16 = r5
            r17 = r24
            r10.mo133194R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x015d:
            r25 = r12
            r26 = r14
            r27 = r15
            r28 = r16
            com.google.android.flexbox.h r10 = r0.f102709G0
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r5
            r10.mo133194R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x0185:
            r25 = r12
            r26 = r14
            r27 = r15
            r28 = r16
            if (r31 == 0) goto L_0x01ae
            com.google.android.flexbox.h r10 = r0.f102709G0
            r13 = 0
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo133194R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x01ae:
            com.google.android.flexbox.h r10 = r0.f102709G0
            r13 = 0
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo133194R(r11, r12, r13, r14, r15, r16, r17)
        L_0x01cc:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r27
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01f5
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.mo133176h(r11, r12, r13, r14, r15)
            goto L_0x0201
        L_0x01f5:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.mo133176h(r11, r12, r13, r14, r15)
        L_0x0201:
            r10 = r19
            r13 = r20
            goto L_0x020c
        L_0x0206:
            r25 = r12
            r26 = r14
            r28 = r15
        L_0x020c:
            int r12 = r25 + 1
            r14 = r26
            r15 = r28
            goto L_0x00cf
        L_0x0214:
            int r7 = r9.f102826g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo133078w(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: x */
    public final void mo133079x(int i, int i2) {
        this.f102710H0.clear();
        this.f102711I0.mo133229a();
        this.f102709G0.mo133205c(this.f102711I0, i, i2);
        this.f102710H0 = this.f102711I0.f102849a;
        this.f102709G0.mo133218p(i, i2);
        if (this.f102715d == 3) {
            for (C40342f next : this.f102710H0) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < next.f102827h; i4++) {
                    View r = mo133060r(next.f102834o + i4);
                    if (!(r == null || r.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                        if (this.f102713b != 2) {
                            i3 = Math.max(i3, r.getMeasuredHeight() + Math.max(next.f102831l - r.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, r.getMeasuredHeight() + layoutParams.topMargin + Math.max((next.f102831l - r.getMeasuredHeight()) + r.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                next.f102826g = i3;
            }
        }
        this.f102709G0.mo133217o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f102709G0.mo133200X();
        mo133081z(this.f102712a, i, i2, this.f102711I0.f102850b);
    }

    /* renamed from: y */
    public final void mo133080y(int i, int i2) {
        this.f102710H0.clear();
        this.f102711I0.mo133229a();
        this.f102709G0.mo133208f(this.f102711I0, i, i2);
        this.f102710H0 = this.f102711I0.f102849a;
        this.f102709G0.mo133218p(i, i2);
        this.f102709G0.mo133217o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f102709G0.mo133200X();
        mo133081z(this.f102712a, i, i2, this.f102711I0.f102850b);
    }

    /* renamed from: z */
    public final void mo133081z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f102717f = -1;
        this.f102709G0 = new C40344h(this);
        this.f102710H0 = new ArrayList();
        this.f102711I0 = new C40344h.C40346b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40350k.C40360j.FlexboxLayout, i, 0);
        this.f102712a = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_flexDirection, 0);
        this.f102713b = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_flexWrap, 0);
        this.f102714c = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_justifyContent, 0);
        this.f102715d = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_alignItems, 0);
        this.f102716e = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_alignContent, 0);
        this.f102717f = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C40350k.C40360j.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C40350k.C40360j.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C40350k.C40360j.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f102721x = i2;
            this.f102720w = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f102721x = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f102720w = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C40330a();

        /* renamed from: a */
        public int f102724a = 1;

        /* renamed from: b */
        public float f102725b = 0.0f;

        /* renamed from: c */
        public float f102726c = 1.0f;

        /* renamed from: d */
        public int f102727d = -1;

        /* renamed from: e */
        public float f102728e = -1.0f;

        /* renamed from: f */
        public int f102729f = -1;

        /* renamed from: g */
        public int f102730g = -1;

        /* renamed from: v */
        public int f102731v = 16777215;

        /* renamed from: w */
        public int f102732w = 16777215;

        /* renamed from: x */
        public boolean f102733x;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        public class C40330a implements Parcelable.Creator<LayoutParams> {
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40350k.C40360j.FlexboxLayout_Layout);
            this.f102724a = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_Layout_layout_order, 1);
            this.f102725b = obtainStyledAttributes.getFloat(C40350k.C40360j.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f102726c = obtainStyledAttributes.getFloat(C40350k.C40360j.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f102727d = obtainStyledAttributes.getInt(C40350k.C40360j.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f102728e = obtainStyledAttributes.getFraction(C40350k.C40360j.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f102729f = obtainStyledAttributes.getDimensionPixelSize(C40350k.C40360j.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f102730g = obtainStyledAttributes.getDimensionPixelSize(C40350k.C40360j.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f102731v = obtainStyledAttributes.getDimensionPixelSize(C40350k.C40360j.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f102732w = obtainStyledAttributes.getDimensionPixelSize(C40350k.C40360j.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f102733x = obtainStyledAttributes.getBoolean(C40350k.C40360j.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F0 */
        public void mo132990F0(int i) {
            this.f102724a = i;
        }

        /* renamed from: F3 */
        public int mo132991F3() {
            return this.rightMargin;
        }

        /* renamed from: H0 */
        public int mo132992H0() {
            return this.f102727d;
        }

        /* renamed from: H1 */
        public float mo132993H1() {
            return this.f102728e;
        }

        /* renamed from: I3 */
        public int mo132994I3() {
            return this.f102730g;
        }

        /* renamed from: L0 */
        public float mo132995L0() {
            return this.f102726c;
        }

        /* renamed from: O0 */
        public void mo132996O0(int i) {
            this.f102731v = i;
        }

        /* renamed from: P3 */
        public int mo132997P3() {
            return this.f102732w;
        }

        /* renamed from: R0 */
        public void mo132998R0(boolean z) {
            this.f102733x = z;
        }

        /* renamed from: R2 */
        public void mo132999R2(float f) {
            this.f102726c = f;
        }

        /* renamed from: T1 */
        public boolean mo133000T1() {
            return this.f102733x;
        }

        /* renamed from: U0 */
        public int mo133001U0() {
            return this.f102729f;
        }

        /* renamed from: V3 */
        public void mo133002V3(int i) {
            this.f102727d = i;
        }

        /* renamed from: W2 */
        public void mo133003W2(int i) {
            this.f102729f = i;
        }

        /* renamed from: X2 */
        public int mo133004X2() {
            return this.bottomMargin;
        }

        /* renamed from: b3 */
        public int mo133005b3() {
            return this.leftMargin;
        }

        /* renamed from: c1 */
        public void mo133006c1(int i) {
            this.f102732w = i;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return this.f102724a;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: k2 */
        public int mo133012k2() {
            return this.f102731v;
        }

        /* renamed from: p3 */
        public void mo133013p3(int i) {
            this.height = i;
        }

        /* renamed from: q1 */
        public int mo133014q1() {
            return this.topMargin;
        }

        /* renamed from: s2 */
        public void mo133015s2(float f) {
            this.f102725b = f;
        }

        /* renamed from: w1 */
        public void mo133016w1(int i) {
            this.f102730g = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f102724a);
            parcel.writeFloat(this.f102725b);
            parcel.writeFloat(this.f102726c);
            parcel.writeInt(this.f102727d);
            parcel.writeFloat(this.f102728e);
            parcel.writeInt(this.f102729f);
            parcel.writeInt(this.f102730g);
            parcel.writeInt(this.f102731v);
            parcel.writeInt(this.f102732w);
            parcel.writeByte(this.f102733x ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: x2 */
        public void mo133017x2(float f) {
            this.f102728e = f;
        }

        /* renamed from: x3 */
        public void mo133018x3(int i) {
            this.width = i;
        }

        /* renamed from: z1 */
        public float mo133019z1() {
            return this.f102725b;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f102724a = layoutParams.f102724a;
            this.f102725b = layoutParams.f102725b;
            this.f102726c = layoutParams.f102726c;
            this.f102727d = layoutParams.f102727d;
            this.f102728e = layoutParams.f102728e;
            this.f102729f = layoutParams.f102729f;
            this.f102730g = layoutParams.f102730g;
            this.f102731v = layoutParams.f102731v;
            this.f102732w = layoutParams.f102732w;
            this.f102733x = layoutParams.f102733x;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f102724a = parcel.readInt();
            this.f102725b = parcel.readFloat();
            this.f102726c = parcel.readFloat();
            this.f102727d = parcel.readInt();
            this.f102728e = parcel.readFloat();
            this.f102729f = parcel.readInt();
            this.f102730g = parcel.readInt();
            this.f102731v = parcel.readInt();
            this.f102732w = parcel.readInt();
            this.f102733x = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
