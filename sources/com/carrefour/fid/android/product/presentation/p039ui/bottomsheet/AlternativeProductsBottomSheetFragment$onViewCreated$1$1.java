package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import android.os.Bundle;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment$onViewCreated$1$1 */
public final class AlternativeProductsBottomSheetFragment$onViewCreated$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ String $gtin;
    final /* synthetic */ AlternativeProductsBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlternativeProductsBottomSheetFragment$onViewCreated$1$1(AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment, String str) {
        super(2);
        this.this$0 = alternativeProductsBottomSheetFragment;
        this.$gtin = str;
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
                ComposerKt.m29845w0(1576446182, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment.onViewCreated.<anonymous>.<anonymous> (AlternativeProductsBottomSheetFragment.kt:75)");
            }
            final AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment = this.this$0;
            final String str = this.$gtin;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -2073670551, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-2073670551, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (AlternativeProductsBottomSheetFragment.kt:76)");
                        }
                        C27631a S0 = alternativeProductsBottomSheetFragment.mo80457S0();
                        String str = str;
                        final AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment = alternativeProductsBottomSheetFragment;
                        C276931 r6 = new C11306r<Gtin, Integer, Integer, C38115c, C11079d2>() {
                            /* renamed from: a */
                            public final void mo80467a(@C12579k String str, int i, int i2, @C12579k C38115c cVar) {
                                Intrinsics.checkNotNullParameter(str, "gtin");
                                Intrinsics.checkNotNullParameter(cVar, "initialProduct");
                                QuantityBackDropFragment b = QuantityBackDropFragment.C28089a.m117643b(QuantityBackDropFragment.f68038Z, str, Integer.valueOf(i2), i, (PlpProductAnalytics) null, (BasketType) null, (String) null, cVar, 56, (Object) null);
                                final AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment = alternativeProductsBottomSheetFragment;
                                FragmentKt.m118835w(alternativeProductsBottomSheetFragment, (String) null, new C11300l<Bundle, C11079d2>() {
                                    /* renamed from: a */
                                    public final void mo80468a(@C12579k Bundle bundle) {
                                        Intrinsics.checkNotNullParameter(bundle, "it");
                                        if (bundle.getBoolean(QuantityBackDropFragment.f68037K0, false)) {
                                            alternativeProductsBottomSheetFragment.dismiss();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        mo80468a((Bundle) obj);
                                        return C11079d2.f28267a;
                                    }
                                }, 1, (Object) null);
                                b.show(alternativeProductsBottomSheetFragment.requireActivity().mo57175g0(), (String) null);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                mo80467a(((Gtin) obj).mo118380i(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (C38115c) obj4);
                                return C11079d2.f28267a;
                            }
                        };
                        final AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment2 = alternativeProductsBottomSheetFragment;
                        C276952 r7 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                alternativeProductsBottomSheetFragment2.dismiss();
                            }
                        };
                        final AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment3 = alternativeProductsBottomSheetFragment;
                        AlternativeProductsBottomSheetStatefulKt.m116501d((AlternativeProductsBottomSheetViewModel) null, S0, str, r6, r7, new C11300l<Throwable, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Throwable) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k Throwable th) {
                                Intrinsics.checkNotNullParameter(th, "throwable");
                                alternativeProductsBottomSheetFragment3.mo80459U0(th);
                                alternativeProductsBottomSheetFragment3.dismiss();
                            }
                        }, oVar, 64, 1);
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
