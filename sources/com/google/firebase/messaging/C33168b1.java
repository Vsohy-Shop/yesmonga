package com.google.firebase.messaging;

import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.google.android.gms.common.internal.C40808s;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.b1 */
public final class C33168b1 {
    @C0344h1

    /* renamed from: d */
    public static final String f80509d = "!";

    /* renamed from: e */
    public static final String f80510e = "/topics/";

    /* renamed from: f */
    public static final String f80511f = "[a-zA-Z0-9-_.~%]{1,900}";

    /* renamed from: g */
    public static final Pattern f80512g = Pattern.compile(f80511f);

    /* renamed from: a */
    public final String f80513a;

    /* renamed from: b */
    public final String f80514b;

    /* renamed from: c */
    public final String f80515c;

    public C33168b1(String str, String str2) {
        this.f80513a = m133793d(str2, str);
        this.f80514b = str;
        this.f80515c = str + f80509d + str2;
    }

    @C0363p0
    /* renamed from: a */
    public static C33168b1 m133792a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(f80509d, -1);
        if (split.length != 2) {
            return null;
        }
        return new C33168b1(split[0], split[1]);
    }

    @C0359n0
    /* renamed from: d */
    public static String m133793d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2});
            str = str.substring(8);
        }
        if (str != null && f80512g.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, f80511f}));
    }

    /* renamed from: f */
    public static C33168b1 m133794f(@C0359n0 String str) {
        return new C33168b1(C19135a.f48823R4, str);
    }

    /* renamed from: g */
    public static C33168b1 m133795g(@C0359n0 String str) {
        return new C33168b1(C37106a.f92903h, str);
    }

    /* renamed from: b */
    public String mo96033b() {
        return this.f80514b;
    }

    /* renamed from: c */
    public String mo96034c() {
        return this.f80513a;
    }

    /* renamed from: e */
    public String mo96035e() {
        return this.f80515c;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C33168b1)) {
            return false;
        }
        C33168b1 b1Var = (C33168b1) obj;
        if (!this.f80513a.equals(b1Var.f80513a) || !this.f80514b.equals(b1Var.f80514b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f80514b, this.f80513a);
    }
}
