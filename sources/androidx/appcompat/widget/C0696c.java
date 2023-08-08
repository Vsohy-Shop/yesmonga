package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.appcompat.widget.c */
public class C0696c extends DataSetObservable {

    /* renamed from: A */
    public static final Object f2300A = new Object();

    /* renamed from: B */
    public static final Map<String, C0696c> f2301B = new HashMap();

    /* renamed from: n */
    public static final boolean f2302n = false;

    /* renamed from: o */
    public static final String f2303o = "c";

    /* renamed from: p */
    public static final String f2304p = "historical-records";

    /* renamed from: q */
    public static final String f2305q = "historical-record";

    /* renamed from: r */
    public static final String f2306r = "activity";

    /* renamed from: s */
    public static final String f2307s = "time";

    /* renamed from: t */
    public static final String f2308t = "weight";

    /* renamed from: u */
    public static final String f2309u = "activity_choser_model_history.xml";

    /* renamed from: v */
    public static final int f2310v = 50;

    /* renamed from: w */
    public static final int f2311w = 5;

    /* renamed from: x */
    public static final float f2312x = 1.0f;

    /* renamed from: y */
    public static final String f2313y = ".xml";

    /* renamed from: z */
    public static final int f2314z = -1;

    /* renamed from: a */
    public final Object f2315a = new Object();

    /* renamed from: b */
    public final List<C0698b> f2316b = new ArrayList();

    /* renamed from: c */
    public final List<C0701e> f2317c = new ArrayList();

    /* renamed from: d */
    public final Context f2318d;

    /* renamed from: e */
    public final String f2319e;

    /* renamed from: f */
    public Intent f2320f;

    /* renamed from: g */
    public C0699c f2321g = new C0700d();

    /* renamed from: h */
    public int f2322h = 50;

    /* renamed from: i */
    public boolean f2323i = true;

    /* renamed from: j */
    public boolean f2324j = false;

    /* renamed from: k */
    public boolean f2325k = true;

    /* renamed from: l */
    public boolean f2326l = false;

    /* renamed from: m */
    public C0702f f2327m;

