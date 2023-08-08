package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.C21087c;
import androidx.work.C21377l;
import androidx.work.NetworkType;
import androidx.work.impl.model.C21249u;

@SuppressLint({"ClassVerificationFailure"})
@C0376v0(api = 23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemjob.f */
public class C21130f {

    /* renamed from: b */
    public static final String f54571b = C21377l.m98584i("SystemJobInfoConverter");

    /* renamed from: c */
    public static final String f54572c = "EXTRA_WORK_SPEC_ID";

    /* renamed from: d */
    public static final String f54573d = "EXTRA_IS_PERIODIC";

    /* renamed from: e */
    public static final String f54574e = "EXTRA_WORK_SPEC_GENERATION";

    /* renamed from: a */
    public final ComponentName f54575a;

    /* renamed from: androidx.work.impl.background.systemjob.f$a */
    public static /* synthetic */ class C21131a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54576a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54576a = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54576a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54576a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54576a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54576a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C21130f.C21131a.<clinit>():void");
        }
    }

    @C0344h1(otherwise = 3)
    public C21130f(@C0359n0 Context context) {
        this.f54575a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    @C0376v0(24)
    /* renamed from: b */
    public static JobInfo.TriggerContentUri m97774b(C21087c.C21090c cVar) {
        return new JobInfo.TriggerContentUri(cVar.mo63147a(), cVar.mo63148b() ? 1 : 0);
    }

    /* renamed from: c */
    public static int m97775c(NetworkType networkType) {
        int i = C21131a.f54576a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        C21377l e = C21377l.m98582e();
        String str = f54571b;
        e.mo63774a(str, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    /* renamed from: d */
    public static void m97776d(@C0359n0 JobInfo.Builder builder, @C0359n0 NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m97775c(networkType));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* renamed from: a */
    public JobInfo mo63271a(C21249u uVar, int i) {
        boolean z;
        int i2;
        C21087c cVar = uVar.f54813j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f54572c, uVar.f54804a);
        persistableBundle.putInt(f54574e, uVar.mo63486z());
        persistableBundle.putBoolean(f54573d, uVar.mo63456D());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f54575a).setRequiresCharging(cVar.mo63132g()).setRequiresDeviceIdle(cVar.mo63133h()).setExtras(persistableBundle);
        m97776d(extras, cVar.mo63128d());
        boolean z2 = false;
        if (!cVar.mo63133h()) {
            if (uVar.f54815l == BackoffPolicy.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(uVar.f54816m, i2);
        }
        long max = Math.max(uVar.mo63461c() - System.currentTimeMillis(), 0);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f54820q) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (cVar.mo63129e()) {
            for (C21087c.C21090c b : cVar.mo63127c()) {
                extras.addTriggerContentUri(m97774b(b));
            }
            extras.setTriggerContentUpdateDelay(cVar.mo63126b());
            extras.setTriggerContentMaxDelay(cVar.mo63125a());
        }
        extras.setPersisted(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            JobInfo.Builder unused2 = extras.setRequiresBatteryNotLow(cVar.mo63131f());
            JobInfo.Builder unused3 = extras.setRequiresStorageNotLow(cVar.mo63135i());
        }
        if (uVar.f54814k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        }
        if (i3 >= 31 && uVar.f54820q && !z && !z2) {
            JobInfo.Builder unused4 = extras.setExpedited(true);
        }
        return extras.build();
    }
}
