package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$1 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C28892e<List<Basket>> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$1(C28892e<? extends List<Basket>> eVar) {
        super(2);
        this.$state = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        String d;
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1746277221, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListScreen.<anonymous> (CheckoutBasketsListStateful.kt:94)");
            }
            C28892e<List<Basket>> eVar = this.$state;
            if (Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28896d.f70785b) ? true : Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28894b.f70781b)) {
                oVar.mo14918M(1838919850);
                oVar.mo15002m0();
                d = " ";
            } else if (eVar instanceof C28892e.C28893a) {
                oVar.mo14918M(-79227295);
                d = C16018i.m71858d(R.string.basket_title, oVar, 0);
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28895c) {
                oVar.mo14918M(-79227210);
                d = C16018i.m71858d(R.string.checkout_baskets_list_title, oVar, 0);
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(-79231718);
                oVar.mo15002m0();
                throw new NoWhenBranchMatchedException();
            }
            HeaderComponentKt.m151511p(d, (C16361p0) null, 0, 0, 0, oVar, 0, 30);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
