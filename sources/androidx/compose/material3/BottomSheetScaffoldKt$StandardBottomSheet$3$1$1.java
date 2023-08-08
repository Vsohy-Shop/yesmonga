package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ String $partialExpandActionLabel;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(SheetState sheetState, boolean z, String str, String str2, String str3, C12074o0 o0Var) {
        super(1);
        this.$state = sheetState;
        this.$sheetSwipeEnabled = z;
        this.$expandActionLabel = str;
        this.$partialExpandActionLabel = str2;
        this.$dismissActionLabel = str3;
        this.$scope = o0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SheetState sheetState = this.$state;
        boolean z = this.$sheetSwipeEnabled;
        String str = this.$expandActionLabel;
        String str2 = this.$partialExpandActionLabel;
        String str3 = this.$dismissActionLabel;
        C12074o0 o0Var = this.$scope;
        if (sheetState.mo11862j().mo12109m().size() > 1 && z) {
            SheetValue d = sheetState.mo11856d();
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            if (d == sheetValue) {
                if (sheetState.mo11862j().mo12112p().invoke(SheetValue.Expanded).booleanValue()) {
                    SemanticsPropertiesKt.m72028n(qVar, str, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1(o0Var, sheetState));
                }
            } else if (sheetState.mo11862j().mo12112p().invoke(sheetValue).booleanValue()) {
                SemanticsPropertiesKt.m72004c(qVar, str2, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$2(o0Var, sheetState));
            }
            if (!sheetState.mo11860h()) {
                SemanticsPropertiesKt.m72022k(qVar, str3, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3(o0Var, sheetState));
            }
        }
    }
}
