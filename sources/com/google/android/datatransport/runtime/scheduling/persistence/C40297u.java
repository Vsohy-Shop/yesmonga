package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.u */
public final /* synthetic */ class C40297u implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102643a;

    /* renamed from: b */
    public final /* synthetic */ long f102644b;

    public /* synthetic */ C40297u(C40280n0 n0Var, long j) {
        this.f102643a = n0Var;
        this.f102644b = j;
    }

    public final Object apply(Object obj) {
        return this.f102643a.m163710W(this.f102644b, (SQLiteDatabase) obj);
    }
}
