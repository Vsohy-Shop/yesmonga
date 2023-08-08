package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.util.C22635o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.C12361b;

@C0376v0(19)
/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.n */
public class C22177n implements C22175l {

    /* renamed from: d */
    public static final int f56984d = 8;

    /* renamed from: e */
    public static final Bitmap.Config[] f56985e;

    /* renamed from: f */
    public static final Bitmap.Config[] f56986f;

    /* renamed from: g */
    public static final Bitmap.Config[] f56987g = {Bitmap.Config.RGB_565};

    /* renamed from: h */
    public static final Bitmap.Config[] f56988h = {Bitmap.Config.ARGB_4444};

    /* renamed from: i */
    public static final Bitmap.Config[] f56989i = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C22180c f56990a = new C22180c();

    /* renamed from: b */
    public final C22165h<C22179b, Bitmap> f56991b = new C22165h<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f56992c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.n$a */
    public static /* synthetic */ class C22178a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56993a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56993a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56993a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56993a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56993a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.C22177n.C22178a.<clinit>():void");
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.n$c */
    public static class C22180c extends C22161d<C22179b> {
        /* renamed from: d */
        public C22179b mo65948a() {
            return new C22179b(this);
        }

        /* renamed from: e */
        public C22179b mo66011e(int i, Bitmap.Config config) {
            C22179b bVar = (C22179b) mo65951b();
            bVar.mo66006b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f56985e = configArr;
        f56986f = configArr;
    }

    /* renamed from: i */
    public static String m101029i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: j */
    public static Bitmap.Config[] m101030j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f56986f;
        }
        int i = C22178a.f56993a[config.ordinal()];
        if (i == 1) {
            return f56985e;
        }
        if (i == 2) {
            return f56987g;
        }
        if (i == 3) {
            return f56988h;
        }
        if (i == 4) {
            return f56989i;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: a */
    public String mo65936a(Bitmap bitmap) {
        return m101029i(C22635o.m102633h(bitmap), bitmap.getConfig());
    }

    @C0363p0
    /* renamed from: b */
    public Bitmap mo65937b() {
        Bitmap f = this.f56991b.mo65966f();
        if (f != null) {
            mo66002g(Integer.valueOf(C22635o.m102633h(f)), f);
        }
        return f;
    }

    /* renamed from: c */
    public String mo65938c(int i, int i2, Bitmap.Config config) {
        return m101029i(C22635o.m102632g(i, i2, config), config);
    }

    /* renamed from: d */
    public void mo65939d(Bitmap bitmap) {
        C22179b e = this.f56990a.mo66011e(C22635o.m102633h(bitmap), bitmap.getConfig());
        this.f56991b.mo65965d(e, bitmap);
        NavigableMap<Integer, Integer> k = mo66004k(bitmap.getConfig());
        Integer num = k.get(Integer.valueOf(e.f56995b));
        Integer valueOf = Integer.valueOf(e.f56995b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: e */
    public int mo65940e(Bitmap bitmap) {
        return C22635o.m102633h(bitmap);
    }

    @C0363p0
    /* renamed from: f */
    public Bitmap mo65941f(int i, int i2, Bitmap.Config config) {
        C22179b h = mo66003h(C22635o.m102632g(i, i2, config), config);
        Bitmap a = this.f56991b.mo65962a(h);
        if (a != null) {
            mo66002g(Integer.valueOf(h.f56995b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: g */
    public final void mo66002g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = mo66004k(bitmap.getConfig());
        Integer num2 = k.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo65936a(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    public final C22179b mo66003h(int i, Bitmap.Config config) {
        C22179b e = this.f56990a.mo66011e(i, config);
        Bitmap.Config[] j = m101030j(config);
        int length = j.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = j[i2];
            Integer ceilingKey = mo66004k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f56990a.mo65952c(e);
                return this.f56990a.mo66011e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: k */
    public final NavigableMap<Integer, Integer> mo66004k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f56992c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f56992c.put(config, treeMap);
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f56991b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f56992c.entrySet()) {
            sb.append(next.getKey());
            sb.append(C12361b.f30260k);
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f56992c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.n$b */
    public static final class C22179b implements C22176m {

        /* renamed from: a */
        public final C22180c f56994a;

        /* renamed from: b */
        public int f56995b;

        /* renamed from: c */
        public Bitmap.Config f56996c;

        public C22179b(C22180c cVar) {
            this.f56994a = cVar;
        }

        /* renamed from: a */
        public void mo65943a() {
            this.f56994a.mo65952c(this);
        }

        /* renamed from: b */
        public void mo66006b(int i, Bitmap.Config config) {
            this.f56995b = i;
            this.f56996c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22179b)) {
                return false;
            }
            C22179b bVar = (C22179b) obj;
            if (this.f56995b != bVar.f56995b || !C22635o.m102629d(this.f56996c, bVar.f56996c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f56995b * 31;
            Bitmap.Config config = this.f56996c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C22177n.m101029i(this.f56995b, this.f56996c);
        }

        @C0344h1
        public C22179b(C22180c cVar, int i, Bitmap.Config config) {
            this(cVar);
            mo66006b(i, config);
        }
    }
}
