package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.r */
public final /* synthetic */ class C40291r implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ long f102637a;

    /* renamed from: b */
    public final /* synthetic */ C40203r f102638b;

    public /* synthetic */ C40291r(long j, C40203r rVar) {
        this.f102637a = j;
        this.f102638b = rVar;
    }

    public final Object apply(Object obj) {
        return C40280n0.m163707N0(this.f102637a, this.f102638b, (SQLiteDatabase) obj);
    }
}
