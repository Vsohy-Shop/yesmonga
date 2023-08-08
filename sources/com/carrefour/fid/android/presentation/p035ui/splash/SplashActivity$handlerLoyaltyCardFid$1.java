package com.carrefour.fid.android.presentation.p035ui.splash;

import android.view.WindowManager;
import androidx.compose.material.BottomSheetValue;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.shared.extension.ConnectivityKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$handlerLoyaltyCardFid$1 */
public final class SplashActivity$handlerLoyaltyCardFid$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ LoyaltyCardType $cardType;
    final /* synthetic */ String $userFullName;
    final /* synthetic */ SplashActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashActivity$handlerLoyaltyCardFid$1(String str, String str2, LoyaltyCardType loyaltyCardType, SplashActivity splashActivity) {
        super(2);
        this.$cardNumber = str;
        this.$userFullName = str2;
        this.$cardType = loyaltyCardType;
        this.this$0 = splashActivity;
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
                ComposerKt.m29845w0(83352168, i, -1, "com.carrefour.fid.android.presentation.ui.splash.SplashActivity.handlerLoyaltyCardFid.<anonymous> (SplashActivity.kt:179)");
            }
            final String str = this.$cardNumber;
            final String str2 = this.$userFullName;
            final LoyaltyCardType loyaltyCardType = this.$cardType;
            final SplashActivity splashActivity = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1386738389, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1386738389, i, -1, "com.carrefour.fid.android.presentation.ui.splash.SplashActivity.handlerLoyaltyCardFid.<anonymous>.<anonymous> (SplashActivity.kt:180)");
                        }
                        String str = str;
                        String str2 = str2;
                        boolean z = loyaltyCardType == LoyaltyCardType.PASS;
                        final SplashActivity splashActivity = splashActivity;
                        C257391 r8 = new C11300l<Float, C11079d2>() {
                            /* renamed from: a */
                            public final void mo74749a(float f) {
                                WindowManager.LayoutParams attributes = splashActivity.getWindow().getAttributes();
                                attributes.screenBrightness = f;
                                splashActivity.getWindow().setAttributes(attributes);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo74749a(((Number) obj).floatValue());
                                return C11079d2.f28267a;
                            }
                        };
                        final SplashActivity splashActivity2 = splashActivity;
                        BottomSheetLoyaltyComponentKt.m110420a(str, str2, -1.0f, (BottomSheetValue) null, z, r8, new C11289a<C11079d2>() {

                            @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.splash.SplashActivity$handlerLoyaltyCardFid$1$1$2$1", mo22502f = "SplashActivity.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                            @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                            /* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$handlerLoyaltyCardFid$1$1$2$1 */
                            public static final class C257411 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
                                /* synthetic */ boolean Z$0;
                                int label;

                                @C12579k
                                public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                                    C257411 r0 = new C257411(splashActivity, cVar);
                                    r0.Z$0 = ((Boolean) obj).booleanValue();
                                    return r0;
                                }

                                @C12580l
                                /* renamed from: g */
                                public final Object mo74750g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
                                    return ((C257411) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return mo74750g(((Boolean) obj).booleanValue(), (C11045c) obj2);
                                }

                                @C12580l
                                public final Object invokeSuspend(@C12579k Object obj) {
                                    C11063b.m42612h();
                                    if (this.label == 0) {
                                        C11661u0.m45747n(obj);
                                        splashActivity.mo74739w1(this.Z$0);
                                        return C11079d2.f28267a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }

                            public final void invoke() {
                                C11907e<Boolean> O0 = C11909g.m47391O0(ConnectivityKt.m118750b(splashActivity2), C11768d1.m46781c());
                                final SplashActivity splashActivity = splashActivity2;
                                C11909g.m47412V0(C11909g.m47448f1(O0, new C257411((C11045c<? super C257411>) null)), C19501x.m90847a(splashActivity2));
                            }
                        }, oVar, 0, 8);
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
