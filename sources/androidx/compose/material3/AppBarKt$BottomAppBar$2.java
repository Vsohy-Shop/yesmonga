package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$BottomAppBar$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$2(C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, long j, long j2, float f, C2366i0 i0Var, C2354e1 e1Var, int i, int i2) {
        super(2);
        this.$actions = qVar;
        this.$modifier = mVar;
        this.$floatingActionButton = pVar;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$tonalElevation = f;
        this.$contentPadding = i0Var;
        this.$windowInsets = e1Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AppBarKt.m25382b(this.$actions, this.$modifier, this.$floatingActionButton, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$contentPadding, this.$windowInsets, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
