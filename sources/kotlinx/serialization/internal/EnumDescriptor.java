package kotlinx.serialization.internal;

import kotlin.C10864b0;
import kotlin.C11532s0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12219g;
import kotlinx.serialization.descriptors.C12224h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    @C12579k

    /* renamed from: m */
    public final C12224h f30024m = C12224h.C12226b.f30010a;
    @C12579k

    /* renamed from: n */
    public final C11677z f30025n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(@C12579k String str, int i) {
        super(str, (C12327y) null, i, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
        this.f30025n = C10864b0.m38748c(new EnumDescriptor$elementDescriptors$2(i, str, this));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12217f)) {
            return false;
        }
        C12217f fVar = (C12217f) obj;
        if (fVar.getKind() == C12224h.C12226b.f30010a && Intrinsics.areEqual((Object) mo24830h(), (Object) fVar.mo24830h()) && Intrinsics.areEqual((Object) C12258b1.m49228a(this), (Object) C12258b1.m49228a(fVar))) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        return mo24937s()[i];
    }

    @C12579k
    public C12224h getKind() {
        return this.f30024m;
    }

    public int hashCode() {
        int i;
        int hashCode = mo24830h().hashCode();
        int i2 = 1;
        for (String next : C12219g.m48906c(this)) {
            int i3 = i2 * 31;
            if (next == null) {
                i = 0;
            } else {
                i = next.hashCode();
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    /* renamed from: s */
    public final C12217f[] mo24937s() {
        return (C12217f[]) this.f30025n.getValue();
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(C12219g.m48906c(this), ", ", Intrinsics.stringPlus(mo24830h(), "("), ")", 0, (CharSequence) null, (C11300l) null, 56, (Object) null);
    }
}
