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
/* renamed from: kotlinx.serialization.internal.h0 */
public final class C12276h0 implements C12248g<Integer> {
    @C12579k

    /* renamed from: a */
    public static final C12276h0 f30067a = new C12276h0();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30068b = new C12283j1("kotlin.Int", C12207e.C12213f.f29999a);

    @C12579k
    /* renamed from: a */
    public Integer deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Integer.valueOf(eVar.mo24879h());
    }

    /* renamed from: b */
    public void mo25064b(@C12579k C12244g gVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24898C(i);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30068b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25064b(gVar, ((Number) obj).intValue());
    }
}
