package androidx.compose.material;

import androidx.compose.foundation.text.C2762c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextKt$Text$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ C16242u $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ C16190e0 $fontStyle;
    final /* synthetic */ C16209i0 $fontWeight;
    final /* synthetic */ Map<String, C2762c> $inlineContent;
    final /* synthetic */ long $letterSpacing;
    final /* synthetic */ long $lineHeight;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C16260h0, C11079d2> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ C16361p0 $style;
    final /* synthetic */ C16156d $text;
    final /* synthetic */ C16432i $textAlign;
    final /* synthetic */ C16434j $textDecoration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextKt$Text$6(C16156d dVar, C8767m mVar, long j, long j2, C16190e0 e0Var, C16209i0 i0Var, C16242u uVar, long j3, C16434j jVar, C16432i iVar, long j4, int i, boolean z, int i2, int i3, Map<String, C2762c> map, C11300l<? super C16260h0, C11079d2> lVar, C16361p0 p0Var, int i4, int i5, int i6) {
        super(2);
        this.$text = dVar;
        this.$modifier = mVar;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = e0Var;
        this.$fontWeight = i0Var;
        this.$fontFamily = uVar;
        this.$letterSpacing = j3;
        this.$textDecoration = jVar;
        this.$textAlign = iVar;
        this.$lineHeight = j4;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$inlineContent = map;
        this.$onTextLayout = lVar;
        this.$style = p0Var;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C16156d dVar = this.$text;
        C16156d dVar2 = dVar;
        TextKt.m14197d(dVar2, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$inlineContent, this.$onTextLayout, this.$style, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
