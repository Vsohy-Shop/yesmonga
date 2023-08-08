package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.presentation.p035ui.account.menu.compose.C23130a;
import com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nAccountMenuComponentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,460:1\n43#2,6:461\n45#3,3:467\n25#4:470\n25#4:477\n36#4:484\n50#4:491\n49#4:492\n36#4:500\n1114#5,6:471\n1114#5,6:478\n1114#5,6:485\n1114#5,6:493\n1114#5,6:501\n76#6:499\n154#7:507\n*S KotlinDebug\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt\n*L\n58#1:461,6\n58#1:467,3\n78#1:470\n79#1:477\n83#1:484\n102#1:491\n102#1:492\n287#1:500\n78#1:471,6\n79#1:478,6\n83#1:485,6\n102#1:493,6\n287#1:501,6\n109#1:499\n332#1:507\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt */
public final class AccountMenuComponentStatefulKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$a */
    public /* synthetic */ class C23108a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem[] r0 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.ORDERS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.LOYALTY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.PERSONAL_DATA     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.PAYMENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.HELP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.USER_CONSENTS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.SERVICES     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem r1 = com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem.LEGALS     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt.C23108a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103667a(C8767m mVar, boolean z, C8700z0<Boolean> z0Var, List<? extends AccountMenuItem> list, String str, C11300l<? super C23130a, C11079d2> lVar, C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        C8592o o = oVar.mo15009o(1680450042);
        if ((i2 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1680450042, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountHomeMenuList (AccountMenuComponentStateful.kt:318)");
        } else {
            int i3 = i;
        }
        LazyDslKt.m10737b(PaddingKt.m10024k(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16)), LazyListStateKt.m10895a(0, 0, o, 0, 3), (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new AccountMenuComponentStatefulKt$AccountHomeMenuList$1(list, z, lVar, i, z0Var, str), o, 0, 252);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AccountMenuComponentStatefulKt$AccountHomeMenuList$2(aVar, z, z0Var, list, str, lVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m103668b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1626257462);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1626257462, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountHomeMenuListPreview (AccountMenuComponentStateful.kt:409)");
            }
            ThemeKt.m153788a(ComposableSingletons$AccountMenuComponentStatefulKt.f58769a.mo67867c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AccountMenuComponentStatefulKt$AccountHomeMenuListPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m103669c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(228148281);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(228148281, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountHomeMenuListWithUsabillaPreview (AccountMenuComponentStateful.kt:435)");
            }
            ThemeKt.m153788a(ComposableSingletons$AccountMenuComponentStatefulKt.f58769a.mo67868d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23115x6b3a0b6d(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103670d(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r34, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a r35, @org.jetbrains.annotations.C12579k java.lang.String r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r45, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r47, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r49, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r51, int r52, int r53, int r54) {
        /*
            r15 = r35
            r14 = r48
            java.lang.String r0 = "accountMenuAnalyticsHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "appVersionText"
            r13 = r36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onAccountOrdersClicked"
            r12 = r37
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onLoyaltyClicked"
            r11 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onConfirmedHelpClicked"
            r10 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onLegalsClicked"
            r9 = r40
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onUserConsentsClicked"
            r8 = r41
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onPaymentClicked"
            r7 = r42
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onServicesClicked"
            r6 = r43
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onUsabillaBannerClicked"
            r5 = r44
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onConfirmedLogoutClicked"
            r4 = r45
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onNotificationClicked"
            r3 = r46
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onBackPressed"
            r2 = r47
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "onUserUuidFetched"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onPersonalDataClicked"
            r1 = r49
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onDisabledNotificationClick"
            r13 = r50
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -304476765(0xffffffffedda0da3, float:-8.435527E27)
            r1 = r51
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r16 = r54 & 1
            if (r16 == 0) goto L_0x00c3
            r0 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r1.mo14918M(r0)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r0 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            r2 = 8
            androidx.lifecycle.b1 r0 = r0.mo57681a(r1, r2)
            if (r0 == 0) goto L_0x00b7
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r0, r1, r2)
            r2 = 564614654(0x21a755fe, float:1.1339122E-18)
            r1.mo14918M(r2)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel> r16 = com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r0
            r20 = r1
            androidx.lifecycle.v0 r0 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r1.mo15002m0()
            r1.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel) r0
            r2 = r52 & -15
            r33 = r2
            r2 = r0
            r0 = r33
            goto L_0x00c7
        L_0x00b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            r2 = r34
            r0 = r52
        L_0x00c7:
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x00d8
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStateful (AccountMenuComponentStateful.kt:56)"
            r13 = r53
            r4 = -304476765(0xffffffffedda0da3, float:-8.435527E27)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r0, r13, r3)
            goto L_0x00da
        L_0x00d8:
            r13 = r53
        L_0x00da:
            kotlinx.coroutines.flow.u r3 = r2.mo74865B0()
            r4 = 0
            r34 = r0
            r0 = 1
            r5 = 8
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r3, r4, r1, r5, r0)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r3)
            java.lang.Object r5 = r1.mo14921N()
            androidx.compose.runtime.o$a r22 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r22.mo16277a()
            r4 = 2
            if (r5 != r3) goto L_0x010b
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r5 = 0
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r5, r4, r5)
            r1.mo14893C(r3)
            r33 = r5
            r5 = r3
            r3 = r33
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            r1.mo15002m0()
            r27 = r5
            androidx.compose.runtime.z0 r27 = (androidx.compose.runtime.C8700z0) r27
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r5)
            java.lang.Object r5 = r1.mo14921N()
            java.lang.Object r3 = r22.mo16277a()
            if (r5 != r3) goto L_0x012e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r5 = 0
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r5, r4, r5)
            r1.mo14893C(r3)
            r5 = r3
        L_0x012e:
            r1.mo15002m0()
            r28 = r5
            androidx.compose.runtime.z0 r28 = (androidx.compose.runtime.C8700z0) r28
            java.lang.Object r3 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.home.c r3 = (com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c) r3
            com.carrefour.fid.android.shared.type.e r16 = r3.mo74901k()
            r3 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r3)
            boolean r3 = r1.mo15006n0(r0)
            java.lang.Object r4 = r1.mo14921N()
            if (r3 != 0) goto L_0x0155
            java.lang.Object r3 = r22.mo16277a()
            if (r4 != r3) goto L_0x015d
        L_0x0155:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$1$1 r4 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$1$1
            r4.<init>(r0)
            r1.mo14893C(r4)
        L_0x015d:
            r1.mo15002m0()
            r17 = r4
            kotlin.jvm.functions.a r17 = (kotlin.jvm.functions.C11289a) r17
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$2 r3 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$2
            r3.<init>(r0, r15)
            int r29 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r21 = 0
            r18 = r3
            r19 = r1
            r20 = r29
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r16, r17, r18, r19, r20, r21)
            java.lang.Object r3 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.home.c r3 = (com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c) r3
            java.lang.String r3 = r3.mo74902l()
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r4)
            boolean r4 = r1.mo15006n0(r0)
            boolean r5 = r1.mo15006n0(r14)
            r4 = r4 | r5
            java.lang.Object r5 = r1.mo14921N()
            if (r4 != 0) goto L_0x019b
            java.lang.Object r4 = r22.mo16277a()
            if (r5 != r4) goto L_0x01a4
        L_0x019b:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1 r5 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1
            r4 = 0
            r5.<init>(r0, r14, r4)
            r1.mo14893C(r5)
        L_0x01a4:
            r1.mo15002m0()
            kotlin.jvm.functions.p r5 = (kotlin.jvm.functions.C11304p) r5
            r4 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r3, r5, r1, r4)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r3 = r1.mo15032w(r3)
            r16 = r3
            androidx.lifecycle.w r16 = (androidx.lifecycle.C19499w) r16
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$4 r3 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$4
            r3.<init>(r15)
            r18 = 0
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$5 r4 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$5
            r4.<init>(r2)
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$6 r5 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$6
            r5.<init>(r2)
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 8
            r26 = 228(0xe4, float:3.2E-43)
            r17 = r3
            r19 = r4
            r20 = r5
            r24 = r1
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r3 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.home.c r3 = (com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c) r3
            com.carrefour.fid.android.shared.type.e r17 = r3.mo74899i()
            java.lang.Object r3 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.home.c r3 = (com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c) r3
            boolean r18 = r3.mo74900j()
            java.lang.Object r0 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.home.c r0 = (com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c) r0
            java.util.List r19 = r0.mo74897h()
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$7 r20 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$7
            r5 = r34
            r0 = r20
            r21 = r1
            r1 = r35
            r22 = r2
            r3 = r28
            r4 = r37
            r30 = r5
            r5 = r38
            r6 = r49
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r45
            r14 = r47
            r15 = r46
            r16 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 225280(0x37000, float:3.15685E-40)
            r0 = r29 | r0
            r2 = r30
            r1 = r2 & 896(0x380, float:1.256E-42)
            r9 = r0 | r1
            r1 = r17
            r2 = r18
            r3 = r36
            r4 = r19
            r5 = r27
            r6 = r28
            r7 = r20
            r8 = r21
            m103674h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0252
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0252:
            androidx.compose.runtime.t1 r15 = r21.mo15020s()
            if (r15 != 0) goto L_0x0259
            goto L_0x0292
        L_0x0259:
            com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$8 r14 = new com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$8
            r0 = r14
            r1 = r22
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r13 = r46
            r31 = r14
            r14 = r47
            r32 = r15
            r15 = r48
            r16 = r49
            r17 = r50
            r18 = r52
            r19 = r53
            r20 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r31
            r0 = r32
            r0.mo15202a(r1)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.menu.compose.AccountMenuComponentStatefulKt.m103670d(com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel, com.carrefour.fid.android.presentation.viewmodels.account.home.a, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m103671e(C28892e<C37950a> eVar, C11300l<? super C23130a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        C28892e<C37950a> eVar2 = eVar;
        C11300l<? super C23130a, C11079d2> lVar2 = lVar;
        int i5 = i;
        C8592o o = oVar.mo15009o(431804653);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(eVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(431804653, i2, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuHeader (AccountMenuComponentStateful.kt:279)");
            }
            String d = C16018i.m71858d(R.string.title_account, o, 0);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new AccountMenuComponentStatefulKt$AccountMenuHeader$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            oVar2 = o;
            HeaderComponentKt.m151503h(d, (C16361p0) null, 0, 0, 0, (String) null, (C11289a) N, C8553b.m31048b(o, -593977862, true, new AccountMenuComponentStatefulKt$AccountMenuHeader$2(eVar2, lVar2)), o, 12779520, 30);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new AccountMenuComponentStatefulKt$AccountMenuHeader$3(eVar2, lVar2, i5));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m103672f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(493608518);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(493608518, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuHeaderPreview (AccountMenuComponentStateful.kt:393)");
            }
            ThemeKt.m153788a(ComposableSingletons$AccountMenuComponentStatefulKt.f58769a.mo67865a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AccountMenuComponentStatefulKt$AccountMenuHeaderPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m103673g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(334553705);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(334553705, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuHeaderWithoutNotificationPreview (AccountMenuComponentStateful.kt:401)");
            }
            ThemeKt.m153788a(ComposableSingletons$AccountMenuComponentStatefulKt.f58769a.mo67866b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23116xf9b3eafd(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m103674h(C28892e<C37950a> eVar, boolean z, String str, List<? extends AccountMenuItem> list, C8700z0<Boolean> z0Var, C8700z0<Boolean> z0Var2, C11300l<? super C23130a, C11079d2> lVar, C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-1824723739);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1824723739, i2, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuScreen (AccountMenuComponentStateful.kt:153)");
        }
        C11300l<? super C23130a, C11079d2> lVar2 = lVar;
        C8552a b = C8553b.m31048b(o, -588683968, true, new AccountMenuComponentStatefulKt$AccountMenuScreen$1(eVar, lVar2, i2));
        long E = C37475b.f94185a.mo114208E();
        AccountMenuComponentStatefulKt$AccountMenuScreen$2 accountMenuComponentStatefulKt$AccountMenuScreen$2 = r0;
        C8592o oVar2 = o;
        AccountMenuComponentStatefulKt$AccountMenuScreen$2 accountMenuComponentStatefulKt$AccountMenuScreen$22 = new AccountMenuComponentStatefulKt$AccountMenuScreen$2(z, z0Var, list, str, lVar2, i, z0Var2);
        C8592o oVar3 = oVar2;
        ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, b, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, E, 0, C8553b.m31048b(oVar2, 699502311, true, accountMenuComponentStatefulKt$AccountMenuScreen$2), oVar2, C22132b.f56831b, 12582912, 98299);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new AccountMenuComponentStatefulKt$AccountMenuScreen$3(eVar, z, str, list, z0Var, z0Var2, lVar, i));
        }
    }

    /* renamed from: q */
    public static final void m103683q(C23130a aVar, C25796a aVar2, AccountMenuViewModel accountMenuViewModel, C8700z0<Boolean> z0Var, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, C11289a<C11079d2> aVar8, C11289a<C11079d2> aVar9, C11289a<C11079d2> aVar10, C11289a<C11079d2> aVar11, C11289a<C11079d2> aVar12, C11289a<C11079d2> aVar13, C11300l<? super Boolean, C11079d2> lVar, C11289a<C11079d2> aVar14) {
        C23130a aVar15 = aVar;
        C25796a aVar16 = aVar2;
        if (Intrinsics.areEqual((Object) aVar, (Object) C23130a.C23132b.f58799a)) {
            aVar6.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23130a.C23137g.f58809a)) {
            aVar2.mo74887h();
            aVar11.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23130a.C23133c.f58801a)) {
            aVar2.mo74885f();
            AccountMenuViewModel accountMenuViewModel2 = accountMenuViewModel;
            accountMenuViewModel.mo74868u0(new AccountMenuComponentStatefulKt$handleMenuAccountActions$1(aVar12));
        } else {
            AccountMenuViewModel accountMenuViewModel3 = accountMenuViewModel;
            if (Intrinsics.areEqual((Object) aVar, (Object) C23130a.C23138h.f58811a)) {
                accountMenuViewModel.mo74872z0();
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C23130a.C23131a.f58797a)) {
                aVar13.invoke();
            } else if (aVar15 instanceof C23130a.C23136f) {
                C23130a.C23136f fVar = (C23130a.C23136f) aVar15;
                aVar2.mo74883d(String.valueOf(fVar.mo67893d().mo116789f()));
                lVar.invoke(Boolean.valueOf(fVar.mo67893d().mo116787e()));
            } else if (aVar15 instanceof C23130a.C23134d) {
                aVar2.mo74883d("0");
                aVar14.invoke();
            } else if (aVar15 instanceof C23130a.C23135e) {
                switch (C23108a.$EnumSwitchMapping$0[((C23130a.C23135e) aVar15).mo67887d().ordinal()]) {
                    case 1:
                        aVar3.invoke();
                        return;
                    case 2:
                        aVar4.invoke();
                        return;
                    case 3:
                        aVar2.mo74886g();
                        aVar5.invoke();
                        return;
                    case 4:
                        aVar9.invoke();
                        return;
                    case 5:
                        C8700z0<Boolean> z0Var2 = z0Var;
                        z0Var.setValue(Boolean.TRUE);
                        return;
                    case 6:
                        aVar8.invoke();
                        return;
                    case 7:
                        aVar10.invoke();
                        return;
                    case 8:
                        aVar7.invoke();
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
