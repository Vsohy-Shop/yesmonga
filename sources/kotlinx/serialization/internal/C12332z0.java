package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.serialization.internal.z0 */
public final class C12332z0<T> implements C12248g<T> {
    @C12579k

    /* renamed from: a */
    public final C12248g<T> f30153a;
    @C12579k

    /* renamed from: b */
    public final C12217f f30154b;

    public C12332z0(@C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "serializer");
        this.f30153a = gVar;
        this.f30154b = new C12292m1(gVar.getDescriptor());
    }

    @C12580l
    public T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        if (eVar.mo24867D()) {
            return eVar.mo24870G(this.f30153a);
        }
        return eVar.mo24881j();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C11342l0.m43547d(C12332z0.class), (Object) C11342l0.m43547d(obj.getClass())) || !Intrinsics.areEqual((Object) this.f30153a, (Object) ((C12332z0) obj).f30153a)) {
            return false;
        }
        return true;
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30154b;
    }

    public int hashCode() {
        return this.f30153a.hashCode();
    }

    public void serialize(@C12579k C12244g gVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        if (t != null) {
            gVar.mo24926w();
            gVar.mo24908e(this.f30153a, t);
            return;
        }
        gVar.mo24919p();
    }
}
