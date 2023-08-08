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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB11CatalogDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB11CatalogDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB11CatalogDtoAllOf$$serializer implements C12327y<BffB11CatalogDtoAllOf> {
    @C12579k
    public static final BffB11CatalogDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB11CatalogDtoAllOf$$serializer bffB11CatalogDtoAllOf$$serializer = new BffB11CatalogDtoAllOf$$serializer();
        INSTANCE = bffB11CatalogDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB11CatalogDtoAllOf", bffB11CatalogDtoAllOf$$serializer, 4);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta", true);
        pluginGeneratedSerialDescriptor.mo24966k("sources", true);
        pluginGeneratedSerialDescriptor.mo24966k("all_sources", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB11CatalogDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        BffT9CatalogStoreDto$$serializer bffT9CatalogStoreDto$$serializer = BffT9CatalogStoreDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(C12310s1.f30117a), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE), C12197a.m48817q(bffT9CatalogStoreDto$$serializer), C12197a.m48817q(bffT9CatalogStoreDto$$serializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB11CatalogDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            kotlinx.serialization.descriptors.f r0 = r14.getDescriptor()
            kotlinx.serialization.encoding.c r15 = r15.mo24875b(r0)
            boolean r1 = r15.mo24886p()
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0032
            kotlinx.serialization.internal.s1 r1 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r1 = r15.mo24885n(r0, r5, r1, r6)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r4 = r15.mo24885n(r0, r4, r5, r6)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer.INSTANCE
            java.lang.Object r3 = r15.mo24885n(r0, r3, r5, r6)
            java.lang.Object r2 = r15.mo24885n(r0, r2, r5, r6)
            r5 = 15
            r6 = r5
            goto L_0x007a
        L_0x0032:
            r10 = r4
            r1 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0037:
            if (r10 == 0) goto L_0x0074
            int r11 = r15.mo24931o(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0072
            if (r11 == 0) goto L_0x0069
            if (r11 == r4) goto L_0x0060
            if (r11 == r3) goto L_0x0057
            if (r11 != r2) goto L_0x0051
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer.INSTANCE
            java.lang.Object r9 = r15.mo24885n(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0037
        L_0x0051:
            kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
            r15.<init>((int) r11)
            throw r15
        L_0x0057:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer.INSTANCE
            java.lang.Object r8 = r15.mo24885n(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0037
        L_0x0060:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r7 = r15.mo24885n(r0, r4, r11, r7)
            r1 = r1 | 2
            goto L_0x0037
        L_0x0069:
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r15.mo24885n(r0, r5, r11, r6)
            r1 = r1 | 1
            goto L_0x0037
        L_0x0072:
            r10 = r5
            goto L_0x0037
        L_0x0074:
            r4 = r7
            r3 = r8
            r2 = r9
            r13 = r6
            r6 = r1
            r1 = r13
        L_0x007a:
            r15.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB11CatalogDtoAllOf r15 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB11CatalogDtoAllOf
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r8
            r9 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto r9 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r9
            r10 = r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto r10 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r10
            r11 = 0
            r5 = r15
            r5.<init>((int) r6, (java.lang.String) r7, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r8, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r9, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r10, (kotlinx.serialization.internal.C12295n1) r11)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB11CatalogDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB11CatalogDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB11CatalogDtoAllOf bffB11CatalogDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB11CatalogDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB11CatalogDtoAllOf.write$Self(bffB11CatalogDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
