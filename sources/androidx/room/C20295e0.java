package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.C0836b;
import androidx.lifecycle.LiveData;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20492k;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.contacts.C9091q;
import com.urbanairship.iam.events.C9175a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.collections.C10927c1;
import kotlin.collections.C10930d1;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.e0 */
public class C20295e0 {
    @C12579k

    /* renamed from: q */
    public static final C20296a f52370q = new C20296a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: r */
    public static final String[] f52371r = {C9091q.f24549c, "DELETE", "INSERT"};
    @C12579k

    /* renamed from: s */
    public static final String f52372s = "room_table_modification_log";
    @C12579k

    /* renamed from: t */
    public static final String f52373t = "table_id";
    @C12579k

    /* renamed from: u */
    public static final String f52374u = "invalidated";
    @C12579k

    /* renamed from: v */
    public static final String f52375v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @C12579k

    /* renamed from: w */
    public static final String f52376w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    @C12579k

    /* renamed from: x */
    public static final String f52377x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    @C12579k

    /* renamed from: a */
    public final RoomDatabase f52378a;
    @C12579k

    /* renamed from: b */
    public final Map<String, String> f52379b;
    @C12579k

    /* renamed from: c */
    public final Map<String, Set<String>> f52380c;
    @C12579k

    /* renamed from: d */
    public final Map<String, Integer> f52381d;
    @C12579k

    /* renamed from: e */
    public final String[] f52382e;
    @C12580l

    /* renamed from: f */
    public C20285c f52383f;
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: g */
    public final AtomicBoolean f52384g;

    /* renamed from: h */
    public volatile boolean f52385h;
    @C12580l

    /* renamed from: i */
    public volatile C20492k f52386i;
    @C12579k

    /* renamed from: j */
    public final C20297b f52387j;
    @C12579k

    /* renamed from: k */
    public final C20287c0 f52388k;
    @C0323b0("observerMap")
    @C12579k

    /* renamed from: l */
    public final C0836b<C20299c, C20300d> f52389l;
    @C12580l

    /* renamed from: m */
    public C20325j0 f52390m;
    @C12579k

    /* renamed from: n */
    public final Object f52391n;
    @C12579k

    /* renamed from: o */
    public final Object f52392o;
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11287e

    /* renamed from: p */
    public final Runnable f52393p;

    /* renamed from: androidx.room.e0$a */
    public static final class C20296a {
        public /* synthetic */ C20296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        /* renamed from: b */
        public static /* synthetic */ void m94990b() {
        }

        @C0344h1
        /* renamed from: c */
        public static /* synthetic */ void m94991c() {
        }

        /* renamed from: a */
        public final void mo61036a(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "database");
            if (fVar.mo60753K3()) {
                fVar.mo60770h1();
            } else {
                fVar.mo60775j0();
            }
        }

        @C12579k
        /* renamed from: d */
        public final String mo61037d(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "tableName");
            Intrinsics.checkNotNullParameter(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        public C20296a() {
        }
    }

    /* renamed from: androidx.room.e0$b */
    public static final class C20297b {
        @C12579k

        /* renamed from: e */
        public static final C20298a f52394e = new C20298a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f52395f = 0;

        /* renamed from: g */
        public static final int f52396g = 1;

        /* renamed from: h */
        public static final int f52397h = 2;
        @C12579k

        /* renamed from: a */
        public final long[] f52398a;
        @C12579k

        /* renamed from: b */
        public final boolean[] f52399b;
        @C12579k

        /* renamed from: c */
        public final int[] f52400c;

        /* renamed from: d */
        public boolean f52401d;

        /* renamed from: androidx.room.e0$b$a */
        public static final class C20298a {
            public /* synthetic */ C20298a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C20298a() {
            }
        }

        public C20297b(int i) {
            this.f52398a = new long[i];
            this.f52399b = new boolean[i];
            this.f52400c = new int[i];
        }

        /* renamed from: a */
        public final boolean mo61038a() {
            return this.f52401d;
        }

        @C12579k
        /* renamed from: b */
        public final long[] mo61039b() {
            return this.f52398a;
        }

