package kotlin.reflect;

import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
/* renamed from: kotlin.reflect.t */
public final class C11523t {
    @C12579k

    /* renamed from: c */
    public static final C11524a f28655c = new C11524a((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: d */
    public static final C11523t f28656d = new C11523t((KVariance) null, (C11520r) null);
    @C12580l

    /* renamed from: a */
    public final KVariance f28657a;
    @C12580l

    /* renamed from: b */
    public final C11520r f28658b;

    /* renamed from: kotlin.reflect.t$a */
    public static final class C11524a {
        public /* synthetic */ C11524a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11532s0
        /* renamed from: d */
        public static /* synthetic */ void m44570d() {
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C11523t mo23147a(@C12579k C11520r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "type");
            return new C11523t(KVariance.IN, rVar);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C11523t mo23148b(@C12579k C11520r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "type");
            return new C11523t(KVariance.OUT, rVar);
        }

        @C12579k
        /* renamed from: c */
        public final C11523t mo23149c() {
            return C11523t.f28656d;
        }

        @C12579k
        @C11384m
        /* renamed from: e */
        public final C11523t mo23150e(@C12579k C11520r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "type");
            return new C11523t(KVariance.INVARIANT, rVar);
        }

        public C11524a() {
        }
    }

    /* renamed from: kotlin.reflect.t$b */
    public /* synthetic */ class C11525b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.C11523t.C11525b.<clinit>():void");
        }
    }

    public C11523t(@C12580l KVariance kVariance, @C12580l C11520r rVar) {
        boolean z;
        boolean z2;
        String str;
        this.f28657a = kVariance;
        this.f28658b = rVar;
        boolean z3 = true;
        if (kVariance == null) {
            z = true;
        } else {
            z = false;
        }
        if (rVar == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z != z2 ? false : z3)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final C11523t m44561c(@C12579k C11520r rVar) {
        return f28655c.mo23147a(rVar);
    }

    /* renamed from: e */
    public static /* synthetic */ C11523t m44562e(C11523t tVar, KVariance kVariance, C11520r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVariance = tVar.f28657a;
        }
        if ((i & 2) != 0) {
            rVar = tVar.f28658b;
        }
        return tVar.mo23141d(kVariance, rVar);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C11523t m44563f(@C12579k C11520r rVar) {
        return f28655c.mo23148b(rVar);
    }

    @C12579k
    @C11384m
    /* renamed from: i */
    public static final C11523t m44564i(@C12579k C11520r rVar) {
        return f28655c.mo23150e(rVar);
    }

    @C12580l
    /* renamed from: a */
    public final KVariance mo23139a() {
        return this.f28657a;
    }

    @C12580l
    /* renamed from: b */
    public final C11520r mo23140b() {
        return this.f28658b;
    }

    @C12579k
    /* renamed from: d */
    public final C11523t mo23141d(@C12580l KVariance kVariance, @C12580l C11520r rVar) {
        return new C11523t(kVariance, rVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11523t)) {
            return false;
        }
        C11523t tVar = (C11523t) obj;
        return this.f28657a == tVar.f28657a && Intrinsics.areEqual((Object) this.f28658b, (Object) tVar.f28658b);
    }

    @C12580l
    /* renamed from: g */
    public final C11520r mo23143g() {
        return this.f28658b;
    }

    @C12580l
    /* renamed from: h */
    public final KVariance mo23144h() {
        return this.f28657a;
    }

    public int hashCode() {
        KVariance kVariance = this.f28657a;
        int i = 0;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        C11520r rVar = this.f28658b;
        if (rVar != null) {
            i = rVar.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        int i;
        KVariance kVariance = this.f28657a;
        if (kVariance == null) {
            i = -1;
        } else {
            i = C11525b.$EnumSwitchMapping$0[kVariance.ordinal()];
        }
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f28658b);
        }
        if (i == 2) {
            return "in " + this.f28658b;
        } else if (i == 3) {
            return "out " + this.f28658b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
