package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kotlin.jvm.functions.C11304p;

/* renamed from: kotlinx.coroutines.future.c */
public final /* synthetic */ class C11958c implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C11304p f29543a;

    public /* synthetic */ C11958c(C11304p pVar) {
        this.f29543a = pVar;
    }

    public final Object apply(Object obj, Object obj2) {
        return FutureKt.m47649f(this.f29543a, obj, (Throwable) obj2);
    }
}
