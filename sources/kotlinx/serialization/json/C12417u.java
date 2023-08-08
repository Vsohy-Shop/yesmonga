package kotlinx.serialization.json;

import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12441q;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.json.internal.JsonDecodingException;
import org.jetbrains.annotations.C12579k;

@C12441q(forClass = JsonNull.class)
@C11532s0
/* renamed from: kotlinx.serialization.json.u */
public final class C12417u implements C12248g<JsonNull> {
    @C12579k

    /* renamed from: a */
    public static final C12417u f30355a = new C12417u();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30356b = SerialDescriptorsKt.m48846f("kotlinx.serialization.json.JsonNull", C12224h.C12226b.f30010a, new C12217f[0], (C11300l) null, 8, (Object) null);

    @C12579k
    /* renamed from: a */
    public JsonNull deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12407n.m50192g(eVar);
        if (!eVar.mo24867D()) {
            eVar.mo24881j();
            return JsonNull.INSTANCE;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k JsonNull jsonNull) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(jsonNull, "value");
        C12407n.m50193h(gVar);
        gVar.mo24919p();
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30356b;
    }
}
