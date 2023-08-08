package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.r4 */
public class C17218r4 {

    /* renamed from: g */
    public static final String f45465g = "name";

    /* renamed from: h */
    public static final String f45466h = "icon";

    /* renamed from: i */
    public static final String f45467i = "uri";

    /* renamed from: j */
    public static final String f45468j = "key";

    /* renamed from: k */
    public static final String f45469k = "isBot";

    /* renamed from: l */
    public static final String f45470l = "isImportant";
    @C0363p0

    /* renamed from: a */
    public CharSequence f45471a;
    @C0363p0

    /* renamed from: b */
    public IconCompat f45472b;
    @C0363p0

    /* renamed from: c */
    public String f45473c;
    @C0363p0

    /* renamed from: d */
    public String f45474d;

    /* renamed from: e */
    public boolean f45475e;

    /* renamed from: f */
    public boolean f45476f;

    @C0376v0(22)
    /* renamed from: androidx.core.app.r4$a */
    public static class C17219a {
        @C0373u
        /* renamed from: a */
        public static C17218r4 m79540a(PersistableBundle persistableBundle) {
            return new C17221c().mo51672f(persistableBundle.getString("name")).mo51673g(persistableBundle.getString("uri")).mo51671e(persistableBundle.getString("key")).mo51668b(persistableBundle.getBoolean(C17218r4.f45469k)).mo51670d(persistableBundle.getBoolean(C17218r4.f45470l)).mo51667a();
        }

        @C0373u
        /* renamed from: b */
        public static PersistableBundle m79541b(C17218r4 r4Var) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = r4Var.f45471a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString("uri", r4Var.f45473c);
            persistableBundle.putString("key", r4Var.f45474d);
            persistableBundle.putBoolean(C17218r4.f45469k, r4Var.f45475e);
            persistableBundle.putBoolean(C17218r4.f45470l, r4Var.f45476f);
            return persistableBundle;
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.app.r4$b */
    public static class C17220b {
        @C0373u
        /* renamed from: a */
        public static C17218r4 m79542a(Person person) {
            IconCompat iconCompat;
            C17221c f = new C17221c().mo51672f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.m80390l(person.getIcon());
            } else {
                iconCompat = null;
            }
            return f.mo51669c(iconCompat).mo51673g(person.getUri()).mo51671e(person.getKey()).mo51668b(person.isBot()).mo51670d(person.isImportant()).mo51667a();
        }

        @C0373u
        /* renamed from: b */
        public static Person m79543b(C17218r4 r4Var) {
            Icon icon;
            C17293x4.m79688a();
            Person.Builder a = C17286w4.m79681a().setName(r4Var.mo51658f());
            if (r4Var.mo51656d() != null) {
                icon = r4Var.mo51656d().mo51938K();
            } else {
                icon = null;
            }
            return a.setIcon(icon).setUri(r4Var.mo51659g()).setKey(r4Var.mo51657e()).setBot(r4Var.mo51660h()).setImportant(r4Var.mo51661i()).build();
        }
    }

    /* renamed from: androidx.core.app.r4$c */
    public static class C17221c {
        @C0363p0

        /* renamed from: a */
        public CharSequence f45477a;
        @C0363p0

        /* renamed from: b */
        public IconCompat f45478b;
        @C0363p0

        /* renamed from: c */
        public String f45479c;
        @C0363p0

        /* renamed from: d */
        public String f45480d;

        /* renamed from: e */
        public boolean f45481e;

        /* renamed from: f */
        public boolean f45482f;

        public C17221c() {
        }

        @C0359n0
        /* renamed from: a */
        public C17218r4 mo51667a() {
            return new C17218r4(this);
        }

        @C0359n0
        /* renamed from: b */
        public C17221c mo51668b(boolean z) {
            this.f45481e = z;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17221c mo51669c(@C0363p0 IconCompat iconCompat) {
            this.f45478b = iconCompat;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C17221c mo51670d(boolean z) {
            this.f45482f = z;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C17221c mo51671e(@C0363p0 String str) {
            this.f45480d = str;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17221c mo51672f(@C0363p0 CharSequence charSequence) {
            this.f45477a = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C17221c mo51673g(@C0363p0 String str) {
            this.f45479c = str;
            return this;
        }

        public C17221c(C17218r4 r4Var) {
            this.f45477a = r4Var.f45471a;
            this.f45478b = r4Var.f45472b;
            this.f45479c = r4Var.f45473c;
            this.f45480d = r4Var.f45474d;
            this.f45481e = r4Var.f45475e;
            this.f45482f = r4Var.f45476f;
        }
    }

    public C17218r4(C17221c cVar) {
        this.f45471a = cVar.f45477a;
        this.f45472b = cVar.f45478b;
        this.f45473c = cVar.f45479c;
        this.f45474d = cVar.f45480d;
        this.f45475e = cVar.f45481e;
        this.f45476f = cVar.f45482f;
    }

    @C0359n0
    @C0376v0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static C17218r4 m79526a(@C0359n0 Person person) {
        return C17220b.m79542a(person);
    }

    @C0359n0
    /* renamed from: b */
    public static C17218r4 m79527b(@C0359n0 Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        C17221c f = new C17221c().mo51672f(bundle.getCharSequence("name"));
        if (bundle2 != null) {
            iconCompat = IconCompat.m80388j(bundle2);
        } else {
            iconCompat = null;
        }
        return f.mo51669c(iconCompat).mo51673g(bundle.getString("uri")).mo51671e(bundle.getString("key")).mo51668b(bundle.getBoolean(f45469k)).mo51670d(bundle.getBoolean(f45470l)).mo51667a();
    }

    @C0359n0
    @C0376v0(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static C17218r4 m79528c(@C0359n0 PersistableBundle persistableBundle) {
        return C17219a.m79540a(persistableBundle);
    }

    @C0363p0
    /* renamed from: d */
    public IconCompat mo51656d() {
        return this.f45472b;
    }

    @C0363p0
    /* renamed from: e */
    public String mo51657e() {
        return this.f45474d;
    }

    @C0363p0
    /* renamed from: f */
    public CharSequence mo51658f() {
        return this.f45471a;
    }

    @C0363p0
    /* renamed from: g */
    public String mo51659g() {
        return this.f45473c;
    }

    /* renamed from: h */
    public boolean mo51660h() {
        return this.f45475e;
    }

    /* renamed from: i */
    public boolean mo51661i() {
        return this.f45476f;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public String mo51662j() {
        String str = this.f45473c;
        if (str != null) {
            return str;
        }
        if (this.f45471a == null) {
            return "";
        }
        return "name:" + this.f45471a;
    }

    @C0359n0
    @C0376v0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public Person mo51663k() {
        return C17220b.m79543b(this);
    }

    @C0359n0
    /* renamed from: l */
    public C17221c mo51664l() {
        return new C17221c(this);
    }

    @C0359n0
    /* renamed from: m */
    public Bundle mo51665m() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f45471a);
        IconCompat iconCompat = this.f45472b;
        if (iconCompat != null) {
            bundle = iconCompat.mo51940a();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f45473c);
        bundle2.putString("key", this.f45474d);
        bundle2.putBoolean(f45469k, this.f45475e);
        bundle2.putBoolean(f45470l, this.f45476f);
        return bundle2;
    }

    @C0359n0
    @C0376v0(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: n */
    public PersistableBundle mo51666n() {
        return C17219a.m79541b(this);
    }
}
