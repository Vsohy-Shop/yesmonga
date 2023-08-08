package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.h */
public final class C16033h {

    /* renamed from: d */
    public static final int f39802d = 0;
    @C12579k

    /* renamed from: a */
    public final C11289a<Float> f39803a;
    @C12579k

    /* renamed from: b */
    public final C11289a<Float> f39804b;

    /* renamed from: c */
    public final boolean f39805c;

    public C16033h(@C12579k C11289a<Float> aVar, @C12579k C11289a<Float> aVar2, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, "value");
        Intrinsics.checkNotNullParameter(aVar2, "maxValue");
        this.f39803a = aVar;
        this.f39804b = aVar2;
        this.f39805c = z;
    }

    @C12579k
    /* renamed from: a */
    public final C11289a<Float> mo46128a() {
        return this.f39804b;
    }

    /* renamed from: b */
    public final boolean mo46129b() {
        return this.f39805c;
    }

    @C12579k
    /* renamed from: c */
    public final C11289a<Float> mo46130c() {
        return this.f39803a;
    }

    @C12579k
    public String toString() {
        return "ScrollAxisRange(value=" + this.f39803a.invoke().floatValue() + ", maxValue=" + this.f39804b.invoke().floatValue() + ", reverseScrolling=" + this.f39805c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16033h(C11289a aVar, C11289a aVar2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i & 4) != 0 ? false : z);
    }
}
