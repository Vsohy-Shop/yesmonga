package com.google.mlkit.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.C30106k0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzlw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzly;
import com.google.android.gms.internal.mlkit_vision_text_common.zzma;
import com.google.android.gms.internal.mlkit_vision_text_common.zzmc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.b */
public class C34049b {

    /* renamed from: a */
    public final List<C34053d> f82689a;

    /* renamed from: b */
    public final String f82690b;

    /* renamed from: com.google.mlkit.vision.text.b$c */
    public static class C34052c {

        /* renamed from: a */
        public final String f82692a;

        /* renamed from: b */
        public final Rect f82693b;

        /* renamed from: c */
        public final Point[] f82694c;

        /* renamed from: d */
        public final String f82695d;

        public C34052c(String str, Rect rect, List<Point> list, String str2) {
            this.f82692a = str;
            this.f82693b = rect;
            this.f82694c = (Point[]) list.toArray(new Point[0]);
            this.f82695d = str2;
        }

        @C0363p0
        /* renamed from: a */
        public Rect mo99008a() {
            return this.f82693b;
        }

        @C0363p0
        /* renamed from: b */
        public Point[] mo99009b() {
            return this.f82694c;
        }

        @C0359n0
        /* renamed from: c */
        public String mo99010c() {
            return this.f82695d;
        }

        @C0359n0
        /* renamed from: d */
        public final String mo99011d() {
            String str = this.f82692a;
            return str == null ? "" : str;
        }
    }

    public C34049b(@C0359n0 zzmc zzmc) {
        ArrayList arrayList = new ArrayList();
        this.f82689a = arrayList;
        this.f82690b = zzmc.mo85507M();
        arrayList.addAll(C30106k0.m121751a(zzmc.mo85508Q(), C34081f.f82728a));
    }

    @C0359n0
    /* renamed from: a */
    public String mo99003a() {
        return this.f82690b;
    }

    @C0359n0
    /* renamed from: b */
    public List<C34053d> mo99004b() {
        return Collections.unmodifiableList(this.f82689a);
    }

    public C34049b(@RecentlyNonNull String str, @RecentlyNonNull List<C34053d> list) {
        ArrayList arrayList = new ArrayList();
        this.f82689a = arrayList;
        arrayList.addAll(list);
        this.f82690b = str;
    }

    /* renamed from: com.google.mlkit.vision.text.b$a */
    public static class C34050a extends C34052c {
        public C34050a(@C0359n0 zzly zzly) {
            super(zzly.mo85498W(), zzly.mo85496M(), zzly.mo85499X(), zzly.mo85497Q());
        }

        @C0359n0
        /* renamed from: e */
        public String mo99005e() {
            return mo99011d();
        }

        public C34050a(@RecentlyNonNull String str, @RecentlyNonNull Rect rect, @RecentlyNonNull List<Point> list, @RecentlyNonNull String str2) {
            super(str, rect, list, str2);
        }
    }

    /* renamed from: com.google.mlkit.vision.text.b$b */
    public static class C34051b extends C34052c {
        @C0323b0("this")

        /* renamed from: e */
        public final List<C34050a> f82691e;

        public C34051b(@C0359n0 zzma zzma) {
            super(zzma.mo85503W(), zzma.mo85501M(), zzma.mo85504X(), zzma.mo85502Q());
            this.f82691e = C30106k0.m121751a(zzma.mo85505e0(), C34082g.f82729a);
        }

        @C0359n0
        /* renamed from: e */
        public synchronized List<C34050a> mo99006e() {
            return this.f82691e;
        }

        @C0359n0
        /* renamed from: f */
        public String mo99007f() {
            return mo99011d();
        }

        public C34051b(@RecentlyNonNull String str, @RecentlyNonNull Rect rect, @RecentlyNonNull List<Point> list, @RecentlyNonNull String str2, @RecentlyNonNull List<C34050a> list2) {
            super(str, rect, list, str2);
            this.f82691e = list2;
        }
    }

    /* renamed from: com.google.mlkit.vision.text.b$d */
    public static class C34053d extends C34052c {
        @C0323b0("this")

        /* renamed from: e */
        public final List<C34051b> f82696e;

        public C34053d(@C0359n0 zzlw zzlw) {
            super(zzlw.mo85492W(), zzlw.mo85490M(), zzlw.mo85493X(), zzlw.mo85491Q());
            this.f82696e = C30106k0.m121751a(zzlw.mo85494e0(), C34083h.f82730a);
        }

        @C0359n0
        /* renamed from: e */
        public synchronized List<C34051b> mo99012e() {
            return this.f82696e;
        }

        @C0359n0
        /* renamed from: f */
        public String mo99013f() {
            return mo99011d();
        }

        public C34053d(@RecentlyNonNull String str, @RecentlyNonNull Rect rect, @RecentlyNonNull List<Point> list, @RecentlyNonNull String str2, @RecentlyNonNull List<C34051b> list2) {
            super(str, rect, list, str2);
            this.f82696e = list2;
        }
    }
}
