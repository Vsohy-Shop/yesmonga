package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.unit.C16483g;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n1#1,170:1\n133#2,8:171\n*E\n"})
/* renamed from: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 */
public final class C8135x343b27c2 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ C8189d3 $colors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ float $focusedIndicatorLineThickness$inlined;
    final /* synthetic */ C2241e $interactionSource$inlined;
    final /* synthetic */ boolean $isError$inlined;
    final /* synthetic */ float $unfocusedIndicatorLineThickness$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8135x343b27c2(boolean z, boolean z2, C2241e eVar, C8189d3 d3Var, float f, float f2) {
        super(1);
        this.$enabled$inlined = z;
        this.$isError$inlined = z2;
        this.$interactionSource$inlined = eVar;
        this.$colors$inlined = d3Var;
        this.$focusedIndicatorLineThickness$inlined = f;
        this.$unfocusedIndicatorLineThickness$inlined = f2;
    }

    /* renamed from: a */
    public final void mo12200a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("indicatorLine");
        v0Var.mo45971b().mo45707c("enabled", Boolean.valueOf(this.$enabled$inlined));
        v0Var.mo45971b().mo45707c("isError", Boolean.valueOf(this.$isError$inlined));
        v0Var.mo45971b().mo45707c("interactionSource", this.$interactionSource$inlined);
        v0Var.mo45971b().mo45707c(C9874a.f27063h, this.$colors$inlined);
        v0Var.mo45971b().mo45707c("focusedIndicatorLineThickness", C16483g.m74451w(this.$focusedIndicatorLineThickness$inlined));
        v0Var.mo45971b().mo45707c("unfocusedIndicatorLineThickness", C16483g.m74451w(this.$unfocusedIndicatorLineThickness$inlined));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12200a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
