package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLabelComboLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelComboLink.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelComboLinkKt$LabelComboLargeVerticalLink$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,331:1\n154#2:332\n*S KotlinDebug\n*F\n+ 1 LabelComboLink.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelComboLinkKt$LabelComboLargeVerticalLink$2\n*L\n232#1:332\n*E\n"})
public final class LabelComboLinkKt$LabelComboLargeVerticalLink$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ long $linkColor;
    final /* synthetic */ Integer $linkImageRes;
    final /* synthetic */ long $linkImageTint;
    final /* synthetic */ String $linkText;
    final /* synthetic */ C11289a<C11079d2> $onLinkClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelComboLinkKt$LabelComboLargeVerticalLink$2(long j, Integer num, long j2, String str, C11289a<C11079d2> aVar, int i, int i2) {
        super(2);
        this.$linkImageTint = j;
        this.$linkImageRes = num;
        this.$linkColor = j2;
        this.$linkText = str;
        this.$onLinkClicked = aVar;
        this.$$dirty = i;
        this.$$dirty1 = i2;
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
                ComposerKt.m29845w0(-750432946, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelComboLargeVerticalLink.<anonymous> (LabelComboLink.kt:230)");
            }
            C2428y0.m10726a(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 4), 0.0f, 0.0f, 13, (Object) null), oVar, 6);
            long j = this.$linkImageTint;
            Integer num = this.$linkImageRes;
            long j2 = this.$linkColor;
            String str = this.$linkText;
            C11289a<C11079d2> aVar = this.$onLinkClicked;
            int i2 = this.$$dirty;
            C8592o oVar2 = oVar;
            LabelLinkComponentKt.m151862a(j, num, j2, str, aVar, oVar2, ((i2 >> 12) & 7168) | ((i2 >> 9) & 14) | ((i2 >> 12) & 112) | ((i2 >> 18) & 896) | ((this.$$dirty1 << 12) & 57344));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
