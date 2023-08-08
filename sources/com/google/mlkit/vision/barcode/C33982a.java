package com.google.mlkit.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C40843u;
import com.google.mlkit.vision.barcode.internal.C34019k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.a */
public class C33982a {

    /* renamed from: A */
    public static final int f82491A = 10;

    /* renamed from: B */
    public static final int f82492B = 11;

    /* renamed from: C */
    public static final int f82493C = 12;

    /* renamed from: b */
    public static final int f82494b = -1;

    /* renamed from: c */
    public static final int f82495c = 0;

    /* renamed from: d */
    public static final int f82496d = 1;

    /* renamed from: e */
    public static final int f82497e = 2;

    /* renamed from: f */
    public static final int f82498f = 4;

    /* renamed from: g */
    public static final int f82499g = 8;

    /* renamed from: h */
    public static final int f82500h = 16;

    /* renamed from: i */
    public static final int f82501i = 32;

    /* renamed from: j */
    public static final int f82502j = 64;

    /* renamed from: k */
    public static final int f82503k = 128;

    /* renamed from: l */
    public static final int f82504l = 256;

    /* renamed from: m */
    public static final int f82505m = 512;

    /* renamed from: n */
    public static final int f82506n = 1024;

    /* renamed from: o */
    public static final int f82507o = 2048;

    /* renamed from: p */
    public static final int f82508p = 4096;

    /* renamed from: q */
    public static final int f82509q = 0;

    /* renamed from: r */
    public static final int f82510r = 1;

    /* renamed from: s */
    public static final int f82511s = 2;

    /* renamed from: t */
    public static final int f82512t = 3;

    /* renamed from: u */
    public static final int f82513u = 4;

    /* renamed from: v */
    public static final int f82514v = 5;

    /* renamed from: w */
    public static final int f82515w = 6;

    /* renamed from: x */
    public static final int f82516x = 7;

    /* renamed from: y */
    public static final int f82517y = 8;

    /* renamed from: z */
    public static final int f82518z = 9;

    /* renamed from: a */
    public final C34019k f82519a;

    /* renamed from: com.google.mlkit.vision.barcode.a$a */
    public static class C33983a {

        /* renamed from: c */
        public static final int f82520c = 0;

        /* renamed from: d */
        public static final int f82521d = 1;

        /* renamed from: e */
        public static final int f82522e = 2;

        /* renamed from: a */
        public final int f82523a;

        /* renamed from: b */
        public final String[] f82524b;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.mlkit.vision.barcode.a$a$a */
        public @interface C33984a {
        }

        public C33983a(int i, @RecentlyNonNull String[] strArr) {
            this.f82523a = i;
            this.f82524b = strArr;
        }

        @C0359n0
        /* renamed from: a */
        public String[] mo98854a() {
            return this.f82524b;
        }

