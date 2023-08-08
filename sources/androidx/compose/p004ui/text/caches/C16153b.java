package androidx.compose.p004ui.text.caches;

import androidx.compose.p004ui.text.platform.C16399y;
import androidx.compose.p004ui.text.platform.C16400z;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n349#1:353\n349#1:362\n349#1:364\n349#1:366\n349#1:368\n349#1:370\n349#1:372\n24#2:354\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:361\n24#2:363\n24#2:365\n24#2:367\n24#2:369\n24#2:371\n24#2:373\n24#2:374\n24#2:375\n24#2:376\n1#3:355\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n41#1:353\n296#1:362\n302#1:364\n308#1:366\n313#1:368\n318#1:370\n323#1:372\n41#1:354\n72#1:356\n87#1:357\n105#1:358\n143#1:359\n177#1:360\n219#1:361\n296#1:363\n302#1:365\n308#1:367\n313#1:369\n318#1:371\n323#1:373\n330#1:374\n340#1:375\n349#1:376\n*E\n"})
/* renamed from: androidx.compose.ui.text.caches.b */
public class C16153b<K, V> {
    @C12579k

    /* renamed from: a */
    public final C16400z f40155a = C16399y.m73981a();
    @C12579k

    /* renamed from: b */
    public final HashMap<K, V> f40156b;
    @C12579k

    /* renamed from: c */
    public final LinkedHashSet<K> f40157c;

    /* renamed from: d */
    public int f40158d;

    /* renamed from: e */
    public int f40159e;

    /* renamed from: f */
    public int f40160f;

    /* renamed from: g */
    public int f40161g;

    /* renamed from: h */
    public int f40162h;

    /* renamed from: i */
    public int f40163i;

    /* renamed from: j */
    public int f40164j;

    public C16153b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f40159e = i;
            this.f40156b = new HashMap<>(0, 0.75f);
            this.f40157c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    @C12580l
    /* renamed from: b */
    public V mo46623b(K k) {
        return null;
    }

