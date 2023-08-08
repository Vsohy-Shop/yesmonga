package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1378c2;
import androidx.camera.core.C1689t0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.C1613f;

/* renamed from: androidx.camera.core.impl.k0 */
public final class C1471k0 implements C1488o1<C1689t0>, C1491p0, C1613f {

    /* renamed from: w */
    public static final Config.C1421a<Integer> f4226w = Config.C1421a.m5980a("camerax.core.imageAnalysis.backpressureStrategy", C1689t0.C1691b.class);

    /* renamed from: x */
    public static final Config.C1421a<Integer> f4227x = Config.C1421a.m5980a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: y */
    public static final Config.C1421a<C1378c2> f4228y = Config.C1421a.m5980a("camerax.core.imageAnalysis.imageReaderProxyProvider", C1378c2.class);

    /* renamed from: v */
    public final C1441c1 f4229v;

    public C1471k0(@C0359n0 C1441c1 c1Var) {
        this.f4229v = c1Var;
    }

    /* renamed from: Z */
    public int mo5234Z() {
        return ((Integer) mo5125b(f4226w)).intValue();
    }

    @C0359n0
    /* renamed from: a */
    public Config mo4458a() {
        return this.f4229v;
    }

    /* renamed from: a0 */
    public int mo5235a0(int i) {
        return ((Integer) mo5131h(f4226w, Integer.valueOf(i))).intValue();
    }

    /* renamed from: b0 */
    public int mo5236b0() {
        return ((Integer) mo5125b(f4227x)).intValue();
    }

    /* renamed from: c0 */
    public int mo5237c0(int i) {
        return ((Integer) mo5131h(f4227x, Integer.valueOf(i))).intValue();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d0 */
    public C1378c2 mo5238d0() {
        return (C1378c2) mo5131h(f4228y, null);
    }

    /* renamed from: o */
    public int mo5210o() {
        return 35;
    }
}
