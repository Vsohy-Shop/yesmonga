package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SheetDefaultsKt$rememberSheetState$2$1 extends Lambda implements C11289a<SheetState> {
    final /* synthetic */ C11300l<SheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ SheetValue $initialValue;
    final /* synthetic */ boolean $skipHiddenState;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SheetDefaultsKt$rememberSheetState$2$1(boolean z, SheetValue sheetValue, C11300l<? super SheetValue, Boolean> lVar, boolean z2) {
        super(0);
        this.$skipPartiallyExpanded = z;
        this.$initialValue = sheetValue;
        this.$confirmValueChange = lVar;
        this.$skipHiddenState = z2;
    }

    @C12579k
    /* renamed from: a */
    public final SheetState invoke() {
        return new SheetState(this.$skipPartiallyExpanded, this.$initialValue, this.$confirmValueChange, this.$skipHiddenState);
    }
}
