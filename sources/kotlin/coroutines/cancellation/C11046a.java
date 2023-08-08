package kotlin.coroutines.cancellation;

import java.util.concurrent.CancellationException;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* renamed from: kotlin.coroutines.cancellation.a */
public final class C11046a {
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: a */
    public static final CancellationException m42578a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: b */
    public static final CancellationException m42579b(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @C11665v0(version = "1.4")
    /* renamed from: c */
    public static /* synthetic */ void m42580c() {
    }
}
