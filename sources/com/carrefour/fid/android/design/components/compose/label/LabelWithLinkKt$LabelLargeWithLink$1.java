package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLabelWithLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelWithLink.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelWithLinkKt$LabelLargeWithLink$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,142:1\n154#2:143\n36#3:144\n1114#4,6:145\n*S KotlinDebug\n*F\n+ 1 LabelWithLink.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelWithLinkKt$LabelLargeWithLink$1\n*L\n86#1:143\n92#1:144\n92#1:145,6\n*E\n"})
public final class LabelWithLinkKt$LabelLargeWithLink$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11289a<C11079d2> $onLinkClicked;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;
    final /* synthetic */ String $textLink;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelWithLinkKt$LabelLargeWithLink$1(long j, String str, int i, C11289a<C11079d2> aVar, String str2) {
        super(2);
        this.$textColor = j;
        this.$text = str;
        this.$$dirty = i;
        this.$onLinkClicked = aVar;
        this.$textLink = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r14 = r27
            r1 = r28
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r27.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r27.mo14958a0()
            goto L_0x00c3
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelLargeWithLink.<anonymous> (LabelWithLink.kt:82)"
            r4 = -873577882(0xffffffffcbee4266, float:-3.1229132E7)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            long r1 = r0.$textColor
            java.lang.String r3 = r0.$text
            int r4 = r0.$$dirty
            int r5 = r4 >> 3
            r5 = r5 & 14
            int r4 = r4 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151851x(r1, r3, r14, r4)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 6
            float r3 = (float) r2
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            r5 = r1
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r14, r2)
            androidx.compose.material.w1 r2 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153880G(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onLinkClicked
            r3 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r3)
            boolean r3 = r14.mo15006n0(r2)
            java.lang.Object r4 = r27.mo14921N()
            if (r3 != 0) goto L_0x0073
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x007b
        L_0x0073:
            com.carrefour.fid.android.design.components.compose.label.LabelWithLinkKt$LabelLargeWithLink$1$1$1 r4 = new com.carrefour.fid.android.design.components.compose.label.LabelWithLinkKt$LabelLargeWithLink$1$1$1
            r4.<init>(r2)
            r14.mo14893C(r4)
        L_0x007b:
            r27.mo15002m0()
            r9 = r4
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            r10 = 7
            r11 = 0
            r5 = r1
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8878e(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = r0.$textLink
            long r3 = r0.$textColor
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            int r5 = r0.$$dirty
            int r6 = r5 >> 9
            r6 = r6 & 14
            int r5 = r5 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r23 = r6 | r5
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r22 = r27
            r5 = 0
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00c3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelWithLinkKt$LabelLargeWithLink$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
