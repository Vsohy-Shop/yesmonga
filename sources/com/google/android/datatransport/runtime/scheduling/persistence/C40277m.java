package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.m */
public final /* synthetic */ class C40277m implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ String f102613a;

    /* renamed from: b */
    public final /* synthetic */ LogEventDropped.Reason f102614b;

    /* renamed from: c */
    public final /* synthetic */ long f102615c;

    public /* synthetic */ C40277m(String str, LogEventDropped.Reason reason, long j) {
        this.f102613a = str;
        this.f102614b = reason;
        this.f102615c = j;
    }

    public final Object apply(Object obj) {
        return C40280n0.m163706L0(this.f102613a, this.f102614b, this.f102615c, (SQLiteDatabase) obj);
    }
}
