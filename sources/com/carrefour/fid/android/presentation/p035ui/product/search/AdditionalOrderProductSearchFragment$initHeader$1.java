package com.carrefour.fid.android.presentation.p035ui.product.search;

import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.models.C38528t;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.models.SuggestionType;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment$initHeader$1 */
public final class AdditionalOrderProductSearchFragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ AdditionalOrderProductSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdditionalOrderProductSearchFragment$initHeader$1(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
        super(2);
        this.this$0 = additionalOrderProductSearchFragment;
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
                ComposerKt.m29845w0(-808979722, i, -1, "com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment.initHeader.<anonymous> (AdditionalOrderProductSearchFragment.kt:143)");
            }
            final AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 10364473, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(10364473, i2, -1, "com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment.initHeader.<anonymous>.<anonymous> (AdditionalOrderProductSearchFragment.kt:144)");
                        }
                        String d = C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar2, 0);
                        String d2 = C16018i.m71858d(R.string.product_search_bar_hint, oVar2, 0);
                        C255201 r13 = r14;
                        final AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment = additionalOrderProductSearchFragment;
                        C255201 r14 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                additionalOrderProductSearchFragment.mo74299f1();
                            }
                        };
                        C255212 r142 = r2;
                        final AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment2 = additionalOrderProductSearchFragment;
                        C255212 r2 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "query");
                                if (!AdditionalOrderProductSearchFragment.m110002T0(additionalOrderProductSearchFragment2).f91168f.isShown()) {
                                    if (C11622t.isBlank(StringsKt__StringsKt.trim(str).toString())) {
                                        additionalOrderProductSearchFragment2.mo74297d1().sendIntent(C26866c.C26870c.C26874d.f65494a);
                                    }
                                    if (str.length() >= 3) {
                                        additionalOrderProductSearchFragment2.mo74297d1().sendIntent(new C26866c.C26870c.C26873c(str));
                                    }
                                }
                            }
                        };
                        C255223 r15 = r2;
                        final AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment3 = additionalOrderProductSearchFragment;
                        C255223 r22 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "text");
                                if (str.length() > 0) {
                                    additionalOrderProductSearchFragment3.f62768y.mo74308a(new C38530v(SuggestionType.SUGGESTION, StringsKt__StringsKt.trim(str).toString(), (String) null, (List) null, (C38528t) null, 28, (DefaultConstructorMarker) null));
                                    return;
                                }
                                AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment = additionalOrderProductSearchFragment3;
                                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                                String string = additionalOrderProductSearchFragment.getString(R.string.search_with_empty_query_error);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.search_with_empty_query_error)");
                                FragmentKt.m118811B(additionalOrderProductSearchFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                            }
                        };
                        C255234 r18 = r2;
                        final AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment4 = additionalOrderProductSearchFragment;
                        C255234 r23 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment = additionalOrderProductSearchFragment4;
                                String string = additionalOrderProductSearchFragment.getString(R.string.scan_bar_dialog_title);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
                                String string2 = additionalOrderProductSearchFragment4.getString(R.string.scan_bar_dialog_message);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
                                com.carrefour.fid.android.core.extension.FragmentKt.m148915a(additionalOrderProductSearchFragment, "android.permission.CAMERA", string, string2, additionalOrderProductSearchFragment4.f62766w, additionalOrderProductSearchFragment4.f62765v);
                            }
                        };
                        HeaderComponentKt.m151508m(d2, (String) null, false, true, false, 0, 0, 0, d, r13, r142, r15, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, r18, oVar, 3072, 0, 12534);
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
