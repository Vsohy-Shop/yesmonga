package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import android.content.Context;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel;
import com.carrefour.fid.android.shared.util.ImageUtils;
import com.skydoves.landscapist.glide.LocalGlideProviderKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFragment$onCreateView$1$1 */
public final class CheckoutBasketsListFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutBasketsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListFragment$onCreateView$1$1(CheckoutBasketsListFragment checkoutBasketsListFragment) {
        super(2);
        this.this$0 = checkoutBasketsListFragment;
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
                ComposerKt.m29845w0(1758225747, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFragment.onCreateView.<anonymous>.<anonymous> (CheckoutBasketsListFragment.kt:35)");
            }
            C8550i1<C23465c> b = CheckoutBasketsListFormatterKt.m104508b();
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            C8572j1[] j1VarArr = {b.mo16141f(new C23465c(requireContext)), LocalGlideProviderKt.m145632c().mo16141f(ImageUtils.f70796a.mo84107l(256))};
            final CheckoutBasketsListFragment checkoutBasketsListFragment = this.this$0;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 1130756627, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1130756627, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CheckoutBasketsListFragment.kt:39)");
                        }
                        final CheckoutBasketsListFragment checkoutBasketsListFragment = checkoutBasketsListFragment;
                        ThemeKt.m153788a(C8553b.m31048b(oVar, -850315114, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-850315114, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutBasketsListFragment.kt:40)");
                                    }
                                    C23456a J0 = checkoutBasketsListFragment.mo68668J0();
                                    final CheckoutBasketsListFragment checkoutBasketsListFragment = checkoutBasketsListFragment;
                                    C234471 r2 = new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            C19736g.m91827a(checkoutBasketsListFragment).mo58152q0();
                                        }
                                    };
                                    final CheckoutBasketsListFragment checkoutBasketsListFragment2 = checkoutBasketsListFragment;
                                    C234482 r3 = new C11305q<Boolean, BasketType, String, C11079d2>() {
                                        /* renamed from: a */
                                        public final void mo68676a(boolean z, @C12579k BasketType basketType, @C12579k String str) {
                                            Intrinsics.checkNotNullParameter(basketType, "type");
                                            Intrinsics.checkNotNullParameter(str, "referenceId");
                                            checkoutBasketsListFragment2.mo68669K0(z, basketType, str);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            mo68676a(((Boolean) obj).booleanValue(), (BasketType) obj2, (String) obj3);
                                            return C11079d2.f28267a;
                                        }
                                    };
                                    final CheckoutBasketsListFragment checkoutBasketsListFragment3 = checkoutBasketsListFragment;
                                    CheckoutBasketsListStatefulKt.m104518d((CheckoutBasketsListViewModel) null, J0, r2, r3, new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            C19232h activity = checkoutBasketsListFragment3.getActivity();
                                            BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
                                            if (bottomNavActivity != null) {
                                                bottomNavActivity.mo121118U1();
                                            }
                                        }
                                    }, oVar, 0, 1);
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
            }), oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
