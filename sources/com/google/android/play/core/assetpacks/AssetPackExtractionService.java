package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {

    /* renamed from: a */
    public C31936i0 f77788a;

    public final IBinder onBind(Intent intent) {
        return this.f77788a;
    }

    public final void onCreate() {
        super.onCreate();
        C31987t1.m129675j(getApplicationContext()).mo92561c(this);
    }
}
