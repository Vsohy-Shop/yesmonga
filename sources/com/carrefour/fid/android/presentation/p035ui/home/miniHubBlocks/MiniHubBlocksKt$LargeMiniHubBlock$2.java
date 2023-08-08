package com.carrefour.fid.android.presentation.p035ui.home.miniHubBlocks;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.MiniHubBlocksKt$LargeMiniHubBlock$2 */
public final class MiniHubBlocksKt$LargeMiniHubBlock$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ MiniHubBlocksModel $miniHubBlocksModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniHubBlocksKt$LargeMiniHubBlock$2(MiniHubBlocksModel miniHubBlocksModel) {
        super(2);
        this.$miniHubBlocksModel = miniHubBlocksModel;
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
                ComposerKt.m29845w0(-274268241, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.LargeMiniHubBlock.<anonymous> (MiniHubBlocks.kt:98)");
            }
            C35325c.m145645b(this.$miniHubBlocksModel.getUrlImage(), SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, this.$miniHubBlocksModel.getAlt(), 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, R.drawable.ds_gr_horizontal_blue_pass_card, (C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, ComposableSingletons$MiniHubBlocksKt.f60472a.mo70736b(), oVar, 48, C20022q.C20025c.f51280k, 28540);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
