package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/material3/DismissValue;", "it", "Landroidx/compose/material3/DismissState;", "a", "(Landroidx/compose/material3/DismissValue;)Landroidx/compose/material3/DismissState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DismissState$Companion$Saver$2 extends Lambda implements C11300l<DismissValue, DismissState> {
    final /* synthetic */ C11300l<DismissValue, Boolean> $confirmValueChange;
    final /* synthetic */ C11304p<C16479d, Float, Float> $positionalThreshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DismissState$Companion$Saver$2(C11300l<? super DismissValue, Boolean> lVar, C11304p<? super C16479d, ? super Float, Float> pVar) {
        super(1);
        this.$confirmValueChange = lVar;
        this.$positionalThreshold = pVar;
    }

    @C12580l
    /* renamed from: a */
    public final DismissState invoke(@C12579k DismissValue dismissValue) {
        Intrinsics.checkNotNullParameter(dismissValue, "it");
        return new DismissState(dismissValue, this.$confirmValueChange, this.$positionalThreshold);
    }
}
