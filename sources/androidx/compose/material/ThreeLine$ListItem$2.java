package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ThreeLine$ListItem$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $overlineText;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $secondaryText;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;
    final /* synthetic */ ThreeLine $tmp0_rcvr;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$2(ThreeLine threeLine, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = threeLine;
        this.$modifier = mVar;
        this.$icon = pVar;
        this.$text = pVar2;
        this.$secondaryText = pVar3;
        this.$overlineText = pVar4;
        this.$trailing = pVar5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo10693a(this.$modifier, this.$icon, this.$text, this.$secondaryText, this.$overlineText, this.$trailing, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
