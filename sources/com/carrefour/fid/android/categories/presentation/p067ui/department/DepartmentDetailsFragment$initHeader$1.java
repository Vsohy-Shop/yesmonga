package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.ThemeKt;
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
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment$initHeader$1 */
public final class DepartmentDetailsFragment$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ DepartmentDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentDetailsFragment$initHeader$1(DepartmentDetailsFragment departmentDetailsFragment) {
        super(2);
        this.this$0 = departmentDetailsFragment;
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
                ComposerKt.m29845w0(2077506977, i, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment.initHeader.<anonymous> (DepartmentDetailsFragment.kt:55)");
            }
            final DepartmentDetailsFragment departmentDetailsFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1367061314, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-1367061314, i2, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment.initHeader.<anonymous>.<anonymous> (DepartmentDetailsFragment.kt:56)");
                        }
                        String q = departmentDetailsFragment.mo131076T0().mo131141h().mo117297q();
                        String d = C16018i.m71858d(C39711b.C39729r.accessibility_back_to_previous_page, oVar2, 0);
                        final DepartmentDetailsFragment departmentDetailsFragment = departmentDetailsFragment;
                        C397561 r10 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                departmentDetailsFragment.requireActivity().mo702Z().mo767f();
                            }
                        };
                        final DepartmentDetailsFragment departmentDetailsFragment2 = departmentDetailsFragment;
                        HeaderComponentKt.m151503h(q, (C16361p0) null, 0, 0, 0, d, r10, C8553b.m31048b(oVar2, 680372113, true, new C11305q<C2411u0, C8592o, Integer, C11079d2>() {
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
                                        ComposerKt.m29845w0(680372113, i, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment.initHeader.<anonymous>.<anonymous>.<anonymous> (DepartmentDetailsFragment.kt:63)");
                                    }
                                    Painter d = C16015f.m71849d(C39711b.C39719h.ds_ic_search_1, oVar, 0);
                                    String d2 = C16018i.m71858d(C39711b.C39729r.accessibility_search, oVar, 0);
                                    final DepartmentDetailsFragment departmentDetailsFragment = departmentDetailsFragment2;
                                    HeaderComponentKt.m151496a(d, false, 0, d2, new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            departmentDetailsFragment.getNavigator().mo83845u(C19736g.m91827a(departmentDetailsFragment), false);
                                        }
                                    }, oVar, 8, 6);
                                    C2428y0.m10726a(SizeKt.m10092H(C8767m.f23478j, C37474a.f94133a.mo114202y()), oVar, 0);
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
