package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.z */
public final /* synthetic */ class C40305z implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102675a;

    /* renamed from: b */
    public final /* synthetic */ C40203r f102676b;

    public /* synthetic */ C40305z(C40280n0 n0Var, C40203r rVar) {
        this.f102675a = n0Var;
        this.f102676b = rVar;
    }

    public final Object apply(Object obj) {
        return this.f102675a.m163737q0(this.f102676b, (SQLiteDatabase) obj);
    }
}
