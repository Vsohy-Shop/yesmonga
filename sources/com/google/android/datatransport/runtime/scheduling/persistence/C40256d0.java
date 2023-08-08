package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.d0 */
public final /* synthetic */ class C40256d0 implements C40280n0.C40282b {

    /* renamed from: a */
    public final /* synthetic */ long f102592a;

    public /* synthetic */ C40256d0(long j) {
        this.f102592a = j;
    }

    public final Object apply(Object obj) {
        return ((Cursor) obj).moveToNext();
    }
}
