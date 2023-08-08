package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.C33033f;
import com.google.firebase.C33277p;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f81510a = "FirebaseInitProvider";
    @C0363p0

    /* renamed from: b */
    public static C33277p f81511b = C33277p.m134171e();
    @C0359n0

    /* renamed from: c */
    public static AtomicBoolean f81512c = new AtomicBoolean(false);
    @C0344h1

    /* renamed from: d */
    public static final String f81513d = "com.google.firebase.firebaseinitprovider";

    /* renamed from: a */
    public static void m135090a(@C0359n0 ProviderInfo providerInfo) {
        C40843u.m166203m(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (f81513d.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @C0363p0
    /* renamed from: b */
    public static C33277p m135091b() {
        return f81511b;
    }

    /* renamed from: c */
    public static boolean m135092c() {
        return f81512c.get();
    }

    public void attachInfo(@C0359n0 Context context, @C0359n0 ProviderInfo providerInfo) {
        m135090a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(@C0359n0 Uri uri, @C0363p0 String str, @C0363p0 String[] strArr) {
        return 0;
    }

    @C0363p0
    public String getType(@C0359n0 Uri uri) {
        return null;
    }

    @C0363p0
    public Uri insert(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        try {
            f81512c.set(true);
            C33033f.m133336x(getContext());
            return false;
        } finally {
            f81512c.set(false);
        }
    }

    @C0363p0
    public Cursor query(@C0359n0 Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2) {
        return null;
    }

    public int update(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 String str, @C0363p0 String[] strArr) {
        return 0;
    }
}
