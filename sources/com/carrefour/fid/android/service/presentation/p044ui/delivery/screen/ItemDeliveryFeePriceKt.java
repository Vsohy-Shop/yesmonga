package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, mo22516d2 = {"Landroidx/compose/ui/m;", "modifier", "", "label", "", "feePrice", "Lkotlin/d2;", "ItemDeliveryFeePrice", "(Landroidx/compose/ui/m;Ljava/lang/String;DLandroidx/compose/runtime/o;II)V", "ItemDeliveryFeePricePreview", "(Landroidx/compose/runtime/o;I)V", "ItemDeliveryFeePriceFreePreview", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nItemDeliveryFeePrice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemDeliveryFeePrice.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/ItemDeliveryFeePriceKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,107:1\n73#2,4:108\n77#2,20:119\n25#3:112\n955#4,6:113\n*S KotlinDebug\n*F\n+ 1 ItemDeliveryFeePrice.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/ItemDeliveryFeePriceKt\n*L\n29#1:108,4\n29#1:119,20\n29#1:112\n29#1:113,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt */
public final class ItemDeliveryFeePriceKt {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ItemDeliveryFeePrice(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r18, @org.jetbrains.annotations.C12579k java.lang.String r19, double r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r8 = r19
            r9 = r23
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1032575688(0x3d8bdac8, float:0.068288386)
            r1 = r22
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r24 & 1
            r2 = 2
            if (r1 == 0) goto L_0x001d
            r3 = r9 | 6
            r4 = r3
            r3 = r18
            goto L_0x0031
        L_0x001d:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002e
            r3 = r18
            boolean r4 = r10.mo15006n0(r3)
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = r2
        L_0x002c:
            r4 = r4 | r9
            goto L_0x0031
        L_0x002e:
            r3 = r18
            r4 = r9
        L_0x0031:
            r5 = r24 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0048
        L_0x0038:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0048
            boolean r5 = r10.mo15006n0(r8)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0045:
            r5 = 16
        L_0x0047:
            r4 = r4 | r5
        L_0x0048:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x004f:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0062
            r6 = r20
            boolean r11 = r10.mo14993k(r6)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r11
            goto L_0x0064
        L_0x0062:
            r6 = r20
        L_0x0064:
            r11 = r4
            r4 = r11 & 731(0x2db, float:1.024E-42)
            r12 = 146(0x92, float:2.05E-43)
            if (r4 != r12) goto L_0x0079
            boolean r4 = r10.mo15011p()
            if (r4 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r10.mo14958a0()
            r1 = r3
            r3 = r6
            goto L_0x014c
        L_0x0079:
            if (r1 == 0) goto L_0x007f
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r1
            goto L_0x0080
        L_0x007f:
            r12 = r3
        L_0x0080:
            if (r5 == 0) goto L_0x0086
            r3 = 0
            r13 = r3
            goto L_0x0087
        L_0x0086:
            r13 = r6
        L_0x0087:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0093
            r1 = -1
            java.lang.String r3 = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePrice (ItemDeliveryFeePrice.kt:26)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r1, r3)
        L_0x0093:
            r0 = 0
            r15 = 1
            r7 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r12, r0, r15, r7)
            r1 = -270267587(0xffffffffefe40b3d, float:-1.4115234E29)
            r10.mo14918M(r1)
            r1 = 257(0x101, float:3.6E-43)
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.mo14918M(r3)
            java.lang.Object r4 = r10.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r5.mo16277a()
            if (r4 != r6) goto L_0x00bc
            androidx.constraintlayout.compose.Measurer r4 = new androidx.constraintlayout.compose.Measurer
            r4.<init>()
            r10.mo14893C(r4)
        L_0x00bc:
            r10.mo15002m0()
            r6 = r4
            androidx.constraintlayout.compose.Measurer r6 = (androidx.constraintlayout.compose.Measurer) r6
            r10.mo14918M(r3)
            java.lang.Object r4 = r10.mo14921N()
            java.lang.Object r15 = r5.mo16277a()
            if (r4 != r15) goto L_0x00d7
            androidx.constraintlayout.compose.ConstraintLayoutScope r4 = new androidx.constraintlayout.compose.ConstraintLayoutScope
            r4.<init>()
            r10.mo14893C(r4)
        L_0x00d7:
            r10.mo15002m0()
            r15 = r4
            androidx.constraintlayout.compose.ConstraintLayoutScope r15 = (androidx.constraintlayout.compose.ConstraintLayoutScope) r15
            r10.mo14918M(r3)
            java.lang.Object r3 = r10.mo14921N()
            java.lang.Object r4 = r5.mo16277a()
            if (r3 != r4) goto L_0x00f3
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r7, r2, r7)
            r10.mo14893C(r3)
        L_0x00f3:
            r10.mo15002m0()
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            r16 = 4544(0x11c0, float:6.368E-42)
            r2 = r15
            r4 = r6
            r5 = r10
            r7 = r6
            r6 = r16
            kotlin.Pair r1 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75199E(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r1.mo21846a()
            r16 = r2
            androidx.compose.ui.layout.f0 r16 = (androidx.compose.p004ui.layout.C15560f0) r16
            java.lang.Object r1 = r1.mo21847b()
            r3 = r1
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$$inlined$ConstraintLayout$1 r1 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$$inlined$ConstraintLayout$1
            r1.<init>(r7)
            r2 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.m r17 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r0, r2, r1, r5, r4)
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$$inlined$ConstraintLayout$2 r6 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$$inlined$ConstraintLayout$2
            r0 = r6
            r1 = r15
            r4 = r19
            r5 = r11
            r11 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -819894182(0xffffffffcf21685a, float:-2.70797056E9)
            r1 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r0, r1, r11)
            r5 = 48
            r6 = 0
            r1 = r17
            r3 = r16
            r4 = r10
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r1, r2, r3, r4, r5, r6)
            r10.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x014a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x014a:
            r1 = r12
            r3 = r13
        L_0x014c:
            androidx.compose.runtime.t1 r7 = r10.mo15020s()
            if (r7 != 0) goto L_0x0153
            goto L_0x0162
        L_0x0153:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$2 r10 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$2
            r0 = r10
            r2 = r19
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r5, r6)
            r7.mo15202a(r10)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.ItemDeliveryFeePriceKt.ItemDeliveryFeePrice(androidx.compose.ui.m, java.lang.String, double, androidx.compose.runtime.o, int, int):void");
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void ItemDeliveryFeePriceFreePreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-843487355);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-843487355, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceFreePreview (ItemDeliveryFeePrice.kt:98)");
            }
            ThemeKt.m153788a(ComposableSingletons$ItemDeliveryFeePriceKt.INSTANCE.m172899getLambda2$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemDeliveryFeePriceKt$ItemDeliveryFeePriceFreePreview$1(i));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void ItemDeliveryFeePricePreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-67178247);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-67178247, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePricePreview (ItemDeliveryFeePrice.kt:87)");
            }
            ThemeKt.m153788a(ComposableSingletons$ItemDeliveryFeePriceKt.INSTANCE.m172898getLambda1$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemDeliveryFeePriceKt$ItemDeliveryFeePricePreview$1(i));
        }
    }
}
