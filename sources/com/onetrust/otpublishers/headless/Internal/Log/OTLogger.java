package com.onetrust.otpublishers.headless.Internal.Log;

import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OTLogger {

    /* renamed from: a */
    public static int f85122a = 4;

    /* renamed from: b */
    public static String f85123b;

    /* renamed from: c */
    public static File f85124c;

    /* renamed from: d */
    public static BufferedWriter f85125d;

    /* renamed from: e */
    public static int f85126e;

    /* renamed from: f */
    public static int f85127f;

    /* renamed from: g */
    public static boolean f85128g;

    /* renamed from: h */
    public static boolean f85129h;

    /* renamed from: a */
    public static int m143446a(int i, @C0359n0 String str, @C0359n0 String str2) {
        int i2 = f85122a;
        if (i2 != -1 && i2 <= i) {
            switch (i) {
                case 2:
                    return Log.v(str, str2);
                case 3:
                    return Log.d(str, str2);
                case 4:
                    return Log.i(str, str2);
                case 5:
                    return Log.w(str, str2);
                case 6:
                    return Log.e(str, str2);
                case 7:
                    return Log.wtf(str, str2);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m143447b(@C0359n0 String str, @C0359n0 String str2) {
        return m143456k(3, str, str2);
    }

    /* renamed from: c */
    public static String m143448c(@C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3) {
        return String.format("%s: /%s %s - %s", new Object[]{m143455j(), str, str2, str3});
    }

    /* renamed from: d */
    public static void m143449d(int i) {
        f85122a = i;
    }

    /* renamed from: e */
    public static void m143450e(int i, @C0359n0 String str, @C0363p0 String str2, Throwable th) {
        if (i >= f85126e && f85125d != null) {
            try {
                if (m143452g()) {
                    f85125d = new BufferedWriter(new FileWriter(f85124c, true));
                }
                f85125d.write(m143448c(i == 2 ? C19135a.f48877X4 : i == 3 ? EnergyLabelKt.f67709g : i == 4 ? "I" : i == 5 ? C19135a.f48841T4 : i == 6 ? "E" : i == 7 ? "A" : "", str, str2));
                f85125d.newLine();
                if (th != null) {
                    f85125d.write(Log.getStackTraceString(th));
                    f85125d.newLine();
                }
                f85125d.flush();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error : ");
                sb.append(e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static void m143451f(boolean z, boolean z2) {
        f85128g = z;
        f85129h = z2;
    }

    /* renamed from: g */
    public static boolean m143452g() {
        try {
            if (f85124c.length() > ((long) f85127f)) {
                File file = new File(f85123b + ".old");
                if (file.exists()) {
                    boolean delete = file.delete();
                    StringBuilder sb = new StringBuilder();
                    sb.append("file deleted : ");
                    sb.append(delete);
                }
                boolean renameTo = f85124c.renameTo(file);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file renamed : ");
                sb2.append(renameTo);
                File file2 = new File(f85123b);
                f85124c = file2;
                boolean createNewFile = file2.createNewFile();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("file created  : ");
                sb3.append(createNewFile);
                return true;
            }
        } catch (IOException e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Error : ");
            sb4.append(e.getMessage());
        }
        return false;
    }

    /* renamed from: h */
    public static int m143453h(int i, @C0359n0 String str, @C0359n0 String str2) {
        if ((!f85129h || !f85128g) && (!f85128g || i <= 3)) {
            return 0;
        }
        m143459n(i, str, str2);
        return 0;
    }

    /* renamed from: i */
    public static int m143454i(@C0359n0 String str, @C0359n0 String str2) {
        if (!C35020d.m143605J(str2)) {
            m143458m("OTLogger", "device : " + str + " - " + str2);
        }
        m143450e(4, str, str2, (Throwable) null);
        return Log.v(str, str2);
    }

    /* renamed from: j */
    public static String m143455j() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error : ");
            sb.append(e.getMessage());
            return null;
        }
    }

    /* renamed from: k */
    public static int m143456k(int i, @C0359n0 String str, @C0359n0 String str2) {
        int a = m143446a(i, str, str2);
        m143453h(i, str, str2);
        return a;
    }

    /* renamed from: l */
    public static int m143457l(@C0359n0 String str, @C0359n0 String str2) {
        return m143456k(6, str, str2);
    }

    /* renamed from: m */
    public static int m143458m(@C0359n0 String str, @C0359n0 String str2) {
        return m143456k(4, str, str2);
    }

    /* renamed from: n */
    public static void m143459n(int i, @C0359n0 String str, @C0359n0 String str2) {
        m143450e(i, str, str2, (Throwable) null);
    }

    /* renamed from: o */
    public static int m143460o(@C0359n0 String str, @C0359n0 String str2) {
        return m143456k(2, str, str2);
    }

    @Keep
    public static void open(@C0359n0 String str, int i, int i2) {
        f85123b = str;
        f85126e = i;
        f85127f = i2;
        File file = new File(f85123b);
        f85124c = file;
        if (!file.exists()) {
            try {
                boolean createNewFile = f85124c.createNewFile();
                StringBuilder sb = new StringBuilder();
                sb.append("file deleted in open method : ");
                sb.append(createNewFile);
                f85125d = new BufferedWriter(new FileWriter(f85124c, true));
                new C34996a().mo103915a();
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error : ");
                sb2.append(e.getMessage());
            }
        }
        m143452g();
        try {
            f85125d = new BufferedWriter(new FileWriter(f85124c, true));
        } catch (IOException e2) {
            Log.getStackTraceString(e2);
        }
    }

    /* renamed from: p */
    public static int m143461p(@C0359n0 String str, @C0359n0 String str2) {
        return m143456k(5, str, str2);
    }
}
