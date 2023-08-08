package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.s5 */
public final class C17230s5 {

    /* renamed from: h */
    public static final String f45483h = "android.remoteinput.results";

    /* renamed from: i */
    public static final String f45484i = "android.remoteinput.resultsData";

    /* renamed from: j */
    public static final String f45485j = "android.remoteinput.dataTypeResultsData";

    /* renamed from: k */
    public static final String f45486k = "android.remoteinput.resultsSource";

    /* renamed from: l */
    public static final int f45487l = 0;

    /* renamed from: m */
    public static final int f45488m = 1;

    /* renamed from: n */
    public static final int f45489n = 0;

    /* renamed from: o */
    public static final int f45490o = 1;

    /* renamed from: p */
    public static final int f45491p = 2;

    /* renamed from: a */
    public final String f45492a;

    /* renamed from: b */
    public final CharSequence f45493b;

    /* renamed from: c */
    public final CharSequence[] f45494c;

    /* renamed from: d */
    public final boolean f45495d;

    /* renamed from: e */
    public final int f45496e;

    /* renamed from: f */
    public final Bundle f45497f;

    /* renamed from: g */
    public final Set<String> f45498g;

    @C0376v0(16)
    /* renamed from: androidx.core.app.s5$a */
    public static class C17231a {
        @C0373u
        /* renamed from: a */
        public static ClipData m79578a(Intent intent) {
            return intent.getClipData();
        }

