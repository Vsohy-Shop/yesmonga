package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.g */
public interface C29003g {

    /* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.g$a */
    public static final class C29004a {
        /* renamed from: a */
        public static /* synthetic */ void m119993a(C29003g gVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "complement";
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                gVar.mo77697F(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackBasketTypeAdditionalOrderAnalytics");
        }
    }

    /* renamed from: A */
    void mo77696A();

    /* renamed from: F */
    void mo77697F(@C12579k String str, boolean z);

    /* renamed from: O */
    void mo77698O();

    /* renamed from: Q */
    void mo77699Q();

    /* renamed from: X */
    void mo77700X();

    /* renamed from: c */
    void mo77701c();

    /* renamed from: v */
    void mo77712v();
}
