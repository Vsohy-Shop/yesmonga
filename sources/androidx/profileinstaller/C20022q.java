package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C16564b;
import com.google.common.util.concurrent.C32487a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* renamed from: androidx.profileinstaller.q */
public final class C20022q {

    /* renamed from: a */
    public static final String f51260a = "/data/misc/profiles/ref/";

    /* renamed from: b */
    public static final String f51261b = "/data/misc/profiles/cur/0/";

    /* renamed from: c */
    public static final String f51262c = "primary.prof";

    /* renamed from: d */
    public static final String f51263d = "profileInstalled";

    /* renamed from: e */
    public static final C16564b<C20025c> f51264e = C16564b.m75001t0();

    /* renamed from: f */
    public static final Object f51265f = new Object();

    /* renamed from: g */
    public static final String f51266g = "ProfileVerifier";
    @C0363p0

    /* renamed from: h */
    public static C20025c f51267h = null;

    @C0376v0(33)
    /* renamed from: androidx.profileinstaller.q$a */
    public static class C20023a {
        @C0373u
        /* renamed from: a */
        public static PackageInfo m93059a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.profileinstaller.q$b */
    public static class C20024b {

        /* renamed from: e */
        public static final int f51268e = 1;

        /* renamed from: a */
        public final int f51269a;

        /* renamed from: b */
        public final int f51270b;

        /* renamed from: c */
        public final long f51271c;

        /* renamed from: d */
        public final long f51272d;

        public C20024b(int i, int i2, long j, long j2) {
            this.f51269a = i;
            this.f51270b = i2;
            this.f51271c = j;
            this.f51272d = j2;
        }

        /* renamed from: a */
        public static C20024b m93060a(@C0359n0 File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                C20024b bVar = new C20024b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* renamed from: b */
        public void mo59278b(@C0359n0 File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f51269a);
                dataOutputStream.writeInt(this.f51270b);
                dataOutputStream.writeLong(this.f51271c);
                dataOutputStream.writeLong(this.f51272d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C20024b)) {
                return false;
            }
            C20024b bVar = (C20024b) obj;
            if (this.f51270b == bVar.f51270b && this.f51271c == bVar.f51271c && this.f51269a == bVar.f51269a && this.f51272d == bVar.f51272d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f51270b), Long.valueOf(this.f51271c), Integer.valueOf(this.f51269a), Long.valueOf(this.f51272d)});
        }
    }

    /* renamed from: androidx.profileinstaller.q$c */
    public static class C20025c {

        /* renamed from: d */
        public static final int f51273d = 16;

        /* renamed from: e */
        public static final int f51274e = 0;

        /* renamed from: f */
        public static final int f51275f = 1;

        /* renamed from: g */
        public static final int f51276g = 2;

        /* renamed from: h */
        public static final int f51277h = 3;

        /* renamed from: i */
        public static final int f51278i = 65536;

        /* renamed from: j */
        public static final int f51279j = 131072;

        /* renamed from: k */
        public static final int f51280k = 196608;

        /* renamed from: l */
        public static final int f51281l = 262144;

        /* renamed from: a */
        public final int f51282a;

        /* renamed from: b */
        public final boolean f51283b;

        /* renamed from: c */
        public final boolean f51284c;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.profileinstaller.q$c$a */
        public @interface C20026a {
        }

        public C20025c(int i, boolean z, boolean z2) {
            this.f51282a = i;
            this.f51284c = z2;
            this.f51283b = z;
        }

        /* renamed from: a */
        public int mo59281a() {
            return this.f51282a;
        }

        /* renamed from: b */
        public boolean mo59282b() {
            return this.f51284c;
        }

        /* renamed from: c */
        public boolean mo59283c() {
            return this.f51283b;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C32487a<C20025c> m93054a() {
        return f51264e;
    }

    /* renamed from: b */
    public static long m93055b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C20023a.m93059a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: c */
    public static C20025c m93056c(int i, boolean z, boolean z2) {
        C20025c cVar = new C20025c(i, z, z2);
        f51267h = cVar;
        f51264e.mo48106j0(cVar);
        return f51267h;
    }

    @C0348i1
    @C0359n0
    /* renamed from: d */
    public static C20025c m93057d(@C0359n0 Context context) {
        return m93058e(context, false);
    }

    @C0348i1
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public static C20025c m93058e(@C0359n0 Context context, boolean z) {
        boolean z2;
        boolean z3;
        C20024b bVar;
        C20024b bVar2;
        C20025c cVar;
        if (!z && (cVar = f51267h) != null) {
            return cVar;
        }
        synchronized (f51265f) {
            if (!z) {
                C20025c cVar2 = f51267h;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = 0;
            if (i >= 28) {
                if (i != 30) {
                    File file = new File(new File(f51260a, context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (!file.exists() || length <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    File file2 = new File(new File(f51261b, context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (!file2.exists() || length2 <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    try {
                        long b = m93055b(context);
                        File file3 = new File(context.getFilesDir(), f51263d);
                        if (file3.exists()) {
                            try {
                                bVar = C20024b.m93060a(file3);
                            } catch (IOException unused) {
                                return m93056c(131072, z2, z3);
                            }
                        } else {
                            bVar = null;
                        }
                        if (bVar != null && bVar.f51271c == b) {
                            int i3 = bVar.f51270b;
                            if (i3 != 2) {
                                i2 = i3;
                                if (z && z3 && i2 != 1) {
                                    i2 = 2;
                                }
                                if (bVar != null && bVar.f51270b == 2 && i2 == 1 && length < bVar.f51272d) {
                                    i2 = 3;
                                }
                                bVar2 = new C20024b(1, i2, b, length2);
                                if (bVar == null || !bVar.equals(bVar2)) {
                                    bVar2.mo59278b(file3);
                                }
                                C20025c c = m93056c(i2, z2, z3);
                                return c;
                            }
                        }
                        if (z2) {
                            i2 = 1;
                        } else if (z3) {
                            i2 = 2;
                        }
                        i2 = 2;
                        i2 = 3;
                        bVar2 = new C20024b(1, i2, b, length2);
                        try {
                            bVar2.mo59278b(file3);
                        } catch (IOException unused2) {
                            i2 = C20025c.f51280k;
                        }
                        C20025c c2 = m93056c(i2, z2, z3);
                        return c2;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return m93056c(65536, z2, z3);
                    }
                }
            }
            C20025c c3 = m93056c(262144, false, false);
            return c3;
        }
    }
}
