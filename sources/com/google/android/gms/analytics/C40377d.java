package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.analytics.C40384f;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41178c4;
import java.lang.Thread;
import java.util.ArrayList;

@C40974d0
/* renamed from: com.google.android.gms.analytics.d */
public class C40377d implements Thread.UncaughtExceptionHandler {
    @C0363p0

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f102907a;

    /* renamed from: b */
    public final C40397i f102908b;

    /* renamed from: c */
    public final Context f102909c;
    @C0363p0

    /* renamed from: d */
    public C40375c f102910d;
    @C0363p0

    /* renamed from: e */
    public C40379e f102911e;

    public C40377d(@RecentlyNonNull C40397i iVar, @C0363p0 Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @RecentlyNonNull Context context) {
        String str;
        String str2;
        if (iVar == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context != null) {
            this.f102907a = uncaughtExceptionHandler;
            this.f102908b = iVar;
            this.f102910d = new C40396h(context, new ArrayList());
            this.f102909c = context.getApplicationContext();
            if (uncaughtExceptionHandler == null) {
                str = "null";
            } else {
                str = uncaughtExceptionHandler.getClass().getName();
            }
            if (str.length() != 0) {
                str2 = "ExceptionReporter created, original handler is ".concat(str);
            } else {
                str2 = new String("ExceptionReporter created, original handler is ");
            }
            C41178c4.m167250d(str2);
        } else {
            throw new NullPointerException("context cannot be null");
        }
    }

    @RecentlyNullable
    /* renamed from: a */
    public C40375c mo133270a() {
        return this.f102910d;
    }

    /* renamed from: b */
    public void mo133271b(@C0363p0 C40375c cVar) {
        this.f102910d = cVar;
    }

    @C0363p0
    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler mo133272c() {
        return this.f102907a;
    }

    public void uncaughtException(@RecentlyNonNull Thread thread, @RecentlyNonNull Throwable th) {
        String str;
        String str2;
        String str3;
        if (this.f102910d != null) {
            if (thread != null) {
                str3 = thread.getName();
            } else {
                str3 = null;
            }
            str = this.f102910d.mo133267a(str3, th);
        } else {
            str = "UncaughtException";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Reporting uncaught exception: ".concat(valueOf);
        } else {
            str2 = new String("Reporting uncaught exception: ");
        }
        C41178c4.m167250d(str2);
        C40397i iVar = this.f102908b;
        C40384f.C40387c cVar = new C40384f.C40387c();
        cVar.mo133349q(str);
        cVar.mo133350r(true);
        iVar.mo133406c0(cVar.mo133351d());
        if (this.f102911e == null) {
            this.f102911e = C40379e.m164228k(this.f102909c);
        }
        C40379e eVar = this.f102911e;
        eVar.mo133277h();
        eVar.mo133418e().mo135896f().mo135701t0();
        if (this.f102907a != null) {
            C41178c4.m167250d("Passing exception to the original handler");
            this.f102907a.uncaughtException(thread, th);
        }
    }
}