    /* renamed from: androidx.appcompat.widget.c$a */
    public interface C0697a {
        void setActivityChooserModel(C0696c cVar);
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    public static final class C0698b implements Comparable<C0698b> {

        /* renamed from: a */
        public final ResolveInfo f2328a;

        /* renamed from: b */
        public float f2329b;

        public C0698b(ResolveInfo resolveInfo) {
            this.f2328a = resolveInfo;
        }

        /* renamed from: b */
        public int compareTo(C0698b bVar) {
            return Float.floatToIntBits(bVar.f2329b) - Float.floatToIntBits(this.f2329b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0698b.class == obj.getClass() && Float.floatToIntBits(this.f2329b) == Float.floatToIntBits(((C0698b) obj).f2329b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f2329b) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.f2328a.toString() + "; weight:" + new BigDecimal((double) this.f2329b) + "]";
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    public interface C0699c {
        /* renamed from: a */
        void mo3328a(Intent intent, List<C0698b> list, List<C0701e> list2);
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public static final class C0700d implements C0699c {

        /* renamed from: b */
        public static final float f2330b = 0.95f;

        /* renamed from: a */
        public final Map<ComponentName, C0698b> f2331a = new HashMap();

        /* renamed from: a */
        public void mo3328a(Intent intent, List<C0698b> list, List<C0701e> list2) {
            Map<ComponentName, C0698b> map = this.f2331a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0698b bVar = list.get(i);
                bVar.f2329b = 0.0f;
                ActivityInfo activityInfo = bVar.f2328a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C0701e eVar = list2.get(size2);
                C0698b bVar2 = map.get(eVar.f2332a);
                if (bVar2 != null) {
                    bVar2.f2329b += eVar.f2334c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    public static final class C0701e {

        /* renamed from: a */
        public final ComponentName f2332a;

        /* renamed from: b */
        public final long f2333b;

        /* renamed from: c */
        public final float f2334c;

        public C0701e(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0701e.class != obj.getClass()) {
                return false;
            }
            C0701e eVar = (C0701e) obj;
            ComponentName componentName = this.f2332a;
            if (componentName == null) {
                if (eVar.f2332a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f2332a)) {
                return false;
            }
            if (this.f2333b == eVar.f2333b && Float.floatToIntBits(this.f2334c) == Float.floatToIntBits(eVar.f2334c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            ComponentName componentName = this.f2332a;
            if (componentName == null) {
                i = 0;
            } else {
                i = componentName.hashCode();
            }
            long j = this.f2333b;
            return ((((i + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f2334c);
        }

        public String toString() {
            return "[" + "; activity:" + this.f2332a + "; time:" + this.f2333b + "; weight:" + new BigDecimal((double) this.f2334c) + "]";
        }

        public C0701e(ComponentName componentName, long j, float f) {
            this.f2332a = componentName;
            this.f2333b = j;
            this.f2334c = f;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    public interface C0702f {
        /* renamed from: a */
        boolean mo3266a(C0696c cVar, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.c$g */
    public final class C0703g extends AsyncTask<Object, Void, Void> {
        public C0703g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0 = androidx.appcompat.widget.C0696c.f2303o;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.f2335a.f2319e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
            r14.f2335a.f2323i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = androidx.appcompat.widget.C0696c.f2303o;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.f2335a.f2319e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
            r14.f2335a.f2323i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r0 = androidx.appcompat.widget.C0696c.f2303o;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.f2335a.f2319e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
            r14.f2335a.f2323i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
            r14.f2335a.f2323i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
            if (r15 != null) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0073, B:18:0x008b, B:22:0x00a3] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00a3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.c r7 = androidx.appcompat.widget.C0696c.this     // Catch:{ FileNotFoundException -> 0x00c6 }
                android.content.Context r7 = r7.f2318d     // Catch:{ FileNotFoundException -> 0x00c6 }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00c6 }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r9 = r3
            L_0x002f:
                if (r9 >= r8) goto L_0x0061
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                androidx.appcompat.widget.c$e r10 = (androidx.appcompat.widget.C0696c.C0701e) r10     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.f2332a     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "time"
                long r12 = r10.f2333b     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "weight"
                float r10 = r10.f2334c     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0696c.this
                r0.f2323i = r5
                if (r15 == 0) goto L_0x00bb
            L_0x006d:
                r15.close()     // Catch:{ IOException -> 0x00bb }
                goto L_0x00bb
            L_0x0071:
                r0 = move-exception
                goto L_0x00bc
            L_0x0073:
                java.lang.String r0 = androidx.appcompat.widget.C0696c.f2303o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0696c.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.f2319e     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0696c.this
                r0.f2323i = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x008b:
                java.lang.String r0 = androidx.appcompat.widget.C0696c.f2303o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0696c.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.f2319e     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0696c.this
                r0.f2323i = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x00a3:
                java.lang.String r0 = androidx.appcompat.widget.C0696c.f2303o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0696c.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.f2319e     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0696c.this
                r0.f2323i = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x00bb:
                return r6
            L_0x00bc:
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0696c.this
                r1.f2323i = r5
                if (r15 == 0) goto L_0x00c5
                r15.close()     // Catch:{ IOException -> 0x00c5 }
            L_0x00c5:
                throw r0
            L_0x00c6:
                java.lang.String r0 = androidx.appcompat.widget.C0696c.f2303o
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r15)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0696c.C0703g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public C0696c(Context context, String str) {
        this.f2318d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f2313y)) {
            this.f2319e = str;
            return;
        }
        this.f2319e = str + f2313y;
    }

    /* renamed from: d */
    public static C0696c m3383d(Context context, String str) {
        C0696c cVar;
        synchronized (f2300A) {
            Map<String, C0696c> map = f2301B;
            cVar = map.get(str);
            if (cVar == null) {
                cVar = new C0696c(context, str);
                map.put(str, cVar);
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public final boolean mo3302a(C0701e eVar) {
        boolean add = this.f2317c.add(eVar);
        if (add) {
            this.f2325k = true;
            mo3314n();
            mo3313m();
            mo3322v();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public Intent mo3303b(int i) {
        synchronized (this.f2315a) {
            if (this.f2320f == null) {
                return null;
            }
            mo3304c();
            ActivityInfo activityInfo = this.f2316b.get(i).f2328a.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f2320f);
            intent.setComponent(componentName);
            if (this.f2327m != null) {
                if (this.f2327m.mo3266a(this, new Intent(intent))) {
                    return null;
                }
            }
            mo3302a(new C0701e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: c */
    public final void mo3304c() {
        boolean l = mo3312l() | mo3315o();
        mo3314n();
        if (l) {
            mo3322v();
            notifyChanged();
        }
    }

    /* renamed from: e */
    public ResolveInfo mo3305e(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f2315a) {
            mo3304c();
            resolveInfo = this.f2316b.get(i).f2328a;
        }
        return resolveInfo;
    }

    /* renamed from: f */
    public int mo3306f() {
        int size;
        synchronized (this.f2315a) {
            mo3304c();
            size = this.f2316b.size();
        }
        return size;
    }

    /* renamed from: g */
    public int mo3307g(ResolveInfo resolveInfo) {
        synchronized (this.f2315a) {
            mo3304c();
            List<C0698b> list = this.f2316b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f2328a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: h */
    public ResolveInfo mo3308h() {
        synchronized (this.f2315a) {
            mo3304c();
            if (this.f2316b.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f2316b.get(0).f2328a;
            return resolveInfo;
        }
    }

    /* renamed from: i */
    public int mo3309i() {
        int i;
        synchronized (this.f2315a) {
            i = this.f2322h;
        }
        return i;
    }

    /* renamed from: j */
    public int mo3310j() {
        int size;
        synchronized (this.f2315a) {
            mo3304c();
            size = this.f2317c.size();
        }
        return size;
    }

    /* renamed from: k */
    public Intent mo3311k() {
        Intent intent;
        synchronized (this.f2315a) {
            intent = this.f2320f;
        }
        return intent;
    }

    /* renamed from: l */
    public final boolean mo3312l() {
        if (!this.f2326l || this.f2320f == null) {
            return false;
        }
        this.f2326l = false;
        this.f2316b.clear();
        List<ResolveInfo> queryIntentActivities = this.f2318d.getPackageManager().queryIntentActivities(this.f2320f, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f2316b.add(new C0698b(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: m */
    public final void mo3313m() {
        if (!this.f2324j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f2325k) {
            this.f2325k = false;
            if (!TextUtils.isEmpty(this.f2319e)) {
                new C0703g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f2317c), this.f2319e});
            }
        }
    }

    /* renamed from: n */
    public final void mo3314n() {
        int size = this.f2317c.size() - this.f2322h;
        if (size > 0) {
            this.f2325k = true;
            for (int i = 0; i < size; i++) {
                C0701e remove = this.f2317c.remove(0);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo3315o() {
        if (!this.f2323i || !this.f2325k || TextUtils.isEmpty(this.f2319e)) {
            return false;
        }
        this.f2323i = false;
        this.f2324j = true;
        mo3316p();
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3316p() {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.f2318d     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r2 = r10.f2319e     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x00ac }
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3 = 0
        L_0x0014:
            r4 = 1
            if (r3 == r4) goto L_0x001f
            r5 = 2
            if (r3 == r5) goto L_0x001f
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            goto L_0x0014
        L_0x001f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r3 == 0) goto L_0x007b
            java.util.List<androidx.appcompat.widget.c$e> r3 = r10.f2317c     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3.clear()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x0030:
            int r5 = r2.next()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r5 != r4) goto L_0x003c
            if (r1 == 0) goto L_0x00a5
        L_0x0038:
            r1.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00a5
        L_0x003c:
            r6 = 3
            if (r5 == r6) goto L_0x0030
            r6 = 4
            if (r5 != r6) goto L_0x0043
            goto L_0x0030
        L_0x0043:
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            androidx.appcompat.widget.c$e r9 = new androidx.appcompat.widget.c$e     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r9.<init>((java.lang.String) r5, (long) r7, (float) r6)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3.add(r9)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            goto L_0x0030
        L_0x0073:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x007b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x0083:
            r0 = move-exception
            goto L_0x00a6
        L_0x0085:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r10.f2319e     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x00a5
            goto L_0x0038
        L_0x0095:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r10.f2319e     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x00a5
            goto L_0x0038
        L_0x00a5:
            return
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            throw r0
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0696c.mo3316p():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3317q(androidx.appcompat.widget.C0696c.C0699c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2315a
            monitor-enter(r0)
            androidx.appcompat.widget.c$c r1 = r2.f2321g     // Catch:{ all -> 0x0016 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            r2.f2321g = r3     // Catch:{ all -> 0x0016 }
            boolean r3 = r2.mo3322v()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0696c.mo3317q(androidx.appcompat.widget.c$c):void");
    }

    /* renamed from: r */
    public void mo3318r(int i) {
        float f;
        synchronized (this.f2315a) {
            mo3304c();
            C0698b bVar = this.f2316b.get(i);
            C0698b bVar2 = this.f2316b.get(0);
            if (bVar2 != null) {
                f = (bVar2.f2329b - bVar.f2329b) + 5.0f;
            } else {
                f = 1.0f;
            }
            ActivityInfo activityInfo = bVar.f2328a.activityInfo;
            mo3302a(new C0701e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3319s(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2315a
            monitor-enter(r0)
            int r1 = r2.f2322h     // Catch:{ all -> 0x0019 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0009:
            r2.f2322h = r3     // Catch:{ all -> 0x0019 }
            r2.mo3314n()     // Catch:{ all -> 0x0019 }
            boolean r3 = r2.mo3322v()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0696c.mo3319s(int):void");
    }

    /* renamed from: t */
    public void mo3320t(Intent intent) {
        synchronized (this.f2315a) {
            if (this.f2320f != intent) {
                this.f2320f = intent;
                this.f2326l = true;
                mo3304c();
            }
        }
    }

    /* renamed from: u */
    public void mo3321u(C0702f fVar) {
        synchronized (this.f2315a) {
            this.f2327m = fVar;
        }
    }

    /* renamed from: v */
    public final boolean mo3322v() {
        if (this.f2321g == null || this.f2320f == null || this.f2316b.isEmpty() || this.f2317c.isEmpty()) {
            return false;
        }
        this.f2321g.mo3328a(this.f2320f, this.f2316b, Collections.unmodifiableList(this.f2317c));
        return true;
    }
}
