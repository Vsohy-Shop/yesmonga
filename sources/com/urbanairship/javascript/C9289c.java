package com.urbanairship.javascript;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36044d;
import com.urbanairship.C36050h;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36098y;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionValue;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35490c;
import com.urbanairship.actions.C35495f;
import com.urbanairship.actions.C35502h;
import com.urbanairship.actions.C35504j;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import com.urbanairship.util.C9672p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.javascript.c */
public class C9289c {
    @C0359n0

    /* renamed from: d */
    public static final String f25327d = "uairship";
    @C0359n0

    /* renamed from: e */
    public static final String f25328e = "run-basic-actions";
    @C0359n0

    /* renamed from: f */
    public static final String f25329f = "run-actions";
    @C0359n0

    /* renamed from: g */
    public static final String f25330g = "run-action-cb";
    @C0359n0

    /* renamed from: h */
    public static final String f25331h = "named_user";
    @C0359n0

    /* renamed from: i */
    public static final String f25332i = "id";
    @C0359n0

    /* renamed from: j */
    public static final String f25333j = "close";
    @C0359n0

    /* renamed from: k */
    public static final String f25334k = "multi";

    /* renamed from: a */
    public C35490c f25335a;

    /* renamed from: b */
    public final Executor f25336b;

    /* renamed from: c */
    public final C35504j f25337c;

    /* renamed from: com.urbanairship.javascript.c$a */
    public class C9290a implements C36098y<String> {

        /* renamed from: a */
        public final /* synthetic */ C9288b f25338a;

        public C9290a(C9288b bVar) {
            this.f25338a = bVar;
        }

        /* renamed from: a */
        public void onResult(@C0363p0 String str) {
            if (str != null) {
                this.f25338a.mo18682a(str);
            }
        }
    }

    /* renamed from: com.urbanairship.javascript.c$b */
    public class C9291b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C36062p f25340a;

        /* renamed from: b */
        public final /* synthetic */ C9285a f25341b;

        /* renamed from: c */
        public final /* synthetic */ Context f25342c;

        public C9291b(C36062p pVar, C9285a aVar, Context context) {
            this.f25340a = pVar;
            this.f25341b = aVar;
            this.f25342c = context;
        }

