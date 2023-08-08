package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDeliveryChoiceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryChoiceComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/DeliveryChoiceComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n73#2,7:117\n80#2:150\n84#2:155\n75#3:124\n76#3,11:126\n89#3:154\n76#4:125\n460#5,13:137\n473#5,3:151\n50#5:156\n49#5:157\n50#5:164\n49#5:165\n1114#6,6:158\n1114#6,6:166\n*S KotlinDebug\n*F\n+ 1 DeliveryChoiceComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/DeliveryChoiceComponentKt\n*L\n26#1:117,7\n26#1:150\n26#1:155\n26#1:124\n26#1:126,11\n26#1:154\n26#1:125\n26#1:137,13\n26#1:151,3\n78#1:156\n78#1:157\n79#1:164\n79#1:165\n78#1:158,6\n79#1:166,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt */
public final class DeliveryChoiceComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117173a(@C12580l C8767m mVar, @C12579k List<C27934i> list, @C12580l C11300l<? super C27934i, C11079d2> lVar, @C12580l C11300l<? super Boolean, C11079d2> lVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "deliveryChoices");
        C8592o o = oVar.mo15009o(-339467214);
        if ((i2 & 1) != 0) {
            mVar = C8767m.f23478j;
        }
        if ((i2 & 4) != 0) {
            lVar = DeliveryChoiceComponentKt$DeliveryChoiceComponent$1.f67698f;
        }
        if ((i2 & 8) != 0) {
            lVar2 = DeliveryChoiceComponentKt$DeliveryChoiceComponent$2.f67699f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-339467214, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponent (DeliveryChoiceComponent.kt:19)");
        }
        o.mo14918M(-483455358);
        C8767m.C8768a aVar = C8767m.f23478j;
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        o.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        o.mo14918M(-1003617973);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            m117175c(mVar, list.get(i3), lVar, lVar2, o, (i & 14) | (i & 896) | (i & 7168), 0);
        }
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliveryChoiceComponentKt$DeliveryChoiceComponent$4(mVar, list, lVar, lVar2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m117174b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(929577239);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(929577239, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentPreview (DeliveryChoiceComponent.kt:86)");
            }
            ThemeKt.m153788a(ComposableSingletons$DeliveryChoiceComponentKt.f67597a.mo81162b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliveryChoiceComponentKt$DeliveryChoiceComponentPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117175c(androidx.compose.p004ui.C8767m r19, com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i r20, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i, kotlin.C11079d2> r21, kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r22, androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r12 = r19
            r13 = r20
            r14 = r24
            r0 = 419474965(0x1900ae15, float:6.6526005E-24)
            r1 = r23
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r14 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0025
            boolean r1 = r15.mo15006n0(r12)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r14
            goto L_0x0026
        L_0x0025:
            r1 = r14
        L_0x0026:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x002d
            r1 = r1 | 48
            goto L_0x003d
        L_0x002d:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003d
            boolean r2 = r15.mo15006n0(r13)
            if (r2 == 0) goto L_0x003a
            r2 = 32
            goto L_0x003c
        L_0x003a:
            r2 = 16
        L_0x003c:
            r1 = r1 | r2
        L_0x003d:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0044:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0057
            r3 = r21
            boolean r4 = r15.mo14927P(r3)
            if (r4 == 0) goto L_0x0053
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r1 = r1 | r4
            goto L_0x0059
        L_0x0057:
            r3 = r21
        L_0x0059:
            r4 = r25 & 8
            if (r4 == 0) goto L_0x0060
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0060:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0073
            r5 = r22
            boolean r6 = r15.mo14927P(r5)
            if (r6 == 0) goto L_0x006f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r1 = r1 | r6
            goto L_0x0075
        L_0x0073:
            r5 = r22
        L_0x0075:
            r6 = r1 & 5851(0x16db, float:8.199E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0088
            boolean r6 = r15.mo15011p()
            if (r6 != 0) goto L_0x0082
            goto L_0x0088
        L_0x0082:
            r15.mo14958a0()
            r4 = r5
            goto L_0x0162
        L_0x0088:
            if (r2 == 0) goto L_0x008e
            com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$1 r2 = com.carrefour.fid.android.product.presentation.p039ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$1.f67700f
            r11 = r2
            goto L_0x008f
        L_0x008e:
            r11 = r3
        L_0x008f:
            if (r4 == 0) goto L_0x0095
            com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$2 r2 = com.carrefour.fid.android.product.presentation.p039ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$2.f67701f
            r10 = r2
            goto L_0x0096
        L_0x0095:
            r10 = r5
        L_0x0096:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00a2
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.product.presentation.ui.details.views.ServiceSetComponentFactory (DeliveryChoiceComponent.kt:56)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00a2:
            boolean r0 = r20.mo81354p()
            if (r0 == 0) goto L_0x00ce
            r0 = 1662468566(0x631741d6, float:2.7902023E21)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_unavailable
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r20.mo81352n()
            r4 = 0
            r2[r4] = r3
            r3 = 64
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71859e(r0, r2, r15, r3)
            r1 = r1 & 14
            com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt.m151623e(r12, r0, r15, r1, r4)
            r15.mo15002m0()
            r18 = r10
            r16 = r11
            goto L_0x0155
        L_0x00ce:
            r0 = 1662468772(0x631742a4, float:2.7902603E21)
            r15.mo14918M(r0)
            boolean r3 = r20.mo81349k()
            boolean r2 = r20.mo81356r()
            java.lang.String r0 = r20.mo81352n()
            java.lang.String r4 = r20.mo81351m()
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r5 = r5.mo114257y()
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo14918M(r7)
            boolean r8 = r15.mo15006n0(r11)
            boolean r9 = r15.mo15006n0(r13)
            r8 = r8 | r9
            java.lang.Object r9 = r15.mo14921N()
            if (r8 != 0) goto L_0x0107
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x010f
        L_0x0107:
            com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$3$1 r9 = new com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$3$1
            r9.<init>(r11, r13)
            r15.mo14893C(r9)
        L_0x010f:
            r15.mo15002m0()
            r8 = r9
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            r15.mo14918M(r7)
            boolean r7 = r15.mo15006n0(r10)
            boolean r9 = r15.mo15006n0(r13)
            r7 = r7 | r9
            java.lang.Object r9 = r15.mo14921N()
            if (r7 != 0) goto L_0x012f
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r9 != r7) goto L_0x0137
        L_0x012f:
            com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$4$1 r9 = new com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$4$1
            r9.<init>(r10, r13)
            r15.mo14893C(r9)
        L_0x0137:
            r15.mo15002m0()
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            int r1 = r1 << 3
            r16 = r1 & 112(0x70, float:1.57E-43)
            r17 = 0
            r1 = r19
            r7 = r8
            r8 = r9
            r9 = r15
            r18 = r10
            r10 = r16
            r16 = r11
            r11 = r17
            com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt.m151619a(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r15.mo15002m0()
        L_0x0155:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x015e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x015e:
            r3 = r16
            r4 = r18
        L_0x0162:
            androidx.compose.runtime.t1 r7 = r15.mo15020s()
            if (r7 != 0) goto L_0x0169
            goto L_0x017a
        L_0x0169:
            com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$5 r8 = new com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$5
            r0 = r8
            r1 = r19
            r2 = r20
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.DeliveryChoiceComponentKt.m117175c(androidx.compose.ui.m, com.carrefour.fid.android.product.presentation.ui.details.views.i, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }
}
