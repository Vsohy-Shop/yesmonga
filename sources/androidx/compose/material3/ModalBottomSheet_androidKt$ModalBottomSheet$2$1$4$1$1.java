package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $animateToDismiss;
    final /* synthetic */ String $collapseActionLabel;
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ SheetState $sheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1(SheetState sheetState, String str, String str2, String str3, C11289a<C11079d2> aVar, C12074o0 o0Var) {
        super(1);
        this.$sheetState = sheetState;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$animateToDismiss = aVar;
        this.$scope = o0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SheetState sheetState = this.$sheetState;
        String str = this.$dismissActionLabel;
        String str2 = this.$expandActionLabel;
        String str3 = this.$collapseActionLabel;
        C11289a<C11079d2> aVar = this.$animateToDismiss;
        C12074o0 o0Var = this.$scope;
        SemanticsPropertiesKt.m72022k(qVar, str, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$1(aVar));
        if (sheetState.mo11856d() == SheetValue.PartiallyExpanded) {
            SemanticsPropertiesKt.m72028n(qVar, str2, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$2(sheetState, o0Var, sheetState));
        } else if (sheetState.mo11858f()) {
            SemanticsPropertiesKt.m72004c(qVar, str3, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$3(sheetState, o0Var));
        }
    }
}
