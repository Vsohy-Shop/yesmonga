package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.home.toolbar.ToolbarHomeKt;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$setupToolbar$2 */
public final class HomePageFragment$setupToolbar$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$setupToolbar$2(HomePageFragment homePageFragment) {
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
                ComposerKt.m29845w0(1324038013, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.setupToolbar.<anonymous> (HomePageFragment.kt:1114)");
            }
            final HomePageFragment homePageFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -402907968, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-402907968, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.setupToolbar.<anonymous>.<anonymous> (HomePageFragment.kt:1115)");
                        }
                        float t0 = ((C16483g) C11479u.m44453w(C16483g.m74451w(homePageFragment.mo70421u1()), C16483g.m74451w(C16483g.m74435M((float) 32)))).mo47823t0();
                        HomePageViewModel W0 = homePageFragment.mo70419t1();
                        float Z0 = homePageFragment.mo70423v1();
                        final HomePageFragment homePageFragment = homePageFragment;
                        C241091 r3 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment.mo70419t1().sendIntent(C26406a.C26407a.C26414d.f64613a);
                                FragmentKt.m118823k(homePageFragment, C24142f.f60384a.mo70617a());
                            }
                        };
                        final HomePageFragment homePageFragment2 = homePageFragment;
                        C241102 r4 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(homePageFragment2, C24142f.f60384a.mo70628p(true));
                            }
                        };
                        final HomePageFragment homePageFragment3 = homePageFragment;
                        ToolbarHomeKt.m106590e(W0, Z0, t0, r3, r4, new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment3.f60306Y.mo960b("android.permission.CAMERA");
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
