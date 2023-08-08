package kotlinx.serialization.json;

import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12441q;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.json.internal.C12388n;
import org.jetbrains.annotations.C12579k;

@C12441q(forClass = C12421x.class)
@C11532s0
/* renamed from: kotlinx.serialization.json.y */
public final class C12423y implements C12248g<C12421x> {
    @C12579k

    /* renamed from: a */
    public static final C12423y f30363a = new C12423y();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30364b = SerialDescriptorsKt.m48846f("kotlinx.serialization.json.JsonPrimitive", C12207e.C12216i.f30002a, new C12217f[0], (C11300l) null, 8, (Object) null);

    @C12579k
    /* renamed from: a */
    public C12421x deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12403k g = C12407n.m50189d(eVar).mo25373g();
        if (g instanceof C12421x) {
            return (C12421x) g;
        }
        throw C12388n.m50107f(-1, Intrinsics.stringPlus("Unexpected JSON element, expected JsonPrimitive, had ", C11342l0.m43547d(g.getClass())), g.toString());
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(xVar, "value");
        C12407n.m50193h(gVar);
        if (xVar instanceof JsonNull) {
            gVar.mo24908e(C12417u.f30355a, JsonNull.INSTANCE);
        } else {
            gVar.mo24908e(C12414s.f30352a, (C12413r) xVar);
        }
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30364b;
    }
}
