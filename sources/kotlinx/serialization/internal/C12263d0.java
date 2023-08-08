package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.serialization.internal.d0 */
public final class C12263d0 extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    public final boolean f30056m = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12263d0(@C12579k String str, @C12579k C12327y<?> yVar) {
        super(str, yVar, 1);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(yVar, "generatedSerializer");
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12263d0) {
            C12217f fVar = (C12217f) obj;
            if (Intrinsics.areEqual((Object) mo24830h(), (Object) fVar.mo24830h())) {
                C12263d0 d0Var = (C12263d0) obj;
                if (!d0Var.isInline() || !Arrays.equals(mo24969o(), d0Var.mo24969o())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && mo24823d() == fVar.mo24823d()) {
                    int d = mo24823d();
                    int i = 0;
                    while (i < d) {
                        int i2 = i + 1;
                        if (Intrinsics.areEqual((Object) mo24827g(i).mo24830h(), (Object) fVar.mo24827g(i).mo24830h()) && Intrinsics.areEqual((Object) mo24827g(i).getKind(), (Object) fVar.mo24827g(i).getKind())) {
                            i = i2;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean isInline() {
        return this.f30056m;
    }
}
