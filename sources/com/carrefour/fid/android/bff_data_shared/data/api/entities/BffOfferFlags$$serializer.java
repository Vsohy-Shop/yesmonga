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
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffOfferFlags$$serializer implements C12327y<BffOfferFlags> {
    @C12579k
    public static final BffOfferFlags$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffOfferFlags$$serializer bffOfferFlags$$serializer = new BffOfferFlags$$serializer();
        INSTANCE = bffOfferFlags$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags", bffOfferFlags$$serializer, 8);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_promo", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_bio", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_ckc", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_bebe", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_petfood", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_famille", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_drive", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_club_marche", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffOfferFlags$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r17.getDescriptor()
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
            if (r2 == 0) goto L_0x0047
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r10 = r0.mo24885n(r1, r10, r2, r11)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r11)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r11)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r2, r11)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r11)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r11)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r11)
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r11)
            r3 = 255(0xff, float:3.57E-43)
            r12 = r9
            r9 = r4
            r4 = r3
            goto L_0x00be
        L_0x0047:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0051:
            if (r16 == 0) goto L_0x00b7
            int r6 = r0.mo24931o(r1)
            switch(r6) {
                case -1: goto L_0x00b1;
                case 0: goto L_0x00a6;
                case 1: goto L_0x009b;
                case 2: goto L_0x0090;
                case 3: goto L_0x0084;
                case 4: goto L_0x007b;
                case 5: goto L_0x0072;
                case 6: goto L_0x0069;
                case 7: goto L_0x0060;
                default: goto L_0x005a;
            }
        L_0x005a:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x0060:
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r8 = r0.mo24885n(r1, r3, r6, r8)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00b5
        L_0x0069:
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r9 = r0.mo24885n(r1, r4, r6, r9)
            r2 = r2 | 64
            goto L_0x00b5
        L_0x0072:
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r10 = r0.mo24885n(r1, r5, r6, r10)
            r2 = r2 | 32
            goto L_0x00b5
        L_0x007b:
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r15 = r0.mo24885n(r1, r7, r6, r15)
            r2 = r2 | 16
            goto L_0x00b5
        L_0x0084:
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 3
            java.lang.Object r14 = r0.mo24885n(r1, r3, r6, r14)
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x0051
        L_0x0090:
            r3 = 3
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r3, r6, r13)
            r2 = r2 | 4
            goto L_0x00b4
        L_0x009b:
            r3 = 2
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 1
            java.lang.Object r12 = r0.mo24885n(r1, r3, r6, r12)
            r2 = r2 | 2
            goto L_0x00b4
        L_0x00a6:
            r3 = 1
            kotlinx.serialization.internal.i r6 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 0
            java.lang.Object r11 = r0.mo24885n(r1, r3, r6, r11)
            r2 = r2 | 1
            goto L_0x00b4
        L_0x00b1:
            r3 = 0
            r16 = r3
        L_0x00b4:
            r3 = 7
        L_0x00b5:
            r6 = 3
            goto L_0x0051
        L_0x00b7:
            r4 = r2
            r2 = r8
            r5 = r10
            r10 = r11
            r8 = r13
            r6 = r14
            r7 = r15
        L_0x00be:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags
            r1 = r10
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r10 = r12
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r11 = r6
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r12 = r7
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r13 = r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r14 = r9
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r15 = 0
            r3 = r0
            r5 = r1
            r6 = r10
            r7 = r8
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r14
            r12 = r2
            r13 = r15
            r3.<init>((int) r4, (java.lang.Boolean) r5, (java.lang.Boolean) r6, (java.lang.Boolean) r7, (java.lang.Boolean) r8, (java.lang.Boolean) r9, (java.lang.Boolean) r10, (java.lang.Boolean) r11, (java.lang.Boolean) r12, (kotlinx.serialization.internal.C12295n1) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffOfferFlags bffOfferFlags) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffOfferFlags, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffOfferFlags.write$Self(bffOfferFlags, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
