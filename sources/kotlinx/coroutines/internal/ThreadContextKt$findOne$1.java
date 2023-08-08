package kotlinx.coroutines.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lkotlinx/coroutines/c3;", "found", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(Lkotlinx/coroutines/c3;Lkotlin/coroutines/CoroutineContext$a;)Lkotlinx/coroutines/c3;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ThreadContextKt$findOne$1 extends Lambda implements C11304p<C11726c3<?>, CoroutineContext.C11040a, C11726c3<?>> {

    /* renamed from: f */
    public static final ThreadContextKt$findOne$1 f29568f = new ThreadContextKt$findOne$1();

    public ThreadContextKt$findOne$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final C11726c3<?> invoke(@C12580l C11726c3<?> c3Var, @C12579k CoroutineContext.C11040a aVar) {
        if (c3Var != null) {
            return c3Var;
        }
        if (aVar instanceof C11726c3) {
            return (C11726c3) aVar;
        }
        return null;
    }
}
