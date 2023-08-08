package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.C0336f;
import androidx.annotation.C0337f0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import androidx.core.graphics.C17586h0;
import com.google.android.material.C31076a;
import com.google.android.material.resources.C31499b;

/* renamed from: com.google.android.material.color.s */
public class C31266s {

    /* renamed from: a */
    public static final float f75265a = 1.0f;

    /* renamed from: b */
    public static final float f75266b = 0.54f;

    /* renamed from: c */
    public static final float f75267c = 0.38f;

    /* renamed from: d */
    public static final float f75268d = 0.32f;

    /* renamed from: e */
    public static final float f75269e = 0.12f;

    /* renamed from: f */
    public static final int f75270f = 40;

    /* renamed from: g */
    public static final int f75271g = 100;

    /* renamed from: h */
    public static final int f75272h = 90;

    /* renamed from: i */
    public static final int f75273i = 10;

    /* renamed from: j */
    public static final int f75274j = 80;

    /* renamed from: k */
    public static final int f75275k = 20;

    /* renamed from: l */
    public static final int f75276l = 30;

    /* renamed from: m */
    public static final int f75277m = 90;

    @C0354l
    /* renamed from: a */
    public static int m125950a(@C0354l int i, @C0337f0(from = 0, mo995to = 255) int i2) {
        return C17586h0.m80563B(i, (Color.alpha(i) * i2) / 255);
    }

    @C0354l
    /* renamed from: b */
    public static int m125951b(@C0359n0 Context context, @C0336f int i, @C0354l int i2) {
        TypedValue a = C31499b.m127355a(context, i);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    @C0354l
    /* renamed from: c */
    public static int m125952c(Context context, @C0336f int i, String str) {
        return C31499b.m127361g(context, i, str);
    }

    @C0354l
    /* renamed from: d */
    public static int m125953d(@C0359n0 View view, @C0336f int i) {
        return C31499b.m127362h(view, i);
    }

    @C0354l
    /* renamed from: e */
    public static int m125954e(@C0359n0 View view, @C0336f int i, @C0354l int i2) {
        return m125951b(view.getContext(), i, i2);
    }

    @C0354l
    /* renamed from: f */
    public static int m125955f(@C0354l int i, @C0337f0(from = 0, mo995to = 100) int i2) {
        C31265r c = C31265r.m125939c(i);
        c.mo89239l((float) i2);
        return c.mo89240m();
    }

    @C0359n0
    /* renamed from: g */
    public static C31246j m125956g(@C0354l int i, boolean z) {
        if (z) {
            return new C31246j(m125955f(i, 40), m125955f(i, 100), m125955f(i, 90), m125955f(i, 10));
        }
        return new C31246j(m125955f(i, 80), m125955f(i, 20), m125955f(i, 30), m125955f(i, 90));
    }

    @C0359n0
    /* renamed from: h */
    public static C31246j m125957h(@C0359n0 Context context, @C0354l int i) {
        return m125956g(i, C31499b.m127356b(context, C31076a.C31079c.isLightTheme, true));
    }

    @C0354l
    /* renamed from: i */
    public static int m125958i(@C0354l int i, @C0354l int i2) {
        return C31226a.m125795c(i, i2);
    }

    @C0354l
    /* renamed from: j */
    public static int m125959j(@C0359n0 Context context, @C0354l int i) {
        return m125958i(i, m125952c(context, C31076a.C31079c.colorPrimary, C31266s.class.getCanonicalName()));
    }

    /* renamed from: k */
    public static boolean m125960k(@C0354l int i) {
        return i != 0 && C17586h0.m80576m(i) > 0.5d;
    }

    @C0354l
    /* renamed from: l */
    public static int m125961l(@C0354l int i, @C0354l int i2) {
        return C17586h0.m80583t(i2, i);
    }

    @C0354l
    /* renamed from: m */
    public static int m125962m(@C0354l int i, @C0354l int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return m125961l(i, C17586h0.m80563B(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    @C0354l
    /* renamed from: n */
    public static int m125963n(@C0359n0 View view, @C0336f int i, @C0336f int i2) {
        return m125964o(view, i, i2, 1.0f);
    }

    @C0354l
    /* renamed from: o */
    public static int m125964o(@C0359n0 View view, @C0336f int i, @C0336f int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return m125962m(m125953d(view, i), m125953d(view, i2), f);
    }
}
