package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b;
import com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$handleLoyalty$1 */
public final class HomePageFragment$handleLoyalty$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C26487c $couponsInfoState;
    final /* synthetic */ C26484b $joBanner;
    final /* synthetic */ C26497f $loyaltyBalanceState;
    final /* synthetic */ C26501g $loyaltyCardState;
    final /* synthetic */ C26505h $stickersInfoState;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$handleLoyalty$1(C26501g gVar, C26497f fVar, C26487c cVar, C26505h hVar, C26484b bVar, HomePageFragment homePageFragment) {
        super(2);
        this.$loyaltyCardState = gVar;
        this.$loyaltyBalanceState = fVar;
        this.$couponsInfoState = cVar;
        this.$stickersInfoState = hVar;
        this.$joBanner = bVar;
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
                ComposerKt.m29845w0(-221474866, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleLoyalty.<anonymous> (HomePageFragment.kt:451)");
            }
            final C26501g gVar = this.$loyaltyCardState;
            final C26497f fVar = this.$loyaltyBalanceState;
            final C26487c cVar = this.$couponsInfoState;
            final C26505h hVar = this.$stickersInfoState;
            final C26484b bVar = this.$joBanner;
            final HomePageFragment homePageFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -2127082133, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-2127082133, i2, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleLoyalty.<anonymous>.<anonymous> (HomePageFragment.kt:452)");
                        }
                        C26501g gVar = gVar;
                        C26497f fVar = fVar;
                        C26487c cVar = cVar;
                        C26505h hVar = hVar;
                        C24176b.C24177a aVar = C24176b.C24177a.f60468a;
                        C26484b bVar = bVar;
                        C240911 r11 = r1;
                        final HomePageFragment homePageFragment = homePageFragment;
                        C240911 r1 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19232h activity = homePageFragment.getActivity();
                                BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
                                if (bottomNavActivity != null) {
                                    bottomNavActivity.mo121121X1();
                                }
                            }
                        };
                        C240922 r12 = r1;
                        final HomePageFragment homePageFragment2 = homePageFragment;
                        C240922 r13 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment2.mo70419t1().sendIntent(new C26406a.C26407a.C26434v(LoyaltyCardType.f89890c));
                                FragmentKt.m118823k(homePageFragment2, C24142f.f60384a.mo70626m());
                            }
                        };
                        C240933 r132 = r1;
                        final HomePageFragment homePageFragment3 = homePageFragment;
                        C240933 r14 = new C11300l<Integer, C11079d2>() {
                            /* renamed from: a */
                            public final void mo70466a(int i) {
                                homePageFragment3.mo70419t1().sendIntent(C26406a.C26407a.C26433u.f64653a);
                                FragmentKt.m118823k(homePageFragment3, C24142f.f60384a.mo70625l(String.valueOf(i)));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo70466a(((Number) obj).intValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C240944 r142 = r1;
                        final HomePageFragment homePageFragment4 = homePageFragment;
                        C240944 r15 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment4.mo70419t1().sendIntent(C26406a.C26407a.C26428p.f64643a);
                            }
                        };
                        C240955 r152 = r1;
                        final HomePageFragment homePageFragment5 = homePageFragment;
                        C240955 r16 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment5.mo70419t1().sendIntent(C26406a.C26407a.C26426n.f64639a);
                            }
                        };
                        C240966 r162 = r1;
                        final HomePageFragment homePageFragment6 = homePageFragment;
                        C240966 r17 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment6.mo70419t1().sendIntent(new C26406a.C26407a.C26434v(LoyaltyCardType.NOT_EXIST));
                                C19232h activity = homePageFragment6.getActivity();
                                BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
                                if (bottomNavActivity != null) {
                                    bottomNavActivity.mo121121X1();
                                }
                            }
                        };
                        C240977 r172 = r1;
                        final HomePageFragment homePageFragment7 = homePageFragment;
                        C240977 r18 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment7.mo70419t1().sendIntent(C26406a.C26407a.C26423k.f64633a);
                                FragmentKt.m118823k(homePageFragment7, C24142f.f60384a.mo70621g("accueil", "home"));
                            }
                        };
                        C240988 r182 = r1;
                        final HomePageFragment homePageFragment8 = homePageFragment;
                        C240988 r19 = new C11304p<String, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo70467a(@C12579k String str, @C12579k String str2) {
                                Intrinsics.checkNotNullParameter(str, "stickersTitle");
                                Intrinsics.checkNotNullParameter(str2, "stickersUrl");
                                homePageFragment8.mo70419t1().sendIntent(new C26406a.C26407a.C26438z(str, str2));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                mo70467a((String) obj, (String) obj2);
                                return C11079d2.f28267a;
                            }
                        };
                        C240999 r192 = r1;
                        final HomePageFragment homePageFragment9 = homePageFragment;
                        C240999 r110 = new C11305q<String, String, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo70468a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                                Intrinsics.checkNotNullParameter(str, "opCode");
                                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                                Intrinsics.checkNotNullParameter(str3, "webViewTitle");
                                homePageFragment9.mo70419t1().sendIntent(new C26406a.C26407a.C26421i(str, str2, str3));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                mo70468a((String) obj, (String) obj2, (String) obj3);
                                return C11079d2.f28267a;
                            }
                        };
                        LoyaltyBlocStatefullKt.m106436e(gVar, fVar, cVar, hVar, aVar, bVar, r11, r12, r132, r142, r152, r162, r172, r182, r192, oVar, C12888a.f31808q, 0, 0);
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
