package androidx.compose.foundation;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ClickableKt$clickable$4$delayPressInteraction$1$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8700z0<Boolean> $isClickableInScrollableContainer;
    final /* synthetic */ C11289a<Boolean> $isRootInScrollableContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4$delayPressInteraction$1$1(C8700z0<Boolean> z0Var, C11289a<Boolean> aVar) {
        super(0);
        this.$isClickableInScrollableContainer = z0Var;
        this.$isRootInScrollableContainer = aVar;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isClickableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
