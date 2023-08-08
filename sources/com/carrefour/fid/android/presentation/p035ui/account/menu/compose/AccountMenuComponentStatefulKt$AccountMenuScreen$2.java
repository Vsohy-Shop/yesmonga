package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAccountMenuComponentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountMenuScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,460:1\n50#2:461\n49#2:462\n36#2:469\n50#2:476\n49#2:477\n36#2:484\n1114#3,6:463\n1114#3,6:470\n1114#3,6:478\n1114#3,6:485\n*S KotlinDebug\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountMenuScreen$2\n*L\n184#1:461\n184#1:462\n188#1:469\n200#1:476\n200#1:477\n204#1:484\n184#1:463,6\n188#1:470,6\n200#1:478,6\n204#1:485,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2 */
public final class AccountMenuComponentStatefulKt$AccountMenuScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<AccountMenuItem> $accountMenuList;
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ String $appVersionText;
    final /* synthetic */ C8700z0<Boolean> $displayHelpDialog;
    final /* synthetic */ C8700z0<Boolean> $displayLogoutDialog;
    final /* synthetic */ boolean $displayUsabillaBanner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuScreen$2(boolean z, C8700z0<Boolean> z0Var, List<? extends AccountMenuItem> list, String str, C11300l<? super C23130a, C11079d2> lVar, int i, C8700z0<Boolean> z0Var2) {
        super(3);
        this.$displayUsabillaBanner = z;
        this.$displayLogoutDialog = z0Var;
        this.$accountMenuList = list;
        this.$appVersionText = str;
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$displayHelpDialog = z0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r12, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "paddingValues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r14 & 14
            r1 = 4
            if (r0 != 0) goto L_0x0015
            boolean r0 = r13.mo15006n0(r12)
            if (r0 == 0) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = 2
        L_0x0013:
            r0 = r0 | r14
            goto L_0x0016
        L_0x0015:
            r0 = r14
        L_0x0016:
            r0 = r0 & 91
            r2 = 18
            if (r0 != r2) goto L_0x0028
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r13.mo14958a0()
            goto L_0x019b
        L_0x0028:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0037
            r0 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuScreen.<anonymous> (AccountMenuComponentStateful.kt:167)"
            r3 = 699502311(0x29b18ee7, float:7.8851686E-14)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r14, r0, r2)
        L_0x0037:
            androidx.compose.ui.m$a r14 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10023j(r14, r12)
            boolean r3 = r11.$displayUsabillaBanner
            androidx.compose.runtime.z0<java.lang.Boolean> r4 = r11.$displayLogoutDialog
            java.util.List<com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem> r5 = r11.$accountMenuList
            java.lang.String r6 = r11.$appVersionText
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.menu.compose.a, kotlin.d2> r7 = r11.$actioner
            int r12 = r11.$$dirty
            r14 = r12 & 112(0x70, float:1.57E-43)
            r14 = r14 | 4096(0x1000, float:5.74E-42)
            int r0 = r12 >> 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r14 = r14 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            int r8 = r12 << 6
            r0 = r0 & r8
            r14 = r14 | r0
            int r12 = r12 >> 3
            r0 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r0
            r9 = r14 | r12
            r10 = 0
            r8 = r13
            com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt.m103667a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.runtime.z0<java.lang.Boolean> r12 = r11.$displayLogoutDialog
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r14 = 1157296644(0x44faf204, float:2007.563)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2 = 2131952781(0x7f13048d, float:1.9542014E38)
            r3 = 0
            if (r12 == 0) goto L_0x00fa
            r12 = -720030926(0xffffffffd5153332, float:-1.02529447E13)
            r13.mo14918M(r12)
            r12 = 2131951806(0x7f1300be, float:1.9540037E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r13, r3)
            r1 = 2131951807(0x7f1300bf, float:1.9540039E38)
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r13, r3)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r13, r3)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r13, r3)
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.menu.compose.a, kotlin.d2> r12 = r11.$actioner
            androidx.compose.runtime.z0<java.lang.Boolean> r1 = r11.$displayLogoutDialog
            r13.mo14918M(r0)
            boolean r0 = r13.mo15006n0(r12)
            boolean r2 = r13.mo15006n0(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r13.mo14921N()
            if (r0 != 0) goto L_0x00b7
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x00bf
        L_0x00b7:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$1$1 r2 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$1$1
            r2.<init>(r12, r1)
            r13.mo14893C(r2)
        L_0x00bf:
            r13.mo15002m0()
            r9 = r2
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            androidx.compose.runtime.z0<java.lang.Boolean> r12 = r11.$displayLogoutDialog
            r13.mo14918M(r14)
            boolean r14 = r13.mo15006n0(r12)
            java.lang.Object r0 = r13.mo14921N()
            if (r14 != 0) goto L_0x00dc
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r0 != r14) goto L_0x00e4
        L_0x00dc:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$2$1 r0 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$2$1
            r0.<init>(r12)
            r13.mo14893C(r0)
        L_0x00e4:
            r13.mo15002m0()
            r10 = r0
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            com.carrefour.fid.android.design.components.compose.f$b r12 = new com.carrefour.fid.android.design.components.compose.f$b
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r14 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r12, r13, r14)
            r13.mo15002m0()
            goto L_0x0192
        L_0x00fa:
            androidx.compose.runtime.z0<java.lang.Boolean> r12 = r11.$displayHelpDialog
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0189
            r12 = -720030042(0xffffffffd51536a6, float:-1.02538716E13)
            r13.mo14918M(r12)
            r12 = 2130903041(0x7f030001, float:1.7412889E38)
            java.lang.String[] r12 = androidx.compose.p004ui.res.C16018i.m71857c(r12, r13, r3)
            r5 = r12[r1]
            r12 = 2131952512(0x7f130380, float:1.9541469E38)
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r13, r3)
            r12 = 2131952811(0x7f1304ab, float:1.9542075E38)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r13, r3)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r13, r3)
            androidx.compose.runtime.z0<java.lang.Boolean> r12 = r11.$displayHelpDialog
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.menu.compose.a, kotlin.d2> r1 = r11.$actioner
            r13.mo14918M(r0)
            boolean r0 = r13.mo15006n0(r12)
            boolean r2 = r13.mo15006n0(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r13.mo14921N()
            if (r0 != 0) goto L_0x0147
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x014f
        L_0x0147:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$3$1 r2 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$3$1
            r2.<init>(r12, r1)
            r13.mo14893C(r2)
        L_0x014f:
            r13.mo15002m0()
            r9 = r2
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            androidx.compose.runtime.z0<java.lang.Boolean> r12 = r11.$displayHelpDialog
            r13.mo14918M(r14)
            boolean r14 = r13.mo15006n0(r12)
            java.lang.Object r0 = r13.mo14921N()
            if (r14 != 0) goto L_0x016c
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r0 != r14) goto L_0x0174
        L_0x016c:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$4$1 r0 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$4$1
            r0.<init>(r12)
            r13.mo14893C(r0)
        L_0x0174:
            r13.mo15002m0()
            r10 = r0
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            com.carrefour.fid.android.design.components.compose.f$b r12 = new com.carrefour.fid.android.design.components.compose.f$b
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r14 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r12, r13, r14)
            r13.mo15002m0()
            goto L_0x0192
        L_0x0189:
            r12 = -720029218(0xffffffffd51539de, float:-1.02547356E13)
            r13.mo14918M(r12)
            r13.mo15002m0()
        L_0x0192:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x019b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2.invoke(androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, int):void");
    }
}
