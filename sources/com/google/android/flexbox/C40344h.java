package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18353r0;
import androidx.core.widget.C18472d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.android.flexbox.h */
public class C40344h {

    /* renamed from: f */
    public static final int f102841f = 10;

    /* renamed from: g */
    public static final long f102842g = 4294967295L;

    /* renamed from: h */
    public static final /* synthetic */ boolean f102843h = false;

    /* renamed from: a */
    public final C40340d f102844a;

    /* renamed from: b */
    public boolean[] f102845b;
    @C0363p0

    /* renamed from: c */
    public int[] f102846c;
    @C0363p0

    /* renamed from: d */
    public long[] f102847d;
    @C0363p0

    /* renamed from: e */
    public long[] f102848e;

    /* renamed from: com.google.android.flexbox.h$b */
    public static class C40346b {

        /* renamed from: a */
        public List<C40342f> f102849a;

        /* renamed from: b */
        public int f102850b;

        /* renamed from: a */
        public void mo133229a() {
            this.f102849a = null;
            this.f102850b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.h$c */
    public static class C40347c implements Comparable<C40347c> {

        /* renamed from: a */
        public int f102851a;

        /* renamed from: b */
        public int f102852b;

        public C40347c() {
        }

        /* renamed from: b */
        public int compareTo(@C0359n0 C40347c cVar) {
            int i = this.f102852b;
            int i2 = cVar.f102852b;
            if (i != i2) {
                return i - i2;
            }
            return this.f102851a - cVar.f102851a;
        }

        @C0359n0
        public String toString() {
            return "Order{order=" + this.f102852b + ", index=" + this.f102851a + C12361b.f30259j;
        }
    }

    public C40344h(C40340d dVar) {
        this.f102844a = dVar;
    }

    /* renamed from: A */
    public final int mo133177A(int i, FlexItem flexItem, int i2) {
        C40340d dVar = this.f102844a;
        int c = dVar.mo133024c(i, dVar.getPaddingLeft() + this.f102844a.getPaddingRight() + flexItem.mo133005b3() + flexItem.mo132991F3() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(c);
        if (size > flexItem.mo133012k2()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo133012k2(), View.MeasureSpec.getMode(c));
        }
        if (size < flexItem.mo133001U0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo133001U0(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    /* renamed from: B */
    public final int mo133178B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo133004X2();
        }
        return flexItem.mo132991F3();
    }

    /* renamed from: C */
    public final int mo133179C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo132991F3();
        }
        return flexItem.mo133004X2();
    }

