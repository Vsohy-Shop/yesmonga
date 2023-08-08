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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB16QuickAccessComponentDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB16QuickAccessComponentDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB16QuickAccessComponentDtoAllOf$$serializer implements C12327y<BffB16QuickAccessComponentDtoAllOf> {
    @C12579k
    public static final BffB16QuickAccessComponentDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB16QuickAccessComponentDtoAllOf$$serializer bffB16QuickAccessComponentDtoAllOf$$serializer = new BffB16QuickAccessComponentDtoAllOf$$serializer();
        INSTANCE = bffB16QuickAccessComponentDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB16QuickAccessComponentDtoAllOf", bffB16QuickAccessComponentDtoAllOf$$serializer, 3);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("url", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB16QuickAccessComponentDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        return new C12248g[]{C12197a.m48817q(C12310s1.f30117a), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE), C12197a.m48817q(BffImageDetailsDto$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB16QuickAccessComponentDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlinx.serialization.descriptors.f r0 = r12.getDescriptor()
            kotlinx.serialization.encoding.c r13 = r13.mo24875b(r0)
            boolean r1 = r13.mo24886p()
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x002c
            kotlinx.serialization.internal.s1 r1 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r1 = r13.mo24885n(r0, r4, r1, r5)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r3 = r13.mo24885n(r0, r3, r4, r5)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto$$serializer.INSTANCE
            java.lang.Object r2 = r13.mo24885n(r0, r2, r4, r5)
            r4 = 7
            r5 = r4
            goto L_0x0067
        L_0x002c:
            r8 = r3
            r1 = r4
            r6 = r5
            r7 = r6
        L_0x0030:
            if (r8 == 0) goto L_0x0062
            int r9 = r13.mo24931o(r0)
            r10 = -1
            if (r9 == r10) goto L_0x0060
            if (r9 == 0) goto L_0x0057
            if (r9 == r3) goto L_0x004e
            if (r9 != r2) goto L_0x0048
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto$$serializer r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto$$serializer.INSTANCE
            java.lang.Object r7 = r13.mo24885n(r0, r2, r9, r7)
            r1 = r1 | 4
            goto L_0x0030
        L_0x0048:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>((int) r9)
            throw r13
        L_0x004e:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r6 = r13.mo24885n(r0, r3, r9, r6)
            r1 = r1 | 2
            goto L_0x0030
        L_0x0057:
            kotlinx.serialization.internal.s1 r9 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r5 = r13.mo24885n(r0, r4, r9, r5)
            r1 = r1 | 1
            goto L_0x0030
        L_0x0060:
            r8 = r4
            goto L_0x0030
        L_0x0062:
            r3 = r6
            r2 = r7
            r11 = r5
            r5 = r1
            r1 = r11
        L_0x0067:
            r13.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB16QuickAccessComponentDtoAllOf r13 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB16QuickAccessComponentDtoAllOf
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r7 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r7 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r7
            r8 = r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto) r8
            r9 = 0
            r4 = r13
            r4.<init>((int) r5, (java.lang.String) r6, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r7, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto) r8, (kotlinx.serialization.internal.C12295n1) r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB16QuickAccessComponentDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB16QuickAccessComponentDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB16QuickAccessComponentDtoAllOf bffB16QuickAccessComponentDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB16QuickAccessComponentDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB16QuickAccessComponentDtoAllOf.write$Self(bffB16QuickAccessComponentDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
