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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCmsMetaTags$$serializer implements C12327y<BffCmsMetaTags> {
    @C12579k
    public static final BffCmsMetaTags$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCmsMetaTags$$serializer bffCmsMetaTags$$serializer = new BffCmsMetaTags$$serializer();
        INSTANCE = bffCmsMetaTags$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags", bffCmsMetaTags$$serializer, 14);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("robots", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("og_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("twitter_cards_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("canoncical_url", true);
        pluginGeneratedSerialDescriptor.mo24966k("og_site_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("og_url", true);
        pluginGeneratedSerialDescriptor.mo24966k("og_title", true);
        pluginGeneratedSerialDescriptor.mo24966k("og_description", true);
        pluginGeneratedSerialDescriptor.mo24966k("twitter_cards_description", true);
        pluginGeneratedSerialDescriptor.mo24966k("twitter_cards_site", true);
        pluginGeneratedSerialDescriptor.mo24966k("twitter_cards_title", true);
        pluginGeneratedSerialDescriptor.mo24966k("twitter_cards_page_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCmsMetaTags$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0147, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x019a, code lost:
        r2 = r19;
        r5 = r20;
        r20 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r26.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r5 = 11
            r6 = 10
            r7 = 9
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 3
            r12 = 8
            r13 = 4
            r14 = 2
            r15 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0083
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r4)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r2, r4)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r2, r4)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r4)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r2, r4)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r2, r4)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r4)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r4)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r4)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r4)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r2, r4)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r4)
            r17 = r3
            r3 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r4)
            r16 = r3
            r3 = 13
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r3 = 16383(0x3fff, float:2.2957E-41)
            r4 = r3
            r20 = r16
            r16 = r5
            r23 = r15
            r15 = r6
            r6 = r23
            r24 = r14
            r14 = r7
            r7 = r24
            r25 = r12
            r12 = r8
            r8 = r11
            r11 = r9
            r9 = r13
            r13 = r25
            goto L_0x01c1
        L_0x0083:
            r2 = r3
            r3 = 13
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r18 = r14
            r20 = r18
            r21 = r15
            r4 = r2
            r2 = r20
            r15 = r2
        L_0x009a:
            if (r21 == 0) goto L_0x01a4
            int r3 = r0.mo24931o(r1)
            switch(r3) {
                case -1: goto L_0x018f;
                case 0: goto L_0x017a;
                case 1: goto L_0x0160;
                case 2: goto L_0x014a;
                case 3: goto L_0x013b;
                case 4: goto L_0x012e;
                case 5: goto L_0x0121;
                case 6: goto L_0x0114;
                case 7: goto L_0x0106;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00e8;
                case 10: goto L_0x00d9;
                case 11: goto L_0x00c9;
                case 12: goto L_0x00b9;
                case 13: goto L_0x00a9;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r3)
            throw r0
        L_0x00a9:
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r15
            r15 = 13
            java.lang.Object r2 = r0.mo24885n(r1, r15, r3, r2)
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r3 = r15
            r15 = r22
            goto L_0x009a
        L_0x00b9:
            r22 = r15
            r15 = 13
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 12
            java.lang.Object r5 = r0.mo24885n(r1, r15, r3, r5)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            goto L_0x0147
        L_0x00c9:
            r22 = r15
            r15 = 12
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 11
            java.lang.Object r6 = r0.mo24885n(r1, r15, r3, r6)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x0147
        L_0x00d9:
            r22 = r15
            r15 = 11
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 10
            java.lang.Object r7 = r0.mo24885n(r1, r15, r3, r7)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x0147
        L_0x00e8:
            r22 = r15
            r15 = 10
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 9
            java.lang.Object r12 = r0.mo24885n(r1, r15, r3, r12)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x0147
        L_0x00f7:
            r22 = r15
            r15 = 9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 8
            java.lang.Object r8 = r0.mo24885n(r1, r15, r3, r8)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x0147
        L_0x0106:
            r22 = r15
            r15 = 8
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 7
            java.lang.Object r9 = r0.mo24885n(r1, r15, r3, r9)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x0147
        L_0x0114:
            r22 = r15
            r15 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 6
            java.lang.Object r10 = r0.mo24885n(r1, r15, r3, r10)
            r4 = r4 | 64
            goto L_0x0147
        L_0x0121:
            r22 = r15
            r15 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 5
            java.lang.Object r13 = r0.mo24885n(r1, r15, r3, r13)
            r4 = r4 | 32
            goto L_0x0147
        L_0x012e:
            r22 = r15
            r15 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 4
            java.lang.Object r11 = r0.mo24885n(r1, r15, r3, r11)
            r4 = r4 | 16
            goto L_0x0147
        L_0x013b:
            r22 = r15
            r15 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 3
            java.lang.Object r14 = r0.mo24885n(r1, r15, r3, r14)
            r4 = r4 | 8
        L_0x0147:
            r15 = r22
            goto L_0x015c
        L_0x014a:
            r22 = r15
            r15 = 3
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r19 = r2
            r15 = r22
            r2 = 2
            java.lang.Object r15 = r0.mo24885n(r1, r2, r3, r15)
            r4 = r4 | 4
            r2 = r19
        L_0x015c:
            r3 = 13
            goto L_0x009a
        L_0x0160:
            r19 = r2
            r2 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r20
            r20 = r5
            r5 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r4 = r4 | 2
            r5 = r20
            r3 = 13
            r20 = r2
            r2 = r19
            goto L_0x009a
        L_0x017a:
            r19 = r2
            r2 = r20
            r20 = r5
            r5 = 1
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r2
            r5 = r18
            r2 = 0
            java.lang.Object r18 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 1
            goto L_0x019a
        L_0x018f:
            r19 = r2
            r17 = r20
            r2 = 0
            r20 = r5
            r5 = r18
            r21 = r2
        L_0x019a:
            r2 = r19
            r5 = r20
            r3 = 13
            r20 = r17
            goto L_0x009a
        L_0x01a4:
            r19 = r2
            r17 = r20
            r20 = r5
            r5 = r18
            r16 = r6
            r6 = r17
            r17 = r5
            r23 = r15
            r15 = r7
            r7 = r23
            r24 = r13
            r13 = r8
            r8 = r14
            r14 = r12
            r12 = r9
            r9 = r11
            r11 = r10
            r10 = r24
        L_0x01c1:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags
            r3 = r0
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r16 = (java.lang.String) r16
            r17 = r20
            java.lang.String r17 = (java.lang.String) r17
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            r19 = 0
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (kotlinx.serialization.internal.C12295n1) r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCmsMetaTags bffCmsMetaTags) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCmsMetaTags, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCmsMetaTags.write$Self(bffCmsMetaTags, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
