package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12341a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.j */
public final class C12379j {
    @C12579k
    /* renamed from: a */
    public static final C12372g m50070a(@C12579k C12396u uVar, @C12579k C12341a aVar) {
        Intrinsics.checkNotNullParameter(uVar, "sb");
        Intrinsics.checkNotNullParameter(aVar, "json");
        if (aVar.mo25282h().mo25364i()) {
            return new C12377i(uVar, aVar);
        }
        return new C12372g(uVar);
    }
}
