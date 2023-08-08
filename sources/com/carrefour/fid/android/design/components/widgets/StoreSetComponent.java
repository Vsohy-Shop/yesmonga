package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37039d1;
import com.carrefour.fid.android.design.components.extension.C37116g;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002)\u001dB'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J8\u0010\f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0011H\u0002R\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/StoreSetComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/StoreSetComponent$a;", "storeSetUiModel", "Lkotlin/d2;", "C", "Lkotlin/Function0;", "storeSetAction", "storeSetEditAction", "", "storeSetActionVisibility", "withStoreDetailsEdit", "D", "", "icon", "B", "(Ljava/lang/Integer;)V", "", "storeSetName", "Lcom/carrefour/fid/android/design/components/widgets/StoreSetComponent$StoreSetErrorType;", "storeSetErrorType", "z", "storeDetails", "storeDetailsTextColor", "y", "A", "storeSetActionLabel", "x", "Lcom/carrefour/fid/android/design/components/databinding/d1;", "a", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/d1;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "StoreSetErrorType", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nStoreSetComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreSetComponent.kt\ncom/carrefour/fid/android/design/components/widgets/StoreSetComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,213:1\n262#2,2:214\n*S KotlinDebug\n*F\n+ 1 StoreSetComponent.kt\ncom/carrefour/fid/android/design/components/widgets/StoreSetComponent\n*L\n191#1:214,2\n*E\n"})
public final class StoreSetComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93237b = 8;
    @C12579k

    /* renamed from: a */
    public final C11677z f93238a;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB'\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/StoreSetComponent$StoreSetErrorType;", "", "", "value", "Ljava/lang/Integer;", "w", "()Ljava/lang/Integer;", "drawable", "I", "r", "()I", "colorResId", "q", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;II)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum StoreSetErrorType {
        WARNING(0, r11, C36896b.C36902f.ds_orange),
        ERROR(1, r11, C36896b.C36902f.ds_red_1),
        NOTHING(-1, -1, -1);
        
        @C12579k

        /* renamed from: a */
        public static final C37178a f93239a = null;
        private final int colorResId;
        private final int drawable;
        @C12580l
        private final Integer value;

        @C11363r0({"SMAP\nStoreSetComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreSetComponent.kt\ncom/carrefour/fid/android/design/components/widgets/StoreSetComponent$StoreSetErrorType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
        /* renamed from: com.carrefour.fid.android.design.components.widgets.StoreSetComponent$StoreSetErrorType$a */
        public static final class C37178a {
            public /* synthetic */ C37178a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final StoreSetErrorType mo113191a(@C12580l Integer num) {
                StoreSetErrorType storeSetErrorType;
                StoreSetErrorType[] values = StoreSetErrorType.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        storeSetErrorType = null;
                        break;
                    }
                    storeSetErrorType = values[i];
                    if (Intrinsics.areEqual((Object) storeSetErrorType.mo113190w(), (Object) num)) {
                        break;
                    }
                    i++;
                }
                if (storeSetErrorType == null) {
                    return StoreSetErrorType.NOTHING;
                }
                return storeSetErrorType;
            }

            public C37178a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            f93239a = new C37178a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        StoreSetErrorType(Integer num, @C0375v int i, @C0358n int i2) {
            this.value = num;
            this.drawable = i;
            this.colorResId = i2;
        }

        /* renamed from: q */
        public final int mo113188q() {
            return this.colorResId;
        }

        /* renamed from: r */
        public final int mo113189r() {
            return this.drawable;
        }

        @C12580l
        /* renamed from: w */
        public final Integer mo113190w() {
            return this.value;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.StoreSetComponent$a */
    public static final class C37179a {

        /* renamed from: l */
        public static final int f93244l = 0;
        @C12579k

        /* renamed from: a */
        public final String f93245a;
        @C12580l

        /* renamed from: b */
        public final String f93246b;

        /* renamed from: c */
        public final boolean f93247c;
        @C12579k

        /* renamed from: d */
        public final StoreSetErrorType f93248d;

        /* renamed from: e */
        public final boolean f93249e;
        @C12579k

        /* renamed from: f */
        public final String f93250f;
        @C12579k

        /* renamed from: g */
        public final String f93251g;
        @C12580l

        /* renamed from: h */
        public final C11289a<C11079d2> f93252h;

        /* renamed from: i */
        public final int f93253i;
        @C12580l

        /* renamed from: j */
        public final C11289a<C11079d2> f93254j;
        @C12580l

        /* renamed from: k */
        public final Integer f93255k;

        public C37179a() {
            this((String) null, (String) null, false, (StoreSetErrorType) null, false, (String) null, (String) null, (C11289a) null, 0, (C11289a) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
        }

        /* renamed from: m */
        public static /* synthetic */ C37179a m152651m(C37179a aVar, String str, String str2, boolean z, StoreSetErrorType storeSetErrorType, boolean z2, String str3, String str4, C11289a aVar2, int i, C11289a aVar3, Integer num, int i2, Object obj) {
            C37179a aVar4 = aVar;
            int i3 = i2;
            return aVar.mo113205l((i3 & 1) != 0 ? aVar4.f93245a : str, (i3 & 2) != 0 ? aVar4.f93246b : str2, (i3 & 4) != 0 ? aVar4.f93247c : z, (i3 & 8) != 0 ? aVar4.f93248d : storeSetErrorType, (i3 & 16) != 0 ? aVar4.f93249e : z2, (i3 & 32) != 0 ? aVar4.f93250f : str3, (i3 & 64) != 0 ? aVar4.f93251g : str4, (i3 & 128) != 0 ? aVar4.f93252h : aVar2, (i3 & 256) != 0 ? aVar4.f93253i : i, (i3 & 512) != 0 ? aVar4.f93254j : aVar3, (i3 & 1024) != 0 ? aVar4.f93255k : num);
        }

        @C12579k
        /* renamed from: a */
        public final String mo113192a() {
            return this.f93245a;
        }

        @C12580l
        /* renamed from: b */
        public final C11289a<C11079d2> mo113193b() {
            return this.f93254j;
        }

        @C12580l
        /* renamed from: c */
        public final Integer mo113194c() {
            return this.f93255k;
        }

        @C12580l
        /* renamed from: d */
        public final String mo113195d() {
            return this.f93246b;
        }

        /* renamed from: e */
        public final boolean mo113196e() {
            return this.f93247c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37179a)) {
                return false;
            }
            C37179a aVar = (C37179a) obj;
            return Intrinsics.areEqual((Object) this.f93245a, (Object) aVar.f93245a) && Intrinsics.areEqual((Object) this.f93246b, (Object) aVar.f93246b) && this.f93247c == aVar.f93247c && this.f93248d == aVar.f93248d && this.f93249e == aVar.f93249e && Intrinsics.areEqual((Object) this.f93250f, (Object) aVar.f93250f) && Intrinsics.areEqual((Object) this.f93251g, (Object) aVar.f93251g) && Intrinsics.areEqual((Object) this.f93252h, (Object) aVar.f93252h) && this.f93253i == aVar.f93253i && Intrinsics.areEqual((Object) this.f93254j, (Object) aVar.f93254j) && Intrinsics.areEqual((Object) this.f93255k, (Object) aVar.f93255k);
        }

        @C12579k
        /* renamed from: f */
        public final StoreSetErrorType mo113198f() {
            return this.f93248d;
        }

        /* renamed from: g */
        public final boolean mo113199g() {
            return this.f93249e;
        }

        @C12579k
        /* renamed from: h */
        public final String mo113200h() {
            return this.f93250f;
        }

        public int hashCode() {
            int hashCode = this.f93245a.hashCode() * 31;
            String str = this.f93246b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f93247c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode3 = (((hashCode2 + (z ? 1 : 0)) * 31) + this.f93248d.hashCode()) * 31;
            boolean z3 = this.f93249e;
            if (!z3) {
                z2 = z3;
            }
            int hashCode4 = (((((hashCode3 + (z2 ? 1 : 0)) * 31) + this.f93250f.hashCode()) * 31) + this.f93251g.hashCode()) * 31;
            C11289a<C11079d2> aVar = this.f93252h;
            int hashCode5 = (((hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31) + Integer.hashCode(this.f93253i)) * 31;
            C11289a<C11079d2> aVar2 = this.f93254j;
            int hashCode6 = (hashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            Integer num = this.f93255k;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode6 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo113202i() {
            return this.f93251g;
        }

        @C12580l
        /* renamed from: j */
        public final C11289a<C11079d2> mo113203j() {
            return this.f93252h;
        }

        /* renamed from: k */
        public final int mo113204k() {
            return this.f93253i;
        }

        @C12579k
        /* renamed from: l */
        public final C37179a mo113205l(@C12579k String str, @C12580l String str2, boolean z, @C12579k StoreSetErrorType storeSetErrorType, boolean z2, @C12579k String str3, @C12579k String str4, @C12580l C11289a<C11079d2> aVar, @C0358n int i, @C12580l C11289a<C11079d2> aVar2, @C0375v @C12580l Integer num) {
            Intrinsics.checkNotNullParameter(str, "storeName");
            StoreSetErrorType storeSetErrorType2 = storeSetErrorType;
            Intrinsics.checkNotNullParameter(storeSetErrorType2, "storeSetErrorType");
            String str5 = str3;
            Intrinsics.checkNotNullParameter(str5, "storeSetActionLabel");
            String str6 = str4;
            Intrinsics.checkNotNullParameter(str6, "accessibilityContentDescription");
            return new C37179a(str, str2, z, storeSetErrorType2, z2, str5, str6, aVar, i, aVar2, num);
        }

        @C12579k
        /* renamed from: n */
        public final String mo113206n() {
            return this.f93251g;
        }

        @C12580l
        /* renamed from: o */
        public final Integer mo113207o() {
            return this.f93255k;
        }

        @C12580l
        /* renamed from: p */
        public final String mo113208p() {
            return this.f93246b;
        }

        /* renamed from: q */
        public final int mo113209q() {
            return this.f93253i;
        }

        @C12579k
        /* renamed from: r */
        public final String mo113210r() {
            return this.f93245a;
        }

        @C12580l
        /* renamed from: s */
        public final C11289a<C11079d2> mo113211s() {
            return this.f93252h;
        }

        @C12579k
        /* renamed from: t */
        public final String mo113212t() {
            return this.f93250f;
        }

        @C12579k
        public String toString() {
            String str = this.f93245a;
            String str2 = this.f93246b;
            boolean z = this.f93247c;
            StoreSetErrorType storeSetErrorType = this.f93248d;
            boolean z2 = this.f93249e;
            String str3 = this.f93250f;
            String str4 = this.f93251g;
            C11289a<C11079d2> aVar = this.f93252h;
            int i = this.f93253i;
            C11289a<C11079d2> aVar2 = this.f93254j;
            Integer num = this.f93255k;
            return "StoreSetUiModel(storeName=" + str + ", storeDetails=" + str2 + ", withStoreDetailsEdit=" + z + ", storeSetErrorType=" + storeSetErrorType + ", storeSetActionVisibility=" + z2 + ", storeSetActionLabel=" + str3 + ", accessibilityContentDescription=" + str4 + ", storeSetAction=" + aVar + ", storeDetailsTextColor=" + i + ", storeSetEditAction=" + aVar2 + ", icon=" + num + ")";
        }

        /* renamed from: u */
        public final boolean mo113214u() {
            return this.f93249e;
        }

        @C12580l
        /* renamed from: v */
        public final C11289a<C11079d2> mo113215v() {
            return this.f93254j;
        }

        @C12579k
        /* renamed from: w */
        public final StoreSetErrorType mo113216w() {
            return this.f93248d;
        }

        /* renamed from: x */
        public final boolean mo113217x() {
            return this.f93247c;
        }

        public C37179a(@C12579k String str, @C12580l String str2, boolean z, @C12579k StoreSetErrorType storeSetErrorType, boolean z2, @C12579k String str3, @C12579k String str4, @C12580l C11289a<C11079d2> aVar, @C0358n int i, @C12580l C11289a<C11079d2> aVar2, @C0375v @C12580l Integer num) {
            Intrinsics.checkNotNullParameter(str, "storeName");
            Intrinsics.checkNotNullParameter(storeSetErrorType, "storeSetErrorType");
            Intrinsics.checkNotNullParameter(str3, "storeSetActionLabel");
            Intrinsics.checkNotNullParameter(str4, "accessibilityContentDescription");
            this.f93245a = str;
            this.f93246b = str2;
            this.f93247c = z;
            this.f93248d = storeSetErrorType;
            this.f93249e = z2;
            this.f93250f = str3;
            this.f93251g = str4;
            this.f93252h = aVar;
            this.f93253i = i;
            this.f93254j = aVar2;
            this.f93255k = num;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37179a(java.lang.String r13, java.lang.String r14, boolean r15, com.carrefour.fid.android.design.components.widgets.StoreSetComponent.StoreSetErrorType r16, boolean r17, java.lang.String r18, java.lang.String r19, kotlin.jvm.functions.C11289a r20, int r21, kotlin.jvm.functions.C11289a r22, java.lang.Integer r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r12 = this;
                r0 = r24
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000c
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                goto L_0x000d
            L_0x000c:
                r1 = r13
            L_0x000d:
                r2 = r0 & 2
                r3 = 0
                if (r2 == 0) goto L_0x0014
                r2 = r3
                goto L_0x0015
            L_0x0014:
                r2 = r14
            L_0x0015:
                r4 = r0 & 4
                r5 = 0
                if (r4 == 0) goto L_0x001c
                r4 = r5
                goto L_0x001d
            L_0x001c:
                r4 = r15
            L_0x001d:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0024
                com.carrefour.fid.android.design.components.widgets.StoreSetComponent$StoreSetErrorType r6 = com.carrefour.fid.android.design.components.widgets.StoreSetComponent.StoreSetErrorType.NOTHING
                goto L_0x0026
            L_0x0024:
                r6 = r16
            L_0x0026:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x002b
                goto L_0x002d
            L_0x002b:
                r5 = r17
            L_0x002d:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0037
                java.lang.String r7 = new java.lang.String
                r7.<init>()
                goto L_0x0039
            L_0x0037:
                r7 = r18
            L_0x0039:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0043
                java.lang.String r8 = new java.lang.String
                r8.<init>()
                goto L_0x0045
            L_0x0043:
                r8 = r19
            L_0x0045:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x004b
                r9 = r3
                goto L_0x004d
            L_0x004b:
                r9 = r20
            L_0x004d:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0054
                int r10 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_20
                goto L_0x0056
            L_0x0054:
                r10 = r21
            L_0x0056:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x005c
                r11 = r3
                goto L_0x005e
            L_0x005c:
                r11 = r22
            L_0x005e:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r3 = r23
            L_0x0065:
                r13 = r12
                r14 = r1
                r15 = r2
                r16 = r4
                r17 = r6
                r18 = r5
                r19 = r7
                r20 = r8
                r21 = r9
                r22 = r10
                r23 = r11
                r24 = r3
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.StoreSetComponent.C37179a.<init>(java.lang.String, java.lang.String, boolean, com.carrefour.fid.android.design.components.widgets.StoreSetComponent$StoreSetErrorType, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.a, int, kotlin.jvm.functions.a, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.StoreSetComponent$b */
    public /* synthetic */ class C37180b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.StoreSetComponent$StoreSetErrorType[] r0 = com.carrefour.fid.android.design.components.widgets.StoreSetComponent.StoreSetErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.StoreSetComponent$StoreSetErrorType r1 = com.carrefour.fid.android.design.components.widgets.StoreSetComponent.StoreSetErrorType.ERROR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.StoreSetComponent$StoreSetErrorType r1 = com.carrefour.fid.android.design.components.widgets.StoreSetComponent.StoreSetErrorType.WARNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.StoreSetComponent.C37180b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreSetComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: E */
    public static final void m152633E(C11289a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: F */
    public static final void m152634F(C11289a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: G */
    public static final void m152635G(C11289a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final C37039d1 getBinding() {
        return (C37039d1) this.f93238a.getValue();
    }

    /* renamed from: A */
    public final void mo113181A(boolean z) {
        int i;
        ImageView imageView = getBinding().f92609d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.storeSetEdit");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: B */
    public final void mo113182B(@C0375v Integer num) {
        if (num != null) {
            AppCompatImageView appCompatImageView = getBinding().f92610e;
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(num.intValue());
            return;
        }
        setVisibility(8);
    }

    /* renamed from: C */
    public final void mo113183C(@C12579k C37179a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "storeSetUiModel");
        mo113187z(aVar.mo113210r(), aVar.mo113216w());
        mo113182B(aVar.mo113207o());
        String p = aVar.mo113208p();
        if (p == null) {
            p = "";
        }
        mo113186y(p, aVar.mo113209q());
        mo113181A(aVar.mo113217x());
        mo113185x(aVar.mo113214u(), aVar.mo113212t());
        mo113184D(aVar.mo113211s(), aVar.mo113215v(), aVar.mo113214u(), aVar.mo113217x());
        setContentDescription(getContext().getString(C36896b.C36912p.accessibility_update_delivery_date, new Object[]{aVar.mo113210r(), aVar.mo113206n()}));
    }

    /* renamed from: D */
    public final void mo113184D(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, boolean z, boolean z2) {
        getBinding().getRoot().setOnClickListener((View.OnClickListener) null);
        if (!z || !z2) {
            getBinding().getRoot().setOnClickListener(new C37417v1(aVar));
            return;
        }
        getBinding().f92607b.setOnClickListener(new C37411t1(aVar));
        getBinding().f92609d.setOnClickListener(new C37414u1(aVar2));
    }

    /* renamed from: x */
    public final void mo113185x(boolean z, String str) {
        TextView textView = getBinding().f92607b;
        if (z) {
            textView.setText(str);
            textView.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreAction$lambda$8");
            C37116g.m152166d(textView, C36896b.C36904h.ds_ic_straight_arrows_right_small, Integer.valueOf(C17318d.m79723f(textView.getContext(), C36896b.C36902f.ds_grey_5)));
            return;
        }
        textView.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(textView, "bindStoreAction$lambda$8");
        C37116g.m152163a(textView);
    }

    /* renamed from: y */
    public final void mo113186y(String str, @C0358n int i) {
        boolean z;
        TextView textView = getBinding().f92608c;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        textView.setTextColor(C17318d.m79723f(textView.getContext(), i));
    }

    /* renamed from: z */
    public final void mo113187z(String str, StoreSetErrorType storeSetErrorType) {
        TextView textView = getBinding().f92611f;
        textView.setText(str);
        int i = C37180b.$EnumSwitchMapping$0[storeSetErrorType.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreName$lambda$6");
            C37116g.m152164b(textView, storeSetErrorType.mo113189r(), Integer.valueOf(C17318d.m79723f(textView.getContext(), storeSetErrorType.mo113188q())));
        } else if (i != 2) {
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreName$lambda$6");
            C37116g.m152163a(textView);
        } else {
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreName$lambda$6");
            C37116g.m152164b(textView, storeSetErrorType.mo113189r(), Integer.valueOf(C17318d.m79723f(textView.getContext(), storeSetErrorType.mo113188q())));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreSetComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreSetComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreSetComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93238a = C10864b0.m38748c(new StoreSetComponent$binding$2(context, this));
        setBackgroundResource(C36896b.C36904h.background_default_ripple);
        int dimension = (int) getResources().getDimension(C36896b.C36903g.ds_spacing_s);
        setPadding(getPaddingLeft(), dimension, getPaddingRight(), dimension);
        setClickable(true);
    }
}
