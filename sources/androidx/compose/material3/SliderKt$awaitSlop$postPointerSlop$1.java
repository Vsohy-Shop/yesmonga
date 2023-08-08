package androidx.compose.material3;

import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/w;", "pointerInput", "", "offset", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/input/pointer/w;F)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SliderKt$awaitSlop$postPointerSlop$1 extends Lambda implements C11304p<C15507w, Float, C11079d2> {
    final /* synthetic */ Ref.FloatRef $initialDelta;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$awaitSlop$postPointerSlop$1(Ref.FloatRef floatRef) {
        super(2);
        this.$initialDelta = floatRef;
    }

    /* renamed from: a */
    public final void mo11919a(@C12579k C15507w wVar, float f) {
        Intrinsics.checkNotNullParameter(wVar, "pointerInput");
        wVar.mo44168a();
        this.$initialDelta.element = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo11919a((C15507w) obj, ((Number) obj2).floatValue());
        return C11079d2.f28267a;
    }
}
