package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1378c2;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.C1609d;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.l0 */
public final class C1475l0 implements C1488o1<ImageCapture>, C1491p0, C1609d {

    /* renamed from: A */
    public static final Config.C1421a<Integer> f4232A;

    /* renamed from: B */
    public static final Config.C1421a<Integer> f4233B;

    /* renamed from: C */
    public static final Config.C1421a<C1378c2> f4234C = Config.C1421a.m5980a("camerax.core.imageCapture.imageReaderProxyProvider", C1378c2.class);

    /* renamed from: D */
    public static final Config.C1421a<Boolean> f4235D = Config.C1421a.m5980a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);

    /* renamed from: w */
    public static final Config.C1421a<Integer> f4236w;

    /* renamed from: x */
    public static final Config.C1421a<Integer> f4237x;

    /* renamed from: y */
    public static final Config.C1421a<C1581x> f4238y = Config.C1421a.m5980a("camerax.core.imageCapture.captureBundle", C1581x.class);

    /* renamed from: z */
    public static final Config.C1421a<C1587z> f4239z = Config.C1421a.m5980a("camerax.core.imageCapture.captureProcessor", C1587z.class);

    /* renamed from: v */
    public final C1441c1 f4240v;

    static {
        Class cls = Integer.TYPE;
        f4236w = Config.C1421a.m5980a("camerax.core.imageCapture.captureMode", cls);
        f4237x = Config.C1421a.m5980a("camerax.core.imageCapture.flashMode", cls);
        Class<Integer> cls2 = Integer.class;
        f4232A = Config.C1421a.m5980a("camerax.core.imageCapture.bufferFormat", cls2);
        f4233B = Config.C1421a.m5980a("camerax.core.imageCapture.maxCaptureStages", cls2);
    }

    public C1475l0(@C0359n0 C1441c1 c1Var) {
        this.f4240v = c1Var;
    }

    @C0363p0
    /* renamed from: J */
    public Executor mo5241J(@C0363p0 Executor executor) {
        return (Executor) mo5131h(C1609d.f4536q, executor);
    }

    @C0359n0
    /* renamed from: P */
    public Executor mo5242P() {
        return (Executor) mo5125b(C1609d.f4536q);
    }

    @C0359n0
    /* renamed from: Z */
    public Integer mo5243Z() {
        return (Integer) mo5125b(f4232A);
    }

    @C0359n0
    /* renamed from: a */
    public Config mo4458a() {
        return this.f4240v;
    }

    @C0363p0
    /* renamed from: a0 */
    public Integer mo5244a0(@C0363p0 Integer num) {
        return (Integer) mo5131h(f4232A, num);
    }

    @C0359n0
    /* renamed from: b0 */
    public C1581x mo5245b0() {
        return (C1581x) mo5125b(f4238y);
    }

    @C0363p0
    /* renamed from: c0 */
    public C1581x mo5246c0(@C0363p0 C1581x xVar) {
        return (C1581x) mo5131h(f4238y, xVar);
    }

    /* renamed from: d0 */
    public int mo5247d0() {
        return ((Integer) mo5125b(f4236w)).intValue();
    }

    @C0359n0
    /* renamed from: e0 */
    public C1587z mo5248e0() {
        return (C1587z) mo5125b(f4239z);
    }

    @C0363p0
    /* renamed from: f0 */
    public C1587z mo5249f0(@C0363p0 C1587z zVar) {
        return (C1587z) mo5131h(f4239z, zVar);
    }

    /* renamed from: g0 */
    public int mo5250g0() {
        return ((Integer) mo5125b(f4237x)).intValue();
    }

    /* renamed from: h0 */
    public int mo5251h0(int i) {
        return ((Integer) mo5131h(f4237x, Integer.valueOf(i))).intValue();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i0 */
    public C1378c2 mo5252i0() {
        return (C1378c2) mo5131h(f4234C, null);
    }

    /* renamed from: j0 */
    public int mo5253j0() {
        return ((Integer) mo5125b(f4233B)).intValue();
    }

    /* renamed from: k0 */
    public int mo5254k0(int i) {
        return ((Integer) mo5131h(f4233B, Integer.valueOf(i))).intValue();
    }

    /* renamed from: l0 */
    public boolean mo5255l0() {
        return mo5126c(f4236w);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m0 */
    public boolean mo5256m0() {
        return ((Boolean) mo5131h(f4235D, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: o */
    public int mo5210o() {
        return ((Integer) mo5125b(C1487o0.f4249c)).intValue();
    }
}
