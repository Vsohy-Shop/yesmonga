package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import com.airbnb.lottie.C21495g;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.value.a */
public class C21693a<T> {

    /* renamed from: q */
    public static final float f56092q = -3987645.8f;

    /* renamed from: r */
    public static final int f56093r = 784923401;
    @C0363p0

    /* renamed from: a */
    public final C21495g f56094a;
    @C0363p0

    /* renamed from: b */
    public final T f56095b;
    @C0363p0

    /* renamed from: c */
    public T f56096c;
    @C0363p0

    /* renamed from: d */
    public final Interpolator f56097d;
    @C0363p0

    /* renamed from: e */
    public final Interpolator f56098e;
    @C0363p0

    /* renamed from: f */
    public final Interpolator f56099f;

    /* renamed from: g */
    public final float f56100g;
    @C0363p0

    /* renamed from: h */
    public Float f56101h;

    /* renamed from: i */
    public float f56102i;

    /* renamed from: j */
    public float f56103j;

    /* renamed from: k */
    public int f56104k;

    /* renamed from: l */
    public int f56105l;

    /* renamed from: m */
    public float f56106m;

    /* renamed from: n */
    public float f56107n;

    /* renamed from: o */
    public PointF f56108o;

    /* renamed from: p */
    public PointF f56109p;

    public C21693a(C21495g gVar, @C0363p0 T t, @C0363p0 T t2, @C0363p0 Interpolator interpolator, float f, @C0363p0 Float f2) {
        this.f56102i = -3987645.8f;
        this.f56103j = -3987645.8f;
        this.f56104k = f56093r;
        this.f56105l = f56093r;
        this.f56106m = Float.MIN_VALUE;
        this.f56107n = Float.MIN_VALUE;
        this.f56108o = null;
        this.f56109p = null;
        this.f56094a = gVar;
        this.f56095b = t;
        this.f56096c = t2;
        this.f56097d = interpolator;
        this.f56098e = null;
        this.f56099f = null;
        this.f56100g = f;
        this.f56101h = f2;
    }

    /* renamed from: a */
    public boolean mo64721a(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return f >= mo64725e() && f < mo64722b();
    }

    /* renamed from: b */
    public float mo64722b() {
        if (this.f56094a == null) {
            return 1.0f;
        }
        if (this.f56107n == Float.MIN_VALUE) {
            if (this.f56101h == null) {
                this.f56107n = 1.0f;
            } else {
                this.f56107n = mo64725e() + ((this.f56101h.floatValue() - this.f56100g) / this.f56094a.mo64122e());
            }
        }
        return this.f56107n;
    }

    /* renamed from: c */
    public float mo64723c() {
        if (this.f56103j == -3987645.8f) {
            this.f56103j = ((Float) this.f56096c).floatValue();
        }
        return this.f56103j;
    }

    /* renamed from: d */
    public int mo64724d() {
        if (this.f56105l == 784923401) {
            this.f56105l = ((Integer) this.f56096c).intValue();
        }
        return this.f56105l;
    }

    /* renamed from: e */
    public float mo64725e() {
        C21495g gVar = this.f56094a;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f56106m == Float.MIN_VALUE) {
            this.f56106m = (this.f56100g - gVar.mo64135r()) / this.f56094a.mo64122e();
        }
        return this.f56106m;
    }

    /* renamed from: f */
    public float mo64726f() {
        if (this.f56102i == -3987645.8f) {
            this.f56102i = ((Float) this.f56095b).floatValue();
        }
        return this.f56102i;
    }

    /* renamed from: g */
    public int mo64727g() {
        if (this.f56104k == 784923401) {
            this.f56104k = ((Integer) this.f56095b).intValue();
        }
        return this.f56104k;
    }

    /* renamed from: h */
    public boolean mo64728h() {
        return this.f56097d == null && this.f56098e == null && this.f56099f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f56095b + ", endValue=" + this.f56096c + ", startFrame=" + this.f56100g + ", endFrame=" + this.f56101h + ", interpolator=" + this.f56097d + C12361b.f30259j;
    }

    public C21693a(C21495g gVar, @C0363p0 T t, @C0363p0 T t2, @C0363p0 Interpolator interpolator, @C0363p0 Interpolator interpolator2, float f, @C0363p0 Float f2) {
        this.f56102i = -3987645.8f;
        this.f56103j = -3987645.8f;
        this.f56104k = f56093r;
        this.f56105l = f56093r;
        this.f56106m = Float.MIN_VALUE;
        this.f56107n = Float.MIN_VALUE;
        this.f56108o = null;
        this.f56109p = null;
        this.f56094a = gVar;
        this.f56095b = t;
        this.f56096c = t2;
        this.f56097d = null;
        this.f56098e = interpolator;
        this.f56099f = interpolator2;
        this.f56100g = f;
        this.f56101h = f2;
    }

    public C21693a(C21495g gVar, @C0363p0 T t, @C0363p0 T t2, @C0363p0 Interpolator interpolator, @C0363p0 Interpolator interpolator2, @C0363p0 Interpolator interpolator3, float f, @C0363p0 Float f2) {
        this.f56102i = -3987645.8f;
        this.f56103j = -3987645.8f;
        this.f56104k = f56093r;
        this.f56105l = f56093r;
        this.f56106m = Float.MIN_VALUE;
        this.f56107n = Float.MIN_VALUE;
        this.f56108o = null;
        this.f56109p = null;
        this.f56094a = gVar;
        this.f56095b = t;
        this.f56096c = t2;
        this.f56097d = interpolator;
        this.f56098e = interpolator2;
        this.f56099f = interpolator3;
        this.f56100g = f;
        this.f56101h = f2;
    }

    public C21693a(T t) {
        this.f56102i = -3987645.8f;
        this.f56103j = -3987645.8f;
        this.f56104k = f56093r;
        this.f56105l = f56093r;
        this.f56106m = Float.MIN_VALUE;
        this.f56107n = Float.MIN_VALUE;
        this.f56108o = null;
        this.f56109p = null;
        this.f56094a = null;
        this.f56095b = t;
        this.f56096c = t;
        this.f56097d = null;
        this.f56098e = null;
        this.f56099f = null;
        this.f56100g = Float.MIN_VALUE;
        this.f56101h = Float.valueOf(Float.MAX_VALUE);
    }
}
