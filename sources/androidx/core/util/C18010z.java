package androidx.core.util;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.z */
public final class C18010z {
    @C12579k
    /* renamed from: a */
    public static final Runnable m81803a(@C12579k C11045c<? super C11079d2> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new ContinuationRunnable(cVar);
    }
}
