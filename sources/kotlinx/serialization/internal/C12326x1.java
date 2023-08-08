package kotlinx.serialization.internal;

import kotlin.C11531s;
import kotlin.C11532s0;
import kotlin.C11588t1;
import kotlin.jvm.internal.C11332g0;
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
/* renamed from: kotlinx.serialization.internal.x1 */
public final class C12326x1 implements C12248g<C11588t1> {
    @C12579k

    /* renamed from: a */
    public static final C12326x1 f30147a = new C12326x1();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30148b = C12266e0.m49261a("kotlin.ULong", C12197a.m48798D(C11332g0.f28449a));

    /* renamed from: a */
    public long mo25215a(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return C11588t1.m44970M(eVar.mo24887q(getDescriptor()).mo24883l());
    }

    /* renamed from: b */
    public void mo25216b(@C12579k C12244g gVar, long j) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24916m(getDescriptor()).mo24917n(j);
    }

    public /* bridge */ /* synthetic */ Object deserialize(C12241e eVar) {
        return C11588t1.m44992g(mo25215a(eVar));
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30148b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25216b(gVar, ((C11588t1) obj).mo23301j2());
    }
}
