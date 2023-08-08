package com.usabilla.sdk.ubform.utils.ext;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Environment;
import android.util.DisplayMetrics;
import androidx.annotation.C0354l;
import androidx.annotation.C0375v;
import androidx.appcompat.widget.C0696c;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.vectordrawable.graphics.drawable.C20729i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.usabilla.sdk.ubform.C9747c;
import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.g */
public final class C10133g {

    /* renamed from: a */
    public static final int f27868a = 7;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ android.graphics.drawable.Drawable m38339a(android.content.Context r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r1 = r1.open(r2)
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch:{ all -> 0x001b }
            kotlin.p010io.C11133b.m42950a(r1, r2)
            return r0
        L_0x001b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.C10133g.m38339a(android.content.Context, java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    public static final /* synthetic */ File m38340b(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), str);
    }

    /* renamed from: d */
    public static final /* synthetic */ double m38342d(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1.0d;
        }
        int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.C32532b.f78971t, -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return -1.0d;
        }
        return BigDecimal.valueOf((double) (((float) intExtra) / ((float) intExtra2))).setScale(2, 4).doubleValue();
    }

    /* renamed from: e */
    public static final /* synthetic */ String m38343e(Context context) {
        ConnectivityType connectivityType;
        Intrinsics.checkNotNullParameter(context, "<this>");
        ConnectivityType connectivityType2 = ConnectivityType.NO_CONNECTION;
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        connectivityType = ConnectivityType.WIFI;
                    } else if (networkCapabilities.hasTransport(0)) {
                        connectivityType = ConnectivityType.CELLULAR;
                    } else if (networkCapabilities.hasTransport(3)) {
                        connectivityType = ConnectivityType.ETHERNET;
                    }
                    connectivityType2 = connectivityType;
                }
            } catch (SecurityException unused) {
            }
            return connectivityType2.mo21568q();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: f */
    public static final /* synthetic */ String m38344f(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getDisplayMetrics().widthPixels);
        sb.append('x');
        sb.append(context.getResources().getDisplayMetrics().heightPixels);
        return sb.toString();
    }

    /* renamed from: g */
    public static final /* synthetic */ long m38345g(Context context, ActivityManager.MemoryInfo memoryInfo) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Object systemService = context.getSystemService(C0696c.f2306r);
        if (systemService != null) {
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / 1024;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: h */
    public static final /* synthetic */ String m38346h(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context.getResources().getConfiguration().orientation == 1) {
            return PhoneOrientation.PORTRAIT.mo21578q();
        }
        return PhoneOrientation.LANDSCAPE.mo21578q();
    }

    /* renamed from: j */
    public static final /* synthetic */ Intent m38348j(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String packageName = context.getApplicationContext().getPackageName();
        C11368t0 t0Var = C11368t0.f28504a;
        String string = context.getApplicationContext().getString(C9747c.C9761n.ub_playStore_prefix);
        Intrinsics.checkNotNullExpressionValue(string, "applicationContext.getString(R.string.ub_playStore_prefix)");
        String format = String.format(string, Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Intent("android.intent.action.VIEW", Uri.parse(format));
    }

    /* renamed from: k */
    public static final /* synthetic */ long m38349k(Context context, ActivityManager.MemoryInfo memoryInfo) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Object systemService = context.getSystemService(C0696c.f2306r);
        if (systemService != null) {
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1024;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: l */
    public static final /* synthetic */ boolean m38350l(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            if ((applicationInfo.flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ boolean m38351m(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final /* synthetic */ boolean m38352n(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d)) >= 7.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final /* synthetic */ boolean m38353o(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (m38348j(context).resolveActivity(context.getApplicationContext().getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final /* synthetic */ Drawable m38355q(Drawable drawable, @C0354l int i) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Drawable r = C17549d.m80456r(drawable);
        if (r == null) {
            return null;
        }
        C17549d.m80452n(r, i);
        return r;
    }

    /* renamed from: r */
    public static final /* synthetic */ Drawable m38356r(Context context, @C0375v int i, @C0354l int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable i3 = C17318d.m79726i(context, i);
        if (i3 == null) {
            return null;
        }
        return m38355q(i3, i2);
    }

    /* renamed from: s */
    public static final /* synthetic */ Drawable m38357s(Context context, @C0375v int i, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(colorStateList, "colorSelector");
        C20729i e = C20729i.m96219e(context.getResources(), i, context.getTheme());
        if (e == null) {
            return null;
        }
        C17549d.m80453o(e, colorStateList);
        return e;
    }

    /* renamed from: t */
    public static final /* synthetic */ Drawable m38358t(Context context, @C0375v int i, Pair... pairArr) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "colorStatePairs");
        int length = pairArr.length;
        int[] iArr = new int[length];
        int[][] iArr2 = new int[length][];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = new int[0];
        }
        int length2 = pairArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            Pair pair = pairArr[i3];
            iArr2[i4] = new int[]{((Number) pair.mo21849e()).intValue()};
            iArr[i4] = ((Number) pair.mo21851f()).intValue();
            i3++;
            i4++;
        }
        return m38357s(context, i, new ColorStateList(iArr2, iArr));
    }

    /* renamed from: u */
    public static /* synthetic */ Drawable m38359u(Context context, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m38356r(context, i, i2, z);
    }
}
