package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCheckoutStep3Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$CheckoutStep3Stateful$12\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,650:1\n50#2:651\n49#2:652\n1114#3,6:653\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$CheckoutStep3Stateful$12\n*L\n209#1:651\n209#1:652\n209#1:653,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Stateful$12 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $loyaltyCard;
    final /* synthetic */ C11300l<String, C11079d2> $onResetSecretCode;
    final /* synthetic */ C8578k2<C26141a> $secretCodeState$delegate;
    final /* synthetic */ CheckoutStep3ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$12(CheckoutStep3ViewModel checkoutStep3ViewModel, C11300l<? super String, C11079d2> lVar, String str, int i, C8578k2<C26141a> k2Var) {
        super(2);
        this.$viewModel = checkoutStep3ViewModel;
        this.$onResetSecretCode = lVar;
        this.$loyaltyCard = str;
        this.$$dirty = i;
        this.$secretCodeState$delegate = k2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r7, int r8) {
        /*
            r6 = this;
            r0 = r8 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0010
            boolean r0 = r7.mo15011p()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r7.mo14958a0()
            goto L_0x006a
        L_0x0010:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3Stateful.<anonymous> (CheckoutStep3Screen.kt:204)"
            r2 = -188532510(0xfffffffff4c338e2, float:-1.2373677E32)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r8, r0, r1)
        L_0x001f:
            androidx.compose.runtime.k2<com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a> r8 = r6.$secretCodeState$delegate
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r0 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.CheckoutStep3ScreenKt.m104421m(r8)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$1 r1 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$1
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = r6.$viewModel
            r1.<init>(r8)
            kotlin.jvm.functions.l<java.lang.String, kotlin.d2> r8 = r6.$onResetSecretCode
            java.lang.String r2 = r6.$loyaltyCard
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo14918M(r3)
            boolean r3 = r7.mo15006n0(r8)
            boolean r4 = r7.mo15006n0(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r7.mo14921N()
            if (r3 != 0) goto L_0x004d
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0055
        L_0x004d:
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$2$1 r4 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$2$1
            r4.<init>(r8, r2)
            r7.mo14893C(r4)
        L_0x0055:
            r7.mo15002m0()
            r2 = r4
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r4 = 0
            r5 = 0
            r3 = r7
            com.carrefour.fid.android.presentation.p035ui.checkout.common.SecretCodeVerificationKt.m104650a(r0, r1, r2, r3, r4, r5)
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x006a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12.invoke(androidx.compose.runtime.o, int):void");
    }
}
