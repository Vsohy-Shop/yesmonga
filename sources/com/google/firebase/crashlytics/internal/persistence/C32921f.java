package com.google.firebase.crashlytics.internal.persistence;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.C32741f;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.f */
public class C32921f {

    /* renamed from: g */
    public static final String f79936g = ".com.google.firebase.crashlytics.files.v1";

    /* renamed from: h */
    public static final String f79937h = ".com.google.firebase.crashlytics.files.v2";

    /* renamed from: i */
    public static final String f79938i = "open-sessions";

    /* renamed from: j */
    public static final String f79939j = "native";

    /* renamed from: k */
    public static final String f79940k = "reports";

    /* renamed from: l */
    public static final String f79941l = "priority-reports";

    /* renamed from: m */
    public static final String f79942m = "native-reports";

    /* renamed from: a */
    public final File f79943a;

    /* renamed from: b */
    public final File f79944b;

    /* renamed from: c */
    public final File f79945c;

    /* renamed from: d */
    public final File f79946d;

    /* renamed from: e */
    public final File f79947e;

    /* renamed from: f */
    public final File f79948f;

    public C32921f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f79943a = filesDir;
        if (m133052w()) {
            str = f79937h + File.pathSeparator + m133051v(Application.getProcessName());
        } else {
            str = f79936g;
        }
        File r = m133047r(new File(filesDir, str));
        this.f79944b = r;
        this.f79945c = m133047r(new File(r, f79938i));
        this.f79946d = m133047r(new File(r, f79940k));
        this.f79947e = m133047r(new File(r, f79941l));
        this.f79948f = m133047r(new File(r, f79942m));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.io.File m133047r(java.io.File r4) {
        /*
            java.lang.Class<com.google.firebase.crashlytics.internal.persistence.f> r0 = com.google.firebase.crashlytics.internal.persistence.C32921f.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            com.google.firebase.crashlytics.internal.f r1 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo95052b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            com.google.firebase.crashlytics.internal.f r1 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo95054d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.C32921f.m133047r(java.io.File):java.io.File");
    }

    /* renamed from: s */
    public static File m133048s(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: t */
    public static boolean m133049t(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File t : listFiles) {
                m133049t(t);
            }
        }
        return file.delete();
    }

    /* renamed from: u */
    public static <T> List<T> m133050u(@C0363p0 T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @C0344h1
    /* renamed from: v */
    public static String m133051v(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", C32920e.f79928l);
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: w */
    public static boolean m133052w() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public final void mo95563a(File file) {
        if (file.exists() && m133049t(file)) {
            C32741f f = C32741f.m132248f();
            f.mo95052b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: b */
    public void mo95564b() {
        mo95563a(new File(this.f79943a, ".com.google.firebase.crashlytics"));
        mo95563a(new File(this.f79943a, ".com.google.firebase.crashlytics-ndk"));
        if (m133052w()) {
            mo95563a(new File(this.f79943a, f79936g));
        }
    }

    @C0344h1
    /* renamed from: c */
    public void mo95565c() {
        m133049t(this.f79944b);
    }

    /* renamed from: d */
    public boolean mo95566d(String str) {
        return m133049t(new File(this.f79945c, str));
    }

    /* renamed from: e */
    public List<String> mo95567e() {
        return m133050u(this.f79945c.list());
    }

    /* renamed from: f */
    public File mo95568f(String str) {
        return new File(this.f79944b, str);
    }

    /* renamed from: g */
    public List<File> mo95569g(FilenameFilter filenameFilter) {
        return m133050u(this.f79944b.listFiles(filenameFilter));
    }

    /* renamed from: h */
    public File mo95570h(String str) {
        return new File(this.f79948f, str);
    }

    /* renamed from: i */
    public List<File> mo95571i() {
        return m133050u(this.f79948f.listFiles());
    }

    /* renamed from: j */
    public File mo95572j(String str) {
        return m133048s(new File(mo95577o(str), f79939j));
    }

    /* renamed from: k */
    public File mo95573k(String str) {
        return new File(this.f79947e, str);
    }

    /* renamed from: l */
    public List<File> mo95574l() {
        return m133050u(this.f79947e.listFiles());
    }

    /* renamed from: m */
    public File mo95575m(String str) {
        return new File(this.f79946d, str);
    }

    /* renamed from: n */
    public List<File> mo95576n() {
        return m133050u(this.f79946d.listFiles());
    }

    /* renamed from: o */
    public final File mo95577o(String str) {
        return m133048s(new File(this.f79945c, str));
    }

    /* renamed from: p */
    public File mo95578p(String str, String str2) {
        return new File(mo95577o(str), str2);
    }

    /* renamed from: q */
    public List<File> mo95579q(String str, FilenameFilter filenameFilter) {
        return m133050u(mo95577o(str).listFiles(filenameFilter));
    }
}
