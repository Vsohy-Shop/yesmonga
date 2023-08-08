package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.List;
import kotlin.C11395k;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.u1 */
public class C20372u1 extends C20481g.C20482a {
    @C12579k

    /* renamed from: h */
    public static final C20373a f52547h = new C20373a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: d */
    public C20320i f52548d;
    @C12579k

    /* renamed from: e */
    public final C20374b f52549e;
    @C12579k

    /* renamed from: f */
    public final String f52550f;
    @C12579k

    /* renamed from: g */
    public final String f52551g;

    /* renamed from: androidx.room.u1$a */
    public static final class C20373a {
        public /* synthetic */ C20373a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            kotlin.p010io.C11133b.m42950a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            throw r1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo61187a(@org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20466f r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.mo60771h3(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001e }
                r1 = 0
                if (r0 == 0) goto L_0x0019
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001e }
                if (r0 != 0) goto L_0x0019
                r1 = 1
            L_0x0019:
                r0 = 0
                kotlin.p010io.C11133b.m42950a(r3, r0)
                return r1
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                kotlin.p010io.C11133b.m42950a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20372u1.C20373a.mo61187a(androidx.sqlite.db.f):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            kotlin.p010io.C11133b.m42950a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            throw r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo61188b(@org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20466f r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.mo60771h3(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001e }
                r1 = 0
                if (r0 == 0) goto L_0x0019
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x0019
                r1 = 1
            L_0x0019:
                r0 = 0
                kotlin.p010io.C11133b.m42950a(r3, r0)
                return r1
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                kotlin.p010io.C11133b.m42950a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20372u1.C20373a.mo61188b(androidx.sqlite.db.f):boolean");
        }

        public C20373a() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.u1$b */
    public static abstract class C20374b {
        @C11287e

        /* renamed from: a */
        public final int f52552a;

        public C20374b(int i) {
            this.f52552a = i;
        }

        /* renamed from: a */
        public abstract void mo17567a(@C12579k C20466f fVar);

        /* renamed from: b */
        public abstract void mo17568b(@C12579k C20466f fVar);

        /* renamed from: c */
        public abstract void mo17569c(@C12579k C20466f fVar);

        /* renamed from: d */
        public abstract void mo17570d(@C12579k C20466f fVar);

        /* renamed from: e */
        public void mo17571e(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "database");
        }

        /* renamed from: f */
        public void mo17572f(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "database");
        }

        @C12579k
        /* renamed from: g */
        public C20375c mo17573g(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
            mo61189h(fVar);
            return new C20375c(true, (String) null);
        }

        @C11395k(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        /* renamed from: h */
        public void mo61189h(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.u1$c */
    public static class C20375c {
        @C11287e

        /* renamed from: a */
        public final boolean f52553a;
        @C12580l
        @C11287e

        /* renamed from: b */
        public final String f52554b;

        public C20375c(boolean z, @C12580l String str) {
            this.f52553a = z;
            this.f52554b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20372u1(@C12579k C20320i iVar, @C12579k C20374b bVar, @C12579k String str, @C12579k String str2) {
        super(bVar.f52552a);
        Intrinsics.checkNotNullParameter(iVar, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(bVar, "delegate");
        Intrinsics.checkNotNullParameter(str, "identityHash");
        Intrinsics.checkNotNullParameter(str2, "legacyHash");
        this.f52548d = iVar;
        this.f52549e = bVar;
        this.f52550f = str;
        this.f52551g = str2;
    }

    /* renamed from: b */
    public void mo61182b(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        super.mo61182b(fVar);
    }

    /* renamed from: d */
    public void mo60972d(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        boolean a = f52547h.mo61187a(fVar);
        this.f52549e.mo17567a(fVar);
        if (!a) {
            C20375c g = this.f52549e.mo17573g(fVar);
            if (!g.f52553a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f52554b);
            }
        }
        mo61186j(fVar);
        this.f52549e.mo17569c(fVar);
    }

    /* renamed from: e */
    public void mo61183e(@C12579k C20466f fVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        mo60974g(fVar, i, i2);
    }

    /* renamed from: f */
    public void mo60973f(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        super.mo60973f(fVar);
        mo61184h(fVar);
        this.f52549e.mo17570d(fVar);
        this.f52548d = null;
    }

    /* renamed from: g */
    public void mo60974g(@C12579k C20466f fVar, int i, int i2) {
        List<C20343b> e;
        Intrinsics.checkNotNullParameter(fVar, "db");
        C20320i iVar = this.f52548d;
        boolean z = false;
        if (!(iVar == null || (e = iVar.f52454d.mo60951e(i, i2)) == null)) {
            this.f52549e.mo17572f(fVar);
            for (C20343b a : e) {
                a.mo17636a(fVar);
            }
            C20375c g = this.f52549e.mo17573g(fVar);
            if (g.f52553a) {
                this.f52549e.mo17571e(fVar);
                mo61186j(fVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f52554b);
            }
        }
        if (!z) {
            C20320i iVar2 = this.f52548d;
            if (iVar2 == null || iVar2.mo61084a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f52549e.mo17568b(fVar);
            this.f52549e.mo17567a(fVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61184h(androidx.sqlite.p031db.C20466f r4) {
        /*
            r3 = this;
            androidx.room.u1$a r0 = f52547h
            boolean r0 = r0.mo61188b(r4)
            if (r0 == 0) goto L_0x005d
            androidx.sqlite.db.b r0 = new androidx.sqlite.db.b
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.mo60751I1(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            kotlin.p010io.C11133b.m42950a(r4, r1)
            java.lang.String r4 = r3.f52550f
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = r3.f52551g
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r4 == 0) goto L_0x0035
            goto L_0x006f
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f52550f
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r0)
            throw r1
        L_0x005d:
            androidx.room.u1$b r0 = r3.f52549e
            androidx.room.u1$c r0 = r0.mo17573g(r4)
            boolean r1 = r0.f52553a
            if (r1 == 0) goto L_0x0070
            androidx.room.u1$b r0 = r3.f52549e
            r0.mo17571e(r4)
            r3.mo61186j(r4)
        L_0x006f:
            return
        L_0x0070:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f52554b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20372u1.mo61184h(androidx.sqlite.db.f):void");
    }

    /* renamed from: i */
    public final void mo61185i(C20466f fVar) {
        fVar.mo60782s0(C20369t1.f52542g);
    }

    /* renamed from: j */
    public final void mo61186j(C20466f fVar) {
        mo61185i(fVar);
        fVar.mo60782s0(C20369t1.m95114a(this.f52550f));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20372u1(@C12579k C20320i iVar, @C12579k C20374b bVar, @C12579k String str) {
        this(iVar, bVar, "", str);
        Intrinsics.checkNotNullParameter(iVar, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(bVar, "delegate");
        Intrinsics.checkNotNullParameter(str, "legacyHash");
    }
}
