package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.C30971a;

/* renamed from: com.google.android.gms.security.b */
public final class C30973b extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ Context f74205a;

    /* renamed from: b */
    public final /* synthetic */ C30971a.C30972a f74206b;

    public C30973b(Context context, C30971a.C30972a aVar) {
        this.f74205a = context;
        this.f74206b = aVar;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            C30971a.m124376a(this.f74205a);
            return 0;
        } catch (GooglePlayServicesRepairableException e) {
            return Integer.valueOf(e.mo133609b());
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.errorCode);
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f74206b.mo87647a();
            return;
        }
        this.f74206b.mo87648b(num.intValue(), C30971a.f74201b.mo134205e(this.f74205a, num.intValue(), "pi"));
    }
}
