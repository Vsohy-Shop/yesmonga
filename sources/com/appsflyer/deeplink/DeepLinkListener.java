package com.appsflyer.deeplink;

import android.support.annotation.NonNull;

public interface DeepLinkListener {
    void onDeepLinking(@NonNull DeepLinkResult deepLinkResult);
}
