package kotlinx.coroutines.android;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.C12164w0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.android.d */
public abstract class C11711d extends C12064m2 implements C12164w0 {
    public /* synthetic */ C11711d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        return C12164w0.C12165a.m48734b(this, j, runnable, coroutineContext);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @C12580l
    /* renamed from: N */
    public Object mo23721N(long j, @C12579k C11045c<? super C11079d2> cVar) {
        return C12164w0.C12165a.m48733a(this, j, cVar);
    }

    @C12579k
    /* renamed from: c0 */
    public abstract C11711d mo23707c0();

    public C11711d() {
    }
}
