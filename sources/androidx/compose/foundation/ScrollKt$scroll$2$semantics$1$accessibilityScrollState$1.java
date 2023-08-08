package androidx.compose.foundation;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1 extends Lambda implements C11289a<Float> {
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(ScrollState scrollState) {
        super(0);
        this.$state = scrollState;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        return Float.valueOf((float) this.$state.mo7258r());
    }
}
