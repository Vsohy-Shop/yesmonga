package kotlinx.serialization.internal;

import kotlin.C11419p1;
import kotlin.C11531s;
import kotlin.C11532s0;
import kotlin.jvm.internal.C11324c0;
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
/* renamed from: kotlinx.serialization.internal.w1 */
public final class C12323w1 implements C12248g<C11419p1> {
    @C12579k

    /* renamed from: a */
    public static final C12323w1 f30143a = new C12323w1();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30144b = C12266e0.m49261a("kotlin.UInt", C12197a.m48797C(C11324c0.f28435a));

    /* renamed from: a */
    public int mo25207a(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return C11419p1.m43971M(eVar.mo24887q(getDescriptor()).mo24879h());
    }

    /* renamed from: b */
    public void mo25208b(@C12579k C12244g gVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24916m(getDescriptor()).mo24898C(i);
    }

    public /* bridge */ /* synthetic */ Object deserialize(C12241e eVar) {
        return C11419p1.m43993g(mo25207a(eVar));
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30144b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25208b(gVar, ((C11419p1) obj).mo22930j2());
    }
}
