package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n1#1,170:1\n210#2,11:171\n*E\n"})
public final class DraggableKt$draggable$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ C11300l $canDrag$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ C2243g $interactionSource$inlined;
    final /* synthetic */ C11305q $onDragStarted$inlined;
    final /* synthetic */ C11305q $onDragStopped$inlined;
    final /* synthetic */ Orientation $orientation$inlined;
    final /* synthetic */ boolean $reverseDirection$inlined;
    final /* synthetic */ C11289a $startDragImmediately$inlined;
    final /* synthetic */ C2193f $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$$inlined$debugInspectorInfo$1(C11300l lVar, Orientation orientation, boolean z, boolean z2, C2243g gVar, C11289a aVar, C11305q qVar, C11305q qVar2, C2193f fVar) {
        super(1);
        this.$canDrag$inlined = lVar;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$interactionSource$inlined = gVar;
        this.$startDragImmediately$inlined = aVar;
        this.$onDragStarted$inlined = qVar;
        this.$onDragStopped$inlined = qVar2;
        this.$state$inlined = fVar;
    }

    /* renamed from: a */
    public final void mo7394a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("draggable");
        v0Var.mo45971b().mo45707c("canDrag", this.$canDrag$inlined);
        v0Var.mo45971b().mo45707c("orientation", this.$orientation$inlined);
        v0Var.mo45971b().mo45707c("enabled", Boolean.valueOf(this.$enabled$inlined));
        v0Var.mo45971b().mo45707c("reverseDirection", Boolean.valueOf(this.$reverseDirection$inlined));
        v0Var.mo45971b().mo45707c("interactionSource", this.$interactionSource$inlined);
        v0Var.mo45971b().mo45707c("startDragImmediately", this.$startDragImmediately$inlined);
        v0Var.mo45971b().mo45707c("onDragStarted", this.$onDragStarted$inlined);
        v0Var.mo45971b().mo45707c("onDragStopped", this.$onDragStopped$inlined);
        v0Var.mo45971b().mo45707c("state", this.$state$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7394a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
