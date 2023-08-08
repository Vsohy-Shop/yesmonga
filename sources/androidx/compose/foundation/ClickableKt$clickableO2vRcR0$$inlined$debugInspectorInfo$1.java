package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.semantics.C16031g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n199#2,8:171\n*E\n"})
/* renamed from: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ C2104a0 $indication$inlined;
    final /* synthetic */ C2243g $interactionSource$inlined;
    final /* synthetic */ C11289a $onClick$inlined;
    final /* synthetic */ String $onClickLabel$inlined;
    final /* synthetic */ C16031g $role$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(boolean z, String str, C16031g gVar, C11289a aVar, C2104a0 a0Var, C2243g gVar2) {
        super(1);
        this.$enabled$inlined = z;
        this.$onClickLabel$inlined = str;
        this.$role$inlined = gVar;
        this.$onClick$inlined = aVar;
        this.$indication$inlined = a0Var;
        this.$interactionSource$inlined = gVar2;
    }

    /* renamed from: a */
    public final void mo7143a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("clickable");
        v0Var.mo45971b().mo45707c("enabled", Boolean.valueOf(this.$enabled$inlined));
        v0Var.mo45971b().mo45707c("onClickLabel", this.$onClickLabel$inlined);
        v0Var.mo45971b().mo45707c("role", this.$role$inlined);
        v0Var.mo45971b().mo45707c("onClick", this.$onClick$inlined);
        v0Var.mo45971b().mo45707c("indication", this.$indication$inlined);
        v0Var.mo45971b().mo45707c("interactionSource", this.$interactionSource$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7143a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
