package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.ripple.b */
public class C31511b {

    /* renamed from: a */
    public static final boolean f76296a = true;

    /* renamed from: b */
    public static final int[] f76297b = {16842919};

    /* renamed from: c */
    public static final int[] f76298c = {16843623, 16842908};

    /* renamed from: d */
    public static final int[] f76299d = {16842908};

    /* renamed from: e */
    public static final int[] f76300e = {16843623};

    /* renamed from: f */
    public static final int[] f76301f = {16842913, 16842919};

    /* renamed from: g */
    public static final int[] f76302g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    public static final int[] f76303h = {16842913, 16842908};

    /* renamed from: i */
    public static final int[] f76304i = {16842913, 16843623};

    /* renamed from: j */
    public static final int[] f76305j = {16842913};

    /* renamed from: k */
    public static final int[] f76306k = {16842910, 16842919};
    @C0344h1

    /* renamed from: l */
    public static final String f76307l = C31511b.class.getSimpleName();
    @C0344h1

    /* renamed from: m */
    public static final String f76308m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    @C0359n0
    /* renamed from: a */
    public static ColorStateList m127402a(@C0363p0 ColorStateList colorStateList) {
        if (f76296a) {
            return new ColorStateList(new int[][]{f76305j, StateSet.NOTHING}, new int[]{m127404c(colorStateList, f76301f), m127404c(colorStateList, f76297b)});
        }
        int[] iArr = f76301f;
        int[] iArr2 = f76302g;
        int[] iArr3 = f76303h;
        int[] iArr4 = f76304i;
        int[] iArr5 = f76297b;
        int[] iArr6 = f76298c;
        int[] iArr7 = f76299d;
        int[] iArr8 = f76300e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f76305j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m127404c(colorStateList, iArr), m127404c(colorStateList, iArr2), m127404c(colorStateList, iArr3), m127404c(colorStateList, iArr4), 0, m127404c(colorStateList, iArr5), m127404c(colorStateList, iArr6), m127404c(colorStateList, iArr7), m127404c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    @C0354l
    /* renamed from: b */
    public static int m127403b(@C0354l int i) {
        return C17586h0.m80563B(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @C0354l
    /* renamed from: c */
    public static int m127404c(@C0363p0 ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f76296a) {
            return m127403b(i);
        }
        return i;
    }

    @C0359n0
    /* renamed from: d */
    public static ColorStateList m127405d(@C0363p0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f76306k, 0));
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m127406e(@C0359n0 int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
