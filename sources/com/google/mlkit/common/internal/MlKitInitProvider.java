package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C40843u;
import com.google.mlkit.common.sdkinternal.C33947j;

public class MlKitInitProvider extends ContentProvider {
    public final void attachInfo(@RecentlyNonNull Context context, @RecentlyNonNull ProviderInfo providerInfo) {
        C40843u.m166209s(!providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"), "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
    }

    public final int delete(@RecentlyNonNull Uri uri, @C0363p0 String str, @C0363p0 String[] strArr) {
        return 0;
    }

    @RecentlyNullable
    public final String getType(@RecentlyNonNull Uri uri) {
        return null;
    }

    @RecentlyNullable
    public final Uri insert(@RecentlyNonNull Uri uri, @C0363p0 ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        C33947j.m136586e(context);
        return false;
    }

    @RecentlyNullable
    public final Cursor query(@RecentlyNonNull Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2) {
        return null;
    }

    public final int update(@RecentlyNonNull Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 String str, @C0363p0 String[] strArr) {
        return 0;
    }
}
