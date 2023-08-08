package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.at */
final class C21901at implements PurchasesUpdatedListener {
    private /* synthetic */ C21905aw valueOf;

    public C21901at(C21905aw awVar) {
        this.valueOf = awVar;
    }

    public final void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
        C21905aw awVar = this.valueOf;
        try {
            if (billingResult.getResponseCode() == 0) {
                if (list != null) {
                    if (awVar.values == null) {
                        AFLogger.AppsFlyer2dXConversionCallback("Got Ars billing callback but billing client is missing!");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Purchase sku : list) {
                        arrayList.add(sku.getSku());
                    }
                    awVar.values.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setType("subs").setSkusList(arrayList).build(), new SkuDetailsResponseListener(list) {
                        private /* synthetic */ List AFInAppEventParameterName;

                        {
                            this.AFInAppEventParameterName = r2;
                        }

                        public final void onSkuDetailsResponse(@NonNull BillingResult billingResult, @Nullable List<SkuDetails> list) {
                            try {
                                if (billingResult.getResponseCode() != 0) {
                                    return;
                                }
                                if (list != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (SkuDetails sku : list) {
                                        arrayList.add(sku.getSku());
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Purchase purchase : this.AFInAppEventParameterName) {
                                        if (arrayList.contains(purchase.getSku())) {
                                            arrayList2.add(purchase);
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        C21905aw.values(C21905aw.this, false, arrayList2);
                                    }
                                }
                            } catch (Throwable th) {
                                if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                                    AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                                }
                                AFLogger.valueOf("Failed to log new purchase", th);
                            }
                        }
                    });
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Failed to setup Ars Play billing service: ");
            sb.append(billingResult.getResponseCode());
            sb.append(" ");
            sb.append(billingResult.getDebugMessage());
            AFLogger.AppsFlyer2dXConversionCallback(sb.toString());
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.valueOf("Failed to query new purchase details", th);
        }
    }
}
