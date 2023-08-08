package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0337f0;
import androidx.annotation.C0349j;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0379x;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* renamed from: com.bumptech.glide.request.h */
public class C22561h extends C22553a<C22561h> {
    @C0363p0

    /* renamed from: k1 */
    public static C22561h f57885k1;
    @C0363p0

    /* renamed from: l1 */
    public static C22561h f57886l1;
    @C0363p0

    /* renamed from: m1 */
    public static C22561h f57887m1;
    @C0363p0

    /* renamed from: n1 */
    public static C22561h f57888n1;
    @C0363p0

    /* renamed from: o1 */
    public static C22561h f57889o1;
    @C0363p0

    /* renamed from: p1 */
    public static C22561h f57890p1;
    @C0363p0

    /* renamed from: q1 */
    public static C22561h f57891q1;
    @C0363p0

    /* renamed from: r1 */
    public static C22561h f57892r1;

    @C0349j
    @C0359n0
    /* renamed from: B1 */
    public static C22561h m102374B1(@C0363p0 Drawable drawable) {
        return (C22561h) new C22561h().mo66744H(drawable);
    }

    @C0349j
    @C0359n0
    /* renamed from: C1 */
    public static C22561h m102375C1() {
        if (f57887m1 == null) {
            f57887m1 = (C22561h) ((C22561h) new C22561h().mo66750K()).mo66780c();
        }
        return f57887m1;
    }

    @C0349j
    @C0359n0
    /* renamed from: D1 */
    public static C22561h m102376D1(@C0359n0 DecodeFormat decodeFormat) {
        return (C22561h) new C22561h().mo66751L(decodeFormat);
    }

    @C0349j
    @C0359n0
    /* renamed from: E1 */
    public static C22561h m102377E1(@C0337f0(from = 0) long j) {
        return (C22561h) new C22561h().mo66754N(j);
    }

    @C0349j
    @C0359n0
    /* renamed from: F1 */
    public static C22561h m102378F1() {
        if (f57892r1 == null) {
            f57892r1 = (C22561h) ((C22561h) new C22561h().mo66733B()).mo66780c();
        }
        return f57892r1;
    }

    @C0349j
    @C0359n0
    /* renamed from: H1 */
    public static C22561h m102379H1() {
        if (f57891q1 == null) {
            f57891q1 = (C22561h) ((C22561h) new C22561h().mo66735C()).mo66780c();
        }
        return f57891q1;
    }

    @C0349j
    @C0359n0
    /* renamed from: I1 */
    public static <T> C22561h m102380I1(@C0359n0 C22139e<T> eVar, @C0359n0 T t) {
        return (C22561h) new C22561h().mo66775Z0(eVar, t);
    }

    @C0349j
    @C0359n0
    /* renamed from: J1 */
    public static C22561h m102381J1(int i) {
        return m102382K1(i, i);
    }

    @C0349j
    @C0359n0
    /* renamed from: K1 */
    public static C22561h m102382K1(int i, int i2) {
        return (C22561h) new C22561h().mo66761R0(i, i2);
    }

    @C0349j
    @C0359n0
    /* renamed from: N1 */
    public static C22561h m102383N1(@C0375v int i) {
        return (C22561h) new C22561h().mo66763S0(i);
    }

    @C0349j
    @C0359n0
    /* renamed from: O1 */
    public static C22561h m102384O1(@C0363p0 Drawable drawable) {
        return (C22561h) new C22561h().mo66765T0(drawable);
    }

    @C0349j
    @C0359n0
    /* renamed from: P1 */
    public static C22561h m102385P1(@C0359n0 Priority priority) {
        return (C22561h) new C22561h().mo66767U0(priority);
    }

    @C0349j
    @C0359n0
    /* renamed from: Q1 */
    public static C22561h m102386Q1(@C0359n0 C22108c cVar) {
        return (C22561h) new C22561h().mo66777a1(cVar);
    }

    @C0349j
    @C0359n0
    /* renamed from: R1 */
    public static C22561h m102387R1(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return (C22561h) new C22561h().mo66779b1(f);
    }

    @C0349j
    @C0359n0
    /* renamed from: S1 */
    public static C22561h m102388S1(boolean z) {
        if (z) {
            if (f57885k1 == null) {
                f57885k1 = (C22561h) ((C22561h) new C22561h().mo66782c1(true)).mo66780c();
            }
            return f57885k1;
        }
        if (f57886l1 == null) {
            f57886l1 = (C22561h) ((C22561h) new C22561h().mo66782c1(false)).mo66780c();
        }
        return f57886l1;
    }

    @C0349j
    @C0359n0
    /* renamed from: T1 */
    public static C22561h m102389T1(@C0337f0(from = 0) int i) {
        return (C22561h) new C22561h().mo66785e1(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.request.C22561h m102390q1(@androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r1) {
        /*
            com.bumptech.glide.request.h r0 = new com.bumptech.glide.request.h
            r0.<init>()
            com.bumptech.glide.request.a r1 = r0.mo66787f1(r1)
            com.bumptech.glide.request.h r1 = (com.bumptech.glide.request.C22561h) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22561h.m102390q1(com.bumptech.glide.load.i):com.bumptech.glide.request.h");
    }

    @C0349j
    @C0359n0
    /* renamed from: r1 */
    public static C22561h m102391r1() {
        if (f57889o1 == null) {
            f57889o1 = (C22561h) ((C22561h) new C22561h().mo66796k()).mo66780c();
        }
        return f57889o1;
    }

    @C0349j
    @C0359n0
    /* renamed from: s1 */
    public static C22561h m102392s1() {
        if (f57888n1 == null) {
            f57888n1 = (C22561h) ((C22561h) new C22561h().mo66798l()).mo66780c();
        }
        return f57888n1;
    }

    @C0349j
    @C0359n0
    /* renamed from: t1 */
    public static C22561h m102393t1() {
        if (f57890p1 == null) {
            f57890p1 = (C22561h) ((C22561h) new C22561h().mo66803n()).mo66780c();
        }
        return f57890p1;
    }

    @C0349j
    @C0359n0
    /* renamed from: u1 */
    public static C22561h m102394u1(@C0359n0 Class<?> cls) {
        return (C22561h) new C22561h().mo66812v(cls);
    }

    @C0349j
    @C0359n0
    /* renamed from: v1 */
    public static C22561h m102395v1(@C0359n0 C22234h hVar) {
        return (C22561h) new C22561h().mo66732A(hVar);
    }

    @C0349j
    @C0359n0
    /* renamed from: w1 */
    public static C22561h m102396w1(@C0359n0 DownsampleStrategy downsampleStrategy) {
        return (C22561h) new C22561h().mo66736D(downsampleStrategy);
    }

    @C0349j
    @C0359n0
    /* renamed from: x1 */
    public static C22561h m102397x1(@C0359n0 Bitmap.CompressFormat compressFormat) {
        return (C22561h) new C22561h().mo66738E(compressFormat);
    }

    @C0349j
    @C0359n0
    /* renamed from: y1 */
    public static C22561h m102398y1(@C0337f0(from = 0, mo995to = 100) int i) {
        return (C22561h) new C22561h().mo66740F(i);
    }

    @C0349j
    @C0359n0
    /* renamed from: z1 */
    public static C22561h m102399z1(@C0375v int i) {
        return (C22561h) new C22561h().mo66742G(i);
    }
}
