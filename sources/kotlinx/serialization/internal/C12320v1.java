package kotlinx.serialization.internal;

import kotlin.C11400l1;
import kotlin.C11531s;
import kotlin.C11532s0;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11531s
@C12200d
@C11532s0
/* renamed from: kotlinx.serialization.internal.v1 */
public final class C12320v1 implements C12248g<C11400l1> {
    @C12579k

    /* renamed from: a */
    public static final C12320v1 f30140a = new C12320v1();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30141b = C12266e0.m49261a("kotlin.UByte", C12197a.m48825y(C11354n.f28470a));

    /* renamed from: a */
    public byte mo25196a(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return C11400l1.m43761M(eVar.mo24887q(getDescriptor()).mo24871H());
    }

    /* renamed from: b */
    public void mo25197b(@C12579k C12244g gVar, byte b) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24916m(getDescriptor()).mo24911h(b);
    }

    public /* bridge */ /* synthetic */ Object deserialize(C12241e eVar) {
        return C11400l1.m43782g(mo25196a(eVar));
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30141b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25197b(gVar, ((C11400l1) obj).mo22897e2());
    }
}
