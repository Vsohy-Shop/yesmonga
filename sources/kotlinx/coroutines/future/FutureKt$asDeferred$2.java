package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12051l0;
import kotlinx.coroutines.C12169x;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00050\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"T", "kotlin.jvm.PlatformType", "value", "", "exception", "", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FutureKt$asDeferred$2 extends Lambda implements C11304p<T, Throwable, Object> {
    final /* synthetic */ C12169x<T> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FutureKt$asDeferred$2(C12169x<T> xVar) {
        super(2);
        this.$result = xVar;
    }

    /* renamed from: a */
    public final Object invoke(T t, Throwable th) {
        boolean z;
        CompletionException completionException;
        if (th == null) {
            try {
                z = this.$result.mo24789G(t);
            } catch (Throwable th2) {
                C12051l0.m48104b(EmptyCoroutineContext.f28243a, th2);
                return C11079d2.f28267a;
            }
        } else {
            C12169x<T> xVar = this.$result;
            if (th instanceof CompletionException) {
                completionException = (CompletionException) th;
            } else {
                completionException = null;
            }
            if (completionException != null) {
                Throwable cause = completionException.getCause();
                if (cause != null) {
                    th = cause;
                }
            }
            z = xVar.mo24790i(th);
        }
        return Boolean.valueOf(z);
    }
}
