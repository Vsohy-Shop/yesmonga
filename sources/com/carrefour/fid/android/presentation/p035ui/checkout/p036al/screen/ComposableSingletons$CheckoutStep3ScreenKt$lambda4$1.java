package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep3Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,650:1\n25#2:651\n25#2:658\n25#2:665\n36#2:672\n36#2:679\n1114#3,6:652\n1114#3,6:659\n1114#3,6:666\n1114#3,6:673\n1114#3,6:680\n76#4:686\n102#4,2:687\n76#4:689\n76#4:690\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1\n*L\n585#1:651\n610#1:658\n623#1:665\n638#1:672\n639#1:679\n585#1:652,6\n610#1:659,6\n623#1:666,6\n638#1:673,6\n639#1:680,6\n585#1:686\n585#1:687,2\n610#1:689\n623#1:690\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1  reason: invalid class name */
public final class ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1 f59253f = new ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1();

    public ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1() {
        super(2);
    }

    /* renamed from: b */
    public static final PaymentType m104449b(C8700z0<PaymentType> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: c */
    public static final void m104450c(C8700z0<PaymentType> z0Var, PaymentType paymentType) {
        z0Var.setValue(paymentType);
    }

    /* renamed from: d */
    public static final C26132a m104451d(C8700z0<C26132a> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: e */
    public static final C28892e.C28895c<String> m104452e(C8700z0<C28892e.C28895c<String>> z0Var) {
        return z0Var.getValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r63, int r64) {
        /*
            r62 = this;
            r9 = r63
            r0 = r64
            r1 = r0 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0015
            boolean r1 = r63.mo15011p()
            if (r1 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r63.mo14958a0()
            goto L_0x019a
        L_0x0015:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0024
            r1 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt.lambda-4.<anonymous> (CheckoutStep3Screen.kt:583)"
            r4 = -1954092360(0xffffffff8b86eab8, float:-5.196809E-32)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r0, r1, r3)
        L_0x0024:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r0)
            java.lang.Object r1 = r63.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            r5 = 0
            if (r1 != r4) goto L_0x0040
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType r1 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType.Online
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r1, r5, r2, r5)
            r9.mo14893C(r1)
        L_0x0040:
            r63.mo15002m0()
            androidx.compose.runtime.z0 r1 = (androidx.compose.runtime.C8700z0) r1
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r10 = new com.carrefour.fid.android.domain.models.basket.BasketAmounts
            r41 = r10
            r11 = 0
            r12 = 4615063718147915776(0x400c000000000000, double:3.5)
            r14 = 4622382067542392832(0x4026000000000000, double:11.0)
            r16 = 4602498675187552092(0x3fdf5c28f5c28f5c, double:0.49)
            r18 = 4621875412584313651(0x4024333333333333, double:10.1)
            r20 = 4622945017495814144(0x4028000000000000, double:12.0)
            r22 = 4613937818241073152(0x4008000000000000, double:3.0)
            r24 = 4620693217682128896(0x4020000000000000, double:8.0)
            r26 = 4621875412584313651(0x4024333333333333, double:10.1)
            r28 = 4624070917402656768(0x402c000000000000, double:14.0)
            r30 = 4639988679179365253(0x40648d1eb851eb85, double:164.41)
            r32 = 4622832427505129882(0x402799999999999a, double:11.8)
            r34 = 4621819117588971520(0x4024000000000000, double:10.0)
            r36 = 4612451630364040888(0x4002b851eb851eb8, double:2.34)
            r38 = 1
            r39 = 0
            r10.<init>(r11, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r39)
            com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r4 = new com.carrefour.fid.android.domain.models.basket.BasketPromotionCode
            r50 = r4
            r6 = 4617315517961601024(0x4014000000000000, double:5.0)
            java.lang.String r8 = "NOEL10"
            r4.<init>(r6, r8)
            com.carrefour.fid.android.domain.models.basket.Basket r6 = new com.carrefour.fid.android.domain.models.basket.Basket
            r40 = r6
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 3
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 523518(0x7fcfe, float:7.33605E-40)
            r61 = 0
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r9.mo14918M(r0)
            java.lang.Object r4 = r63.mo14921N()
            java.lang.Object r7 = r3.mo16277a()
            if (r4 != r7) goto L_0x00e1
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r4 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a
            r11 = 1
            java.lang.String r12 = "qsfgq"
            r13 = 4631530004285489152(0x4046800000000000, double:45.0)
            r15 = 4623113902481840538(0x402899999999999a, double:12.3)
            r17 = 0
            r18 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r15, r17, r18)
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r5, r2, r5)
            r9.mo14893C(r4)
        L_0x00e1:
            r63.mo15002m0()
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            r9.mo14918M(r0)
            java.lang.Object r0 = r63.mo14921N()
            java.lang.Object r7 = r3.mo16277a()
            if (r0 != r7) goto L_0x0101
            com.carrefour.fid.android.shared.type.e$c r0 = new com.carrefour.fid.android.shared.type.e$c
            java.lang.String r7 = "NOEL23"
            r0.<init>(r7)
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r5, r2, r5)
            r9.mo14893C(r0)
        L_0x0101:
            r63.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            r2 = 3
            r7 = 0
            androidx.compose.material.d1 r2 = androidx.compose.material.ScaffoldKt.m13752f(r5, r5, r9, r7, r2)
            com.carrefour.fid.android.design.components.compose.Variant r5 = com.carrefour.fid.android.design.components.compose.Variant.Success
            r8 = 1
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType r18 = m104449b(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r4 = m104451d(r4)
            java.lang.String r21 = "Cannes La Bocca"
            com.carrefour.fid.android.shared.type.e$c r22 = m104452e(r0)
            r23 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r9.mo14918M(r0)
            boolean r10 = r9.mo15006n0(r1)
            java.lang.Object r11 = r63.mo14921N()
            if (r10 != 0) goto L_0x0135
            java.lang.Object r10 = r3.mo16277a()
            if (r11 != r10) goto L_0x013d
        L_0x0135:
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$1$1 r11 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$1$1
            r11.<init>(r1)
            r9.mo14893C(r11)
        L_0x013d:
            r63.mo15002m0()
            r24 = r11
            kotlin.jvm.functions.a r24 = (kotlin.jvm.functions.C11289a) r24
            r9.mo14918M(r0)
            boolean r0 = r9.mo15006n0(r1)
            java.lang.Object r10 = r63.mo14921N()
            if (r0 != 0) goto L_0x0157
            java.lang.Object r0 = r3.mo16277a()
            if (r10 != r0) goto L_0x015f
        L_0x0157:
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$2$1 r10 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$2$1
            r10.<init>(r1)
            r9.mo14893C(r10)
        L_0x015f:
            r63.mo15002m0()
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$3 r11 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234243.f59254f
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$4 r12 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234254.f59255f
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$5 r13 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234265.f59256f
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$6 r14 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234276.f59257f
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$7 r15 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234287.f59258f
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$8 r16 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234298.f59259f
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda-4$1$9 r17 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.C234309.f59260f
            int r0 = com.carrefour.fid.android.shared.type.C28892e.C28895c.f70783c
            r0 = r0 | r7
            int r0 = r0 << 21
            r1 = 102957488(0x62301b0, float:3.0658132E-35)
            r19 = r0 | r1
            r20 = 14380464(0xdb6db0, float:2.0151322E-38)
            r0 = r2
            r1 = r5
            r2 = r8
            r3 = r18
            r5 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r18 = r63
            com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.CheckoutStep3ScreenKt.m104409a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x019a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt$lambda4$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