    /* renamed from: D */
    public final int mo133180D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo133014q1();
        }
        return flexItem.mo133005b3();
    }

    /* renamed from: E */
    public final int mo133181E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo133005b3();
        }
        return flexItem.mo133014q1();
    }

    /* renamed from: F */
    public final int mo133182F(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    /* renamed from: G */
    public final int mo133183G(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    /* renamed from: H */
    public final int mo133184H(boolean z) {
        if (z) {
            return this.f102844a.getPaddingBottom();
        }
        return this.f102844a.getPaddingEnd();
    }

    /* renamed from: I */
    public final int mo133185I(boolean z) {
        if (z) {
            return this.f102844a.getPaddingEnd();
        }
        return this.f102844a.getPaddingBottom();
    }

    /* renamed from: J */
    public final int mo133186J(boolean z) {
        if (z) {
            return this.f102844a.getPaddingTop();
        }
        return this.f102844a.getPaddingStart();
    }

    /* renamed from: K */
    public final int mo133187K(boolean z) {
        if (z) {
            return this.f102844a.getPaddingStart();
        }
        return this.f102844a.getPaddingTop();
    }

    /* renamed from: L */
    public final int mo133188L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    public final int mo133189M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    public final boolean mo133190N(int i, int i2, C40342f fVar) {
        return i == i2 - 1 && fVar.mo133172d() != 0;
    }

    /* renamed from: O */
    public boolean mo133191O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f102844a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View e = this.f102844a.mo133027e(i);
            if (e != null && ((FlexItem) e.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo133192P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f102844a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.mo133000T1()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f102844a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int k = this.f102844a.mo133050k(view, i5, i6);
        if (k > 0) {
            i4 += k;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void mo133193Q(View view, C40342f fVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f102844a.getAlignItems();
        if (flexItem.mo132992H0() != -1) {
            alignItems = flexItem.mo132992H0();
        }
        int i5 = fVar.f102826g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo133014q1()) - flexItem.mo133004X2()) / 2;
                    if (this.f102844a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f102844a.getFlexWrap() != 2) {
                    int max = Math.max(fVar.f102831l - view.getBaseline(), flexItem.mo133014q1());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((fVar.f102831l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo133004X2());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f102844a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo133004X2(), i3, i8 - flexItem.mo133004X2());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo133014q1(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo133014q1());
                return;
            }
        }
        if (this.f102844a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo133014q1(), i3, i4 + flexItem.mo133014q1());
        } else {
            view.layout(i, i2 - flexItem.mo133004X2(), i3, i4 - flexItem.mo133004X2());
        }
    }

    /* renamed from: R */
    public void mo133194R(View view, C40342f fVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f102844a.getAlignItems();
        if (flexItem.mo132992H0() != -1) {
            alignItems = flexItem.mo132992H0();
        }
        int i5 = fVar.f102826g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C18353r0.m83082c(marginLayoutParams)) - C18353r0.m83081b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo132991F3(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo132991F3(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo133005b3(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo133005b3(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo133005b3(), i2, i3 + flexItem.mo133005b3(), i4);
        } else {
            view.layout(i - flexItem.mo132991F3(), i2, i3 - flexItem.mo132991F3(), i4);
        }
    }

    @C0344h1
    /* renamed from: S */
    public long mo133195S(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: T */
    public final void mo133196T(int i, int i2, C40342f fVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        C40342f fVar2 = fVar;
        int i9 = i3;
        int i10 = fVar2.f102824e;
        float f = fVar2.f102830k;
        float f2 = 0.0f;
        if (f > 0.0f && i9 <= i10) {
            float f3 = ((float) (i10 - i9)) / f;
            fVar2.f102824e = i4 + fVar2.f102825f;
            if (!z) {
                fVar2.f102826g = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z2 = false;
            int i12 = 0;
            float f4 = 0.0f;
            while (i11 < fVar2.f102827h) {
                int i13 = fVar2.f102834o + i11;
                View i14 = this.f102844a.mo133048i(i13);
                if (i14 == null || i14.getVisibility() == 8) {
                    int i15 = i2;
                    i6 = i10;
                    i5 = i11;
                } else {
                    FlexItem flexItem = (FlexItem) i14.getLayoutParams();
                    int flexDirection = this.f102844a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i10;
                        int i16 = i11;
                        int i17 = i;
                        int measuredWidth = i14.getMeasuredWidth();
                        long[] jArr = this.f102848e;
                        if (jArr != null) {
                            measuredWidth = mo133227y(jArr[i13]);
                        }
                        int measuredHeight = i14.getMeasuredHeight();
                        long[] jArr2 = this.f102848e;
                        int i18 = i16;
                        if (jArr2 != null) {
                            measuredHeight = mo133226x(jArr2[i13]);
                        }
                        if (this.f102845b[i13] || flexItem.mo132995L0() <= 0.0f) {
                            int i19 = i2;
                            i8 = i18;
                        } else {
                            float L0 = ((float) measuredWidth) - (flexItem.mo132995L0() * f3);
                            i8 = i18;
                            if (i8 == fVar2.f102827h - 1) {
                                L0 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(L0);
                            if (round < flexItem.mo133001U0()) {
                                round = flexItem.mo133001U0();
                                this.f102845b[i13] = true;
                                fVar2.f102830k -= flexItem.mo132995L0();
                                z2 = true;
                            } else {
                                f4 += L0 - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int z3 = mo133228z(i2, flexItem, fVar2.f102832m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i14.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = i14.getMeasuredWidth();
                            int measuredHeight2 = i14.getMeasuredHeight();
                            mo133202Z(i13, makeMeasureSpec, z3, i14);
                            this.f102844a.mo133049j(i13, i14);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i12, measuredHeight + flexItem.mo133014q1() + flexItem.mo133004X2() + this.f102844a.mo133029g(i14));
                        fVar2.f102824e += measuredWidth + flexItem.mo133005b3() + flexItem.mo132991F3();
                        i7 = max;
                    } else {
                        int measuredHeight3 = i14.getMeasuredHeight();
                        long[] jArr3 = this.f102848e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo133226x(jArr3[i13]);
                        }
                        int measuredWidth3 = i14.getMeasuredWidth();
                        long[] jArr4 = this.f102848e;
                        if (jArr4 != null) {
                            measuredWidth3 = mo133227y(jArr4[i13]);
                        }
                        if (this.f102845b[i13] || flexItem.mo132995L0() <= f2) {
                            i6 = i10;
                            i5 = i11;
                            int i20 = i;
                        } else {
                            float L02 = ((float) measuredHeight3) - (flexItem.mo132995L0() * f3);
                            if (i11 == fVar2.f102827h - 1) {
                                L02 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(L02);
                            if (round2 < flexItem.mo132994I3()) {
                                round2 = flexItem.mo132994I3();
                                this.f102845b[i13] = true;
                                fVar2.f102830k -= flexItem.mo132995L0();
                                i6 = i10;
                                i5 = i11;
                                z2 = true;
                            } else {
                                f4 += L02 - ((float) round2);
                                i6 = i10;
                                i5 = i11;
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int A = mo133177A(i, flexItem, fVar2.f102832m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i14.measure(A, makeMeasureSpec2);
                            measuredWidth3 = i14.getMeasuredWidth();
                            int measuredHeight4 = i14.getMeasuredHeight();
                            mo133202Z(i13, A, makeMeasureSpec2, i14);
                            this.f102844a.mo133049j(i13, i14);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i12, measuredWidth3 + flexItem.mo133005b3() + flexItem.mo132991F3() + this.f102844a.mo133029g(i14));
                        fVar2.f102824e += measuredHeight3 + flexItem.mo133014q1() + flexItem.mo133004X2();
                        int i21 = i2;
                    }
                    fVar2.f102826g = Math.max(fVar2.f102826g, i7);
                    i12 = i7;
                }
                i11 = i5 + 1;
                i10 = i6;
                f2 = 0.0f;
            }
            int i22 = i2;
            int i23 = i10;
            if (z2 && i23 != fVar2.f102824e) {
                mo133196T(i, i2, fVar, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    public final int[] mo133197U(int i, List<C40347c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C40347c next : list) {
            int i3 = next.f102851a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, next.f102852b);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    public final void mo133198V(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo133005b3()) - flexItem.mo132991F3()) - this.f102844a.mo133029g(view), flexItem.mo133001U0()), flexItem.mo133012k2());
        long[] jArr = this.f102848e;
        if (jArr != null) {
            i3 = mo133226x(jArr[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        mo133202Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f102844a.mo133049j(i2, view);
    }

    /* renamed from: W */
    public final void mo133199W(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo133014q1()) - flexItem.mo133004X2()) - this.f102844a.mo133029g(view), flexItem.mo132994I3()), flexItem.mo132997P3());
        long[] jArr = this.f102848e;
        if (jArr != null) {
            i3 = mo133227y(jArr[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        mo133202Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f102844a.mo133049j(i2, view);
    }

    /* renamed from: X */
    public void mo133200X() {
        mo133201Y(0);
    }

    /* renamed from: Y */
    public void mo133201Y(int i) {
        int i2;
        View i3;
        int i4 = i;
        if (i4 < this.f102844a.getFlexItemCount()) {
            int flexDirection = this.f102844a.getFlexDirection();
            if (this.f102844a.getAlignItems() == 4) {
                int[] iArr = this.f102846c;
                if (iArr != null) {
                    i2 = iArr[i4];
                } else {
                    i2 = 0;
                }
                List<C40342f> flexLinesInternal = this.f102844a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i2 < size) {
                    C40342f fVar = flexLinesInternal.get(i2);
                    int i5 = fVar.f102827h;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int i7 = fVar.f102834o + i6;
                        if (!(i6 >= this.f102844a.getFlexItemCount() || (i3 = this.f102844a.mo133048i(i7)) == null || i3.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) i3.getLayoutParams();
                            if (flexItem.mo132992H0() == -1 || flexItem.mo132992H0() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    mo133199W(i3, fVar.f102826g, i7);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    mo133198V(i3, fVar.f102826g, i7);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C40342f next : this.f102844a.getFlexLinesInternal()) {
                Iterator<Integer> it = next.f102833n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View i8 = this.f102844a.mo133048i(next2.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            mo133199W(i8, next.f102826g, next2.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            mo133198V(i8, next.f102826g, next2.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo133202Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f102847d;
        if (jArr != null) {
            jArr[i] = mo133195S(i2, i3);
        }
        long[] jArr2 = this.f102848e;
        if (jArr2 != null) {
            jArr2[i] = mo133195S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    public final void mo133203a(List<C40342f> list, C40342f fVar, int i, int i2) {
        fVar.f102832m = i2;
        this.f102844a.mo133047h(fVar);
        fVar.f102835p = i;
        list.add(fVar);
    }

    /* renamed from: b */
    public void mo133204b(C40346b bVar, int i, int i2, int i3, int i4, int i5, @C0363p0 List<C40342f> list) {
        int i6;
        int i7;
        C40346b bVar2;
        int i8;
        int i9;
        List<C40342f> list2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view;
        boolean z;
        int i17;
        C40346b bVar3 = bVar;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean l = this.f102844a.mo133051l();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        bVar3.f102849a = arrayList;
        boolean z2 = i20 == -1;
        int K = mo133187K(l);
        int I = mo133185I(l);
        int J = mo133186J(l);
        int H = mo133184H(l);
        C40342f fVar = new C40342f();
        int i21 = i4;
        fVar.f102834o = i21;
        int i22 = I + K;
        fVar.f102824e = i22;
        int flexItemCount = this.f102844a.getFlexItemCount();
        boolean z3 = z2;
        int i23 = Integer.MIN_VALUE;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (i6 >= flexItemCount) {
                i7 = i25;
                bVar2 = bVar;
                break;
            }
            View i27 = this.f102844a.mo133048i(i6);
            if (i27 != null) {
                if (i27.getVisibility() != 8) {
                    if (i27 instanceof CompoundButton) {
                        mo133224v((CompoundButton) i27);
                    }
                    FlexItem flexItem = (FlexItem) i27.getLayoutParams();
                    int i28 = flexItemCount;
                    if (flexItem.mo132992H0() == 4) {
                        fVar.f102833n.add(Integer.valueOf(i6));
                    }
                    int G = mo133183G(flexItem, l);
                    if (flexItem.mo132993H1() != -1.0f && mode == 1073741824) {
                        G = Math.round(((float) size) * flexItem.mo132993H1());
                    }
                    if (l) {
                        int c = this.f102844a.mo133024c(i18, i22 + mo133181E(flexItem, true) + mo133179C(flexItem, true), G);
                        i9 = size;
                        i8 = mode;
                        int f = this.f102844a.mo133028f(i19, J + H + mo133180D(flexItem, true) + mo133178B(flexItem, true) + i24, mo133182F(flexItem, true));
                        i27.measure(c, f);
                        mo133202Z(i6, c, f, i27);
                        i14 = c;
                    } else {
                        i9 = size;
                        i8 = mode;
                        int c2 = this.f102844a.mo133024c(i19, J + H + mo133180D(flexItem, false) + mo133178B(flexItem, false) + i24, mo133182F(flexItem, false));
                        int f2 = this.f102844a.mo133028f(i18, mo133181E(flexItem, false) + i22 + mo133179C(flexItem, false), G);
                        i27.measure(c2, f2);
                        mo133202Z(i6, c2, f2, i27);
                        i14 = f2;
                    }
                    this.f102844a.mo133049j(i6, i27);
                    mo133211i(i27, i6);
                    i25 = View.combineMeasuredStates(i25, i27.getMeasuredState());
                    int i29 = fVar.f102824e;
                    int C = mo133179C(flexItem, l) + mo133189M(i27, l) + mo133181E(flexItem, l);
                    int i30 = i24;
                    int i31 = i28;
                    C40342f fVar2 = fVar;
                    int i32 = i22;
                    View view2 = i27;
                    int i33 = i29;
                    int i34 = C;
                    int i35 = i6;
                    View view3 = view2;
                    list2 = arrayList;
                    int i36 = i35;
                    int i37 = i14;
                    if (mo133192P(i27, i8, i9, i33, i34, flexItem, i35, i26, arrayList.size())) {
                        if (fVar2.mo133172d() > 0) {
                            C40342f fVar3 = fVar2;
                            mo133203a(list2, fVar3, i36 > 0 ? i36 - 1 : 0, i30);
                            i24 = fVar3.f102826g + i30;
                        } else {
                            i24 = i30;
                        }
                        if (!l) {
                            i12 = i2;
                            view = view3;
                            i6 = i36;
                            int i38 = i37;
                            if (flexItem.getWidth() == -1) {
                                C40340d dVar = this.f102844a;
                                view.measure(dVar.mo133024c(i12, dVar.getPaddingLeft() + this.f102844a.getPaddingRight() + flexItem.mo133005b3() + flexItem.mo132991F3() + i24, flexItem.getWidth()), i38);
                                mo133211i(view, i6);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            C40340d dVar2 = this.f102844a;
                            i12 = i2;
                            i6 = i36;
                            view = view3;
                            view.measure(i37, dVar2.mo133028f(i12, dVar2.getPaddingTop() + this.f102844a.getPaddingBottom() + flexItem.mo133014q1() + flexItem.mo133004X2() + i24, flexItem.getHeight()));
                            mo133211i(view, i6);
                        } else {
                            i12 = i2;
                            view = view3;
                            i6 = i36;
                        }
                        fVar = new C40342f();
                        z = true;
                        fVar.f102827h = 1;
                        i11 = i32;
                        fVar.f102824e = i11;
                        fVar.f102834o = i6;
                        i15 = Integer.MIN_VALUE;
                        i16 = 0;
                    } else {
                        i12 = i2;
                        view = view3;
                        i6 = i36;
                        fVar = fVar2;
                        i11 = i32;
                        z = true;
                        fVar.f102827h++;
                        i16 = i26 + 1;
                        i24 = i30;
                        i15 = i23;
                    }
                    fVar.f102836q |= flexItem.mo133019z1() != 0.0f ? z : false;
                    fVar.f102837r |= flexItem.mo132995L0() != 0.0f ? z : false;
                    int[] iArr = this.f102846c;
                    if (iArr != null) {
                        iArr[i6] = list2.size();
                    }
                    fVar.f102824e += mo133189M(view, l) + mo133181E(flexItem, l) + mo133179C(flexItem, l);
                    fVar.f102829j += flexItem.mo133019z1();
                    fVar.f102830k += flexItem.mo132995L0();
                    this.f102844a.mo133023b(view, i6, i16, fVar);
                    int max = Math.max(i15, mo133188L(view, l) + mo133180D(flexItem, l) + mo133178B(flexItem, l) + this.f102844a.mo133029g(view));
                    fVar.f102826g = Math.max(fVar.f102826g, max);
                    if (l) {
                        if (this.f102844a.getFlexWrap() != 2) {
                            fVar.f102831l = Math.max(fVar.f102831l, view.getBaseline() + flexItem.mo133014q1());
                        } else {
                            fVar.f102831l = Math.max(fVar.f102831l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo133004X2());
                        }
                    }
                    i13 = i28;
                    if (mo133190N(i6, i13, fVar)) {
                        mo133203a(list2, fVar, i6, i24);
                        i24 += fVar.f102826g;
                    }
                    i10 = i5;
                    if (i10 == -1 || list2.size() <= 0 || list2.get(list2.size() - (z ? 1 : 0)).f102835p < i10 || i6 < i10 || z3) {
                        i17 = i3;
                    } else {
                        i24 = -fVar.mo133169a();
                        i17 = i3;
                        z3 = z;
                    }
                    if (i24 > i17 && z3) {
                        bVar2 = bVar;
                        i7 = i25;
                        break;
                    }
                    i26 = i16;
                    i23 = max;
                    i21 = i6 + 1;
                    C40346b bVar4 = bVar;
                    i18 = i;
                    flexItemCount = i13;
                    i19 = i12;
                    i22 = i11;
                    arrayList = list2;
                    size = i9;
                    i20 = i10;
                    mode = i8;
                } else {
                    fVar.f102828i++;
                    fVar.f102827h++;
                    if (mo133190N(i6, flexItemCount, fVar)) {
                        mo133203a(arrayList, fVar, i6, i24);
                    }
                }
            } else if (mo133190N(i6, flexItemCount, fVar)) {
                mo133203a(arrayList, fVar, i6, i24);
            }
            int i39 = i3;
            i9 = size;
            i8 = mode;
            i12 = i19;
            i10 = i20;
            list2 = arrayList;
            i11 = i22;
            i13 = flexItemCount;
            i21 = i6 + 1;
            C40346b bVar42 = bVar;
            i18 = i;
            flexItemCount = i13;
            i19 = i12;
            i22 = i11;
            arrayList = list2;
            size = i9;
            i20 = i10;
            mode = i8;
        }
        bVar2.f102850b = i7;
    }

    /* renamed from: c */
    public void mo133205c(C40346b bVar, int i, int i2) {
        mo133204b(bVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<C40342f>) null);
    }

    /* renamed from: d */
    public void mo133206d(C40346b bVar, int i, int i2, int i3, int i4, @C0363p0 List<C40342f> list) {
        mo133204b(bVar, i, i2, i3, i4, -1, list);
    }

    /* renamed from: e */
    public void mo133207e(C40346b bVar, int i, int i2, int i3, int i4, List<C40342f> list) {
        mo133204b(bVar, i, i2, i3, 0, i4, list);
    }

    /* renamed from: f */
    public void mo133208f(C40346b bVar, int i, int i2) {
        mo133204b(bVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<C40342f>) null);
    }

    /* renamed from: g */
    public void mo133209g(C40346b bVar, int i, int i2, int i3, int i4, @C0363p0 List<C40342f> list) {
        mo133204b(bVar, i2, i, i3, i4, -1, list);
    }

    /* renamed from: h */
    public void mo133210h(C40346b bVar, int i, int i2, int i3, int i4, List<C40342f> list) {
        mo133204b(bVar, i2, i, i3, 0, i4, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133211i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo133001U0()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo133001U0()
        L_0x0019:
            r3 = r4
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo133012k2()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo133012k2()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo132994I3()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo132994I3()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo132997P3()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo132997P3()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.mo133202Z(r8, r1, r0, r7)
            com.google.android.flexbox.d r0 = r6.f102844a
            r0.mo133049j(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C40344h.mo133211i(android.view.View, int):void");
    }

    /* renamed from: j */
    public void mo133212j(List<C40342f> list, int i) {
        int i2 = this.f102846c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f102846c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f102847d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* renamed from: k */
    public final List<C40342f> mo133213k(List<C40342f> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C40342f fVar = new C40342f();
        fVar.f102826g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(fVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: l */
    public final List<C40347c> mo133214l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C40347c cVar = new C40347c();
            cVar.f102852b = ((FlexItem) this.f102844a.mo133027e(i2).getLayoutParams()).getOrder();
            cVar.f102851a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: m */
    public int[] mo133215m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f102844a.getFlexItemCount();
        return mo133197U(flexItemCount, mo133214l(flexItemCount), sparseIntArray);
    }

    /* renamed from: n */
    public int[] mo133216n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f102844a.getFlexItemCount();
        List<C40347c> l = mo133214l(flexItemCount);
        C40347c cVar = new C40347c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f102852b = 1;
        } else {
            cVar.f102852b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            cVar.f102851a = flexItemCount;
        } else if (i < this.f102844a.getFlexItemCount()) {
            cVar.f102851a = i;
            while (i < flexItemCount) {
                l.get(i).f102851a++;
                i++;
            }
        } else {
            cVar.f102851a = flexItemCount;
        }
        l.add(cVar);
        return mo133197U(flexItemCount + 1, l, sparseIntArray);
    }

    /* renamed from: o */
    public void mo133217o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f102844a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C40342f> flexLinesInternal = this.f102844a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f102844a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f102826g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f102844a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C40342f fVar = new C40342f();
                    fVar.f102826g = i7;
                    flexLinesInternal.add(0, fVar);
                } else if (alignContent == 2) {
                    this.f102844a.setFlexLines(mo133213k(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                C40342f fVar2 = flexLinesInternal.get(i6);
                                float f2 = ((float) fVar2.f102826g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                fVar2.f102826g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f102844a.setFlexLines(mo133213k(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C40342f fVar3 = new C40342f();
                        fVar3.f102826g = size4;
                        for (C40342f add : flexLinesInternal) {
                            arrayList.add(fVar3);
                            arrayList.add(add);
                            arrayList.add(fVar3);
                        }
                        this.f102844a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C40342f fVar4 = new C40342f();
                            if (i6 == flexLinesInternal.size() - 2) {
                                fVar4.f102826g = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                fVar4.f102826g = Math.round(size5);
                            }
                            int i8 = fVar4.f102826g;
                            f3 += size5 - ((float) i8);
                            if (f3 > 1.0f) {
                                fVar4.f102826g = i8 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                fVar4.f102826g = i8 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(fVar4);
                        }
                        i6++;
                    }
                    this.f102844a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo133218p(int i, int i2) {
        mo133219q(i, i2, 0);
    }

    /* renamed from: q */
    public void mo133219q(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        mo133220r(this.f102844a.getFlexItemCount());
        if (i3 < this.f102844a.getFlexItemCount()) {
            int flexDirection = this.f102844a.getFlexDirection();
            int flexDirection2 = this.f102844a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = this.f102844a.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                i6 = this.f102844a.getPaddingLeft();
                i4 = this.f102844a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f102844a.getLargestMainSize();
                }
                i6 = this.f102844a.getPaddingTop();
                i4 = this.f102844a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i8 = i6 + i4;
            int[] iArr = this.f102846c;
            if (iArr != null) {
                i7 = iArr[i3];
            } else {
                i7 = 0;
            }
            List<C40342f> flexLinesInternal = this.f102844a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i7 < size2) {
                C40342f fVar = flexLinesInternal.get(i7);
                int i9 = fVar.f102824e;
                if (i9 < i5 && fVar.f102836q) {
                    mo133225w(i, i2, fVar, i5, i8, false);
                } else if (i9 > i5 && fVar.f102837r) {
                    mo133196T(i, i2, fVar, i5, i8, false);
                }
                i7++;
            }
        }
    }

    /* renamed from: r */
    public final void mo133220r(int i) {
        boolean[] zArr = this.f102845b;
        if (zArr == null) {
            this.f102845b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f102845b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: s */
    public void mo133221s(int i) {
        int[] iArr = this.f102846c;
        if (iArr == null) {
            this.f102846c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f102846c = Arrays.copyOf(this.f102846c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: t */
    public void mo133222t(int i) {
        long[] jArr = this.f102847d;
        if (jArr == null) {
            this.f102847d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f102847d = Arrays.copyOf(this.f102847d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: u */
    public void mo133223u(int i) {
        long[] jArr = this.f102848e;
        if (jArr == null) {
            this.f102848e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f102848e = Arrays.copyOf(this.f102848e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: v */
    public final void mo133224v(CompoundButton compoundButton) {
        int i;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int U0 = flexItem.mo133001U0();
        int I3 = flexItem.mo132994I3();
        Drawable a = C18472d.m83645a(compoundButton);
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.getMinimumWidth();
        }
        if (a != null) {
            i2 = a.getMinimumHeight();
        }
        if (U0 == -1) {
            U0 = i;
        }
        flexItem.mo133003W2(U0);
        if (I3 == -1) {
            I3 = i2;
        }
        flexItem.mo133016w1(I3);
    }

    /* renamed from: w */
    public final void mo133225w(int i, int i2, C40342f fVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        C40342f fVar2 = fVar;
        int i9 = i3;
        float f = fVar2.f102829j;
        float f2 = 0.0f;
        if (f > 0.0f && i9 >= (i5 = fVar2.f102824e)) {
            float f3 = ((float) (i9 - i5)) / f;
            fVar2.f102824e = i4 + fVar2.f102825f;
            if (!z) {
                fVar2.f102826g = Integer.MIN_VALUE;
            }
            int i10 = 0;
            boolean z2 = false;
            int i11 = 0;
            float f4 = 0.0f;
            while (i10 < fVar2.f102827h) {
                int i12 = fVar2.f102834o + i10;
                View i13 = this.f102844a.mo133048i(i12);
                if (i13 == null || i13.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i5;
                } else {
                    FlexItem flexItem = (FlexItem) i13.getLayoutParams();
                    int flexDirection = this.f102844a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i15 = i5;
                        int i16 = i;
                        int measuredWidth = i13.getMeasuredWidth();
                        long[] jArr = this.f102848e;
                        if (jArr != null) {
                            measuredWidth = mo133227y(jArr[i12]);
                        }
                        int measuredHeight = i13.getMeasuredHeight();
                        long[] jArr2 = this.f102848e;
                        i6 = i15;
                        if (jArr2 != null) {
                            measuredHeight = mo133226x(jArr2[i12]);
                        }
                        if (this.f102845b[i12] || flexItem.mo133019z1() <= 0.0f) {
                            int i17 = i2;
                        } else {
                            float z1 = ((float) measuredWidth) + (flexItem.mo133019z1() * f3);
                            if (i10 == fVar2.f102827h - 1) {
                                z1 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(z1);
                            if (round > flexItem.mo133012k2()) {
                                round = flexItem.mo133012k2();
                                this.f102845b[i12] = true;
                                fVar2.f102829j -= flexItem.mo133019z1();
                                z2 = true;
                            } else {
                                f4 += z1 - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int z3 = mo133228z(i2, flexItem, fVar2.f102832m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i13.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = i13.getMeasuredWidth();
                            int measuredHeight2 = i13.getMeasuredHeight();
                            mo133202Z(i12, makeMeasureSpec, z3, i13);
                            this.f102844a.mo133049j(i12, i13);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i11, measuredHeight + flexItem.mo133014q1() + flexItem.mo133004X2() + this.f102844a.mo133029g(i13));
                        fVar2.f102824e += measuredWidth + flexItem.mo133005b3() + flexItem.mo132991F3();
                        i7 = max;
                    } else {
                        int measuredHeight3 = i13.getMeasuredHeight();
                        long[] jArr3 = this.f102848e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo133226x(jArr3[i12]);
                        }
                        int measuredWidth3 = i13.getMeasuredWidth();
                        long[] jArr4 = this.f102848e;
                        if (jArr4 != null) {
                            measuredWidth3 = mo133227y(jArr4[i12]);
                        }
                        if (this.f102845b[i12] || flexItem.mo133019z1() <= f2) {
                            i8 = i5;
                            int i18 = i;
                        } else {
                            float z12 = ((float) measuredHeight3) + (flexItem.mo133019z1() * f3);
                            if (i10 == fVar2.f102827h - 1) {
                                z12 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(z12);
                            if (round2 > flexItem.mo132997P3()) {
                                round2 = flexItem.mo132997P3();
                                this.f102845b[i12] = true;
                                fVar2.f102829j -= flexItem.mo133019z1();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += z12 - ((float) round2);
                                i8 = i5;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int A = mo133177A(i, flexItem, fVar2.f102832m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i13.measure(A, makeMeasureSpec2);
                            measuredWidth3 = i13.getMeasuredWidth();
                            int measuredHeight4 = i13.getMeasuredHeight();
                            mo133202Z(i12, A, makeMeasureSpec2, i13);
                            this.f102844a.mo133049j(i12, i13);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i11, measuredWidth3 + flexItem.mo133005b3() + flexItem.mo132991F3() + this.f102844a.mo133029g(i13));
                        fVar2.f102824e += measuredHeight3 + flexItem.mo133014q1() + flexItem.mo133004X2();
                        int i19 = i2;
                        i6 = i8;
                    }
                    fVar2.f102826g = Math.max(fVar2.f102826g, i7);
                    i11 = i7;
                }
                i10++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i20 = i2;
            int i21 = i5;
            if (z2 && i21 != fVar2.f102824e) {
                mo133225w(i, i2, fVar, i3, i4, true);
            }
        }
    }

    /* renamed from: x */
    public int mo133226x(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: y */
    public int mo133227y(long j) {
        return (int) j;
    }

    /* renamed from: z */
    public final int mo133228z(int i, FlexItem flexItem, int i2) {
        C40340d dVar = this.f102844a;
        int f = dVar.mo133028f(i, dVar.getPaddingTop() + this.f102844a.getPaddingBottom() + flexItem.mo133014q1() + flexItem.mo133004X2() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(f);
        if (size > flexItem.mo132997P3()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo132997P3(), View.MeasureSpec.getMode(f));
        }
        if (size < flexItem.mo132994I3()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo132994I3(), View.MeasureSpec.getMode(f));
        }
        return f;
    }
}
