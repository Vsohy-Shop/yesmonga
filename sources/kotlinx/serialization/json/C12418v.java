package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12402j
/* renamed from: kotlinx.serialization.json.v */
public final class C12418v {
    @C12579k

    /* renamed from: a */
    public final Map<String, C12403k> f30357a = new LinkedHashMap();

    @C12579k
    @C11532s0
    /* renamed from: a */
    public final JsonObject mo25560a() {
        return new JsonObject(this.f30357a);
    }

    @C12580l
    /* renamed from: b */
    public final C12403k mo25561b(@C12579k String str, @C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(kVar, "element");
        return this.f30357a.put(str, kVar);
    }
}
