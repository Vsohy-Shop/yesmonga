package androidx.navigation;

import androidx.navigation.NavDeepLink;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19806u
/* renamed from: androidx.navigation.v */
public final class C19841v {
    @C12579k

    /* renamed from: a */
    public final NavDeepLink.C19680a f50705a = new NavDeepLink.C19680a();
    @C12580l

    /* renamed from: b */
    public String f50706b;
    @C12580l

    /* renamed from: c */
    public String f50707c;
    @C12580l

    /* renamed from: d */
    public String f50708d;

    @C12579k
    /* renamed from: a */
    public final NavDeepLink mo58613a() {
        boolean z;
        NavDeepLink.C19680a aVar = this.f50705a;
        String str = this.f50706b;
        if (str == null && this.f50707c == null && this.f50708d == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (str != null) {
                aVar.mo58215g(str);
            }
            String str2 = this.f50707c;
            if (str2 != null) {
                aVar.mo58213e(str2);
            }
            String str3 = this.f50708d;
            if (str3 != null) {
                aVar.mo58214f(str3);
            }
            return aVar.mo58212a();
        }
        throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
    }

    @C12580l
    /* renamed from: b */
    public final String mo58614b() {
        return this.f50707c;
    }

    @C12580l
    /* renamed from: c */
    public final String mo58615c() {
        return this.f50708d;
    }

    @C12580l
    /* renamed from: d */
    public final String mo58616d() {
        return this.f50706b;
    }

    /* renamed from: e */
    public final void mo58617e(@C12580l String str) {
        boolean z;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
        }
        this.f50707c = str;
    }

    /* renamed from: f */
    public final void mo58618f(@C12580l String str) {
        this.f50708d = str;
    }

    /* renamed from: g */
    public final void mo58619g(@C12580l String str) {
        this.f50706b = str;
    }
}
