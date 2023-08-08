package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 extends Lambda implements C11289a<C2549h> {
    final /* synthetic */ C8578k2<C2549h> $currentItemProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(C8578k2<? extends C2549h> k2Var) {
        super(0);
        this.$currentItemProvider = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public final C2549h invoke() {
        return this.$currentItemProvider.getValue();
    }
}
