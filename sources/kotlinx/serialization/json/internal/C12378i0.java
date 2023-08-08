package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.C11400l1;
import kotlin.C11419p1;
import kotlin.C11588t1;
import kotlin.C11679z1;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.i0 */
public final class C12378i0 {
    @C12579k

    /* renamed from: a */
    public static final Set<C12217f> f30313a = C10930d1.m40902u(C12197a.m48820t(C11419p1.f28548b).getDescriptor(), C12197a.m48821u(C11588t1.f28778b).getDescriptor(), C12197a.m48819s(C11400l1.f28530b).getDescriptor(), C12197a.m48822v(C11679z1.f28986b).getDescriptor());

    @C12200d
    /* renamed from: a */
    public static /* synthetic */ void m50067a() {
    }

    /* renamed from: b */
    public static final boolean m50068b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (!fVar.isInline() || !f30313a.contains(fVar)) {
            return false;
        }
        return true;
    }

    @C12200d
    /* renamed from: c */
    public static /* synthetic */ void m50069c(C12217f fVar) {
    }
}
