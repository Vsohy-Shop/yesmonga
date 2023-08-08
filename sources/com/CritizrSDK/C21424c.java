package com.CritizrSDK;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.CritizrSDK.c */
public class C21424c {

    /* renamed from: b */
    public static final boolean f55184b = false;

    /* renamed from: c */
    public static final String f55185c = "CRITIZR_SDK";

    /* renamed from: d */
    public static final boolean f55186d = true;

    /* renamed from: e */
    public static final String f55187e = "https://critizr.com/";

    /* renamed from: f */
    public static final String f55188f = "extra_url";

    /* renamed from: g */
    public static final String f55189g = "extra_api_key";

    /* renamed from: h */
    public static C21424c f55190h;

    /* renamed from: i */
    public static String f55191i;

    /* renamed from: a */
    public C21423b f55192a;

    /* renamed from: com.CritizrSDK.c$a */
    public class C21425a extends AsyncTask<String, String, String> {
        public C21425a() {
        }

        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                HttpResponse execute = FirebasePerfHttpClient.execute(new DefaultHttpClient(), new HttpGet(strArr[0]));
                StatusLine statusLine = execute.getStatusLine();
                if (statusLine.getStatusCode() == 200) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    execute.getEntity().writeTo(byteArrayOutputStream);
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString();
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                execute.getEntity().writeTo(byteArrayOutputStream2);
                byteArrayOutputStream2.close();
                String byteArrayOutputStream3 = byteArrayOutputStream2.toString();
                throw new IOException(statusLine.getReasonPhrase());
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (C21424c.this.f55192a == null) {
                return;
            }
            if (str == null) {
                C21424c.this.f55192a.mo63892d0();
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("crm_stats")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("crm_stats");
                    if (jSONObject2.has("crm_rating")) {
                        C21424c.this.f55192a.mo63893i0(jSONObject2.getDouble("crm_rating"));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                C21424c.this.f55192a.mo63892d0();
            }
        }
    }

    public C21424c(String str) {
        f55191i = str;
    }

    /* renamed from: b */
    public static void m98768b(String str) {
    }

    /* renamed from: c */
    public static synchronized C21424c m98769c(String str) {
        C21424c cVar;
        synchronized (C21424c.class) {
            if (f55190h == null) {
                f55190h = new C21424c(str);
            }
            cVar = f55190h;
        }
        return cVar;
    }

    /* renamed from: d */
    public void mo63895d(String str, C21423b bVar) {
        this.f55192a = bVar;
        new C21425a().execute(new String[]{"https://critizr.com/widgets/api/" + f55191i + "/place/" + str + "/"});
    }

    /* renamed from: e */
    public void mo63896e() {
        C21423b bVar = this.f55192a;
        if (bVar != null) {
            bVar.mo63894k0();
        }
    }

    /* renamed from: f */
    public void mo63897f(Context context, C21423b bVar, int i, JSONObject jSONObject) {
        mo63898g(context, bVar, String.valueOf(i), jSONObject);
    }

    /* renamed from: g */
    public void mo63898g(Context context, C21423b bVar, String str, JSONObject jSONObject) {
        this.f55192a = bVar;
        context.startActivity(new Intent(context, CritizrActivity.class).putExtra("extra_url", "https://critizr.com/widgets/" + f55191i + "/sdk/" + str + "/" + C21427e.m98777a(jSONObject)).putExtra("extra_api_key", f55191i));
    }

    /* renamed from: h */
    public void mo63899h(Context context, C21423b bVar, JSONObject jSONObject) {
        this.f55192a = bVar;
        context.startActivity(new Intent(context, CritizrActivity.class).putExtra("extra_url", "https://critizr.com/store_locator/" + f55191i + "/sdk/" + C21427e.m98777a(jSONObject)).putExtra("extra_api_key", f55191i));
    }
}
