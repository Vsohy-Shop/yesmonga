package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/material/BottomDrawerValue;", "it", "Landroidx/compose/material/BottomDrawerState;", "a", "(Landroidx/compose/material/BottomDrawerValue;)Landroidx/compose/material/BottomDrawerState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomDrawerState$Companion$Saver$2 extends Lambda implements C11300l<BottomDrawerValue, BottomDrawerState> {
    final /* synthetic */ C11300l<BottomDrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$Companion$Saver$2(C11300l<? super BottomDrawerValue, Boolean> lVar) {
        super(1);
        this.$confirmStateChange = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final BottomDrawerState invoke(@C12579k BottomDrawerValue bottomDrawerValue) {
        Intrinsics.checkNotNullParameter(bottomDrawerValue, "it");
        return new BottomDrawerState(bottomDrawerValue, this.$confirmStateChange);
    }
}
