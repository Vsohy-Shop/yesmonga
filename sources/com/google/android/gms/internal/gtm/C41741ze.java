package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.gtm.ze */
public final class C41741ze implements C41693xe {
    /* renamed from: a */
    public final C41213df mo136035a(byte[] bArr) throws zzpf {
        C41142ag agVar;
        if (bArr == null) {
            throw new zzpf("Cannot parse a null byte[]");
        } else if (bArr.length != 0) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
                if (optJSONArray == null) {
                    agVar = null;
                } else {
                    C41718yf yfVar = new C41718yf();
                    Object obj = jSONObject.get("resource");
                    if (obj instanceof JSONObject) {
                        yfVar.mo136105b(((JSONObject) obj).optString("version"));
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            Object obj2 = optJSONArray.get(i);
                            if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                                yfVar.mo136104a(C41549re.m168297a(obj2));
                            }
                        }
                        agVar = yfVar.mo136106c();
                    } else {
                        throw new zzpf("Resource map not found");
                    }
                }
                if (agVar != null) {
                    C41493p6.m168152d("The runtime configuration was successfully parsed from the resource");
                }
                return new C41213df(Status.f103184g, 0, (C41189cf) null, agVar);
            } catch (JSONException unused) {
                throw new zzpf("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
            } catch (zzpf unused2) {
                throw new zzpf("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
            }
        } else {
            throw new zzpf("Cannot parse a 0 length byte[]");
        }
    }
}
