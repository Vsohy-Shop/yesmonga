package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.measurement.internal.m3 */
public final class C30803m3 extends SQLiteOpenHelper {

    /* renamed from: a */
    public final /* synthetic */ C30815n3 f73741a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30803m3(C30815n3 n3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f73741a = n3Var;
    }

    @C0348i1
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f73741a.f74136a.mo86903d().mo87489r().mo87463a("Opening the local database failed, dropping and recreating it");
            this.f73741a.f74136a.mo87130z();
            if (!this.f73741a.f74136a.mo86902c().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f73741a.f74136a.mo86903d().mo87489r().mo87464b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f73741a.f74136a.mo86903d().mo87489r().mo87464b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @C0348i1
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C30799m.m123948b(this.f73741a.f74136a.mo86903d(), sQLiteDatabase);
    }

    @C0348i1
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @C0348i1
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C30799m.m123947a(this.f73741a.f74136a.mo86903d(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @C0348i1
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
