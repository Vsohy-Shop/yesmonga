package androidx.sqlite.p031db.framework;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.C0376v0;
import androidx.sqlite.p031db.C20458c;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import androidx.sqlite.util.C20493a;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import java.util.UUID;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper */
public final class FrameworkSQLiteOpenHelper implements C20481g {
    @C12579k

    /* renamed from: v */
    public static final C20471a f52766v = new C20471a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: w */
    public static final String f52767w = "SupportSQLite";
    @C12579k

    /* renamed from: a */
    public final Context f52768a;
    @C12580l

    /* renamed from: b */
    public final String f52769b;
    @C12579k

    /* renamed from: c */
    public final C20481g.C20482a f52770c;

    /* renamed from: d */
    public final boolean f52771d;

    /* renamed from: e */
    public final boolean f52772e;
    @C12579k

    /* renamed from: f */
    public final C11677z<OpenHelper> f52773f;

    /* renamed from: g */
    public boolean f52774g;

    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper */
    public static final class OpenHelper extends SQLiteOpenHelper {
        @C12579k

        /* renamed from: v */
        public static final C20469a f52775v = new C20469a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: a */
        public final Context f52776a;
        @C12579k

        /* renamed from: b */
        public final C20472b f52777b;
        @C12579k

        /* renamed from: c */
        public final C20481g.C20482a f52778c;

        /* renamed from: d */
        public final boolean f52779d;

        /* renamed from: e */
        public boolean f52780e;
        @C12579k

        /* renamed from: f */
        public final C20493a f52781f;

        /* renamed from: g */
        public boolean f52782g;

        @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo22516d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "a", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "sqlite-framework_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException */
        public static final class CallbackException extends RuntimeException {
            @C12579k
            private final CallbackName callbackName;
            @C12579k
            private final Throwable cause;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CallbackException(@C12579k CallbackName callbackName2, @C12579k Throwable th) {
                super(th);
                Intrinsics.checkNotNullParameter(callbackName2, "callbackName");
                Intrinsics.checkNotNullParameter(th, "cause");
                this.callbackName = callbackName2;
                this.cause = th;
            }

            @C12579k
            /* renamed from: a */
            public final CallbackName mo61397a() {
                return this.callbackName;
            }

