package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.C20342a;
import androidx.sqlite.p031db.C20481g;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.i */
public class C20320i {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final Context f52451a;
    @C12580l
    @C11287e

    /* renamed from: b */
    public final String f52452b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final C20481g.C20487c f52453c;
    @C12579k
    @C11287e

    /* renamed from: d */
    public final RoomDatabase.C20273d f52454d;
    @C12580l
    @C11287e

    /* renamed from: e */
    public final List<RoomDatabase.C20271b> f52455e;
    @C11287e

    /* renamed from: f */
    public final boolean f52456f;
    @C12579k
    @C11287e

    /* renamed from: g */
    public final RoomDatabase.JournalMode f52457g;
    @C12579k
    @C11287e

    /* renamed from: h */
    public final Executor f52458h;
    @C12579k
    @C11287e

    /* renamed from: i */
    public final Executor f52459i;
    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C11287e

    /* renamed from: j */
    public final Intent f52460j;
    @C11287e

    /* renamed from: k */
    public final boolean f52461k;
    @C11287e

    /* renamed from: l */
    public final boolean f52462l;
    @C12580l

    /* renamed from: m */
    public final Set<Integer> f52463m;
    @C12580l
    @C11287e

    /* renamed from: n */
    public final String f52464n;
    @C12580l
    @C11287e

    /* renamed from: o */
    public final File f52465o;
    @C12580l
    @C11287e

    /* renamed from: p */
    public final Callable<InputStream> f52466p;
    @C12580l
    @C11287e

    /* renamed from: q */
    public final RoomDatabase.C20274e f52467q;
    @C12579k
    @C11287e

    /* renamed from: r */
    public final List<Object> f52468r;
    @C12579k
    @C11287e

    /* renamed from: s */
    public final List<C20342a> f52469s;
    @C11287e

    /* renamed from: t */
    public final boolean f52470t;

    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C20320i(@C12579k Context context, @C12580l String str, @C12579k C20481g.C20487c cVar, @C12579k RoomDatabase.C20273d dVar, @C12580l List<? extends RoomDatabase.C20271b> list, boolean z, @C12579k RoomDatabase.JournalMode journalMode, @C12579k Executor executor, @C12579k Executor executor2, @C12580l Intent intent, boolean z2, boolean z3, @C12580l Set<Integer> set, @C12580l String str2, @C12580l File file, @C12580l Callable<InputStream> callable, @C12580l RoomDatabase.C20274e eVar, @C12579k List<? extends Object> list2, @C12579k List<? extends C20342a> list3) {
        RoomDatabase.JournalMode journalMode2 = journalMode;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List<? extends Object> list4 = list2;
        List<? extends C20342a> list5 = list3;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cVar, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(dVar, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode2, "journalMode");
        Intrinsics.checkNotNullParameter(executor3, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor4, "transactionExecutor");
        Intrinsics.checkNotNullParameter(list4, "typeConverters");
        Intrinsics.checkNotNullParameter(list5, "autoMigrationSpecs");
        this.f52451a = context;
        this.f52452b = str;
        this.f52453c = cVar;
        this.f52454d = dVar;
        this.f52455e = list;
        this.f52456f = z;
        this.f52457g = journalMode2;
        this.f52458h = executor3;
        this.f52459i = executor4;
        this.f52460j = intent2;
        this.f52461k = z2;
        this.f52462l = z3;
        this.f52463m = set;
        this.f52464n = str2;
        this.f52465o = file;
        this.f52466p = callable;
        this.f52467q = eVar;
        this.f52468r = list4;
        this.f52469s = list5;
        this.f52470t = intent2 != null;
    }

