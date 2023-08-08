package androidx.sqlite.p031db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p031db.C20489i;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", "", "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1 */
public final class FrameworkSQLiteDatabase$query$cursorFactory$1 extends Lambda implements C11306r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
    final /* synthetic */ C20489i $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteDatabase$query$cursorFactory$1(C20489i iVar) {
        super(4);
        this.$query = iVar;
    }

    @C12579k
    /* renamed from: a */
    public final SQLiteCursor invoke(@C12580l SQLiteDatabase sQLiteDatabase, @C12580l SQLiteCursorDriver sQLiteCursorDriver, @C12580l String str, @C12580l SQLiteQuery sQLiteQuery) {
        C20489i iVar = this.$query;
        Intrinsics.checkNotNull(sQLiteQuery);
        iVar.mo61234c(new C20478f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
