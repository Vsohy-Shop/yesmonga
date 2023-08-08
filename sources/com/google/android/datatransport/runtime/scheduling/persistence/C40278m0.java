package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.m0 */
public final /* synthetic */ class C40278m0 implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102616a;

    /* renamed from: b */
    public final /* synthetic */ C40190j f102617b;

    /* renamed from: c */
    public final /* synthetic */ C40203r f102618c;

    public /* synthetic */ C40278m0(C40280n0 n0Var, C40190j jVar, C40203r rVar) {
        this.f102616a = n0Var;
        this.f102617b = jVar;
        this.f102618c = rVar;
    }

    public final Object apply(Object obj) {
        return this.f102616a.m163698D0(this.f102617b, this.f102618c, (SQLiteDatabase) obj);
    }
}
