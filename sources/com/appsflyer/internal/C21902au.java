package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* renamed from: com.appsflyer.internal.au */
final class C21902au implements BillingClientStateListener {
    private /* synthetic */ C21905aw AFInAppEventType;

    public C21902au(C21905aw awVar) {
        this.AFInAppEventType = awVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(@NonNull BillingResult billingResult) {
        C21905aw awVar = this.AFInAppEventType;
        awVar.AFInAppEventType.submit(new Runnable(billingResult) {
            private /* synthetic */ BillingResult AFInAppEventParameterName;

            {
                this.AFInAppEventParameterName = r2;
            }

            public final void run() {
                try {
                    if (this.AFInAppEventParameterName.getResponseCode() == 0 && !C21905aw.this.AFInAppEventParameterName.AFInAppEventParameterName("ars_history_sent")) {
                        Purchase.PurchasesResult queryPurchases = C21905aw.this.values.queryPurchases("subs");
                        List purchasesList = queryPurchases.getPurchasesList();
                        if (queryPurchases.getResponseCode() == 0 && purchasesList != null) {
                            if (!purchasesList.isEmpty()) {
                                C21905aw.values(C21905aw.this, true, purchasesList);
                                return;
                            }
                        }
                        AFLogger.AppsFlyer2dXConversionCallback("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.valueOf("Failed to log purchases history", th);
                }
            }
        });
    }
}
