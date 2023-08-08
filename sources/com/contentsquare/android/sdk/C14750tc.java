package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.tc */
public class C14750tc implements Thread.UncaughtExceptionHandler {

    /* renamed from: d */
    public static boolean f36514d = false;

    /* renamed from: e */
    public static C14453jf f36515e = new C14453jf("CrashHandler");

    /* renamed from: a */
    public final Context f36516a;

    /* renamed from: b */
    public final C14184ac f36517b;

    /* renamed from: c */
    public Thread.UncaughtExceptionHandler f36518c;

    /* renamed from: com.contentsquare.android.sdk.tc$a */
    public static class C14751a implements C14403hc<C14750tc, Context, Thread.UncaughtExceptionHandler> {
        /* renamed from: a */
        public C14750tc mo35504c(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            return new C14750tc(context, new C14184ac(new C14451jd(), context, new C14772u7(), new C14925z9()), uncaughtExceptionHandler);
        }
    }

    public C14750tc(Context context, C14184ac acVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f36516a = context;
        this.f36517b = acVar;
        this.f36518c = uncaughtExceptionHandler;
    }

    /* renamed from: d */
    public static boolean m63580d(Context context, C14403hc<C14750tc, Context, Thread.UncaughtExceptionHandler> hcVar) {
        C14453jf jfVar;
        String str;
        f36515e.mo35676e("Trying to attach Crash reporter...");
        if (C14404hd.m62056b(context)) {
            if (f36514d) {
                jfVar = f36515e;
                str = "The Crash reporter is already attached, aborting";
            } else {
                C14750tc c = hcVar.mo35504c(context, Thread.getDefaultUncaughtExceptionHandler());
                c.mo36525a();
                Thread.setDefaultUncaughtExceptionHandler(c);
                f36514d = true;
                jfVar = f36515e;
                str = "The Crash reporter has been successfully attached";
            }
            jfVar.mo35676e(str);
            return true;
        }
        f36515e.mo35676e("The Crash reporter could not be attached because it was disabledfrom Project Config");
        return false;
    }

    /* renamed from: a */
    public void mo36525a() {
        this.f36517b.mo34539a();
    }

    /* renamed from: b */
    public final void mo36526b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        mo36527c(true, stringWriter2.contains("com.contentsquare") ? 1 : 2, th.getMessage(), th.getMessage(), stringWriter2);
    }

    /* renamed from: c */
    public void mo36527c(boolean z, int i, String str, String str2, String str3) {
        String str4;
        PackageManager packageManager = this.f36516a.getPackageManager();
        String valueOf = String.valueOf(this.f36516a.getApplicationInfo().loadLabel(packageManager));
        try {
            str4 = packageManager.getPackageInfo(this.f36516a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            f36515e.mo35678g(e, "Failed to get appVersion", new Object[0]);
            str4 = "Unknown";
        }
        C14538n0 c = C14538n0.m62672c();
        if (c != null) {
            c.mo35956e().mo36388f(str2, i, z);
        }
        if (i == 1) {
            try {
                JSONObject d = mo36528e().mo36571a(i).mo36573c(z).mo36572b(valueOf).mo36575e(str4).mo36578h("4.14.0").mo36577g(str).mo36576f(str2).mo36579i(str3).mo36574d();
                f36515e.mo35677f("[ErrorLogEvent] -> %s", d.toString());
                this.f36517b.mo34541c(d);
            } catch (JSONException e2) {
                f36515e.mo35678g(e2, "[ reportIssue ] : could not create JSONObject for Error Logs. %s", new Object[0]);
            }
        }
    }

    /* renamed from: e */
    public C14778uc mo36528e() {
        return new C14778uc(this.f36516a);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        mo36526b(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f36518c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
