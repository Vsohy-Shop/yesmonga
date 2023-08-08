package com.urbanairship.p006js;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.net.C17767c;
import com.google.android.datatransport.cct.C40042a;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9669o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.urbanairship.js.a */
public class C9315a {

    /* renamed from: c */
    public static final int f25423c = 1;

    /* renamed from: d */
    public static final int f25424d = 2;

    /* renamed from: e */
    public static final int f25425e = 3;

    /* renamed from: f */
    public static final Pattern f25426f = Pattern.compile("((\\*)|(\\*\\.[^/\\*]+)|([^/\\*]+))", 2);

    /* renamed from: g */
    public static final Pattern f25427g = Pattern.compile("([^\\s]*)", 2);

    /* renamed from: h */
    public static final String f25428h = "\\.[]{}()^$?+|*";
    @C0363p0

    /* renamed from: a */
    public C9318c f25429a;

    /* renamed from: b */
    public final List<C9317b> f25430b = new ArrayList();

    /* renamed from: com.urbanairship.js.a$b */
    public static class C9317b {

        /* renamed from: a */
        public final int f25431a;

        /* renamed from: b */
        public final C9320e f25432b;

        public C9317b(C9320e eVar, int i) {
            this.f25431a = i;
            this.f25432b = eVar;
        }
    }

