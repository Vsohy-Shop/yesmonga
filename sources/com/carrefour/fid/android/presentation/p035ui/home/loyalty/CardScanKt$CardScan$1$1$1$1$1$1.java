package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15247k0;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.utils.C22711j;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCardScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardScan$1$1$1$1$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,192:1\n76#2:193\n76#2:195\n1#3:194\n36#4:196\n1114#5,6:197\n154#6:203\n58#7:204\n*S KotlinDebug\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardScan$1$1$1$1$1$1\n*L\n86#1:193\n87#1:195\n88#1:196\n88#1:197,6\n99#1:203\n99#1:204\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardScan$1$1$1$1$1$1 */
public final class CardScanKt$CardScan$1$1$1$1$1$1 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $card;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardScanKt$CardScan$1$1$1$1$1$1(String str, int i, C8767m mVar) {
        super(3);
        this.$card = str;
        this.$$dirty = i;
        this.$modifier = mVar;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo70682a(@C12579k C2365i iVar, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(iVar, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(iVar)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1542315463, i, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.CardScan.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardScan.kt:84)");
            }
            int g5 = (int) ((C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i())).mo7425g5(iVar.mo8085a());
            int g52 = (int) ((C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i())).mo7425g5(iVar.mo8087d());
            String str = this.$card;
            oVar.mo14918M(1157296644);
            boolean n0 = oVar.mo15006n0(str);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = C22711j.m102879b(str, g5, g52);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            Bitmap bitmap = (Bitmap) N;
            if (bitmap != null) {
                ImageKt.m8969d(C15247k0.m66139c(bitmap), (String) null, BackgroundKt.m8825d(iVar.mo7701c(SizeKt.m10089E(C8767m.f23478j, iVar.mo8085a(), C16483g.m74435M(iVar.mo8087d() - C16483g.m74435M((float) 12))), C8734c.f23406a.mo17074y()), C15240j2.f37547b.mo42853y(), (C15218g4) null, 2, (Object) null), (C8734c) null, C15541c.f38696a.mo44370c(), 0.0f, (C15249k2) null, 0, oVar, 24632, C14092c.f34591d0);
                C8767m mVar = this.$modifier;
                String str2 = this.$card;
                int i3 = this.$$dirty;
                CardScanKt.m106404a(iVar, mVar, str2, oVar, (i & 14) | ((i3 << 3) & 112) | ((i3 << 3) & 896));
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
            } else if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            oVar.mo14958a0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo70682a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
