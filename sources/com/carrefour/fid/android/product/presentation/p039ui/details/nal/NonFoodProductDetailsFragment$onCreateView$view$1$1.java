package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.NavController;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment$onCreateView$view$1$1 */
public final class NonFoodProductDetailsFragment$onCreateView$view$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ NonFoodProductDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsFragment$onCreateView$view$1$1(NonFoodProductDetailsFragment nonFoodProductDetailsFragment, NavController navController) {
        super(2);
        this.this$0 = nonFoodProductDetailsFragment;
        this.$navController = navController;
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
                ComposerKt.m29845w0(219826556, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment.onCreateView.<anonymous>.<anonymous> (NonFoodProductDetailsFragment.kt:36)");
            }
            final NonFoodProductDetailsFragment nonFoodProductDetailsFragment = this.this$0;
            final NavController navController = this.$navController;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 60925247, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(60925247, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (NonFoodProductDetailsFragment.kt:37)");
                        }
                        NonFoodProductDetailsViewModel I0 = nonFoodProductDetailsFragment.mo80829K0();
                        C28123g J0 = nonFoodProductDetailsFragment.mo80828J0();
                        final NavController navController = navController;
                        C278281 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                navController.mo58152q0();
                            }
                        };
                        C278292 r3 = C278292.f67445f;
                        final NonFoodProductDetailsFragment nonFoodProductDetailsFragment = nonFoodProductDetailsFragment;
                        C278303 r4 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                nonFoodProductDetailsFragment.getNavigator().mo83841q(nonFoodProductDetailsFragment);
                            }
                        };
                        final NonFoodProductDetailsFragment nonFoodProductDetailsFragment2 = nonFoodProductDetailsFragment;
                        C278314 r5 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                nonFoodProductDetailsFragment2.getNavigator().mo83826b(nonFoodProductDetailsFragment2);
                            }
                        };
                        final NavController navController2 = navController;
                        C278325 r6 = new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo80840a(boolean z) {
                                navController2.mo58142g0(C27891l.f67538a.mo81077c(z));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo80840a(((Boolean) obj).booleanValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C278336 r7 = C278336.f67446f;
                        C278347 r8 = C278347.f67447f;
                        final NavController navController3 = navController;
                        NonFoodProductDetailsScreenKt.m116863m(I0, J0, r2, r3, r4, r5, r6, r7, r8, new C11300l<ReinsuranceType, C11079d2>() {
                            /* renamed from: a */
                            public final void mo80842a(@C12579k ReinsuranceType reinsuranceType) {
                                Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
                                navController3.mo58142g0(C27891l.f67538a.mo81076a(reinsuranceType));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo80842a((ReinsuranceType) obj);
                                return C11079d2.f28267a;
                            }
                        }, oVar, 113249352);
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
