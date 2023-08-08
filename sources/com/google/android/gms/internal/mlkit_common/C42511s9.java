package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.android.gms.internal.mlkit_common.s9 */
public final class C42511s9 {

    /* renamed from: a */
    public final String f107355a;

    /* renamed from: b */
    public final C42489q9 f107356b;

    /* renamed from: c */
    public C42489q9 f107357c;

    public /* synthetic */ C42511s9(String str, C42500r9 r9Var) {
        C42489q9 q9Var = new C42489q9((C42478p9) null);
        this.f107356b = q9Var;
        this.f107357c = q9Var;
        str.getClass();
        this.f107355a = str;
    }

    /* renamed from: a */
    public final C42511s9 mo137795a(String str, @CheckForNull Object obj) {
        C42489q9 q9Var = new C42489q9((C42478p9) null);
        this.f107357c.f107303c = q9Var;
        this.f107357c = q9Var;
        q9Var.f107302b = obj;
        q9Var.f107301a = str;
        return this;
    }

    /* renamed from: b */
    public final C42511s9 mo137796b(String str, boolean z) {
        String valueOf = String.valueOf(z);
        C42467o9 o9Var = new C42467o9((C42456n9) null);
        this.f107357c.f107303c = o9Var;
        this.f107357c = o9Var;
        o9Var.f107302b = valueOf;
        o9Var.f107301a = "isManifestFile";
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f107355a);
        sb.append(C12361b.f30258i);
        C42489q9 q9Var = this.f107356b.f107303c;
        String str = "";
        while (q9Var != null) {
            Object obj = q9Var.f107302b;
            sb.append(str);
            String str2 = q9Var.f107301a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            q9Var = q9Var.f107303c;
            str = ", ";
        }
        sb.append(C12361b.f30259j);
        return sb.toString();
    }
}
