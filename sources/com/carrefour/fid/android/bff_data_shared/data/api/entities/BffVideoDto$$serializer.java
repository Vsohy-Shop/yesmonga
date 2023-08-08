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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffVideoDto$$serializer implements C12327y<BffVideoDto> {
    @C12579k
    public static final BffVideoDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffVideoDto$$serializer bffVideoDto$$serializer = new BffVideoDto$$serializer();
        INSTANCE = bffVideoDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto", bffVideoDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.mo24966k("uri", true);
        pluginGeneratedSerialDescriptor.mo24966k("id", true);
        pluginGeneratedSerialDescriptor.mo24966k("thumbnails", true);
        pluginGeneratedSerialDescriptor.mo24966k("videos", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffVideoDto$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffVideoDto.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[2]), C12197a.m48817q(access$get$childSerializers$cp[3])};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            kotlinx.serialization.descriptors.f r0 = r14.getDescriptor()
            kotlinx.serialization.encoding.c r15 = r15.mo24875b(r0)
            kotlinx.serialization.g[] r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto.$childSerializers
            boolean r2 = r15.mo24886p()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0037
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r15.mo24885n(r0, r6, r2, r7)
            java.lang.Object r2 = r15.mo24885n(r0, r5, r2, r7)
            r5 = r1[r4]
            java.lang.Object r4 = r15.mo24885n(r0, r4, r5, r7)
            r1 = r1[r3]
            java.lang.Object r1 = r15.mo24885n(r0, r3, r1, r7)
            r3 = 15
            r9 = r4
            r4 = r3
            goto L_0x007d
        L_0x0037:
            r11 = r5
            r2 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x003c:
            if (r11 == 0) goto L_0x0079
            int r12 = r15.mo24931o(r0)
            r13 = -1
            if (r12 == r13) goto L_0x0077
            if (r12 == 0) goto L_0x006e
            if (r12 == r5) goto L_0x0065
            if (r12 == r4) goto L_0x005c
            if (r12 != r3) goto L_0x0056
            r12 = r1[r3]
            java.lang.Object r10 = r15.mo24885n(r0, r3, r12, r10)
            r2 = r2 | 8
            goto L_0x003c
        L_0x0056:
            kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
            r15.<init>((int) r12)
            throw r15
        L_0x005c:
            r12 = r1[r4]
            java.lang.Object r9 = r15.mo24885n(r0, r4, r12, r9)
            r2 = r2 | 4
            goto L_0x003c
        L_0x0065:
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r15.mo24885n(r0, r5, r12, r8)
            r2 = r2 | 2
            goto L_0x003c
        L_0x006e:
            kotlinx.serialization.internal.s1 r12 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r15.mo24885n(r0, r6, r12, r7)
            r2 = r2 | 1
            goto L_0x003c
        L_0x0077:
            r11 = r6
            goto L_0x003c
        L_0x0079:
            r4 = r2
            r6 = r7
            r2 = r8
            r1 = r10
        L_0x007d:
            r15.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto r15 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            r3 = r15
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.util.List) r7, (java.util.List) r8, (kotlinx.serialization.internal.C12295n1) r9)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffVideoDto bffVideoDto) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffVideoDto, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffVideoDto.write$Self(bffVideoDto, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
