package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB57CategoryXlComponentDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB57CategoryXlComponentDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB57CategoryXlComponentDtoAllOf$$serializer implements C12327y<BffB57CategoryXlComponentDtoAllOf> {
    @C12579k
    public static final BffB57CategoryXlComponentDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB57CategoryXlComponentDtoAllOf$$serializer bffB57CategoryXlComponentDtoAllOf$$serializer = new BffB57CategoryXlComponentDtoAllOf$$serializer();
        INSTANCE = bffB57CategoryXlComponentDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf", bffB57CategoryXlComponentDtoAllOf$$serializer, 10);
        pluginGeneratedSerialDescriptor.mo24966k(C13814a.f33702X0, true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_link", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("flag", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_color", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("countdown", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k(OTUXParamsKeys.OT_UX_LINKS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB57CategoryXlComponentDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffB57CategoryXlComponentDtoAllOf.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffImageDto$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[9])};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r24.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 9
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x005e
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r3 = r0.mo24885n(r1, r13, r3, r14)
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r12 = r0.mo24885n(r1, r12, r13, r14)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r10 = r0.mo24885n(r1, r10, r15, r14)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r13, r14)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r13, r14)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r13, r14)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r5, r15, r14)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r13, r14)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r13, r14)
            r2 = r2[r11]
            java.lang.Object r2 = r0.mo24885n(r1, r11, r2, r14)
            r11 = 1023(0x3ff, float:1.434E-42)
            r15 = r12
            r12 = r11
            goto L_0x00fc
        L_0x005e:
            r23 = r12
            r3 = r13
            r4 = r14
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
        L_0x006a:
            if (r23 == 0) goto L_0x00f2
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x00e9;
                case 0: goto L_0x00de;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00a7;
                case 6: goto L_0x009c;
                case 7: goto L_0x0090;
                case 8: goto L_0x0084;
                case 9: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0079:
            r8 = r2[r11]
            java.lang.Object r4 = r0.mo24885n(r1, r11, r8, r4)
            r3 = r3 | 512(0x200, float:7.175E-43)
            r8 = 8
            goto L_0x006a
        L_0x0084:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 8
            java.lang.Object r5 = r0.mo24885n(r1, r11, r8, r5)
            r3 = r3 | 256(0x100, float:3.59E-43)
            r8 = r11
            goto L_0x00ee
        L_0x0090:
            r11 = 8
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 7
            java.lang.Object r6 = r0.mo24885n(r1, r11, r8, r6)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00ec
        L_0x009c:
            r11 = 7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r11 = 6
            java.lang.Object r9 = r0.mo24885n(r1, r11, r8, r9)
            r3 = r3 | 64
            goto L_0x00ec
        L_0x00a7:
            r11 = 6
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 5
            java.lang.Object r7 = r0.mo24885n(r1, r11, r8, r7)
            r3 = r3 | 32
            goto L_0x00ec
        L_0x00b2:
            r11 = 5
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 4
            java.lang.Object r10 = r0.mo24885n(r1, r11, r8, r10)
            r3 = r3 | 16
            goto L_0x00ec
        L_0x00bd:
            r11 = 4
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 3
            java.lang.Object r12 = r0.mo24885n(r1, r11, r8, r12)
            r3 = r3 | 8
            goto L_0x00ec
        L_0x00c8:
            r11 = 3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r11 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r11, r8, r13)
            r3 = r3 | 4
            goto L_0x00ec
        L_0x00d3:
            r11 = 2
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 1
            java.lang.Object r15 = r0.mo24885n(r1, r11, r8, r15)
            r3 = r3 | 2
            goto L_0x00ec
        L_0x00de:
            r11 = 1
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            r11 = 0
            java.lang.Object r14 = r0.mo24885n(r1, r11, r8, r14)
            r3 = r3 | 1
            goto L_0x00ec
        L_0x00e9:
            r11 = 0
            r23 = r11
        L_0x00ec:
            r8 = 8
        L_0x00ee:
            r11 = 9
            goto L_0x006a
        L_0x00f2:
            r2 = r4
            r8 = r5
            r4 = r6
            r6 = r7
            r5 = r9
            r9 = r10
            r7 = r12
            r10 = r13
            r12 = r3
            r3 = r14
        L_0x00fc:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf
            r13 = r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            r14 = r15
            java.lang.String r14 = (java.lang.String) r14
            r15 = r10
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r15 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r15
            r16 = r7
            java.lang.String r16 = (java.lang.String) r16
            r17 = r9
            java.lang.String r17 = (java.lang.String) r17
            r18 = r6
            java.lang.String r18 = (java.lang.String) r18
            r19 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r19 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r19
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            r21 = r8
            java.lang.String r21 = (java.lang.String) r21
            r22 = r2
            java.util.List r22 = (java.util.List) r22
            r23 = 0
            r11 = r0
            r11.<init>((int) r12, (java.lang.Integer) r13, (java.lang.String) r14, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r19, (java.lang.String) r20, (java.lang.String) r21, (java.util.List) r22, (kotlinx.serialization.internal.C12295n1) r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB57CategoryXlComponentDtoAllOf bffB57CategoryXlComponentDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB57CategoryXlComponentDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB57CategoryXlComponentDtoAllOf.write$Self(bffB57CategoryXlComponentDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
