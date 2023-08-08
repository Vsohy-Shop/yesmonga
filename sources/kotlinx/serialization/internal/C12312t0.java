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
/* renamed from: kotlinx.serialization.internal.t0 */
public final class C12312t0 implements C12248g<Long> {
    @C12579k

    /* renamed from: a */
    public static final C12312t0 f30121a = new C12312t0();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30122b = new C12283j1("kotlin.Long", C12207e.C12214g.f30000a);

    @C12579k
    /* renamed from: a */
    public Long deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Long.valueOf(eVar.mo24883l());
    }

    /* renamed from: b */
    public void mo25160b(@C12579k C12244g gVar, long j) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24917n(j);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30122b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25160b(gVar, ((Number) obj).longValue());
    }
}
