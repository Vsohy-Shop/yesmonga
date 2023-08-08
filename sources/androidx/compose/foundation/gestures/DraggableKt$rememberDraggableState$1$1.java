package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DraggableKt$rememberDraggableState$1$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C8578k2<C11300l<Float, C11079d2>> $onDeltaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$rememberDraggableState$1$1(C8578k2<? extends C11300l<? super Float, C11079d2>> k2Var) {
        super(1);
        this.$onDeltaState = k2Var;
    }

    /* renamed from: a */
    public final void mo7412a(float f) {
        this.$onDeltaState.getValue().invoke(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7412a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
