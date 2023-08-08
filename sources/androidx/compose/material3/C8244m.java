package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
/* renamed from: androidx.compose.material3.m */
public interface C8244m {
    /* renamed from: f */
    static /* synthetic */ C8169a0 m27356f(C8244m mVar, Locale locale, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
            return mVar.mo12496p(locale);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
    }

    /* renamed from: o */
    static /* synthetic */ String m27357o(C8244m mVar, C8238l lVar, String str, Locale locale, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
            return mVar.mo12852n(lVar, str, locale);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
    }

    /* renamed from: r */
    static /* synthetic */ String m27358r(C8244m mVar, C8266q qVar, String str, Locale locale, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
            return mVar.mo12851m(qVar, str, locale);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
    }

    @C12580l
    /* renamed from: a */
    C8238l mo12485a(@C12579k String str, @C12579k String str2);

    @C12579k
    /* renamed from: b */
    C8266q mo12486b(@C12579k C8238l lVar);

    @C12579k
    /* renamed from: c */
    C8238l mo12487c();

    @C12579k
    /* renamed from: d */
    C8266q mo12488d(@C12579k C8266q qVar, int i);

    @C12579k
    /* renamed from: e */
    C8266q mo12489e(@C12579k C8266q qVar, int i);

    @C12579k
    /* renamed from: g */
    C8266q mo12490g(int i, int i2);

    @C12579k
    /* renamed from: h */
    C8238l mo12491h(long j);

    @C12579k
    /* renamed from: i */
    C8266q mo12492i(long j);

    @C12579k
    /* renamed from: j */
    String mo12493j(long j, @C12579k String str, @C12579k Locale locale);

    /* renamed from: k */
    int mo12494k();

    @C12579k
    /* renamed from: l */
    List<Pair<String, String>> mo12495l();

    @C12579k
    /* renamed from: m */
    String mo12851m(@C12579k C8266q qVar, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(qVar, "month");
        Intrinsics.checkNotNullParameter(str, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return C8260p.m27434c(qVar.mo12921n(), str, locale);
    }

    @C12579k
    /* renamed from: n */
    String mo12852n(@C12579k C8238l lVar, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(lVar, "date");
        Intrinsics.checkNotNullParameter(str, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return C8260p.m27434c(lVar.mo12763X(), str, locale);
    }

    @C12579k
    /* renamed from: p */
    C8169a0 mo12496p(@C12579k Locale locale);

    /* renamed from: q */
    int mo12497q(@C12579k C8238l lVar);
}
