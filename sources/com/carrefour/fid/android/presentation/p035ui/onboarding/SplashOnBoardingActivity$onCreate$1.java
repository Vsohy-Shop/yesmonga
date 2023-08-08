package com.carrefour.fid.android.presentation.p035ui.onboarding;

import android.os.Bundle;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.onboarding.component.SplashOnBoardingKt;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.SplashOnBoardingActivity$onCreate$1 */
public final class SplashOnBoardingActivity$onCreate$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ SplashOnBoardingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashOnBoardingActivity$onCreate$1(SplashOnBoardingActivity splashOnBoardingActivity) {
        super(2);
        this.this$0 = splashOnBoardingActivity;
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
                ComposerKt.m29845w0(514037991, i, -1, "com.carrefour.fid.android.presentation.ui.onboarding.SplashOnBoardingActivity.onCreate.<anonymous> (SplashOnBoardingActivity.kt:23)");
            }
            final SplashOnBoardingActivity splashOnBoardingActivity = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1429841194, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1429841194, i, -1, "com.carrefour.fid.android.presentation.ui.onboarding.SplashOnBoardingActivity.onCreate.<anonymous>.<anonymous> (SplashOnBoardingActivity.kt:24)");
                        }
                        C27420a X0 = splashOnBoardingActivity.mo72045X0();
                        final SplashOnBoardingActivity splashOnBoardingActivity = splashOnBoardingActivity;
                        C246541 r0 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C13825a.m58791t(splashOnBoardingActivity, false, (Bundle) null, 3, (Object) null);
                            }
                        };
                        final SplashOnBoardingActivity splashOnBoardingActivity2 = splashOnBoardingActivity;
                        SplashOnBoardingKt.m107716a(X0, r0, new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo72049a(boolean z) {
                                String str;
                                SplashOnBoardingActivity splashOnBoardingActivity = splashOnBoardingActivity2;
                                Bundle bundle = new Bundle();
                                if (z) {
                                    str = C13825a.f33737a;
                                } else {
                                    str = C13825a.f33738b;
                                }
                                bundle.putString(BottomNavActivity.f97026B1, str);
                                C11079d2 d2Var = C11079d2.f28267a;
                                C13825a.m58791t(splashOnBoardingActivity, false, bundle, 1, (Object) null);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo72049a(((Boolean) obj).booleanValue());
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
