package androidx.webkit.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.webkit.C20977t;
import androidx.webkit.C20980u;
import androidx.webkit.internal.C20851a;
import androidx.webkit.internal.C20871c1;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.util.C12532b;

/* renamed from: androidx.webkit.internal.o1 */
public class C20908o1 {

    /* renamed from: A */
    public static final C20851a.C20853b f53948A = new C20851a.C20853b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B */
    public static final C20851a.C20853b f53949B = new C20851a.C20853b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C */
    public static final C20851a.C20855d f53950C = new C20851a.C20855d("WEB_MESSAGE_GET_MESSAGE_PAYLOAD", "WEB_MESSAGE_GET_MESSAGE_PAYLOAD");

    /* renamed from: D */
    public static final C20851a.C20853b f53951D = new C20851a.C20853b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E */
    public static final C20851a.C20853b f53952E = new C20851a.C20853b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F */
    public static final C20851a.C20853b f53953F = new C20851a.C20853b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G */
    public static final C20851a.C20853b f53954G = new C20851a.C20853b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H */
    public static final C20851a.C20856e f53955H = new C20851a.C20856e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I */
    public static final C20851a.C20856e f53956I = new C20851a.C20856e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J */
    public static final C20851a.C20859h f53957J = new C20851a.C20859h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K */
    public static final C20851a.C20859h f53958K = new C20851a.C20859h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L */
    public static final C20851a.C20858g f53959L = new C20851a.C20858g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M */
    public static final C20871c1.C20872a f53960M = new C20871c1.C20872a("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N */
    public static final C20851a.C20859h f53961N = new C20851a.C20859h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: O */
    public static final C20851a.C20860i f53962O = new C20909a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: P */
    public static final C20851a.C20855d f53963P = new C20851a.C20855d(C20980u.f54097L, C12532b.f30537I);

    /* renamed from: Q */
    public static final C20851a.C20855d f53964Q = new C20851a.C20855d("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");

    /* renamed from: R */
    public static final C20851a.C20855d f53965R = new C20851a.C20855d(C20980u.f54099N, C12532b.f30544P);

    /* renamed from: S */
    public static final C20851a.C20859h f53966S = new C20851a.C20859h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: T */
    public static final C20851a.C20855d f53967T = new C20851a.C20855d(C20980u.f54101P, C12532b.f30546R);

    /* renamed from: U */
    public static final C20851a.C20855d f53968U = new C20851a.C20855d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: V */
    public static final C20851a.C20855d f53969V = new C20851a.C20855d(C20980u.f54104S, C12532b.f30550V);

    /* renamed from: W */
    public static final C20851a.C20855d f53970W = new C20851a.C20855d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: X */
    public static final C20851a.C20855d f53971X = new C20851a.C20855d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Y */
    public static final C20851a.C20855d f53972Y = new C20851a.C20855d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: Z */
    public static final C20851a.C20855d f53973Z = new C20851a.C20855d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: a */
    public static final C20851a.C20853b f53974a = new C20851a.C20853b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a0 */
    public static final C20851a.C20855d f53975a0 = new C20851a.C20855d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: b */
    public static final C20851a.C20853b f53976b = new C20851a.C20853b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c */
    public static final C20851a.C20856e f53977c = new C20851a.C20856e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d */
    public static final C20851a.C20854c f53978d = new C20851a.C20854c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e */
    public static final C20851a.C20857f f53979e = new C20851a.C20857f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    @Deprecated

    /* renamed from: f */
    public static final C20851a.C20857f f53980f = new C20851a.C20857f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    @Deprecated

    /* renamed from: g */
    public static final C20851a.C20857f f53981g = new C20851a.C20857f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h */
    public static final C20851a.C20857f f53982h = new C20851a.C20857f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i */
    public static final C20851a.C20857f f53983i = new C20851a.C20857f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j */
    public static final C20851a.C20857f f53984j = new C20851a.C20857f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k */
    public static final C20851a.C20854c f53985k = new C20851a.C20854c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l */
    public static final C20851a.C20854c f53986l = new C20851a.C20854c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m */
    public static final C20851a.C20854c f53987m = new C20851a.C20854c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n */
    public static final C20851a.C20854c f53988n = new C20851a.C20854c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o */
    public static final C20851a.C20854c f53989o = new C20851a.C20854c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p */
    public static final C20851a.C20854c f53990p = new C20851a.C20854c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q */
    public static final C20851a.C20853b f53991q = new C20851a.C20853b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r */
    public static final C20851a.C20853b f53992r = new C20851a.C20853b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s */
    public static final C20851a.C20854c f53993s = new C20851a.C20854c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t */
    public static final C20851a.C20857f f53994t = new C20851a.C20857f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u */
    public static final C20851a.C20854c f53995u = new C20851a.C20854c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v */
    public static final C20851a.C20853b f53996v = new C20851a.C20853b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w */
    public static final C20851a.C20853b f53997w = new C20851a.C20853b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x */
    public static final C20851a.C20857f f53998x = new C20851a.C20857f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y */
    public static final C20851a.C20857f f53999y = new C20851a.C20857f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z */
    public static final C20851a.C20857f f54000z = new C20851a.C20857f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: androidx.webkit.internal.o1$a */
    public class C20909a extends C20851a.C20860i {

        /* renamed from: d */
        public final Pattern f54001d = Pattern.compile("\\A\\d+");

        public C20909a(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: d */
        public boolean mo62608d() {
            boolean d = super.mo62608d();
            if (!d || Build.VERSION.SDK_INT >= 29) {
                return d;
            }
            PackageInfo f = C20977t.m97098f();
            if (f == null) {
                return false;
            }
            Matcher matcher = this.f54001d.matcher(f.versionName);
            if (!matcher.find() || Integer.parseInt(f.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static UnsupportedOperationException m96934a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* renamed from: b */
    public static boolean m96935b(@C0359n0 String str, @C0359n0 Context context) {
        return m96936c(str, C20871c1.m96829g(), context);
    }

    @C0344h1
    /* renamed from: c */
    public static boolean m96936c(@C0359n0 String str, @C0359n0 Collection<C20871c1> collection, @C0359n0 Context context) {
        HashSet<C20871c1> hashSet = new HashSet<>();
        for (C20871c1 next : collection) {
            if (next.mo62629b().equals(str)) {
                hashSet.add(next);
            }
        }
        if (!hashSet.isEmpty()) {
            for (C20871c1 d : hashSet) {
                if (d.mo62630d(context)) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    /* renamed from: d */
    public static boolean m96937d(@C0359n0 String str) {
        return m96938e(str, C20851a.m96781e());
    }

    @C0344h1
    /* renamed from: e */
    public static <T extends C20919r0> boolean m96938e(@C0359n0 String str, @C0359n0 Collection<T> collection) {
        HashSet<C20919r0> hashSet = new HashSet<>();
        for (T t : collection) {
            if (t.mo62606a().equals(str)) {
                hashSet.add(t);
            }
        }
        if (!hashSet.isEmpty()) {
            for (C20919r0 isSupported : hashSet) {
                if (isSupported.isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}
