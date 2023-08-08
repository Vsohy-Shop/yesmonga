package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/ComposableSingletons$CheckoutStep2ScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,739:1\n154#2:740\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/ComposableSingletons$CheckoutStep2ScreenKt$lambda-1$1\n*L\n483#1:740\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep2ScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CheckoutStep2ScreenKt$lambda1$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$CheckoutStep2ScreenKt$lambda1$1 f59244f = new ComposableSingletons$CheckoutStep2ScreenKt$lambda1$1();

    public ComposableSingletons$CheckoutStep2ScreenKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1131576570, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep2ScreenKt.lambda-1.<anonymous> (CheckoutStep2Screen.kt:476)");
            }
            BlockDividerKt.m104587a(oVar2, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m k = PaddingKt.m10024k(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16));
            Painter d = C16015f.m71849d(R.drawable.alcohol_legal_information, oVar2, 0);
            C15541c.C15542a aVar2 = C15541c.f38696a;
            C8592o oVar3 = oVar;
            ImageKt.m8967b(d, (String) null, k, (C8734c) null, aVar2.mo44372g(), 0.0f, (C15249k2) null, oVar3, 25016, 104);
            BlockDividerKt.m104587a(oVar2, 0);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.breathalyzer_legal_info, oVar2, 0), (String) null, SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), (C8734c) null, aVar2.mo44372g(), 0.0f, (C15249k2) null, oVar3, 25016, 104);
            BlockDividerKt.m104587a(oVar2, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
