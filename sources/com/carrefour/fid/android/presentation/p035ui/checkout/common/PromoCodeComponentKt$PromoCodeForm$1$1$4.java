package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPromoCodeComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoCodeComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/PromoCodeComponentKt$PromoCodeForm$1$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,259:1\n36#2:260\n1114#3,6:261\n*S KotlinDebug\n*F\n+ 1 PromoCodeComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/PromoCodeComponentKt$PromoCodeForm$1$1$4\n*L\n141#1:260\n141#1:261,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$4 */
public final class PromoCodeComponentKt$PromoCodeForm$1$1$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C8700z0<String> $couponCode$delegate;
    final /* synthetic */ String $currentCouponCode;
    final /* synthetic */ String $errorMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeForm$1$1$4(C8700z0<String> z0Var, String str, String str2) {
        super(2);
        this.$couponCode$delegate = z0Var;
        this.$currentCouponCode = str;
        this.$errorMessage = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
        /*
            r11 = this;
            r0 = r13 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0010
            boolean r0 = r12.mo15011p()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r12.mo14958a0()
            goto L_0x007d
        L_0x0010:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeForm.<anonymous>.<anonymous>.<anonymous> (PromoCodeComponent.kt:138)"
            r2 = -84277696(0xfffffffffafa0640, float:-6.491005E35)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r13, r0, r1)
        L_0x001f:
            androidx.compose.runtime.z0<java.lang.String> r13 = r11.$couponCode$delegate
            java.lang.String r13 = com.carrefour.fid.android.presentation.p035ui.checkout.common.PromoCodeComponentKt.m104637f(r13)
            int r13 = r13.length()
            r0 = 1
            if (r13 <= 0) goto L_0x002e
            r13 = r0
            goto L_0x002f
        L_0x002e:
            r13 = 0
        L_0x002f:
            if (r13 == 0) goto L_0x0074
            androidx.compose.runtime.z0<java.lang.String> r13 = r11.$couponCode$delegate
            r1 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r1)
            boolean r1 = r12.mo15006n0(r13)
            java.lang.Object r2 = r12.mo14921N()
            if (r1 != 0) goto L_0x004b
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0053
        L_0x004b:
            com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$4$1$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$4$1$1
            r2.<init>(r13)
            r12.mo14893C(r2)
        L_0x0053:
            r12.mo15002m0()
            r3 = r2
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r4 = 0
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$4$2 r13 = new com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$4$2
            java.lang.String r1 = r11.$currentCouponCode
            java.lang.String r2 = r11.$errorMessage
            r13.<init>(r1, r2)
            r1 = 1313847337(0x4e4fb829, float:8.7123821E8)
            androidx.compose.runtime.internal.a r7 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r1, r0, r13)
            r9 = 24576(0x6000, float:3.4438E-41)
            r10 = 14
            r8 = r12
            androidx.compose.material.IconButtonKt.m13536a(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0074:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$4.invoke(androidx.compose.runtime.o, int):void");
    }
}
