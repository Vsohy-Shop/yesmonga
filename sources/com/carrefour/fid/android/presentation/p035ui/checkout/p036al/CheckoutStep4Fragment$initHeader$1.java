package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$initHeader$1 */
public final class CheckoutStep4Fragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutStep4Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep4Fragment$initHeader$1(CheckoutStep4Fragment checkoutStep4Fragment) {
        super(2);
        this.this$0 = checkoutStep4Fragment;
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
                ComposerKt.m29845w0(70632004, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment.initHeader.<anonymous> (CheckoutStep4Fragment.kt:108)");
            }
            final CheckoutStep4Fragment checkoutStep4Fragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1379184991, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-1379184991, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment.initHeader.<anonymous>.<anonymous> (CheckoutStep4Fragment.kt:109)");
                        }
                        String d = C16018i.m71858d(R.string.checkout_step_three_header_title, oVar2, 0);
                        String d2 = C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar2, 0);
                        final CheckoutStep4Fragment checkoutStep4Fragment = checkoutStep4Fragment;
                        HeaderComponentKt.m151505j(d, (C16361p0) null, 0, 0, 0, (Painter) null, d2, new C11289a<C11079d2>() {
                            public final void invoke() {
                                checkoutStep4Fragment.requireActivity().onBackPressed();
                            }
                        }, oVar, 0, 62);
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
