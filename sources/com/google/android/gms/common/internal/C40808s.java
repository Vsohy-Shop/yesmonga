package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.errorprone.annotations.C32488a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

@C40473a
/* renamed from: com.google.android.gms.common.internal.s */
public final class C40808s {

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.s$a */
    public static final class C40809a {

        /* renamed from: a */
        public final List f103929a = new ArrayList();

        /* renamed from: b */
        public final Object f103930b;

        public /* synthetic */ C40809a(Object obj, C40788m1 m1Var) {
            C40843u.m166202l(obj);
            this.f103930b = obj;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: a */
        public C40809a mo134475a(@C0359n0 String str, @C0363p0 Object obj) {
            List list = this.f103929a;
            C40843u.m166202l(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        @C40473a
        @C0359n0
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f103930b.getClass().getSimpleName());
            sb.append(C12361b.f30258i);
            int size = this.f103929a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f103929a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(C12361b.f30259j);
            return sb.toString();
        }
    }

    public C40808s() {
        throw new AssertionError("Uninstantiable");
    }

    @C40473a
    /* renamed from: a */
    public static boolean m166009a(@C0359n0 Bundle bundle, @C0359n0 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
            return false;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String next : keySet) {
                if (!m166010b(bundle.get(next), bundle2.get(next))) {
                    return false;
                }
            }
            return true;
        }
    }

    @C40473a
    /* renamed from: b */
    public static boolean m166010b(@C0363p0 Object obj, @C0363p0 Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    @C40473a
    /* renamed from: c */
    public static int m166011c(@C0359n0 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public static C40809a m166012d(@C0359n0 Object obj) {
        return new C40809a(obj, (C40788m1) null);
    }
}