    /* renamed from: c */
    public final int mo46624c() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40161g;
        }
        return i;
    }

    /* renamed from: d */
    public void mo46625d(boolean z, K k, V v, @C12580l V v2) {
    }

    /* renamed from: e */
    public final void mo46626e() {
        mo46641t(-1);
    }

    /* renamed from: f */
    public final int mo46627f() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40162h;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = mo46623b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r2 = r5.f40155a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.f40161g++;
        r3 = r5.f40156b.put(r6, r0);
        r5.f40157c.remove(r6);
        r5.f40157c.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r5.f40156b.put(r6, r3);
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r5.f40158d = mo46637p() + mo46636o(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r3 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        mo46625d(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        mo46641t(r5.f40159e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        return r0;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo46628g(K r6) {
        /*
            r5 = this;
            androidx.compose.ui.text.platform.z r0 = r5.f40155a
            monitor-enter(r0)
            java.util.HashMap<K, V> r1 = r5.f40156b     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x001d
            java.util.LinkedHashSet<K> r2 = r5.f40157c     // Catch:{ all -> 0x006c }
            r2.remove(r6)     // Catch:{ all -> 0x006c }
            java.util.LinkedHashSet<K> r2 = r5.f40157c     // Catch:{ all -> 0x006c }
            r2.add(r6)     // Catch:{ all -> 0x006c }
            int r6 = r5.f40163i     // Catch:{ all -> 0x006c }
            int r6 = r6 + 1
            r5.f40163i = r6     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return r1
        L_0x001d:
            int r2 = r5.f40164j     // Catch:{ all -> 0x006c }
            int r2 = r2 + 1
            r5.f40164j = r2     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            java.lang.Object r0 = r5.mo46623b(r6)
            if (r0 != 0) goto L_0x002c
            r6 = 0
            return r6
        L_0x002c:
            androidx.compose.ui.text.platform.z r2 = r5.f40155a
            monitor-enter(r2)
            int r3 = r5.f40161g     // Catch:{ all -> 0x0069 }
            int r3 = r3 + 1
            r5.f40161g = r3     // Catch:{ all -> 0x0069 }
            java.util.HashMap<K, V> r3 = r5.f40156b     // Catch:{ all -> 0x0069 }
            java.lang.Object r3 = r3.put(r6, r0)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.f40157c     // Catch:{ all -> 0x0069 }
            r4.remove(r6)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.f40157c     // Catch:{ all -> 0x0069 }
            r4.add(r6)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x004e
            java.util.HashMap<K, V> r1 = r5.f40156b     // Catch:{ all -> 0x0069 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0069 }
            r1 = r3
            goto L_0x0059
        L_0x004e:
            int r3 = r5.mo46637p()     // Catch:{ all -> 0x0069 }
            int r4 = r5.mo46636o(r6, r0)     // Catch:{ all -> 0x0069 }
            int r3 = r3 + r4
            r5.f40158d = r3     // Catch:{ all -> 0x0069 }
        L_0x0059:
            kotlin.d2 r3 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0063
            r2 = 0
            r5.mo46625d(r2, r6, r0, r1)
            return r1
        L_0x0063:
            int r6 = r5.f40159e
            r5.mo46641t(r6)
            return r0
        L_0x0069:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.caches.C16153b.mo46628g(java.lang.Object):java.lang.Object");
    }

    /* renamed from: h */
    public final int mo46629h() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40163i;
        }
        return i;
    }

    /* renamed from: i */
    public final int mo46630i() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40159e;
        }
        return i;
    }

    /* renamed from: j */
    public final int mo46631j() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40164j;
        }
        return i;
    }

    @C12580l
    /* renamed from: k */
    public final V mo46632k(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.f40155a) {
            this.f40160f++;
            this.f40158d = mo46637p() + mo46636o(k, v);
            put = this.f40156b.put(k, v);
            if (put != null) {
                this.f40158d = mo46637p() - mo46636o(k, put);
            }
            if (this.f40157c.contains(k)) {
                this.f40157c.remove(k);
            }
            this.f40157c.add(k);
        }
        if (put != null) {
            mo46625d(false, k, put, v);
        }
        mo46641t(this.f40159e);
        return put;
    }

    /* renamed from: l */
    public final int mo46633l() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40160f;
        }
        return i;
    }

    @C12580l
    /* renamed from: m */
    public final V mo46634m(K k) {
        V remove;
        k.getClass();
        synchronized (this.f40155a) {
            remove = this.f40156b.remove(k);
            this.f40157c.remove(k);
            if (remove != null) {
                this.f40158d = mo46637p() - mo46636o(k, remove);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
        if (remove != null) {
            mo46625d(false, k, remove, (V) null);
        }
        return remove;
    }

    /* renamed from: n */
    public void mo46635n(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this.f40155a) {
                this.f40159e = i;
                C11079d2 d2Var = C11079d2.f28267a;
            }
            mo46641t(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: o */
    public final int mo46636o(K k, V v) {
        boolean z;
        int q = mo46638q(k, v);
        if (q >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return q;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    @C11314h(name = "size")
    /* renamed from: p */
    public final int mo46637p() {
        int i;
        synchronized (this.f40155a) {
            i = this.f40158d;
        }
        return i;
    }

    /* renamed from: q */
    public int mo46638q(K k, V v) {
        return 1;
    }

    @C12579k
    /* renamed from: r */
    public final Map<K, V> mo46639r() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f40155a) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.f40157c.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v = this.f40156b.get(next);
                Intrinsics.checkNotNull(v);
                linkedHashMap.put(next, v);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: s */
    public final <R> R mo46640s(@C12579k C11289a<? extends R> aVar) {
        R invoke;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        synchronized (this.f40155a) {
            try {
                invoke = aVar.invoke();
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        return invoke;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46641t(int r8) {
        /*
            r7 = this;
        L_0x0000:
            androidx.compose.ui.text.platform.z r0 = r7.f40155a
            monitor-enter(r0)
            int r1 = r7.mo46637p()     // Catch:{ all -> 0x0091 }
            if (r1 < 0) goto L_0x0089
            java.util.HashMap<K, V> r1 = r7.f40156b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0017
            int r1 = r7.mo46637p()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0089
        L_0x0017:
            java.util.HashMap<K, V> r1 = r7.f40156b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r2 = r7.f40157c     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != r2) goto L_0x0089
            int r1 = r7.mo46637p()     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L_0x0074
            java.util.HashMap<K, V> r1 = r7.f40156b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0074
            java.util.LinkedHashSet<K> r1 = r7.f40157c     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40696u2(r1)     // Catch:{ all -> 0x0091 }
            java.util.HashMap<K, V> r4 = r7.f40156b     // Catch:{ all -> 0x0091 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<K, V> r5 = r7.f40156b     // Catch:{ all -> 0x0091 }
            java.util.Map r5 = kotlin.jvm.internal.C11370u0.m43695k(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r5 = r7.f40157c     // Catch:{ all -> 0x0091 }
            java.util.Collection r5 = kotlin.jvm.internal.C11370u0.m43685a(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            int r5 = r7.mo46637p()     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ all -> 0x0091 }
            int r6 = r7.mo46636o(r1, r4)     // Catch:{ all -> 0x0091 }
            int r5 = r5 - r6
            r7.f40158d = r5     // Catch:{ all -> 0x0091 }
            int r5 = r7.f40162h     // Catch:{ all -> 0x0091 }
            int r5 = r5 + r2
            r7.f40162h = r5     // Catch:{ all -> 0x0091 }
            goto L_0x0076
        L_0x006c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r1 = r3
            r4 = r1
        L_0x0076:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x007e
            if (r4 != 0) goto L_0x007e
            return
        L_0x007e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r7.mo46625d(r2, r1, r4, r3)
            goto L_0x0000
        L_0x0089:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.caches.C16153b.mo46641t(int):void");
    }

    @C12579k
    public String toString() {
        int i;
        String str;
        synchronized (this.f40155a) {
            int i2 = this.f40163i;
            int i3 = this.f40164j + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.f40159e + ",hits=" + this.f40163i + ",misses=" + this.f40164j + ",hitRate=" + i + "%]";
        }
        return str;
    }
}
