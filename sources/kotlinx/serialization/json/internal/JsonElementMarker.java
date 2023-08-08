package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.internal.C12314u;
import org.jetbrains.annotations.C12579k;

public final class JsonElementMarker {
    @C12579k

    /* renamed from: a */
    public final C12314u f30222a;

    /* renamed from: b */
    public boolean f30223b;

    public JsonElementMarker(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        this.f30222a = new C12314u(fVar, new JsonElementMarker$origin$1(this));
    }

    /* renamed from: b */
    public final boolean mo25393b() {
        return this.f30223b;
    }

    /* renamed from: c */
    public final void mo25394c(int i) {
        this.f30222a.mo25180a(i);
    }

    /* renamed from: d */
    public final int mo25395d() {
        return this.f30222a.mo25183d();
    }

    /* renamed from: e */
    public final boolean mo25396e(C12217f fVar, int i) {
        boolean z = !fVar.mo24832i(i) && fVar.mo24827g(i).mo24821b();
        this.f30223b = z;
        return z;
    }
}
