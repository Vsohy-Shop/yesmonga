package kotlinx.coroutines.flow.internal;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.internal.C12001k0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SafeCollector_commonKt {
    @C11314h(name = "checkContext")
    /* renamed from: a */
    public static final void m47565a(@C12579k SafeCollector<?> safeCollector, @C12579k CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.mo7446l(0, new SafeCollector_commonKt$checkContext$result$1(safeCollector))).intValue() != safeCollector.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    @C12580l
    /* renamed from: b */
    public static final C11723c2 m47566b(@C12580l C11723c2 c2Var, @C12580l C11723c2 c2Var2) {
        while (c2Var != null) {
            if (c2Var == c2Var2 || !(c2Var instanceof C12001k0)) {
                return c2Var;
            }
            c2Var = c2Var.getParent();
        }
        return null;
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public static final <T> C11907e<T> m47567c(@C12579k @C10863b C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new SafeCollector_commonKt$unsafeFlow$1(pVar);
    }
}
