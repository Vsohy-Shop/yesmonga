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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB24ContactDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB24ContactDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB24ContactDtoAllOf$$serializer implements C12327y<BffB24ContactDtoAllOf> {
    @C12579k
    public static final BffB24ContactDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB24ContactDtoAllOf$$serializer bffB24ContactDtoAllOf$$serializer = new BffB24ContactDtoAllOf$$serializer();
        INSTANCE = bffB24ContactDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB24ContactDtoAllOf", bffB24ContactDtoAllOf$$serializer, 6);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("subtitle_left", true);
        pluginGeneratedSerialDescriptor.mo24966k("subtitle_right", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta_left", true);
        pluginGeneratedSerialDescriptor.mo24966k("phone_number", true);
        pluginGeneratedSerialDescriptor.mo24966k("more_information", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB24ContactDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0090, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB24ContactDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r16.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x003e
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r9)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r9)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r2, r9)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r10, r9)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r9)
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r9)
            r3 = 63
            r12 = r4
            r4 = r3
            goto L_0x0098
        L_0x003e:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0045:
            if (r15 == 0) goto L_0x0092
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x008d;
                case 0: goto L_0x0082;
                case 1: goto L_0x0078;
                case 2: goto L_0x006f;
                case 3: goto L_0x0066;
                case 4: goto L_0x005d;
                case 5: goto L_0x0054;
                default: goto L_0x004e;
            }
        L_0x004e:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0054:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r14 = r0.mo24885n(r1, r3, r8, r14)
            r2 = r2 | 32
            goto L_0x0080
        L_0x005d:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r13 = r0.mo24885n(r1, r5, r8, r13)
            r2 = r2 | 16
            goto L_0x0080
        L_0x0066:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r12 = r0.mo24885n(r1, r4, r8, r12)
            r2 = r2 | 8
            goto L_0x0080
        L_0x006f:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r11 = r0.mo24885n(r1, r6, r8, r11)
            r2 = r2 | 4
            goto L_0x0080
        L_0x0078:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r7, r8, r10)
            r2 = r2 | 2
        L_0x0080:
            r8 = 0
            goto L_0x0045
        L_0x0082:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 0
            java.lang.Object r9 = r0.mo24885n(r1, r3, r8, r9)
            r2 = r2 | 1
            r8 = r3
            goto L_0x0090
        L_0x008d:
            r3 = 0
            r8 = r3
            r15 = r8
        L_0x0090:
            r3 = 5
            goto L_0x0045
        L_0x0092:
            r4 = r2
            r8 = r9
            r7 = r10
            r6 = r11
            r5 = r13
            r2 = r14
        L_0x0098:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB24ContactDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB24ContactDtoAllOf
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            r9 = r12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r9 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r9
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r2 = (java.lang.String) r2
            r11 = 0
            r3 = r0
            r5 = r1
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r2
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r8, (java.lang.String) r9, (java.lang.String) r10, (kotlinx.serialization.internal.C12295n1) r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB24ContactDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB24ContactDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB24ContactDtoAllOf bffB24ContactDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB24ContactDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB24ContactDtoAllOf.write$Self(bffB24ContactDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
