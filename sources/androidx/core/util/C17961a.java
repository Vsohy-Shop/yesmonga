package androidx.core.util;

import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.a */
public final class C17961a {
    @C12579k
    /* renamed from: a */
    public static final <T> C17970d<T> m81591a(@C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new AndroidXContinuationConsumer(cVar);
    }
}
