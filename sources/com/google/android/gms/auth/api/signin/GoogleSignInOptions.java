package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.auth.api.signin.internal.C40423a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.C40928r;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40733b;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;
import com.google.errorprone.annotations.C32488a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.C40812a(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements C40477a.C40481d.C40487f, ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C40422f();
    @C0359n0
    @C40974d0

    /* renamed from: E0 */
    public static final Scope f103007E0 = new Scope(C40928r.f104102c);
    @C0359n0
    @C40974d0

    /* renamed from: F0 */
    public static final Scope f103008F0;
    @C0359n0
    @C40974d0

    /* renamed from: G0 */
    public static final Scope f103009G0 = new Scope(C40928r.f104107h);

    /* renamed from: H0 */
    public static Comparator f103010H0 = new C40420d();
    @C0359n0

    /* renamed from: X */
    public static final GoogleSignInOptions f103011X;
    @C0359n0
    @C40974d0

    /* renamed from: Y */
    public static final Scope f103012Y = new Scope(C40928r.f104100a);
    @C0359n0
    @C40974d0

    /* renamed from: Z */
    public static final Scope f103013Z = new Scope("email");
    @C0359n0

    /* renamed from: z */
    public static final GoogleSignInOptions f103014z;
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103015a;
    @SafeParcelable.C40814c(getter = "getScopes", mo134489id = 2)

    /* renamed from: b */
    public final ArrayList f103016b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAccount", mo134489id = 3)

    /* renamed from: c */
    public Account f103017c;
    @SafeParcelable.C40814c(getter = "isIdTokenRequested", mo134489id = 4)

    /* renamed from: d */
    public boolean f103018d;
    @SafeParcelable.C40814c(getter = "isServerAuthCodeRequested", mo134489id = 5)

    /* renamed from: e */
    public final boolean f103019e;
    @SafeParcelable.C40814c(getter = "isForceCodeForRefreshToken", mo134489id = 6)

    /* renamed from: f */
    public final boolean f103020f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getServerClientId", mo134489id = 7)

    /* renamed from: g */
    public String f103021g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getHostedDomain", mo134489id = 8)

    /* renamed from: v */
    public String f103022v;
    @SafeParcelable.C40814c(getter = "getExtensions", mo134489id = 9)

    /* renamed from: w */
    public ArrayList f103023w;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLogSessionId", mo134489id = 10)

    /* renamed from: x */
    public String f103024x;

    /* renamed from: y */
    public Map f103025y;

    static {
        Scope scope = new Scope(C40928r.f104108i);
        f103008F0 = scope;
        C40416a aVar = new C40416a();
        aVar.mo133486d();
        aVar.mo133488f();
        f103014z = aVar.mo133484b();
        C40416a aVar2 = new C40416a();
        aVar2.mo133489g(scope, new Scope[0]);
        f103011X = aVar2.mo133484b();
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C40421e eVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    @C0363p0
    /* renamed from: A0 */
    public static GoogleSignInOptions m164530A0(@C0363p0 String str) throws JSONException {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, C40733b.f103787a);
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, (Map) new HashMap(), (String) null);
    }

    /* renamed from: Y1 */
    public static Map m164539Y1(@C0363p0 List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo133505M()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo133470M() {
        return this.f103023w;
    }

    @C0363p0
    @C40473a
    /* renamed from: Q */
    public String mo133471Q() {
        return this.f103024x;
    }

    @C0359n0
    /* renamed from: W */
    public Scope[] mo133472W() {
        ArrayList arrayList = this.f103016b;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @C40473a
    @C0359n0
    /* renamed from: X */
    public ArrayList<Scope> mo133473X() {
        return new ArrayList<>(this.f103016b);
    }

    @C0363p0
    @C40473a
    /* renamed from: e0 */
    public String mo133474e0() {
        return this.f103021g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo133482y()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.C0363p0 java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f103023w     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f103023w     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f103016b     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo133473X()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f103016b     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo133473X()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f103017c     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo133482y()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo133482y()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f103021g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo133474e0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f103021g     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo133474e0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f103020f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo133476f0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f103018d     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo133479n0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f103019e     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo133480p0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f103024x     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo133471Q()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @C40473a
    /* renamed from: f0 */
    public boolean mo133476f0() {
        return this.f103020f;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f103016b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).mo133640M());
        }
        Collections.sort(arrayList);
        C40423a aVar = new C40423a();
        aVar.mo133507a(arrayList);
        aVar.mo133507a(this.f103017c);
        aVar.mo133507a(this.f103021g);
        aVar.mo133509c(this.f103020f);
        aVar.mo133509c(this.f103018d);
        aVar.mo133509c(this.f103019e);
        aVar.mo133507a(this.f103024x);
        return aVar.mo133508b();
    }

    @C0359n0
    /* renamed from: j1 */
    public final String mo133478j1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f103016b, f103010H0);
            Iterator it = this.f103016b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).mo133640M());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f103017c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f103018d);
            jSONObject.put("forceCodeForRefreshToken", this.f103020f);
            jSONObject.put("serverAuthRequested", this.f103019e);
            if (!TextUtils.isEmpty(this.f103021g)) {
                jSONObject.put("serverClientId", this.f103021g);
            }
            if (!TextUtils.isEmpty(this.f103022v)) {
                jSONObject.put("hostedDomain", this.f103022v);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @C40473a
    /* renamed from: n0 */
    public boolean mo133479n0() {
        return this.f103018d;
    }

    @C40473a
    /* renamed from: p0 */
    public boolean mo133480p0() {
        return this.f103019e;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103015a);
        C40820a.m166117d0(parcel, 2, mo133473X(), false);
        C40820a.m166102S(parcel, 3, mo133482y(), i, false);
        C40820a.m166122g(parcel, 4, mo133479n0());
        C40820a.m166122g(parcel, 5, mo133480p0());
        C40820a.m166122g(parcel, 6, mo133476f0());
        C40820a.m166108Y(parcel, 7, mo133474e0(), false);
        C40820a.m166108Y(parcel, 8, this.f103022v, false);
        C40820a.m166117d0(parcel, 9, mo133470M(), false);
        C40820a.m166108Y(parcel, 10, mo133471Q(), false);
        C40820a.m166112b(parcel, a);
    }

    @C0363p0
    @C40473a
    /* renamed from: y */
    public Account mo133482y() {
        return this.f103017c;
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C40416a {

        /* renamed from: a */
        public Set f103026a = new HashSet();

        /* renamed from: b */
        public boolean f103027b;

        /* renamed from: c */
        public boolean f103028c;

        /* renamed from: d */
        public boolean f103029d;
        @C0363p0

        /* renamed from: e */
        public String f103030e;
        @C0363p0

        /* renamed from: f */
        public Account f103031f;
        @C0363p0

        /* renamed from: g */
        public String f103032g;

        /* renamed from: h */
        public Map f103033h = new HashMap();
        @C0363p0

        /* renamed from: i */
        public String f103034i;

        public C40416a() {
        }

        @C0359n0
        @C32488a
        /* renamed from: a */
        public C40416a mo133483a(@C0359n0 C40417a aVar) {
            if (!this.f103033h.containsKey(Integer.valueOf(aVar.mo133497b()))) {
                List<Scope> c = aVar.mo133498c();
                if (c != null) {
                    this.f103026a.addAll(c);
                }
                this.f103033h.put(Integer.valueOf(aVar.mo133497b()), new GoogleSignInOptionsExtensionParcelable(aVar));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        @C0359n0
        /* renamed from: b */
        public GoogleSignInOptions mo133484b() {
            if (this.f103026a.contains(GoogleSignInOptions.f103009G0)) {
                Set set = this.f103026a;
                Scope scope = GoogleSignInOptions.f103008F0;
                if (set.contains(scope)) {
                    this.f103026a.remove(scope);
                }
            }
            if (this.f103029d && (this.f103031f == null || !this.f103026a.isEmpty())) {
                mo133486d();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f103026a), this.f103031f, this.f103029d, this.f103027b, this.f103028c, this.f103030e, this.f103032g, this.f103033h, this.f103034i, (C40421e) null);
        }

        @C0359n0
        @C32488a
        /* renamed from: c */
        public C40416a mo133485c() {
            this.f103026a.add(GoogleSignInOptions.f103013Z);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: d */
        public C40416a mo133486d() {
            this.f103026a.add(GoogleSignInOptions.f103007E0);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: e */
        public C40416a mo133487e(@C0359n0 String str) {
            this.f103029d = true;
            mo133495m(str);
            this.f103030e = str;
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: f */
        public C40416a mo133488f() {
            this.f103026a.add(GoogleSignInOptions.f103012Y);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: g */
        public C40416a mo133489g(@C0359n0 Scope scope, @C0359n0 Scope... scopeArr) {
            this.f103026a.add(scope);
            this.f103026a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C40416a mo133490h(@C0359n0 String str) {
            mo133491i(str, false);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: i */
        public C40416a mo133491i(@C0359n0 String str, boolean z) {
            this.f103027b = true;
            mo133495m(str);
            this.f103030e = str;
            this.f103028c = z;
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: j */
        public C40416a mo133492j(@C0359n0 String str) {
            this.f103031f = new Account(C40843u.m166198h(str), C40733b.f103787a);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: k */
        public C40416a mo133493k(@C0359n0 String str) {
            this.f103032g = C40843u.m166198h(str);
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: l */
        public C40416a mo133494l(@C0359n0 String str) {
            this.f103034i = str;
            return this;
        }

        /* renamed from: m */
        public final String mo133495m(String str) {
            C40843u.m166198h(str);
            String str2 = this.f103030e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            C40843u.m166192b(z, "two different server client ids provided");
            return str;
        }

        public C40416a(@C0359n0 GoogleSignInOptions googleSignInOptions) {
            C40843u.m166202l(googleSignInOptions);
            this.f103026a = new HashSet(googleSignInOptions.f103016b);
            this.f103027b = googleSignInOptions.f103019e;
            this.f103028c = googleSignInOptions.f103020f;
            this.f103029d = googleSignInOptions.f103018d;
            this.f103030e = googleSignInOptions.f103021g;
            this.f103031f = googleSignInOptions.f103017c;
            this.f103032g = googleSignInOptions.f103022v;
            this.f103033h = GoogleSignInOptions.m164539Y1(googleSignInOptions.f103023w);
            this.f103034i = googleSignInOptions.f103024x;
        }
    }

    @SafeParcelable.C40813b
    public GoogleSignInOptions(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) ArrayList arrayList, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) Account account, @SafeParcelable.C40816e(mo134492id = 4) boolean z, @SafeParcelable.C40816e(mo134492id = 5) boolean z2, @SafeParcelable.C40816e(mo134492id = 6) boolean z3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str2, @SafeParcelable.C40816e(mo134492id = 9) ArrayList arrayList2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m164539Y1(arrayList2), str3);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, @C0363p0 Account account, boolean z, boolean z2, boolean z3, @C0363p0 String str, @C0363p0 String str2, Map map, @C0363p0 String str3) {
        this.f103015a = i;
        this.f103016b = arrayList;
        this.f103017c = account;
        this.f103018d = z;
        this.f103019e = z2;
        this.f103020f = z3;
        this.f103021g = str;
        this.f103022v = str2;
        this.f103023w = new ArrayList(map.values());
        this.f103025y = map;
        this.f103024x = str3;
    }
}
