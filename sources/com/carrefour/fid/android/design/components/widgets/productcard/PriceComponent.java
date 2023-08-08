package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.C0325c;
import androidx.annotation.C0358n;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37062l0;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/PriceComponent;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/PriceComponent$a;", "model", "Lkotlin/d2;", "E", "", "enabled", "setEnabled", "Lcom/carrefour/fid/android/design/components/databinding/l0;", "T0", "Lcom/carrefour/fid/android/design/components/databinding/l0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ProductCardPriceVariant", "Size", "a", "Variant", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPriceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/PriceComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"})
public final class PriceComponent extends LinearLayoutCompat {

    /* renamed from: U0 */
    public static final int f93642U0 = 8;
    @C12579k

    /* renamed from: T0 */
    public final C37062l0 f93643T0;

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b\tj\u0002\b j\u0002\b\u000ej\u0002\b\u0015¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/PriceComponent$ProductCardPriceVariant;", "", "", "priceColor", "I", "q", "()I", "subPriceColor", "Ljava/lang/Integer;", "w", "()Ljava/lang/Integer;", "priceTextStyle", "r", "subPriceTextStyle", "y", "", "isSubPriceVisible", "Z", "M", "()Z", "isSubPriceStrikeThrough", "z", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;ILjava/lang/Integer;ZZ)V", "a", "b", "c", "d", "e", "f", "g", "v", "x", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum ProductCardPriceVariant {
        DEFAULT_LARGE(r19, (int) null, r20, (Integer) null, false, false),
        DEFAULT_SMALL(r19, (int) null, r21, (Integer) null, false, false),
        OFFER_LARGE(r13, r14, r15, Integer.valueOf(r24), true, true),
        OFFER_SMALL(r4, r5, r6, Integer.valueOf(r25), true, true),
        IMMEDIATE_DISCOUNT_LARGE(r13, Integer.valueOf(r23), r15, Integer.valueOf(r24), true, false),
        IMMEDIATE_DISCOUNT_SMALL(r4, Integer.valueOf(r23), r6, Integer.valueOf(r25), true, true),
        MIXTURE_LARGE(r13, Integer.valueOf(r23), r15, Integer.valueOf(r24), true, false),
        MIXTURE_SMALL(r4, (int) null, r6, (Integer) null, false, false),
        FID_LARGE(r4, Integer.valueOf(r19), r15, Integer.valueOf(r24), true, false),
        FID_SMALL(r4, Integer.valueOf(r19), r6, Integer.valueOf(r25), false, true),
        CATALOG_LARGE(r22, (int) null, r15, (Integer) null, false, false),
        CATALOG_SMALL(r22, (int) null, r6, (Integer) null, false, false);
        
        private final boolean isSubPriceStrikeThrough;
        private final boolean isSubPriceVisible;
        private final int priceColor;
        private final int priceTextStyle;
        @C12580l
        private final Integer subPriceColor;
        @C12580l
        private final Integer subPriceTextStyle;

        /* access modifiers changed from: public */
        ProductCardPriceVariant(@C0358n int i, @C0358n Integer num, @C0325c int i2, @C0325c Integer num2, boolean z, boolean z2) {
            this.priceColor = i;
            this.subPriceColor = num;
            this.priceTextStyle = i2;
            this.subPriceTextStyle = num2;
            this.isSubPriceVisible = z;
            this.isSubPriceStrikeThrough = z2;
        }

        /* renamed from: M */
        public final boolean mo113681M() {
            return this.isSubPriceVisible;
        }

        /* renamed from: q */
        public final int mo113682q() {
            return this.priceColor;
        }

        /* renamed from: r */
        public final int mo113683r() {
            return this.priceTextStyle;
        }

        @C12580l
        /* renamed from: w */
        public final Integer mo113684w() {
            return this.subPriceColor;
        }

        @C12580l
        /* renamed from: y */
        public final Integer mo113685y() {
            return this.subPriceTextStyle;
        }

        /* renamed from: z */
        public final boolean mo113686z() {
            return this.isSubPriceStrikeThrough;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/PriceComponent$Size;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Size {
        SMALL,
        LARGE
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/PriceComponent$Variant;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Variant {
        DEFAULT,
        OFFER,
        MIXTURE,
        FID
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a */
    public static abstract class C37329a {

        /* renamed from: d */
        public static final int f93665d = 0;
        @C12579k

        /* renamed from: a */
        public final String f93666a;
        @C12579k

        /* renamed from: b */
        public final Size f93667b;

        /* renamed from: c */
        public final boolean f93668c;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$f */
        public static final class C37335f extends C37329a {

            /* renamed from: e */
            public static final int f93679e = 0;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37335f(String str, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? Size.LARGE : size, (i & 4) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37335f(@C12579k String str, @C12579k Size size, boolean z) {
                super(str, size, z, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "price");
                Intrinsics.checkNotNullParameter(size, C9168d0.f24889w);
            }
        }

        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$g */
        public interface C37336g {
            @C12580l
            /* renamed from: a */
            String mo113690a();
        }

        public /* synthetic */ C37329a(String str, Size size, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, size, z);
        }

        @C12579k
        /* renamed from: b */
        public final String mo113687b() {
            return this.f93666a;
        }

        @C12579k
        /* renamed from: c */
        public final Size mo113688c() {
            return this.f93667b;
        }

        /* renamed from: d */
        public final boolean mo113689d() {
            return this.f93668c;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$a */
        public static final class C37330a extends C37329a implements C37336g {

            /* renamed from: f */
            public static final int f93669f = 0;
            @C12580l

            /* renamed from: e */
            public final String f93670e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37330a(String str, String str2, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Size.LARGE : size, (i & 8) != 0 ? false : z);
            }

            @C12580l
            /* renamed from: a */
            public String mo113690a() {
                return this.f93670e;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37330a(@C12579k String str, @C12580l String str2, @C12579k Size size, boolean z) {
                super(str, size, z, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "price");
                Intrinsics.checkNotNullParameter(size, C9168d0.f24889w);
                this.f93670e = str2;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$b */
        public static final class C37331b extends C37329a implements C37336g {

            /* renamed from: f */
            public static final int f93671f = 0;
            @C12580l

            /* renamed from: e */
            public final String f93672e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37331b(String str, String str2, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? Size.LARGE : size, (i & 8) != 0 ? false : z);
            }

            @C12580l
            /* renamed from: a */
            public String mo113690a() {
                return this.f93672e;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37331b(@C12579k String str, @C12580l String str2, @C12579k Size size, boolean z) {
                super(str, size, z, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "price");
                Intrinsics.checkNotNullParameter(size, C9168d0.f24889w);
                this.f93672e = str2;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$c */
        public static final class C37332c extends C37329a implements C37336g {

            /* renamed from: f */
            public static final int f93673f = 0;
            @C12580l

            /* renamed from: e */
            public final String f93674e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37332c(String str, String str2, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Size.LARGE : size, (i & 8) != 0 ? false : z);
            }

            @C12580l
            /* renamed from: a */
            public String mo113690a() {
                return this.f93674e;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37332c(@C12579k String str, @C12580l String str2, @C12579k Size size, boolean z) {
                super(str, size, z, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "price");
                Intrinsics.checkNotNullParameter(size, C9168d0.f24889w);
                this.f93674e = str2;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$d */
        public static final class C37333d extends C37329a implements C37336g {

            /* renamed from: f */
            public static final int f93675f = 0;
            @C12580l

            /* renamed from: e */
            public final String f93676e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37333d(String str, String str2, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Size.LARGE : size, (i & 8) != 0 ? false : z);
            }

            @C12580l
            /* renamed from: a */
            public String mo113690a() {
                return this.f93676e;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37333d(@C12579k String str, @C12580l String str2, @C12579k Size size, boolean z) {
                super(str, size, z, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "price");
                Intrinsics.checkNotNullParameter(size, C9168d0.f24889w);
                this.f93676e = str2;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$a$e */
        public static final class C37334e extends C37329a implements C37336g {

            /* renamed from: f */
            public static final int f93677f = 0;
            @C12580l

            /* renamed from: e */
            public final String f93678e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37334e(String str, String str2, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? Size.LARGE : size, (i & 8) != 0 ? false : z);
            }

            @C12580l
            /* renamed from: a */
            public String mo113690a() {
                return this.f93678e;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37334e(@C12579k String str, @C12580l String str2, @C12579k Size size, boolean z) {
                super(str, size, z, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "price");
                Intrinsics.checkNotNullParameter(size, C9168d0.f24889w);
                this.f93678e = str2;
            }
        }

        public C37329a(String str, Size size, boolean z) {
            this.f93666a = str;
            this.f93667b = size;
            this.f93668c = z;
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$b */
    public /* synthetic */ class C37337b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$Size[] r0 = com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.Size.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$Size r1 = com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.Size.SMALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent$Size r1 = com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.Size.LARGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent.C37337b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PriceComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: E */
    public final void mo113679E(@C12579k C37329a aVar) {
        ProductCardPriceVariant productCardPriceVariant;
        float f;
        C37329a aVar2 = aVar;
        Intrinsics.checkNotNullParameter(aVar2, C40045d.f102104u);
        if (aVar2 instanceof C37329a.C37335f) {
            int i = C37337b.$EnumSwitchMapping$0[aVar.mo113688c().ordinal()];
            if (i == 1) {
                productCardPriceVariant = ProductCardPriceVariant.DEFAULT_SMALL;
            } else if (i == 2) {
                productCardPriceVariant = ProductCardPriceVariant.DEFAULT_LARGE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (aVar2 instanceof C37329a.C37332c) {
            int i2 = C37337b.$EnumSwitchMapping$0[aVar.mo113688c().ordinal()];
            if (i2 == 1) {
                productCardPriceVariant = ProductCardPriceVariant.FID_SMALL;
            } else if (i2 == 2) {
                productCardPriceVariant = ProductCardPriceVariant.FID_LARGE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (aVar2 instanceof C37329a.C37333d) {
            int i3 = C37337b.$EnumSwitchMapping$0[aVar.mo113688c().ordinal()];
            if (i3 == 1) {
                productCardPriceVariant = ProductCardPriceVariant.MIXTURE_SMALL;
            } else if (i3 == 2) {
                productCardPriceVariant = ProductCardPriceVariant.MIXTURE_LARGE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (aVar2 instanceof C37329a.C37334e) {
            int i4 = C37337b.$EnumSwitchMapping$0[aVar.mo113688c().ordinal()];
            if (i4 == 1) {
                productCardPriceVariant = ProductCardPriceVariant.OFFER_SMALL;
            } else if (i4 == 2) {
                productCardPriceVariant = ProductCardPriceVariant.OFFER_LARGE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (aVar2 instanceof C37329a.C37331b) {
            int i5 = C37337b.$EnumSwitchMapping$0[aVar.mo113688c().ordinal()];
            if (i5 == 1) {
                productCardPriceVariant = ProductCardPriceVariant.IMMEDIATE_DISCOUNT_SMALL;
            } else if (i5 == 2) {
                productCardPriceVariant = ProductCardPriceVariant.IMMEDIATE_DISCOUNT_LARGE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (aVar2 instanceof C37329a.C37330a) {
            int i6 = C37337b.$EnumSwitchMapping$0[aVar.mo113688c().ordinal()];
            if (i6 == 1) {
                productCardPriceVariant = ProductCardPriceVariant.CATALOG_SMALL;
            } else if (i6 == 2) {
                productCardPriceVariant = ProductCardPriceVariant.CATALOG_LARGE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f93643T0.f92714b.setTextAppearance(productCardPriceVariant.mo113683r());
        AppCompatTextView appCompatTextView = this.f93643T0.f92714b;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int q = productCardPriceVariant.mo113682q();
        int i7 = C36896b.C36902f.ds_grey_5;
        Resources.Theme theme = getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        appCompatTextView.setTextColor(C37138e.m152211b(resources, q, i7, theme));
        SpannableString spannableString = new SpannableString(aVar.mo113687b());
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) aVar.mo113687b(), C37357d.f93887a, 0, false, 6, (Object) null);
        if (indexOf$default > -1) {
            if (aVar.mo113688c() == Size.LARGE) {
                f = 0.8f;
            } else {
                f = 0.875f;
            }
            spannableString.setSpan(new RelativeSizeSpan(f), indexOf$default, indexOf$default + 1, 33);
        }
        this.f93643T0.f92714b.setText(spannableString);
        if (aVar.mo113689d()) {
            this.f93643T0.f92716d.setVisibility(0);
        } else {
            this.f93643T0.f92716d.setVisibility(8);
        }
        if ((aVar2 instanceof C37329a.C37336g) && productCardPriceVariant.mo113681M()) {
            C37329a.C37336g gVar = (C37329a.C37336g) aVar2;
            if (gVar.mo113690a() != null) {
                this.f93643T0.f92715c.setVisibility(0);
                Integer y = productCardPriceVariant.mo113685y();
                if (y != null) {
                    this.f93643T0.f92715c.setTextAppearance(y.intValue());
                }
                Integer w = productCardPriceVariant.mo113684w();
                if (w != null) {
                    w.intValue();
                    AppCompatTextView appCompatTextView2 = this.f93643T0.f92715c;
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "resources");
                    int intValue = productCardPriceVariant.mo113684w().intValue();
                    int i8 = C36896b.C36902f.ds_grey_20;
                    Resources.Theme theme2 = getContext().getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme2, "context.theme");
                    appCompatTextView2.setTextColor(C37138e.m152211b(resources2, intValue, i8, theme2));
                }
                if (productCardPriceVariant.mo113686z()) {
                    AppCompatTextView appCompatTextView3 = this.f93643T0.f92715c;
                    appCompatTextView3.setPaintFlags(appCompatTextView3.getPaintFlags() | 16);
                }
                this.f93643T0.f92715c.setText(gVar.mo113690a());
                this.f93643T0.f92715c.setContentDescription(getContext().getString(C36896b.C36912p.accessibility_sub_price, new Object[]{String.valueOf(gVar.mo113690a())}));
                invalidate();
                requestLayout();
            }
        }
        this.f93643T0.f92715c.setVisibility(8);
        invalidate();
        requestLayout();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f93643T0.f92716d.setEnabled(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PriceComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PriceComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public PriceComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37062l0 b = C37062l0.m152022b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…           this\n        )");
        this.f93643T0 = b;
        setOrientation(1);
    }
}
