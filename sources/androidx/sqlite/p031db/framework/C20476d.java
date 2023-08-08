package androidx.sqlite.p031db.framework;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.p031db.C20481g;
import androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper;

/* renamed from: androidx.sqlite.db.framework.d */
public final /* synthetic */ class C20476d implements DatabaseErrorHandler {

    /* renamed from: a */
    public final /* synthetic */ C20481g.C20482a f52792a;

    /* renamed from: b */
    public final /* synthetic */ FrameworkSQLiteOpenHelper.C20472b f52793b;

    public /* synthetic */ C20476d(C20481g.C20482a aVar, FrameworkSQLiteOpenHelper.C20472b bVar) {
        this.f52792a = aVar;
        this.f52793b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        FrameworkSQLiteOpenHelper.OpenHelper.m95453b(this.f52792a, this.f52793b, sQLiteDatabase);
    }
}
