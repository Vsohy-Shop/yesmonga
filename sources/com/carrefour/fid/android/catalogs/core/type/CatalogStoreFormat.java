package com.carrefour.fid.android.catalogs.core.type;

import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/core/type/CatalogStoreFormat;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "v", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CatalogStoreFormat {
    HYPER(C28855a.f70683b),
    f100738c(C28855a.f70684c),
    CITY("CITY"),
    f100740e(C28855a.f70694m),
    CONTACT("CONTACT"),
    CONTACT_MARCHE(C28855a.f70687f),
    DRIVE("DRIVE");
    
    @C12579k

    /* renamed from: a */
    public static final C39393a f100736a = null;
    @C12579k
    private final String value;

    @C11363r0({"SMAP\nCatalogStoreFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogStoreFormat.kt\ncom/carrefour/fid/android/catalogs/core/type/CatalogStoreFormat$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,16:1\n1282#2,2:17\n*S KotlinDebug\n*F\n+ 1 CatalogStoreFormat.kt\ncom/carrefour/fid/android/catalogs/core/type/CatalogStoreFormat$Companion\n*L\n13#1:17,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.catalogs.core.type.CatalogStoreFormat$a */
    public static final class C39393a {
        public /* synthetic */ C39393a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final CatalogStoreFormat mo130270a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            for (CatalogStoreFormat catalogStoreFormat : CatalogStoreFormat.values()) {
                if (Intrinsics.areEqual((Object) catalogStoreFormat.mo130269q(), (Object) str)) {
                    return catalogStoreFormat;
                }
            }
            return null;
        }

        public C39393a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f100736a = new C39393a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    CatalogStoreFormat(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo130269q() {
        return this.value;
    }
}
