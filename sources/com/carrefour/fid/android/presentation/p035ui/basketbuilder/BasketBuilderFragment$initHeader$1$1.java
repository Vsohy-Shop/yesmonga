package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36849v0;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.material.tabs.TabLayout;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$initHeader$1$1 */
public final class BasketBuilderFragment$initHeader$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C36849v0 $this_with;
    final /* synthetic */ BasketBuilderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketBuilderFragment$initHeader$1$1(BasketBuilderFragment basketBuilderFragment, C36849v0 v0Var) {
        super(2);
        this.this$0 = basketBuilderFragment;
        this.$this_with = v0Var;
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
                ComposerKt.m29845w0(1796805548, i, -1, "com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment.initHeader.<anonymous>.<anonymous> (BasketBuilderFragment.kt:92)");
            }
            final BasketBuilderFragment basketBuilderFragment = this.this$0;
            final C36849v0 v0Var = this.$this_with;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -50454161, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-50454161, i2, -1, "com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment.initHeader.<anonymous>.<anonymous>.<anonymous> (BasketBuilderFragment.kt:93)");
                        }
                        String d = C16018i.m71858d(R.string.basket_builer_title_toolbar, oVar2, 0);
                        String d2 = C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar2, 0);
                        final BasketBuilderFragment basketBuilderFragment = basketBuilderFragment;
                        final C36849v0 v0Var = v0Var;
                        C231691 r11 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                int ordinal = basketBuilderFragment.mo67950U0().mo68041e().ordinal();
                                TabLayout tabLayout = v0Var.f91785e;
                                BasketBuilderFragment basketBuilderFragment = basketBuilderFragment;
                                if (tabLayout.getVisibility() != 0 || tabLayout.getSelectedTabPosition() == ordinal) {
                                    C19232h activity = basketBuilderFragment.getActivity();
                                    if (activity != null) {
                                        activity.onBackPressed();
                                        return;
                                    }
                                    return;
                                }
                                tabLayout.mo91286N(tabLayout.mo91367z(ordinal));
                            }
                        };
                        final BasketBuilderFragment basketBuilderFragment2 = basketBuilderFragment;
                        HeaderComponentKt.m151503h(d, (C16361p0) null, 0, 0, 0, d2, r11, C8553b.m31048b(oVar2, -1608399940, true, new C11305q<C2411u0, C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
                                Intrinsics.checkNotNullParameter(u0Var, "$this$NavigationActionHeader");
                                if ((i & 81) != 16 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-1608399940, i, -1, "com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment.initHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BasketBuilderFragment.kt:108)");
                                    }
                                    Painter d = C16015f.m71849d(R.drawable.ds_ic_search_1, oVar, 0);
                                    String d2 = C16018i.m71858d(R.string.accessibility_open_search_page, oVar, 0);
                                    final BasketBuilderFragment basketBuilderFragment = basketBuilderFragment2;
                                    HeaderComponentKt.m151496a(d, false, 0, d2, new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            FragmentKt.m118823k(basketBuilderFragment, C23215e.f58900a.mo68062c());
                                        }
                                    }, oVar, 8, 6);
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), oVar, 12582912, 30);
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
