package com.usabilla.sdk.ubform.p008di;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.volley.C21764n;
import com.android.volley.toolbox.C21792d0;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.PlayStoreInfo;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.utils.C10117c;
import com.usabilla.sdk.ubform.utils.C10118d;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt */
public final class UsabillaDIKt {
    /* renamed from: d */
    public static final AppInfo m36691d(Context context, String str) {
        String str2;
        Context context2 = context;
        PackageInfo i = Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(context.applicationInfo.packageName, 0)");
            str2 = (String) context.getPackageManager().getApplicationLabel(applicationInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = i.packageName;
        }
        String str3 = str2;
        String str4 = i.versionName;
        if (str4 == null) {
            str4 = "";
        }
        boolean l = C10133g.m38350l(context);
        Intrinsics.checkNotNullExpressionValue(str3, "appName");
        return new AppInfo(str3, str4, str, l, (String) null, (String) null, C10133g.m38342d(context), (String) null, C10133g.m38343e(context), C10133g.m38346h(context), false, (String) null, C10133g.m38344f(context), C10133g.m38345g(context2, new ActivityManager.MemoryInfo()), C10133g.m38349k(context2, new ActivityManager.MemoryInfo()), 0, 0, 101552, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static final /* synthetic */ C9821d m36693f(Context context, String str, C9870g gVar, PlayStoreInfo playStoreInfo) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(playStoreInfo, "playStoreInfo");
        return C9823f.m36768a(new UsabillaDIKt$createCommonModule$1(context, str, playStoreInfo, gVar));
    }

    /* renamed from: g */
    public static /* synthetic */ C9821d m36694g(Context context, String str, C9870g gVar, PlayStoreInfo playStoreInfo, int i, Object obj) {
        if ((i & 4) != 0) {
            gVar = null;
        }
        if ((i & 8) != 0) {
            playStoreInfo = m36698k(context);
        }
        return m36693f(context, str, gVar, playStoreInfo);
    }

    /* renamed from: k */
    public static final PlayStoreInfo m36698k(Context context) {
        return new PlayStoreInfo(C10133g.m38348j(context), C10133g.m38353o(context));
    }

    /* renamed from: l */
    public static final C21764n m36699l(Context context) {
        C21764n a = C21792d0.m100146a(context);
        Intrinsics.checkNotNullExpressionValue(a, "{\n        Volley.newRequestQueue(context)\n    }");
        return a;
    }

    /* renamed from: n */
    public static /* synthetic */ C9821d m36701n(C10118d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = new C10117c();
        }
        return Intrinsics.checkNotNullParameter(dVar, "dispatchers");
    }

    /* renamed from: o */
    public static final String m36702o(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(C9747c.C9761n.ub_shared_preferences), 0);
        if (sharedPreferences.contains("uniqueId")) {
            String string = sharedPreferences.getString("uniqueId", "");
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNullExpressionValue(string, "preferences.getString(uuidKey, \"\")!!");
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        sharedPreferences.edit().putString("uniqueId", uuid).apply();
        return uuid;
    }
}
