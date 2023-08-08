package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19234h0;
import com.google.common.util.concurrent.C32487a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.browser.trusted.e0 */
public final class C0952e0 {

    /* renamed from: c */
    public static final String f3003c = "TWAConnectionPool";

    /* renamed from: a */
    public final Context f3004a;

    /* renamed from: b */
    public final Map<Uri, C0937b> f3005b = new HashMap();

    /* renamed from: androidx.browser.trusted.e0$a */
    public static class C0953a extends AsyncTask<Void, Void, Exception> {

        /* renamed from: a */
        public final Context f3006a;

        /* renamed from: b */
        public final Intent f3007b;

        /* renamed from: c */
        public final C0937b f3008c;

        public C0953a(Context context, Intent intent, C0937b bVar) {
            this.f3006a = context.getApplicationContext();
            this.f3007b = intent;
            this.f3008c = bVar;
        }

        @C0363p0
        /* renamed from: a */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f3006a.bindService(this.f3007b, this.f3008c, C19234h0.f49479I)) {
                    return null;
                }
                this.f3006a.unbindService(this.f3008c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                return e;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f3008c.mo4017b(exc);
            }
        }
    }

    public C0952e0(@C0359n0 Context context) {
        this.f3004a = context.getApplicationContext();
    }

    @C0359n0
    /* renamed from: c */
    public static C0952e0 m4294c(@C0359n0 Context context) {
        return new C0952e0(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m4295e(Uri uri) {
        this.f3005b.remove(uri);
    }

    @C0353k0
    @C0359n0
    /* renamed from: b */
    public C32487a<C0942c0> mo4049b(@C0359n0 Uri uri, @C0359n0 Set<C0971s> set, @C0359n0 Executor executor) {
        C0937b bVar = this.f3005b.get(uri);
        if (bVar != null) {
            return bVar.mo4018c();
        }
        Intent d = mo4050d(this.f3004a, uri, set, true);
        if (d == null) {
            return C0941c.m4269a(new IllegalArgumentException("No service exists for scope"));
        }
        C0937b bVar2 = new C0937b(new C0950d0(this, uri));
        this.f3005b.put(uri, bVar2);
        new C0953a(this.f3004a, d, bVar2).executeOnExecutor(executor, new Void[0]);
        return bVar2.mo4018c();
    }

    @C0363p0
    /* renamed from: d */
    public final Intent mo4050d(Context context, Uri uri, Set<C0971s> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        String str = null;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str2 = resolveInfo.activityInfo.packageName;
            Iterator<C0971s> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo4059c(str2, context.getPackageManager())) {
                        str = str2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("No TWA candidates for ");
                sb.append(uri);
                sb.append(" have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(C0939b0.f2974d);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not find TWAService for ");
                sb2.append(str);
            }
            return null;
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Found ");
            sb3.append(resolveService.serviceInfo.name);
            sb3.append(" to handle request for ");
            sb3.append(uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }

    @C0353k0
    /* renamed from: f */
    public boolean mo4051f(@C0359n0 Uri uri, @C0359n0 Set<C0971s> set) {
        if (this.f3005b.get(uri) == null && mo4050d(this.f3004a, uri, set, false) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo4052g() {
        for (C0937b unbindService : this.f3005b.values()) {
            this.f3004a.unbindService(unbindService);
        }
        this.f3005b.clear();
    }
}
