package com.carrefour.fid.android.utils;

import androidx.compose.runtime.internal.C8567o;
import java.util.regex.Pattern;
import kotlin.C11395k;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "legacy code : to be removed after refacto account")
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.utils.l */
public final class C22716l {
    @C12579k

    /* renamed from: a */
    public static final C22717a f58216a = new C22717a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f58217b = 0;

    /* renamed from: com.carrefour.fid.android.utils.l$a */
    public static final class C22717a {
        public /* synthetic */ C22717a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11384m
        /* renamed from: a */
        public final boolean mo67132a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "source");
            Intrinsics.checkNotNullParameter(str2, "regex");
            return Pattern.compile(str2).matcher(str).find();
        }

        public C22717a() {
        }
    }

    @C11384m
    /* renamed from: a */
    public static final boolean m102882a(@C12579k String str, @C12579k String str2) {
        return f58216a.mo67132a(str, str2);
    }
}
