package androidx.lifecycle;

import com.urbanairship.iam.events.C9175a;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.e */
public final class C19405e implements Closeable, C12074o0 {
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f49790a;

    public C19405e(@C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        this.f49790a = coroutineContext;
    }

    public void close() {
        C11968h2.m47689i(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f49790a;
    }
}
