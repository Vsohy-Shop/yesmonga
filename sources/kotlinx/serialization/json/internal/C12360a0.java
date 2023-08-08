package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12344b;
import kotlinx.serialization.json.C12349d;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12419w;
import kotlinx.serialization.json.C12421x;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.a0 */
public final class C12360a0 extends C12398w {

    /* renamed from: g */
    public String f30243g;

    /* renamed from: h */
    public boolean f30244h = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12360a0(@C12579k C12341a aVar, @C12579k C11300l<? super C12403k, C11079d2> lVar) {
        super(aVar, lVar);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(lVar, "nodeConsumer");
    }

    @C12579k
    /* renamed from: u0 */
    public C12403k mo25389u0() {
        return new JsonObject(mo25547w0());
    }

    /* renamed from: v0 */
    public void mo25390v0(@C12579k String str, @C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(kVar, "element");
        if (!this.f30244h) {
            Map<String, C12403k> w0 = mo25547w0();
            String str2 = this.f30243g;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str2 = null;
            }
            w0.put(str2, kVar);
            this.f30244h = true;
        } else if (kVar instanceof C12421x) {
            this.f30243g = ((C12421x) kVar).mo25231e();
            this.f30244h = false;
        } else if (kVar instanceof JsonObject) {
            throw C12388n.m50105d(C12419w.f30358a.getDescriptor());
        } else if (kVar instanceof C12344b) {
            throw C12388n.m50105d(C12349d.f30182a.getDescriptor());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