        @C0344h1
        @C12580l
        @C11314h(name = "getTablesToSync")
        /* renamed from: c */
        public final int[] mo61040c() {
            boolean z;
            synchronized (this) {
                if (!this.f52401d) {
                    return null;
                }
                long[] jArr = this.f52398a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    if (jArr[i] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean[] zArr = this.f52399b;
                    if (z != zArr[i2]) {
                        int[] iArr = this.f52400c;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f52400c[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.f52401d = false;
                int[] iArr2 = (int[]) this.f52400c.clone();
                return iArr2;
            }
        }

        /* renamed from: d */
        public final boolean mo61041d(@C12579k int... iArr) {
            boolean z;
            Intrinsics.checkNotNullParameter(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f52398a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.f52401d = true;
                    }
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
            return z;
        }

        /* renamed from: e */
        public final boolean mo61042e(@C12579k int... iArr) {
            boolean z;
            Intrinsics.checkNotNullParameter(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f52398a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.f52401d = true;
                    }
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
            return z;
        }

        /* renamed from: f */
        public final void mo61043f() {
            synchronized (this) {
                Arrays.fill(this.f52399b, false);
                this.f52401d = true;
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }

        /* renamed from: g */
        public final void mo61044g(boolean z) {
            this.f52401d = z;
        }
    }

    /* renamed from: androidx.room.e0$c */
    public static abstract class C20299c {
        @C12579k

        /* renamed from: a */
        public final String[] f52402a;

        public C20299c(@C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "tables");
            this.f52402a = strArr;
        }

        @C12579k
        /* renamed from: a */
        public final String[] mo61045a() {
            return this.f52402a;
        }

        /* renamed from: b */
        public boolean mo61046b() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo61047c(@C12579k Set<String> set);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20299c(@org.jetbrains.annotations.C12579k java.lang.String r3, @org.jetbrains.annotations.C12579k java.lang.String... r4) {
            /*
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.List r0 = kotlin.collections.C10976s.m41417i()
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                kotlin.collections.C10994x.m42362p0(r1, r4)
                r0.add(r3)
                java.util.List r3 = kotlin.collections.C10976s.m41409a(r0)
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r3 = r3.toArray(r4)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20295e0.C20299c.<init>(java.lang.String, java.lang.String[]):void");
        }
    }

    /* renamed from: androidx.room.e0$d */
    public static final class C20300d {
        @C12579k

        /* renamed from: a */
        public final C20299c f52403a;
        @C12579k

        /* renamed from: b */
        public final int[] f52404b;
        @C12579k

        /* renamed from: c */
        public final String[] f52405c;
        @C12579k

        /* renamed from: d */
        public final Set<String> f52406d;

        public C20300d(@C12579k C20299c cVar, @C12579k int[] iArr, @C12579k String[] strArr) {
            boolean z;
            Set<String> set;
            Intrinsics.checkNotNullParameter(cVar, "observer");
            Intrinsics.checkNotNullParameter(iArr, "tableIds");
            Intrinsics.checkNotNullParameter(strArr, "tableNames");
            this.f52403a = cVar;
            this.f52404b = iArr;
            this.f52405c = strArr;
            boolean z2 = true;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                set = C10927c1.m40883f(strArr[0]);
            } else {
                set = C10930d1.m40892k();
            }
            this.f52406d = set;
            if (!(iArr.length != strArr.length ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @C12579k
        /* renamed from: a */
        public final C20299c mo61048a() {
            return this.f52403a;
        }

        @C12579k
        /* renamed from: b */
        public final int[] mo61049b() {
            return this.f52404b;
        }

        /* renamed from: c */
        public final void mo61050c(@C12579k Set<Integer> set) {
            Set<String> set2;
            Intrinsics.checkNotNullParameter(set, "invalidatedTablesIds");
            int[] iArr = this.f52404b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set d = C10927c1.m40881d();
                    int[] iArr2 = this.f52404b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            d.add(this.f52405c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    set2 = C10927c1.m40878a(d);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f52406d;
                } else {
                    set2 = C10930d1.m40892k();
                }
            } else {
                set2 = C10930d1.m40892k();
            }
            if (!set2.isEmpty()) {
                this.f52403a.mo61047c(set2);
            }
        }

        /* renamed from: d */
        public final void mo61051d(@C12579k String[] strArr) {
            Set<String> set;
            Intrinsics.checkNotNullParameter(strArr, "tables");
            int length = this.f52405c.length;
            if (length != 0) {
                boolean z = false;
                if (length != 1) {
                    Set d = C10927c1.m40881d();
                    for (String str : strArr) {
                        for (String str2 : this.f52405c) {
                            if (C11622t.equals(str2, str, true)) {
                                d.add(str2);
                            }
                        }
                    }
                    set = C10927c1.m40878a(d);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        } else if (C11622t.equals(strArr[i], this.f52405c[0], true)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        set = this.f52406d;
                    } else {
                        set = C10930d1.m40892k();
                    }
                }
            } else {
                set = C10930d1.m40892k();
            }
            if (!set.isEmpty()) {
                this.f52403a.mo61047c(set);
            }
        }
    }

    /* renamed from: androidx.room.e0$e */
    public static final class C20301e extends C20299c {
        @C12579k

        /* renamed from: b */
        public final C20295e0 f52407b;
        @C12579k

        /* renamed from: c */
        public final WeakReference<C20299c> f52408c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20301e(@C12579k C20295e0 e0Var, @C12579k C20299c cVar) {
            super(cVar.mo61045a());
            Intrinsics.checkNotNullParameter(e0Var, "tracker");
            Intrinsics.checkNotNullParameter(cVar, "delegate");
            this.f52407b = e0Var;
            this.f52408c = new WeakReference<>(cVar);
        }

        /* renamed from: c */
        public void mo61047c(@C12579k Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "tables");
            C20299c cVar = this.f52408c.get();
            if (cVar == null) {
                this.f52407b.mo61028s(this);
            } else {
                cVar.mo61047c(set);
            }
        }

        @C12579k
        /* renamed from: d */
        public final WeakReference<C20299c> mo61052d() {
            return this.f52408c;
        }

        @C12579k
        /* renamed from: e */
        public final C20295e0 mo61053e() {
            return this.f52407b;
        }
    }

    /* renamed from: androidx.room.e0$f */
    public static final class C20302f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C20295e0 f52409a;

        public C20302f(C20295e0 e0Var) {
            this.f52409a = e0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
            kotlin.p010io.C11133b.m42950a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Set<java.lang.Integer> mo61054a() {
            /*
                r5 = this;
                androidx.room.e0 r0 = r5.f52409a
                java.util.Set r1 = kotlin.collections.C10927c1.m40881d()
                androidx.room.RoomDatabase r0 = r0.mo61018h()
                androidx.sqlite.db.b r2 = new androidx.sqlite.db.b
                java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
                r2.<init>(r3)
                r3 = 2
                r4 = 0
                android.database.Cursor r0 = androidx.room.RoomDatabase.m94769K(r0, r2, r4, r3, r4)
            L_0x0017:
                boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0069 }
                if (r2 == 0) goto L_0x002a
                r2 = 0
                int r2 = r0.getInt(r2)     // Catch:{ all -> 0x0069 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0069 }
                r1.add(r2)     // Catch:{ all -> 0x0069 }
                goto L_0x0017
            L_0x002a:
                kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0069 }
                kotlin.p010io.C11133b.m42950a(r0, r4)
                java.util.Set r0 = kotlin.collections.C10927c1.m40878a(r1)
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0068
                androidx.room.e0 r1 = r5.f52409a
                androidx.sqlite.db.k r1 = r1.mo61017g()
                java.lang.String r2 = "Required value was null."
                if (r1 == 0) goto L_0x005e
                androidx.room.e0 r1 = r5.f52409a
                androidx.sqlite.db.k r1 = r1.mo61017g()
                if (r1 == 0) goto L_0x0054
                r1.mo60802y0()
                goto L_0x0068
            L_0x0054:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x005e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0068:
                return r0
            L_0x0069:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x006b }
            L_0x006b:
                r2 = move-exception
                kotlin.p010io.C11133b.m42950a(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20295e0.C20302f.mo61054a():java.util.Set");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.mo60980e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
            if (r0 == null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
            if (r0 == null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
            if ((!r3.isEmpty()) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
            r0 = r4.f52409a.mo61019i();
            r1 = r4.f52409a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bf, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r1 = r1.mo61019i().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
            if (r1.hasNext() == false) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
            ((androidx.room.C20295e0.C20300d) ((java.util.Map.Entry) r1.next()).getValue()).mo61050c(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
            r1 = kotlin.C11079d2.f28267a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009d */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x008d=Splitter:B:33:0x008d, B:37:0x009d=Splitter:B:37:0x009d} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.RoomDatabase r0 = r0.mo61018h()
                java.util.concurrent.locks.Lock r0 = r0.mo60911o()
                r0.lock()
                r1 = 1
                androidx.room.e0 r2 = r4.f52409a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                boolean r2 = r2.mo61016f()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                if (r2 != 0) goto L_0x0025
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x0024
                r0.mo60980e()
            L_0x0024:
                return
            L_0x0025:
                androidx.room.e0 r2 = r4.f52409a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.mo61020j()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                r3 = 0
                boolean r2 = r2.compareAndSet(r1, r3)     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                if (r2 != 0) goto L_0x0041
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x0040
                r0.mo60980e()
            L_0x0040:
                return
            L_0x0041:
                androidx.room.e0 r2 = r4.f52409a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.room.RoomDatabase r2 = r2.mo61018h()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                boolean r2 = r2.mo60918z()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                if (r2 == 0) goto L_0x005c
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x005b
                r0.mo60980e()
            L_0x005b:
                return
            L_0x005c:
                androidx.room.e0 r2 = r4.f52409a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.room.RoomDatabase r2 = r2.mo61018h()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.sqlite.db.g r2 = r2.mo60913s()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.sqlite.db.f r2 = r2.mo18117d3()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                r2.mo60770h1()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                java.util.Set r3 = r4.mo61054a()     // Catch:{ all -> 0x0086 }
                r2.mo60764e1()     // Catch:{ all -> 0x0086 }
                r2.mo60784t1()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x00ad
            L_0x0082:
                r0.mo60980e()
                goto L_0x00ad
            L_0x0086:
                r3 = move-exception
                r2.mo60784t1()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                throw r3     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
            L_0x008b:
                r1 = move-exception
                goto L_0x00e6
            L_0x008d:
                java.util.Set r3 = kotlin.collections.C10930d1.m40892k()     // Catch:{ all -> 0x008b }
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x00ad
                goto L_0x0082
            L_0x009d:
                java.util.Set r3 = kotlin.collections.C10930d1.m40892k()     // Catch:{ all -> 0x008b }
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x00ad
                goto L_0x0082
            L_0x00ad:
                r0 = r3
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x00e5
                androidx.room.e0 r0 = r4.f52409a
                androidx.arch.core.internal.b r0 = r0.mo61019i()
                androidx.room.e0 r1 = r4.f52409a
                monitor-enter(r0)
                androidx.arch.core.internal.b r1 = r1.mo61019i()     // Catch:{ all -> 0x00e2 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e2 }
            L_0x00c8:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00e2 }
                if (r2 == 0) goto L_0x00de
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00e2 }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00e2 }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00e2 }
                androidx.room.e0$d r2 = (androidx.room.C20295e0.C20300d) r2     // Catch:{ all -> 0x00e2 }
                r2.mo61050c(r3)     // Catch:{ all -> 0x00e2 }
                goto L_0x00c8
            L_0x00de:
                kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00e2 }
                monitor-exit(r0)
                goto L_0x00e5
            L_0x00e2:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00e5:
                return
            L_0x00e6:
                r0.unlock()
                androidx.room.e0 r0 = r4.f52409a
                androidx.room.c r0 = r0.f52383f
                if (r0 == 0) goto L_0x00f4
                r0.mo60980e()
            L_0x00f4:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20295e0.C20302f.run():void");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C20295e0(@C12579k RoomDatabase roomDatabase, @C12579k Map<String, String> map, @C12579k Map<String, Set<String>> map2, @C12579k String... strArr) {
        String str;
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
        Intrinsics.checkNotNullParameter(map, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(map2, "viewTables");
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
        this.f52378a = roomDatabase;
        this.f52379b = map;
        this.f52380c = map2;
        this.f52384g = new AtomicBoolean(false);
        this.f52387j = new C20297b(strArr.length);
        this.f52388k = new C20287c0(roomDatabase);
        this.f52389l = new C0836b<>();
        this.f52391n = new Object();
        this.f52392o = new Object();
        this.f52381d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f52381d.put(lowerCase, Integer.valueOf(i));
            String str3 = this.f52379b.get(strArr[i]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
                str = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f52382e = strArr2;
        for (Map.Entry next : this.f52379b.entrySet()) {
            Locale locale2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale2, AirshipConfigOptions.f87117e0);
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f52381d.containsKey(lowerCase2)) {
                Intrinsics.checkNotNullExpressionValue(locale2, AirshipConfigOptions.f87117e0);
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f52381d;
                map3.put(lowerCase3, C10977s0.m41443K(map3, lowerCase2));
            }
        }
        this.f52393p = new C20302f(this);
    }

    @C0344h1
    /* renamed from: k */
    public static /* synthetic */ void m94962k() {
    }

    /* renamed from: A */
    public final void mo61009A() {
        if (this.f52378a.mo60894F()) {
            mo61010B(this.f52378a.mo60913s().mo18117d3());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: B */
    public final void mo61010B(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "database");
        if (!fVar.mo60748A3()) {
            try {
                Lock o = this.f52378a.mo60911o();
                o.lock();
                try {
                    synchronized (this.f52391n) {
                        int[] c = this.f52387j.mo61040c();
                        if (c != null) {
                            f52370q.mo61036a(fVar);
                            try {
                                int length = c.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = c[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        mo61033x(fVar, i2);
                                    } else if (i3 == 2) {
                                        mo61035z(fVar, i2);
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                fVar.mo60764e1();
                                fVar.mo60784t1();
                                C11079d2 d2Var = C11079d2.f28267a;
                                o.unlock();
                            } catch (Throwable th) {
                                fVar.mo60784t1();
                                throw th;
                            }
                        }
                    }
                } finally {
                    o.unlock();
                }
            } catch (SQLiteException | IllegalStateException unused) {
            }
        }
    }

    /* renamed from: C */
    public final String[] mo61011C(String[] strArr) {
        String[] t = mo61029t(strArr);
        int length = t.length;
        int i = 0;
        while (i < length) {
            String str = t[i];
            Map<String, Integer> map = this.f52381d;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                i++;
            } else {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return t;
    }

    @C0348i1
    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public void mo61012b(@C12579k C20299c cVar) {
        C20300d r;
        Intrinsics.checkNotNullParameter(cVar, "observer");
        String[] t = mo61029t(cVar.mo61045a());
        ArrayList arrayList = new ArrayList(t.length);
        int length = t.length;
        int i = 0;
        while (i < length) {
            String str = t[i];
            Map<String, Integer> map = this.f52381d;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] P5 = CollectionsKt___CollectionsKt.m40552P5(arrayList);
        C20300d dVar = new C20300d(cVar, P5, t);
        synchronized (this.f52389l) {
            r = this.f52389l.mo3803r(cVar, dVar);
        }
        if (r == null && this.f52387j.mo61041d(Arrays.copyOf(P5, P5.length))) {
            mo61009A();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo61013c(@C12579k C20299c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "observer");
        mo61012b(new C20301e(this, cVar));
    }

    @C11395k(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C12579k
    /* renamed from: d */
    public <T> LiveData<T> mo61014d(@C12579k String[] strArr, @C12579k Callable<T> callable) {
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
        Intrinsics.checkNotNullParameter(callable, "computeFunction");
        return mo61015e(strArr, false, callable);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public <T> LiveData<T> mo61015e(@C12579k String[] strArr, boolean z, @C12579k Callable<T> callable) {
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
        Intrinsics.checkNotNullParameter(callable, "computeFunction");
        return this.f52388k.mo60997a(mo61011C(strArr), z, callable);
    }

    /* renamed from: f */
    public final boolean mo61016f() {
        if (!this.f52378a.mo60894F()) {
            return false;
        }
        if (!this.f52385h) {
            this.f52378a.mo60913s().mo18117d3();
        }
        if (!this.f52385h) {
            return false;
        }
        return true;
    }

    @C12580l
    /* renamed from: g */
    public final C20492k mo61017g() {
        return this.f52386i;
    }

    @C12579k
    /* renamed from: h */
    public final RoomDatabase mo61018h() {
        return this.f52378a;
    }

    @C12579k
    /* renamed from: i */
    public final C0836b<C20299c, C20300d> mo61019i() {
        return this.f52389l;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: j */
    public final AtomicBoolean mo61020j() {
        return this.f52384g;
    }

    @C12579k
    /* renamed from: l */
    public final Map<String, Integer> mo61021l() {
        return this.f52381d;
    }

    @C12579k
    /* renamed from: m */
    public final String[] mo61022m() {
        return this.f52382e;
    }

    /* renamed from: n */
    public final void mo61023n(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "database");
        synchronized (this.f52392o) {
            if (!this.f52385h) {
                fVar.mo60782s0("PRAGMA temp_store = MEMORY;");
                fVar.mo60782s0("PRAGMA recursive_triggers='ON';");
                fVar.mo60782s0(f52375v);
                mo61010B(fVar);
                this.f52386i = fVar.mo60750C2(f52376w);
                this.f52385h = true;
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    @C0344h1(otherwise = 3)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: o */
    public final void mo61024o(@C12579k String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "tables");
        synchronized (this.f52389l) {
            Iterator<T> it = this.f52389l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                C20300d dVar = (C20300d) entry.getValue();
                if (!((C20299c) entry.getKey()).mo61046b()) {
                    dVar.mo61051d(strArr);
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: p */
    public final void mo61025p() {
        synchronized (this.f52392o) {
            this.f52385h = false;
            this.f52387j.mo61043f();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: q */
    public void mo61026q() {
        if (this.f52384g.compareAndSet(false, true)) {
            C20285c cVar = this.f52383f;
            if (cVar != null) {
                cVar.mo60988n();
            }
            this.f52378a.mo60914t().execute(this.f52393p);
        }
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: r */
    public void mo61027r() {
        C20285c cVar = this.f52383f;
        if (cVar != null) {
            cVar.mo60988n();
        }
        mo61009A();
        this.f52393p.run();
    }

    @C0348i1
    @SuppressLint({"RestrictedApi"})
    /* renamed from: s */
    public void mo61028s(@C12579k C20299c cVar) {
        C20300d w;
        Intrinsics.checkNotNullParameter(cVar, "observer");
        synchronized (this.f52389l) {
            w = this.f52389l.mo3804w(cVar);
        }
        if (w != null) {
            C20297b bVar = this.f52387j;
            int[] b = w.mo61049b();
            if (bVar.mo61042e(Arrays.copyOf(b, b.length))) {
                mo61009A();
            }
        }
    }

    /* renamed from: t */
    public final String[] mo61029t(String[] strArr) {
        Set d = C10927c1.m40881d();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f52380c;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f52380c;
                Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
                String lowerCase2 = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.checkNotNull(set);
                d.addAll(set);
            } else {
                d.add(str);
            }
        }
        Object[] array = C10927c1.m40878a(d).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: u */
    public final void mo61030u(@C12579k C20285c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "autoCloser");
        this.f52383f = cVar;
        cVar.mo60991q(new C20291d0(this));
    }

    /* renamed from: v */
    public final void mo61031v(@C12580l C20492k kVar) {
        this.f52386i = kVar;
    }

    /* renamed from: w */
    public final void mo61032w(@C12579k Context context, @C12579k String str, @C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(intent, "serviceIntent");
        this.f52390m = new C20325j0(context, str, intent, this, this.f52378a.mo60914t());
    }

    /* renamed from: x */
    public final void mo61033x(C20466f fVar, int i) {
        fVar.mo60782s0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f52382e[i];
        for (String str2 : f52371r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f52370q.mo61037d(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + f52372s + " SET " + f52374u + " = 1" + " WHERE " + f52373t + " = " + i + " AND " + f52374u + " = 0" + "; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            fVar.mo60782s0(str3);
        }
    }

    /* renamed from: y */
    public final void mo61034y() {
        C20325j0 j0Var = this.f52390m;
        if (j0Var != null) {
            j0Var.mo61106s();
        }
        this.f52390m = null;
    }

    /* renamed from: z */
    public final void mo61035z(C20466f fVar, int i) {
        String str = this.f52382e[i];
        for (String str2 : f52371r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f52370q.mo61037d(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            fVar.mo60782s0(str3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C20295e0(@C12579k RoomDatabase roomDatabase, @C12579k String... strArr) {
        this(roomDatabase, C10977s0.m41492z(), C10977s0.m41492z(), (String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
    }
}
