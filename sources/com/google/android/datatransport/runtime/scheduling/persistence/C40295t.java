package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.t */
public final /* synthetic */ class C40295t implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102640a;

    /* renamed from: b */
    public final /* synthetic */ List f102641b;

    /* renamed from: c */
    public final /* synthetic */ C40203r f102642c;

    public /* synthetic */ C40295t(C40280n0 n0Var, List list, C40203r rVar) {
        this.f102640a = n0Var;
        this.f102641b = list;
        this.f102642c = rVar;
    }

    public final Object apply(Object obj) {
        return this.f102640a.m163693A0(this.f102641b, this.f102642c, (Cursor) obj);
    }
}
