package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nHeaderComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt$DsHeader$10$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,607:1\n154#2:608\n*S KotlinDebug\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt$DsHeader$10$1\n*L\n236#1:608\n*E\n"})
public final class HeaderComponentKt$DsHeader$10$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $title;
    final /* synthetic */ C16361p0 $titleStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$DsHeader$10$1(String str, C16361p0 p0Var, int i) {
        super(2);
        this.$title = str;
        this.$titleStyle = p0Var;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1858914215, i2, -1, "com.carrefour.fid.android.design.components.compose.DsHeader.<anonymous>.<anonymous> (HeaderComponent.kt:233)");
            }
            C8767m o = PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 16), 0.0f, 11, (Object) null);
            int c = C16449r.f40760b.mo47727c();
            int f = C16432i.f40718b.mo47672f();
            String str = this.$title;
            C16432i g = C16432i.m74172g(f);
            C16361p0 p0Var = this.$titleStyle;
            int i3 = this.$$dirty;
            TextKt.m14196c(str, o, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, g, 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, p0Var, oVar, (i3 & 14) | 48, ((i3 << 3) & 3670016) | 3120, 54780);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
