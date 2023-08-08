package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.automation.auth.C8810a;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12312t0;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureToken;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffSecureToken$$serializer implements C12327y<BffSecureToken> {
    @C12579k
    public static final BffSecureToken$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffSecureToken$$serializer bffSecureToken$$serializer = new BffSecureToken$$serializer();
        INSTANCE = bffSecureToken$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken", bffSecureToken$$serializer, 3);
        pluginGeneratedSerialDescriptor.mo24966k(C8810a.f23579f, false);
        pluginGeneratedSerialDescriptor.mo24966k("id_token", false);
        pluginGeneratedSerialDescriptor.mo24966k("token_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffSecureToken$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        return new C12248g[]{C12312t0.f30121a, C12310s1.f30117a, BffSecureToken$TokenType$$serializer.INSTANCE};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r18.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x002c
            long r7 = r0.mo24878f(r1, r5)
            java.lang.String r2 = r0.mo24884m(r1, r4)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken$TokenType$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken$TokenType$$serializer.INSTANCE
            java.lang.Object r3 = r0.mo24895y(r1, r3, r4, r6)
            r4 = 7
            r15 = r2
            r12 = r4
            r13 = r7
            goto L_0x0064
        L_0x002c:
            r7 = 0
            r10 = r4
            r2 = r5
            r8 = r7
            r7 = r6
        L_0x0032:
            if (r10 == 0) goto L_0x0060
            int r11 = r0.mo24931o(r1)
            r12 = -1
            if (r11 == r12) goto L_0x005e
            if (r11 == 0) goto L_0x0057
            if (r11 == r4) goto L_0x0050
            if (r11 != r3) goto L_0x004a
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken$TokenType$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken$TokenType$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24895y(r1, r3, r11, r7)
            r2 = r2 | 4
            goto L_0x0032
        L_0x004a:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r11)
            throw r0
        L_0x0050:
            java.lang.String r6 = r0.mo24884m(r1, r4)
            r2 = r2 | 2
            goto L_0x0032
        L_0x0057:
            long r8 = r0.mo24878f(r1, r5)
            r2 = r2 | 1
            goto L_0x0032
        L_0x005e:
            r10 = r5
            goto L_0x0032
        L_0x0060:
            r12 = r2
            r15 = r6
            r3 = r7
            r13 = r8
        L_0x0064:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken
            r16 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken$TokenType r16 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken.TokenType) r16
            r17 = 0
            r11 = r0
            r11.<init>(r12, r13, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffSecureToken bffSecureToken) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffSecureToken, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffSecureToken.write$Self(bffSecureToken, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
