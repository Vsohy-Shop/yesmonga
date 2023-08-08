package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class FlowExtKt {
    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m90498a(@C12579k C11907e<? extends T> eVar, @C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(state, "minActiveState");
        return C11909g.m47488s(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, eVar, (C11045c<? super FlowExtKt$flowWithLifecycle$1>) null));
    }

    /* renamed from: b */
    public static /* synthetic */ C11907e m90499b(C11907e eVar, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return m90498a(eVar, lifecycle, state);
    }
}
