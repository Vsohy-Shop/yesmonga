package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.model.C22319l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.bumptech.glide.util.o */
public final class C22635o {

    /* renamed from: a */
    public static final int f58029a = 31;

    /* renamed from: b */
    public static final int f58030b = 17;

    /* renamed from: c */
    public static final char[] f58031c = "0123456789abcdef".toCharArray();

    /* renamed from: d */
    public static final char[] f58032d = new char[64];
    @C0363p0

    /* renamed from: e */
    public static volatile Handler f58033e;

    /* renamed from: com.bumptech.glide.util.o$a */
    public static /* synthetic */ class C22636a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58034a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58034a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58034a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58034a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f58034a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.util.C22635o.C22636a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m102626a() {
        if (!m102645t()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m102627b() {
        if (!m102646u()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m102628c(@C0363p0 Object obj, @C0363p0 Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof C22319l) {
            return ((C22319l) obj).mo66297a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: d */
    public static boolean m102629d(@C0363p0 Object obj, @C0363p0 Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @C0359n0
    /* renamed from: e */
    public static String m102630e(@C0359n0 byte[] bArr, @C0359n0 char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f58031c;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & DateTimeFieldType.f30626Z];
        }
        return new String(cArr);
    }

    @C0359n0
    /* renamed from: f */
    public static <T> Queue<T> m102631f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m102632g(int i, int i2, @C0363p0 Bitmap.Config config) {
        return i * i2 * m102634i(config);
    }

    @TargetApi(19)
    /* renamed from: h */
    public static int m102633h(@C0359n0 Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    /* renamed from: i */
    public static int m102634i(@C0363p0 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C22636a.f58034a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    @Deprecated
    /* renamed from: j */
    public static int m102635j(@C0359n0 Bitmap bitmap) {
        return m102633h(bitmap);
    }

    @C0359n0
    /* renamed from: k */
    public static <T> List<T> m102636k(@C0359n0 Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static Handler m102637l() {
        if (f58033e == null) {
            synchronized (C22635o.class) {
                if (f58033e == null) {
                    f58033e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f58033e;
    }

    /* renamed from: m */
    public static int m102638m(float f) {
        return m102639n(f, 17);
    }

    /* renamed from: n */
    public static int m102639n(float f, int i) {
        return m102641p(Float.floatToIntBits(f), i);
    }

    /* renamed from: o */
    public static int m102640o(int i) {
        return m102641p(i, 17);
    }

    /* renamed from: p */
    public static int m102641p(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: q */
    public static int m102642q(@C0363p0 Object obj, int i) {
        return m102641p(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: r */
    public static int m102643r(boolean z) {
        return m102644s(z, 17);
    }

    /* renamed from: s */
    public static int m102644s(boolean z, int i) {
        return m102641p(z ? 1 : 0, i);
    }

    /* renamed from: t */
    public static boolean m102645t() {
        return !m102646u();
    }

    /* renamed from: u */
    public static boolean m102646u() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: v */
    public static boolean m102647v(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: w */
    public static boolean m102648w(int i, int i2) {
        return m102647v(i) && m102647v(i2);
    }

    /* renamed from: x */
    public static void m102649x(Runnable runnable) {
        m102637l().post(runnable);
    }

    /* renamed from: y */
    public static void m102650y(Runnable runnable) {
        m102637l().removeCallbacks(runnable);
    }

    @C0359n0
    /* renamed from: z */
    public static String m102651z(@C0359n0 byte[] bArr) {
        String e;
        char[] cArr = f58032d;
        synchronized (cArr) {
            e = m102630e(bArr, cArr);
        }
        return e;
    }
}
