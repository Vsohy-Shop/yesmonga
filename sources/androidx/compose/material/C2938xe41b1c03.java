package androidx.compose.material;

import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n1#1,170:1\n50#2,6:171\n*E\n"})
/* renamed from: androidx.compose.material.InteractiveComponentSizeKt$minimumInteractiveComponentSize$$inlined$debugInspectorInfo$1 */
public final class C2938xe41b1c03 extends Lambda implements C11300l<C15983v0, C11079d2> {
    public C2938xe41b1c03() {
        super(1);
    }

    /* renamed from: a */
    public final void mo10229a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("minimumInteractiveComponentSize");
        v0Var.mo45971b().mo45707c("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10229a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
