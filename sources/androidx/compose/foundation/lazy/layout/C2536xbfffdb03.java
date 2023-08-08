package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.C8624c;
import kotlin.C11076d0;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1 */
public final class C2536xbfffdb03 extends Lambda implements C11289a<LazySaveableStateHolder> {
    final /* synthetic */ C8624c $currentRegistry;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2536xbfffdb03(C8624c cVar) {
        super(0);
        this.$currentRegistry = cVar;
    }

    @C12579k
    /* renamed from: a */
    public final LazySaveableStateHolder invoke() {
        return new LazySaveableStateHolder(this.$currentRegistry, C10977s0.m41492z());
    }
}
