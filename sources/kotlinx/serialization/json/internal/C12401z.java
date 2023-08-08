package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12406m;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.z */
public final class C12401z extends JsonTreeDecoder {
    @C12579k

    /* renamed from: n */
    public final JsonObject f30340n;
    @C12579k

    /* renamed from: o */
    public final List<String> f30341o;

    /* renamed from: p */
    public final int f30342p;

    /* renamed from: q */
    public int f30343q = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12401z(@C12579k C12341a aVar, @C12579k JsonObject jsonObject) {
        super(aVar, jsonObject, (String) null, (C12217f) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(jsonObject, "value");
        this.f30340n = jsonObject;
        List<String> Q5 = CollectionsKt___CollectionsKt.m40557Q5(mo25399A0().keySet());
        this.f30341o = Q5;
        this.f30342p = Q5.size() * 2;
    }

    @C12579k
    /* renamed from: F0 */
    public JsonObject mo25399A0() {
        return this.f30340n;
    }

    /* renamed from: c */
    public void mo24876c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
    }

    @C12579k
    /* renamed from: g0 */
    public String mo25204g0(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "desc");
        return this.f30341o.get(i / 2);
    }

    @C12579k
    /* renamed from: k0 */
    public C12403k mo25403k0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        if (this.f30343q % 2 == 0) {
            return C12406m.m50168c(str);
        }
        return (C12403k) C10977s0.m41443K(mo25399A0(), str);
    }

    /* renamed from: o */
    public int mo24931o(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        int i = this.f30343q;
        if (i >= this.f30342p - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f30343q = i2;
        return i2;
    }
}
