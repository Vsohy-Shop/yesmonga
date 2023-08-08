package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.tasks.C31045j;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.C32711m0;
import com.google.firebase.crashlytics.internal.common.C32723r;
import com.google.firebase.crashlytics.internal.common.C32724s;
import com.google.firebase.crashlytics.internal.common.C32730v;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.network.C32914b;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.e */
public class C32935e implements C32940i {

    /* renamed from: j */
    public static final String f80015j = "existing_instance_identifier";

    /* renamed from: k */
    public static final String f80016k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";

    /* renamed from: a */
    public final Context f80017a;

    /* renamed from: b */
    public final C32941j f80018b;

    /* renamed from: c */
    public final C32938g f80019c;

    /* renamed from: d */
    public final C32723r f80020d;

    /* renamed from: e */
    public final C32929a f80021e;

    /* renamed from: f */
    public final C32942k f80022f;

    /* renamed from: g */
    public final C32724s f80023g;

    /* renamed from: h */
    public final AtomicReference<C32932d> f80024h;

    /* renamed from: i */
    public final AtomicReference<C31049l<C32932d>> f80025i = new AtomicReference<>(new C31049l());

    /* renamed from: com.google.firebase.crashlytics.internal.settings.e$a */
    public class C32936a implements C31045j<Void, Void> {
        public C32936a() {
        }

        @C0359n0
        /* renamed from: b */
        public C31047k<Void> mo87716a(@C0363p0 Void voidR) throws Exception {
            JSONObject a = C32935e.this.f80022f.mo95596a(C32935e.this.f80018b, true);
            if (a != null) {
                C32932d b = C32935e.this.f80019c.mo95615b(a);
                C32935e.this.f80021e.mo95594c(b.f80004c, a);
                C32935e.this.mo95612q(a, "Loaded settings: ");
                C32935e eVar = C32935e.this;
                boolean unused = eVar.mo95613r(eVar.f80018b.f80057f);
                C32935e.this.f80024h.set(b);
                ((C31049l) C32935e.this.f80025i.get()).mo87745e(b);
            }
            return C31053n.m124525g(null);
        }
    }

    public C32935e(Context context, C32941j jVar, C32723r rVar, C32938g gVar, C32929a aVar, C32942k kVar, C32724s sVar) {
        AtomicReference<C32932d> atomicReference = new AtomicReference<>();
        this.f80024h = atomicReference;
        this.f80017a = context;
        this.f80018b = jVar;
        this.f80020d = rVar;
        this.f80019c = gVar;
        this.f80021e = aVar;
        this.f80022f = kVar;
        this.f80023g = sVar;
        atomicReference.set(C32930b.m133096b(rVar));
    }

    /* renamed from: l */
    public static C32935e m133115l(Context context, String str, C32730v vVar, C32914b bVar, String str2, String str3, C32921f fVar, C32724s sVar) {
        String g = vVar.mo95033g();
        C32711m0 m0Var = new C32711m0();
        C32938g gVar = new C32938g(m0Var);
        C32929a aVar = new C32929a(fVar);
        C32931c cVar = new C32931c(String.format(Locale.US, f80016k, new Object[]{str}), bVar);
        String h = vVar.mo95034h();
        String i = vVar.mo95035i();
        String j = vVar.mo95036j();
        String h2 = CommonUtils.m131926h(CommonUtils.m131934p(context), str, str3, str2);
        return new C32935e(context, new C32941j(str, h, i, j, vVar, h2, str3, str2, DeliveryMechanism.m131946b(g).mo94847g()), m0Var, gVar, aVar, cVar, sVar);
    }

    /* renamed from: a */
    public C31047k<C32932d> mo95605a() {
        return this.f80025i.get().mo87741a();
    }

    /* renamed from: b */
    public C32932d mo95606b() {
        return this.f80024h.get();
    }

    /* renamed from: k */
    public boolean mo95607k() {
        return !mo95609n().equals(this.f80018b.f80057f);
    }

    /* renamed from: m */
    public final C32932d mo95608m(SettingsCacheBehavior settingsCacheBehavior) {
        C32932d dVar = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject b = this.f80021e.mo95593b();
            if (b != null) {
                C32932d b2 = this.f80019c.mo95615b(b);
                if (b2 != null) {
                    mo95612q(b, "Loaded cached settings: ");
                    long a = this.f80020d.mo94989a();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (b2.mo95604a(a)) {
                            C32741f.m132248f().mo95060k("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C32741f.m132248f().mo95060k("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        dVar = b2;
                        C32741f.m132248f().mo95055e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    C32741f.m132248f().mo95055e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C32741f.m132248f().mo95052b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C32741f.m132248f().mo95055e("Failed to get cached settings", e);
            return dVar;
        }
    }

    /* renamed from: n */
    public final String mo95609n() {
        return CommonUtils.m131938t(this.f80017a).getString(f80015j, "");
    }

    /* renamed from: o */
    public C31047k<Void> mo95610o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        C32932d m;
        if (mo95607k() || (m = mo95608m(settingsCacheBehavior)) == null) {
            C32932d m2 = mo95608m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f80024h.set(m2);
                this.f80025i.get().mo87745e(m2);
            }
            return this.f80023g.mo95026j(executor).mo87740x(executor, new C32936a());
        }
        this.f80024h.set(m);
        this.f80025i.get().mo87745e(m);
        return C31053n.m124525g(null);
    }

    /* renamed from: p */
    public C31047k<Void> mo95611p(Executor executor) {
        return mo95610o(SettingsCacheBehavior.USE_CACHE, executor);
    }

    /* renamed from: q */
    public final void mo95612q(JSONObject jSONObject, String str) throws JSONException {
        C32741f f = C32741f.m132248f();
        f.mo95052b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public final boolean mo95613r(String str) {
        SharedPreferences.Editor edit = CommonUtils.m131938t(this.f80017a).edit();
        edit.putString(f80015j, str);
        edit.apply();
        return true;
    }
}
