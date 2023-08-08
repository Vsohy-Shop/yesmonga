package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment$initHeader$1 */
public final class AdditionalOrderSearchResultFragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ AdditionalOrderSearchResultFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdditionalOrderSearchResultFragment$initHeader$1(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment) {
        super(2);
        this.this$0 = additionalOrderSearchResultFragment;
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
                ComposerKt.m29845w0(1086143061, i, -1, "com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment.initHeader.<anonymous> (AdditionalOrderSearchResultFragment.kt:164)");
            }
            final AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1625057038, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-1625057038, i2, -1, "com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment.initHeader.<anonymous>.<anonymous> (AdditionalOrderSearchResultFragment.kt:165)");
                        }
                        String d = C16018i.m71858d(R.string.title_header_additional_order, oVar2, 0);
                        String d2 = C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar2, 0);
                        String d3 = C16018i.m71858d(R.string.product_search_bar_hint, oVar2, 0);
                        C255931 r15 = r2;
                        final AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment = additionalOrderSearchResultFragment;
                        C255931 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                additionalOrderSearchResultFragment.requireActivity().onBackPressed();
                            }
                        };
                        C255942 r18 = r2;
                        final AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment2 = additionalOrderSearchResultFragment;
                        C255942 r22 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19736g.m91827a(additionalOrderSearchResultFragment2).mo58156s0();
                            }
                        };
                        C255953 r20 = r2;
                        final AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment3 = additionalOrderSearchResultFragment;
                        C255953 r23 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment = additionalOrderSearchResultFragment3;
                                String string = additionalOrderSearchResultFragment.getString(R.string.scan_bar_dialog_title);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
                                String string2 = additionalOrderSearchResultFragment3.getString(R.string.scan_bar_dialog_message);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
                                FragmentKt.m148915a(additionalOrderSearchResultFragment, "android.permission.CAMERA", string, string2, additionalOrderSearchResultFragment3.f62867Z, additionalOrderSearchResultFragment3.f62866Y);
                            }
                        };
                        HeaderComponentKt.m151500e(d, (C16361p0) null, d3, (String) null, false, true, false, 0, 0, 0, d2, r15, (C11300l<? super String, C11079d2>) null, (C11300l<? super String, C11079d2>) null, r18, (C11289a<C11079d2>) null, r20, oVar, 221184, 0, 46026);
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
