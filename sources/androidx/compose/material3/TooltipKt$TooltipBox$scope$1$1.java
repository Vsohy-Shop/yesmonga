package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

public final class TooltipKt$TooltipBox$scope$1$1 implements C8254n3 {

    /* renamed from: a */
    public final /* synthetic */ C8265p3 f19947a;

    /* renamed from: b */
    public final /* synthetic */ C12074o0 f19948b;

    /* renamed from: c */
    public final /* synthetic */ String f19949c;

    public TooltipKt$TooltipBox$scope$1$1(C8265p3 p3Var, C12074o0 o0Var, String str) {
        this.f19947a = p3Var;
        this.f19948b = o0Var;
        this.f19949c = str;
    }

    @C12579k
    /* renamed from: a */
    public C8767m mo12382a(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1(this.f19948b, this.f19947a);
        return SemanticsModifierKt.m71867b(SuspendingPointerInputFilterKt.m68437c(mVar, this.f19947a, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1, (C11045c<? super TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1>) null)), true, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2(this.f19949c, tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1));
    }
}
