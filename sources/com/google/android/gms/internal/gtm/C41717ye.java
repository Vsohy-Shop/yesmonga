package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.gtm.ye */
public final class C41717ye implements C41693xe {
    /* renamed from: a */
    public final C41213df mo136035a(byte[] bArr) throws zzpf {
        if (bArr == null) {
            throw new zzpf("Cannot parse a null byte[]");
        } else if (bArr.length != 0) {
            try {
                Object obj = new JSONObject(new String(bArr)).get("resource");
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    C41526qf qfVar = new C41526qf();
                    qfVar.mo135782c(jSONObject.optString("version"));
                    JSONArray jSONArray = jSONObject.getJSONArray("macros");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getJSONObject(i).getString("instance_name"));
                    }
                    List<C41622uf> d = C41549re.m168300d(jSONObject.getJSONArray("tags"), arrayList);
                    List<C41622uf> d2 = C41549re.m168300d(jSONObject.getJSONArray("predicates"), arrayList);
                    for (C41622uf a : C41549re.m168300d(jSONObject.getJSONArray("macros"), arrayList)) {
                        qfVar.mo135780a(a);
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray("rules");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        qfVar.mo135781b(C41549re.m168298b(jSONArray2.getJSONArray(i2), d, d2));
                    }
                    C41550rf d3 = qfVar.mo135783d();
                    C41493p6.m168152d("The container was successfully parsed from the resource");
                    return new C41213df(Status.f103184g, 0, new C41189cf((C41525qe) null, (byte[]) null, d3, 0), C41141af.f104438b.mo136035a(bArr).mo135228c());
                }
                throw new zzpf("Resource map not found");
            } catch (JSONException unused) {
                throw new zzpf("The resource data is corrupted. The container cannot be extracted from the JSON data");
            } catch (zzpf unused2) {
                throw new zzpf("The resource data is invalid. The container cannot be extracted from the JSON data");
            }
        } else {
            throw new zzpf("Cannot parse a 0 length byte[]");
        }
    }
}
