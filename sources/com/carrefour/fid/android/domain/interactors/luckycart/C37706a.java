package com.carrefour.fid.android.domain.interactors.luckycart;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.a */
public interface C37706a extends C37679f<C37707a, C38047a> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.a$a */
    public static final class C37707a {
        @C12579k

        /* renamed from: a */
        public final LuckyCartPageType f94584a;
        @C12579k

        /* renamed from: b */
        public final String f94585b;
        @C12580l

        /* renamed from: c */
        public final String f94586c;
        @C12580l

        /* renamed from: d */
        public final String f94587d;

        public C37707a(@C12579k LuckyCartPageType luckyCartPageType, @C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(luckyCartPageType, "pageName");
            Intrinsics.checkNotNullParameter(str, "bannerType");
            this.f94584a = luckyCartPageType;
            this.f94585b = str;
            this.f94586c = str2;
            this.f94587d = str3;
        }

        /* renamed from: f */
        public static /* synthetic */ C37707a m154504f(C37707a aVar, LuckyCartPageType luckyCartPageType, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                luckyCartPageType = aVar.f94584a;
            }
            if ((i & 2) != 0) {
                str = aVar.f94585b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f94586c;
            }
            if ((i & 8) != 0) {
                str3 = aVar.f94587d;
            }
            return aVar.mo114762e(luckyCartPageType, str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final LuckyCartPageType mo114758a() {
            return this.f94584a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114759b() {
            return this.f94585b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo114760c() {
            return this.f94586c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo114761d() {
            return this.f94587d;
        }

        @C12579k
        /* renamed from: e */
        public final C37707a mo114762e(@C12579k LuckyCartPageType luckyCartPageType, @C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(luckyCartPageType, "pageName");
            Intrinsics.checkNotNullParameter(str, "bannerType");
            return new C37707a(luckyCartPageType, str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37707a)) {
                return false;
            }
            C37707a aVar = (C37707a) obj;
            return this.f94584a == aVar.f94584a && Intrinsics.areEqual((Object) this.f94585b, (Object) aVar.f94585b) && Intrinsics.areEqual((Object) this.f94586c, (Object) aVar.f94586c) && Intrinsics.areEqual((Object) this.f94587d, (Object) aVar.f94587d);
        }

        @C12579k
        /* renamed from: g */
        public final String mo114764g() {
            return this.f94585b;
        }

        @C12579k
        /* renamed from: h */
        public final LuckyCartPageType mo114765h() {
            return this.f94584a;
        }

        public int hashCode() {
            int hashCode = ((this.f94584a.hashCode() * 31) + this.f94585b.hashCode()) * 31;
            String str = this.f94586c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94587d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12580l
        /* renamed from: i */
        public final String mo114767i() {
            return this.f94586c;
        }

        @C12580l
        /* renamed from: j */
        public final String mo114768j() {
            return this.f94587d;
        }

        @C12579k
        public String toString() {
            LuckyCartPageType luckyCartPageType = this.f94584a;
            String str = this.f94585b;
            String str2 = this.f94586c;
            String str3 = this.f94587d;
            return "Param(pageName=" + luckyCartPageType + ", bannerType=" + str + ", store=" + str2 + ", storeType=" + str3 + ")";
        }
    }
}
