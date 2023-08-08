package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.intl.C16342f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "str", "", "start", "end", "a", "(Ljava/lang/String;II)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.AnnotatedStringKt$decapitalize$1 */
public final class AnnotatedStringKt$decapitalize$1 extends Lambda implements C11305q<String, Integer, Integer, String> {
    final /* synthetic */ C16342f $localeList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt$decapitalize$1(C16342f fVar) {
        super(3);
        this.$localeList = fVar;
    }

    @C12579k
    /* renamed from: a */
    public final String mo46223a(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (i == 0) {
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return C16161d0.m72790d(substring, this.$localeList);
        }
        String substring2 = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo46223a((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
