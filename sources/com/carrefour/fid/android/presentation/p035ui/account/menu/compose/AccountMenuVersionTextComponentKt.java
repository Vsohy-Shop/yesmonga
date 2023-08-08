package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountMenuVersionTextComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuVersionTextComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuVersionTextComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,48:1\n36#2:49\n1114#3,6:50\n154#4:56\n*S KotlinDebug\n*F\n+ 1 AccountMenuVersionTextComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuVersionTextComponentKt\n*L\n25#1:49\n25#1:50,6\n32#1:56\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuVersionTextComponentKt */
public final class AccountMenuVersionTextComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103695a(@C12579k String str, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        String str2 = str;
        C11289a<C11079d2> aVar2 = aVar;
        int i5 = i;
        Intrinsics.checkNotNullParameter(str2, "appVersionText");
        Intrinsics.checkNotNullParameter(aVar2, "onVersionLongPressed");
        C8592o o = oVar.mo15009o(-666529205);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-666529205, i6, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuVersionTextComponent (AccountMenuVersionTextComponent.kt:18)");
            }
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C11079d2 d2Var = C11079d2.f28267a;
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(aVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new C23118x51be1a47(aVar2, (C11045c<? super C23118x51be1a47>) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8767m n = SizeKt.m10114n(PaddingKt.m10024k(SuspendingPointerInputFilterKt.m68437c(aVar3, d2Var, (C11304p) N), C16483g.m74435M((float) 8)), 0.0f, 1, (Object) null);
            int a = C16432i.f40718b.mo47667a();
            oVar2 = o;
            String str3 = str;
            TextKt.m14196c(str3, n, C37475b.f94185a.mo114258z(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153893e(C37477d.m153887N()), oVar2, i6 & 14, 0, 65016);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23120xd7dc3c3b(str, aVar, i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m103696b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(501637282);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(501637282, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.VersionTextComponentPreview (AccountMenuVersionTextComponent.kt:42)");
            }
            ThemeKt.m153788a(ComposableSingletons$AccountMenuVersionTextComponentKt.f58793a.mo67883a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AccountMenuVersionTextComponentKt$VersionTextComponentPreview$1(i));
        }
    }
}
