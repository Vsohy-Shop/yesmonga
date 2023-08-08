package androidx.compose.foundation.gestures.snapping;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "delta", "Lkotlin/d2;", "a", "(F)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapFlingBehavior$longSnap$5 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C11300l<Float, C11079d2> $onAnimationStep;
    final /* synthetic */ Ref.FloatRef $remainingScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$longSnap$5(Ref.FloatRef floatRef, C11300l<? super Float, C11079d2> lVar) {
        super(1);
        this.$remainingScrollOffset = floatRef;
        this.$onAnimationStep = lVar;
    }

    /* renamed from: a */
    public final void mo7563a(float f) {
        Ref.FloatRef floatRef = this.$remainingScrollOffset;
        float f2 = floatRef.element - f;
        floatRef.element = f2;
        this.$onAnimationStep.invoke(Float.valueOf(f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7563a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
