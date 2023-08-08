package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C11665v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11283a;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11498g;
import kotlin.reflect.C11520r;
import kotlin.reflect.C11523t;
import kotlinx.serialization.internal.C12302q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.4")
public final class TypeReference implements C11520r {
    @C12579k

    /* renamed from: e */
    public static final C11317a f28421e = new C11317a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f28422f = 1;

    /* renamed from: g */
    public static final int f28423g = 2;

    /* renamed from: v */
    public static final int f28424v = 4;
    @C12579k

    /* renamed from: a */
    public final C11498g f28425a;
    @C12579k

    /* renamed from: b */
    public final List<C11523t> f28426b;
    @C12580l

    /* renamed from: c */
    public final C11520r f28427c;

    /* renamed from: d */
    public final int f28428d;

    /* renamed from: kotlin.jvm.internal.TypeReference$a */
    public static final class C11317a {
        public /* synthetic */ C11317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11317a() {
        }
    }

    /* renamed from: kotlin.jvm.internal.TypeReference$b */
    public /* synthetic */ class C11318b {
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.TypeReference.C11318b.<clinit>():void");
        }
    }

    @C11665v0(version = "1.6")
    public TypeReference(@C12579k C11498g gVar, @C12579k List<C11523t> list, @C12580l C11520r rVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "classifier");
        Intrinsics.checkNotNullParameter(list, "arguments");
        this.f28425a = gVar;
        this.f28426b = list;
        this.f28427c = rVar;
        this.f28428d = i;
    }

    @C11665v0(version = "1.6")
    /* renamed from: B */
    public static /* synthetic */ void m43466B() {
    }

    @C11665v0(version = "1.6")
    /* renamed from: z */
    public static /* synthetic */ void m43468z() {
    }

    @C12580l
    /* renamed from: A */
    public final C11520r mo22753A() {
        return this.f28427c;
    }

    /* renamed from: e */
    public boolean mo22754e() {
        return (this.f28428d & 1) != 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (!Intrinsics.areEqual((Object) mo22759m(), (Object) typeReference.mo22759m()) || !Intrinsics.areEqual((Object) getArguments(), (Object) typeReference.getArguments()) || !Intrinsics.areEqual((Object) this.f28427c, (Object) typeReference.f28427c) || this.f28428d != typeReference.f28428d) {
                return false;
            }
            return true;
        }
        return false;
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C12579k
    public List<C11523t> getArguments() {
        return this.f28426b;
    }

    /* renamed from: h */
    public final String mo22757h(C11523t tVar) {
        TypeReference typeReference;
        String str;
        if (tVar.mo23144h() == null) {
            return "*";
        }
        C11520r g = tVar.mo23143g();
        if (g instanceof TypeReference) {
            typeReference = (TypeReference) g;
        } else {
            typeReference = null;
        }
        if (typeReference == null || (str = typeReference.mo22760o(true)) == null) {
            str = String.valueOf(tVar.mo23143g());
        }
        int i = C11318b.$EnumSwitchMapping$0[tVar.mo23144h().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "in " + str;
        } else if (i == 3) {
            return "out " + str;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public int hashCode() {
        return (((mo22759m().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.f28428d);
    }

    @C12579k
    /* renamed from: m */
    public C11498g mo22759m() {
        return this.f28425a;
    }

    /* renamed from: o */
    public final String mo22760o(boolean z) {
        C11494d dVar;
        String str;
        String str2;
        C11498g m = mo22759m();
        Class cls = null;
        if (m instanceof C11494d) {
            dVar = (C11494d) m;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            cls = C11283a.m43409e(dVar);
        }
        if (cls == null) {
            str = mo22759m().toString();
        } else if ((this.f28428d & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            str = mo22762x(cls);
        } else if (!z || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            C11498g m2 = mo22759m();
            Intrinsics.checkNotNull(m2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            str = C11283a.m43411g((C11494d) m2).getName();
        }
        String str3 = "";
        if (getArguments().isEmpty()) {
            str2 = str3;
        } else {
            str2 = CollectionsKt___CollectionsKt.m40639h3(getArguments(), ", ", "<", ">", 0, (CharSequence) null, new TypeReference$asString$args$1(this), 24, (Object) null);
        }
        if (mo22754e()) {
            str3 = "?";
        }
        String str4 = str + str2 + str3;
        C11520r rVar = this.f28427c;
        if (!(rVar instanceof TypeReference)) {
            return str4;
        }
        String o = ((TypeReference) rVar).mo22760o(true);
        if (Intrinsics.areEqual((Object) o, (Object) str4)) {
            return str4;
        }
        if (Intrinsics.areEqual((Object) o, (Object) str4 + '?')) {
            return str4 + '!';
        }
        return '(' + str4 + ".." + o + ')';
    }

    @C12579k
    public String toString() {
        return mo22760o(false) + C11342l0.f28466b;
    }

    /* renamed from: x */
    public final String mo22762x(Class<?> cls) {
        if (Intrinsics.areEqual((Object) cls, (Object) boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) long[].class)) {
            return "kotlin.LongArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) double[].class)) {
            return "kotlin.DoubleArray";
        }
        return C12302q.f30101a;
    }

    /* renamed from: y */
    public final int mo22763y() {
        return this.f28428d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TypeReference(@C12579k C11498g gVar, @C12579k List<C11523t> list, boolean z) {
        this(gVar, list, (C11520r) null, z ? 1 : 0);
        Intrinsics.checkNotNullParameter(gVar, "classifier");
        Intrinsics.checkNotNullParameter(list, "arguments");
    }
}
