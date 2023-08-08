package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.intrinsics.C12037b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.b3 */
public final class C11719b3 {
    @C12579k
    /* renamed from: a */
    public static final C11702a0 m46153a(@C12580l C11723c2 c2Var) {
        return new C11706a3(c2Var);
    }

    /* renamed from: c */
    public static /* synthetic */ C11702a0 m46155c(C11723c2 c2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            c2Var = null;
        }
        return m46153a(c2Var);
    }

    /* renamed from: d */
    public static /* synthetic */ C11723c2 m46156d(C11723c2 c2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            c2Var = null;
        }
        return m46153a(c2Var);
    }

    @C12580l
    /* renamed from: e */
    public static final <R> Object m46157e(@C12579k C11304p<? super C12074o0, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        C12182z2 z2Var = new C12182z2(cVar.getContext(), cVar);
        Object e = C12037b.m48053e(z2Var, z2Var, pVar);
        if (e == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return e;
    }
}
