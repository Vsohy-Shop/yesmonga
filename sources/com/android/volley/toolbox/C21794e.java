package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C21759i;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.android.volley.toolbox.e */
public abstract class C21794e implements C21814o {
    @Deprecated
    /* renamed from: a */
    public final HttpResponse mo64994a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        C21813n b = mo64980b(request, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b.mo65028e(), ""));
        ArrayList arrayList = new ArrayList();
        for (C21759i next : b.mo65027d()) {
            arrayList.add(new BasicHeader(next.mo64934a(), next.mo64935b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream a = b.mo65024a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength((long) b.mo65026c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    /* renamed from: b */
    public abstract C21813n mo64980b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;
}
