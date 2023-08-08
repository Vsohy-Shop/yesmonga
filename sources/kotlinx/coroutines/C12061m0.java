package kotlinx.coroutines;

import kotlin.C11532s0;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@IgnoreJRERequirement
@C11532s0
/* renamed from: kotlinx.coroutines.m0 */
public final class C12061m0 extends C11043a implements C11726c3<String> {
    @C12579k

    /* renamed from: c */
    public static final C12062a f29706c = new C12062a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final long f29707b;

    /* renamed from: kotlinx.coroutines.m0$a */
    public static final class C12062a implements CoroutineContext.C11042b<C12061m0> {
        public /* synthetic */ C12062a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C12062a() {
        }
    }

    public C12061m0(long j) {
        super(f29706c);
        this.f29707b = j;
    }

    /* renamed from: U */
    public static /* synthetic */ C12061m0 m48138U(C12061m0 m0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = m0Var.f29707b;
        }
        return m0Var.mo24510T(j);
    }

    /* renamed from: O */
    public final long mo24509O() {
        return this.f29707b;
    }

    @C12579k
    /* renamed from: T */
    public final C12061m0 mo24510T(long j) {
        return new C12061m0(j);
    }

    /* renamed from: V */
    public final long mo24511V() {
        return this.f29707b;
    }

    /* renamed from: X */
    public void mo15332F(@C12579k CoroutineContext coroutineContext, @C12579k String str) {
        Thread.currentThread().setName(str);
    }

    @C12579k
    /* renamed from: a0 */
    public String mo15336p0(@C12579k CoroutineContext coroutineContext) {
        String str;
        C12067n0 n0Var = (C12067n0) coroutineContext.mo7444b(C12067n0.f29709c);
        if (n0Var == null || (str = n0Var.mo24524V()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, CoroutineContextKt.f28998a, 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0) {
            lastIndexOf$default = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + lastIndexOf$default + 10);
        String substring = name.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(CoroutineContextKt.f28998a);
        sb.append(str);
        sb.append('#');
        sb.append(this.f29707b);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12061m0) && this.f29707b == ((C12061m0) obj).f29707b;
    }

    public int hashCode() {
        return Long.hashCode(this.f29707b);
    }

    @C12579k
    public String toString() {
        return "CoroutineId(" + this.f29707b + ')';
    }
}
