package com.carrefour.fid.android.design.components.widgets.productcard;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37064m0;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.utils.C37141h;
import com.carrefour.fid.android.design.components.utils.C37145l;
import com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.common.internal.C40852x;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u00020\u00168\u0016@\u0016X\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/ProductCardSComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/utils/h;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setLoadingDebouncedClickListener", "setTimeoutDebouncedClickListener", "", "enabled", "setEnabled", "Lcom/carrefour/fid/android/design/components/widgets/productcard/ProductCardSComponent$a;", "model", "E", "isProductAvailable", "", "P", "Lcom/carrefour/fid/android/design/components/databinding/m0;", "b", "Lcom/carrefour/fid/android/design/components/databinding/m0;", "binding", "Lcom/carrefour/fid/android/design/components/utils/a;", "getDebouncerState", "()Lcom/carrefour/fid/android/design/components/utils/a;", "setDebouncerState", "(Lcom/carrefour/fid/android/design/components/utils/a;)V", "debouncerState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductCardSComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductCardSComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/ProductCardSComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,572:1\n262#2,2:573\n262#2,2:575\n262#2,2:577\n262#2,2:579\n262#2,2:581\n262#2,2:583\n262#2,2:585\n262#2,2:587\n*S KotlinDebug\n*F\n+ 1 ProductCardSComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/ProductCardSComponent\n*L\n482#1:573,2\n484#1:575,2\n485#1:577,2\n490#1:579,2\n498#1:581,2\n508#1:583,2\n509#1:585,2\n537#1:587,2\n*E\n"})
public final class ProductCardSComponent extends ConstraintLayout implements C37141h {

    /* renamed from: c */
    public static final int f93680c = 8;

    /* renamed from: a */
    public final /* synthetic */ C37145l f93681a;
    @C12579k

    /* renamed from: b */
    public final C37064m0 f93682b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a */
    public static abstract class C37338a implements C37369a {

        /* renamed from: M0 */
        public static final int f93683M0 = 8;

        /* renamed from: E0 */
        public final boolean f93684E0;

        /* renamed from: F0 */
        public final boolean f93685F0;

        /* renamed from: G0 */
        public final boolean f93686G0;

        /* renamed from: H0 */
        public final boolean f93687H0;

        /* renamed from: I0 */
        public final boolean f93688I0;

        /* renamed from: J0 */
        public final boolean f93689J0;

        /* renamed from: K0 */
        public final boolean f93690K0;
        @C12580l

        /* renamed from: L0 */
        public final C11289a<C11079d2> f93691L0;
        @C12580l

        /* renamed from: X */
        public final C11289a<C11079d2> f93692X;

        /* renamed from: Y */
        public final boolean f93693Y;

        /* renamed from: Z */
        public final boolean f93694Z;
        @C12579k

        /* renamed from: a */
        public final String f93695a;
        @C12579k

        /* renamed from: b */
        public final ImageComponent.C37313a f93696b;
        @C12579k

        /* renamed from: c */
        public final ContentComponent.C37305a f93697c;
        @C12579k

        /* renamed from: d */
        public final LozengeListComponent.C37381a f93698d;
        @C12580l

        /* renamed from: e */
        public final NutriscoreComponent.C37157a f93699e;

        /* renamed from: f */
        public final boolean f93700f;

        /* renamed from: g */
        public final boolean f93701g;

        /* renamed from: v */
        public final int f93702v;
        @C12579k

        /* renamed from: w */
        public final C11300l<C37133a, C11079d2> f93703w;
        @C12580l

        /* renamed from: x */
        public final C11300l<C37133a, C11079d2> f93704x;
        @C12579k

        /* renamed from: y */
        public final C11300l<C37133a, C11079d2> f93705y;
        @C12580l

        /* renamed from: z */
        public final C11289a<C11079d2> f93706z;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$a */
        public static final class C37339a extends C37338a {

            /* renamed from: k1 */
            public static final int f93707k1 = 8;
            @C12579k

            /* renamed from: N0 */
            public final String f93708N0;
            @C12579k

            /* renamed from: O0 */
            public final ImageComponent.C37313a f93709O0;
            @C12579k

            /* renamed from: P0 */
            public final ContentComponent.C37305a.C37306a f93710P0;
            @C12579k

            /* renamed from: Q0 */
            public final LozengeListComponent.C37381a f93711Q0;
            @C12580l

            /* renamed from: R0 */
            public final NutriscoreComponent.C37157a f93712R0;

            /* renamed from: S0 */
            public final boolean f93713S0;

            /* renamed from: T0 */
            public final boolean f93714T0;

            /* renamed from: U0 */
            public final int f93715U0;
            @C12579k

            /* renamed from: V0 */
            public final C11300l<C37133a, C11079d2> f93716V0;
            @C12580l

            /* renamed from: W0 */
            public final C11300l<C37133a, C11079d2> f93717W0;
            @C12579k

            /* renamed from: X0 */
            public final C11300l<C37133a, C11079d2> f93718X0;
            @C12580l

            /* renamed from: Y0 */
            public final C11289a<C11079d2> f93719Y0;
            @C12580l

            /* renamed from: Z0 */
            public final C11289a<C11079d2> f93720Z0;

            /* renamed from: a1 */
            public final boolean f93721a1;

            /* renamed from: b1 */
            public final boolean f93722b1;

            /* renamed from: c1 */
            public final boolean f93723c1;

            /* renamed from: d1 */
            public final boolean f93724d1;

            /* renamed from: e1 */
            public final boolean f93725e1;

            /* renamed from: f1 */
            public final boolean f93726f1;

            /* renamed from: g1 */
            public final boolean f93727g1;

            /* renamed from: h1 */
            public final boolean f93728h1;

            /* renamed from: i1 */
            public final boolean f93729i1;
            @C12580l

            /* renamed from: j1 */
            public final C11289a<C11079d2> f93730j1;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C37339a(java.lang.String r28, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r29, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37306a r30, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r31, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r32, boolean r33, boolean r34, int r35, kotlin.jvm.functions.C11300l r36, kotlin.jvm.functions.C11300l r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11289a r39, kotlin.jvm.functions.C11289a r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.C11289a r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
                /*
                    r27 = this;
                    r0 = r51
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r8 = r2
                    goto L_0x000b
                L_0x0009:
                    r8 = r32
                L_0x000b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0011
                    r13 = r2
                    goto L_0x0013
                L_0x0011:
                    r13 = r37
                L_0x0013:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0019
                    r15 = r2
                    goto L_0x001b
                L_0x0019:
                    r15 = r39
                L_0x001b:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x0022
                    r16 = r2
                    goto L_0x0024
                L_0x0022:
                    r16 = r40
                L_0x0024:
                    r1 = 65536(0x10000, float:9.18355E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x002d
                    r1 = 1
                    r20 = r1
                    goto L_0x002f
                L_0x002d:
                    r20 = r44
                L_0x002f:
                    r1 = 131072(0x20000, float:1.83671E-40)
                    r1 = r1 & r0
                    r3 = 0
                    if (r1 == 0) goto L_0x0038
                    r21 = r3
                    goto L_0x003a
                L_0x0038:
                    r21 = r45
                L_0x003a:
                    r1 = 524288(0x80000, float:7.34684E-40)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0042
                    r23 = r3
                    goto L_0x0044
                L_0x0042:
                    r23 = r47
                L_0x0044:
                    r1 = 1048576(0x100000, float:1.469368E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x004c
                    r24 = r3
                    goto L_0x004e
                L_0x004c:
                    r24 = r48
                L_0x004e:
                    r1 = 2097152(0x200000, float:2.938736E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0056
                    r25 = r3
                    goto L_0x0058
                L_0x0056:
                    r25 = r49
                L_0x0058:
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 & r1
                    if (r0 == 0) goto L_0x0060
                    r26 = r2
                    goto L_0x0062
                L_0x0060:
                    r26 = r50
                L_0x0062:
                    r3 = r27
                    r4 = r28
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r9 = r33
                    r10 = r34
                    r11 = r35
                    r12 = r36
                    r14 = r38
                    r17 = r41
                    r18 = r42
                    r19 = r43
                    r22 = r46
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37339a.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$a, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: W */
            public static /* synthetic */ C37339a m153184W(C37339a aVar, String str, ImageComponent.C37313a aVar2, ContentComponent.C37305a.C37306a aVar3, LozengeListComponent.C37381a aVar4, NutriscoreComponent.C37157a aVar5, boolean z, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar6, C11289a aVar7, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar8, int i2, Object obj) {
                C37339a aVar9 = aVar;
                int i3 = i2;
                return aVar.mo113739V((i3 & 1) != 0 ? aVar9.f93708N0 : str, (i3 & 2) != 0 ? aVar9.f93709O0 : aVar2, (i3 & 4) != 0 ? aVar9.f93710P0 : aVar3, (i3 & 8) != 0 ? aVar9.f93711Q0 : aVar4, (i3 & 16) != 0 ? aVar9.f93712R0 : aVar5, (i3 & 32) != 0 ? aVar9.f93713S0 : z, (i3 & 64) != 0 ? aVar9.f93714T0 : z2, (i3 & 128) != 0 ? aVar9.f93715U0 : i, (i3 & 256) != 0 ? aVar9.f93716V0 : lVar, (i3 & 512) != 0 ? aVar9.f93717W0 : lVar2, (i3 & 1024) != 0 ? aVar9.f93718X0 : lVar3, (i3 & 2048) != 0 ? aVar9.f93719Y0 : aVar6, (i3 & 4096) != 0 ? aVar9.f93720Z0 : aVar7, (i3 & 8192) != 0 ? aVar9.f93721a1 : z3, (i3 & 16384) != 0 ? aVar9.f93722b1 : z4, (i3 & 32768) != 0 ? aVar9.f93723c1 : z5, (i3 & 65536) != 0 ? aVar9.f93724d1 : z6, (i3 & 131072) != 0 ? aVar9.f93725e1 : z7, (i3 & 262144) != 0 ? aVar9.f93726f1 : z8, (i3 & 524288) != 0 ? aVar9.f93727g1 : z9, (i3 & 1048576) != 0 ? aVar9.f93728h1 : z10, (i3 & 2097152) != 0 ? aVar9.f93729i1 : z11, (i3 & 4194304) != 0 ? aVar9.f93730j1 : aVar8);
            }

            @C12579k
            /* renamed from: A */
            public final C11300l<C37133a, C11079d2> mo113718A() {
                return this.f93718X0;
            }

            @C12580l
            /* renamed from: B */
            public final C11289a<C11079d2> mo113719B() {
                return this.f93719Y0;
            }

            @C12580l
            /* renamed from: C */
            public final C11289a<C11079d2> mo113720C() {
                return this.f93720Z0;
            }

            /* renamed from: D */
            public final boolean mo113721D() {
                return this.f93721a1;
            }

            /* renamed from: E */
            public final boolean mo113722E() {
                return this.f93722b1;
            }

            /* renamed from: F */
            public final boolean mo113723F() {
                return this.f93723c1;
            }

            /* renamed from: G */
            public final boolean mo113724G() {
                return this.f93724d1;
            }

            /* renamed from: H */
            public final boolean mo113725H() {
                return this.f93725e1;
            }

            /* renamed from: I */
            public final boolean mo113726I() {
                return this.f93726f1;
            }

            @C12579k
            /* renamed from: J */
            public final ImageComponent.C37313a mo113727J() {
                return this.f93709O0;
            }

            /* renamed from: K */
            public final boolean mo113728K() {
                return this.f93727g1;
            }

            /* renamed from: L */
            public final boolean mo113729L() {
                return this.f93728h1;
            }

            /* renamed from: M */
            public final boolean mo113730M() {
                return this.f93729i1;
            }

            @C12580l
            /* renamed from: N */
            public final C11289a<C11079d2> mo113731N() {
                return this.f93730j1;
            }

            @C12579k
            /* renamed from: O */
            public final ContentComponent.C37305a.C37306a mo113732O() {
                return this.f93710P0;
            }

            @C12579k
            /* renamed from: P */
            public final LozengeListComponent.C37381a mo113733P() {
                return this.f93711Q0;
            }

            @C12580l
            /* renamed from: Q */
            public final NutriscoreComponent.C37157a mo113734Q() {
                return this.f93712R0;
            }

            /* renamed from: R */
            public final boolean mo113735R() {
                return this.f93713S0;
            }

            /* renamed from: S */
            public final boolean mo113736S() {
                return this.f93714T0;
            }

            /* renamed from: T */
            public final int mo113737T() {
                return this.f93715U0;
            }

            @C12579k
            /* renamed from: U */
            public final C11300l<C37133a, C11079d2> mo113738U() {
                return this.f93716V0;
            }

            @C12579k
            /* renamed from: V */
            public final C37339a mo113739V(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37306a aVar2, @C12579k LozengeListComponent.C37381a aVar3, @C12580l NutriscoreComponent.C37157a aVar4, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar5, @C12580l C11289a<C11079d2> aVar6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar7) {
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(aVar2, "content");
                Intrinsics.checkNotNullParameter(aVar3, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                return new C37339a(str2, aVar, aVar2, aVar3, aVar4, z, z2, i, lVar, lVar2, lVar3, aVar5, aVar6, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar7);
            }

            @C12579k
            /* renamed from: X */
            public ContentComponent.C37305a.C37306a mo113695b() {
                return this.f93710P0;
            }

            /* renamed from: c */
            public boolean mo113696c() {
                return this.f93727g1;
            }

            @C12579k
            /* renamed from: d */
            public String mo113697d() {
                return this.f93708N0;
            }

            @C12579k
            /* renamed from: e */
            public ImageComponent.C37313a mo113698e() {
                return this.f93709O0;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37339a)) {
                    return false;
                }
                C37339a aVar = (C37339a) obj;
                return Intrinsics.areEqual((Object) this.f93708N0, (Object) aVar.f93708N0) && Intrinsics.areEqual((Object) this.f93709O0, (Object) aVar.f93709O0) && Intrinsics.areEqual((Object) this.f93710P0, (Object) aVar.f93710P0) && Intrinsics.areEqual((Object) this.f93711Q0, (Object) aVar.f93711Q0) && Intrinsics.areEqual((Object) this.f93712R0, (Object) aVar.f93712R0) && this.f93713S0 == aVar.f93713S0 && this.f93714T0 == aVar.f93714T0 && this.f93715U0 == aVar.f93715U0 && Intrinsics.areEqual((Object) this.f93716V0, (Object) aVar.f93716V0) && Intrinsics.areEqual((Object) this.f93717W0, (Object) aVar.f93717W0) && Intrinsics.areEqual((Object) this.f93718X0, (Object) aVar.f93718X0) && Intrinsics.areEqual((Object) this.f93719Y0, (Object) aVar.f93719Y0) && Intrinsics.areEqual((Object) this.f93720Z0, (Object) aVar.f93720Z0) && this.f93721a1 == aVar.f93721a1 && this.f93722b1 == aVar.f93722b1 && this.f93723c1 == aVar.f93723c1 && this.f93724d1 == aVar.f93724d1 && this.f93725e1 == aVar.f93725e1 && this.f93726f1 == aVar.f93726f1 && this.f93727g1 == aVar.f93727g1 && this.f93728h1 == aVar.f93728h1 && this.f93729i1 == aVar.f93729i1 && Intrinsics.areEqual((Object) this.f93730j1, (Object) aVar.f93730j1);
            }

            @C12579k
            /* renamed from: f */
            public LozengeListComponent.C37381a mo113699f() {
                return this.f93711Q0;
            }

            @C12580l
            /* renamed from: g */
            public NutriscoreComponent.C37157a mo113700g() {
                return this.f93712R0;
            }

            @C12580l
            /* renamed from: h */
            public C11289a<C11079d2> mo113701h() {
                return this.f93730j1;
            }

