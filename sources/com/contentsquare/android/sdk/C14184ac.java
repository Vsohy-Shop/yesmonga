package com.contentsquare.android.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.ac */
public class C14184ac {

    /* renamed from: a */
    public final C14453jf f35057a;

    /* renamed from: b */
    public final HandlerThread f35058b;

    /* renamed from: c */
    public final C14451jd f35059c;

    /* renamed from: d */
    public final String f35060d;

    /* renamed from: e */
    public final String f35061e;

    /* renamed from: f */
    public final C14772u7 f35062f;

    /* renamed from: g */
    public final C14925z9 f35063g;

    /* renamed from: h */
    public C14187c f35064h;

    /* renamed from: com.contentsquare.android.sdk.ac$a */
    public class C14185a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f35065a;

        public C14185a(JSONObject jSONObject) {
            this.f35065a = jSONObject;
        }

        public void run() {
            String jSONObject = this.f35065a.toString();
            if (jSONObject != null) {
                C14184ac acVar = C14184ac.this;
                File i = acVar.f35059c.mo35664i(acVar.f35060d);
                if (!i.exists()) {
                    C14184ac acVar2 = C14184ac.this;
                    if (!acVar2.f35059c.mo35671p(acVar2.f35060d)) {
                        C14184ac acVar3 = C14184ac.this;
                        acVar3.f35057a.mo35677f("We could not create the logs directory: %s", acVar3.f35060d);
                        return;
                    }
                }
                if (i.exists()) {
                    C14184ac acVar4 = C14184ac.this;
                    acVar4.f35059c.mo35660e(acVar4.f35061e, jSONObject);
                    C14184ac acVar5 = C14184ac.this;
                    acVar5.f35057a.mo35674c("Crash report stored on disk. : %s", acVar5.f35061e);
                    return;
                }
                C14184ac.this.f35057a.mo35677f("Crash report failed to save on disk. logsDir doesn't exist : %s", i.getAbsoluteFile());
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.ac$b */
    public class C14186b implements Runnable {
        public C14186b() {
        }

        public void run() {
            C14184ac acVar = C14184ac.this;
            String[] o = acVar.f35059c.mo35670o(acVar.f35060d);
            if (o != null) {
                C14184ac.this.f35057a.mo35674c("Executing crashlog flush, have %d items", Integer.valueOf(o.length));
                for (String str : o) {
                    C14184ac.this.mo34540b(C14184ac.this.f35060d + File.separator + str);
                }
                return;
            }
            C14184ac.this.f35057a.mo35681l("Flush crash logs called, failed to get any crash logs.", new Object[0]);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.ac$c */
    public static class C14187c {

        /* renamed from: a */
        public final Handler f35068a;

        public C14187c(Handler handler) {
            this.f35068a = handler;
        }

        /* renamed from: a */
        public void mo34545a(Runnable runnable) {
            this.f35068a.post(runnable);
        }
    }

    public C14184ac(HandlerThread handlerThread, C14451jd jdVar, Context context, C14772u7 u7Var, C14925z9 z9Var) {
        this.f35057a = new C14453jf("CrashEventsProcessor");
        this.f35058b = handlerThread;
        handlerThread.start();
        this.f35059c = jdVar;
        this.f35062f = u7Var;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("cs");
        sb.append(str);
        sb.append("elogs");
        String sb2 = sb.toString();
        this.f35060d = sb2;
        this.f35061e = sb2 + str + u7Var.mo36566b();
        this.f35063g = z9Var;
    }

    /* renamed from: a */
    public void mo34539a() {
        this.f35057a.mo35676e("Flush crash logs called, posting a runnable to flush.");
        mo34542d().mo34545a(new C14186b());
    }

    /* renamed from: b */
    public final void mo34540b(String str) {
        List<String> r = this.f35059c.mo35673r(str);
        this.f35057a.mo35674c("Reading %d crash logs from disk path %s", Integer.valueOf(r.size()), str);
        if (!r.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String next : r) {
                try {
                    jSONArray.put(new JSONObject(next));
                } catch (JSONException e) {
                    this.f35057a.mo35678g(e, "[flush]: Error while parsing [object]:\n %s \n to JSONObject. %s", next);
                }
            }
            int length = jSONArray.length();
            if (length > 0) {
                this.f35057a.mo35674c("Sending %d crash logs", Integer.valueOf(length));
                if (this.f35063g.mo36951b("https://l.contentsquare.net/log/android", jSONArray).mo36969h() == 200) {
                    this.f35057a.mo35676e("Crash log successfully sent.");
                } else {
                    this.f35057a.mo35677f("Could not send the logs for file: %s", str);
                    return;
                }
            } else {
                return;
            }
        }
        this.f35059c.mo35663h(str);
    }

    /* renamed from: c */
    public void mo34541c(JSONObject jSONObject) {
        mo34542d().mo34545a(new C14185a(jSONObject));
    }

    /* renamed from: d */
    public C14187c mo34542d() {
        if (this.f35064h == null) {
            this.f35064h = new C14187c(new Handler(this.f35058b.getLooper()));
        }
        return this.f35064h;
    }

    public C14184ac(C14451jd jdVar, Context context, C14772u7 u7Var, C14925z9 z9Var) {
        this(new HandlerThread("CrashEventsProcessorThread"), jdVar, context, u7Var, z9Var);
    }
}
