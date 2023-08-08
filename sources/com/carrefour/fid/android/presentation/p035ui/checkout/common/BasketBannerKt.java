package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBanner.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/BasketBannerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,80:1\n154#2:81\n154#2:82\n154#2:116\n75#3,6:83\n81#3:115\n85#3:121\n75#4:89\n76#4,11:91\n89#4:120\n76#5:90\n460#6,13:102\n473#6,3:117\n*S KotlinDebug\n*F\n+ 1 BasketBanner.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/BasketBannerKt\n*L\n37#1:81\n45#1:82\n50#1:116\n33#1:83,6\n33#1:115\n33#1:121\n33#1:89\n33#1:91,11\n33#1:120\n33#1:90\n33#1:102,13\n33#1:117,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.BasketBannerKt */
public final class BasketBannerKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104584a(@C12580l C8767m mVar, @C12579k C16156d dVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5;
        C16156d dVar2 = dVar;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(dVar2, "text");
        C8592o o = oVar.mo15009o(1792549807);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            mVar2 = mVar;
        } else if ((i6 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            mVar2 = mVar;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (o.mo15006n0(dVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1792549807, i9, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.BasketBanner (BasketBanner.kt:28)");
            }
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            float M = C16483g.m74435M((float) 1);
            C37475b bVar = C37475b.f94185a;
            long m = bVar.mo114245m();
            C7933t0 t0Var = C7933t0.f19075a;
            int i10 = C7933t0.f19076b;
            C8767m k = PaddingKt.m10024k(BackgroundKt.m8824c(BorderKt.m8852h(n, M, m, t0Var.mo11076b(o, i10).mo10757d()), bVar.mo114234c(), t0Var.mo11076b(o, i10).mo10757d()), C16483g.m74435M((float) 16));
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar3, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m mVar3 = aVar;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_blue_info, o, 0), (String) null, SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 8), 0.0f, 11, (Object) null), C16483g.m74435M((float) 24)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
            oVar2 = o;
            C16156d dVar4 = dVar2;
            TextKt.m14197d(dVar, (C8767m) null, bVar.mo114212I(), C16506u.m74712m(14), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, ((i9 >> 3) & 14) | 3072, 0, 262130);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar3;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new BasketBannerKt$BasketBanner$2(mVar2, dVar, i, i2));
        }
    }

    @C8540g
    @C16464c(heightDp = 300, showBackground = true, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104585b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1037979757);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1037979757, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.BasketBannerPreview (BasketBanner.kt:62)");
            }
            ThemeKt.m153788a(ComposableSingletons$BasketBannerKt.f59351a.mo68760a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BasketBannerKt$BasketBannerPreview$1(i));
        }
    }
}
