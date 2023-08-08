package androidx.compose.foundation.text;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.text.C16361p0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,170:1\n54#2,5:171\n*E\n"})
/* renamed from: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1 */
public final class C2716x3f87673a extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ int $maxLines$inlined;
    final /* synthetic */ int $minLines$inlined;
    final /* synthetic */ C16361p0 $textStyle$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2716x3f87673a(int i, int i2, C16361p0 p0Var) {
        super(1);
        this.$minLines$inlined = i;
        this.$maxLines$inlined = i2;
        this.$textStyle$inlined = p0Var;
    }

    /* renamed from: a */
    public final void mo9297a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("heightInLines");
        v0Var.mo45971b().mo45707c("minLines", Integer.valueOf(this.$minLines$inlined));
        v0Var.mo45971b().mo45707c("maxLines", Integer.valueOf(this.$maxLines$inlined));
        v0Var.mo45971b().mo45707c("textStyle", this.$textStyle$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9297a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
