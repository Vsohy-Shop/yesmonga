package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1869c;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.signin.C30974a;
import com.google.errorprone.annotations.C32488a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@C40473a
@C40974d0
/* renamed from: com.google.android.gms.common.internal.f */
public final class C40756f {
    @Nullable

    /* renamed from: a */
    public final Account f103846a;

    /* renamed from: b */
    public final Set f103847b;

    /* renamed from: c */
    public final Set f103848c;

    /* renamed from: d */
    public final Map f103849d;

    /* renamed from: e */
    public final int f103850e;
    @Nullable

    /* renamed from: f */
    public final View f103851f;

    /* renamed from: g */
    public final String f103852g;

    /* renamed from: h */
    public final String f103853h;

    /* renamed from: i */
    public final C30974a f103854i;

    /* renamed from: j */
    public Integer f103855j;

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.f$a */
    public static final class C40757a {
        @Nullable

        /* renamed from: a */
        public Account f103856a;

        /* renamed from: b */
        public C1869c f103857b;

        /* renamed from: c */
        public String f103858c;

        /* renamed from: d */
        public String f103859d;

        /* renamed from: e */
        public C30974a f103860e = C30974a.f74207x;

        @C40473a
        @C0359n0
        /* renamed from: a */
        public C40756f mo134395a() {
            return new C40756f(this.f103856a, this.f103857b, (Map) null, 0, (View) null, this.f103858c, this.f103859d, this.f103860e, false);
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: b */
        public C40757a mo134396b(@C0359n0 String str) {
            this.f103858c = str;
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: c */
        public final C40757a mo134397c(@C0359n0 Collection collection) {
            if (this.f103857b == null) {
                this.f103857b = new C1869c();
            }
            this.f103857b.addAll(collection);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: d */
        public final C40757a mo134398d(@Nullable Account account) {
            this.f103856a = account;
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: e */
        public final C40757a mo134399e(@C0359n0 String str) {
            this.f103859d = str;
            return this;
        }
    }

    @C40473a
    public C40756f(@C0359n0 Account account, @C0359n0 Set<Scope> set, @C0359n0 Map<C40477a<?>, C40770i0> map, int i, @Nullable View view, @C0359n0 String str, @C0359n0 String str2, @Nullable C30974a aVar) {
        this(account, set, map, i, view, str, str2, aVar, false);
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static C40756f m165860a(@C0359n0 Context context) {
        return new C40507i.C40508a(context).mo133781p();
    }

    @C0363p0
    @C40473a
    /* renamed from: b */
    public Account mo134381b() {
        return this.f103846a;
    }

    @C0363p0
    @C40473a
    @Deprecated
    /* renamed from: c */
    public String mo134382c() {
        Account account = this.f103846a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public Account mo134383d() {
        Account account = this.f103846a;
        return account != null ? account : new Account("<<default account>>", C40733b.f103787a);
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public Set<Scope> mo134384e() {
        return this.f103848c;
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public Set<Scope> mo134385f(@C0359n0 C40477a<?> aVar) {
        C40770i0 i0Var = (C40770i0) this.f103849d.get(aVar);
        if (i0Var == null || i0Var.f103881a.isEmpty()) {
            return this.f103847b;
        }
        HashSet hashSet = new HashSet(this.f103847b);
        hashSet.addAll(i0Var.f103881a);
        return hashSet;
    }

    @C40473a
    /* renamed from: g */
    public int mo134386g() {
        return this.f103850e;
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public String mo134387h() {
        return this.f103852g;
    }

    @C40473a
    @C0359n0
    /* renamed from: i */
    public Set<Scope> mo134388i() {
        return this.f103847b;
    }

    @C0363p0
    @C40473a
    /* renamed from: j */
    public View mo134389j() {
        return this.f103851f;
    }

    @C0359n0
    /* renamed from: k */
    public final C30974a mo134390k() {
        return this.f103854i;
    }

    @C0363p0
    /* renamed from: l */
    public final Integer mo134391l() {
        return this.f103855j;
    }

    @C0363p0
    /* renamed from: m */
    public final String mo134392m() {
        return this.f103853h;
    }

    @C0359n0
    /* renamed from: n */
    public final Map mo134393n() {
        return this.f103849d;
    }

    /* renamed from: o */
    public final void mo134394o(@C0359n0 Integer num) {
        this.f103855j = num;
    }

    public C40756f(@Nullable Account account, @C0359n0 Set set, @C0359n0 Map map, int i, @Nullable View view, @C0359n0 String str, @C0359n0 String str2, @Nullable C30974a aVar, boolean z) {
        this.f103846a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f103847b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f103849d = map;
        this.f103851f = view;
        this.f103850e = i;
        this.f103852g = str;
        this.f103853h = str2;
        this.f103854i = aVar == null ? C30974a.f74207x : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C40770i0 i0Var : map.values()) {
            hashSet.addAll(i0Var.f103881a);
        }
        this.f103848c = Collections.unmodifiableSet(hashSet);
    }
}
