package com.carrefour.fid.android.service.presentation.p044ui.drive.map.model;

import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/model/StoreType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STORE_BANNER_FILTER_HYPER_KEY", "STORE_BANNER_FILTER_MARKET_KEY", "STORE_BANNER_FILTER_MARKET_KEY_2", "STORE_BANNER_FILTER_CONTACT_KEY", "STORE_BANNER_FILTER_CONTACT_MARCHE_KEY", "STORE_BANNER_FILTER_BIO_KEY", "STORE_BANNER_FILTER_CITY_KEY", "STORE_BANNER_FILTER_EXPRESS_KEY", "STORE_BANNER_FILTER_EXPRESS_KEY_2", "STORE_BANNER_FILTER_MONTAGNE_KEY", "STORE_BANNER_FILTER_BON_APP_KEY", "STORE_BANNER_FILTER_EXPRESS", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.model.StoreType */
public enum StoreType {
    STORE_BANNER_FILTER_HYPER_KEY(C28855a.f70683b),
    STORE_BANNER_FILTER_MARKET_KEY(C28855a.f70684c),
    STORE_BANNER_FILTER_MARKET_KEY_2(C28855a.f70685d),
    STORE_BANNER_FILTER_CONTACT_KEY(C28855a.f70686e),
    STORE_BANNER_FILTER_CONTACT_MARCHE_KEY(C28855a.f70687f),
    STORE_BANNER_FILTER_BIO_KEY(C28855a.f70688g),
    STORE_BANNER_FILTER_CITY_KEY(C28855a.f70689h),
    STORE_BANNER_FILTER_EXPRESS_KEY(C28855a.f70690i),
    STORE_BANNER_FILTER_EXPRESS_KEY_2(C28855a.f70691j),
    STORE_BANNER_FILTER_MONTAGNE_KEY(C28855a.f70692k),
    STORE_BANNER_FILTER_BON_APP_KEY(C28855a.f70693l),
    STORE_BANNER_FILTER_EXPRESS(C28855a.f70694m);
    
    @C12579k
    private final String value;

    private StoreType(String str) {
        this.value = str;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }
}
