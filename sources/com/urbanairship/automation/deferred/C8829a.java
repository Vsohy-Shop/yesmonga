package com.urbanairship.automation.deferred;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.automation.C8800a0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.deferred.a */
public class C8829a implements C8800a0 {
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: d */
    public static final String f23666d = "in_app_message";

    /* renamed from: e */
    public static final String f23667e = "url";

    /* renamed from: f */
    public static final String f23668f = "retry_on_timeout";

    /* renamed from: g */
    public static final String f23669g = "type";

    /* renamed from: a */
    public final Uri f23670a;

    /* renamed from: b */
    public final boolean f23671b;

    /* renamed from: c */
    public final String f23672c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.automation.deferred.a$a */
    public @interface C8830a {
    }

    public C8829a(@C0359n0 Uri uri, boolean z) {
        this(uri, z, (String) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: a */
    public static C8829a m32848a(@C0359n0 JsonValue jsonValue) throws JsonException {
        String l = jsonValue.mo18749A().mo18801A("url").mo18769l();
        if (l != null) {
            return new C8829a(Uri.parse(l), jsonValue.mo18749A().mo18801A(f23668f).mo18757c(true), jsonValue.mo18749A().mo18801A("type").mo18769l());
        }
        throw new JsonException("Missing URL");
    }

    /* renamed from: b */
    public boolean mo17392b() {
        return this.f23671b;
    }

    @C0363p0
    /* renamed from: c */
    public String mo17393c() {
        return this.f23672c;
    }

    @C0359n0
    /* renamed from: d */
    public Uri mo17394d() {
        return this.f23670a;
    }

    /* renamed from: e */
    public boolean mo17395e() {
        return this.f23671b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8829a aVar = (C8829a) obj;
        if (this.f23671b != aVar.f23671b || !this.f23670a.equals(aVar.f23670a)) {
            return false;
        }
        String str = this.f23672c;
        String str2 = aVar.f23672c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f23670a.hashCode() * 31) + (this.f23671b ? 1 : 0)) * 31;
        String str = this.f23672c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("url", this.f23670a.toString()).mo18824h(f23668f, this.f23671b).mo18823g("type", this.f23672c).mo18817a().mo17264q();
    }

    public C8829a(@C0359n0 Uri uri, boolean z, @C0363p0 String str) {
        this.f23670a = uri;
        this.f23671b = z;
        this.f23672c = str;
    }
}
