package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2373k;
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
public final class NavigationRailKt$NavigationRail$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $header;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$2(C8767m mVar, long j, long j2, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C2354e1 e1Var, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$header = qVar;
        this.$windowInsets = e1Var;
        this.$content = qVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NavigationRailKt.m25960a(this.$modifier, this.$containerColor, this.$contentColor, this.$header, this.$windowInsets, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
