package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.contentsquare.android.sdk.tb */
public class C14749tb {

    /* renamed from: a */
    public String f36511a = "";

    /* renamed from: b */
    public String f36512b = "";

    /* renamed from: c */
    public List<C14249c8> f36513c = new ArrayList();

    /* renamed from: a */
    public String mo36519a() {
        return this.f36512b;
    }

    /* renamed from: b */
    public void mo36520b(String str) {
        this.f36512b = str;
    }

    /* renamed from: c */
    public void mo36521c(List<C14249c8> list) {
        this.f36513c = list;
    }

    /* renamed from: d */
    public String mo36522d() {
        return this.f36511a;
    }

    /* renamed from: e */
    public void mo36523e(String str) {
        this.f36511a = str;
    }

    /* renamed from: f */
    public JSONArray mo36524f() {
        JSONArray jSONArray = new JSONArray();
        for (C14249c8 o : this.f36513c) {
            jSONArray.put(o.mo34852o());
        }
        return jSONArray;
    }
}
