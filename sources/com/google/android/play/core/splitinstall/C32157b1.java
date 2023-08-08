package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.b1 */
public final class C32157b1 {

    /* renamed from: a */
    public final Context f78394a;

    public C32157b1(Context context) {
        this.f78394a = context;
    }

    @Nullable
    /* renamed from: c */
    public static File m130114c(Context context) {
        String string;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            return new File(context.getExternalFilesDir((String) null), string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C32217w0 mo92919a() {
        return C32217w0.m130313i(this.f78394a);
    }

    /* renamed from: b */
    public final Context mo92920b() {
        return this.f78394a;
    }
}
