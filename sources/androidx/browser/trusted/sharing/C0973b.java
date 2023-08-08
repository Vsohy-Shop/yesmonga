package androidx.browser.trusted.sharing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.browser.trusted.sharing.b */
public final class C0973b {
    @SuppressLint({"IntentName"})

    /* renamed from: e */
    public static final String f3027e = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* renamed from: f */
    public static final String f3028f = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* renamed from: g */
    public static final String f3029g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* renamed from: h */
    public static final String f3030h = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* renamed from: i */
    public static final String f3031i = "GET";

    /* renamed from: j */
    public static final String f3032j = "POST";

    /* renamed from: k */
    public static final String f3033k = "application/x-www-form-urlencoded";

    /* renamed from: l */
    public static final String f3034l = "multipart/form-data";
    @C0359n0

    /* renamed from: a */
    public final String f3035a;
    @C0363p0

    /* renamed from: b */
    public final String f3036b;
    @C0363p0

    /* renamed from: c */
    public final String f3037c;
    @C0359n0

    /* renamed from: d */
    public final C0976c f3038d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.trusted.sharing.b$a */
    public @interface C0974a {
    }

    /* renamed from: androidx.browser.trusted.sharing.b$b */
    public static final class C0975b {

        /* renamed from: c */
        public static final String f3039c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* renamed from: d */
        public static final String f3040d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        @C0359n0

        /* renamed from: a */
        public final String f3041a;
        @C0359n0

        /* renamed from: b */
        public final List<String> f3042b;

        public C0975b(@C0359n0 String str, @C0359n0 List<String> list) {
            this.f3041a = str;
            this.f3042b = Collections.unmodifiableList(list);
        }

        @C0363p0
        /* renamed from: a */
        public static C0975b m4332a(@C0363p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f3039c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f3040d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new C0975b(string, stringArrayList);
        }

        @C0359n0
        /* renamed from: b */
        public Bundle mo4063b() {
            Bundle bundle = new Bundle();
            bundle.putString(f3039c, this.f3041a);
            bundle.putStringArrayList(f3040d, new ArrayList(this.f3042b));
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.sharing.b$c */
    public static class C0976c {

        /* renamed from: d */
        public static final String f3043d = "androidx.browser.trusted.sharing.KEY_TITLE";

        /* renamed from: e */
        public static final String f3044e = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* renamed from: f */
        public static final String f3045f = "androidx.browser.trusted.sharing.KEY_FILES";
        @C0363p0

        /* renamed from: a */
        public final String f3046a;
        @C0363p0

        /* renamed from: b */
        public final String f3047b;
        @C0363p0

        /* renamed from: c */
        public final List<C0975b> f3048c;

        public C0976c(@C0363p0 String str, @C0363p0 String str2, @C0363p0 List<C0975b> list) {
            this.f3046a = str;
            this.f3047b = str2;
            this.f3048c = list;
        }

        @C0363p0
        /* renamed from: a */
        public static C0976c m4334a(@C0363p0 Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(f3045f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                for (Bundle a : parcelableArrayList) {
                    arrayList.add(C0975b.m4332a(a));
                }
            }
            return new C0976c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @C0359n0
        /* renamed from: b */
        public Bundle mo4064b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f3046a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f3047b);
            if (this.f3048c != null) {
                ArrayList arrayList = new ArrayList();
                for (C0975b b : this.f3048c) {
                    arrayList.add(b.mo4063b());
                }
                bundle.putParcelableArrayList(f3045f, arrayList);
            }
            return bundle;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.trusted.sharing.b$d */
    public @interface C0977d {
    }

    public C0973b(@C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0359n0 C0976c cVar) {
        this.f3035a = str;
        this.f3036b = str2;
        this.f3037c = str3;
        this.f3038d = cVar;
    }

    @C0363p0
    /* renamed from: a */
    public static C0973b m4330a(@C0359n0 Bundle bundle) {
        String string = bundle.getString(f3027e);
        String string2 = bundle.getString(f3028f);
        String string3 = bundle.getString(f3029g);
        C0976c a = C0976c.m4334a(bundle.getBundle(f3030h));
        if (string == null || a == null) {
            return null;
        }
        return new C0973b(string, string2, string3, a);
    }

    @C0359n0
    /* renamed from: b */
    public Bundle mo4062b() {
        Bundle bundle = new Bundle();
        bundle.putString(f3027e, this.f3035a);
        bundle.putString(f3028f, this.f3036b);
        bundle.putString(f3029g, this.f3037c);
        bundle.putBundle(f3030h, this.f3038d.mo4064b());
        return bundle;
    }
}
