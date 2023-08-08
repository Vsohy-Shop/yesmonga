package kotlinx.serialization.json;

import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12441q;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C12441q(forClass = C12403k.class)
@C11532s0
public final class JsonElementSerializer implements C12248g<C12403k> {
    @C12579k

    /* renamed from: a */
    public static final JsonElementSerializer f30161a = new JsonElementSerializer();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30162b = SerialDescriptorsKt.m48845e("kotlinx.serialization.json.JsonElement", C12204d.C12206b.f29993a, new C12217f[0], JsonElementSerializer$descriptor$1.f30163f);

    @C12579k
    /* renamed from: a */
    public C12403k deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return C12407n.m50189d(eVar).mo25373g();
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(kVar, "value");
        C12407n.m50193h(gVar);
        if (kVar instanceof C12421x) {
            gVar.mo24908e(C12423y.f30363a, kVar);
        } else if (kVar instanceof JsonObject) {
            gVar.mo24908e(C12419w.f30358a, kVar);
        } else if (kVar instanceof C12344b) {
            gVar.mo24908e(C12349d.f30182a, kVar);
        }
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30162b;
    }
}
