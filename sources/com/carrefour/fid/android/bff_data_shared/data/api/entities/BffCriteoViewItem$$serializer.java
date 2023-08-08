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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCriteoViewItem$$serializer implements C12327y<BffCriteoViewItem> {
    @C12579k
    public static final BffCriteoViewItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCriteoViewItem$$serializer bffCriteoViewItem$$serializer = new BffCriteoViewItem$$serializer();
        INSTANCE = bffCriteoViewItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem", bffCriteoViewItem$$serializer, 15);
        pluginGeneratedSerialDescriptor.mo24966k("format", true);
        pluginGeneratedSerialDescriptor.mo24966k("rendering", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_position", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_load_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_view_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_click_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_file_click_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_basket_change_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_wishlist_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_video_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("product_page", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_availability_update", true);
        pluginGeneratedSerialDescriptor.mo24966k("products", true);
        pluginGeneratedSerialDescriptor.mo24966k("line_item_ID", true);
        pluginGeneratedSerialDescriptor.mo24966k("products_order", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCriteoViewItem$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffCriteoViewItem.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(BffRendering$$serializer.INSTANCE), C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[12]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[14])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01e9, code lost:
        r2 = r31;
        r3 = r34;
        r15 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x024d, code lost:
        r31 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x024f, code lost:
        r6 = 14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r40) {
        /*
            r39 = this;
            r0 = r40
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r39.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem.$childSerializers
            boolean r3 = r0.mo24886p()
            r7 = 9
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 3
            r12 = 8
            r13 = 4
            r14 = 2
            r4 = 1
            r15 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0087
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r15 = r0.mo24885n(r1, r15, r3, r5)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r5)
            kotlinx.serialization.internal.h0 r6 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r6 = r0.mo24885n(r1, r14, r6, r5)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r3, r5)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r3, r5)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r3, r5)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r3, r5)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r3, r5)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r3, r5)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r3, r5)
            r14 = 10
            java.lang.Object r14 = r0.mo24885n(r1, r14, r3, r5)
            r19 = r4
            r4 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r5)
            r18 = r4
            r17 = r6
            r4 = 12
            r6 = r2[r4]
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r5)
            r6 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r6, r3, r5)
            r6 = 14
            r2 = r2[r6]
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r5)
            r5 = 32767(0x7fff, float:4.5916E-41)
            r20 = r5
            r6 = r17
            r5 = r4
            r4 = r19
            goto L_0x027b
        L_0x0087:
            r6 = 14
            r33 = r4
            r3 = r5
            r4 = r3
            r7 = r4
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r29 = r14
            r30 = r29
            r31 = r30
            r32 = r31
            r5 = r15
            r15 = r32
        L_0x00a0:
            if (r33 == 0) goto L_0x0253
            r34 = r3
            int r3 = r0.mo24931o(r1)
            switch(r3) {
                case -1: goto L_0x0235;
                case 0: goto L_0x0212;
                case 1: goto L_0x01f1;
                case 2: goto L_0x01d3;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01a5;
                case 5: goto L_0x018e;
                case 6: goto L_0x0177;
                case 7: goto L_0x015e;
                case 8: goto L_0x0144;
                case 9: goto L_0x012a;
                case 10: goto L_0x0110;
                case 11: goto L_0x00f2;
                case 12: goto L_0x00dc;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b1;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r3)
            throw r0
        L_0x00b1:
            r3 = r2[r6]
            r35 = r15
            r15 = r32
            java.lang.Object r32 = r0.mo24885n(r1, r6, r3, r15)
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r3 = r34
            r15 = r35
            goto L_0x00a0
        L_0x00c2:
            r35 = r15
            r15 = r32
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r16 = r15
            r6 = r31
            r15 = 13
            java.lang.Object r31 = r0.mo24885n(r1, r15, r3, r6)
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r32 = r16
            r3 = r34
            r15 = r35
            goto L_0x024f
        L_0x00dc:
            r35 = r15
            r6 = r31
            r16 = r32
            r3 = 12
            r15 = r2[r3]
            r31 = r2
            r2 = r30
            java.lang.Object r30 = r0.mo24885n(r1, r3, r15, r2)
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            goto L_0x01e9
        L_0x00f2:
            r35 = r15
            r6 = r31
            r16 = r32
            r3 = 12
            r31 = r2
            r2 = r30
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r2
            r3 = r29
            r2 = 11
            java.lang.Object r29 = r0.mo24885n(r1, r2, r15, r3)
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r30 = r18
            goto L_0x01e9
        L_0x0110:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 11
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 10
            java.lang.Object r7 = r0.mo24885n(r1, r2, r15, r7)
            r5 = r5 | 1024(0x400, float:1.435E-42)
            goto L_0x01e9
        L_0x012a:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 10
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 9
            java.lang.Object r12 = r0.mo24885n(r1, r2, r15, r12)
            r5 = r5 | 512(0x200, float:7.175E-43)
            goto L_0x01e9
        L_0x0144:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 9
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 8
            java.lang.Object r8 = r0.mo24885n(r1, r2, r15, r8)
            r5 = r5 | 256(0x100, float:3.59E-43)
            goto L_0x01e9
        L_0x015e:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 8
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 7
            java.lang.Object r9 = r0.mo24885n(r1, r2, r15, r9)
            r5 = r5 | 128(0x80, float:1.794E-43)
            goto L_0x01e9
        L_0x0177:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 7
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 6
            java.lang.Object r10 = r0.mo24885n(r1, r2, r15, r10)
            r5 = r5 | 64
            goto L_0x01e9
        L_0x018e:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 6
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 5
            java.lang.Object r13 = r0.mo24885n(r1, r2, r15, r13)
            r5 = r5 | 32
            goto L_0x01e9
        L_0x01a5:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 5
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 4
            java.lang.Object r11 = r0.mo24885n(r1, r2, r15, r11)
            r5 = r5 | 16
            goto L_0x01e9
        L_0x01bc:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 4
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 3
            java.lang.Object r14 = r0.mo24885n(r1, r2, r15, r14)
            r5 = r5 | 8
            goto L_0x01e9
        L_0x01d3:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 3
            kotlinx.serialization.internal.h0 r15 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 2
            java.lang.Object r4 = r0.mo24885n(r1, r2, r15, r4)
            r5 = r5 | 4
        L_0x01e9:
            r2 = r31
            r3 = r34
            r15 = r35
            goto L_0x024d
        L_0x01f1:
            r35 = r15
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r31 = r2
            r2 = 2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering$$serializer.INSTANCE
            r20 = r4
            r2 = r35
            r4 = 1
            java.lang.Object r15 = r0.mo24885n(r1, r4, r15, r2)
            r5 = r5 | 2
            r4 = r20
            r2 = r31
            r3 = r34
            goto L_0x024d
        L_0x0212:
            r20 = r4
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r4 = 1
            r31 = r2
            r2 = r15
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r34
            r34 = r2
            r2 = 0
            java.lang.Object r4 = r0.mo24885n(r1, r2, r15, r4)
            r5 = r5 | 1
            r3 = r4
            r4 = r20
            r2 = r31
            r15 = r34
            goto L_0x024d
        L_0x0235:
            r20 = r4
            r3 = r29
            r18 = r30
            r6 = r31
            r16 = r32
            r4 = r34
            r31 = r2
            r34 = r15
            r2 = 0
            r33 = r2
            r3 = r4
            r4 = r20
            r2 = r31
        L_0x024d:
            r31 = r6
        L_0x024f:
            r6 = 14
            goto L_0x00a0
        L_0x0253:
            r20 = r4
            r34 = r15
            r18 = r30
            r6 = r31
            r16 = r32
            r4 = r3
            r3 = r29
            r15 = r4
            r2 = r16
            r4 = r34
            r37 = r18
            r18 = r3
            r3 = r6
            r6 = r20
            r20 = r5
            r5 = r37
            r38 = r14
            r14 = r7
            r7 = r12
            r12 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r13 = r11
            r11 = r38
        L_0x027b:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem
            r19 = r0
            r21 = r15
            java.lang.String r21 = (java.lang.String) r21
            r22 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering r22 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering) r22
            r23 = r6
            java.lang.Integer r23 = (java.lang.Integer) r23
            r24 = r11
            java.lang.String r24 = (java.lang.String) r24
            r25 = r13
            java.lang.String r25 = (java.lang.String) r25
            r26 = r10
            java.lang.String r26 = (java.lang.String) r26
            r27 = r9
            java.lang.String r27 = (java.lang.String) r27
            r28 = r8
            java.lang.String r28 = (java.lang.String) r28
            r29 = r12
            java.lang.String r29 = (java.lang.String) r29
            r30 = r7
            java.lang.String r30 = (java.lang.String) r30
            r31 = r14
            java.lang.String r31 = (java.lang.String) r31
            r32 = r18
            java.lang.String r32 = (java.lang.String) r32
            r33 = r5
            java.util.List r33 = (java.util.List) r33
            r34 = r3
            java.lang.String r34 = (java.lang.String) r34
            r35 = r2
            java.util.List r35 = (java.util.List) r35
            r36 = 0
            r19.<init>((int) r20, (java.lang.String) r21, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering) r22, (java.lang.Integer) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.util.List) r33, (java.lang.String) r34, (java.util.List) r35, (kotlinx.serialization.internal.C12295n1) r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCriteoViewItem bffCriteoViewItem) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCriteoViewItem, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCriteoViewItem.write$Self(bffCriteoViewItem, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