        @C33984a
        /* renamed from: b */
        public int mo98855b() {
            return this.f82523a;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.vision.barcode.a$b */
    public @interface C33985b {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.vision.barcode.a$c */
    public @interface C33986c {
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$d */
    public static class C33987d {

        /* renamed from: a */
        public final int f82525a;

        /* renamed from: b */
        public final int f82526b;

        /* renamed from: c */
        public final int f82527c;

        /* renamed from: d */
        public final int f82528d;

        /* renamed from: e */
        public final int f82529e;

        /* renamed from: f */
        public final int f82530f;

        /* renamed from: g */
        public final boolean f82531g;
        @C0363p0

        /* renamed from: h */
        public final String f82532h;

        public C33987d(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @C0363p0 String str) {
            this.f82525a = i;
            this.f82526b = i2;
            this.f82527c = i3;
            this.f82528d = i4;
            this.f82529e = i5;
            this.f82530f = i6;
            this.f82531g = z;
            this.f82532h = str;
        }

        /* renamed from: a */
        public int mo98856a() {
            return this.f82527c;
        }

        /* renamed from: b */
        public int mo98857b() {
            return this.f82528d;
        }

        /* renamed from: c */
        public int mo98858c() {
            return this.f82529e;
        }

        /* renamed from: d */
        public int mo98859d() {
            return this.f82526b;
        }

        @RecentlyNullable
        /* renamed from: e */
        public String mo98860e() {
            return this.f82532h;
        }

        /* renamed from: f */
        public int mo98861f() {
            return this.f82530f;
        }

        /* renamed from: g */
        public int mo98862g() {
            return this.f82525a;
        }

        /* renamed from: h */
        public boolean mo98863h() {
            return this.f82531g;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$e */
    public static class C33988e {
        @C0363p0

        /* renamed from: a */
        public final String f82533a;
        @C0363p0

        /* renamed from: b */
        public final String f82534b;
        @C0363p0

        /* renamed from: c */
        public final String f82535c;
        @C0363p0

        /* renamed from: d */
        public final String f82536d;
        @C0363p0

        /* renamed from: e */
        public final String f82537e;
        @C0363p0

        /* renamed from: f */
        public final C33987d f82538f;
        @C0363p0

        /* renamed from: g */
        public final C33987d f82539g;

        public C33988e(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 C33987d dVar, @C0363p0 C33987d dVar2) {
            this.f82533a = str;
            this.f82534b = str2;
            this.f82535c = str3;
            this.f82536d = str4;
            this.f82537e = str5;
            this.f82538f = dVar;
            this.f82539g = dVar2;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98864a() {
            return this.f82534b;
        }

        @RecentlyNullable
        /* renamed from: b */
        public C33987d mo98865b() {
            return this.f82539g;
        }

        @RecentlyNullable
        /* renamed from: c */
        public String mo98866c() {
            return this.f82535c;
        }

        @RecentlyNullable
        /* renamed from: d */
        public String mo98867d() {
            return this.f82536d;
        }

        @RecentlyNullable
        /* renamed from: e */
        public C33987d mo98868e() {
            return this.f82538f;
        }

        @RecentlyNullable
        /* renamed from: f */
        public String mo98869f() {
            return this.f82537e;
        }

        @RecentlyNullable
        /* renamed from: g */
        public String mo98870g() {
            return this.f82533a;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$f */
    public static class C33989f {
        @C0363p0

        /* renamed from: a */
        public final C33994j f82540a;
        @C0363p0

        /* renamed from: b */
        public final String f82541b;
        @C0363p0

        /* renamed from: c */
        public final String f82542c;

        /* renamed from: d */
        public final List<C33995k> f82543d;

        /* renamed from: e */
        public final List<C33991h> f82544e;

        /* renamed from: f */
        public final List<String> f82545f;

        /* renamed from: g */
        public final List<C33983a> f82546g;

        public C33989f(@C0363p0 C33994j jVar, @C0363p0 String str, @C0363p0 String str2, @RecentlyNonNull List<C33995k> list, @RecentlyNonNull List<C33991h> list2, @RecentlyNonNull List<String> list3, @RecentlyNonNull List<C33983a> list4) {
            this.f82540a = jVar;
            this.f82541b = str;
            this.f82542c = str2;
            this.f82543d = list;
            this.f82544e = list2;
            this.f82545f = list3;
            this.f82546g = list4;
        }

        @C0359n0
        /* renamed from: a */
        public List<C33983a> mo98871a() {
            return this.f82546g;
        }

        @C0359n0
        /* renamed from: b */
        public List<C33991h> mo98872b() {
            return this.f82544e;
        }

        @RecentlyNullable
        /* renamed from: c */
        public C33994j mo98873c() {
            return this.f82540a;
        }

        @RecentlyNullable
        /* renamed from: d */
        public String mo98874d() {
            return this.f82541b;
        }

        @C0359n0
        /* renamed from: e */
        public List<C33995k> mo98875e() {
            return this.f82543d;
        }

        @RecentlyNullable
        /* renamed from: f */
        public String mo98876f() {
            return this.f82542c;
        }

        @C0359n0
        /* renamed from: g */
        public List<String> mo98877g() {
            return this.f82545f;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$g */
    public static class C33990g {
        @C0363p0

        /* renamed from: a */
        public final String f82547a;
        @C0363p0

        /* renamed from: b */
        public final String f82548b;
        @C0363p0

        /* renamed from: c */
        public final String f82549c;
        @C0363p0

        /* renamed from: d */
        public final String f82550d;
        @C0363p0

        /* renamed from: e */
        public final String f82551e;
        @C0363p0

        /* renamed from: f */
        public final String f82552f;
        @C0363p0

        /* renamed from: g */
        public final String f82553g;
        @C0363p0

        /* renamed from: h */
        public final String f82554h;
        @C0363p0

        /* renamed from: i */
        public final String f82555i;
        @C0363p0

        /* renamed from: j */
        public final String f82556j;
        @C0363p0

        /* renamed from: k */
        public final String f82557k;
        @C0363p0

        /* renamed from: l */
        public final String f82558l;
        @C0363p0

        /* renamed from: m */
        public final String f82559m;
        @C0363p0

        /* renamed from: n */
        public final String f82560n;

        public C33990g(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6, @C0363p0 String str7, @C0363p0 String str8, @C0363p0 String str9, @C0363p0 String str10, @C0363p0 String str11, @C0363p0 String str12, @C0363p0 String str13, @C0363p0 String str14) {
            this.f82547a = str;
            this.f82548b = str2;
            this.f82549c = str3;
            this.f82550d = str4;
            this.f82551e = str5;
            this.f82552f = str6;
            this.f82553g = str7;
            this.f82554h = str8;
            this.f82555i = str9;
            this.f82556j = str10;
            this.f82557k = str11;
            this.f82558l = str12;
            this.f82559m = str13;
            this.f82560n = str14;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98878a() {
            return this.f82553g;
        }

        @RecentlyNullable
        /* renamed from: b */
        public String mo98879b() {
            return this.f82554h;
        }

        @RecentlyNullable
        /* renamed from: c */
        public String mo98880c() {
            return this.f82552f;
        }

        @RecentlyNullable
        /* renamed from: d */
        public String mo98881d() {
            return this.f82555i;
        }

        @RecentlyNullable
        /* renamed from: e */
        public String mo98882e() {
            return this.f82559m;
        }

        @RecentlyNullable
        /* renamed from: f */
        public String mo98883f() {
            return this.f82547a;
        }

        @RecentlyNullable
        /* renamed from: g */
        public String mo98884g() {
            return this.f82558l;
        }

        @RecentlyNullable
        /* renamed from: h */
        public String mo98885h() {
            return this.f82548b;
        }

        @RecentlyNullable
        /* renamed from: i */
        public String mo98886i() {
            return this.f82551e;
        }

        @RecentlyNullable
        /* renamed from: j */
        public String mo98887j() {
            return this.f82557k;
        }

        @RecentlyNullable
        /* renamed from: k */
        public String mo98888k() {
            return this.f82560n;
        }

        @RecentlyNullable
        /* renamed from: l */
        public String mo98889l() {
            return this.f82550d;
        }

        @RecentlyNullable
        /* renamed from: m */
        public String mo98890m() {
            return this.f82556j;
        }

        @RecentlyNullable
        /* renamed from: n */
        public String mo98891n() {
            return this.f82549c;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$h */
    public static class C33991h {

        /* renamed from: e */
        public static final int f82561e = 0;

        /* renamed from: f */
        public static final int f82562f = 1;

        /* renamed from: g */
        public static final int f82563g = 2;

        /* renamed from: a */
        public final int f82564a;
        @C0363p0

        /* renamed from: b */
        public final String f82565b;
        @C0363p0

        /* renamed from: c */
        public final String f82566c;
        @C0363p0

        /* renamed from: d */
        public final String f82567d;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.mlkit.vision.barcode.a$h$a */
        public @interface C33992a {
        }

        public C33991h(int i, @C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3) {
            this.f82564a = i;
            this.f82565b = str;
            this.f82566c = str2;
            this.f82567d = str3;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98892a() {
            return this.f82565b;
        }

        @RecentlyNullable
        /* renamed from: b */
        public String mo98893b() {
            return this.f82567d;
        }

        @RecentlyNullable
        /* renamed from: c */
        public String mo98894c() {
            return this.f82566c;
        }

        @C33992a
        /* renamed from: d */
        public int mo98895d() {
            return this.f82564a;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$i */
    public static class C33993i {

        /* renamed from: a */
        public final double f82568a;

        /* renamed from: b */
        public final double f82569b;

        public C33993i(double d, double d2) {
            this.f82568a = d;
            this.f82569b = d2;
        }

        /* renamed from: a */
        public double mo98896a() {
            return this.f82568a;
        }

        /* renamed from: b */
        public double mo98897b() {
            return this.f82569b;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$j */
    public static class C33994j {
        @C0363p0

        /* renamed from: a */
        public final String f82570a;
        @C0363p0

        /* renamed from: b */
        public final String f82571b;
        @C0363p0

        /* renamed from: c */
        public final String f82572c;
        @C0363p0

        /* renamed from: d */
        public final String f82573d;
        @C0363p0

        /* renamed from: e */
        public final String f82574e;
        @C0363p0

        /* renamed from: f */
        public final String f82575f;
        @C0363p0

        /* renamed from: g */
        public final String f82576g;

        public C33994j(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6, @C0363p0 String str7) {
            this.f82570a = str;
            this.f82571b = str2;
            this.f82572c = str3;
            this.f82573d = str4;
            this.f82574e = str5;
            this.f82575f = str6;
            this.f82576g = str7;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98898a() {
            return this.f82573d;
        }

        @RecentlyNullable
        /* renamed from: b */
        public String mo98899b() {
            return this.f82570a;
        }

        @RecentlyNullable
        /* renamed from: c */
        public String mo98900c() {
            return this.f82575f;
        }

        @RecentlyNullable
        /* renamed from: d */
        public String mo98901d() {
            return this.f82574e;
        }

        @RecentlyNullable
        /* renamed from: e */
        public String mo98902e() {
            return this.f82572c;
        }

        @RecentlyNullable
        /* renamed from: f */
        public String mo98903f() {
            return this.f82571b;
        }

        @RecentlyNullable
        /* renamed from: g */
        public String mo98904g() {
            return this.f82576g;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$k */
    public static class C33995k {

        /* renamed from: c */
        public static final int f82577c = 0;

        /* renamed from: d */
        public static final int f82578d = 1;

        /* renamed from: e */
        public static final int f82579e = 2;

        /* renamed from: f */
        public static final int f82580f = 3;

        /* renamed from: g */
        public static final int f82581g = 4;
        @C0363p0

        /* renamed from: a */
        public final String f82582a;

        /* renamed from: b */
        public final int f82583b;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.mlkit.vision.barcode.a$k$a */
        public @interface C33996a {
        }

        public C33995k(@C0363p0 String str, int i) {
            this.f82582a = str;
            this.f82583b = i;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98905a() {
            return this.f82582a;
        }

        @C33996a
        /* renamed from: b */
        public int mo98906b() {
            return this.f82583b;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$l */
    public static class C33997l {
        @C0363p0

        /* renamed from: a */
        public final String f82584a;
        @C0363p0

        /* renamed from: b */
        public final String f82585b;

        public C33997l(@C0363p0 String str, @C0363p0 String str2) {
            this.f82584a = str;
            this.f82585b = str2;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98907a() {
            return this.f82584a;
        }

        @RecentlyNullable
        /* renamed from: b */
        public String mo98908b() {
            return this.f82585b;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$m */
    public static class C33998m {
        @C0363p0

        /* renamed from: a */
        public final String f82586a;
        @C0363p0

        /* renamed from: b */
        public final String f82587b;

        public C33998m(@C0363p0 String str, @C0363p0 String str2) {
            this.f82586a = str;
            this.f82587b = str2;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String mo98909a() {
            return this.f82586a;
        }

        @RecentlyNullable
        /* renamed from: b */
        public String mo98910b() {
            return this.f82587b;
        }
    }

    /* renamed from: com.google.mlkit.vision.barcode.a$n */
    public static class C33999n {

        /* renamed from: d */
        public static final int f82588d = 1;

        /* renamed from: e */
        public static final int f82589e = 2;

        /* renamed from: f */
        public static final int f82590f = 3;
        @C0363p0

        /* renamed from: a */
        public final String f82591a;
        @C0363p0

        /* renamed from: b */
        public final String f82592b;

        /* renamed from: c */
        public final int f82593c;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.mlkit.vision.barcode.a$n$a */
        public @interface C34000a {
        }

        public C33999n(@C0363p0 String str, @C0363p0 String str2, int i) {
            this.f82591a = str;
            this.f82592b = str2;
            this.f82593c = i;
        }

        @C34000a
        /* renamed from: a */
        public int mo98911a() {
            return this.f82593c;
        }

        @RecentlyNullable
        /* renamed from: b */
        public String mo98912b() {
            return this.f82592b;
        }

        @RecentlyNullable
        /* renamed from: c */
        public String mo98913c() {
            return this.f82591a;
        }
    }

    public C33982a(@C0359n0 C34019k kVar) {
        this.f82519a = (C34019k) C40843u.m166202l(kVar);
    }

    @RecentlyNullable
    /* renamed from: a */
    public Rect mo98838a() {
        return this.f82519a.mo98940d();
    }

    @RecentlyNullable
    /* renamed from: b */
    public C33988e mo98839b() {
        return this.f82519a.mo98941e();
    }

    @RecentlyNullable
    /* renamed from: c */
    public C33989f mo98840c() {
        return this.f82519a.mo98942f();
    }

    @RecentlyNullable
    /* renamed from: d */
    public Point[] mo98841d() {
        return this.f82519a.mo98939M();
    }

    @RecentlyNullable
    /* renamed from: e */
    public String mo98842e() {
        return this.f82519a.mo98949r();
    }

    @RecentlyNullable
    /* renamed from: f */
    public C33990g mo98843f() {
        return this.f82519a.mo98946o();
    }

    @RecentlyNullable
    /* renamed from: g */
    public C33991h mo98844g() {
        return this.f82519a.mo98943h();
    }

    @C33985b
    /* renamed from: h */
    public int mo98845h() {
        int zza = this.f82519a.zza();
        if (zza > 4096) {
            return -1;
        }
        if (zza == 0) {
            return -1;
        }
        return zza;
    }

    @RecentlyNullable
    /* renamed from: i */
    public C33993i mo98846i() {
        return this.f82519a.mo98944j();
    }

    @RecentlyNullable
    /* renamed from: j */
    public C33995k mo98847j() {
        return this.f82519a.mo98945k();
    }

    @RecentlyNullable
    /* renamed from: k */
    public byte[] mo98848k() {
        byte[] u = this.f82519a.mo98952u();
        if (u != null) {
            return Arrays.copyOf(u, u.length);
        }
        return null;
    }

    @RecentlyNullable
    /* renamed from: l */
    public String mo98849l() {
        return this.f82519a.mo98950s();
    }

    @RecentlyNullable
    /* renamed from: m */
    public C33997l mo98850m() {
        return this.f82519a.mo98947p();
    }

    @RecentlyNullable
    /* renamed from: n */
    public C33998m mo98851n() {
        return this.f82519a.mo98951t();
    }

    @C33986c
    /* renamed from: o */
    public int mo98852o() {
        return this.f82519a.zzb();
    }

    @RecentlyNullable
    /* renamed from: p */
    public C33999n mo98853p() {
        return this.f82519a.mo98948q();
    }
}
