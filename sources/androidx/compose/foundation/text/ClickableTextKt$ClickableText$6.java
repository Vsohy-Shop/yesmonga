package androidx.compose.foundation.text;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ClickableTextKt$ClickableText$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Integer, C11079d2> $onClick;
    final /* synthetic */ C11300l<Integer, C11079d2> $onHover;
    final /* synthetic */ C11300l<C16260h0, C11079d2> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ C16361p0 $style;
    final /* synthetic */ C16156d $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$6(C16156d dVar, C11300l<? super Integer, C11079d2> lVar, C8767m mVar, C16361p0 p0Var, boolean z, int i, int i2, C11300l<? super C16260h0, C11079d2> lVar2, C11300l<? super Integer, C11079d2> lVar3, int i3, int i4) {
        super(2);
        this.$text = dVar;
        this.$onHover = lVar;
        this.$modifier = mVar;
        this.$style = p0Var;
        this.$softWrap = z;
        this.$overflow = i;
        this.$maxLines = i2;
        this.$onTextLayout = lVar2;
        this.$onClick = lVar3;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ClickableTextKt.m12219a(this.$text, this.$onHover, this.$modifier, this.$style, this.$softWrap, this.$overflow, this.$maxLines, this.$onTextLayout, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
