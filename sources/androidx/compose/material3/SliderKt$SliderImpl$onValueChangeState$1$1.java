package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$SliderImpl$onValueChangeState$1$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C11300l<Float, C11079d2> $onValueChange;
    final /* synthetic */ float $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$onValueChangeState$1$1(float f, C11300l<? super Float, C11079d2> lVar) {
        super(1);
        this.$value = f;
        this.$onValueChange = lVar;
    }

    /* renamed from: a */
    public final void mo11916a(float f) {
        boolean z;
        if (f == this.$value) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.$onValueChange.invoke(Float.valueOf(f));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11916a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
