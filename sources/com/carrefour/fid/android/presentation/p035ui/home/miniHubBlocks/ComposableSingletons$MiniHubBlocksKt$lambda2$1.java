package com.carrefour.fid.android.presentation.p035ui.home.miniHubBlocks;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.skydoves.landscapist.glide.C35326d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/foundation/layout/h;", "Lcom/skydoves/landscapist/glide/d$a;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/layout/h;Lcom/skydoves/landscapist/glide/d$a;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.ComposableSingletons$MiniHubBlocksKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$MiniHubBlocksKt$lambda2$1 extends Lambda implements C11306r<C2362h, C35326d.C35327a, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$MiniHubBlocksKt$lambda2$1 f60476f = new ComposableSingletons$MiniHubBlocksKt$lambda2$1();

    public ComposableSingletons$MiniHubBlocksKt$lambda2$1() {
        super(4);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo70738a(@C12579k C2362h hVar, @C12579k C35326d.C35327a aVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(hVar, "$this$GlideImage");
        Intrinsics.checkNotNullParameter(aVar, "it");
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(hVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 651) != 130 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1720778105, i, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.ComposableSingletons$MiniHubBlocksKt.lambda-2.<anonymous> (MiniHubBlocks.kt:104)");
            }
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_ic_missing_image, oVar, 0), C16018i.m71858d(R.string.message_error_screen, oVar, 0), hVar.mo7701c(C8767m.f23478j, C8734c.f23406a.mo17066i()), (C8734c) null, C15541c.f38696a.mo44373i(), 0.0f, (C15249k2) null, oVar, 24584, 104);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo70738a((C2362h) obj, (C35326d.C35327a) obj2, (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
