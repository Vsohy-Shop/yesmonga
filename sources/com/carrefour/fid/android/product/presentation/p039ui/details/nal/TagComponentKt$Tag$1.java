package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTagComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TagComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/TagComponentKt$Tag$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,41:1\n154#2:42\n*S KotlinDebug\n*F\n+ 1 TagComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/TagComponentKt$Tag$1\n*L\n24#1:42\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.TagComponentKt$Tag$1 */
public final class TagComponentKt$Tag$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TagComponentKt$Tag$1(String str, int i) {
        super(2);
        this.$text = str;
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
                ComposerKt.m29845w0(233681080, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.Tag.<anonymous> (TagComponent.kt:20)");
            }
            C8767m m = PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 6), 0.0f, 2, (Object) null);
            long y = C37475b.f94185a.mo114257y();
            C16361p0 k = C7933t0.f19075a.mo11077c(oVar, C7933t0.f19076b).mo11098k();
            TextKt.m14196c(this.$text, m, y, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, k, oVar, (this.$$dirty & 14) | 196656, 0, DefaultImageHeaderParser.f57417e);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
