package androidx.camera.camera2.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.impl.C1008d;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.camera2.internal.w0 */
public final class C1263w0 implements SessionConfig.C1426d {

    /* renamed from: a */
    public static final C1263w0 f3619a = new C1263w0();

    @C0335b(markerClass = C1298p.class)
    /* renamed from: a */
    public void mo4714a(@C0359n0 C1488o1<?> o1Var, @C0359n0 SessionConfig.C1424b bVar) {
        SessionConfig p = o1Var.mo5287p((SessionConfig) null);
        Config a0 = C1441c1.m6058a0();
        int j = SessionConfig.m5999a().mo5152j();
        if (p != null) {
            j = p.mo5152j();
            bVar.mo5154b(p.mo5144b());
            bVar.mo5156d(p.mo5149g());
            bVar.mo5155c(p.mo5147e());
            a0 = p.mo5146d();
        }
        bVar.mo5170s(a0);
        C1004b bVar2 = new C1004b(o1Var);
        bVar.mo5171t(bVar2.mo4090f0(j));
        bVar.mo5158f(bVar2.mo4091g0(C1042c1.m4623c()));
        bVar.mo5163k(bVar2.mo4093i0(C1025a1.m4524c()));
        bVar.mo5157e(C1184g1.m4952d(bVar2.mo4092h0(C1233r0.m5099c())));
        C1586y0 d0 = C1586y0.m6573d0();
        d0.mo5545t(C1004b.f3069B, bVar2.mo4087c0(C1008d.m4389e()));
        bVar.mo5160h(d0);
        bVar.mo5160h(bVar2.mo4088d0());
    }
}
