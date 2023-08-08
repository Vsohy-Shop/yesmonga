package com.onetrust.otpublishers.headless.Internal.Network;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.work.BackoffPolicy;
import androidx.work.C21087c;
import androidx.work.C21091d;
import androidx.work.C21379m;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.google.firebase.remoteconfig.C33585u;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34970d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34976h;
import com.onetrust.otpublishers.headless.Internal.Helper.C34978j;
import com.onetrust.otpublishers.headless.Internal.Helper.C34981m;
import com.onetrust.otpublishers.headless.Internal.Helper.C34985q;
import com.onetrust.otpublishers.headless.Internal.Helper.C34990u;
import com.onetrust.otpublishers.headless.Internal.Helper.C34992w;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C34999c;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTGeolocationModel;
import com.onetrust.otpublishers.headless.Public.DataModel.OTProfileSyncParams;
import com.onetrust.otpublishers.headless.Public.DataModel.OTSdkParams;
import com.onetrust.otpublishers.headless.Public.OTCallback;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;
import com.onetrust.otpublishers.headless.Public.Response.OTResponseType;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35206f1;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.C12983b;
import retrofit2.C13008d;
import retrofit2.C13091w;
import retrofit2.C13092x;
import retrofit2.converter.scalars.C13006c;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Network.f */
public class C35006f {

    /* renamed from: a */
    public final Context f85155a;

    /* renamed from: b */
    public String f85156b;

    /* renamed from: c */
    public C35014d f85157c;

    /* renamed from: d */
    public C35020d f85158d = new C35020d();

    /* renamed from: com.onetrust.otpublishers.headless.Internal.Network.f$a */
    public class C35007a implements C13008d<String> {

        /* renamed from: a */
        public final /* synthetic */ String f85159a;

        /* renamed from: b */
        public final /* synthetic */ OTCallback f85160b;

        /* renamed from: c */
        public final /* synthetic */ OTPublishersHeadlessSDK f85161c;

