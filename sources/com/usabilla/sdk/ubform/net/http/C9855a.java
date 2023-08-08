package com.usabilla.sdk.ubform.net.http;

import com.usabilla.sdk.ubform.Logger;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.net.http.a */
public final class C9855a {
    @C12579k

    /* renamed from: a */
    public final String f26970a = "X-HTTP-Method-Override";
    @C12579k

    /* renamed from: b */
    public final String f26971b = "Accept";
    @C12579k

    /* renamed from: c */
    public final String f26972c = "Content-Type";
    @C12579k

    /* renamed from: d */
    public final String f26973d = "application/json";
    @C12579k

    /* renamed from: e */
    public final String f26974e = "application/json; charset=utf-8";
    @C12579k

    /* renamed from: f */
    public final HashMap<String, String> f26975f = new HashMap<>();

    /* renamed from: com.usabilla.sdk.ubform.net.http.a$a */
    public static final class C9856a implements C9872i {
        @C12579k

        /* renamed from: a */
        public final String f26976a = UsabillaHttpRequestMethod.GET.name();
        @C12579k

        /* renamed from: b */
        public final String f26977b;
        @C12579k

        /* renamed from: c */
        public final HashMap<String, String> f26978c;
        @C12580l

        /* renamed from: d */
        public final String f26979d;

        /* renamed from: e */
        public final /* synthetic */ String f26980e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, String> f26981f;

        public C9856a(String str, HashMap<String, String> hashMap) {
            this.f26980e = str;
            this.f26981f = hashMap;
            this.f26977b = str;
            this.f26978c = hashMap;
        }

        @C12579k
        /* renamed from: a */
        public HashMap<String, String> getHeaders() {
            return this.f26978c;
        }

        @C12580l
        public String getBody() {
            return this.f26979d;
        }

        @C12579k
        public String getMethod() {
            return this.f26976a;
        }

