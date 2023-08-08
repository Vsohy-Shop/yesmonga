package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.databinding.C37043f;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u001cB'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/ContentComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/d2;", "setTitle", "text", "setContentText", "Lcom/carrefour/fid/android/design/components/widgets/productcard/ContentComponent$a;", "model", "", "isInBottomSheet", "isProductAvailable", "u", "enabled", "setEnabled", "Lcom/carrefour/fid/android/design/components/databinding/f;", "a", "Lcom/carrefour/fid/android/design/components/databinding/f;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nContentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/ContentComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,156:1\n262#2,2:157\n262#2,2:159\n*S KotlinDebug\n*F\n+ 1 ContentComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/ContentComponent\n*L\n121#1:157,2\n123#1:159,2\n*E\n"})
public final class ContentComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93573b = 8;
    @C12579k

    /* renamed from: a */
    public final C37043f f93574a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a */
    public static abstract class C37305a {

        /* renamed from: h */
        public static final int f93575h = 8;
        @C12579k

        /* renamed from: a */
        public final String f93576a;
        @C12579k

        /* renamed from: b */
        public final String f93577b;
        @C12579k

        /* renamed from: c */
        public final PriceComponent.C37329a f93578c;
        @C12579k

        /* renamed from: d */
        public final String f93579d;
        @C12579k

        /* renamed from: e */
        public final List<Integer> f93580e;

        /* renamed from: f */
        public final boolean f93581f;
        @C12579k

        /* renamed from: g */
        public final String f93582g;

        public /* synthetic */ C37305a(String str, String str2, PriceComponent.C37329a aVar, String str3, List list, boolean z, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, aVar, str3, list, z, str4);
        }

        @C12579k
        /* renamed from: a */
        public final String mo113636a() {
            return this.f93582g;
        }

        @C12579k
        /* renamed from: b */
        public final String mo113637b() {
            return this.f93577b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo113638c() {
            return this.f93579d;
        }

        @C12579k
        /* renamed from: d */
        public final List<Integer> mo113639d() {
            return this.f93580e;
        }

        @C12579k
        /* renamed from: e */
        public final PriceComponent.C37329a mo113640e() {
            return this.f93578c;
        }

        @C12579k
        /* renamed from: f */
        public final String mo113641f() {
            return this.f93576a;
        }

        /* renamed from: g */
        public final boolean mo113642g() {
            return this.f93581f;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$a */
        public static final class C37306a extends C37305a implements C37312b {

            /* renamed from: j */
            public static final int f93583j = 0;
            @C12579k

            /* renamed from: i */
            public final LabelComponent.C37316a.C37317a f93584i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37306a(String str, String str2, PriceComponent.C37329a.C37330a aVar, String str3, List list, boolean z, String str4, LabelComponent.C37316a.C37317a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, aVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4, aVar2);
            }

            @C12579k
            /* renamed from: h */
            public LabelComponent.C37316a.C37317a getLabel() {
                return this.f93584i;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37306a(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37330a r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r16, boolean r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37317a r19) {
                /*
                    r11 = this;
                    r0 = r19
                    java.lang.String r1 = "title"
                    r3 = r12
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                    java.lang.String r1 = "contentText"
                    r4 = r13
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                    java.lang.String r1 = "price"
                    r5 = r14
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                    java.lang.String r1 = "labelHighLight"
                    r6 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                    java.lang.String r1 = "listDeliveryMode"
                    r7 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                    java.lang.String r1 = "brand"
                    r9 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r10 = 0
                    r2 = r11
                    r8 = r17
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    r1 = r11
                    r1.f93584i = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37306a.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$a, java.lang.String, java.util.List, boolean, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$a):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$b */
        public static final class C37307b extends C37305a implements C37312b {

            /* renamed from: j */
            public static final int f93585j = 0;
            @C12579k

            /* renamed from: i */
            public final LabelComponent.C37316a.C37325i f93586i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37307b(String str, String str2, PriceComponent.C37329a.C37331b bVar, String str3, List list, boolean z, String str4, LabelComponent.C37316a.C37325i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, bVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4, iVar);
            }

            @C12579k
            /* renamed from: h */
            public LabelComponent.C37316a.C37325i getLabel() {
                return this.f93586i;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37307b(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37331b r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r16, boolean r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37325i r19) {
                /*
                    r11 = this;
                    r0 = r19
                    java.lang.String r1 = "title"
                    r3 = r12
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                    java.lang.String r1 = "contentText"
                    r4 = r13
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                    java.lang.String r1 = "price"
                    r5 = r14
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                    java.lang.String r1 = "labelHighLight"
                    r6 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                    java.lang.String r1 = "listDeliveryMode"
                    r7 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                    java.lang.String r1 = "brand"
                    r9 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r10 = 0
                    r2 = r11
                    r8 = r17
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    r1 = r11
                    r1.f93586i = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37307b.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$b, java.lang.String, java.util.List, boolean, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$i):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$c */
        public static final class C37308c extends C37305a implements C37312b {

            /* renamed from: j */
            public static final int f93587j = 0;
            @C12579k

            /* renamed from: i */
            public final LabelComponent.C37316a.C37321e f93588i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37308c(String str, String str2, PriceComponent.C37329a.C37332c cVar, String str3, List list, boolean z, String str4, LabelComponent.C37316a.C37321e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, cVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4, eVar);
            }

            @C12579k
            /* renamed from: h */
            public LabelComponent.C37316a.C37321e getLabel() {
                return this.f93588i;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37308c(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37332c r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r16, boolean r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37321e r19) {
                /*
                    r11 = this;
                    r0 = r19
                    java.lang.String r1 = "title"
                    r3 = r12
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                    java.lang.String r1 = "contentText"
                    r4 = r13
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                    java.lang.String r1 = "price"
                    r5 = r14
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                    java.lang.String r1 = "labelHighLight"
                    r6 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                    java.lang.String r1 = "listDeliveryMode"
                    r7 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                    java.lang.String r1 = "brand"
                    r9 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r10 = 0
                    r2 = r11
                    r8 = r17
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    r1 = r11
                    r1.f93588i = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37308c.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$c, java.lang.String, java.util.List, boolean, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$e):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$d */
        public static final class C37309d extends C37305a implements C37312b {

            /* renamed from: j */
            public static final int f93589j = 0;
            @C12579k

            /* renamed from: i */
            public final LabelComponent.C37316a.C37324h f93590i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37309d(String str, String str2, PriceComponent.C37329a.C37333d dVar, String str3, List list, boolean z, String str4, LabelComponent.C37316a.C37324h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, dVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4, hVar);
            }

            @C12579k
            /* renamed from: h */
            public LabelComponent.C37316a.C37324h getLabel() {
                return this.f93590i;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37309d(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37333d r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r16, boolean r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37324h r19) {
                /*
                    r11 = this;
                    r0 = r19
                    java.lang.String r1 = "title"
                    r3 = r12
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                    java.lang.String r1 = "contentText"
                    r4 = r13
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                    java.lang.String r1 = "price"
                    r5 = r14
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                    java.lang.String r1 = "labelHighLight"
                    r6 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                    java.lang.String r1 = "listDeliveryMode"
                    r7 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                    java.lang.String r1 = "brand"
                    r9 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r10 = 0
                    r2 = r11
                    r8 = r17
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    r1 = r11
                    r1.f93590i = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37309d.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$d, java.lang.String, java.util.List, boolean, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$h):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$e */
        public static final class C37310e extends C37305a implements C37312b {

            /* renamed from: j */
            public static final int f93591j = 0;
            @C12579k

            /* renamed from: i */
            public final LabelComponent.C37316a.C37325i f93592i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37310e(String str, String str2, PriceComponent.C37329a.C37334e eVar, String str3, List list, boolean z, String str4, LabelComponent.C37316a.C37325i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, eVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4, iVar);
            }

            @C12579k
            /* renamed from: h */
            public LabelComponent.C37316a.C37325i getLabel() {
                return this.f93592i;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37310e(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37334e r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r16, boolean r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent.C37316a.C37325i r19) {
                /*
                    r11 = this;
                    r0 = r19
                    java.lang.String r1 = "title"
                    r3 = r12
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                    java.lang.String r1 = "contentText"
                    r4 = r13
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                    java.lang.String r1 = "price"
                    r5 = r14
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                    java.lang.String r1 = "labelHighLight"
                    r6 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                    java.lang.String r1 = "listDeliveryMode"
                    r7 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                    java.lang.String r1 = "brand"
                    r9 = r18
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    java.lang.String r1 = "label"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r10 = 0
                    r2 = r11
                    r8 = r17
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    r1 = r11
                    r1.f93592i = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37310e.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$e, java.lang.String, java.util.List, boolean, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$i):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$a$f */
        public static final class C37311f extends C37305a {

            /* renamed from: i */
            public static final int f93593i = 0;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37311f(String str, String str2, PriceComponent.C37329a.C37335f fVar, String str3, List list, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, fVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37311f(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37329a.C37335f r13, @org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r15, boolean r16, @org.jetbrains.annotations.C12579k java.lang.String r17) {
                /*
                    r10 = this;
                    java.lang.String r0 = "title"
                    r2 = r11
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                    java.lang.String r0 = "contentText"
                    r3 = r12
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                    java.lang.String r0 = "price"
                    r4 = r13
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                    java.lang.String r0 = "labelHighLight"
                    r5 = r14
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                    java.lang.String r0 = "listDeliveryMode"
                    r6 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                    java.lang.String r0 = "brand"
                    r8 = r17
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    r9 = 0
                    r1 = r10
                    r7 = r16
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent.C37305a.C37311f.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$f, java.lang.String, java.util.List, boolean, java.lang.String):void");
            }
        }

        public C37305a(String str, String str2, PriceComponent.C37329a aVar, String str3, List<Integer> list, boolean z, String str4) {
            this.f93576a = str;
            this.f93577b = str2;
            this.f93578c = aVar;
            this.f93579d = str3;
            this.f93580e = list;
            this.f93581f = z;
            this.f93582g = str4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37305a(String str, String str2, PriceComponent.C37329a aVar, String str3, List list, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, aVar, str3, (i & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, str4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent$b */
    public interface C37312b {
        @C12579k
        LabelComponent.C37316a getLabel();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ContentComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final void setContentText(String str) {
        this.f93574a.f92626d.setText(str);
    }

    private final void setTitle(String str) {
        this.f93574a.f92627e.setText(str);
    }

    /* renamed from: v */
    public static /* synthetic */ void m153069v(ContentComponent contentComponent, C37305a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        contentComponent.mo113635u(aVar, z, z2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f93574a.f92625c.setEnabled(z);
    }

    /* renamed from: u */
    public final void mo113635u(@C12579k C37305a aVar, boolean z, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        setTitle(aVar.mo113641f());
        boolean z4 = true;
        if (aVar.mo113642g()) {
            setContentText(aVar.mo113637b());
            this.f93574a.f92626d.setVisibility(0);
            this.f93574a.f92629g.setVisibility(8);
        } else {
            if (aVar.mo113636a().length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.f93574a.f92629g.setText(aVar.mo113636a());
                this.f93574a.f92629g.setVisibility(0);
            } else {
                this.f93574a.f92629g.setVisibility(8);
            }
            this.f93574a.f92626d.setVisibility(4);
        }
        if (z2) {
            this.f93574a.f92625c.mo113679E(aVar.mo113640e());
            PriceComponent priceComponent = this.f93574a.f92625c;
            Intrinsics.checkNotNullExpressionValue(priceComponent, "binding.contentPrice");
            priceComponent.setVisibility(0);
        } else {
            PriceComponent priceComponent2 = this.f93574a.f92625c;
            Intrinsics.checkNotNullExpressionValue(priceComponent2, "binding.contentPrice");
            priceComponent2.setVisibility(8);
        }
        if (aVar.mo113638c().length() <= 0) {
            z4 = false;
        }
        if (z4) {
            this.f93574a.f92630h.setVisibility(0);
            this.f93574a.f92630h.setText(aVar.mo113638c());
        } else {
            this.f93574a.f92630h.setVisibility(8);
        }
        if (aVar instanceof C37312b) {
            this.f93574a.f92624b.mo113669w(((C37312b) aVar).getLabel(), z);
            this.f93574a.f92624b.setVisibility(0);
        } else {
            this.f93574a.f92624b.setVisibility(8);
        }
        this.f93574a.f92628f.mo113649u(aVar.mo113639d());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ContentComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ContentComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37043f b = C37043f.m151964b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93574a = b;
    }
}
