package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40525c;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import org.jsoup.helper.C12741a;

public class AvailabilityException extends Exception {
    private final C1866a zaa;

    public AvailabilityException(@C0359n0 C1866a aVar) {
        this.zaa = aVar;
    }

    @C0359n0
    /* renamed from: a */
    public ConnectionResult mo133630a(@C0359n0 C40504h<? extends C40477a.C40481d> hVar) {
        boolean z;
        C40525c<? extends C40477a.C40481d> h = hVar.mo133714h();
        if (this.zaa.get(h) != null) {
            z = true;
        } else {
            z = false;
        }
        String b = h.mo133841b();
        C40843u.m166192b(z, "The given API (" + b + ") was not part of the availability request.");
        return (ConnectionResult) C40843u.m166202l((ConnectionResult) this.zaa.get(h));
    }

    @C0359n0
    /* renamed from: b */
    public ConnectionResult mo133631b(@C0359n0 C40660j<? extends C40477a.C40481d> jVar) {
        boolean z;
        C40525c<? extends C40477a.C40481d> h = jVar.mo133714h();
        if (this.zaa.get(h) != null) {
            z = true;
        } else {
            z = false;
        }
        String b = h.mo133841b();
        C40843u.m166192b(z, "The given API (" + b + ") was not part of the availability request.");
        return (ConnectionResult) C40843u.m166202l((ConnectionResult) this.zaa.get(h));
    }

    @C0359n0
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C40525c cVar : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C40843u.m166202l((ConnectionResult) this.zaa.get(cVar));
            z &= !connectionResult.mo133595e0();
            arrayList.add(cVar.mo133841b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join(C12741a.f31457b, arrayList));
        return sb.toString();
    }
}
