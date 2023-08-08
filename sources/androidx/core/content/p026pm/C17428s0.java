package androidx.core.content.p026pm;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17218r4;
import androidx.core.content.C17358m0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.C17770e;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.content.pm.s0 */
public class C17428s0 {

    /* renamed from: C */
    public static final String f45673C = "extraPersonCount";

    /* renamed from: D */
    public static final String f45674D = "extraPerson_";

    /* renamed from: E */
    public static final String f45675E = "extraLocusId";

    /* renamed from: F */
    public static final String f45676F = "extraLongLived";

    /* renamed from: G */
    public static final String f45677G = "extraSliceUri";

    /* renamed from: H */
    public static final int f45678H = 1;

    /* renamed from: A */
    public int f45679A;

    /* renamed from: B */
    public int f45680B;

    /* renamed from: a */
    public Context f45681a;

    /* renamed from: b */
    public String f45682b;

    /* renamed from: c */
    public String f45683c;

    /* renamed from: d */
    public Intent[] f45684d;

    /* renamed from: e */
    public ComponentName f45685e;

    /* renamed from: f */
    public CharSequence f45686f;

    /* renamed from: g */
    public CharSequence f45687g;

    /* renamed from: h */
    public CharSequence f45688h;

    /* renamed from: i */
    public IconCompat f45689i;

    /* renamed from: j */
    public boolean f45690j;

    /* renamed from: k */
    public C17218r4[] f45691k;

    /* renamed from: l */
    public Set<String> f45692l;
    @C0363p0

    /* renamed from: m */
    public C17358m0 f45693m;

    /* renamed from: n */
    public boolean f45694n;

    /* renamed from: o */
    public int f45695o;

    /* renamed from: p */
    public PersistableBundle f45696p;

    /* renamed from: q */
    public Bundle f45697q;

    /* renamed from: r */
    public long f45698r;

    /* renamed from: s */
    public UserHandle f45699s;

    /* renamed from: t */
    public boolean f45700t;

    /* renamed from: u */
    public boolean f45701u;

    /* renamed from: v */
    public boolean f45702v;

    /* renamed from: w */
    public boolean f45703w;

    /* renamed from: x */
    public boolean f45704x;

    /* renamed from: y */
    public boolean f45705y = true;

    /* renamed from: z */
    public boolean f45706z;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.pm.s0$b */
    public @interface C17430b {
    }

