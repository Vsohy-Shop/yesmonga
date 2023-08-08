package com.carrefour.fid.android.shared.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.TypedValue;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.gifdecoder.C22075f;
import com.carrefour.fid.android.shared.util.keystore.C28939a;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.events.C9175a;
import java.util.Collection;
import java.util.List;
import javax.crypto.SecretKey;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nUtilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utilities.kt\ncom/carrefour/fid/android/shared/util/Utilities\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1#2:152\n1747#3,3:153\n*S KotlinDebug\n*F\n+ 1 Utilities.kt\ncom/carrefour/fid/android/shared/util/Utilities\n*L\n56#1:153,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.util.s */
public final class C28951s {
    @C12579k

    /* renamed from: a */
    public static final C28951s f70964a = new C28951s();
    @C12579k

    /* renamed from: b */
    public static final String f70965b = "one_client_key";
    @C12579k

    /* renamed from: c */
    public static final String f70966c = "CARREFOUR ONE CLIENT";
    @C12579k

    /* renamed from: d */
    public static final String f70967d = "https://play.google.com/store/apps/details?id=";
    @C12579k

    /* renamed from: e */
    public static final String f70968e = "(?=.*utm_source)(?=.*utm_medium)(?=.*utm_campaign)";
    @C12579k

    /* renamed from: f */
    public static final String f70969f = "utm_source";
    @C12579k

    /* renamed from: g */
    public static final String f70970g = "utm_medium";
    @C12579k

    /* renamed from: h */
    public static final String f70971h = "utm_campaign";
    @C12579k

    /* renamed from: i */
    public static final String f70972i = "utm_content";
    @C12579k

    /* renamed from: j */
    public static final String f70973j = "gclid";
    @C12579k

    /* renamed from: k */
    public static final String f70974k = "dclid";
    @C12580l

    /* renamed from: l */
    public static SecretKey f70975l;

    /* renamed from: m */
    public static final int f70976m = 8;

    /* renamed from: l */
    public static /* synthetic */ void m119749l(C28951s sVar, Context context, String str, C11289a aVar, C11289a aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        if ((i & 8) != 0) {
            aVar2 = null;
        }
        sVar.mo84285k(context, str, aVar, aVar2);
    }

    @TargetApi(23)
    /* renamed from: a */
    public final SecretKey mo84275a() {
        SecretKey d = new C28939a().mo84271d(f70965b);
        f70975l = d;
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        return r4;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo84276b(@org.jetbrains.annotations.C12579k java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch:{ all -> 0x003f }
            com.carrefour.fid.android.shared.util.keystore.a r0 = new com.carrefour.fid.android.shared.util.keystore.a     // Catch:{ all -> 0x003f }
            r0.<init>()     // Catch:{ all -> 0x003f }
            com.carrefour.fid.android.shared.util.g r1 = new com.carrefour.fid.android.shared.util.g     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            boolean r2 = r3.mo84280f()     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0021
            java.lang.String r2 = "one_client_key"
            javax.crypto.SecretKey r0 = r0.mo84272e(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r1.mo84206a(r4, r0)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0021:
            java.lang.String r2 = "CARREFOUR ONE CLIENT"
            java.security.KeyStore$PrivateKeyEntry r0 = r0.mo84270c(r2)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0030
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x003f }
            r4.<init>()     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return r4
        L_0x0030:
            java.security.PrivateKey r0 = r0.getPrivateKey()     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "privateKeyEntry.privateKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r1.mo84207b(r4, r0)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r3)
            return r4
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.C28951s.mo84276b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final int mo84277c(int i, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return C11409d.m43851L0(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        return r4;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo84278d(@org.jetbrains.annotations.C12579k android.content.Context r4, @org.jetbrains.annotations.C12579k java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch:{ all -> 0x0046 }
            com.carrefour.fid.android.shared.util.keystore.a r0 = new com.carrefour.fid.android.shared.util.keystore.a     // Catch:{ all -> 0x0046 }
            r0.<init>()     // Catch:{ all -> 0x0046 }
            com.carrefour.fid.android.shared.util.g r1 = new com.carrefour.fid.android.shared.util.g     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            boolean r2 = r3.mo84280f()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x001f
            r3.mo84275a()     // Catch:{ all -> 0x0046 }
            goto L_0x0022
        L_0x001f:
            r0.mo84269b(r4)     // Catch:{ all -> 0x0046 }
        L_0x0022:
            boolean r4 = r3.mo84280f()     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0033
            java.lang.String r4 = "one_client_key"
            javax.crypto.SecretKey r4 = r0.mo84272e(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = r1.mo84208c(r5, r4)     // Catch:{ all -> 0x0046 }
            goto L_0x0044
        L_0x0033:
            java.security.PublicKey r4 = r0.mo84268a()     // Catch:{ all -> 0x0046 }
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0046 }
            r4.<init>()     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return r4
        L_0x0040:
            java.lang.String r4 = r1.mo84209d(r5, r4)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return r4
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.C28951s.mo84278d(android.content.Context, java.lang.String):java.lang.String");
    }

    @C12580l
    /* renamed from: e */
    public final Fragment mo84279e(@C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        int B0 = fragmentManager.mo56786B0();
        if (B0 > 0) {
            FragmentManager.C19177j A0 = fragmentManager.mo56783A0(B0 - 1);
            Intrinsics.checkNotNullExpressionValue(A0, "fm.getBackStackEntryAt(stackCount - 1)");
            return fragmentManager.mo56903s0(A0.getName());
        }
        List<Fragment> I0 = fragmentManager.mo56807I0();
        Fragment fragment = null;
        if (I0.size() > 0) {
            for (Fragment next : I0) {
                if (next != null) {
                    Intrinsics.checkNotNullExpressionValue(next, C22075f.f56695A);
                    if (!next.isHidden()) {
                        fragment = next;
                    }
                }
            }
        }
        return fragment;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: f */
    public final boolean mo84280f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo84281g(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (activeNetworkInfo.isConnected() || f70964a.mo84282h(activeNetworkInfo)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo84282h(NetworkInfo networkInfo) {
        return networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && networkInfo.getExtraInfo() == null && networkInfo.isAvailable();
    }

    /* renamed from: i */
    public final boolean mo84283i(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "targetPackage");
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "packageManager.getInstalledApplications(0)");
        Iterable<ApplicationInfo> iterable = installedApplications;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ApplicationInfo applicationInfo : iterable) {
            if (Intrinsics.areEqual((Object) applicationInfo.packageName, (Object) str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo84284j(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: k */
    public final void mo84285k(@C12579k Context context, @C12579k String str, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, C33585u.C33587b.f81740v3);
        if (mo84283i(context, str)) {
            if (aVar != null) {
                C11079d2 invoke = aVar.invoke();
            }
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268468224);
            }
            context.startActivity(launchIntentForPackage);
            return;
        }
        if (aVar2 != null) {
            C11079d2 invoke2 = aVar2.invoke();
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
    }
}
