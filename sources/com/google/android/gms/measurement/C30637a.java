package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C30731g5;

@Deprecated
/* renamed from: com.google.android.gms.measurement.a */
public class C30637a extends ContentProvider {
    public void attachInfo(@C0359n0 Context context, @C0359n0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public int delete(@C0359n0 Uri uri, @C0363p0 String str, @C0359n0 String[] strArr) {
        return 0;
    }

    @C0363p0
    public String getType(@C0359n0 Uri uri) {
        return null;
    }

    @C0363p0
    public Uri insert(@C0359n0 Uri uri, @C0359n0 ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        C40843u.m166202l(context);
        C30731g5.m123740H(context, (zzcl) null, (Long) null);
        return false;
    }

    @C0363p0
    public Cursor query(@C0359n0 Uri uri, @C0359n0 String[] strArr, @C0363p0 String str, @C0359n0 String[] strArr2, @C0363p0 String str2) {
        return null;
    }

    public int update(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 String str, @C0359n0 String[] strArr) {
        return 0;
    }
}