    @C0376v0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static List<C17428s0> m80006c(@C0359n0 Context context, @C0359n0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo a : list) {
            arrayList.add(new C17429a(context, C17424r.m79998a(a)).mo51839c());
        }
        return arrayList;
    }

    @C0363p0
    @C0376v0(25)
    /* renamed from: p */
    public static C17358m0 m80007p(@C0359n0 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return m80008q(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return C17358m0.m79885d(shortcutInfo.getLocusId());
    }

    @C0363p0
    @C0376v0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: q */
    public static C17358m0 m80008q(@C0363p0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(f45675E)) == null) {
            return null;
        }
        return new C17358m0(string);
    }

    @C0344h1
    @C0376v0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: s */
    public static boolean m80009s(@C0363p0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f45676F)) {
            return false;
        }
        return persistableBundle.getBoolean(f45676F);
    }

    @C0363p0
    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C0376v0(25)
    /* renamed from: u */
    public static C17218r4[] m80010u(@C0359n0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f45673C)) {
            return null;
        }
        int i = persistableBundle.getInt(f45673C);
        C17218r4[] r4VarArr = new C17218r4[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(f45674D);
            int i3 = i2 + 1;
            sb.append(i3);
            r4VarArr[i2] = C17218r4.m79528c(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return r4VarArr;
    }

    /* renamed from: A */
    public boolean mo51808A() {
        return this.f45700t;
    }

    /* renamed from: B */
    public boolean mo51809B() {
        return this.f45703w;
    }

    /* renamed from: C */
    public boolean mo51810C() {
        return this.f45701u;
    }

    /* renamed from: D */
    public boolean mo51811D() {
        return this.f45705y;
    }

    /* renamed from: E */
    public boolean mo51812E(int i) {
        return (i & this.f45680B) != 0;
    }

    /* renamed from: F */
    public boolean mo51813F() {
        return this.f45704x;
    }

    /* renamed from: G */
    public boolean mo51814G() {
        return this.f45702v;
    }

    @C0376v0(25)
    /* renamed from: H */
    public ShortcutInfo mo51815H() {
        C17415p.m79963a();
        ShortcutInfo.Builder a = C17412o.m79960a(this.f45681a, this.f45682b).setShortLabel(this.f45686f).setIntents(this.f45684d);
        IconCompat iconCompat = this.f45689i;
        if (iconCompat != null) {
            ShortcutInfo.Builder unused = a.setIcon(iconCompat.mo51939L(this.f45681a));
        }
        if (!TextUtils.isEmpty(this.f45687g)) {
            ShortcutInfo.Builder unused2 = a.setLongLabel(this.f45687g);
        }
        if (!TextUtils.isEmpty(this.f45688h)) {
            ShortcutInfo.Builder unused3 = a.setDisabledMessage(this.f45688h);
        }
        ComponentName componentName = this.f45685e;
        if (componentName != null) {
            ShortcutInfo.Builder unused4 = a.setActivity(componentName);
        }
        Set<String> set = this.f45692l;
        if (set != null) {
            ShortcutInfo.Builder unused5 = a.setCategories(set);
        }
        ShortcutInfo.Builder unused6 = a.setRank(this.f45695o);
        PersistableBundle persistableBundle = this.f45696p;
        if (persistableBundle != null) {
            ShortcutInfo.Builder unused7 = a.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C17218r4[] r4VarArr = this.f45691k;
            if (r4VarArr != null && r4VarArr.length > 0) {
                int length = r4VarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f45691k[i].mo51663k();
                }
                ShortcutInfo.Builder unused8 = a.setPersons(personArr);
            }
            C17358m0 m0Var = this.f45693m;
            if (m0Var != null) {
                ShortcutInfo.Builder unused9 = a.setLocusId(m0Var.mo51798c());
            }
            ShortcutInfo.Builder unused10 = a.setLongLived(this.f45694n);
        } else {
            ShortcutInfo.Builder unused11 = a.setExtras(mo51817b());
        }
        return a.build();
    }

    /* renamed from: a */
    public Intent mo51816a(Intent intent) {
        Intent[] intentArr = this.f45684d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f45686f.toString());
        if (this.f45689i != null) {
            Drawable drawable = null;
            if (this.f45690j) {
                PackageManager packageManager = this.f45681a.getPackageManager();
                ComponentName componentName = this.f45685e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f45681a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f45689i.mo51943h(intent, drawable, this.f45681a);
        }
        return intent;
    }

    @C0376v0(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public final PersistableBundle mo51817b() {
        if (this.f45696p == null) {
            this.f45696p = new PersistableBundle();
        }
        C17218r4[] r4VarArr = this.f45691k;
        if (r4VarArr != null && r4VarArr.length > 0) {
            this.f45696p.putInt(f45673C, r4VarArr.length);
            int i = 0;
            while (i < this.f45691k.length) {
                PersistableBundle persistableBundle = this.f45696p;
                StringBuilder sb = new StringBuilder();
                sb.append(f45674D);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f45691k[i].mo51666n());
                i = i2;
            }
        }
        C17358m0 m0Var = this.f45693m;
        if (m0Var != null) {
            this.f45696p.putString(f45675E, m0Var.mo51796a());
        }
        this.f45696p.putBoolean(f45676F, this.f45694n);
        return this.f45696p;
    }

    @C0363p0
    /* renamed from: d */
    public ComponentName mo51818d() {
        return this.f45685e;
    }

    @C0363p0
    /* renamed from: e */
    public Set<String> mo51819e() {
        return this.f45692l;
    }

    @C0363p0
    /* renamed from: f */
    public CharSequence mo51820f() {
        return this.f45688h;
    }

    /* renamed from: g */
    public int mo51821g() {
        return this.f45679A;
    }

    /* renamed from: h */
    public int mo51822h() {
        return this.f45680B;
    }

    @C0363p0
    /* renamed from: i */
    public PersistableBundle mo51823i() {
        return this.f45696p;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public IconCompat mo51824j() {
        return this.f45689i;
    }

    @C0359n0
    /* renamed from: k */
    public String mo51825k() {
        return this.f45682b;
    }

    @C0359n0
    /* renamed from: l */
    public Intent mo51826l() {
        Intent[] intentArr = this.f45684d;
        return intentArr[intentArr.length - 1];
    }

    @C0359n0
    /* renamed from: m */
    public Intent[] mo51827m() {
        Intent[] intentArr = this.f45684d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    /* renamed from: n */
    public long mo51828n() {
        return this.f45698r;
    }

    @C0363p0
    /* renamed from: o */
    public C17358m0 mo51829o() {
        return this.f45693m;
    }

    @C0363p0
    /* renamed from: r */
    public CharSequence mo51830r() {
        return this.f45687g;
    }

    @C0359n0
    /* renamed from: t */
    public String mo51831t() {
        return this.f45683c;
    }

    /* renamed from: v */
    public int mo51832v() {
        return this.f45695o;
    }

    @C0359n0
    /* renamed from: w */
    public CharSequence mo51833w() {
        return this.f45686f;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: x */
    public Bundle mo51834x() {
        return this.f45697q;
    }

    @C0363p0
    /* renamed from: y */
    public UserHandle mo51835y() {
        return this.f45699s;
    }

    /* renamed from: z */
    public boolean mo51836z() {
        return this.f45706z;
    }

    /* renamed from: androidx.core.content.pm.s0$a */
    public static class C17429a {

        /* renamed from: a */
        public final C17428s0 f45707a;

        /* renamed from: b */
        public boolean f45708b;

        /* renamed from: c */
        public Set<String> f45709c;

        /* renamed from: d */
        public Map<String, Map<String, List<String>>> f45710d;

        /* renamed from: e */
        public Uri f45711e;

        public C17429a(@C0359n0 Context context, @C0359n0 String str) {
            C17428s0 s0Var = new C17428s0();
            this.f45707a = s0Var;
            s0Var.f45681a = context;
            s0Var.f45682b = str;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @C0359n0
        /* renamed from: a */
        public C17429a mo51837a(@C0359n0 String str) {
            if (this.f45709c == null) {
                this.f45709c = new HashSet();
            }
            this.f45709c.add(str);
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @C0359n0
        /* renamed from: b */
        public C17429a mo51838b(@C0359n0 String str, @C0359n0 String str2, @C0359n0 List<String> list) {
            mo51837a(str);
            if (!list.isEmpty()) {
                if (this.f45710d == null) {
                    this.f45710d = new HashMap();
                }
                if (this.f45710d.get(str) == null) {
                    this.f45710d.put(str, new HashMap());
                }
                this.f45710d.get(str).put(str2, list);
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17428s0 mo51839c() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.f45707a.f45686f)) {
                C17428s0 s0Var = this.f45707a;
                Intent[] intentArr = s0Var.f45684d;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f45708b) {
                    if (s0Var.f45693m == null) {
                        s0Var.f45693m = new C17358m0(s0Var.f45682b);
                    }
                    this.f45707a.f45694n = true;
                }
                if (this.f45709c != null) {
                    C17428s0 s0Var2 = this.f45707a;
                    if (s0Var2.f45692l == null) {
                        s0Var2.f45692l = new HashSet();
                    }
                    this.f45707a.f45692l.addAll(this.f45709c);
                }
                if (this.f45710d != null) {
                    C17428s0 s0Var3 = this.f45707a;
                    if (s0Var3.f45696p == null) {
                        s0Var3.f45696p = new PersistableBundle();
                    }
                    for (String next : this.f45710d.keySet()) {
                        Map map = this.f45710d.get(next);
                        this.f45707a.f45696p.putStringArray(next, (String[]) map.keySet().toArray(new String[0]));
                        for (String str : map.keySet()) {
                            List list = (List) map.get(str);
                            PersistableBundle persistableBundle = this.f45707a.f45696p;
                            String str2 = next + "/" + str;
                            if (list == null) {
                                strArr = new String[0];
                            } else {
                                strArr = (String[]) list.toArray(new String[0]);
                            }
                            persistableBundle.putStringArray(str2, strArr);
                        }
                    }
                }
                if (this.f45711e != null) {
                    C17428s0 s0Var4 = this.f45707a;
                    if (s0Var4.f45696p == null) {
                        s0Var4.f45696p = new PersistableBundle();
                    }
                    this.f45707a.f45696p.putString(C17428s0.f45677G, C17770e.m81141a(this.f45711e));
                }
                return this.f45707a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @C0359n0
        /* renamed from: d */
        public C17429a mo51840d(@C0359n0 ComponentName componentName) {
            this.f45707a.f45685e = componentName;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C17429a mo51841e() {
            this.f45707a.f45690j = true;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17429a mo51842f(@C0359n0 Set<String> set) {
            this.f45707a.f45692l = set;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C17429a mo51843g(@C0359n0 CharSequence charSequence) {
            this.f45707a.f45688h = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C17429a mo51844h(int i) {
            this.f45707a.f45680B = i;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C17429a mo51845i(@C0359n0 PersistableBundle persistableBundle) {
            this.f45707a.f45696p = persistableBundle;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C17429a mo51846j(IconCompat iconCompat) {
            this.f45707a.f45689i = iconCompat;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C17429a mo51847k(@C0359n0 Intent intent) {
            return mo51848l(new Intent[]{intent});
        }

        @C0359n0
        /* renamed from: l */
        public C17429a mo51848l(@C0359n0 Intent[] intentArr) {
            this.f45707a.f45684d = intentArr;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C17429a mo51849m() {
            this.f45708b = true;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C17429a mo51850n(@C0363p0 C17358m0 m0Var) {
            this.f45707a.f45693m = m0Var;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C17429a mo51851o(@C0359n0 CharSequence charSequence) {
            this.f45707a.f45687g = charSequence;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: p */
        public C17429a mo51852p() {
            this.f45707a.f45694n = true;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C17429a mo51853q(boolean z) {
            this.f45707a.f45694n = z;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C17429a mo51854r(@C0359n0 C17218r4 r4Var) {
            return mo51855s(new C17218r4[]{r4Var});
        }

        @C0359n0
        /* renamed from: s */
        public C17429a mo51855s(@C0359n0 C17218r4[] r4VarArr) {
            this.f45707a.f45691k = r4VarArr;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C17429a mo51856t(int i) {
            this.f45707a.f45695o = i;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C17429a mo51857u(@C0359n0 CharSequence charSequence) {
            this.f45707a.f45686f = charSequence;
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @C0359n0
        /* renamed from: v */
        public C17429a mo51858v(@C0359n0 Uri uri) {
            this.f45711e = uri;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: w */
        public C17429a mo51859w(@C0359n0 Bundle bundle) {
            this.f45707a.f45697q = (Bundle) C18001r.m81775l(bundle);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public C17429a(@C0359n0 C17428s0 s0Var) {
            C17428s0 s0Var2 = new C17428s0();
            this.f45707a = s0Var2;
            s0Var2.f45681a = s0Var.f45681a;
            s0Var2.f45682b = s0Var.f45682b;
            s0Var2.f45683c = s0Var.f45683c;
            Intent[] intentArr = s0Var.f45684d;
            s0Var2.f45684d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            s0Var2.f45685e = s0Var.f45685e;
            s0Var2.f45686f = s0Var.f45686f;
            s0Var2.f45687g = s0Var.f45687g;
            s0Var2.f45688h = s0Var.f45688h;
            s0Var2.f45679A = s0Var.f45679A;
            s0Var2.f45689i = s0Var.f45689i;
            s0Var2.f45690j = s0Var.f45690j;
            s0Var2.f45699s = s0Var.f45699s;
            s0Var2.f45698r = s0Var.f45698r;
            s0Var2.f45700t = s0Var.f45700t;
            s0Var2.f45701u = s0Var.f45701u;
            s0Var2.f45702v = s0Var.f45702v;
            s0Var2.f45703w = s0Var.f45703w;
            s0Var2.f45704x = s0Var.f45704x;
            s0Var2.f45705y = s0Var.f45705y;
            s0Var2.f45693m = s0Var.f45693m;
            s0Var2.f45694n = s0Var.f45694n;
            s0Var2.f45706z = s0Var.f45706z;
            s0Var2.f45695o = s0Var.f45695o;
            C17218r4[] r4VarArr = s0Var.f45691k;
            if (r4VarArr != null) {
                s0Var2.f45691k = (C17218r4[]) Arrays.copyOf(r4VarArr, r4VarArr.length);
            }
            if (s0Var.f45692l != null) {
                s0Var2.f45692l = new HashSet(s0Var.f45692l);
            }
            PersistableBundle persistableBundle = s0Var.f45696p;
            if (persistableBundle != null) {
                s0Var2.f45696p = persistableBundle;
            }
            s0Var2.f45680B = s0Var.f45680B;
        }

        @C0376v0(25)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public C17429a(@C0359n0 Context context, @C0359n0 ShortcutInfo shortcutInfo) {
            C17428s0 s0Var = new C17428s0();
            this.f45707a = s0Var;
            s0Var.f45681a = context;
            s0Var.f45682b = shortcutInfo.getId();
            s0Var.f45683c = shortcutInfo.getPackage();
            Intent[] a = shortcutInfo.getIntents();
            s0Var.f45684d = (Intent[]) Arrays.copyOf(a, a.length);
            s0Var.f45685e = shortcutInfo.getActivity();
            s0Var.f45686f = shortcutInfo.getShortLabel();
            s0Var.f45687g = shortcutInfo.getLongLabel();
            s0Var.f45688h = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                s0Var.f45679A = shortcutInfo.getDisabledReason();
            } else {
                s0Var.f45679A = shortcutInfo.isEnabled() ? 0 : 3;
            }
            s0Var.f45692l = shortcutInfo.getCategories();
            s0Var.f45691k = C17428s0.m80010u(shortcutInfo.getExtras());
            s0Var.f45699s = shortcutInfo.getUserHandle();
            s0Var.f45698r = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                s0Var.f45700t = shortcutInfo.isCached();
            }
            s0Var.f45701u = shortcutInfo.isDynamic();
            s0Var.f45702v = shortcutInfo.isPinned();
            s0Var.f45703w = shortcutInfo.isDeclaredInManifest();
            s0Var.f45704x = shortcutInfo.isImmutable();
            s0Var.f45705y = shortcutInfo.isEnabled();
            s0Var.f45706z = shortcutInfo.hasKeyFieldsOnly();
            s0Var.f45693m = C17428s0.m80007p(shortcutInfo);
            s0Var.f45695o = shortcutInfo.getRank();
            s0Var.f45696p = shortcutInfo.getExtras();
        }
    }
}
