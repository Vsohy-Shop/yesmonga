package androidx.navigation;

import androidx.annotation.C0319a;
import androidx.annotation.C0322b;
import androidx.annotation.C0329d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.k0 */
public final class C19761k0 {

    /* renamed from: a */
    public final boolean f50585a;

    /* renamed from: b */
    public final boolean f50586b;
    @C0329d0

    /* renamed from: c */
    public final int f50587c;

    /* renamed from: d */
    public final boolean f50588d;

    /* renamed from: e */
    public final boolean f50589e;

    /* renamed from: f */
    public final int f50590f;

    /* renamed from: g */
    public final int f50591g;

    /* renamed from: h */
    public final int f50592h;

    /* renamed from: i */
    public final int f50593i;
    @C12580l

    /* renamed from: j */
    public String f50594j;

    /* renamed from: androidx.navigation.k0$a */
    public static final class C19762a {

        /* renamed from: a */
        public boolean f50595a;

        /* renamed from: b */
        public boolean f50596b;
        @C0329d0

        /* renamed from: c */
        public int f50597c = -1;
        @C12580l

        /* renamed from: d */
        public String f50598d;

        /* renamed from: e */
        public boolean f50599e;

        /* renamed from: f */
        public boolean f50600f;
        @C0322b
        @C0319a

        /* renamed from: g */
        public int f50601g = -1;
        @C0322b
        @C0319a

        /* renamed from: h */
        public int f50602h = -1;
        @C0322b
        @C0319a

        /* renamed from: i */
        public int f50603i = -1;
        @C0322b
        @C0319a

        /* renamed from: j */
        public int f50604j = -1;

        /* renamed from: k */
        public static /* synthetic */ C19762a m91893k(C19762a aVar, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return aVar.mo58470h(i, z, z2);
        }

        /* renamed from: l */
        public static /* synthetic */ C19762a m91894l(C19762a aVar, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return aVar.mo58472j(str, z, z2);
        }

        @C12579k
        /* renamed from: a */
        public final C19761k0 mo58463a() {
            String str = this.f50598d;
            if (str != null) {
                return new C19761k0(this.f50595a, this.f50596b, str, this.f50599e, this.f50600f, this.f50601g, this.f50602h, this.f50603i, this.f50604j);
            }
            return new C19761k0(this.f50595a, this.f50596b, this.f50597c, this.f50599e, this.f50600f, this.f50601g, this.f50602h, this.f50603i, this.f50604j);
        }

        @C12579k
        /* renamed from: b */
        public final C19762a mo58464b(@C0322b @C0319a int i) {
            this.f50601g = i;
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final C19762a mo58465c(@C0322b @C0319a int i) {
            this.f50602h = i;
            return this;
        }

        @C12579k
        /* renamed from: d */
        public final C19762a mo58466d(boolean z) {
            this.f50595a = z;
            return this;
        }

        @C12579k
        /* renamed from: e */
        public final C19762a mo58467e(@C0322b @C0319a int i) {
            this.f50603i = i;
            return this;
        }

        @C12579k
        /* renamed from: f */
        public final C19762a mo58468f(@C0322b @C0319a int i) {
            this.f50604j = i;
            return this;
        }

        @C12579k
        @C11315i
        /* renamed from: g */
        public final C19762a mo58469g(@C0329d0 int i, boolean z) {
            return m91893k(this, i, z, false, 4, (Object) null);
        }

        @C12579k
        @C11315i
        /* renamed from: h */
        public final C19762a mo58470h(@C0329d0 int i, boolean z, boolean z2) {
            this.f50597c = i;
            this.f50598d = null;
            this.f50599e = z;
            this.f50600f = z2;
            return this;
        }

        @C12579k
        @C11315i
        /* renamed from: i */
        public final C19762a mo58471i(@C12580l String str, boolean z) {
            return m91894l(this, str, z, false, 4, (Object) null);
        }

        @C12579k
        @C11315i
        /* renamed from: j */
        public final C19762a mo58472j(@C12580l String str, boolean z, boolean z2) {
            this.f50598d = str;
            this.f50597c = -1;
            this.f50599e = z;
            this.f50600f = z2;
            return this;
        }

        @C12579k
        /* renamed from: m */
        public final C19762a mo58473m(boolean z) {
            this.f50596b = z;
            return this;
        }
    }

    public C19761k0(boolean z, boolean z2, @C0329d0 int i, boolean z3, boolean z4, @C0322b @C0319a int i2, @C0322b @C0319a int i3, @C0322b @C0319a int i4, @C0322b @C0319a int i5) {
        this.f50585a = z;
        this.f50586b = z2;
        this.f50587c = i;
        this.f50588d = z3;
        this.f50589e = z4;
        this.f50590f = i2;
        this.f50591g = i3;
        this.f50592h = i4;
        this.f50593i = i5;
    }

    @C0322b
    @C0319a
    /* renamed from: a */
    public final int mo58450a() {
        return this.f50590f;
    }

    @C0322b
    @C0319a
    /* renamed from: b */
    public final int mo58451b() {
        return this.f50591g;
    }

    @C0322b
    @C0319a
    /* renamed from: c */
    public final int mo58452c() {
        return this.f50592h;
    }

    @C0322b
    @C0319a
    /* renamed from: d */
    public final int mo58453d() {
        return this.f50593i;
    }

    @C0329d0
    @C11395k(message = "Use popUpToId instead.", replaceWith = @C11587t0(expression = "popUpToId", imports = {}))
    /* renamed from: e */
    public final int mo58454e() {
        return this.f50587c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C19761k0.class, (Object) obj.getClass())) {
            return false;
        }
        C19761k0 k0Var = (C19761k0) obj;
        if (this.f50585a == k0Var.f50585a && this.f50586b == k0Var.f50586b && this.f50587c == k0Var.f50587c && Intrinsics.areEqual((Object) this.f50594j, (Object) k0Var.f50594j) && this.f50588d == k0Var.f50588d && this.f50589e == k0Var.f50589e && this.f50590f == k0Var.f50590f && this.f50591g == k0Var.f50591g && this.f50592h == k0Var.f50592h && this.f50593i == k0Var.f50593i) {
            return true;
        }
        return false;
    }

    @C0329d0
    /* renamed from: f */
    public final int mo58456f() {
        return this.f50587c;
    }

    @C12580l
    /* renamed from: g */
    public final String mo58457g() {
        return this.f50594j;
    }

    /* renamed from: h */
    public final boolean mo58458h() {
        return this.f50588d;
    }

    public int hashCode() {
        int i;
        int i2 = (((((mo58460i() ? 1 : 0) * true) + (mo58462k() ? 1 : 0)) * 31) + this.f50587c) * 31;
        String str = this.f50594j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((i2 + i) * 31) + (mo58458h() ? 1 : 0)) * 31) + (mo58461j() ? 1 : 0)) * 31) + this.f50590f) * 31) + this.f50591g) * 31) + this.f50592h) * 31) + this.f50593i;
    }

    /* renamed from: i */
    public final boolean mo58460i() {
        return this.f50585a;
    }

    /* renamed from: j */
    public final boolean mo58461j() {
        return this.f50589e;
    }

    /* renamed from: k */
    public final boolean mo58462k() {
        return this.f50586b;
    }

    public C19761k0(boolean z, boolean z2, @C12580l String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, NavDestination.f50441x.mo58258a(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.f50594j = str;
    }
}
