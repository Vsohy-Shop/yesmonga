package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2031i
/* renamed from: androidx.compose.animation.r */
public final class C2042r implements C2041q {

    /* renamed from: a */
    public final boolean f5686a;
    @C12579k

    /* renamed from: b */
    public final C11304p<C16500q, C16500q, C1956d0<C16500q>> f5687b;

    public C2042r(boolean z, @C12579k C11304p<? super C16500q, ? super C16500q, ? extends C1956d0<C16500q>> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "sizeAnimationSpec");
        this.f5686a = z;
        this.f5687b = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11304p<C16500q, C16500q, C1956d0<C16500q>> mo7076a() {
        return this.f5687b;
    }

    /* renamed from: e */
    public boolean mo7074e() {
        return this.f5686a;
    }

    @C12579k
    /* renamed from: f */
    public C1956d0<C16500q> mo7075f(long j, long j2) {
        return this.f5687b.invoke(C16500q.m74651b(j), C16500q.m74651b(j2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2042r(boolean z, C11304p pVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, pVar);
    }
}
