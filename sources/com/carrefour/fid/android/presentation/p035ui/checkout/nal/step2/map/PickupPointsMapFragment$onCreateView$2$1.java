package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$onCreateView$2$1 */
public final class PickupPointsMapFragment$onCreateView$2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ PickupPointsMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapFragment$onCreateView$2$1(PickupPointsMapFragment pickupPointsMapFragment) {
        super(2);
        this.this$0 = pickupPointsMapFragment;
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
                ComposerKt.m29845w0(522249664, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment.onCreateView.<anonymous>.<anonymous> (PickupPointsMapFragment.kt:171)");
            }
            final PickupPointsMapFragment pickupPointsMapFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1394202749, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1394202749, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PickupPointsMapFragment.kt:172)");
                        }
                        if (pickupPointsMapFragment.mo69433g1()) {
                            float O0 = pickupPointsMapFragment.f59746Y;
                            C236851 r2 = new C11300l<C38080a, C11079d2>(pickupPointsMapFragment) {
                                /* renamed from: b */
                                public final void mo69466b(@C12579k C38080a aVar) {
                                    Intrinsics.checkNotNullParameter(aVar, "p0");
                                    PickupPointsMapFragment.m105165b1((PickupPointsMapFragment) this.receiver, aVar, false, 2, (Object) null);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    mo69466b((C38080a) obj);
                                    return C11079d2.f28267a;
                                }
                            };
                            final PickupPointsMapFragment pickupPointsMapFragment = pickupPointsMapFragment;
                            PickupPointListStatefulKt.m105131a((PickupPointsMapViewModel) null, O0, r2, new C11300l<C38080a, C11079d2>() {
                                /* renamed from: a */
                                public final void mo69467a(@C12579k C38080a aVar) {
                                    Intrinsics.checkNotNullParameter(aVar, "it");
                                    C19736g.m91827a(pickupPointsMapFragment).mo58156s0();
                                    pickupPointsMapFragment.mo69432f1().mo69146h(aVar.mo118295v());
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    mo69467a((C38080a) obj);
                                    return C11079d2.f28267a;
                                }
                            }, oVar, 0, 1);
                        }
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
