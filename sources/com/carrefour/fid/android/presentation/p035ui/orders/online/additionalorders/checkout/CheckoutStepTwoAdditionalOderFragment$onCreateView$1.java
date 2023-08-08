package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.window.C16541b;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.SecretCodeVerificationKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStepTwoAdditionalOderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepTwoAdditionalOderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderFragment$onCreateView$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,676:1\n76#2:677\n*S KotlinDebug\n*F\n+ 1 CheckoutStepTwoAdditionalOderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderFragment$onCreateView$1\n*L\n99#1:677\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderFragment$onCreateView$1 */
public final class CheckoutStepTwoAdditionalOderFragment$onCreateView$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutStepTwoAdditionalOderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepTwoAdditionalOderFragment$onCreateView$1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment) {
        super(2);
        this.this$0 = checkoutStepTwoAdditionalOderFragment;
    }

    /* renamed from: b */
    public static final C26141a m108688b(C8578k2<C26141a> k2Var) {
        return k2Var.getValue();
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
                ComposerKt.m29845w0(-1323110116, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderFragment.onCreateView.<anonymous> (CheckoutStepTwoAdditionalOderFragment.kt:96)");
            }
            final C8578k2<C26141a> b = C8415c2.m30233b(this.this$0.mo72938l1().mo77860F0(), (CoroutineContext) null, oVar, 8, 1);
            final CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1220257247, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(1220257247, i2, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderFragment.onCreateView.<anonymous>.<anonymous> (CheckoutStepTwoAdditionalOderFragment.kt:99)");
                        }
                        if (((Boolean) checkoutStepTwoAdditionalOderFragment.f61876v.getValue()).booleanValue()) {
                            final CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment = checkoutStepTwoAdditionalOderFragment;
                            C250821 r2 = new C11289a<C11079d2>() {
                                public final void invoke() {
                                    checkoutStepTwoAdditionalOderFragment.f61876v.setValue(Boolean.FALSE);
                                    checkoutStepTwoAdditionalOderFragment.mo72938l1().mo77862I0();
                                }
                            };
                            C11304p<C8592o, Integer, C11079d2> a = ComposableSingletons$CheckoutStepTwoAdditionalOderFragmentKt.f61902a.mo72987a();
                            final C8578k2<C26141a> k2Var = b;
                            final CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment2 = checkoutStepTwoAdditionalOderFragment;
                            C8592o oVar2 = oVar;
                            AndroidAlertDialog_androidKt.m13201b(r2, a, (C8767m) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(oVar2, -396058001, true, new C11304p<C8592o, Integer, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((C8592o) obj, ((Number) obj2).intValue());
                                    return C11079d2.f28267a;
                                }

                                @C8540g
                                @C8570j(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(@C12580l C8592o oVar, int i) {
                                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                                        if (ComposerKt.m29813g0()) {
                                            ComposerKt.m29845w0(-396058001, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CheckoutStepTwoAdditionalOderFragment.kt:106)");
                                        }
                                        C26141a a = CheckoutStepTwoAdditionalOderFragment$onCreateView$1.m108688b(k2Var);
                                        final CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment = checkoutStepTwoAdditionalOderFragment2;
                                        C250841 r1 = new C11300l<String, C11079d2>() {
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((String) obj);
                                                return C11079d2.f28267a;
                                            }

                                            public final void invoke(@C12579k String str) {
                                                Intrinsics.checkNotNullParameter(str, "it");
                                                checkoutStepTwoAdditionalOderFragment.mo72938l1().mo77873v0(str);
                                            }
                                        };
                                        final CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment2 = checkoutStepTwoAdditionalOderFragment2;
                                        SecretCodeVerificationKt.m104650a(a, r1, new C11289a<C11079d2>() {
                                            public final void invoke() {
                                                checkoutStepTwoAdditionalOderFragment2.mo72938l1().mo77866M0();
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
                            }), (C15218g4) null, 0, 0, (C16541b) null, oVar2, 24624, 492);
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
