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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB6ProductBannerDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB6ProductBannerDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB6ProductBannerDtoAllOf$$serializer implements C12327y<BffB6ProductBannerDtoAllOf> {
    @C12579k
    public static final BffB6ProductBannerDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB6ProductBannerDtoAllOf$$serializer bffB6ProductBannerDtoAllOf$$serializer = new BffB6ProductBannerDtoAllOf$$serializer();
        INSTANCE = bffB6ProductBannerDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB6ProductBannerDtoAllOf", bffB6ProductBannerDtoAllOf$$serializer, 10);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_top", true);
        pluginGeneratedSerialDescriptor.mo24966k("force_display_products", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta", true);
        pluginGeneratedSerialDescriptor.mo24966k("advertising_enabled", true);
        pluginGeneratedSerialDescriptor.mo24966k("bg_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("countdown", true);
        pluginGeneratedSerialDescriptor.mo24966k("flag", true);
        pluginGeneratedSerialDescriptor.mo24966k("text_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB6ProductBannerDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffImageDto$$serializer.INSTANCE), C12197a.m48817q(iVar), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB6ProductBannerDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r20.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 9
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            r13 = 0
            if (r2 == 0) goto L_0x005a
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r13)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r13)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r10 = r0.mo24885n(r1, r10, r14, r13)
            kotlinx.serialization.internal.i r14 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r14, r13)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r9 = r0.mo24885n(r1, r9, r15, r13)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r14, r13)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r13)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r13)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r13)
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r13)
            r3 = 1023(0x3ff, float:1.434E-42)
            r14 = r11
            r11 = r9
            r9 = r4
            r4 = r3
            goto L_0x00f2
        L_0x005a:
            r19 = r11
            r2 = r12
            r5 = r13
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x0066:
            if (r19 == 0) goto L_0x00ea
            int r4 = r0.mo24931o(r1)
            switch(r4) {
                case -1: goto L_0x00e2;
                case 0: goto L_0x00d7;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0095;
                case 7: goto L_0x0088;
                case 8: goto L_0x007f;
                case 9: goto L_0x0075;
                default: goto L_0x006f;
            }
        L_0x006f:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r4)
            throw r0
        L_0x0075:
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r5 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x00e7
        L_0x007f:
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r0.mo24885n(r1, r8, r4, r6)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00e7
        L_0x0088:
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 7
            java.lang.Object r9 = r0.mo24885n(r1, r3, r4, r9)
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4 = r3
            r3 = 9
            goto L_0x0066
        L_0x0095:
            r3 = 7
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 6
            java.lang.Object r7 = r0.mo24885n(r1, r3, r4, r7)
            r2 = r2 | 64
            goto L_0x00e5
        L_0x00a0:
            r3 = 6
            kotlinx.serialization.internal.i r4 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 5
            java.lang.Object r10 = r0.mo24885n(r1, r3, r4, r10)
            r2 = r2 | 32
            goto L_0x00e5
        L_0x00ab:
            r3 = 5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r3 = 4
            java.lang.Object r11 = r0.mo24885n(r1, r3, r4, r11)
            r2 = r2 | 16
            goto L_0x00e5
        L_0x00b6:
            r3 = 4
            kotlinx.serialization.internal.i r4 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 3
            java.lang.Object r12 = r0.mo24885n(r1, r3, r4, r12)
            r2 = r2 | 8
            goto L_0x00e5
        L_0x00c1:
            r3 = 3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = 2
            java.lang.Object r15 = r0.mo24885n(r1, r3, r4, r15)
            r2 = r2 | 4
            goto L_0x00e5
        L_0x00cc:
            r3 = 2
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 1
            java.lang.Object r14 = r0.mo24885n(r1, r3, r4, r14)
            r2 = r2 | 2
            goto L_0x00e5
        L_0x00d7:
            r3 = 1
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 0
            java.lang.Object r13 = r0.mo24885n(r1, r3, r4, r13)
            r2 = r2 | 1
            goto L_0x00e5
        L_0x00e2:
            r3 = 0
            r19 = r3
        L_0x00e5:
            r3 = 9
        L_0x00e7:
            r4 = 7
            goto L_0x0066
        L_0x00ea:
            r4 = r2
            r2 = r5
            r8 = r6
            r5 = r7
            r6 = r10
            r7 = r12
            r12 = r13
            r10 = r15
        L_0x00f2:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB6ProductBannerDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB6ProductBannerDtoAllOf
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            r12 = r14
            java.lang.String r12 = (java.lang.String) r12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r10 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r10
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r11
            r14 = r6
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r16 = r9
            java.lang.String r16 = (java.lang.String) r16
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r2 = (java.lang.String) r2
            r18 = 0
            r3 = r0
            r5 = r1
            r6 = r12
            r7 = r10
            r8 = r13
            r9 = r11
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r17
            r14 = r2
            r15 = r18
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r7, (java.lang.Boolean) r8, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r9, (java.lang.Boolean) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (kotlinx.serialization.internal.C12295n1) r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB6ProductBannerDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB6ProductBannerDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB6ProductBannerDtoAllOf bffB6ProductBannerDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB6ProductBannerDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB6ProductBannerDtoAllOf.write$Self(bffB6ProductBannerDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
