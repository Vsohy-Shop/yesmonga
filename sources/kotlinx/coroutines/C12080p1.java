package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C11414o;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* renamed from: kotlinx.coroutines.p1 */
public final class C12080p1 {
    @C12579k
    /* renamed from: a */
    public static final CancellationException m48273a(@C12580l String str, @C12580l Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    public static final void m48274b(@C12579k Throwable th, @C12579k Throwable th2) {
        C11414o.m43942a(th, th2);
    }
}
