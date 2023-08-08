package androidx.sqlite.p031db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import java.util.List;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.sqlite.db.c */
public final class C20458c {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0376v0(16)
    /* renamed from: androidx.sqlite.db.c$a */
    public static final class C20459a {
        @C12579k

        /* renamed from: a */
        public static final C20459a f52755a = new C20459a();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: a */
        public static final void m95346a(@C12579k CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: b */
        public static final CancellationSignal m95347b() {
            return new CancellationSignal();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: c */
        public static final boolean m95348c(@C12579k File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: d */
        public static final void m95349d(@C12579k SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: e */
        public static final boolean m95350e(@C12579k SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: f */
        public static final Cursor m95351f(@C12579k SQLiteDatabase sQLiteDatabase, @C12579k String str, @C12579k String[] strArr, @C12580l String str2, @C12579k CancellationSignal cancellationSignal, @C12579k SQLiteDatabase.CursorFactory cursorFactory) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(str, "sql");
            Intrinsics.checkNotNullParameter(strArr, "selectionArgs");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
            Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: g */
        public static final void m95352g(@C12579k SQLiteDatabase sQLiteDatabase, boolean z) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: h */
        public static final void m95353h(@C12579k SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0376v0(19)
    /* renamed from: androidx.sqlite.db.c$b */
    public static final class C20460b {
        @C12579k

        /* renamed from: a */
        public static final C20460b f52756a = new C20460b();

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: a */
        public static final Uri m95354a(@C12579k Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: b */
        public static final boolean m95355b(@C12579k ActivityManager activityManager) {
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0376v0(21)
    /* renamed from: androidx.sqlite.db.c$c */
    public static final class C20461c {
        @C12579k

        /* renamed from: a */
        public static final C20461c f52757a = new C20461c();

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: a */
        public static final File m95356a(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0376v0(23)
    /* renamed from: androidx.sqlite.db.c$d */
    public static final class C20462d {
        @C12579k

        /* renamed from: a */
        public static final C20462d f52758a = new C20462d();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: a */
        public static final void m95357a(@C12579k Cursor cursor, @C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(bundle, "extras");
            cursor.setExtras(bundle);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0376v0(29)
    /* renamed from: androidx.sqlite.db.c$e */
    public static final class C20463e {
        @C12579k

        /* renamed from: a */
        public static final C20463e f52759a = new C20463e();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        @C11384m
        /* renamed from: a */
        public static final List<Uri> m95358a(@C12579k Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            List<Uri> a = cursor.getNotificationUris();
            Intrinsics.checkNotNull(a);
            return a;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: b */
        public static final void m95359b(@C12579k Cursor cursor, @C12579k ContentResolver contentResolver, @C12579k List<? extends Uri> list) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(contentResolver, "cr");
            Intrinsics.checkNotNullParameter(list, "uris");
            cursor.setNotificationUris(contentResolver, list);
        }
    }
}
