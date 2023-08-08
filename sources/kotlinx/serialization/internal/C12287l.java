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
/* renamed from: kotlinx.serialization.internal.l */
public final class C12287l implements C12248g<Byte> {
    @C12579k

    /* renamed from: a */
    public static final C12287l f30083a = new C12287l();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30084b = new C12283j1("kotlin.Byte", C12207e.C12209b.f29995a);

    @C12579k
    /* renamed from: a */
    public Byte deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Byte.valueOf(eVar.mo24871H());
    }

    /* renamed from: b */
    public void mo25089b(@C12579k C12244g gVar, byte b) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24911h(b);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30084b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25089b(gVar, ((Number) obj).byteValue());
    }
}
