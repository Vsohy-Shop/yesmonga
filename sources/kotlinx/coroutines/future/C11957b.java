package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.future.b */
public final class C11957b<T> implements BiFunction<T, Throwable, C11079d2> {
    @C12580l
    @C11287e
    public volatile C11045c<? super T> cont;

    public C11957b(@C12580l C11045c<? super T> cVar) {
        this.cont = cVar;
    }

    /* renamed from: a */
    public void mo24287a(@C12580l T t, @C12580l Throwable th) {
        CompletionException completionException;
        Throwable cause;
        C11045c<? super T> cVar = this.cont;
        if (cVar != null) {
            if (th == null) {
                Result.C10852a aVar = Result.f28060a;
                cVar.resumeWith(Result.m38702b(t));
                return;
            }
            if (th instanceof CompletionException) {
                completionException = (CompletionException) th;
            } else {
                completionException = null;
            }
            if (!(completionException == null || (cause = completionException.getCause()) == null)) {
                th = cause;
            }
            Result.C10852a aVar2 = Result.f28060a;
            cVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        mo24287a(obj, (Throwable) obj2);
        return C11079d2.f28267a;
    }
}