        @C12579k
        public String getUrl() {
            return this.f26977b;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.net.http.a$b */
    public static final class C9857b implements C9872i {
        @C12579k

        /* renamed from: a */
        public final String f26982a;
        @C12579k

        /* renamed from: b */
        public final String f26983b;
        @C12579k

        /* renamed from: c */
        public final HashMap<String, String> f26984c;
        @C12580l

        /* renamed from: d */
        public final String f26985d;

        /* renamed from: e */
        public final /* synthetic */ String f26986e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, String> f26987f;

        /* renamed from: g */
        public final /* synthetic */ C9855a f26988g;

        /* renamed from: h */
        public final /* synthetic */ JSONObject f26989h;

        public C9857b(String str, HashMap<String, String> hashMap, C9855a aVar, JSONObject jSONObject) {
            this.f26986e = str;
            this.f26987f = hashMap;
            this.f26988g = aVar;
            this.f26989h = jSONObject;
            UsabillaHttpRequestMethod usabillaHttpRequestMethod = UsabillaHttpRequestMethod.POST;
            this.f26982a = usabillaHttpRequestMethod.name();
            this.f26983b = str;
            this.f26984c = hashMap;
            this.f26985d = aVar.mo20285b(usabillaHttpRequestMethod.name(), str, jSONObject);
        }

        @C12579k
        /* renamed from: a */
        public HashMap<String, String> getHeaders() {
            return this.f26984c;
        }

        @C12580l
        public String getBody() {
            return this.f26985d;
        }

        @C12579k
        public String getMethod() {
            return this.f26982a;
        }

        @C12579k
        public String getUrl() {
            return this.f26983b;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.net.http.a$c */
    public static final class C9858c implements C9872i {
        @C12579k

        /* renamed from: a */
        public final String f26990a;
        @C12579k

        /* renamed from: b */
        public final String f26991b;
        @C12579k

        /* renamed from: c */
        public final HashMap<String, String> f26992c;
        @C12580l

        /* renamed from: d */
        public final String f26993d;

        /* renamed from: e */
        public final /* synthetic */ String f26994e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, String> f26995f;

        /* renamed from: g */
        public final /* synthetic */ C9855a f26996g;

        /* renamed from: h */
        public final /* synthetic */ JSONObject f26997h;

        public C9858c(String str, HashMap<String, String> hashMap, C9855a aVar, JSONObject jSONObject) {
            this.f26994e = str;
            this.f26995f = hashMap;
            this.f26996g = aVar;
            this.f26997h = jSONObject;
            UsabillaHttpRequestMethod usabillaHttpRequestMethod = UsabillaHttpRequestMethod.PATCH;
            this.f26990a = usabillaHttpRequestMethod.name();
            this.f26991b = str;
            this.f26992c = hashMap;
            this.f26993d = aVar.mo20285b(usabillaHttpRequestMethod.name(), str, jSONObject);
        }

        @C12579k
        /* renamed from: a */
        public HashMap<String, String> getHeaders() {
            return this.f26992c;
        }

        @C12580l
        public String getBody() {
            return this.f26993d;
        }

        @C12579k
        public String getMethod() {
            return this.f26990a;
        }

        @C12579k
        public String getUrl() {
            return this.f26991b;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.net.http.a$d */
    public static final class C9859d implements C9872i {
        @C12579k

        /* renamed from: a */
        public final String f26998a = UsabillaHttpRequestMethod.POST.name();
        @C12579k

        /* renamed from: b */
        public final String f26999b;
        @C12579k

        /* renamed from: c */
        public final HashMap<String, String> f27000c;
        @C12580l

        /* renamed from: d */
        public final String f27001d;

        /* renamed from: e */
        public final /* synthetic */ String f27002e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, String> f27003f;

        /* renamed from: g */
        public final /* synthetic */ C9855a f27004g;

        /* renamed from: h */
        public final /* synthetic */ JSONObject f27005h;

        public C9859d(String str, HashMap<String, String> hashMap, C9855a aVar, JSONObject jSONObject) {
            this.f27002e = str;
            this.f27003f = hashMap;
            this.f27004g = aVar;
            this.f27005h = jSONObject;
            this.f26999b = str;
            this.f27000c = hashMap;
            this.f27001d = aVar.mo20285b(UsabillaHttpRequestMethod.PATCH.name(), str, jSONObject);
        }

        @C12579k
        /* renamed from: a */
        public HashMap<String, String> getHeaders() {
            return this.f27000c;
        }

        @C12580l
        public String getBody() {
            return this.f27001d;
        }

        @C12579k
        public String getMethod() {
            return this.f26998a;
        }

        @C12579k
        public String getUrl() {
            return this.f26999b;
        }
    }

    /* renamed from: b */
    public final String mo20285b(String str, String str2, JSONObject jSONObject) {
        Logger.Companion companion = Logger.f26647a;
        companion.logInfo(str + ' ' + str2 + 10 + jSONObject);
        return jSONObject.toString();
    }

    @C12579k
    /* renamed from: c */
    public final HashMap<String, String> mo20286c() {
        return this.f26975f;
    }

    @C12579k
    /* renamed from: d */
    public final C9872i mo20287d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        Logger.f26647a.logInfo(Intrinsics.stringPlus("GET ", str));
        return new C9856a(str, new HashMap(this.f26975f));
    }

    @C12579k
    /* renamed from: e */
    public final C9872i mo20288e(@C12579k String str, @C12579k JSONObject jSONObject, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(jSONObject, "body");
        if (i < 21) {
            return mo20291h(str, jSONObject);
        }
        return mo20290g(str, jSONObject);
    }

    @C12579k
    /* renamed from: f */
    public final C9872i mo20289f(@C12579k String str, @C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(jSONObject, "body");
        Logger.f26647a.logInfo(Intrinsics.stringPlus("POST ", str));
        HashMap hashMap = new HashMap(this.f26975f);
        hashMap.put(this.f26972c, this.f26974e);
        hashMap.put(this.f26971b, this.f26973d);
        return new C9857b(str, hashMap, this, jSONObject);
    }

    /* renamed from: g */
    public final C9872i mo20290g(String str, JSONObject jSONObject) {
        Logger.f26647a.logInfo(Intrinsics.stringPlus("PATCH post lollipop ", str));
        HashMap hashMap = new HashMap(this.f26975f);
        hashMap.put(this.f26972c, this.f26974e);
        hashMap.put(this.f26971b, this.f26973d);
        return new C9858c(str, hashMap, this, jSONObject);
    }

    /* renamed from: h */
    public final C9872i mo20291h(String str, JSONObject jSONObject) {
        Logger.f26647a.logInfo(Intrinsics.stringPlus("PATCH pre lollipop ", str));
        HashMap hashMap = new HashMap(this.f26975f);
        hashMap.put(this.f26972c, this.f26974e);
        hashMap.put(this.f26971b, this.f26973d);
        hashMap.put(this.f26970a, UsabillaHttpRequestMethod.PATCH.name());
        return new C9859d(str, hashMap, this, jSONObject);
    }
}
