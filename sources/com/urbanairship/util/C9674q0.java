package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9326c;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.C9335g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.q0 */
public class C9674q0 {

    /* renamed from: a */
    public static final String f26493a = "amazon";

    /* renamed from: b */
    public static final String f26494b = "android";

    /* renamed from: c */
    public static final String f26495c = "version";

    /* renamed from: d */
    public static final String f26496d = "]%s,)";

    /* renamed from: e */
    public static final String f26497e = "[%s,)";

    @C0359n0
    /* renamed from: a */
    public static C9333e m36236a() {
        return m36237b(UAirship.m146188Y().mo106222m().mo107792D());
    }

    @C0359n0
    /* renamed from: b */
    public static C9333e m36237b(long j) {
        String str;
        if (UAirship.m146188Y().mo106201C() == 1) {
            str = "amazon";
        } else {
            str = "android";
        }
        return C9323b.m35017y().mo18822f(str, C9323b.m35017y().mo18821e("version", j).mo18817a()).mo18817a().mo17264q();
    }

    @C0359n0
    /* renamed from: c */
    public static C9329d m36238c(@C0359n0 C9335g gVar) {
        String str;
        if (UAirship.m146188Y().mo106201C() == 1) {
            str = "amazon";
        } else {
            str = "android";
        }
        return C9329d.m35054c().mo18839c(C9326c.m35039b().mo18833h(str).mo18832g("version").mo18835j(gVar).mo18830e()).mo18841e();
    }

    /* renamed from: d */
    public static boolean m36239d(String str, String str2) {
        return C9689z.m36263b(String.format(f26496d, new Object[]{str})).apply(str2);
    }

    /* renamed from: e */
    public static boolean m36240e(String str, String str2) {
        return C9689z.m36263b(String.format(f26497e, new Object[]{str})).apply(str2);
    }
}
