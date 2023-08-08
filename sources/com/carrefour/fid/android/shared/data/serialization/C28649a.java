package com.carrefour.fid.android.shared.data.serialization;

import androidx.compose.runtime.internal.C8567o;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.data.serialization.a */
public final class C28649a implements C12248g<BigDecimal> {
    @C12579k

    /* renamed from: a */
    public static final C28649a f70246a = new C28649a();

    /* renamed from: b */
    public static final int f70247b = 0;

    @C12579k
    /* renamed from: a */
    public BigDecimal deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return new BigDecimal(eVar.mo24896z());
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bigDecimal, "value");
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "value.toPlainString()");
        gVar.mo24903H(plainString);
    }

    @C12579k
    public C12217f getDescriptor() {
        return SerialDescriptorsKt.m48841a("BigDecimal", C12207e.C12216i.f30002a);
    }
}