            public int hashCode() {
                int hashCode = ((((((this.f93708N0.hashCode() * 31) + this.f93709O0.hashCode()) * 31) + this.f93710P0.hashCode()) * 31) + this.f93711Q0.hashCode()) * 31;
                NutriscoreComponent.C37157a aVar = this.f93712R0;
                int i = 0;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                boolean z = this.f93713S0;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f93714T0;
                if (z3) {
                    z3 = true;
                }
                int hashCode3 = (((((i2 + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f93715U0)) * 31) + this.f93716V0.hashCode()) * 31;
                C11300l<C37133a, C11079d2> lVar = this.f93717W0;
                int hashCode4 = (((hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f93718X0.hashCode()) * 31;
                C11289a<C11079d2> aVar2 = this.f93719Y0;
                int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                C11289a<C11079d2> aVar3 = this.f93720Z0;
                int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                boolean z4 = this.f93721a1;
                if (z4) {
                    z4 = true;
                }
                int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
                boolean z5 = this.f93722b1;
                if (z5) {
                    z5 = true;
                }
                int i4 = (i3 + (z5 ? 1 : 0)) * 31;
                boolean z6 = this.f93723c1;
                if (z6) {
                    z6 = true;
                }
                int i5 = (i4 + (z6 ? 1 : 0)) * 31;
                boolean z7 = this.f93724d1;
                if (z7) {
                    z7 = true;
                }
                int i6 = (i5 + (z7 ? 1 : 0)) * 31;
                boolean z8 = this.f93725e1;
                if (z8) {
                    z8 = true;
                }
                int i7 = (i6 + (z8 ? 1 : 0)) * 31;
                boolean z9 = this.f93726f1;
                if (z9) {
                    z9 = true;
                }
                int i8 = (i7 + (z9 ? 1 : 0)) * 31;
                boolean z10 = this.f93727g1;
                if (z10) {
                    z10 = true;
                }
                int i9 = (i8 + (z10 ? 1 : 0)) * 31;
                boolean z11 = this.f93728h1;
                if (z11) {
                    z11 = true;
                }
                int i10 = (i9 + (z11 ? 1 : 0)) * 31;
                boolean z12 = this.f93729i1;
                if (!z12) {
                    z2 = z12;
                }
                int i11 = (i10 + (z2 ? 1 : 0)) * 31;
                C11289a<C11079d2> aVar4 = this.f93730j1;
                if (aVar4 != null) {
                    i = aVar4.hashCode();
                }
                return i11 + i;
            }

            @C12579k
            /* renamed from: i */
            public C11300l<C37133a, C11079d2> mo113702i() {
                return this.f93716V0;
            }

            @C12580l
            /* renamed from: j */
            public C11289a<C11079d2> mo113703j() {
                return this.f93719Y0;
            }

            @C12580l
            /* renamed from: k */
            public C11300l<C37133a, C11079d2> mo113704k() {
                return this.f93717W0;
            }

            @C12579k
            /* renamed from: l */
            public C11300l<C37133a, C11079d2> mo113705l() {
                return this.f93718X0;
            }

            @C12580l
            /* renamed from: m */
            public C11289a<C11079d2> mo113706m() {
                return this.f93720Z0;
            }

            /* renamed from: n */
            public int mo113707n() {
                return this.f93715U0;
            }

            /* renamed from: o */
            public boolean mo113708o() {
                return this.f93729i1;
            }

            /* renamed from: p */
            public boolean mo113709p() {
                return this.f93721a1;
            }

            /* renamed from: q */
            public boolean mo113710q() {
                return this.f93723c1;
            }

            /* renamed from: r */
            public boolean mo113711r() {
                return this.f93722b1;
            }

            /* renamed from: s */
            public boolean mo113712s() {
                return this.f93713S0;
            }

            /* renamed from: t */
            public boolean mo113713t() {
                return this.f93725e1;
            }

            @C12579k
            public String toString() {
                String str = this.f93708N0;
                ImageComponent.C37313a aVar = this.f93709O0;
                ContentComponent.C37305a.C37306a aVar2 = this.f93710P0;
                LozengeListComponent.C37381a aVar3 = this.f93711Q0;
                NutriscoreComponent.C37157a aVar4 = this.f93712R0;
                boolean z = this.f93713S0;
                boolean z2 = this.f93714T0;
                int i = this.f93715U0;
                C11300l<C37133a, C11079d2> lVar = this.f93716V0;
                C11300l<C37133a, C11079d2> lVar2 = this.f93717W0;
                C11300l<C37133a, C11079d2> lVar3 = this.f93718X0;
                C11289a<C11079d2> aVar5 = this.f93719Y0;
                C11289a<C11079d2> aVar6 = this.f93720Z0;
                boolean z3 = this.f93721a1;
                boolean z4 = this.f93722b1;
                boolean z5 = this.f93723c1;
                boolean z6 = this.f93724d1;
                boolean z7 = this.f93725e1;
                boolean z8 = this.f93726f1;
                boolean z9 = this.f93727g1;
                boolean z10 = this.f93728h1;
                boolean z11 = this.f93729i1;
                C11289a<C11079d2> aVar7 = this.f93730j1;
                return "Catalog(id=" + str + ", image=" + aVar + ", content=" + aVar2 + ", lozenges=" + aVar3 + ", nutriscore=" + aVar4 + ", showFrenchFlag=" + z + ", isFavorite=" + z2 + ", productQuantity=" + i + ", onAtcPressed=" + lVar + ", onDeletePressed=" + lVar2 + ", onFavPressed=" + lVar3 + ", onCardPressed=" + aVar5 + ", onMoreChoicesPressed=" + aVar6 + ", showAtcLoading=" + z3 + ", showFavoritesLoading=" + z4 + ", showDeleteLoading=" + z5 + ", isProductAvailable=" + z6 + ", isCriteoSponsored=" + z7 + ", isDeleteButtonEnabled=" + z8 + ", hasMultipleOffers=" + z9 + ", isInBottomSheet=" + z10 + ", showAntiInflationButton=" + z11 + ", onAntiInflationClick=" + aVar7 + ")";
            }

            /* renamed from: u */
            public boolean mo113714u() {
                return this.f93726f1;
            }

            /* renamed from: v */
            public boolean mo113715v() {
                return this.f93714T0;
            }

            /* renamed from: w */
            public boolean mo113716w() {
                return this.f93728h1;
            }

            /* renamed from: x */
            public boolean mo113717x() {
                return this.f93724d1;
            }

            @C12579k
            /* renamed from: y */
            public final String mo113744y() {
                return this.f93708N0;
            }

            @C12580l
            /* renamed from: z */
            public final C11300l<C37133a, C11079d2> mo113745z() {
                return this.f93717W0;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37339a(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37306a aVar2, @C12579k LozengeListComponent.C37381a aVar3, @C12580l NutriscoreComponent.C37157a aVar4, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar5, @C12580l C11289a<C11079d2> aVar6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar7) {
                super(str, aVar, aVar2, aVar3, aVar4, z, z2, i, lVar, lVar2, lVar3, aVar5, aVar6, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar7, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(aVar2, "content");
                Intrinsics.checkNotNullParameter(aVar3, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                this.f93708N0 = str;
                this.f93709O0 = aVar;
                this.f93710P0 = aVar2;
                this.f93711Q0 = aVar3;
                this.f93712R0 = aVar4;
                this.f93713S0 = z;
                this.f93714T0 = z2;
                this.f93715U0 = i;
                this.f93716V0 = lVar;
                this.f93717W0 = lVar2;
                this.f93718X0 = lVar3;
                this.f93719Y0 = aVar5;
                this.f93720Z0 = aVar6;
                this.f93721a1 = z3;
                this.f93722b1 = z4;
                this.f93723c1 = z5;
                this.f93724d1 = z6;
                this.f93725e1 = z7;
                this.f93726f1 = z8;
                this.f93727g1 = z9;
                this.f93728h1 = z10;
                this.f93729i1 = z11;
                this.f93730j1 = aVar7;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$b */
        public static final class C37340b extends C37338a {

            /* renamed from: k1 */
            public static final int f93731k1 = 8;
            @C12579k

            /* renamed from: N0 */
            public final String f93732N0;
            @C12579k

            /* renamed from: O0 */
            public final ImageComponent.C37313a f93733O0;
            @C12579k

            /* renamed from: P0 */
            public final ContentComponent.C37305a.C37307b f93734P0;
            @C12579k

            /* renamed from: Q0 */
            public final LozengeListComponent.C37381a f93735Q0;
            @C12580l

            /* renamed from: R0 */
            public final NutriscoreComponent.C37157a f93736R0;

            /* renamed from: S0 */
            public final boolean f93737S0;

            /* renamed from: T0 */
            public final boolean f93738T0;

            /* renamed from: U0 */
            public final int f93739U0;
            @C12579k

            /* renamed from: V0 */
            public final C11300l<C37133a, C11079d2> f93740V0;
            @C12580l

            /* renamed from: W0 */
            public final C11300l<C37133a, C11079d2> f93741W0;
            @C12579k

            /* renamed from: X0 */
            public final C11300l<C37133a, C11079d2> f93742X0;
            @C12580l

            /* renamed from: Y0 */
            public final C11289a<C11079d2> f93743Y0;
            @C12580l

            /* renamed from: Z0 */
            public final C11289a<C11079d2> f93744Z0;

            /* renamed from: a1 */
            public final boolean f93745a1;

            /* renamed from: b1 */
            public final boolean f93746b1;

            /* renamed from: c1 */
            public final boolean f93747c1;

            /* renamed from: d1 */
            public final boolean f93748d1;

            /* renamed from: e1 */
            public final boolean f93749e1;

            /* renamed from: f1 */
            public final boolean f93750f1;

            /* renamed from: g1 */
            public final boolean f93751g1;

            /* renamed from: h1 */
            public final boolean f93752h1;

            /* renamed from: i1 */
            public final boolean f93753i1;
            @C12580l

            /* renamed from: j1 */
            public final C11289a<C11079d2> f93754j1;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C37340b(java.lang.String r28, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r29, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37307b r30, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r31, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r32, boolean r33, boolean r34, int r35, kotlin.jvm.functions.C11300l r36, kotlin.jvm.functions.C11300l r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11289a r39, kotlin.jvm.functions.C11289a r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.C11289a r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
                /*
                    r27 = this;
                    r0 = r51
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r8 = r2
                    goto L_0x000b
                L_0x0009:
                    r8 = r32
                L_0x000b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0011
                    r13 = r2
                    goto L_0x0013
                L_0x0011:
                    r13 = r37
                L_0x0013:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0019
                    r15 = r2
                    goto L_0x001b
                L_0x0019:
                    r15 = r39
                L_0x001b:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x0022
                    r16 = r2
                    goto L_0x0024
                L_0x0022:
                    r16 = r40
                L_0x0024:
                    r1 = 65536(0x10000, float:9.18355E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x002d
                    r1 = 1
                    r20 = r1
                    goto L_0x002f
                L_0x002d:
                    r20 = r44
                L_0x002f:
                    r1 = 131072(0x20000, float:1.83671E-40)
                    r1 = r1 & r0
                    r3 = 0
                    if (r1 == 0) goto L_0x0038
                    r21 = r3
                    goto L_0x003a
                L_0x0038:
                    r21 = r45
                L_0x003a:
                    r1 = 524288(0x80000, float:7.34684E-40)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0042
                    r23 = r3
                    goto L_0x0044
                L_0x0042:
                    r23 = r47
                L_0x0044:
                    r1 = 1048576(0x100000, float:1.469368E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x004c
                    r24 = r3
                    goto L_0x004e
                L_0x004c:
                    r24 = r48
                L_0x004e:
                    r1 = 2097152(0x200000, float:2.938736E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0056
                    r25 = r3
                    goto L_0x0058
                L_0x0056:
                    r25 = r49
                L_0x0058:
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 & r1
                    if (r0 == 0) goto L_0x0060
                    r26 = r2
                    goto L_0x0062
                L_0x0060:
                    r26 = r50
                L_0x0062:
                    r3 = r27
                    r4 = r28
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r9 = r33
                    r10 = r34
                    r11 = r35
                    r12 = r36
                    r14 = r38
                    r17 = r41
                    r18 = r42
                    r19 = r43
                    r22 = r46
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37340b.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$b, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: W */
            public static /* synthetic */ C37340b m153233W(C37340b bVar, String str, ImageComponent.C37313a aVar, ContentComponent.C37305a.C37307b bVar2, LozengeListComponent.C37381a aVar2, NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar4, C11289a aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar6, int i2, Object obj) {
                C37340b bVar3 = bVar;
                int i3 = i2;
                return bVar.mo113767V((i3 & 1) != 0 ? bVar3.f93732N0 : str, (i3 & 2) != 0 ? bVar3.f93733O0 : aVar, (i3 & 4) != 0 ? bVar3.f93734P0 : bVar2, (i3 & 8) != 0 ? bVar3.f93735Q0 : aVar2, (i3 & 16) != 0 ? bVar3.f93736R0 : aVar3, (i3 & 32) != 0 ? bVar3.f93737S0 : z, (i3 & 64) != 0 ? bVar3.f93738T0 : z2, (i3 & 128) != 0 ? bVar3.f93739U0 : i, (i3 & 256) != 0 ? bVar3.f93740V0 : lVar, (i3 & 512) != 0 ? bVar3.f93741W0 : lVar2, (i3 & 1024) != 0 ? bVar3.f93742X0 : lVar3, (i3 & 2048) != 0 ? bVar3.f93743Y0 : aVar4, (i3 & 4096) != 0 ? bVar3.f93744Z0 : aVar5, (i3 & 8192) != 0 ? bVar3.f93745a1 : z3, (i3 & 16384) != 0 ? bVar3.f93746b1 : z4, (i3 & 32768) != 0 ? bVar3.f93747c1 : z5, (i3 & 65536) != 0 ? bVar3.f93748d1 : z6, (i3 & 131072) != 0 ? bVar3.f93749e1 : z7, (i3 & 262144) != 0 ? bVar3.f93750f1 : z8, (i3 & 524288) != 0 ? bVar3.f93751g1 : z9, (i3 & 1048576) != 0 ? bVar3.f93752h1 : z10, (i3 & 2097152) != 0 ? bVar3.f93753i1 : z11, (i3 & 4194304) != 0 ? bVar3.f93754j1 : aVar6);
            }

            @C12579k
            /* renamed from: A */
            public final C11300l<C37133a, C11079d2> mo113746A() {
                return this.f93742X0;
            }

            @C12580l
            /* renamed from: B */
            public final C11289a<C11079d2> mo113747B() {
                return this.f93743Y0;
            }

            @C12580l
            /* renamed from: C */
            public final C11289a<C11079d2> mo113748C() {
                return this.f93744Z0;
            }

            /* renamed from: D */
            public final boolean mo113749D() {
                return this.f93745a1;
            }

            /* renamed from: E */
            public final boolean mo113750E() {
                return this.f93746b1;
            }

            /* renamed from: F */
            public final boolean mo113751F() {
                return this.f93747c1;
            }

            /* renamed from: G */
            public final boolean mo113752G() {
                return this.f93748d1;
            }

            /* renamed from: H */
            public final boolean mo113753H() {
                return this.f93749e1;
            }

            /* renamed from: I */
            public final boolean mo113754I() {
                return this.f93750f1;
            }

            @C12579k
            /* renamed from: J */
            public final ImageComponent.C37313a mo113755J() {
                return this.f93733O0;
            }

            /* renamed from: K */
            public final boolean mo113756K() {
                return this.f93751g1;
            }

            /* renamed from: L */
            public final boolean mo113757L() {
                return this.f93752h1;
            }

            /* renamed from: M */
            public final boolean mo113758M() {
                return this.f93753i1;
            }

            @C12580l
            /* renamed from: N */
            public final C11289a<C11079d2> mo113759N() {
                return this.f93754j1;
            }

            @C12579k
            /* renamed from: O */
            public final ContentComponent.C37305a.C37307b mo113760O() {
                return this.f93734P0;
            }

            @C12579k
            /* renamed from: P */
            public final LozengeListComponent.C37381a mo113761P() {
                return this.f93735Q0;
            }

            @C12580l
            /* renamed from: Q */
            public final NutriscoreComponent.C37157a mo113762Q() {
                return this.f93736R0;
            }

            /* renamed from: R */
            public final boolean mo113763R() {
                return this.f93737S0;
            }

            /* renamed from: S */
            public final boolean mo113764S() {
                return this.f93738T0;
            }

            /* renamed from: T */
            public final int mo113765T() {
                return this.f93739U0;
            }

            @C12579k
            /* renamed from: U */
            public final C11300l<C37133a, C11079d2> mo113766U() {
                return this.f93740V0;
            }

            @C12579k
            /* renamed from: V */
            public final C37340b mo113767V(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37307b bVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(bVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                return new C37340b(str2, aVar, bVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6);
            }

            @C12579k
            /* renamed from: X */
            public ContentComponent.C37305a.C37307b mo113695b() {
                return this.f93734P0;
            }

            /* renamed from: c */
            public boolean mo113696c() {
                return this.f93751g1;
            }

            @C12579k
            /* renamed from: d */
            public String mo113697d() {
                return this.f93732N0;
            }

            @C12579k
            /* renamed from: e */
            public ImageComponent.C37313a mo113698e() {
                return this.f93733O0;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37340b)) {
                    return false;
                }
                C37340b bVar = (C37340b) obj;
                return Intrinsics.areEqual((Object) this.f93732N0, (Object) bVar.f93732N0) && Intrinsics.areEqual((Object) this.f93733O0, (Object) bVar.f93733O0) && Intrinsics.areEqual((Object) this.f93734P0, (Object) bVar.f93734P0) && Intrinsics.areEqual((Object) this.f93735Q0, (Object) bVar.f93735Q0) && Intrinsics.areEqual((Object) this.f93736R0, (Object) bVar.f93736R0) && this.f93737S0 == bVar.f93737S0 && this.f93738T0 == bVar.f93738T0 && this.f93739U0 == bVar.f93739U0 && Intrinsics.areEqual((Object) this.f93740V0, (Object) bVar.f93740V0) && Intrinsics.areEqual((Object) this.f93741W0, (Object) bVar.f93741W0) && Intrinsics.areEqual((Object) this.f93742X0, (Object) bVar.f93742X0) && Intrinsics.areEqual((Object) this.f93743Y0, (Object) bVar.f93743Y0) && Intrinsics.areEqual((Object) this.f93744Z0, (Object) bVar.f93744Z0) && this.f93745a1 == bVar.f93745a1 && this.f93746b1 == bVar.f93746b1 && this.f93747c1 == bVar.f93747c1 && this.f93748d1 == bVar.f93748d1 && this.f93749e1 == bVar.f93749e1 && this.f93750f1 == bVar.f93750f1 && this.f93751g1 == bVar.f93751g1 && this.f93752h1 == bVar.f93752h1 && this.f93753i1 == bVar.f93753i1 && Intrinsics.areEqual((Object) this.f93754j1, (Object) bVar.f93754j1);
            }

            @C12579k
            /* renamed from: f */
            public LozengeListComponent.C37381a mo113699f() {
                return this.f93735Q0;
            }

            @C12580l
            /* renamed from: g */
            public NutriscoreComponent.C37157a mo113700g() {
                return this.f93736R0;
            }

            @C12580l
            /* renamed from: h */
            public C11289a<C11079d2> mo113701h() {
                return this.f93754j1;
            }

            public int hashCode() {
                int hashCode = ((((((this.f93732N0.hashCode() * 31) + this.f93733O0.hashCode()) * 31) + this.f93734P0.hashCode()) * 31) + this.f93735Q0.hashCode()) * 31;
                NutriscoreComponent.C37157a aVar = this.f93736R0;
                int i = 0;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                boolean z = this.f93737S0;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f93738T0;
                if (z3) {
                    z3 = true;
                }
                int hashCode3 = (((((i2 + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f93739U0)) * 31) + this.f93740V0.hashCode()) * 31;
                C11300l<C37133a, C11079d2> lVar = this.f93741W0;
                int hashCode4 = (((hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f93742X0.hashCode()) * 31;
                C11289a<C11079d2> aVar2 = this.f93743Y0;
                int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                C11289a<C11079d2> aVar3 = this.f93744Z0;
                int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                boolean z4 = this.f93745a1;
                if (z4) {
                    z4 = true;
                }
                int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
                boolean z5 = this.f93746b1;
                if (z5) {
                    z5 = true;
                }
                int i4 = (i3 + (z5 ? 1 : 0)) * 31;
                boolean z6 = this.f93747c1;
                if (z6) {
                    z6 = true;
                }
                int i5 = (i4 + (z6 ? 1 : 0)) * 31;
                boolean z7 = this.f93748d1;
                if (z7) {
                    z7 = true;
                }
                int i6 = (i5 + (z7 ? 1 : 0)) * 31;
                boolean z8 = this.f93749e1;
                if (z8) {
                    z8 = true;
                }
                int i7 = (i6 + (z8 ? 1 : 0)) * 31;
                boolean z9 = this.f93750f1;
                if (z9) {
                    z9 = true;
                }
                int i8 = (i7 + (z9 ? 1 : 0)) * 31;
                boolean z10 = this.f93751g1;
                if (z10) {
                    z10 = true;
                }
                int i9 = (i8 + (z10 ? 1 : 0)) * 31;
                boolean z11 = this.f93752h1;
                if (z11) {
                    z11 = true;
                }
                int i10 = (i9 + (z11 ? 1 : 0)) * 31;
                boolean z12 = this.f93753i1;
                if (!z12) {
                    z2 = z12;
                }
                int i11 = (i10 + (z2 ? 1 : 0)) * 31;
                C11289a<C11079d2> aVar4 = this.f93754j1;
                if (aVar4 != null) {
                    i = aVar4.hashCode();
                }
                return i11 + i;
            }

            @C12579k
            /* renamed from: i */
            public C11300l<C37133a, C11079d2> mo113702i() {
                return this.f93740V0;
            }

            @C12580l
            /* renamed from: j */
            public C11289a<C11079d2> mo113703j() {
                return this.f93743Y0;
            }

            @C12580l
            /* renamed from: k */
            public C11300l<C37133a, C11079d2> mo113704k() {
                return this.f93741W0;
            }

            @C12579k
            /* renamed from: l */
            public C11300l<C37133a, C11079d2> mo113705l() {
                return this.f93742X0;
            }

            @C12580l
            /* renamed from: m */
            public C11289a<C11079d2> mo113706m() {
                return this.f93744Z0;
            }

            /* renamed from: n */
            public int mo113707n() {
                return this.f93739U0;
            }

            /* renamed from: o */
            public boolean mo113708o() {
                return this.f93753i1;
            }

            /* renamed from: p */
            public boolean mo113709p() {
                return this.f93745a1;
            }

            /* renamed from: q */
            public boolean mo113710q() {
                return this.f93747c1;
            }

            /* renamed from: r */
            public boolean mo113711r() {
                return this.f93746b1;
            }

            /* renamed from: s */
            public boolean mo113712s() {
                return this.f93737S0;
            }

            /* renamed from: t */
            public boolean mo113713t() {
                return this.f93749e1;
            }

            @C12579k
            public String toString() {
                String str = this.f93732N0;
                ImageComponent.C37313a aVar = this.f93733O0;
                ContentComponent.C37305a.C37307b bVar = this.f93734P0;
                LozengeListComponent.C37381a aVar2 = this.f93735Q0;
                NutriscoreComponent.C37157a aVar3 = this.f93736R0;
                boolean z = this.f93737S0;
                boolean z2 = this.f93738T0;
                int i = this.f93739U0;
                C11300l<C37133a, C11079d2> lVar = this.f93740V0;
                C11300l<C37133a, C11079d2> lVar2 = this.f93741W0;
                C11300l<C37133a, C11079d2> lVar3 = this.f93742X0;
                C11289a<C11079d2> aVar4 = this.f93743Y0;
                C11289a<C11079d2> aVar5 = this.f93744Z0;
                boolean z3 = this.f93745a1;
                boolean z4 = this.f93746b1;
                boolean z5 = this.f93747c1;
                boolean z6 = this.f93748d1;
                boolean z7 = this.f93749e1;
                boolean z8 = this.f93750f1;
                boolean z9 = this.f93751g1;
                boolean z10 = this.f93752h1;
                boolean z11 = this.f93753i1;
                C11289a<C11079d2> aVar6 = this.f93754j1;
                return "ImmediateDiscount(id=" + str + ", image=" + aVar + ", content=" + bVar + ", lozenges=" + aVar2 + ", nutriscore=" + aVar3 + ", showFrenchFlag=" + z + ", isFavorite=" + z2 + ", productQuantity=" + i + ", onAtcPressed=" + lVar + ", onDeletePressed=" + lVar2 + ", onFavPressed=" + lVar3 + ", onCardPressed=" + aVar4 + ", onMoreChoicesPressed=" + aVar5 + ", showAtcLoading=" + z3 + ", showFavoritesLoading=" + z4 + ", showDeleteLoading=" + z5 + ", isProductAvailable=" + z6 + ", isCriteoSponsored=" + z7 + ", isDeleteButtonEnabled=" + z8 + ", hasMultipleOffers=" + z9 + ", isInBottomSheet=" + z10 + ", showAntiInflationButton=" + z11 + ", onAntiInflationClick=" + aVar6 + ")";
            }

            /* renamed from: u */
            public boolean mo113714u() {
                return this.f93750f1;
            }

            /* renamed from: v */
            public boolean mo113715v() {
                return this.f93738T0;
            }

            /* renamed from: w */
            public boolean mo113716w() {
                return this.f93752h1;
            }

            /* renamed from: x */
            public boolean mo113717x() {
                return this.f93748d1;
            }

            @C12579k
            /* renamed from: y */
            public final String mo113772y() {
                return this.f93732N0;
            }

            @C12580l
            /* renamed from: z */
            public final C11300l<C37133a, C11079d2> mo113773z() {
                return this.f93741W0;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37340b(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37307b bVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                super(str, aVar, bVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(bVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                this.f93732N0 = str;
                this.f93733O0 = aVar;
                this.f93734P0 = bVar;
                this.f93735Q0 = aVar2;
                this.f93736R0 = aVar3;
                this.f93737S0 = z;
                this.f93738T0 = z2;
                this.f93739U0 = i;
                this.f93740V0 = lVar;
                this.f93741W0 = lVar2;
                this.f93742X0 = lVar3;
                this.f93743Y0 = aVar4;
                this.f93744Z0 = aVar5;
                this.f93745a1 = z3;
                this.f93746b1 = z4;
                this.f93747c1 = z5;
                this.f93748d1 = z6;
                this.f93749e1 = z7;
                this.f93750f1 = z8;
                this.f93751g1 = z9;
                this.f93752h1 = z10;
                this.f93753i1 = z11;
                this.f93754j1 = aVar6;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$c */
        public static final class C37341c extends C37338a {

            /* renamed from: k1 */
            public static final int f93755k1 = 8;
            @C12579k

            /* renamed from: N0 */
            public final String f93756N0;
            @C12579k

            /* renamed from: O0 */
            public final ImageComponent.C37313a f93757O0;
            @C12579k

            /* renamed from: P0 */
            public final ContentComponent.C37305a.C37308c f93758P0;
            @C12579k

            /* renamed from: Q0 */
            public final LozengeListComponent.C37381a f93759Q0;
            @C12580l

            /* renamed from: R0 */
            public final NutriscoreComponent.C37157a f93760R0;

            /* renamed from: S0 */
            public final boolean f93761S0;

            /* renamed from: T0 */
            public final boolean f93762T0;

            /* renamed from: U0 */
            public final int f93763U0;
            @C12579k

            /* renamed from: V0 */
            public final C11300l<C37133a, C11079d2> f93764V0;
            @C12580l

            /* renamed from: W0 */
            public final C11300l<C37133a, C11079d2> f93765W0;
            @C12579k

            /* renamed from: X0 */
            public final C11300l<C37133a, C11079d2> f93766X0;
            @C12580l

            /* renamed from: Y0 */
            public final C11289a<C11079d2> f93767Y0;
            @C12580l

            /* renamed from: Z0 */
            public final C11289a<C11079d2> f93768Z0;

            /* renamed from: a1 */
            public final boolean f93769a1;

            /* renamed from: b1 */
            public final boolean f93770b1;

            /* renamed from: c1 */
            public final boolean f93771c1;

            /* renamed from: d1 */
            public final boolean f93772d1;

            /* renamed from: e1 */
            public final boolean f93773e1;

            /* renamed from: f1 */
            public final boolean f93774f1;

            /* renamed from: g1 */
            public final boolean f93775g1;

            /* renamed from: h1 */
            public final boolean f93776h1;

            /* renamed from: i1 */
            public final boolean f93777i1;
            @C12580l

            /* renamed from: j1 */
            public final C11289a<C11079d2> f93778j1;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C37341c(java.lang.String r28, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r29, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37308c r30, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r31, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r32, boolean r33, boolean r34, int r35, kotlin.jvm.functions.C11300l r36, kotlin.jvm.functions.C11300l r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11289a r39, kotlin.jvm.functions.C11289a r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.C11289a r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
                /*
                    r27 = this;
                    r0 = r51
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r8 = r2
                    goto L_0x000b
                L_0x0009:
                    r8 = r32
                L_0x000b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0011
                    r13 = r2
                    goto L_0x0013
                L_0x0011:
                    r13 = r37
                L_0x0013:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0019
                    r15 = r2
                    goto L_0x001b
                L_0x0019:
                    r15 = r39
                L_0x001b:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x0022
                    r16 = r2
                    goto L_0x0024
                L_0x0022:
                    r16 = r40
                L_0x0024:
                    r1 = 65536(0x10000, float:9.18355E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x002d
                    r1 = 1
                    r20 = r1
                    goto L_0x002f
                L_0x002d:
                    r20 = r44
                L_0x002f:
                    r1 = 131072(0x20000, float:1.83671E-40)
                    r1 = r1 & r0
                    r3 = 0
                    if (r1 == 0) goto L_0x0038
                    r21 = r3
                    goto L_0x003a
                L_0x0038:
                    r21 = r45
                L_0x003a:
                    r1 = 524288(0x80000, float:7.34684E-40)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0042
                    r23 = r3
                    goto L_0x0044
                L_0x0042:
                    r23 = r47
                L_0x0044:
                    r1 = 1048576(0x100000, float:1.469368E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x004c
                    r24 = r3
                    goto L_0x004e
                L_0x004c:
                    r24 = r48
                L_0x004e:
                    r1 = 2097152(0x200000, float:2.938736E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0056
                    r25 = r3
                    goto L_0x0058
                L_0x0056:
                    r25 = r49
                L_0x0058:
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 & r1
                    if (r0 == 0) goto L_0x0060
                    r26 = r2
                    goto L_0x0062
                L_0x0060:
                    r26 = r50
                L_0x0062:
                    r3 = r27
                    r4 = r28
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r9 = r33
                    r10 = r34
                    r11 = r35
                    r12 = r36
                    r14 = r38
                    r17 = r41
                    r18 = r42
                    r19 = r43
                    r22 = r46
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37341c.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$c, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: W */
            public static /* synthetic */ C37341c m153282W(C37341c cVar, String str, ImageComponent.C37313a aVar, ContentComponent.C37305a.C37308c cVar2, LozengeListComponent.C37381a aVar2, NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar4, C11289a aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar6, int i2, Object obj) {
                C37341c cVar3 = cVar;
                int i3 = i2;
                return cVar.mo113795V((i3 & 1) != 0 ? cVar3.f93756N0 : str, (i3 & 2) != 0 ? cVar3.f93757O0 : aVar, (i3 & 4) != 0 ? cVar3.f93758P0 : cVar2, (i3 & 8) != 0 ? cVar3.f93759Q0 : aVar2, (i3 & 16) != 0 ? cVar3.f93760R0 : aVar3, (i3 & 32) != 0 ? cVar3.f93761S0 : z, (i3 & 64) != 0 ? cVar3.f93762T0 : z2, (i3 & 128) != 0 ? cVar3.f93763U0 : i, (i3 & 256) != 0 ? cVar3.f93764V0 : lVar, (i3 & 512) != 0 ? cVar3.f93765W0 : lVar2, (i3 & 1024) != 0 ? cVar3.f93766X0 : lVar3, (i3 & 2048) != 0 ? cVar3.f93767Y0 : aVar4, (i3 & 4096) != 0 ? cVar3.f93768Z0 : aVar5, (i3 & 8192) != 0 ? cVar3.f93769a1 : z3, (i3 & 16384) != 0 ? cVar3.f93770b1 : z4, (i3 & 32768) != 0 ? cVar3.f93771c1 : z5, (i3 & 65536) != 0 ? cVar3.f93772d1 : z6, (i3 & 131072) != 0 ? cVar3.f93773e1 : z7, (i3 & 262144) != 0 ? cVar3.f93774f1 : z8, (i3 & 524288) != 0 ? cVar3.f93775g1 : z9, (i3 & 1048576) != 0 ? cVar3.f93776h1 : z10, (i3 & 2097152) != 0 ? cVar3.f93777i1 : z11, (i3 & 4194304) != 0 ? cVar3.f93778j1 : aVar6);
            }

            @C12579k
            /* renamed from: A */
            public final C11300l<C37133a, C11079d2> mo113774A() {
                return this.f93766X0;
            }

            @C12580l
            /* renamed from: B */
            public final C11289a<C11079d2> mo113775B() {
                return this.f93767Y0;
            }

            @C12580l
            /* renamed from: C */
            public final C11289a<C11079d2> mo113776C() {
                return this.f93768Z0;
            }

            /* renamed from: D */
            public final boolean mo113777D() {
                return this.f93769a1;
            }

            /* renamed from: E */
            public final boolean mo113778E() {
                return this.f93770b1;
            }

            /* renamed from: F */
            public final boolean mo113779F() {
                return this.f93771c1;
            }

            /* renamed from: G */
            public final boolean mo113780G() {
                return this.f93772d1;
            }

            /* renamed from: H */
            public final boolean mo113781H() {
                return this.f93773e1;
            }

            /* renamed from: I */
            public final boolean mo113782I() {
                return this.f93774f1;
            }

            @C12579k
            /* renamed from: J */
            public final ImageComponent.C37313a mo113783J() {
                return this.f93757O0;
            }

            /* renamed from: K */
            public final boolean mo113784K() {
                return this.f93775g1;
            }

            /* renamed from: L */
            public final boolean mo113785L() {
                return this.f93776h1;
            }

            /* renamed from: M */
            public final boolean mo113786M() {
                return this.f93777i1;
            }

            @C12580l
            /* renamed from: N */
            public final C11289a<C11079d2> mo113787N() {
                return this.f93778j1;
            }

            @C12579k
            /* renamed from: O */
            public final ContentComponent.C37305a.C37308c mo113788O() {
                return this.f93758P0;
            }

            @C12579k
            /* renamed from: P */
            public final LozengeListComponent.C37381a mo113789P() {
                return this.f93759Q0;
            }

            @C12580l
            /* renamed from: Q */
            public final NutriscoreComponent.C37157a mo113790Q() {
                return this.f93760R0;
            }

            /* renamed from: R */
            public final boolean mo113791R() {
                return this.f93761S0;
            }

            /* renamed from: S */
            public final boolean mo113792S() {
                return this.f93762T0;
            }

            /* renamed from: T */
            public final int mo113793T() {
                return this.f93763U0;
            }

            @C12579k
            /* renamed from: U */
            public final C11300l<C37133a, C11079d2> mo113794U() {
                return this.f93764V0;
            }

            @C12579k
            /* renamed from: V */
            public final C37341c mo113795V(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37308c cVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(cVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                return new C37341c(str2, aVar, cVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6);
            }

            @C12579k
            /* renamed from: X */
            public ContentComponent.C37305a.C37308c mo113695b() {
                return this.f93758P0;
            }

            /* renamed from: c */
            public boolean mo113696c() {
                return this.f93775g1;
            }

            @C12579k
            /* renamed from: d */
            public String mo113697d() {
                return this.f93756N0;
            }

            @C12579k
            /* renamed from: e */
            public ImageComponent.C37313a mo113698e() {
                return this.f93757O0;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37341c)) {
                    return false;
                }
                C37341c cVar = (C37341c) obj;
                return Intrinsics.areEqual((Object) this.f93756N0, (Object) cVar.f93756N0) && Intrinsics.areEqual((Object) this.f93757O0, (Object) cVar.f93757O0) && Intrinsics.areEqual((Object) this.f93758P0, (Object) cVar.f93758P0) && Intrinsics.areEqual((Object) this.f93759Q0, (Object) cVar.f93759Q0) && Intrinsics.areEqual((Object) this.f93760R0, (Object) cVar.f93760R0) && this.f93761S0 == cVar.f93761S0 && this.f93762T0 == cVar.f93762T0 && this.f93763U0 == cVar.f93763U0 && Intrinsics.areEqual((Object) this.f93764V0, (Object) cVar.f93764V0) && Intrinsics.areEqual((Object) this.f93765W0, (Object) cVar.f93765W0) && Intrinsics.areEqual((Object) this.f93766X0, (Object) cVar.f93766X0) && Intrinsics.areEqual((Object) this.f93767Y0, (Object) cVar.f93767Y0) && Intrinsics.areEqual((Object) this.f93768Z0, (Object) cVar.f93768Z0) && this.f93769a1 == cVar.f93769a1 && this.f93770b1 == cVar.f93770b1 && this.f93771c1 == cVar.f93771c1 && this.f93772d1 == cVar.f93772d1 && this.f93773e1 == cVar.f93773e1 && this.f93774f1 == cVar.f93774f1 && this.f93775g1 == cVar.f93775g1 && this.f93776h1 == cVar.f93776h1 && this.f93777i1 == cVar.f93777i1 && Intrinsics.areEqual((Object) this.f93778j1, (Object) cVar.f93778j1);
            }

            @C12579k
            /* renamed from: f */
            public LozengeListComponent.C37381a mo113699f() {
                return this.f93759Q0;
            }

            @C12580l
            /* renamed from: g */
            public NutriscoreComponent.C37157a mo113700g() {
                return this.f93760R0;
            }

            @C12580l
            /* renamed from: h */
            public C11289a<C11079d2> mo113701h() {
                return this.f93778j1;
            }

            public int hashCode() {
                int hashCode = ((((((this.f93756N0.hashCode() * 31) + this.f93757O0.hashCode()) * 31) + this.f93758P0.hashCode()) * 31) + this.f93759Q0.hashCode()) * 31;
                NutriscoreComponent.C37157a aVar = this.f93760R0;
                int i = 0;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                boolean z = this.f93761S0;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f93762T0;
                if (z3) {
                    z3 = true;
                }
                int hashCode3 = (((((i2 + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f93763U0)) * 31) + this.f93764V0.hashCode()) * 31;
                C11300l<C37133a, C11079d2> lVar = this.f93765W0;
                int hashCode4 = (((hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f93766X0.hashCode()) * 31;
                C11289a<C11079d2> aVar2 = this.f93767Y0;
                int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                C11289a<C11079d2> aVar3 = this.f93768Z0;
                int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                boolean z4 = this.f93769a1;
                if (z4) {
                    z4 = true;
                }
                int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
                boolean z5 = this.f93770b1;
                if (z5) {
                    z5 = true;
                }
                int i4 = (i3 + (z5 ? 1 : 0)) * 31;
                boolean z6 = this.f93771c1;
                if (z6) {
                    z6 = true;
                }
                int i5 = (i4 + (z6 ? 1 : 0)) * 31;
                boolean z7 = this.f93772d1;
                if (z7) {
                    z7 = true;
                }
                int i6 = (i5 + (z7 ? 1 : 0)) * 31;
                boolean z8 = this.f93773e1;
                if (z8) {
                    z8 = true;
                }
                int i7 = (i6 + (z8 ? 1 : 0)) * 31;
                boolean z9 = this.f93774f1;
                if (z9) {
                    z9 = true;
                }
                int i8 = (i7 + (z9 ? 1 : 0)) * 31;
                boolean z10 = this.f93775g1;
                if (z10) {
                    z10 = true;
                }
                int i9 = (i8 + (z10 ? 1 : 0)) * 31;
                boolean z11 = this.f93776h1;
                if (z11) {
                    z11 = true;
                }
                int i10 = (i9 + (z11 ? 1 : 0)) * 31;
                boolean z12 = this.f93777i1;
                if (!z12) {
                    z2 = z12;
                }
                int i11 = (i10 + (z2 ? 1 : 0)) * 31;
                C11289a<C11079d2> aVar4 = this.f93778j1;
                if (aVar4 != null) {
                    i = aVar4.hashCode();
                }
                return i11 + i;
            }

            @C12579k
            /* renamed from: i */
            public C11300l<C37133a, C11079d2> mo113702i() {
                return this.f93764V0;
            }

            @C12580l
            /* renamed from: j */
            public C11289a<C11079d2> mo113703j() {
                return this.f93767Y0;
            }

            @C12580l
            /* renamed from: k */
            public C11300l<C37133a, C11079d2> mo113704k() {
                return this.f93765W0;
            }

            @C12579k
            /* renamed from: l */
            public C11300l<C37133a, C11079d2> mo113705l() {
                return this.f93766X0;
            }

            @C12580l
            /* renamed from: m */
            public C11289a<C11079d2> mo113706m() {
                return this.f93768Z0;
            }

            /* renamed from: n */
            public int mo113707n() {
                return this.f93763U0;
            }

            /* renamed from: o */
            public boolean mo113708o() {
                return this.f93777i1;
            }

            /* renamed from: p */
            public boolean mo113709p() {
                return this.f93769a1;
            }

            /* renamed from: q */
            public boolean mo113710q() {
                return this.f93771c1;
            }

            /* renamed from: r */
            public boolean mo113711r() {
                return this.f93770b1;
            }

            /* renamed from: s */
            public boolean mo113712s() {
                return this.f93761S0;
            }

            /* renamed from: t */
            public boolean mo113713t() {
                return this.f93773e1;
            }

            @C12579k
            public String toString() {
                String str = this.f93756N0;
                ImageComponent.C37313a aVar = this.f93757O0;
                ContentComponent.C37305a.C37308c cVar = this.f93758P0;
                LozengeListComponent.C37381a aVar2 = this.f93759Q0;
                NutriscoreComponent.C37157a aVar3 = this.f93760R0;
                boolean z = this.f93761S0;
                boolean z2 = this.f93762T0;
                int i = this.f93763U0;
                C11300l<C37133a, C11079d2> lVar = this.f93764V0;
                C11300l<C37133a, C11079d2> lVar2 = this.f93765W0;
                C11300l<C37133a, C11079d2> lVar3 = this.f93766X0;
                C11289a<C11079d2> aVar4 = this.f93767Y0;
                C11289a<C11079d2> aVar5 = this.f93768Z0;
                boolean z3 = this.f93769a1;
                boolean z4 = this.f93770b1;
                boolean z5 = this.f93771c1;
                boolean z6 = this.f93772d1;
                boolean z7 = this.f93773e1;
                boolean z8 = this.f93774f1;
                boolean z9 = this.f93775g1;
                boolean z10 = this.f93776h1;
                boolean z11 = this.f93777i1;
                C11289a<C11079d2> aVar6 = this.f93778j1;
                return "Loyalty(id=" + str + ", image=" + aVar + ", content=" + cVar + ", lozenges=" + aVar2 + ", nutriscore=" + aVar3 + ", showFrenchFlag=" + z + ", isFavorite=" + z2 + ", productQuantity=" + i + ", onAtcPressed=" + lVar + ", onDeletePressed=" + lVar2 + ", onFavPressed=" + lVar3 + ", onCardPressed=" + aVar4 + ", onMoreChoicesPressed=" + aVar5 + ", showAtcLoading=" + z3 + ", showFavoritesLoading=" + z4 + ", showDeleteLoading=" + z5 + ", isProductAvailable=" + z6 + ", isCriteoSponsored=" + z7 + ", isDeleteButtonEnabled=" + z8 + ", hasMultipleOffers=" + z9 + ", isInBottomSheet=" + z10 + ", showAntiInflationButton=" + z11 + ", onAntiInflationClick=" + aVar6 + ")";
            }

            /* renamed from: u */
            public boolean mo113714u() {
                return this.f93774f1;
            }

            /* renamed from: v */
            public boolean mo113715v() {
                return this.f93762T0;
            }

            /* renamed from: w */
            public boolean mo113716w() {
                return this.f93776h1;
            }

            /* renamed from: x */
            public boolean mo113717x() {
                return this.f93772d1;
            }

            @C12579k
            /* renamed from: y */
            public final String mo113800y() {
                return this.f93756N0;
            }

            @C12580l
            /* renamed from: z */
            public final C11300l<C37133a, C11079d2> mo113801z() {
                return this.f93765W0;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37341c(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37308c cVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                super(str, aVar, cVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(cVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                this.f93756N0 = str;
                this.f93757O0 = aVar;
                this.f93758P0 = cVar;
                this.f93759Q0 = aVar2;
                this.f93760R0 = aVar3;
                this.f93761S0 = z;
                this.f93762T0 = z2;
                this.f93763U0 = i;
                this.f93764V0 = lVar;
                this.f93765W0 = lVar2;
                this.f93766X0 = lVar3;
                this.f93767Y0 = aVar4;
                this.f93768Z0 = aVar5;
                this.f93769a1 = z3;
                this.f93770b1 = z4;
                this.f93771c1 = z5;
                this.f93772d1 = z6;
                this.f93773e1 = z7;
                this.f93774f1 = z8;
                this.f93775g1 = z9;
                this.f93776h1 = z10;
                this.f93777i1 = z11;
                this.f93778j1 = aVar6;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$d */
        public static final class C37342d extends C37338a {

            /* renamed from: l1 */
            public static final int f93779l1 = 8;
            @C12579k

            /* renamed from: N0 */
            public final String f93780N0;
            @C12579k

            /* renamed from: O0 */
            public final ImageComponent.C37313a f93781O0;
            @C12579k

            /* renamed from: P0 */
            public final ContentComponent.C37305a.C37309d f93782P0;
            @C12579k

            /* renamed from: Q0 */
            public final LozengeListComponent.C37381a f93783Q0;
            @C12580l

            /* renamed from: R0 */
            public final NutriscoreComponent.C37157a f93784R0;

            /* renamed from: S0 */
            public final boolean f93785S0;
            @C12580l

            /* renamed from: T0 */
            public final ProductOverlayComponent.C37161b f93786T0;

            /* renamed from: U0 */
            public final boolean f93787U0;

            /* renamed from: V0 */
            public final int f93788V0;
            @C12579k

            /* renamed from: W0 */
            public final C11300l<C37133a, C11079d2> f93789W0;
            @C12580l

            /* renamed from: X0 */
            public final C11300l<C37133a, C11079d2> f93790X0;
            @C12579k

            /* renamed from: Y0 */
            public final C11300l<C37133a, C11079d2> f93791Y0;
            @C12580l

            /* renamed from: Z0 */
            public final C11289a<C11079d2> f93792Z0;
            @C12580l

            /* renamed from: a1 */
            public final C11289a<C11079d2> f93793a1;

            /* renamed from: b1 */
            public final boolean f93794b1;

            /* renamed from: c1 */
            public final boolean f93795c1;

            /* renamed from: d1 */
            public final boolean f93796d1;

            /* renamed from: e1 */
            public final boolean f93797e1;

            /* renamed from: f1 */
            public final boolean f93798f1;

            /* renamed from: g1 */
            public final boolean f93799g1;

            /* renamed from: h1 */
            public final boolean f93800h1;

            /* renamed from: i1 */
            public final boolean f93801i1;

            /* renamed from: j1 */
            public final boolean f93802j1;
            @C12580l

            /* renamed from: k1 */
            public final C11289a<C11079d2> f93803k1;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C37342d(java.lang.String r29, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r30, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37309d r31, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r32, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r33, boolean r34, com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent.C37161b r35, boolean r36, int r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11300l r39, kotlin.jvm.functions.C11300l r40, kotlin.jvm.functions.C11289a r41, kotlin.jvm.functions.C11289a r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, kotlin.jvm.functions.C11289a r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
                /*
                    r28 = this;
                    r0 = r53
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r8 = r2
                    goto L_0x000b
                L_0x0009:
                    r8 = r33
                L_0x000b:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L_0x0011
                    r14 = r2
                    goto L_0x0013
                L_0x0011:
                    r14 = r39
                L_0x0013:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x001a
                    r16 = r2
                    goto L_0x001c
                L_0x001a:
                    r16 = r41
                L_0x001c:
                    r1 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r1 == 0) goto L_0x0023
                    r17 = r2
                    goto L_0x0025
                L_0x0023:
                    r17 = r42
                L_0x0025:
                    r1 = 131072(0x20000, float:1.83671E-40)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x002e
                    r1 = 1
                    r21 = r1
                    goto L_0x0030
                L_0x002e:
                    r21 = r46
                L_0x0030:
                    r1 = 262144(0x40000, float:3.67342E-40)
                    r1 = r1 & r0
                    r3 = 0
                    if (r1 == 0) goto L_0x0039
                    r22 = r3
                    goto L_0x003b
                L_0x0039:
                    r22 = r47
                L_0x003b:
                    r1 = 1048576(0x100000, float:1.469368E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0043
                    r24 = r3
                    goto L_0x0045
                L_0x0043:
                    r24 = r49
                L_0x0045:
                    r1 = 2097152(0x200000, float:2.938736E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x004d
                    r25 = r3
                    goto L_0x004f
                L_0x004d:
                    r25 = r50
                L_0x004f:
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0057
                    r26 = r3
                    goto L_0x0059
                L_0x0057:
                    r26 = r51
                L_0x0059:
                    r1 = 8388608(0x800000, float:1.17549435E-38)
                    r0 = r0 & r1
                    if (r0 == 0) goto L_0x0061
                    r27 = r2
                    goto L_0x0063
                L_0x0061:
                    r27 = r52
                L_0x0063:
                    r3 = r28
                    r4 = r29
                    r5 = r30
                    r6 = r31
                    r7 = r32
                    r9 = r34
                    r10 = r35
                    r11 = r36
                    r12 = r37
                    r13 = r38
                    r15 = r40
                    r18 = r43
                    r19 = r44
                    r20 = r45
                    r23 = r48
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37342d.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$d, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: X */
            public static /* synthetic */ C37342d m153331X(C37342d dVar, String str, ImageComponent.C37313a aVar, ContentComponent.C37305a.C37309d dVar2, LozengeListComponent.C37381a aVar2, NutriscoreComponent.C37157a aVar3, boolean z, ProductOverlayComponent.C37161b bVar, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar4, C11289a aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar6, int i2, Object obj) {
                C37342d dVar3 = dVar;
                int i3 = i2;
                return dVar.mo113824W((i3 & 1) != 0 ? dVar3.f93780N0 : str, (i3 & 2) != 0 ? dVar3.f93781O0 : aVar, (i3 & 4) != 0 ? dVar3.f93782P0 : dVar2, (i3 & 8) != 0 ? dVar3.f93783Q0 : aVar2, (i3 & 16) != 0 ? dVar3.f93784R0 : aVar3, (i3 & 32) != 0 ? dVar3.f93785S0 : z, (i3 & 64) != 0 ? dVar3.f93786T0 : bVar, (i3 & 128) != 0 ? dVar3.f93787U0 : z2, (i3 & 256) != 0 ? dVar3.f93788V0 : i, (i3 & 512) != 0 ? dVar3.f93789W0 : lVar, (i3 & 1024) != 0 ? dVar3.f93790X0 : lVar2, (i3 & 2048) != 0 ? dVar3.f93791Y0 : lVar3, (i3 & 4096) != 0 ? dVar3.f93792Z0 : aVar4, (i3 & 8192) != 0 ? dVar3.f93793a1 : aVar5, (i3 & 16384) != 0 ? dVar3.f93794b1 : z3, (i3 & 32768) != 0 ? dVar3.f93795c1 : z4, (i3 & 65536) != 0 ? dVar3.f93796d1 : z5, (i3 & 131072) != 0 ? dVar3.f93797e1 : z6, (i3 & 262144) != 0 ? dVar3.f93798f1 : z7, (i3 & 524288) != 0 ? dVar3.f93799g1 : z8, (i3 & 1048576) != 0 ? dVar3.f93800h1 : z9, (i3 & 2097152) != 0 ? dVar3.f93801i1 : z10, (i3 & 4194304) != 0 ? dVar3.f93802j1 : z11, (i3 & 8388608) != 0 ? dVar3.f93803k1 : aVar6);
            }

            @C12580l
            /* renamed from: A */
            public final C11300l<C37133a, C11079d2> mo113802A() {
                return this.f93790X0;
            }

            @C12579k
            /* renamed from: B */
            public final C11300l<C37133a, C11079d2> mo113803B() {
                return this.f93791Y0;
            }

            @C12580l
            /* renamed from: C */
            public final C11289a<C11079d2> mo113804C() {
                return this.f93792Z0;
            }

            @C12580l
            /* renamed from: D */
            public final C11289a<C11079d2> mo113805D() {
                return this.f93793a1;
            }

            /* renamed from: E */
            public final boolean mo113806E() {
                return this.f93794b1;
            }

            /* renamed from: F */
            public final boolean mo113807F() {
                return this.f93795c1;
            }

            /* renamed from: G */
            public final boolean mo113808G() {
                return this.f93796d1;
            }

            /* renamed from: H */
            public final boolean mo113809H() {
                return this.f93797e1;
            }

            /* renamed from: I */
            public final boolean mo113810I() {
                return this.f93798f1;
            }

            @C12579k
            /* renamed from: J */
            public final ImageComponent.C37313a mo113811J() {
                return this.f93781O0;
            }

            /* renamed from: K */
            public final boolean mo113812K() {
                return this.f93799g1;
            }

            /* renamed from: L */
            public final boolean mo113813L() {
                return this.f93800h1;
            }

            /* renamed from: M */
            public final boolean mo113814M() {
                return this.f93801i1;
            }

            /* renamed from: N */
            public final boolean mo113815N() {
                return this.f93802j1;
            }

            @C12580l
            /* renamed from: O */
            public final C11289a<C11079d2> mo113816O() {
                return this.f93803k1;
            }

            @C12579k
            /* renamed from: P */
            public final ContentComponent.C37305a.C37309d mo113817P() {
                return this.f93782P0;
            }

            @C12579k
            /* renamed from: Q */
            public final LozengeListComponent.C37381a mo113818Q() {
                return this.f93783Q0;
            }

            @C12580l
            /* renamed from: R */
            public final NutriscoreComponent.C37157a mo113819R() {
                return this.f93784R0;
            }

            /* renamed from: S */
            public final boolean mo113820S() {
                return this.f93785S0;
            }

            @C12580l
            /* renamed from: T */
            public final ProductOverlayComponent.C37161b mo113821T() {
                return this.f93786T0;
            }

            /* renamed from: U */
            public final boolean mo113822U() {
                return this.f93787U0;
            }

            /* renamed from: V */
            public final int mo113823V() {
                return this.f93788V0;
            }

            @C12579k
            /* renamed from: W */
            public final C37342d mo113824W(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37309d dVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, @C12580l ProductOverlayComponent.C37161b bVar, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(dVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                return new C37342d(str2, aVar, dVar, aVar2, aVar3, z, bVar, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6);
            }

            @C12579k
            /* renamed from: Y */
            public ContentComponent.C37305a.C37309d mo113695b() {
                return this.f93782P0;
            }

            @C12580l
            /* renamed from: Z */
            public final ProductOverlayComponent.C37161b mo113826Z() {
                return this.f93786T0;
            }

            /* renamed from: c */
            public boolean mo113696c() {
                return this.f93800h1;
            }

            @C12579k
            /* renamed from: d */
            public String mo113697d() {
                return this.f93780N0;
            }

            @C12579k
            /* renamed from: e */
            public ImageComponent.C37313a mo113698e() {
                return this.f93781O0;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37342d)) {
                    return false;
                }
                C37342d dVar = (C37342d) obj;
                return Intrinsics.areEqual((Object) this.f93780N0, (Object) dVar.f93780N0) && Intrinsics.areEqual((Object) this.f93781O0, (Object) dVar.f93781O0) && Intrinsics.areEqual((Object) this.f93782P0, (Object) dVar.f93782P0) && Intrinsics.areEqual((Object) this.f93783Q0, (Object) dVar.f93783Q0) && Intrinsics.areEqual((Object) this.f93784R0, (Object) dVar.f93784R0) && this.f93785S0 == dVar.f93785S0 && Intrinsics.areEqual((Object) this.f93786T0, (Object) dVar.f93786T0) && this.f93787U0 == dVar.f93787U0 && this.f93788V0 == dVar.f93788V0 && Intrinsics.areEqual((Object) this.f93789W0, (Object) dVar.f93789W0) && Intrinsics.areEqual((Object) this.f93790X0, (Object) dVar.f93790X0) && Intrinsics.areEqual((Object) this.f93791Y0, (Object) dVar.f93791Y0) && Intrinsics.areEqual((Object) this.f93792Z0, (Object) dVar.f93792Z0) && Intrinsics.areEqual((Object) this.f93793a1, (Object) dVar.f93793a1) && this.f93794b1 == dVar.f93794b1 && this.f93795c1 == dVar.f93795c1 && this.f93796d1 == dVar.f93796d1 && this.f93797e1 == dVar.f93797e1 && this.f93798f1 == dVar.f93798f1 && this.f93799g1 == dVar.f93799g1 && this.f93800h1 == dVar.f93800h1 && this.f93801i1 == dVar.f93801i1 && this.f93802j1 == dVar.f93802j1 && Intrinsics.areEqual((Object) this.f93803k1, (Object) dVar.f93803k1);
            }

            @C12579k
            /* renamed from: f */
            public LozengeListComponent.C37381a mo113699f() {
                return this.f93783Q0;
            }

            @C12580l
            /* renamed from: g */
            public NutriscoreComponent.C37157a mo113700g() {
                return this.f93784R0;
            }

            @C12580l
            /* renamed from: h */
            public C11289a<C11079d2> mo113701h() {
                return this.f93803k1;
            }

            public int hashCode() {
                int hashCode = ((((((this.f93780N0.hashCode() * 31) + this.f93781O0.hashCode()) * 31) + this.f93782P0.hashCode()) * 31) + this.f93783Q0.hashCode()) * 31;
                NutriscoreComponent.C37157a aVar = this.f93784R0;
                int i = 0;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                boolean z = this.f93785S0;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                ProductOverlayComponent.C37161b bVar = this.f93786T0;
                int hashCode3 = (i2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                boolean z3 = this.f93787U0;
                if (z3) {
                    z3 = true;
                }
                int hashCode4 = (((((hashCode3 + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f93788V0)) * 31) + this.f93789W0.hashCode()) * 31;
                C11300l<C37133a, C11079d2> lVar = this.f93790X0;
                int hashCode5 = (((hashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f93791Y0.hashCode()) * 31;
                C11289a<C11079d2> aVar2 = this.f93792Z0;
                int hashCode6 = (hashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                C11289a<C11079d2> aVar3 = this.f93793a1;
                int hashCode7 = (hashCode6 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                boolean z4 = this.f93794b1;
                if (z4) {
                    z4 = true;
                }
                int i3 = (hashCode7 + (z4 ? 1 : 0)) * 31;
                boolean z5 = this.f93795c1;
                if (z5) {
                    z5 = true;
                }
                int i4 = (i3 + (z5 ? 1 : 0)) * 31;
                boolean z6 = this.f93796d1;
                if (z6) {
                    z6 = true;
                }
                int i5 = (i4 + (z6 ? 1 : 0)) * 31;
                boolean z7 = this.f93797e1;
                if (z7) {
                    z7 = true;
                }
                int i6 = (i5 + (z7 ? 1 : 0)) * 31;
                boolean z8 = this.f93798f1;
                if (z8) {
                    z8 = true;
                }
                int i7 = (i6 + (z8 ? 1 : 0)) * 31;
                boolean z9 = this.f93799g1;
                if (z9) {
                    z9 = true;
                }
                int i8 = (i7 + (z9 ? 1 : 0)) * 31;
                boolean z10 = this.f93800h1;
                if (z10) {
                    z10 = true;
                }
                int i9 = (i8 + (z10 ? 1 : 0)) * 31;
                boolean z11 = this.f93801i1;
                if (z11) {
                    z11 = true;
                }
                int i10 = (i9 + (z11 ? 1 : 0)) * 31;
                boolean z12 = this.f93802j1;
                if (!z12) {
                    z2 = z12;
                }
                int i11 = (i10 + (z2 ? 1 : 0)) * 31;
                C11289a<C11079d2> aVar4 = this.f93803k1;
                if (aVar4 != null) {
                    i = aVar4.hashCode();
                }
                return i11 + i;
            }

            @C12579k
            /* renamed from: i */
            public C11300l<C37133a, C11079d2> mo113702i() {
                return this.f93789W0;
            }

            @C12580l
            /* renamed from: j */
            public C11289a<C11079d2> mo113703j() {
                return this.f93792Z0;
            }

            @C12580l
            /* renamed from: k */
            public C11300l<C37133a, C11079d2> mo113704k() {
                return this.f93790X0;
            }

            @C12579k
            /* renamed from: l */
            public C11300l<C37133a, C11079d2> mo113705l() {
                return this.f93791Y0;
            }

            @C12580l
            /* renamed from: m */
            public C11289a<C11079d2> mo113706m() {
                return this.f93793a1;
            }

            /* renamed from: n */
            public int mo113707n() {
                return this.f93788V0;
            }

            /* renamed from: o */
            public boolean mo113708o() {
                return this.f93802j1;
            }

            /* renamed from: p */
            public boolean mo113709p() {
                return this.f93794b1;
            }

            /* renamed from: q */
            public boolean mo113710q() {
                return this.f93796d1;
            }

            /* renamed from: r */
            public boolean mo113711r() {
                return this.f93795c1;
            }

            /* renamed from: s */
            public boolean mo113712s() {
                return this.f93785S0;
            }

            /* renamed from: t */
            public boolean mo113713t() {
                return this.f93798f1;
            }

            @C12579k
            public String toString() {
                String str = this.f93780N0;
                ImageComponent.C37313a aVar = this.f93781O0;
                ContentComponent.C37305a.C37309d dVar = this.f93782P0;
                LozengeListComponent.C37381a aVar2 = this.f93783Q0;
                NutriscoreComponent.C37157a aVar3 = this.f93784R0;
                boolean z = this.f93785S0;
                ProductOverlayComponent.C37161b bVar = this.f93786T0;
                boolean z2 = this.f93787U0;
                int i = this.f93788V0;
                C11300l<C37133a, C11079d2> lVar = this.f93789W0;
                C11300l<C37133a, C11079d2> lVar2 = this.f93790X0;
                C11300l<C37133a, C11079d2> lVar3 = this.f93791Y0;
                C11289a<C11079d2> aVar4 = this.f93792Z0;
                C11289a<C11079d2> aVar5 = this.f93793a1;
                boolean z3 = this.f93794b1;
                boolean z4 = this.f93795c1;
                boolean z5 = this.f93796d1;
                boolean z6 = this.f93797e1;
                boolean z7 = this.f93798f1;
                boolean z8 = this.f93799g1;
                boolean z9 = this.f93800h1;
                boolean z10 = this.f93801i1;
                boolean z11 = this.f93802j1;
                C11289a<C11079d2> aVar6 = this.f93803k1;
                return "Mixture(id=" + str + ", image=" + aVar + ", content=" + dVar + ", lozenges=" + aVar2 + ", nutriscore=" + aVar3 + ", showFrenchFlag=" + z + ", mixinOverlayInfo=" + bVar + ", isFavorite=" + z2 + ", productQuantity=" + i + ", onAtcPressed=" + lVar + ", onDeletePressed=" + lVar2 + ", onFavPressed=" + lVar3 + ", onCardPressed=" + aVar4 + ", onMoreChoicesPressed=" + aVar5 + ", showAtcLoading=" + z3 + ", showFavoritesLoading=" + z4 + ", showDeleteLoading=" + z5 + ", isProductAvailable=" + z6 + ", isCriteoSponsored=" + z7 + ", isDeleteButtonEnabled=" + z8 + ", hasMultipleOffers=" + z9 + ", isInBottomSheet=" + z10 + ", showAntiInflationButton=" + z11 + ", onAntiInflationClick=" + aVar6 + ")";
            }

            /* renamed from: u */
            public boolean mo113714u() {
                return this.f93799g1;
            }

            /* renamed from: v */
            public boolean mo113715v() {
                return this.f93787U0;
            }

            /* renamed from: w */
            public boolean mo113716w() {
                return this.f93801i1;
            }

            /* renamed from: x */
            public boolean mo113717x() {
                return this.f93797e1;
            }

            @C12579k
            /* renamed from: y */
            public final String mo113830y() {
                return this.f93780N0;
            }

            @C12579k
            /* renamed from: z */
            public final C11300l<C37133a, C11079d2> mo113831z() {
                return this.f93789W0;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37342d(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37309d dVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, @C12580l ProductOverlayComponent.C37161b bVar, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                super(str, aVar, dVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(dVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                this.f93780N0 = str;
                this.f93781O0 = aVar;
                this.f93782P0 = dVar;
                this.f93783Q0 = aVar2;
                this.f93784R0 = aVar3;
                this.f93785S0 = z;
                this.f93786T0 = bVar;
                this.f93787U0 = z2;
                this.f93788V0 = i;
                this.f93789W0 = lVar;
                this.f93790X0 = lVar2;
                this.f93791Y0 = lVar3;
                this.f93792Z0 = aVar4;
                this.f93793a1 = aVar5;
                this.f93794b1 = z3;
                this.f93795c1 = z4;
                this.f93796d1 = z5;
                this.f93797e1 = z6;
                this.f93798f1 = z7;
                this.f93799g1 = z8;
                this.f93800h1 = z9;
                this.f93801i1 = z10;
                this.f93802j1 = z11;
                this.f93803k1 = aVar6;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$e */
        public static final class C37343e extends C37338a {

            /* renamed from: k1 */
            public static final int f93804k1 = 8;
            @C12579k

            /* renamed from: N0 */
            public final String f93805N0;
            @C12579k

            /* renamed from: O0 */
            public final ImageComponent.C37313a f93806O0;
            @C12579k

            /* renamed from: P0 */
            public final ContentComponent.C37305a.C37310e f93807P0;
            @C12579k

            /* renamed from: Q0 */
            public final LozengeListComponent.C37381a f93808Q0;
            @C12580l

            /* renamed from: R0 */
            public final NutriscoreComponent.C37157a f93809R0;

            /* renamed from: S0 */
            public final boolean f93810S0;

            /* renamed from: T0 */
            public final boolean f93811T0;

            /* renamed from: U0 */
            public final int f93812U0;
            @C12579k

            /* renamed from: V0 */
            public final C11300l<C37133a, C11079d2> f93813V0;
            @C12580l

            /* renamed from: W0 */
            public final C11300l<C37133a, C11079d2> f93814W0;
            @C12579k

            /* renamed from: X0 */
            public final C11300l<C37133a, C11079d2> f93815X0;
            @C12580l

            /* renamed from: Y0 */
            public final C11289a<C11079d2> f93816Y0;
            @C12580l

            /* renamed from: Z0 */
            public final C11289a<C11079d2> f93817Z0;

            /* renamed from: a1 */
            public final boolean f93818a1;

            /* renamed from: b1 */
            public final boolean f93819b1;

            /* renamed from: c1 */
            public final boolean f93820c1;

            /* renamed from: d1 */
            public final boolean f93821d1;

            /* renamed from: e1 */
            public final boolean f93822e1;

            /* renamed from: f1 */
            public final boolean f93823f1;

            /* renamed from: g1 */
            public final boolean f93824g1;

            /* renamed from: h1 */
            public final boolean f93825h1;

            /* renamed from: i1 */
            public final boolean f93826i1;
            @C12580l

            /* renamed from: j1 */
            public final C11289a<C11079d2> f93827j1;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C37343e(java.lang.String r28, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r29, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37310e r30, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r31, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r32, boolean r33, boolean r34, int r35, kotlin.jvm.functions.C11300l r36, kotlin.jvm.functions.C11300l r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11289a r39, kotlin.jvm.functions.C11289a r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.C11289a r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
                /*
                    r27 = this;
                    r0 = r51
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r8 = r2
                    goto L_0x000b
                L_0x0009:
                    r8 = r32
                L_0x000b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0011
                    r13 = r2
                    goto L_0x0013
                L_0x0011:
                    r13 = r37
                L_0x0013:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0019
                    r15 = r2
                    goto L_0x001b
                L_0x0019:
                    r15 = r39
                L_0x001b:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x0022
                    r16 = r2
                    goto L_0x0024
                L_0x0022:
                    r16 = r40
                L_0x0024:
                    r1 = 65536(0x10000, float:9.18355E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x002d
                    r1 = 1
                    r20 = r1
                    goto L_0x002f
                L_0x002d:
                    r20 = r44
                L_0x002f:
                    r1 = 131072(0x20000, float:1.83671E-40)
                    r1 = r1 & r0
                    r3 = 0
                    if (r1 == 0) goto L_0x0038
                    r21 = r3
                    goto L_0x003a
                L_0x0038:
                    r21 = r45
                L_0x003a:
                    r1 = 524288(0x80000, float:7.34684E-40)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0042
                    r23 = r3
                    goto L_0x0044
                L_0x0042:
                    r23 = r47
                L_0x0044:
                    r1 = 1048576(0x100000, float:1.469368E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x004c
                    r24 = r3
                    goto L_0x004e
                L_0x004c:
                    r24 = r48
                L_0x004e:
                    r1 = 2097152(0x200000, float:2.938736E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0056
                    r25 = r3
                    goto L_0x0058
                L_0x0056:
                    r25 = r49
                L_0x0058:
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 & r1
                    if (r0 == 0) goto L_0x0060
                    r26 = r2
                    goto L_0x0062
                L_0x0060:
                    r26 = r50
                L_0x0062:
                    r3 = r27
                    r4 = r28
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r9 = r33
                    r10 = r34
                    r11 = r35
                    r12 = r36
                    r14 = r38
                    r17 = r41
                    r18 = r42
                    r19 = r43
                    r22 = r46
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37343e.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$e, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: W */
            public static /* synthetic */ C37343e m153382W(C37343e eVar, String str, ImageComponent.C37313a aVar, ContentComponent.C37305a.C37310e eVar2, LozengeListComponent.C37381a aVar2, NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar4, C11289a aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar6, int i2, Object obj) {
                C37343e eVar3 = eVar;
                int i3 = i2;
                return eVar.mo113853V((i3 & 1) != 0 ? eVar3.f93805N0 : str, (i3 & 2) != 0 ? eVar3.f93806O0 : aVar, (i3 & 4) != 0 ? eVar3.f93807P0 : eVar2, (i3 & 8) != 0 ? eVar3.f93808Q0 : aVar2, (i3 & 16) != 0 ? eVar3.f93809R0 : aVar3, (i3 & 32) != 0 ? eVar3.f93810S0 : z, (i3 & 64) != 0 ? eVar3.f93811T0 : z2, (i3 & 128) != 0 ? eVar3.f93812U0 : i, (i3 & 256) != 0 ? eVar3.f93813V0 : lVar, (i3 & 512) != 0 ? eVar3.f93814W0 : lVar2, (i3 & 1024) != 0 ? eVar3.f93815X0 : lVar3, (i3 & 2048) != 0 ? eVar3.f93816Y0 : aVar4, (i3 & 4096) != 0 ? eVar3.f93817Z0 : aVar5, (i3 & 8192) != 0 ? eVar3.f93818a1 : z3, (i3 & 16384) != 0 ? eVar3.f93819b1 : z4, (i3 & 32768) != 0 ? eVar3.f93820c1 : z5, (i3 & 65536) != 0 ? eVar3.f93821d1 : z6, (i3 & 131072) != 0 ? eVar3.f93822e1 : z7, (i3 & 262144) != 0 ? eVar3.f93823f1 : z8, (i3 & 524288) != 0 ? eVar3.f93824g1 : z9, (i3 & 1048576) != 0 ? eVar3.f93825h1 : z10, (i3 & 2097152) != 0 ? eVar3.f93826i1 : z11, (i3 & 4194304) != 0 ? eVar3.f93827j1 : aVar6);
            }

            @C12579k
            /* renamed from: A */
            public final C11300l<C37133a, C11079d2> mo113832A() {
                return this.f93815X0;
            }

            @C12580l
            /* renamed from: B */
            public final C11289a<C11079d2> mo113833B() {
                return this.f93816Y0;
            }

            @C12580l
            /* renamed from: C */
            public final C11289a<C11079d2> mo113834C() {
                return this.f93817Z0;
            }

            /* renamed from: D */
            public final boolean mo113835D() {
                return this.f93818a1;
            }

            /* renamed from: E */
            public final boolean mo113836E() {
                return this.f93819b1;
            }

            /* renamed from: F */
            public final boolean mo113837F() {
                return this.f93820c1;
            }

            /* renamed from: G */
            public final boolean mo113838G() {
                return this.f93821d1;
            }

            /* renamed from: H */
            public final boolean mo113839H() {
                return this.f93822e1;
            }

            /* renamed from: I */
            public final boolean mo113840I() {
                return this.f93823f1;
            }

            @C12579k
            /* renamed from: J */
            public final ImageComponent.C37313a mo113841J() {
                return this.f93806O0;
            }

            /* renamed from: K */
            public final boolean mo113842K() {
                return this.f93824g1;
            }

            /* renamed from: L */
            public final boolean mo113843L() {
                return this.f93825h1;
            }

            /* renamed from: M */
            public final boolean mo113844M() {
                return this.f93826i1;
            }

            @C12580l
            /* renamed from: N */
            public final C11289a<C11079d2> mo113845N() {
                return this.f93827j1;
            }

            @C12579k
            /* renamed from: O */
            public final ContentComponent.C37305a.C37310e mo113846O() {
                return this.f93807P0;
            }

            @C12579k
            /* renamed from: P */
            public final LozengeListComponent.C37381a mo113847P() {
                return this.f93808Q0;
            }

            @C12580l
            /* renamed from: Q */
            public final NutriscoreComponent.C37157a mo113848Q() {
                return this.f93809R0;
            }

            /* renamed from: R */
            public final boolean mo113849R() {
                return this.f93810S0;
            }

            /* renamed from: S */
            public final boolean mo113850S() {
                return this.f93811T0;
            }

            /* renamed from: T */
            public final int mo113851T() {
                return this.f93812U0;
            }

            @C12579k
            /* renamed from: U */
            public final C11300l<C37133a, C11079d2> mo113852U() {
                return this.f93813V0;
            }

            @C12579k
            /* renamed from: V */
            public final C37343e mo113853V(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37310e eVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(eVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                return new C37343e(str2, aVar, eVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6);
            }

            @C12579k
            /* renamed from: X */
            public ContentComponent.C37305a.C37310e mo113695b() {
                return this.f93807P0;
            }

            /* renamed from: c */
            public boolean mo113696c() {
                return this.f93824g1;
            }

            @C12579k
            /* renamed from: d */
            public String mo113697d() {
                return this.f93805N0;
            }

            @C12579k
            /* renamed from: e */
            public ImageComponent.C37313a mo113698e() {
                return this.f93806O0;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37343e)) {
                    return false;
                }
                C37343e eVar = (C37343e) obj;
                return Intrinsics.areEqual((Object) this.f93805N0, (Object) eVar.f93805N0) && Intrinsics.areEqual((Object) this.f93806O0, (Object) eVar.f93806O0) && Intrinsics.areEqual((Object) this.f93807P0, (Object) eVar.f93807P0) && Intrinsics.areEqual((Object) this.f93808Q0, (Object) eVar.f93808Q0) && Intrinsics.areEqual((Object) this.f93809R0, (Object) eVar.f93809R0) && this.f93810S0 == eVar.f93810S0 && this.f93811T0 == eVar.f93811T0 && this.f93812U0 == eVar.f93812U0 && Intrinsics.areEqual((Object) this.f93813V0, (Object) eVar.f93813V0) && Intrinsics.areEqual((Object) this.f93814W0, (Object) eVar.f93814W0) && Intrinsics.areEqual((Object) this.f93815X0, (Object) eVar.f93815X0) && Intrinsics.areEqual((Object) this.f93816Y0, (Object) eVar.f93816Y0) && Intrinsics.areEqual((Object) this.f93817Z0, (Object) eVar.f93817Z0) && this.f93818a1 == eVar.f93818a1 && this.f93819b1 == eVar.f93819b1 && this.f93820c1 == eVar.f93820c1 && this.f93821d1 == eVar.f93821d1 && this.f93822e1 == eVar.f93822e1 && this.f93823f1 == eVar.f93823f1 && this.f93824g1 == eVar.f93824g1 && this.f93825h1 == eVar.f93825h1 && this.f93826i1 == eVar.f93826i1 && Intrinsics.areEqual((Object) this.f93827j1, (Object) eVar.f93827j1);
            }

            @C12579k
            /* renamed from: f */
            public LozengeListComponent.C37381a mo113699f() {
                return this.f93808Q0;
            }

            @C12580l
            /* renamed from: g */
            public NutriscoreComponent.C37157a mo113700g() {
                return this.f93809R0;
            }

            @C12580l
            /* renamed from: h */
            public C11289a<C11079d2> mo113701h() {
                return this.f93827j1;
            }

            public int hashCode() {
                int hashCode = ((((((this.f93805N0.hashCode() * 31) + this.f93806O0.hashCode()) * 31) + this.f93807P0.hashCode()) * 31) + this.f93808Q0.hashCode()) * 31;
                NutriscoreComponent.C37157a aVar = this.f93809R0;
                int i = 0;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                boolean z = this.f93810S0;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f93811T0;
                if (z3) {
                    z3 = true;
                }
                int hashCode3 = (((((i2 + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f93812U0)) * 31) + this.f93813V0.hashCode()) * 31;
                C11300l<C37133a, C11079d2> lVar = this.f93814W0;
                int hashCode4 = (((hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f93815X0.hashCode()) * 31;
                C11289a<C11079d2> aVar2 = this.f93816Y0;
                int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                C11289a<C11079d2> aVar3 = this.f93817Z0;
                int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                boolean z4 = this.f93818a1;
                if (z4) {
                    z4 = true;
                }
                int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
                boolean z5 = this.f93819b1;
                if (z5) {
                    z5 = true;
                }
                int i4 = (i3 + (z5 ? 1 : 0)) * 31;
                boolean z6 = this.f93820c1;
                if (z6) {
                    z6 = true;
                }
                int i5 = (i4 + (z6 ? 1 : 0)) * 31;
                boolean z7 = this.f93821d1;
                if (z7) {
                    z7 = true;
                }
                int i6 = (i5 + (z7 ? 1 : 0)) * 31;
                boolean z8 = this.f93822e1;
                if (z8) {
                    z8 = true;
                }
                int i7 = (i6 + (z8 ? 1 : 0)) * 31;
                boolean z9 = this.f93823f1;
                if (z9) {
                    z9 = true;
                }
                int i8 = (i7 + (z9 ? 1 : 0)) * 31;
                boolean z10 = this.f93824g1;
                if (z10) {
                    z10 = true;
                }
                int i9 = (i8 + (z10 ? 1 : 0)) * 31;
                boolean z11 = this.f93825h1;
                if (z11) {
                    z11 = true;
                }
                int i10 = (i9 + (z11 ? 1 : 0)) * 31;
                boolean z12 = this.f93826i1;
                if (!z12) {
                    z2 = z12;
                }
                int i11 = (i10 + (z2 ? 1 : 0)) * 31;
                C11289a<C11079d2> aVar4 = this.f93827j1;
                if (aVar4 != null) {
                    i = aVar4.hashCode();
                }
                return i11 + i;
            }

            @C12579k
            /* renamed from: i */
            public C11300l<C37133a, C11079d2> mo113702i() {
                return this.f93813V0;
            }

            @C12580l
            /* renamed from: j */
            public C11289a<C11079d2> mo113703j() {
                return this.f93816Y0;
            }

            @C12580l
            /* renamed from: k */
            public C11300l<C37133a, C11079d2> mo113704k() {
                return this.f93814W0;
            }

            @C12579k
            /* renamed from: l */
            public C11300l<C37133a, C11079d2> mo113705l() {
                return this.f93815X0;
            }

            @C12580l
            /* renamed from: m */
            public C11289a<C11079d2> mo113706m() {
                return this.f93817Z0;
            }

            /* renamed from: n */
            public int mo113707n() {
                return this.f93812U0;
            }

            /* renamed from: o */
            public boolean mo113708o() {
                return this.f93826i1;
            }

            /* renamed from: p */
            public boolean mo113709p() {
                return this.f93818a1;
            }

            /* renamed from: q */
            public boolean mo113710q() {
                return this.f93820c1;
            }

            /* renamed from: r */
            public boolean mo113711r() {
                return this.f93819b1;
            }

            /* renamed from: s */
            public boolean mo113712s() {
                return this.f93810S0;
            }

            /* renamed from: t */
            public boolean mo113713t() {
                return this.f93822e1;
            }

            @C12579k
            public String toString() {
                String str = this.f93805N0;
                ImageComponent.C37313a aVar = this.f93806O0;
                ContentComponent.C37305a.C37310e eVar = this.f93807P0;
                LozengeListComponent.C37381a aVar2 = this.f93808Q0;
                NutriscoreComponent.C37157a aVar3 = this.f93809R0;
                boolean z = this.f93810S0;
                boolean z2 = this.f93811T0;
                int i = this.f93812U0;
                C11300l<C37133a, C11079d2> lVar = this.f93813V0;
                C11300l<C37133a, C11079d2> lVar2 = this.f93814W0;
                C11300l<C37133a, C11079d2> lVar3 = this.f93815X0;
                C11289a<C11079d2> aVar4 = this.f93816Y0;
                C11289a<C11079d2> aVar5 = this.f93817Z0;
                boolean z3 = this.f93818a1;
                boolean z4 = this.f93819b1;
                boolean z5 = this.f93820c1;
                boolean z6 = this.f93821d1;
                boolean z7 = this.f93822e1;
                boolean z8 = this.f93823f1;
                boolean z9 = this.f93824g1;
                boolean z10 = this.f93825h1;
                boolean z11 = this.f93826i1;
                C11289a<C11079d2> aVar6 = this.f93827j1;
                return "Offer(id=" + str + ", image=" + aVar + ", content=" + eVar + ", lozenges=" + aVar2 + ", nutriscore=" + aVar3 + ", showFrenchFlag=" + z + ", isFavorite=" + z2 + ", productQuantity=" + i + ", onAtcPressed=" + lVar + ", onDeletePressed=" + lVar2 + ", onFavPressed=" + lVar3 + ", onCardPressed=" + aVar4 + ", onMoreChoicesPressed=" + aVar5 + ", showAtcLoading=" + z3 + ", showFavoritesLoading=" + z4 + ", showDeleteLoading=" + z5 + ", isProductAvailable=" + z6 + ", isCriteoSponsored=" + z7 + ", isDeleteButtonEnabled=" + z8 + ", hasMultipleOffers=" + z9 + ", isInBottomSheet=" + z10 + ", showAntiInflationButton=" + z11 + ", onAntiInflationClick=" + aVar6 + ")";
            }

            /* renamed from: u */
            public boolean mo113714u() {
                return this.f93823f1;
            }

            /* renamed from: v */
            public boolean mo113715v() {
                return this.f93811T0;
            }

            /* renamed from: w */
            public boolean mo113716w() {
                return this.f93825h1;
            }

            /* renamed from: x */
            public boolean mo113717x() {
                return this.f93821d1;
            }

            @C12579k
            /* renamed from: y */
            public final String mo113858y() {
                return this.f93805N0;
            }

            @C12580l
            /* renamed from: z */
            public final C11300l<C37133a, C11079d2> mo113859z() {
                return this.f93814W0;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37343e(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37310e eVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                super(str, aVar, eVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(eVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                this.f93805N0 = str;
                this.f93806O0 = aVar;
                this.f93807P0 = eVar;
                this.f93808Q0 = aVar2;
                this.f93809R0 = aVar3;
                this.f93810S0 = z;
                this.f93811T0 = z2;
                this.f93812U0 = i;
                this.f93813V0 = lVar;
                this.f93814W0 = lVar2;
                this.f93815X0 = lVar3;
                this.f93816Y0 = aVar4;
                this.f93817Z0 = aVar5;
                this.f93818a1 = z3;
                this.f93819b1 = z4;
                this.f93820c1 = z5;
                this.f93821d1 = z6;
                this.f93822e1 = z7;
                this.f93823f1 = z8;
                this.f93824g1 = z9;
                this.f93825h1 = z10;
                this.f93826i1 = z11;
                this.f93827j1 = aVar6;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$f */
        public static final class C37344f extends C37338a {

            /* renamed from: k1 */
            public static final int f93828k1 = 8;
            @C12579k

            /* renamed from: N0 */
            public final String f93829N0;
            @C12579k

            /* renamed from: O0 */
            public final ImageComponent.C37313a f93830O0;
            @C12579k

            /* renamed from: P0 */
            public final ContentComponent.C37305a.C37311f f93831P0;
            @C12579k

            /* renamed from: Q0 */
            public final LozengeListComponent.C37381a f93832Q0;
            @C12580l

            /* renamed from: R0 */
            public final NutriscoreComponent.C37157a f93833R0;

            /* renamed from: S0 */
            public final boolean f93834S0;

            /* renamed from: T0 */
            public final boolean f93835T0;

            /* renamed from: U0 */
            public final int f93836U0;
            @C12579k

            /* renamed from: V0 */
            public final C11300l<C37133a, C11079d2> f93837V0;
            @C12580l

            /* renamed from: W0 */
            public final C11300l<C37133a, C11079d2> f93838W0;
            @C12579k

            /* renamed from: X0 */
            public final C11300l<C37133a, C11079d2> f93839X0;
            @C12580l

            /* renamed from: Y0 */
            public final C11289a<C11079d2> f93840Y0;
            @C12580l

            /* renamed from: Z0 */
            public final C11289a<C11079d2> f93841Z0;

            /* renamed from: a1 */
            public final boolean f93842a1;

            /* renamed from: b1 */
            public final boolean f93843b1;

            /* renamed from: c1 */
            public final boolean f93844c1;

            /* renamed from: d1 */
            public final boolean f93845d1;

            /* renamed from: e1 */
            public final boolean f93846e1;

            /* renamed from: f1 */
            public final boolean f93847f1;

            /* renamed from: g1 */
            public final boolean f93848g1;

            /* renamed from: h1 */
            public final boolean f93849h1;

            /* renamed from: i1 */
            public final boolean f93850i1;
            @C12580l

            /* renamed from: j1 */
            public final C11289a<C11079d2> f93851j1;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C37344f(java.lang.String r28, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r29, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37311f r30, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r31, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r32, boolean r33, boolean r34, int r35, kotlin.jvm.functions.C11300l r36, kotlin.jvm.functions.C11300l r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11289a r39, kotlin.jvm.functions.C11289a r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.C11289a r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
                /*
                    r27 = this;
                    r0 = r51
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r8 = r2
                    goto L_0x000b
                L_0x0009:
                    r8 = r32
                L_0x000b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0011
                    r13 = r2
                    goto L_0x0013
                L_0x0011:
                    r13 = r37
                L_0x0013:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0019
                    r15 = r2
                    goto L_0x001b
                L_0x0019:
                    r15 = r39
                L_0x001b:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x0022
                    r16 = r2
                    goto L_0x0024
                L_0x0022:
                    r16 = r40
                L_0x0024:
                    r1 = 65536(0x10000, float:9.18355E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x002d
                    r1 = 1
                    r20 = r1
                    goto L_0x002f
                L_0x002d:
                    r20 = r44
                L_0x002f:
                    r1 = 131072(0x20000, float:1.83671E-40)
                    r1 = r1 & r0
                    r3 = 0
                    if (r1 == 0) goto L_0x0038
                    r21 = r3
                    goto L_0x003a
                L_0x0038:
                    r21 = r45
                L_0x003a:
                    r1 = 524288(0x80000, float:7.34684E-40)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0042
                    r23 = r3
                    goto L_0x0044
                L_0x0042:
                    r23 = r47
                L_0x0044:
                    r1 = 1048576(0x100000, float:1.469368E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x004c
                    r24 = r3
                    goto L_0x004e
                L_0x004c:
                    r24 = r48
                L_0x004e:
                    r1 = 2097152(0x200000, float:2.938736E-39)
                    r1 = r1 & r0
                    if (r1 == 0) goto L_0x0056
                    r25 = r3
                    goto L_0x0058
                L_0x0056:
                    r25 = r49
                L_0x0058:
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 & r1
                    if (r0 == 0) goto L_0x0060
                    r26 = r2
                    goto L_0x0062
                L_0x0060:
                    r26 = r50
                L_0x0062:
                    r3 = r27
                    r4 = r28
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r9 = r33
                    r10 = r34
                    r11 = r35
                    r12 = r36
                    r14 = r38
                    r17 = r41
                    r18 = r42
                    r19 = r43
                    r22 = r46
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37344f.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$f, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: W */
            public static /* synthetic */ C37344f m153431W(C37344f fVar, String str, ImageComponent.C37313a aVar, ContentComponent.C37305a.C37311f fVar2, LozengeListComponent.C37381a aVar2, NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar4, C11289a aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar6, int i2, Object obj) {
                C37344f fVar3 = fVar;
                int i3 = i2;
                return fVar.mo113881V((i3 & 1) != 0 ? fVar3.f93829N0 : str, (i3 & 2) != 0 ? fVar3.f93830O0 : aVar, (i3 & 4) != 0 ? fVar3.f93831P0 : fVar2, (i3 & 8) != 0 ? fVar3.f93832Q0 : aVar2, (i3 & 16) != 0 ? fVar3.f93833R0 : aVar3, (i3 & 32) != 0 ? fVar3.f93834S0 : z, (i3 & 64) != 0 ? fVar3.f93835T0 : z2, (i3 & 128) != 0 ? fVar3.f93836U0 : i, (i3 & 256) != 0 ? fVar3.f93837V0 : lVar, (i3 & 512) != 0 ? fVar3.f93838W0 : lVar2, (i3 & 1024) != 0 ? fVar3.f93839X0 : lVar3, (i3 & 2048) != 0 ? fVar3.f93840Y0 : aVar4, (i3 & 4096) != 0 ? fVar3.f93841Z0 : aVar5, (i3 & 8192) != 0 ? fVar3.f93842a1 : z3, (i3 & 16384) != 0 ? fVar3.f93843b1 : z4, (i3 & 32768) != 0 ? fVar3.f93844c1 : z5, (i3 & 65536) != 0 ? fVar3.f93845d1 : z6, (i3 & 131072) != 0 ? fVar3.f93846e1 : z7, (i3 & 262144) != 0 ? fVar3.f93847f1 : z8, (i3 & 524288) != 0 ? fVar3.f93848g1 : z9, (i3 & 1048576) != 0 ? fVar3.f93849h1 : z10, (i3 & 2097152) != 0 ? fVar3.f93850i1 : z11, (i3 & 4194304) != 0 ? fVar3.f93851j1 : aVar6);
            }

            @C12579k
            /* renamed from: A */
            public final C11300l<C37133a, C11079d2> mo113860A() {
                return this.f93839X0;
            }

            @C12580l
            /* renamed from: B */
            public final C11289a<C11079d2> mo113861B() {
                return this.f93840Y0;
            }

            @C12580l
            /* renamed from: C */
            public final C11289a<C11079d2> mo113862C() {
                return this.f93841Z0;
            }

            /* renamed from: D */
            public final boolean mo113863D() {
                return this.f93842a1;
            }

            /* renamed from: E */
            public final boolean mo113864E() {
                return this.f93843b1;
            }

            /* renamed from: F */
            public final boolean mo113865F() {
                return this.f93844c1;
            }

            /* renamed from: G */
            public final boolean mo113866G() {
                return this.f93845d1;
            }

            /* renamed from: H */
            public final boolean mo113867H() {
                return this.f93846e1;
            }

            /* renamed from: I */
            public final boolean mo113868I() {
                return this.f93847f1;
            }

            @C12579k
            /* renamed from: J */
            public final ImageComponent.C37313a mo113869J() {
                return this.f93830O0;
            }

            /* renamed from: K */
            public final boolean mo113870K() {
                return this.f93848g1;
            }

            /* renamed from: L */
            public final boolean mo113871L() {
                return this.f93849h1;
            }

            /* renamed from: M */
            public final boolean mo113872M() {
                return this.f93850i1;
            }

            @C12580l
            /* renamed from: N */
            public final C11289a<C11079d2> mo113873N() {
                return this.f93851j1;
            }

            @C12579k
            /* renamed from: O */
            public final ContentComponent.C37305a.C37311f mo113874O() {
                return this.f93831P0;
            }

            @C12579k
            /* renamed from: P */
            public final LozengeListComponent.C37381a mo113875P() {
                return this.f93832Q0;
            }

            @C12580l
            /* renamed from: Q */
            public final NutriscoreComponent.C37157a mo113876Q() {
                return this.f93833R0;
            }

            /* renamed from: R */
            public final boolean mo113877R() {
                return this.f93834S0;
            }

            /* renamed from: S */
            public final boolean mo113878S() {
                return this.f93835T0;
            }

            /* renamed from: T */
            public final int mo113879T() {
                return this.f93836U0;
            }

            @C12579k
            /* renamed from: U */
            public final C11300l<C37133a, C11079d2> mo113880U() {
                return this.f93837V0;
            }

            @C12579k
            /* renamed from: V */
            public final C37344f mo113881V(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37311f fVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                String str2 = str;
                Intrinsics.checkNotNullParameter(str2, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(fVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                return new C37344f(str2, aVar, fVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6);
            }

            @C12579k
            /* renamed from: X */
            public ContentComponent.C37305a.C37311f mo113695b() {
                return this.f93831P0;
            }

            /* renamed from: c */
            public boolean mo113696c() {
                return this.f93848g1;
            }

            @C12579k
            /* renamed from: d */
            public String mo113697d() {
                return this.f93829N0;
            }

            @C12579k
            /* renamed from: e */
            public ImageComponent.C37313a mo113698e() {
                return this.f93830O0;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37344f)) {
                    return false;
                }
                C37344f fVar = (C37344f) obj;
                return Intrinsics.areEqual((Object) this.f93829N0, (Object) fVar.f93829N0) && Intrinsics.areEqual((Object) this.f93830O0, (Object) fVar.f93830O0) && Intrinsics.areEqual((Object) this.f93831P0, (Object) fVar.f93831P0) && Intrinsics.areEqual((Object) this.f93832Q0, (Object) fVar.f93832Q0) && Intrinsics.areEqual((Object) this.f93833R0, (Object) fVar.f93833R0) && this.f93834S0 == fVar.f93834S0 && this.f93835T0 == fVar.f93835T0 && this.f93836U0 == fVar.f93836U0 && Intrinsics.areEqual((Object) this.f93837V0, (Object) fVar.f93837V0) && Intrinsics.areEqual((Object) this.f93838W0, (Object) fVar.f93838W0) && Intrinsics.areEqual((Object) this.f93839X0, (Object) fVar.f93839X0) && Intrinsics.areEqual((Object) this.f93840Y0, (Object) fVar.f93840Y0) && Intrinsics.areEqual((Object) this.f93841Z0, (Object) fVar.f93841Z0) && this.f93842a1 == fVar.f93842a1 && this.f93843b1 == fVar.f93843b1 && this.f93844c1 == fVar.f93844c1 && this.f93845d1 == fVar.f93845d1 && this.f93846e1 == fVar.f93846e1 && this.f93847f1 == fVar.f93847f1 && this.f93848g1 == fVar.f93848g1 && this.f93849h1 == fVar.f93849h1 && this.f93850i1 == fVar.f93850i1 && Intrinsics.areEqual((Object) this.f93851j1, (Object) fVar.f93851j1);
            }

            @C12579k
            /* renamed from: f */
            public LozengeListComponent.C37381a mo113699f() {
                return this.f93832Q0;
            }

            @C12580l
            /* renamed from: g */
            public NutriscoreComponent.C37157a mo113700g() {
                return this.f93833R0;
            }

            @C12580l
            /* renamed from: h */
            public C11289a<C11079d2> mo113701h() {
                return this.f93851j1;
            }

            public int hashCode() {
                int hashCode = ((((((this.f93829N0.hashCode() * 31) + this.f93830O0.hashCode()) * 31) + this.f93831P0.hashCode()) * 31) + this.f93832Q0.hashCode()) * 31;
                NutriscoreComponent.C37157a aVar = this.f93833R0;
                int i = 0;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                boolean z = this.f93834S0;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f93835T0;
                if (z3) {
                    z3 = true;
                }
                int hashCode3 = (((((i2 + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f93836U0)) * 31) + this.f93837V0.hashCode()) * 31;
                C11300l<C37133a, C11079d2> lVar = this.f93838W0;
                int hashCode4 = (((hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f93839X0.hashCode()) * 31;
                C11289a<C11079d2> aVar2 = this.f93840Y0;
                int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                C11289a<C11079d2> aVar3 = this.f93841Z0;
                int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                boolean z4 = this.f93842a1;
                if (z4) {
                    z4 = true;
                }
                int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
                boolean z5 = this.f93843b1;
                if (z5) {
                    z5 = true;
                }
                int i4 = (i3 + (z5 ? 1 : 0)) * 31;
                boolean z6 = this.f93844c1;
                if (z6) {
                    z6 = true;
                }
                int i5 = (i4 + (z6 ? 1 : 0)) * 31;
                boolean z7 = this.f93845d1;
                if (z7) {
                    z7 = true;
                }
                int i6 = (i5 + (z7 ? 1 : 0)) * 31;
                boolean z8 = this.f93846e1;
                if (z8) {
                    z8 = true;
                }
                int i7 = (i6 + (z8 ? 1 : 0)) * 31;
                boolean z9 = this.f93847f1;
                if (z9) {
                    z9 = true;
                }
                int i8 = (i7 + (z9 ? 1 : 0)) * 31;
                boolean z10 = this.f93848g1;
                if (z10) {
                    z10 = true;
                }
                int i9 = (i8 + (z10 ? 1 : 0)) * 31;
                boolean z11 = this.f93849h1;
                if (z11) {
                    z11 = true;
                }
                int i10 = (i9 + (z11 ? 1 : 0)) * 31;
                boolean z12 = this.f93850i1;
                if (!z12) {
                    z2 = z12;
                }
                int i11 = (i10 + (z2 ? 1 : 0)) * 31;
                C11289a<C11079d2> aVar4 = this.f93851j1;
                if (aVar4 != null) {
                    i = aVar4.hashCode();
                }
                return i11 + i;
            }

            @C12579k
            /* renamed from: i */
            public C11300l<C37133a, C11079d2> mo113702i() {
                return this.f93837V0;
            }

            @C12580l
            /* renamed from: j */
            public C11289a<C11079d2> mo113703j() {
                return this.f93840Y0;
            }

            @C12580l
            /* renamed from: k */
            public C11300l<C37133a, C11079d2> mo113704k() {
                return this.f93838W0;
            }

            @C12579k
            /* renamed from: l */
            public C11300l<C37133a, C11079d2> mo113705l() {
                return this.f93839X0;
            }

            @C12580l
            /* renamed from: m */
            public C11289a<C11079d2> mo113706m() {
                return this.f93841Z0;
            }

            /* renamed from: n */
            public int mo113707n() {
                return this.f93836U0;
            }

            /* renamed from: o */
            public boolean mo113708o() {
                return this.f93850i1;
            }

            /* renamed from: p */
            public boolean mo113709p() {
                return this.f93842a1;
            }

            /* renamed from: q */
            public boolean mo113710q() {
                return this.f93844c1;
            }

            /* renamed from: r */
            public boolean mo113711r() {
                return this.f93843b1;
            }

            /* renamed from: s */
            public boolean mo113712s() {
                return this.f93834S0;
            }

            /* renamed from: t */
            public boolean mo113713t() {
                return this.f93846e1;
            }

            @C12579k
            public String toString() {
                String str = this.f93829N0;
                ImageComponent.C37313a aVar = this.f93830O0;
                ContentComponent.C37305a.C37311f fVar = this.f93831P0;
                LozengeListComponent.C37381a aVar2 = this.f93832Q0;
                NutriscoreComponent.C37157a aVar3 = this.f93833R0;
                boolean z = this.f93834S0;
                boolean z2 = this.f93835T0;
                int i = this.f93836U0;
                C11300l<C37133a, C11079d2> lVar = this.f93837V0;
                C11300l<C37133a, C11079d2> lVar2 = this.f93838W0;
                C11300l<C37133a, C11079d2> lVar3 = this.f93839X0;
                C11289a<C11079d2> aVar4 = this.f93840Y0;
                C11289a<C11079d2> aVar5 = this.f93841Z0;
                boolean z3 = this.f93842a1;
                boolean z4 = this.f93843b1;
                boolean z5 = this.f93844c1;
                boolean z6 = this.f93845d1;
                boolean z7 = this.f93846e1;
                boolean z8 = this.f93847f1;
                boolean z9 = this.f93848g1;
                boolean z10 = this.f93849h1;
                boolean z11 = this.f93850i1;
                C11289a<C11079d2> aVar6 = this.f93851j1;
                return "Standard(id=" + str + ", image=" + aVar + ", content=" + fVar + ", lozenges=" + aVar2 + ", nutriscore=" + aVar3 + ", showFrenchFlag=" + z + ", isFavorite=" + z2 + ", productQuantity=" + i + ", onAtcPressed=" + lVar + ", onDeletePressed=" + lVar2 + ", onFavPressed=" + lVar3 + ", onCardPressed=" + aVar4 + ", onMoreChoicesPressed=" + aVar5 + ", showAtcLoading=" + z3 + ", showFavoritesLoading=" + z4 + ", showDeleteLoading=" + z5 + ", isProductAvailable=" + z6 + ", isCriteoSponsored=" + z7 + ", isDeleteButtonEnabled=" + z8 + ", hasMultipleOffers=" + z9 + ", isInBottomSheet=" + z10 + ", showAntiInflationButton=" + z11 + ", onAntiInflationClick=" + aVar6 + ")";
            }

            /* renamed from: u */
            public boolean mo113714u() {
                return this.f93847f1;
            }

            /* renamed from: v */
            public boolean mo113715v() {
                return this.f93835T0;
            }

            /* renamed from: w */
            public boolean mo113716w() {
                return this.f93849h1;
            }

            /* renamed from: x */
            public boolean mo113717x() {
                return this.f93845d1;
            }

            @C12579k
            /* renamed from: y */
            public final String mo113886y() {
                return this.f93829N0;
            }

            @C12580l
            /* renamed from: z */
            public final C11300l<C37133a, C11079d2> mo113887z() {
                return this.f93838W0;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37344f(@C12579k String str, @C12579k ImageComponent.C37313a aVar, @C12579k ContentComponent.C37305a.C37311f fVar, @C12579k LozengeListComponent.C37381a aVar2, @C12580l NutriscoreComponent.C37157a aVar3, boolean z, boolean z2, int i, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @C12580l C11289a<C11079d2> aVar6) {
                super(str, aVar, fVar, aVar2, aVar3, z, z2, i, lVar, lVar2, lVar3, aVar4, aVar5, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar6, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(aVar, C9127a0.f24709d);
                Intrinsics.checkNotNullParameter(fVar, "content");
                Intrinsics.checkNotNullParameter(aVar2, "lozenges");
                Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
                Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
                this.f93829N0 = str;
                this.f93830O0 = aVar;
                this.f93831P0 = fVar;
                this.f93832Q0 = aVar2;
                this.f93833R0 = aVar3;
                this.f93834S0 = z;
                this.f93835T0 = z2;
                this.f93836U0 = i;
                this.f93837V0 = lVar;
                this.f93838W0 = lVar2;
                this.f93839X0 = lVar3;
                this.f93840Y0 = aVar4;
                this.f93841Z0 = aVar5;
                this.f93842a1 = z3;
                this.f93843b1 = z4;
                this.f93844c1 = z5;
                this.f93845d1 = z6;
                this.f93846e1 = z7;
                this.f93847f1 = z8;
                this.f93848g1 = z9;
                this.f93849h1 = z10;
                this.f93850i1 = z11;
                this.f93851j1 = aVar6;
            }
        }

        public /* synthetic */ C37338a(String str, ImageComponent.C37313a aVar, ContentComponent.C37305a aVar2, LozengeListComponent.C37381a aVar3, NutriscoreComponent.C37157a aVar4, boolean z, boolean z2, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar5, C11289a aVar6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a aVar7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar, aVar2, aVar3, aVar4, z, z2, i, lVar, lVar2, lVar3, aVar5, aVar6, z3, z4, z5, z6, z7, z8, z9, z10, z11, aVar7);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x008b A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo113694a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a r6) {
            /*
                r5 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r5 instanceof com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37342d
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0040
                boolean r0 = r6 instanceof com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37342d
                if (r0 == 0) goto L_0x0040
                r0 = r5
                com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$d r0 = (com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37342d) r0
                com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b r3 = r0.mo113826Z()
                if (r3 != 0) goto L_0x0022
                r3 = r6
                com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$d r3 = (com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37342d) r3
                com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b r3 = r3.mo113826Z()
                if (r3 != 0) goto L_0x0022
                goto L_0x0040
            L_0x0022:
                com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b r3 = r0.mo113826Z()
                if (r3 == 0) goto L_0x003e
                r3 = r6
                com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a$d r3 = (com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.C37342d) r3
                com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b r4 = r3.mo113826Z()
                if (r4 == 0) goto L_0x003e
                com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b r0 = r0.mo113826Z()
                com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b r3 = r3.mo113826Z()
                boolean r0 = r0.mo113025i(r3)
                goto L_0x0041
            L_0x003e:
                r0 = r1
                goto L_0x0041
            L_0x0040:
                r0 = r2
            L_0x0041:
                java.lang.String r3 = r5.mo113697d()
                java.lang.String r4 = r6.mo113697d()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
                if (r3 == 0) goto L_0x008e
                int r3 = r5.mo113707n()
                int r4 = r6.mo113707n()
                if (r3 != r4) goto L_0x008e
                boolean r3 = r5.mo113711r()
                boolean r4 = r6.mo113711r()
                if (r3 != r4) goto L_0x008e
                boolean r3 = r5.mo113710q()
                boolean r4 = r6.mo113710q()
                if (r3 != r4) goto L_0x008e
                boolean r3 = r5.mo113709p()
                boolean r4 = r6.mo113709p()
                if (r3 != r4) goto L_0x008e
                boolean r3 = r5.mo113715v()
                boolean r4 = r6.mo113715v()
                if (r3 != r4) goto L_0x008e
                boolean r3 = r5.mo113717x()
                boolean r6 = r6.mo113717x()
                if (r3 != r6) goto L_0x008e
                if (r0 == 0) goto L_0x008e
                r1 = r2
            L_0x008e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.mo113694a(com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a):boolean");
        }

        @C12579k
        /* renamed from: b */
        public ContentComponent.C37305a mo113695b() {
            return this.f93697c;
        }

        /* renamed from: c */
        public boolean mo113696c() {
            return this.f93688I0;
        }

        @C12579k
        /* renamed from: d */
        public String mo113697d() {
            return this.f93695a;
        }

        @C12579k
        /* renamed from: e */
        public ImageComponent.C37313a mo113698e() {
            return this.f93696b;
        }

        @C12579k
        /* renamed from: f */
        public LozengeListComponent.C37381a mo113699f() {
            return this.f93698d;
        }

        @C12580l
        /* renamed from: g */
        public NutriscoreComponent.C37157a mo113700g() {
            return this.f93699e;
        }

        public int getType(@C12579k C37353b.C37354a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "typeFactory");
            return aVar.mo113922b(this);
        }

        @C12580l
        /* renamed from: h */
        public C11289a<C11079d2> mo113701h() {
            return this.f93691L0;
        }

        @C12579k
        /* renamed from: i */
        public C11300l<C37133a, C11079d2> mo113702i() {
            return this.f93703w;
        }

        @C12580l
        /* renamed from: j */
        public C11289a<C11079d2> mo113703j() {
            return this.f93706z;
        }

        @C12580l
        /* renamed from: k */
        public C11300l<C37133a, C11079d2> mo113704k() {
            return this.f93704x;
        }

        @C12579k
        /* renamed from: l */
        public C11300l<C37133a, C11079d2> mo113705l() {
            return this.f93705y;
        }

        @C12580l
        /* renamed from: m */
        public C11289a<C11079d2> mo113706m() {
            return this.f93692X;
        }

        /* renamed from: n */
        public int mo113707n() {
            return this.f93702v;
        }

        /* renamed from: o */
        public boolean mo113708o() {
            return this.f93690K0;
        }

        /* renamed from: p */
        public boolean mo113709p() {
            return this.f93693Y;
        }

        /* renamed from: q */
        public boolean mo113710q() {
            return this.f93684E0;
        }

        /* renamed from: r */
        public boolean mo113711r() {
            return this.f93694Z;
        }

        /* renamed from: s */
        public boolean mo113712s() {
            return this.f93700f;
        }

        /* renamed from: t */
        public boolean mo113713t() {
            return this.f93686G0;
        }

        /* renamed from: u */
        public boolean mo113714u() {
            return this.f93687H0;
        }

        /* renamed from: v */
        public boolean mo113715v() {
            return this.f93701g;
        }

        /* renamed from: w */
        public boolean mo113716w() {
            return this.f93689J0;
        }

        /* renamed from: x */
        public boolean mo113717x() {
            return this.f93685F0;
        }

        public C37338a(String str, ImageComponent.C37313a aVar, ContentComponent.C37305a aVar2, LozengeListComponent.C37381a aVar3, NutriscoreComponent.C37157a aVar4, boolean z, boolean z2, int i, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C11289a<C11079d2> aVar7) {
            this.f93695a = str;
            this.f93696b = aVar;
            this.f93697c = aVar2;
            this.f93698d = aVar3;
            this.f93699e = aVar4;
            this.f93700f = z;
            this.f93701g = z2;
            this.f93702v = i;
            this.f93703w = lVar;
            this.f93704x = lVar2;
            this.f93705y = lVar3;
            this.f93706z = aVar5;
            this.f93692X = aVar6;
            this.f93693Y = z3;
            this.f93694Z = z4;
            this.f93684E0 = z5;
            this.f93685F0 = z6;
            this.f93686G0 = z7;
            this.f93687H0 = z8;
            this.f93688I0 = z9;
            this.f93689J0 = z10;
            this.f93690K0 = z11;
            this.f93691L0 = aVar7;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37338a(java.lang.String r29, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37313a r30, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a r31, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent.C37381a r32, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent.C37157a r33, boolean r34, boolean r35, int r36, kotlin.jvm.functions.C11300l r37, kotlin.jvm.functions.C11300l r38, kotlin.jvm.functions.C11300l r39, kotlin.jvm.functions.C11289a r40, kotlin.jvm.functions.C11289a r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, kotlin.jvm.functions.C11289a r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
            /*
                r28 = this;
                r0 = r52
                r1 = r0 & 512(0x200, float:7.175E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r13 = r2
                goto L_0x000b
            L_0x0009:
                r13 = r38
            L_0x000b:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0011
                r15 = r2
                goto L_0x0013
            L_0x0011:
                r15 = r40
            L_0x0013:
                r1 = 4194304(0x400000, float:5.877472E-39)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x001b
                r26 = r2
                goto L_0x001d
            L_0x001b:
                r26 = r51
            L_0x001d:
                r27 = 0
                r3 = r28
                r4 = r29
                r5 = r30
                r6 = r31
                r7 = r32
                r8 = r33
                r9 = r34
                r10 = r35
                r11 = r36
                r12 = r37
                r14 = r39
                r16 = r41
                r17 = r42
                r18 = r43
                r19 = r44
                r20 = r45
                r21 = r46
                r22 = r47
                r23 = r48
                r24 = r49
                r25 = r50
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a.<init>(java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a, com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a, com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a, boolean, boolean, int, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardSComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: F */
    public static final void m153142F(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$it");
        aVar.invoke();
    }

    /* renamed from: G */
    public static final void m153143G(C37338a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        C11289a<C11079d2> m = aVar.mo113706m();
        if (m != null) {
            m.invoke();
        }
    }

    /* renamed from: H */
    public static final void m153144H(C37338a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        C11289a<C11079d2> j = aVar.mo113703j();
        if (j != null) {
            j.invoke();
        }
    }

    /* renamed from: I */
    public static final void m153145I(C37338a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        C11289a<C11079d2> h = aVar.mo113701h();
        if (h != null) {
            h.invoke();
        }
    }

    /* renamed from: J */
    public static final void m153146J(C37338a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        C11289a<C11079d2> h = aVar.mo113701h();
        if (h != null) {
            h.invoke();
        }
    }

    /* renamed from: K */
    public static final void m153147K(C37338a aVar, ProductCardSComponent productCardSComponent, LoaderMaterialButton loaderMaterialButton, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        Intrinsics.checkNotNullParameter(productCardSComponent, "this$0");
        Intrinsics.checkNotNullParameter(loaderMaterialButton, "$this_apply");
        C11300l<C37133a, C11079d2> k = aVar.mo113704k();
        if (k != null) {
            k.invoke(productCardSComponent.getDebouncerState());
        }
        loaderMaterialButton.announceForAccessibility(loaderMaterialButton.getContext().getString(C36896b.C36912p.accessibility_product_in_basket_removed));
    }

    /* renamed from: L */
    public static final void m153148L(C37338a aVar, ProductCardSComponent productCardSComponent, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        Intrinsics.checkNotNullParameter(productCardSComponent, "this$0");
        aVar.mo113702i().invoke(productCardSComponent.getDebouncerState());
    }

    /* renamed from: M */
    public static final void m153149M(C37338a aVar, ProductCardSComponent productCardSComponent, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        Intrinsics.checkNotNullParameter(productCardSComponent, "this$0");
        aVar.mo113702i().invoke(productCardSComponent.getDebouncerState());
    }

    /* renamed from: N */
    public static final void m153150N(C37338a aVar, ProductCardSComponent productCardSComponent, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        Intrinsics.checkNotNullParameter(productCardSComponent, "this$0");
        aVar.mo113705l().invoke(productCardSComponent.getDebouncerState());
    }

    /* renamed from: O */
    public static final void m153151O(C37338a aVar, ProductCardSComponent productCardSComponent, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        Intrinsics.checkNotNullParameter(productCardSComponent, "this$0");
        aVar.mo113705l().invoke(productCardSComponent.getDebouncerState());
    }

    /* renamed from: E */
    public final void mo113691E(@C12579k C37338a aVar) {
        String str;
        int i;
        C11079d2 d2Var;
        int i2;
        int i3;
        String str2;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        String str3;
        C37338a aVar2 = aVar;
        Intrinsics.checkNotNullParameter(aVar2, C40045d.f102104u);
        boolean z3 = true;
        if (aVar.mo113709p() || aVar.mo113710q() || aVar.mo113711r()) {
            getDebouncerState().mo112752c();
        } else {
            C37133a.m152202b(getDebouncerState(), false, 1, (Object) null);
        }
        this.f93682b.f92729i.setLoading(aVar.mo113709p());
        this.f93682b.f92730j.setLoading(aVar.mo113710q());
        this.f93682b.f92731k.setLoading(aVar.mo113711r());
        setEnabled(aVar.mo113717x());
        if (!aVar.mo113716w()) {
            C11289a<C11079d2> j = aVar.mo113703j();
            if (j != null) {
                setTimeoutDebouncedClickListener(this, new C37358e(j));
            }
            if (aVar2 instanceof C37338a.C37342d) {
                C37338a.C37342d dVar = (C37338a.C37342d) aVar2;
                if (dVar.mo113826Z() != null) {
                    this.f93682b.f92741u.mo113010A(dVar.mo113826Z());
                }
            }
            this.f93682b.f92741u.setVisibility(8);
        }
        if (aVar.mo113700g() == null) {
            str = "";
        } else {
            String string = getContext().getString(C36896b.C36912p.nutriscore);
            NutriscoreComponent.C37157a g = aVar.mo113700g();
            if (g != null) {
                str3 = g.mo112969g();
            } else {
                str3 = null;
            }
            str = string + " " + str3;
        }
        String h3 = CollectionsKt___CollectionsKt.m40639h3(aVar.mo113699f().mo113965a(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new ProductCardSComponent$bind$lozengesContentDescription$1(this), 31, (Object) null);
        String h32 = CollectionsKt___CollectionsKt.m40639h3(aVar.mo113695b().mo113639d(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 2, (CharSequence) null, new ProductCardSComponent$bind$deliveryModeContentDescription$1(this), 23, (Object) null);
        String a = aVar.mo113695b().mo113636a();
        String f = aVar.mo113695b().mo113641f();
        String b = aVar.mo113695b().mo113637b();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        String a2 = C37106a.m152136a(b, context);
        String b2 = aVar.mo113695b().mo113640e().mo113687b();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
        String b3 = C37106a.m152137b(b2, context2);
        Context context3 = getContext();
        int i7 = C36896b.C36912p.accessibility_quantity_product;
        ViewKt.m152120b(this, a + "," + f + ", " + a2 + ", " + b3 + ", " + context3.getString(i7, new Object[]{String.valueOf(aVar.mo113707n())}) + ", " + str + ", " + h3 + ", " + h32, true);
        LabelComponent labelComponent = this.f93682b.f92724d;
        if (aVar.mo113717x()) {
            i = 8;
        } else {
            i = 0;
        }
        labelComponent.setVisibility(i);
        this.f93682b.f92739s.mo113651n(aVar.mo113698e());
        this.f93682b.f92735o.mo113635u(aVar.mo113695b(), aVar.mo113716w(), aVar.mo113717x());
        this.f93682b.f92740t.mo113963a(aVar.mo113699f());
        NutriscoreComponent.C37157a g2 = aVar.mo113700g();
        if (g2 != null) {
            this.f93682b.f92742v.mo112961a(g2);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            NutriscoreComponent nutriscoreComponent = this.f93682b.f92742v;
            Intrinsics.checkNotNullExpressionValue(nutriscoreComponent, "binding.productNutriscore");
            nutriscoreComponent.setVisibility(8);
        }
        FlagFrComponent flagFrComponent = this.f93682b.f92737q;
        Intrinsics.checkNotNullExpressionValue(flagFrComponent, "binding.productFlagFr");
        if (aVar.mo113712s()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        flagFrComponent.setVisibility(i2);
        SponsoredCriteoComponent sponsoredCriteoComponent = this.f93682b.f92736p;
        Intrinsics.checkNotNullExpressionValue(sponsoredCriteoComponent, "binding.productCriteo");
        if (aVar.mo113713t()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        sponsoredCriteoComponent.setVisibility(i3);
        if (!aVar.mo113714u() || aVar.mo113707n() <= 0 || aVar.mo113704k() == null) {
            LoaderMaterialButton loaderMaterialButton = this.f93682b.f92730j;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton, "binding.productButtonDelete");
            loaderMaterialButton.setVisibility(8);
        } else {
            LoaderMaterialButton loaderMaterialButton2 = this.f93682b.f92730j;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton2, "bind$lambda$5");
            loaderMaterialButton2.setVisibility(0);
            setLoadingDebouncedClickListener(loaderMaterialButton2, new C37359f(aVar2, this, loaderMaterialButton2));
            loaderMaterialButton2.setContentDescription(loaderMaterialButton2.getContext().getString(C36896b.C36912p.accessibility_remove_product_in_basket));
        }
        if (!aVar.mo113717x()) {
            this.f93682b.f92733m.setVisibility(4);
            this.f93682b.f92729i.setVisibility(4);
        } else {
            LoaderMaterialButton loaderMaterialButton3 = this.f93682b.f92729i;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton3, "binding.productButtonAtc");
            if (aVar.mo113707n() == 0 || aVar.mo113709p()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            loaderMaterialButton3.setVisibility(i5);
            LoaderMaterialButton loaderMaterialButton4 = this.f93682b.f92733m;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton4, "binding.productButtonQuantity");
            if (aVar.mo113707n() <= 0 || aVar.mo113709p()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            loaderMaterialButton4.setVisibility(i6);
            this.f93682b.f92733m.setText(String.valueOf(aVar.mo113707n()));
            LoaderMaterialButton loaderMaterialButton5 = this.f93682b.f92733m;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton5, "binding.productButtonQuantity");
            String string2 = getContext().getString(i7, new Object[]{String.valueOf(aVar.mo113707n())});
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(\n     …tring()\n                )");
            String string3 = getContext().getString(C36896b.C36912p.accessibility_change_quantity_product);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_change_quantity_product)");
            ViewKt.m152129k(loaderMaterialButton5, string2, string3);
            LoaderMaterialButton loaderMaterialButton6 = this.f93682b.f92729i;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton6, "binding.productButtonAtc");
            setLoadingDebouncedClickListener(loaderMaterialButton6, new C37360g(aVar2, this));
            LoaderMaterialButton loaderMaterialButton7 = this.f93682b.f92733m;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton7, "binding.productButtonQuantity");
            setTimeoutDebouncedClickListener(loaderMaterialButton7, new C37361h(aVar2, this));
            this.f93682b.f92729i.setIconResource(mo113692P(aVar.mo113717x()));
        }
        this.f93682b.f92731k.setChecked(aVar.mo113715v());
        if (isSelected()) {
            str2 = getContext().getString(C36896b.C36912p.accessibility_product_add_to_fav);
        } else {
            str2 = getContext().getString(C36896b.C36912p.accessibility_product_not_added_to_fav);
        }
        Intrinsics.checkNotNullExpressionValue(str2, "if (isSelected) {\n      …t_added_to_fav)\n        }");
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f93682b.f92738r;
        Intrinsics.checkNotNullExpressionValue(materialButtonToggleGroup, "binding.productGroupFav");
        ViewKt.m152121c(materialButtonToggleGroup, str2, false, 2, (Object) null);
        LoaderMaterialButton loaderMaterialButton8 = this.f93682b.f92731k;
        Intrinsics.checkNotNullExpressionValue(loaderMaterialButton8, "binding.productButtonFav");
        setLoadingDebouncedClickListener(loaderMaterialButton8, new C37362i(aVar2, this));
        MaterialButtonToggleGroup materialButtonToggleGroup2 = this.f93682b.f92738r;
        Intrinsics.checkNotNullExpressionValue(materialButtonToggleGroup2, "binding.productGroupFav");
        setLoadingDebouncedClickListener(materialButtonToggleGroup2, new C37363j(aVar2, this));
        MaterialButton materialButton = this.f93682b.f92732l;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.productButtonMoreChoices");
        if (aVar.mo113706m() == null) {
            z3 = false;
        }
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        materialButton.setVisibility(i4);
        if (aVar.mo113706m() != null) {
            MaterialButton materialButton2 = this.f93682b.f92732l;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.productButtonMoreChoices");
            setLoadingDebouncedClickListener(materialButton2, new C37364k(aVar2));
        } else {
            this.f93682b.f92732l.setOnClickListener((View.OnClickListener) null);
        }
        if (aVar.mo113696c()) {
            MaterialButton materialButton3 = this.f93682b.f92734n;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "binding.productButtonSeeMore");
            setTimeoutDebouncedClickListener(materialButton3, new C37365l(aVar2));
            this.f93682b.f92734n.setVisibility(0);
            this.f93682b.f92729i.setVisibility(8);
            this.f93682b.f92733m.setVisibility(8);
        } else {
            this.f93682b.f92734n.setVisibility(8);
        }
        if (aVar.mo113708o()) {
            this.f93682b.f92726f.setVisibility(0);
            AppCompatImageView appCompatImageView = this.f93682b.f92727g;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.productAntiInflationIcon");
            setTimeoutDebouncedClickListener(appCompatImageView, new C37385m(aVar2));
            MaterialButton materialButton4 = this.f93682b.f92725e;
            Intrinsics.checkNotNullExpressionValue(materialButton4, "binding.productAntiInflationButton");
            setTimeoutDebouncedClickListener(materialButton4, new C37386n(aVar2));
            return;
        }
        this.f93682b.f92726f.setVisibility(8);
        this.f93682b.f92727g.setOnClickListener((View.OnClickListener) null);
        this.f93682b.f92725e.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: P */
    public final int mo113692P(boolean z) {
        return z ? C36896b.C36904h.ds_ic_cart_plus : C36896b.C36904h.ds_ic_straight_arrows_replace;
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f93681a.getDebouncerState();
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f93681a.setDebouncerState(aVar);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f93682b.f92737q.setEnabled(z);
        this.f93682b.f92739s.setEnabled(z);
        this.f93682b.f92735o.setEnabled(z);
        this.f93682b.f92742v.setEnabled(z);
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93681a.setLoadingDebouncedClickListener(view, onClickListener);
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93681a.setTimeoutDebouncedClickListener(view, onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardSComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductCardSComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardSComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93681a = new C37145l();
        C37064m0 b = C37064m0.m152026b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93682b = b;
        setBackground(new ShapeDrawable(new RectShape()));
        setBackgroundTintList(C17318d.m79724g(context, C36896b.C36902f.ds_product_card_background_color));
        setLayoutTransition(new LayoutTransition());
    }
}
