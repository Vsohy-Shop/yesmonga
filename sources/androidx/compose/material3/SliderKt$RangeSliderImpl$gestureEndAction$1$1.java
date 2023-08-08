package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$gestureEndAction$1$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$gestureEndAction$1$1(C11289a<C11079d2> aVar) {
        super(1);
        this.$onValueChangeFinished = aVar;
    }

    /* renamed from: a */
    public final void mo11902a(boolean z) {
        C11289a<C11079d2> aVar = this.$onValueChangeFinished;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11902a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
