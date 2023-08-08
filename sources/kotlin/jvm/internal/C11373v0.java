package kotlin.jvm.internal;

import java.util.List;
import kotlin.C11665v0;
import kotlin.collections.C10976s;
import kotlin.reflect.C11520r;
import kotlin.reflect.C11522s;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.4")
@C11363r0({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* renamed from: kotlin.jvm.internal.v0 */
public final class C11373v0 implements C11522s {
    @C12579k

    /* renamed from: f */
    public static final C11374a f28514f = new C11374a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: a */
    public final Object f28515a;
    @C12579k

    /* renamed from: b */
    public final String f28516b;
    @C12579k

    /* renamed from: c */
    public final KVariance f28517c;

    /* renamed from: d */
    public final boolean f28518d;
    @C12580l

    /* renamed from: e */
    public volatile List<? extends C11520r> f28519e;

    /* renamed from: kotlin.jvm.internal.v0$a */
    public static final class C11374a {

        /* renamed from: kotlin.jvm.internal.v0$a$a */
        public /* synthetic */ class C11375a {
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C11373v0.C11374a.C11375a.<clinit>():void");
            }
        }

        public /* synthetic */ C11374a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final String mo22875a(@C12579k C11522s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C11375a.$EnumSwitchMapping$0[sVar.mo22871h().ordinal()];
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
            sb.append(sVar.getName());
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        public C11374a() {
        }
    }

    public C11373v0(@C12580l Object obj, @C12579k String str, @C12579k KVariance kVariance, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(kVariance, "variance");
        this.f28515a = obj;
        this.f28516b = str;
        this.f28517c = kVariance;
        this.f28518d = z;
    }

    /* renamed from: e */
    public static /* synthetic */ void m43717e() {
    }

    /* renamed from: d */
    public boolean mo22867d() {
        return this.f28518d;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11373v0) {
            C11373v0 v0Var = (C11373v0) obj;
            return Intrinsics.areEqual(this.f28515a, v0Var.f28515a) && Intrinsics.areEqual((Object) getName(), (Object) v0Var.getName());
        }
    }

    @C12579k
    public String getName() {
        return this.f28516b;
    }

    @C12579k
    public List<C11520r> getUpperBounds() {
        List<? extends C11520r> list = this.f28519e;
        if (list != null) {
            return list;
        }
        List<? extends C11520r> k = C10976s.m41419k(C11342l0.m43557n(Object.class));
        this.f28519e = k;
        return k;
    }

    @C12579k
    /* renamed from: h */
    public KVariance mo22871h() {
        return this.f28517c;
    }

    public int hashCode() {
        Object obj = this.f28515a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    /* renamed from: j */
    public final void mo22873j(@C12579k List<? extends C11520r> list) {
        Intrinsics.checkNotNullParameter(list, "upperBounds");
        if (this.f28519e == null) {
            this.f28519e = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @C12579k
    public String toString() {
        return f28514f.mo22875a(this);
    }
}