            @C12579k
            public Throwable getCause() {
                return this.cause;
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo22516d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName */
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$a */
        public static final class C20469a {
            public /* synthetic */ C20469a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final FrameworkSQLiteDatabase mo61399a(@C12579k C20472b bVar, @C12579k SQLiteDatabase sQLiteDatabase) {
                Intrinsics.checkNotNullParameter(bVar, "refHolder");
                Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase a = bVar.mo61400a();
                if (a != null && a.mo61377c(sQLiteDatabase)) {
                    return a;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                bVar.mo61401b(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }

            public C20469a() {
            }
        }

        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$b */
        public /* synthetic */ class C20470b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.C20470b.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OpenHelper(@C12579k Context context, @C12580l String str, @C12579k C20472b bVar, @C12579k C20481g.C20482a aVar, boolean z) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f52798a, new C20476d(aVar, bVar));
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(bVar, "dbRef");
            Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
            this.f52776a = context;
            this.f52777b = bVar;
            this.f52778c = aVar;
            this.f52779d = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
            this.f52781f = new C20493a(str, cacheDir, false);
        }

        /* renamed from: b */
        public static final void m95453b(C20481g.C20482a aVar, C20472b bVar, SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(aVar, "$callback");
            Intrinsics.checkNotNullParameter(bVar, "$dbRef");
            C20469a aVar2 = f52775v;
            Intrinsics.checkNotNullExpressionValue(sQLiteDatabase, "dbObj");
            aVar.mo61408c(aVar2.mo61399a(bVar, sQLiteDatabase));
        }

        /* renamed from: c */
        public final boolean mo61383c() {
            return this.f52779d;
        }

        public void close() {
            try {
                C20493a.m95523c(this.f52781f, false, 1, (Object) null);
                super.close();
                this.f52777b.mo61401b((FrameworkSQLiteDatabase) null);
                this.f52782g = false;
            } finally {
                this.f52781f.mo61427d();
            }
        }

        @C12579k
        /* renamed from: d */
        public final C20481g.C20482a mo61385d() {
            return this.f52778c;
        }

        @C12579k
        /* renamed from: f */
        public final Context mo61386f() {
            return this.f52776a;
        }

        @C12579k
        /* renamed from: g */
        public final C20472b mo61387g() {
            return this.f52777b;
        }

        @C12579k
        /* renamed from: i */
        public final C20466f mo61388i(boolean z) {
            boolean z2;
            try {
                C20493a aVar = this.f52781f;
                if (this.f52782g || getDatabaseName() == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                aVar.mo61426b(z2);
                this.f52780e = false;
                SQLiteDatabase l = mo61391l(z);
                if (this.f52780e) {
                    close();
                    return mo61388i(z);
                }
                FrameworkSQLiteDatabase j = mo61389j(l);
                this.f52781f.mo61427d();
                return j;
            } finally {
                this.f52781f.mo61427d();
            }
        }

        @C12579k
        /* renamed from: j */
        public final FrameworkSQLiteDatabase mo61389j(@C12579k SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
            return f52775v.mo61399a(this.f52777b, sQLiteDatabase);
        }

        /* renamed from: k */
        public final SQLiteDatabase mo61390k(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|10|12|13|14|15|16) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0035 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.database.sqlite.SQLiteDatabase mo61391l(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                if (r0 == 0) goto L_0x0028
                android.content.Context r1 = r4.f52776a
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0028
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0028
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
            L_0x0028:
                android.database.sqlite.SQLiteDatabase r5 = r4.mo61390k(r5)     // Catch:{ all -> 0x002d }
                return r5
            L_0x002d:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0035 }
            L_0x0035:
                android.database.sqlite.SQLiteDatabase r5 = r4.mo61390k(r5)     // Catch:{ all -> 0x003a }
                return r5
            L_0x003a:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException
                if (r2 == 0) goto L_0x0067
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r1 = (androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) r1
                java.lang.Throwable r2 = r1.getCause()
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = r1.mo61397a()
                int[] r3 = androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.C20470b.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x0066
                r3 = 2
                if (r1 == r3) goto L_0x0066
                r3 = 3
                if (r1 == r3) goto L_0x0066
                r3 = 4
                if (r1 == r3) goto L_0x0066
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x0065
                goto L_0x0071
            L_0x0065:
                throw r2
            L_0x0066:
                throw r2
            L_0x0067:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x0082
                if (r0 == 0) goto L_0x0081
                boolean r2 = r4.f52779d
                if (r2 == 0) goto L_0x0081
            L_0x0071:
                android.content.Context r1 = r4.f52776a
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.mo61390k(r5)     // Catch:{ CallbackException -> 0x007b }
                return r5
            L_0x007b:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x0081:
                throw r1
            L_0x0082:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper.OpenHelper.mo61391l(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void onConfigure(@C12579k SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
            try {
                this.f52778c.mo61182b(mo61389j(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        public void onCreate(@C12579k SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f52778c.mo60972d(mo61389j(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        public void onDowngrade(@C12579k SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
            this.f52780e = true;
            try {
                this.f52778c.mo61183e(mo61389j(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        public void onOpen(@C12579k SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
            if (!this.f52780e) {
                try {
                    this.f52778c.mo60973f(mo61389j(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.f52782g = true;
        }

        public void onUpgrade(@C12579k SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
            this.f52780e = true;
            try {
                this.f52778c.mo60974g(mo61389j(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$a */
    public static final class C20471a {
        public /* synthetic */ C20471a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C20471a() {
        }
    }

    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$b */
    public static final class C20472b {
        @C12580l

        /* renamed from: a */
        public FrameworkSQLiteDatabase f52789a;

        public C20472b(@C12580l FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f52789a = frameworkSQLiteDatabase;
        }

        @C12580l
        /* renamed from: a */
        public final FrameworkSQLiteDatabase mo61400a() {
            return this.f52789a;
        }

        /* renamed from: b */
        public final void mo61401b(@C12580l FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f52789a = frameworkSQLiteDatabase;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FrameworkSQLiteOpenHelper(@C12579k Context context, @C12580l String str, @C12579k C20481g.C20482a aVar) {
        this(context, str, aVar, false, false, 24, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
    }

    /* renamed from: j */
    public static Object m95448j(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        return frameworkSQLiteOpenHelper.f52773f;
    }

    @C12579k
    /* renamed from: Z2 */
    public C20466f mo18111Z2() {
        return mo61382i().mo61388i(false);
    }

    public void close() {
        if (this.f52773f.isInitialized()) {
            mo61382i().close();
        }
    }

    @C12579k
    /* renamed from: d3 */
    public C20466f mo18117d3() {
        return mo61382i().mo61388i(true);
    }

    @C12580l
    public String getDatabaseName() {
        return this.f52769b;
    }

    /* renamed from: i */
    public final OpenHelper mo61382i() {
        return this.f52773f.getValue();
    }

    @C0376v0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f52773f.isInitialized()) {
            C20458c.C20459a.m95353h(mo61382i(), z);
        }
        this.f52774g = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FrameworkSQLiteOpenHelper(@C12579k Context context, @C12580l String str, @C12579k C20481g.C20482a aVar, boolean z) {
        this(context, str, aVar, z, false, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
    }

    @C11315i
    public FrameworkSQLiteOpenHelper(@C12579k Context context, @C12580l String str, @C12579k C20481g.C20482a aVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        this.f52768a = context;
        this.f52769b = str;
        this.f52770c = aVar;
        this.f52771d = z;
        this.f52772e = z2;
        this.f52773f = C10864b0.m38748c(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, C20481g.C20482a aVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
