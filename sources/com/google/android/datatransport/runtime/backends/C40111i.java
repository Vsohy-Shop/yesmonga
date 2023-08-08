package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.android.datatransport.runtime.time.C40310b;
import com.google.android.datatransport.runtime.time.C40318h;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.backends.i */
public class C40111i {

    /* renamed from: a */
    public final Context f102331a;

    /* renamed from: b */
    public final C40309a f102332b;

    /* renamed from: c */
    public final C40309a f102333c;

    @Inject
    public C40111i(Context context, @C40318h C40309a aVar, @C40310b C40309a aVar2) {
        this.f102331a = context;
        this.f102332b = aVar;
        this.f102333c = aVar2;
    }

    /* renamed from: a */
    public C40110h mo132717a(String str) {
        return C40110h.m163308b(this.f102331a, this.f102332b, this.f102333c, str);
    }
}
