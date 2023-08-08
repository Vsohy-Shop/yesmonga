package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDigitalItemComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigitalItemComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/DigitalItemComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,44:1\n154#2:45\n*S KotlinDebug\n*F\n+ 1 DigitalItemComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/DigitalItemComponentKt\n*L\n25#1:45\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.DigitalItemComponentKt */
public final class DigitalItemComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109279a(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(-519793174);
        int i7 = i6 & 1;
        if (i7 != 0) {
            i3 = i5 | 6;
            mVar2 = mVar;
        } else if ((i5 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            mVar2 = mVar;
            i3 = i5;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i7 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-519793174, i5, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.DigitalItemComponent (DigitalItemComponent.kt:20)");
            }
            SurfaceKt.m13879b(PaddingKt.m10028o(aVar, 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 8), 7, (Object) null), C2694o.m12161c(50), C37475b.f94185a.mo114218O(), 0, (C2223i) null, 0.0f, ComposableSingletons$DigitalItemComponentKt.f62258a.mo73583a(), o, 1572864, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = aVar;
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DigitalItemComponentKt$DigitalItemComponent$1(mVar2, i5, i6));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109280b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1385301161);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1385301161, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.DigitalItemComponentPreview (DigitalItemComponent.kt:38)");
            }
            ThemeKt.m153788a(ComposableSingletons$DigitalItemComponentKt.f62258a.mo73584b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DigitalItemComponentKt$DigitalItemComponentPreview$1(i));
        }
    }
}
