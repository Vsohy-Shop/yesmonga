package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import com.bumptech.glide.util.C22635o;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b0 */
public final class C22395b0 {

    /* renamed from: g */
    public static final String f57483g = "HardwareConfig";

    /* renamed from: h */
    public static final boolean f57484h;

    /* renamed from: i */
    public static final boolean f57485i;
    @C0344h1

    /* renamed from: j */
    public static final int f57486j = 128;

    /* renamed from: k */
    public static final int f57487k = 0;

    /* renamed from: l */
    public static final File f57488l = new File("/proc/self/fd");

    /* renamed from: m */
    public static final int f57489m = 50;

    /* renamed from: n */
    public static final int f57490n = 700;

    /* renamed from: o */
    public static final int f57491o = 20000;

    /* renamed from: p */
    public static final int f57492p = -1;

    /* renamed from: q */
    public static volatile C22395b0 f57493q;

    /* renamed from: r */
    public static volatile int f57494r = -1;

    /* renamed from: a */
    public final boolean f57495a = m101690h();

    /* renamed from: b */
    public final int f57496b;

    /* renamed from: c */
    public final int f57497c;
    @C0323b0("this")

    /* renamed from: d */
    public int f57498d;
    @C0323b0("this")

    /* renamed from: e */
    public boolean f57499e = true;

    /* renamed from: f */
    public final AtomicBoolean f57500f = new AtomicBoolean(false);

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        f57484h = z;
        if (i < 26) {
            z2 = false;
        }
        f57485i = z2;
    }

    @C0344h1
    public C22395b0() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57496b = 20000;
            this.f57497c = 0;
            return;
        }
        this.f57496b = 700;
        this.f57497c = 128;
    }

    /* renamed from: d */
    public static C22395b0 m101689d() {
        if (f57493q == null) {
            synchronized (C22395b0.class) {
                if (f57493q == null) {
                    f57493q = new C22395b0();
                }
            }
        }
        return f57493q;
    }

    /* renamed from: h */
    public static boolean m101690h() {
        return !m101691i() && !m101692j();
    }

    /* renamed from: i */
    public static boolean m101691i() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m101692j() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    /* renamed from: a */
    public boolean mo66402a() {
        C22635o.m102627b();
        return !this.f57500f.get();
    }

    /* renamed from: b */
    public final boolean mo66403b() {
        if (!f57484h || this.f57500f.get()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo66404c() {
        C22635o.m102627b();
        this.f57500f.set(false);
    }

    /* renamed from: e */
    public final int mo66405e() {
        if (f57494r != -1) {
            return f57494r;
        }
        return this.f57496b;
    }

    /* renamed from: f */
    public final synchronized boolean mo66406f() {
        boolean z = true;
        int i = this.f57498d + 1;
        this.f57498d = i;
        if (i >= 50) {
            this.f57498d = 0;
            int length = f57488l.list().length;
            long e = (long) mo66405e();
            if (((long) length) >= e) {
                z = false;
            }
            this.f57499e = z;
            if (!z && Log.isLoggable(C22439v.f57566f, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(e);
            }
        }
        return this.f57499e;
    }

    /* renamed from: g */
    public boolean mo66407g(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && this.f57495a && f57485i && !mo66403b() && !z2 && i >= (i3 = this.f57497c) && i2 >= i3 && mo66406f()) {
            return true;
        }
        return false;
    }

    @TargetApi(26)
    /* renamed from: k */
    public boolean mo66408k(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean g = mo66407g(i, i2, z, z2);
        if (g) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return g;
    }

    /* renamed from: l */
    public void mo66409l() {
        C22635o.m102627b();
        this.f57500f.set(true);
    }
}
