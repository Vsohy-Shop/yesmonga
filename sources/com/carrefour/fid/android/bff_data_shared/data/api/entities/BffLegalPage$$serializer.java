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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffLegalPage.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLegalPage;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffLegalPage$$serializer implements C12327y<BffLegalPage> {
    @C12579k
    public static final BffLegalPage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffLegalPage$$serializer bffLegalPage$$serializer = new BffLegalPage$$serializer();
        INSTANCE = bffLegalPage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage", bffLegalPage$$serializer, 6);
        pluginGeneratedSerialDescriptor.mo24966k("template_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("blocks", true);
        pluginGeneratedSerialDescriptor.mo24966k("metatags", true);
        pluginGeneratedSerialDescriptor.mo24966k("breadcrumb", true);
        pluginGeneratedSerialDescriptor.mo24966k("slug", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffLegalPage$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffLegalPage.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[2]), C12197a.m48817q(BffCmsMetaTags$$serializer.INSTANCE), C12197a.m48817q(access$get$childSerializers$cp[4]), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r17.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0046
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r9, r3, r10)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r3, r10)
            r11 = r2[r7]
            java.lang.Object r7 = r0.mo24885n(r1, r7, r11, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r5, r11, r10)
            r2 = r2[r6]
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r10)
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r10)
            r4 = 63
            r13 = r5
            r5 = r4
            goto L_0x00a2
        L_0x0046:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x004e:
            if (r16 == 0) goto L_0x009c
            int r9 = r0.mo24931o(r1)
            switch(r9) {
                case -1: goto L_0x0096;
                case 0: goto L_0x008b;
                case 1: goto L_0x0081;
                case 2: goto L_0x0078;
                case 3: goto L_0x006f;
                case 4: goto L_0x0066;
                case 5: goto L_0x005d;
                default: goto L_0x0057;
            }
        L_0x0057:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r9)
            throw r0
        L_0x005d:
            kotlinx.serialization.internal.s1 r9 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r15 = r0.mo24885n(r1, r4, r9, r15)
            r3 = r3 | 32
            goto L_0x0089
        L_0x0066:
            r9 = r2[r6]
            java.lang.Object r14 = r0.mo24885n(r1, r6, r9, r14)
            r3 = r3 | 16
            goto L_0x0089
        L_0x006f:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags$$serializer r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags$$serializer.INSTANCE
            java.lang.Object r13 = r0.mo24885n(r1, r5, r9, r13)
            r3 = r3 | 8
            goto L_0x0089
        L_0x0078:
            r9 = r2[r7]
            java.lang.Object r12 = r0.mo24885n(r1, r7, r9, r12)
            r3 = r3 | 4
            goto L_0x0089
        L_0x0081:
            kotlinx.serialization.internal.s1 r9 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r11 = r0.mo24885n(r1, r8, r9, r11)
            r3 = r3 | 2
        L_0x0089:
            r9 = 0
            goto L_0x004e
        L_0x008b:
            kotlinx.serialization.internal.s1 r9 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = 0
            java.lang.Object r10 = r0.mo24885n(r1, r4, r9, r10)
            r3 = r3 | 1
            r9 = r4
            goto L_0x009a
        L_0x0096:
            r4 = 0
            r9 = r4
            r16 = r9
        L_0x009a:
            r4 = 5
            goto L_0x004e
        L_0x009c:
            r5 = r3
            r9 = r10
            r8 = r11
            r7 = r12
            r2 = r14
            r3 = r15
        L_0x00a2:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            r9 = r13
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags r9 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags) r9
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            r4 = r0
            r7 = r1
            r4.<init>((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.List) r8, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags) r9, (java.util.List) r10, (java.lang.String) r11, (kotlinx.serialization.internal.C12295n1) r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffLegalPage bffLegalPage) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffLegalPage, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffLegalPage.write$Self(bffLegalPage, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
