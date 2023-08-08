package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bumptech.glide.manager.C22509f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40991q;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.gtm.of */
public final class C41478of implements Runnable {

    /* renamed from: a */
    public final Context f104840a;

    /* renamed from: b */
    public final C41573se f104841b;

    /* renamed from: c */
    public final C41454nf f104842c;

    /* renamed from: d */
    public final C41165bf f104843d;

    /* renamed from: e */
    public final C41357jf f104844e;

    public C41478of(Context context, C41165bf bfVar, C41573se seVar) {
        C41454nf nfVar = new C41454nf();
        C41357jf jfVar = new C41357jf();
        this.f104840a = (Context) C40843u.m166202l(context);
        this.f104841b = (C41573se) C40843u.m166202l(seVar);
        this.f104843d = bfVar;
        this.f104842c = nfVar;
        this.f104844e = jfVar;
    }

    @C40974d0
    /* renamed from: a */
    public final boolean mo135684a(String str) {
        if (this.f104840a.getPackageManager().checkPermission(str, this.f104840a.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public final void run() {
        String a;
        String str;
        String str2;
        InputStream inputStream;
        String str3;
        if (!mo135684a("android.permission.INTERNET")) {
            C41493p6.m168149a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
        } else if (!mo135684a(C22509f.f57696b)) {
            C41493p6.m168149a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
        } else {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f104840a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                C41493p6.m168153e("No network connectivity - Offline");
            } else {
                C41493p6.m168152d("Starting to load resource from Network.");
                C41382kf kfVar = new C41382kf();
                try {
                    a = this.f104844e.mo135513a(this.f104843d.mo135064a());
                    String valueOf = String.valueOf(a);
                    if (valueOf.length() != 0) {
                        str = "Loading resource from ".concat(valueOf);
                    } else {
                        str = new String("Loading resource from ");
                    }
                    C41493p6.m168152d(str);
                    inputStream = kfVar.mo135580a(a);
                } catch (FileNotFoundException unused) {
                    String valueOf2 = String.valueOf(a);
                    if (valueOf2.length() != 0) {
                        str2 = "NetworkLoader: No data was retrieved from the given url: ".concat(valueOf2);
                    } else {
                        str2 = new String("NetworkLoader: No data was retrieved from the given url: ");
                    }
                    C41493p6.m168149a(str2);
                    this.f104841b.mo135826b(2, 0);
                    kfVar.zzb();
                    return;
                } catch (zzqe unused2) {
                    String valueOf3 = String.valueOf(a);
                    if (valueOf3.length() != 0) {
                        str3 = "NetworkLoader: Error when loading resource for url: ".concat(valueOf3);
                    } else {
                        str3 = new String("NetworkLoader: Error when loading resource for url: ");
                    }
                    C41493p6.m168149a(str3);
                    this.f104841b.mo135826b(3, 0);
                    inputStream = null;
                } catch (IOException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 54 + String.valueOf(message).length());
                    sb.append("NetworkLoader: Error when loading resource from url: ");
                    sb.append(a);
                    sb.append(" ");
                    sb.append(message);
                    C41493p6.m168150b(sb.toString(), e);
                    this.f104841b.mo135826b(1, 0);
                    kfVar.zzb();
                    return;
                } catch (Throwable th) {
                    kfVar.zzb();
                    throw th;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C40991q.m166665c(inputStream, byteArrayOutputStream);
                    this.f104841b.mo135827c(byteArrayOutputStream.toByteArray());
                    kfVar.zzb();
                    return;
                } catch (IOException e2) {
                    String message2 = e2.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 66 + String.valueOf(message2).length());
                    sb2.append("NetworkLoader: Error when parsing downloaded resources from url: ");
                    sb2.append(a);
                    sb2.append(" ");
                    sb2.append(message2);
                    C41493p6.m168150b(sb2.toString(), e2);
                    this.f104841b.mo135826b(2, 0);
                    kfVar.zzb();
                    return;
                }
            }
        }
        this.f104841b.mo135826b(0, 0);
    }
}
