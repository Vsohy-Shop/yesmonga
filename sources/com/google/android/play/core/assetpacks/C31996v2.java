package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;

/* renamed from: com.google.android.play.core.assetpacks.v2 */
public final class C31996v2 {

    /* renamed from: a */
    public final Context f78165a;

    public C31996v2(Context context) {
        this.f78165a = context;
    }

    @Nullable
    /* renamed from: b */
    public static String m129715b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Context mo92700a() {
        return this.f78165a;
    }
}
