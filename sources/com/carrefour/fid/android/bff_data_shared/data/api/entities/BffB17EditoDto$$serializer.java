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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB17EditoDto$$serializer implements C12327y<BffB17EditoDto> {
    @C12579k
    public static final BffB17EditoDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB17EditoDto$$serializer bffB17EditoDto$$serializer = new BffB17EditoDto$$serializer();
        INSTANCE = bffB17EditoDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto", bffB17EditoDto$$serializer, 12);
        pluginGeneratedSerialDescriptor.mo24966k("template_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("bg_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_align", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_size", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_weight", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24710e, true);
        pluginGeneratedSerialDescriptor.mo24966k("cta", true);
        pluginGeneratedSerialDescriptor.mo24966k("weight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB17EditoDto$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffImageDto$$serializer.INSTANCE), C12197a.m48817q(BffVideoDto$$serializer.INSTANCE), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE), C12197a.m48817q(C12276h0.f30067a)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0120, code lost:
        r15 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0139, code lost:
        r4 = r26;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r28.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 11
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L_0x0069
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r14 = r0.mo24885n(r1, r14, r2, r15)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r2, r15)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r15)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r15)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r15)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r15)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r15)
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r15)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r6 = r0.mo24885n(r1, r10, r6, r15)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r5, r10, r15)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r10, r15)
            kotlinx.serialization.internal.h0 r10 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r3 = r0.mo24885n(r1, r3, r10, r15)
            r10 = 4095(0xfff, float:5.738E-42)
            r27 = r11
            r11 = r10
            r10 = r27
            goto L_0x0151
        L_0x0069:
            r25 = r13
            r2 = r14
            r4 = r15
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
        L_0x0077:
            if (r25 == 0) goto L_0x013f
            int r3 = r0.mo24931o(r1)
            switch(r3) {
                case -1: goto L_0x0134;
                case 0: goto L_0x0123;
                case 1: goto L_0x0114;
                case 2: goto L_0x0107;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00d3;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00a6;
                case 10: goto L_0x0096;
                case 11: goto L_0x0086;
                default: goto L_0x0080;
            }
        L_0x0080:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r3)
            throw r0
        L_0x0086:
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r26 = r15
            r15 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r15, r3, r4)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = r15
            r15 = r26
            goto L_0x0077
        L_0x0096:
            r26 = r15
            r15 = 11
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r15 = 10
            java.lang.Object r5 = r0.mo24885n(r1, r15, r3, r5)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x0120
        L_0x00a6:
            r26 = r15
            r15 = 10
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer.INSTANCE
            r15 = 9
            java.lang.Object r10 = r0.mo24885n(r1, r15, r3, r10)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x0120
        L_0x00b6:
            r26 = r15
            r15 = 9
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r15 = 8
            java.lang.Object r6 = r0.mo24885n(r1, r15, r3, r6)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x0120
        L_0x00c5:
            r26 = r15
            r15 = 8
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 7
            java.lang.Object r7 = r0.mo24885n(r1, r15, r3, r7)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0120
        L_0x00d3:
            r26 = r15
            r15 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 6
            java.lang.Object r8 = r0.mo24885n(r1, r15, r3, r8)
            r2 = r2 | 64
            goto L_0x0120
        L_0x00e0:
            r26 = r15
            r15 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 5
            java.lang.Object r11 = r0.mo24885n(r1, r15, r3, r11)
            r2 = r2 | 32
            goto L_0x0120
        L_0x00ed:
            r26 = r15
            r15 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 4
            java.lang.Object r9 = r0.mo24885n(r1, r15, r3, r9)
            r2 = r2 | 16
            goto L_0x0120
        L_0x00fa:
            r26 = r15
            r15 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 3
            java.lang.Object r12 = r0.mo24885n(r1, r15, r3, r12)
            r2 = r2 | 8
            goto L_0x0120
        L_0x0107:
            r26 = r15
            r15 = 3
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r15, r3, r13)
            r2 = r2 | 4
            goto L_0x0120
        L_0x0114:
            r26 = r15
            r15 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 1
            java.lang.Object r14 = r0.mo24885n(r1, r15, r3, r14)
            r2 = r2 | 2
        L_0x0120:
            r15 = r26
            goto L_0x013b
        L_0x0123:
            r26 = r15
            r15 = 1
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = r26
            r26 = r4
            r4 = 0
            java.lang.Object r15 = r0.mo24885n(r1, r4, r3, r15)
            r2 = r2 | 1
            goto L_0x0139
        L_0x0134:
            r26 = r4
            r4 = 0
            r25 = r4
        L_0x0139:
            r4 = r26
        L_0x013b:
            r3 = 11
            goto L_0x0077
        L_0x013f:
            r26 = r4
            r4 = r5
            r5 = r10
            r3 = r26
            r10 = r9
            r9 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r27 = r11
            r11 = r2
            r2 = r7
            r7 = r8
            r8 = r27
        L_0x0151:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto
            r1 = r14
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r13 = (java.lang.String) r13
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r16 = r10
            java.lang.String r16 = (java.lang.String) r16
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            r18 = r7
            java.lang.String r18 = (java.lang.String) r18
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            r20 = r6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r20 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r20
            r21 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto r21 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto) r21
            r22 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r22 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r22
            r23 = r3
            java.lang.Integer r23 = (java.lang.Integer) r23
            r24 = 0
            r10 = r0
            r12 = r1
            r10.<init>((int) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r20, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto) r21, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r22, (java.lang.Integer) r23, (kotlinx.serialization.internal.C12295n1) r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB17EditoDto bffB17EditoDto) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB17EditoDto, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB17EditoDto.write$Self(bffB17EditoDto, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
