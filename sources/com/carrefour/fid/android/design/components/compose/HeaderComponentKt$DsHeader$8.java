package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nHeaderComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt$DsHeader$8\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,607:1\n154#2:608\n36#3:609\n36#3:616\n36#3:623\n36#3:630\n36#3:637\n1114#4,6:610\n1114#4,6:617\n1114#4,6:624\n1114#4,6:631\n1114#4,6:638\n*S KotlinDebug\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt$DsHeader$8\n*L\n199#1:608\n206#1:609\n207#1:616\n208#1:623\n209#1:630\n210#1:637\n206#1:610,6\n207#1:617,6\n208#1:624,6\n209#1:631,6\n210#1:638,6\n*E\n"})
public final class HeaderComponentKt$DsHeader$8 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ String $initText;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarLongClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarScanClick;
    final /* synthetic */ C11300l<String, C11079d2> $onValidSearch;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ boolean $searchBarEnabled;
    final /* synthetic */ String $searchBarHint;
    final /* synthetic */ boolean $shouldFocusOnInit;
    final /* synthetic */ boolean $shouldShowScanIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$DsHeader$8(String str, String str2, boolean z, boolean z2, boolean z3, C11300l<? super String, C11079d2> lVar, int i, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i2) {
        super(2);
        this.$searchBarHint = str;
        this.$initText = str2;
        this.$searchBarEnabled = z;
        this.$shouldFocusOnInit = z2;
        this.$shouldShowScanIcon = z3;
        this.$onValueChange = lVar;
        this.$$dirty1 = i;
        this.$onValidSearch = lVar2;
        this.$onSearchBarClick = aVar;
        this.$onSearchBarLongClick = aVar2;
        this.$onSearchBarScanClick = aVar3;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r13 = r18
            r1 = r19
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r18.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r18.mo14958a0()
            goto L_0x013b
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.DsHeader.<anonymous> (HeaderComponent.kt:196)"
            r4 = -565824046(0xffffffffde4635d2, float:-3.57063817E18)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r7 = 0
            r1 = 16
            float r1 = (float) r1
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r9 = 0
            r10 = 11
            r11 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.design.components.compose.SearchBarVariant r2 = com.carrefour.fid.android.design.components.compose.SearchBarVariant.GREY
            java.lang.String r3 = r0.$searchBarHint
            java.lang.String r4 = r0.$initText
            boolean r5 = r0.$searchBarEnabled
            boolean r6 = r0.$shouldFocusOnInit
            boolean r7 = r0.$shouldShowScanIcon
            kotlin.jvm.functions.l<java.lang.String, kotlin.d2> r8 = r0.$onValueChange
            r9 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r9)
            boolean r10 = r13.mo15006n0(r8)
            java.lang.Object r11 = r18.mo14921N()
            if (r10 != 0) goto L_0x005f
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r11 != r10) goto L_0x0067
        L_0x005f:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$1$1 r11 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$1$1
            r11.<init>(r8)
            r13.mo14893C(r11)
        L_0x0067:
            r18.mo15002m0()
            r8 = r11
            kotlin.jvm.functions.l r8 = (kotlin.jvm.functions.C11300l) r8
            kotlin.jvm.functions.l<java.lang.String, kotlin.d2> r10 = r0.$onValidSearch
            r13.mo14918M(r9)
            boolean r11 = r13.mo15006n0(r10)
            java.lang.Object r12 = r18.mo14921N()
            if (r11 != 0) goto L_0x0084
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x008c
        L_0x0084:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$2$1 r12 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$2$1
            r12.<init>(r10)
            r13.mo14893C(r12)
        L_0x008c:
            r18.mo15002m0()
            r10 = r12
            kotlin.jvm.functions.l r10 = (kotlin.jvm.functions.C11300l) r10
            kotlin.jvm.functions.a<kotlin.d2> r11 = r0.$onSearchBarClick
            r13.mo14918M(r9)
            boolean r12 = r13.mo15006n0(r11)
            java.lang.Object r14 = r18.mo14921N()
            if (r12 != 0) goto L_0x00a9
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r14 != r12) goto L_0x00b1
        L_0x00a9:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$3$1 r14 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$3$1
            r14.<init>(r11)
            r13.mo14893C(r14)
        L_0x00b1:
            r18.mo15002m0()
            r11 = r14
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            kotlin.jvm.functions.a<kotlin.d2> r12 = r0.$onSearchBarLongClick
            r13.mo14918M(r9)
            boolean r14 = r13.mo15006n0(r12)
            java.lang.Object r15 = r18.mo14921N()
            if (r14 != 0) goto L_0x00ce
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r15 != r14) goto L_0x00d6
        L_0x00ce:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$4$1 r15 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$4$1
            r15.<init>(r12)
            r13.mo14893C(r15)
        L_0x00d6:
            r18.mo15002m0()
            r12 = r15
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            kotlin.jvm.functions.a<kotlin.d2> r14 = r0.$onSearchBarScanClick
            r13.mo14918M(r9)
            boolean r9 = r13.mo15006n0(r14)
            java.lang.Object r15 = r18.mo14921N()
            if (r9 != 0) goto L_0x00f3
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r15 != r9) goto L_0x00fb
        L_0x00f3:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$5$1 r15 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8$5$1
            r15.<init>(r14)
            r13.mo14893C(r15)
        L_0x00fb:
            r18.mo15002m0()
            r14 = r15
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            int r9 = r0.$$dirty
            int r9 = r9 >> 21
            r9 = r9 & 896(0x380, float:1.256E-42)
            r9 = r9 | 54
            int r15 = r0.$$dirty1
            int r0 = r15 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r9
            int r9 = r15 << 9
            r16 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r16
            r0 = r0 | r9
            int r9 = r15 << 9
            r16 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r16
            r0 = r0 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            int r15 = r15 << 9
            r9 = r9 & r15
            r0 = r0 | r9
            r15 = 0
            r16 = 0
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r13 = r18
            r14 = r0
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151597c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x013b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8.invoke(androidx.compose.runtime.o, int):void");
    }
}
