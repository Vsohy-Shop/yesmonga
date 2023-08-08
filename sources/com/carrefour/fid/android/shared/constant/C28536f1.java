package com.carrefour.fid.android.shared.constant;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.constant.f1 */
public final class C28536f1 {
    @C12579k

    /* renamed from: a */
    public static final C28536f1 f69200a = new C28536f1();
    @C12579k

    /* renamed from: b */
    public static final String f69201b = "mes-produits";
    @C12579k

    /* renamed from: c */
    public static final String f69202c = "list_name_product";
    @C12579k

    /* renamed from: d */
    public static final String f69203d = "list_size_product";
    @C12579k

    /* renamed from: e */
    public static final String f69204e = "list_size_productDispo";
    @C12579k

    /* renamed from: f */
    public static final String f69205f = "list_size_productIndispo";
    @C12579k

    /* renamed from: g */
    public static final String f69206g = "list_size_productIndispoA";
    @C12579k

    /* renamed from: h */
    public static final String f69207h = "list_size_productIndispoS";
    @C12579k

    /* renamed from: i */
    public static final String f69208i = "screen_error";
    @C12579k

    /* renamed from: j */
    public static final String f69209j = "mes-achats-frequents";
    @C12579k

    /* renamed from: k */
    public static final String f69210k = "ma-derniere-commande";
    @C12579k

    /* renamed from: l */
    public static final String f69211l = "ma-liste-de-courses";
    @C12579k

    /* renamed from: m */
    public static final String f69212m = "ma-liste-de-courses-vide";
    @C12579k

    /* renamed from: n */
    public static final String f69213n = "recommande-pour-vous";

    /* renamed from: o */
    public static final int f69214o = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.constant.f1$a */
    public static final class C28537a {
        @C12579k

        /* renamed from: a */
        public static final C28537a f69215a = new C28537a();
        @C12579k

        /* renamed from: b */
        public static final String f69216b = "0";
        @C12579k

        /* renamed from: c */
        public static final String f69217c = "1";

        /* renamed from: d */
        public static final int f69218d = 0;
    }

    @C12579k
    /* renamed from: a */
    public final String mo83425a(@C12580l String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "recommande-pour-vous";
        }
        return "recommande-pour-vous-" + str;
    }
}
