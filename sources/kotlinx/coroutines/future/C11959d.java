package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kotlinx.coroutines.C11723c2;

/* renamed from: kotlinx.coroutines.future.d */
public final /* synthetic */ class C11959d implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C11723c2 f29544a;

    public /* synthetic */ C11959d(C11723c2 c2Var) {
        this.f29544a = c2Var;
    }

    public final Object apply(Object obj, Object obj2) {
        return FutureKt.m47654k(this.f29544a, obj, (Throwable) obj2);
    }
}
