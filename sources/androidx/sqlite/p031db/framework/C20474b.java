package androidx.sqlite.p031db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.C11306r;

/* renamed from: androidx.sqlite.db.framework.b */
public final /* synthetic */ class C20474b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C11306r f52791a;

    public /* synthetic */ C20474b(C11306r rVar) {
        this.f52791a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return FrameworkSQLiteDatabase.m95400d(this.f52791a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
