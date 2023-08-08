package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt$LocationTabBar$2$3$1 */
public final class LocationTabBarKt$LocationTabBar$2$3$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<TabPage, C11079d2> $onTabClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationTabBarKt$LocationTabBar$2$3$1(C11300l<? super TabPage, C11079d2> lVar) {
        super(0);
        this.$onTabClicked = lVar;
    }

    public final void invoke() {
        this.$onTabClicked.invoke(TabPage.ONLINE);
    }
}
