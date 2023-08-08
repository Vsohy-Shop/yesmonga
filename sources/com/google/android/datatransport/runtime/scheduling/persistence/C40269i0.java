package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.firebase.transport.C40177a;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.i0 */
public final /* synthetic */ class C40269i0 implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102607a;

    /* renamed from: b */
    public final /* synthetic */ Map f102608b;

    /* renamed from: c */
    public final /* synthetic */ C40177a.C40178a f102609c;

    public /* synthetic */ C40269i0(C40280n0 n0Var, Map map, C40177a.C40178a aVar) {
        this.f102607a = n0Var;
        this.f102608b = map;
        this.f102609c = aVar;
    }

    public final Object apply(Object obj) {
        return this.f102607a.m163741t0(this.f102608b, this.f102609c, (Cursor) obj);
    }
}
