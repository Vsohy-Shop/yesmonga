package com.carrefour.fid.android.design.components.compose;

import androidx.compose.material.IconKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HeaderComponentKt$ActionIcon$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Painter $icon;
    final /* synthetic */ long $iconColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$ActionIcon$1(boolean z, long j, Painter painter, String str, int i) {
        super(2);
        this.$enabled = z;
        this.$iconColor = j;
        this.$icon = painter;
        this.$contentDescription = str;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1902999620, i, -1, "com.carrefour.fid.android.design.components.compose.ActionIcon.<anonymous> (HeaderComponent.kt:482)");
            }
            IconKt.m13539b(this.$icon, this.$contentDescription, (C8767m) null, this.$enabled ? this.$iconColor : C37475b.f94185a.mo114204A(), oVar, ((this.$$dirty >> 6) & 112) | 8, 4);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
