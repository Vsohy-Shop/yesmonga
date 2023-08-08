package com.google.maps.android.data.geojson;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.C33791b;
import com.google.maps.android.collections.C33796d;
import com.google.maps.android.collections.C33798e;
import com.google.maps.android.collections.C33800f;
import com.google.maps.android.data.C33820d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.maps.android.data.geojson.c */
public class C33827c extends C33820d {

    /* renamed from: b */
    public LatLngBounds f82009b;

    /* renamed from: com.google.maps.android.data.geojson.c$a */
    public interface C33828a extends C33820d.C33821a {
    }

    public C33827c(C30412c cVar, JSONObject jSONObject, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar) {
        if (jSONObject != null) {
            this.f82009b = null;
            C33834i iVar = new C33834i(jSONObject);
            this.f82009b = iVar.mo98318i();
            HashMap hashMap = new HashMap();
            Iterator<C33825a> it = iVar.mo98319j().iterator();
            while (it.hasNext()) {
                hashMap.put(it.next(), (Object) null);
            }
            mo98255u(new C33840n(cVar, hashMap, dVar, eVar, fVar, bVar));
            return;
        }
        throw new IllegalArgumentException("GeoJSON file cannot be null");
    }

    /* renamed from: w */
    public static JSONObject m136035w(InputStream inputStream) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return new JSONObject(sb.toString());
            }
        }
    }

    /* renamed from: d */
    public void mo98238d() {
        super.mo98236b();
    }

    /* renamed from: k */
    public Iterable<C33825a> mo98245k() {
        return super.mo98245k();
    }

    @C0359n0
    public String toString() {
        return "Collection{" + "\n Bounding box=" + this.f82009b + "\n}\n";
    }

    /* renamed from: v */
    public void mo98288v(C33825a aVar) {
        if (aVar != null) {
            super.mo98235a(aVar);
            return;
        }
        throw new IllegalArgumentException("Feature cannot be null");
    }

    /* renamed from: x */
    public LatLngBounds mo98289x() {
        return this.f82009b;
    }

    /* renamed from: y */
    public void mo98290y(C33825a aVar) {
        if (aVar != null) {
            super.mo98251q(aVar);
            return;
        }
        throw new IllegalArgumentException("Feature cannot be null");
    }

    public C33827c(C30412c cVar, int i, Context context, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar) throws IOException, JSONException {
        this(cVar, m136035w(context.getResources().openRawResource(i)), dVar, eVar, fVar, bVar);
    }

    public C33827c(C30412c cVar, JSONObject jSONObject) {
        this(cVar, jSONObject, (C33796d) null, (C33798e) null, (C33800f) null, (C33791b) null);
    }

    public C33827c(C30412c cVar, int i, Context context) throws IOException, JSONException {
        this(cVar, m136035w(context.getResources().openRawResource(i)), (C33796d) null, (C33798e) null, (C33800f) null, (C33791b) null);
    }
}
