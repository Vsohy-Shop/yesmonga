package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C21759i;
import com.android.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.android.volley.toolbox.a */
public class C21782a extends C21794e {

    /* renamed from: a */
    public final C21814o f56356a;

    public C21782a(C21814o oVar) {
        this.f56356a = oVar;
    }

    /* renamed from: b */
    public C21813n mo64980b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            HttpResponse a = this.f56356a.mo64994a(request, map);
            int statusCode = a.getStatusLine().getStatusCode();
            Header[] allHeaders = a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C21759i(header.getName(), header.getValue()));
            }
            if (a.getEntity() == null) {
                return new C21813n(statusCode, arrayList);
            }
            long contentLength = a.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C21813n(statusCode, arrayList, (int) a.getEntity().getContentLength(), a.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