        public void run() {
            this.f25340a.mo107828g(this.f25341b.mo18677a(this.f25342c));
        }
    }

    /* renamed from: com.urbanairship.javascript.c$c */
    public class C9292c implements C35490c {
        public C9292c() {
        }

        /* renamed from: a */
        public void mo17300a(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
            C35490c a = C9289c.this.f25335a;
            if (a != null) {
                a.mo17300a(bVar, fVar);
            }
        }
    }

    /* renamed from: com.urbanairship.javascript.c$d */
    public class C9293d implements C35490c {

        /* renamed from: a */
        public final /* synthetic */ String f25345a;

        /* renamed from: b */
        public final /* synthetic */ C9288b f25346b;

        /* renamed from: c */
        public final /* synthetic */ String f25347c;

        public C9293d(String str, C9288b bVar, String str2) {
            this.f25345a = str;
            this.f25346b = bVar;
            this.f25347c = str2;
        }

        /* renamed from: a */
        public void mo17300a(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
            String str;
            int b = fVar.mo106370b();
            if (b == 2) {
                str = String.format("Action %s rejected its arguments", new Object[]{this.f25345a});
            } else if (b == 3) {
                str = String.format("Action %s not found", new Object[]{this.f25345a});
            } else if (b != 4) {
                str = null;
            } else if (fVar.mo106369a() != null) {
                str = fVar.mo106369a().getMessage();
            } else {
                str = String.format("Action %s failed with unspecified error", new Object[]{this.f25345a});
            }
            C9289c.this.mo18690j(this.f25346b, str, fVar.mo106371c(), this.f25347c);
            synchronized (this) {
                if (C9289c.this.f25335a != null) {
                    C9289c.this.f25335a.mo17300a(bVar, fVar);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.javascript.c$e */
    public interface C9294e {
        /* renamed from: a */
        void mo18693a();

        /* renamed from: b */
        void mo18694b(@C0359n0 String str, @C0359n0 Uri uri);
    }

    public C9289c() {
        this(new C35504j(), C36044d.m148369a());
    }

    /* renamed from: c */
    public final Map<String, List<ActionValue>> mo18683c(@C0359n0 Uri uri, boolean z) {
        JsonValue jsonValue;
        Map<String, List<String>> a = C9672p0.m36234a(uri);
        HashMap hashMap = new HashMap();
        for (String next : a.keySet()) {
            ArrayList arrayList = new ArrayList();
            if (a.get(next) == null) {
                C36059m.m148421q("No arguments to decode for actionName: %s", next);
                return null;
            }
            List<String> list = a.get(next);
            if (list != null) {
                for (String str : list) {
                    if (z) {
                        try {
                            jsonValue = JsonValue.m34968N(str);
                        } catch (JsonException e) {
                            C36059m.m148423s(e, "Invalid json. Unable to create action argument " + next + " with args: " + str, new Object[0]);
                            return null;
                        }
                    } else {
                        jsonValue = JsonValue.m34960C(str);
                    }
                    arrayList.add(new ActionValue(jsonValue));
                }
                hashMap.put(next, arrayList);
            }
        }
        if (!hashMap.isEmpty()) {
            return hashMap;
        }
        C36059m.m148421q("Error no action names are present in the actions key set", new Object[0]);
        return null;
    }

    @C0359n0
    /* renamed from: d */
    public C36050h mo18684d(@C0359n0 Context context, @C0359n0 C9285a aVar, @C0359n0 C9288b bVar) {
        C36059m.m148413i("Loading Airship Javascript interface.", new Object[0]);
        C36062p pVar = new C36062p();
        pVar.mo107825d(Looper.myLooper(), new C9290a(bVar));
        this.f25336b.execute(new C9291b(pVar, aVar, context));
        return pVar;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public boolean mo18685e(@C0363p0 String str, @C0359n0 C9288b bVar, @C0359n0 C35502h hVar, @C0359n0 C9294e eVar) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null || !"uairship".equals(parse.getScheme())) {
            return false;
        }
        C36059m.m148419o("Intercepting: %s", str);
        String host = parse.getHost();
        host.hashCode();
        char c = 65535;
        switch (host.hashCode()) {
            case -1507513413:
                if (host.equals(f25329f)) {
                    c = 0;
                    break;
                }
                break;
            case -1316475244:
                if (host.equals(f25330g)) {
                    c = 1;
                    break;
                }
                break;
            case -280467183:
                if (host.equals("named_user")) {
                    c = 2;
                    break;
                }
                break;
            case -189575524:
                if (host.equals(f25328e)) {
                    c = 3;
                    break;
                }
                break;
            case 94756344:
                if (host.equals(f25333j)) {
                    c = 4;
                    break;
                }
                break;
            case 104256825:
                if (host.equals("multi")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C36059m.m148413i("Running run actions command for URL: %s", str);
                mo18687g(hVar, mo18683c(parse, false));
                break;
            case 1:
                C36059m.m148413i("Running run actions command with callback for URL: %s", str);
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments.size() != 3) {
                    C36059m.m148409e("Unable to run action, invalid number of arguments.", new Object[0]);
                    break;
                } else {
                    C36059m.m148413i("Action: %s, Args: %s, Callback: %s", pathSegments.get(0), pathSegments.get(1), pathSegments.get(2));
                    mo18686f(hVar, bVar, pathSegments.get(0), pathSegments.get(1), pathSegments.get(2));
                    break;
                }
            case 2:
                C36059m.m148413i("Running set Named User command for URL: %s", parse);
                Map<String, List<String>> a = C9672p0.m36234a(parse);
                if (a.get("id") == null) {
                    if (a.get("id").get(0) == null) {
                        mo18689i((String) null);
                        break;
                    }
                } else {
                    mo18689i((String) a.get("id").get(0));
                    break;
                }
                break;
            case 3:
                C36059m.m148413i("Running run basic actions command for URL: %s", str);
                mo18687g(hVar, mo18683c(parse, true));
                break;
            case 4:
                C36059m.m148413i("Running close command for URL: %s", str);
                eVar.mo18693a();
                break;
            case 5:
                for (String decode : parse.getEncodedQuery().split("&")) {
                    mo18685e(Uri.decode(decode), bVar, hVar, eVar);
                }
                break;
            default:
                eVar.mo18694b(parse.getHost(), parse);
                break;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo18686f(@C0359n0 C35502h hVar, @C0359n0 C9288b bVar, @C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        try {
            hVar.mo19739a(this.f25337c.mo106388a(str).mo106382o(new ActionValue(JsonValue.m34960C(str2))).mo106381n(3)).mo106377j(new C9293d(str, bVar, str3));
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse action argument value: %s", str2);
            mo18690j(bVar, "Unable to decode arguments payload", new ActionValue(), str3);
        }
    }

    /* renamed from: g */
    public final void mo18687g(@C0359n0 C35502h hVar, @C0363p0 Map<String, List<ActionValue>> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                List<ActionValue> list = map.get(next);
                if (list != null) {
                    for (ActionValue o : list) {
                        hVar.mo19739a(this.f25337c.mo106388a(next).mo106382o(o).mo106381n(3)).mo106377j(new C9292c());
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo18688h(@C0363p0 C35490c cVar) {
        this.f25335a = cVar;
    }

    /* renamed from: i */
    public final void mo18689i(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (C9669o0.m36224e(str)) {
            UAirship.m146188Y().mo106227r().mo18009D0();
        } else {
            UAirship.m146188Y().mo106227r().mo18045l0(str);
        }
    }

    /* renamed from: j */
    public final void mo18690j(@C0359n0 C9288b bVar, @C0363p0 String str, @C0359n0 ActionValue actionValue, @C0363p0 String str2) {
        String str3;
        String format = String.format("'%s'", new Object[]{str2});
        if (str == null) {
            str3 = "null";
        } else {
            str3 = String.format(Locale.US, "new Error(%s)", new Object[]{JSONObject.quote(str)});
        }
        String actionValue2 = actionValue.toString();
        bVar.mo18682a(String.format(Locale.US, "UAirship.finishAction(%s, %s, %s);", new Object[]{str3, actionValue2, format}));
    }

    public C9289c(@C0359n0 C35504j jVar) {
        this(jVar, C36044d.m148369a());
    }

    @C0344h1
    public C9289c(C35504j jVar, @C0359n0 Executor executor) {
        this.f25337c = jVar;
        this.f25336b = executor;
    }
}
