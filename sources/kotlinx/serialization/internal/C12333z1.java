package kotlinx.serialization.internal;

import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.z1 */
public final class C12333z1 implements C12248g<C11079d2> {
    @C12579k

    /* renamed from: b */
    public static final C12333z1 f30155b = new C12333z1();

    /* renamed from: a */
    public final /* synthetic */ ObjectSerializer<C11079d2> f30156a = new ObjectSerializer<>("kotlin.Unit", C11079d2.f28267a);

    /* renamed from: a */
    public void mo25221a(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        this.f30156a.deserialize(eVar);
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k C11079d2 d2Var) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(d2Var, "value");
        this.f30156a.serialize(gVar, d2Var);
    }

    public /* bridge */ /* synthetic */ Object deserialize(C12241e eVar) {
        mo25221a(eVar);
        return C11079d2.f28267a;
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30156a.getDescriptor();
    }
}
