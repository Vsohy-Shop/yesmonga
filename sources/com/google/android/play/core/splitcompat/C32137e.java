package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.C32028a0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.e */
public final class C32137e {

    /* renamed from: a */
    public final long f78361a;

    /* renamed from: b */
    public final Context f78362b;

    /* renamed from: c */
    public File f78363c;

    public C32137e(Context context) throws PackageManager.NameNotFoundException {
        this.f78362b = context;
        this.f78361a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: o */
    public static void m130065o(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File o : listFiles) {
                m130065o(o);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: u */
    public static File m130066u(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: v */
    public static String m130067v(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: w */
    public static void m130068w(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: a */
    public final void mo92886a() throws IOException {
        File r = mo92902r();
        String[] list = r.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f78361a))) {
                    File file = new File(r, str);
                    String valueOf = String.valueOf(file);
                    long j = this.f78361a;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    m130065o(file);
                }
            }
        }
    }

    /* renamed from: b */
    public final File mo92887b(String str) throws IOException {
        return m130066u(mo92892g(), m130067v(str));
    }

    /* renamed from: c */
    public final File mo92888c(String str) throws IOException {
        return m130066u(mo92900p(), m130067v(str));
    }

    /* renamed from: d */
    public final File mo92889d(File file) throws IOException {
        return m130066u(mo92900p(), file.getName());
    }

    /* renamed from: e */
    public final File mo92890e(String str, String str2) throws IOException {
        return m130066u(mo92904t(str), str2);
    }

    /* renamed from: f */
    public final File mo92891f() throws IOException {
        return new File(mo92901q(), "lock.tmp");
    }

    /* renamed from: g */
    public final File mo92892g() throws IOException {
        File file = new File(mo92901q(), "unverified-splits");
        m130068w(file);
        return file;
    }

    /* renamed from: h */
    public final File mo92893h(String str) throws IOException {
        File file = new File(mo92901q(), "dex");
        m130068w(file);
        File u = m130066u(file, str);
        m130068w(u);
        return u;
    }

    /* renamed from: i */
    public final Set<C32151s> mo92894i() throws IOException {
        File p = mo92900p();
        HashSet hashSet = new HashSet();
        File[] listFiles = p.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C32151s(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: j */
    public final List<String> mo92895j() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = mo92903s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void mo92896k(String str) throws IOException {
        m130065o(mo92904t(str));
    }

    /* renamed from: l */
    public final void mo92897l(File file) throws IOException {
        C32028a0.m129763c(file.getParentFile().getParentFile().equals(mo92903s()), "File to remove is not a native library");
        m130065o(file);
    }

    /* renamed from: m */
    public final Set<File> mo92898m(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = mo92904t(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: n */
    public final void mo92899n(String str) throws IOException {
        m130065o(mo92888c(str));
    }

    /* renamed from: p */
    public final File mo92900p() throws IOException {
        File file = new File(mo92901q(), "verified-splits");
        m130068w(file);
        return file;
    }

    /* renamed from: q */
    public final File mo92901q() throws IOException {
        File file = new File(mo92902r(), Long.toString(this.f78361a));
        m130068w(file);
        return file;
    }

    /* renamed from: r */
    public final File mo92902r() throws IOException {
        if (this.f78363c == null) {
            Context context = this.f78362b;
            if (context != null) {
                this.f78363c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f78363c, "splitcompat");
        m130068w(file);
        return file;
    }

    /* renamed from: s */
    public final File mo92903s() throws IOException {
        File file = new File(mo92901q(), "native-libraries");
        m130068w(file);
        return file;
    }

    /* renamed from: t */
    public final File mo92904t(String str) throws IOException {
        File u = m130066u(mo92903s(), str);
        m130068w(u);
        return u;
    }
}
