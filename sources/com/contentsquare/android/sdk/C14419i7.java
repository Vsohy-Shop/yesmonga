package com.contentsquare.android.sdk;

import android.util.SparseArray;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.i7 */
public class C14419i7 {

    /* renamed from: com.contentsquare.android.sdk.i7$a */
    public static class C14420a implements ValueCallback<String> {

        /* renamed from: a */
        public final int f35641a;

        /* renamed from: b */
        public final C14421b f35642b;

        public C14420a(int i, C14421b bVar) {
            this.f35641a = i;
            this.f35642b = bVar;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f35642b.mo35536b(this.f35641a, str);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.i7$b */
    public static abstract class C14421b {

        /* renamed from: a */
        public final C14453jf f35643a = new C14453jf("WebViewsScreenGraphsCallback");

        /* renamed from: b */
        public final SparseArray<C14249c8> f35644b;

        /* renamed from: c */
        public int f35645c;

        public C14421b(SparseArray<C14249c8> sparseArray) {
            this.f35644b = sparseArray;
            this.f35645c = sparseArray.size();
        }

        /* renamed from: a */
        public abstract void mo35059a();

        /* renamed from: b */
        public void mo35536b(int i, String str) {
            try {
                C14249c8 c8Var = this.f35644b.get(i);
                if (mo35537c(str)) {
                    c8Var.mo34839b(2);
                    c8Var.mo34847j(new JSONObject(str));
                }
                int i2 = this.f35645c - 1;
                this.f35645c = i2;
                if (i2 != 0) {
                    return;
                }
            } catch (JSONException e) {
                this.f35643a.mo35680j(e, "Failed to Serialized Scenegraph to JSON", new Object[0]);
                int i3 = this.f35645c - 1;
                this.f35645c = i3;
                if (i3 != 0) {
                    return;
                }
            } catch (Throwable th) {
                int i4 = this.f35645c - 1;
                this.f35645c = i4;
                if (i4 == 0) {
                    mo35059a();
                }
                throw th;
            }
            mo35059a();
        }

        /* renamed from: c */
        public boolean mo35537c(String str) {
            return str != null && !str.isEmpty() && !"null".equalsIgnoreCase(str);
        }
    }

    /* renamed from: a */
    public void mo35533a(List<WebView> list, C14421b bVar) {
        for (WebView next : list) {
            next.evaluateJavascript("JSON.parse(cs_wvt.push(['serializeWebView']));", new C14420a(next.hashCode(), bVar));
        }
    }
}
