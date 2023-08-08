package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.load.engine.cache.l */
public final class C22208l {

    /* renamed from: e */
    public static final String f57035e = "MemorySizeCalculator";
    @C0344h1

    /* renamed from: f */
    public static final int f57036f = 4;

    /* renamed from: g */
    public static final int f57037g = 2;

    /* renamed from: a */
    public final int f57038a;

    /* renamed from: b */
    public final int f57039b;

    /* renamed from: c */
    public final Context f57040c;

    /* renamed from: d */
    public final int f57041d;

    /* renamed from: com.bumptech.glide.load.engine.cache.l$a */
    public static final class C22209a {
        @C0344h1

        /* renamed from: i */
        public static final int f57042i = 2;

        /* renamed from: j */
        public static final int f57043j = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: k */
        public static final float f57044k = 0.4f;

        /* renamed from: l */
        public static final float f57045l = 0.33f;

        /* renamed from: m */
        public static final int f57046m = 4194304;

        /* renamed from: a */
        public final Context f57047a;

        /* renamed from: b */
        public ActivityManager f57048b;

        /* renamed from: c */
        public C22211c f57049c;

        /* renamed from: d */
        public float f57050d = 2.0f;

        /* renamed from: e */
        public float f57051e = ((float) f57043j);

        /* renamed from: f */
        public float f57052f = 0.4f;

        /* renamed from: g */
        public float f57053g = 0.33f;

        /* renamed from: h */
        public int f57054h = 4194304;

        public C22209a(Context context) {
            this.f57047a = context;
            this.f57048b = (ActivityManager) context.getSystemService(C0696c.f2306r);
            this.f57049c = new C22210b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C22208l.m101115e(this.f57048b)) {
                this.f57051e = 0.0f;
            }
        }

        /* renamed from: a */
        public C22208l mo66053a() {
            return new C22208l(this);
        }

        @C0344h1
        /* renamed from: b */
        public C22209a mo66054b(ActivityManager activityManager) {
            this.f57048b = activityManager;
            return this;
        }

        /* renamed from: c */
        public C22209a mo66055c(int i) {
            this.f57054h = i;
            return this;
        }

        /* renamed from: d */
        public C22209a mo66056d(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C22633m.m102621a(z, "Bitmap pool screens must be greater than or equal to 0");
            this.f57051e = f;
            return this;
        }

        /* renamed from: e */
        public C22209a mo66057e(float f) {
            boolean z;
            if (f < 0.0f || f > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            C22633m.m102621a(z, "Low memory max size multiplier must be between 0 and 1");
            this.f57053g = f;
            return this;
        }

        /* renamed from: f */
        public C22209a mo66058f(float f) {
            boolean z;
            if (f < 0.0f || f > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            C22633m.m102621a(z, "Size multiplier must be between 0 and 1");
            this.f57052f = f;
            return this;
        }

        /* renamed from: g */
        public C22209a mo66059g(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C22633m.m102621a(z, "Memory cache screens must be greater than or equal to 0");
            this.f57050d = f;
            return this;
        }

        @C0344h1
        /* renamed from: h */
        public C22209a mo66060h(C22211c cVar) {
            this.f57049c = cVar;
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.l$b */
    public static final class C22210b implements C22211c {

        /* renamed from: a */
        public final DisplayMetrics f57055a;

        public C22210b(DisplayMetrics displayMetrics) {
            this.f57055a = displayMetrics;
        }

        /* renamed from: a */
        public int mo66061a() {
            return this.f57055a.heightPixels;
        }

        /* renamed from: b */
        public int mo66062b() {
            return this.f57055a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.l$c */
    public interface C22211c {
        /* renamed from: a */
        int mo66061a();

        /* renamed from: b */
        int mo66062b();
    }

    public C22208l(C22209a aVar) {
        int i;
        boolean z;
        this.f57040c = aVar.f57047a;
        if (m101115e(aVar.f57048b)) {
            i = aVar.f57054h / 2;
        } else {
            i = aVar.f57054h;
        }
        this.f57041d = i;
        int c = m101114c(aVar.f57048b, aVar.f57052f, aVar.f57053g);
        float b = (float) (aVar.f57049c.mo66062b() * aVar.f57049c.mo66061a() * 4);
        int round = Math.round(aVar.f57051e * b);
        int round2 = Math.round(b * aVar.f57050d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f57039b = round2;
            this.f57038a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f57051e;
            float f3 = aVar.f57050d;
            float f4 = f / (f2 + f3);
            this.f57039b = Math.round(f3 * f4);
            this.f57038a = Math.round(f4 * aVar.f57051e);
        }
        if (Log.isLoggable(f57035e, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(mo66052f(this.f57039b));
            sb.append(", pool size: ");
            sb.append(mo66052f(this.f57038a));
            sb.append(", byte array size: ");
            sb.append(mo66052f(i));
            sb.append(", memory class limited? ");
            if (i3 > c) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(mo66052f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f57048b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m101115e(aVar.f57048b));
        }
    }

    /* renamed from: c */
    public static int m101114c(ActivityManager activityManager, float f, float f2) {
        boolean e = m101115e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    public static boolean m101115e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int mo66049a() {
        return this.f57041d;
    }

    /* renamed from: b */
    public int mo66050b() {
        return this.f57038a;
    }

    /* renamed from: d */
    public int mo66051d() {
        return this.f57039b;
    }

    /* renamed from: f */
    public final String mo66052f(int i) {
        return Formatter.formatFileSize(this.f57040c, (long) i);
    }
}
