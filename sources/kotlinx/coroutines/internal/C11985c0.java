package kotlinx.coroutines.internal;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12164w0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.c0 */
public final class C11985c0 extends C12064m2 implements C12164w0 {
    @C12580l

    /* renamed from: c */
    public final Throwable f29582c;
    @C12580l

    /* renamed from: d */
    public final String f29583d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11985c0(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str);
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        mo24340d0();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @C12580l
    /* renamed from: N */
    public Object mo23721N(long j, @C12579k C11045c<? super C11079d2> cVar) {
        return C12164w0.C12165a.m48733a(this, j, cVar);
    }

    /* renamed from: U */
    public boolean mo23565U(@C12579k CoroutineContext coroutineContext) {
        mo24340d0();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        mo24340d0();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: a0 */
    public C12064m2 mo23706a0() {
        return this;
    }

    @C12579k
    /* renamed from: c0 */
    public Void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        mo24340d0();
        throw new KotlinNothingValueException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void mo24340d0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f29582c
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f29583d
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f29582c
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            kotlinx.coroutines.internal.C11982b0.m47783e()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11985c0.mo24340d0():java.lang.Void");
    }

    @C12579k
    /* renamed from: e0 */
    public Void mo23711p(long j, @C12579k C12072o<? super C11079d2> oVar) {
        mo24340d0();
        throw new KotlinNothingValueException();
    }

    @C12579k
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f29582c != null) {
            str = ", cause=" + this.f29582c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    public C11985c0(@C12580l Throwable th, @C12580l String str) {
        this.f29582c = th;
        this.f29583d = str;
    }
}
