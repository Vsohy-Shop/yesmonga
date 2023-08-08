package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nProductDescription.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDescription.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductDescriptionKt$ProductDescription$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n67#2,3:104\n66#2:107\n1114#3,6:108\n*S KotlinDebug\n*F\n+ 1 ProductDescription.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductDescriptionKt$ProductDescription$2\n*L\n53#1:104,3\n53#1:107\n53#1:108,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescriptionKt$ProductDescription$2 */
public final class ProductDescriptionKt$ProductDescription$2 extends Lambda implements C11306r<C2373k, Boolean, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8700z0<Boolean> $shouldShowExpandButton$delegate;
    final /* synthetic */ String $text;
    final /* synthetic */ C8700z0<Integer> $textMaxLines$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDescriptionKt$ProductDescription$2(String str, C8700z0<Boolean> z0Var, C8700z0<Integer> z0Var2, int i) {
        super(4);
        this.$text = str;
        this.$shouldShowExpandButton$delegate = z0Var;
        this.$textMaxLines$delegate = z0Var2;
        this.$$dirty = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81290a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2373k r29, boolean r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            r14 = r31
            r2 = r32
            java.lang.String r3 = "$this$ExpandableComponent"
            r4 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0020
            boolean r3 = r14.mo14961b(r1)
            if (r3 == 0) goto L_0x001c
            r3 = 32
            goto L_0x001e
        L_0x001c:
            r3 = 16
        L_0x001e:
            r3 = r3 | r2
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            r3 = r3 & 721(0x2d1, float:1.01E-42)
            r4 = 144(0x90, float:2.02E-43)
            if (r3 != r4) goto L_0x0033
            boolean r3 = r31.mo15011p()
            if (r3 != 0) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            r31.mo14958a0()
            goto L_0x00cf
        L_0x0033:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0042
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescription.<anonymous> (ProductDescription.kt:43)"
            r5 = -361408936(0xffffffffea755658, float:-7.4148643E25)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x0042:
            com.carrefour.fid.android.product.presentation.ui.details.views.b r2 = new com.carrefour.fid.android.product.presentation.ui.details.views.b
            r2.<init>(r1)
            com.carrefour.fid.android.product.presentation.ui.details.views.a r1 = r2.mo81331a()
            int r16 = r1.mo81328f()
            androidx.compose.runtime.z0<java.lang.Integer> r2 = r0.$textMaxLines$delegate
            int r18 = com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductDescriptionKt.m117222e(r2)
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r2.mo11077c(r14, r3)
            androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r2)
            int r2 = com.carrefour.fid.android.product.C27609f.C27615f.ds_grey_10
            r3 = 0
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r14, r3)
            java.lang.String r2 = r0.$text
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r26 = 0
            r17 = 0
            r19 = 0
            androidx.compose.runtime.z0<java.lang.Boolean> r15 = r0.$shouldShowExpandButton$delegate
            androidx.compose.runtime.z0<java.lang.Integer> r13 = r0.$textMaxLines$delegate
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r14.mo14918M(r11)
            boolean r11 = r14.mo15006n0(r15)
            boolean r12 = r14.mo15006n0(r13)
            r11 = r11 | r12
            boolean r12 = r14.mo15006n0(r1)
            r11 = r11 | r12
            java.lang.Object r12 = r31.mo14921N()
            if (r11 != 0) goto L_0x009c
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x00a4
        L_0x009c:
            com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescriptionKt$ProductDescription$2$1$1 r12 = new com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescriptionKt$ProductDescription$2$1$1
            r12.<init>(r1, r15, r13)
            r14.mo14893C(r12)
        L_0x00a4:
            r31.mo15002m0()
            r20 = r12
            kotlin.jvm.functions.l r20 = (kotlin.jvm.functions.C11300l) r20
            int r1 = r0.$$dirty
            int r1 = r1 >> 3
            r23 = r1 & 14
            r24 = 0
            r25 = 22522(0x57fa, float:3.156E-41)
            r1 = r2
            r2 = r5
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = r26
            r22 = r31
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00cf
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductDescriptionKt$ProductDescription$2.mo81290a(androidx.compose.foundation.layout.k, boolean, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo81290a((C2373k) obj, ((Boolean) obj2).booleanValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
