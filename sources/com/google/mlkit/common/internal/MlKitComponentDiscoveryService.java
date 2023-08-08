package com.google.mlkit.common.internal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public class MlKitComponentDiscoveryService extends Service {
    @RecentlyNullable
    public final IBinder onBind(@RecentlyNonNull Intent intent) {
        return null;
    }
}
