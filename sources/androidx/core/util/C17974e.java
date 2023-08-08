package androidx.core.util;

import androidx.annotation.C0376v0;
import java.util.function.Consumer;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(24)
/* renamed from: androidx.core.util.e */
public final class C17974e {
    @C0376v0(24)
    @C12579k
    /* renamed from: a */
    public static final <T> Consumer<T> m81661a(@C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new ContinuationConsumer(cVar);
    }
}
