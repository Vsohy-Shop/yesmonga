package com.carrefour.fid.android.domain.models.category;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CategoryType {
    RAYON,
    FILTERED,
    OTHERS;
    
    @C12579k

    /* renamed from: a */
    public static final C37990a f95615a = null;

    @C11363r0({"SMAP\nProductCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductCategory.kt\ncom/carrefour/fid/android/domain/models/category/CategoryType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n1282#2,2:33\n*S KotlinDebug\n*F\n+ 1 ProductCategory.kt\ncom/carrefour/fid/android/domain/models/category/CategoryType$Companion\n*L\n28#1:33,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.models.category.CategoryType$a */
    public static final class C37990a {
        public /* synthetic */ C37990a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final CategoryType mo117278a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            for (CategoryType categoryType : CategoryType.values()) {
                if (C11622t.equals(str, categoryType.name(), true)) {
                    return categoryType;
                }
            }
            return null;
        }

        public C37990a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f95615a = new C37990a((DefaultConstructorMarker) null);
    }
}
