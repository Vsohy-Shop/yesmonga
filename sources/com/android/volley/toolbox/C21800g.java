package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.C21759i;
import com.android.volley.C21760j;
import com.android.volley.C21762l;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.volley.toolbox.g */
public class C21800g implements C21760j {

    /* renamed from: d */
    public static final int f56395d = 4096;
    @Deprecated

    /* renamed from: a */
    public final C21814o f56396a;

    /* renamed from: b */
    public final C21794e f56397b;

    /* renamed from: c */
    public final C21801h f56398c;

    @Deprecated
    public C21800g(C21814o oVar) {
        this(oVar, new C21801h(4096));
    }

    @Deprecated
    /* renamed from: b */
    public static Map<String, String> m100167b(C21759i[] iVarArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < iVarArr.length; i++) {
            treeMap.put(iVarArr[i].mo64934a(), iVarArr[i].mo64935b());
        }
        return treeMap;
    }

    /* renamed from: a */
    public C21762l mo64834a(Request<?> request) throws VolleyError {
        byte[] bArr;
        C21813n nVar;
        IOException iOException;
        C21813n b;
        int e;
        List<C21759i> d;
        byte[] bArr2;
        Request<?> request2 = request;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                b = this.f56397b.mo64980b(request2, C21812m.m100213c(request.mo64796Z()));
                try {
                    e = b.mo65028e();
                    d = b.mo65027d();
                    break;
                } catch (IOException e2) {
                    bArr = null;
                    nVar = b;
                    iOException = e2;
                }
            } catch (IOException e3) {
                iOException = e3;
                nVar = null;
                bArr = null;
            }
            C21831v.m100291a(request2, C21831v.m100295e(request, iOException, elapsedRealtime, nVar, bArr));
        }
        if (e == 304) {
            return C21831v.m100292b(request2, SystemClock.elapsedRealtime() - elapsedRealtime, d);
        }
        InputStream a = b.mo65024a();
        if (a != null) {
            bArr2 = C21831v.m100293c(a, b.mo65026c(), this.f56398c);
        } else {
            bArr2 = new byte[0];
        }
        C21831v.m100294d(SystemClock.elapsedRealtime() - elapsedRealtime, request2, bArr2, e);
        if (e < 200 || e > 299) {
            throw new IOException();
        }
        return new C21762l(e, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, d);
    }

    @Deprecated
    public C21800g(C21814o oVar, C21801h hVar) {
        this.f56396a = oVar;
        this.f56397b = new C21782a(oVar);
        this.f56398c = hVar;
    }

    public C21800g(C21794e eVar) {
        this(eVar, new C21801h(4096));
    }

    public C21800g(C21794e eVar, C21801h hVar) {
        this.f56397b = eVar;
        this.f56396a = eVar;
        this.f56398c = hVar;
    }
}
