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
/* renamed from: kotlinx.serialization.internal.i */
public final class C12278i implements C12248g<Boolean> {
    @C12579k

    /* renamed from: a */
    public static final C12278i f30070a = new C12278i();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30071b = new C12283j1("kotlin.Boolean", C12207e.C12208a.f29994a);

    @C12579k
    /* renamed from: a */
    public Boolean deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Boolean.valueOf(eVar.mo24893w());
    }

    /* renamed from: b */
    public void mo25071b(@C12579k C12244g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24922s(z);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30071b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25071b(gVar, ((Boolean) obj).booleanValue());
    }
}
