package com.carrefour.fid.android.presentation.p035ui.splash;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.BottomSheetState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.C25277a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.NotificationConfig;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.NotificationStaticBannerComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBottomSheetLoyaltyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n66#2,7:347\n73#2:380\n77#2:390\n75#3:354\n76#3,11:356\n89#3:389\n76#4:355\n76#4:383\n460#5,13:367\n473#5,3:386\n154#6:381\n154#6:382\n154#6:385\n1#7:384\n*S KotlinDebug\n*F\n+ 1 BottomSheetLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2\n*L\n167#1:347,7\n167#1:380\n167#1:390\n167#1:354\n167#1:356,11\n167#1:389\n167#1:355\n187#1:383\n167#1:367,13\n167#1:386,3\n170#1:381\n186#1:382\n189#1:385\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2 */
public final class BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $actionRetry;
    final /* synthetic */ BottomSheetState $bottomSheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2(C11289a<C11079d2> aVar, BottomSheetState bottomSheetState) {
        super(3);
        this.$actionRetry = aVar;
        this.$bottomSheetState = bottomSheetState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1028511899, i2, -1, "com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponent.<anonymous> (BottomSheetLoyaltyComponent.kt:165)");
            }
            C11289a<C11079d2> aVar = this.$actionRetry;
            BottomSheetState bottomSheetState = this.$bottomSheetState;
            oVar2.mo14918M(733328855);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar2);
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            float f2 = (float) 16;
            float f3 = f2;
            NotificationStaticBannerComponentKt.m109338f(SizeKt.m10114n(PaddingKt.m10024k(aVar2, C16483g.m74435M(f2)), 0.0f, 1, (Object) null), new NotificationConfig(C16018i.m71858d(R.string.splash_card_fid_label_error_message, oVar2, 0), C16018i.m71858d(R.string.splash_card_fid_label_error_description, oVar2, 0), false, C16018i.m71858d(R.string.general_try_again, oVar2, 0), aVar, (C11289a) null, 32, (DefaultConstructorMarker) null), new C25277a.C25278a(0, 1, (DefaultConstructorMarker) null), oVar, 6, 0);
            float f4 = (float) 0;
            BoxKt.m9839a(BottomSheetLoyaltyComponentKt.m110431l(OffsetKt.m10000f(SizeKt.m10115o(SizeKt.m10114n(aVar2, 0.0f, 1, (Object) null), C16483g.m74435M(f3)), 0.0f, ((C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i())).mo7418M(bottomSheetState.mo10071m()), 1, (Object) null), C15240j2.f37547b.mo42841a(), C2694o.m12167i(C16483g.m74435M(f3), C16483g.m74435M(f3), C16483g.m74435M(f4), C16483g.m74435M(f4)), 0.5f, C16483g.m74435M(f3), 0.0f, 0.0f, 48, (Object) null), oVar2, 0);
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
}
