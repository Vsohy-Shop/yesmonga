package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.core.content.res.C17483q;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.b */
public class C20537b extends C20684x {

    /* renamed from: g */
    public static final float f52979g = 0.0f;

    /* renamed from: h */
    public static final float f52980h = 70.0f;

    /* renamed from: i */
    public static final float f52981i = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    public float f52982a = 0.0f;

    /* renamed from: b */
    public float f52983b = 0.0f;

    /* renamed from: c */
    public float f52984c = 70.0f;

    /* renamed from: d */
    public float f52985d = 0.0f;

    /* renamed from: e */
    public float f52986e = 0.0f;

    /* renamed from: f */
    public float f52987f = f52981i;

    public C20537b() {
    }

    /* renamed from: h */
    public static float m95672h(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @C0359n0
    /* renamed from: a */
    public Path mo61606a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f10 = f3 - f;
        float f11 = f4 - f2;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f + f3) / 2.0f;
        float f14 = (f2 + f4) / 2.0f;
        float f15 = 0.25f * f12;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f10) < Math.abs(f11)) {
            float abs = Math.abs(f12 / (f11 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f52986e;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f16 + f;
            } else {
                f8 = f3 - f16;
                f9 = f4;
            }
            f5 = this.f52985d;
        }
        float f17 = f15 * f5 * f5;
        float f18 = f13 - f6;
        float f19 = f14 - f7;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.f52987f;
        float f22 = f15 * f21 * f21;
        if (f20 >= f17) {
            if (f20 > f22) {
                f17 = f22;
            } else {
                f17 = 0.0f;
            }
        }
        if (f17 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f17 / f20));
            f6 = ((f6 - f13) * sqrt) + f13;
            f7 = f14 + (sqrt * (f7 - f14));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public float mo61607b() {
        return this.f52984c;
    }

    /* renamed from: c */
    public float mo61608c() {
        return this.f52982a;
    }

    /* renamed from: d */
    public float mo61609d() {
        return this.f52983b;
    }

    /* renamed from: e */
    public void mo61610e(float f) {
        this.f52984c = f;
        this.f52987f = m95672h(f);
    }

    /* renamed from: f */
    public void mo61611f(float f) {
        this.f52982a = f;
        this.f52985d = m95672h(f);
    }

    /* renamed from: g */
    public void mo61612g(float f) {
        this.f52983b = f;
        this.f52986e = m95672h(f);
    }

    @SuppressLint({"RestrictedApi"})
    public C20537b(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53079j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo61612g(C17483q.m80234j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        mo61611f(C17483q.m80234j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        mo61610e(C17483q.m80234j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
