package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17994n;
import androidx.webkit.internal.C20916q0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.webkit.s */
public final class C20970s {

    /* renamed from: b */
    public static final String f54068b = "WebViewAssetLoader";

    /* renamed from: c */
    public static final String f54069c = "appassets.androidplatform.net";

    /* renamed from: a */
    public final List<C20975e> f54070a;

    /* renamed from: androidx.webkit.s$b */
    public static final class C20972b {

        /* renamed from: a */
        public boolean f54072a;

        /* renamed from: b */
        public String f54073b = C20970s.f54069c;
        @C0359n0

        /* renamed from: c */
        public final List<C17994n<String, C20974d>> f54074c = new ArrayList();

        @C0359n0
        /* renamed from: a */
        public C20972b mo62732a(@C0359n0 String str, @C0359n0 C20974d dVar) {
            this.f54074c.add(C17994n.m81748a(str, dVar));
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C20970s mo62733b() {
            ArrayList arrayList = new ArrayList();
            for (C17994n next : this.f54074c) {
                arrayList.add(new C20975e(this.f54073b, (String) next.f46482a, this.f54072a, (C20974d) next.f46483b));
            }
            return new C20970s(arrayList);
        }

        @C0359n0
        /* renamed from: c */
        public C20972b mo62734c(@C0359n0 String str) {
            this.f54073b = str;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C20972b mo62735d(boolean z) {
            this.f54072a = z;
            return this;
        }
    }

    /* renamed from: androidx.webkit.s$c */
    public static final class C20973c implements C20974d {

        /* renamed from: b */
        public static final String[] f54075b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        @C0359n0

        /* renamed from: a */
        public final File f54076a;

        public C20973c(@C0359n0 Context context, @C0359n0 File file) {
            try {
                this.f54076a = new File(C20916q0.m96955a(file));
                if (!mo62736b(context)) {
                    throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        @C0348i1
        @C0359n0
        /* renamed from: a */
        public WebResourceResponse mo62731a(@C0359n0 String str) {
            try {
                File b = C20916q0.m96956b(this.f54076a, str);
                if (b != null) {
                    return new WebResourceResponse(C20916q0.m96958f(str), (String) null, C20916q0.m96960i(b));
                }
                String.format("The requested file: %s is outside the mounted directory: %s", new Object[]{str, this.f54076a});
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error opening the requested path: ");
                sb.append(str);
            }
        }

        /* renamed from: b */
        public final boolean mo62736b(@C0359n0 Context context) throws IOException {
            String a = C20916q0.m96955a(this.f54076a);
            String a2 = C20916q0.m96955a(context.getCacheDir());
            String a3 = C20916q0.m96955a(C20916q0.m96957c(context));
            if ((!a.startsWith(a2) && !a.startsWith(a3)) || a.equals(a2) || a.equals(a3)) {
                return false;
            }
            for (String str : f54075b) {
                if (a.startsWith(a3 + str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.webkit.s$d */
    public interface C20974d {
        @C0348i1
        @C0363p0
        /* renamed from: a */
        WebResourceResponse mo62731a(@C0359n0 String str);
    }

    @C0344h1
    /* renamed from: androidx.webkit.s$e */
    public static class C20975e {

        /* renamed from: e */
        public static final String f54077e = "http";

        /* renamed from: f */
        public static final String f54078f = "https";

        /* renamed from: a */
        public final boolean f54079a;
        @C0359n0

        /* renamed from: b */
        public final String f54080b;
        @C0359n0

        /* renamed from: c */
        public final String f54081c;
        @C0359n0

        /* renamed from: d */
        public final C20974d f54082d;

        public C20975e(@C0359n0 String str, @C0359n0 String str2, boolean z, @C0359n0 C20974d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            } else if (str2.endsWith("/")) {
                this.f54080b = str;
                this.f54081c = str2;
                this.f54079a = z;
                this.f54082d = dVar;
            } else {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
        }

        @C0348i1
        @C0359n0
        /* renamed from: a */
        public String mo62737a(@C0359n0 String str) {
            return str.replaceFirst(this.f54081c, "");
        }

        @C0348i1
        @C0363p0
        /* renamed from: b */
        public C20974d mo62738b(@C0359n0 Uri uri) {
            if (uri.getScheme().equals("http") && !this.f54079a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f54080b) && uri.getPath().startsWith(this.f54081c)) {
                return this.f54082d;
            }
            return null;
        }
    }

    public C20970s(@C0359n0 List<C20975e> list) {
        this.f54070a = list;
    }

    @C0348i1
    @C0363p0
    /* renamed from: a */
    public WebResourceResponse mo62730a(@C0359n0 Uri uri) {
        WebResourceResponse a;
        for (C20975e next : this.f54070a) {
            C20974d b = next.mo62738b(uri);
            if (b != null && (a = b.mo62731a(next.mo62737a(uri.getPath()))) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: androidx.webkit.s$a */
    public static final class C20971a implements C20974d {

        /* renamed from: a */
        public C20916q0 f54071a;

        public C20971a(@C0359n0 Context context) {
            this.f54071a = new C20916q0(context);
        }

        @C0348i1
        @C0363p0
        /* renamed from: a */
        public WebResourceResponse mo62731a(@C0359n0 String str) {
            try {
                return new WebResourceResponse(C20916q0.m96958f(str), (String) null, this.f54071a.mo62671h(str));
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error opening asset path: ");
                sb.append(str);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }

        @C0344h1
        public C20971a(@C0359n0 C20916q0 q0Var) {
            this.f54071a = q0Var;
        }
    }

    /* renamed from: androidx.webkit.s$f */
    public static final class C20976f implements C20974d {

        /* renamed from: a */
        public C20916q0 f54083a;

        public C20976f(@C0359n0 Context context) {
            this.f54083a = new C20916q0(context);
        }

        @C0348i1
        @C0363p0
        /* renamed from: a */
        public WebResourceResponse mo62731a(@C0359n0 String str) {
            try {
                return new WebResourceResponse(C20916q0.m96958f(str), (String) null, this.f54083a.mo62672j(str));
            } catch (Resources.NotFoundException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resource not found from the path: ");
                sb.append(str);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            } catch (IOException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error opening resource from the path: ");
                sb2.append(str);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }

        @C0344h1
        public C20976f(@C0359n0 C20916q0 q0Var) {
            this.f54083a = q0Var;
        }
    }
}
