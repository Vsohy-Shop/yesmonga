package com.google.android.datatransport.cct;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.runtime.C40188h;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C40042a implements C40188h {

    /* renamed from: c */
    public static final String f102073c = "cct";

    /* renamed from: d */
    public static final String f102074d;

    /* renamed from: e */
    public static final String f102075e;

    /* renamed from: f */
    public static final String f102076f;

    /* renamed from: g */
    public static final String f102077g = "1$";

    /* renamed from: h */
    public static final String f102078h = "\\";

    /* renamed from: i */
    public static final Set<C40041c> f102079i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C40041c[]{C40041c.m163048b("proto"), C40041c.m163048b("json")})));

    /* renamed from: j */
    public static final C40042a f102080j;

    /* renamed from: k */
    public static final C40042a f102081k;
    @C0359n0

    /* renamed from: a */
    public final String f102082a;
    @C0363p0

    /* renamed from: b */
    public final String f102083b;

    static {
        String a = C40048e.m163073a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f102074d = a;
        String a2 = C40048e.m163073a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f102075e = a2;
        String a3 = C40048e.m163073a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f102076f = a3;
        f102080j = new C40042a(a, (String) null);
        f102081k = new C40042a(a2, a3);
    }

    public C40042a(@C0359n0 String str, @C0363p0 String str2) {
        this.f102082a = str;
        this.f102083b = str2;
    }

    @C0359n0
    /* renamed from: c */
    public static String m163050c(@C0359n0 byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @C0359n0
    /* renamed from: d */
    public static byte[] m163051d(@C0359n0 String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @C0359n0
    /* renamed from: e */
    public static C40042a m163052e(@C0359n0 byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith(f102077g)) {
            String[] split = str.substring(2).split(Pattern.quote(f102078h), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C40042a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C40041c> mo132554a() {
        return f102079i;
    }

    @C0363p0
    /* renamed from: b */
    public byte[] mo132555b() {
        String str = this.f102083b;
        if (str == null && this.f102082a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = f102077g;
        objArr[1] = this.f102082a;
        objArr[2] = f102078h;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @C0363p0
    /* renamed from: f */
    public String mo132556f() {
        return this.f102083b;
    }

    @C0359n0
    /* renamed from: g */
    public String mo132557g() {
        return this.f102082a;
    }

    @C0363p0
    public byte[] getExtras() {
        return mo132555b();
    }

    @C0359n0
    public String getName() {
        return "cct";
    }
}
