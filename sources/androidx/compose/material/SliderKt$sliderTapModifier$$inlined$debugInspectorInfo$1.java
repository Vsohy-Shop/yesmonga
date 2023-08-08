package androidx.compose.material;

import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n1#1,170:1\n935#2,10:171\n*E\n"})
public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ C2193f $draggableState$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ C8578k2 $gestureEndAction$inlined;
    final /* synthetic */ C2243g $interactionSource$inlined;
    final /* synthetic */ boolean $isRtl$inlined;
    final /* synthetic */ float $maxPx$inlined;
    final /* synthetic */ C8700z0 $pressOffset$inlined;
    final /* synthetic */ C8578k2 $rawOffset$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(C2193f fVar, C2243g gVar, float f, boolean z, C8578k2 k2Var, C8578k2 k2Var2, C8700z0 z0Var, boolean z2) {
        super(1);
        this.$draggableState$inlined = fVar;
        this.$interactionSource$inlined = gVar;
        this.$maxPx$inlined = f;
        this.$isRtl$inlined = z;
        this.$rawOffset$inlined = k2Var;
        this.$gestureEndAction$inlined = k2Var2;
        this.$pressOffset$inlined = z0Var;
        this.$enabled$inlined = z2;
    }

    /* renamed from: a */
    public final void mo10381a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("sliderTapModifier");
        v0Var.mo45971b().mo45707c("draggableState", this.$draggableState$inlined);
        v0Var.mo45971b().mo45707c("interactionSource", this.$interactionSource$inlined);
        v0Var.mo45971b().mo45707c("maxPx", Float.valueOf(this.$maxPx$inlined));
        v0Var.mo45971b().mo45707c("isRtl", Boolean.valueOf(this.$isRtl$inlined));
        v0Var.mo45971b().mo45707c("rawOffset", this.$rawOffset$inlined);
        v0Var.mo45971b().mo45707c("gestureEndAction", this.$gestureEndAction$inlined);
        v0Var.mo45971b().mo45707c("pressOffset", this.$pressOffset$inlined);
        v0Var.mo45971b().mo45707c("enabled", Boolean.valueOf(this.$enabled$inlined));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10381a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
