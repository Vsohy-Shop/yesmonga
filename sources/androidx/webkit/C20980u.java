package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.C20908o1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: androidx.webkit.u */
public class C20980u {

    /* renamed from: A */
    public static final String f54086A = "WEB_MESSAGE_PORT_CLOSE";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: B */
    public static final String f54087B = "WEB_MESSAGE_GET_MESSAGE_PAYLOAD";

    /* renamed from: C */
    public static final String f54088C = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";

    /* renamed from: D */
    public static final String f54089D = "CREATE_WEB_MESSAGE_CHANNEL";

    /* renamed from: E */
    public static final String f54090E = "POST_WEB_MESSAGE";

    /* renamed from: F */
    public static final String f54091F = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";

    /* renamed from: G */
    public static final String f54092G = "GET_WEB_VIEW_CLIENT";

    /* renamed from: H */
    public static final String f54093H = "GET_WEB_CHROME_CLIENT";

    /* renamed from: I */
    public static final String f54094I = "GET_WEB_VIEW_RENDERER";

    /* renamed from: J */
    public static final String f54095J = "WEB_VIEW_RENDERER_TERMINATE";

    /* renamed from: K */
    public static final String f54096K = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";

    /* renamed from: L */
    public static final String f54097L = "PROXY_OVERRIDE";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: M */
    public static final String f54098M = "SUPPRESS_ERROR_PAGE";

    /* renamed from: N */
    public static final String f54099N = "MULTI_PROCESS";

    /* renamed from: O */
    public static final String f54100O = "FORCE_DARK";

    /* renamed from: P */
    public static final String f54101P = "FORCE_DARK_STRATEGY";

    /* renamed from: Q */
    public static final String f54102Q = "ALGORITHMIC_DARKENING";

    /* renamed from: R */
    public static final String f54103R = "WEB_MESSAGE_LISTENER";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: S */
    public static final String f54104S = "DOCUMENT_START_SCRIPT";

    /* renamed from: T */
    public static final String f54105T = "PROXY_OVERRIDE_REVERSE_BYPASS";

    /* renamed from: U */
    public static final String f54106U = "GET_VARIATIONS_HEADER";

    /* renamed from: V */
    public static final String f54107V = "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY";

    /* renamed from: W */
    public static final String f54108W = "GET_COOKIE_INFO";

    /* renamed from: X */
    public static final String f54109X = "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: Y */
    public static final String f54110Y = "REQUESTED_WITH_HEADER_ALLOW_LIST";

    /* renamed from: a */
    public static final String f54111a = "VISUAL_STATE_CALLBACK";

    /* renamed from: b */
    public static final String f54112b = "OFF_SCREEN_PRERASTER";

    /* renamed from: c */
    public static final String f54113c = "SAFE_BROWSING_ENABLE";
    @SuppressLint({"IntentName"})

    /* renamed from: d */
    public static final String f54114d = "DISABLED_ACTION_MODE_MENU_ITEMS";

    /* renamed from: e */
    public static final String f54115e = "START_SAFE_BROWSING";

    /* renamed from: f */
    public static final String f54116f = "SAFE_BROWSING_ALLOWLIST";
    @Deprecated

    /* renamed from: g */
    public static final String f54117g = "SAFE_BROWSING_WHITELIST";

    /* renamed from: h */
    public static final String f54118h = "SAFE_BROWSING_PRIVACY_POLICY_URL";

    /* renamed from: i */
    public static final String f54119i = "SERVICE_WORKER_BASIC_USAGE";

    /* renamed from: j */
    public static final String f54120j = "SERVICE_WORKER_CACHE_MODE";

    /* renamed from: k */
    public static final String f54121k = "SERVICE_WORKER_CONTENT_ACCESS";

    /* renamed from: l */
    public static final String f54122l = "SERVICE_WORKER_FILE_ACCESS";

    /* renamed from: m */
    public static final String f54123m = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";

    /* renamed from: n */
    public static final String f54124n = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";

    /* renamed from: o */
    public static final String f54125o = "RECEIVE_WEB_RESOURCE_ERROR";

    /* renamed from: p */
    public static final String f54126p = "RECEIVE_HTTP_ERROR";

    /* renamed from: q */
    public static final String f54127q = "SHOULD_OVERRIDE_WITH_REDIRECTS";

    /* renamed from: r */
    public static final String f54128r = "SAFE_BROWSING_HIT";

    /* renamed from: s */
    public static final String f54129s = "TRACING_CONTROLLER_BASIC_USAGE";

    /* renamed from: t */
    public static final String f54130t = "WEB_RESOURCE_REQUEST_IS_REDIRECT";

    /* renamed from: u */
    public static final String f54131u = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";

    /* renamed from: v */
    public static final String f54132v = "WEB_RESOURCE_ERROR_GET_CODE";

    /* renamed from: w */
    public static final String f54133w = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";

    /* renamed from: x */
    public static final String f54134x = "SAFE_BROWSING_RESPONSE_PROCEED";

    /* renamed from: y */
    public static final String f54135y = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";

    /* renamed from: z */
    public static final String f54136z = "WEB_MESSAGE_PORT_POST_MESSAGE";

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.u$a */
    public @interface C20981a {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.u$b */
    public @interface C20982b {
    }

    /* renamed from: a */
    public static boolean m97120a(@C0359n0 String str) {
        return C20908o1.m96937d(str);
    }

    /* renamed from: b */
    public static boolean m97121b(@C0359n0 Context context, @C0359n0 String str) {
        return C20908o1.m96935b(str, context);
    }
}
