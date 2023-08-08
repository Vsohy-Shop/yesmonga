package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.C0696c;
import androidx.compose.p004ui.graphics.vector.C15369g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.bumptech.glide.manager.C22509f;
import com.google.firebase.crashlytics.internal.C32741f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import org.joda.time.DateTimeFieldType;

public class CommonUtils {

    /* renamed from: a */
    public static final String f79238a = "SHA-1";

    /* renamed from: b */
    public static final String f79239b = "goldfish";

    /* renamed from: c */
    public static final String f79240c = "ranchu";

    /* renamed from: d */
    public static final String f79241d = "sdk";

    /* renamed from: e */
    public static final String f79242e = "com.google.firebase.crashlytics";

    /* renamed from: f */
    public static final String f79243f = "com.crashlytics.prefs";

    /* renamed from: g */
    public static final char[] f79244g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37993s, 'b', C15369g.f37985k, 'd', 'e', 'f'};

    /* renamed from: h */
    public static final String f79245h = "com.google.firebase.crashlytics.mapping_file_id";

    /* renamed from: i */
    public static final String f79246i = "com.crashlytics.android.build_id";

    /* renamed from: j */
    public static final String f79247j = "com.google.firebase.crashlytics.build_ids_lib";

    /* renamed from: k */
    public static final String f79248k = "com.google.firebase.crashlytics.build_ids_arch";

    /* renamed from: l */
    public static final String f79249l = "com.google.firebase.crashlytics.build_ids_build_id";

    /* renamed from: m */
    public static final long f79250m = -1;

    /* renamed from: n */
    public static final int f79251n = 1073741824;

    /* renamed from: o */
    public static final int f79252o = 1048576;

    /* renamed from: p */
    public static final int f79253p = 1024;

    /* renamed from: q */
    public static long f79254q = -1;

    /* renamed from: r */
    public static final int f79255r = 1;

    /* renamed from: s */
    public static final int f79256s = 2;

    /* renamed from: t */
    public static final int f79257t = 4;

    /* renamed from: u */
    public static final int f79258u = 8;

    /* renamed from: v */
    public static final int f79259v = 16;

    /* renamed from: w */
    public static final int f79260w = 32;

    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: y */
        public static final Map<String, Architecture> f79271y = null;

        /* access modifiers changed from: public */
        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            f79271y = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        /* renamed from: g */
        public static Architecture m131945g() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C32741f.m132248f().mo95060k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = f79271y.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                return UNKNOWN;
            }
            return architecture;
        }
    }

    /* renamed from: A */
    public static boolean m131911A() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: B */
    public static boolean m131912B() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (str.contains(f79239b) || str.contains(f79240c)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m131913C(Context context) {
        return false;
    }

    /* renamed from: D */
    public static boolean m131914D() {
        boolean B = m131912B();
        String str = Build.TAGS;
        if ((!B && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (B || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m131915E(@C0363p0 String str, @C0363p0 String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: F */
    public static String m131916F(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: G */
    public static String m131917G(String str) {
        return m131941w(str, f79238a);
    }

    /* renamed from: H */
    public static String m131918H(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    /* renamed from: a */
    public static long m131919a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(C0696c.f2306r)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m131920b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m131921c(Context context) {
        if (!m131922d(context, C22509f.f57696b)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m131922d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m131923e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C32741f.m132248f().mo95055e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m131924f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static long m131925g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m131926h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m131917G(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m131927i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m131923e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            com.google.firebase.crashlytics.internal.f r3 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo95055e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m131923e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.m131927i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m131928j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C0696c.f2306r)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m131929k(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int s = m131937s(context, str, "bool");
            if (s > 0) {
                return resources.getBoolean(s);
            }
            int s2 = m131937s(context, str, C16717v.C16719b.f42182e);
            if (s2 > 0) {
                return Boolean.parseBoolean(context.getString(s2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static List<C32675e> m131930l(Context context) {
        ArrayList arrayList = new ArrayList();
        int s = m131937s(context, f79247j, "array");
        int s2 = m131937s(context, f79248k, "array");
        int s3 = m131937s(context, f79249l, "array");
        if (s == 0 || s2 == 0 || s3 == 0) {
            C32741f.m132248f().mo95052b(String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3)}));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(s);
        String[] stringArray2 = context.getResources().getStringArray(s2);
        String[] stringArray3 = context.getResources().getStringArray(s3);
        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
            for (int i = 0; i < stringArray3.length; i++) {
                arrayList.add(new C32675e(stringArray[i], stringArray2[i], stringArray3[i]));
            }
            return arrayList;
        }
        C32741f.m132248f().mo95052b(String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)}));
        return arrayList;
    }

    /* renamed from: m */
    public static int m131931m() {
        return Architecture.m131945g().ordinal();
    }

    /* renamed from: n */
    public static int m131932n() {
        boolean B = m131912B();
        if (m131914D()) {
            B |= true;
        }
        return m131911A() ? B | true ? 1 : 0 : B ? 1 : 0;
    }

    /* renamed from: o */
    public static SharedPreferences m131933o(Context context) {
        return context.getSharedPreferences(f79243f, 0);
    }

    /* renamed from: p */
    public static String m131934p(Context context) {
        int s = m131937s(context, f79245h, C16717v.C16719b.f42182e);
        if (s == 0) {
            s = m131937s(context, f79246i, C16717v.C16719b.f42182e);
        }
        if (s != 0) {
            return context.getResources().getString(s);
        }
        return null;
    }

    /* renamed from: q */
    public static boolean m131935q(Context context) {
        if (!m131912B() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static String m131936r(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i);
            if ("android".equals(resourcePackageName)) {
                return context.getPackageName();
            }
            return resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: s */
    public static int m131937s(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m131936r(context));
    }

    /* renamed from: t */
    public static SharedPreferences m131938t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: u */
    public static String m131939u(Context context, String str) {
        int s = m131937s(context, str, C16717v.C16719b.f42182e);
        if (s > 0) {
            return context.getString(s);
        }
        return "";
    }

    /* renamed from: v */
    public static synchronized long m131940v() {
        long j;
        long g;
        synchronized (CommonUtils.class) {
            if (f79254q == -1) {
                String i = m131927i(new File("/proc/meminfo"), "MemTotal");
                long j2 = 0;
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            g = m131925g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            g = m131925g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            g = m131925g(upperCase, "GB", 1073741824);
                        } else {
                            C32741f f = C32741f.m132248f();
                            f.mo95062m("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                        j2 = g;
                    } catch (NumberFormatException e) {
                        C32741f f2 = C32741f.m132248f();
                        f2.mo95055e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f79254q = j2;
            }
            j = f79254q;
        }
        return j;
    }

    /* renamed from: w */
    public static String m131941w(String str, String str2) {
        return m131942x(str.getBytes(), str2);
    }

    /* renamed from: x */
    public static String m131942x(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m131943y(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C32741f f = C32741f.m132248f();
            f.mo95055e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: y */
    public static String m131943y(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f79244g;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & DateTimeFieldType.f30626Z];
        }
        return new String(cArr);
    }

    /* renamed from: z */
    public static boolean m131944z(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
