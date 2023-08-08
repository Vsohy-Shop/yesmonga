package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$ScaffoldLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $bottomBar;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2354e1 $contentWindowInsets;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbar;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C2354e1 e1Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, int i2) {
        super(2);
        this.$fabPosition = i;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$contentWindowInsets = e1Var;
        this.$bottomBar = pVar4;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ScaffoldKt.m26078b(this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
