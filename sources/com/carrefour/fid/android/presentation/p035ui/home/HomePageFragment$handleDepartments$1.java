package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39783f;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.presentation.p035ui.home.departments.DepartmentsListKt;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$handleDepartments$1 */
public final class HomePageFragment$handleDepartments$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$handleDepartments$1(HomePageFragment homePageFragment) {
        super(2);
        this.this$0 = homePageFragment;
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
                ComposerKt.m29845w0(1537190678, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleDepartments.<anonymous> (HomePageFragment.kt:422)");
            }
            final HomePageFragment homePageFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 615159731, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(615159731, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleDepartments.<anonymous>.<anonymous> (HomePageFragment.kt:423)");
                        }
                        HomePageViewModel W0 = homePageFragment.mo70419t1();
                        final HomePageFragment homePageFragment = homePageFragment;
                        C240871 r1 = new C11300l<ProductCategory, C11079d2>() {
                            /* renamed from: a */
                            public final void mo70463a(@C12579k ProductCategory productCategory) {
                                Intrinsics.checkNotNullParameter(productCategory, "it");
                                C19736g.m91827a(homePageFragment).mo58130W(R.id.departments_graph, new C39783f(productCategory).mo131166f());
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo70463a((ProductCategory) obj);
                                return C11079d2.f28267a;
                            }
                        };
                        final HomePageFragment homePageFragment2 = homePageFragment;
                        C240882 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19736g.m91827a(homePageFragment2).mo58128V(R.id.departments_graph);
                            }
                        };
                        final HomePageFragment homePageFragment3 = homePageFragment;
                        DepartmentsListKt.m106269c(W0, r1, r2, new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19736g.m91827a(homePageFragment3).mo58128V(R.id.product_list_promo_graph);
                            }
                        }, oVar, 8);
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
