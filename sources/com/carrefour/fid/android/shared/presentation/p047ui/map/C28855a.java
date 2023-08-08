package com.carrefour.fid.android.shared.presentation.p047ui.map;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.C28444b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.map.a */
public final class C28855a {
    @C12579k

    /* renamed from: a */
    public static final C28855a f70682a = new C28855a();
    @C12579k

    /* renamed from: b */
    public static final String f70683b = "CARREFOUR";
    @C12579k

    /* renamed from: c */
    public static final String f70684c = "CARREFOUR MARKET";
    @C12579k

    /* renamed from: d */
    public static final String f70685d = "MARKET";
    @C12579k

    /* renamed from: e */
    public static final String f70686e = "CARREFOUR CONTACT";
    @C12579k

    /* renamed from: f */
    public static final String f70687f = "CONTACT MARCHE";
    @C12579k

    /* renamed from: g */
    public static final String f70688g = "BIO";
    @C12579k

    /* renamed from: h */
    public static final String f70689h = "CARREFOUR CITY";
    @C12579k

    /* renamed from: i */
    public static final String f70690i = "CARREFOUR EXPRESS";
    @C12579k

    /* renamed from: j */
    public static final String f70691j = "CORNER EXPRESS";
    @C12579k

    /* renamed from: k */
    public static final String f70692k = "CARREFOUR MONTAGNE";
    @C12579k

    /* renamed from: l */
    public static final String f70693l = "BON APP";
    @C12579k

    /* renamed from: m */
    public static final String f70694m = "EXPRESS";
    @C12579k

    /* renamed from: n */
    public static final String f70695n = "SUPERMARCHES FRANCE";
    @C12579k

    /* renamed from: o */
    public static final String f70696o = "HYPERMARCHES FRANCE";
    @C12579k

    /* renamed from: p */
    public static final String f70697p = "PROXIMITE";
    @C12579k

    /* renamed from: q */
    public static final String f70698q = "E-COMMERCE";

    /* renamed from: r */
    public static final int f70699r = 0;

    /* renamed from: c */
    public static /* synthetic */ int m119342c(C28855a aVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aVar.mo83976b(str, z);
    }

    /* renamed from: f */
    public static /* synthetic */ int m119343f(C28855a aVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aVar.mo83978e(str, z);
    }

