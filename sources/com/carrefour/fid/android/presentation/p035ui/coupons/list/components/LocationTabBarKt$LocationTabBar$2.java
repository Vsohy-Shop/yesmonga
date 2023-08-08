package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLocationTabBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationTabBar.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/LocationTabBarKt$LocationTabBar$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,85:1\n36#2:86\n36#2:93\n1114#3,6:87\n1114#3,6:94\n*S KotlinDebug\n*F\n+ 1 LocationTabBar.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/LocationTabBarKt$LocationTabBar$2\n*L\n49#1:86\n60#1:93\n49#1:87,6\n60#1:94,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2 */
public final class LocationTabBarKt$LocationTabBar$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<TabPage, C11079d2> $onTabClicked;
    final /* synthetic */ TabPage $selectedTab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationTabBarKt$LocationTabBar$2(TabPage tabPage, C11300l<? super TabPage, C11079d2> lVar, int i) {
        super(2);
        this.$selectedTab = tabPage;
        this.$onTabClicked = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r15 = r20
            r1 = r21
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r20.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r20.mo14958a0()
            goto L_0x00d8
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBar.<anonymous> (LocationTabBar.kt:38)"
            r4 = 468346026(0x1bea64aa, float:3.8777105E-22)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage r1 = r0.$selectedTab
            int r1 = r1.mo69923q()
            com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage r2 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage.IN_STORE
            int r2 = r2.mo69923q()
            r14 = 1
            if (r1 != r2) goto L_0x0037
            r13 = r14
            goto L_0x0039
        L_0x0037:
            r1 = 0
            r13 = r1
        L_0x0039:
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage, kotlin.d2> r1 = r0.$onTabClicked
            r12 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r12)
            boolean r2 = r15.mo15006n0(r1)
            java.lang.Object r3 = r20.mo14921N()
            if (r2 != 0) goto L_0x0053
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x005b
        L_0x0053:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$1$1 r3 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$1$1
            r3.<init>(r1)
            r15.mo14893C(r3)
        L_0x005b:
            r20.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 0
            r4 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$2 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$2
            r1.<init>(r13)
            r5 = -1187129212(0xffffffffb93dd884, float:-1.8105103E-4)
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r5, r14, r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 492(0x1ec, float:6.9E-43)
            r1 = r13
            r12 = r20
            r18 = r13
            r13 = r16
            r14 = r17
            androidx.compose.material.TabKt.m14074b(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14)
            r14 = r18
            r1 = r14 ^ 1
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.components.TabPage, kotlin.d2> r2 = r0.$onTabClicked
            r3 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r3)
            boolean r3 = r15.mo15006n0(r2)
            java.lang.Object r4 = r20.mo14921N()
            if (r3 != 0) goto L_0x00a3
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x00ab
        L_0x00a3:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$3$1 r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$3$1
            r4.<init>(r2)
            r15.mo14893C(r4)
        L_0x00ab:
            r20.mo15002m0()
            r2 = r4
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 0
            r4 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$4 r5 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$4
            r5.<init>(r14)
            r6 = -455107987(0xffffffffe4df9a6d, float:-3.2998012E22)
            r7 = 1
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r6, r7, r5)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r13 = 24576(0x6000, float:3.4438E-41)
            r14 = 492(0x1ec, float:6.9E-43)
            r12 = r20
            androidx.compose.material.TabKt.m14074b(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00d8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
