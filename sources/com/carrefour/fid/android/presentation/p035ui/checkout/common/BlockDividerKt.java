package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBlockDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDivider.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/BlockDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,17:1\n154#2:18\n*S KotlinDebug\n*F\n+ 1 BlockDivider.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/BlockDividerKt\n*L\n13#1:18\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.BlockDividerKt */
public final class BlockDividerKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104587a(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-423034124);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-423034124, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.BlocDivider (BlockDivider.kt:10)");
            }
            DividerKt.m13428a(SizeKt.m10115o(C8767m.f23478j, C16483g.m74435M((float) 16)), C37475b.f94185a.mo114208E(), 0.0f, 0.0f, o, 6, 12);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BlockDividerKt$BlocDivider$1(i));
        }
    }
}
