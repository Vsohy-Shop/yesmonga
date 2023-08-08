package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
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
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/foundation/layout/k;", "", "isExpanded", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/layout/k;ZLandroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSecurePaymentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ComposableSingletons$SecurePaymentComponentKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n154#2:101\n154#2:102\n154#2:103\n154#2:104\n154#2:105\n*S KotlinDebug\n*F\n+ 1 SecurePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ComposableSingletons$SecurePaymentComponentKt$lambda-1$1\n*L\n59#1:101\n61#1:102\n66#1:103\n73#1:104\n80#1:105\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ComposableSingletons$SecurePaymentComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SecurePaymentComponentKt$lambda1$1 extends Lambda implements C11306r<C2373k, Boolean, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$SecurePaymentComponentKt$lambda1$1 f59412f = new ComposableSingletons$SecurePaymentComponentKt$lambda1$1();

    public ComposableSingletons$SecurePaymentComponentKt$lambda1$1() {
        super(4);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo68808a(@C12579k C2373k kVar, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        boolean z2 = z;
        C8592o oVar2 = oVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(kVar, "$this$ExpandableComponent");
        if ((i4 & 112) == 0) {
            if (oVar2.mo14961b(z2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1742717469, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.ComposableSingletons$SecurePaymentComponentKt.lambda-1.<anonymous> (SecurePaymentComponent.kt:56)");
            }
            if (z2) {
                C8767m.C8768a aVar = C8767m.f23478j;
                C2428y0.m10726a(PaddingKt.m10024k(aVar, C16483g.m74435M((float) 6)), oVar2, 6);
                C8767m n = SizeKt.m10114n(SizeKt.m10115o(aVar, C16483g.m74435M((float) 1)), 0.0f, 1, (Object) null);
                C37475b bVar = C37475b.f94185a;
                DividerKt.m13428a(n, bVar.mo114206C(), 0.0f, 0.0f, oVar, 6, 12);
                float f = (float) 16;
                C8767m o = PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null);
                String d = C16018i.m71858d(R.string.checkout_3ds_secure_instructions_title, oVar2, 0);
                C7933t0 t0Var = C7933t0.f19075a;
                int i5 = C7933t0.f19076b;
                C8767m.C8768a aVar2 = aVar;
                float f2 = f;
                C8592o oVar3 = oVar;
                TextKt.m14196c(d, o, bVar.mo114220Q(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar2, i5).mo11098k(), oVar3, 48, 0, 65528);
                C8592o oVar4 = oVar;
                int i6 = i5;
                C7933t0 t0Var2 = t0Var;
                TextKt.m14196c(C16018i.m71858d(R.string.checkout_3ds_secure_instructions_description, oVar4, 0), PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null), bVar.mo114220Q(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var2.mo11077c(oVar4, i6)), oVar3, 48, 0, 65528);
                C8592o oVar5 = oVar;
                TextKt.m14196c(C16018i.m71858d(R.string.checkout_3ds_secure_instructions_footer, oVar5, 0), PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M(f2), 0.0f, C16483g.m74435M((float) 24), 5, (Object) null), bVar.mo114220Q(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var2.mo11077c(oVar5, i6).mo11098k(), oVar3, 48, 0, 65528);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo68808a((C2373k) obj, ((Boolean) obj2).booleanValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
