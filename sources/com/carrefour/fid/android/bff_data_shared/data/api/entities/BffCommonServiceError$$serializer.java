package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonServiceError.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonServiceError;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCommonServiceError$$serializer implements C12327y<BffCommonServiceError> {
    @C12579k
    public static final BffCommonServiceError$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCommonServiceError$$serializer bffCommonServiceError$$serializer = new BffCommonServiceError$$serializer();
        INSTANCE = bffCommonServiceError$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonServiceError", bffCommonServiceError$$serializer, 4);
        pluginGeneratedSerialDescriptor.mo24966k("code", true);
        pluginGeneratedSerialDescriptor.mo24966k("sub_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("reason", true);
        pluginGeneratedSerialDescriptor.mo24966k("service", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCommonServiceError$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonServiceError deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r14) {
        /*
            r13 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            kotlinx.serialization.descriptors.f r0 = r13.getDescriptor()
            kotlinx.serialization.encoding.c r14 = r14.mo24875b(r0)
            boolean r1 = r14.mo24886p()
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x002f
            kotlinx.serialization.internal.s1 r1 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r5 = r14.mo24885n(r0, r5, r1, r6)
            java.lang.Object r4 = r14.mo24885n(r0, r4, r1, r6)
            java.lang.Object r3 = r14.mo24885n(r0, r3, r1, r6)
            java.lang.Object r1 = r14.mo24885n(r0, r2, r1, r6)
            r2 = 15
            r8 = r3
            r3 = r2
            goto L_0x0075
        L_0x002f:
            r10 = r4
            r1 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0034:
            if (r10 == 0) goto L_0x0071
            int r11 = r14.mo24931o(r0)
            r12 = -1
            if (r11 == r12) goto L_0x006f
            if (r11 == 0) goto L_0x0066
            if (r11 == r4) goto L_0x005d
            if (r11 == r3) goto L_0x0054
            if (r11 != r2) goto L_0x004e
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r14.mo24885n(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0034
        L_0x004e:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>((int) r11)
            throw r14
        L_0x0054:
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r14.mo24885n(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0034
        L_0x005d:
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r14.mo24885n(r0, r4, r11, r7)
            r1 = r1 | 2
            goto L_0x0034
        L_0x0066:
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r14.mo24885n(r0, r5, r11, r6)
            r1 = r1 | 1
            goto L_0x0034
        L_0x006f:
            r10 = r5
            goto L_0x0034
        L_0x0071:
            r3 = r1
            r5 = r6
            r4 = r7
            r1 = r9
        L_0x0075:
            r14.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonServiceError r14 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonServiceError
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r2 = r14
            r4 = r0
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (kotlinx.serialization.internal.C12295n1) r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonServiceError$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonServiceError");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCommonServiceError bffCommonServiceError) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCommonServiceError, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCommonServiceError.write$Self(bffCommonServiceError, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
