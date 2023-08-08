package com.carrefour.fid.android.account.presentation.p018ui.create;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
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
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment$onCreateView$view$1$1 */
public final class CreateAccountFragment$onCreateView$view$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CreateAccountFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAccountFragment$onCreateView$view$1$1(CreateAccountFragment createAccountFragment) {
        super(2);
        this.this$0 = createAccountFragment;
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
                ComposerKt.m29845w0(-724785377, i, -1, "com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment.onCreateView.<anonymous>.<anonymous> (CreateAccountFragment.kt:40)");
            }
            final CreateAccountFragment createAccountFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1214257020, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1214257020, i, -1, "com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CreateAccountFragment.kt:41)");
                        }
                        String q = createAccountFragment.mo32028K0().mo84177q();
                        String x = createAccountFragment.mo32028K0().mo84184x();
                        String b = createAccountFragment.mo32029L0().mo84151b();
                        final CreateAccountFragment createAccountFragment = createAccountFragment;
                        C134831 r3 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                createAccountFragment.mo32030M0();
                            }
                        };
                        final CreateAccountFragment createAccountFragment2 = createAccountFragment;
                        C134842 r4 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                createAccountFragment2.mo32030M0();
                            }
                        };
                        final CreateAccountFragment createAccountFragment3 = createAccountFragment;
                        CreateAccountScreenKt.m57998b(q, x, b, r3, r4, new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k final String str) {
                                Intrinsics.checkNotNullParameter(str, "url");
                                final CreateAccountFragment createAccountFragment = createAccountFragment3;
                                FragmentKt.m118829q(createAccountFragment, (String) null, (String) null, new C11289a<C11079d2>() {
                                    public final void invoke() {
                                        FragmentKt.m118812C(createAccountFragment, str);
                                    }
                                }, 3, (Object) null);
                            }
                        }, oVar, 0, 0);
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
