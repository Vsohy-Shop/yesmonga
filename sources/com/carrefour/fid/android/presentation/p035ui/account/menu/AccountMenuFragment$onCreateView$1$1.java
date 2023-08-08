package com.carrefour.fid.android.presentation.p035ui.account.menu;

import android.content.Context;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt;
import com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28775q;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.various.core.utils.C22755a;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment$onCreateView$1$1 */
public final class AccountMenuFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ AccountMenuFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuFragment$onCreateView$1$1(AccountMenuFragment accountMenuFragment, ComposeView composeView) {
        super(2);
        this.this$0 = accountMenuFragment;
        this.$this_apply = composeView;
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
                ComposerKt.m29845w0(1419664610, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment.onCreateView.<anonymous>.<anonymous> (AccountMenuFragment.kt:44)");
            }
            final AccountMenuFragment accountMenuFragment = this.this$0;
            final ComposeView composeView = this.$this_apply;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1943675355, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(-1943675355, i2, -1, "com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AccountMenuFragment.kt:45)");
                        }
                        String c = accountMenuFragment.mo67815M0().mo84152c();
                        C25796a K0 = accountMenuFragment.mo67813K0();
                        C230891 r5 = r1;
                        final AccountMenuFragment accountMenuFragment = accountMenuFragment;
                        C230891 r1 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment, C23104a.f58763a.mo67828d());
                            }
                        };
                        C230952 r6 = r1;
                        final AccountMenuFragment accountMenuFragment2 = accountMenuFragment;
                        C230952 r12 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment2, C23104a.f58763a.mo67833i());
                            }
                        };
                        C230963 r7 = r1;
                        final AccountMenuFragment accountMenuFragment3 = accountMenuFragment;
                        C230963 r13 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19232h activity = accountMenuFragment3.getActivity();
                                if (activity != null) {
                                    String string = accountMenuFragment3.getString(R.string.customer_services_url);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_services_url)");
                                    ActivityKt.m118690C(activity, string);
                                }
                            }
                        };
                        C230974 r8 = r1;
                        final AccountMenuFragment accountMenuFragment4 = accountMenuFragment;
                        C230974 r14 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment4, C23104a.f58763a.mo67832h());
                            }
                        };
                        C230985 r9 = r1;
                        final AccountMenuFragment accountMenuFragment5 = accountMenuFragment;
                        C230985 r15 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment5, C23104a.f58763a.mo67826b());
                            }
                        };
                        C230996 r10 = r1;
                        final AccountMenuFragment accountMenuFragment6 = accountMenuFragment;
                        C230996 r16 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment6, C23104a.f58763a.mo67835k());
                            }
                        };
                        C231007 r11 = r1;
                        final AccountMenuFragment accountMenuFragment7 = accountMenuFragment;
                        C231007 r17 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment7, C23104a.f58763a.mo67829e());
                            }
                        };
                        C231018 r122 = r1;
                        final AccountMenuFragment accountMenuFragment8 = accountMenuFragment;
                        C231018 r18 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19232h activity = accountMenuFragment8.getActivity();
                                if (activity != null) {
                                    C22755a.f58271a.mo67152e(activity);
                                }
                            }
                        };
                        C231029 r132 = r1;
                        final AccountMenuFragment accountMenuFragment9 = accountMenuFragment;
                        C231029 r19 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment9, C23104a.f58763a.mo67830f());
                            }
                        };
                        C2309010 r142 = r1;
                        final AccountMenuFragment accountMenuFragment10 = accountMenuFragment;
                        C2309010 r110 = new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo67823a(boolean z) {
                                accountMenuFragment10.mo67816N0(z);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo67823a(((Boolean) obj).booleanValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C2309111 r152 = r1;
                        final AccountMenuFragment accountMenuFragment11 = accountMenuFragment;
                        C2309111 r111 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                accountMenuFragment11.requireActivity().mo702Z().mo767f();
                            }
                        };
                        C2309212 r162 = r1;
                        final ComposeView composeView = composeView;
                        C2309212 r112 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "uuid");
                                Context context = composeView.getContext();
                                if (context != null) {
                                    C28775q.m119093a(context, str, R.string.id_copied);
                                }
                            }
                        };
                        C2309313 r172 = r1;
                        final AccountMenuFragment accountMenuFragment12 = accountMenuFragment;
                        C2309313 r113 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(accountMenuFragment12, C23104a.f58763a.mo67827c());
                            }
                        };
                        C2309414 r182 = r1;
                        final AccountMenuFragment accountMenuFragment13 = accountMenuFragment;
                        C2309414 r114 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                accountMenuFragment13.mo67817O0();
                            }
                        };
                        AccountMenuComponentStatefulKt.m103670d((AccountMenuViewModel) null, K0, c, r5, r6, r7, r8, r9, r10, r11, r122, r132, r142, r152, r162, r172, r182, oVar, 64, 0, 1);
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
