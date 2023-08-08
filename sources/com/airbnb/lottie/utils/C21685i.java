package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0379x;
import com.airbnb.lottie.animation.content.C21453k;
import com.airbnb.lottie.model.C21542a;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21568h;
import java.util.List;

/* renamed from: com.airbnb.lottie.utils.i */
public class C21685i {

    /* renamed from: a */
    public static PointF f56080a = new PointF();

    /* renamed from: a */
    public static PointF m99787a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m99788b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m99789c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m99790d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m99791e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: f */
    public static int m99792f(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (z || i4 == 0) {
            return i3;
        }
        return i3 - 1;
    }

    /* renamed from: g */
    public static int m99793g(float f, float f2) {
        return m99794h((int) f, (int) f2);
    }

    /* renamed from: h */
    public static int m99794h(int i, int i2) {
        return i - (i2 * m99792f(i, i2));
    }

    /* renamed from: i */
    public static void m99795i(C21568h hVar, Path path) {
        path.reset();
        PointF b = hVar.mo64408b();
        path.moveTo(b.x, b.y);
        f56080a.set(b.x, b.y);
        for (int i = 0; i < hVar.mo64407a().size(); i++) {
            C21542a aVar = hVar.mo64407a().get(i);
            PointF a = aVar.mo64294a();
            PointF b2 = aVar.mo64295b();
            PointF c = aVar.mo64296c();
            if (!a.equals(f56080a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f56080a.set(c.x, c.y);
        }
        if (hVar.mo64410d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m99796j(double d, double d2, @C0379x(from = 0.0d, mo1016to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m99797k(float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m99798l(int i, int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: m */
    public static void m99799m(C21573d dVar, int i, List<C21573d> list, C21573d dVar2, C21453k kVar) {
        if (dVar.mo64429c(kVar.getName(), i)) {
            list.add(dVar2.mo64427a(kVar.getName()).mo64436j(kVar));
        }
    }
}
