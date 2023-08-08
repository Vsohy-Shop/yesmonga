package androidx.navigation.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.navigation.C19695c0;
import androidx.navigation.C19754h0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraph;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class NavHostKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: type inference failed for: r1v11, types: [androidx.navigation.Navigator] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m91713a(@org.jetbrains.annotations.C12579k androidx.navigation.C19754h0 r10, @org.jetbrains.annotations.C12579k androidx.navigation.NavGraph r11, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r12, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r13, int r14, int r15) {
        /*
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "graph"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -957014592(0xffffffffc6f51dc0, float:-31374.875)
            androidx.compose.runtime.o r13 = r13.mo15009o(r0)
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0017
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0017:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r13.mo15032w(r0)
            androidx.lifecycle.w r0 = (androidx.lifecycle.C19499w) r0
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            r2 = 8
            androidx.lifecycle.b1 r1 = r1.mo57681a(r13, r2)
            if (r1 == 0) goto L_0x015d
            androidx.activity.compose.LocalOnBackPressedDispatcherOwner r3 = androidx.activity.compose.LocalOnBackPressedDispatcherOwner.f714a
            androidx.activity.a0 r3 = r3.mo801a(r13, r2)
            r8 = 0
            if (r3 == 0) goto L_0x0039
            androidx.activity.OnBackPressedDispatcher r3 = r3.mo702Z()
            goto L_0x003a
        L_0x0039:
            r3 = r8
        L_0x003a:
            r10.mo58118P0(r0)
            androidx.lifecycle.a1 r0 = r1.getViewModelStore()
            java.lang.String r1 = "viewModelStoreOwner.viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r10.mo58124S0(r0)
            if (r3 == 0) goto L_0x004e
            r10.mo58122R0(r3)
        L_0x004e:
            androidx.navigation.compose.NavHostKt$NavHost$3 r0 = new androidx.navigation.compose.NavHostKt$NavHost$3
            r0.<init>(r10)
            androidx.compose.runtime.EffectsKt.m29891c(r10, r0, r13, r2)
            r10.mo58112M0(r11)
            r0 = 0
            androidx.compose.runtime.saveable.b r7 = androidx.compose.runtime.saveable.SaveableStateHolderKt.m31370a(r13, r0)
            androidx.navigation.r0 r1 = r10.mo58113N()
            java.lang.String r2 = "composable"
            androidx.navigation.Navigator r1 = r1.mo58562f(r2)
            boolean r2 = r1 instanceof androidx.navigation.compose.C19710b
            if (r2 == 0) goto L_0x0070
            androidx.navigation.compose.b r1 = (androidx.navigation.compose.C19710b) r1
            r9 = r1
            goto L_0x0071
        L_0x0070:
            r9 = r8
        L_0x0071:
            if (r9 != 0) goto L_0x0089
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x007a
            goto L_0x0088
        L_0x007a:
            androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1 r6 = new androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.mo15202a(r6)
        L_0x0088:
            return
        L_0x0089:
            kotlinx.coroutines.flow.u r1 = r10.mo58119Q()
            r2 = -3686930(0xffffffffffc7bdee, float:NaN)
            r13.mo14918M(r2)
            boolean r1 = r13.mo15006n0(r1)
            java.lang.Object r2 = r13.mo14921N()
            if (r1 != 0) goto L_0x00a5
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x00b1
        L_0x00a5:
            kotlinx.coroutines.flow.u r1 = r10.mo58119Q()
            androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1 r2 = new androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1
            r2.<init>(r1)
            r13.mo14893C(r2)
        L_0x00b1:
            r13.mo15002m0()
            r1 = r2
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r3 = 0
            r5 = 8
            r6 = 2
            r4 = r13
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30232a(r1, r2, r3, r4, r5, r6)
            java.util.List r2 = m91715c(r1)
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r2)
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r3)
            java.lang.Object r3 = r13.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r3 != r4) goto L_0x00ea
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 2
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r8, r4, r8)
            r13.mo14893C(r3)
        L_0x00ea:
            r13.mo15002m0()
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            r4 = 1822173528(0x6c9c2958, float:1.5103013E27)
            r13.mo14918M(r4)
            if (r2 == 0) goto L_0x0118
            java.lang.String r2 = r2.mo58066g()
            r4 = 0
            androidx.navigation.compose.NavHostKt$NavHost$4 r5 = new androidx.navigation.compose.NavHostKt$NavHost$4
            r5.<init>(r3, r1, r9, r7)
            r1 = 1319254703(0x4ea23aaf, float:1.36087744E9)
            r3 = 1
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r1, r3, r5)
            int r1 = r14 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r6 = r1 | 3072(0xc00, float:4.305E-42)
            r7 = 4
            r1 = r2
            r2 = r12
            r3 = r4
            r4 = r5
            r5 = r13
            androidx.compose.animation.CrossfadeKt.m7790c(r1, r2, r3, r4, r5, r6, r7)
        L_0x0118:
            r13.mo15002m0()
            androidx.navigation.r0 r1 = r10.mo58113N()
            java.lang.String r2 = "dialog"
            androidx.navigation.Navigator r1 = r1.mo58562f(r2)
            boolean r2 = r1 instanceof androidx.navigation.compose.C19714d
            if (r2 == 0) goto L_0x012c
            r8 = r1
            androidx.navigation.compose.d r8 = (androidx.navigation.compose.C19714d) r8
        L_0x012c:
            if (r8 != 0) goto L_0x0144
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x0135
            goto L_0x0143
        L_0x0135:
            androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1 r6 = new androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.mo15202a(r6)
        L_0x0143:
            return
        L_0x0144:
            androidx.navigation.compose.DialogHostKt.m91692a(r8, r13, r0)
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x014e
            goto L_0x015c
        L_0x014e:
            androidx.navigation.compose.NavHostKt$NavHost$5 r6 = new androidx.navigation.compose.NavHostKt$NavHost$5
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.mo15202a(r6)
        L_0x015c:
            return
        L_0x015d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.m91713a(androidx.navigation.h0, androidx.navigation.NavGraph, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    /* renamed from: b */
    public static final void m91714b(@C12579k C19754h0 h0Var, @C12579k String str, @C12580l C8767m mVar, @C12580l String str2, @C12579k C11300l<? super C19695c0, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        String str3;
        String str4 = str;
        C11300l<? super C19695c0, C11079d2> lVar2 = lVar;
        C19754h0 h0Var2 = h0Var;
        Intrinsics.checkNotNullParameter(h0Var, "navController");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(lVar2, "builder");
        C8592o o = oVar.mo15009o(141827520);
        if ((i2 & 4) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        o.mo14918M(-3686095);
        boolean n0 = o.mo15006n0(str3) | o.mo15006n0(str) | o.mo15006n0(lVar2);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            C19695c0 c0Var = new C19695c0(h0Var.mo58113N(), str, str3);
            lVar2.invoke(c0Var);
            N = c0Var.mo58331c();
            o.mo14893C(N);
        }
        o.mo15002m0();
        C19754h0 h0Var3 = h0Var;
        m91713a(h0Var3, (NavGraph) N, mVar2, o, (i & 896) | 72, 0);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NavHostKt$NavHost$2(h0Var, str, mVar2, str3, lVar, i, i2));
        }
    }

    /* renamed from: c */
    public static final List<NavBackStackEntry> m91715c(C8578k2<? extends List<NavBackStackEntry>> k2Var) {
        return (List) k2Var.getValue();
    }

    /* renamed from: d */
    public static final boolean m91716d(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: e */
    public static final void m91717e(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }
}
