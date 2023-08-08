package com.appsflyer.attribution;

import android.support.annotation.NonNull;

public interface AppsFlyerRequestListener {
    void onError(int i, @NonNull String str);

    void onSuccess();
}
