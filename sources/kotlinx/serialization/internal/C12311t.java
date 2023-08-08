package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.t */
public final class C12311t implements C12248g<Double> {
    @C12579k

    /* renamed from: a */
    public static final C12311t f30119a = new C12311t();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30120b = new C12283j1("kotlin.Double", C12207e.C12211d.f29997a);

    @C12579k
    /* renamed from: a */
    public Double deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Double.valueOf(eVar.mo24892v());
    }

    /* renamed from: b */
    public void mo25158b(@C12579k C12244g gVar, double d) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24910g(d);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30120b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25158b(gVar, ((Number) obj).doubleValue());
    }
}
