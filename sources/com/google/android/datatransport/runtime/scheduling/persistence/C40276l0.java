package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.l0 */
public final /* synthetic */ class C40276l0 implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102611a;

    /* renamed from: b */
    public final /* synthetic */ C40203r f102612b;

    public /* synthetic */ C40276l0(C40280n0 n0Var, C40203r rVar) {
        this.f102611a = n0Var;
        this.f102612b = rVar;
    }

    public final Object apply(Object obj) {
        return this.f102611a.m163722g0(this.f102612b, (SQLiteDatabase) obj);
    }
}
