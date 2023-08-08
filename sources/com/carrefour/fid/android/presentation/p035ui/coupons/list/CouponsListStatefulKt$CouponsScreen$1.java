package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCouponsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsScreen$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,661:1\n36#2:662\n1114#3,6:663\n*S KotlinDebug\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsScreen$1\n*L\n229#1:662\n229#1:663,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1 */
public final class CouponsListStatefulKt$CouponsScreen$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37643a> $couponContentState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsScreen$1(C11300l<? super C23843c, C11079d2> lVar, int i, C28892e<C37643a> eVar) {
        super(2);
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$couponContentState = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r12 = r17
            r1 = r18
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r17.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r17.mo14958a0()
            goto L_0x0092
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsScreen.<anonymous> (CouponsListStateful.kt:224)"
            r4 = 741694320(0x2c355b70, float:2.5772405E-12)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            r1 = 2131952501(0x7f130375, float:1.9541447E38)
            r2 = 0
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r12, r2)
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 2131951722(0x7f13006a, float:1.9539867E38)
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71858d(r10, r12, r2)
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r2 = r0.$actioner
            r11 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r11)
            boolean r11 = r12.mo15006n0(r2)
            java.lang.Object r13 = r17.mo14921N()
            if (r11 != 0) goto L_0x0056
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r13 != r11) goto L_0x005e
        L_0x0056:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1$1$1 r13 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1$1$1
            r13.<init>(r2)
            r12.mo14893C(r13)
        L_0x005e:
            r17.mo15002m0()
            r11 = r13
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1$2 r2 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1$2
            com.carrefour.fid.android.shared.type.e<com.carrefour.fid.android.domain.interactors.coupons.a> r13 = r0.$couponContentState
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r14 = r0.$actioner
            int r15 = r0.$$dirty
            r2.<init>(r13, r14, r15)
            r13 = -1379378813(0xffffffffadc85983, float:-2.2777119E-11)
            r14 = 1
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r13, r14, r2)
            r14 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = 30
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r13
            r12 = r17
            r13 = r14
            r14 = r15
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151503h(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0092
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
