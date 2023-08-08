package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.i */
public class C20009i {

    /* renamed from: A */
    public static final int f51218A = 14;

    /* renamed from: B */
    public static final int f51219B = 15;

    /* renamed from: C */
    public static final int f51220C = 16;

    /* renamed from: a */
    public static final String f51221a = "ProfileInstaller";

    /* renamed from: b */
    public static final String f51222b = "/data/misc/profiles/cur/0";

    /* renamed from: c */
    public static final String f51223c = "primary.prof";

    /* renamed from: d */
    public static final String f51224d = "dexopt/baseline.prof";

    /* renamed from: e */
    public static final String f51225e = "dexopt/baseline.profm";

    /* renamed from: f */
    public static final String f51226f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* renamed from: g */
    public static final C20013d f51227g = new C20010a();
    @C0359n0

    /* renamed from: h */
    public static final C20013d f51228h = new C20011b();

    /* renamed from: i */
    public static final int f51229i = 1;

    /* renamed from: j */
    public static final int f51230j = 2;

    /* renamed from: k */
    public static final int f51231k = 3;

    /* renamed from: l */
    public static final int f51232l = 4;

    /* renamed from: m */
    public static final int f51233m = 5;

    /* renamed from: n */
    public static final int f51234n = 1;

    /* renamed from: o */
    public static final int f51235o = 2;

    /* renamed from: p */
    public static final int f51236p = 3;

    /* renamed from: q */
    public static final int f51237q = 4;

    /* renamed from: r */
    public static final int f51238r = 5;

    /* renamed from: s */
    public static final int f51239s = 6;

    /* renamed from: t */
    public static final int f51240t = 7;

    /* renamed from: u */
    public static final int f51241u = 8;

    /* renamed from: v */
    public static final int f51242v = 9;

    /* renamed from: w */
    public static final int f51243w = 10;

    /* renamed from: x */
    public static final int f51244x = 11;

    /* renamed from: y */
    public static final int f51245y = 12;

    /* renamed from: z */
    public static final int f51246z = 13;

    /* renamed from: androidx.profileinstaller.i$a */
    public class C20010a implements C20013d {
        /* renamed from: a */
        public void mo59255a(int i, @C0363p0 Object obj) {
        }

        /* renamed from: b */
        public void mo59256b(int i, @C0363p0 Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.i$b */
    public class C20011b implements C20013d {

        /* renamed from: a */
        public static final String f51247a = "ProfileInstaller";

        /* renamed from: a */
        public void mo59255a(int i, @C0363p0 Object obj) {
            switch (i) {
            }
            if (i == 6 || i == 7 || i == 8) {
                Throwable th = (Throwable) obj;
            }
        }

        /* renamed from: b */
        public void mo59256b(int i, @C0363p0 Object obj) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.profileinstaller.i$c */
    public @interface C20012c {
    }

    /* renamed from: androidx.profileinstaller.i$d */
    public interface C20013d {
        /* renamed from: a */
        void mo59255a(int i, @C0363p0 Object obj);

        /* renamed from: b */
        void mo59256b(int i, @C0363p0 Object obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.profileinstaller.i$e */
    public @interface C20014e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public static boolean m92992c(@C0359n0 File file) {
        return new File(file, f51226f).delete();
    }

    @C0348i1
    /* renamed from: d */
    public static void m92993d(@C0359n0 Context context, @C0359n0 Executor executor, @C0359n0 C20013d dVar) {
        m92992c(context.getFilesDir());
        m92999j(executor, dVar, 11, (Object) null);
    }

    /* renamed from: e */
    public static void m92994e(@C0359n0 Executor executor, @C0359n0 C20013d dVar, int i, @C0363p0 Object obj) {
        executor.execute(new C20008h(dVar, i, obj));
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: f */
    public static boolean m92995f(PackageInfo packageInfo, File file, C20013d dVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, f51226f);
        boolean z = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z = true;
            }
            if (z) {
                dVar.mo59255a(2, (Object) null);
            }
            return z;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public static void m92998i(@C0359n0 PackageInfo packageInfo, @C0359n0 File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f51226f)));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: j */
    public static void m92999j(@C0359n0 Executor executor, @C0359n0 C20013d dVar, int i, @C0363p0 Object obj) {
        executor.execute(new C20007g(dVar, i, obj));
    }

    /* renamed from: k */
    public static boolean m93000k(@C0359n0 AssetManager assetManager, @C0359n0 String str, @C0359n0 PackageInfo packageInfo, @C0359n0 File file, @C0359n0 String str2, @C0359n0 Executor executor, @C0359n0 C20013d dVar) {
        C20003c cVar = new C20003c(assetManager, executor, dVar, str2, f51224d, f51225e, new File(new File(f51222b, str), "primary.prof"));
        if (!cVar.mo59263e()) {
            return false;
        }
        boolean n = cVar.mo59266i().mo59269m().mo59270n();
        if (n) {
            m92998i(packageInfo, file);
        }
        return n;
    }

    @C0348i1
    /* renamed from: l */
    public static void m93001l(@C0359n0 Context context) {
        m93002m(context, new C20006f(), f51227g);
    }

    @C0348i1
    /* renamed from: m */
    public static void m93002m(@C0359n0 Context context, @C0359n0 Executor executor, @C0359n0 C20013d dVar) {
        m93003n(context, executor, dVar, false);
    }

    @C0348i1
    /* renamed from: n */
    public static void m93003n(@C0359n0 Context context, @C0359n0 Executor executor, @C0359n0 C20013d dVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z || !m92995f(packageInfo, filesDir, dVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Installing profile for ");
                sb.append(context.getPackageName());
                if (m93000k(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z) {
                    z2 = true;
                }
                C20022q.m93058e(context, z2);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping profile installation for ");
            sb2.append(context.getPackageName());
            C20022q.m93058e(context, false);
        } catch (PackageManager.NameNotFoundException e) {
            dVar.mo59255a(7, e);
            C20022q.m93058e(context, false);
        }
    }

    @C0348i1
    /* renamed from: o */
    public static void m93004o(@C0359n0 Context context, @C0359n0 Executor executor, @C0359n0 C20013d dVar) {
        try {
            m92998i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m92999j(executor, dVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            m92999j(executor, dVar, 7, e);
        }
    }
}
