package androidx.compose.material3;

import androidx.compose.p004ui.platform.C15983v0;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n*L\n1#1,170:1\n137#2,6:171\n*E\n"})
public final class SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ C8179c $anchorChangeHandler$inlined;
    final /* synthetic */ C11304p $calculateAnchor$inlined;
    final /* synthetic */ Set $possibleValues$inlined;
    final /* synthetic */ SwipeableV2State $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(SwipeableV2State swipeableV2State, Set set, C8179c cVar, C11304p pVar) {
        super(1);
        this.$state$inlined = swipeableV2State;
        this.$possibleValues$inlined = set;
        this.$anchorChangeHandler$inlined = cVar;
        this.$calculateAnchor$inlined = pVar;
    }

    /* renamed from: a */
    public final void mo12080a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("swipeAnchors");
        v0Var.mo45971b().mo45707c("state", this.$state$inlined);
        v0Var.mo45971b().mo45707c("possibleValues", this.$possibleValues$inlined);
        v0Var.mo45971b().mo45707c("anchorChangeHandler", this.$anchorChangeHandler$inlined);
        v0Var.mo45971b().mo45707c("calculateAnchor", this.$calculateAnchor$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12080a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
