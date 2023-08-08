package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements C11300l<Float, Float> {
    final /* synthetic */ C8578k2<C11300l<Float, Float>> $lambdaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableStateKt$rememberScrollableState$1$1(C8578k2<? extends C11300l<? super Float, Float>> k2Var) {
        super(1);
        this.$lambdaState = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public final Float mo7458a(float f) {
        return (Float) this.$lambdaState.getValue().invoke(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo7458a(((Number) obj).floatValue());
    }
}
