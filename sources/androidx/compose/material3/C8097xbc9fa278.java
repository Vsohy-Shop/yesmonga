package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15492p;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/w;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/input/pointer/w;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 */
public final class C8097xbc9fa278 extends Lambda implements C11300l<C15507w, C11079d2> {
    final /* synthetic */ Ref.BooleanRef $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ C8578k2<C11304p<Boolean, Float, C11079d2>> $onDrag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8097xbc9fa278(C8578k2<? extends C11304p<? super Boolean, ? super Float, C11079d2>> k2Var, Ref.BooleanRef booleanRef, boolean z) {
        super(1);
        this.$onDrag = k2Var;
        this.$draggingStart = booleanRef;
        this.$isRtl = z;
    }

    /* renamed from: a */
    public final void mo11924a(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "it");
        float p = C15094f.m64880p(C15492p.m68691k(wVar));
        C11304p value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.element);
        if (this.$isRtl) {
            p = -p;
        }
        value.invoke(valueOf, Float.valueOf(p));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11924a((C15507w) obj);
        return C11079d2.f28267a;
    }
}
