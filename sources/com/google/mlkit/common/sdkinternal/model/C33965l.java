package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.l */
public class C33965l {

    /* renamed from: a */
    public final URL f82451a;

    @C40473a
    public C33965l(@RecentlyNonNull String str) throws MalformedURLException {
        this.f82451a = new URL(str);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public URLConnection mo98805a() throws IOException {
        return (URLConnection) FirebasePerfUrlConnection.instrument(this.f82451a.openConnection());
    }
}
