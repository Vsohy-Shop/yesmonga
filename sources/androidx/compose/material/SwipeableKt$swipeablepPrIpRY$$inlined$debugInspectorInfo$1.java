package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n1#1,170:1\n575#2,11:171\n*E\n"})
/* renamed from: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ Map $anchors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ C2243g $interactionSource$inlined;
    final /* synthetic */ Orientation $orientation$inlined;
    final /* synthetic */ C3033c1 $resistance$inlined;
    final /* synthetic */ boolean $reverseDirection$inlined;
    final /* synthetic */ SwipeableState $state$inlined;
    final /* synthetic */ C11304p $thresholds$inlined;
    final /* synthetic */ float $velocityThreshold$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, C2243g gVar, C11304p pVar, C3033c1 c1Var, float f) {
        super(1);
        this.$state$inlined = swipeableState;
        this.$anchors$inlined = map;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$interactionSource$inlined = gVar;
        this.$thresholds$inlined = pVar;
        this.$resistance$inlined = c1Var;
        this.$velocityThreshold$inlined = f;
    }

    /* renamed from: a */
    public final void mo10476a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("swipeable");
        v0Var.mo45971b().mo45707c("state", this.$state$inlined);
        v0Var.mo45971b().mo45707c("anchors", this.$anchors$inlined);
        v0Var.mo45971b().mo45707c("orientation", this.$orientation$inlined);
        v0Var.mo45971b().mo45707c("enabled", Boolean.valueOf(this.$enabled$inlined));
        v0Var.mo45971b().mo45707c("reverseDirection", Boolean.valueOf(this.$reverseDirection$inlined));
        v0Var.mo45971b().mo45707c("interactionSource", this.$interactionSource$inlined);
        v0Var.mo45971b().mo45707c("thresholds", this.$thresholds$inlined);
        v0Var.mo45971b().mo45707c("resistance", this.$resistance$inlined);
        v0Var.mo45971b().mo45707c("velocityThreshold", C16483g.m74451w(this.$velocityThreshold$inlined));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10476a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
