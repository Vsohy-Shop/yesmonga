package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37066n0;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.utils.C37141h;
import com.carrefour.fid.android.design.components.utils.C37145l;
import com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.common.internal.C40852x;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002#\u0013B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u00020\u00168\u0016@\u0016X\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/ProductCardXsComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/utils/h;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setLoadingDebouncedClickListener", "setTimeoutDebouncedClickListener", "", "enabled", "setEnabled", "Lcom/carrefour/fid/android/design/components/widgets/productcard/ProductCardXsComponent$a;", "model", "x", "isProductAvailable", "", "B", "Lcom/carrefour/fid/android/design/components/databinding/n0;", "b", "Lcom/carrefour/fid/android/design/components/databinding/n0;", "binding", "Lcom/carrefour/fid/android/design/components/utils/a;", "getDebouncerState", "()Lcom/carrefour/fid/android/design/components/utils/a;", "setDebouncerState", "(Lcom/carrefour/fid/android/design/components/utils/a;)V", "debouncerState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductCardXsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductCardXsComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/ProductCardXsComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,258:1\n262#2,2:259\n262#2,2:261\n262#2,2:263\n262#2,2:265\n*S KotlinDebug\n*F\n+ 1 ProductCardXsComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/ProductCardXsComponent\n*L\n218#1:259,2\n219#1:261,2\n227#1:263,2\n234#1:265,2\n*E\n"})
public final class ProductCardXsComponent extends ConstraintLayout implements C37141h {

    /* renamed from: c */
    public static final int f93852c = 8;

    /* renamed from: a */
    public final /* synthetic */ C37145l f93853a;
    @C12579k

    /* renamed from: b */
    public final C37066n0 f93854b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent$a */
    public static abstract class C37345a implements C37369a {

        /* renamed from: X */
        public static final int f93855X = 8;
        @C12579k

        /* renamed from: a */
        public final String f93856a;
        @C12579k

        /* renamed from: b */
        public final ImageComponent.C37313a f93857b;
        @C12579k

        /* renamed from: c */
        public final String f93858c;
        @C12579k

        /* renamed from: d */
        public final LozengeListComponent.C37381a f93859d;

        /* renamed from: e */
        public final boolean f93860e;

        /* renamed from: f */
        public final int f93861f;
        @C12579k

        /* renamed from: g */
        public final PriceComponent.C37329a f93862g;
        @C12579k

        /* renamed from: v */
        public final C11289a<C11079d2> f93863v;
        @C12579k

        /* renamed from: w */
        public final C11289a<C11079d2> f93864w;

        /* renamed from: x */
        public final boolean f93865x;

        /* renamed from: y */
        public final boolean f93866y;

        /* renamed from: z */
        public final boolean f93867z;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent$a$a */
        public static final class C37346a extends C37345a implements C37350b {

            /* renamed from: Z */
            public static final int f93868Z = 0;
            @C12579k

            /* renamed from: Y */
            public final LabelComponent.C37316a.C37323g f93869Y;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37346a(String str, ImageComponent.C37313a aVar, String str2, LozengeListComponent.C37381a aVar2, boolean z, int i, PriceComponent.C37329a.C37332c cVar, LabelComponent.C37316a.C37323g gVar, C11289a aVar3, C11289a aVar4, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, aVar, str2, aVar2, z, i, cVar, gVar, aVar3, aVar4, z2, (i2 & 2048) != 0 ? true : z3, z4);
            }

