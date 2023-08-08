package androidx.core.p027os;

import android.os.LocaleList;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.util.Locale;

@C0376v0(24)
/* renamed from: androidx.core.os.r */
public final class C17826r implements C17824q {

    /* renamed from: a */
    public final LocaleList f46211a;

    public C17826r(Object obj) {
        this.f46211a = (LocaleList) obj;
    }

    /* renamed from: a */
    public int mo52243a(Locale locale) {
        return this.f46211a.indexOf(locale);
    }

    /* renamed from: b */
    public String mo52244b() {
        return this.f46211a.toLanguageTags();
    }

    /* renamed from: c */
    public Object mo52245c() {
        return this.f46211a;
    }

    @C0363p0
    /* renamed from: d */
    public Locale mo52246d(@C0359n0 String[] strArr) {
        return this.f46211a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f46211a.equals(((C17824q) obj).mo52245c());
    }

    public Locale get(int i) {
        return this.f46211a.get(i);
    }

    public int hashCode() {
        return this.f46211a.hashCode();
    }

    public boolean isEmpty() {
        return this.f46211a.isEmpty();
    }

    public int size() {
        return this.f46211a.size();
    }

    public String toString() {
        return this.f46211a.toString();
    }
}
