package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/SearchComponentKt$SearchComponent$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,86:1\n154#2:87\n*S KotlinDebug\n*F\n+ 1 SearchComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/SearchComponentKt$SearchComponent$1$2\n*L\n61#1:87\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.SearchComponentKt$SearchComponent$1$2 */
public final class SearchComponentKt$SearchComponent$1$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onClearInput;
    final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchComponentKt$SearchComponent$1$2(String str, C11289a<C11079d2> aVar) {
        super(2);
        this.$text = str;
        this.$onClearInput = aVar;
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
                ComposerKt.m29845w0(1675971866, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.SearchComponent.<anonymous>.<anonymous> (SearchComponent.kt:54)");
            }
            if (this.$text.length() > 0) {
                IconKt.m13539b(C16015f.m71849d(R.drawable.ic_close_one_app, oVar, 0), (String) null, PaddingKt.m10024k(ClickableKt.m8878e(C8767m.f23478j, false, (String) null, (C16031g) null, this.$onClearInput, 7, (Object) null), C16483g.m74435M((float) 8)), 0, oVar, 56, 8);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
