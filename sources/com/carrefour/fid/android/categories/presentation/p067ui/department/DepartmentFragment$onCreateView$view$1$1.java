package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39785g;
import com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.product.C27455c;
import com.carrefour.fid.android.shared.extension.FragmentKt;
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
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment$onCreateView$view$1$1 */
public final class DepartmentFragment$onCreateView$view$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ DepartmentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentFragment$onCreateView$view$1$1(DepartmentFragment departmentFragment) {
        super(2);
        this.this$0 = departmentFragment;
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
                ComposerKt.m29845w0(1144185014, i, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment.onCreateView.<anonymous>.<anonymous> (DepartmentFragment.kt:67)");
            }
            final DepartmentFragment departmentFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1124957177, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(1124957177, i2, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DepartmentFragment.kt:68)");
                        }
                        C37269i J0 = departmentFragment.mo131090N0();
                        C37269i I0 = departmentFragment.mo131089M0();
                        final DepartmentFragment departmentFragment = departmentFragment;
                        C397601 r8 = new C11300l<ProductCategory, C11079d2>() {
                            /* renamed from: a */
                            public final void mo131102a(@C12579k ProductCategory productCategory) {
                                Intrinsics.checkNotNullParameter(productCategory, "productCategory");
                                departmentFragment.mo131092P0().mo131069d(productCategory.mo117294n());
                                FragmentKt.m118823k(departmentFragment, C39785g.C39788c.m162343b(C39785g.f101518a, productCategory, productCategory.mo117297q(), false, 4, (Object) null));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo131102a((ProductCategory) obj);
                                return C11079d2.f28267a;
                            }
                        };
                        final DepartmentFragment departmentFragment2 = departmentFragment;
                        C397612 r9 = new C11300l<ProductCategory, C11079d2>() {
                            /* renamed from: a */
                            public final void mo131103a(@C12579k ProductCategory productCategory) {
                                Intrinsics.checkNotNullParameter(productCategory, "productCategory");
                                C19736g.m91827a(departmentFragment2).mo58130W(C39711b.C39721j.product_list_department_graph, new C27455c(productCategory, productCategory.mo117297q()).mo79808h());
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo131103a((ProductCategory) obj);
                                return C11079d2.f28267a;
                            }
                        };
                        final DepartmentFragment departmentFragment3 = departmentFragment;
                        C397623 r10 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                departmentFragment3.getNavigator().mo83845u(C19736g.m91827a(departmentFragment3), false);
                            }
                        };
                        final DepartmentFragment departmentFragment4 = departmentFragment;
                        C397634 r11 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                departmentFragment4.getNavigator().mo83845u(C19736g.m91827a(departmentFragment4), true);
                            }
                        };
                        final DepartmentFragment departmentFragment5 = departmentFragment;
                        C397645 r12 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                departmentFragment5.f101484x.mo960b("android.permission.CAMERA");
                            }
                        };
                        int i3 = C37269i.f93484a;
                        DepartmentStatefulKt.m162266h((DepartmentsViewModel) null, J0, I0, r8, r9, r10, r11, r12, oVar, (i3 << 3) | (i3 << 6), 1);
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
