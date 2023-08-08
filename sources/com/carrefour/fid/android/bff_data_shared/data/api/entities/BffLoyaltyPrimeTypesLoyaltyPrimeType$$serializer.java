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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffLoyaltyPrimeTypesLoyaltyPrimeType.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLoyaltyPrimeTypesLoyaltyPrimeType;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer implements C12327y<BffLoyaltyPrimeTypesLoyaltyPrimeType> {
    @C12579k
    public static final BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer bffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer = new BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer();
        INSTANCE = bffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType", bffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer, 8);
        pluginGeneratedSerialDescriptor.mo24966k("prime_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("name", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("text", true);
        pluginGeneratedSerialDescriptor.mo24966k("url_edito", true);
        pluginGeneratedSerialDescriptor.mo24966k("url_edito_not_selected", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto_off", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        BffCmsCta$$serializer bffCmsCta$$serializer = BffCmsCta$$serializer.INSTANCE;
        BffCmsPictoPrime$$serializer bffCmsPictoPrime$$serializer = BffCmsPictoPrime$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffCmsCta$$serializer), C12197a.m48817q(bffCmsCta$$serializer), C12197a.m48817q(bffCmsPictoPrime$$serializer), C12197a.m48817q(bffCmsPictoPrime$$serializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r18.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x004a
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r10, r2, r11)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r11)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r11)
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r11)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r7, r6, r11)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r11)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r11)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r6, r11)
            r6 = 255(0xff, float:3.57E-43)
            r15 = r7
            r7 = r6
            goto L_0x00c2
        L_0x004a:
            r17 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0054:
            if (r17 == 0) goto L_0x00ba
            int r6 = r0.mo24931o(r1)
            switch(r6) {
                case -1: goto L_0x00b4;
                case 0: goto L_0x00a9;
                case 1: goto L_0x009e;
                case 2: goto L_0x0093;
                case 3: goto L_0x0087;
                case 4: goto L_0x007e;
                case 5: goto L_0x0075;
                case 6: goto L_0x006c;
                case 7: goto L_0x0063;
                default: goto L_0x005d;
            }
        L_0x005d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x0063:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime$$serializer.INSTANCE
            java.lang.Object r8 = r0.mo24885n(r1, r3, r6, r8)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00b8
        L_0x006c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime$$serializer.INSTANCE
            java.lang.Object r9 = r0.mo24885n(r1, r4, r6, r9)
            r2 = r2 | 64
            goto L_0x00b8
        L_0x0075:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta$$serializer.INSTANCE
            java.lang.Object r10 = r0.mo24885n(r1, r5, r6, r10)
            r2 = r2 | 32
            goto L_0x00b8
        L_0x007e:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta$$serializer.INSTANCE
            java.lang.Object r15 = r0.mo24885n(r1, r7, r6, r15)
            r2 = r2 | 16
            goto L_0x00b8
        L_0x0087:
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 3
            java.lang.Object r14 = r0.mo24885n(r1, r3, r6, r14)
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x0054
        L_0x0093:
            r3 = 3
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r3, r6, r13)
            r2 = r2 | 4
            goto L_0x00b7
        L_0x009e:
            r3 = 2
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 1
            java.lang.Object r12 = r0.mo24885n(r1, r3, r6, r12)
            r2 = r2 | 2
            goto L_0x00b7
        L_0x00a9:
            r3 = 1
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 0
            java.lang.Object r11 = r0.mo24885n(r1, r3, r6, r11)
            r2 = r2 | 1
            goto L_0x00b7
        L_0x00b4:
            r3 = 0
            r17 = r3
        L_0x00b7:
            r3 = 7
        L_0x00b8:
            r6 = 3
            goto L_0x0054
        L_0x00ba:
            r7 = r2
            r3 = r8
            r4 = r9
            r5 = r10
            r10 = r11
            r9 = r12
            r8 = r13
            r2 = r14
        L_0x00c2:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r9 = (java.lang.String) r9
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            r12 = r15
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta r12 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta) r12
            r13 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta r13 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta) r13
            r14 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime r14 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime) r14
            r15 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime r15 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime) r15
            r16 = 0
            r6 = r0
            r8 = r1
            r6.<init>((int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta) r12, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsCta) r13, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime) r14, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime) r15, (kotlinx.serialization.internal.C12295n1) r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesLoyaltyPrimeType");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffLoyaltyPrimeTypesLoyaltyPrimeType bffLoyaltyPrimeTypesLoyaltyPrimeType) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffLoyaltyPrimeTypesLoyaltyPrimeType, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffLoyaltyPrimeTypesLoyaltyPrimeType.write$Self(bffLoyaltyPrimeTypesLoyaltyPrimeType, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
