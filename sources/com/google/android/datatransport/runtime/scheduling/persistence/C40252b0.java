package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b0 */
public final /* synthetic */ class C40252b0 implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ C40280n0 f102588a;

    /* renamed from: b */
    public final /* synthetic */ String f102589b;

    /* renamed from: c */
    public final /* synthetic */ String f102590c;

    public /* synthetic */ C40252b0(C40280n0 n0Var, String str, String str2) {
        this.f102588a = n0Var;
        this.f102589b = str;
        this.f102590c = str2;
    }

    public final Object apply(Object obj) {
        return this.f102588a.m163704H0(this.f102589b, this.f102590c, (SQLiteDatabase) obj);
    }
}
