package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.core.util.C17992m;
import androidx.media.C19616i;
import com.google.firebase.installations.C33124s;

/* renamed from: androidx.media.s */
public class C19630s implements C19616i.C19617a {

    /* renamed from: c */
    public static final String f50249c = "MediaSessionManager";

    /* renamed from: d */
    public static final boolean f50250d = C19616i.f50241c;

    /* renamed from: e */
    public static final String f50251e = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: f */
    public static final String f50252f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: g */
    public static final String f50253g = "enabled_notification_listeners";

    /* renamed from: a */
    public Context f50254a;

    /* renamed from: b */
    public ContentResolver f50255b;

    /* renamed from: androidx.media.s$a */
    public static class C19631a implements C19616i.C19619c {

        /* renamed from: a */
        public String f50256a;

        /* renamed from: b */
        public int f50257b;

        /* renamed from: c */
        public int f50258c;

        public C19631a(String str, int i, int i2) {
            this.f50256a = str;
            this.f50257b = i;
            this.f50258c = i2;
        }

        /* renamed from: a */
        public int mo57998a() {
            return this.f50258c;
        }

        /* renamed from: b */
        public int mo57999b() {
            return this.f50257b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19631a)) {
                return false;
            }
            C19631a aVar = (C19631a) obj;
            if (TextUtils.equals(this.f50256a, aVar.f50256a) && this.f50257b == aVar.f50257b && this.f50258c == aVar.f50258c) {
                return true;
            }
            return false;
        }

        public String getPackageName() {
            return this.f50256a;
        }

        public int hashCode() {
            return C17992m.m81741b(this.f50256a, Integer.valueOf(this.f50257b), Integer.valueOf(this.f50258c));
        }
    }

    public C19630s(Context context) {
        this.f50254a = context;
        this.f50255b = context.getContentResolver();
    }

    /* renamed from: a */
    public boolean mo57991a(@C0359n0 C19616i.C19619c cVar) {
        try {
            if (this.f50254a.getPackageManager().getApplicationInfo(cVar.getPackageName(), 0).uid != cVar.mo57998a()) {
                if (f50250d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Package name ");
                    sb.append(cVar.getPackageName());
                    sb.append(" doesn't match with the uid ");
                    sb.append(cVar.mo57998a());
                }
                return false;
            } else if (mo58005c(cVar, f50251e) || mo58005c(cVar, f50252f) || cVar.mo57998a() == 1000 || mo58004b(cVar)) {
                return true;
            } else {
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (f50250d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Package ");
                sb2.append(cVar.getPackageName());
                sb2.append(" doesn't exist");
            }
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo58004b(@C0359n0 C19616i.C19619c cVar) {
        String string = Settings.Secure.getString(this.f50255b, "enabled_notification_listeners");
        if (string != null) {
            String[] split = string.split(C33124s.f80355c);
            for (String unflattenFromString : split) {
                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                if (unflattenFromString2 != null && unflattenFromString2.getPackageName().equals(cVar.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo58005c(C19616i.C19619c cVar, String str) {
        if (cVar.mo57999b() < 0) {
            if (this.f50254a.getPackageManager().checkPermission(str, cVar.getPackageName()) == 0) {
                return true;
            }
            return false;
        } else if (this.f50254a.checkPermission(str, cVar.mo57999b(), cVar.mo57998a()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Context getContext() {
        return this.f50254a;
    }
}
