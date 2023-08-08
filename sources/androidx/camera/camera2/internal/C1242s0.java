package androidx.camera.camera2.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.camera2.internal.s0 */
public class C1242s0 implements C1583y.C1585b {

    /* renamed from: a */
    public static final C1242s0 f3559a = new C1242s0();

    @C0335b(markerClass = C1298p.class)
    /* renamed from: a */
    public void mo4282a(@C0359n0 C1488o1<?> o1Var, @C0359n0 C1583y.C1584a aVar) {
        C1583y u = o1Var.mo5289u((C1583y) null);
        Config a0 = C1441c1.m6058a0();
        int f = C1583y.m6545a().mo5551f();
        if (u != null) {
            f = u.mo5551f();
            aVar.mo5553a(u.mo5547b());
            a0 = u.mo5548c();
        }
        aVar.mo5568r(a0);
        C1004b bVar = new C1004b(o1Var);
        aVar.mo5569s(bVar.mo4090f0(f));
        aVar.mo5555c(C1184g1.m4952d(bVar.mo4092h0(C1233r0.m5099c())));
        aVar.mo5557e(bVar.mo4088d0());
    }
}
