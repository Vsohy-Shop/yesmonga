package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryFragment$onCreateView$1$1 */
public final class DriveSummaryFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ DriveSummaryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryFragment$onCreateView$1$1(DriveSummaryFragment driveSummaryFragment) {
        super(2);
        this.this$0 = driveSummaryFragment;
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
                ComposerKt.m29845w0(-311055725, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryFragment.onCreateView.<anonymous>.<anonymous> (DriveSummaryFragment.kt:23)");
            }
            final DriveSummaryFragment driveSummaryFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 325177712, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(325177712, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DriveSummaryFragment.kt:24)");
                        }
                        float distanceMeters = driveSummaryFragment.getArgs().getDistanceMeters();
                        final DriveSummaryFragment driveSummaryFragment = driveSummaryFragment;
                        C284271 r5 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19736g.m91827a(driveSummaryFragment).mo58156s0();
                            }
                        };
                        final DriveSummaryFragment driveSummaryFragment2 = driveSummaryFragment;
                        DriveSummaryScreenKt.DriveSummaryScreen((DriveSummaryViewModel) null, distanceMeters, r5, new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19736g.m91827a(driveSummaryFragment2).mo58158t0(C28330R.C28334id.drive_graph, true);
                            }
                        }, oVar, 0, 1);
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