        public C35007a(String str, OTCallback oTCallback, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
            this.f85159a = str;
            this.f85160b = oTCallback;
            this.f85161c = oTPublishersHeadlessSDK;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m143522d(C13091w wVar, String str, OTCallback oTCallback, Handler handler, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
            OTLogger.m143458m("NetworkRequestHandler", "parsing appdata in BG thread");
            C35006f.this.mo103952u(wVar, str, oTCallback, handler, oTPublishersHeadlessSDK);
        }

        /* renamed from: a */
        public void mo30434a(@C0359n0 C12983b<String> bVar, @C0359n0 Throwable th) {
            OTLogger.m143457l("NetworkRequestHandler", " network call response error out = " + th.getMessage());
            C35006f.this.mo103946m(this.f85160b, 3);
        }

        /* renamed from: b */
        public void mo30435b(@C0359n0 C12983b<String> bVar, @C0359n0 C13091w<String> wVar) {
            String a = wVar.mo30572a();
            OTLogger.m143458m("NetworkRequestHandler", " OTT response? = " + a);
            if (wVar.mo30578i() != null) {
                new UIUtils().mo104276n(wVar.mo30578i().receivedResponseAtMillis(), wVar.mo30578i().sentRequestAtMillis(), 0);
            }
            OTResponse a2 = C34976h.m143220a(a, this.f85159a, C35006f.this.f85155a.getResources().getString(C35265a.C35278m.warn_ot_failure));
            if (a2 != null) {
                C35006f.m143494A(this.f85160b, a2);
                return;
            }
            C13091w<String> wVar2 = wVar;
            new Thread(new C35005e(this, wVar2, a, this.f85160b, new Handler(Looper.getMainLooper()), this.f85161c)).start();
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.Internal.Network.f$b */
    public class C35008b implements C13008d<String> {

        /* renamed from: a */
        public final /* synthetic */ OTCallback f85163a;

        /* renamed from: b */
        public final /* synthetic */ OTResponse f85164b;

        public C35008b(OTCallback oTCallback, OTResponse oTResponse) {
            this.f85163a = oTCallback;
            this.f85164b = oTResponse;
        }

        /* renamed from: a */
        public void mo30434a(C12983b<String> bVar, Throwable th) {
            OTLogger.m143457l("NetworkRequestHandler", " IAB Vendorlist Api Failed " + " :  " + th.getMessage());
            OTCallback oTCallback = this.f85163a;
            if (oTCallback != null) {
                oTCallback.onFailure(new OTResponse(OTResponseType.OT_ERROR, 102, " IAB Vendorlist Api Failed ", ""));
            }
        }

        /* renamed from: b */
        public void mo30435b(C12983b<String> bVar, C13091w<String> wVar) {
            OTLogger.m143458m("NetworkRequestHandler", " IAB Vendorlist Api Success : " + wVar.mo30572a());
            if (wVar.mo30578i() != null) {
                new UIUtils().mo104276n(wVar.mo30578i().receivedResponseAtMillis(), wVar.mo30578i().sentRequestAtMillis(), 2);
            }
            new C34990u(C35006f.this.f85155a).mo103880j(C35006f.this.f85155a, wVar.mo30572a());
            OTCallback oTCallback = this.f85163a;
            if (oTCallback != null) {
                oTCallback.onSuccess(this.f85164b);
            }
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.Internal.Network.f$c */
    public class C35009c implements C13008d<String> {

        /* renamed from: a */
        public final /* synthetic */ JSONObject[] f85166a;

        /* renamed from: b */
        public final /* synthetic */ C35206f1.C35207a f85167b;

        public C35009c(C35006f fVar, JSONObject[] jSONObjectArr, C35206f1.C35207a aVar) {
            this.f85166a = jSONObjectArr;
            this.f85167b = aVar;
        }

        /* renamed from: a */
        public void mo30434a(C12983b<String> bVar, Throwable th) {
            OTLogger.m143457l("NetworkRequestHandler", "IAB Vendor Disclosure API Failed :  " + th.getMessage());
            this.f85167b.mo105354a(new JSONObject());
        }

        /* renamed from: b */
        public void mo30435b(C12983b<String> bVar, C13091w<String> wVar) {
            this.f85166a[0] = new JSONObject();
            OTLogger.m143458m("NetworkRequestHandler", "IAB Vendor Disclosure API Success : " + wVar.mo30572a());
            try {
                if (wVar.mo30572a() != null) {
                    this.f85166a[0] = new JSONObject(wVar.mo30572a());
                    this.f85167b.mo105354a(this.f85166a[0]);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("NetworkRequestHandler", "Error while fetching IAB Vendor Disclosure details:  " + e.getMessage());
                this.f85167b.mo105354a(new JSONObject());
            }
        }
    }

    public C35006f(@C0359n0 Context context) {
        this.f85155a = context;
        this.f85157c = new C35014d(context, "OTT_DEFAULT_USER");
    }

    /* renamed from: A */
    public static void m143494A(@C0363p0 OTCallback oTCallback, @C0359n0 OTResponse oTResponse) {
        if (oTCallback != null) {
            oTCallback.onFailure(oTResponse);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static String m143497c(@C0359n0 OTSdkParams oTSdkParams) {
        String oTSdkAPIVersion = oTSdkParams.getOTSdkAPIVersion();
        if (C35020d.m143605J(oTSdkAPIVersion) || "6.32.0".equals(oTSdkAPIVersion)) {
            OTLogger.m143458m("NetworkRequestHandler", "SDK api version not overridden, using SDK version = " + "6.32.0");
            return "6.32.0";
        }
        OTLogger.m143461p("OneTrust", "API version has been overridden. This feature is for testing only. Do not go live with an overridden API version.");
        return oTSdkAPIVersion;
    }

    @C0359n0
    /* renamed from: d */
    public static String m143498d(@C0359n0 String str) {
        String str2 = "onetrust.io";
        if (C35020d.m143605J(str)) {
            return str2;
        }
        String trim = str.trim();
        if (C35020d.m143605J(trim)) {
            return str2;
        }
        if ("qa".equals(trim)) {
            str2 = "1trust.app";
        }
        return "dev".equals(trim) ? "onetrust.dev" : str2;
    }

    /* renamed from: f */
    public static Request.Builder m143499f(Request.Builder builder, OTProfileSyncParams oTProfileSyncParams) {
        if (!C35020d.m143605J(oTProfileSyncParams.getIdentifier())) {
            builder = builder.header("identifier", oTProfileSyncParams.getIdentifier());
        }
        if (!C35020d.m143605J(oTProfileSyncParams.getSyncProfileAuth())) {
            builder = builder.header("syncProfileAuth", oTProfileSyncParams.getSyncProfileAuth());
        }
        if (!C35020d.m143605J(oTProfileSyncParams.getTenantId())) {
            builder = builder.header("tenantId", oTProfileSyncParams.getTenantId());
        }
        return !C35020d.m143605J(oTProfileSyncParams.getSyncGroupId()) ? builder.header("syncGroupId", oTProfileSyncParams.getSyncGroupId()) : builder;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ C12451Response m143500g(String str, String str2, String str3, String str4, OTSdkParams oTSdkParams, Interceptor.Chain chain) {
        Request.Builder builder;
        Request request = chain.request();
        Request.Builder header = request.newBuilder().header("location", str).header("application", str2).header("lang", str3).header(C33585u.C33587b.f81741w3, str4);
        if (!C35020d.m143605J(oTSdkParams.getOTRegionCode())) {
            header = header.header("OT-Region-Code", oTSdkParams.getOTRegionCode());
        }
        if (!C35020d.m143605J(oTSdkParams.getOTCountryCode())) {
            header = header.header("OT-Country-Code", oTSdkParams.getOTCountryCode());
        }
        OTProfileSyncParams otProfileSyncParams = oTSdkParams.getOtProfileSyncParams();
        if (otProfileSyncParams == null || C35020d.m143605J(otProfileSyncParams.getSyncProfile()) || !Boolean.parseBoolean(otProfileSyncParams.getSyncProfile())) {
            OTLogger.m143458m("NetworkRequestHandler", "OT Profile Sync params not set, sending syncProfile false.");
            builder = header.header("fetchType", "APP_DATA_ONLY");
        } else {
            builder = mo103942e(m143499f(header.header("fetchType", "APP_DATA_AND_SYNC_PROFILE"), otProfileSyncParams));
        }
        builder.method(request.method(), request.body());
        return chain.proceed(builder.build());
    }

    /* renamed from: t */
    public static void m143504t(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        boolean z;
        if ("TEST".equalsIgnoreCase(str)) {
            z = true;
        } else if ("PRODUCTION".equalsIgnoreCase(str)) {
            z = false;
        } else {
            return;
        }
        jSONObject.put("test", z);
    }

    /* renamed from: w */
    public static C13092x m143505w(@C0359n0 String str) {
        return new C13092x.C13094b().mo30599c(str).mo30598b(C13006c.m56324f()).mo30606j(new OkHttpClient.Builder().build()).mo30602f();
    }

    /* renamed from: e */
    public final Request.Builder mo103942e(Request.Builder builder) {
        String str;
        String string = this.f85157c.mo103965b().getString("OT_ProfileSyncETag", (String) null);
        if (!C35020d.m143605J(string)) {
            builder = builder.header("profileSyncETag", string);
            str = "ETag set to Header = " + string;
        } else {
            str = "Empty ETag.";
        }
        OTLogger.m143447b("NetworkRequestHandler", str);
        return builder;
    }

    @C0363p0
    /* renamed from: h */
    public C13091w<String> mo103943h(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        C13091w<String> wVar;
        try {
            wVar = ((C35001a) m143505w(str).mo30586g(C35001a.class)).mo103937a(str2, str3).execute();
            try {
                OTLogger.m143458m("NetworkRequestHandler", "response = " + wVar.mo30572a());
                OTLogger.m143458m("NetworkRequestHandler", "response code = " + wVar.mo30573b());
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            wVar = null;
            OTLogger.m143458m("NetworkRequestHandler", " network call response error out = " + e.getMessage());
            return wVar;
        }
        return wVar;
    }

    /* renamed from: i */
    public final void mo103944i() {
        try {
            JSONObject Q = new C35015e(this.f85155a).mo103982Q();
            if (Q.has("ccpaData")) {
                new C34978j(this.f85155a).mo103763f(Q.getJSONObject("ccpaData"));
            }
        } catch (JSONException e) {
            OTLogger.m143461p("OneTrust", "Could not save or initialize CCPA params, err: " + e.getMessage());
        }
    }

    /* renamed from: j */
    public final void mo103945j(int i) {
        OTGeolocationModel b;
        try {
            JSONObject D = new C35015e(this.f85155a).mo103969D();
            if (D.has(C33585u.C33587b.f81734p3) && D.has("regionCode") && (b = new C34985q(this.f85155a).mo103844b(i, D.getString(C33585u.C33587b.f81734p3), D.getString("regionCode"))) != null) {
                OTLogger.m143458m("OneTrust", "Geolocation - country: " + b.country + " , region: " + b.state);
            }
        } catch (Exception e) {
            OTLogger.m143457l("NetworkRequestHandler", "Error while saving geolocation " + e.getMessage());
        }
    }

    /* renamed from: m */
    public final void mo103946m(@C0363p0 OTCallback oTCallback, int i) {
        if (oTCallback != null) {
            oTCallback.onFailure(new OTResponse(OTResponseType.OT_ERROR, i, this.f85155a.getResources().getString(C35265a.C35278m.err_ott_callback_failure), ""));
        }
    }

    /* renamed from: o */
    public void mo103947o(@C0359n0 String str, @C0363p0 OTCallback oTCallback, @C0359n0 OTResponse oTResponse) {
        OTLogger.m143447b("NetworkRequestHandler", "IAB Vendor list Api called ");
        ((C35001a) new C13092x.C13094b().mo30599c("https://geolocation.1trust.app/").mo30598b(C13006c.m56324f()).mo30606j(new OkHttpClient.Builder().build()).mo30602f().mo30586g(C35001a.class)).mo103939d(str).mo30458k1(new C35008b(oTCallback, oTResponse));
    }

    /* renamed from: p */
    public void mo103948p(@C0359n0 String str, @C0359n0 C35206f1.C35207a aVar) {
        OTLogger.m143447b("NetworkRequestHandler", "IAB Vendor Disclosure API called ");
        ((C35001a) new C13092x.C13094b().mo30599c("https://geolocation.1trust.app/").mo30598b(C13006c.m56324f()).mo30606j(new OkHttpClient.Builder().build()).mo30602f().mo30586g(C35001a.class)).mo103939d(str).mo30458k1(new C35009c(this, new JSONObject[1], aVar));
    }

    /* renamed from: q */
    public final void mo103949q(@C0363p0 String str, @C0363p0 String str2) {
        if (C35020d.m143605J(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://mobile-data.");
            if (str == null) {
                str = "";
            }
            sb.append(m143498d(str));
            sb.append("/bannersdk/v2/applicationdata");
            this.f85156b = sb.toString();
            return;
        }
        this.f85156b = str2;
    }

    /* renamed from: r */
    public void mo103950r(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, int i) {
        OTLogger.m143458m("NetworkRequestHandler", "Starting workmanager call");
        String uuid = UUID.randomUUID().toString();
        C35014d dVar = new C35014d(this.f85155a, "OTT_DEFAULT_USER");
        int i2 = dVar.mo103965b().getInt("OTT_DATA_SUBJECT_IDENTIFIER_TYPE", 1);
        String string = dVar.mo103965b().getString("OTT_CREATE_CONSENT_PROFILE_STRING", (String) null);
        boolean z = false;
        if (i != 3) {
            boolean parseBoolean = C35020d.m143605J(string) ? false : Boolean.parseBoolean(string);
            if (!parseBoolean || i2 != 1) {
                z = parseBoolean;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Consent logging, create profile : ");
        sb.append(z);
        sb.append(" isAnonymous flag = ");
        sb.append(!z);
        OTLogger.m143458m("NetworkRequestHandler", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject(str3);
            String j = new C34981m(this.f85155a).mo103790j();
            if (j != null && j.length() > 0) {
                jSONObject.put("identifier", new C34981m(this.f85155a).mo103790j());
                jSONObject.put("isAnonymous", !z);
            }
            if (i == 1) {
                mo103953v(this.f85158d.mo104023S(this.f85155a), jSONObject, this.f85158d.mo104017D(this.f85155a));
                mo103955z(jSONObject, this.f85158d.mo104022O(this.f85155a));
            }
            C34992w wVar = new C34992w(this.f85155a);
            C35015e eVar = new C35015e(this.f85155a);
            String string2 = dVar.mo103965b().getString("OT_DS_DATA_ELEMENT_OBJECT", "");
            if (wVar.mo103902c(eVar.mo104014z())) {
                new C34999c(this.f85155a).mo103928d(jSONObject, wVar.mo103900a(), eVar.mo103969D().optString(C33585u.C33587b.f81734p3), string2);
            }
            m143504t(jSONObject, this.f85158d.mo104021M(this.f85155a));
            OTLogger.m143458m("NetworkRequestHandler", "new payload object: " + jSONObject);
            dVar.mo103965b().edit().putString(uuid, String.valueOf(jSONObject)).apply();
        } catch (JSONException e) {
            OTLogger.m143458m("NetworkRequestHandler", "Consent logging new payload creation exception: " + e.getMessage());
        }
        C21091d a = new C21091d.C21092a().mo63188q("ott_consent_log_base_url", str).mo63188q("ott_consent_log_end_point", str2).mo63188q("ott_payload_id", uuid).mo63172a();
        WorkManager.m97474q(this.f85155a).mo63060j((C21379m) ((C21379m.C21380a) ((C21379m.C21380a) ((C21379m.C21380a) new C21379m.C21380a(ConsentUploadWorker.class).mo63881w(a)).mo63873o(new C21087c.C21088a().mo63138c(NetworkType.CONNECTED).mo63137b())).mo63870l(BackoffPolicy.EXPONENTIAL, 10000, TimeUnit.MILLISECONDS)).mo63862b());
    }

    /* renamed from: s */
    public void mo103951s(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0363p0 OTCallback oTCallback, @C0363p0 String str4, @C0363p0 String str5, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        OTSdkParams K = C35020d.m143606K(this.f85155a);
        mo103949q(str4, str5);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        String c = m143497c(K);
        builder.addInterceptor(new C35004d(this, str, str2, str3, c, K));
        C35001a aVar = (C35001a) new C13092x.C13094b().mo30599c("https://mobile-data.onetrust.io/").mo30598b(C13006c.m56324f()).mo30606j(builder.build()).mo30602f().mo30586g(C35001a.class);
        OTLogger.m143458m("NetworkRequestHandler", "Requesting OTT data from : " + this.f85156b);
        StringBuilder sb = new StringBuilder();
        sb.append("Requesting OTT data parameters : ");
        String str6 = str;
        sb.append(str);
        sb.append(", ");
        String str7 = str2;
        sb.append(str2);
        sb.append(", ");
        String str8 = str3;
        sb.append(str3);
        sb.append(",");
        sb.append(K.getOTCountryCode());
        sb.append(",");
        sb.append(K.getOTRegionCode());
        sb.append(", ");
        sb.append(c);
        sb.append(", Profile : ");
        sb.append(K.getOtProfileSyncParams() == null ? null : K.getOtProfileSyncParams().toString());
        OTLogger.m143447b("NetworkRequestHandler", sb.toString());
        C12983b<String> c2 = aVar.mo103938c(this.f85156b);
        OTLogger.m143458m("NetworkRequestHandler", " OTT data Download : Download OTT data started");
        c2.mo30458k1(new C35007a(c, oTCallback, oTPublishersHeadlessSDK));
    }

    /* renamed from: u */
    public final void mo103952u(@C0359n0 C13091w<String> wVar, String str, @C0363p0 OTCallback oTCallback, Handler handler, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C34970d dVar = new C34970d(this.f85155a);
        OTResponse oTResponse = new OTResponse(OTResponseType.OT_SUCCESS, 1, "OT data fetch successful.", str);
        boolean L = dVar.mo103665L(str, oTCallback, oTResponse, oTPublishersHeadlessSDK);
        mo103945j(2);
        mo103944i();
        if (!L && oTCallback != null) {
            handler.post(new C35003c(oTCallback, oTResponse));
        }
        mo103954x();
        if (wVar.mo30578i() != null) {
            new UIUtils().mo104276n(System.currentTimeMillis(), wVar.mo30578i().sentRequestAtMillis(), 1);
        }
    }

    @C0344h1
    /* renamed from: v */
    public boolean mo103953v(boolean z, @C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        if (z) {
            jSONObject.put("tcStringV2", str);
            OTLogger.m143458m("NetworkRequestHandler", "Consent logging for IAB template, setting tcStringV2 = " + str);
            return true;
        }
        OTLogger.m143447b("NetworkRequestHandler", "Consent logging for non IAB template, not setting tcStringV2.");
        return false;
    }

    /* renamed from: x */
    public final void mo103954x() {
        if (this.f85158d.mo104026a(this.f85155a) < 1) {
            this.f85158d.mo104028i(this.f85155a, 0);
        }
    }

    @C0344h1
    /* renamed from: z */
    public void mo103955z(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        jSONObject.put("syncGroup", str);
        OTLogger.m143458m("NetworkRequestHandler", "Consent logging, setting syncGroupID = " + str);
    }
}
