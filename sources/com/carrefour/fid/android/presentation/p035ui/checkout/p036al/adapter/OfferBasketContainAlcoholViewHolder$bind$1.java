package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutBasketContainAlcoholCheckboxKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketContainAlcoholViewHolder$bind$1 */
public final class OfferBasketContainAlcoholViewHolder$bind$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ OfferBasketContainAlcoholModel $model;
    final /* synthetic */ OfferBasketContainAlcoholViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferBasketContainAlcoholViewHolder$bind$1(OfferBasketContainAlcoholModel offerBasketContainAlcoholModel, OfferBasketContainAlcoholViewHolder offerBasketContainAlcoholViewHolder) {
        super(2);
        this.$model = offerBasketContainAlcoholModel;
        this.this$0 = offerBasketContainAlcoholViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(145101970, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketContainAlcoholViewHolder.bind.<anonymous> (CheckoutViewHolder.kt:199)");
            }
            final OfferBasketContainAlcoholModel offerBasketContainAlcoholModel = this.$model;
            final OfferBasketContainAlcoholViewHolder offerBasketContainAlcoholViewHolder = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 762531861, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(762531861, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketContainAlcoholViewHolder.bind.<anonymous>.<anonymous> (CheckoutViewHolder.kt:200)");
                        }
                        OfferBasketContainAlcoholModel offerBasketContainAlcoholModel = offerBasketContainAlcoholModel;
                        oVar.mo14918M(-492369756);
                        Object N = oVar.mo14921N();
                        C8592o.C8593a aVar = C8592o.f23032a;
                        if (N == aVar.mo16277a()) {
                            N = C8539f2.m30981g(Boolean.valueOf(offerBasketContainAlcoholModel.mo121675z()), (C8410b2) null, 2, (Object) null);
                            oVar.mo14893C(N);
                        }
                        oVar.mo15002m0();
                        final C8700z0 z0Var = (C8700z0) N;
                        OfferBasketContainAlcoholModel offerBasketContainAlcoholModel2 = offerBasketContainAlcoholModel;
                        oVar.mo14918M(-492369756);
                        Object N2 = oVar.mo14921N();
                        if (N2 == aVar.mo16277a()) {
                            N2 = C8539f2.m30981g(Boolean.valueOf(offerBasketContainAlcoholModel2.mo121674y()), (C8410b2) null, 2, (Object) null);
                            oVar.mo14893C(N2);
                        }
                        oVar.mo15002m0();
                        final C8700z0 z0Var2 = (C8700z0) N2;
                        C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 8));
                        boolean booleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                        boolean booleanValue2 = ((Boolean) z0Var2.getValue()).booleanValue();
                        final OfferBasketContainAlcoholViewHolder offerBasketContainAlcoholViewHolder = offerBasketContainAlcoholViewHolder;
                        CheckoutBasketContainAlcoholCheckboxKt.m103922a(k, booleanValue, booleanValue2, new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo68334a(boolean z) {
                                C8700z0<Boolean> z0Var = z0Var;
                                z0Var.setValue(Boolean.valueOf(!z0Var.getValue().booleanValue()));
                                z0Var2.setValue(Boolean.valueOf(!z0Var.getValue().booleanValue()));
                                offerBasketContainAlcoholViewHolder.f59070c.mo68198l(z0Var.getValue().booleanValue());
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo68334a(((Boolean) obj).booleanValue());
                                return C11079d2.f28267a;
                            }
                        }, oVar, 6, 0);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