    /* renamed from: a */
    public final int mo83975a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "format");
        switch (str.hashCode()) {
            case -1998413749:
                if (str.equals(f70697p)) {
                    return C28444b.C28452h.ic_crf_contact_logo;
                }
                break;
            case -225387677:
                if (str.equals(f70698q)) {
                    return C28444b.C28452h.ic_logo_ecommerce;
                }
                break;
            case 470824229:
                if (str.equals(f70695n)) {
                    return C28444b.C28452h.ic_crf_market_logo;
                }
                break;
            case 1476758102:
                if (str.equals(f70696o)) {
                    return C28444b.C28452h.ic_logo_carrefour;
                }
                break;
        }
        return C28444b.C28452h.ic_logo_carrefour;
    }

    /* renamed from: b */
    public final int mo83976b(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "format");
        if (z) {
            switch (str.hashCode()) {
                case -1998413749:
                    if (str.equals(f70697p)) {
                        return C28444b.C28452h.ic_pin_city_active;
                    }
                    break;
                case -225387677:
                    if (str.equals(f70698q)) {
                        return C28444b.C28452h.ic_pin_ecommerce_active;
                    }
                    break;
                case 470824229:
                    if (str.equals(f70695n)) {
                        return C28444b.C28452h.ic_pin_market_active;
                    }
                    break;
                case 1476758102:
                    if (str.equals(f70696o)) {
                        return C28444b.C28452h.ic_pin_hyper_active;
                    }
                    break;
            }
            return C28444b.C28452h.ic_pin_hyper_active;
        }
        switch (str.hashCode()) {
            case -1998413749:
                if (str.equals(f70697p)) {
                    return C28444b.C28452h.ic_pin_city_default;
                }
                break;
            case -225387677:
                if (str.equals(f70698q)) {
                    return C28444b.C28452h.ic_pin_ecommerce_default;
                }
                break;
            case 470824229:
                if (str.equals(f70695n)) {
                    return C28444b.C28452h.ic_pin_market_default;
                }
                break;
            case 1476758102:
                if (str.equals(f70696o)) {
                    return C28444b.C28452h.ic_pin_hyper_default;
                }
                break;
        }
        return C28444b.C28452h.ic_pin_hyper_default;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r2.equals(f70691j) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r2.equals(f70685d) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_hyper;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_dark_green;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_market;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2.equals(f70684c) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r2.equals(f70690i) == false) goto L_0x0083;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo83977d(@org.jetbrains.annotations.C12579k java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "facilitiesFormat"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2027976644: goto L_0x0077;
                case -1162676091: goto L_0x006b;
                case -1033870472: goto L_0x005f;
                case -734094995: goto L_0x0053;
                case -117562718: goto L_0x0047;
                case 65768: goto L_0x003b;
                case 780456706: goto L_0x002f;
                case 1300366525: goto L_0x0026;
                case 1673062174: goto L_0x0018;
                case 1773813039: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0083
        L_0x000e:
            java.lang.String r0 = "CARREFOUR MARKET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0018:
            java.lang.String r0 = "CARREFOUR CITY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0022
            goto L_0x0083
        L_0x0022:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_dark_green
            goto L_0x0085
        L_0x0026:
            java.lang.String r0 = "CARREFOUR EXPRESS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0074
            goto L_0x0083
        L_0x002f:
            java.lang.String r0 = "BON APP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0038
            goto L_0x0083
        L_0x0038:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_bon_app
            goto L_0x0085
        L_0x003b:
            java.lang.String r0 = "BIO"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0044
            goto L_0x0083
        L_0x0044:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_bio
            goto L_0x0085
        L_0x0047:
            java.lang.String r0 = "CONTACT MARCHE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0050
            goto L_0x0083
        L_0x0050:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_contactmarche
            goto L_0x0085
        L_0x0053:
            java.lang.String r0 = "CARREFOUR CONTACT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x005c
            goto L_0x0083
        L_0x005c:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_dark_green
            goto L_0x0085
        L_0x005f:
            java.lang.String r0 = "CARREFOUR MONTAGNE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0068
            goto L_0x0083
        L_0x0068:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_dark_green
            goto L_0x0085
        L_0x006b:
            java.lang.String r0 = "CORNER EXPRESS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0074
            goto L_0x0083
        L_0x0074:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_dark_green
            goto L_0x0085
        L_0x0077:
            java.lang.String r0 = "MARKET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_market
            goto L_0x0085
        L_0x0083:
            int r2 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_crf_pin_hyper
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a.mo83977d(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r11.equals(f70690i) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r11.equals(f70691j) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        if (r11.equals(f70685d) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r11.equals(f70684c) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r11.equals(f70690i) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        if (r11.equals(f70691j) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r11.equals(f70684c) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f1, code lost:
        if (r11.equals(f70685d) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_hyper_default;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_express_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_market_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_hyper_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_express_default;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_market_default;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo83978e(@org.jetbrains.annotations.C12579k java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "banner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "CARREFOUR MARKET"
            java.lang.String r1 = "CARREFOUR CITY"
            java.lang.String r2 = "CARREFOUR EXPRESS"
            java.lang.String r3 = "BON APP"
            java.lang.String r4 = "BIO"
            java.lang.String r5 = "CONTACT MARCHE"
            java.lang.String r6 = "CARREFOUR CONTACT"
            java.lang.String r7 = "CARREFOUR MONTAGNE"
            java.lang.String r8 = "CORNER EXPRESS"
            java.lang.String r9 = "MARKET"
            if (r12 == 0) goto L_0x008f
            int r12 = r11.hashCode()
            switch(r12) {
                case -2027976644: goto L_0x0080;
                case -1162676091: goto L_0x0075;
                case -1033870472: goto L_0x006a;
                case -734094995: goto L_0x005f;
                case -117562718: goto L_0x0054;
                case 65768: goto L_0x0049;
                case 780456706: goto L_0x003e;
                case 1300366525: goto L_0x0037;
                case 1673062174: goto L_0x002c;
                case 1773813039: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x008b
        L_0x0024:
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0087
            goto L_0x008b
        L_0x002c:
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0033
            goto L_0x008b
        L_0x0033:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_city_active
            goto L_0x00f9
        L_0x0037:
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L_0x007c
            goto L_0x008b
        L_0x003e:
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x0045
            goto L_0x008b
        L_0x0045:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_bonapp_active
            goto L_0x00f9
        L_0x0049:
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x0050
            goto L_0x008b
        L_0x0050:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_bio_active
            goto L_0x00f9
        L_0x0054:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x005b
            goto L_0x008b
        L_0x005b:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_contactmarche_active
            goto L_0x00f9
        L_0x005f:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x0066
            goto L_0x008b
        L_0x0066:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_contact_active
            goto L_0x00f9
        L_0x006a:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0071
            goto L_0x008b
        L_0x0071:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_montagne_active
            goto L_0x00f9
        L_0x0075:
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x007c
            goto L_0x008b
        L_0x007c:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_express_active
            goto L_0x00f9
        L_0x0080:
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_market_active
            goto L_0x00f9
        L_0x008b:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_hyper_active
            goto L_0x00f9
        L_0x008f:
            int r12 = r11.hashCode()
            switch(r12) {
                case -2027976644: goto L_0x00ed;
                case -1162676091: goto L_0x00e3;
                case -1033870472: goto L_0x00d9;
                case -734094995: goto L_0x00cf;
                case -117562718: goto L_0x00c5;
                case 65768: goto L_0x00bb;
                case 780456706: goto L_0x00b1;
                case 1300366525: goto L_0x00aa;
                case 1673062174: goto L_0x00a0;
                case 1773813039: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x00f7
        L_0x0098:
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x00f4
            goto L_0x00f7
        L_0x00a0:
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x00a7
            goto L_0x00f7
        L_0x00a7:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_city_default
            goto L_0x00f9
        L_0x00aa:
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L_0x00ea
            goto L_0x00f7
        L_0x00b1:
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x00b8
            goto L_0x00f7
        L_0x00b8:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_bonapp_default
            goto L_0x00f9
        L_0x00bb:
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x00c2
            goto L_0x00f7
        L_0x00c2:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_bio_default
            goto L_0x00f9
        L_0x00c5:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x00cc
            goto L_0x00f7
        L_0x00cc:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_contactmarche_default
            goto L_0x00f9
        L_0x00cf:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x00d6
            goto L_0x00f7
        L_0x00d6:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_contact_default
            goto L_0x00f9
        L_0x00d9:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x00e0
            goto L_0x00f7
        L_0x00e0:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_montagne_default
            goto L_0x00f9
        L_0x00e3:
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x00ea
            goto L_0x00f7
        L_0x00ea:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_express_default
            goto L_0x00f9
        L_0x00ed:
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x00f4
            goto L_0x00f7
        L_0x00f4:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_market_default
            goto L_0x00f9
        L_0x00f7:
            int r11 = com.carrefour.fid.android.shared.C28444b.C28452h.ic_pin_hyper_default
        L_0x00f9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a.mo83978e(java.lang.String, boolean):int");
    }
}
