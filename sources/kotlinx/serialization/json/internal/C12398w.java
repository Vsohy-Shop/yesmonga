package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.w */
public class C12398w extends AbstractJsonTreeEncoder {
    @C12579k

    /* renamed from: f */
    public final Map<String, C12403k> f30335f = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12398w(@C12579k C12341a aVar, @C12579k C11300l<? super C12403k, C11079d2> lVar) {
        super(aVar, lVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(lVar, "nodeConsumer");
    }

    /* renamed from: i */
    public <T> void mo24912i(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (t != null || this.f30217d.mo25362f()) {
            super.mo24912i(fVar, i, pVar, t);
        }
    }

    @C12579k
    /* renamed from: u0 */
    public C12403k mo25389u0() {
        return new JsonObject(this.f30335f);
    }

    /* renamed from: v0 */
    public void mo25390v0(@C12579k String str, @C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(kVar, "element");
        this.f30335f.put(str, kVar);
    }

    @C12579k
    /* renamed from: w0 */
    public final Map<String, C12403k> mo25547w0() {
        return this.f30335f;
    }
}
