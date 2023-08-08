package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.automation.C8970v;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.f */
public final class C16029f {
    @C12579k

    /* renamed from: d */
    public static final C16030a f39787d = new C16030a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f39788e = 0;
    @C12579k

    /* renamed from: f */
    public static final C16029f f39789f = new C16029f(0.0f, C11478t.m44305e(0.0f, 0.0f), 0, 4, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final float f39790a;
    @C12579k

    /* renamed from: b */
    public final C11457f<Float> f39791b;

    /* renamed from: c */
    public final int f39792c;

    /* renamed from: androidx.compose.ui.semantics.f$a */
    public static final class C16030a {
        public /* synthetic */ C16030a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16029f mo46116a() {
            return C16029f.f39789f;
        }

        public C16030a() {
        }
    }

    public C16029f(float f, @C12579k C11457f<Float> fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, C8970v.f24100k);
        this.f39790a = f;
        this.f39791b = fVar;
        this.f39792c = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    /* renamed from: b */
    public final float mo46110b() {
        return this.f39790a;
    }

    @C12579k
    /* renamed from: c */
    public final C11457f<Float> mo46111c() {
        return this.f39791b;
    }

    /* renamed from: d */
    public final int mo46112d() {
        return this.f39792c;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16029f)) {
            return false;
        }
        C16029f fVar = (C16029f) obj;
        if (this.f39790a == fVar.f39790a) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.areEqual((Object) this.f39791b, (Object) fVar.f39791b) && this.f39792c == fVar.f39792c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f39790a) * 31) + this.f39791b.hashCode()) * 31) + this.f39792c;
    }

    @C12579k
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f39790a + ", range=" + this.f39791b + ", steps=" + this.f39792c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16029f(float f, C11457f fVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, fVar, (i2 & 4) != 0 ? 0 : i);
    }
}
