package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo22516d2 = {"", "text", "Lkotlin/Function1;", "Lkotlin/d2;", "onTextChange", "Lkotlin/Function0;", "onClearInput", "onConfirm", "SearchComponent", "(Ljava/lang/String;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/a;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/o;I)V", "SearchComponentPreview", "(Landroidx/compose/runtime/o;I)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSearchComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchComponent.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/SearchComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,86:1\n154#2:87\n154#2:88\n75#3,6:89\n81#3:121\n85#3:134\n75#4:95\n76#4,11:97\n89#4:133\n76#5:96\n460#6,13:108\n50#6:122\n49#6:123\n473#6,3:130\n1114#7,6:124\n*S KotlinDebug\n*F\n+ 1 SearchComponent.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/SearchComponentKt\n*L\n42#1:87\n43#1:88\n40#1:89,6\n40#1:121\n40#1:134\n40#1:95\n40#1:97,11\n40#1:133\n40#1:96\n40#1:108,13\n73#1:122\n73#1:123\n40#1:130,3\n73#1:124,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt */
public final class SearchComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SearchComponent(@org.jetbrains.annotations.C12579k java.lang.String r65, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r66, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r67, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r68, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r69, int r70) {
        /*
            r12 = r65
            r2 = r66
            r1 = r67
            r0 = r68
            r15 = r70
            java.lang.String r3 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            java.lang.String r3 = "onTextChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "onClearInput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "onConfirm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 1465140695(0x575445d7, float:2.33396425E14)
            r4 = r69
            androidx.compose.runtime.o r14 = r4.mo15009o(r3)
            r4 = r15 & 14
            if (r4 != 0) goto L_0x0036
            boolean r4 = r14.mo15006n0(r12)
            if (r4 == 0) goto L_0x0033
            r4 = 4
            goto L_0x0034
        L_0x0033:
            r4 = 2
        L_0x0034:
            r4 = r4 | r15
            goto L_0x0037
        L_0x0036:
            r4 = r15
        L_0x0037:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            boolean r5 = r14.mo14927P(r2)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r4 = r4 | r5
        L_0x0047:
            r5 = r15 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0057
            boolean r5 = r14.mo14927P(r1)
            if (r5 == 0) goto L_0x0054
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r4 = r4 | r5
        L_0x0057:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0067
            boolean r5 = r14.mo14927P(r0)
            if (r5 == 0) goto L_0x0064
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0066
        L_0x0064:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0066:
            r4 = r4 | r5
        L_0x0067:
            r11 = r4
            r4 = r11 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x007c
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x0075
            goto L_0x007c
        L_0x0075:
            r14.mo14958a0()
            r24 = r14
            goto L_0x0253
        L_0x007c:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0088
            r4 = -1
            java.lang.String r5 = "com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponent (SearchComponent.kt:33)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r11, r4, r5)
        L_0x0088:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 8
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.C2694o.m12166h(r4)
            androidx.compose.ui.m r4 = androidx.compose.p004ui.draw.C8744d.m32514a(r3, r4)
            r5 = 52
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r5)
            r5 = 0
            r9 = 1
            r6 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r5, r9, r6)
            androidx.compose.ui.graphics.j2$a r4 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r17 = r4.mo42852w()
            r19 = 0
            r20 = 2
            r21 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.BackgroundKt.m8825d(r16, r17, r19, r20, r21)
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r8 = r8.mo17070q()
            r10 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r10)
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r10 = r10.mo7630p()
            r13 = 48
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.RowKt.m10071d(r10, r8, r14, r13)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r14.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r14.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r16.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r9 = r14.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x010c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x010c:
            r14.mo14938T()
            boolean r9 = r14.mo14997l()
            if (r9 == 0) goto L_0x0119
            r14.mo14947W(r6)
            goto L_0x011c
        L_0x0119:
            r14.mo14888A()
        L_0x011c:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r9 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r8, r9)
            kotlin.jvm.functions.p r8 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r8)
            kotlin.jvm.functions.p r8 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r13, r8)
            kotlin.jvm.functions.p r8 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r8)
            r14.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.invoke(r5, r14, r6)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r5)
            androidx.compose.foundation.layout.RowScopeInstance r5 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r5 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.m r64 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r6, r7, r5)
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f7961a
            r17 = 0
            r19 = 0
            long r21 = r4.mo42850s()
            r23 = 0
            r25 = 0
            long r27 = r4.mo42850s()
            long r29 = r4.mo42850s()
            long r31 = r4.mo42850s()
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 14352768(0xdb0180, float:2.0112512E-38)
            r61 = 0
            r62 = 48
            r63 = 2096923(0x1fff1b, float:2.938415E-39)
            r59 = r14
            androidx.compose.material.s1 r19 = r16.mo10639o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            androidx.compose.foundation.text.m r20 = new androidx.compose.foundation.text.m
            r4 = 0
            r5 = 0
            r6 = 0
            androidx.compose.ui.text.input.p$a r3 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r7 = r3.mo47285m()
            r8 = 7
            r9 = 0
            r3 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r3)
            boolean r3 = r14.mo15006n0(r0)
            boolean r4 = r14.mo15006n0(r12)
            r3 = r3 | r4
            java.lang.Object r4 = r14.mo14921N()
            if (r3 != 0) goto L_0x01dc
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x01e4
        L_0x01dc:
            com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$1$1$1 r4 = new com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$1$1$1
            r4.<init>(r0, r12)
            r14.mo14893C(r4)
        L_0x01e4:
            r14.mo15002m0()
            r26 = r4
            kotlin.jvm.functions.l r26 = (kotlin.jvm.functions.C11300l) r26
            r27 = 0
            r28 = 47
            r29 = 0
            androidx.compose.foundation.text.k r21 = new androidx.compose.foundation.text.k
            r13 = r21
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.service.presentation.ui.drive.map.component.ComposableSingletons$SearchComponentKt r7 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.ComposableSingletons$SearchComponentKt.INSTANCE
            kotlin.jvm.functions.p r7 = r7.m172908getLambda1$service_release()
            r8 = 0
            com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$1$2 r9 = new com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$1$2
            r9.<init>(r12, r1)
            r10 = -1888922636(0xffffffff8f6953f4, float:-1.1503956E-29)
            r3 = 1
            androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r10, r3, r9)
            r10 = 0
            r3 = 0
            r21 = r11
            r11 = r3
            r3 = 0
            r24 = r14
            r14 = r3
            r15 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r3 = 817889664(0x30c00180, float:1.3970265E-9)
            r22 = r21 & 14
            r3 = r22 | r3
            r21 = r21 & 112(0x70, float:1.57E-43)
            r21 = r3 | r21
            r22 = 384(0x180, float:5.38E-43)
            r23 = 511352(0x7cd78, float:7.16557E-40)
            r0 = r65
            r1 = r66
            r2 = r64
            r12 = r20
            r20 = r24
            r3 = 0
            androidx.compose.material.TextFieldKt.m14151c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r24.mo15002m0()
            r24.mo14896D()
            r24.mo15002m0()
            r24.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0253
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0253:
            androidx.compose.runtime.t1 r6 = r24.mo15020s()
            if (r6 != 0) goto L_0x025a
            goto L_0x026d
        L_0x025a:
            com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$2 r7 = new com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$2
            r0 = r7
            r1 = r65
            r2 = r66
            r3 = r67
            r4 = r68
            r5 = r70
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.SearchComponentKt.SearchComponent(java.lang.String, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchComponentPreview(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-834440184);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-834440184, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentPreview (SearchComponent.kt:79)");
            }
            ThemeKt.m153788a(ComposableSingletons$SearchComponentKt.INSTANCE.m172909getLambda2$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SearchComponentKt$SearchComponentPreview$1(i));
        }
    }
}
