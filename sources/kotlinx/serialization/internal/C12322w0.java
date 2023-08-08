package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C12247f
/* renamed from: kotlinx.serialization.internal.w0 */
public abstract class C12322w0 extends TaggedDecoder<String> {
    @C12579k
    /* renamed from: f0 */
    public String mo25203f0(@C12579k String str, @C12579k String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "parentName");
        Intrinsics.checkNotNullParameter(str2, "childName");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str2;
        }
        return str + '.' + str2;
    }

    @C12579k
    /* renamed from: g0 */
    public String mo25204g0(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "desc");
        return fVar.mo24824e(i);
    }

    @C12579k
    /* renamed from: h0 */
    public final String mo24994b0(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return mo25206i0(mo25204g0(fVar, i));
    }

    @C12579k
    /* renamed from: i0 */
    public final String mo25206i0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "nestedName");
        String str2 = (String) mo24993a0();
        if (str2 == null) {
            str2 = "";
        }
        return mo25203f0(str2, str);
    }
}
