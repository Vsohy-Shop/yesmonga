package androidx.compose.material;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TabKt$TabBaselineLayout$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i) {
        super(2);
        this.$text = pVar;
        this.$icon = pVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TabKt.m14076d(this.$text, this.$icon, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
