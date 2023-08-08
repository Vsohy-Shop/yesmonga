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
/* renamed from: kotlinx.serialization.internal.r1 */
public final class C12307r1 implements C12248g<Short> {
    @C12579k

    /* renamed from: a */
    public static final C12307r1 f30113a = new C12307r1();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30114b = new C12283j1("kotlin.Short", C12207e.C12215h.f30001a);

    @C12579k
    /* renamed from: a */
    public Short deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Short.valueOf(eVar.mo24889s());
    }

    /* renamed from: b */
    public void mo25144b(@C12579k C12244g gVar, short s) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24921r(s);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30114b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25144b(gVar, ((Number) obj).shortValue());
    }
}