        @C0373u
        /* renamed from: b */
        public static void m79579b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    @C0376v0(20)
    /* renamed from: androidx.core.app.s5$b */
    public static class C17232b {
        @C0373u
        /* renamed from: a */
        public static void m79580a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m79581b(C17230s5 s5Var) {
            Set<String> g;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(s5Var.mo51680o()).setLabel(s5Var.mo51679n()).setChoices(s5Var.mo51676h()).setAllowFreeFormInput(s5Var.mo51674f()).addExtras(s5Var.mo51678m());
            if (Build.VERSION.SDK_INT >= 26 && (g = s5Var.mo51675g()) != null) {
                for (String d : g) {
                    C17233c.m79587d(addExtras, d, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C17235e.m79591b(addExtras, s5Var.mo51677k());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        public static C17230s5 m79582c(Object obj) {
            Set<String> b;
            RemoteInput remoteInput = (RemoteInput) obj;
            C17236f a = new C17236f(remoteInput.getResultKey()).mo51689h(remoteInput.getLabel()).mo51687f(remoteInput.getChoices()).mo51686e(remoteInput.getAllowFreeFormInput()).mo51682a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b = C17233c.m79585b(remoteInput)) != null) {
                for (String d : b) {
                    a.mo51685d(d, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a.mo51688g(C17235e.m79590a(remoteInput));
            }
            return a.mo51683b();
        }

        @C0373u
        /* renamed from: d */
        public static Bundle m79583d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.app.s5$c */
    public static class C17233c {
        @C0373u
        /* renamed from: a */
        public static void m79584a(C17230s5 s5Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C17230s5.m79561c(s5Var), intent, map);
        }

        @C0373u
        /* renamed from: b */
        public static Set<String> m79585b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @C0373u
        /* renamed from: c */
        public static Map<String, Uri> m79586c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @C0373u
        /* renamed from: d */
        public static RemoteInput.Builder m79587d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.app.s5$d */
    public static class C17234d {
        @C0373u
        /* renamed from: a */
        public static int m79588a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @C0373u
        /* renamed from: b */
        public static void m79589b(Intent intent, int i) {
            RemoteInput.setResultsSource(intent, i);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.app.s5$e */
    public static class C17235e {
        @C0373u
        /* renamed from: a */
        public static int m79590a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @C0373u
        /* renamed from: b */
        public static RemoteInput.Builder m79591b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* renamed from: androidx.core.app.s5$f */
    public static final class C17236f {

        /* renamed from: a */
        public final String f45499a;

        /* renamed from: b */
        public final Set<String> f45500b = new HashSet();

        /* renamed from: c */
        public final Bundle f45501c = new Bundle();

        /* renamed from: d */
        public CharSequence f45502d;

        /* renamed from: e */
        public CharSequence[] f45503e;

        /* renamed from: f */
        public boolean f45504f = true;

        /* renamed from: g */
        public int f45505g = 0;

        public C17236f(@C0359n0 String str) {
            if (str != null) {
                this.f45499a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @C0359n0
        /* renamed from: a */
        public C17236f mo51682a(@C0359n0 Bundle bundle) {
            if (bundle != null) {
                this.f45501c.putAll(bundle);
            }
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C17230s5 mo51683b() {
            return new C17230s5(this.f45499a, this.f45502d, this.f45503e, this.f45504f, this.f45505g, this.f45501c, this.f45500b);
        }

        @C0359n0
        /* renamed from: c */
        public Bundle mo51684c() {
            return this.f45501c;
        }

        @C0359n0
        /* renamed from: d */
        public C17236f mo51685d(@C0359n0 String str, boolean z) {
            if (z) {
                this.f45500b.add(str);
            } else {
                this.f45500b.remove(str);
            }
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C17236f mo51686e(boolean z) {
            this.f45504f = z;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17236f mo51687f(@C0363p0 CharSequence[] charSequenceArr) {
            this.f45503e = charSequenceArr;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C17236f mo51688g(int i) {
            this.f45505g = i;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C17236f mo51689h(@C0363p0 CharSequence charSequence) {
            this.f45502d = charSequence;
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.s5$g */
    public @interface C17237g {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.s5$h */
    public @interface C17238h {
    }

    public C17230s5(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f45492a = str;
        this.f45493b = charSequence;
        this.f45494c = charSequenceArr;
        this.f45495d = z;
        this.f45496e = i;
        this.f45497f = bundle;
        this.f45498g = set;
        if (mo51677k() == 2 && !mo51674f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static void m79559a(@C0359n0 C17230s5 s5Var, @C0359n0 Intent intent, @C0359n0 Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17233c.m79584a(s5Var, intent, map);
            return;
        }
        Intent i = m79564i(intent);
        if (i == null) {
            i = new Intent();
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Uri uri = (Uri) next.getValue();
            if (str != null) {
                Bundle bundleExtra = i.getBundleExtra(m79566l(str));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(s5Var.mo51680o(), uri.toString());
                i.putExtra(m79566l(str), bundleExtra);
            }
        }
        C17231a.m79579b(intent, ClipData.newIntent(f45483h, i));
    }

    /* renamed from: b */
    public static void m79560b(@C0359n0 C17230s5[] s5VarArr, @C0359n0 Intent intent, @C0359n0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17232b.m79580a(m79562d(s5VarArr), intent, bundle);
            return;
        }
        Bundle p = m79567p(intent);
        int q = m79568q(intent);
        if (p != null) {
            p.putAll(bundle);
            bundle = p;
        }
        for (C17230s5 s5Var : s5VarArr) {
            Map<String, Uri> j = m79565j(intent, s5Var.mo51680o());
            C17232b.m79580a(m79562d(new C17230s5[]{s5Var}), intent, bundle);
            if (j != null) {
                m79559a(s5Var, intent, j);
            }
        }
        m79569s(intent, q);
    }

    @C0376v0(20)
    /* renamed from: c */
    public static RemoteInput m79561c(C17230s5 s5Var) {
        return C17232b.m79581b(s5Var);
    }

    @C0376v0(20)
    /* renamed from: d */
    public static RemoteInput[] m79562d(C17230s5[] s5VarArr) {
        if (s5VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[s5VarArr.length];
        for (int i = 0; i < s5VarArr.length; i++) {
            remoteInputArr[i] = m79561c(s5VarArr[i]);
        }
        return remoteInputArr;
    }

    @C0376v0(20)
    /* renamed from: e */
    public static C17230s5 m79563e(RemoteInput remoteInput) {
        return C17232b.m79582c(remoteInput);
    }

    @C0376v0(16)
    /* renamed from: i */
    public static Intent m79564i(Intent intent) {
        ClipData a = C17231a.m79578a(intent);
        if (a == null) {
            return null;
        }
        ClipDescription description = a.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f45483h)) {
            return a.getItemAt(0).getIntent();
        }
        return null;
    }

    @C0363p0
    /* renamed from: j */
    public static Map<String, Uri> m79565j(@C0359n0 Intent intent, @C0359n0 String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return C17233c.m79586c(intent, str);
        }
        Intent i = m79564i(intent);
        if (i == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : i.getExtras().keySet()) {
            if (next.startsWith(f45485j)) {
                String substring = next.substring(39);
                if (!substring.isEmpty() && (string = i.getBundleExtra(next).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    /* renamed from: l */
    public static String m79566l(String str) {
        return f45485j + str;
    }

    @C0363p0
    /* renamed from: p */
    public static Bundle m79567p(@C0359n0 Intent intent) {
        return C17232b.m79583d(intent);
    }

    /* renamed from: q */
    public static int m79568q(@C0359n0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17234d.m79588a(intent);
        }
        Intent i = m79564i(intent);
        if (i == null) {
            return 0;
        }
        return i.getExtras().getInt(f45486k, 0);
    }

    /* renamed from: s */
    public static void m79569s(@C0359n0 Intent intent, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C17234d.m79589b(intent, i);
            return;
        }
        Intent i2 = m79564i(intent);
        if (i2 == null) {
            i2 = new Intent();
        }
        i2.putExtra(f45486k, i);
        C17231a.m79579b(intent, ClipData.newIntent(f45483h, i2));
    }

    /* renamed from: f */
    public boolean mo51674f() {
        return this.f45495d;
    }

    @C0363p0
    /* renamed from: g */
    public Set<String> mo51675g() {
        return this.f45498g;
    }

    @C0363p0
    /* renamed from: h */
    public CharSequence[] mo51676h() {
        return this.f45494c;
    }

    /* renamed from: k */
    public int mo51677k() {
        return this.f45496e;
    }

    @C0359n0
    /* renamed from: m */
    public Bundle mo51678m() {
        return this.f45497f;
    }

    @C0363p0
    /* renamed from: n */
    public CharSequence mo51679n() {
        return this.f45493b;
    }

    @C0359n0
    /* renamed from: o */
    public String mo51680o() {
        return this.f45492a;
    }

    /* renamed from: r */
    public boolean mo51681r() {
        if (mo51674f() || ((mo51676h() != null && mo51676h().length != 0) || mo51675g() == null || mo51675g().isEmpty())) {
            return false;
        }
        return true;
    }
}
