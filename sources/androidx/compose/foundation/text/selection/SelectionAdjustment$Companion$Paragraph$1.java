package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SelectionAdjustment$Companion$Paragraph$1 implements SelectionAdjustment {
    /* renamed from: a */
    public long mo9594a(@C12579k C16260h0 h0Var, long j, int i, boolean z, @C12580l C16356n0 n0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        return SelectionAdjustment.Companion.f7344a.mo9595b(h0Var, j, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(h0Var.mo47058l().mo47040n()));
    }
}
