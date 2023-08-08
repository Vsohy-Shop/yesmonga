package com.urbanairship.automation;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17785f;
import androidx.core.p027os.C17812o;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.channel.C9008d;
import com.urbanairship.json.C9323b;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;
import com.urbanairship.push.C9537t;
import com.urbanairship.util.C9669o0;
import com.urbanairship.util.C9674q0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: com.urbanairship.automation.c */
public abstract class C8819c {
    @C0348i1
    /* renamed from: a */
    public static boolean m32776a(@C0359n0 Context context, @C0363p0 C8814b bVar) {
        String l;
        if (bVar == null) {
            return true;
        }
        if (!m32781f(bVar)) {
            return false;
        }
        UAirship Y = UAirship.m146188Y();
        Y.mo106232w();
        C9537t E = Y.mo106203E();
        C9008d n = Y.mo106223n();
        boolean Q = E.mo19406Q();
        if ((bVar.mo17336f() != null && bVar.mo17336f().booleanValue() != Q) || !m32780e(context, bVar)) {
            return false;
        }
        if (bVar.mo17340i() != null) {
            if (!Y.mo106202D().mo107874h(32) || !bVar.mo17340i().mo17704c(n.mo17801h0())) {
                return false;
            }
        }
        if (bVar.mo17338h() != null && bVar.mo17338h().booleanValue()) {
            if (!Y.mo106202D().mo107874h(16)) {
                return false;
            }
        }
        if (!(bVar.mo17332c() == null && bVar.mo17337g() == null)) {
            C9323b c = m32778c(Y.mo106200B());
            if (bVar.mo17337g() != null && !bVar.mo17337g().apply(c)) {
                return false;
            }
            if (bVar.mo17332c() != null && ((l = c.mo18801A(Permission.LOCATION.mo19115g()).mo18769l()) == null || bVar.mo17332c().booleanValue() != PermissionStatus.GRANTED.mo19117g().equals(l))) {
                return false;
            }
        }
        return m32779d(bVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public static boolean m32777b(Context context, @C0363p0 C8814b bVar, boolean z) {
        if (bVar == null) {
            return true;
        }
        if ((bVar.mo17334e() == null || bVar.mo17334e().booleanValue() == z) && m32781f(bVar)) {
            return true;
        }
        return false;
    }

    @C0348i1
    @C0359n0
    /* renamed from: c */
    public static C9323b m32778c(@C0359n0 C9439p pVar) {
        C9323b.C9325b y = C9323b.m35017y();
        for (Permission next : pVar.mo19144n()) {
            try {
                PermissionStatus permissionStatus = pVar.mo19142l(next).get();
                if (permissionStatus != null) {
                    y.mo18826j(next.mo19115g(), permissionStatus.mo19117g());
                }
            } catch (ExecutionException e) {
                C36059m.m148411g(e, "Failed to get permissions status: %s", next);
            } catch (InterruptedException e2) {
                C36059m.m148411g(e2, "Failed to get permissions status: %s", next);
                Thread.currentThread().interrupt();
            }
        }
        return y.mo18817a();
    }

    /* renamed from: d */
    public static boolean m32779d(@C0359n0 C8814b bVar) {
        if (bVar.mo17342k() == null) {
            return true;
        }
        return bVar.mo17342k().apply(C9674q0.m36236a());
    }

    /* renamed from: e */
    public static boolean m32780e(@C0359n0 Context context, @C0359n0 C8814b bVar) {
        if (bVar.mo17331b().isEmpty()) {
            return true;
        }
        Locale h = C17785f.m81175a(context.getResources().getConfiguration()).mo52235h((String[]) bVar.mo17331b().toArray(new String[0]));
        if (h == null) {
            return false;
        }
        try {
            C17812o c = C17812o.m81211c(C9669o0.m36225f(m32782g(bVar.mo17331b()), ","));
            for (int i = 0; i < c.mo52239l(); i++) {
                Locale d = c.mo52233d(i);
                if (h.getLanguage().equals(d.getLanguage())) {
                    if (C9669o0.m36224e(d.getCountry()) || d.getCountry().equals(h.getCountry())) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            C36059m.m148409e("Unable to construct locale list: ", e);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m32781f(@C0359n0 C8814b bVar) {
        if (bVar.mo17341j().isEmpty()) {
            return true;
        }
        byte[] k = C9669o0.m36230k(UAirship.m146188Y().mo106223n().mo17793Z());
        if (k != null && k.length >= 16) {
            byte[] copyOf = Arrays.copyOf(k, 16);
            for (String a : bVar.mo17341j()) {
                if (Arrays.equals(copyOf, C9669o0.m36220a(a))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static Set<String> m32782g(List<String> list) {
        HashSet hashSet = new HashSet();
        for (String next : list) {
            if (!C9669o0.m36224e(next)) {
                if (next.endsWith(C32920e.f79928l) || next.endsWith("-")) {
                    C36059m.m148406b("Sanitizing malformed language tag: " + next, new Object[0]);
                    hashSet.add(next.substring(0, next.length() + -1));
                } else {
                    hashSet.add(next);
                }
            }
        }
        return hashSet;
    }
}