    /* renamed from: a */
    public boolean mo61084a(int i, int i2) {
        boolean z;
        Set<Integer> set;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f52462l) {
            return false;
        }
        if (!this.f52461k || ((set = this.f52463m) != null && set.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }

    @C11395k(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @C11587t0(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    /* renamed from: b */
    public boolean mo61085b(int i) {
        return mo61084a(i, i + 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "This constructor is deprecated.", replaceWith = @C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C20320i(@C12579k Context context, @C12580l String str, @C12579k C20481g.C20487c cVar, @C12579k RoomDatabase.C20273d dVar, @C12580l List<? extends RoomDatabase.C20271b> list, boolean z, @C12579k RoomDatabase.JournalMode journalMode, @C12579k Executor executor, boolean z2, @C12580l Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, journalMode, executor, executor, (Intent) null, z2, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.C20274e) null, (List<? extends Object>) CollectionsKt__CollectionsKt.m40441E(), (List<? extends C20342a>) CollectionsKt__CollectionsKt.m40441E());
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cVar, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(dVar, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "This constructor is deprecated.", replaceWith = @kotlin.C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20320i(@org.jetbrains.annotations.C12579k android.content.Context r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20481g.C20487c r23, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.C20273d r24, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.room.RoomDatabase.C20271b> r25, boolean r26, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.JournalMode r27, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r28, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.C12580l java.util.Set<java.lang.Integer> r33) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r30 == 0) goto L_0x0034
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r10 = r0
            java.util.List r18 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r0.<init>((android.content.Context) r1, (java.lang.String) r2, (androidx.sqlite.p031db.C20481g.C20487c) r3, (androidx.room.RoomDatabase.C20273d) r4, (java.util.List<? extends androidx.room.RoomDatabase.C20271b>) r5, (boolean) r6, (androidx.room.RoomDatabase.JournalMode) r7, (java.util.concurrent.Executor) r8, (java.util.concurrent.Executor) r9, (android.content.Intent) r10, (boolean) r11, (boolean) r12, (java.util.Set<java.lang.Integer>) r13, (java.lang.String) r14, (java.io.File) r15, (java.util.concurrent.Callable<java.io.InputStream>) r16, (androidx.room.RoomDatabase.C20274e) r17, (java.util.List<? extends java.lang.Object>) r18, (java.util.List<? extends androidx.room.migration.C20342a>) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20320i.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.g$c, androidx.room.RoomDatabase$d, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "This constructor is deprecated.", replaceWith = @kotlin.C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20320i(@org.jetbrains.annotations.C12579k android.content.Context r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20481g.C20487c r23, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.C20273d r24, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.room.RoomDatabase.C20271b> r25, boolean r26, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.JournalMode r27, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r28, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.C12580l java.util.Set<java.lang.Integer> r33, @org.jetbrains.annotations.C12580l java.lang.String r34, @org.jetbrains.annotations.C12580l java.io.File r35) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r30 == 0) goto L_0x0034
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r10 = r0
            java.util.List r18 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r16 = 0
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r0.<init>((android.content.Context) r1, (java.lang.String) r2, (androidx.sqlite.p031db.C20481g.C20487c) r3, (androidx.room.RoomDatabase.C20273d) r4, (java.util.List<? extends androidx.room.RoomDatabase.C20271b>) r5, (boolean) r6, (androidx.room.RoomDatabase.JournalMode) r7, (java.util.concurrent.Executor) r8, (java.util.concurrent.Executor) r9, (android.content.Intent) r10, (boolean) r11, (boolean) r12, (java.util.Set<java.lang.Integer>) r13, (java.lang.String) r14, (java.io.File) r15, (java.util.concurrent.Callable<java.io.InputStream>) r16, (androidx.room.RoomDatabase.C20274e) r17, (java.util.List<? extends java.lang.Object>) r18, (java.util.List<? extends androidx.room.migration.C20342a>) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20320i.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.g$c, androidx.room.RoomDatabase$d, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "This constructor is deprecated.", replaceWith = @kotlin.C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20320i(@org.jetbrains.annotations.C12579k android.content.Context r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20481g.C20487c r23, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.C20273d r24, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.room.RoomDatabase.C20271b> r25, boolean r26, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.JournalMode r27, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r28, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.C12580l java.util.Set<java.lang.Integer> r33, @org.jetbrains.annotations.C12580l java.lang.String r34, @org.jetbrains.annotations.C12580l java.io.File r35, @org.jetbrains.annotations.C12580l java.util.concurrent.Callable<java.io.InputStream> r36) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r30 == 0) goto L_0x0034
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r10 = r0
            java.util.List r18 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r0.<init>((android.content.Context) r1, (java.lang.String) r2, (androidx.sqlite.p031db.C20481g.C20487c) r3, (androidx.room.RoomDatabase.C20273d) r4, (java.util.List<? extends androidx.room.RoomDatabase.C20271b>) r5, (boolean) r6, (androidx.room.RoomDatabase.JournalMode) r7, (java.util.concurrent.Executor) r8, (java.util.concurrent.Executor) r9, (android.content.Intent) r10, (boolean) r11, (boolean) r12, (java.util.Set<java.lang.Integer>) r13, (java.lang.String) r14, (java.io.File) r15, (java.util.concurrent.Callable<java.io.InputStream>) r16, (androidx.room.RoomDatabase.C20274e) r17, (java.util.List<? extends java.lang.Object>) r18, (java.util.List<? extends androidx.room.migration.C20342a>) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20320i.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.g$c, androidx.room.RoomDatabase$d, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "This constructor is deprecated.", replaceWith = @kotlin.C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20320i(@org.jetbrains.annotations.C12579k android.content.Context r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20481g.C20487c r23, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.C20273d r24, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.room.RoomDatabase.C20271b> r25, boolean r26, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.JournalMode r27, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r28, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.C12580l java.util.Set<java.lang.Integer> r33, @org.jetbrains.annotations.C12580l java.lang.String r34, @org.jetbrains.annotations.C12580l java.io.File r35, @org.jetbrains.annotations.C12580l java.util.concurrent.Callable<java.io.InputStream> r36, @org.jetbrains.annotations.C12580l androidx.room.RoomDatabase.C20274e r37) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r30 == 0) goto L_0x0034
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r10 = r0
            java.util.List r18 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r0.<init>((android.content.Context) r1, (java.lang.String) r2, (androidx.sqlite.p031db.C20481g.C20487c) r3, (androidx.room.RoomDatabase.C20273d) r4, (java.util.List<? extends androidx.room.RoomDatabase.C20271b>) r5, (boolean) r6, (androidx.room.RoomDatabase.JournalMode) r7, (java.util.concurrent.Executor) r8, (java.util.concurrent.Executor) r9, (android.content.Intent) r10, (boolean) r11, (boolean) r12, (java.util.Set<java.lang.Integer>) r13, (java.lang.String) r14, (java.io.File) r15, (java.util.concurrent.Callable<java.io.InputStream>) r16, (androidx.room.RoomDatabase.C20274e) r17, (java.util.List<? extends java.lang.Object>) r18, (java.util.List<? extends androidx.room.migration.C20342a>) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20320i.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.g$c, androidx.room.RoomDatabase$d, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.RoomDatabase$e):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "This constructor is deprecated.", replaceWith = @kotlin.C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20320i(@org.jetbrains.annotations.C12579k android.content.Context r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20481g.C20487c r23, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.C20273d r24, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.room.RoomDatabase.C20271b> r25, boolean r26, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.JournalMode r27, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r28, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.C12580l java.util.Set<java.lang.Integer> r33, @org.jetbrains.annotations.C12580l java.lang.String r34, @org.jetbrains.annotations.C12580l java.io.File r35, @org.jetbrains.annotations.C12580l java.util.concurrent.Callable<java.io.InputStream> r36, @org.jetbrains.annotations.C12580l androidx.room.RoomDatabase.C20274e r37, @org.jetbrains.annotations.C12579k java.util.List<? extends java.lang.Object> r38) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "typeConverters"
            r15 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            if (r30 == 0) goto L_0x003b
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r10 = r0
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r0.<init>((android.content.Context) r1, (java.lang.String) r2, (androidx.sqlite.p031db.C20481g.C20487c) r3, (androidx.room.RoomDatabase.C20273d) r4, (java.util.List<? extends androidx.room.RoomDatabase.C20271b>) r5, (boolean) r6, (androidx.room.RoomDatabase.JournalMode) r7, (java.util.concurrent.Executor) r8, (java.util.concurrent.Executor) r9, (android.content.Intent) r10, (boolean) r11, (boolean) r12, (java.util.Set<java.lang.Integer>) r13, (java.lang.String) r14, (java.io.File) r15, (java.util.concurrent.Callable<java.io.InputStream>) r16, (androidx.room.RoomDatabase.C20274e) r17, (java.util.List<? extends java.lang.Object>) r18, (java.util.List<? extends androidx.room.migration.C20342a>) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20320i.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.g$c, androidx.room.RoomDatabase$d, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.RoomDatabase$e, java.util.List):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "This constructor is deprecated.", replaceWith = @kotlin.C11587t0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20320i(@org.jetbrains.annotations.C12579k android.content.Context r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20481g.C20487c r23, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.C20273d r24, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.room.RoomDatabase.C20271b> r25, boolean r26, @org.jetbrains.annotations.C12579k androidx.room.RoomDatabase.JournalMode r27, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r28, @org.jetbrains.annotations.C12579k java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.C12580l java.util.Set<java.lang.Integer> r33, @org.jetbrains.annotations.C12580l java.lang.String r34, @org.jetbrains.annotations.C12580l java.io.File r35, @org.jetbrains.annotations.C12580l java.util.concurrent.Callable<java.io.InputStream> r36, @org.jetbrains.annotations.C12580l androidx.room.RoomDatabase.C20274e r37, @org.jetbrains.annotations.C12579k java.util.List<? extends java.lang.Object> r38, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.room.migration.C20342a> r39) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "typeConverters"
            r15 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "autoMigrationSpecs"
            r14 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            if (r30 == 0) goto L_0x0042
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r10 = r0
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r18 = r38
            r19 = r39
            r0.<init>((android.content.Context) r1, (java.lang.String) r2, (androidx.sqlite.p031db.C20481g.C20487c) r3, (androidx.room.RoomDatabase.C20273d) r4, (java.util.List<? extends androidx.room.RoomDatabase.C20271b>) r5, (boolean) r6, (androidx.room.RoomDatabase.JournalMode) r7, (java.util.concurrent.Executor) r8, (java.util.concurrent.Executor) r9, (android.content.Intent) r10, (boolean) r11, (boolean) r12, (java.util.Set<java.lang.Integer>) r13, (java.lang.String) r14, (java.io.File) r15, (java.util.concurrent.Callable<java.io.InputStream>) r16, (androidx.room.RoomDatabase.C20274e) r17, (java.util.List<? extends java.lang.Object>) r18, (java.util.List<? extends androidx.room.migration.C20342a>) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20320i.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.g$c, androidx.room.RoomDatabase$d, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.RoomDatabase$e, java.util.List, java.util.List):void");
    }
}
