package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.home.arsenalGame.ArsenalBannersHomeStatefulKt;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$handleArsenalBottomBanner$1 */
public final class HomePageFragment$handleArsenalBottomBanner$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$handleArsenalBottomBanner$1(HomePageFragment homePageFragment) {
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
                ComposerKt.m29845w0(1706475946, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleArsenalBottomBanner.<anonymous> (HomePageFragment.kt:588)");
            }
            final HomePageFragment homePageFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1995587257, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1995587257, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleArsenalBottomBanner.<anonymous>.<anonymous> (HomePageFragment.kt:589)");
                        }
                        HomePageViewModel W0 = homePageFragment.mo70419t1();
                        final HomePageFragment homePageFragment = homePageFragment;
                        ArsenalBannersHomeStatefulKt.m106232b(W0, new C11305q<String, String, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo70452a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                                Intrinsics.checkNotNullParameter(str, "id");
                                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                                Intrinsics.checkNotNullParameter(str3, "webViewTitle");
                                homePageFragment.mo70419t1().sendIntent(new C26406a.C26407a.C26421i(str, str2, str3));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                mo70452a((String) obj, (String) obj2, (String) obj3);
                                return C11079d2.f28267a;
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
