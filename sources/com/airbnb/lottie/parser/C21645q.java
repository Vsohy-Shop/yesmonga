package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.C0363p0;
import androidx.collection.C1887m;
import androidx.core.view.animation.C18117b;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21693a;
import com.google.zxing.client.android.C34651e;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.airbnb.lottie.parser.q */
public class C21645q {

    /* renamed from: a */
    public static final float f56034a = 100.0f;

    /* renamed from: b */
    public static final Interpolator f56035b = new LinearInterpolator();

    /* renamed from: c */
    public static C1887m<WeakReference<Interpolator>> f56036c;

    /* renamed from: d */
    public static JsonReader.C21628a f56037d = JsonReader.C21628a.m99628a(C10108c.f27801d, C34935s.f84988a, C34651e.f83829d, C34930o.f84983b, "i", "h", "to", "ti");

    /* renamed from: e */
    public static JsonReader.C21628a f56038e = JsonReader.C21628a.m99628a("x", "y");

    @C0363p0
    /* renamed from: a */
    public static WeakReference<Interpolator> m99692a(int i) {
        WeakReference<Interpolator> k;
        synchronized (C21645q.class) {
            k = m99698g().mo6363k(i);
        }
        return k;
    }

    /* renamed from: b */
    public static Interpolator m99693b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        Interpolator interpolator2;
        pointF.x = C21685i.m99789c(pointF.x, -1.0f, 1.0f);
        pointF.y = C21685i.m99789c(pointF.y, -100.0f, 100.0f);
        pointF2.x = C21685i.m99789c(pointF2.x, -1.0f, 1.0f);
        float c = C21685i.m99789c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c;
        int i = C21686j.m99808i(pointF.x, pointF.y, pointF2.x, c);
        WeakReference<Interpolator> a = m99692a(i);
        if (a != null) {
            interpolator = a.get();
        } else {
            interpolator = null;
        }
        if (a == null || interpolator == null) {
            try {
                interpolator2 = C18117b.m82265b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator2 = C18117b.m82265b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator2 = new LinearInterpolator();
                }
            }
            interpolator = interpolator2;
            try {
                m99699h(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* renamed from: c */
    public static <T> C21693a<T> m99694c(JsonReader jsonReader, C21495g gVar, float f, C21624k0<T> k0Var, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m99696e(gVar, jsonReader, f, k0Var);
        }
        if (z) {
            return m99695d(gVar, jsonReader, f, k0Var);
        }
        return m99697f(jsonReader, f, k0Var);
    }

    /* renamed from: d */
    public static <T> C21693a<T> m99695d(C21495g gVar, JsonReader jsonReader, float f, C21624k0<T> k0Var) throws IOException {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        jsonReader.mo64552c();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.mo64555g()) {
            switch (jsonReader.mo64564q(f56037d)) {
                case 0:
                    f2 = (float) jsonReader.mo64558j();
                    break;
                case 1:
                    t3 = k0Var.mo64542a(jsonReader, f);
                    break;
                case 2:
                    t2 = k0Var.mo64542a(jsonReader, f);
                    break;
                case 3:
                    pointF = C21643p.m99689e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = C21643p.m99689e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.mo64559k() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF2 = C21643p.m99689e(jsonReader, f);
                    break;
                case 7:
                    pointF3 = C21643p.m99689e(jsonReader, f);
                    break;
                default:
                    jsonReader.mo64566s();
                    break;
            }
        }
        jsonReader.mo64554f();
        if (z) {
            interpolator = f56035b;
            t = t3;
        } else {
            if (pointF == null || pointF4 == null) {
                interpolator2 = f56035b;
            } else {
                interpolator2 = m99693b(pointF, pointF4);
            }
            interpolator = interpolator2;
            t = t2;
        }
        C21693a aVar = new C21693a(gVar, t3, t, interpolator, f2, (Float) null);
        aVar.f56108o = pointF2;
        aVar.f56109p = pointF3;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r14 = r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.airbnb.lottie.value.C21693a<T> m99696e(com.airbnb.lottie.C21495g r21, com.airbnb.lottie.parser.moshi.JsonReader r22, float r23, com.airbnb.lottie.parser.C21624k0<T> r24) throws java.io.IOException {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.mo64552c()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.mo64555g()
            if (r17 == 0) goto L_0x01a8
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = f56037d
            int r4 = r0.mo64564q(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0191;
                case 2: goto L_0x0187;
                case 3: goto L_0x00f3;
                case 4: goto L_0x0044;
                case 5: goto L_0x003a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0030;
                default: goto L_0x0026;
            }
        L_0x0026:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo64566s()
            goto L_0x01a4
        L_0x0030:
            android.graphics.PointF r3 = com.airbnb.lottie.parser.C21643p.m99689e(r22, r23)
            goto L_0x0016
        L_0x0035:
            android.graphics.PointF r15 = com.airbnb.lottie.parser.C21643p.m99689e(r22, r23)
            goto L_0x0016
        L_0x003a:
            int r4 = r22.mo64559k()
            if (r4 != r5) goto L_0x0042
            r6 = r5
            goto L_0x0016
        L_0x0042:
            r6 = 0
            goto L_0x0016
        L_0x0044:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r22.mo64562o()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e8
            r22.mo64552c()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x0053:
            boolean r18 = r22.mo64555g()
            if (r18 == 0) goto L_0x00d2
            r18 = r15
            com.airbnb.lottie.parser.moshi.JsonReader$a r15 = f56038e
            int r15 = r0.mo64564q(r15)
            if (r15 == 0) goto L_0x00a5
            r19 = r3
            r3 = 1
            if (r15 == r3) goto L_0x0070
            r22.mo64566s()
        L_0x006b:
            r15 = r18
            r3 = r19
            goto L_0x0053
        L_0x0070:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r3 = r22.mo64562o()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r3 != r5) goto L_0x0081
            r3 = r14
            double r13 = r22.mo64558j()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x006b
        L_0x0081:
            r3 = r14
            r22.mo64551b()
            double r13 = r22.mo64558j()
            float r13 = (float) r13
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = r22.mo64562o()
            if (r14 != r5) goto L_0x0096
            double r14 = r22.mo64558j()
            float r5 = (float) r14
            goto L_0x0097
        L_0x0096:
            r5 = r13
        L_0x0097:
            r22.mo64553d()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x0053
        L_0x00a5:
            r19 = r3
            r3 = r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r22.mo64562o()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r12 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r4 != r12) goto L_0x00b8
            double r14 = r22.mo64558j()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x006b
        L_0x00b8:
            r22.mo64551b()
            double r14 = r22.mo64558j()
            float r4 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = r22.mo64562o()
            if (r14 != r12) goto L_0x00cc
            double r14 = r22.mo64558j()
            float r12 = (float) r14
            goto L_0x00cd
        L_0x00cc:
            r12 = r4
        L_0x00cd:
            r22.mo64553d()
            r14 = r3
            goto L_0x006b
        L_0x00d2:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.mo64554f()
            r13 = r4
            r12 = r14
            goto L_0x017d
        L_0x00e8:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = com.airbnb.lottie.parser.C21643p.m99689e(r22, r23)
            goto L_0x01a4
        L_0x00f3:
            r19 = r3
            r3 = r14
            r18 = r15
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r22.mo64562o()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017f
            r22.mo64552c()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0107:
            boolean r14 = r22.mo64555g()
            if (r14 == 0) goto L_0x016c
            com.airbnb.lottie.parser.moshi.JsonReader$a r14 = f56038e
            int r14 = r0.mo64564q(r14)
            if (r14 == 0) goto L_0x0144
            r15 = 1
            if (r14 == r15) goto L_0x011c
            r22.mo64566s()
            goto L_0x0107
        L_0x011c:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = r22.mo64562o()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r11 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r5 != r11) goto L_0x012b
            double r14 = r22.mo64558j()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0107
        L_0x012b:
            r22.mo64551b()
            double r14 = r22.mo64558j()
            float r5 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = r22.mo64562o()
            if (r14 != r11) goto L_0x013f
            double r14 = r22.mo64558j()
            float r11 = (float) r14
            goto L_0x0140
        L_0x013f:
            r11 = r5
        L_0x0140:
            r22.mo64553d()
            goto L_0x0107
        L_0x0144:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r22.mo64562o()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r9 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r4 != r9) goto L_0x0153
            double r14 = r22.mo64558j()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0107
        L_0x0153:
            r22.mo64551b()
            double r14 = r22.mo64558j()
            float r4 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = r22.mo64562o()
            if (r14 != r9) goto L_0x0167
            double r14 = r22.mo64558j()
            float r9 = (float) r14
            goto L_0x0168
        L_0x0167:
            r9 = r4
        L_0x0168:
            r22.mo64553d()
            goto L_0x0107
        L_0x016c:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.mo64554f()
            r11 = r4
            r9 = r14
            r15 = r18
        L_0x017d:
            r14 = r3
            goto L_0x01a4
        L_0x017f:
            android.graphics.PointF r7 = com.airbnb.lottie.parser.C21643p.m99689e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x01a4
        L_0x0187:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.mo64542a(r0, r1)
            goto L_0x01a4
        L_0x0191:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.mo64542a(r0, r1)
            goto L_0x01a4
        L_0x019b:
            r19 = r3
            r18 = r15
            double r3 = r22.mo64558j()
            float r14 = (float) r3
        L_0x01a4:
            r3 = r19
            goto L_0x0016
        L_0x01a8:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo64554f()
            if (r6 == 0) goto L_0x01b8
            android.view.animation.Interpolator r0 = f56035b
            r11 = r10
        L_0x01b5:
            r12 = 0
            r13 = 0
            goto L_0x01dc
        L_0x01b8:
            if (r7 == 0) goto L_0x01c1
            if (r8 == 0) goto L_0x01c1
            android.view.animation.Interpolator r0 = m99693b(r7, r8)
            goto L_0x01d9
        L_0x01c1:
            if (r9 == 0) goto L_0x01d7
            if (r11 == 0) goto L_0x01d7
            if (r12 == 0) goto L_0x01d7
            if (r13 == 0) goto L_0x01d7
            android.view.animation.Interpolator r0 = m99693b(r9, r12)
            android.view.animation.Interpolator r1 = m99693b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01dc
        L_0x01d7:
            android.view.animation.Interpolator r0 = f56035b
        L_0x01d9:
            r11 = r16
            goto L_0x01b5
        L_0x01dc:
            if (r12 == 0) goto L_0x01ed
            if (r13 == 0) goto L_0x01ed
            com.airbnb.lottie.value.a r0 = new com.airbnb.lottie.value.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r1 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01fb
        L_0x01ed:
            r1 = r18
            com.airbnb.lottie.value.a r2 = new com.airbnb.lottie.value.a
            r14 = 0
            r8 = r2
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r2
        L_0x01fb:
            r0.f56108o = r1
            r3 = r19
            r0.f56109p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C21645q.m99696e(com.airbnb.lottie.g, com.airbnb.lottie.parser.moshi.JsonReader, float, com.airbnb.lottie.parser.k0):com.airbnb.lottie.value.a");
    }

    /* renamed from: f */
    public static <T> C21693a<T> m99697f(JsonReader jsonReader, float f, C21624k0<T> k0Var) throws IOException {
        return new C21693a<>(k0Var.mo64542a(jsonReader, f));
    }

    /* renamed from: g */
    public static C1887m<WeakReference<Interpolator>> m99698g() {
        if (f56036c == null) {
            f56036c = new C1887m<>();
        }
        return f56036c;
    }

    /* renamed from: h */
    public static void m99699h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C21645q.class) {
            f56036c.mo6369t(i, weakReference);
        }
    }
}
