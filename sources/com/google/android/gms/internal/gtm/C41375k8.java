package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.tagmanager.C31011k;
import com.google.android.gms.tagmanager.C31020t;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.gtm.k8 */
public final class C41375k8 {

    /* renamed from: p */
    public static final Pattern f104746p = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);

    /* renamed from: q */
    public static volatile C41375k8 f104747q;

    /* renamed from: r */
    public static final C41350j8 f104748r = new C41590t7();

    /* renamed from: a */
    public final Context f104749a;

    /* renamed from: b */
    public final C31020t f104750b;

    /* renamed from: c */
    public final C31011k f104751c;

    /* renamed from: d */
    public final C41591t8 f104752d;

    /* renamed from: e */
    public final ExecutorService f104753e;

    /* renamed from: f */
    public final ScheduledExecutorService f104754f;

    /* renamed from: g */
    public final C41661w6 f104755g;

    /* renamed from: h */
    public final C41230e8 f104756h;

    /* renamed from: i */
    public final Object f104757i = new Object();

    /* renamed from: j */
    public String f104758j;

    /* renamed from: k */
    public String f104759k;

    /* renamed from: l */
    public int f104760l = 1;

    /* renamed from: m */
    public final Queue<Runnable> f104761m = new LinkedList();

    /* renamed from: n */
    public volatile boolean f104762n = false;

    /* renamed from: o */
    public volatile boolean f104763o = false;

    @C40974d0
    public C41375k8(Context context, C31020t tVar, C31011k kVar, C41591t8 t8Var, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, C41661w6 w6Var, C41230e8 e8Var) {
        C40843u.m166202l(context);
        C40843u.m166202l(tVar);
        this.f104749a = context;
        this.f104750b = tVar;
        this.f104751c = kVar;
        this.f104752d = t8Var;
        this.f104753e = executorService;
        this.f104754f = scheduledExecutorService;
        this.f104755g = w6Var;
        this.f104756h = e8Var;
    }

    /* renamed from: f */
    public static C41375k8 m167938f(Context context, C31020t tVar, C31011k kVar) {
        C40843u.m166202l(context);
        C41375k8 k8Var = f104747q;
        if (k8Var == null) {
            synchronized (C41375k8.class) {
                k8Var = f104747q;
                if (k8Var == null) {
                    k8Var = new C41375k8(context, tVar, kVar, new C41591t8(context, C40954b.m166547b()), C41519q8.m168244a(context), C41567s8.f104950a, C41661w6.m168646a(), new C41230e8(context));
                    f104747q = k8Var;
                }
            }
        }
        return k8Var;
    }

    @C0348i1
    @C40974d0
    /* renamed from: m */
    public final void mo135577m(String[] strArr) {
        String str;
        C41493p6.m168152d("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f104757i) {
            if (!this.f104762n) {
                try {
                    Context context = this.f104749a;
                    try {
                        ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService"), 0);
                        if (serviceInfo != null && serviceInfo.enabled) {
                            Pair<String, String> p = mo135579p((String[]) null);
                            String str2 = (String) p.first;
                            String str3 = (String) p.second;
                            if (str2 == null || str3 == null) {
                                C41493p6.m168153e("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                            } else {
                                if (str2.length() != 0) {
                                    str = "Loading container ".concat(str2);
                                } else {
                                    str = new String("Loading container ");
                                }
                                C41493p6.m168151c(str);
                                this.f104753e.execute(new C41710y7(this, str2, str3, (String) null));
                                this.f104754f.schedule(new C41134a8(this), 5000, TimeUnit.MILLISECONDS);
                                if (!this.f104763o) {
                                    C41493p6.m168151c("Installing Tag Manager event handler.");
                                    this.f104763o = true;
                                    this.f104750b.mo87696m4(new C41638v7(this));
                                    try {
                                        this.f104750b.mo87695Z1(new C41686x7(this));
                                    } catch (RemoteException e) {
                                        C41660w5.m168644b("Error communicating with measurement proxy: ", e, this.f104749a);
                                    }
                                    this.f104749a.registerComponentCallbacks(new C41182c8(this));
                                    C41493p6.m168151c("Tag Manager event handler installed.");
                                }
                            }
                            this.f104762n = true;
                            long currentTimeMillis2 = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder(53);
                            sb.append("Tag Manager initilization took ");
                            sb.append(currentTimeMillis2 - currentTimeMillis);
                            sb.append("ms");
                            C41493p6.m168151c(sb.toString());
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    C41493p6.m168153e("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                    this.f104762n = true;
                } catch (RemoteException e2) {
                    C41660w5.m168644b("Error communicating with measurement proxy: ", e2, this.f104749a);
                } catch (Throwable th) {
                    this.f104762n = true;
                    throw th;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo135578n(Uri uri) {
        this.f104753e.execute(new C41206d8(this, uri));
    }

    /* renamed from: p */
    public final Pair<String, String> mo135579p(String[] strArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C41493p6.m168152d("Looking up container asset.");
        String str6 = this.f104758j;
        if (str6 != null && (str5 = this.f104759k) != null) {
            return Pair.create(str6, str5);
        }
        try {
            String[] b = this.f104756h.mo135339b("containers");
            boolean z = false;
            for (int i = 0; i < b.length; i++) {
                Pattern pattern = f104746p;
                Matcher matcher = pattern.matcher(b[i]);
                if (!matcher.matches()) {
                    C41493p6.m168153e(String.format("Ignoring container asset %s (does not match %s)", new Object[]{b[i], pattern.pattern()}));
                } else if (!z) {
                    this.f104758j = matcher.group(1);
                    String str7 = File.separator;
                    String str8 = b[i];
                    StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 10 + String.valueOf(str8).length());
                    sb.append("containers");
                    sb.append(str7);
                    sb.append(str8);
                    this.f104759k = sb.toString();
                    String valueOf = String.valueOf(this.f104758j);
                    if (valueOf.length() != 0) {
                        str4 = "Asset found for container ".concat(valueOf);
                    } else {
                        str4 = new String("Asset found for container ");
                    }
                    C41493p6.m168152d(str4);
                    z = true;
                } else {
                    String valueOf2 = String.valueOf(b[i]);
                    if (valueOf2.length() != 0) {
                        str3 = "Extra container asset found, will not be loaded: ".concat(valueOf2);
                    } else {
                        str3 = new String("Extra container asset found, will not be loaded: ");
                    }
                    C41493p6.m168153e(str3);
                }
            }
            if (!z) {
                C41493p6.m168153e("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] a = this.f104756h.mo135338a();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < a.length; i2++) {
                        Matcher matcher2 = f104746p.matcher(a[i2]);
                        if (matcher2.matches()) {
                            if (!z2) {
                                String group = matcher2.group(1);
                                this.f104758j = group;
                                this.f104759k = a[i2];
                                String valueOf3 = String.valueOf(group);
                                if (valueOf3.length() != 0) {
                                    str2 = "Asset found for container ".concat(valueOf3);
                                } else {
                                    str2 = new String("Asset found for container ");
                                }
                                C41493p6.m168152d(str2);
                                C41493p6.m168153e("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z2 = true;
                            } else {
                                String valueOf4 = String.valueOf(a[i2]);
                                if (valueOf4.length() != 0) {
                                    str = "Extra container asset found, will not be loaded: ".concat(valueOf4);
                                } else {
                                    str = new String("Extra container asset found, will not be loaded: ");
                                }
                                C41493p6.m168153e(str);
                            }
                        }
                    }
                } catch (IOException e) {
                    C41493p6.m168150b("Failed to enumerate assets.", e);
                    return Pair.create((Object) null, (Object) null);
                }
            }
            return Pair.create(this.f104758j, this.f104759k);
        } catch (IOException e2) {
            C41493p6.m168150b(String.format("Failed to enumerate assets in folder %s", new Object[]{"containers"}), e2);
            return Pair.create((Object) null, (Object) null);
        }
    }
}
