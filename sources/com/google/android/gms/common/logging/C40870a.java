package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;

@C40473a
/* renamed from: com.google.android.gms.common.logging.a */
public class C40870a {

    /* renamed from: a */
    public final String f104003a;

    /* renamed from: b */
    public final String f104004b;

    /* renamed from: c */
    public final C40777k f104005c;

    /* renamed from: d */
    public final int f104006d;

    @C40473a
    public C40870a(@C0359n0 String str, @C0359n0 String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(C12361b.f30260k);
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f104004b = str2;
        this.f104003a = str;
        this.f104005c = new C40777k(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f104003a, i)) {
            i++;
        }
        this.f104006d = i;
    }

    @C40473a
    /* renamed from: a */
    public void mo134537a(@C0359n0 String str, @C0359n0 Object... objArr) {
        if (mo134543g(3)) {
            mo134540d(str, objArr);
        }
    }

    @C40473a
    /* renamed from: b */
    public void mo134538b(@C0359n0 String str, @C0359n0 Throwable th, @C0359n0 Object... objArr) {
        mo134540d(str, objArr);
    }

    @C40473a
    /* renamed from: c */
    public void mo134539c(@C0359n0 String str, @C0359n0 Object... objArr) {
        mo134540d(str, objArr);
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public String mo134540d(@C0359n0 String str, @C0359n0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f104004b.concat(str);
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public String mo134541e() {
        return this.f104003a;
    }

    @C40473a
    /* renamed from: f */
    public void mo134542f(@C0359n0 String str, @C0359n0 Object... objArr) {
        mo134540d(str, objArr);
    }

    @C40473a
    /* renamed from: g */
    public boolean mo134543g(int i) {
        return this.f104006d <= i;
    }

    @C40473a
    /* renamed from: h */
    public void mo134544h(@C0359n0 String str, @C0359n0 Throwable th, @C0359n0 Object... objArr) {
        if (mo134543g(2)) {
            mo134540d(str, objArr);
        }
    }

    @C40473a
    /* renamed from: i */
    public void mo134545i(@C0359n0 String str, @C0359n0 Object... objArr) {
        if (mo134543g(2)) {
            mo134540d(str, objArr);
        }
    }

    @C40473a
    /* renamed from: j */
    public void mo134546j(@C0359n0 String str, @C0359n0 Object... objArr) {
        mo134540d(str, objArr);
    }

    @C40473a
    /* renamed from: k */
    public void mo134547k(@C0359n0 String str, @C0359n0 Throwable th, @C0359n0 Object... objArr) {
        Log.wtf(this.f104003a, mo134540d(str, objArr), th);
    }

    @C40473a
    /* renamed from: l */
    public void mo134548l(@C0359n0 Throwable th) {
        Log.wtf(this.f104003a, th);
    }
}
