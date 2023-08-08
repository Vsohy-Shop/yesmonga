package com.carrefour.fid.android.utils;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28932h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.utils.b */
public final class C22699b {
    @C12579k

    /* renamed from: a */
    public static final C22700a f58150a = new C22700a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f58151b = 0;
    @C12579k

    /* renamed from: c */
    public static final String f58152c = "[$@!%*?&+, ]";
    @C12579k

    /* renamed from: d */
    public static final String f58153d = "[A-Z]+";
    @C12579k

    /* renamed from: e */
    public static final String f58154e = "[a-z]";
    @C12579k

    /* renamed from: f */
    public static final String f58155f = "[0-9]";

    /* renamed from: com.carrefour.fid.android.utils.b$a */
    public static final class C22700a {
        public /* synthetic */ C22700a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: a */
        public final String mo67073a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "timeStamp");
            String format = new SimpleDateFormat("dd/MM/yyyy").format(new Date(Long.parseLong(str) * ((long) 1000)));
            Intrinsics.checkNotNullExpressionValue(format, "sdf.format(netDate)");
            return format;
        }

        @C12579k
        /* renamed from: b */
        public final String mo67074b(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "jour");
            Intrinsics.checkNotNullParameter(str2, "mois");
            Intrinsics.checkNotNullParameter(str3, "annee");
            C28932h.C28933a aVar = C28932h.f70914a;
            return String.valueOf(C28932h.C28933a.m119655W(aVar, str + "-" + str2 + "-" + str3, (String) null, 2, (Object) null));
        }

        /* renamed from: c */
        public final int mo67075c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "passWord");
            int g = mo67079g(str);
            if (mo67076d(str)) {
                g++;
            }
            if (mo67077e(str)) {
                g++;
            }
            if (mo67078f(str)) {
                return g + 1;
            }
            return g;
        }

        /* renamed from: d */
        public final boolean mo67076d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "password");
            return Pattern.compile("[a-z]").matcher(str).find();
        }

        /* renamed from: e */
        public final boolean mo67077e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "password");
            return Pattern.compile("[0-9]", 2).matcher(str).find();
        }

        /* renamed from: f */
        public final boolean mo67078f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "password");
            return Pattern.compile("[$@!%*?&+, ]", 2).matcher(str).find();
        }

        /* renamed from: g */
        public final boolean mo67079g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "password");
            return Pattern.compile("[A-Z]+").matcher(str).find();
        }

        public C22700a() {
        }
    }
}