            @C12579k
            /* renamed from: o */
            public LabelComponent.C37316a.C37323g getLabel() {
                return this.f93869Y;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37346a(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r18, @org.jetbrains.annotations.C12579k java.lang.String r19, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r20, boolean r21, int r22, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37332c r23, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37323g r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, boolean r27, boolean r28, boolean r29) {
                /*
                    r16 = this;
                    r0 = r24
                    java.lang.String r1 = "id"
                    r3 = r17
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    java.lang.String r1 = "image"
                    r4 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                    java.lang.String r1 = "title"
                    r5 = r19
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                    java.lang.String r1 = "lozenges"
                    r6 = r20
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                    java.lang.String r1 = "price"
                    r9 = r23
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    java.lang.String r1 = "onAtcPressed"
                    r10 = r25
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
                    java.lang.String r1 = "onCardPressed"
                    r11 = r26
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                    r15 = 0
                    r2 = r16
                    r7 = r21
                    r8 = r22
                    r12 = r27
                    r13 = r28
                    r14 = r29
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                    r1 = r16
                    r1.f93869Y = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent.C37345a.C37346a.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, boolean, int, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$c, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$g, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent$a$b */
        public static final class C37347b extends C37345a implements C37350b {

            /* renamed from: E0 */
            public static final int f93870E0 = 0;
            @C12580l

            /* renamed from: Y */
            public final ProductOverlayComponent.C37161b f93871Y;
            @C12579k

            /* renamed from: Z */
            public final LabelComponent.C37316a.C37326j f93872Z;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37347b(String str, ImageComponent.C37313a aVar, String str2, LozengeListComponent.C37381a aVar2, boolean z, ProductOverlayComponent.C37161b bVar, int i, PriceComponent.C37329a.C37333d dVar, LabelComponent.C37316a.C37326j jVar, C11289a aVar3, C11289a aVar4, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, aVar, str2, aVar2, z, bVar, i, dVar, jVar, aVar3, aVar4, z2, (i2 & 4096) != 0 ? true : z3, z4);
            }

            @C12579k
            /* renamed from: o */
            public LabelComponent.C37316a.C37326j getLabel() {
                return this.f93872Z;
            }

            @C12580l
            /* renamed from: p */
            public final ProductOverlayComponent.C37161b mo113909p() {
                return this.f93871Y;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37347b(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r18, @org.jetbrains.annotations.C12579k java.lang.String r19, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r20, boolean r21, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent.C37161b r22, int r23, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37333d r24, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37326j r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r27, boolean r28, boolean r29, boolean r30) {
                /*
                    r16 = this;
                    r14 = r16
                    r15 = r25
                    java.lang.String r0 = "id"
                    r1 = r17
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    java.lang.String r0 = "image"
                    r2 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.lang.String r0 = "title"
                    r3 = r19
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "lozenges"
                    r4 = r20
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = "price"
                    r7 = r24
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                    java.lang.String r0 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                    java.lang.String r0 = "onAtcPressed"
                    r8 = r26
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    java.lang.String r0 = "onCardPressed"
                    r9 = r27
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                    r13 = 0
                    r0 = r16
                    r5 = r21
                    r6 = r23
                    r10 = r28
                    r11 = r29
                    r12 = r30
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    r0 = r22
                    r14.f93871Y = r0
                    r14.f93872Z = r15
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent.C37345a.C37347b.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, boolean, com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b, int, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$d, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$j, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent$a$c */
        public static final class C37348c extends C37345a implements C37350b {

            /* renamed from: Z */
            public static final int f93873Z = 0;
            @C12579k

            /* renamed from: Y */
            public final LabelComponent.C37316a.C37326j f93874Y;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37348c(String str, ImageComponent.C37313a aVar, String str2, LozengeListComponent.C37381a aVar2, boolean z, int i, PriceComponent.C37329a.C37334e eVar, LabelComponent.C37316a.C37326j jVar, C11289a aVar3, C11289a aVar4, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, aVar, str2, aVar2, z, i, eVar, jVar, aVar3, aVar4, z2, (i2 & 2048) != 0 ? true : z3, z4);
            }

            @C12579k
            /* renamed from: o */
            public LabelComponent.C37316a.C37326j getLabel() {
                return this.f93874Y;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37348c(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r18, @org.jetbrains.annotations.C12579k java.lang.String r19, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r20, boolean r21, int r22, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37334e r23, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37326j r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, boolean r27, boolean r28, boolean r29) {
                /*
                    r16 = this;
                    r0 = r24
                    java.lang.String r1 = "id"
                    r3 = r17
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    java.lang.String r1 = "image"
                    r4 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                    java.lang.String r1 = "title"
                    r5 = r19
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                    java.lang.String r1 = "lozenges"
                    r6 = r20
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                    java.lang.String r1 = "price"
                    r9 = r23
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    java.lang.String r1 = "onAtcPressed"
                    r10 = r25
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
                    java.lang.String r1 = "onCardPressed"
                    r11 = r26
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                    r15 = 0
                    r2 = r16
                    r7 = r21
                    r8 = r22
                    r12 = r27
                    r13 = r28
                    r14 = r29
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                    r1 = r16
                    r1.f93874Y = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent.C37345a.C37348c.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, boolean, int, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$e, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$j, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent$a$d */
        public static final class C37349d extends C37345a {

            /* renamed from: Y */
            public static final int f93875Y = 0;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37349d(String str, ImageComponent.C37313a aVar, String str2, LozengeListComponent.C37381a aVar2, boolean z, int i, PriceComponent.C37329a.C37335f fVar, C11289a aVar3, C11289a aVar4, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, aVar, str2, aVar2, z, i, fVar, aVar3, aVar4, z2, (i2 & 1024) != 0 ? true : z3, z4);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37349d(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r19, boolean r20, int r21, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37335f r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r24, boolean r25, boolean r26, boolean r27) {
                /*
                    r15 = this;
                    java.lang.String r0 = "id"
                    r2 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.lang.String r0 = "image"
                    r3 = r17
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "title"
                    r4 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = "lozenges"
                    r5 = r19
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    java.lang.String r0 = "price"
                    r8 = r22
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    java.lang.String r0 = "onAtcPressed"
                    r9 = r23
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                    java.lang.String r0 = "onCardPressed"
                    r10 = r24
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                    r14 = 0
                    r1 = r15
                    r6 = r20
                    r7 = r21
                    r11 = r25
                    r12 = r26
                    r13 = r27
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent.C37345a.C37349d.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, boolean, int, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$f, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean):void");
            }
        }

        public /* synthetic */ C37345a(String str, ImageComponent.C37313a aVar, String str2, LozengeListComponent.C37381a aVar2, boolean z, int i, PriceComponent.C37329a aVar3, C11289a aVar4, C11289a aVar5, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar, str2, aVar2, z, i, aVar3, aVar4, aVar5, z2, z3, z4);
        }

        @C11395k(message = "Deviation from the DS on Figma, will be deleted once All legacy carousels are gone")
        /* renamed from: m */
        public static /* synthetic */ void m153490m() {
        }

        /* renamed from: a */
        public final boolean mo113893a(@C12579k C37345a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "other");
            if (Intrinsics.areEqual((Object) mo113894b(), (Object) aVar.mo113894b()) && mo113900h() == aVar.mo113900h() && mo113901i() == aVar.mo113901i() && mo113905n() == aVar.mo113905n()) {
                return true;
            }
            return false;
        }

        @C12579k
        /* renamed from: b */
        public String mo113894b() {
            return this.f93856a;
        }

        @C12579k
        /* renamed from: c */
        public ImageComponent.C37313a mo113895c() {
            return this.f93857b;
        }

        @C12579k
        /* renamed from: d */
        public LozengeListComponent.C37381a mo113896d() {
            return this.f93859d;
        }

        @C12579k
        /* renamed from: e */
        public C11289a<C11079d2> mo113897e() {
            return this.f93863v;
        }

        @C12579k
        /* renamed from: f */
        public C11289a<C11079d2> mo113898f() {
            return this.f93864w;
        }

        @C12579k
        /* renamed from: g */
        public PriceComponent.C37329a mo113899g() {
            return this.f93862g;
        }

        public int getType(@C12579k C37353b.C37354a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "typeFactory");
            return aVar.mo113923c(this);
        }

        /* renamed from: h */
        public int mo113900h() {
            return this.f93861f;
        }

        /* renamed from: i */
        public boolean mo113901i() {
            return this.f93865x;
        }

        /* renamed from: j */
        public boolean mo113902j() {
            return this.f93860e;
        }

        @C12579k
        /* renamed from: k */
        public String mo113903k() {
            return this.f93858c;
        }

        /* renamed from: l */
        public boolean mo113904l() {
            return this.f93867z;
        }

        /* renamed from: n */
        public boolean mo113905n() {
            return this.f93866y;
        }

        public C37345a(String str, ImageComponent.C37313a aVar, String str2, LozengeListComponent.C37381a aVar2, boolean z, int i, PriceComponent.C37329a aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, boolean z2, boolean z3, boolean z4) {
            this.f93856a = str;
            this.f93857b = aVar;
            this.f93858c = str2;
            this.f93859d = aVar2;
            this.f93860e = z;
            this.f93861f = i;
            this.f93862g = aVar3;
            this.f93863v = aVar4;
            this.f93864w = aVar5;
            this.f93865x = z2;
            this.f93866y = z3;
            this.f93867z = z4;
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent$b */
    public interface C37350b {
        @C12579k
        LabelComponent.C37316a getLabel();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardXsComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static final void m153482A(C37345a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        aVar.mo113897e().invoke();
    }

    /* renamed from: y */
    public static final void m153486y(C37345a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        aVar.mo113898f().invoke();
    }

    /* renamed from: z */
    public static final void m153487z(C37345a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        aVar.mo113897e().invoke();
    }

    /* renamed from: B */
    public final int mo113890B(boolean z) {
        return z ? C36896b.C36904h.ds_ic_cart_plus : C36896b.C36904h.ds_ic_straight_arrows_replace;
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f93853a.getDebouncerState();
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f93853a.setDebouncerState(aVar);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f93854b.f92749e.setEnabled(z);
        this.f93854b.f92750f.setEnabled(z);
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93853a.setLoadingDebouncedClickListener(view, onClickListener);
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93853a.setTimeoutDebouncedClickListener(view, onClickListener);
    }

    /* renamed from: x */
    public final void mo113892x(@C12579k C37345a aVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        boolean z2 = true;
        if (aVar.mo113901i()) {
            getDebouncerState().mo112752c();
        } else {
            C37133a.m152202b(getDebouncerState(), false, 1, (Object) null);
        }
        this.f93854b.f92746b.setLoading(aVar.mo113901i());
        setEnabled(aVar.mo113905n());
        setTimeoutDebouncedClickListener(this, new C37387o(aVar));
        this.f93854b.f92750f.mo113651n(aVar.mo113895c());
        this.f93854b.f92754j.mo113679E(aVar.mo113899g());
        this.f93854b.f92755k.setText(aVar.mo113903k());
        this.f93854b.f92752h.mo113963a(aVar.mo113896d());
        FlagFrComponent flagFrComponent = this.f93854b.f92749e;
        Intrinsics.checkNotNullExpressionValue(flagFrComponent, "binding.productFlagFr");
        if (aVar.mo113902j()) {
            i = 0;
        } else {
            i = 8;
        }
        flagFrComponent.setVisibility(i);
        SponsoredCriteoComponent sponsoredCriteoComponent = this.f93854b.f92748d;
        Intrinsics.checkNotNullExpressionValue(sponsoredCriteoComponent, "binding.productCriteo");
        if (aVar.mo113904l()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        sponsoredCriteoComponent.setVisibility(i2);
        if (!aVar.mo113905n()) {
            this.f93854b.f92747c.setVisibility(4);
            this.f93854b.f92746b.setVisibility(4);
        } else {
            MaterialButton materialButton = this.f93854b.f92747c;
            Intrinsics.checkNotNullExpressionValue(materialButton, "binding.productButtonQuantity");
            if (aVar.mo113900h() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            materialButton.setVisibility(i3);
            this.f93854b.f92747c.setText(String.valueOf(aVar.mo113900h()));
            this.f93854b.f92747c.setContentDescription(getContext().getString(C36896b.C36912p.accessibility_quantity_product, new Object[]{String.valueOf(aVar.mo113900h())}));
            LoaderMaterialButton loaderMaterialButton = this.f93854b.f92746b;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton, "binding.productButtonAtc");
            if (aVar.mo113900h() != 0) {
                z2 = false;
            }
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            loaderMaterialButton.setVisibility(i4);
            LoaderMaterialButton loaderMaterialButton2 = this.f93854b.f92746b;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton2, "binding.productButtonAtc");
            setLoadingDebouncedClickListener(loaderMaterialButton2, new C37388p(aVar));
            MaterialButton materialButton2 = this.f93854b.f92747c;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.productButtonQuantity");
            setTimeoutDebouncedClickListener(materialButton2, new C37389q(aVar));
            this.f93854b.f92746b.setIconResource(mo113890B(aVar.mo113905n()));
        }
        if (aVar instanceof C37350b) {
            LabelComponent labelComponent = this.f93854b.f92751g;
            Intrinsics.checkNotNullExpressionValue(labelComponent, "binding.productLabel");
            LabelComponent.m153105x(labelComponent, ((C37350b) aVar).getLabel(), false, 2, (Object) null);
            this.f93854b.f92751g.setVisibility(0);
        } else {
            this.f93854b.f92751g.setVisibility(4);
        }
        if (aVar instanceof C37345a.C37347b) {
            C37345a.C37347b bVar = (C37345a.C37347b) aVar;
            if (bVar.mo113909p() != null) {
                this.f93854b.f92753i.mo113010A(bVar.mo113909p());
                return;
            }
        }
        this.f93854b.f92753i.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardXsComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductCardXsComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardXsComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93853a = new C37145l();
        C37066n0 b = C37066n0.m152030b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93854b = b;
        setBackground(new ShapeDrawable(new RectShape()));
        setBackgroundTintList(C17318d.m79724g(context, C36896b.C36902f.ds_product_card_background_color));
    }
}
