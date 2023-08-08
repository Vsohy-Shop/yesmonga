package androidx.sqlite.p031db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p031db.C20489i;

/* renamed from: androidx.sqlite.db.framework.a */
public final /* synthetic */ class C20473a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C20489i f52790a;

    public /* synthetic */ C20473a(C20489i iVar) {
        this.f52790a = iVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return FrameworkSQLiteDatabase.m95401f(this.f52790a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
