package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16260h0;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAccountMenuLogoutComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuLogoutComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuLogoutComponentKt$AccountMenuLogoutComponent$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n154#2:61\n154#2:62\n*S KotlinDebug\n*F\n+ 1 AccountMenuLogoutComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuLogoutComponentKt$AccountMenuLogoutComponent$1$2\n*L\n39#1:61\n45#1:62\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuLogoutComponentKt$AccountMenuLogoutComponent$1$2 */
public final class AccountMenuLogoutComponentKt$AccountMenuLogoutComponent$1$2 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $logoutText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuLogoutComponentKt$AccountMenuLogoutComponent$1$2(String str, int i) {
        super(3);
        this.$logoutText = str;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        int i2 = i;
        Intrinsics.checkNotNullParameter(u0Var, "$this$TextButton");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-480845948, i2, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuLogoutComponent.<anonymous>.<anonymous> (AccountMenuLogoutComponent.kt:36)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_ic_circle_cross, oVar, 0), (String) null, SizeKt.m10087C(aVar, C16483g.m74435M((float) 14)), (C8734c) null, (C15541c) null, 0.0f, C15249k2.C15250a.m66144d(C15249k2.f37569b, C37475b.f94185a.mo114218O(), 0, 2, (Object) null), oVar, 440, 56);
            TextKt.m14196c(this.$logoutText, PaddingKt.m10028o(aVar, C16483g.m74435M((float) 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(C37477d.m153887N()), oVar, (14 & this.$$dirty) | 48, 0, 65532);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
