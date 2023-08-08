package androidx.camera.camera2.internal;

import androidx.annotation.C0359n0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.compat.workaround.C1160e;
import androidx.camera.core.impl.C1475l0;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1583y;

/* renamed from: androidx.camera.camera2.internal.c2 */
public final class C1045c2 extends C1242s0 {

    /* renamed from: c */
    public static final C1045c2 f3221c = new C1045c2(new C1160e());
    @C0359n0

    /* renamed from: b */
    public final C1160e f3222b;

    public C1045c2(@C0359n0 C1160e eVar) {
        this.f3222b = eVar;
    }

    /* renamed from: a */
    public void mo4282a(@C0359n0 C1488o1<?> o1Var, @C0359n0 C1583y.C1584a aVar) {
        super.mo4282a(o1Var, aVar);
        if (o1Var instanceof C1475l0) {
            C1475l0 l0Var = (C1475l0) o1Var;
            C1004b.C1005a aVar2 = new C1004b.C1005a();
            if (l0Var.mo5255l0()) {
                this.f3222b.mo4443a(l0Var.mo5247d0(), aVar2);
            }
            aVar.mo5557e(aVar2.mo4098g());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
