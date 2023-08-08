package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.appsflyer.internal.cw */
public final class C21974cw {
    public final FutureTask<List<String>> AFInAppEventType;

    public C21974cw(final Context context) {
        this.AFInAppEventType = new FutureTask<>(new Callable<List<String>>() {
            /* access modifiers changed from: private */
            /* renamed from: AFInAppEventParameterName */
            public List<String> call() {
                ArrayList arrayList = new ArrayList();
                try {
                    List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.oem.PRELOAD_PROVIDER"), 0);
                    if (queryIntentContentProviders == null) {
                        return null;
                    }
                    if (queryIntentContentProviders.isEmpty()) {
                        return null;
                    }
                    for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                        String str = resolveInfo.providerInfo.authority;
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(str);
                        sb.append("/preload_id");
                        Cursor query = context.getContentResolver().query(Uri.parse(sb.toString()), (String[]) null, (String) null, (String[]) null, (String) null);
                        if (query != null) {
                            query.moveToFirst();
                            arrayList.add(query.getString(query.getColumnIndex("preload_id")));
                            query.close();
                        }
                    }
                    return arrayList;
                } catch (Exception e) {
                    AFLogger.AFKeystoreWrapper(e.getMessage(), e);
                }
            }
        });
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType.isDone();
    }

    public final List<String> values() {
        try {
            if (AFKeystoreWrapper()) {
                return this.AFInAppEventType.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }
}
