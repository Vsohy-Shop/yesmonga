package com.carrefour.fid.android.navigation;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavActivity$initNavigationListener$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ BottomNavActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavActivity$initNavigationListener$1(BottomNavActivity bottomNavActivity) {
        super(0);
        this.this$0 = bottomNavActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r0 = (r0 = r0.getChildFragmentManager()).mo56807I0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r3 = this;
            com.carrefour.fid.android.navigation.BottomNavActivity r0 = r3.this$0
            r1 = 0
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0033 }
            androidx.fragment.app.FragmentManager r0 = r0.mo57175g0()     // Catch:{ all -> 0x0033 }
            java.util.List r0 = r0.mo56807I0()     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "supportFragmentManager.fragments"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r0)     // Catch:{ all -> 0x0033 }
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002d
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002d
            java.util.List r0 = r0.mo56807I0()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r0)     // Catch:{ all -> 0x0033 }
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch:{ all -> 0x0033 }
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x003e
        L_0x0033:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x003e:
            boolean r2 = kotlin.Result.m38709i(r0)
            if (r2 == 0) goto L_0x0045
            r0 = r1
        L_0x0045:
            boolean r2 = r0 instanceof com.carrefour.fid.android.various.presentation.p034ui.notification.AppMessageFragment
            if (r2 == 0) goto L_0x004c
            com.carrefour.fid.android.various.presentation.ui.notification.AppMessageFragment r0 = (com.carrefour.fid.android.various.presentation.p034ui.notification.AppMessageFragment) r0
            goto L_0x004d
        L_0x004c:
            r0 = r1
        L_0x004d:
            if (r0 != 0) goto L_0x0064
            com.carrefour.fid.android.navigation.BottomNavActivity r0 = r3.this$0
            androidx.navigation.NavController r0 = r0.f97030f1
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "_navController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x005e
        L_0x005d:
            r1 = r0
        L_0x005e:
            r0 = 2131362172(0x7f0a017c, float:1.8344117E38)
            r1.mo58128V(r0)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.navigation.BottomNavActivity$initNavigationListener$1.invoke():void");
    }
}
