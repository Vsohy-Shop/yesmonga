package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.C40177a;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g0 */
public final /* synthetic */ class C40264g0 implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102600a;

    /* renamed from: b */
    public final /* synthetic */ String f102601b;

    /* renamed from: c */
    public final /* synthetic */ Map f102602c;

    /* renamed from: d */
    public final /* synthetic */ C40177a.C40178a f102603d;

    public /* synthetic */ C40264g0(C40280n0 n0Var, String str, Map map, C40177a.C40178a aVar) {
        this.f102600a = n0Var;
        this.f102601b = str;
        this.f102602c = map;
        this.f102603d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f102600a.m163746x0(this.f102601b, this.f102602c, this.f102603d, (SQLiteDatabase) obj);
    }
}
