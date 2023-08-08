package androidx.constraintlayout.compose;

import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ String $layoutId$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1(String str) {
        super(1);
        this.$layoutId$inlined = str;
    }

    /* renamed from: a */
    public final void mo48353a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("constraintLayoutId");
        v0Var.mo45974e(this.$layoutId$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48353a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
