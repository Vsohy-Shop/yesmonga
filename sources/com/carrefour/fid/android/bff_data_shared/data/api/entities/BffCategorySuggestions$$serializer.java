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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCategorySuggestions.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCategorySuggestions;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCategorySuggestions$$serializer implements C12327y<BffCategorySuggestions> {
    @C12579k
    public static final BffCategorySuggestions$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCategorySuggestions$$serializer bffCategorySuggestions$$serializer = new BffCategorySuggestions$$serializer();
        INSTANCE = bffCategorySuggestions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions", bffCategorySuggestions$$serializer, 7);
        pluginGeneratedSerialDescriptor.mo24966k("bff_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_highlight", true);
        pluginGeneratedSerialDescriptor.mo24966k("text", true);
        pluginGeneratedSerialDescriptor.mo24966k("highlight", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_search_param", true);
        pluginGeneratedSerialDescriptor.mo24966k("facetFilter", true);
        pluginGeneratedSerialDescriptor.mo24966k("matches", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCategorySuggestions$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffCategorySuggestions.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[5]), C12197a.m48817q(access$get$childSerializers$cp[6])};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r18.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 6
            r8 = 5
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0048
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r10, r3, r11)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r3, r11)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r3, r11)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r11)
            java.lang.Object r3 = r0.mo24885n(r1, r5, r3, r11)
            r5 = r2[r8]
            java.lang.Object r5 = r0.mo24885n(r1, r8, r5, r11)
            r2 = r2[r7]
            java.lang.Object r2 = r0.mo24885n(r1, r7, r2, r11)
            r7 = 127(0x7f, float:1.78E-43)
            r8 = r7
            goto L_0x00b4
        L_0x0048:
            r17 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0051:
            if (r17 == 0) goto L_0x00ac
            int r6 = r0.mo24931o(r1)
            switch(r6) {
                case -1: goto L_0x00a6;
                case 0: goto L_0x009b;
                case 1: goto L_0x0090;
                case 2: goto L_0x0084;
                case 3: goto L_0x007b;
                case 4: goto L_0x0072;
                case 5: goto L_0x0069;
                case 6: goto L_0x0060;
                default: goto L_0x005a;
            }
        L_0x005a:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x0060:
            r6 = r2[r7]
            java.lang.Object r9 = r0.mo24885n(r1, r7, r6, r9)
            r3 = r3 | 64
            goto L_0x00aa
        L_0x0069:
            r6 = r2[r8]
            java.lang.Object r10 = r0.mo24885n(r1, r8, r6, r10)
            r3 = r3 | 32
            goto L_0x00aa
        L_0x0072:
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r15 = r0.mo24885n(r1, r5, r6, r15)
            r3 = r3 | 16
            goto L_0x00aa
        L_0x007b:
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r14 = r0.mo24885n(r1, r4, r6, r14)
            r3 = r3 | 8
            goto L_0x00aa
        L_0x0084:
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r4, r6, r13)
            r3 = r3 | 4
            r6 = r4
            r4 = 3
            goto L_0x0051
        L_0x0090:
            r4 = 2
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = 1
            java.lang.Object r12 = r0.mo24885n(r1, r4, r6, r12)
            r3 = r3 | 2
            goto L_0x00a9
        L_0x009b:
            r4 = 1
            kotlinx.serialization.internal.s1 r6 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = 0
            java.lang.Object r11 = r0.mo24885n(r1, r4, r6, r11)
            r3 = r3 | 1
            goto L_0x00a9
        L_0x00a6:
            r4 = 0
            r17 = r4
        L_0x00a9:
            r4 = 3
        L_0x00aa:
            r6 = 2
            goto L_0x0051
        L_0x00ac:
            r8 = r3
            r2 = r9
            r5 = r10
            r10 = r11
            r9 = r12
            r6 = r13
            r4 = r14
            r3 = r15
        L_0x00b4:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            r14 = r5
            java.util.Map r14 = (java.util.Map) r14
            r15 = r2
            java.util.List r15 = (java.util.List) r15
            r16 = 0
            r7 = r0
            r9 = r1
            r7.<init>((int) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.util.Map) r14, (java.util.List) r15, (kotlinx.serialization.internal.C12295n1) r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCategorySuggestions bffCategorySuggestions) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCategorySuggestions, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCategorySuggestions.write$Self(bffCategorySuggestions, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
