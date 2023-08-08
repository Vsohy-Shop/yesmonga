package kotlinx.coroutines.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lkotlinx/coroutines/internal/z0;", "state", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(Lkotlinx/coroutines/internal/z0;Lkotlin/coroutines/CoroutineContext$a;)Lkotlinx/coroutines/internal/z0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ThreadContextKt$updateState$1 extends Lambda implements C11304p<C12035z0, CoroutineContext.C11040a, C12035z0> {

    /* renamed from: f */
    public static final ThreadContextKt$updateState$1 f29569f = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final C12035z0 invoke(@C12579k C12035z0 z0Var, @C12579k CoroutineContext.C11040a aVar) {
        if (aVar instanceof C11726c3) {
            C11726c3 c3Var = (C11726c3) aVar;
            z0Var.mo24467a(c3Var, c3Var.mo15336p0(z0Var.f29663a));
        }
        return z0Var;
    }
}