    /* renamed from: com.urbanairship.js.a$c */
    public interface C9318c {
        /* renamed from: a */
        boolean mo18745a(@C0359n0 String str, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.js.a$d */
    public @interface C9319d {
    }

    /* renamed from: com.urbanairship.js.a$e */
    public static class C9320e {

        /* renamed from: a */
        public final Pattern f25433a;

        /* renamed from: b */
        public final Pattern f25434b;

        /* renamed from: c */
        public final Pattern f25435c;

        public C9320e(@C0363p0 Pattern pattern, @C0363p0 Pattern pattern2, @C0363p0 Pattern pattern3) {
            this.f25433a = pattern;
            this.f25434b = pattern2;
            this.f25435c = pattern3;
        }

        /* renamed from: a */
        public boolean mo18746a(@C0359n0 Uri uri) {
            String str;
            if (this.f25433a != null && (uri.getScheme() == null || !this.f25433a.matcher(uri.getScheme()).matches())) {
                return false;
            }
            if (this.f25434b != null && (uri.getHost() == null || !this.f25434b.matcher(uri.getHost()).matches())) {
                return false;
            }
            if (uri.isOpaque()) {
                str = uri.getSchemeSpecificPart();
            } else {
                str = uri.getPath();
            }
            Pattern pattern = this.f25435c;
            if (pattern == null || (str != null && pattern.matcher(str).matches())) {
                return true;
            }
            return false;
        }

        public boolean equals(@C0363p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9320e eVar = (C9320e) obj;
            Pattern pattern = this.f25433a;
            if (pattern == null ? eVar.f25433a != null : !pattern.equals(eVar.f25433a)) {
                return false;
            }
            Pattern pattern2 = this.f25434b;
            if (pattern2 == null ? eVar.f25434b != null : !pattern2.equals(eVar.f25434b)) {
                return false;
            }
            Pattern pattern3 = this.f25435c;
            Pattern pattern4 = eVar.f25435c;
            if (pattern3 != null) {
                return pattern3.equals(pattern4);
            }
            if (pattern4 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            Pattern pattern = this.f25433a;
            int i3 = 0;
            if (pattern != null) {
                i = pattern.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            Pattern pattern2 = this.f25434b;
            if (pattern2 != null) {
                i2 = pattern2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            Pattern pattern3 = this.f25435c;
            if (pattern3 != null) {
                i3 = pattern3.hashCode();
            }
            return i5 + i3;
        }
    }

    @C0359n0
    /* renamed from: d */
    public static C9315a m34948d(@C0359n0 AirshipConfigOptions airshipConfigOptions) {
        C9315a aVar = new C9315a();
        aVar.mo18739b("https://*.urbanairship.com");
        aVar.mo18740c("https://*.youtube.com", 2);
        aVar.mo18739b("https://*.asnapieu.com");
        aVar.mo18740c("sms:", 2);
        aVar.mo18740c(C17767c.f46167b, 2);
        aVar.mo18740c("tel:", 2);
        for (String c : airshipConfigOptions.f87139l) {
            aVar.mo18740c(c, 3);
        }
        for (String c2 : airshipConfigOptions.f87140m) {
            aVar.mo18740c(c2, 1);
        }
        for (String c3 : airshipConfigOptions.f87141n) {
            aVar.mo18740c(c3, 2);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo18738a(@C0359n0 C9320e eVar, int i) {
        synchronized (this.f25430b) {
            this.f25430b.add(new C9317b(eVar, i));
        }
    }

    /* renamed from: b */
    public boolean mo18739b(@C0359n0 String str) {
        return mo18740c(str, 3);
    }

    /* renamed from: c */
    public boolean mo18740c(@C0359n0 String str, int i) {
        String str2;
        Pattern pattern;
        Pattern pattern2;
        Pattern pattern3 = null;
        if (str.equals("*")) {
            mo18738a(new C9320e((Pattern) null, (Pattern) null, (Pattern) null), i);
            return true;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            C36059m.m148409e("Invalid URL allow list pattern %s", str);
            return false;
        }
        String scheme = parse.getScheme();
        if (!C9669o0.m36224e(scheme)) {
            Pattern pattern4 = f25427g;
            if (pattern4.matcher(scheme).matches()) {
                String h = C9669o0.m36227h(parse.getEncodedAuthority());
                if (h == null || f25426f.matcher(h).matches()) {
                    if (parse.isOpaque()) {
                        str2 = parse.getSchemeSpecificPart();
                    } else {
                        str2 = parse.getPath();
                    }
                    if (str2 == null || pattern4.matcher(str2).matches()) {
                        if (C9669o0.m36224e(scheme) || scheme.equals("*")) {
                            pattern = null;
                        } else {
                            pattern = Pattern.compile(mo18741e(scheme, false));
                        }
                        if (C9669o0.m36224e(h) || h.equals("*")) {
                            pattern2 = null;
                        } else if (h.startsWith("*.")) {
                            pattern2 = Pattern.compile("(.*\\.)?" + mo18741e(h.substring(2), true));
                        } else {
                            pattern2 = Pattern.compile(mo18741e(h, true));
                        }
                        if (!C9669o0.m36224e(str2) && !str2.equals("/*")) {
                            pattern3 = Pattern.compile(mo18741e(str2, false));
                        }
                        mo18738a(new C9320e(pattern, pattern2, pattern3), i);
                        return true;
                    }
                    C36059m.m148409e("Invalid path %s in URL allow list pattern %s", str2, str);
                    return false;
                }
                C36059m.m148409e("Invalid host %s in URL allow list pattern %s", h, str);
                return false;
            }
        }
        C36059m.m148409e("Invalid scheme %s in URL allow list pattern %s", scheme, str);
        return false;
    }

    /* renamed from: e */
    public final String mo18741e(@C0359n0 String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (char valueOf : str.toCharArray()) {
            String valueOf2 = String.valueOf(valueOf);
            if (!z && valueOf2.equals("*")) {
                sb.append(".");
            } else if (f25428h.contains(valueOf2)) {
                sb.append(C40042a.f102078h);
            }
            sb.append(valueOf2);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public boolean mo18742f(@C0363p0 String str) {
        return mo18743g(str, 3);
    }

    /* renamed from: g */
    public boolean mo18743g(@C0363p0 String str, int i) {
        int i2;
        C9318c cVar;
        boolean z = false;
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        synchronized (this.f25430b) {
            i2 = 0;
            for (C9317b next : this.f25430b) {
                if (next.f25432b.mo18746a(parse)) {
                    i2 |= next.f25431a;
                }
            }
        }
        if ((i2 & i) == i) {
            z = true;
        }
        if (!z || (cVar = this.f25429a) == null) {
            return z;
        }
        return cVar.mo18745a(str, i);
    }

    /* renamed from: h */
    public void mo18744h(@C0363p0 C9318c cVar) {
        this.f25429a = cVar;
    }
}
