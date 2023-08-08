package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.C33180f;
import com.google.maps.android.data.kml.C33866p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@SafeParcelable.C40812a(creator = "RemoteMessageCreator")
@SafeParcelable.C40818g({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C33243t0();

    /* renamed from: d */
    public static final int f80435d = 0;

    /* renamed from: e */
    public static final int f80436e = 1;

    /* renamed from: f */
    public static final int f80437f = 2;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public Bundle f80438a;

    /* renamed from: b */
    public Map<String, String> f80439b;

    /* renamed from: c */
    public C33158d f80440c;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    public static class C33156b {

        /* renamed from: a */
        public final Bundle f80441a;

        /* renamed from: b */
        public final Map<String, String> f80442b = new C1866a();

        public C33156b(@C0359n0 String str) {
            Bundle bundle = new Bundle();
            this.f80441a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(C33180f.C33184d.f80614g, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @C0359n0
        /* renamed from: a */
        public C33156b mo95980a(@C0359n0 String str, @C0363p0 String str2) {
            this.f80442b.put(str, str2);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public RemoteMessage mo95981b() {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f80442b.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            bundle.putAll(this.f80441a);
            this.f80441a.remove("from");
            return new RemoteMessage(bundle);
        }

        @C0359n0
        /* renamed from: c */
        public C33156b mo95982c() {
            this.f80442b.clear();
            return this;
        }

        @C0363p0
        /* renamed from: d */
        public String mo95983d() {
            return this.f80441a.getString(C33180f.C33184d.f80611d);
        }

        @C0359n0
        /* renamed from: e */
        public Map<String, String> mo95984e() {
            return this.f80442b;
        }

        @C0359n0
        /* renamed from: f */
        public String mo95985f() {
            return this.f80441a.getString(C33180f.C33184d.f80615h, "");
        }

        @C0363p0
        /* renamed from: g */
        public String mo95986g() {
            return this.f80441a.getString(C33180f.C33184d.f80611d);
        }

        @C0337f0(from = 0, mo995to = 86400)
        /* renamed from: h */
        public int mo95987h() {
            return Integer.parseInt(this.f80441a.getString(C33180f.C33184d.f80611d, "0"));
        }

        @C0359n0
        /* renamed from: i */
        public C33156b mo95988i(@C0363p0 String str) {
            this.f80441a.putString(C33180f.C33184d.f80612e, str);
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C33156b mo95989j(@C0359n0 Map<String, String> map) {
            this.f80442b.clear();
            this.f80442b.putAll(map);
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C33156b mo95990k(@C0359n0 String str) {
            this.f80441a.putString(C33180f.C33184d.f80615h, str);
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C33156b mo95991l(@C0363p0 String str) {
            this.f80441a.putString(C33180f.C33184d.f80611d, str);
            return this;
        }

        @C40858y
        @C0359n0
        /* renamed from: m */
        public C33156b mo95992m(byte[] bArr) {
            this.f80441a.putByteArray("rawData", bArr);
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C33156b mo95993n(@C0337f0(from = 0, mo995to = 86400) int i) {
            this.f80441a.putString(C33180f.C33184d.f80616i, String.valueOf(i));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.messaging.RemoteMessage$c */
    public @interface C33157c {
    }

    /* renamed from: com.google.firebase.messaging.RemoteMessage$d */
    public static class C33158d {

        /* renamed from: a */
        public final String f80443a;

        /* renamed from: b */
        public final String f80444b;

        /* renamed from: c */
        public final String[] f80445c;

        /* renamed from: d */
        public final String f80446d;

        /* renamed from: e */
        public final String f80447e;

        /* renamed from: f */
        public final String[] f80448f;

        /* renamed from: g */
        public final String f80449g;

        /* renamed from: h */
        public final String f80450h;

        /* renamed from: i */
        public final String f80451i;

        /* renamed from: j */
        public final String f80452j;

        /* renamed from: k */
        public final String f80453k;

        /* renamed from: l */
        public final String f80454l;

        /* renamed from: m */
        public final String f80455m;

        /* renamed from: n */
        public final Uri f80456n;

        /* renamed from: o */
        public final String f80457o;

        /* renamed from: p */
        public final Integer f80458p;

        /* renamed from: q */
        public final Integer f80459q;

        /* renamed from: r */
        public final Integer f80460r;

        /* renamed from: s */
        public final int[] f80461s;

        /* renamed from: t */
        public final Long f80462t;

        /* renamed from: u */
        public final boolean f80463u;

        /* renamed from: v */
        public final boolean f80464v;

        /* renamed from: w */
        public final boolean f80465w;

        /* renamed from: x */
        public final boolean f80466x;

        /* renamed from: y */
        public final boolean f80467y;

        /* renamed from: z */
        public final long[] f80468z;

        /* renamed from: p */
        public static String[] m133750p(C33209l0 l0Var, String str) {
            Object[] g = l0Var.mo96118g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        @C0363p0
        /* renamed from: A */
        public Integer mo95994A() {
            return this.f80459q;
        }

        @C0363p0
        /* renamed from: a */
        public String mo95995a() {
            return this.f80446d;
        }

        @C0363p0
        /* renamed from: b */
        public String[] mo95996b() {
            return this.f80448f;
        }

        @C0363p0
        /* renamed from: c */
        public String mo95997c() {
            return this.f80447e;
        }

        @C0363p0
        /* renamed from: d */
        public String mo95998d() {
            return this.f80455m;
        }

        @C0363p0
        /* renamed from: e */
        public String mo95999e() {
            return this.f80454l;
        }

        @C0363p0
        /* renamed from: f */
        public String mo96000f() {
            return this.f80453k;
        }

        /* renamed from: g */
        public boolean mo96001g() {
            return this.f80467y;
        }

        /* renamed from: h */
        public boolean mo96002h() {
            return this.f80465w;
        }

        /* renamed from: i */
        public boolean mo96003i() {
            return this.f80466x;
        }

        @C0363p0
        /* renamed from: j */
        public Long mo96004j() {
            return this.f80462t;
        }

        @C0363p0
        /* renamed from: k */
        public String mo96005k() {
            return this.f80449g;
        }

        @C0363p0
        /* renamed from: l */
        public Uri mo96006l() {
            String str = this.f80450h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @C0363p0
        /* renamed from: m */
        public int[] mo96007m() {
            return this.f80461s;
        }

        @C0363p0
        /* renamed from: n */
        public Uri mo96008n() {
            return this.f80456n;
        }

        /* renamed from: o */
        public boolean mo96009o() {
            return this.f80464v;
        }

        @C0363p0
        /* renamed from: q */
        public Integer mo96010q() {
            return this.f80460r;
        }

        @C0363p0
        /* renamed from: r */
        public Integer mo96011r() {
            return this.f80458p;
        }

        @C0363p0
        /* renamed from: s */
        public String mo96012s() {
            return this.f80451i;
        }

        /* renamed from: t */
        public boolean mo96013t() {
            return this.f80463u;
        }

        @C0363p0
        /* renamed from: u */
        public String mo96014u() {
            return this.f80452j;
        }

        @C0363p0
        /* renamed from: v */
        public String mo96015v() {
            return this.f80457o;
        }

        @C0363p0
        /* renamed from: w */
        public String mo96016w() {
            return this.f80443a;
        }

        @C0363p0
        /* renamed from: x */
        public String[] mo96017x() {
            return this.f80445c;
        }

        @C0363p0
        /* renamed from: y */
        public String mo96018y() {
            return this.f80444b;
        }

        @C0363p0
        /* renamed from: z */
        public long[] mo96019z() {
            return this.f80468z;
        }

        public C33158d(C33209l0 l0Var) {
            this.f80443a = l0Var.mo96127p(C33180f.C33183c.f80588g);
            this.f80444b = l0Var.mo96119h(C33180f.C33183c.f80588g);
            this.f80445c = m133750p(l0Var, C33180f.C33183c.f80588g);
            this.f80446d = l0Var.mo96127p(C33180f.C33183c.f80589h);
            this.f80447e = l0Var.mo96119h(C33180f.C33183c.f80589h);
            this.f80448f = m133750p(l0Var, C33180f.C33183c.f80589h);
            this.f80449g = l0Var.mo96127p(C33180f.C33183c.f80590i);
            this.f80451i = l0Var.mo96126o();
            this.f80452j = l0Var.mo96127p(C33180f.C33183c.f80592k);
            this.f80453k = l0Var.mo96127p(C33180f.C33183c.f80593l);
            this.f80454l = l0Var.mo96127p(C33180f.C33183c.f80575A);
            this.f80455m = l0Var.mo96127p(C33180f.C33183c.f80578D);
            this.f80456n = l0Var.mo96117f();
            this.f80450h = l0Var.mo96127p(C33180f.C33183c.f80591j);
            this.f80457o = l0Var.mo96127p(C33180f.C33183c.f80594m);
            this.f80458p = l0Var.mo96114b(C33180f.C33183c.f80597p);
            this.f80459q = l0Var.mo96114b(C33180f.C33183c.f80602u);
            this.f80460r = l0Var.mo96114b(C33180f.C33183c.f80601t);
            this.f80463u = l0Var.mo96113a(C33180f.C33183c.f80596o);
            this.f80464v = l0Var.mo96113a(C33180f.C33183c.f80595n);
            this.f80465w = l0Var.mo96113a(C33180f.C33183c.f80598q);
            this.f80466x = l0Var.mo96113a(C33180f.C33183c.f80599r);
            this.f80467y = l0Var.mo96113a(C33180f.C33183c.f80600s);
            this.f80462t = l0Var.mo96121j(C33180f.C33183c.f80605x);
            this.f80461s = l0Var.mo96116e();
            this.f80468z = l0Var.mo96128q();
        }
    }

    @SafeParcelable.C40813b
    public RemoteMessage(@SafeParcelable.C40816e(mo134492id = 2) Bundle bundle) {
        this.f80438a = bundle;
    }

    @C0363p0
    @C40858y
    /* renamed from: A0 */
    public byte[] mo95963A0() {
        return this.f80438a.getByteArray("rawData");
    }

    @C40473a
    /* renamed from: A1 */
    public Intent mo95964A1() {
        Intent intent = new Intent();
        intent.putExtras(this.f80438a);
        return intent;
    }

    @C0363p0
    /* renamed from: C0 */
    public String mo95965C0() {
        return this.f80438a.getString(C33180f.C33184d.f80623p);
    }

    /* renamed from: K0 */
    public long mo95966K0() {
        Object obj = this.f80438a.get(C33180f.C33184d.f80617j);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid sent time: ");
            sb.append(obj);
            return 0;
        }
    }

    @C0363p0
    /* renamed from: M */
    public String mo95967M() {
        return this.f80438a.getString(C33180f.C33184d.f80612e);
    }

    @C0363p0
    /* renamed from: N0 */
    public String mo95968N0() {
        return this.f80438a.getString(C33180f.C33184d.f80614g);
    }

    @C0359n0
    /* renamed from: Q */
    public Map<String, String> mo95969Q() {
        if (this.f80439b == null) {
            this.f80439b = C33180f.C33184d.m133857a(this.f80438a);
        }
        return this.f80439b;
    }

    @C0363p0
    /* renamed from: W */
    public String mo95970W() {
        return this.f80438a.getString("from");
    }

    @C0363p0
    /* renamed from: X */
    public String mo95971X() {
        String string = this.f80438a.getString(C33180f.C33184d.f80615h);
        if (string == null) {
            return this.f80438a.getString("message_id");
        }
        return string;
    }

    /* renamed from: e0 */
    public final int mo95972e0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if (C33866p.f82157i.equals(str)) {
            return 2;
        }
        return 0;
    }

    @C0363p0
    /* renamed from: f0 */
    public String mo95973f0() {
        return this.f80438a.getString(C33180f.C33184d.f80611d);
    }

    /* renamed from: j1 */
    public int mo95974j1() {
        Object obj = this.f80438a.get(C33180f.C33184d.f80616i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid TTL: ");
            sb.append(obj);
            return 0;
        }
    }

    /* renamed from: k1 */
    public void mo95975k1(Intent intent) {
        intent.putExtras(this.f80438a);
    }

    @C0363p0
    /* renamed from: n0 */
    public C33158d mo95976n0() {
        if (this.f80440c == null && C33209l0.m133960v(this.f80438a)) {
            this.f80440c = new C33158d(new C33209l0(this.f80438a));
        }
        return this.f80440c;
    }

    /* renamed from: p0 */
    public int mo95977p0() {
        String string = this.f80438a.getString(C33180f.C33184d.f80618k);
        if (string == null) {
            string = this.f80438a.getString(C33180f.C33184d.f80620m);
        }
        return mo95972e0(string);
    }

    /* renamed from: t0 */
    public int mo95978t0() {
        String string = this.f80438a.getString(C33180f.C33184d.f80619l);
        if (string == null) {
            if ("1".equals(this.f80438a.getString(C33180f.C33184d.f80621n))) {
                return 2;
            }
            string = this.f80438a.getString(C33180f.C33184d.f80620m);
        }
        return mo95972e0(string);
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        C33243t0.m134078c(this, parcel, i);
    }
}
