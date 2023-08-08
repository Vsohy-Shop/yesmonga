package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo;
import com.carrefour.fid.android.design.components.compose.Service;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.home.services.HomeServicesKt;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$handleSetServices$1 */
public final class HomePageFragment$handleSetServices$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$handleSetServices$1(HomePageFragment homePageFragment) {
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
                ComposerKt.m29845w0(-1654663561, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleSetServices.<anonymous> (HomePageFragment.kt:361)");
            }
            final HomePageFragment homePageFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1718272788, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1718272788, i, -1, "com.carrefour.fid.android.presentation.ui.home.HomePageFragment.handleSetServices.<anonymous>.<anonymous> (HomePageFragment.kt:362)");
                        }
                        HomePageViewModel W0 = homePageFragment.mo70419t1();
                        float Z0 = homePageFragment.mo70423v1();
                        final HomePageFragment homePageFragment = homePageFragment;
                        C241041 r2 = new C11300l<Service, C11079d2>() {
                            /* renamed from: a */
                            public final void mo70474a(@C12579k Service service) {
                                boolean z;
                                BottomNavActivity bottomNavActivity;
                                Intrinsics.checkNotNullParameter(service, "it");
                                boolean z2 = homePageFragment.mo70419t1().mo76742M1().getValue() instanceof C26509i.C26510a;
                                if (Intrinsics.areEqual((Object) service, (Object) Service.Clcv.f92317a)) {
                                    homePageFragment.mo70419t1().sendIntent(C26406a.C26407a.C26416e.f64617a);
                                    homePageFragment.mo70393d2(z2, StoreServiceType.Clcv.INSTANCE);
                                } else if (Intrinsics.areEqual((Object) service, (Object) Service.Drive.f92319a)) {
                                    homePageFragment.mo70419t1().sendIntent(C26406a.C26407a.C26418f.f64621a);
                                    homePageFragment.mo70394e2(z2);
                                } else if (Intrinsics.areEqual((Object) service, (Object) Service.H1h3.f92321a)) {
                                    homePageFragment.mo70419t1().sendIntent(C26406a.C26407a.C26416e.f64617a);
                                    homePageFragment.mo70393d2(z2, StoreServiceType.H1h3.INSTANCE);
                                } else if (service instanceof Service.PhysicalStore) {
                                    ActiveState activeState = (ActiveState) homePageFragment.mo70419t1().mo76737H1().getValue().get(service);
                                    if (!(activeState instanceof ActiveState.ActiveDataStore) || Intrinsics.areEqual((Object) ((ActiveState.ActiveDataStore) activeState).mo111932e(), (Object) PhysicalStoreInfo.NoInfo.f92304a)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    homePageFragment.mo70419t1().sendIntent(new C26406a.C26407a.C26431s(z));
                                    C19232h activity = homePageFragment.getActivity();
                                    if (activity instanceof BottomNavActivity) {
                                        bottomNavActivity = (BottomNavActivity) activity;
                                    } else {
                                        bottomNavActivity = null;
                                    }
                                    if (bottomNavActivity != null) {
                                        bottomNavActivity.mo121123Z1();
                                    }
                                }
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo70474a((Service) obj);
                                return C11079d2.f28267a;
                            }
                        };
                        final HomePageFragment homePageFragment2 = homePageFragment;
                        C241052 r3 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment2.mo70419t1().sendIntent(C26406a.C26407a.C26409a0.f64603a);
                            }
                        };
                        final HomePageFragment homePageFragment3 = homePageFragment;
                        HomeServicesKt.m106531b(W0, Z0, r2, r3, new C11289a<C11079d2>() {
                            public final void invoke() {
                                homePageFragment3.mo70419t1().mo76769f2();
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
