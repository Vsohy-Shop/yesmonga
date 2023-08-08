package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15867d1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponDetailOverlayScreen$1 */
public final class C23925x5d6bb6c3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23939a, C11079d2> $actioner;
    final /* synthetic */ C28892e<C11079d2> $couponDetailsStatus;
    final /* synthetic */ CouponModel $couponModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23925x5d6bb6c3(C28892e<C11079d2> eVar, C11300l<? super C23939a, C11079d2> lVar, int i, CouponModel couponModel) {
        super(3);
        this.$couponDetailsStatus = eVar;
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$couponModel = couponModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(191769858, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen.<anonymous> (CouponDetailsOverlayBottomSheetStateful.kt:88)");
            }
            C8767m b = NestedScrollModifierKt.m68305b(C8767m.f23478j, C15867d1.m71320h((View) null, oVar2, 0, 1), (NestedScrollDispatcher) null, 2, (Object) null);
            final C28892e<C11079d2> eVar = this.$couponDetailsStatus;
            final C11300l<C23939a, C11079d2> lVar = this.$actioner;
            final int i3 = this.$$dirty;
            final CouponModel couponModel = this.$couponModel;
            SurfaceKt.m13879b(b, (C15218g4) null, 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(oVar2, -818244282, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-818244282, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen.<anonymous>.<anonymous> (CouponDetailsOverlayBottomSheetStateful.kt:89)");
                        }
                        final C28892e<C11079d2> eVar = eVar;
                        final C11300l<C23939a, C11079d2> lVar = lVar;
                        final int i3 = i3;
                        final CouponModel couponModel = couponModel;
                        LazyDslKt.m10737b((C8767m) null, (LazyListState) null, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LazyListScope) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k LazyListScope lazyListScope) {
                                Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
                                final C11300l<C23939a, C11079d2> lVar = lVar;
                                final int i = i3;
                                LazyListScope.m10824g(lazyListScope, "Header", (Object) null, C8553b.m31049c(920152538, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                        return C11079d2.f28267a;
                                    }

                                    @C8540g
                                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                        Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                        if ((i & 81) != 16 || !oVar.mo15011p()) {
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29845w0(920152538, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponDetailsOverlayBottomSheetStateful.kt:92)");
                                            }
                                            CouponDetailsOverlayBottomSheetStatefulKt.m105803q(lVar, oVar, (i >> 6) & 14);
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29843v0();
                                                return;
                                            }
                                            return;
                                        }
                                        oVar.mo14958a0();
                                    }
                                }), 2, (Object) null);
                                final CouponModel couponModel = couponModel;
                                LazyListScope.m10824g(lazyListScope, "Body", (Object) null, C8553b.m31049c(990282897, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                        return C11079d2.f28267a;
                                    }

                                    @C8540g
                                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                        Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                        if ((i & 81) != 16 || !oVar.mo15011p()) {
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29845w0(990282897, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponDetailsOverlayBottomSheetStateful.kt:93)");
                                            }
                                            CouponDetailsOverlayBottomSheetStatefulKt.m105804r(C23951f.m105839j(couponModel, (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())), oVar, 0);
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29843v0();
                                                return;
                                            }
                                            return;
                                        }
                                        oVar.mo14958a0();
                                    }
                                }), 2, (Object) null);
                                final C28892e<C11079d2> eVar = eVar;
                                final C11300l<C23939a, C11079d2> lVar2 = lVar;
                                final CouponModel couponModel2 = couponModel;
                                final int i2 = i3;
                                LazyListScope.m10824g(lazyListScope, "Button", (Object) null, C8553b.m31049c(614449426, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                        return C11079d2.f28267a;
                                    }

                                    @C8540g
                                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                        Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                        if ((i & 81) != 16 || !oVar.mo15011p()) {
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29845w0(614449426, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponDetailsOverlayBottomSheetStateful.kt:94)");
                                            }
                                            C28892e<C11079d2> eVar2 = eVar;
                                            C11300l<C23939a, C11079d2> lVar = lVar2;
                                            CouponStatus S = couponModel2.mo121403S();
                                            int i2 = C28892e.f70778a;
                                            int i3 = i2;
                                            CouponDetailsOverlayBottomSheetStatefulKt.m105797k(eVar2, lVar, S, oVar, i2 | (i3 & 14) | ((i3 >> 3) & 112));
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29843v0();
                                                return;
                                            }
                                            return;
                                        }
                                        oVar.mo14958a0();
                                    }
                                }), 2, (Object) null);
                                final C28892e<C11079d2> eVar2 = eVar;
                                if (eVar2 instanceof C28892e.C28893a) {
                                    final C11300l<C23939a, C11079d2> lVar3 = lVar;
                                    final int i3 = i3;
                                    LazyListScope.m10824g(lazyListScope, "ErrorMessage", (Object) null, C8553b.m31049c(272183477, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                            return C11079d2.f28267a;
                                        }

                                        @C8540g
                                        @C8570j(applier = "androidx.compose.ui.UiComposable")
                                        public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                            Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                            if ((i & 81) != 16 || !oVar.mo15011p()) {
                                                if (ComposerKt.m29813g0()) {
                                                    ComposerKt.m29845w0(272183477, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponDetailsOverlayBottomSheetStateful.kt:96)");
                                                }
                                                CouponDetailsOverlayBottomSheetStatefulKt.m105802p((C28892e.C28893a) eVar2, lVar3, oVar, C28892e.C28893a.f70779c | ((i3 >> 3) & 112));
                                                if (ComposerKt.m29813g0()) {
                                                    ComposerKt.m29843v0();
                                                    return;
                                                }
                                                return;
                                            }
                                            oVar.mo14958a0();
                                        }
                                    }), 2, (Object) null);
                                }
                            }
                        }, oVar, 0, 255);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 1572864, 62);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
