package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.C0005a;
import android.support.customtabs.C0009b;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.C0924h;
import androidx.compose.runtime.C8698y1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.browser.customtabs.c */
public class C0904c {

    /* renamed from: d */
    public static final String f2828d = "CustomTabsClient";

    /* renamed from: a */
    public final C0009b f2829a;

    /* renamed from: b */
    public final ComponentName f2830b;

    /* renamed from: c */
    public final Context f2831c;

    /* renamed from: androidx.browser.customtabs.c$a */
    public class C0905a extends C0922g {

        /* renamed from: d */
        public final /* synthetic */ Context f2832d;

        public C0905a(Context context) {
            this.f2832d = context;
        }

        /* renamed from: b */
        public final void mo3909b(@C0359n0 ComponentName componentName, @C0359n0 C0904c cVar) {
            cVar.mo3908n(0);
            this.f2832d.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: androidx.browser.customtabs.c$b */
    public class C0906b extends C0005a.C0007b {

        /* renamed from: u */
        public Handler f2833u = new Handler(Looper.getMainLooper());

        /* renamed from: v */
        public final /* synthetic */ C0903b f2834v;

        /* renamed from: androidx.browser.customtabs.c$b$a */
        public class C0907a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f2836a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f2837b;

            public C0907a(int i, Bundle bundle) {
                this.f2836a = i;
                this.f2837b = bundle;
            }

            public void run() {
                C0906b.this.f2834v.mo3899d(this.f2836a, this.f2837b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$b */
        public class C0908b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f2839a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f2840b;

            public C0908b(String str, Bundle bundle) {
                this.f2839a = str;
                this.f2840b = bundle;
            }

            public void run() {
                C0906b.this.f2834v.mo3896a(this.f2839a, this.f2840b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$c */
        public class C0909c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f2842a;

            public C0909c(Bundle bundle) {
                this.f2842a = bundle;
            }

            public void run() {
                C0906b.this.f2834v.mo3898c(this.f2842a);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$d */
        public class C0910d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f2844a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f2845b;

            public C0910d(String str, Bundle bundle) {
                this.f2844a = str;
                this.f2845b = bundle;
            }

            public void run() {
                C0906b.this.f2834v.mo3900e(this.f2844a, this.f2845b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$e */
        public class C0911e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f2847a;

            /* renamed from: b */
            public final /* synthetic */ Uri f2848b;

            /* renamed from: c */
            public final /* synthetic */ boolean f2849c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f2850d;

            public C0911e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f2847a = i;
                this.f2848b = uri;
                this.f2849c = z;
                this.f2850d = bundle;
            }

            public void run() {
                C0906b.this.f2834v.mo3901f(this.f2847a, this.f2848b, this.f2849c, this.f2850d);
            }
        }

        public C0906b(C0903b bVar) {
            this.f2834v = bVar;
        }

        /* renamed from: E3 */
        public void mo3E3(String str, Bundle bundle) throws RemoteException {
            if (this.f2834v != null) {
                this.f2833u.post(new C0908b(str, bundle));
            }
        }

        /* renamed from: Q7 */
        public void mo4Q7(int i, Bundle bundle) {
            if (this.f2834v != null) {
                this.f2833u.post(new C0907a(i, bundle));
            }
        }

        /* renamed from: S0 */
        public void mo5S0(String str, Bundle bundle) throws RemoteException {
            if (this.f2834v != null) {
                this.f2833u.post(new C0910d(str, bundle));
            }
        }

        /* renamed from: h2 */
        public Bundle mo6h2(@C0359n0 String str, @C0363p0 Bundle bundle) throws RemoteException {
            C0903b bVar = this.f2834v;
            if (bVar == null) {
                return null;
            }
            return bVar.mo3897b(str, bundle);
        }

        /* renamed from: o8 */
        public void mo7o8(Bundle bundle) throws RemoteException {
            if (this.f2834v != null) {
                this.f2833u.post(new C0909c(bundle));
            }
        }

        /* renamed from: s8 */
        public void mo8s8(int i, Uri uri, boolean z, @C0363p0 Bundle bundle) throws RemoteException {
            if (this.f2834v != null) {
                this.f2833u.post(new C0911e(i, uri, z, bundle));
            }
        }
    }

    public C0904c(C0009b bVar, ComponentName componentName, Context context) {
        this.f2829a = bVar;
        this.f2830b = componentName;
        this.f2831c = context;
    }

    /* renamed from: b */
    public static boolean m4079b(@C0359n0 Context context, @C0363p0 String str, @C0359n0 C0922g gVar) {
        gVar.mo3958c(context.getApplicationContext());
        Intent intent = new Intent(C0917f.f2911c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 33);
    }

    /* renamed from: c */
    public static boolean m4080c(@C0359n0 Context context, @C0363p0 String str, @C0359n0 C0922g gVar) {
        gVar.mo3958c(context.getApplicationContext());
        Intent intent = new Intent(C0917f.f2911c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 1);
    }

    /* renamed from: d */
    public static boolean m4081d(@C0359n0 Context context, @C0359n0 String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m4079b(applicationContext, str, new C0905a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static PendingIntent m4082f(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), C8698y1.f23302n);
    }

    @C0363p0
    /* renamed from: h */
    public static String m4083h(@C0359n0 Context context, @C0363p0 List<String> list) {
        return m4084i(context, list, false);
    }

    @C0363p0
    /* renamed from: i */
    public static String m4084i(@C0359n0 Context context, @C0363p0 List<String> list, boolean z) {
        ArrayList arrayList;
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(C0917f.f2911c);
        for (String next : arrayList) {
            intent2.setPackage(next);
            if (packageManager.resolveService(intent2, 0) != null) {
                return next;
            }
        }
        return null;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: j */
    public static C0924h.C0926b m4085j(@C0359n0 Context context, @C0363p0 C0903b bVar, int i) {
        return new C0924h.C0926b(bVar, m4082f(context, i));
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public C0924h mo3902a(@C0359n0 C0924h.C0926b bVar) {
        return mo3907m(bVar.mo3973a(), bVar.mo3974b());
    }

    /* renamed from: e */
    public final C0005a.C0007b mo3903e(@C0363p0 C0903b bVar) {
        return new C0906b(bVar);
    }

    @C0363p0
    /* renamed from: g */
    public Bundle mo3904g(@C0359n0 String str, @C0363p0 Bundle bundle) {
        try {
            return this.f2829a.mo19k2(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: k */
    public C0924h mo3905k(@C0363p0 C0903b bVar) {
        return mo3907m(bVar, (PendingIntent) null);
    }

    @C0363p0
    /* renamed from: l */
    public C0924h mo3906l(@C0363p0 C0903b bVar, int i) {
        return mo3907m(bVar, m4082f(this.f2831c, i));
    }

    @C0363p0
    /* renamed from: m */
    public final C0924h mo3907m(@C0363p0 C0903b bVar, @C0363p0 PendingIntent pendingIntent) {
        boolean z;
        C0005a.C0007b e = mo3903e(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable(C0912d.f2871e, pendingIntent);
                z = this.f2829a.mo24z3(e, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z = this.f2829a.mo14B7(e);
        }
        if (!z) {
            return null;
        }
        return new C0924h(this.f2829a, e, this.f2830b, pendingIntent);
    }

    /* renamed from: n */
    public boolean mo3908n(long j) {
        try {
            return this.f2829a.mo16L6(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
