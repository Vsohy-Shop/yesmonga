package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32029a1;
import com.google.android.play.core.internal.C32062k;
import com.urbanairship.iam.C9206k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
public final class C31906c0 {

    /* renamed from: c */
    public static final C32062k f77809c = new C32062k("AssetPackStorage");

    /* renamed from: d */
    public static final long f77810d;

    /* renamed from: e */
    public static final long f77811e;

    /* renamed from: a */
    public final Context f77812a;

    /* renamed from: b */
    public final C31918e2 f77813b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f77810d = timeUnit.toMillis(14);
        f77811e = timeUnit.toMillis(28);
    }

    public C31906c0(Context context, C31918e2 e2Var) {
        this.f77812a = context;
        this.f77813b = e2Var;
    }

    /* renamed from: g */
    public static void m129419g(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long j = m129422j(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(j)) && !file2.getName().equals("stale.tmp")) {
                    m129424p(file2);
                }
            }
        }
    }

    /* renamed from: h */
    public static long m129420h(File file) {
        return m129421i(file, true);
    }

    /* renamed from: i */
    public static long m129421i(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f77809c.mo92779e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f77809c.mo92777c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: j */
    public static long m129422j(File file) {
        return m129421i(file, false);
    }

    /* renamed from: k */
    public static List<String> m129423k(PackageInfo packageInfo, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = packageInfo.splitNames;
        if (strArr == null) {
            return arrayList;
        }
        int i = (-Arrays.binarySearch(strArr, str)) - 1;
        while (true) {
            String[] strArr2 = packageInfo.splitNames;
            if (i >= strArr2.length || !strArr2[i].startsWith(str)) {
                return arrayList;
            }
            arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i]);
            i++;
        }
        return arrayList;
    }

    /* renamed from: p */
    public static boolean m129424p(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File p : listFiles) {
                z &= m129424p(p);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* renamed from: A */
    public final int mo92497A(String str, int i, long j) throws IOException {
        File f = mo92518f(str, i, j);
        if (!f.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(f);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C31904bk("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C31904bk("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: B */
    public final void mo92498B(String str, int i, long j, int i2) throws IOException {
        File f = mo92518f(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        f.getParentFile().mkdirs();
        f.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* renamed from: C */
    public final File mo92499C(String str, int i, long j, String str2) {
        return new File(mo92501E(str, i, j, str2), "checkpoint.dat");
    }

    /* renamed from: D */
    public final File mo92500D(String str, int i, long j, String str2) {
        return new File(mo92501E(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* renamed from: E */
    public final File mo92501E(String str, int i, long j, String str2) {
        return new File(mo92502F(str, i, j), str2);
    }

    /* renamed from: F */
    public final File mo92502F(String str, int i, long j) {
        return new File(new File(mo92520m(str, i, j), "_slices"), "_metadata");
    }

    /* renamed from: G */
    public final boolean mo92503G(String str) {
        if (!mo92517e(str).exists()) {
            return true;
        }
        return m129424p(mo92517e(str));
    }

    /* renamed from: H */
    public final void mo92504H(String str, int i, long j) {
        File e = mo92517e(str);
        if (e.exists()) {
            for (File file : e.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m129424p(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m129424p(file2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo92505I() {
        for (File next : mo92519l()) {
            if (next.listFiles() != null) {
                m129419g(next);
                long j = m129422j(next);
                if (((long) this.f77813b.mo92553a()) != j) {
                    try {
                        new File(new File(next, String.valueOf(j)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f77809c.mo92776b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File g : next.listFiles()) {
                    m129419g(g);
                }
            }
        }
    }

    /* renamed from: J */
    public final int mo92506J(String str) {
        return (int) m129420h(mo92517e(str));
    }

    /* renamed from: K */
    public final long mo92507K(String str) {
        return m129420h(mo92516d(str, mo92506J(str)));
    }

    /* renamed from: L */
    public final void mo92508L() {
        for (File next : mo92519l()) {
            if (next.listFiles() != null) {
                for (File file : next.listFiles()) {
                    File file2 = new File(file, "stale.tmp");
                    if (file2.exists() && System.currentTimeMillis() - file2.lastModified() > f77811e) {
                        m129424p(file);
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo92509M() {
        if (mo92521n().exists()) {
            for (File file : mo92521n().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f77810d) {
                    m129424p(file);
                } else {
                    m129419g(file);
                }
            }
        }
    }

    /* renamed from: N */
    public final void mo92510N() {
        m129424p(mo92522o());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    @android.support.annotation.Nullable
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C31894a mo92511O(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r8.f77812a     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.Context r3 = r8.f77812a     // Catch:{ NameNotFoundException -> 0x0013 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x001d
        L_0x0013:
            com.google.android.play.core.internal.k r2 = f77809c
            java.lang.String r3 = "Could not find PackageInfo."
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r2.mo92776b(r3, r4)
            r2 = r1
        L_0x001d:
            r3 = 1
            if (r2 != 0) goto L_0x0022
            r4 = r1
            goto L_0x0077
        L_0x0022:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String[] r5 = r2.splitNames
            if (r5 == 0) goto L_0x004b
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo
            java.lang.String[] r6 = r6.splitSourceDirs
            if (r6 != 0) goto L_0x0032
            goto L_0x004b
        L_0x0032:
            int r5 = java.util.Arrays.binarySearch(r5, r9)
            if (r5 >= 0) goto L_0x0044
            com.google.android.play.core.internal.k r5 = f77809c
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r0] = r9
            java.lang.String r7 = "Asset Pack '%s' is not installed."
            r5.mo92775a(r7, r6)
            goto L_0x0056
        L_0x0044:
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo
            java.lang.String[] r6 = r6.splitSourceDirs
            r5 = r6[r5]
            goto L_0x0057
        L_0x004b:
            com.google.android.play.core.internal.k r5 = f77809c
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r0] = r9
            java.lang.String r7 = "No splits present for package %s."
            r5.mo92775a(r7, r6)
        L_0x0056:
            r5 = r1
        L_0x0057:
            if (r5 != 0) goto L_0x0063
            android.content.pm.ApplicationInfo r5 = r2.applicationInfo
            java.lang.String r5 = r5.sourceDir
            r4.add(r5)
            java.lang.String r5 = "config."
            goto L_0x0070
        L_0x0063:
            r4.add(r5)
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.String r6 = ".config."
            java.lang.String r5 = r5.concat(r6)
        L_0x0070:
            java.util.List r2 = m129423k(r2, r5)
            r4.addAll(r2)
        L_0x0077:
            if (r4 != 0) goto L_0x007a
            goto L_0x00bd
        L_0x007a:
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "assets"
            r2.<init>(r5, r10)
            java.lang.String r2 = r2.getPath()
            java.util.Iterator r5 = r4.iterator()
        L_0x0089:
            boolean r6 = r5.hasNext()
            r7 = 2
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.play.core.assetpacks.a r6 = com.google.android.play.core.assetpacks.C31987t1.m129667b(r6, r2)     // Catch:{ IOException -> 0x009e }
            if (r6 == 0) goto L_0x0089
            r1 = r6
            goto L_0x00bd
        L_0x009e:
            r9 = move-exception
            com.google.android.play.core.internal.k r2 = f77809c
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r0] = r6
            r4[r3] = r10
            java.lang.String r10 = "Failed to parse APK file '%s' looking for asset '%s'."
            r2.mo92777c(r9, r10, r4)
            goto L_0x00bd
        L_0x00ad:
            com.google.android.play.core.internal.k r2 = f77809c
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r10
            r5[r3] = r9
            r5[r7] = r4
            java.lang.String r9 = "The asset %s is not present in Asset Pack %s. Searched in APKs: %s"
            r2.mo92775a(r9, r5)
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C31906c0.mo92511O(java.lang.String, java.lang.String):com.google.android.play.core.assetpacks.a");
    }

    @Nullable
    /* renamed from: P */
    public final C31894a mo92512P(String str, String str2, C31899b bVar) {
        File file = new File(bVar.mo92482b(), str2);
        if (file.exists()) {
            return C31894a.m129392a(file.getPath(), 0, file.length());
        }
        f77809c.mo92775a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str2, str, bVar.mo92482b());
        return null;
    }

    /* renamed from: a */
    public final void mo92513a(List<String> list) {
        int a = this.f77813b.mo92553a();
        for (File next : mo92519l()) {
            if (!list.contains(next.getName()) && m129420h(next) != ((long) a)) {
                m129424p(next);
            }
        }
    }

    /* renamed from: b */
    public final void mo92514b(String str, int i, long j) {
        if (mo92520m(str, i, j).exists()) {
            m129424p(mo92520m(str, i, j));
        }
    }

    /* renamed from: c */
    public final void mo92515c(String str, int i, long j) {
        if (mo92528v(str, i, j).exists()) {
            m129424p(mo92528v(str, i, j));
        }
    }

    /* renamed from: d */
    public final File mo92516d(String str, int i) {
        return new File(mo92517e(str), String.valueOf(i));
    }

    /* renamed from: e */
    public final File mo92517e(String str) {
        return new File(mo92522o(), str);
    }

    /* renamed from: f */
    public final File mo92518f(String str, int i, long j) {
        return new File(mo92532z(str, i, j), "merge.tmp");
    }

    /* renamed from: l */
    public final List<File> mo92519l() {
        ArrayList arrayList = new ArrayList();
        try {
            if (mo92522o().exists()) {
                if (mo92522o().listFiles() != null) {
                    for (File file : mo92522o().listFiles()) {
                        if (!file.getCanonicalPath().equals(mo92521n().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f77809c.mo92776b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: m */
    public final File mo92520m(String str, int i, long j) {
        return new File(new File(new File(mo92521n(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: n */
    public final File mo92521n() {
        return new File(mo92522o(), "_tmp");
    }

    /* renamed from: o */
    public final File mo92522o() {
        return new File(this.f77812a.getFilesDir(), "assetpacks");
    }

    /* renamed from: q */
    public final boolean mo92523q(String str) {
        try {
            return mo92527u(str) != null;
        } catch (IOException unused) {
        }
    }

    /* renamed from: r */
    public final Map<String, C31899b> mo92524r() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : mo92519l()) {
                C31899b t = mo92526t(next.getName());
                if (t != null) {
                    hashMap.put(next.getName(), t);
                }
            }
        } catch (IOException e) {
            f77809c.mo92776b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* renamed from: s */
    public final Map<String, Long> mo92525s() {
        HashMap hashMap = new HashMap();
        for (String next : mo92524r().keySet()) {
            hashMap.put(next, Long.valueOf(mo92507K(next)));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: t */
    public final C31899b mo92526t(String str) throws IOException {
        String u = mo92527u(str);
        if (u == null) {
            return null;
        }
        File file = new File(u, C9206k.f25062a1);
        if (file.isDirectory()) {
            return C31899b.m129400c(u, file.getCanonicalPath());
        }
        f77809c.mo92776b("Failed to find assets directory: %s", file);
        return null;
    }

    @Nullable
    /* renamed from: u */
    public final String mo92527u(String str) throws IOException {
        int length;
        File file = new File(mo92522o(), str);
        if (!file.exists()) {
            f77809c.mo92775a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f77813b.mo92553a()));
        if (!file2.exists()) {
            f77809c.mo92775a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f77813b.mo92553a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f77809c.mo92775a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f77813b.mo92553a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f77809c.mo92776b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f77813b.mo92553a()));
            return null;
        }
    }

    /* renamed from: v */
    public final File mo92528v(String str, int i, long j) {
        return new File(mo92516d(str, i), String.valueOf(j));
    }

    /* renamed from: w */
    public final File mo92529w(String str, int i, long j) {
        return new File(mo92528v(str, i, j), "_metadata");
    }

    /* renamed from: x */
    public final File mo92530x(String str, int i, long j, String str2) {
        return new File(new File(new File(mo92520m(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: y */
    public final File mo92531y(String str, int i, long j, String str2) {
        return new File(new File(new File(mo92520m(str, i, j), "_slices"), "_verified"), str2);
    }

    /* renamed from: z */
    public final File mo92532z(String str, int i, long j) {
        return new File(mo92520m(str, i, j), "_packs");
    }
}
