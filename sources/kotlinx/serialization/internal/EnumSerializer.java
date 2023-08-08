package kotlinx.serialization.internal;

import androidx.lifecycle.C19456p0;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11626x;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
public final class EnumSerializer<T extends Enum<T>> implements C12248g<T> {
    @C12579k

    /* renamed from: a */
    public final T[] f30026a;
    @C12579k

    /* renamed from: b */
    public final C12217f f30027b;

    public EnumSerializer(@C12579k String str, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(tArr, C19456p0.f49833g);
        this.f30026a = tArr;
        this.f30027b = SerialDescriptorsKt.m48845e(str, C12224h.C12226b.f30010a, new C12217f[0], new EnumSerializer$descriptor$1(this, str));
    }

    @C12579k
    /* renamed from: b */
    public T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        int e = eVar.mo24877e(getDescriptor());
        boolean z = false;
        if (e >= 0 && e < this.f30026a.length) {
            z = true;
        }
        if (z) {
            return this.f30026a[e];
        }
        throw new SerializationException(e + " is not among valid " + getDescriptor().mo24830h() + " enum values, values size is " + this.f30026a.length);
    }

    /* renamed from: c */
    public void serialize(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        int jg = ArraysKt___ArraysKt.m39905jg(this.f30026a, t);
        if (jg != -1) {
            gVar.mo24914k(getDescriptor(), jg);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().mo24830h());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f30026a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30027b;
    }

    @C12579k
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo24830h() + C11626x.f28915f;
    }
}
