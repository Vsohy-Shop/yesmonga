package kotlinx.serialization.internal;

import kotlin.C11531s;
import kotlin.C11532s0;
import kotlin.C11679z1;
import kotlin.jvm.internal.C11359p0;
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
/* renamed from: kotlinx.serialization.internal.y1 */
public final class C12330y1 implements C12248g<C11679z1> {
    @C12579k

    /* renamed from: a */
    public static final C12330y1 f30151a = new C12330y1();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30152b = C12266e0.m49261a("kotlin.UShort", C12197a.m48799E(C11359p0.f28487a));

    /* renamed from: a */
    public short mo25217a(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return C11679z1.m45841M(eVar.mo24887q(getDescriptor()).mo24889s());
    }

    /* renamed from: b */
    public void mo25218b(@C12579k C12244g gVar, short s) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24916m(getDescriptor()).mo24921r(s);
    }

    public /* bridge */ /* synthetic */ Object deserialize(C12241e eVar) {
        return C11679z1.m45862g(mo25217a(eVar));
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30152b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25218b(gVar, ((C11679z1) obj).mo23548e2());
    }
}
