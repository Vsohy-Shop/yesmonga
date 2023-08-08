package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.core.graphics.C17586h0;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31499b;

/* renamed from: com.google.android.material.elevation.a */
public class C31333a {

    /* renamed from: f */
    public static final float f75533f = 4.5f;

    /* renamed from: g */
    public static final float f75534g = 2.0f;

    /* renamed from: h */
    public static final int f75535h = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    public final boolean f75536a;

    /* renamed from: b */
    public final int f75537b;

    /* renamed from: c */
    public final int f75538c;

    /* renamed from: d */
    public final int f75539d;

    /* renamed from: e */
    public final float f75540e;

    public C31333a(@C0359n0 Context context) {
        this(C31499b.m127356b(context, C31076a.C31079c.elevationOverlayEnabled, false), C31266s.m125951b(context, C31076a.C31079c.elevationOverlayColor, 0), C31266s.m125951b(context, C31076a.C31079c.elevationOverlayAccentColor, 0), C31266s.m125951b(context, C31076a.C31079c.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public int mo89545a(float f) {
        return Math.round(mo89546b(f) * 255.0f);
    }

    /* renamed from: b */
    public float mo89546b(float f) {
        float f2 = this.f75540e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @C0354l
    /* renamed from: c */
    public int mo89547c(@C0354l int i, float f) {
        int i2;
        float b = mo89546b(f);
        int alpha = Color.alpha(i);
        int m = C31266s.m125962m(C17586h0.m80563B(i, 255), this.f75537b, b);
        if (b > 0.0f && (i2 = this.f75538c) != 0) {
            m = C31266s.m125961l(m, C17586h0.m80563B(i2, f75535h));
        }
        return C17586h0.m80563B(m, alpha);
    }

    @C0354l
    /* renamed from: d */
    public int mo89548d(@C0354l int i, float f, @C0359n0 View view) {
        return mo89547c(i, f + mo89553i(view));
    }

    @C0354l
    /* renamed from: e */
    public int mo89549e(@C0354l int i, float f) {
        if (!this.f75536a || !mo89557m(i)) {
            return i;
        }
        return mo89547c(i, f);
    }

    @C0354l
    /* renamed from: f */
    public int mo89550f(@C0354l int i, float f, @C0359n0 View view) {
        return mo89549e(i, f + mo89553i(view));
    }

    @C0354l
    /* renamed from: g */
    public int mo89551g(float f) {
        return mo89549e(this.f75539d, f);
    }

    @C0354l
    /* renamed from: h */
    public int mo89552h(float f, @C0359n0 View view) {
        return mo89551g(f + mo89553i(view));
    }

    /* renamed from: i */
    public float mo89553i(@C0359n0 View view) {
        return C31432x.m127015j(view);
    }

    @C0354l
    /* renamed from: j */
    public int mo89554j() {
        return this.f75537b;
    }

    @C0354l
    /* renamed from: k */
    public int mo89555k() {
        return this.f75539d;
    }

    /* renamed from: l */
    public boolean mo89556l() {
        return this.f75536a;
    }

    /* renamed from: m */
    public final boolean mo89557m(@C0354l int i) {
        return C17586h0.m80563B(i, 255) == this.f75539d;
    }

    public C31333a(boolean z, @C0354l int i, @C0354l int i2, @C0354l int i3, float f) {
        this.f75536a = z;
        this.f75537b = i;
        this.f75538c = i2;
        this.f75539d = i3;
        this.f75540e = f;
    }
}
