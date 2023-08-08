package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.databinding.C37070p0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.type.ProductOverlayType;
import com.urbanairship.iam.events.C9175a;
import java.util.Timer;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002\u0019\u001dB'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0014J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ4\u0010\u0014\u001a\u00020\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ProductOverlayComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/d2;", "setTitleText", "description", "setDescriptionText", "Lcom/carrefour/fid/android/design/components/type/ProductOverlayType;", "productOverlayType", "setProductOverlayType", "onDetachedFromWindow", "Lcom/carrefour/fid/android/design/components/widgets/ProductOverlayComponent$b;", "productOverlayInfo", "A", "Lkotlin/Function0;", "onPositiveAction", "onNegativeAction", "", "autoHide", "D", "J", "B", "I", "Ljava/util/Timer;", "a", "Ljava/util/Timer;", "timer", "Lcom/carrefour/fid/android/design/components/databinding/p0;", "b", "Lcom/carrefour/fid/android/design/components/databinding/p0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductOverlayComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductOverlayComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ProductOverlayComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public final class ProductOverlayComponent extends ConstraintLayout {
    @C12579k

    /* renamed from: c */
    public static final C37160a f93136c = new C37160a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f93137d = 8;

    /* renamed from: e */
    public static final long f93138e = 7000;
    @C12580l

    /* renamed from: a */
    public Timer f93139a;
    @C12579k

    /* renamed from: b */
    public final C37070p0 f93140b;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$a */
    public static final class C37160a {
        public /* synthetic */ C37160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C37160a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$b */
    public static final class C37161b {

        /* renamed from: g */
        public static final int f93141g = 0;
        @C12580l

        /* renamed from: a */
        public final String f93142a;
        @C12580l

        /* renamed from: b */
        public final String f93143b;
        @C12579k

        /* renamed from: c */
        public final ProductOverlayType f93144c;
        @C12580l

        /* renamed from: d */
        public final C11289a<C11079d2> f93145d;
        @C12580l

        /* renamed from: e */
        public final C11289a<C11079d2> f93146e;

        /* renamed from: f */
        public final boolean f93147f;

        public C37161b() {
            this((String) null, (String) null, (ProductOverlayType) null, (C11289a) null, (C11289a) null, false, 63, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public static /* synthetic */ C37161b m152486h(C37161b bVar, String str, String str2, ProductOverlayType productOverlayType, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f93142a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.f93143b;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                productOverlayType = bVar.f93144c;
            }
            ProductOverlayType productOverlayType2 = productOverlayType;
            if ((i & 8) != 0) {
                aVar = bVar.f93145d;
            }
            C11289a<C11079d2> aVar3 = aVar;
            if ((i & 16) != 0) {
                aVar2 = bVar.f93146e;
            }
            C11289a<C11079d2> aVar4 = aVar2;
            if ((i & 32) != 0) {
                z = bVar.f93147f;
            }
            return bVar.mo113023g(str, str3, productOverlayType2, aVar3, aVar4, z);
        }

        @C12580l
        /* renamed from: a */
        public final String mo113016a() {
            return this.f93142a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo113017b() {
            return this.f93143b;
        }

        @C12579k
        /* renamed from: c */
        public final ProductOverlayType mo113018c() {
            return this.f93144c;
        }

        @C12580l
        /* renamed from: d */
        public final C11289a<C11079d2> mo113019d() {
            return this.f93145d;
        }

        @C12580l
        /* renamed from: e */
        public final C11289a<C11079d2> mo113020e() {
            return this.f93146e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37161b)) {
                return false;
            }
            C37161b bVar = (C37161b) obj;
            return Intrinsics.areEqual((Object) this.f93142a, (Object) bVar.f93142a) && Intrinsics.areEqual((Object) this.f93143b, (Object) bVar.f93143b) && this.f93144c == bVar.f93144c && Intrinsics.areEqual((Object) this.f93145d, (Object) bVar.f93145d) && Intrinsics.areEqual((Object) this.f93146e, (Object) bVar.f93146e) && this.f93147f == bVar.f93147f;
        }

        /* renamed from: f */
        public final boolean mo113022f() {
            return this.f93147f;
        }

        @C12579k
        /* renamed from: g */
        public final C37161b mo113023g(@C12580l String str, @C12580l String str2, @C12579k ProductOverlayType productOverlayType, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, boolean z) {
            Intrinsics.checkNotNullParameter(productOverlayType, "type");
            return new C37161b(str, str2, productOverlayType, aVar, aVar2, z);
        }

        public int hashCode() {
            String str = this.f93142a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93143b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f93144c.hashCode()) * 31;
            C11289a<C11079d2> aVar = this.f93145d;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C11289a<C11079d2> aVar2 = this.f93146e;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.f93147f;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo113025i(@C12580l C37161b bVar) {
            C37161b bVar2;
            C37161b h = m152486h(this, (String) null, (String) null, (ProductOverlayType) null, (C11289a) null, (C11289a) null, false, 39, (Object) null);
            if (bVar != null) {
                bVar2 = m152486h(bVar, (String) null, (String) null, (ProductOverlayType) null, (C11289a) null, (C11289a) null, false, 39, (Object) null);
            } else {
                bVar2 = null;
            }
            return h.equals(bVar2);
        }

        /* renamed from: j */
        public final boolean mo113026j() {
            return this.f93147f;
        }

        @C12580l
        /* renamed from: k */
        public final String mo113027k() {
            return this.f93143b;
        }

        @C12580l
        /* renamed from: l */
        public final C11289a<C11079d2> mo113028l() {
            return this.f93146e;
        }

        @C12580l
        /* renamed from: m */
        public final C11289a<C11079d2> mo113029m() {
            return this.f93145d;
        }

        @C12580l
        /* renamed from: n */
        public final String mo113030n() {
            return this.f93142a;
        }

        @C12579k
        /* renamed from: o */
        public final ProductOverlayType mo113031o() {
            return this.f93144c;
        }

        @C12579k
        public String toString() {
            String str = this.f93142a;
            String str2 = this.f93143b;
            ProductOverlayType productOverlayType = this.f93144c;
            C11289a<C11079d2> aVar = this.f93145d;
            C11289a<C11079d2> aVar2 = this.f93146e;
            boolean z = this.f93147f;
            return "ProductOverlayInfo(title=" + str + ", description=" + str2 + ", type=" + productOverlayType + ", onPositiveAction=" + aVar + ", onNegativeAction=" + aVar2 + ", autoHide=" + z + ")";
        }

        public C37161b(@C12580l String str, @C12580l String str2, @C12579k ProductOverlayType productOverlayType, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, boolean z) {
            Intrinsics.checkNotNullParameter(productOverlayType, "type");
            this.f93142a = str;
            this.f93143b = str2;
            this.f93144c = productOverlayType;
            this.f93145d = aVar;
            this.f93146e = aVar2;
            this.f93147f = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37161b(java.lang.String r5, java.lang.String r6, com.carrefour.fid.android.design.components.type.ProductOverlayType r7, kotlin.jvm.functions.C11289a r8, kotlin.jvm.functions.C11289a r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0009
                java.lang.String r5 = new java.lang.String
                r5.<init>()
            L_0x0009:
                r12 = r11 & 2
                if (r12 == 0) goto L_0x0012
                java.lang.String r6 = new java.lang.String
                r6.<init>()
            L_0x0012:
                r12 = r6
                r6 = r11 & 4
                if (r6 == 0) goto L_0x0019
                com.carrefour.fid.android.design.components.type.ProductOverlayType r7 = com.carrefour.fid.android.design.components.type.ProductOverlayType.HORIZONTAL
            L_0x0019:
                r0 = r7
                r6 = r11 & 8
                r7 = 0
                if (r6 == 0) goto L_0x0021
                r1 = r7
                goto L_0x0022
            L_0x0021:
                r1 = r8
            L_0x0022:
                r6 = r11 & 16
                if (r6 == 0) goto L_0x0028
                r2 = r7
                goto L_0x0029
            L_0x0028:
                r2 = r9
            L_0x0029:
                r6 = r11 & 32
                if (r6 == 0) goto L_0x002e
                r10 = 1
            L_0x002e:
                r3 = r10
                r6 = r4
                r7 = r5
                r8 = r12
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent.C37161b.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.type.ProductOverlayType, kotlin.jvm.functions.a, kotlin.jvm.functions.a, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$c */
    public /* synthetic */ class C37162c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.type.ProductOverlayType[] r0 = com.carrefour.fid.android.design.components.type.ProductOverlayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.type.ProductOverlayType r1 = com.carrefour.fid.android.design.components.type.ProductOverlayType.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.type.ProductOverlayType r1 = com.carrefour.fid.android.design.components.type.ProductOverlayType.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.type.ProductOverlayType r1 = com.carrefour.fid.android.design.components.type.ProductOverlayType.SINGLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent.C37162c.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductOverlayComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: C */
    public static final void m152470C(ProductOverlayComponent productOverlayComponent) {
        Intrinsics.checkNotNullParameter(productOverlayComponent, "this$0");
        ViewKt.m152126h(productOverlayComponent, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
    }

    /* renamed from: E */
    public static /* synthetic */ void m152471E(ProductOverlayComponent productOverlayComponent, C11289a aVar, C11289a aVar2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        productOverlayComponent.mo113012D(aVar, aVar2, z);
    }

    /* renamed from: F */
    public static final void m152472F(C11289a aVar, boolean z, ProductOverlayComponent productOverlayComponent, View view) {
        Intrinsics.checkNotNullParameter(productOverlayComponent, "this$0");
        if (aVar != null) {
            aVar.invoke();
        }
        if (z) {
            productOverlayComponent.mo113014J();
        }
    }

    /* renamed from: G */
    public static final void m152473G(C11289a aVar, boolean z, ProductOverlayComponent productOverlayComponent, View view) {
        Intrinsics.checkNotNullParameter(productOverlayComponent, "this$0");
        if (aVar != null) {
            aVar.invoke();
        }
        if (z) {
            productOverlayComponent.mo113014J();
        }
    }

    /* renamed from: H */
    public static final void m152474H(C11289a aVar, boolean z, ProductOverlayComponent productOverlayComponent, View view) {
        Intrinsics.checkNotNullParameter(productOverlayComponent, "this$0");
        if (aVar != null) {
            aVar.invoke();
        }
        if (z) {
            productOverlayComponent.mo113014J();
        }
    }

    private final void setDescriptionText(String str) {
        this.f93140b.f92769b.setText(str);
    }

    private final void setProductOverlayType(ProductOverlayType productOverlayType) {
        int i = C37162c.$EnumSwitchMapping$0[productOverlayType.ordinal()];
        if (i == 1) {
            this.f93140b.f92772e.setVisibility(0);
            this.f93140b.f92770c.setVisibility(0);
            this.f93140b.f92771d.setVisibility(8);
        } else if (i == 2) {
            this.f93140b.f92772e.setVisibility(0);
            this.f93140b.f92770c.setVisibility(8);
            this.f93140b.f92771d.setVisibility(0);
        } else if (i == 3) {
            this.f93140b.f92772e.setVisibility(8);
            this.f93140b.f92770c.setVisibility(0);
            this.f93140b.f92771d.setVisibility(8);
        }
    }

    private final void setTitleText(String str) {
        this.f93140b.f92773f.setText(str);
    }

    /* renamed from: A */
    public final void mo113010A(@C12579k C37161b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "productOverlayInfo");
        clearAnimation();
        setTitleText(bVar.mo113030n());
        setDescriptionText(bVar.mo113027k());
        setProductOverlayType(bVar.mo113031o());
        mo113012D(bVar.mo113029m(), bVar.mo113028l(), bVar.mo113026j());
        invalidate();
        requestLayout();
        mo113013I(bVar.mo113026j());
    }

    /* renamed from: B */
    public final boolean mo113011B() {
        return post(new C37398s0(this));
    }

    /* renamed from: D */
    public final void mo113012D(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, boolean z) {
        this.f93140b.f92772e.setOnClickListener(new C37290p0(aVar, z, this));
        this.f93140b.f92770c.setOnClickListener(new C37392q0(aVar2, z, this));
        this.f93140b.f92771d.setOnClickListener(new C37395r0(aVar2, z, this));
    }

    /* renamed from: I */
    public final void mo113013I(boolean z) {
        ViewKt.m152123e(this, (Integer) null, false, new ProductOverlayComponent$show$1(z, this), 3, (Object) null);
    }

    /* renamed from: J */
    public final void mo113014J() {
        Timer timer = this.f93139a;
        if (timer != null) {
            timer.cancel();
        }
        mo113011B();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Timer timer = this.f93139a;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductOverlayComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductOverlayComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductOverlayComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37070p0 d = C37070p0.m152039d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f93140b = d;
        setVisibility(8);
    }
}
