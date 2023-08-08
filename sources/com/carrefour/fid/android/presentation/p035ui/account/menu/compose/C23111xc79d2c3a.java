package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/e;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/e;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountHomeMenuList$1\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n344#2,7:424\n353#2,7:438\n363#2:453\n366#2,2:461\n371#2,14:472\n385#2:487\n379#2,10:489\n36#3:431\n50#3:445\n49#3:446\n36#3:454\n50#3:464\n49#3:465\n1114#4,6:432\n1114#4,6:447\n1114#4,6:455\n1114#4,6:466\n76#5:463\n154#6:486\n154#6:488\n*S KotlinDebug\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountHomeMenuList$1\n*L\n350#1:431\n359#1:445\n359#1:446\n363#1:454\n367#1:464\n367#1:465\n350#1:432,6\n359#1:447,6\n363#1:455,6\n367#1:466,6\n367#1:463\n384#1:486\n385#1:488\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$invoke$$inlined$itemsIndexed$default$3 */
public final class C23111xc79d2c3a extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ List $accountMenuListItem$inlined;
    final /* synthetic */ C11300l $actioner$inlined;
    final /* synthetic */ String $appVersionText$inlined;
    final /* synthetic */ C8700z0 $displayLogoutDialog$inlined;
    final /* synthetic */ boolean $displayUsabillaBanner$inlined;
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23111xc79d2c3a(List list, C11300l lVar, int i, C8700z0 z0Var, String str, List list2, boolean z) {
        super(4);
        this.$items = list;
        this.$actioner$inlined = lVar;
        this.$$dirty$inlined = i;
        this.$displayLogoutDialog$inlined = z0Var;
        this.$appVersionText$inlined = str;
        this.$accountMenuListItem$inlined = list2;
        this.$displayUsabillaBanner$inlined = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67839a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r24, int r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r13 = r26
            java.lang.String r3 = "$this$items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r27 & 14
            r14 = 2
            if (r3 != 0) goto L_0x001e
            boolean r1 = r13.mo15006n0(r1)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = r14
        L_0x001b:
            r1 = r27 | r1
            goto L_0x0020
        L_0x001e:
            r1 = r27
        L_0x0020:
            r3 = r27 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0030
            boolean r3 = r13.mo14976f(r2)
            if (r3 == 0) goto L_0x002d
            r3 = 32
            goto L_0x002f
        L_0x002d:
            r3 = 16
        L_0x002f:
            r1 = r1 | r3
        L_0x0030:
            r3 = r1 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0042
            boolean r3 = r26.mo15011p()
            if (r3 != 0) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            r26.mo14958a0()
            goto L_0x01fc
        L_0x0042:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0051
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)"
            r5 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r1, r3, r4)
        L_0x0051:
            java.util.List r1 = r0.$items
            java.lang.Object r1 = r1.get(r2)
            com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = (com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem) r1
            int[] r3 = com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1.C23113a.$EnumSwitchMapping$0
            int r4 = r1.ordinal()
            r3 = r3[r4]
            r4 = 1157296644(0x44faf204, float:2007.563)
            r12 = 0
            r11 = 3
            r10 = 1
            r5 = 0
            r9 = 0
            if (r3 == r10) goto L_0x013e
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r3 == r14) goto L_0x00f6
            if (r3 == r11) goto L_0x00bb
            r3 = 205799343(0xc443faf, float:1.5118455E-31)
            r13.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r3 = r13.mo15032w(r3)
            android.content.Context r3 = (android.content.Context) r3
            r13.mo14918M(r6)
            kotlin.jvm.functions.l r4 = r0.$actioner$inlined
            boolean r4 = r13.mo15006n0(r4)
            boolean r6 = r13.mo15006n0(r1)
            r4 = r4 | r6
            java.lang.Object r6 = r26.mo14921N()
            if (r4 != 0) goto L_0x009e
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r6 != r4) goto L_0x00a8
        L_0x009e:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$accountMenuOption$1$1 r6 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$accountMenuOption$1$1
            kotlin.jvm.functions.l r4 = r0.$actioner$inlined
            r6.<init>(r4, r1)
            r13.mo14893C(r6)
        L_0x00a8:
            r26.mo15002m0()
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            com.carrefour.fid.android.presentation.ui.account.menu.compose.b r1 = com.carrefour.fid.android.presentation.p035ui.account.menu.AccountMenuOptionFormatterKt.m103649b(r1, r3, r6)
            if (r1 == 0) goto L_0x00b6
            com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuOptionComponentKt.m103690a(r1, r13, r5)
        L_0x00b6:
            r26.mo15002m0()
            goto L_0x0138
        L_0x00bb:
            r1 = 205799156(0xc443ef4, float:1.5118235E-31)
            r13.mo14918M(r1)
            java.lang.String r1 = r0.$appVersionText$inlined
            r13.mo14918M(r4)
            kotlin.jvm.functions.l r3 = r0.$actioner$inlined
            boolean r3 = r13.mo15006n0(r3)
            java.lang.Object r4 = r26.mo14921N()
            if (r3 != 0) goto L_0x00da
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x00e4
        L_0x00da:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$3$1 r4 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$3$1
            kotlin.jvm.functions.l r3 = r0.$actioner$inlined
            r4.<init>(r3)
            r13.mo14893C(r4)
        L_0x00e4:
            r26.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            int r3 = r0.$$dirty$inlined
            int r3 = r3 >> 12
            r3 = r3 & 14
            com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuVersionTextComponentKt.m103695a(r1, r4, r13, r3)
            r26.mo15002m0()
            goto L_0x0138
        L_0x00f6:
            r1 = 205798793(0xc443d89, float:1.5117808E-31)
            r13.mo14918M(r1)
            r1 = 2131951806(0x7f1300be, float:1.9540037E38)
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r13, r5)
            r13.mo14918M(r6)
            kotlin.jvm.functions.l r3 = r0.$actioner$inlined
            boolean r3 = r13.mo15006n0(r3)
            androidx.compose.runtime.z0 r4 = r0.$displayLogoutDialog$inlined
            boolean r4 = r13.mo15006n0(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r26.mo14921N()
            if (r3 != 0) goto L_0x0121
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x012d
        L_0x0121:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$2$1 r4 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$2$1
            kotlin.jvm.functions.l r3 = r0.$actioner$inlined
            androidx.compose.runtime.z0 r6 = r0.$displayLogoutDialog$inlined
            r4.<init>(r3, r6)
            r13.mo14893C(r4)
        L_0x012d:
            r26.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuLogoutComponentKt.m103687a(r1, r4, r13, r5)
            r26.mo15002m0()
        L_0x0138:
            r1 = r9
            r14 = r10
            r19 = r11
            r15 = r12
            goto L_0x01a9
        L_0x013e:
            r1 = 205798244(0xc443b64, float:1.5117163E-31)
            r13.mo14918M(r1)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r12, r10, r9)
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10096L(r1, r9, r5, r11, r9)
            r17 = 0
            r18 = 0
            r19 = 0
            r13.mo14918M(r4)
            kotlin.jvm.functions.l r1 = r0.$actioner$inlined
            boolean r1 = r13.mo15006n0(r1)
            java.lang.Object r3 = r26.mo14921N()
            if (r1 != 0) goto L_0x016b
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r3 != r1) goto L_0x0175
        L_0x016b:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$1$1 r3 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountHomeMenuList$1$2$1$1
            kotlin.jvm.functions.l r1 = r0.$actioner$inlined
            r3.<init>(r1)
            r13.mo14893C(r3)
        L_0x0175:
            r26.mo15002m0()
            r20 = r3
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            r3 = 2131231358(0x7f08027e, float:1.8078795E38)
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.p004ui.res.C16015f.m71849d(r3, r13, r5)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r17 = 56
            r18 = 120(0x78, float:1.68E-43)
            r5 = r1
            r1 = r9
            r9 = r16
            r14 = r10
            r10 = r26
            r19 = r11
            r11 = r17
            r15 = r12
            r12 = r18
            androidx.compose.foundation.ImageKt.m8967b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r26.mo15002m0()
        L_0x01a9:
            java.util.List r3 = r0.$accountMenuListItem$inlined
            int r3 = r3.size()
            boolean r4 = r0.$displayUsabillaBanner$inlined
            if (r4 == 0) goto L_0x01b5
            r11 = 2
            goto L_0x01b7
        L_0x01b5:
            r11 = r19
        L_0x01b7:
            int r3 = r3 - r11
            if (r2 >= r3) goto L_0x01f3
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r2.mo114206C()
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r15, r14, r1)
            long r7 = r2.mo114231a0()
            r9 = 0
            r10 = 2
            r11 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.BackgroundKt.m8825d(r6, r7, r9, r10, r11)
            r5 = 16
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r6 = 2
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10026m(r2, r5, r15, r6, r1)
            float r2 = (float) r14
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r1, r2)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 12
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r26
            androidx.compose.material.DividerKt.m13428a(r1, r2, r4, r5, r6, r7, r8)
        L_0x01f3:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01fc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.menu.compose.C23111xc79d2c3a.mo67839a(androidx.compose.foundation.lazy.e, int, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo67839a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
