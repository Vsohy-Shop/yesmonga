package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.text.C16051a0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCardScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardNumberAutoAdjust$3$1\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,192:1\n159#2,2:193\n*S KotlinDebug\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardNumberAutoAdjust$3$1\n*L\n171#1:193,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$3$1 */
public final class CardScanKt$CardNumberAutoAdjust$3$1 extends Lambda implements C11300l<C16260h0, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $readyToDraw$delegate;
    final /* synthetic */ C8700z0<C16361p0> $textStyle$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardScanKt$CardNumberAutoAdjust$3$1(C8700z0<C16361p0> z0Var, C8700z0<Boolean> z0Var2) {
        super(1);
        this.$textStyle$delegate = z0Var;
        this.$readyToDraw$delegate = z0Var2;
    }

    /* renamed from: a */
    public final void mo70677a(@C12579k C16260h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        if (h0Var.mo47052g()) {
            C8700z0<C16361p0> z0Var = this.$textStyle$delegate;
            C16361p0 i = CardScanKt.m106405b(z0Var);
            long w = CardScanKt.m106405b(this.$textStyle$delegate).mo47515w();
            C16506u.m74701b(w);
            CardScanKt.m106406c(z0Var, C16361p0.m73795c(i, 0, C16506u.m74721v(C16504t.m74685l(w), (float) (((double) C16504t.m74687n(w)) * 0.9d)), (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, (C16432i) null, (C16436k) null, 0, (C16442o) null, (C16051a0) null, (C16426h) null, (C16417f) null, (C16415e) null, 4194301, (Object) null));
            return;
        }
        CardScanKt.m106408e(this.$readyToDraw$delegate, true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70677a((C16260h0) obj);
        return C11079d2.f28267a;
    }
}
