package com.carrefour.fid.android.product.presentation.p039ui.list;

import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment$initHeader$1 */
public final class ProductListQueryFragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ProductListQueryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductListQueryFragment$initHeader$1(ProductListQueryFragment productListQueryFragment) {
        super(2);
        this.this$0 = productListQueryFragment;
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
                ComposerKt.m29845w0(-1831968480, i, -1, "com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment.initHeader.<anonymous> (ProductListQueryFragment.kt:108)");
            }
            final ProductListQueryFragment productListQueryFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -923753949, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    C8592o oVar2 = oVar;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-923753949, i2, -1, "com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment.initHeader.<anonymous>.<anonymous> (ProductListQueryFragment.kt:109)");
                        }
                        String d = C16018i.m71858d(C27609f.C27627r.accessibility_back_to_previous_page, oVar2, 0);
                        String d2 = C16018i.m71858d(C27609f.C27627r.product_search_bar_hint, oVar2, 0);
                        C280331 r13 = r14;
                        final ProductListQueryFragment productListQueryFragment = productListQueryFragment;
                        C280331 r14 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                productListQueryFragment.requireActivity().onBackPressed();
                            }
                        };
                        C280342 r16 = r2;
                        final ProductListQueryFragment productListQueryFragment2 = productListQueryFragment;
                        C280342 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                productListQueryFragment2.getNavigator().mo83845u(C19736g.m91827a(productListQueryFragment2), false);
                            }
                        };
                        C280353 r18 = r2;
                        final ProductListQueryFragment productListQueryFragment3 = productListQueryFragment;
                        C280353 r22 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                productListQueryFragment3.f67915z.mo960b("android.permission.CAMERA");
                            }
                        };
                        HeaderComponentKt.m151508m(d2, (String) null, false, true, false, 0, 0, 0, d, r13, (C11300l<? super String, C11079d2>) null, (C11300l<? super String, C11079d2>) null, r16, (C11289a<C11079d2>) null, r18, oVar, 3456, 0, 11506);
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
