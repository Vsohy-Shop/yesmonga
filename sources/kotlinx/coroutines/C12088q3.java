package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlinx.coroutines.internal.C12000k;
import kotlinx.coroutines.internal.C12002l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.q3 */
public final class C12088q3 {
    @C12580l
    /* renamed from: a */
    public static final Object m48293a(@C12579k C11045c<? super C11079d2> cVar) {
        C12000k kVar;
        Object obj;
        CoroutineContext context = cVar.getContext();
        C11804f2.m46978z(context);
        C11045c<? super C11079d2> d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar);
        if (d instanceof C12000k) {
            kVar = (C12000k) d;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            obj = C11079d2.f28267a;
        } else {
            if (kVar.f29599d.mo23565U(context)) {
                kVar.mo24369n(context, C11079d2.f28267a);
            } else {
                C12082p3 p3Var = new C12082p3();
                CoroutineContext Q = context.mo7443Q(p3Var);
                C11079d2 d2Var = C11079d2.f28267a;
                kVar.mo24369n(Q, d2Var);
                if (p3Var.f29729b) {
                    if (C12002l.m47872f(kVar)) {
                        obj = C11063b.m42612h();
                    } else {
                        obj = d2Var;
                    }
                }
            }
            obj = C11063b.m42612h();
        }
        if (obj == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (obj == C11063b.m42612h()) {
            return obj;
        }
        return C11079d2.f28267a;
    }
}
