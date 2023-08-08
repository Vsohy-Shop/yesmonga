package kotlinx.serialization.json;

import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12382k0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.r */
public final class C12413r extends C12421x {

    /* renamed from: a */
    public final boolean f30350a;
    @C12579k

    /* renamed from: b */
    public final String f30351b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12413r(@C12579k Object obj, boolean z) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(obj, "body");
        this.f30350a = z;
        this.f30351b = obj.toString();
    }

    @C12579k
    /* renamed from: e */
    public String mo25231e() {
        return this.f30351b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C11342l0.m43547d(C12413r.class), (Object) C11342l0.m43547d(obj.getClass()))) {
            return false;
        }
        C12413r rVar = (C12413r) obj;
        if (mo25232h() == rVar.mo25232h() && Intrinsics.areEqual((Object) mo25231e(), (Object) rVar.mo25231e())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo25232h() {
        return this.f30350a;
    }

    public int hashCode() {
        return (Boolean.valueOf(mo25232h()).hashCode() * 31) + mo25231e().hashCode();
    }

    @C12579k
    public String toString() {
        if (!mo25232h()) {
            return mo25231e();
        }
        StringBuilder sb = new StringBuilder();
        C12382k0.m50085e(sb, mo25231e());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
