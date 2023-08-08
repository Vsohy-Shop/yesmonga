package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7873k;
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
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37474a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCardScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardScan$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,192:1\n88#2:193\n154#3:194\n154#3:195\n*S KotlinDebug\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardScan$1$1$1\n*L\n73#1:193\n74#1:194\n76#1:195\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardScan$1$1$1 */
public final class CardScanKt$CardScan$1$1$1 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $card;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardScanKt$CardScan$1$1$1(String str, int i, C8767m mVar) {
        super(3);
        this.$card = str;
        this.$$dirty = i;
        this.$modifier = mVar;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo70680a(@C12579k C2365i iVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C2365i iVar2 = iVar;
        C8592o oVar2 = oVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(iVar2, "$this$BoxWithConstraints");
        if ((i4 & 14) == 0) {
            if (oVar2.mo15006n0(iVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-114430696, i4, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.CardScan.<anonymous>.<anonymous>.<anonymous> (CardScan.kt:69)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m k = PaddingKt.m10024k(SizeKt.m10089E(aVar, iVar.mo8085a(), C16483g.m74435M(iVar.mo8085a() * 0.63f)), C16483g.m74435M((float) 9));
            C37474a aVar2 = C37474a.f94133a;
            C2693n h = C2694o.m12166h(aVar2.mo114189l());
            float M = C16483g.m74435M((float) 1);
            final String str = this.$card;
            final int i5 = this.$$dirty;
            final C8767m mVar = this.$modifier;
            C7873k.m25025b(k, h, 0, 0, (C2223i) null, M, C8553b.m31048b(oVar2, 188744443, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    C8592o oVar2 = oVar;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(188744443, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.CardScan.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardScan.kt:76)");
                        }
                        C8767m.C8768a aVar = C8767m.f23478j;
                        C8767m k = PaddingKt.m10024k(SizeKt.m10112l(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 9));
                        String str = str;
                        int i3 = i5;
                        C8767m mVar = mVar;
                        oVar2.mo14918M(-483455358);
                        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
                        if (!(oVar.mo15017r() instanceof C8428d)) {
                            ComposablesKt.m29519n();
                        }
                        oVar.mo14938T();
                        if (oVar.mo14997l()) {
                            oVar2.mo14947W(a);
                        } else {
                            oVar.mo14888A();
                        }
                        oVar.mo14941U();
                        C8592o b2 = Updater.m30180b(oVar);
                        Updater.m30188j(b2, b, companion.mo44588d());
                        Updater.m30188j(b2, dVar, companion.mo44586b());
                        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
                        Updater.m30188j(b2, c4Var, companion.mo44590f());
                        oVar.mo14972e();
                        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        oVar2.mo14918M(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
                        BoxWithConstraintsKt.m9860a(SizeKt.m10112l(aVar, 0.0f, 1, (Object) null), (C8734c) null, false, C8553b.m31048b(oVar2, 1542315463, true, new CardScanKt$CardScan$1$1$1$1$1$1(str, i3, mVar)), oVar, 3078, 6);
                        oVar.mo15002m0();
                        oVar.mo14896D();
                        oVar.mo15002m0();
                        oVar.mo15002m0();
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 1769472, 28);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_area, oVar2, 0), (String) null, iVar2.mo7701c(SizeKt.m10114n(PaddingKt.m10024k(aVar, aVar2.mo114201x()), 0.0f, 1, (Object) null), C8734c.f23406a.mo17074y()), (C8734c) null, C15541c.f38696a.mo44372g(), 0.0f, (C15249k2) null, oVar, 24632, 104);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo70680a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
