package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment$onCreateView$2$1 */
public final class CreateLoyaltyCardStepOneFragment$onCreateView$2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CreateLoyaltyCardStepOneFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepOneFragment$onCreateView$2$1(CreateLoyaltyCardStepOneFragment createLoyaltyCardStepOneFragment) {
        super(2);
        this.this$0 = createLoyaltyCardStepOneFragment;
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
                ComposerKt.m29845w0(-1190945977, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment.onCreateView.<anonymous>.<anonymous> (CreateLoyaltyCardStepOneFragment.kt:34)");
            }
            final CreateLoyaltyCardStepOneFragment createLoyaltyCardStepOneFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 723718730, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(723718730, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CreateLoyaltyCardStepOneFragment.kt:35)");
                        }
                        InitLoyaltyCardViewModel J0 = createLoyaltyCardStepOneFragment.mo71174L0();
                        final CreateLoyaltyCardStepOneFragment createLoyaltyCardStepOneFragment = createLoyaltyCardStepOneFragment;
                        CreateLoyaltyStepOneScreenKt.m107091c(J0, new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
                                r0 = (com.carrefour.fid.android.domain.models.account.UserCards) kotlin.collections.CollectionsKt___CollectionsKt.m40479B2((r0 = r0.mo116669w()));
                             */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void invoke(@org.jetbrains.annotations.C12579k java.lang.String r8) {
                                /*
                                    r7 = this;
                                    java.lang.String r0 = "code"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment r0 = r1
                                    com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r0 = r0.mo71174L0()
                                    com.carrefour.fid.android.domain.models.account.AccountInfo r0 = r0.getAccountInfo()
                                    if (r0 == 0) goto L_0x0024
                                    java.util.List r0 = r0.mo116669w()
                                    if (r0 == 0) goto L_0x0024
                                    java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r0)
                                    com.carrefour.fid.android.domain.models.account.UserCards r0 = (com.carrefour.fid.android.domain.models.account.UserCards) r0
                                    if (r0 == 0) goto L_0x0024
                                    java.lang.String r0 = r0.mo116763k()
                                    goto L_0x0025
                                L_0x0024:
                                    r0 = 0
                                L_0x0025:
                                    if (r0 != 0) goto L_0x0029
                                    java.lang.String r0 = ""
                                L_0x0029:
                                    boolean r0 = com.carrefour.fid.android.design.components.utils.C37139f.m152213a(r8, r0)
                                    if (r0 == 0) goto L_0x0056
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment r0 = r1
                                    com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r0 = r0.mo71174L0()
                                    kotlinx.coroutines.flow.j r0 = r0.getLoyaltyCardCreatedResult()
                                    com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
                                    r0.setValue(r1)
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment r0 = r1
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.e$b r1 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.C24406e.f60878a
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.d r2 = r0.mo71173K0()
                                    boolean r2 = r2.mo71381g()
                                    r3 = 0
                                    r5 = 2
                                    r6 = 0
                                    r4 = r8
                                    androidx.navigation.b0 r8 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.C24406e.C24408b.m107142b(r1, r2, r3, r4, r5, r6)
                                    com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(r0, r8)
                                    goto L_0x006f
                                L_0x0056:
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment r8 = r1
                                    com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r8 = r8.mo71174L0()
                                    kotlinx.coroutines.flow.j r8 = r8.getLoyaltyCardCreatedResult()
                                    com.carrefour.fid.android.shared.type.e$a r0 = new com.carrefour.fid.android.shared.type.e$a
                                    java.lang.Throwable r1 = new java.lang.Throwable
                                    java.lang.String r2 = "Invalid secret code"
                                    r1.<init>(r2)
                                    r0.<init>(r1)
                                    r8.setValue(r0)
                                L_0x006f:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment$onCreateView$2$1.C243371.C243381.invoke(java.lang.String):void");
                            }
                        }, oVar, 8, 0);
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
