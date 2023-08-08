package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$onValueChangeState$1$1 extends Lambda implements C11300l<C11457f<Float>, C11079d2> {
    final /* synthetic */ C11300l<C11457f<Float>, C11079d2> $onValueChange;
    final /* synthetic */ C11457f<Float> $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$onValueChangeState$1$1(C11457f<Float> fVar, C11300l<? super C11457f<Float>, C11079d2> lVar) {
        super(1);
        this.$value = fVar;
        this.$onValueChange = lVar;
    }

    /* renamed from: a */
    public final void mo11904a(@C12579k C11457f<Float> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "it");
        if (!Intrinsics.areEqual((Object) fVar, (Object) this.$value)) {
            this.$onValueChange.invoke(fVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11904a((C11457f) obj);
        return C11079d2.f28267a;
    }
}
