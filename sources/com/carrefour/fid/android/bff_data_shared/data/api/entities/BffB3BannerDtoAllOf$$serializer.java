package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.iam.C9127a0;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB3BannerDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB3BannerDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB3BannerDtoAllOf$$serializer implements C12327y<BffB3BannerDtoAllOf> {
    @C12579k
    public static final BffB3BannerDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB3BannerDtoAllOf$$serializer bffB3BannerDtoAllOf$$serializer = new BffB3BannerDtoAllOf$$serializer();
        INSTANCE = bffB3BannerDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB3BannerDtoAllOf", bffB3BannerDtoAllOf$$serializer, 10);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("subhead_title", true);
        pluginGeneratedSerialDescriptor.mo24966k("text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("image_mobile", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("link", true);
        pluginGeneratedSerialDescriptor.mo24966k("link_secondary", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto_link", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB3BannerDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        BffImageDto$$serializer bffImageDto$$serializer = BffImageDto$$serializer.INSTANCE;
        BffUrlDto$$serializer bffUrlDto$$serializer = BffUrlDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffUrlDto$$serializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB3BannerDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r21) {
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
            if (r2 == 0) goto L_0x0057
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r13)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r13)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r2, r13)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r7, r14, r13)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r14, r13)
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r13)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r13)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r13)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r14, r13)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r6, r13)
            r6 = 1023(0x3ff, float:1.434E-42)
            r13 = r12
            r12 = r7
            r7 = r6
            goto L_0x00f0
        L_0x0057:
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
        L_0x0063:
            if (r19 == 0) goto L_0x00e7
            int r4 = r0.mo24931o(r1)
            switch(r4) {
                case -1: goto L_0x00df;
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00be;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009d;
                case 6: goto L_0x0092;
                case 7: goto L_0x0085;
                case 8: goto L_0x007c;
                case 9: goto L_0x0072;
                default: goto L_0x006c;
            }
        L_0x006c:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r4)
            throw r0
        L_0x0072:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x00e4
        L_0x007c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r6 = r0.mo24885n(r1, r8, r4, r6)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00e4
        L_0x0085:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r3 = 7
            java.lang.Object r9 = r0.mo24885n(r1, r3, r4, r9)
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4 = r3
            r3 = 9
            goto L_0x0063
        L_0x0092:
            r3 = 7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r3 = 6
            java.lang.Object r7 = r0.mo24885n(r1, r3, r4, r7)
            r2 = r2 | 64
            goto L_0x00e2
        L_0x009d:
            r3 = 6
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 5
            java.lang.Object r10 = r0.mo24885n(r1, r3, r4, r10)
            r2 = r2 | 32
            goto L_0x00e2
        L_0x00a8:
            r3 = 5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = 4
            java.lang.Object r11 = r0.mo24885n(r1, r3, r4, r11)
            r2 = r2 | 16
            goto L_0x00e2
        L_0x00b3:
            r3 = 4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r12 = r0.mo24885n(r1, r3, r4, r12)
            r2 = r2 | 8
            goto L_0x00e2
        L_0x00be:
            r3 = 3
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 2
            java.lang.Object r15 = r0.mo24885n(r1, r3, r4, r15)
            r2 = r2 | 4
            goto L_0x00e2
        L_0x00c9:
            r3 = 2
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 1
            java.lang.Object r14 = r0.mo24885n(r1, r3, r4, r14)
            r2 = r2 | 2
            goto L_0x00e2
        L_0x00d4:
            r3 = 1
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 0
            java.lang.Object r13 = r0.mo24885n(r1, r3, r4, r13)
            r2 = r2 | 1
            goto L_0x00e2
        L_0x00df:
            r3 = 0
            r19 = r3
        L_0x00e2:
            r3 = 9
        L_0x00e4:
            r4 = 7
            goto L_0x0063
        L_0x00e7:
            r3 = r5
            r8 = r6
            r5 = r7
            r4 = r9
            r9 = r11
            r11 = r14
            r7 = r2
            r2 = r10
            r10 = r15
        L_0x00f0:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB3BannerDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB3BannerDtoAllOf
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r10 = (java.lang.String) r10
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r12 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r12
            r13 = r9
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r13 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r13
            java.lang.String r2 = (java.lang.String) r2
            r14 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r14 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r14
            r15 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r15 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r15
            r16 = r8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r16 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r16
            r17 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r17 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r17
            r18 = 0
            r6 = r0
            r8 = r1
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r2
            r6.<init>((int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r11, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r12, (java.lang.String) r13, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r14, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r15, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r16, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r17, (kotlinx.serialization.internal.C12295n1) r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB3BannerDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB3BannerDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB3BannerDtoAllOf bffB3BannerDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB3BannerDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB3BannerDtoAllOf.write$Self(bffB3BannerDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
