package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12344b;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.y */
public final class C12400y extends AbstractJsonTreeEncoder {
    @C12579k

    /* renamed from: f */
    public final ArrayList<C12403k> f30339f = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12400y(@C12579k C12341a aVar, @C12579k C11300l<? super C12403k, C11079d2> lVar) {
        super(aVar, lVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(lVar, "nodeConsumer");
    }

    @C12579k
    /* renamed from: d0 */
    public String mo25212d0(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return String.valueOf(i);
    }

    @C12579k
    /* renamed from: u0 */
    public C12403k mo25389u0() {
        return new C12344b(this.f30339f);
    }

    /* renamed from: v0 */
    public void mo25390v0(@C12579k String str, @C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(kVar, "element");
        this.f30339f.add(Integer.parseInt(str), kVar);
    }
}
