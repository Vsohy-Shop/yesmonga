package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.a0 */
public abstract class C12343a0<T> implements C12248g<T> {
    @C12579k

    /* renamed from: a */
    public final C12248g<T> f30178a;

    public C12343a0(@C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "tSerializer");
        this.f30178a = gVar;
    }

    @C12579k
    /* renamed from: a */
    public C12403k mo25285a(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        return kVar;
    }

    @C12579k
    /* renamed from: b */
    public C12403k mo25286b(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        return kVar;
    }

    @C12579k
    public final T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12356i d = C12407n.m50189d(eVar);
        return d.mo25372d().mo25280f(this.f30178a, mo25285a(d.mo25373g()));
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30178a.getDescriptor();
    }

    public final void serialize(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        C12409o e = C12407n.m50190e(gVar);
        e.mo25374B(mo25286b(TreeJsonEncoderKt.m49861d(e.mo25375d(), t, this.f30178a)));
    }
}
