package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1677r2;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.C1613f;

/* renamed from: androidx.camera.core.impl.d1 */
public final class C1444d1 implements C1488o1<C1677r2>, C1491p0, C1613f {

    /* renamed from: w */
    public static final Config.C1421a<C1482n0> f4194w = Config.C1421a.m5980a("camerax.core.preview.imageInfoProcessor", C1482n0.class);

    /* renamed from: x */
    public static final Config.C1421a<C1587z> f4195x = Config.C1421a.m5980a("camerax.core.preview.captureProcessor", C1587z.class);

    /* renamed from: v */
    public final C1441c1 f4196v;

    public C1444d1(@C0359n0 C1441c1 c1Var) {
        this.f4196v = c1Var;
    }

    @C0359n0
    /* renamed from: Z */
    public C1587z mo5206Z() {
        return (C1587z) mo5125b(f4195x);
    }

    @C0359n0
    /* renamed from: a */
    public Config mo4458a() {
        return this.f4196v;
    }

    @C0363p0
    /* renamed from: a0 */
    public C1587z mo5207a0(@C0363p0 C1587z zVar) {
        return (C1587z) mo5131h(f4195x, zVar);
    }

    @C0359n0
    /* renamed from: b0 */
    public C1482n0 mo5208b0() {
        return (C1482n0) mo5125b(f4194w);
    }

    @C0363p0
    /* renamed from: c0 */
    public C1482n0 mo5209c0(@C0363p0 C1482n0 n0Var) {
        return (C1482n0) mo5131h(f4194w, n0Var);
    }

    /* renamed from: o */
    public int mo5210o() {
        return ((Integer) mo5125b(C1487o0.f4249c)).intValue();
    }
}
