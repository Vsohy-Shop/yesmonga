package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TransformableStateKt$rememberTransformableState$1$1 extends Lambda implements C11305q<Float, C15094f, Float, C11079d2> {
    final /* synthetic */ C8578k2<C11305q<Float, C15094f, Float, C11079d2>> $lambdaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$rememberTransformableState$1$1(C8578k2<? extends C11305q<? super Float, ? super C15094f, ? super Float, C11079d2>> k2Var) {
        super(3);
        this.$lambdaState = k2Var;
    }

    /* renamed from: a */
    public final void mo7521a(float f, long j, float f2) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f), C15094f.m64868d(j), Float.valueOf(f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo7521a(((Number) obj).floatValue(), ((C15094f) obj2).mo42242A(), ((Number) obj3).floatValue());
        return C11079d2.f28267a;
    }
}
