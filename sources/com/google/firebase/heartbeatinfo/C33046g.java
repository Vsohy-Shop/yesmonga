package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.core.p027os.C17842w0;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.annotations.concurrent.C32561a;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.C33058b;
import com.google.firebase.platforminfo.C33509i;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.firebase.heartbeatinfo.g */
public class C33046g implements C33050j, HeartBeatInfo {

    /* renamed from: a */
    public final C33058b<C33051k> f80175a;

    /* renamed from: b */
    public final Context f80176b;

    /* renamed from: c */
    public final C33058b<C33509i> f80177c;

    /* renamed from: d */
    public final Set<C33047h> f80178d;

    /* renamed from: e */
    public final Executor f80179e;

    public C33046g(Context context, String str, Set<C33047h> set, C33058b<C33509i> bVar, Executor executor) {
        this((C33058b<C33051k>) new C33045f(context, str), set, executor, bVar, context);
    }

    @C0359n0
    /* renamed from: g */
    public static C32580g<C33046g> m133379g() {
        C32578f0<Executor> a = C32578f0.m131623a(C32561a.class, Executor.class);
        return C32580g.m131637i(C33046g.class, C33050j.class, HeartBeatInfo.class).mo94693b(C32608v.m131747m(Context.class)).mo94693b(C32608v.m131747m(C33033f.class)).mo94693b(C32608v.m131751q(C33047h.class)).mo94693b(C32608v.m131749o(C33509i.class)).mo94693b(C32608v.m131746l(a)).mo94697f(new C33044e(a)).mo94695d();
    }

    /* renamed from: h */
    public static /* synthetic */ C33046g m133380h(C32578f0 f0Var, C32584h hVar) {
        return new C33046g((Context) hVar.get(Context.class), ((C33033f) hVar.get(C33033f.class)).mo95724t(), hVar.mo94708g(C33047h.class), hVar.mo94710h(C33509i.class), (Executor) hVar.mo94707f(f0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m133381i() throws Exception {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            C33051k kVar = this.f80175a.get();
            List<C33052l> c = kVar.mo95751c();
            kVar.mo95750b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                C33052l lVar = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.mo95736c());
                jSONObject.put("dates", new JSONArray(lVar.mo95735b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* renamed from: j */
    public static /* synthetic */ C33051k m133382j(Context context, String str) {
        return new C33051k(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m133383k() throws Exception {
        synchronized (this) {
            this.f80175a.get().mo95761m(System.currentTimeMillis(), this.f80177c.get().getUserAgent());
        }
        return null;
    }

    /* renamed from: a */
    public C31047k<String> mo95747a() {
        if (!C17842w0.m81309a(this.f80176b)) {
            return C31053n.m124525g("");
        }
        return C31053n.m124522d(this.f80179e, new C33042c(this));
    }

    @C0359n0
    /* renamed from: b */
    public synchronized HeartBeatInfo.HeartBeat mo95733b(@C0359n0 String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C33051k kVar = this.f80175a.get();
        if (kVar.mo95759k(currentTimeMillis)) {
            kVar.mo95757i();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    /* renamed from: l */
    public C31047k<Void> mo95748l() {
        if (this.f80178d.size() <= 0) {
            return C31053n.m124525g(null);
        }
        if (!C17842w0.m81309a(this.f80176b)) {
            return C31053n.m124525g(null);
        }
        return C31053n.m124522d(this.f80179e, new C33043d(this));
    }

    @C0344h1
    public C33046g(C33058b<C33051k> bVar, Set<C33047h> set, Executor executor, C33058b<C33509i> bVar2, Context context) {
        this.f80175a = bVar;
        this.f80178d = set;
        this.f80179e = executor;
        this.f80177c = bVar2;
        this.f80176b = context;
    }
}
