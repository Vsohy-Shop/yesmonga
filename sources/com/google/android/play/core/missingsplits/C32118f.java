package com.google.android.play.core.missingsplits;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.appcompat.widget.C0696c;
import com.google.android.play.core.internal.C32062k;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.missingsplits.f */
public final class C32118f implements C32114b {

    /* renamed from: e */
    public static final C32062k f78334e = new C32062k("MissingSplitsManagerImpl");

    /* renamed from: a */
    public final Context f78335a;

    /* renamed from: b */
    public final Runtime f78336b;

    /* renamed from: c */
    public final C32116d f78337c;

    /* renamed from: d */
    public final AtomicReference<Boolean> f78338d;

    public C32118f(Context context, Runtime runtime, C32116d dVar, AtomicReference<Boolean> atomicReference) {
        this.f78335a = context;
        this.f78336b = runtime;
        this.f78337c = dVar;
        this.f78338d = atomicReference;
    }

    /* renamed from: e */
    public static boolean m130027e(Set<String> set) {
        if (set.isEmpty()) {
            return true;
        }
        if (set.size() == 1) {
            return set.contains("");
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f78334e.mo92779e("App '%s' is not found in PackageManager", r7.f78335a.getPackageName());
        r5 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92861a() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r7.f78338d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r7.f78338d     // Catch:{ all -> 0x01c2 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01c2 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x009c
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r7.f78338d     // Catch:{ all -> 0x01c2 }
            android.content.Context r4 = r7.f78335a     // Catch:{ all -> 0x01c2 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x01c2 }
            android.content.Context r5 = r7.f78335a     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0083 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r4 = r5.equals(r4)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            android.content.Context r4 = r7.f78335a     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.Context r5 = r7.f78335a     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ NameNotFoundException -> 0x0056 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.lang.String[] r4 = r4.splitNames     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.util.Collections.addAll(r5, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x006b
        L_0x0056:
            com.google.android.play.core.internal.k r4 = f78334e     // Catch:{ all -> 0x01c2 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c2 }
            android.content.Context r6 = r7.f78335a     // Catch:{ all -> 0x01c2 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01c2 }
            r5[r3] = r6     // Catch:{ all -> 0x01c2 }
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r4.mo92779e(r6, r5)     // Catch:{ all -> 0x01c2 }
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch:{ all -> 0x01c2 }
        L_0x006b:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x01c2 }
            if (r4 != 0) goto L_0x007f
            int r4 = r5.size()     // Catch:{ all -> 0x01c2 }
            if (r4 != r2) goto L_0x0081
            java.lang.String r4 = ""
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x01c2 }
            if (r4 == 0) goto L_0x0081
        L_0x007f:
            r4 = r2
            goto L_0x0095
        L_0x0081:
            r4 = r3
            goto L_0x0095
        L_0x0083:
            com.google.android.play.core.internal.k r4 = f78334e     // Catch:{ all -> 0x01c2 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c2 }
            android.content.Context r6 = r7.f78335a     // Catch:{ all -> 0x01c2 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01c2 }
            r5[r3] = r6     // Catch:{ all -> 0x01c2 }
            java.lang.String r6 = "App '%s' is not found in the PackageManager"
            r4.mo92779e(r6, r5)     // Catch:{ all -> 0x01c2 }
            goto L_0x0081
        L_0x0095:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01c2 }
            r1.set(r4)     // Catch:{ all -> 0x01c2 }
        L_0x009c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r7.f78338d     // Catch:{ all -> 0x01c2 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01c2 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01c2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c2 }
            if (r1 == 0) goto L_0x01af
            java.util.List r0 = r7.mo92870f()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r1 = r1.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r4 = r4.getName()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00b3
            goto L_0x01ae
        L_0x00fb:
            java.util.List r0 = r7.mo92870f()
            java.util.Iterator r0 = r0.iterator()
        L_0x0103:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0163
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            if (r1 == 0) goto L_0x0103
            android.content.Intent r4 = r1.baseIntent
            if (r4 == 0) goto L_0x0103
            android.content.Intent r4 = r1.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x0103
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r4 = r1.getClassName()
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
        L_0x0135:
            if (r1 == 0) goto L_0x0103
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0141
        L_0x013f:
            r0 = r2
            goto L_0x0164
        L_0x0141:
            java.lang.Class r4 = r1.getSuperclass()
            if (r4 == r1) goto L_0x0149
            r1 = r4
            goto L_0x0135
        L_0x0149:
            r1 = 0
            goto L_0x0135
        L_0x014b:
            com.google.android.play.core.internal.k r5 = f78334e
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r4
            java.lang.String r4 = "ClassNotFoundException when scanning class hierarchy of '%s'"
            r5.mo92779e(r4, r6)
            android.content.Context r4 = r7.f78335a     // Catch:{ NameNotFoundException -> 0x0103 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0103 }
            android.content.pm.ActivityInfo r1 = r4.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0103 }
            if (r1 == 0) goto L_0x0103
            goto L_0x013f
        L_0x0163:
            r0 = r3
        L_0x0164:
            com.google.android.play.core.missingsplits.d r1 = r7.f78337c
            r1.mo92864b()
            java.util.List r1 = r7.mo92870f()
            java.util.Iterator r1 = r1.iterator()
        L_0x0171:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0181
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L_0x0171
        L_0x0181:
            if (r0 == 0) goto L_0x01a9
            android.content.Context r0 = r7.f78335a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r4 = r7.f78335a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r1.<init>(r4, r5)
            r0.setComponentEnabledSetting(r1, r2, r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r7.f78335a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r1, r4)
            r1 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r7.f78335a
            r1.startActivity(r0)
        L_0x01a9:
            java.lang.Runtime r0 = r7.f78336b
            r0.exit(r3)
        L_0x01ae:
            return r2
        L_0x01af:
            com.google.android.play.core.missingsplits.d r0 = r7.f78337c
            boolean r0 = r0.mo92863a()
            if (r0 == 0) goto L_0x01c1
            com.google.android.play.core.missingsplits.d r0 = r7.f78337c
            r0.mo92865c()
            java.lang.Runtime r0 = r7.f78336b
            r0.exit(r3)
        L_0x01c1:
            return r3
        L_0x01c2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.C32118f.mo92861a():boolean");
    }

    /* renamed from: b */
    public final boolean mo92862b() {
        boolean booleanValue;
        synchronized (this.f78338d) {
            if (this.f78338d.get() == null) {
                AtomicReference<Boolean> atomicReference = this.f78338d;
                boolean z = false;
                if (mo92868c() && m130027e(mo92869d())) {
                    z = true;
                }
                atomicReference.set(Boolean.valueOf(z));
            }
            booleanValue = this.f78338d.get().booleanValue();
        }
        return booleanValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r0.metaData;
     */
    @android.annotation.TargetApi(21)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92868c() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f78335a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 1
            r2 = 0
            android.content.Context r3 = r5.f78335a     // Catch:{ NameNotFoundException -> 0x002a }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x002a }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x002a }
            if (r0 == 0) goto L_0x0029
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x002a }
            if (r0 == 0) goto L_0x0029
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x002a }
            java.lang.String r4 = "com.android.vending.splits.required"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ NameNotFoundException -> 0x002a }
            boolean r0 = r3.equals(r0)     // Catch:{ NameNotFoundException -> 0x002a }
            if (r0 == 0) goto L_0x0029
            return r1
        L_0x0029:
            return r2
        L_0x002a:
            com.google.android.play.core.internal.k r0 = f78334e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            android.content.Context r3 = r5.f78335a
            java.lang.String r3 = r3.getPackageName()
            r1[r2] = r3
            java.lang.String r3 = "App '%s' is not found in the PackageManager"
            r0.mo92779e(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.C32118f.mo92868c():boolean");
    }

    /* renamed from: d */
    public final Set<String> mo92869d() {
        String[] strArr;
        try {
            PackageInfo packageInfo = this.f78335a.getPackageManager().getPackageInfo(this.f78335a.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo == null || (strArr = packageInfo.splitNames) == null) {
                return hashSet;
            }
            Collections.addAll(hashSet, strArr);
            return hashSet;
        } catch (PackageManager.NameNotFoundException unused) {
            f78334e.mo92779e("App '%s' is not found in PackageManager", this.f78335a.getPackageName());
            return Collections.emptySet();
        }
    }

    @TargetApi(21)
    /* renamed from: f */
    public final List<ActivityManager.AppTask> mo92870f() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f78335a.getSystemService(C0696c.f2306r)).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }
}
