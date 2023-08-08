package com.carrefour.fid.android.product.presentation.p039ui.facet;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.FacetFragment$onCreateView$1$1 */
public final class FacetFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ FacetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFragment$onCreateView$1$1(FacetFragment facetFragment) {
        super(2);
        this.this$0 = facetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-752643952, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.FacetFragment.onCreateView.<anonymous>.<anonymous> (FacetFragment.kt:33)");
            }
            final FacetFragment facetFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 2111847213, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(2111847213, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.FacetFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (FacetFragment.kt:34)");
                        }
                        C27950a I0 = facetFragment.mo81358I0();
                        C38326b J0 = facetFragment.mo81359J0();
                        final FacetFragment facetFragment = facetFragment;
                        C279411 r6 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19736g.m91827a(facetFragment).mo58156s0();
                            }
                        };
                        final FacetFragment facetFragment2 = facetFragment;
                        C279422 r7 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118812C(facetFragment2, C28547h2.f69325m);
                            }
                        };
                        final FacetFragment facetFragment3 = facetFragment;
                        FacetGraphKt.m117312a((FacetViewModel) null, I0, J0, r6, r7, new C11289a<C11079d2>() {
                            public final void invoke() {
                                FacetFragment facetFragment = facetFragment3;
                                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                                String string = facetFragment.requireContext().getString(C27609f.C27627r.general_an_error_occurred);
                                Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…eneral_an_error_occurred)");
                                FragmentKt.m118811B(facetFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                            }
                        }, oVar, 512, 1);
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
