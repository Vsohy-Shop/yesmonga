package com.carrefour.fid.android.analytics.data.analytics;

import com.carrefour.fid.android.shared.constant.C28522c;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/analytics/data/analytics/FirebaseEventKey;", "", "", "eventName", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "analytics_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum FirebaseEventKey {
    INTERACTION("interaction"),
    SCREEN_VIEW(FirebaseAnalytics.C32531a.f78878A),
    ADD_TO_CART(FirebaseAnalytics.C32531a.f78889c),
    REMOVE_FROM_CART(FirebaseAnalytics.C32531a.f78879B),
    SELECT_CONTENT(FirebaseAnalytics.C32531a.f78902p),
    SELECT_ITEM(FirebaseAnalytics.C32531a.f78883F),
    VIEW_ITEM_LIST(FirebaseAnalytics.C32531a.f78910x),
    ADD_TO_WISHLIST(FirebaseAnalytics.C32531a.f78890d),
    REMOVE_FROM_WISHLIST("remove_from_wishlist"),
    VIEW_CART(FirebaseAnalytics.C32531a.f78885H),
    BEGIN_CHECKOUT("begin_checkout"),
    CHECKOUT_PROGRESS(C28522c.f68761m),
    ECOMMERCE_PURCHASE("ecommerce_purchase"),
    PURCHASE("purchase"),
    VIEW_ITEM(FirebaseAnalytics.C32531a.f78909w),
    UTM_APP_OPEN("utm_app_open"),
    ADD_SHIPPING_INFO(FirebaseAnalytics.C32531a.f78880C);
    
    @C12579k
    private final String eventName;

    /* access modifiers changed from: public */
    FirebaseEventKey(String str) {
        this.eventName = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo32699q() {
        return this.eventName;
    }
}
