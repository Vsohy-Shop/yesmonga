package androidx.collection;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: androidx.collection.j */
public class C1879j<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f5132a;

    /* renamed from: b */
    public int f5133b;

    /* renamed from: c */
    public int f5134c;

    /* renamed from: d */
    public int f5135d;

    /* renamed from: e */
    public int f5136e;

    /* renamed from: f */
    public int f5137f;

    /* renamed from: g */
    public int f5138g;

    /* renamed from: h */
    public int f5139h;

    public C1879j(int i) {
        if (i > 0) {
            this.f5134c = i;
            this.f5132a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    @C0363p0
    /* renamed from: a */
    public V mo6133a(@C0359n0 K k) {
        return null;
    }

    /* renamed from: b */
    public final synchronized int mo6243b() {
        return this.f5136e;
    }

    /* renamed from: c */
    public void mo6134c(boolean z, @C0359n0 K k, @C0359n0 V v, @C0363p0 V v2) {
    }

    /* renamed from: d */
    public final void mo6244d() {
        mo6257r(-1);
    }

    /* renamed from: e */
    public final synchronized int mo6245e() {
        return this.f5137f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = mo6133a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f5136e++;
        r1 = r4.f5132a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4.f5132a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.f5133b += mo6254n(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        mo6134c(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        mo6257r(r4.f5134c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    @androidx.annotation.C0363p0
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo6246f(@androidx.annotation.C0359n0 K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f5132a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f5138g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f5138g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f5139h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f5139h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.mo6133a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f5136e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f5136e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.f5132a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f5132a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f5133b     // Catch:{ all -> 0x004e }
            int r3 = r4.mo6254n(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f5133b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.mo6134c(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f5134c
            r4.mo6257r(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1879j.mo6246f(java.lang.Object):java.lang.Object");
    }

    /* renamed from: g */
    public final synchronized int mo6247g() {
        return this.f5138g;
    }

    /* renamed from: h */
    public final synchronized int mo6248h() {
        return this.f5134c;
    }

    /* renamed from: i */
    public final synchronized int mo6249i() {
        return this.f5139h;
    }

    @C0363p0
    /* renamed from: j */
    public final V mo6250j(@C0359n0 K k, @C0359n0 V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f5135d++;
            this.f5133b += mo6254n(k, v);
            put = this.f5132a.put(k, v);
            if (put != null) {
                this.f5133b -= mo6254n(k, put);
            }
        }
        if (put != null) {
            mo6134c(false, k, put, v);
        }
        mo6257r(this.f5134c);
        return put;
    }

    /* renamed from: k */
    public final synchronized int mo6251k() {
        return this.f5135d;
    }

    @C0363p0
    /* renamed from: l */
    public final V mo6252l(@C0359n0 K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f5132a.remove(k);
                if (remove != null) {
                    this.f5133b -= mo6254n(k, remove);
                }
            }
            if (remove != null) {
                mo6134c(false, k, remove, (V) null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: m */
    public void mo6253m(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f5134c = i;
            }
            mo6257r(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: n */
    public final int mo6254n(K k, V v) {
        int p = mo6135p(k, v);
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: o */
    public final synchronized int mo6255o() {
        return this.f5133b;
    }

    /* renamed from: p */
    public int mo6135p(@C0359n0 K k, @C0359n0 V v) {
        return 1;
    }

    /* renamed from: q */
    public final synchronized Map<K, V> mo6256q() {
        return new LinkedHashMap(this.f5132a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6257r(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f5133b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f5132a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f5133b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f5133b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f5132a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f5132a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f5132a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f5133b     // Catch:{ all -> 0x0071 }
            int r3 = r4.mo6254n(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f5133b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f5137f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f5137f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo6134c(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1879j.mo6257r(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f5138g;
        int i3 = this.f5139h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f5134c), Integer.valueOf(this.f5138g), Integer.valueOf(this.f5139h), Integer.valueOf(i)});
    }
}
