package com.carrefour.fid.android.storelocator.p048ui.fragments;

import androidx.compose.p004ui.platform.ComposeView;
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
import com.carrefour.fid.android.storelocator.presentation.contracts.C28961c;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
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
/* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesSearchFragment$initHeader$1 */
public final class FacilitiesSearchFragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ FacilitiesSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacilitiesSearchFragment$initHeader$1(FacilitiesSearchFragment facilitiesSearchFragment) {
        super(2);
        this.this$0 = facilitiesSearchFragment;
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
                ComposerKt.m29845w0(-248100461, i, -1, "com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesSearchFragment.initHeader.<anonymous> (FacilitiesSearchFragment.kt:276)");
            }
            final FacilitiesSearchFragment facilitiesSearchFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -2109448336, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-2109448336, i2, -1, "com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesSearchFragment.initHeader.<anonymous>.<anonymous> (FacilitiesSearchFragment.kt:277)");
                        }
                        String d = C16018i.m71858d(R.string.facilities_find_facilities, oVar2, 0);
                        String d2 = C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar2, 0);
                        String d3 = C16018i.m71858d(R.string.facilities_edt_search_hint, oVar2, 0);
                        C289771 r15 = r2;
                        final FacilitiesSearchFragment facilitiesSearchFragment = facilitiesSearchFragment;
                        C289771 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                facilitiesSearchFragment.requireActivity().onBackPressed();
                            }
                        };
                        C289782 r17 = r2;
                        final FacilitiesSearchFragment facilitiesSearchFragment2 = facilitiesSearchFragment;
                        C289782 r22 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "searchText");
                                C28961c T0 = facilitiesSearchFragment2.f71051w;
                                if (T0 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
                                    T0 = null;
                                }
                                T0.mo84297a(str);
                            }
                        };
                        C289793 r18 = r2;
                        final FacilitiesSearchFragment facilitiesSearchFragment3 = facilitiesSearchFragment;
                        C289793 r23 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                ComposeView composeView = FacilitiesSearchFragment.m119882S0(facilitiesSearchFragment3).f91674c;
                                Intrinsics.checkNotNullExpressionValue(composeView, "binding.facilitySearchHeader");
                                C22757a.m102928b(composeView);
                            }
                        };
                        HeaderComponentKt.m151500e(d, (C16361p0) null, d3, (String) null, false, false, false, 0, 0, 0, d2, r15, (C11300l<? super String, C11079d2>) null, r17, r18, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, oVar, 1572864, 0, 103354);
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
