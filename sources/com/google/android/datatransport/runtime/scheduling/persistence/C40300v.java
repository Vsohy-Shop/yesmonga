package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.v */
public final /* synthetic */ class C40300v implements C40280n0.C40284d {

    /* renamed from: a */
    public final /* synthetic */ SQLiteDatabase f102670a;

    public /* synthetic */ C40300v(SQLiteDatabase sQLiteDatabase) {
        this.f102670a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final Object mo132943a() {
        return this.f102670a.beginTransaction();
    }
}
