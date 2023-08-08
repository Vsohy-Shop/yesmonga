package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.annotation.C0337f0;
import androidx.annotation.C0346i;
import androidx.annotation.C0348i1;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.arch.core.executor.C0829c;
import androidx.room.migration.C20342a;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20456b;
import androidx.sqlite.p031db.C20458c;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import androidx.sqlite.p031db.C20489i;
import androidx.sqlite.p031db.C20492k;
import androidx.sqlite.p031db.framework.C20477e;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.C10930d1;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11385n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class RoomDatabase {
    @C12579k

    /* renamed from: o */
    public static final C20272c f52277o = new C20272c((DefaultConstructorMarker) null);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: p */
    public static final int f52278p = 999;
    @C12580l
    @C11287e

    /* renamed from: a */
    public volatile C20466f f52279a;

    /* renamed from: b */
    public Executor f52280b;

    /* renamed from: c */
    public Executor f52281c;

    /* renamed from: d */
    public C20481g f52282d;
    @C12579k

    /* renamed from: e */
    public final C20295e0 f52283e = mo17562i();

    /* renamed from: f */
    public boolean f52284f;

    /* renamed from: g */
    public boolean f52285g;
    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C11287e

    /* renamed from: h */
    public List<? extends C20271b> f52286h;
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: i */
    public Map<Class<? extends C20342a>, C20342a> f52287i = new LinkedHashMap();
    @C12579k

    /* renamed from: j */
    public final ReentrantReadWriteLock f52288j = new ReentrantReadWriteLock();
    @C12580l

    /* renamed from: k */
    public C20285c f52289k;
    @C12579k

    /* renamed from: l */
    public final ThreadLocal<Integer> f52290l = new ThreadLocal<>();
    @C12579k

    /* renamed from: m */
    public final Map<String, Object> f52291m;
    @C12579k

    /* renamed from: n */
    public final Map<Class<?>, Object> f52292n;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo22516d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "Landroid/content/Context;", "context", "r", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", "Landroid/app/ActivityManager;", "activityManager", "", "q", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "room-runtime_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: q */
        public final boolean mo60919q(ActivityManager activityManager) {
            return C20458c.C20460b.m95355b(activityManager);
        }

        @C12579k
        /* renamed from: r */
        public final JournalMode mo60920r(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService(C0696c.f2306r);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!mo60919q((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$a */
    public static class C20270a<T extends RoomDatabase> {
        @C12579k

        /* renamed from: a */
        public final Context f52297a;
        @C12579k

        /* renamed from: b */
        public final Class<T> f52298b;
        @C12580l

        /* renamed from: c */
        public final String f52299c;
        @C12579k

        /* renamed from: d */
        public final List<C20271b> f52300d = new ArrayList();
        @C12580l

        /* renamed from: e */
        public C20274e f52301e;
        @C12580l

        /* renamed from: f */
        public C20275f f52302f;
        @C12580l

        /* renamed from: g */
        public Executor f52303g;
        @C12579k

        /* renamed from: h */
        public final List<Object> f52304h = new ArrayList();
        @C12579k

        /* renamed from: i */
        public List<C20342a> f52305i = new ArrayList();
        @C12580l

        /* renamed from: j */
        public Executor f52306j;
        @C12580l

        /* renamed from: k */
        public Executor f52307k;
        @C12580l

        /* renamed from: l */
        public C20481g.C20487c f52308l;

        /* renamed from: m */
        public boolean f52309m;
        @C12579k

        /* renamed from: n */
        public JournalMode f52310n = JournalMode.AUTOMATIC;
        @C12580l

        /* renamed from: o */
        public Intent f52311o;

        /* renamed from: p */
        public boolean f52312p = true;

        /* renamed from: q */
        public boolean f52313q;

        /* renamed from: r */
        public long f52314r = -1;
        @C12580l

        /* renamed from: s */
        public TimeUnit f52315s;
        @C12579k

        /* renamed from: t */
        public final C20273d f52316t = new C20273d();
        @C12579k

        /* renamed from: u */
        public Set<Integer> f52317u = new LinkedHashSet();
        @C12580l

        /* renamed from: v */
        public Set<Integer> f52318v;
        @C12580l

        /* renamed from: w */
        public String f52319w;
        @C12580l

        /* renamed from: x */
        public File f52320x;
        @C12580l

        /* renamed from: y */
        public Callable<InputStream> f52321y;

        public C20270a(@C12579k Context context, @C12579k Class<T> cls, @C12580l String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(cls, "klass");
            this.f52297a = context;
            this.f52298b = cls;
            this.f52299c = str;
        }

        @C12579k
        /* renamed from: a */
        public C20270a<T> mo60921a(@C12579k C20342a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "autoMigrationSpec");
            this.f52305i.add(aVar);
            return this;
        }

        @C12579k
        /* renamed from: b */
        public C20270a<T> mo60922b(@C12579k C20271b bVar) {
            Intrinsics.checkNotNullParameter(bVar, C10108c.f27778C);
            this.f52300d.add(bVar);
            return this;
        }

        @C12579k
        /* renamed from: c */
        public C20270a<T> mo60923c(@C12579k C20343b... bVarArr) {
            Intrinsics.checkNotNullParameter(bVarArr, "migrations");
            if (this.f52318v == null) {
                this.f52318v = new HashSet();
            }
            for (C20343b bVar : bVarArr) {
                Set<Integer> set = this.f52318v;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(bVar.f52511a));
                Set<Integer> set2 = this.f52318v;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(bVar.f52512b));
            }
            this.f52316t.mo60949c((C20343b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        @C12579k
        /* renamed from: d */
        public C20270a<T> mo60924d(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "typeConverter");
            this.f52304h.add(obj);
            return this;
        }

        @C12579k
        /* renamed from: e */
        public C20270a<T> mo60925e() {
            this.f52309m = true;
            return this;
        }

        @C12579k
        /* renamed from: f */
        public T mo60926f() {
            C20284b2 b2Var;
            int i;
            int i2;
            int i3;
            Executor executor = this.f52306j;
            if (executor == null && this.f52307k == null) {
                Executor g = C0829c.m3970g();
                this.f52307k = g;
                this.f52306j = g;
            } else if (executor != null && this.f52307k == null) {
                this.f52307k = executor;
            } else if (executor == null) {
                this.f52306j = this.f52307k;
            }
            Set<Integer> set = this.f52318v;
            boolean z = true;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                for (Integer intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (!(!this.f52317u.contains(Integer.valueOf(intValue2)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            C20290d dVar = this.f52308l;
            if (dVar == null) {
                dVar = new C20477e();
            }
            if (dVar != null) {
                if (this.f52314r > 0) {
                    if (this.f52299c != null) {
                        long j = this.f52314r;
                        TimeUnit timeUnit = this.f52315s;
                        if (timeUnit != null) {
                            Executor executor2 = this.f52306j;
                            if (executor2 != null) {
                                dVar = new C20290d(dVar, new C20285c(j, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.f52319w;
                if (!(str == null && this.f52320x == null && this.f52321y == null)) {
                    if (this.f52299c != null) {
                        if (str == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        File file = this.f52320x;
                        if (file == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        Callable<InputStream> callable = this.f52321y;
                        if (callable == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i + i2 + i3 != 1) {
                            z = false;
                        }
                        if (z) {
                            dVar = new C20284b2(str, file, callable, dVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                dVar = null;
            }
            if (dVar != null) {
                C20275f fVar = this.f52302f;
                if (fVar != null) {
                    Executor executor3 = this.f52303g;
                    if (executor3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else if (fVar != null) {
                        b2Var = new C20303e1(dVar, executor3, fVar);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    b2Var = dVar;
                }
                Context context = this.f52297a;
                String str2 = this.f52299c;
                C20273d dVar2 = this.f52316t;
                List<C20271b> list = this.f52300d;
                boolean z2 = this.f52309m;
                JournalMode r = this.f52310n.mo60920r(context);
                Executor executor4 = this.f52306j;
                if (executor4 != null) {
                    Executor executor5 = this.f52307k;
                    if (executor5 != null) {
                        C20320i iVar = new C20320i(context, str2, (C20481g.C20487c) b2Var, dVar2, (List<? extends C20271b>) list, z2, r, executor4, executor5, this.f52311o, this.f52312p, this.f52313q, this.f52317u, this.f52319w, this.f52320x, this.f52321y, this.f52301e, (List<? extends Object>) this.f52304h, (List<? extends C20342a>) this.f52305i);
                        T t = (RoomDatabase) C20366s1.m95112b(this.f52298b, "_Impl");
                        t.mo60889A(iVar);
                        return t;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @C12579k
        /* renamed from: g */
        public C20270a<T> mo60927g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "databaseFilePath");
            this.f52319w = str;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C12579k
        /* renamed from: h */
        public C20270a<T> mo60928h(@C12579k String str, @C12579k C20274e eVar) {
            Intrinsics.checkNotNullParameter(str, "databaseFilePath");
            Intrinsics.checkNotNullParameter(eVar, C10108c.f27778C);
            this.f52301e = eVar;
            this.f52319w = str;
            return this;
        }

        @C12579k
        /* renamed from: i */
        public C20270a<T> mo60929i(@C12579k File file) {
            Intrinsics.checkNotNullParameter(file, "databaseFile");
            this.f52320x = file;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @C12579k
        /* renamed from: j */
        public C20270a<T> mo60930j(@C12579k File file, @C12579k C20274e eVar) {
            Intrinsics.checkNotNullParameter(file, "databaseFile");
            Intrinsics.checkNotNullParameter(eVar, C10108c.f27778C);
            this.f52301e = eVar;
            this.f52320x = file;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C12579k
        /* renamed from: k */
        public C20270a<T> mo60931k(@C12579k Callable<InputStream> callable) {
            Intrinsics.checkNotNullParameter(callable, "inputStreamCallable");
            this.f52321y = callable;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @C12579k
        /* renamed from: l */
        public C20270a<T> mo60932l(@C12579k Callable<InputStream> callable, @C12579k C20274e eVar) {
            Intrinsics.checkNotNullParameter(callable, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(eVar, C10108c.f27778C);
            this.f52301e = eVar;
            this.f52321y = callable;
            return this;
        }

        @C12579k
        /* renamed from: m */
        public C20270a<T> mo60933m() {
            Intent intent;
            if (this.f52299c != null) {
                intent = new Intent(this.f52297a, MultiInstanceInvalidationService.class);
            } else {
                intent = null;
            }
            this.f52311o = intent;
            return this;
        }

        @C12579k
        /* renamed from: n */
        public C20270a<T> mo60934n() {
            this.f52312p = false;
            this.f52313q = true;
            return this;
        }

        @C12579k
        /* renamed from: o */
        public C20270a<T> mo60935o(@C12579k int... iArr) {
            Intrinsics.checkNotNullParameter(iArr, "startVersions");
            for (int valueOf : iArr) {
                this.f52317u.add(Integer.valueOf(valueOf));
            }
            return this;
        }

        @C12579k
        /* renamed from: p */
        public C20270a<T> mo60936p() {
            this.f52312p = true;
            this.f52313q = true;
            return this;
        }

        @C12579k
        /* renamed from: q */
        public C20270a<T> mo60937q(@C12580l C20481g.C20487c cVar) {
            this.f52308l = cVar;
            return this;
        }

        @C20370u
        @C12579k
        /* renamed from: r */
        public C20270a<T> mo60938r(@C0337f0(from = 0) long j, @C12579k TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "autoCloseTimeUnit");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f52314r = j;
                this.f52315s = timeUnit;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
        }

        @C12579k
        /* renamed from: s */
        public C20270a<T> mo60939s(@C12579k JournalMode journalMode) {
            Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.f52310n = journalMode;
            return this;
        }

        @C20370u
        @C12579k
        /* renamed from: t */
        public C20270a<T> mo60940t(@C12579k Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "invalidationServiceIntent");
            if (this.f52299c == null) {
                intent = null;
            }
            this.f52311o = intent;
            return this;
        }

        @C12579k
        /* renamed from: u */
        public C20270a<T> mo60941u(@C12579k C20275f fVar, @C12579k Executor executor) {
            Intrinsics.checkNotNullParameter(fVar, "queryCallback");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f52302f = fVar;
            this.f52303g = executor;
            return this;
        }

        @C12579k
        /* renamed from: v */
        public C20270a<T> mo60942v(@C12579k Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f52306j = executor;
            return this;
        }

        @C12579k
        /* renamed from: w */
        public C20270a<T> mo60943w(@C12579k Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f52307k = executor;
            return this;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$b */
    public static abstract class C20271b {
        /* renamed from: a */
        public void mo60944a(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }

        /* renamed from: b */
        public void mo60945b(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }

        /* renamed from: c */
        public void mo60946c(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }
    }

    /* renamed from: androidx.room.RoomDatabase$c */
    public static final class C20272c {
        public /* synthetic */ C20272c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C20272c() {
        }
    }

    /* renamed from: androidx.room.RoomDatabase$d */
    public static class C20273d {
        @C12579k

        /* renamed from: a */
        public final Map<Integer, TreeMap<Integer, C20343b>> f52322a = new LinkedHashMap();

        /* renamed from: a */
        public final void mo60947a(C20343b bVar) {
            int i = bVar.f52511a;
            int i2 = bVar.f52512b;
            Map<Integer, TreeMap<Integer, C20343b>> map = this.f52322a;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, C20343b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(treeMap2.get(Integer.valueOf(i2)));
                sb.append(" with ");
                sb.append(bVar);
            }
            treeMap2.put(Integer.valueOf(i2), bVar);
        }

        /* renamed from: b */
        public void mo60948b(@C12579k List<? extends C20343b> list) {
            Intrinsics.checkNotNullParameter(list, "migrations");
            for (C20343b a : list) {
                mo60947a(a);
            }
        }

        /* renamed from: c */
        public void mo60949c(@C12579k C20343b... bVarArr) {
            Intrinsics.checkNotNullParameter(bVarArr, "migrations");
            for (C20343b a : bVarArr) {
                mo60947a(a);
            }
        }

        /* renamed from: d */
        public final boolean mo60950d(int i, int i2) {
            Map<Integer, Map<Integer, C20343b>> g = mo60953g();
            if (!g.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map map = g.get(Integer.valueOf(i));
            if (map == null) {
                map = C10977s0.m41492z();
            }
            return map.containsKey(Integer.valueOf(i2));
        }

        @C12580l
        /* renamed from: e */
        public List<C20343b> mo60951e(int i, int i2) {
            boolean z;
            if (i == i2) {
                return CollectionsKt__CollectionsKt.m40441E();
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return mo60952f(new ArrayList(), z, i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            if (r6 <= r12) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
            if (r6 < r11) goto L_0x0056;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005b A[SYNTHETIC] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<androidx.room.migration.C20343b> mo60952f(java.util.List<androidx.room.migration.C20343b> r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L_0x0000:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L_0x0007
                if (r11 >= r12) goto L_0x000b
                goto L_0x0009
            L_0x0007:
                if (r11 <= r12) goto L_0x000b
            L_0x0009:
                r2 = r0
                goto L_0x000c
            L_0x000b:
                r2 = r1
            L_0x000c:
                if (r2 == 0) goto L_0x006e
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.b>> r2 = r8.f52322a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L_0x001e
                return r3
            L_0x001e:
                if (r10 == 0) goto L_0x0025
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L_0x0029
            L_0x0025:
                java.util.Set r4 = r2.keySet()
            L_0x0029:
                java.util.Iterator r4 = r4.iterator()
            L_0x002d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x006a
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L_0x004b
                int r7 = r11 + 1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L_0x0058
                if (r6 > r12) goto L_0x0058
                goto L_0x0056
            L_0x004b:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L_0x0058
                if (r6 >= r11) goto L_0x0058
            L_0x0056:
                r6 = r0
                goto L_0x0059
            L_0x0058:
                r6 = r1
            L_0x0059:
                if (r6 == 0) goto L_0x002d
                java.lang.Object r11 = r2.get(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L_0x006b
            L_0x006a:
                r0 = r1
            L_0x006b:
                if (r0 != 0) goto L_0x0000
                return r3
            L_0x006e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.C20273d.mo60952f(java.util.List, boolean, int, int):java.util.List");
        }

        @C12579k
        /* renamed from: g */
        public Map<Integer, Map<Integer, C20343b>> mo60953g() {
            return this.f52322a;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$e */
    public static abstract class C20274e {
        /* renamed from: a */
        public void mo60954a(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }
    }

    /* renamed from: androidx.room.RoomDatabase$f */
    public interface C20275f {
        /* renamed from: a */
        void mo60955a(@C12579k String str, @C12579k List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f52291m = synchronizedMap;
        this.f52292n = new LinkedHashMap();
    }

    /* renamed from: G */
    public static /* synthetic */ void m94768G() {
    }

    /* renamed from: K */
    public static /* synthetic */ Cursor m94769K(RoomDatabase roomDatabase, C20489i iVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.mo60896I(iVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    @C11395k(message = "Will be hidden in a future release.")
    /* renamed from: q */
    public static /* synthetic */ void m94772q() {
    }

    @C11395k(message = "Will be hidden in the next release.")
    /* renamed from: r */
    public static /* synthetic */ void m94773r() {
    }

    @C0346i
    /* renamed from: A */
    public void mo60889A(@C12579k C20320i iVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(iVar, BannerConfigurableFragment.f27258E0);
        this.f52282d = mo17563j(iVar);
        Set<Class<? extends C20342a>> u = mo17565u();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends C20342a>> it = u.iterator();
        while (true) {
            boolean z3 = true;
            int i = -1;
            if (it.hasNext()) {
                Class next = it.next();
                int size = iVar.f52469s.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(iVar.f52469s.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    z3 = false;
                }
                if (z3) {
                    this.f52287i.put(next, iVar.f52469s.get(i));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = iVar.f52469s.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (C20343b next2 : mo17564m(this.f52287i)) {
                    if (!iVar.f52454d.mo60950d(next2.f52511a, next2.f52512b)) {
                        iVar.f52454d.mo60949c(next2);
                    }
                }
                C20279a2 a2Var = (C20279a2) mo60902P(C20279a2.class, mo60913s());
                if (a2Var != null) {
                    a2Var.mo60970d(iVar);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) mo60902P(AutoClosingRoomOpenHelper.class, mo60913s());
                if (autoClosingRoomOpenHelper != null) {
                    this.f52289k = autoClosingRoomOpenHelper.f52227b;
                    mo60912p().mo61030u(autoClosingRoomOpenHelper.f52227b);
                }
                if (iVar.f52457g == JournalMode.WRITE_AHEAD_LOGGING) {
                    z = true;
                } else {
                    z = false;
                }
                mo60913s().setWriteAheadLoggingEnabled(z);
                this.f52286h = iVar.f52455e;
                this.f52280b = iVar.f52458h;
                this.f52281c = new C20311f2(iVar.f52459i);
                this.f52284f = iVar.f52456f;
                this.f52285g = z;
                if (iVar.f52460j != null) {
                    if (iVar.f52452b != null) {
                        mo60912p().mo61032w(iVar.f52451a, iVar.f52452b, iVar.f52460j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> v = mo17566v();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry next3 : v.entrySet()) {
                    Class cls = (Class) next3.getKey();
                    Iterator it2 = ((List) next3.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class cls2 = (Class) it2.next();
                            int size3 = iVar.f52468r.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i4 = size3 - 1;
                                    if (cls2.isAssignableFrom(iVar.f52468r.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i4 < 0) {
                                        break;
                                    } else {
                                        size3 = i4;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                this.f52292n.put(cls2, iVar.f52468r.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = iVar.f52468r.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i5 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + iVar.f52468r.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i5 >= 0) {
                            size4 = i5;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo60890B() {
        mo60903c();
        C20466f d3 = mo60913s().mo18117d3();
        mo60912p().mo61010B(d3);
        if (d3.mo60753K3()) {
            d3.mo60770h1();
        } else {
            d3.mo60775j0();
        }
    }

    /* renamed from: C */
    public final void mo60891C() {
        mo60913s().mo18117d3().mo60784t1();
        if (!mo60918z()) {
            mo60912p().mo61026q();
        }
    }

    /* renamed from: D */
    public void mo60892D(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        mo60912p().mo61023n(fVar);
    }

    /* renamed from: E */
    public final boolean mo60893E() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: F */
    public boolean mo60894F() {
        Boolean bool;
        boolean isOpen;
        C20285c cVar = this.f52289k;
        if (cVar != null) {
            isOpen = cVar.mo60990p();
        } else {
            C20466f fVar = this.f52279a;
            if (fVar != null) {
                isOpen = fVar.isOpen();
            } else {
                bool = null;
                return Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE);
    }

    @C12579k
    @C11315i
    /* renamed from: H */
    public final Cursor mo60895H(@C12579k C20489i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "query");
        return m94769K(this, iVar, (CancellationSignal) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: I */
    public Cursor mo60896I(@C12579k C20489i iVar, @C12580l CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(iVar, "query");
        mo60903c();
        mo60904d();
        if (cancellationSignal != null) {
            return mo60913s().mo18117d3().mo60756M0(iVar, cancellationSignal);
        }
        return mo60913s().mo18117d3().mo60751I1(iVar);
    }

    @C12579k
    /* renamed from: J */
    public Cursor mo60897J(@C12579k String str, @C12580l Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "query");
        return mo60913s().mo18117d3().mo60751I1(new C20456b(str, objArr));
    }

    /* renamed from: L */
    public <V> V mo60898L(@C12579k Callable<V> callable) {
        Intrinsics.checkNotNullParameter(callable, "body");
        mo60905e();
        try {
            V call = callable.call();
            mo60901O();
            return call;
        } finally {
            mo60908k();
        }
    }

    /* renamed from: M */
    public void mo60899M(@C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "body");
        mo60905e();
        try {
            runnable.run();
            mo60901O();
        } finally {
            mo60908k();
        }
    }

    /* renamed from: N */
    public final void mo60900N(@C12579k Map<Class<? extends C20342a>, C20342a> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f52287i = map;
    }

    @C11395k(message = "setTransactionSuccessful() is deprecated", replaceWith = @C11587t0(expression = "runInTransaction(Runnable)", imports = {}))
    /* renamed from: O */
    public void mo60901O() {
        mo60913s().mo18117d3().mo60764e1();
    }

    /* renamed from: P */
    public final <T> T mo60902P(Class<T> cls, C20481g gVar) {
        if (cls.isInstance(gVar)) {
            return gVar;
        }
        if (gVar instanceof C20331k) {
            return mo60902P(cls, ((C20331k) gVar).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo60903c() {
        if (!this.f52284f && !(!mo60893E())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo60904d() {
        if (!(mo60918z() || this.f52290l.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    @C11395k(message = "beginTransaction() is deprecated", replaceWith = @C11587t0(expression = "runInTransaction(Runnable)", imports = {}))
    /* renamed from: e */
    public void mo60905e() {
        mo60903c();
        C20285c cVar = this.f52289k;
        if (cVar == null) {
            mo60890B();
        } else {
            cVar.mo60981g(new RoomDatabase$beginTransaction$1(this));
        }
    }

    @C0348i1
    /* renamed from: f */
    public abstract void mo17561f();

    /* renamed from: g */
    public void mo60906g() {
        if (mo60894F()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f52288j.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                mo60912p().mo61034y();
                mo60913s().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @C12579k
    /* renamed from: h */
    public C20492k mo60907h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sql");
        mo60903c();
        mo60904d();
        return mo60913s().mo18117d3().mo60750C2(str);
    }

    @C12579k
    /* renamed from: i */
    public abstract C20295e0 mo17562i();

    @C12579k
    /* renamed from: j */
    public abstract C20481g mo17563j(@C12579k C20320i iVar);

    @C11395k(message = "endTransaction() is deprecated", replaceWith = @C11587t0(expression = "runInTransaction(Runnable)", imports = {}))
    /* renamed from: k */
    public void mo60908k() {
        C20285c cVar = this.f52289k;
        if (cVar == null) {
            mo60891C();
        } else {
            cVar.mo60981g(new RoomDatabase$endTransaction$1(this));
        }
    }

    @C12579k
    /* renamed from: l */
    public final Map<Class<? extends C20342a>, C20342a> mo60909l() {
        return this.f52287i;
    }

    @C11385n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C12579k
    /* renamed from: m */
    public List<C20343b> mo17564m(@C12579k Map<Class<? extends C20342a>, C20342a> map) {
        Intrinsics.checkNotNullParameter(map, "autoMigrationSpecs");
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public final Map<String, Object> mo60910n() {
        return this.f52291m;
    }

    @C12579k
    /* renamed from: o */
    public final Lock mo60911o() {
        ReentrantReadWriteLock.ReadLock readLock = this.f52288j.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @C12579k
    /* renamed from: p */
    public C20295e0 mo60912p() {
        return this.f52283e;
    }

    @C12579k
    /* renamed from: s */
    public C20481g mo60913s() {
        C20481g gVar = this.f52282d;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    @C12579k
    /* renamed from: t */
    public Executor mo60914t() {
        Executor executor = this.f52280b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public Set<Class<? extends C20342a>> mo17565u() {
        return C10930d1.m40892k();
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public Map<Class<?>, List<Class<?>>> mo17566v() {
        return C10977s0.m41492z();
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public final ThreadLocal<Integer> mo60915w() {
        return this.f52290l;
    }

    @C12579k
    /* renamed from: x */
    public Executor mo60916x() {
        Executor executor = this.f52281c;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    @C12580l
    /* renamed from: y */
    public <T> T mo60917y(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "klass");
        return this.f52292n.get(cls);
    }

    /* renamed from: z */
    public boolean mo60918z() {
        return mo60913s().mo18117d3().mo60748A3();
    }
}
