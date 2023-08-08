package com.carrefour.fid.android.presentation.p035ui.loyalty.view;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
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
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.contentsquare.android.api.C14092c;
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
@C11363r0({"SMAP\nManageLoyaltyCardButtonsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageLoyaltyCardButtonsComponent.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/view/ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,116:1\n154#2:117\n154#2:118\n*S KotlinDebug\n*F\n+ 1 ManageLoyaltyCardButtonsComponent.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/view/ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$3\n*L\n82#1:117\n93#1:118\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$3 */
public final class C24643xae0f101b extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $isCopiedCardNumber;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24643xae0f101b(C8700z0<Boolean> z0Var) {
        super(3);
        this.$isCopiedCardNumber = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(u0Var, "$this$OutlinedButton");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2143337461, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponent.<anonymous>.<anonymous> (ManageLoyaltyCardButtonsComponent.kt:76)");
            }
            if (!this.$isCopiedCardNumber.getValue().booleanValue()) {
                oVar2.mo14918M(-1260934911);
                IconKt.m13539b(C16015f.m71849d(R.drawable.ic_copy, oVar2, 0), C16018i.m71858d(R.string.loyalty_card_copy_card_number, oVar2, 0), PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 11), 0.0f, 11, (Object) null), 0, oVar, C14092c.f34507C0, 8);
                TextKt.m14196c(C16018i.m71858d(R.string.loyalty_card_copy_card_number, oVar2, 0), (C8767m) null, C37475b.f94185a.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153899k(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 0, 65530);
                oVar.mo15002m0();
            } else {
                C8592o oVar3 = oVar;
                oVar3.mo14918M(-1260934390);
                ImageKt.m8967b(C16015f.m71849d(R.drawable.green_check_circle, oVar3, 0), C16018i.m71858d(R.string.loyalty_card_copied_card_number, oVar3, 0), PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 11), 0.0f, 11, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, C14092c.f34507C0, 120);
                TextKt.m14196c(C16018i.m71858d(R.string.loyalty_card_copied_card_number, oVar3, 0), (C8767m) null, C37475b.f94185a.mo114252t(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153899k(C7933t0.f19075a.mo11077c(oVar3, C7933t0.f19076b)), oVar, 0, 0, 65530);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
