package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.content.Context;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.C19426h0;
import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.performance.C38334f;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.LocationTabBarKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage;
import com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCouponsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,661:1\n43#2,6:662\n45#3,3:668\n76#4:671\n76#4:672\n76#4:719\n76#4:727\n76#4:728\n76#4:729\n76#4:751\n25#5:673\n25#5:680\n25#5:687\n25#5:694\n36#5:705\n36#5:712\n36#5:720\n36#5:730\n36#5:737\n460#5,13:763\n36#5:777\n473#5,3:784\n1114#6,6:674\n1114#6,6:681\n1114#6,6:688\n1114#6,6:695\n1114#6,6:706\n1114#6,6:713\n1114#6,6:721\n1114#6,6:731\n1114#6,6:738\n1114#6,6:778\n1549#7:701\n1620#7,3:702\n766#7:789\n857#7,2:790\n74#8,6:744\n80#8:776\n84#8:788\n75#9:750\n76#9,11:752\n89#9:787\n*S KotlinDebug\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt\n*L\n69#1:662,6\n69#1:668,3\n83#1:671\n86#1:672\n185#1:719\n201#1:727\n300#1:728\n304#1:729\n325#1:751\n87#1:673\n88#1:680\n89#1:687\n92#1:694\n175#1:705\n181#1:712\n191#1:720\n309#1:730\n311#1:737\n325#1:763,13\n326#1:777\n325#1:784,3\n87#1:674,6\n88#1:681,6\n89#1:688,6\n92#1:695,6\n175#1:706,6\n181#1:713,6\n191#1:721,6\n309#1:731,6\n311#1:738,6\n326#1:778,6\n97#1:701\n97#1:702,3\n361#1:789\n361#1:790,2\n325#1:744,6\n325#1:776\n325#1:788\n325#1:750\n325#1:752,11\n325#1:787\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt */
public final class CouponsListStatefulKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$a */
    public /* synthetic */ class C23829a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage[] r0 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage r1 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage.IN_STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage r1 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage.ONLINE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt.C23829a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$b */
    public static final class C23830b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f59952a;

        public C23830b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f59952a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f59952a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f59952a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.jvm.functions.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105534a(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r34, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a r35, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.performance.C38326b r36, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.models.FilterResult r37, @org.jetbrains.annotations.C12579k androidx.lifecycle.C19423g0<com.carrefour.fid.android.presentation.models.CouponDetailsResult> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.util.List<com.carrefour.fid.android.presentation.models.CouponModel>, ? super java.util.List<com.carrefour.fid.android.presentation.models.CouponsFilter>, ? super java.lang.Boolean, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super com.carrefour.fid.android.presentation.models.CouponModel, ? super java.lang.Boolean, ? super java.lang.Integer, kotlin.C11079d2> r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.models.CouponModel, kotlin.C11079d2> r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.Boolean, ? super kotlin.Pair<java.lang.String, java.lang.String>, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r46, int r47, int r48, int r49) {
        /*
            r14 = r35
            r15 = r44
            r13 = r45
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "performance"
            r12 = r36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "updatedCouponResult"
            r11 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "navigateToBack"
            r10 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "navigateToFilters"
            r9 = r40
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "navigateToFidCard"
            r8 = r41
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "navigateToCouponDetails"
            r7 = r42
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "navigateToScanBarCode"
            r6 = r43
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "navigateToBarCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "displaySnackbar"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 1861666319(0x6ef6c60f, float:3.8186375E28)
            r1 = r46
            androidx.compose.runtime.o r5 = r1.mo15009o(r0)
            r1 = r49 & 1
            r2 = 8
            if (r1 == 0) goto L_0x0095
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r5.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r1 = r1.mo57681a(r5, r2)
            if (r1 == 0) goto L_0x0089
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r1, r5, r2)
            r3 = 564614654(0x21a755fe, float:1.1339122E-18)
            r5.mo14918M(r3)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel> r16 = com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r1
            r20 = r5
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r5.mo15002m0()
            r5.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel) r1
            r3 = r47 & -15
            r4 = r1
            goto L_0x0099
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0095:
            r4 = r34
            r3 = r47
        L_0x0099:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00a7
            java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStateful (CouponsListStateful.kt:67)"
            r2 = r48
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r2, r1)
            goto L_0x00a9
        L_0x00a7:
            r2 = r48
        L_0x00a9:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r5.mo15032w(r0)
            r23 = r0
            android.content.Context r23 = (android.content.Context) r23
            kotlinx.coroutines.flow.u r0 = r4.mo76263p0()
            r1 = 0
            r2 = 1
            r34 = r3
            r3 = 8
            androidx.compose.runtime.k2 r3 = androidx.compose.runtime.C8415c2.m30233b(r0, r1, r5, r3, r2)
            kotlinx.coroutines.flow.e r16 = r4.mo76262o0()
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r5.mo15032w(r0)
            androidx.lifecycle.w r0 = (androidx.lifecycle.C19499w) r0
            androidx.lifecycle.Lifecycle r17 = r0.getLifecycle()
            r18 = 0
            r20 = 72
            r21 = 4
            r19 = r5
            kotlinx.coroutines.flow.e r24 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r16, r17, r18, r19, r20, r21)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r0)
            java.lang.Object r2 = r5.mo14921N()
            androidx.compose.runtime.o$a r25 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r25.mo16277a()
            r1 = 2
            if (r2 != r0) goto L_0x0104
            com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage r0 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage.IN_STORE
            r2 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r1, r2)
            r5.mo14893C(r0)
            r33 = r2
            r2 = r0
            r0 = r33
            goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r5.mo15002m0()
            r26 = r2
            androidx.compose.runtime.z0 r26 = (androidx.compose.runtime.C8700z0) r26
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r2)
            java.lang.Object r2 = r5.mo14921N()
            java.lang.Object r0 = r25.mo16277a()
            if (r2 != r0) goto L_0x012c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r1, r2)
            r5.mo14893C(r0)
            r33 = r2
            r2 = r0
            r0 = r33
            goto L_0x012d
        L_0x012c:
            r0 = 0
        L_0x012d:
            r5.mo15002m0()
            r27 = r2
            androidx.compose.runtime.z0 r27 = (androidx.compose.runtime.C8700z0) r27
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r2)
            java.lang.Object r2 = r5.mo14921N()
            java.lang.Object r0 = r25.mo16277a()
            if (r2 != r0) goto L_0x0151
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r2 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r1, r2)
            r5.mo14893C(r0)
            r2 = r0
        L_0x0151:
            r5.mo15002m0()
            r28 = r2
            androidx.compose.runtime.z0 r28 = (androidx.compose.runtime.C8700z0) r28
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r17 = 0
            r18 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$lastUpdatedCouponFromDetails$1 r19 = com.carrefour.fid.android.presentation.p035ui.coupons.list.C23832x71a5142b.f59953f
            r21 = 3080(0xc08, float:4.316E-42)
            r22 = 6
            r16 = r2
            r20 = r5
            java.lang.Object r2 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r1)
            java.lang.Object r1 = r5.mo14921N()
            r46 = r2
            java.lang.Object r2 = r25.mo16277a()
            if (r1 != r2) goto L_0x018f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 2
            r2 = 0
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r1, r2)
            r5.mo14893C(r1)
            goto L_0x0190
        L_0x018f:
            r2 = 0
        L_0x0190:
            r5.mo15002m0()
            r16 = r1
            androidx.compose.runtime.z0 r16 = (androidx.compose.runtime.C8700z0) r16
            java.lang.Object r0 = r3.getValue()
            com.carrefour.fid.android.presentation.viewmodels.coupons.d r0 = (com.carrefour.fid.android.presentation.viewmodels.coupons.C26221d) r0
            com.carrefour.fid.android.shared.type.e r17 = r0.mo76283f()
            java.lang.Object r0 = r3.getValue()
            com.carrefour.fid.android.presentation.viewmodels.coupons.d r0 = (com.carrefour.fid.android.presentation.viewmodels.coupons.C26221d) r0
            com.carrefour.fid.android.presentation.models.FilterResult r0 = r0.mo76284g()
            if (r0 == 0) goto L_0x01d8
            java.util.List r0 = r0.mo121615e()
            if (r0 == 0) goto L_0x01d8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x01c4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01d9
            java.lang.Object r2 = r0.next()
            com.carrefour.fid.android.presentation.models.CouponModel r2 = (com.carrefour.fid.android.presentation.models.CouponModel) r2
            java.lang.String r2 = r2.mo121396L()
            r1.add(r2)
            goto L_0x01c4
        L_0x01d8:
            r1 = r2
        L_0x01d9:
            if (r1 != 0) goto L_0x01e2
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r18 = r0
            goto L_0x01e4
        L_0x01e2:
            r18 = r1
        L_0x01e4:
            java.lang.Object r0 = r16.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r19 = r0.intValue()
            java.lang.Object r0 = r28.getValue()
            r20 = r0
            java.util.List r20 = (java.util.List) r20
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$2 r21 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$2
            r0 = r21
            r1 = r26
            r29 = r46
            r2 = r35
            r22 = r34
            r46 = r3
            r3 = r27
            r34 = r4
            r25 = r5
            r5 = r46
            r6 = r16
            r7 = r39
            r8 = r41
            r9 = r43
            r10 = r42
            r11 = r36
            r12 = r44
            r14 = r13
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r12 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r0 = 265776(0x40e30, float:3.72432E-40)
            r9 = r12 | r0
            r1 = r17
            r2 = r26
            r3 = r18
            r4 = r27
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r25
            m105535b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r11 = r25
            r11.mo14918M(r13)
            boolean r0 = r11.mo15006n0(r14)
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x0254
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x025c
        L_0x0254:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$3$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$3$1
            r1.<init>(r14)
            r11.mo14893C(r1)
        L_0x025c:
            r11.mo15002m0()
            r4 = r1
            kotlin.jvm.functions.p r4 = (kotlin.jvm.functions.C11304p) r4
            r11.mo14918M(r13)
            boolean r0 = r11.mo15006n0(r15)
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x0277
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x027f
        L_0x0277:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$4$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$4$1
            r1.<init>(r15)
            r11.mo14893C(r1)
        L_0x027f:
            r11.mo15002m0()
            r5 = r1
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            int r0 = r22 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = r0 | 456(0x1c8, float:6.39E-43)
            r0 = r23
            r1 = r24
            r2 = r28
            r3 = r35
            r6 = r11
            m105550q(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r11.mo15032w(r0)
            r1 = r0
            androidx.lifecycle.w r1 = (androidx.lifecycle.C19499w) r1
            r2 = 0
            r3 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$5 r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$5
            r10 = r34
            r0 = r37
            r4.<init>(r10, r0)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 8
            r17 = 246(0xf6, float:3.45E-43)
            r9 = r11
            r30 = r10
            r10 = r16
            r0 = r11
            r11 = r17
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r46.getValue()
            com.carrefour.fid.android.presentation.viewmodels.coupons.d r1 = (com.carrefour.fid.android.presentation.viewmodels.coupons.C26221d) r1
            com.carrefour.fid.android.shared.type.e r1 = r1.mo76283f()
            r0.mo14918M(r13)
            r2 = r46
            boolean r3 = r0.mo15006n0(r2)
            java.lang.Object r4 = r0.mo14921N()
            if (r3 != 0) goto L_0x02e1
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x02e9
        L_0x02e1:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$6$1 r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$6$1
            r4.<init>(r2)
            r0.mo14893C(r4)
        L_0x02e9:
            r0.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$7 r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$7
            r7 = r35
            r4.<init>(r2, r7)
            r6 = 0
            r2 = r3
            r3 = r4
            r4 = r0
            r5 = r12
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r1, r2, r3, r4, r5, r6)
            androidx.lifecycle.LiveData r1 = androidx.lifecycle.Transformations.m90601a(r38)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r2 = r0.mo15032w(r2)
            androidx.lifecycle.w r2 = (androidx.lifecycle.C19499w) r2
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$8 r3 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$8
            r5 = r29
            r4 = r30
            r3.<init>(r5, r4)
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$b r5 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$b
            r5.<init>(r3)
            r1.mo57491k(r2, r5)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0326
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0326:
            androidx.compose.runtime.t1 r14 = r0.mo15020s()
            if (r14 != 0) goto L_0x032d
            goto L_0x035c
        L_0x032d:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$9 r13 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$9
            r0 = r13
            r1 = r4
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
            r15 = r13
            r13 = r47
            r31 = r14
            r14 = r48
            r32 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r31
            r1 = r32
            r0.mo15202a(r1)
        L_0x035c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt.m105534a(com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel, com.carrefour.fid.android.presentation.ui.coupons.analytics.a, com.carrefour.fid.android.performance.b, com.carrefour.fid.android.presentation.models.FilterResult, androidx.lifecycle.g0, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105535b(com.carrefour.fid.android.shared.type.C28892e<com.carrefour.fid.android.domain.interactors.coupons.C37643a> r42, androidx.compose.runtime.C8700z0<com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage> r43, java.util.List<java.lang.String> r44, androidx.compose.runtime.C8700z0<java.lang.Boolean> r45, int r46, java.util.List<java.lang.String> r47, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c, kotlin.C11079d2> r48, androidx.compose.runtime.C8592o r49, int r50) {
        /*
            r5 = r46
            r13 = r48
            r14 = r50
            r0 = 674397931(0x28327eeb, float:9.908506E-15)
            r1 = r49
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x001b
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsScreen (CouponsListStateful.kt:210)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r2, r3)
        L_0x001b:
            r0 = 3
            r2 = 0
            r3 = 0
            androidx.compose.material.d1 r16 = androidx.compose.material.ScaffoldKt.m13752f(r2, r2, r1, r3, r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 0
            r12 = 1
            androidx.compose.ui.m r15 = androidx.compose.foundation.layout.SizeKt.m10112l(r0, r4, r12, r2)
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1 r0 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$1
            r2 = r42
            r0.<init>(r13, r14, r2)
            r4 = 741694320(0x2c355b70, float:2.5772405E-12)
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r4, r12, r0)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$2 r0 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$2
            r6 = r0
            r7 = r42
            r8 = r43
            r9 = r44
            r10 = r47
            r11 = r48
            r4 = r12
            r12 = r50
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6 = -648460759(0xffffffffd9594629, float:-3.82232574E15)
            androidx.compose.runtime.internal.a r37 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r6, r4, r0)
            r39 = 390(0x186, float:5.47E-43)
            r40 = 12582912(0xc00000, float:1.7632415E-38)
            r41 = 131064(0x1fff8, float:1.8366E-40)
            r38 = r1
            androidx.compose.material.ScaffoldKt.m13747a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40, r41)
            java.lang.Object r0 = r45.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011a
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r1.mo15032w(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2131820556(0x7f11000c, float:1.927383E38)
            java.lang.String r7 = r0.getQuantityString(r4, r5)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r1.mo15032w(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2131820555(0x7f11000b, float:1.9273828E38)
            java.lang.String r8 = r0.getQuantityString(r4, r5)
            r0 = 2131952786(0x7f130492, float:1.9542025E38)
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r3)
            r0 = 2131952781(0x7f13048d, float:1.9542014E38)
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r3)
            java.lang.String r0 = "getQuantityString(\n     …eCoupon\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r3 = r1.mo15006n0(r13)
            java.lang.Object r4 = r1.mo14921N()
            if (r3 != 0) goto L_0x00de
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x00e6
        L_0x00de:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$3$1 r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$3$1
            r4.<init>(r13)
            r1.mo14893C(r4)
        L_0x00e6:
            r1.mo15002m0()
            r11 = r4
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r13)
            java.lang.Object r3 = r1.mo14921N()
            if (r0 != 0) goto L_0x0101
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x0109
        L_0x0101:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$4$1 r3 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$4$1
            r3.<init>(r13)
            r1.mo14893C(r3)
        L_0x0109:
            r1.mo15002m0()
            r12 = r3
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            com.carrefour.fid.android.design.components.compose.f$b r0 = new com.carrefour.fid.android.design.components.compose.f$b
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r3 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r0, r1, r3)
        L_0x011a:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0123
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0123:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x012a
            goto L_0x0143
        L_0x012a:
            com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$5 r10 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$5
            r0 = r10
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r8 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt.m105535b(com.carrefour.fid.android.shared.type.e, androidx.compose.runtime.z0, java.util.List, androidx.compose.runtime.z0, int, java.util.List, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105536c(List<CouponModel> list, List<CouponModel> list2, List<String> list3, List<String> list4, boolean z, C11300l<? super C23843c, C11079d2> lVar, C8592o oVar, int i) {
        boolean z2;
        List<CouponModel> list5 = list;
        C8592o o = oVar.mo15009o(-1288624528);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1288624528, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.InStoreCoupons (CouponsListStateful.kt:350)");
        } else {
            int i2 = i;
        }
        LazyListState a = LazyListStateKt.m10895a(0, 0, o, 0, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = list5.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((CouponModel) next).mo121402R() != CouponModel.State.ACTIVATED) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        List<String> list6 = list3;
        if (arrayList.size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<CouponModel> a2 = C23876d.m105667a(list5, list6);
        lVar.invoke(new C23843c.C23859h.C23860a(C38334f.f97094i, a2.size()));
        C8592o oVar2 = o;
        LazyDslKt.m10737b((C8767m) null, a, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new CouponsListStatefulKt$InStoreCoupons$1(list, lVar, a2, z, i, list4, z2), oVar2, 0, 253);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsListStatefulKt$InStoreCoupons$2(list, list2, list3, list4, z, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m105537d(C8700z0<TabPage> z0Var, C28892e.C28895c<C37643a> cVar, List<String> list, List<String> list2, C11300l<? super C23843c, C11079d2> lVar, C8592o oVar, int i) {
        C11300l<? super C23843c, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1610360294);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1610360294, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.MultipleCouponsStatus (CouponsListStateful.kt:317)");
        }
        C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
        TabPage value = z0Var.getValue();
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(lVar2);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new CouponsListStatefulKt$MultipleCouponsStatus$1$1$1(lVar2);
            o.mo14893C(N);
        }
        o.mo15002m0();
        LocationTabBarKt.m105659b(value, (C11300l) N, o, 0);
        int i3 = C23829a.$EnumSwitchMapping$0[z0Var.getValue().ordinal()];
        if (i3 == 1) {
            o.mo14918M(-1024908191);
            m105536c(cVar.mo84088d().mo114618i(), cVar.mo84088d().mo114615g(), list, list2, !cVar.mo84088d().mo114615g().isEmpty(), lVar, o, (458752 & (i2 << 3)) | 4680);
            o.mo15002m0();
        } else if (i3 != 2) {
            o.mo14918M(-1024907480);
            o.mo15002m0();
        } else {
            o.mo14918M(-1024907745);
            m105538e(cVar.mo84088d().mo114619j(), list, list2, lVar, o, ((i2 >> 3) & 7168) | 584);
            o.mo15002m0();
        }
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsListStatefulKt$MultipleCouponsStatus$2(z0Var, cVar, list, list2, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m105538e(List<CouponModel> list, List<String> list2, List<String> list3, C11300l<? super C23843c, C11079d2> lVar, C8592o oVar, int i) {
        C11300l<? super C23843c, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1015676085);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1015676085, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.OnlineCoupons (CouponsListStateful.kt:448)");
        }
        LazyListState a = LazyListStateKt.m10895a(0, 0, o, 0, 3);
        List<CouponModel> a2 = C23876d.m105667a(list, list2);
        lVar2.invoke(new C23843c.C23859h.C23860a(C38334f.f97095j, a2.size()));
        LazyDslKt.m10737b((C8767m) null, a, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new CouponsListStatefulKt$OnlineCoupons$1(lVar2, a2, list3, i2), o, 0, 253);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsListStatefulKt$OnlineCoupons$2(list, list2, list3, lVar, i));
        }
    }

    /* renamed from: n */
    public static final void m105547n(C23843c.C23844a aVar, C23787a aVar2, CouponsListViewModel couponsListViewModel, C11300l<? super CouponModel, C11079d2> lVar, List<CouponModel> list, C11305q<? super CouponModel, ? super Boolean, ? super Integer, C11079d2> qVar) {
        if (aVar instanceof C23843c.C23844a.C23845a) {
            C23843c.C23844a.C23845a aVar3 = (C23843c.C23844a.C23845a) aVar;
            if (aVar3.mo69810f()) {
                aVar2.mo69684m();
            } else {
                aVar2.mo69680i();
            }
            couponsListViewModel.mo76265r0(C10976s.m41419k(aVar3.mo69808e()), aVar3.mo69810f(), false);
        } else if (aVar instanceof C23843c.C23844a.C23846b) {
            C23843c.C23844a.C23846b bVar = (C23843c.C23844a.C23846b) aVar;
            qVar.invoke(bVar.mo69816e(), Boolean.valueOf(bVar.mo69818f()), Integer.valueOf(couponsListViewModel.mo76261n0()));
        } else if (aVar instanceof C23843c.C23844a.C23847c) {
            aVar2.mo69683l();
            lVar.invoke(((C23843c.C23844a.C23847c) aVar).mo69823d());
        } else if (aVar instanceof C23843c.C23844a.C23848d) {
            C23843c.C23844a.C23848d dVar = (C23843c.C23844a.C23848d) aVar;
            if (dVar.mo69829d()) {
                aVar2.mo69675d();
            }
            couponsListViewModel.mo76265r0(list, dVar.mo69829d(), true);
        }
    }

    /* renamed from: o */
    public static final void m105548o(C23843c.C23859h hVar, C38326b bVar) {
        if (hVar instanceof C23843c.C23859h.C23860a) {
            C23843c.C23859h.C23860a aVar = (C23843c.C23859h.C23860a) hVar;
            bVar.mo121195d(aVar.mo69844f());
            bVar.mo121184f(aVar.mo69842e());
        } else if (Intrinsics.areEqual((Object) hVar, (Object) C23843c.C23859h.C23861b.f59987a)) {
            bVar.mo121196e();
        }
    }

    /* renamed from: p */
    public static final void m105549p(C23843c.C23849b bVar, C23787a aVar, C8700z0<TabPage> z0Var, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4) {
        if (Intrinsics.areEqual((Object) bVar, (Object) C23843c.C23849b.C23850a.f59966a)) {
            aVar2.invoke();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23843c.C23849b.C23851b.f59968a)) {
            aVar3.invoke();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23843c.C23849b.C23852c.f59970a)) {
            aVar.mo69673b();
            aVar4.invoke();
        } else if (bVar instanceof C23843c.C23849b.C23853d) {
            z0Var.setValue(((C23843c.C23849b.C23853d) bVar).mo69835d());
        }
    }

    @C8540g
    /* renamed from: q */
    public static final void m105550q(Context context, C11907e<? extends C23886i> eVar, C8700z0<List<String>> z0Var, C23787a aVar, C11304p<? super Boolean, ? super Pair<String, String>, C11079d2> pVar, C11289a<C11079d2> aVar2, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2038062812);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2038062812, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.handleSideEffects (CouponsListStateful.kt:580)");
        } else {
            int i2 = i;
        }
        EffectsKt.m29896h(eVar, new CouponsListStatefulKt$handleSideEffects$1(eVar, z0Var, pVar, context, aVar, aVar2, (C11045c<? super CouponsListStatefulKt$handleSideEffects$1>) null), o, 72);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsListStatefulKt$handleSideEffects$2(context, eVar, z0Var, aVar, pVar, aVar2, i));
        }
    }
}
