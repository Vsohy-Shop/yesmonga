package com.carrefour.fid.android.account.core.type;

import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Keep
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/core/type/CivilityTitle;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "MR", "MRS", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CivilityTitle {
    MR("0"),
    MRS("1");
    
    @C12579k
    public static final C13168a Companion = null;
    @C12579k
    private final String value;

    @C11363r0({"SMAP\nCivilityTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CivilityTitle.kt\ncom/carrefour/fid/android/account/core/type/CivilityTitle$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1282#2,2:21\n*S KotlinDebug\n*F\n+ 1 CivilityTitle.kt\ncom/carrefour/fid/android/account/core/type/CivilityTitle$Companion\n*L\n16#1:21,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.account.core.type.CivilityTitle$a */
    public static final class C13168a {
        public /* synthetic */ C13168a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final CivilityTitle mo31119a(@C12579k String str) {
            CivilityTitle civilityTitle;
            Intrinsics.checkNotNullParameter(str, "value");
            CivilityTitle[] values = CivilityTitle.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    civilityTitle = null;
                    break;
                }
                civilityTitle = values[i];
                if (Intrinsics.areEqual((Object) civilityTitle.getValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            if (civilityTitle != null) {
                return civilityTitle;
            }
            throw new IllegalStateException(("Unknown Civility: " + str).toString());
        }

        public C13168a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C13168a((DefaultConstructorMarker) null);
    }

    private CivilityTitle(String str) {
        this.value = str;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }
}
