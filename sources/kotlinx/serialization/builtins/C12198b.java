package kotlinx.serialization.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.builtins.b */
public final class C12198b implements C12248g<Long> {
    @C12579k

    /* renamed from: a */
    public static final C12198b f29965a = new C12198b();
    @C12579k

    /* renamed from: b */
    public static final C12217f f29966b = SerialDescriptorsKt.m48841a("kotlinx.serialization.LongAsStringSerializer", C12207e.C12216i.f30002a);

    @C12579k
    /* renamed from: a */
    public Long deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Long.valueOf(Long.parseLong(eVar.mo24896z()));
    }

    /* renamed from: b */
    public void mo24819b(@C12579k C12244g gVar, long j) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24903H(String.valueOf(j));
    }

    @C12579k
    public C12217f getDescriptor() {
        return f29966b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo24819b(gVar, ((Number) obj).longValue());
    }
}
