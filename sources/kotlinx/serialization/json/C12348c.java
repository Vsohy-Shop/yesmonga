package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.List;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C12402j
/* renamed from: kotlinx.serialization.json.c */
public final class C12348c {
    @C12579k

    /* renamed from: a */
    public final List<C12403k> f30181a = new ArrayList();

    /* renamed from: a */
    public final boolean mo25325a(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        this.f30181a.add(kVar);
        return true;
    }

    @C12579k
    @C11532s0
    /* renamed from: b */
    public final C12344b mo25326b() {
        return new C12344b(this.f30181a);
    }
}
