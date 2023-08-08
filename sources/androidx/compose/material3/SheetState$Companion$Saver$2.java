package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/material3/SheetValue;", "savedValue", "Landroidx/compose/material3/SheetState;", "a", "(Landroidx/compose/material3/SheetValue;)Landroidx/compose/material3/SheetState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SheetState$Companion$Saver$2 extends Lambda implements C11300l<SheetValue, SheetState> {
    final /* synthetic */ C11300l<SheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SheetState$Companion$Saver$2(boolean z, C11300l<? super SheetValue, Boolean> lVar) {
        super(1);
        this.$skipPartiallyExpanded = z;
        this.$confirmValueChange = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final SheetState invoke(@C12579k SheetValue sheetValue) {
        Intrinsics.checkNotNullParameter(sheetValue, "savedValue");
        return new SheetState(this.$skipPartiallyExpanded, sheetValue, this.$confirmValueChange, false, 8, (DefaultConstructorMarker) null);
    }
}
