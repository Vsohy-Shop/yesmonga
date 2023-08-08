package androidx.compose.material3;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarKt$SearchBar$4$1$showResults$2$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8578k2<Float> $animationProgress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$4$1$showResults$2$1(C8578k2<Float> k2Var) {
        super(0);
        this.$animationProgress = k2Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$animationProgress.getValue().floatValue() > 0.0f);
    }
}
