package com.contentsquare.android.sdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import com.contentsquare.android.sdk.C14925z9;
import com.google.android.datatransport.cct.C40042a;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.k5 */
public class C14473k5 extends AsyncTask<String, Void, Void> {

    /* renamed from: a */
    public int f35763a = 4;

    /* renamed from: b */
    public int f35764b = 1000;

    /* renamed from: c */
    public final C14474a f35765c;

    /* renamed from: d */
    public final C14925z9 f35766d;

    /* renamed from: e */
    public final C14404hd f35767e;

    /* renamed from: f */
    public final C14453jf f35768f = new C14453jf("ConfigRetrieverTask");

    /* renamed from: g */
    public final C14771u6 f35769g;

    /* renamed from: h */
    public boolean f35770h = false;

    /* renamed from: com.contentsquare.android.sdk.k5$a */
    public interface C14474a {
        /* renamed from: a */
        void mo35101a();
    }

    public C14473k5(C14771u6 u6Var, C14474a aVar, C14925z9 z9Var, C14404hd hdVar) {
        this.f35769g = u6Var;
        this.f35765c = aVar;
        this.f35766d = z9Var;
        this.f35767e = hdVar;
    }

    /* renamed from: a */
    public final String mo35744a(String str, String str2, int i) {
        C14925z9.C14926a l = this.f35766d.mo36961l(str, (List<Pair>) null);
        if (l.mo36969h() == 200) {
            this.f35768f.mo35674c("Got HTTP_OK for path: [%s]", str);
            String i2 = l.mo36970i();
            if (!TextUtils.isEmpty(i2)) {
                this.f35768f.mo35674c("Got remote config %s", i2);
                return i2;
            }
        }
        if (l.mo36969h() == 404) {
            this.f35768f.mo35677f("Got HTTP_NOT_FOUND for path [%s]", str);
            C14453jf.m62246k("Config for package name \"%s\" could not be retrieved. A Contentsquare project might not have been created for you yet. Send your package name to your Contentsquare contact.", str2);
        }
        if (l.mo36969h() >= 400) {
            this.f35768f.mo35679i("Failed to fetch config for [%s]. Network error: [%d]", str2, Integer.valueOf(l.mo36969h()));
        }
        int i3 = i - 1;
        int i4 = this.f35763a - i3;
        if (i3 <= 0) {
            return null;
        }
        this.f35768f.mo35681l("retrying the conf fetch for the %d th time", Integer.valueOf(i4));
        try {
            int pow = (int) (((double) this.f35764b) * Math.pow((double) i4, 2.0d));
            this.f35768f.mo35674c("sleeping %d msec before the next retry", Integer.valueOf(pow));
            Thread.sleep((long) pow);
        } catch (InterruptedException e) {
            this.f35768f.mo35678g(e, "Config fetch interrupted.", new Object[0]);
        }
        return mo35744a(str, str2, i3);
    }

    /* renamed from: b */
    public Void doInBackground(String... strArr) {
        C14466k4 k4Var;
        boolean z;
        C14485ke.m62427a();
        String str = strArr[0];
        String a = this.f35769g.mo36562d() ? mo35744a(C14920z5.m64193c(str), str, this.f35763a) : null;
        if (a == null || isCancelled()) {
            z = true;
            k4Var = null;
        } else {
            k4Var = C14466k4.m62296b(a);
            z = false;
        }
        C14453jf jfVar = this.f35768f;
        Object[] objArr = new Object[1];
        objArr[0] = z ? "cache" : "network";
        jfVar.mo35679i("Config: Applied project config from %s.", objArr);
        if (k4Var == null) {
            return null;
        }
        String f = this.f35769g.mo36564f();
        String g = k4Var.mo35713g();
        boolean z2 = !mo35747d(g, f);
        if (C14358g3.m61811e(g) || !z2) {
            this.f35768f.mo35676e("the config fetched from CS servers is the same as the one saved in the device");
        } else {
            this.f35769g.mo36560b(g);
            this.f35767e.mo35505a(k4Var.mo35711e().mo35732j());
            this.f35770h = true;
        }
        return null;
    }

    /* renamed from: c */
    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        if (!isCancelled()) {
            if (this.f35770h) {
                this.f35770h = false;
                this.f35765c.mo35101a();
                return;
            }
            this.f35768f.mo35676e("callback not called");
        }
    }

    /* renamed from: d */
    public final boolean mo35747d(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.replace("\n", "").replace(" ", "").replace(C40042a.f102078h, "").equals(str2.replace("\n", "").replace(" ", "").replace(C40042a.f102078h, ""));
    }

    public void onPreExecute() {
        super.onPreExecute();
        if (!isCancelled() && this.f35769g.mo36561c() != null) {
            this.f35765c.mo35101a();
        }
    }
}
